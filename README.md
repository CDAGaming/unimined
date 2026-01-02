# Unimined

## Soft Fork

This is fork is a maintenance only fork. This means that it's only there to fix critical breaking issues and allow our team to continue working while waiting for upstream to fix it.

Relevant PRs will be submitted back upstream as well. You should still be using the official releases from the official repo, unless the pending PR is not yet merged or the issue not yet fixed.

This fork is available from our maven at:

* Releases: `https://maven.firstdark.dev/releases`
* Snapshots: `https://maven.firstdark.dev/snapshots`

The plugin ID is changed to `dev.firstdark.unimined` to avoid any confusion. Everything else should remain the same.

### Our versioning explained

We use the following version format: `MAJOR.MINOR.PATCH+UPSTREAM_MAJOR.UPSTREAM_MINOR.UPSTREAM_PATCH`. This means the following:

Version `1.0.0+1.3.16`: It's version 1.0.0 of our fork, based on the upstream code of version 1.3.16.

---

Unified Minecraft modding environment with support for legacy environments.

for details on usage, see [the docs](Writerside/topics/starter-topic.md)

## LTS Branch

In order to better support buildscripts. when I plan on making big/breaking changes, I will leave an LTS branch behind.
In effect, this means that I always support the previous minor version for bugfixes.

By consequence, seeing as it's only bugfixes, snapshots on the LTS branch are considered *relatively* stable as well.

## Supported Loaders
* [Fabric](https://fabricmc.net)
* [Quilt](https://quiltmc.org)
* [Minecraft Forge](https://minecraftforge.net)
* [Neoforge](https://neoforged.net)
* [Cleanroom](https://cleanroommc.com)
* [Flint Loader](https://flintloader.net)
* [JarModAgent](https://github.com/unimined/JarModAgent)
* [Rift](https://github.com/DimensionalDevelopment/Rift)
* [FoxLoader](https://github.com/Fox2Code/FoxLoader)
* [LiteLoader](https://liteloader.com)
* [CraftBukkit](https://bukkit.org)
* [Spigot](https://www.spigotmc.org)
* [Paper](https://papermc.io)
* Risugami's ModLoader
* just plain jarmodding

## Planned Loaders
* [Sponge](https://spongepowered.org/]Sponge)
* [NilLoader](https://git.sleeping.town/Nil/NilLoader)

## Custom Loaders
Yes, this is possible, see [PrcraftExampleMod](https://github.com/prcraft-minecraft/PrcraftExampleMod) and it's buildsrc dir.

## Supported Games / Total Conversion Mods
* [Minecraft](https://minecraft.net)
* [Minecraft: ReIndev](https://reindev.miraheze.org/wiki/Reindev_Wiki)
* [Minecraft: Better Than Adventure](https://betterthanadventure.net)

## Planned Games / Total Conversion Mods
* [Not So Seecret Saturday](https://www.notsoseecretsaturday.net)

## TODO
* stop using artifactural
* rework mcpconfig runner to be more kotlin and less old version of arch-loom code
* Support for launch configs in other dev envs
  * vscode
  * eclipse
* support to login to minecraft in dev
* support to launch with the prod jar
* add datagen support
  * forge datagen
  * fabric datagen
  * quilt datagen
* fix yarn on neoforge (these will probably be agents, possibly in separate projects and pulled like JarModAgent)
  * inject remapper into ASMAPI
  * reflection remapper (also for forge potentially, or in general).
* genSources should apply forge source patches (at least on fg3+)

## Recommended Setup
1. take one of the versions from [testing](./testing)
2. remove `includeBuild('../../')` from `settings.gradle`
3. put a proper version number for the plugin in `build.grade`

## Other Setups

### Arch-Loom Style
* direct porting of arch-loom projects without changing the directory structure is possible.
* instructions pending...
### third party template(s)
* arch style: https://github.com/firstdarkdev/fdd-xplat or https://github.com/LegacyModdingMC/examplemod
* //todo: add more
