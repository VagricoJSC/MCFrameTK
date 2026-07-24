package mcframe.serverMSBG.MSBGL5090;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"RcvActIfCrt_Ins01_Cnd"コンテナRowクラスです。<p>
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
 *  	<td>rcv_act_d_no</td>
 *  	<td>Payment received result details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#RCV_ACT_D_NO RCV_ACT_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>rcv_act_d_seq</td>
 *  	<td>Payment received result details sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_SEQ SLIP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ar_xrate_rev_his_no</td>
 *  	<td>Exchange rate revaluation history No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#AR_XRATE_REV_HIST_NO AR_XRATE_REV_HIST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ref_ar_xrate_rev_his_no</td>
 *  	<td>Reference AR exchange rate revaluation history No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#AR_XRATE_REV_HIST_NO AR_XRATE_REV_HIST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class RcvActIfCrt_Ins01_CndR extends RcvActIfCrt_Ins01_CndR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static RcvActIfCrt_Ins01_CndR create() {
		RcvActIfCrt_Ins01_CndR row = new RcvActIfCrt_Ins01_CndR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> RcvActIfCrt_Ins01_CndR createByName(T proto) {
		RcvActIfCrt_Ins01_CndR row = RcvActIfCrt_Ins01_CndR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public RcvActIfCrt_Ins01_CndR(ConstMetaList<? extends RcvActIfCrt_Ins01_CndR> metas) {
		super(metas);
	}
}