package mcframe.clientMSUC.MSUCP0040;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUCP_PurcUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUCP_PurcUtil_MC extends MSUCP_PurcUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * static メソッドのアクセス用フィールド
	 */
	protected static MSUCP_PurcUtil _util = new MSUCP_PurcUtil();
	
	/**
	 *  発注予定日または発注日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 *  仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 *  納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  依頼元納入希望日.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt = "rqst_dlv_rqst_dt";
	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  取引通貨加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 *  取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUCP_PurcUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 経費購買であるか否かを判定します。
	 */
	public static Boolean isPurcXpns(String trdPtnTyp, String assetMngTyp) {

		if (MAC_ASSET_MNG_TYP.isNOT_MNG(assetMngTyp)) {
			return true;
		}
		return false;
	}
	public static boolean isPurcStkMng(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		return _util._isPurcStkMng(stkMngTyp, assetMngTyp, xpnsPurcFlg);
	}
	protected boolean _isPurcStkMng(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		// 品目の在庫管理区分・資産管理区分、経費購買FLGの組合せで、
		// 引当対象を判別するための値を在庫管理区分項目に設定する
		if (MAC_STK_MNG_TYP.isMNG(stkMngTyp)) {
			if (MAC_ASSET_MNG_TYP.isMNG(assetMngTyp)) {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理する」
				if (xpnsPurcFlg) {
					// 経費購買FLGがオンの場合は、在庫を更新しない
					return false;
				} else {
					// 経費購買FLGがオフの場合は、在庫を更新する
					return true;
				}
			} else {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理しない」の場合
				// 在庫を更新する
				return true;
			}
		} else {
			// 品目マスタ・在庫管理区分が「在庫管理する」以外の場合は、在庫を更新しない
			return false;
		}	
	}
	
	/**
	 * 予定日を取得する。
	 * <p>
	 * @param  peg_no   紐付けＮＯ
	 * @param  rqst_dlv_rqst_dt   依頼元納入希望日
	 * @param  dlv_rqst_dt   納入希望日
	 * @param  po_schd_dt   発注予定日または発注日
	 * @param  purc_schd_dt   仕入予定日
	 * @param  sppl_cd   発注先ＣＤ
	 * @param  itm_cd   品目ＣＤ
	 * @param  itm_sub1   枝番１
	 * @param  itm_sub2   枝番２
	 * @param  itm_sub3   枝番３
	 * @param  mfg_loc_cd   製造場所ＣＤ
	 * @param  maker_cd   メーカＣＤ
	 * @param  wg_cd   ＷＧ　ＣＤ
	 * @param  bom_ptn   構成パタン
	 * @param  dlv_cd   納品先ＣＤ
	 * @param  in_to_loc_cd   納入場所ＣＤ
	 * @param  site_cd   工場・物流倉庫ＣＤ
	 * @param  outsrc_sppl_cd 外注発注先ＣＤ
	 * @param  sppl_cal_cd   発注先カレンダＣＤ
	 * @param  in_to_loc_cal_cd   納入場所カレンダＣＤ
	 * @param  dlv_cal_cd   納品先カレンダＣＤ
	 * @param  lg_grp_cd   物流グループＣＤ
	 * @param  base_unit_qty   基準単位数量
	 * @param panel 画面
	 * @return 予定日情報、または null
	 */
	public static MCRow getSchdDt(MCNumber peg_no, 
			MCDate rqst_dlv_rqst_dt,
			MCDate dlv_rqst_dt,
			MCDate po_schd_dt,
			MCDate purc_schd_dt,
			String sppl_cd,
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String mfg_loc_cd,
			String maker_cd,
			String wg_cd,
			String bom_ptn,
			String dlv_cd,
			String in_to_loc_cd,
			String site_cd,
			String outsrc_sppl_cd,
			String sppl_cal_cd,
			String in_to_loc_cal_cd,
			String dlv_cal_cd,
			String lg_grp_cd,
			MCNumber base_unit_qty, 
			MCDate base_dt, 
			MCRootPanel panel) {
		
		return MSUCP_PurcListLogic.getSchdDt(
				peg_no,
				rqst_dlv_rqst_dt,
				dlv_rqst_dt,
				po_schd_dt,
				purc_schd_dt,
				sppl_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				mfg_loc_cd,
				maker_cd,
				wg_cd,
				bom_ptn,
				dlv_cd,
				in_to_loc_cd,
				site_cd,
				outsrc_sppl_cd,
				sppl_cal_cd,
				in_to_loc_cal_cd,
				dlv_cal_cd,
				lg_grp_cd,
				base_unit_qty,
				base_dt, 
				panel);
	}
	
	/**
	 * 税ＣＤを取得する。
	 * <p>
	 * @param   グループＮＯ
	 * @param panel 画面
	 * @return 単価情報、または null
	 */
	public static String getPurcTaxCd(
			String itm_cd,
			String itm_sub1,
			String itm_sub2,
			String itm_sub3,
			String sppl_cd,
			MCDate base_dt,
			MCRootPanel panel) {
		return MSUCP_PurcListLogic.getPurcTaxCd(
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				sppl_cd,
				base_dt,
				panel);
	}
	
	/**
	 * 単価再取得時のチェック処理を行います。
	 * 日付以外のチェックをします。日付は呼出元でチェックしてください。<br>
	 * 購買区分の項目名は「purc_typ」、 製造場所ＣＤは「mfg_loc_cd」であることを前提に動作します。<br>
	 * 
	 * @param panel 画面
	 * @param tgt 対象のリスト
	 * @param bp 取引先
	 * @param trdCurCd 取引単位
	 * @param wgCd ＷＧ　ＣＤ
	 * @param itmCd 品目
	 * @param itmSub1 枝番１
	 * @param itmSub2 枝番２
	 * @param itmSub3 枝番３
	 * @param trdUnitCd 取引単位ＣＤ
	 * @param trdUnitQty 取引単位数量
	 * @param baseUnitQty 基準単位数量
	 * @return メッセージリスト
	 */
	public static MCMessageList chkForUpriExptDt(mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase panel,
			MCList<? extends MCRow> tgt, MCBeans bp, MCBeans trdCurCd, 
			MCColumnConfig wgCd, MCColumnConfig itmCd, MCColumnConfig itmSub1,MCColumnConfig itmSub2,
			MCColumnConfig itmSub3, MCColumnConfig trdUnitCd,
			MCColumnConfig trdUnitQty, MCColumnConfig baseUnitQty  
			) {
		return _util._chkForUpriExptDt(panel, tgt, 
				bp, trdCurCd, wgCd, itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd, trdUnitQty, baseUnitQty);
	}
	/**
	 * {@link #chkForUpriExptDt(mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase, MCList, MCBeans, MCBeans, MCColumnConfig, MCColumnConfig, MCColumnConfig, MCColumnConfig, MCColumnConfig, MCColumnConfig, MCColumnConfig, MCColumnConfig)}
	 */
	protected MCMessageList _chkForUpriExptDt(mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase panel,
			MCList<? extends MCRow> tgt, MCBeans bp, MCBeans trdCurCd, 
			MCColumnConfig wgCd, MCColumnConfig itmCd, MCColumnConfig itmSub1,MCColumnConfig itmSub2,
			MCColumnConfig itmSub3, MCColumnConfig trdUnitCd,
			MCColumnConfig trdUnitQty ,MCColumnConfig baseUnitQty  
			) {
		MCMessageList ml = new MCMessageList();
		boolean isBpRowb = bp instanceof MCRowBeans;
		boolean isTrdCurCdRowb = trdCurCd instanceof MCRowBeans;
		if (isBpRowb) {
			ml.addAll(panel.checkReq((MCRowBeans)bp));
		}

		if (isTrdCurCdRowb) {
			ml.addAll(panel.checkReq((MCRowBeans)trdCurCd));
		}
		
		tgt.forEach(r -> {
			int idx = r.getGUIIndex();
			if (!isBpRowb) {
				ml.addAll(panel.checkReq(idx, (MCColumnConfig)bp));
			}

			if (!isTrdCurCdRowb) {
				ml.addAll(panel.checkReq(idx, (MCColumnConfig)trdCurCd));
			}
			
			ml.addAll(panel.checkReq(
					idx, 
					wgCd,
					itmCd,
					trdUnitCd,
					trdUnitQty));
			
			// システムパラメータで隠される項目は CellModeで評価
			ml.addAll(panel.checkReqWithCellMode(
					idx, 
					itmSub1,
					itmSub2,
					itmSub3));
			
			if (isOutSrc(r)) {
				ml.addAll(panel.checkReq(
						idx,
						baseUnitQty));
			}
		});
		
		return ml;
	}
	
	protected static boolean isOutSrc(MCRow r) {
		return _util._isOutSrc(r);
	} 
	protected boolean _isOutSrc(MCRow r) {
		boolean isOutSrc = false;
		String ptyp = r.getStringNE("purc_typ");
		String mloc = r.getStringNE("mfg_loc_cd");
		//サーバの単価取得処理の分岐とあわせてある
		if (isNull(ptyp) || MAC_PURC_TYP.isPURC_ITM(ptyp)) {
			if (isNull(mloc) || MAC_STR.isNULL_VAL(mloc)) {
				
			}
			else {
				isOutSrc = true;
			}
		}
		// upR.purc_typが外注加工品（無償）、外注加工品（有償）
		else {
			isOutSrc = true;
		}
		return isOutSrc;
	}
	
	public static String getPurcRetTrdPtnTyp(String purcTrdPtnTyp) {
		return _util._getPurcRetTrdPtnTyp(purcTrdPtnTyp);
	}
	
	protected String _getPurcRetTrdPtnTyp(String purcTrdPtnTyp) {
		String retTyp;
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(purcTrdPtnTyp)) {
			retTyp = MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value();
		}
		else {
			retTyp = MAC_TRD_PTN_TYP.PURC_RTN.value();
		}
		return retTyp;
	}
	
	/**
	 * 算出して設定する必要のある有効成分情報を設定します。<p>
	 * 以下の項目の値を使用します。<br>
	 * <li>有効成分対象：cont_fctr_flg
	 * <li>基準単位数量：base_unit_qty
	 * <li>標準有効成分係数：std_cont_fctr
	 * <li>有効成分小数部有効桁数：cont_fctr_dec_place
	 * <li>有効成分換算端数処理区分：cont_fctr_rnd_typ
	 * <li>仕入有効成分：purc_cont_qty
	 * <li>仕入有効成分係数：purc_cont_fctr
	 */
	public static void setCont(MCRow ioR) {
		if (ioR.getBooleanNE("cont_fctr_flg")) {
			ioR.setNumberNE("std_cont_qty", MAUCP_MCDataUtil.convToContFctrUnit(
					ioR.getNumberNE("base_unit_qty"), 
					ioR.getNumberNE("std_cont_fctr"), 
					ioR.getNumberNE("cont_fctr_dec_place"),
					ioR.getStringNE("cont_fctr_rnd_typ")));
			
			//仕入有効成分がない場合は標準有効成分を仕入有効成分として使用する。
			if (isNull(ioR.getNumberNE("purc_cont_qty"))) {
				ioR.setNumberNE("purc_cont_fctr", ioR.getNumberNE("std_cont_fctr"));
				ioR.setNumberNE("purc_cont_qty", ioR.getNumberNE("std_cont_qty"));
			}
			else {
				ioR.setNumberNE("purc_cont_fctr", MAUCP_MCDataUtil.calcContFctr(
						ioR.getNumberNE("base_unit_qty"), 
						ioR.getNumberNE("purc_cont_qty"), 
						ioR.getNumberNE("cont_fctr_dec_place")));	
			}
		}
	}
	

	/**
	 * 詳細の有効成分情報を明細に追加します。<p>
	 * 以下の項目の値を使用します。<br>
	 * <li>有効成分対象：cont_fctr_flg
	 * <li>基準単位数量：base_unit_qty
	 * <li>有効成分小数部有効桁数：cont_fctr_dec_place
	 * <li>有効成分換算端数処理区分：cont_fctr_rnd_typ
	 * <li>仕入有効成分：purc_cont_qty
	 * <li>仕入有効成分係数：purc_cont_fctr
	 * <li>標準有効成分：std_cont_qty
	 * <li>標準有効成分係数：std_cont_fctr
	 * <li>有効成分単位：cont_fctr_unit_cd
	 * <li>有効成分単位名：cont_fctr_unit_nm
	 */
	public static void addCont(MCRow dR, MCRow ioR) {
		Boolean cf = ioR.getBooleanNE("cont_fctr_flg");
		if (cf) {
			dR.setBooleanNE("cont_fctr_flg", cf);
			MCNumber sq = nvl(dR.getNumberNE("purc_cont_qty"), MCNumber.ZERO);
			dR.setNumberNE("std_cont_qty", sq.add(ioR.getNumberNE("std_cont_qty")));
			dR.setNumberNE("std_cont_fctr", ioR.getNumberNE("std_cont_fctr"));//固定
			
			MCNumber dq = nvl(dR.getNumberNE("purc_cont_qty"), MCNumber.ZERO);
			dR.setNumberNE("purc_cont_qty", dq.add(ioR.getNumberNE("purc_cont_qty")));
				
			dR.setStringNE("cont_fctr_unit_cd", ioR.getStringNE("cont_fctr_unit_cd"));
			dR.setStringNE("cont_fctr_unit_nm", ioR.getStringNE("cont_fctr_unit_nm"));
			dR.setNumberNE("cont_fctr_dec_place", ioR.getNumberNE("cont_fctr_dec_place"));
			dR.setStringNE("cont_fctr_rnd_typ", ioR.getStringNE("cont_fctr_rnd_typ"));
	
			MSUCP_PurcUtil.setCont(dR);
		}		
	}

}