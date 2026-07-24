package mcframe.clientMSBA.MSBAP0050;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Rslt2R extends Rslt2R_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Rslt2R create() {
		Rslt2R row = new Rslt2R(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Rslt2R createByName(T proto) {
		Rslt2R row = Rslt2R.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Rslt2R(ConstMetaList<? extends Rslt2R> metas) {
		super(metas);
	}
}