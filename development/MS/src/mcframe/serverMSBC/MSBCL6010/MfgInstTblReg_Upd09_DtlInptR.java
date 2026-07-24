package mcframe.serverMSBC.MSBCL6010;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"MfgInstTblReg_Upd09_DtlInpt"コンテナRowクラスです。<p>
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
 *  	<td>inpt_schd_no</td>
 *  	<td>Input schedule No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INPT_SCHD_NO INPT_SCHD_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfg_sts_typ</td>
 *  	<td>Mfg. status type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#MFG_STS_TYP MFG_STS_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MfgInstTblReg_Upd09_DtlInptR extends MfgInstTblReg_Upd09_DtlInptR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MfgInstTblReg_Upd09_DtlInptR create() {
		MfgInstTblReg_Upd09_DtlInptR row = new MfgInstTblReg_Upd09_DtlInptR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MfgInstTblReg_Upd09_DtlInptR createByName(T proto) {
		MfgInstTblReg_Upd09_DtlInptR row = MfgInstTblReg_Upd09_DtlInptR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public MfgInstTblReg_Upd09_DtlInptR(ConstMetaList<? extends MfgInstTblReg_Upd09_DtlInptR> metas) {
		super(metas);
	}
}