package mcframe.clientMSBC.MSBCP0290;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Gantt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class GanttR extends GanttR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static GanttR create() {
		GanttR row = new GanttR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> GanttR createByName(T proto) {
		GanttR row = GanttR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public GanttR(ConstMetaList<? extends GanttR> metas) {
		super(metas);
	}
}