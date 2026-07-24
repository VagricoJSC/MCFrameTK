package mcframe.serverMSBH.MSBHL0190;

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
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMSBH.MSBHL0190.*;

import static mcframe.serverMSBH.MSBHL0190.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayNtcSaveHstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayNtcSaveHstSrch_MC extends MSBHL_PayNtcSaveHstSrch_MC_A{
	//FMCB CUSTOM START
	/** 支払通知書明細履歴検索結果 */
	protected MCList<MST_PAY_NTC_D_HIS_R> _dtlRslt = null;
	/** 明細のインデックス（支払通知書明細履歴区分） */
	protected MCIndexKey _idxDtlRslt = null;
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を検索する。<br>
	 */
	public class Srch01 extends MSBHL_PayNtcSaveHstSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchHdr();
			srchDtl();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			getApdRslt();
			getActRslt();
			getAdvPayActRslt();
		}
		/**
		 * ヘッダを検索する。
		 */
		protected void srchHdr() {
			up0().addStringColumn("latest_flg_str", toTrueStr(up0().latest_flg()));
			int cnt = executeQuery(down0(), MSBHL0190_MST_PAY_NTC_HIS_S01(), up0());
			if(cnt > 0) {
				down0().base_cur_cd(getBaseCur().cur_cd());
				down0().base_cur_nm(getBaseCur().cur_nm());
			}
		}

		/**
		 * 明細を検索する。
		 */
		protected void srchDtl() {
			_dtlRslt = MCList.create(MST_PAY_NTC_D_HIS_R.class);
			_dtlRslt.addStringColumn(MAM_TRD_R.$trd_ptn_typ);
			_dtlRslt.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			_dtlRslt.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			executeQuery(_dtlRslt, MSBHL0190_MST_PAY_NTC_D_HIS_S01(), down0());
			_idxDtlRslt = _dtlRslt.createIndex(MST_PAY_NTC_D_HIS_R.$pay_ntc_d_his_typ);
		}
		
		/**
		 * 買掛明細を取得する。
		 */
		protected void getApdRslt() {
			addAll(down1(), _dtlRslt.subList(_idxDtlRslt, MAC_PAY_NTC_D_HIS_TYP.AP_D.value()),
					createMap_Srch01_RsltApdR_MST_PAY_NTC_D_HIS_R());
			down1().sort(Srch01_RsltApdR.$ap_d_no);
		}

		/**
		 * 支払実績を取得する。
		 */
		protected void getActRslt() {
			addAll(down2(), _dtlRslt.subList(_idxDtlRslt, MAC_PAY_NTC_D_HIS_TYP.PAY_ACT_D.value()),
					createMap_Srch01_RsltActR_MST_PAY_NTC_D_HIS_R());
			down2().sort(Srch01_RsltActR.$pay_act_no,
					Srch01_RsltActR.$pay_act_seq,
					Srch01_RsltActR.$pay_act_d_no,
					Srch01_RsltActR.$pay_act_d_seq);
		}

		/**
		 * 前渡金を取得する。
		 */
		protected void getAdvPayActRslt() {
			addAll(down3(), _dtlRslt.subList(_idxDtlRslt, MAC_PAY_NTC_D_HIS_TYP.ADV_PAY_ACT.value()),
					createMap_Srch01_RsltAdvPayActR_MST_PAY_NTC_D_HIS_R());
			down3().sort(Srch01_RsltAdvPayActR.$adv_pay_act_no,
					Srch01_RsltAdvPayActR.$adv_pay_act_seq);
		}

		// 支払通知書明細履歴（買掛明細）設定用Mapper
		protected Map_Srch01_RsltApdR_MST_PAY_NTC_D_HIS_R<Srch01_RsltApdR,MST_PAY_NTC_D_HIS_R> createMap_Srch01_RsltApdR_MST_PAY_NTC_D_HIS_R() {
			return new Map_Srch01_RsltApdR_MST_PAY_NTC_D_HIS_R<Srch01_RsltApdR, MST_PAY_NTC_D_HIS_R>();
		}
		public class Map_Srch01_RsltApdR_MST_PAY_NTC_D_HIS_R<D extends Srch01_RsltApdR, S extends MST_PAY_NTC_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltApdR.$ap_d_no, MST_PAY_NTC_D_HIS_R.$ap_d_no);
				addColumnPathMap(Srch01_RsltApdR.$po_no, MST_PAY_NTC_D_HIS_R.$po_no);
				addColumnPathMap(Srch01_RsltApdR.$po_d_no, MST_PAY_NTC_D_HIS_R.$po_d_no);
				addColumnPathMap(Srch01_RsltApdR.$purc_act_no, MST_PAY_NTC_D_HIS_R.$purc_act_no);
				addColumnPathMap(Srch01_RsltApdR.$purc_act_rev, MST_PAY_NTC_D_HIS_R.$purc_act_rev);
				addColumnPathMap(Srch01_RsltApdR.$purc_act_d_no, MST_PAY_NTC_D_HIS_R.$purc_act_d_no);
				addColumnPathMap(Srch01_RsltApdR.$bp_dlv_slip_no, MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_no);
				addColumnPathMap(Srch01_RsltApdR.$bp_dlv_slip_d_no, MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Srch01_RsltApdR.$trd_cd, MST_PAY_NTC_D_HIS_R.$trd_cd);
				addColumnPathMap(Srch01_RsltApdR.$trd_nm, MAM_TRD_R.$trd_nm);
				addColumnPathMap(Srch01_RsltApdR.$slip_sts_typ, MST_PAY_NTC_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltApdR.$act_dt, MST_PAY_NTC_D_HIS_R.$act_dt);
				addColumnPathMap(Srch01_RsltApdR.$itm_cd, MST_PAY_NTC_D_HIS_R.$itm_cd);
				addColumnPathMap(Srch01_RsltApdR.$itm_sub1, MST_PAY_NTC_D_HIS_R.$itm_sub1);
				addColumnPathMap(Srch01_RsltApdR.$itm_sub2, MST_PAY_NTC_D_HIS_R.$itm_sub2);
				addColumnPathMap(Srch01_RsltApdR.$itm_sub3, MST_PAY_NTC_D_HIS_R.$itm_sub3);
				addColumnPathMap(Srch01_RsltApdR.$itm_nm, MST_PAY_NTC_D_HIS_R.$itm_nm);
				addColumnPathMap(Srch01_RsltApdR.$sundry_itm_flg, MST_PAY_NTC_D_HIS_R.$sundry_itm_flg);
				addColumnPathMap(Srch01_RsltApdR.$sppl_itm_cd, MST_PAY_NTC_D_HIS_R.$sppl_itm_cd);
				addColumnPathMap(Srch01_RsltApdR.$sppl_itm_nm, MST_PAY_NTC_D_HIS_R.$sppl_itm_nm);
				addColumnPathMap(Srch01_RsltApdR.$trd_unit_cd, MST_PAY_NTC_D_HIS_R.$trd_unit_cd);
				addColumnPathMap(Srch01_RsltApdR.$trd_unit_nm, MAM_UNIT_R.$unit_nm);
				addColumnPathMap(Srch01_RsltApdR.$tax_cd, MST_PAY_NTC_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltApdR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltApdR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltApdR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltApdR.$interim_flg, MST_PAY_NTC_D_HIS_R.$interim_flg);
				addColumnPathMap(Srch01_RsltApdR.$sppl_cd, MST_PAY_NTC_D_HIS_R.$sppl_cd);
				addColumnPathMap(Srch01_RsltApdR.$asppl_cd, MST_PAY_NTC_D_HIS_R.$asppl_cd);
				addColumnPathMap(Srch01_RsltApdR.$pay_mtd_typ, MST_PAY_NTC_D_HIS_R.$pay_mtd_typ);
				addColumnPathMap(Srch01_RsltApdR.$base_purc_ac_dt, MST_PAY_NTC_D_HIS_R.$base_purc_ac_dt);
				addColumnPathMap(Srch01_RsltApdR.$pay_ntc_d_print_rmrks, MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks);
				addColumnPathMap(Srch01_RsltApdR.$sub_char1, MST_PAY_NTC_D_HIS_R.$ap_d_sub_char1);
				addColumnPathMap(Srch01_RsltApdR.$sub_char2, MST_PAY_NTC_D_HIS_R.$ap_d_sub_char2);
				addColumnPathMap(Srch01_RsltApdR.$sub_char3, MST_PAY_NTC_D_HIS_R.$ap_d_sub_char3);
				addColumnPathMap(Srch01_RsltApdR.$ins_usr_id, MST_PAY_NTC_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltApdR.$ins_usr_nm, MST_PAY_NTC_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltApdR.$ins_func_id, MST_PAY_NTC_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltApdR.$upd_usr_id, MST_PAY_NTC_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltApdR.$upd_usr_nm, MST_PAY_NTC_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltApdR.$upd_func_id, MST_PAY_NTC_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltApdR.$ins_ts, MST_PAY_NTC_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltApdR.$upd_ts, MST_PAY_NTC_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltApdR.$upd_srv_req_no, MST_PAY_NTC_D_HIS_R.$upd_srv_req_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNull(src.trd_unit_qty())) {
					dest.trd_unit_qty(src.trd_unit_qty().multiply(
						MAC_TRD_PTN_TYP.qty_disp_pm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ))));
				}
				if (!isNull(src.trd_cur_upri())) {
					dest.trd_cur_upri(src.trd_cur_upri().multiply(
						MAUCL_TrdUtil.getUpriDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ), 
						src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
					dest.base_cur_upri(src.base_cur_upri().multiply(
							MAUCL_TrdUtil.getUpriDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ), 
							src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				}
				if (!isNull(src.trd_cur_tax_amt())){
					dest.trd_cur_tax_amt(src.trd_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
						src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
					dest.base_cur_tax_amt(src.base_cur_tax_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
							src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				}
				if (!isNull(src.trd_cur_amt())) {
					dest.trd_cur_amt(src.trd_cur_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
						src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
					dest.base_cur_amt(src.base_cur_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
							src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
					dest.trd_cur_inc_tax_amt(dest.trd_cur_amt().add(nvl(dest.trd_cur_tax_amt(), MCNumber.ZERO)));
					dest.base_cur_inc_tax_amt(dest.base_cur_amt().add(nvl(dest.base_cur_tax_amt(), MCNumber.ZERO)));
				}
				if (!isNull(src.trd_cur_dscnt_amt())){
					dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
						src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
					dest.base_cur_dscnt_amt(src.base_cur_dscnt_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(src.getStringNE(MAM_TRD_R.$trd_ptn_typ),
							src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				}
				
				dest.sppl_nm(src.getStringNE("sppl_nm"));
				dest.asppl_nm(src.getStringNE("asppl_nm"));
			}
		}

		// 支払通知書明細履歴（支払実績）設定用Mapper
		protected Map_Srch01_RsltActR_MST_PAY_NTC_D_HIS_R<Srch01_RsltActR,MST_PAY_NTC_D_HIS_R> createMap_Srch01_RsltActR_MST_PAY_NTC_D_HIS_R() {
			return new Map_Srch01_RsltActR_MST_PAY_NTC_D_HIS_R<Srch01_RsltActR, MST_PAY_NTC_D_HIS_R>();
		}
		public class Map_Srch01_RsltActR_MST_PAY_NTC_D_HIS_R<D extends Srch01_RsltActR, S extends MST_PAY_NTC_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltActR.$pay_act_no, MST_PAY_NTC_D_HIS_R.$pay_act_no);
				addColumnPathMap(Srch01_RsltActR.$pay_act_seq, MST_PAY_NTC_D_HIS_R.$pay_act_seq);
				addColumnPathMap(Srch01_RsltActR.$pay_act_d_no, MST_PAY_NTC_D_HIS_R.$pay_act_d_no);
				addColumnPathMap(Srch01_RsltActR.$pay_act_d_seq, MST_PAY_NTC_D_HIS_R.$pay_act_d_seq);
				addColumnPathMap(Srch01_RsltActR.$ap_sttl_cd, MST_PAY_NTC_D_HIS_R.$ap_sttl_cd);
				addColumnPathMap(Srch01_RsltActR.$ap_sttl_nm, MAM_STTL_R.$sttl_nm);
				addColumnPathMap(Srch01_RsltActR.$slip_sts_typ, MST_PAY_NTC_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltActR.$pay_act_dt, MST_PAY_NTC_D_HIS_R.$pay_act_dt);
				addColumnPathMap(Srch01_RsltActR.$tax_cd, MST_PAY_NTC_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltActR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltActR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltActR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltActR.$trd_cur_amt, MST_PAY_NTC_D_HIS_R.$trd_cur_amt);
				addColumnPathMap(Srch01_RsltActR.$trd_cur_tax_amt, MST_PAY_NTC_D_HIS_R.$trd_cur_tax_amt);
				addColumnPathMap(Srch01_RsltActR.$base_cur_amt, MST_PAY_NTC_D_HIS_R.$base_cur_amt);
				addColumnPathMap(Srch01_RsltActR.$base_cur_tax_amt, MST_PAY_NTC_D_HIS_R.$base_cur_tax_amt);
				addColumnPathMap(Srch01_RsltActR.$pay_ntc_d_print_rmrks, MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks);
				addColumnPathMap(Srch01_RsltActR.$sub_char1, MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char1);
				addColumnPathMap(Srch01_RsltActR.$sub_char2, MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char2);
				addColumnPathMap(Srch01_RsltActR.$sub_char3, MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char3);
				addColumnPathMap(Srch01_RsltActR.$ins_usr_id, MST_PAY_NTC_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltActR.$ins_usr_nm, MST_PAY_NTC_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltActR.$ins_func_id, MST_PAY_NTC_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltActR.$upd_usr_id, MST_PAY_NTC_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltActR.$upd_usr_nm, MST_PAY_NTC_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltActR.$upd_func_id, MST_PAY_NTC_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltActR.$ins_ts, MST_PAY_NTC_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltActR.$upd_ts, MST_PAY_NTC_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltActR.$upd_srv_req_no, MST_PAY_NTC_D_HIS_R.$upd_srv_req_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!isNull(src.trd_cur_amt())) {
					dest.trd_cur_inc_tax_amt(src.trd_cur_amt().add(nvl(src.trd_cur_tax_amt(), MCNumber.ZERO)));
					dest.base_cur_inc_tax_amt(src.base_cur_amt().add(nvl(src.base_cur_tax_amt(), MCNumber.ZERO)));
				}
			}
		}

		// 支払通知書明細履歴（前渡金）設定用Mapper
		protected Map_Srch01_RsltAdvPayActR_MST_PAY_NTC_D_HIS_R<Srch01_RsltAdvPayActR,MST_PAY_NTC_D_HIS_R> createMap_Srch01_RsltAdvPayActR_MST_PAY_NTC_D_HIS_R() {
			return new Map_Srch01_RsltAdvPayActR_MST_PAY_NTC_D_HIS_R<Srch01_RsltAdvPayActR, MST_PAY_NTC_D_HIS_R>();
		}
		public class Map_Srch01_RsltAdvPayActR_MST_PAY_NTC_D_HIS_R<D extends Srch01_RsltAdvPayActR, S extends MST_PAY_NTC_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_act_no, MST_PAY_NTC_D_HIS_R.$adv_pay_act_no);
				addColumnPathMap(Srch01_RsltAdvPayActR.$adv_pay_act_seq, MST_PAY_NTC_D_HIS_R.$adv_pay_act_seq);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ap_sttl_cd, MST_PAY_NTC_D_HIS_R.$ap_sttl_cd);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ap_sttl_nm, MAM_STTL_R.$sttl_nm);
				addColumnPathMap(Srch01_RsltAdvPayActR.$slip_sts_typ, MST_PAY_NTC_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltAdvPayActR.$pay_act_dt, MST_PAY_NTC_D_HIS_R.$pay_act_dt);
				addColumnPathMap(Srch01_RsltAdvPayActR.$tax_cd, MST_PAY_NTC_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltAdvPayActR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltAdvPayActR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltAdvPayActR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_amt, MST_PAY_NTC_D_HIS_R.$trd_cur_amt);
				addColumnPathMap(Srch01_RsltAdvPayActR.$trd_cur_tax_amt, MST_PAY_NTC_D_HIS_R.$trd_cur_tax_amt);
				addColumnPathMap(Srch01_RsltAdvPayActR.$base_cur_amt, MST_PAY_NTC_D_HIS_R.$base_cur_amt);
				addColumnPathMap(Srch01_RsltAdvPayActR.$base_cur_tax_amt, MST_PAY_NTC_D_HIS_R.$base_cur_tax_amt);
				addColumnPathMap(Srch01_RsltAdvPayActR.$sub_char1, MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char1);
				addColumnPathMap(Srch01_RsltAdvPayActR.$sub_char2, MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char2);
				addColumnPathMap(Srch01_RsltAdvPayActR.$sub_char3, MST_PAY_NTC_D_HIS_R.$adv_pay_act_sub_char3);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ins_usr_id, MST_PAY_NTC_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ins_usr_nm, MST_PAY_NTC_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ins_func_id, MST_PAY_NTC_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltAdvPayActR.$upd_usr_id, MST_PAY_NTC_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltAdvPayActR.$upd_usr_nm, MST_PAY_NTC_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltAdvPayActR.$upd_func_id, MST_PAY_NTC_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltAdvPayActR.$ins_ts, MST_PAY_NTC_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltAdvPayActR.$upd_ts, MST_PAY_NTC_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltAdvPayActR.$upd_srv_req_no, MST_PAY_NTC_D_HIS_R.$upd_srv_req_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);				
				if (!isNull(src.trd_cur_amt())) {
					dest.trd_cur_inc_tax_amt(src.trd_cur_amt().add(nvl(src.trd_cur_tax_amt(), MCNumber.ZERO)));
					dest.base_cur_inc_tax_amt(src.base_cur_amt().add(nvl(src.base_cur_tax_amt(), MCNumber.ZERO)));
				}
			}
		}
	}

	//FMCB CUSTOM END
}