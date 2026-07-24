package mcframe.serverMSBC.MSBCL6060;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"MfgActTblReg_Upd04_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>alias</th>
 *  	<th>項目名</th>
 *  	<th>フルネーム</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>INNERROW/COLUMNPATH</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>hdr_peg_no</td>
 *  	<td>Header pegging No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bkf_tgt_cnt</td>
 *  	<td>Number of BF</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bkf_success_cnt</td>
 *  	<td>Number of backflush succeeded</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bkf_failure_cnt</td>
 *  	<td>Number of backflush failed</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MfgActTblReg_Upd04_HdrR extends MfgActTblReg_Upd04_HdrR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MfgActTblReg_Upd04_HdrR create() {
		MfgActTblReg_Upd04_HdrR row = new MfgActTblReg_Upd04_HdrR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MfgActTblReg_Upd04_HdrR createByName(T proto) {
		MfgActTblReg_Upd04_HdrR row = MfgActTblReg_Upd04_HdrR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public MfgActTblReg_Upd04_HdrR(ConstMetaList<? extends MfgActTblReg_Upd04_HdrR> metas) {
		super(metas);
	}
}