package rst.scene;

import rst.assets.AssetRegistry;
import rst.assets.Sound;
import rst.assets.Texture;
import rst.character.Characters;
import rst.render.Block;
import rst.render.CameraFollowable;
import rst.render.HittableBlock;
import rst.render.InteractableBlock;
import rst.render.SceneRenderable;

public class Town extends Scene{

	public Town() {	super(AssetRegistry.getTextures().get("sand"), Block.GRID_SIZE * 40, Block.GRID_SIZE * 20, AssetRegistry.getSounds().get("test"),
					(CameraFollowable) Characters.getCharacters().getCharacter("Connor Adams"), "Town", Characters.getCharacters().getCharacter("Connor Adams"),
					new Block ("sand", 0, 0),
					new Block ("sand", 0, 1),
					new Block ("sand", 0, 2),
					new Block ("sand", 0, 3),
					new Block ("sand", 0, 4),
					new Block ("sand", 0, 5),
					new Block ("sand", 0, 6),
					new Block ("sand", 0, 7),
					new Block ("sand", 0, 8),
					new Block ("sand", 0, 9),
					new Block ("sand", 0, 10),
					new Block ("sand", 0, 11),
					new Block ("sand", 0, 12),
					new Block ("sand", 0, 13),
					new Block ("sand", 0, 14),
					new Block ("sand", 0, 15),
					new Block ("sand", 0, 16),
					new Block ("sand", 0, 17),
					new Block ("sand", 0, 18),
					new Block ("sand", 0, 19),
					new Block ("sand", 1, 0),
					new Block ("sand", 1, 1),
					new Block ("sand", 1, 2),
					new Block ("sand", 1, 3),
					new Block ("sand", 1, 4),
					new Block ("sand", 1, 5),
					new Block ("sand", 1, 6),
					new Block ("sand", 1, 7),
					new Block ("sand", 1, 8),
					new Block ("sand", 1, 9),
					new Block ("sand", 1, 10),
					new Block ("sand", 1, 11),
					new Block ("sand", 1, 12),
					new Block ("sand", 1, 13),
					new Block ("sand", 1, 14),
					new Block ("sand", 1, 15),
					new Block ("sand", 1, 16),
					new Block ("sand", 1, 17),
					new Block ("sand", 1, 18),
					new Block ("sand", 1, 19),
					new Block ("sand", 2, 0),
					new Block ("sand", 2, 1),
					new Block ("sand", 2, 2),
					new Block ("sand", 2, 3),
					new Block ("sand", 2, 4),
					new Block ("sand", 2, 5),
					new Block ("sand", 2, 6),
					new Block ("sand", 2, 7),
					new Block ("sand", 2, 8),
					new Block ("sand", 2, 9),
					new Block ("sand", 2, 10),
					new Block ("sand", 2, 11),
					new Block ("sand", 2, 12),
					new Block ("sand", 2, 13),
					new Block ("sand", 2, 14),
					new Block ("sand", 2, 15),
					new Block ("sand", 2, 16),
					new Block ("sand", 2, 17),
					new Block ("sand", 2, 18),
					new Block ("sand", 2, 19),
					new Block ("sand", 3, 0),
					new Block ("sand", 3, 1),
					new Block ("sand", 3, 2),
					new Block ("sand", 3, 3),
					new Block ("sand", 3, 4),
					new Block ("sand", 3, 5),
					new Block ("sand", 3, 6),
					new Block ("sand", 3, 7),
					new Block ("sand", 3, 8),
					new Block ("sand", 3, 9),
					new Block ("sand", 3, 10),
					new Block ("sand", 3, 11),
					new Block ("sand", 3, 12),
					new Block ("sand", 3, 13),
					new Block ("sand", 3, 14),
					new Block ("sand", 3, 15),
					new Block ("sand", 3, 16),
					new Block ("sand", 3, 17),
					new Block ("sand", 3, 18),
					new Block ("sand", 3, 19),
					new Block ("sand", 4, 0),
					new Block ("sand", 4, 1),
					new Block ("sand", 4, 2),
					new Block ("sand", 4, 3),
					new Block ("sand", 4, 4),
					new Block ("sand", 4, 5),
					new Block ("sand", 4, 6),
					new Block ("sand", 4, 7),
					new Block ("sand", 4, 8),
					new Block ("sand", 4, 9),
					new Block ("sand", 4, 10),
					new Block ("sand", 4, 11),
					new Block ("sand", 4, 12),
					new Block ("sand", 4, 13),
					new Block ("sand", 4, 14),
					new Block ("sand", 4, 15),
					new Block ("sand", 4, 16),
					new Block ("sand", 4, 17),
					new Block ("sand", 4, 18),
					new Block ("sand", 4, 19),
					new Block ("sand", 5, 0),
					new Block ("sand", 5, 1),
					new Block ("sand", 5, 2),
					new Block ("sand", 5, 3),
					new Block ("sand", 5, 4),
					new Block ("sand", 5, 5),
					new Block ("sand", 5, 6),
					new Block ("sand", 5, 7),
					new Block ("sand", 5, 8),
					new Block ("sand", 5, 9),
					new Block ("sand", 5, 10),
					new Block ("sand", 5, 11),
					new Block ("sand", 5, 12),
					new Block ("sand", 5, 13),
					new Block ("sand", 5, 14),
					new Block ("sand", 5, 15),
					new Block ("sand", 5, 16),
					new Block ("sand", 5, 17),
					new Block ("sand", 5, 18),
					new Block ("sand", 5, 19),
					new Block ("sand", 6, 0),
					new Block ("sand", 6, 1),
					new Block ("sand", 6, 2),
					new Block ("sand", 6, 3),
					new Block ("sand", 6, 4),
					new Block ("sand", 6, 5),
					new Block ("sand", 6, 6),
					new Block ("sand", 6, 7),
					new Block ("sand", 6, 8),
					new Block ("sand", 6, 9),
					new Block ("sand", 6, 10),
					new Block ("sand", 6, 11),
					new Block ("sand", 6, 12),
					new Block ("sand", 6, 13),
					new Block ("sand", 6, 14),
					new Block ("sand", 6, 15),
					new Block ("sand", 6, 16),
					new Block ("sand", 6, 17),
					new Block ("sand", 6, 18),
					new Block ("sand", 6, 19),
					new Block ("sand", 7, 0),
					new Block ("sand", 7, 1),
					new Block ("sand", 7, 2),
					new Block ("sand", 7, 3),
					new Block ("sand", 7, 4),
					new Block ("sand", 7, 5),
					new Block ("sand", 7, 6),
					new Block ("sand", 7, 7),
					new Block ("sand", 7, 8),
					new Block ("sand", 7, 9),
					new Block ("sand", 7, 10),
					new Block ("sand", 7, 11),
					new Block ("sand", 7, 12),
					new Block ("sand", 7, 13),
					new Block ("sand", 7, 14),
					new Block ("sand", 7, 15),
					new Block ("sand", 7, 16),
					new Block ("sand", 7, 17),
					new Block ("sand", 7, 18),
					new Block ("sand", 7, 19),
					new Block ("sand", 8, 0),
					new Block ("sand", 8, 1),
					new Block ("sand", 8, 2),
					new Block ("sand", 8, 3),
					new Block ("sand", 8, 4),
					new Block ("sand", 8, 5),
					new Block ("sand", 8, 6),
					new Block ("sand", 8, 7),
					new Block ("sand", 8, 8),
					new Block ("sand", 8, 9),
					new Block ("sand", 8, 10),
					new Block ("sand", 8, 11),
					new Block ("sand", 8, 12),
					new Block ("sand", 8, 13),
					new Block ("sand", 8, 14),
					new Block ("sand", 8, 15),
					new Block ("sand", 8, 16),
					new Block ("sand", 8, 17),
					new Block ("sand", 8, 18),
					new Block ("sand", 8, 19),
					new Block ("sand", 9, 0),
					new Block ("sand", 9, 1),
					new Block ("sand", 9, 2),
					new Block ("sand", 9, 3),
					new Block ("sand", 9, 4),
					new Block ("sand", 9, 5),
					new Block ("sand", 9, 6),
					new Block ("sand", 9, 7),
					new Block ("sand", 9, 8),
					new Block ("sand", 9, 9),
					new Block ("sand", 9, 10),
					new Block ("sand", 9, 11),
					new Block ("sand", 9, 12),
					new Block ("sand", 9, 13),
					new Block ("sand", 9, 14),
					new Block ("sand", 9, 15),
					new Block ("sand", 9, 16),
					new Block ("sand", 9, 17),
					new Block ("sand", 9, 18),
					new Block ("sand", 9, 19),
					new Block ("sand", 10, 0),
					new Block ("sand", 10, 1),
					new Block ("sand", 10, 2),
					new Block ("sand", 10, 3),
					new Block ("sand", 10, 4),
					new Block ("sand", 10, 5),
					new Block ("sand", 10, 6),
					new Block ("sand", 10, 7),
					new Block ("sand", 10, 8),
					new Block ("sand", 10, 9),
					new Block ("sand", 10, 10),
					new Block ("sand", 10, 11),
					new Block ("sand", 10, 12),
					new Block ("sand", 10, 13),
					new Block ("sand", 10, 14),
					new Block ("sand", 10, 15),
					new Block ("sand", 10, 16),
					new Block ("sand", 10, 17),
					new Block ("sand", 10, 18),
					new Block ("sand", 10, 19),
					new Block ("sand", 11, 0),
					new Block ("sand", 11, 1),
					new Block ("sand", 11, 2),
					new Block ("sand", 11, 3),
					new Block ("sand", 11, 4),
					new Block ("sand", 11, 5),
					new Block ("sand", 11, 6),
					new Block ("sand", 11, 7),
					new Block ("sand", 11, 8),
					new Block ("sand", 11, 9),
					new Block ("sand", 11, 10),
					new Block ("sand", 11, 11),
					new Block ("sand", 11, 12),
					new Block ("sand", 11, 13),
					new Block ("sand", 11, 14),
					new Block ("sand", 11, 15),
					new Block ("sand", 11, 16),
					new Block ("sand", 11, 17),
					new Block ("sand", 11, 18),
					new Block ("sand", 11, 19),
					new Block ("sand", 12, 0),
					new Block ("sand", 12, 1),
					new Block ("sand", 12, 2),
					new Block ("sand", 12, 3),
					new Block ("sand", 12, 4),
					new Block ("sand", 12, 5),
					new Block ("sand", 12, 6),
					new Block ("sand", 12, 7),
					new Block ("sand", 12, 8),
					new Block ("sand", 12, 9),
					new Block ("sand", 12, 10),
					new Block ("sand", 12, 11),
					new Block ("sand", 12, 12),
					new Block ("sand", 12, 13),
					new Block ("sand", 12, 14),
					new Block ("sand", 12, 15),
					new Block ("sand", 12, 16),
					new Block ("sand", 12, 17),
					new Block ("sand", 12, 18),
					new Block ("sand", 12, 19),
					new Block ("sand", 13, 0),
					new Block ("sand", 13, 1),
					new Block ("sand", 13, 2),
					new Block ("sand", 13, 3),
					new Block ("sand", 13, 4),
					new Block ("sand", 13, 5),
					new Block ("sand", 13, 6),
					new Block ("sand", 13, 7),
					new Block ("sand", 13, 8),
					new Block ("sand", 13, 9),
					new Block ("sand", 13, 10),
					new Block ("sand", 13, 11),
					new Block ("sand", 13, 12),
					new Block ("sand", 13, 13),
					new Block ("sand", 13, 14),
					new Block ("sand", 13, 15),
					new Block ("sand", 13, 16),
					new Block ("sand", 13, 17),
					new Block ("sand", 13, 18),
					new Block ("sand", 13, 19),
					new Block ("sand", 14, 0),
					new Block ("sand", 14, 1),
					new Block ("sand", 14, 2),
					new Block ("sand", 14, 3),
					new Block ("sand", 14, 4),
					new Block ("sand", 14, 5),
					new Block ("sand", 14, 6),
					new Block ("sand", 14, 7),
					new Block ("sand", 14, 8),
					new Block ("sand", 14, 9),
					new Block ("sand", 14, 10),
					new Block ("sand", 14, 11),
					new Block ("sand", 14, 12),
					new Block ("sand", 14, 13),
					new Block ("sand", 14, 14),
					new Block ("sand", 14, 15),
					new Block ("sand", 14, 16),
					new Block ("sand", 14, 17),
					new Block ("sand", 14, 18),
					new Block ("sand", 14, 19),
					new Block ("sand", 15, 0),
					new Block ("sand", 15, 1),
					new Block ("sand", 15, 2),
					new Block ("sand", 15, 3),
					new Block ("sand", 15, 4),
					new Block ("sand", 15, 5),
					new Block ("sand", 15, 6),
					new Block ("sand", 15, 7),
					new Block ("sand", 15, 8),
					new Block ("sand", 15, 9),
					new Block ("sand", 15, 10),
					new Block ("sand", 15, 11),
					new Block ("sand", 15, 12),
					new Block ("sand", 15, 13),
					new Block ("sand", 15, 14),
					new Block ("sand", 15, 15),
					new Block ("sand", 15, 16),
					new Block ("sand", 15, 17),
					new Block ("sand", 15, 18),
					new Block ("sand", 15, 19),
					new Block ("sand", 16, 0),
					new Block ("sand", 16, 1),
					new Block ("sand", 16, 2),
					new Block ("sand", 16, 3),
					new Block ("sand", 16, 4),
					new Block ("sand", 16, 5),
					new Block ("sand", 16, 6),
					new Block ("sand", 16, 7),
					new Block ("sand", 16, 8),
					new Block ("sand", 16, 9),
					new Block ("sand", 16, 10),
					new Block ("sand", 16, 11),
					new Block ("sand", 16, 12),
					new Block ("sand", 16, 13),
					new Block ("sand", 16, 14),
					new Block ("sand", 16, 15),
					new Block ("sand", 16, 16),
					new Block ("sand", 16, 17),
					new Block ("sand", 16, 18),
					new Block ("sand", 16, 19),
					new Block ("sand", 17, 0),
					new Block ("sand", 17, 1),
					new Block ("sand", 17, 2),
					new Block ("sand", 17, 3),
					new Block ("sand", 17, 4),
					new Block ("sand", 17, 5),
					new Block ("sand", 17, 6),
					new Block ("sand", 17, 7),
					new Block ("sand", 17, 8),
					new Block ("sand", 17, 9),
					new Block ("sand", 17, 10),
					new Block ("sand", 17, 11),
					new Block ("sand", 17, 12),
					new Block ("sand", 17, 13),
					new Block ("sand", 17, 14),
					new Block ("sand", 17, 15),
					new Block ("sand", 17, 16),
					new Block ("sand", 17, 17),
					new Block ("sand", 17, 18),
					new Block ("sand", 17, 19),
					new Block ("sand", 18, 0),
					new Block ("sand", 18, 1),
					new Block ("sand", 18, 2),
					new Block ("sand", 18, 3),
					new Block ("sand", 18, 4),
					new Block ("sand", 18, 5),
					new Block ("sand", 18, 6),
					new Block ("sand", 18, 7),
					new Block ("sand", 18, 8),
					new Block ("sand", 18, 9),
					new Block ("sand", 18, 10),
					new Block ("sand", 18, 11),
					new Block ("sand", 18, 12),
					new Block ("sand", 18, 13),
					new Block ("sand", 18, 14),
					new Block ("sand", 18, 15),
					new Block ("sand", 18, 16),
					new Block ("sand", 18, 17),
					new Block ("sand", 18, 18),
					new Block ("sand", 18, 19),
					new Block ("sand", 19, 0),
					new Block ("sand", 19, 1),
					new Block ("sand", 19, 2),
					new Block ("sand", 19, 3),
					new Block ("sand", 19, 4),
					new Block ("sand", 19, 5),
					new Block ("sand", 19, 6),
					new Block ("sand", 19, 7),
					new Block ("sand", 19, 8),
					new Block ("sand", 19, 9),
					new Block ("sand", 19, 10),
					new Block ("sand", 19, 11),
					new Block ("sand", 19, 12),
					new Block ("sand", 19, 13),
					new Block ("sand", 19, 14),
					new Block ("sand", 19, 15),
					new Block ("sand", 19, 16),
					new Block ("sand", 19, 17),
					new Block ("sand", 19, 18),
					new Block ("sand", 19, 19),
					new Block ("sand", 20, 0),
					new Block ("sand", 20, 1),
					new Block ("sand", 20, 2),
					new Block ("sand", 20, 3),
					new Block ("sand", 20, 4),
					new Block ("sand", 20, 5),
					new Block ("sand", 20, 6),
					new Block ("sand", 20, 7),
					new Block ("sand", 20, 8),
					new Block ("sand", 20, 9),
					new Block ("sand", 20, 10),
					new Block ("sand", 20, 11),
					new Block ("sand", 20, 12),
					new Block ("sand", 20, 13),
					new Block ("sand", 20, 14),
					new Block ("sand", 20, 15),
					new Block ("sand", 20, 16),
					new Block ("sand", 20, 17),
					new Block ("sand", 20, 18),
					new Block ("sand", 20, 19),
					new Block ("sand", 21, 0),
					new Block ("sand", 21, 1),
					new Block ("sand", 21, 2),
					new Block ("sand", 21, 3),
					new Block ("sand", 21, 4),
					new Block ("sand", 21, 5),
					new Block ("sand", 21, 6),
					new Block ("sand", 21, 7),
					new Block ("sand", 21, 8),
					new Block ("sand", 21, 9),
					new Block ("sand", 21, 10),
					new Block ("sand", 21, 11),
					new Block ("sand", 21, 12),
					new Block ("sand", 21, 13),
					new Block ("sand", 21, 14),
					new Block ("sand", 21, 15),
					new Block ("sand", 21, 16),
					new Block ("sand", 21, 17),
					new Block ("sand", 21, 18),
					new Block ("sand", 21, 19),
					new Block ("sand", 22, 0),
					new Block ("sand", 22, 1),
					new Block ("sand", 22, 2),
					new Block ("sand", 22, 3),
					new Block ("sand", 22, 4),
					new Block ("sand", 22, 5),
					new Block ("sand", 22, 6),
					new Block ("sand", 22, 7),
					new Block ("sand", 22, 8),
					new Block ("sand", 22, 9),
					new Block ("sand", 22, 10),
					new Block ("sand", 22, 11),
					new Block ("sand", 22, 12),
					new Block ("sand", 22, 13),
					new Block ("sand", 22, 14),
					new Block ("sand", 22, 15),
					new Block ("sand", 22, 16),
					new Block ("sand", 22, 17),
					new Block ("sand", 22, 18),
					new Block ("sand", 22, 19),
					new Block ("sand", 23, 0),
					new Block ("sand", 23, 1),
					new Block ("sand", 23, 2),
					new Block ("sand", 23, 3),
					new Block ("sand", 23, 4),
					new Block ("sand", 23, 5),
					new Block ("sand", 23, 6),
					new Block ("sand", 23, 7),
					new Block ("sand", 23, 8),
					new Block ("sand", 23, 9),
					new Block ("sand", 23, 10),
					new Block ("sand", 23, 11),
					new Block ("sand", 23, 12),
					new Block ("sand", 23, 13),
					new Block ("sand", 23, 14),
					new Block ("sand", 23, 15),
					new Block ("sand", 23, 16),
					new Block ("sand", 23, 17),
					new Block ("sand", 23, 18),
					new Block ("sand", 23, 19),
					new Block ("sand", 24, 0),
					new Block ("sand", 24, 1),
					new Block ("sand", 24, 2),
					new Block ("sand", 24, 3),
					new Block ("sand", 24, 4),
					new Block ("sand", 24, 5),
					new Block ("sand", 24, 6),
					new Block ("sand", 24, 7),
					new Block ("sand", 24, 8),
					new Block ("sand", 24, 9),
					new Block ("sand", 24, 10),
					new Block ("sand", 24, 11),
					new Block ("sand", 24, 12),
					new Block ("sand", 24, 13),
					new Block ("sand", 24, 14),
					new Block ("sand", 24, 15),
					new Block ("sand", 24, 16),
					new Block ("sand", 24, 17),
					new Block ("sand", 24, 18),
					new Block ("sand", 24, 19),
					new Block ("sand", 25, 0),
					new Block ("sand", 25, 1),
					new Block ("sand", 25, 2),
					new Block ("sand", 25, 3),
					new Block ("sand", 25, 4),
					new Block ("sand", 25, 5),
					new Block ("sand", 25, 6),
					new Block ("sand", 25, 7),
					new Block ("sand", 25, 8),
					new Block ("sand", 25, 9),
					new Block ("sand", 25, 10),
					new Block ("sand", 25, 11),
					new Block ("sand", 25, 12),
					new Block ("sand", 25, 13),
					new Block ("sand", 25, 14),
					new Block ("sand", 25, 15),
					new Block ("sand", 25, 16),
					new Block ("sand", 25, 17),
					new Block ("sand", 25, 18),
					new Block ("sand", 25, 19),
					new Block ("sand", 26, 0),
					new Block ("sand", 26, 1),
					new Block ("sand", 26, 2),
					new Block ("sand", 26, 3),
					new Block ("sand", 26, 4),
					new Block ("sand", 26, 5),
					new Block ("sand", 26, 6),
					new Block ("sand", 26, 7),
					new Block ("sand", 26, 8),
					new Block ("sand", 26, 9),
					new Block ("sand", 26, 10),
					new Block ("sand", 26, 11),
					new Block ("sand", 26, 12),
					new Block ("sand", 26, 13),
					new Block ("sand", 26, 14),
					new Block ("sand", 26, 15),
					new Block ("sand", 26, 16),
					new Block ("sand", 26, 17),
					new Block ("sand", 26, 18),
					new Block ("sand", 26, 19),
					new Block ("sand", 27, 0),
					new Block ("sand", 27, 1),
					new Block ("sand", 27, 2),
					new Block ("sand", 27, 3),
					new Block ("sand", 27, 4),
					new Block ("sand", 27, 5),
					new Block ("sand", 27, 6),
					new Block ("sand", 27, 7),
					new Block ("sand", 27, 8),
					new Block ("sand", 27, 9),
					new Block ("sand", 27, 10),
					new Block ("sand", 27, 11),
					new Block ("sand", 27, 12),
					new Block ("sand", 27, 13),
					new Block ("sand", 27, 14),
					new Block ("sand", 27, 15),
					new Block ("sand", 27, 16),
					new Block ("sand", 27, 17),
					new Block ("sand", 27, 18),
					new Block ("sand", 27, 19),
					new Block ("sand", 28, 0),
					new Block ("sand", 28, 1),
					new Block ("sand", 28, 2),
					new Block ("sand", 28, 3),
					new Block ("sand", 28, 4),
					new Block ("sand", 28, 5),
					new Block ("sand", 28, 6),
					new Block ("sand", 28, 7),
					new Block ("sand", 28, 8),
					new Block ("sand", 28, 9),
					new Block ("sand", 28, 10),
					new Block ("sand", 28, 11),
					new Block ("sand", 28, 12),
					new Block ("sand", 28, 13),
					new Block ("sand", 28, 14),
					new Block ("sand", 28, 15),
					new Block ("sand", 28, 16),
					new Block ("sand", 28, 17),
					new Block ("sand", 28, 18),
					new Block ("sand", 28, 19),
					new Block ("sand", 29, 0),
					new Block ("sand", 29, 1),
					new Block ("sand", 29, 2),
					new Block ("sand", 29, 3),
					new Block ("sand", 29, 4),
					new Block ("sand", 29, 5),
					new Block ("sand", 29, 6),
					new Block ("sand", 29, 7),
					new Block ("sand", 29, 8),
					new Block ("sand", 29, 9),
					new Block ("sand", 29, 10),
					new Block ("sand", 29, 11),
					new Block ("sand", 29, 12),
					new Block ("sand", 29, 13),
					new Block ("sand", 29, 14),
					new Block ("sand", 29, 15),
					new Block ("sand", 29, 16),
					new Block ("sand", 29, 17),
					new Block ("sand", 29, 18),
					new Block ("sand", 29, 19),
					new Block ("sand", 30, 0),
					new Block ("sand", 30, 1),
					new Block ("sand", 30, 2),
					new Block ("sand", 30, 3),
					new Block ("sand", 30, 4),
					new Block ("sand", 30, 5),
					new Block ("sand", 30, 6),
					new Block ("sand", 30, 7),
					new Block ("sand", 30, 8),
					new Block ("sand", 30, 9),
					new Block ("sand", 30, 10),
					new Block ("sand", 30, 11),
					new Block ("sand", 30, 12),
					new Block ("sand", 30, 13),
					new Block ("sand", 30, 14),
					new Block ("sand", 30, 15),
					new Block ("sand", 30, 16),
					new Block ("sand", 30, 17),
					new Block ("sand", 30, 18),
					new Block ("sand", 30, 19),
					new Block ("sand", 31, 0),
					new Block ("sand", 31, 1),
					new Block ("sand", 31, 2),
					new Block ("sand", 31, 3),
					new Block ("sand", 31, 4),
					new Block ("sand", 31, 5),
					new Block ("sand", 31, 6),
					new Block ("sand", 31, 7),
					new Block ("sand", 31, 8),
					new Block ("sand", 31, 9),
					new Block ("sand", 31, 10),
					new Block ("sand", 31, 11),
					new Block ("sand", 31, 12),
					new Block ("sand", 31, 13),
					new Block ("sand", 31, 14),
					new Block ("sand", 31, 15),
					new Block ("sand", 31, 16),
					new Block ("sand", 31, 17),
					new Block ("sand", 31, 18),
					new Block ("sand", 31, 19),
					new Block ("sand", 32, 0),
					new Block ("sand", 32, 1),
					new Block ("sand", 32, 2),
					new Block ("sand", 32, 3),
					new Block ("sand", 32, 4),
					new Block ("sand", 32, 5),
					new Block ("sand", 32, 6),
					new Block ("sand", 32, 7),
					new Block ("sand", 32, 8),
					new Block ("sand", 32, 9),
					new Block ("sand", 32, 10),
					new Block ("sand", 32, 11),
					new Block ("sand", 32, 12),
					new Block ("sand", 32, 13),
					new Block ("sand", 32, 14),
					new Block ("sand", 32, 15),
					new Block ("sand", 32, 16),
					new Block ("sand", 32, 17),
					new Block ("sand", 32, 18),
					new Block ("sand", 32, 19),
					new Block ("sand", 33, 0),
					new Block ("sand", 33, 1),
					new Block ("sand", 33, 2),
					new Block ("sand", 33, 3),
					new Block ("sand", 33, 4),
					new Block ("sand", 33, 5),
					new Block ("sand", 33, 6),
					new Block ("sand", 33, 7),
					new Block ("sand", 33, 8),
					new Block ("sand", 33, 9),
					new Block ("sand", 33, 10),
					new Block ("sand", 33, 11),
					new Block ("sand", 33, 12),
					new Block ("sand", 33, 13),
					new Block ("sand", 33, 14),
					new Block ("sand", 33, 15),
					new Block ("sand", 33, 16),
					new Block ("sand", 33, 17),
					new Block ("sand", 33, 18),
					new Block ("sand", 33, 19),
					new Block ("sand", 34, 0),
					new Block ("sand", 34, 1),
					new Block ("sand", 34, 2),
					new Block ("sand", 34, 3),
					new Block ("sand", 34, 4),
					new Block ("sand", 34, 5),
					new Block ("sand", 34, 6),
					new Block ("sand", 34, 7),
					new Block ("sand", 34, 8),
					new Block ("sand", 34, 9),
					new Block ("sand", 34, 10),
					new Block ("sand", 34, 11),
					new Block ("sand", 34, 12),
					new Block ("sand", 34, 13),
					new Block ("sand", 34, 14),
					new Block ("sand", 34, 15),
					new Block ("sand", 34, 16),
					new Block ("sand", 34, 17),
					new Block ("sand", 34, 18),
					new Block ("sand", 34, 19),
					new Block ("sand", 35, 0),
					new Block ("sand", 35, 1),
					new Block ("sand", 35, 2),
					new Block ("sand", 35, 3),
					new Block ("sand", 35, 4),
					new Block ("sand", 35, 5),
					new Block ("sand", 35, 6),
					new Block ("sand", 35, 7),
					new Block ("sand", 35, 8),
					new Block ("sand", 35, 9),
					new Block ("sand", 35, 10),
					new Block ("sand", 35, 11),
					new Block ("sand", 35, 12),
					new Block ("sand", 35, 13),
					new Block ("sand", 35, 14),
					new Block ("sand", 35, 15),
					new Block ("sand", 35, 16),
					new Block ("sand", 35, 17),
					new Block ("sand", 35, 18),
					new Block ("sand", 35, 19),
					new Block ("sand", 36, 0),
					new Block ("sand", 36, 1),
					new Block ("sand", 36, 2),
					new Block ("sand", 36, 3),
					new Block ("sand", 36, 4),
					new Block ("sand", 36, 5),
					new Block ("sand", 36, 6),
					new Block ("sand", 36, 7),
					new Block ("sand", 36, 8),
					new Block ("sand", 36, 9),
					new Block ("sand", 36, 10),
					new Block ("sand", 36, 11),
					new Block ("sand", 36, 12),
					new Block ("sand", 36, 13),
					new Block ("sand", 36, 14),
					new Block ("sand", 36, 15),
					new Block ("sand", 36, 16),
					new Block ("sand", 36, 17),
					new Block ("sand", 36, 18),
					new Block ("sand", 36, 19),
					new Block ("sand", 37, 0),
					new Block ("sand", 37, 1),
					new Block ("sand", 37, 2),
					new Block ("sand", 37, 3),
					new Block ("sand", 37, 4),
					new Block ("sand", 37, 5),
					new Block ("sand", 37, 6),
					new Block ("sand", 37, 7),
					new Block ("sand", 37, 8),
					new Block ("sand", 37, 9),
					new Block ("sand", 37, 10),
					new Block ("sand", 37, 11),
					new Block ("sand", 37, 12),
					new Block ("sand", 37, 13),
					new Block ("sand", 37, 14),
					new Block ("sand", 37, 15),
					new Block ("sand", 37, 16),
					new Block ("sand", 37, 17),
					new Block ("sand", 37, 18),
					new Block ("sand", 37, 19),
					new Block ("sand", 38, 0),
					new Block ("sand", 38, 1),
					new Block ("sand", 38, 2),
					new Block ("sand", 38, 3),
					new Block ("sand", 38, 4),
					new Block ("sand", 38, 5),
					new Block ("sand", 38, 6),
					new Block ("sand", 38, 7),
					new Block ("sand", 38, 8),
					new Block ("sand", 38, 9),
					new Block ("sand", 38, 10),
					new Block ("sand", 38, 11),
					new Block ("sand", 38, 12),
					new Block ("sand", 38, 13),
					new Block ("sand", 38, 14),
					new Block ("sand", 38, 15),
					new Block ("sand", 38, 16),
					new Block ("sand", 38, 17),
					new Block ("sand", 38, 18),
					new Block ("sand", 38, 19),
					new Block ("sand", 39, 0),
					new Block ("sand", 39, 1),
					new Block ("sand", 39, 2),
					new Block ("sand", 39, 3),
					new Block ("sand", 39, 4),
					new Block ("sand", 39, 5),
					new Block ("sand", 39, 6),
					new Block ("sand", 39, 7),
					new Block ("sand", 39, 8),
					new Block ("sand", 39, 9),
					new Block ("sand", 39, 10),
					new Block ("sand", 39, 11),
					new Block ("sand", 39, 12),
					new Block ("sand", 39, 13),
					new Block ("sand", 39, 14),
					new Block ("sand", 39, 15),
					new Block ("sand", 39, 16),
					new Block ("sand", 39, 17),
					new Block ("sand", 39, 18),
					new Block ("sand", 39, 19),
					
					//Paths
					
					//Cacti
					new HittableBlock(Block.GRID_SIZE * 40, Block.GRID_SIZE * 30, "cactus2", 5, 6));

	}

}
