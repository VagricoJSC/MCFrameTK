package mcframe.clientMGBD.MGBDP0230;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_AlcCalcDtlSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_AlcCalcDtlSrch_MC extends MGBDP_AlcCalcDtlSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_AlcCalcDtlSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_AlcCalcDtlSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected MCPanel getOpeHdrPanel() {
		return CndPanel;
	}
	
	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return CndPanel;
	}
	
	/**
	 * [MG_MGBDL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0230_Srch01Caller<P extends MGBDP_AlcCalcDtlSrch, B extends MG_MGBDL0230_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0230_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Cnd_calc_grp_cd)); 
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMG_MGBDL0230_Srch01();
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
	}

	protected void setRefStatus() {
		setREFStatus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFocus();
	}
	
	protected void setFocus() {
		RsltTable.selectLeftmostColumn(0);
	}
	
	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>起動タイプ：T1<br>
	 * バインド値＜必須＞<br>
	 * calc_grp_cd, calc_no, alc_grp_id, wg_cd以外は、検索条件ではなく、表示用の項目である<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>calc_grp_cd</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <tr>
	 * <td>calc_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_grp_id</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>wg_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>ym</td>
	 * <td>MCDate</td>
	 * <td> </td>
	 * </tr>
	 * <td>inpt_alc_typ</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_ac_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>dpt_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>dpt_nm</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>loc_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>oper_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>bp_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>ctg_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_sub1</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_sub2</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_sub3</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_nm</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>lot_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>sublot_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>sno1</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>sno2</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>sno3</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>sno4</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>itm_mfg_inst_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>iv_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>po_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>slo_no</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>expns_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_ptn_cd</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>amt</td>
	 * <td>MCNumber</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_tgt_val</td>
	 * <td>MCNumber</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_rate</td>
	 * <td>MCNumber</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>std_alc_rate</td>
	 * <td>MCNumber</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>alc_amt</td>
	 * <td>MCNumber</td>
	 * <td> </td>
	 * </tr>
	 * <tr>
	 * <td>std_alc_amt</td>
	 * <td>String</td>
	 * <td> </td>
	 * </tr>
	 * </table> <br>
	 * その他の引数：なし</li>
	 * </P>
	 * 
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		
		if (isSame(T1, openTyp)) {
			setValueEx(Cnd_calc_grp_cd, bind.getStringNE("calc_grp_cd"));
			if (isNull(getCndR().calc_grp_cd())) {
				valueInit();
				return;	
			}
			setValueEx(Cnd_calc_no, bind.getStringNE("calc_no"));
			if (isNull(getCndR().calc_no())) {
				return;	
			}
			getCndR().alc_grp_id(bind.getNumberNE("alc_grp_id"));
			setValueEx(Cnd_wg_cd, bind.getStringNE("wg_cd"));
			setValueEx(Cnd_ym, bind.getDateNE("ym"));
			setValueEx(Cnd_inpt_alc_typ, bind.getStringNE("inpt_alc_typ"));
			setValueEx(Cnd_alc_ac_cd, bind.getStringNE("alc_ac_cd"));
			setValueEx(Cnd_loc_cd, bind.getStringNE("loc_cd"));
			getCndR().dpt_cd(bind.getStringNE("dpt_cd"));
			getCndR().dpt_nm(bind.getStringNE("dpt_nm"));
			setValueEx(Cnd_oper_cd, bind.getStringNE("oper_cd"));
			setValueEx(Cnd_bp_cd, bind.getStringNE("bp_cd"));
			setValueEx(Cnd_ctg_cd, bind.getStringNE("ctg_cd"));
			Cnd_itm_cd.setValue(bind.getStringNE("itm_cd"));
			Cnd_itm_sub1.setValue(bind.getStringNE("itm_sub1"));
			Cnd_itm_sub2.setValue(bind.getStringNE("itm_sub2"));
			Cnd_itm_sub3.setValue(bind.getStringNE("itm_sub3"));
			Cnd_itm_nm.setValue(bind.getStringNE("itm_nm"));
			setValueEx(Cnd_lot_no, bind.getStringNE("lot_no"));
			setValueEx(Cnd_sublot_no, bind.getStringNE("sublot_no"));
			setValueEx(Cnd_sno1, bind.getStringNE("sno1"));
			setValueEx(Cnd_sno2, bind.getStringNE("sno2"));
			setValueEx(Cnd_sno3, bind.getStringNE("sno3"));
			setValueEx(Cnd_sno4, bind.getStringNE("sno4"));
			setValueEx(Cnd_itm_mfg_inst_no, bind.getStringNE("itm_mfg_inst_no"));
			setValueEx(Cnd_iv_no, bind.getStringNE("iv_no"));
			setValueEx(Cnd_po_no, bind.getStringNE("po_no"));
			setValueEx(Cnd_slo_no, bind.getStringNE("slo_no"));
			setValueEx(Cnd_expns_cd, bind.getStringNE("expns_cd"));
			setValueEx(Cnd_alc_ptn_cd, bind.getStringNE("alc_ptn_cd"));
			setValueEx(Cnd_alc_tgt_val, bind.getNumberNE("alc_tgt_val"));
			setValueEx(Cnd_alc_rate, bind.getNumberNE("alc_rate"));
			setValueEx(Cnd_std_alc_rate, bind.getNumberNE("std_alc_rate"));
			
			getCndR().amt(bind.getNumberNE("amt"));
			getCndR().alc_amt(bind.getNumberNE("alc_amt"));
			getCndR().std_alc_amt(bind.getNumberNE("std_alc_amt"));
			
			addDoBehind(Cnd_srch);
		}
	}

}