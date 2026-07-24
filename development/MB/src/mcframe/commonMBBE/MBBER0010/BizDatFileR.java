package mcframe.commonMBBE.MBBER0010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"BizDatFile"コンテナRowクラスです。<p>
 *
 * <br>
 *
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class BizDatFileR extends BizDatFileR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static BizDatFileR create() {
		BizDatFileR row = new BizDatFileR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> BizDatFileR createByName(T proto) {
		BizDatFileR row = BizDatFileR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public BizDatFileR(ConstMetaList<? extends BizDatFileR> metas) {
		super(metas);
	}
}