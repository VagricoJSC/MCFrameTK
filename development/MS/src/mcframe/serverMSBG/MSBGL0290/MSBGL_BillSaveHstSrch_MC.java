package mcframe.serverMSBG.MSBGL0290;

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
import mcframe.serverMSBG.MSBGL0290.*;
import mcframe.serverMSBH.MSBHL0190.Srch01_RsltActR;

import static mcframe.serverMSBG.MSBGL0290.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillSaveHstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillSaveHstSrch_MC extends MSBGL_BillSaveHstSrch_MC_A{
	//FMCB CUSTOM START
	/** 請求書明細履歴検索結果 */
	protected MCList<MST_BILL_D_HIS_R> _dtlRslt = null;
	/** 明細のインデックス（請求書明細履歴区分） */
	protected MCIndexKey _idxDtlRslt = null;
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求情報を検索する。<br>
	 */
	public class Srch01 extends MSBGL_BillSaveHstSrch_MC_A.Srch01 {
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
			getSlsRslt();
			getRcvRslt();
			getAdvRslt();
		}

		/**
		 * ヘッダを検索する。
		 */
		protected void srchHdr() {
			up0().addStringColumn("latest_flg_str", toTrueStr(up0().latest_flg()));
			int cnt = executeQuery(down0(), MSBGL0290_MST_BILL_HIS_S01(), up0());
			if(cnt > 0) {
				down0().base_cur_cd(getBaseCur().cur_cd());
				down0().base_cur_nm(getBaseCur().cur_nm());
			}
		}
		
		/**
		 * 明細を検索する。
		 */
		protected void srchDtl() {
			_dtlRslt = MCList.create(MST_BILL_D_HIS_R.class);
			_dtlRslt.addStringColumn(MAM_TRD_R.$trd_ptn_typ);
			_dtlRslt.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			_dtlRslt.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			executeQuery(_dtlRslt, MSBGL0290_MST_BILL_D_HIS_S01(), down0());
			_idxDtlRslt = _dtlRslt.createIndex(MST_BILL_D_HIS_R.$bill_d_his_typ);
		}
		
		/**
		 * 売上を取得する。
		 */
		protected void getSlsRslt() {
			addAll(down1(), _dtlRslt.subList(_idxDtlRslt, MAC_BILL_D_HIS_TYP.SLS_ACT.value()),
					createMap_Srch01_RsltSlsR_MST_BILL_D_HIS_R());
			down1().sort(Srch01_RsltSlsR.$sls_act_no,
					Srch01_RsltSlsR.$sls_act_seq,
					Srch01_RsltSlsR.$sls_act_rev,
					Srch01_RsltSlsR.$sls_act_d_no,
					Srch01_RsltSlsR.$sls_act_d_seq);
		}
		
		/**
		 * 入金を取得する。
		 */
		protected void getRcvRslt() {
			addAll(down2(), _dtlRslt.subList(_idxDtlRslt, MAC_BILL_D_HIS_TYP.RCV_ACT.value()),
					createMap_Srch01_RsltRcvR_MST_BILL_D_HIS_R());
			down2().sort(Srch01_RsltRcvR.$rcv_act_no,
					Srch01_RsltRcvR.$rcv_act_seq,
					Srch01_RsltRcvR.$rcv_act_rev,
					Srch01_RsltRcvR.$rcv_act_d_no,
					Srch01_RsltRcvR.$rcv_act_d_seq);
		}
		
		/**
		 * 前受金を取得する。
		 */
		protected void getAdvRslt() {
			addAll(down3(), _dtlRslt.subList(_idxDtlRslt, MAC_BILL_D_HIS_TYP.ADV_RCV_ACT.value()),
					createMap_Srch01_RsltAdvR_MST_BILL_D_HIS_R());
			down3().sort(Srch01_RsltAdvR.$rcv_act_no,
					Srch01_RsltAdvR.$rcv_act_seq,
					Srch01_RsltAdvR.$rcv_act_rev,
					Srch01_RsltAdvR.$rcv_act_d_no,
					Srch01_RsltAdvR.$rcv_act_d_seq);
		}
		
		// 請求書明細履歴（売上）設定用Mapper
		protected Map_Srch01_RsltSlsR_MST_BILL_D_HIS_R<Srch01_RsltSlsR,MST_BILL_D_HIS_R> createMap_Srch01_RsltSlsR_MST_BILL_D_HIS_R() {
			return new Map_Srch01_RsltSlsR_MST_BILL_D_HIS_R<Srch01_RsltSlsR, MST_BILL_D_HIS_R>();
		}
		public class Map_Srch01_RsltSlsR_MST_BILL_D_HIS_R<D extends Srch01_RsltSlsR, S extends MST_BILL_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltSlsR.$trd_cd, MST_BILL_D_HIS_R.$trd_cd);
				addColumnPathMap(Srch01_RsltSlsR.$trd_nm, MAM_TRD_R.$trd_nm);
				addColumnPathMap(Srch01_RsltSlsR.$slip_sts_typ, MST_BILL_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltSlsR.$sls_act_no, MST_BILL_D_HIS_R.$act_no);
				addColumnPathMap(Srch01_RsltSlsR.$sls_act_seq, MST_BILL_D_HIS_R.$act_seq);
				addColumnPathMap(Srch01_RsltSlsR.$sls_act_rev, MST_BILL_D_HIS_R.$act_rev);
				addColumnPathMap(Srch01_RsltSlsR.$sls_act_d_no, MST_BILL_D_HIS_R.$act_d_no);
				addColumnPathMap(Srch01_RsltSlsR.$sls_act_d_seq, MST_BILL_D_HIS_R.$act_d_seq);
				addColumnPathMap(Srch01_RsltSlsR.$dlv_dt, MST_BILL_D_HIS_R.$dlv_dt);
				addColumnPathMap(Srch01_RsltSlsR.$base_sls_ac_dt, MST_BILL_D_HIS_R.$base_sls_ac_dt);
				addColumnPathMap(Srch01_RsltSlsR.$itm_cd, MST_BILL_D_HIS_R.$itm_cd);
				addColumnPathMap(Srch01_RsltSlsR.$itm_sub1, MST_BILL_D_HIS_R.$itm_sub1);
				addColumnPathMap(Srch01_RsltSlsR.$itm_sub2, MST_BILL_D_HIS_R.$itm_sub2);
				addColumnPathMap(Srch01_RsltSlsR.$itm_sub3, MST_BILL_D_HIS_R.$itm_sub3);
				addColumnPathMap(Srch01_RsltSlsR.$itm_nm, MST_BILL_D_HIS_R.$itm_nm);
				addColumnPathMap(Srch01_RsltSlsR.$cst_cd, MST_BILL_D_HIS_R.$cst_cd);
				addColumnPathMap(Srch01_RsltSlsR.$dlv_cd, MST_BILL_D_HIS_R.$dlv_cd);
				addColumnPathMap(Srch01_RsltSlsR.$sundry_itm_flg, MST_BILL_D_HIS_R.$sundry_itm_flg);
				addColumnPathMap(Srch01_RsltSlsR.$cst_itm_cd, MST_BILL_D_HIS_R.$cst_itm_cd);
				addColumnPathMap(Srch01_RsltSlsR.$cst_itm_nm, MST_BILL_D_HIS_R.$cst_itm_nm);
				addColumnPathMap(Srch01_RsltSlsR.$trd_unit_cd, MST_BILL_D_HIS_R.$trd_unit_cd);
				addColumnPathMap(Srch01_RsltSlsR.$trd_unit_nm, MAM_UNIT_R.$unit_nm);
				addColumnPathMap(Srch01_RsltSlsR.$interim_flg, MST_BILL_D_HIS_R.$interim_flg);
				addColumnPathMap(Srch01_RsltSlsR.$tax_cd, MST_BILL_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltSlsR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltSlsR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltSlsR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltSlsR.$trd_d_rmrks, MST_BILL_D_HIS_R.$trd_d_rmrks);
				addColumnPathMap(Srch01_RsltSlsR.$dlv_slip_no, MST_BILL_D_HIS_R.$dlv_slip_no);
				addColumnPathMap(Srch01_RsltSlsR.$dlv_slip_d_no, MST_BILL_D_HIS_R.$dlv_slip_d_no);
				addColumnPathMap(Srch01_RsltSlsR.$ship_dlv_slip_no, MST_BILL_D_HIS_R.$ship_dlv_slip_no);
				addColumnPathMap(Srch01_RsltSlsR.$ship_dlv_slip_d_no, MST_BILL_D_HIS_R.$ship_dlv_slip_d_no);
				addColumnPathMap(Srch01_RsltSlsR.$ship_dlv_slip_multi_flg, MST_BILL_D_HIS_R.$ship_dlv_slip_multi_flg);
				addColumnPathMap(Srch01_RsltSlsR.$bill_mtd_typ, MST_BILL_D_HIS_R.$bill_mtd_typ);
				addColumnPathMap(Srch01_RsltSlsR.$sub_char1, MST_BILL_D_HIS_R.$sub_char1);
				addColumnPathMap(Srch01_RsltSlsR.$sub_char2, MST_BILL_D_HIS_R.$sub_char2);
				addColumnPathMap(Srch01_RsltSlsR.$sub_char3, MST_BILL_D_HIS_R.$sub_char3);
				addColumnPathMap(Srch01_RsltSlsR.$ins_usr_id, MST_BILL_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltSlsR.$ins_usr_nm, MST_BILL_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltSlsR.$ins_func_id, MST_BILL_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltSlsR.$upd_usr_id, MST_BILL_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltSlsR.$upd_usr_nm, MST_BILL_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltSlsR.$upd_func_id, MST_BILL_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltSlsR.$ins_ts, MST_BILL_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltSlsR.$upd_ts, MST_BILL_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltSlsR.$upd_srv_req_no, MST_BILL_D_HIS_R.$upd_srv_req_no);
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
				if (!isNull(src.trd_cur_dscnt_amt())) {
					dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
					dest.base_cur_dscnt_amt(src.base_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
				}
				
				dest.cst_nm(src.getStringNE("cst_nm"));
				dest.dlv_nm(src.getStringNE("dlv_nm"));
			}
		}
		
		// 請求書明細履歴（入金）設定用Mapper
		protected Map_Srch01_RsltRcvR_MST_BILL_D_HIS_R<Srch01_RsltRcvR,MST_BILL_D_HIS_R> createMap_Srch01_RsltRcvR_MST_BILL_D_HIS_R() {
			return new Map_Srch01_RsltRcvR_MST_BILL_D_HIS_R<Srch01_RsltRcvR, MST_BILL_D_HIS_R>();
		}
		public class Map_Srch01_RsltRcvR_MST_BILL_D_HIS_R<D extends Srch01_RsltRcvR, S extends MST_BILL_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltRcvR.$trd_cd, MST_BILL_D_HIS_R.$trd_cd);
				addColumnPathMap(Srch01_RsltRcvR.$trd_nm, MAM_TRD_R.$trd_nm);
				addColumnPathMap(Srch01_RsltRcvR.$slip_sts_typ, MST_BILL_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_act_no, MST_BILL_D_HIS_R.$act_no);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_act_seq, MST_BILL_D_HIS_R.$act_seq);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_act_rev, MST_BILL_D_HIS_R.$act_rev);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_act_d_no, MST_BILL_D_HIS_R.$act_d_no);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_act_d_seq, MST_BILL_D_HIS_R.$act_d_seq);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_mtd_cd, MST_BILL_D_HIS_R.$rcv_mtd_cd);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_mtd_nm, MAM_STTL_R.$sttl_nm);
				addColumnPathMap(Srch01_RsltRcvR.$rcv_dt, MST_BILL_D_HIS_R.$rcv_dt);
				addColumnPathMap(Srch01_RsltRcvR.$trd_cur_amt, MST_BILL_D_HIS_R.$trd_cur_amt);
				addColumnPathMap(Srch01_RsltSlsR.$base_cur_amt, MST_BILL_D_HIS_R.$base_cur_amt);
				addColumnPathMap(Srch01_RsltRcvR.$tax_cd, MST_BILL_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltRcvR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltSlsR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltSlsR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltRcvR.$trd_cur_tax_amt, MST_BILL_D_HIS_R.$trd_cur_tax_amt);
				addColumnPathMap(Srch01_RsltSlsR.$base_cur_tax_amt, MST_BILL_D_HIS_R.$base_cur_tax_amt);
				addColumnPathMap(Srch01_RsltRcvR.$bill_d_rmrks, MST_BILL_D_HIS_R.$bill_d_rmrks);
				addColumnPathMap(Srch01_RsltRcvR.$sub_char1, MST_BILL_D_HIS_R.$sub_char1);
				addColumnPathMap(Srch01_RsltRcvR.$sub_char2, MST_BILL_D_HIS_R.$sub_char2);
				addColumnPathMap(Srch01_RsltRcvR.$sub_char3, MST_BILL_D_HIS_R.$sub_char3);
				addColumnPathMap(Srch01_RsltRcvR.$ins_usr_id, MST_BILL_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltRcvR.$ins_usr_nm, MST_BILL_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltRcvR.$ins_func_id, MST_BILL_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltRcvR.$upd_usr_id, MST_BILL_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltRcvR.$upd_usr_nm, MST_BILL_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltRcvR.$upd_func_id, MST_BILL_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltRcvR.$ins_ts, MST_BILL_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltRcvR.$upd_ts, MST_BILL_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltRcvR.$upd_srv_req_no, MST_BILL_D_HIS_R.$upd_srv_req_no);
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

		// 請求書明細履歴（前受金）設定用Mapper
		protected Map_Srch01_RsltAdvR_MST_BILL_D_HIS_R<Srch01_RsltAdvR,MST_BILL_D_HIS_R> createMap_Srch01_RsltAdvR_MST_BILL_D_HIS_R() {
			return new Map_Srch01_RsltAdvR_MST_BILL_D_HIS_R<Srch01_RsltAdvR, MST_BILL_D_HIS_R>();
		}
		public class Map_Srch01_RsltAdvR_MST_BILL_D_HIS_R<D extends Srch01_RsltAdvR, S extends MST_BILL_D_HIS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltAdvR.$trd_cd, MST_BILL_D_HIS_R.$trd_cd);
				addColumnPathMap(Srch01_RsltAdvR.$trd_nm, MAM_TRD_R.$trd_nm);
				addColumnPathMap(Srch01_RsltAdvR.$slip_sts_typ, MST_BILL_D_HIS_R.$slip_sts_typ);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_act_no, MST_BILL_D_HIS_R.$act_no);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_act_seq, MST_BILL_D_HIS_R.$act_seq);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_act_rev, MST_BILL_D_HIS_R.$act_rev);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_act_d_no, MST_BILL_D_HIS_R.$act_d_no);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_act_d_seq, MST_BILL_D_HIS_R.$act_d_seq);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_mtd_cd, MST_BILL_D_HIS_R.$rcv_mtd_cd);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_mtd_nm, MAM_STTL_R.$sttl_nm);
				addColumnPathMap(Srch01_RsltAdvR.$rcv_dt, MST_BILL_D_HIS_R.$rcv_dt);
				addColumnPathMap(Srch01_RsltAdvR.$trd_cur_amt, MST_BILL_D_HIS_R.$trd_cur_amt);
				addColumnPathMap(Srch01_RsltSlsR.$base_cur_amt, MST_BILL_D_HIS_R.$base_cur_amt);
				addColumnPathMap(Srch01_RsltAdvR.$tax_cd, MST_BILL_D_HIS_R.$tax_cd);
				addColumnPathMap(Srch01_RsltAdvR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(Srch01_RsltSlsR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(Srch01_RsltSlsR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(Srch01_RsltAdvR.$trd_cur_tax_amt, MST_BILL_D_HIS_R.$trd_cur_tax_amt);
				addColumnPathMap(Srch01_RsltSlsR.$base_cur_tax_amt, MST_BILL_D_HIS_R.$base_cur_tax_amt);
				addColumnPathMap(Srch01_RsltAdvR.$sub_char1, MST_BILL_D_HIS_R.$sub_char1);
				addColumnPathMap(Srch01_RsltAdvR.$sub_char2, MST_BILL_D_HIS_R.$sub_char2);
				addColumnPathMap(Srch01_RsltAdvR.$sub_char3, MST_BILL_D_HIS_R.$sub_char3);
				addColumnPathMap(Srch01_RsltAdvR.$ins_usr_id, MST_BILL_D_HIS_R.$ins_usr_id);
				addColumnPathMap(Srch01_RsltAdvR.$ins_usr_nm, MST_BILL_D_HIS_R.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltAdvR.$ins_func_id, MST_BILL_D_HIS_R.$ins_func_id);
				addColumnPathMap(Srch01_RsltAdvR.$upd_usr_id, MST_BILL_D_HIS_R.$upd_usr_id);
				addColumnPathMap(Srch01_RsltAdvR.$upd_usr_nm, MST_BILL_D_HIS_R.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltAdvR.$upd_func_id, MST_BILL_D_HIS_R.$upd_func_id);
				addColumnPathMap(Srch01_RsltAdvR.$ins_ts, MST_BILL_D_HIS_R.$ins_ts);
				addColumnPathMap(Srch01_RsltAdvR.$upd_ts, MST_BILL_D_HIS_R.$upd_ts);
				addColumnPathMap(Srch01_RsltAdvR.$upd_srv_req_no, MST_BILL_D_HIS_R.$upd_srv_req_no);
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