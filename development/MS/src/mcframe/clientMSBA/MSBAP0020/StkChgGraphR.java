package mcframe.clientMSBA.MSBAP0020;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"StkChgGraph"コンテナRowクラスです。<p>
 *
 * <br>
 *
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class StkChgGraphR extends StkChgGraphR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static StkChgGraphR create() {
		StkChgGraphR row = new StkChgGraphR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> StkChgGraphR createByName(T proto) {
		StkChgGraphR row = StkChgGraphR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public StkChgGraphR(ConstMetaList<? extends StkChgGraphR> metas) {
		super(metas);
	}
}