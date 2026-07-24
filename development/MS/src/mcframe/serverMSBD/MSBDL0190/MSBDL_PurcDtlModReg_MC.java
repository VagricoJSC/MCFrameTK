package mcframe.serverMSBD.MSBDL0190;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBD.MSBDL0190.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5180.*;
import java.util.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import static mcframe.serverMSBD.MSBDL0190.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMSBD.MSBDL5200.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMAUC.MAUCL5020.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDtlModReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDtlModReg_MC extends MSBDL_PurcDtlModReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 仕入情報（仕入・返品・値引情報）を検索する<br>
	 */
	public class Srch01 extends MSBDL_PurcDtlModReg_MC_A.Srch01 {
		/** 操作種別:訂正 */		
		protected static final String OPE_UPD = "0";
		/** 操作種別:参照 */
		protected static final String OPE_REF = "1";
		/** 検索モード：ヘッダ */
		protected static final String DISP_UNIT_HDR = "2";
		/** 検索モード：明細 */
		protected static final String DISP_UNIT_DTL = "1";
		/** 検索モード：詳細 */
		protected static final String DISP_UNIT_IO = "0";
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索条件の編集
			setUpTmpCol();
			
			// 一時カラムの設定
			addTmpCol();
			
			// 検索ＳＱＬ
			MCQueryPlan sql = null;
			if (isSame(DISP_UNIT_HDR, up0().disp_unit())) {
				sql = MSBDL0190_MST_PURC_ACT_S04();
			}
			else if (isSame(DISP_UNIT_DTL, up0().disp_unit())) {
				sql = MSBDL0190_MST_PURC_ACT_S05();
			}
			else if (isSame(DISP_UNIT_IO, up0().disp_unit())) {
				sql = MSBDL0190_MST_PURC_ACT_S06();
			}
			
			// 検索実行
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void doSearchSub() {
			super.doSearchSub();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP.F_GET_AP_DPT_CD_NE", "01"),
					MABSFunction.getFunctionExecuter("MAPA_BP.F_GET_AP_DPT_CD_NE")
					, Srch01_DtlR.$mst_ap_dpt_cd
					, down0()
					, Srch01_DtlR.$asppl_cd
					, Srch01_DtlR.$ac_dt);
			
			for (Srch01_DtlR r : down0()) {
				if (!isNull(r.arr_dt())) {
					r.arr_dt(r.arr_dt().trunc(MCDateFieldType.DAY));
				}
				if (!isNull(r.dlv_rqst_dt())) {
					r.dlv_rqst_dt(r.dlv_rqst_dt().trunc(MCDateFieldType.DAY));
				}

				if (!r.sundry_itm_flg()) {
					// 諸口品以外は品目マスタの品名（受領Ｉ／Ｖ表記品名はロケールマスタの品名）
					r.itm_nm(r.itm_nm_itm());

					if (_cacheItmLcl != null) {
						MAM_ITM_LCL_R dbcR = _cacheItmLcl.get(
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lcl_cd());
							r.iv_itm_nm(dbcR.itm_nm());
					}
				}

				// 取引先マスタの取引先名
				r.dlv_nm(nvl(r.dlv_nm(), r.dlv_nm_bp()));
				r.tdlv_nm(nvl(r.tdlv_nm(), r.tdlv_nm_bp()));

				if (isSame(up0().getStringNE("disp_unit"), DISP_UNIT_HDR)) {
					r.mfg_loc_cd(null);
					r.mfg_loc_nm(null);
				}

				if (_cachePurcSchd != null) {
					MST_PURC_SCHD_R psR = _cachePurcSchd.get(r.purc_schd_no());
					if (isNull(psR) || isNull(psR.purc_schd_no())) {
						// 仕入予定がない（対応する発注明細が取り消されている）場合、仕入実績明細には設定されているが表示しない
						r.purc_schd_no(null);
					}
				}

				// 締め済み計上年月の取得
				r.purc_cl_ym(MSUCL_ClUtil.getPurcClYm());
				
				if (isSame(up0().disp_unit(), DISP_UNIT_DTL)) {
					// 単価取得時のキー項目設定
					setBase(r);
				}
				
				if (r.cont_fctr_flg()) {
					// 標準有効成分
					MCNumber contQty =  convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					r.std_cont_qty(contQty);
					
					// 仕入有効成分係数
					MCNumber purcContFctr = calcContFctr(
							 r.base_unit_qty()
							,r.purc_cont_qty()
							,r.cont_fctr_dec_place());
					r.purc_cont_fctr(purcContFctr);
				}
				if (isSame(up0().ope(), OPE_REF)) {
					r.base_trd_unit_qty(null);
					r.base_base_unit_qty(null);
				}
				// 仕入値引の場合は外注品も通常品と同様に扱うので、買戻義務・外注単価区分はクリアする
				if(isPurcDscnt(r.trd_ptn_typ())) {
					r.repurc_obli_flg(false);
					r.outsrc_upri_typ(null);
				}
			}
			// 返品・値引金額の符号を反転させる場合
			if (up0().sign_rev_flg()) {
				MCList<Srch01_DtlR> subL = down0().subList(new MCRowMatcher<Srch01_DtlR>() {
					public boolean match (Srch01_DtlR m) {
						if (isPurc(m.trd_ptn_typ()) || isPurcRtn(m.trd_ptn_typ()) || isPurcDscnt(m.trd_ptn_typ())) {
							return true;
						}
						else {
							return false;
						}
					}
				});
				
				for (Srch01_DtlR r : subL) {
					// 取引通貨金額情報
					r.trd_cur_upri(getUpriDispPm(r.trd_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_amt(getAmtDispPm(r.trd_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_inc_tax_amt(getAmtDispPm(r.trd_cur_inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_tax_amt(getAmtDispPm(r.trd_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_dscnt_amt(getAmtDispPm(r.trd_cur_dscnt_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_proc_upri(getUpriDispPm(r.trd_cur_proc_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_onr_prov_upri(getUpriDispPm(r.trd_cur_onr_prov_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_proc_amt(getAmtDispPm(r.trd_cur_proc_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.trd_cur_onr_prov_amt(getAmtDispPm(r.trd_cur_onr_prov_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					
					// 基準通貨金額情報
					r.base_cur_upri(getUpriDispPm(r.base_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_amt(getAmtDispPm(r.base_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_inc_tax_amt(getAmtDispPm(r.base_cur_inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_tax_amt(getAmtDispPm(r.base_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_proc_amt(getAmtDispPm(r.base_cur_proc_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_proc_upri(getUpriDispPm(r.base_cur_proc_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_onr_prov_upri(getUpriDispPm(r.base_cur_onr_prov_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_onr_prov_amt(getAmtDispPm(r.base_cur_onr_prov_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.base_cur_dscnt_amt(getAmtDispPm(r.base_cur_dscnt_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					// 納税通貨金額情報
					r.ptax_cur_upri(getUpriDispPm(r.ptax_cur_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_amt(getAmtDispPm(r.ptax_cur_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_inc_tax_amt(getAmtDispPm(r.ptax_cur_inc_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_tax_amt(getAmtDispPm(r.ptax_cur_tax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_proc_amt(getAmtDispPm(r.ptax_cur_proc_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_proc_upri(getUpriDispPm(r.ptax_cur_proc_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_onr_prov_upri(getUpriDispPm(r.ptax_cur_onr_prov_upri(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_onr_prov_amt(getAmtDispPm(r.ptax_cur_onr_prov_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					r.ptax_cur_dscnt_amt(getAmtDispPm(r.ptax_cur_dscnt_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));

					// 源泉税額情報
					r.wtax_amt(getAmtDispPm(r.wtax_amt(), r.trd_ptn_typ(), r.dscnt_itm_flg()));
					
					// 取引単位数量
					r.trd_unit_qty(getQtyDispPm(r.trd_unit_qty(), r.trd_ptn_typ()));
					
					// 基準単位数量
					r.base_unit_qty(getQtyDispPm(r.base_unit_qty(), r.trd_ptn_typ()));
				}
			}
		}
		
		
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}
		
		/**
		 * 検索条件を編集します
		 */
		protected void setUpTmpCol() {
			if (isSame(up0().ope(), OPE_UPD)) {
				// 訂正種別の場合、検収不良や無償の仕入実績明細を検索対象から除外する
				up0().except_can_not_upd_flg(true);
			}
			if (up0().purc_flg()) {
				up0().addStringColumn("tmp_trd_ptn_purc", MAC_TRD_PTN_TYP.PURC.value());
				up0().addStringColumn("tmp_trd_ptn_purc_xpns", MAC_TRD_PTN_TYP.PURC_XPNS.value());
				up0().addStringColumn("tmp_trd_ptn_purc_vmi", MAC_TRD_PTN_TYP.PURC_VMI.value());
			}
			if (up0().dscnt_flg()) {
				up0().addStringColumn("tmp_trd_ptn_purc_dscnt", MAC_TRD_PTN_TYP.PURC_DSCNT.value());
				up0().addStringColumn("tmp_trd_ptn_purc_dscnt_xpns", MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value());
				up0().addStringColumn("tmp_trd_ptn_purc_xtra", MAC_TRD_PTN_TYP.PURC_XTRA.value());
				up0().addStringColumn("tmp_trd_ptn_purc_xtra_xpns", MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value());
			}
			if (up0().ret_flg()) {
				up0().addStringColumn("tmp_trd_ptn_purc_rtn", MAC_TRD_PTN_TYP.PURC_RTN.value());
				up0().addStringColumn("tmp_trd_ptn_purc_rtn_xpns", MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value());
			}
			// 発注先インボイス取引ＦＬＧ
			if (!isSame(up0().iv_trgt_flg(), up0().iv_not_trgt_flg())) {
				up0().addStringColumn("tmp_iv_trgt", MCBooleanUtil.booleanToDBString(up0().iv_trgt_flg()));
			}
			else {
				up0().addStringColumn("tmp_iv_trgt");
			}
			// 仮単価ＦＬＧ
			if (!isSame(up0().interim_flg(), up0().upri_flg())) {
				up0().addStringColumn("tmp_interim", MCBooleanUtil.booleanToDBString(up0().interim_flg()));
			} 
			// 下請け対象ＦＬＧ
			if (!isSame(up0().subcon_flg(), up0().not_subcon_flg())) {
				up0().addStringColumn("tmp_subcon", MCBooleanUtil.booleanToDBString(up0().subcon_flg()));
			}
			else {
				up0().addStringColumn("tmp_subcon");
			}
			// 外貨ＦＬＧ
			if (up0().foreign_flg()) {
				up0().addStringColumn("tmp_foreign", toTrueStr(up0().foreign_flg()));
			}
			// 無効・取消含む
			up0().addStringColumn("tmp_dis_can_disp_flg", toTrueStr(up0().dis_can_disp_flg()));
			
			//過去改訂含む
			up0().addStringColumn("tmp_inc_past_flg", toTrueStr(up0().inc_past_flg()));
			
			up0().addDateColumn("today", getToday());
		}
		
		/**
		 * 一時カラムの設定を行います
		 */
		protected void addTmpCol() {
			// 仕入返品予定ＮＯ
			down0().addStringColumn("PURC_RET_SCHD_NO");
			
			// 発注明細項目
			down0().addStringColumn("PO_TRD_UNIT_CD");
			down0().addStringColumn("PO_TRD_UNIT_QTY");
			down0().addStringColumn("PO_BASE_UNIT_QTY");
			down0().addStringColumn("PO_TRD_CUR_CD");
			down0().addStringColumn("PO_IN_TO_LOC_WG_CD");
			down0().addStringColumn("PO_IN_TO_LOC_CD");
			down0().addStringColumn("PO_BASE_DT");
			down0().addStringColumn("PO_TAX_CD");
			
			// 返品予定項目
			down0().addStringColumn("RS_TRD_UNIT_CD");
			down0().addStringColumn("RS_TRD_UNIT_QTY");
			down0().addStringColumn("RS_BASE_UNIT_QTY");
			down0().addStringColumn("RS_TRD_CUR_CD");
			down0().addStringColumn("RS_IN_TO_LOC_WG_CD");
			down0().addStringColumn("RS_IN_TO_LOC_CD");
			down0().addStringColumn("RS_BASE_DT");
			down0().addStringColumn("RS_TAX_CD");
			
			// 仕入項目
			down0().addStringColumn("PA_TRD_UNIT_CD");
			down0().addStringColumn("PA_TRD_UNIT_QTY");
			down0().addStringColumn("PA_BASE_UNIT_QTY");
			down0().addStringColumn("PA_TRD_CUR_CD");
			down0().addStringColumn("PA_IN_TO_LOC_WG_CD");
			down0().addStringColumn("PA_IN_TO_LOC_CD");
			down0().addStringColumn("PA_BASE_DT");
			down0().addStringColumn("PA_TAX_CD");
		}
		/**
		 * 単価取得時の基準項目を設定しますします
		 */
		protected void setBase(Srch01_DtlR r) {
			String baseTrdUnitCd;
			String baseTrdUnitNm;
			MCNumber baseTrdUnitDecPlace;
			MCNumber baseTrdUnitQty;
			MCNumber baseBaseUnitQty;
			String baseTrdCurCd;
			String baseTrdCurNm;
			String baseInToLocWgCd;
			String baseInToLocWgNm;
			String baseInToLocCd;
			String baseInToLocNm;
			MCDate sbdtDt = null;
			String baseTaxCd;
			String baseTaxNm;
			
			if ((MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())
					) && !isNull(r.po_d_no())) {
				// 発注に紐付く仕入実績の場合
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())) {
					sbdtDt =r.po_dt();
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
					sbdtDt =r.dlv_rqst_dt();
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(r.purc_upri_req_typ())) {
					sbdtDt =r.purc_schd_dt();
				}
				MST_PO_D_R dbcR = _cachePoD.get(r.getStringNE("PO_D_NO"));
				baseTrdUnitCd = dbcR.trd_unit_cd();
				baseTrdUnitNm = dbcR.getStringNE("unit_nm");
				baseTrdUnitDecPlace = dbcR.getNumberNE("dec_place");
				baseTrdUnitQty = dbcR.trd_unit_qty();
				baseBaseUnitQty =dbcR.base_unit_qty();
				baseTrdCurCd =dbcR.getStringNE("trd_cur_cd");
				baseTrdCurNm =dbcR.getStringNE("cur_nm");
				baseInToLocWgCd =dbcR.getStringNE("wg_cd");
				baseInToLocWgNm =dbcR.getStringNE("wg_nm");
				baseInToLocCd =dbcR.in_to_loc_cd();
				baseInToLocNm =dbcR.getStringNE("loc_nm");
				baseTaxCd = dbcR.tax_cd();
				baseTaxNm = dbcR.getStringNE("tax_nm");
			}
			else if ((MAC_TRD_PTN_TYP.isPURC_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(r.trd_ptn_typ())
					) && !isNull(r.getStringNE("PURC_RET_SCHD_NO"))) {
				// 返品予定に紐付く返品実績の場合
				MST_PURC_RET_SCHD_D_R dbcR = _cachePurcRetSchdD.get(r.getStringNE("PURC_RET_SCHD_D_NO"));
				baseTrdUnitCd = dbcR.trd_unit_cd();
				baseTrdUnitNm = dbcR.getStringNE("unit_nm");
				baseTrdUnitDecPlace = dbcR.getNumberNE("dec_place");
				baseTrdUnitQty = dbcR.trd_unit_qty();
				baseBaseUnitQty =dbcR.base_unit_qty();
				baseTrdCurCd =dbcR.getStringNE("trd_cur_cd");
				baseTrdCurNm =dbcR.getStringNE("cur_nm");
				baseInToLocWgCd =dbcR.purc_ret_loc_wg_cd();
				baseInToLocWgNm =dbcR.getStringNE("wg_nm");
				baseInToLocCd =dbcR.purc_ret_loc_cd();
				baseInToLocNm =dbcR.getStringNE("loc_nm");
				sbdtDt =dbcR.getDateNE("schd_dt");
				baseTaxCd = dbcR.tax_cd();
				baseTaxNm = dbcR.getStringNE("tax_nm");
			}
			else {
				// その他の場合 (計画外仕入、予定なしの返品、仕入値引はこのパタンに分岐する）
				// SQLで取得・設定済みなのでここでは何もしない
				return;
			}
			
			r.base_trd_unit_cd(baseTrdUnitCd);
			r.base_trd_unit_nm(baseTrdUnitNm);
			r.base_trd_unit_dec_place(baseTrdUnitDecPlace);
			r.base_trd_unit_qty(baseTrdUnitQty);
			r.base_base_unit_qty(baseBaseUnitQty);
			r.base_trd_cur_cd(baseTrdCurCd);
			r.base_trd_cur_nm(baseTrdCurNm);
			r.base_in_to_loc_wg_cd(baseInToLocWgCd);
			r.base_in_to_loc_wg_nm(baseInToLocWgNm);
			r.base_in_to_loc_cd(baseInToLocCd);
			r.base_in_to_loc_nm(baseInToLocNm);
			r.sbst_dt(sbdtDt);
			r.base_tax_cd(baseTaxCd);
			r.base_tax_nm(baseTaxNm);
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を取得します<br>
	 */
	public class Sprt01 extends MSBDL_PurcDtlModReg_MC_A.Sprt01 {
		//----------------------------------
		// Cache
		//----------------------------------
		/** 製造指図 */
		protected MCList<MST_MFG_INST_R> _cacheMfgInst = MCList.create(MST_MFG_INST_R.class);
		
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 製造指図 */
		MCIndexKey _idxCacheMfgInst = null;
		/** 発注明細 */
		MCIndexKey _idxCachePoD = null;
		
		//----------------------------------
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 単価情報取得
			setUpriInfo();
		}
		
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			setPegNo(up0());
			// サービスコール
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), up0(), createMap_PurcUtil_Srch02_DtlR_Sprt01_DtlR());
			
			purcUtilSrch02.up0();
			purcUtilSrch02.exec();
			String[] destCols = {Sprt01_DtlR.$trd_cur_upri, Sprt01_DtlR.$trd_cur_proc_upri, Sprt01_DtlR.$trd_cur_onr_prov_upri, Sprt01_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(up0(), destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(up0());
		}
		
		protected Map_PurcUtil_Srch02_DtlR_Sprt01_DtlR<PurcUtil_Srch02_DtlR,Sprt01_DtlR> createMap_PurcUtil_Srch02_DtlR_Sprt01_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Sprt01_DtlR<PurcUtil_Srch02_DtlR, Sprt01_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Sprt01_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Sprt01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Sprt01_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Sprt01_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, Sprt01_DtlR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Sprt01_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Sprt01_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, Sprt01_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Sprt01_DtlR.$base_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Sprt01_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_inst_no, Sprt01_DtlR.$mfg_inst_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Sprt01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Sprt01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, Sprt01_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$purc_typ, Sprt01_DtlR.$purc_typ);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Sprt01_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Sprt01_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Sprt01_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Sprt01_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Sprt01_DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_cur_upri, Sprt01_DtlR.$trd_cur_upri);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, Sprt01_DtlR.$trd_cur_proc_upri);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, Sprt01_DtlR.$trd_cur_onr_prov_upri);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$interim_flg, Sprt01_DtlR.$interim_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.grp_no(dest.peg_no().toString());
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 為替レートを取得します<br>
	 */
	public class Sprt02 extends MSBDL_PurcDtlModReg_MC_A.Sprt02 {
		/** 為替レート */
		FXUCL_MCFuncCache<MCNumber> _xrateCache;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (_xrateCache == null) {
				_xrateCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_XCHNG$F_GET_PURC_XRATE_NE(value((String) in[0]), value((MCDate) in[1]));
				});
			}

			for (Sprt02_DtlR r : up0()) {
				MCNumber xrate = _xrateCache.get(r.trd_cur_cd(), r.xrate_base_dt());
				r.xrate(xrate);
				down0().add(r);
			}
		}
	}
	
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 税を取得します<br>
	 */
	public class Sprt03 extends MSBDL_PurcDtlModReg_MC_A.Sprt03 {
		//----------------------------------
		// Cache
		//----------------------------------
		protected MCList<Sprt03_DtlR> _purcTax = null;
		protected MCIndexKey _purcTaxIdx = null;
		FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
		
		//----------------------------------
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			if (_purcTax == null) {
				getPurcTax(up0());
			}
			for (Sprt03_DtlR r : up0()) {
				String taxCd = null;
				Sprt03_DtlR purcTaxR = _purcTax.getFirst(_purcTaxIdx, r.toArray(_purcTaxIdx.getKeys()));
				if (!isNull(purcTaxR)) {
					taxCd = purcTaxR.tax_cd();
				}
				r.tax_cd(taxCd);
			}
			if (_taxCache == null) {
				initTaxCache(up0());
			}
			
			for (Sprt03_DtlR r : up0()) {
				setTaxInfo(r);
				down0().add(r);
			}
		}
		protected void getPurcTax(MCList<Sprt03_DtlR> taxL) {
			String[] key = new String[]{
					Sprt03_DtlR.$itm_cd,
					Sprt03_DtlR.$itm_sub1,
					Sprt03_DtlR.$itm_sub2,
					Sprt03_DtlR.$itm_sub3,
					Sprt03_DtlR.$sppl_cd,
					Sprt03_DtlR.$tax_base_dt};
			_purcTax = MCList.create(Sprt03_DtlR.class);
			MCList<Sprt03_DtlR> grpL = taxL.groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					Sprt03_DtlR.$tax_cd, grpL, key);
			_purcTax.addAll(grpL);
			_purcTaxIdx = _purcTax.createIndex(key);
		}
		
		protected void setTaxInfo(Sprt03_DtlR r) {
			if (isNull(r.tax_cd())) {
				return ;
			}
			MAM_TAX_R taxR = _taxCache.getCache(r.tax_cd());
			r.tax_nm(taxR.tax_nm());
			r.tax_typ(taxR.tax_typ());
			r.inc_tax_flg(taxR.inc_tax_flg());
			r.tax_rate(taxR.tax_rate());
		}
		
		protected void initTaxCache(MCList<Sprt03_DtlR> taxL) {
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.tax_cd, t.tax_nm, t.tax_typ, t.inc_tax_flg, t.tax_rate);
			_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, taxL, MST_SLS_ACT_D_R.$tax_cd);
		}
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入値引情報の登録をする前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBDL_PurcDtlModReg_MC_A.Chk01 {
		//----------------------------
		// Cache
		//----------------------------
		/** 仕入実績ヘッダ */
		protected MCList<MST_PURC_ACT_R> _cachePurcAct = MCList.create(MST_PURC_ACT_R.class);
		/** 仕入実績明細 */
		protected MCList<MST_PURC_ACT_D_R> _cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
		/** 品目 */
		protected MCList<MAM_ITM_R> _cacheItm = MCList.create(MAM_ITM_R.class);
		/** 通貨 */
		protected MCList<MAM_CUR_R> _cacheCur = MCList.create(MAM_CUR_R.class);
		/** 業務理由 */
		protected MCList<MAM_BIZ_RSN_R> _cacheBizRsn = MCList.create(MAM_BIZ_RSN_R.class);
		/** 製造指図 */
		protected MCList<MST_MFG_INST_R> _cacheMfgInst = MCList.create(MST_MFG_INST_R.class);
		/** 仕入返品実績ヘッダ */
		protected MCList<MST_PURC_RET_ACT_R> _cachePurcRet = MCList.create(MST_PURC_RET_ACT_R.class);
		//----------------------------
		// IndexKey
		//----------------------------
		/** 仕入実績ヘッダ */
		protected MCIndexKey _idxCachePurcAct = null;
		/** 仕入実績明細 */
		protected MCIndexKey _idxCachePurcActD = null;
		/** 品目 */
		protected MCIndexKey _idxCacheItm = null;
		/** 通貨 */
		protected MCIndexKey _idxCacheCur = null;
		/** 業務理由 */
		protected MCIndexKey _idxCacheBizRsn = null;
		/** 製造指図 */
		protected MCIndexKey _idxCacheMfgInst = null;
		/** 仕入返品実績ヘッダ */
		protected MCIndexKey _idxCachePurcRet = null;
		
		//----------------------------
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			// エラー行のある伝票は中断する
			chkSameGrpErr(up0());
			
			MCList<Chk01_DtlR> list =getChkList(up0());
			// 後続処理のエラーチェック
			callPurcActChk01(getChkList(up0()));
			
			copyErrFlg(list, up0());
			// エラー行のある伝票は中断する
			chkSameGrpErr(list);
			setErrToRtnStsTyp();
			
			// 下り電文設定
			setDown();
		}
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			for (Chk01_DtlR r : up0()) {
				msgL.addAll(check(r, Chk01_DtlR.$purc_act_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, Chk01_DtlR.$purc_act_d_no, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up0());
			// 補完処理
			msgL.addAll(completion());
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(thisCheck());
			return msgL;
		}
		
		protected void chkSameGrpErr(MCList<Chk01_DtlR> list) {
			expandErr(new String[] {Chk01_DtlR.$purc_act_no}, list.subList(r -> isNull(r.rcpt_iv_mng_no())));
			expandErr(new String[] {Chk01_DtlR.$rcpt_iv_mng_no}, list.subList(r -> !isNull(r.rcpt_iv_mng_no())));
		}
		
		protected MCList<Chk01_DtlR>[] expandErr(String[] grp, MCList<Chk01_DtlR> l) {
			if (grp == null || grp.length <= 0 || l == null) {
				return null;
			}
			
			MCMessageList sameGrpErrMsgL = new MCMessageList();
			MCList<Chk01_DtlR>[] gls = l.groupList(grp);
			for (MCList<Chk01_DtlR> gl : gls) {
				MCMessageList msgL = MCMessagePool.getMessageList();
				
				Map<String, Object> errInfoMap = createErrInfoMap(gl, msgL);
				String purcActDNoStr = (String) errInfoMap.get("purcActDNoStr");
				boolean hasErrInUpL = (Boolean) errInfoMap.get("hasErrInUpL");
				
				if (hasErr(purcActDNoStr, hasErrInUpL)) {
					MCList<Chk01_DtlR> upL = gl.subList(row -> !row.isStatusNone());
					for (Chk01_DtlR r : gl) {
						addSameGrpErrMsg(sameGrpErrMsgL, r, msgL, purcActDNoStr, hasErrInUpL);
						
						if (r.err_flg()) {
							setMsgLFocus(msgL, r, upL.get(0));
						}
						else {
							// 同一グループ内で1つでもエラーがある場合、他明細もエラーに設定
							setErrFlg(r);
						}
					}
				}
			}
			sortMsgL(sameGrpErrMsgL);
			
			return gls;
		}
		
		protected Map<String, Object> createErrInfoMap(MCList<Chk01_DtlR> gl, MCMessageList msgL) {
			Map<String, Object> result = new HashMap<>();
			String purcActDNoStr = "";
			boolean hasErrInUpL = false;
			
			for (Chk01_DtlR r : gl) {
				if (r.err_flg()) {
					if (!isUpR(r)) {
						// 仕入実績登録サービスで一部明細がエラーになった場合、仕入実績ヘッダ単位でエラーフラグがオンになるため、エラーメッセージの有無で判定
						for (MCMessage msg : msgL) {
							if (isSame(msg.getCauseRow().getParamRowIndex(), r.getParamRowIndex())) {
								if (purcActDNoStr.isEmpty()) {
									purcActDNoStr = r.purc_act_d_no();
								}
								else {
									purcActDNoStr = purcActDNoStr + "," + r.purc_act_d_no();
								}
							}
						}
					}
					else {
						hasErrInUpL = true;
					}
				}
			}
			
			result.put("purcActDNoStr", purcActDNoStr);
			result.put("hasErrInUpL", hasErrInUpL);
			return result;
		}
		
		protected void addSameGrpErrMsg(MCMessageList sameGrpErrMsgL, Chk01_DtlR r,
				MCMessageList msgL, String purcActDNoStr, boolean hasErrInUpL) {
			if (isUpR(r)) {
				if (purcActDNoStr.isEmpty()) {
					if (hasErrInUpL && hasNoErr(r, msgL)) {
						sameGrpErrMsgL.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
					}
				}
				else {
					sameGrpErrMsgL.add(new MCMessage(r, null, MSBDL0616,
							r.purc_act_d_no(), purcActDNoStr, toDispGUIIndex(r)));
				}
			}
		}
		
		protected void setMsgLFocus(MCMessageList msgL, Chk01_DtlR r, Chk01_DtlR focusR) {
			// 画面で選択していない明細のエラーメッセージは、画面で選択している同一グループの先頭にフォーカスするようメッセージを再設定
			MCMessageList addMsgL = new MCMessageList();
			for (MCMessage msg : msgL) {
				if (isSame(msg.getCauseRow().getParamRowIndex(), r.getParamRowIndex())) {
					if (!isUpR(r)) {
						msg.setCauseRow(focusR, msg.getCauseColumn());
					}
				}
				addMsgL.add(msg);
			}
			if (!addMsgL.isEmpty()) {
				MCMessagePool.clear();
				MCMessagePool.addAll(addMsgL);
			}
		}
		
		protected void setErrFlg(Chk01_DtlR r) {
			r.err_flg(true);
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
		
		protected void sortMsgL(MCMessageList sameGrpErrMsgL) {
			if (sameGrpErrMsgL.isEmpty()) {
				return;
			}
			
			// MSBDL0616のメッセージを先頭に移動
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(sameGrpErrMsgL);
			MCMessagePool.addAll(msgL);
		}
		
		protected boolean hasErr(String purcActDNoStr, boolean hasErrInUpL) {
			if (!purcActDNoStr.isEmpty() || hasErrInUpL) {
				return true;
			}
			return false;
		}
		
		protected boolean hasNoErr(Chk01_DtlR r, MCMessageList msgL) {
			if (!r.err_flg() || (r.err_flg() && !hasErrMsg(msgL, r))) {
				return true;
			}
			return false;
		}
		
		protected boolean hasErrMsg(MCMessageList errMsgL, Chk01_DtlR r) {
			if (errMsgL.isEmpty()) {
				return false;
			}
			
			for (MCMessage msg : errMsgL) {
				if (!isSame(msg.getID(), MSBDL0616)) {
					if (isSame(msg.getCauseRow().getParamRowIndex(), r.getParamRowIndex())) {
						return true;
					}
				}
			}
			return false;
		}
		
		/**
		 * 仕入実績登録ＳＶチェック処理（兼、画面から上ってきていない明細・受払行の補完）をコールします
		 */
		protected void callPurcActChk01(MCList<Chk01_DtlR> list) {
			MSBDL_PurcActRegService.Purc_Chk01 ope = MSBDL_PurcActRegService.crtPurc_Chk01();
			// 「仕入明細訂正登録からの呼び出しである」と設定する。
			ope.up0().dtl_upd_flg(true);
			
			// 無償ＦＬＧオンまたは検証不良の明細の訂正は認めていないため、仮に上りに含まれていても除外する
			MCList<Chk01_DtlR> subL = list.subList(new MCRowMatcher<Chk01_DtlR>() {
				public boolean match (Chk01_DtlR m) {
					MST_PURC_ACT_D_R purcActDR = _cachePurcActD.getFirst(_idxCachePurcActD, m.purc_act_d_no());
					if (purcActDR.ncv_flg() || purcActDR.accpt_dfct_flg()) {
						return false;
					}
					else {
						return true;
					}
				}
			});
			
			addAll(ope.up1(), subL, createMap_Purc_Chk01_DtlR_Chk01_DtlR());
			if (ope.up1().size() > 0) {
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			// 仕入実績ヘッダ
			createCachePurcAct();
			// 仕入実績明細
			createCachePurcActD();
			// 品目
			createCacheItm();
			// 通貨
			createCacheCur();
			// 業務理由
			createCacheBizRsn();
			// 製造指図
			createCacheMfgInst();
			// 仕入返品実績
			createCachePurcRet();
		}
		/**
		 * キャッシュ作成（仕入実績ヘッダ）
		 */
		protected void createCachePurcAct() {
			_cachePurcAct = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder cachePurcAct_bldr = MCQueryApiBuilder.create(t);
			cachePurcAct_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
			cachePurcAct_bldr.addWhereWithAnd(t.purc_act_seq.eq(bind("purc_act_seq")));
			cachePurcAct_bldr.setOrderByAsc(cachePurcAct_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MSBDL0190_MST_PURC_ACT_S01", _cachePurcAct, cachePurcAct_bldr, up0());
			_idxCachePurcAct = _cachePurcAct.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
		}
		/**
		 * キャッシュ作成（仕入実績明細）
		 */
		protected void createCachePurcActD() {
			_cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder cachePurcActD_bldr = MCQueryApiBuilder.create(t);
			cachePurcActD_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
			cachePurcActD_bldr.addWhereWithAnd(t.purc_act_seq.eq(bind("purc_act_seq")));
			dbSelect("MSBDL0190_MST_PURC_ACT_D_S01", _cachePurcActD, cachePurcActD_bldr, _cachePurcAct);
			_idxCachePurcActD = _cachePurcActD.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
		}
		/**
		 * キャッシュ作成（品目）
		 */
		protected void createCacheItm() {
			_cacheItm = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder cacheItm_bldr = MCQueryApiBuilder.create(t);
			cacheItm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItm_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItm_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItm_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBDL0190_MAM_ITM_S01", _cacheItm, cacheItm_bldr, _cachePurcActD);
			_idxCacheItm = _cacheItm.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		/**
		 * キャッシュ作成（通貨）
		 */
		protected void createCacheCur() {
			_cacheCur = MCList.create(MAM_CUR_R.class);
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder cacheCur_bldr = MCQueryApiBuilder.create(t);
			cacheCur_bldr.setWhere(t.cur_cd.eq(bind("trd_cur_cd")));
			dbSelect("MSBDL0190_MAM_CUR_S01", _cacheCur, cacheCur_bldr, _cachePurcAct);
			_idxCacheCur = _cacheCur.createIndex(MAM_CUR_R.$cur_cd);
		}
		/**
		 * キャッシュ作成（業務理由）
		 */
		protected void createCacheBizRsn() {
			_cacheBizRsn = MCList.create(MAM_BIZ_RSN_R.class);
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder cacheBizRsn_bldr = MCQueryApiBuilder.create(t);
			cacheBizRsn_bldr.setWhere(t.biz_rsn_cd.eq(bind("rsn_cd")));
			dbSelect("MSBDL0190_MAM_BIZ_RSN_S01", _cacheBizRsn, cacheBizRsn_bldr, up0());
			_idxCacheBizRsn = _cacheBizRsn.createIndex(MAM_BIZ_RSN_R.$biz_rsn_cd);
		}
		/**
		 * キャッシュ作成（製造指図）
		 * @param bindL
		 * @return
		 */
		protected void createCacheMfgInst() {
			_cacheMfgInst = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder cacheMfgInst_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			cacheMfgInst_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			cacheMfgInst_bldr.addSelect(m1.asst_dpt_cd);
			cacheMfgInst_bldr.addInnerJoin(t2, bracket( t2.itm_mfg_inst_no.eq(t.itm_mfg_inst_no)));
			cacheMfgInst_bldr.addInnerJoin(m1, bracket( m1.loc_cd.eq(t2.mfg_loc_cd)));
			dbSelect("MSBDL0190_MST_MFG_INST_S01", _cacheMfgInst, cacheMfgInst_bldr, _cachePurcActD);
			_idxCacheMfgInst = _cacheMfgInst.createIndex(MST_MFG_INST_R.$mfg_inst_no);
		}
		/**
		 * キャッシュ作成(仕入返品実績ヘッダ)
		 */
		protected void createCachePurcRet() {
			_cachePurcRet = MCList.create(MST_PURC_RET_ACT_R.class);
			MST_PURC_RET_ACT_R t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder cachePurcRet_bldr = MCQueryApiBuilder.create(t);
			cachePurcRet_bldr.setWhere(t.purc_ret_act_no.eq(bind("purc_ret_act_no")));
			cachePurcRet_bldr.setOrderByAsc(cachePurcRet_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MSBDL0190_MST_PURC_RET_ACT_S01", _cachePurcRet, cachePurcRet_bldr, up0());
			_idxCachePurcRet = _cachePurcRet.createIndex(MST_PURC_RET_ACT_R.$purc_ret_act_no);
		}
		/**
		 * 補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(completionPurcAct());
			msgL.addAll(completionPurcActD());
			msgL.addAll(completionPurcRet());
			msgL.addAll(completionOther());
			return msgL;
		}
		
		/**
		 * 補完処理（仕入実績ヘッダ）
		 * @return
		 */
		protected MCMessageList completionPurcAct() {
			MCMessageList msgL = new MCMessageList();
			// 仕入締月
			MCDate purcClYm = MSUCL_ClUtil.getPurcClYm();
			for (Chk01_DtlR r : up0()) {
				MST_PURC_ACT_R purcActR = _cachePurcAct.getFirst(_idxCachePurcAct, r.purc_act_no(), r.purc_act_seq());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$purc_upd_cntr, purcActR));
				r.purc_act_seq(purcActR.purc_act_seq());
				r.can_ac_dt(r.ac_dt());
				r.rcpt_iv_mng_no(purcActR.rcpt_iv_mng_no());
				r.rcpt_iv_no(purcActR.rcpt_iv_no());
				r.rcpt_iv_rev(purcActR.rcpt_iv_rev());
				if (isNull(purcClYm) || getAcYm(purcActR.ac_dt()).gt(purcClYm)) {
					// 計上日を直せるのは締済行のみ
					if (!isSame(r.ac_dt(), purcActR.ac_dt())) {
						msgL.add(new MCMessage(r, null, MSBDL0308, toYMDString(purcActR.ac_dt()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		/**
		 * 補完処理（仕入実績明細）
		 * @return
		 */
		protected MCMessageList completionPurcActD() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : up0()) {
				MST_PURC_ACT_D_R purcActDR = _cachePurcActD.getFirst(_idxCachePurcActD, r.purc_act_d_no(), r.purc_act_d_seq());
				r.purc_act_d_seq(purcActDR.purc_act_d_seq());
				r.rcpt_iv_d_no(purcActDR.rcpt_iv_d_no());
				r.upri_not_tgt_flg(purcActDR.upri_not_tgt_flg());
				if (!isNull(r.bd_dpt_cd())) {
					MST_PURC_ACT_R purcActR = _cachePurcAct.getFirst(_idxCachePurcAct, r.purc_act_no(), r.purc_act_seq());
					r.bd_bp_cd(purcActR.sppl_cd());
				}
			}
			return msgL;
		}
		
		/**
		 * 補完処理（仕入返品実績ヘッダ）
		 * @return メッセージリスト
		 */
		protected MCMessageList completionPurcRet() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : up0()) {
				MST_PURC_RET_ACT_R purcRetR = _cachePurcRet.getFirst(_idxCachePurcRet, r.purc_ret_act_no());
				if (!isNull(purcRetR)) {
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$purc_ret_upd_cntr, purcRetR));
					// 仕入返品実績改訂番号 + 1を補完
					if (purcRetR.purc_ret_print_flg()) {
						r.purc_ret_act_rev(purcRetR.purc_ret_act_rev().add(MCNumber.ONE));
					}
					else {
						r.purc_ret_act_rev(purcRetR.purc_ret_act_rev());
					}
					// 返品票発行済の仕入返品実績に対してのみ、返品票を発行する
					r.purc_ret_print_tgt_flg(purcRetR.purc_ret_print_flg());
				}
			}
			return msgL;
		}
		/**
		 * 補完処理（その他）
		 * @return
		 */
		protected MCMessageList completionOther() {
			MCMessageList msgL = new MCMessageList();
			// 金額チェック用一時カラム
			up0().addNumberColumn(MAM_CUR_R.$upri_dec_place);
			up0().addNumberColumn(MAM_CUR_R.$amt_dec_place);
			up0().addNumberColumn("ptax_cur_amt_dec_place");
			
			for (Chk01_DtlR r : up0()) {
				// 更新前情報
				MST_PURC_ACT_D_R purcActDR = _cachePurcActD.getFirst(_idxCachePurcActD, r.purc_act_d_no(), r.purc_act_d_seq());
				MST_PURC_ACT_R purcActR = _cachePurcAct.getFirst(_idxCachePurcAct, purcActDR.purc_act_no(), purcActDR.purc_act_seq());
				// 加工単価・金額、有償支給単価・金額は外注時のみ入力可能
				if (!isOutSrc(purcActDR.purc_typ())) {
					r.trd_cur_proc_upri(null);
					r.trd_cur_proc_amt(null);
					r.trd_cur_onr_prov_upri(null);
					r.trd_cur_onr_prov_amt(null);
				}
				else {
					if (isNull(r.trd_cur_proc_upri())) {
						r.trd_cur_proc_upri(MCNumber.ZERO);
						r.trd_cur_proc_amt(MCNumber.ZERO);
						r.base_cur_proc_upri(MCNumber.ZERO);
						r.base_cur_proc_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							r.ptax_cur_proc_upri(MCNumber.ZERO);
							r.ptax_cur_proc_amt(MCNumber.ZERO);
						}
					}
					if (isNull(r.trd_cur_tax_amt())) {
						r.trd_cur_tax_amt(MCNumber.ZERO);
						r.base_cur_tax_amt(MCNumber.ZERO);
						if (!isNull(r.ptax_xrate())) {
							r.ptax_cur_tax_amt(MCNumber.ZERO);
						}
					}
				}
				
				// 後続の金額チェックのため、一時カラムに通貨情報を取得
				MAM_CUR_R trdCurR = _cacheCur.getFirst(_idxCacheCur, purcActR.trd_cur_cd());
				r.setNumberNE(MAM_CUR_R.$upri_dec_place, trdCurR.upri_dec_place());
				r.setNumberNE(MAM_CUR_R.$amt_dec_place, trdCurR.amt_dec_place());
				r.setNumberNE("ptax_cur_amt_dec_place", getPtaxCur().amt_dec_place());
			}
			return msgL;
		}
		
		/**
		 * 本ＳＶチェック処理
		 * @return
		 */
		protected MCMessageList thisCheck() {
			// 返却メッセージリスト
			MCMessageList msgL = new MCMessageList();
			
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(up0(), Chk01_DtlR.$purc_dpt_cd));
			msgL.addAll(mstExistChk());
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			for (Chk01_DtlR r : notErrL) {
				//　訂正前の実績を取得
				MST_PURC_ACT_D_R purcActDR = _cachePurcActD.getFirst(_idxCachePurcActD, r.purc_act_d_no());
				MST_PURC_ACT_R purcActR = _cachePurcAct.getFirst(_idxCachePurcAct, purcActDR.purc_act_no());
				MAM_ITM_R itmR = _cacheItm.getFirst(_idxCacheItm, purcActDR.itm_cd(), purcActDR.itm_sub1(), purcActDR.itm_sub2(), purcActDR.itm_sub3());
				
				// 訂正前DACチェック
				if (!isSame(r.purc_dpt_cd(), purcActR.purc_dpt_cd())) {
					r.old_purc_dpt_cd(purcActR.purc_dpt_cd());
					msgL.addAll(checkWritableDptCdDac(r, Chk01_DtlR.$old_purc_dpt_cd));
				}
				// 金額チェック（取引通貨単価）
				msgL.addAll(checkDecPlace(r, MAM_CUR_R.$upri_dec_place, Chk01_DtlR.$trd_cur_upri));
				// 金額チェック（取引通貨金額）
				msgL.addAll(checkDecPlace(r, MAM_CUR_R.$amt_dec_place, Chk01_DtlR.$trd_cur_amt));
				// 金額チェック（納税通貨税額）
				msgL.addAll(checkDecPlace(r, "ptax_cur_amt_dec_place", Chk01_DtlR.$ptax_cur_tax_amt));
				if (!isNull(r.trd_cur_dscnt_amt())) {
					// 値引理由の必須チェック
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
					// 単価「0」指定で、値引額が入力されていないかチェック
					msgL.addAll(checkDscntAmt(r, Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_dscnt_amt));					
				}
				
				//---------------------------------
				// 条件付チェック
				//---------------------------------
				if (isPurcXpns(purcActR.trd_ptn_typ(), itmR.asset_mng_typ())) {
					if (isNull(r.bd_dpt_cd())) {
						// 経費購買の場合負担部門は必須
						msgL.addAll(check(r, Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
					}
					if (isNull(r.rsn_cd())) {
						// 経費購買の場合理由は必須
						msgL.addAll(check(r, Chk01_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
					}
				}
				
				if (!isNull(r.trd_cur_dscnt_amt()) && isNull(r.dscnt_rsn_cd())) {
					// 値引時は値引額と値引理由が必須(値引理由チェック)
					msgL.addAll(check(r, Chk01_DtlR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
				}
				else if (isNull(r.trd_cur_dscnt_amt()) && !isNull(r.dscnt_rsn_cd())) {
					// 値引時は値引額と値引理由が必須(値引額チェック)
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(r.rsn_cd())) {
					MAM_BIZ_RSN_R bizRsnR = _cacheBizRsn.getFirst(_idxCacheBizRsn, r.rsn_cd());
					if (isPurc(purcActR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_VMI(purcActR.trd_ptn_typ())) {
						if (isPurcXpns(purcActR.trd_ptn_typ(), itmR.asset_mng_typ())) {
							// 資産管理しない品目は経費購買の理由が必要
							if (!bizRsnR.xpns_purc_flg()) {
								msgL.add(new MCMessage(r, null, MSBDL0151, toDispItm(itmR.itm_cd(), itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3()),
										r.rsn_cd(), toDispGUIIndex(r)));
							}
							// 資産管理する品目は経費購買理由を設定できない
							if (MAC_ASSET_MNG_TYP.isMNG(itmR.asset_mng_typ())) {
								msgL.add(new MCMessage(r, null, MSBDL0150, toDispItm(itmR.itm_cd(), itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3()),
										r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
					}
					else if (isPurcRtn(purcActR.trd_ptn_typ())) {
						if (isPurcXpns(purcActR.trd_ptn_typ(), itmR.asset_mng_typ())) {
							// 資産管理しない品目は経費購買の理由が必要
							if (!bizRsnR.xpns_purc_flg()) {
								msgL.add(new MCMessage(r, null, MSBDL0151, toDispItm(itmR.itm_cd(), itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3()),
										r.rsn_cd(), toDispGUIIndex(r)));
							}
							// 資産管理する品目は経費購買理由を設定できない
							if (MAC_ASSET_MNG_TYP.isMNG(itmR.asset_mng_typ())) {
								msgL.add(new MCMessage(r, null, MSBDL0150, toDispItm(itmR.itm_cd(), itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3()),
										r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
					}
				}
				if (isOutSrc(purcActDR.purc_typ())) {
					if (!isNull(r.bd_dpt_cd()) && !isNull(purcActDR.mfg_inst_no())) {
						MST_MFG_INST_R mfgInstR = _cacheMfgInst.getFirst(_idxCacheMfgInst, purcActDR.mfg_inst_no());
						// 製造指図が指定されている場合は、負担部門の一致を確認
						if (!isSame(r.bd_dpt_cd(), mfgInstR.getStringNE("ASST_DPT_CD"))) {
							//　部門不一致
							msgL.add(new MCMessage(r, null , MSBDL0108, r.bd_dpt_cd(), mfgInstR.getStringNE("ASST_DPT_CD"), purcActDR.mfg_inst_no(), toDispGUIIndex(r)));
						}
					}
				}
				if(!isPurcDscnt(purcActR.trd_ptn_typ()) && !MAC_PURC_TYP.isPURC_ITM(purcActDR.purc_typ())) {
					if(!isSame(purcActDR.trd_cur_upri(), r.trd_cur_upri())) {
						MCNumber newUpri = nvl(r.trd_cur_proc_upri(), MCNumber.ZERO).add(nvl(r.trd_cur_onr_prov_upri(), MCNumber.ZERO));
						if(!isSame(r.trd_cur_upri(), newUpri)) {
							// 単価不一致
							msgL.add(new MCMessage(r, null , MSBDL0501, newUpri, r.trd_cur_upri(), toDispGUIIndex(r)));
						}
					}
				}
			}
			
			msgL.addAll(existBdCheck(notErrL));
			
			return msgL;
		}
		
		/**
		 * マスタ存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList mstExistChk() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(existItmCheck(up0()));
			return msgL;
		}
		/**
		 * 品目存在チェック
		 * @param dtlL 明細上り電文リスト
		 * @return メッセージリスト
		 */
		protected MCMessageList existItmCheck(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_DtlR r : dtlL) {
				MST_PURC_ACT_D_R purcActDR = _cachePurcActD.getFirst(_idxCachePurcActD, r.purc_act_d_no());
				MAM_ITM_R itmR = _cacheItm.getFirst(_idxCacheItm, purcActDR.itm_cd(), purcActDR.itm_sub1(), purcActDR.itm_sub2(), purcActDR.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					msgL.add(new MCMessage(r, null, MAUAL0189
							, toDispItm(purcActDR.itm_cd(), purcActDR.itm_sub1(), purcActDR.itm_sub2(), purcActDR.itm_sub3())
							, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 * @return メッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
					
			for (Chk01_DtlR dr : dtlL) {
				if (dr.getStatus() == MCRow.DELETE) {
					continue;
				}
				if (!isNull(dr.bd_po_no())) {
					if (!existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					if (!existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
				
			}		
			callLotServiceChkBdItm(bdLotChkTgtL);
			
			return msgL;
		}
		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 */
		protected void callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}		
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}
		
		/**
		 * 経費購買（経費返品）であるか否かを判定します
		 * @param r
		 * @return
		 */
		protected boolean isPurcXpns (String trdPtnTyp, String assetMngTyp) {
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
				return true;
			}
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(assetMngTyp)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 外注品であるか否かを判定します
		 * @return
		 */
		protected boolean isOutSrc (String purcId) {
			if (MAC_PURC_TYP.isOUTSRC_ITM_FFR(purcId)
					|| MAC_PURC_TYP.isOUTSRC_ITM_ONR_SS(purcId)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected Map_Purc_Chk01_DtlR_Chk01_DtlR<Purc_Chk01_DtlR,Chk01_DtlR> createMap_Purc_Chk01_DtlR_Chk01_DtlR() {
			return new Map_Purc_Chk01_DtlR_Chk01_DtlR<Purc_Chk01_DtlR, Chk01_DtlR>();
		}

		public class Map_Purc_Chk01_DtlR_Chk01_DtlR<D extends Purc_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_no, Chk01_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_seq, Chk01_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_act_d_seq, Chk01_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_ret_act_no, Chk01_DtlR.$purc_ret_act_no);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_ret_act_rev, Chk01_DtlR.$purc_ret_act_rev);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_mng_no, Chk01_DtlR.$rcpt_iv_mng_no);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_no, Chk01_DtlR.$rcpt_iv_no);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_rev, Chk01_DtlR.$rcpt_iv_rev);
				addColumnPathMap(Purc_Chk01_DtlR.$rcpt_iv_d_no, Chk01_DtlR.$rcpt_iv_d_no);
				
				addColumnPathMap(Purc_Chk01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$can_ac_dt, Chk01_DtlR.$can_ac_dt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$xrate, Chk01_DtlR.$xrate);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_dt, Chk01_DtlR.$ptax_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_xrate, Chk01_DtlR.$ptax_xrate);
				
				addColumnPathMap(Purc_Chk01_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
				
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_tax_amt, Chk01_DtlR.$base_cur_tax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_tax_amt, Chk01_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_upri, Chk01_DtlR.$base_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_amt, Chk01_DtlR.$base_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_dscnt_amt, Chk01_DtlR.$base_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_proc_upri, Chk01_DtlR.$base_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_proc_amt, Chk01_DtlR.$base_cur_proc_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_onr_prov_upri, Chk01_DtlR.$base_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$base_cur_onr_prov_amt, Chk01_DtlR.$base_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_upri, Chk01_DtlR.$ptax_cur_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_amt, Chk01_DtlR.$ptax_cur_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_dscnt_amt, Chk01_DtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_proc_upri, Chk01_DtlR.$ptax_cur_proc_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_proc_amt, Chk01_DtlR.$ptax_cur_proc_amt);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_onr_prov_upri, Chk01_DtlR.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk01_DtlR.$ptax_cur_onr_prov_amt, Chk01_DtlR.$ptax_cur_onr_prov_amt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
				
				addColumnPathMap(Purc_Chk01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
				addColumnPathMap(Purc_Chk01_DtlR.$pay_basis_dt, Chk01_DtlR.$pay_basis_dt);
				addColumnPathMap(Purc_Chk01_DtlR.$pay_schd_dt, Chk01_DtlR.$pay_schd_dt);
				
				addColumnPathMap(Purc_Chk01_DtlR.$purc_usr_cd, Chk01_DtlR.$purc_usr_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$purc_dpt_cd, Chk01_DtlR.$purc_dpt_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
				
				addColumnPathMap(Purc_Chk01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
				
				addColumnPathMap(Purc_Chk01_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
				
				addColumnPathMap(Purc_Chk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_wg_cd, Chk01_DtlR.$purc_dpt_wg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
				addColumnPathMap(Purc_Chk01_DtlR.$bd_bp_cd, Chk01_DtlR.$bd_bp_cd);
				addColumnPathMap(Purc_Chk01_DtlR.$base_purc_ac_dt, Chk01_DtlR.$base_purc_ac_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.pa().purc_act_no(src.purc_act_no());
				dest.pa().purc_act_seq(src.purc_act_seq());
				dest.pa().sub_char1(src.purc_act_sub_char1());
				dest.pa().sub_char2(src.purc_act_sub_char2());
				dest.pa().sub_char3(src.purc_act_sub_char3());
				dest.pa().trd_rmrks(src.trd_rmrks());
				dest.pa().intr_rmrks(src.intr_rmrks());
				
				dest.pad().purc_act_no(src.purc_act_no());
				dest.pad().purc_act_seq(src.purc_act_seq());
				dest.pad().sub_char1(src.purc_act_d_sub_char1());
				dest.pad().sub_char2(src.purc_act_d_sub_char2());
				dest.pad().sub_char3(src.purc_act_d_sub_char3());
				dest.pad().trd_d_rmrks(src.trd_d_rmrks());
				dest.pad().intr_rmrks(src.intr_d_rmrks());
				
				dest.wtax_amt(getTaxAmt(src.trd_cur_amt(), src.wtax_rate(), src.getNumberNE(MAM_CUR_R.$amt_dec_place), getCo().wtax_rnd_typ()));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入値引情報を更新する。<br>
	 */
	public class Upd01 extends MSBDL_PurcDtlModReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			compDtl();
			// 紐付ＮＯ設定
			setPegNo(up0());
			// データ更新区分設定
			up0().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			// チェック処理コール
			callThisChk01();
			
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			// 仕入実績登録SVコール
			callPurcActUpd01(notErrL);
			// 仕入返品実績改訂番号の更新
			updPurcRetRev(notErrL);
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>) ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();

			MCList<Chk01_DtlR> ivTgt = list.createInstance();
			MCList<Chk01_DtlR> hdrTgt = list.createInstance();
			list.forEach(r -> {
				// インボイス管理NOがあれば、最優先でグループ化
				if (!isNull(r.rcpt_iv_mng_no())) {
					ivTgt.add(r);
				}
				// それ以外は仕入実績NO単位でグループ化
				else {
					hdrTgt.add(r);
				}

			});

			//受領I/V単位
			MCList<Chk01_DtlR>[] ivs = ivTgt.groupList(Chk01_DtlR.$rcpt_iv_mng_no);
			addBatchUnit(ret, ivs, max);

			//ヘッダ単位
			MCList<Chk01_DtlR>[] hdrs = hdrTgt.groupList(Chk01_DtlR.$purc_act_no);
			addBatchUnit(ret, hdrs, max);

			return ret;
		}

		/**
		* 実行単位のリストにグループ配列の要素を設定する。<p>
		* 1つ前の要素が追加されたことにより実行単位が最大値を超えた場合、次の要素は別の実行単位となる。
		* @param dest 実行単位のリスト
		* @param src グループ配列
		* @param max 最大値
		*/
		protected void addBatchUnit(List<MCList<Chk01_DtlR>> dest, MCList<Chk01_DtlR>[] src, int max) {

			if (src == null || src.length == 0) {
				return;
			}

			//retの最後のlistを取得
			MCList<Chk01_DtlR> unit;
			if (dest.isEmpty()) {
				unit = createChk01_DtlL();
				dest.add(unit);
			}
			else {
				unit = dest.get(dest.size() - 1);
			}

			//追加
			for (MCList<Chk01_DtlR> l : src) {
				if (unit.size() >= max) {
					unit = unit.createInstance();
					dest.add(unit);
				}
				unit.addAll(l);
			}

			//最後のlistが空の場合は削除
			if (unit.size() == 0) {
				dest.remove(unit);
			}
		}
		
		/**
		 * 処理区分設定
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		/**
		 * 例外時処理
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e,
				MCList<Chk01_DtlR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			MCList<Chk01_DtlR> upL = MCList.create(Chk01_DtlR.class);
			for (Chk01_DtlR r : up0()) {
				if (isUpR(r)) {
					upL.add(r);
				}
			}
			down0().setAll(upL);
		}
		
		/**
		 * 本ＳＶのチェック処理をコールします。
		 */
		protected void callThisChk01() {
			MSBDL_PurcDtlModReg.Chk01 ope = MSBDL_PurcDtlModReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().clear();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 仕入返品実績ヘッダ,明細,受払の改訂番号を更新します<br>
		 */
		protected void updPurcRetRev(MCList<Chk01_DtlR> list) {
			if (list.size() == 0) {
				return;
			}

			MCList<MST_PURC_RET_ACT_R> purcRetL = MCList.create(MST_PURC_RET_ACT_R.class);
			MST_PURC_RET_ACT_R t1 = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder purcRetL_bldr = MCQueryApiBuilder.create(t1);
			dbSelectKey("MSBDL0190_MST_PURC_RET_ACT_S02", purcRetL, purcRetL_bldr, list);
			
			MCList<MST_PURC_RET_ACT_D_R> purcRetDL = MCList.create(MST_PURC_RET_ACT_D_R.class);
			MST_PURC_RET_ACT_D_R t2 = MST_PURC_RET_ACT_D_R.create("T");
			MCQueryApiBuilder purcRetDL_bldr = MCQueryApiBuilder.create(t2);
			purcRetDL_bldr.setWhere(t2.purc_ret_act_no.eq(bind("purc_ret_act_no")));
			dbSelect("MSBDL0190_MST_PURC_RET_ACT_D_S01", purcRetDL, purcRetDL_bldr, purcRetL);
			
			MCList<MST_PURC_RET_ACT_IO_R> purcRetIoL = MCList.create(MST_PURC_RET_ACT_IO_R.class);
			MST_PURC_RET_ACT_IO_R t3 = MST_PURC_RET_ACT_IO_R.create("T");
			MCQueryApiBuilder purcRetIoL_bldr = MCQueryApiBuilder.create(t3);
			purcRetIoL_bldr.setWhere(t3.purc_ret_act_d_no.eq(bind("purc_ret_act_d_no")));
			dbSelect("MSBDL0190_MST_PURC_RET_ACT_IO_S01", purcRetIoL, purcRetIoL_bldr, purcRetDL);
						
			if (purcRetL.size() > 0) {
				MCIndexKey idxUp0 = list.createIndex(Chk01_DtlR.$purc_ret_act_no);
				MCIndexKey idx2Up0 = list.createIndex(Chk01_DtlR.$purc_ret_act_d_no);
				MCIndexKey idxPurcRetD = purcRetDL.createIndex(MST_PURC_RET_ACT_D_R.$purc_ret_act_no);
				MCIndexKey idxPurcRetIo = purcRetIoL.createIndex(MST_PURC_RET_ACT_IO_R.$purc_ret_act_d_no);
				
				for (MST_PURC_RET_ACT_R r : purcRetL) {
					Chk01_DtlR hdrRow = list.getFirst(idxUp0, r.purc_ret_act_no());
					r.purc_ret_act_rev(hdrRow.purc_ret_act_rev());
					// 仕入返品実績ヘッダの項目で変更されるもの
					r.purc_dpt_cd(hdrRow.purc_dpt_cd());
					r.purc_usr_cd(hdrRow.purc_usr_cd());
					r.ac_dt(hdrRow.ac_dt());
					r.wg_cd(hdrRow.purc_dpt_wg_cd());
					r.trd_rmrks (hdrRow.trd_rmrks ());
					r.intr_rmrks(hdrRow.intr_rmrks());
					r.sub_char1(hdrRow.purc_act_sub_char1());
					r.sub_char2(hdrRow.purc_act_sub_char2());
					r.sub_char3(hdrRow.purc_act_sub_char3());
					// 返品票発行対象の場合、仕入返品実績トランの発行済FLGはオフに更新する
					if (hdrRow.purc_ret_print_tgt_flg()) {
						r.purc_ret_print_flg(false);
					}
					
					for (MST_PURC_RET_ACT_D_R dtlR : purcRetDL.subList(idxPurcRetD, r.purc_ret_act_no())) {
						dtlR.purc_ret_act_rev(r.purc_ret_act_rev());						
						// 仕入返品実績明細の項目で変更されるもの
						Chk01_DtlR dtlRow = list.getFirst(idx2Up0, dtlR.purc_ret_act_d_no());
						// 更新された行のみ
						if (!isNull(dtlRow)) {
							dtlR.ret_rsn_cd(dtlRow.rsn_cd());
							dtlR.trd_d_rmrks(dtlRow.trd_d_rmrks());
							dtlR.intr_rmrks(dtlRow.intr_d_rmrks());
							dtlR.sub_char1(dtlRow.purc_act_d_sub_char1());
							dtlR.sub_char2(dtlRow.purc_act_d_sub_char2());
							dtlR.sub_char3(dtlRow.purc_act_d_sub_char3());
						}
						for (MST_PURC_RET_ACT_IO_R ioR : purcRetIoL.subList(idxPurcRetIo, dtlR.purc_ret_act_d_no())) {
							ioR.purc_ret_act_rev(r.purc_ret_act_rev());
						}
					}
					
				}
				
				// 改訂番号更新
				purcRetL_bldr.setSet(t1.purc_ret_print_flg, t1.purc_ret_act_rev, t1.ac_dt, t1.purc_dpt_cd, t1.purc_usr_cd, t1.wg_cd, t1.trd_rmrks, t1.intr_rmrks, t1.sub_char1, t1.sub_char2, t1.sub_char3);
				purcRetDL_bldr.setSet(t2.purc_ret_act_rev, t2.ret_rsn_cd, t2.trd_d_rmrks, t2.intr_rmrks, t2.sub_char1, t2.sub_char2, t2.sub_char3);
				purcRetIoL_bldr.setSet(t3.purc_ret_act_rev);
				
				dbUpdateKey("MSBDL0190_MST_PURC_RET_ACT_U01", purcRetL, purcRetL_bldr);
				dbUpdateKey("MSBDL0190_MST_PURC_RET_ACT_D_U01", purcRetDL, purcRetDL_bldr);
				dbUpdateKey("MSBDL0190_MST_PURC_RET_ACT_IO_U01", purcRetIoL, purcRetIoL_bldr);

				// 改訂履歴データ更新サービス呼出（仕入返品実績改訂履歴テーブル更新）
				callRevDataServiceIns01(purcRetL);

				// 仕入返品票発行
				callPurcPrntServicePrnt02(purcRetL);
			}
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 仕入返品実績改訂履歴テーブルを更新する。
		 * @param purcRetL
		 */
		protected void callRevDataServiceIns01(MCList<MST_PURC_RET_ACT_R> purcRetL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_PURC_RET_ACT_R r : purcRetL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.purc_ret_act_no());
				opeR.rev_no(r.purc_ret_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PURC_RET_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 仕入返品票を発行します
		 */
		protected void callPurcPrntServicePrnt02(MCList<MST_PURC_RET_ACT_R> dbcL) {
			
			if (dbcL.size() > 0) {
				
				MCIndexKey idx = up0().createIndex(Chk01_DtlR.$purc_ret_act_no);
				
				MCList<PurcPrnt_Prnt02_CndR> paramL = MCList.create(PurcPrnt_Prnt02_CndR.class);
				
				for (MST_PURC_RET_ACT_R r : dbcL) {
					
					Chk01_DtlR dtlRow = up0().getFirst(idx, r.purc_ret_act_no());
					if (dtlRow.purc_ret_print_tgt_flg()) {
						PurcPrnt_Prnt02_CndR paramRow = PurcPrnt_Prnt02_CndR.create();
						r.setStatus(mcframe.commonCore.container.MCRow.Status.MODIFY);
						copy(paramRow, r, createMap_PurcPrnt_Prnt02_CndR_MST_PURC_RET_ACT_R());
						paramL.add(paramRow);						
					}

				}
				
				if (paramL.size() > 0) {
					// 仕入返品発行SV
					MSBDL_PurcPrntService.PurcPrnt_Prnt02 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt02();
					ope.up0().addAll(paramL);
					ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
					ope.exec();
				}
				
			}
			
			
		}
		
		protected void compDtl() {
			MCList<Chk01_DtlR> dtlL = MCList.create(Chk01_DtlR.class);
			MCIndexKey idxPurcActNo = up0().createIndex(Chk01_DtlR.$purc_act_no);
			MCIndexKey idxPurcActDNo = up0().createIndex(Chk01_DtlR.$purc_act_d_no);
			MCIndexKey idxRcptIvMngNo = up0().createIndex(Chk01_DtlR.$rcpt_iv_mng_no);
			
			MCList<MST_PURC_ACT_D_R> purcActDL = setPurcActDL();
			
			int i = -1;
			for (MST_PURC_ACT_D_R purcActDR : purcActDL) {
				if (isNull(up0().getFirst(idxPurcActDNo, purcActDR.purc_act_d_no()))) {
					Chk01_DtlR dtlR = Chk01_DtlR.create();
					copy(dtlR, purcActDR, createMap_Chk01_DtlR_MST_PURC_ACT_D_R());
					
					Chk01_DtlR upR = Chk01_DtlR.create();
					if (!isNull(up0().getFirst(idxPurcActNo, purcActDR.purc_act_no()))) {
						upR = up0().getFirst(idxPurcActNo, purcActDR.purc_act_no());
						dtlR.purc_usr_cd(upR.purc_usr_cd());
						dtlR.purc_dpt_cd(upR.purc_dpt_cd());
					}
					else {
						upR = up0().getFirst(idxRcptIvMngNo, purcActDR.getStringNE("rcpt_iv_mng_no"));
					}
					dtlR.ac_dt(upR.ac_dt());
					dtlR.pay_basis_dt(upR.pay_basis_dt());
					dtlR.pay_schd_dt(upR.pay_schd_dt());
					dtlR.xrate(upR.xrate());
					dtlR.ptax_xrate(upR.ptax_xrate());
					dtlR.ptax_dt(upR.ptax_dt());
					dtlR.trd_rmrks(upR.trd_rmrks());
					dtlR.intr_rmrks(upR.intr_rmrks());
					dtlR.purc_act_sub_char1(upR.purc_act_sub_char1());
					dtlR.purc_act_sub_char2(upR.purc_act_sub_char2());
					dtlR.purc_act_sub_char3(upR.purc_act_sub_char3());
					dtlR.setParamRowIndex(i--);
					
					dtlL.add(dtlR);
				}
			}
			
			up0().addAll(dtlL);
		}
		
		protected MCList<MST_PURC_ACT_D_R> setPurcActDL() {
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			purcActDL.addAll(getPurcActD(up0().subList(r -> isNull(r.rcpt_iv_mng_no()))));
			purcActDL.addAll(getPurcActD(up0().subList(r -> !isNull(r.rcpt_iv_mng_no()))));
			return purcActDL;
		}
		
		protected MCList<MST_PURC_ACT_D_R> getPurcActD(MCList<Chk01_DtlR> up0L) {
			if (isNull(up0L)) {
				return null;
			}
			
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			purcActDL.addNumberColumn("purc_upd_cntr");
			purcActDL.addNumberColumn("purc_ret_upd_cntr");
			MST_PURC_ACT_D_R purcActDR = MST_PURC_ACT_D_R.create("PURCACTD");
			MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create("PURCACT");
			MST_PURC_RET_ACT_R purcRetActR = MST_PURC_RET_ACT_R.create("PURCRETACT");
			MCQueryApiBuilder purcActDBldr = MCQueryApiBuilder.create(purcActDR);
			
			purcActDBldr.addSelect(purcActR.purc_act_rev);
			purcActDBldr.addSelect(purcActR.purc_ret_act_no);
			purcActDBldr.addSelect(purcActR.rcpt_iv_mng_no);
			purcActDBldr.addSelect(purcActR.purc_dpt_cd);
			purcActDBldr.addSelect(purcActR.purc_usr_cd);
			purcActDBldr.addSelect(purcActR.upd_cntr.as("purc_upd_cntr"));
			purcActDBldr.addSelect(purcRetActR.upd_cntr.as("purc_ret_upd_cntr"));
			purcActDBldr.addInnerJoin(purcActR,
					bracket(purcActDR.purc_act_no.eq(purcActR.purc_act_no)
						.and(purcActDR.purc_act_seq.eq(purcActR.purc_act_seq))));
			purcActDBldr.addLeftOuterJoin(purcRetActR,
					bracket(purcActR.purc_ret_act_no.eq(purcRetActR.purc_ret_act_no)
						.and(purcActR.purc_ret_act_rev.eq(purcRetActR.purc_ret_act_rev))));
			purcActDBldr.addWhereWithAnd(purcActR.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			if (isNull(up0L.get(0).rcpt_iv_mng_no())) {
				purcActDBldr.addWhereWithAnd(purcActR.purc_act_no.eq(bind("purc_act_no")));
			}
			else {
				purcActDBldr.addWhereWithAnd(purcActR.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			}
			dbSelect("MSBDL0190_MST_PURC_ACT_D_S02", purcActDL, purcActDBldr, up0L);
			
			return purcActDL;
		}
		
		protected String[] getHdrCols() {
			String[] cols = new String[] {
					Chk01_DtlR.$ac_dt,
					Chk01_DtlR.$pay_basis_dt,
					Chk01_DtlR.$pay_schd_dt,
					Chk01_DtlR.$xrate,
					Chk01_DtlR.$ptax_xrate,
					Chk01_DtlR.$ptax_dt, 
					Chk01_DtlR.$trd_rmrks,
					Chk01_DtlR.$intr_rmrks,
					Chk01_DtlR.$purc_act_sub_char1,
					Chk01_DtlR.$purc_act_sub_char2,
					Chk01_DtlR.$purc_act_sub_char3};
			return cols;
		}
		
		protected Map_Chk01_DtlR_MST_PURC_ACT_D_R<Chk01_DtlR, MST_PURC_ACT_D_R> createMap_Chk01_DtlR_MST_PURC_ACT_D_R() {
			return new Map_Chk01_DtlR_MST_PURC_ACT_D_R<Chk01_DtlR, MST_PURC_ACT_D_R>();
		}
		
		public class Map_Chk01_DtlR_MST_PURC_ACT_D_R<D extends Chk01_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
				addColumnPathMap(Chk01_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
				addColumnPathMap(Chk01_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Chk01_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
				addColumnPathMap(Chk01_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
				addColumnPathMap(Chk01_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
				addColumnPathMap(Chk01_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
				addColumnPathMap(Chk01_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Chk01_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Chk01_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk01_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
				addColumnPathMap(Chk01_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
				addColumnPathMap(Chk01_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Chk01_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Chk01_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk01_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
				addColumnPathMap(Chk01_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Chk01_DtlR.$base_cur_amt, MST_PURC_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_amt, MST_PURC_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Chk01_DtlR.$base_cur_upri, MST_PURC_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Chk01_DtlR.$base_cur_dscnt_amt, MST_PURC_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Chk01_DtlR.$base_cur_proc_upri, MST_PURC_ACT_D_R.$base_cur_proc_upri);
				addColumnPathMap(Chk01_DtlR.$base_cur_proc_amt, MST_PURC_ACT_D_R.$base_cur_proc_amt);
				addColumnPathMap(Chk01_DtlR.$base_cur_onr_prov_upri, MST_PURC_ACT_D_R.$base_cur_onr_prov_upri);
				addColumnPathMap(Chk01_DtlR.$base_cur_onr_prov_amt, MST_PURC_ACT_D_R.$base_cur_onr_prov_amt);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_upri, MST_PURC_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_dscnt_amt, MST_PURC_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_proc_upri, MST_PURC_ACT_D_R.$ptax_cur_proc_upri);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_proc_amt, MST_PURC_ACT_D_R.$ptax_cur_proc_amt);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_onr_prov_upri, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_upri);
				addColumnPathMap(Chk01_DtlR.$ptax_cur_onr_prov_amt, MST_PURC_ACT_D_R.$ptax_cur_onr_prov_amt);
				addColumnPathMap(Chk01_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Chk01_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
				addColumnPathMap(Chk01_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
				addColumnPathMap(Chk01_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
				addColumnPathMap(Chk01_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Chk01_DtlR.$intr_d_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Chk01_DtlR.$purc_act_d_sub_char1, MST_PURC_ACT_D_R.$sub_char1);
				addColumnPathMap(Chk01_DtlR.$purc_act_d_sub_char2, MST_PURC_ACT_D_R.$sub_char2);
				addColumnPathMap(Chk01_DtlR.$purc_act_d_sub_char3, MST_PURC_ACT_D_R.$sub_char3);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Chk01_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(Chk01_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(Chk01_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(Chk01_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(Chk01_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
				addColumnPathMap(Chk01_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(Chk01_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
				addColumnPathMap(Chk01_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
				addColumnPathMap(Chk01_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
				addColumnPathMap(Chk01_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
				addColumnPathMap(Chk01_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(Chk01_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(Chk01_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(Chk01_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
				addColumnPathMap(Chk01_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
				addColumnPathMap(Chk01_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
				addColumnPathMap(Chk01_DtlR.$base_purc_ac_dt, MST_PURC_ACT_D_R.$base_purc_ac_dt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.purc_act_rev(src.getNumberNE("purc_act_rev"));
				dest.purc_ret_act_no(src.getStringNE("purc_ret_act_no"));
				dest.rcpt_iv_mng_no(src.getStringNE("rcpt_iv_mng_no"));
				dest.purc_upd_cntr(src.getNumberNE("purc_upd_cntr"));
				dest.purc_ret_upd_cntr(src.getNumberNE("purc_ret_upd_cntr"));
				dest.purc_dpt_cd(src.getStringNE("purc_dpt_cd"));
				dest.purc_usr_cd(src.getStringNE("purc_usr_cd"));
			}
		}
		
		/**
		 * RowMapper<br>
		 * 仕入返品実績ヘッダ(MST_PURC_RET_ACT_R) -> 購買帳票発行サービス.上り電文(PurcPrnt_Prnt02_CndR)<br>
		 */
		protected Map_PurcPrnt_Prnt02_CndR_MST_PURC_RET_ACT_R<PurcPrnt_Prnt02_CndR,MST_PURC_RET_ACT_R> createMap_PurcPrnt_Prnt02_CndR_MST_PURC_RET_ACT_R() {
			return new Map_PurcPrnt_Prnt02_CndR_MST_PURC_RET_ACT_R<PurcPrnt_Prnt02_CndR, MST_PURC_RET_ACT_R>();
		}

		public class Map_PurcPrnt_Prnt02_CndR_MST_PURC_RET_ACT_R<D extends PurcPrnt_Prnt02_CndR, S extends MST_PURC_RET_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_no, MST_PURC_RET_ACT_R.$purc_ret_act_no);
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_rev, MST_PURC_RET_ACT_R.$purc_ret_act_rev);
			}
			
		}
		
		/**
		 * 仕入実績登録ＳＶの更新処理をコールします
		 */
		protected void callPurcActUpd01(MCList<Chk01_DtlR> list) {
			if (list.size() == 0) {
				return;
			}
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService.crtPurc_Upd02();
			ope.up0().purc_dtl_flg(true);
			ope.up0().io_make_flg(true);
			ope.up0().amt_calc_flg(false);
			addAll(ope.up1(), list, createMap_Purc_Ins01_HdrR_Chk01_DtlR());
			addAll(ope.up2(), list, createMap_Purc_Ins01_DtlR_Chk01_DtlR());
			addAll(ope.up3(), list, createMap_Purc_Ins01_IoR_Chk01_DtlR());
			ope.exec();
		}
		/** ヘッダ */
		protected Map_Purc_Ins01_HdrR_Chk01_DtlR<Purc_Ins01_HdrR,Chk01_DtlR> createMap_Purc_Ins01_HdrR_Chk01_DtlR() {
			return new Map_Purc_Ins01_HdrR_Chk01_DtlR<Purc_Ins01_HdrR, Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_HdrR_Chk01_DtlR<D extends Purc_Ins01_HdrR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_HdrR.$peg_no, Chk01_DtlR.$peg_no);
			}
		}
		/** 明細 */
		protected Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR,Chk01_DtlR> createMap_Purc_Ins01_DtlR_Chk01_DtlR() {
			return new Map_Purc_Ins01_DtlR_Chk01_DtlR<Purc_Ins01_DtlR, Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_DtlR_Chk01_DtlR<D extends Purc_Ins01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			}
		}
		/** 受払 */
		protected Map_Purc_Ins01_IoR_Chk01_DtlR<Purc_Ins01_IoR,Chk01_DtlR> createMap_Purc_Ins01_IoR_Chk01_DtlR() {
			return new Map_Purc_Ins01_IoR_Chk01_DtlR<Purc_Ins01_IoR, Chk01_DtlR>();
		}
		public class Map_Purc_Ins01_IoR_Chk01_DtlR<D extends Purc_Ins01_IoR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Ins01_IoR.$peg_no, Chk01_DtlR.$peg_no);
			}
		}

	}
	/**
	 * 仕入伝票か否かを判定します
	 */
	protected boolean isPurc(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp)) {
			return true;
		}
		else {
			return false;	
		}
	}
	/**
	 * 仕入返品伝票か否かを判定します
	 */
	protected boolean isPurcRtn(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC_RTN(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trdPtnTyp)) {
			return true;
		}
		else {
			return false;	
		}
	}
	/**
	 * 仕入値引伝票か否かを判定します
	 */
	protected boolean isPurcDscnt(String trdPtnTyp) {
		if (MAC_TRD_PTN_TYP.isPURC_DSCNT(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XTRA(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp)) {
			return true;
		}
		else {
			return false;	
		}
	}
	
	protected boolean isUpR(Chk01_DtlR r) {
		if (r.getParamRowIndex() >= 0) {
			return true;
		}
		return false;
	}
	
	protected MCNumber getUpriDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
		if (!isNull(val) && !isNull(trdPtnTyp)) {
			return val.multiply(MAUCL_TrdUtil.getUpriDispPm(trdPtnTyp, dscntItmFlg));
		}
		return val;
	}
	protected MCNumber getAmtDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
		if (!isNull(val) && !isNull(trdPtnTyp)) {
			return val.multiply(MAUCL_TrdUtil.getAmtDispPm(trdPtnTyp, dscntItmFlg));
		}
		return val;
	}
	protected MCNumber getQtyDispPm(MCNumber val, String trdPtnTyp) {
		if (!isNull(val)) {
			return val.multiply(MAC_TRD_PTN_TYP.qty_disp_pm(trdPtnTyp));
		}
		return val;
	}
	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);
		}
	}
	
	protected void initDbcCache(MCRow upR, MCList<? extends MCConstRow> down) {
		initDbcCachePoD2(down);
		
		// 明細のみ
		if (isSame(upR.getStringNE("disp_unit"), "1")) {

			// 単価取得時の基準項目（発注明細）
			initDbcCachePoD(down);

			// 単価取得時の基準項目（仕入返品予定明細）
			initDbcCachePurcRetSchdD(down);
		}
		// ヘッダ以外
		if (!isSame(upR.getStringNE("disp_unit"), "2")) {

			initDbcCachePurcSchd(down);
			
			initDbcCacheItmLcl(down);
		}
	}
	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		
		setValuesDbc(MSBDL0190_Srch01_DtlR_J01(), upR, down);

		initDbcCache(upR, down);
		
		for (MCRow r : down) {
			if ( !(r instanceof Srch01_DtlR)) {
				continue;
			}
			Srch01_DtlR dtlR = (Srch01_DtlR) r;
			
			MST_PO_D_R podR = _cachePoD2.get(dtlR.po_d_no());
			
			dtlR.purc_upri_req_typ(podR.purc_upri_req_typ());
			dtlR.po_dt(podR.getDateNE("po_dt"));
			dtlR.dlv_rqst_dt(podR.dlv_rqst_tm());
			dtlR.dlv_rqst_hm(podR.dlv_rqst_tm());
			dtlR.purc_schd_dt(podR.purc_schd_dt());
			dtlR.xrate_inpt_flg(MCBooleanUtil.dbStringToBoolean(podR.getStringNE("xrate_inpt_flg")));
			dtlR.ptax_xrate_inpt_flg(MCBooleanUtil.dbStringToBoolean(podR.getStringNE("ptax_xrate_inpt_flg")));
			dtlR.po_no(podR.po_no());
			dtlR.slo_no(podR.slo_no());
			dtlR.slo_d_no(podR.slo_d_no());
			dtlR.mfg_loc_cd(podR.mfg_loc_cd());
			dtlR.mfg_loc_nm(podR.getStringNE("loc_nm"));
			dtlR.bom_ptn(podR.bom_ptn());
			dtlR.outsrc_itm_ord_no(podR.outsrc_itm_ord_no());
			dtlR.rqst_avl_rqst_dt(podR.rqst_avl_rqst_dt());
		}
	}
	
	protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
	protected void initDbcCacheItmLcl(MCList<? extends MCConstRow> down) {
		MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
		MCQueryApiBuilder itmLcl_bldr = MCQueryApiBuilder.create(t);
		itmLcl_bldr.setSelect(t.itm_nm);
		_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(itmLcl_bldr, down,
				Srch01_DtlR.$itm_cd, Srch01_DtlR.$itm_sub1, Srch01_DtlR.$itm_sub2,
				Srch01_DtlR.$itm_sub3, Srch01_DtlR.$lcl_cd);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _cachePoD;
	protected void initDbcCachePoD(MCList<? extends MCConstRow> down) {		
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(t);
		MST_PO_R t2 = MST_PO_R.create("T2");
		MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
		MAM_CUR_R m2 = MAM_CUR_R.create("M2");
		MAM_LOC_R m3 = MAM_LOC_R.create("M3");
		MAM_WG_R m4 = MAM_WG_R.create("M4");
		MAM_TAX_R m5 = MAM_TAX_R.create("M5");
		MAVM_ITM_UNIT_R m6 = MAVM_ITM_UNIT_R.create("M6");
		poD_bldr.setSelect(t.po_d_no, t.trd_unit_cd, m1.unit_nm, m6.dec_place,
				t.trd_unit_qty, t.base_unit_qty, t2.trd_cur_cd, m2.cur_nm, m3.wg_cd, m4.wg_nm,
				t.in_to_loc_cd, m3.loc_nm, t.tax_cd, m5.tax_nm);
		poD_bldr.addInnerJoin(t2, t.po_no.eq(t2.po_no));
		poD_bldr.addLeftOuterJoin(m1, t.trd_unit_cd.eq(m1.unit_cd));
		poD_bldr.addLeftOuterJoin(m2, t2.trd_cur_cd.eq(m2.cur_cd));
		poD_bldr.addLeftOuterJoin(m3, t.in_to_loc_cd.eq(m3.loc_cd));
		poD_bldr.addLeftOuterJoin(m4, m3.wg_cd.eq(m4.wg_cd));
		poD_bldr.addLeftOuterJoin(m5, t.tax_cd.eq(m5.tax_cd));
		poD_bldr.addLeftOuterJoin(m6, bracket(m6.itm_cd.eq(t.itm_cd)
						.and(m6.itm_sub1.eq(t.itm_sub1))
						.and(m6.itm_sub2.eq(t.itm_sub2))
						.and(m6.itm_sub3.eq(t.itm_sub3))
						.and(m6.unit_cd.eq(t.trd_unit_cd))));

		MCList<MST_PO_D_R> dl = MCList.create(MST_PO_D_R.class);
		String[] cols = new String[]{Srch01_DtlR.$po_d_no};
		for (MCRow r : down) {
			if (!isNullOr(r.toArray(cols))) {
				dl.add().setValuesByName(r, cols);
			}
		}
		
		_cachePoD = new FXUCL_MCDbcCache<MST_PO_D_R>(poD_bldr, dl, cols);
	}
	protected FXUCL_MCDbcCache<MST_PURC_RET_SCHD_D_R> _cachePurcRetSchdD;
	protected void initDbcCachePurcRetSchdD(MCList<? extends MCConstRow> down) {
		MST_PURC_RET_SCHD_D_R t1 = MST_PURC_RET_SCHD_D_R.create("T1");
		MCQueryApiBuilder purcRetSchdD_bldr = MCQueryApiBuilder.create(t1);
		MST_PURC_RET_SCHD_R t2 = MST_PURC_RET_SCHD_R.create("T2");
		MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
		MAM_CUR_R m2 = MAM_CUR_R.create("M2");
		MAM_WG_R m3 = MAM_WG_R.create("M3");
		MAM_LOC_R m4 = MAM_LOC_R.create("M4");
		MAM_TAX_R m5 = MAM_TAX_R.create("M5");
		MAVM_ITM_UNIT_R m6 = MAVM_ITM_UNIT_R.create("M6");
		purcRetSchdD_bldr.setSelect(t1.purc_ret_schd_d_no, t1.trd_unit_cd, m1.unit_nm, m6.dec_place,
				t1.trd_unit_qty, t1.base_unit_qty, t2.trd_cur_cd, m2.cur_nm,
				t1.purc_ret_loc_wg_cd, m3.wg_nm, t1.purc_ret_loc_cd, m4.loc_nm, t2.schd_dt,
				t1.tax_cd, m5.tax_nm);
		purcRetSchdD_bldr.addInnerJoin(t2, t1.purc_ret_schd_no.eq(t2.purc_ret_schd_no));
		purcRetSchdD_bldr.addLeftOuterJoin(m1, t1.trd_unit_cd.eq(m1.unit_cd));
		purcRetSchdD_bldr.addLeftOuterJoin(m2, t2.trd_cur_cd.eq(m2.cur_cd));
		purcRetSchdD_bldr.addLeftOuterJoin(m3, t1.purc_ret_loc_wg_cd.eq(m3.wg_cd));
		purcRetSchdD_bldr.addLeftOuterJoin(m4, t1.purc_ret_loc_cd.eq(m4.loc_cd));
		purcRetSchdD_bldr.addLeftOuterJoin(m5, t1.tax_cd.eq(m5.tax_cd));
		purcRetSchdD_bldr.addLeftOuterJoin(m6, bracket(m6.itm_cd.eq(t1.itm_cd)
						.and(m6.itm_sub1.eq(t1.itm_sub1))
						.and(m6.itm_sub2.eq(t1.itm_sub2))
						.and(m6.itm_sub3.eq(t1.itm_sub3))
						.and(m6.unit_cd.eq(t1.trd_unit_cd))));

		MCList<MST_PURC_RET_SCHD_D_R> dl = MCList.create(MST_PURC_RET_SCHD_D_R.class);
		String[] cols = new String[]{"purc_ret_schd_d_no"};
		for (MCRow r : down) {
			if (!isNullOr(r.toArray(cols))) {
				dl.add().setValuesByName(r, cols);
			}
		}
		
		_cachePurcRetSchdD = new FXUCL_MCDbcCache<MST_PURC_RET_SCHD_D_R>(
				purcRetSchdD_bldr, dl, cols);
	}
	protected FXUCL_MCDbcCache<MST_PURC_SCHD_R> _cachePurcSchd;
	protected void initDbcCachePurcSchd(MCList<? extends MCConstRow> down) {
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder purcSchd_bldr = MCQueryApiBuilder.create(t);
		purcSchd_bldr.setSelect(t.purc_schd_no);
		
		MCList<MST_PURC_SCHD_R> dl = MCList.create(MST_PURC_SCHD_R.class);
		String[] cols = new String[]{Srch01_DtlR.$purc_schd_no};
		for (MCRow r : down) {
			if (!isNullOr(r.toArray(cols))) {
				dl.add().setValuesByName(r, cols);
			}
		}

		_cachePurcSchd = new FXUCL_MCDbcCache<MST_PURC_SCHD_R>(purcSchd_bldr, dl, cols);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _cachePoD2;
	protected void initDbcCachePoD2(MCList<? extends MCConstRow> down) {
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MST_PO_R t2 = MST_PO_R.create("T2");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(t);

		poD_bldr.setSelect(t.purc_upri_req_typ, t2.po_dt, t.dlv_rqst_tm, t.purc_schd_dt,
				t2.xrate_inpt_flg, t2.ptax_xrate_inpt_flg, t.po_no,
				t.slo_no, t.slo_d_no, t.mfg_loc_cd, m1.loc_nm, t.bom_ptn, t.outsrc_flg,
				t.outsrc_itm_ord_no, t.rqst_avl_rqst_dt);
		poD_bldr.addInnerJoin(t2, bracket(t2.po_no.eq(t.po_no)));
		poD_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t.mfg_loc_cd)));
		
		_cachePoD2 = new FXUCL_MCDbcCache<MST_PO_D_R>(poD_bldr, down, Srch01_DtlR.$po_d_no);
	}

	//FMCB CUSTOM END
}