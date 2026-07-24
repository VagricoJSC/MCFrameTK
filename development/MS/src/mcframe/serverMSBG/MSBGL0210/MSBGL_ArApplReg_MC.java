package mcframe.serverMSBG.MSBGL0210;

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
import mcframe.serverMSBG.MSBGL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSBG.MSBGL0210.Query.*;

import java.util.List;

import mcframe.serverMSBG.MSBGL5020.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArApplReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArApplReg_MC extends MSBGL_ArApplReg_MC_A{
	//FMCB CUSTOM START

	/**
	* 更新前入金実績情報のキャッシュ
	*/
	protected static final Class<MSBGL_ArApplReg> CLAZZ = MSBGL_ArApplReg.class;
	protected FXUCL_MCDbcCache<MST_RCV_ACT_R> _orgRcvActCache = null;

	// チェック処理でキャッシュを初期化する
	protected static void initOrgRcvActCache(MST_RCV_ACT_R rcvActR,
			MST_RCV_ACT_R rcvActR_t, MCQueryApiBuilder rcvActR_bldr) {
		object(CLAZZ)._initOrgRcvActCache(rcvActR, rcvActR_t, rcvActR_bldr);
	}

	protected void _initOrgRcvActCache(MST_RCV_ACT_R rcvActR,
			MST_RCV_ACT_R rcvActR_t, MCQueryApiBuilder rcvActR_bldr) {
		_orgRcvActCache = new FXUCL_MCDbcCache<MST_RCV_ACT_R>(rcvActR_bldr);
	}

	protected static MST_RCV_ACT_R getOrgRcvActCache(String rcvActNo, MCNumber rcvActSeq) {
		return object(CLAZZ)._orgRcvActCache.get(rcvActNo, rcvActSeq);
	}

	/**
	* 引継の入金情報のキャッシュ
	*/
	protected FXUCL_MCDbcCache<MST_RCV_R> _rcvCache = null;

	// チェック処理でキャッシュを初期化する
	protected static void initRcvCache(MST_RCV_R rctR, MST_RCV_R rcvR_t, MCQueryApiBuilder rcvR_bldr) {
		object(CLAZZ)._initRcvCache(rctR, rcvR_t, rcvR_bldr);
	}

	protected void _initRcvCache(MST_RCV_R rcvR, MST_RCV_R rcvR_t, MCQueryApiBuilder rcvR_bldr) {
		_rcvCache = new FXUCL_MCDbcCache<MST_RCV_R>(rcvR_bldr);
	}

	protected static MST_RCV_R getRcvCache(String rcvNo) {
		return object(CLAZZ)._rcvCache.get(rcvNo);
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛消込の入金実績を検索する<br>
	 */
	public class Srch01 extends MSBGL_ArApplReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCnd();

			// 入金実績ヘッダの取得
			Srch01_Hdr_RcvR hdrRcvR = getHdrRcv();

			if (!chkHdrRcv(hdrRcvR)) {
				return;
			}

			// 前受仮受対応取引の設定
			setAdvRcv(hdrRcvR);

			// 入金実績明細情報の検索
			MCList<Srch01_DtlR> dL = getDtl(hdrRcvR);

			chkDtl(dL);

			// 電文の設定
			setDown(hdrRcvR, dL);
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {

			// 最新ＦＬＧがオンの場合は、一時カラムに検索条件制御用のカラムを追加
			// 念のため、改訂番号をクリアする
			if (up0().latest_flg()) {
				up0().setStringNE("latest_flg_str", toTrueStr(up0().latest_flg()));
				up0().rcv_act_rev(null);
			}
			else if (isNull(up0().rcv_act_rev())) {
				// 画面で制御しているが、仮に最新ＦＬＧがオフ、改訂番号がnullの場合、
				// サーバエラー(検索結果が１件と想定される箇所で、複数件のデータが検索されました。)が発生するので
				// 検索結果が0件になるように加工する
				up0().setStringNE("latest_flg_str", toFalseStr(up0().latest_flg()));
			}
		}

		/**
		 * 入金実績ヘッダを取得する
		 * 
		 * @return 入金実績ヘッダ
		 */
		protected Srch01_Hdr_RcvR getHdrRcv() {

			Srch01_Hdr_RcvR hdrRcvR = Srch01_Hdr_RcvR.create();
			// 入金実績の検索
			executeQuery(hdrRcvR, MSBGL0210_MST_RCV_ACT_S01(), up0());

			// 相殺の場合は専用のSQLで再検索する
			if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(hdrRcvR.trd_ptn_typ())) {
				hdrRcvR.clear();
				executeQuery(hdrRcvR, MSBGL0210_MST_RCV_ACT_S02(), up0());
			}
			if (!hdrRcvR.isEmpty()) {
				setPurcSlsFlg(hdrRcvR);
				hdrRcvR.latest_flg(getLatestFlg(hdrRcvR));
			}
			return hdrRcvR;
		}

		/**
		 * 売上仕入税区分、相殺売上仕入税区分に応じて売上ＦＬＧ、仕入ＦＬＧ、相殺売上ＦＬＧ，相殺仕入ＦＬＧをセットする。
		 * @param hdrRcvR
		 * @return
		 */
		protected void setPurcSlsFlg(Srch01_Hdr_RcvR hdrRcvR) {
			if (isNull(hdrRcvR)) {
				return;
			}

			// 売上仕入税区分
			if (MAC_SLS_PURC_TYP.isPURC(hdrRcvR.sls_purc_typ2())) {
				hdrRcvR.purc_flg(true);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(hdrRcvR.sls_purc_typ2())) {
				hdrRcvR.sls_flg(true);
			}

			// 相殺売上仕入税区分
			if (MAC_SLS_PURC_TYP.isPURC(hdrRcvR.setoff_sls_purc_typ())) {
				hdrRcvR.setoff_purc_flg(true);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(hdrRcvR.setoff_sls_purc_typ())) {
				hdrRcvR.setoff_sls_flg(true);
			}
		}

		protected boolean chkHdrRcv(Srch01_Hdr_RcvR hdrRcvR) {
			if (hdrRcvR.isEmpty()) {
				return false;
			}

			if (!isProcessable(hdrRcvR.trd_ptn_typ())) {
				throw new MCAppException(up0(), null, MSBGL0087);
			}
			return true;
		}

		/**
		 * 前受仮受の入金情報を参照している場合は対応する取引を設定する
		 * 
		 * @param hR 入金実績ヘッダ
		 */
		protected void setAdvRcv(Srch01_Hdr_RcvR  hdrRcvR) {
			if (MSC_RCV_DAT_TYP.isADV(hdrRcvR.rcv_dat_typ()) || MSC_RCV_DAT_TYP.isSUSP(hdrRcvR.rcv_dat_typ())) {
				MST_RCV_ACT_R r = srchAdvRcv(hdrRcvR);
				hdrRcvR.adv_trd_cd(r.getStringNE(MST_RCV_ACT_R.$trd_cd));
				hdrRcvR.adv_trd_nm(r.getStringNE("trd_nm"));
			}
		}

		/**
		 * 改訂番号が最新の場合は最新フラグをtrueにする。
		 */
		protected boolean getLatestFlg(Srch01_Hdr_RcvR hdrRcvR) {
			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(hdrRcvR.slip_sts_typ())) {
					return true;
			}
			return false;
		}

		/**
		 * 入金実績明細を取得する
		 * 
		 * @param hR 入金実績ヘッダ
		 * @return 入金実績明細
		 */
		protected MCList<Srch01_DtlR> getDtl(Srch01_Hdr_RcvR  hdrRcvR) {
			MCList<Srch01_DtlR> dL = MCList.create(Srch01_DtlR.class);
			executeQuery(dL, MSBGL0210_MST_RCV_ACT_D_S01(), hdrRcvR);
			if (!isNull(hdrRcvR.slo_no())) {
				editOtherSloFlg(dL, hdrRcvR.slo_no());
			}
			setArDpt(dL);
			return dL;
		}

		/**
		 * 債権部門名を補完する
		 * @param dL
		 */
		protected void setArDpt(MCList<Srch01_DtlR> dL) {
			for (Srch01_DtlR dtlR : dL) {
				if (isNull(dtlR.ar_dpt_nm())) {
					MSBGL_ArUtil.setLastDpt(dtlR, Srch01_DtlR.$ar_dpt_cd, Srch01_DtlR.$ar_dpt_nm);
				}
			}
		}

		/**
		 * 受注に紐付く明細かどうかを判断して、他受注ＦＬＧを設定する
		 * 
		 * @param dL 明細情報
		 * @param sloNo 受注ＮＯ 
		 */
		protected void editOtherSloFlg(MCList<Srch01_DtlR> dL, String sloNo) {
			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
			billDL_bldr.setSelect(t.bill_mng_no);
			billDL_bldr.setWhere(t.bill_mng_no.eq(bind("bill_mng_no")));
			billDL_bldr.addWhereWithAnd(t.slo_no.eq(bind("1")), sloNo);
			dbSelect("MSBGL0210_MST_BILL_D_S01", billDL, billDL_bldr, dL);

			for (Srch01_DtlR r : dL) {
				MCList<MST_BILL_D_R> subL = billDL.subList(Srch01_DtlR.$bill_mng_no, r.bill_mng_no());
				if (subL.size() == 0) {
					r.other_slo_flg(true);
				}
				else {
					r.other_slo_flg(false);
				}
			}
		}

		protected void chkDtl(MCList<Srch01_DtlR> dL) {
			if (dL.isEmpty()) {
				throw new MCAppException(up0(), null, MSBGL0112);
			}
		}

		protected void setDown(Srch01_Hdr_RcvR  hdrRcvR, MCList<Srch01_DtlR> dL) {
			copy(down0(), hdrRcvR, createMap_Srch01_HdrR_Srch01_Hdr_RcvR());
			copy(down1(), hdrRcvR, createMap_Srch01_RcvR_Srch01_Hdr_RcvR());
			down2().addAll(dL);	
		}

		/**
		 * 検索下り電文設定　検索結果取得用ブロック(Srch01_Hdr_RcvR) -> 下り電文(Srch01_HdrR)
		 * 
		 * @return
		 */
		protected Map_Srch01_HdrR_Srch01_Hdr_RcvR<Srch01_HdrR,Srch01_Hdr_RcvR> createMap_Srch01_HdrR_Srch01_Hdr_RcvR() {
			return new Map_Srch01_HdrR_Srch01_Hdr_RcvR<Srch01_HdrR, Srch01_Hdr_RcvR>();
		}

		public class Map_Srch01_HdrR_Srch01_Hdr_RcvR<D extends Srch01_HdrR, S extends Srch01_Hdr_RcvR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_HdrR.$trd_cd, Srch01_Hdr_RcvR.$trd_cd);
				addColumnPathMap(Srch01_HdrR.$trd_ptn_typ, Srch01_Hdr_RcvR.$trd_ptn_typ);
				addColumnPathMap(Srch01_HdrR.$trd_nm, Srch01_Hdr_RcvR.$trd_nm);
				addColumnPathMap(Srch01_HdrR.$ac_ym, Srch01_Hdr_RcvR.$ac_ym);
				addColumnPathMap(Srch01_HdrR.$rcv_act_no, Srch01_Hdr_RcvR.$rcv_act_no);
				addColumnPathMap(Srch01_HdrR.$rcv_act_seq, Srch01_Hdr_RcvR.$rcv_act_seq);
				addColumnPathMap(Srch01_HdrR.$rcv_act_rev, Srch01_Hdr_RcvR.$rcv_act_rev);
				addColumnPathMap(Srch01_HdrR.$latest_flg, Srch01_Hdr_RcvR.$latest_flg);
				addColumnPathMap(Srch01_HdrR.$ac_dt, Srch01_Hdr_RcvR.$ac_dt);
				addColumnPathMap(Srch01_HdrR.$bill_basis_dt, Srch01_Hdr_RcvR.$bill_basis_dt);
				addColumnPathMap(Srch01_HdrR.$can_ac_dt, Srch01_Hdr_RcvR.$can_ac_dt);
				addColumnPathMap(Srch01_HdrR.$usr_cd, Srch01_Hdr_RcvR.$usr_cd);
				addColumnPathMap(Srch01_HdrR.$usr_nm, Srch01_Hdr_RcvR.$usr_nm);
				addColumnPathMap(Srch01_HdrR.$dpt_cd, Srch01_Hdr_RcvR.$dpt_cd);
				addColumnPathMap(Srch01_HdrR.$dpt_nm, Srch01_Hdr_RcvR.$dpt_nm);
				addColumnPathMap(Srch01_HdrR.$def_bank_ac_cd, Srch01_Hdr_RcvR.$def_bank_ac_cd);
				addColumnPathMap(Srch01_HdrR.$wg_cd, Srch01_Hdr_RcvR.$wg_cd);
				addColumnPathMap(Srch01_HdrR.$wg_nm, Srch01_Hdr_RcvR.$wg_nm);
				addColumnPathMap(Srch01_HdrR.$rcv_act_upd_cntr, Srch01_Hdr_RcvR.$rcv_act_upd_cntr);
				addColumnPathMap(Srch01_HdrR.$ins_usr_id, Srch01_Hdr_RcvR.$ins_usr_id);
				addColumnPathMap(Srch01_HdrR.$ins_usr_nm, Srch01_Hdr_RcvR.$ins_usr_nm);
				addColumnPathMap(Srch01_HdrR.$ins_func_id, Srch01_Hdr_RcvR.$ins_func_id);
				addColumnPathMap(Srch01_HdrR.$ins_func_nm, Srch01_Hdr_RcvR.$ins_func_nm);
				addColumnPathMap(Srch01_HdrR.$ins_ts, Srch01_Hdr_RcvR.$ins_ts);
				addColumnPathMap(Srch01_HdrR.$upd_usr_id, Srch01_Hdr_RcvR.$upd_usr_id);
				addColumnPathMap(Srch01_HdrR.$upd_usr_nm, Srch01_Hdr_RcvR.$upd_usr_nm);
				addColumnPathMap(Srch01_HdrR.$upd_func_id, Srch01_Hdr_RcvR.$upd_func_id);
				addColumnPathMap(Srch01_HdrR.$upd_func_nm, Srch01_Hdr_RcvR.$upd_func_nm);
				addColumnPathMap(Srch01_HdrR.$upd_ts, Srch01_Hdr_RcvR.$upd_ts);
				addColumnPathMap(Srch01_HdrR.$upd_srv_req_no, Srch01_Hdr_RcvR.$upd_srv_req_no);
			}
		}

		/**
		 *  検索下り電文設定　検索結果取得用ブロック(Srch01_Hdr_RcvR) -> 下り電文(Srch01_RcvR)
		 * 
		 * @return
		 */
		protected Map_Srch01_RcvR_Srch01_Hdr_RcvR<Srch01_RcvR,Srch01_Hdr_RcvR> createMap_Srch01_RcvR_Srch01_Hdr_RcvR() {
			return new Map_Srch01_RcvR_Srch01_Hdr_RcvR<Srch01_RcvR, Srch01_Hdr_RcvR>();
		}

		public class Map_Srch01_RcvR_Srch01_Hdr_RcvR<D extends Srch01_RcvR, S extends Srch01_Hdr_RcvR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RcvR.$rcv_no, Srch01_Hdr_RcvR.$rcv_no);
				addColumnPathMap(Srch01_RcvR.$slo_no, Srch01_Hdr_RcvR.$slo_no);
				addColumnPathMap(Srch01_RcvR.$rcst_cd, Srch01_Hdr_RcvR.$rcst_cd);
				addColumnPathMap(Srch01_RcvR.$old_rcst_cd, Srch01_Hdr_RcvR.$old_rcst_cd);
				addColumnPathMap(Srch01_RcvR.$rcst_nm, Srch01_Hdr_RcvR.$rcst_nm);
				addColumnPathMap(Srch01_RcvR.$rcv_dt, Srch01_Hdr_RcvR.$rcv_dt);
				addColumnPathMap(Srch01_RcvR.$bcst_cd, Srch01_Hdr_RcvR.$bcst_cd);
				addColumnPathMap(Srch01_RcvR.$bcst_nm, Srch01_Hdr_RcvR.$bcst_nm);
				addColumnPathMap(Srch01_RcvR.$old_bcst_cd, Srch01_Hdr_RcvR.$old_bcst_cd);
				addColumnPathMap(Srch01_RcvR.$bill_dpt_cd, Srch01_Hdr_RcvR.$bill_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$bill_dpt_nm, Srch01_Hdr_RcvR.$bill_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$old_bill_dpt_cd, Srch01_Hdr_RcvR.$old_bill_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$trd_cur_cd, Srch01_Hdr_RcvR.$trd_cur_cd);
				addColumnPathMap(Srch01_RcvR.$trd_cur_nm, Srch01_Hdr_RcvR.$trd_cur_nm);
				addColumnPathMap(Srch01_RcvR.$xrate, Srch01_Hdr_RcvR.$xrate);
				addColumnPathMap(Srch01_RcvR.$rcv_amt, Srch01_Hdr_RcvR.$rcv_amt);
				addColumnPathMap(Srch01_RcvR.$not_proc_bal, Srch01_Hdr_RcvR.$not_proc_bal);
				addColumnPathMap(Srch01_RcvR.$not_proc_bal_w, Srch01_Hdr_RcvR.$not_proc_bal_w);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_cd1, Srch01_Hdr_RcvR.$ar_sttl_cd1);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_typ1, Srch01_Hdr_RcvR.$ar_sttl_typ1);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_nm1, Srch01_Hdr_RcvR.$ar_sttl_nm1);
				addColumnPathMap(Srch01_RcvR.$bank_ac_cd, Srch01_Hdr_RcvR.$bank_ac_cd);
				addColumnPathMap(Srch01_RcvR.$bank_ac_nm, Srch01_Hdr_RcvR.$bank_ac_nm);
				addColumnPathMap(Srch01_RcvR.$xfr_psn, Srch01_Hdr_RcvR.$xfr_psn);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_cd2, Srch01_Hdr_RcvR.$ar_sttl_cd2);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_typ2, Srch01_Hdr_RcvR.$ar_sttl_typ2);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_nm2, Srch01_Hdr_RcvR.$ar_sttl_nm2);
				addColumnPathMap(Srch01_RcvR.$sls_purc_typ2, Srch01_Hdr_RcvR.$sls_purc_typ2);
				addColumnPathMap(Srch01_RcvR.$purc_flg, Srch01_Hdr_RcvR.$purc_flg);
				addColumnPathMap(Srch01_RcvR.$sls_flg, Srch01_Hdr_RcvR.$sls_flg);
				addColumnPathMap(Srch01_RcvR.$tax_cd, Srch01_Hdr_RcvR.$tax_cd);
				addColumnPathMap(Srch01_RcvR.$tax_nm, Srch01_Hdr_RcvR.$tax_nm);
				addColumnPathMap(Srch01_RcvR.$tax_rate, Srch01_Hdr_RcvR.$tax_rate);
				addColumnPathMap(Srch01_RcvR.$debt_cred_id_typ, Srch01_Hdr_RcvR.$debt_cred_id_typ);
				addColumnPathMap(Srch01_RcvR.$debt_cred_id_typ_nm, Srch01_Hdr_RcvR.$debt_cred_id_typ_nm);
				addColumnPathMap(Srch01_RcvR.$debt_cred_id_cd, Srch01_Hdr_RcvR.$debt_cred_id_cd);
				addColumnPathMap(Srch01_RcvR.$debt_cred_nm, Srch01_Hdr_RcvR.$debt_cred_nm);
				addColumnPathMap(Srch01_RcvR.$bd_dpt_cd, Srch01_Hdr_RcvR.$bd_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$bd_dpt_nm, Srch01_Hdr_RcvR.$bd_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$rcv_dat_typ, Srch01_Hdr_RcvR.$rcv_dat_typ);
				addColumnPathMap(Srch01_RcvR.$rcv_dat_typ_nm, Srch01_Hdr_RcvR.$rcv_dat_typ_nm);
				addColumnPathMap(Srch01_RcvR.$adv_trd_cd, Srch01_Hdr_RcvR.$adv_trd_cd);
				addColumnPathMap(Srch01_RcvR.$adv_trd_nm, Srch01_Hdr_RcvR.$adv_trd_nm);
				addColumnPathMap(Srch01_RcvR.$trd_rmrks, Srch01_Hdr_RcvR.$trd_rmrks);
				addColumnPathMap(Srch01_RcvR.$sub_char1, Srch01_Hdr_RcvR.$sub_char1);
				addColumnPathMap(Srch01_RcvR.$sub_char2, Srch01_Hdr_RcvR.$sub_char2);
				addColumnPathMap(Srch01_RcvR.$sub_char3, Srch01_Hdr_RcvR.$sub_char3);
				addColumnPathMap(Srch01_RcvR.$note_mng_no, Srch01_Hdr_RcvR.$note_mng_no);
				addColumnPathMap(Srch01_RcvR.$note_no, Srch01_Hdr_RcvR.$note_no);
				addColumnPathMap(Srch01_RcvR.$note_typ, Srch01_Hdr_RcvR.$note_typ);
				addColumnPathMap(Srch01_RcvR.$note_typ_nm, Srch01_Hdr_RcvR.$note_typ_nm);
				addColumnPathMap(Srch01_RcvR.$draw_dt, Srch01_Hdr_RcvR.$draw_dt);
				addColumnPathMap(Srch01_RcvR.$due_dt, Srch01_Hdr_RcvR.$due_dt);
				addColumnPathMap(Srch01_RcvR.$drawer_nm, Srch01_Hdr_RcvR.$drawer_nm);
				addColumnPathMap(Srch01_RcvR.$endrsr, Srch01_Hdr_RcvR.$endrsr);
				addColumnPathMap(Srch01_RcvR.$accptr, Srch01_Hdr_RcvR.$accptr);
				addColumnPathMap(Srch01_RcvR.$draw_bank_cd, Srch01_Hdr_RcvR.$draw_bank_cd);
				addColumnPathMap(Srch01_RcvR.$draw_bank_nm, Srch01_Hdr_RcvR.$draw_bank_nm);
				addColumnPathMap(Srch01_RcvR.$draw_branch_cd, Srch01_Hdr_RcvR.$draw_branch_cd);
				addColumnPathMap(Srch01_RcvR.$draw_branch_nm, Srch01_Hdr_RcvR.$draw_branch_nm);
				addColumnPathMap(Srch01_RcvR.$note_rsn_cd, Srch01_Hdr_RcvR.$note_rsn_cd);
				addColumnPathMap(Srch01_RcvR.$note_rsn_nm, Srch01_Hdr_RcvR.$note_rsn_nm);
				addColumnPathMap(Srch01_RcvR.$note_sub_char1, Srch01_Hdr_RcvR.$note_sub_char1);
				addColumnPathMap(Srch01_RcvR.$note_sub_char2, Srch01_Hdr_RcvR.$note_sub_char2);
				addColumnPathMap(Srch01_RcvR.$note_sub_char3, Srch01_Hdr_RcvR.$note_sub_char3);
				addColumnPathMap(Srch01_RcvR.$setoff_rcv_no, Srch01_Hdr_RcvR.$setoff_rcv_no);
				addColumnPathMap(Srch01_RcvR.$setoff_bcst_cd, Srch01_Hdr_RcvR.$setoff_bcst_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_bcst_nm, Srch01_Hdr_RcvR.$setoff_bcst_nm);
				addColumnPathMap(Srch01_RcvR.$old_setoff_bcst_cd, Srch01_Hdr_RcvR.$old_setoff_bcst_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_dt, Srch01_Hdr_RcvR.$setoff_dt);
				addColumnPathMap(Srch01_RcvR.$setoff_trd_cur_cd, Srch01_Hdr_RcvR.$setoff_trd_cur_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_trd_cur_nm, Srch01_Hdr_RcvR.$setoff_trd_cur_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_xrate, Srch01_Hdr_RcvR.$setoff_xrate);
				addColumnPathMap(Srch01_RcvR.$setoff_rcv_amt, Srch01_Hdr_RcvR.$setoff_rcv_amt);
				addColumnPathMap(Srch01_RcvR.$setoff_not_proc_bal, Srch01_Hdr_RcvR.$setoff_not_proc_bal);
				addColumnPathMap(Srch01_RcvR.$setoff_not_proc_bal_w, Srch01_Hdr_RcvR.$setoff_not_proc_bal_w);
				addColumnPathMap(Srch01_RcvR.$setoff_sttl_cd, Srch01_Hdr_RcvR.$setoff_sttl_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_sttl_typ, Srch01_Hdr_RcvR.$setoff_sttl_typ);
				addColumnPathMap(Srch01_RcvR.$setoff_sttl_nm, Srch01_Hdr_RcvR.$setoff_sttl_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_sls_purc_typ, Srch01_Hdr_RcvR.$setoff_sls_purc_typ);
				addColumnPathMap(Srch01_RcvR.$setoff_purc_flg, Srch01_Hdr_RcvR.$setoff_purc_flg);
				addColumnPathMap(Srch01_RcvR.$setoff_sls_flg, Srch01_Hdr_RcvR.$setoff_sls_flg);
				addColumnPathMap(Srch01_RcvR.$setoff_tax_cd, Srch01_Hdr_RcvR.$setoff_tax_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_tax_nm, Srch01_Hdr_RcvR.$setoff_tax_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_tax_rate, Srch01_Hdr_RcvR.$setoff_tax_rate);
				addColumnPathMap(Srch01_RcvR.$setoff_debt_cred_id_typ, Srch01_Hdr_RcvR.$setoff_debt_cred_id_typ);
				addColumnPathMap(Srch01_RcvR.$setoff_debt_cred_id_typ_nm, Srch01_Hdr_RcvR.$setoff_debt_cred_id_typ_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_debt_cred_id_cd, Srch01_Hdr_RcvR.$setoff_debt_cred_id_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_debt_cred_nm, Srch01_Hdr_RcvR.$setoff_debt_cred_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_bd_dpt_cd, Srch01_Hdr_RcvR.$setoff_bd_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$setoff_bd_dpt_nm, Srch01_Hdr_RcvR.$setoff_bd_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_rcv_dat_typ, Srch01_Hdr_RcvR.$setoff_rcv_dat_typ);
				addColumnPathMap(Srch01_RcvR.$setoff_rcv_dat_typ_nm, Srch01_Hdr_RcvR.$setoff_rcv_dat_typ_nm);
				addColumnPathMap(Srch01_RcvR.$setoff_trd_rmrks, Srch01_Hdr_RcvR.$setoff_trd_rmrks);
				addColumnPathMap(Srch01_RcvR.$setoff_sub_char1, Srch01_Hdr_RcvR.$setoff_sub_char1);
				addColumnPathMap(Srch01_RcvR.$setoff_sub_char2, Srch01_Hdr_RcvR.$setoff_sub_char2);
				addColumnPathMap(Srch01_RcvR.$setoff_sub_char3, Srch01_Hdr_RcvR.$setoff_sub_char3);
				addColumnPathMap(Srch01_RcvR.$amt_dec_place, Srch01_Hdr_RcvR.$amt_dec_place);
				addColumnPathMap(Srch01_RcvR.$upri_dec_place, Srch01_Hdr_RcvR.$upri_dec_place);
				addColumnPathMap(Srch01_RcvR.$rcv_upd_cntr, Srch01_Hdr_RcvR.$rcv_upd_cntr);
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 参照する入金情報を検索する<br>
	 */
	public class Srch02 extends MSBGL_ArApplReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 入金情報の検索
			Srch02_HdrR hR = getHdr();

			if (!chkHdr(hR)) {
				return;
			}

			// 前受仮受対応取引の設定
			setAdvRcv(hR);

			// 電文の設定
			MCRow.copyall(down0(), hR);
		}

		/**
		 * 入金情報を取得する
		 * 
		 * @return 入金情報
		 */
		protected Srch02_HdrR getHdr() {

			Srch02_HdrR hR = Srch02_HdrR.create();
			hR.addBooleanColumn("inc_tax_flg");
			executeQuery(hR, MSBGL0210_MST_RCV_S01(), up0());
			setTaxCd(hR);
			setPurcSlsFlg(hR);

			return hR;
		}

		protected void setTaxCd(Srch02_HdrR hR) {
			if (isNull(hR)) {
				return;
			}
			if (!isNull(hR.tax_cd()) && !hR.getBoolean("inc_tax_flg")) {
				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				MAM_TAX_R t = MAM_TAX_R.create("T");
				MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
				taxL_bldr.setSelect(t.tax_cd);
				taxL_bldr.addSelect(t.tax_nm);
				taxL_bldr.addSelect(t.tax_rate);
				taxL_bldr.setWhere(t.inc_tax_flg.eq(value(true)));
				taxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), hR.tax_rate());
				if (MAC_SLS_PURC_TYP.isPURC(hR.sls_purc_typ2())) {
					taxL_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
				}
				else if (MAC_SLS_PURC_TYP.isSLS(hR.sls_purc_typ2())) {
					taxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
				}
				taxL_bldr.setOrderByAsc(t.tax_cd);
				int cnt = dbSelect("MSBGL0210_MAM_TAX_S01", taxL, taxL_bldr);
				
				if (cnt == 0) {
					hR.tax_cd(null);
					hR.tax_nm(null);
					hR.tax_rate(null);
					hR.sls_purc_typ2(null);
				}
				else {
					MAM_TAX_R taxR = taxL.get(0);
					hR.tax_cd(taxR.tax_cd());
					hR.tax_nm(taxR.tax_nm());
					hR.tax_rate(taxR.tax_rate());
				}
			}
		}
		/**
		 * 売上仕入税区分に応じて売上ＦＬＧ、仕入ＦＬＧをセットする。
		 * @param hR
		 * @return
		 */
		protected void setPurcSlsFlg(Srch02_HdrR hR) {
			if (isNull(hR)) {
				return;
			}

			// 売上仕入税区分
			if (MAC_SLS_PURC_TYP.isPURC(hR.sls_purc_typ2())) {
				hR.purc_flg(true);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(hR.sls_purc_typ2())) {
				hR.sls_flg(true);
			}
		}

		protected boolean chkHdr(Srch02_HdrR hR) {

			if (hR.isEmpty()) {
				return false;
			}

			if (MSC_RCV_DAT_TYP.isAP(hR.rcv_dat_typ())) {
				throw new MCAppException(up0(), null, MSBGL0088);
			}
			if (!(MSC_RCV_DAT_TYP.isRCV(hR.rcv_dat_typ())
					|| MSC_RCV_DAT_TYP.isADV(hR.rcv_dat_typ())
					|| MSC_RCV_DAT_TYP.isSUSP(hR.rcv_dat_typ()))) {
				throw new MCAppException(up0(), null, MSBGL0003);
			}
			// 振出日 ＞ 運用日付の場合は処理不可
			if (!isNull(hR.draw_dt()) && hR.draw_dt().gt(getToday())) {
				throw new MCAppException(up0(), null, MSBGL0090);
			}
			// 未処理額
			if (hR.not_proc_bal().isZero()) {
				throw new MCAppException(up0(), null, MSBGL0091);
			}
			return true;
		}

		/**
		 * 前受仮受の入金情報を参照している場合は対応する取引を設定する
		 * 
		 * @param hR 入金実績ヘッダ
		 */
		protected void setAdvRcv(Srch02_HdrR  hdrRcvR) {
			if (MSC_RCV_DAT_TYP.isADV(hdrRcvR.rcv_dat_typ()) || MSC_RCV_DAT_TYP.isSUSP(hdrRcvR.rcv_dat_typ())) {
				MST_RCV_ACT_R r = srchAdvRcv(hdrRcvR);
	
				hdrRcvR.adv_trd_cd(r.getStringNE(MST_RCV_ACT_R.$trd_cd));
				hdrRcvR.adv_trd_nm(r.getStringNE("trd_nm"));
			}
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 消込情報を検索する<br>
	 */
	public class Srch03 extends MSBGL_ArApplReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			// 前処理
			pre();

			// 検索
			srch();
		}

		/**
		 * 前処理
		 * 
		 */
		protected void pre() {
			up0().bcst_cd(!isNull(up0().rcst_cd()) ? up0().bcst_cd() : up0().setoff_bcst_cd());
			up0().trd_cur_cd(!isNull(up0().rcst_cd()) ? up0().trd_cur_cd() : up0().setoff_trd_cur_cd());

			// 請求先指定ＦＬＧを設定する
			// 請求先指定ＦＬＧがオンの場合は入金先に紐づく請求先すべての売掛消込予定を検索する
			up0().addBooleanColumn("not_bcst_flg", false);
			if (isNull(up0().bcst_cd())) {
				up0().setBoolean("not_bcst_flg", true);
			}
		}

		/**
		 * 消込情報の検索を行う
		 */
		protected void srch() {
			// 入金実績がある場合
			if (!isNull(up0().rcv_act_no())) {
				executeQuery(down0(), MSBGL0210_MST_RCV_ACT_D_S01(), up0());
			}
			MCList<Srch03_DtlR> dL = MCList.create(Srch03_DtlR.class);
			// 相殺以外
			if (!MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0().trd_ptn_typ())){
				executeQuery(dL, MSBGL0210_MST_AR_APPL_SCHD_S01(), up0());
			}
			// 相殺
			else {
				executeQuery(dL, MSBGL0210_MST_AR_APPL_SCHD_S02(), up0());
			}
			down0().addAll(dL);

			if (!isNull(up0().slo_no())) {
				editOtherSloFlg(down0(), up0().slo_no());
			}
			setArDpt(down0());
		}

		/**
		 * 債権部門名を補完する
		 * @param dL
		 */
		protected void setArDpt(MCList<Srch03_DtlR> dL) {
			for (Srch03_DtlR dtlR : dL) {
				if (isNull(dtlR.ar_dpt_nm())) {
					MSBGL_ArUtil.setLastDpt(dtlR, Srch01_DtlR.$ar_dpt_cd, Srch01_DtlR.$ar_dpt_nm);
				}
			}
		}

		/**
		 * 受注に紐付く明細かどうかを判断して、他受注ＦＬＧを設定する
		 * 
		 * @param dL 明細情報
		 * @param sloNo 受注ＮＯ 
		 */
		protected void editOtherSloFlg(MCList<Srch03_DtlR> dL, String sloNo) {
			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
			billDL_bldr.setSelect(t.bill_mng_no);
			billDL_bldr.setWhere(t.bill_mng_no.eq(bind("bill_mng_no")));
			billDL_bldr.addWhereWithAnd(t.slo_no.eq(bind("1")), sloNo);
			dbSelect("MSBGL0210_MST_BILL_D_S02", billDL, billDL_bldr, dL);

			for (Srch03_DtlR r : dL) {
				MCList<MST_BILL_D_R> subL = billDL.subList(Srch03_DtlR.$bill_mng_no, r.bill_mng_no());
				if (subL.size() == 0) {
					r.other_slo_flg(true);
				}
				else {
					r.other_slo_flg(false);
				}
			}
		}
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * 買掛金相殺の入金を検索する<br>
	 */
	public class Srch04 extends MSBGL_ArApplReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 入金情報の検索
			Srch04_HdrR hR = getHdr();

			if (!chkHdr(hR)) {
				return;
			}

			// 電文の設定
			MCRow.copyall(down0(), hR);
		}

		/**
		 * 入金実績ヘッダを取得する
		 * 
		 * @return 入金実績ヘッダ
		 */
		protected Srch04_HdrR getHdr() {
			Srch04_HdrR hR = Srch04_HdrR.create();
			hR.addBooleanColumn("setoff_inc_tax_flg");
			// 入金実績伝票の検索
			executeQuery(hR, MSBGL0210_MST_RCV_S02(), up0());
			setTaxCd(hR);
			return hR;
		}

		protected void setTaxCd(Srch04_HdrR hR) {
			if (isNull(hR)) {
				return;
			}
			if (!isNull(hR.setoff_tax_cd()) && !hR.getBoolean("setoff_inc_tax_flg")) {
				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				MAM_TAX_R t = MAM_TAX_R.create("T");
				MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
				taxL_bldr.setSelect(t.tax_cd);
				taxL_bldr.addSelect(t.tax_nm);
				taxL_bldr.addSelect(t.tax_rate);
				taxL_bldr.setWhere(t.inc_tax_flg.eq(value(true)));
				taxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), hR.setoff_tax_rate());
				if (MAC_SLS_PURC_TYP.isPURC(hR.setoff_sls_purc_typ())) {
					taxL_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
				}
				else if (MAC_SLS_PURC_TYP.isSLS(hR.setoff_sls_purc_typ())) {
					taxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
				}
				taxL_bldr.setOrderByAsc(t.tax_cd);
				int cnt = dbSelect("MSBGL0210_MAM_TAX_S02", taxL, taxL_bldr);
				
				if (cnt == 0) {
					hR.setoff_tax_cd(null);
					hR.setoff_tax_nm(null);
					hR.setoff_tax_rate(null);
					hR.setoff_sls_purc_typ(null);
				}
				else {
					MAM_TAX_R taxR = taxL.get(0);
					hR.setoff_tax_cd(taxR.tax_cd());
					hR.setoff_tax_nm(taxR.tax_nm());
					hR.setoff_tax_rate(taxR.tax_rate());
				}
			}
		}
		/**
		 * 相殺売上仕入税区分に応じて相殺売上ＦＬＧ，相殺仕入ＦＬＧをセットする。
		 * @param hR
		 * @return
		 */
		protected void setPurcSlsFlg(Srch04_HdrR hR) {
			if (isNull(hR)) {
				return;
			}

			// 相殺売上仕入税区分
			if (MAC_SLS_PURC_TYP.isPURC(hR.setoff_sls_purc_typ())) {
				hR.setoff_purc_flg(true);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(hR.setoff_sls_purc_typ())) {
				hR.setoff_sls_flg(true);
			}
		}

		protected boolean chkHdr(Srch04_HdrR hR) {

			if (hR.isEmpty()) {
				return false;
			}

			if (!MSC_RCV_DAT_TYP.isAP(hR.setoff_rcv_dat_typ())) {
				throw new MCAppException(up0(), null, MSBGL0088);
			}

			// 未処理額
			if (hR.setoff_not_proc_bal().isZero()) {
				throw new MCAppException(up0(), null, MSBGL0091);
			}
			return true;
		}
	}

	/**
	 * 処理可能な取引区分かどうかを判断する<p>
	 * 「売上代金入金」「前受金売掛金相殺」「その他勘定売掛金相殺」「仮受金売掛金相殺」のみ処理が可能
	 *
	 * @param trdTyp 取引区分
	 * @return 処理可否
	 */
	protected boolean isProcessable(String trdTyp) {

		return (MAC_TRD_PTN_TYP.isRCV_AR(trdTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdTyp));
	}

	/**
	 * 前受伝票明細情報を取得する
	 * 
	 * @param cndR 検索条件（項目にrcv_idを含むコンテナ）
	 * @return 前受伝票明細
	 */
	protected MST_RCV_ACT_R srchAdvRcv(MCRow cndR) {

		MCList<MST_RCV_ACT_R> rcvActL = MCList.create(MST_RCV_ACT_R.class);
		MST_RCV_ACT_R rcvActL_t = MST_RCV_ACT_R.create("T");
		MCQueryApiBuilder rcvActL_bldr = MCQueryApiBuilder.create(rcvActL_t);
		setAdvRcvCnd(rcvActL, rcvActL_t, rcvActL_bldr);
		dbSelect("MSBGL0210_MST_RCV_ACT_S01", rcvActL, rcvActL_bldr, cndR);

		if (rcvActL.isEmpty()) {
			return null;
		}

		return rcvActL.get(0);
	}

	/**
	 * 前受伝票明細情報を取得するための条件を設定する
	 * 
	 * @param arSlipDL 設定対象のDBC
	 */
	protected void setAdvRcvCnd(MCList<MST_RCV_ACT_R> arSlipDL,
			MST_RCV_ACT_R arSlipDL_t, MCQueryApiBuilder arSlipDL_bldr) {
		MST_RCV_R rcv1 = MST_RCV_R.create("RCV1");
		MAM_TRD_R trd1 = MAM_TRD_R.create("TRD1");
		arSlipDL_bldr.setSelect(arSlipDL_t.trd_cd);
		arSlipDL_bldr.addSelect(trd1.trd_nm.as("trd_nm"));
		arSlipDL_bldr.addInnerJoin(rcv1, bracket(arSlipDL_t.rcv_act_no.eq(rcv1.src_rcv_act_no)));
		arSlipDL_bldr.addLeftOuterJoin(trd1, bracket(arSlipDL_t.trd_cd.eq(trd1.trd_cd)));
		arSlipDL_bldr.addWhereWithAnd(rcv1.rcv_no.eq(bind("rcv_no")));
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売掛消込の入金実績を登録・訂正する前のチェックを行う<br>
	 */
	public class Chk01 extends MSBGL_ArApplReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUp() {
			super.initUp();
			up0().rcv_dt(up1().rcv_dt());
			up0().setoff_dt(up1().setoff_dt());
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callRcvActCmnChkSrv();
			}
			setDown();
		}

		/**
		 * 入金実績共通サービスのチェック処理を実行する
		 */
		protected void callRcvActCmnChkSrv() {
			MSBGL_RcvActCmnService.RcvActCmn_Chk01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk01();
			
			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up1(), up0(), createMap_RcvActCmn_Chk01_HdrR_RcvR());

			for (DtlR tmp :up2()) {
				RcvActCmn_Chk01_DtlR dtlR = RcvActCmn_Chk01_DtlR.create();
				copy(dtlR, tmp, createMap_RcvActCmn_Chk01_DtlR_DtlR());
				ope.up1().add(dtlR);
			}

			ope.up0().add(hdrR);
			ope.exec();

			copyErrFlg(up1(), ope.down0().get(0));
		}

		@Override
		protected MCMessageList doServerCheck(MCNumber paramIndex, MCList<? extends MCConstRow> chkTarL, List<MCController> opes) {
			MCMessageList msgL = new MCMessageList();
			if (chkTarL.get(0) instanceof DtlR) {
				msgL = super.doServerCheck(paramIndex, chkTarL.subList(DtlR.$check, true), opes);
			}
			else {
				msgL = super.doServerCheck(paramIndex, chkTarL, opes);
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());

			// 入金引継時の補完
			compBase(up1());

			// 売掛消込対象に必要なデータの保管
			getDtlInfo(up2());

			up1().xrate_cd(getCo().sls_xrate_cd());
			up1().setoff_xrate_cd(getCo().sls_xrate_cd());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(rcvLock(up1()));
			msgL.addAll(rcvActLock(up0()));

			// ロック対象は消込対象の行（訂正していない行を含む）+消込解消の行
			MCList<BillDR> tmpUp3 = MCList.create(BillDR.class);
			for (DtlR uR :up2()) {
				MCList<BillDR> l = up3().subList(BillDR.$grp_seq, uR.grp_seq());
				tmpUp3.addAll(l);
			}

			msgL.addAll(applSchdLock(up2()));
			msgL.addAll(billDLock(tmpUp3));
			return msgL;
		}

		/**
		 * 入金情報のロック
		 * @param up1
		 * @return
		 */
		protected MCMessageList rcvLock(RcvR up1) {
			MCMessageList msgL = new MCMessageList();

			// 入金ＮＯが存在する場合、入金を検索してロックする。
			if (isNull(up1.rcv_no()) && isNull(up1.setoff_rcv_no())) {
				return msgL;
			}

			MST_RCV_R rcvR = MST_RCV_R.create();
			MST_RCV_R rcvR_t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR_t);

			if (!isNull(up1.rcv_no())) {
				rcvR_bldr.setWhere(rcvR_t.rcv_no.eq(bind("1")), up1.rcv_no());
			}
			else {
				rcvR_bldr.setWhere(rcvR_t.rcv_no.eq(bind("1")), up1.setoff_rcv_no());
			}
			dbSelectForUpdateNoWait("MSBGL0210_MST_RCV_S01", rcvR, rcvR_bldr);
			msgL.addAll(checkUpdCntrNE(up1, RcvR.$rcv_upd_cntr, rcvR));

			// 入金情報をキャッシュ
			initRcvCache(rcvR, rcvR_t, rcvR_bldr);

			return msgL;
		}

		/**
		 * 入金実績情報のロック
		 * 
		 * @param up0
		 * @return
		 */
		protected MCMessageList rcvActLock(HdrR up0) {
			MCMessageList msgL = new MCMessageList();

			// 入金実績ＮＯが存在する場合（更新時）、ロックする。
			if (isNull(up0.rcv_act_no())) {
				return msgL;
			}

			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
			MST_RCV_ACT_R rcvActR_t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR_t);
			rcvActR_bldr.setSelect(rcvActR_t.rcv_act_no);
			rcvActR_bldr.addSelect(rcvActR_t.rcv_act_seq);
			rcvActR_bldr.addSelect(rcvActR_t.slip_sts_typ);
			rcvActR_bldr.addSelect(rcvActR_t.trd_ptn_typ);
			rcvActR_bldr.addSelect(rcvActR_t.upd_cntr);
			rcvActR_bldr.addSelect(rcvActR_t.dpt_cd);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_RCV_ACT_S02", rcvActR, rcvActR_bldr, up0);
			msgL.addAll(checkUpdCntrNE(up0, HdrR.$rcv_act_upd_cntr, rcvActR));

			// 更新前入金実績情報をキャッシュ
			initOrgRcvActCache(rcvActR, rcvActR_t, rcvActR_bldr);
			return msgL;
		}

		/**
		 * 売掛消込予定のロック
		 * @param up2
		 * @return
		 */
		protected MCMessageList applSchdLock(MCList<DtlR> up2) {
			MCMessageList msgL = new MCMessageList();

			// 売掛消込予定ＮＯをもとに売掛消込予定を検索してロックする。
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder arApplSchdL_bldr = MCQueryApiBuilder.create(t);
			arApplSchdL_bldr.setSelect(t.ar_appl_schd_no);
			arApplSchdL_bldr.addSelect(t.not_appl_bal);
			arApplSchdL_bldr.addSelect(t.upd_cntr);

			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_AR_APPL_SCHD_S01", arApplSchdL, arApplSchdL_bldr, up2);

			MCIndexKey idxkey = arApplSchdL.createIndex(MST_AR_APPL_SCHD_R.$ar_appl_schd_no);
			for (DtlR dtlR: up2) {
				MST_AR_APPL_SCHD_R arApplSchdR = arApplSchdL.getFirst(idxkey, dtlR.ar_appl_schd_no());
				msgL.addAll(checkUpdCntrNE(dtlR, DtlR.$ar_appl_schd_upd_cntr, arApplSchdR));
			}
			return msgL;
		}

		/**
		 * 請求明細、請求明細消込残高のロック
		 * @param up3
		 * @return
		 */
		protected MCMessageList billDLock(MCList<BillDR> up3) {
			MCMessageList msgL = new MCMessageList();
			if (up3.isEmpty()) {
				return msgL;
			}

			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R billDL_t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(billDL_t);
			billDL_bldr.setSelect(billDL_t.bill_d_no);
			billDL_bldr.addSelect(billDL_t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_BILL_D_S03", billDL, billDL_bldr, up3);

			MCIndexKey idxkey = billDL.createIndex(MST_BILL_D_R.$bill_d_no);
			for (BillDR billDR: up3) {
				MST_BILL_D_R r = billDL.getFirst(idxkey, billDR.bill_d_no());
				msgL.addAll(checkUpdCntrNE(billDR, BillDR.$bill_d_upd_cntr, r));
			}

			MCList<MST_BILL_D_APPL_BAL_R> billDApplBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
			MST_BILL_D_APPL_BAL_R billDApplBalL_t = MST_BILL_D_APPL_BAL_R.create("T");
			MCQueryApiBuilder billDApplBalL_bldr = MCQueryApiBuilder.create(billDApplBalL_t);
			billDApplBalL_bldr.setSelect(billDApplBalL_t.bill_d_no);
			billDApplBalL_bldr.addSelect(billDApplBalL_t.parent_bill_d_no);
			billDApplBalL_bldr.addSelect(billDApplBalL_t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_BILL_D_APPL_BAL_S01", billDApplBalL, billDApplBalL_bldr, up3);

			MCIndexKey idxkey2 = billDApplBalL.createIndex(MST_BILL_D_APPL_BAL_R.$bill_d_no, MST_BILL_D_APPL_BAL_R.$parent_bill_d_no);
			for (BillDR billDR: up3) {
				MST_BILL_D_APPL_BAL_R r = billDApplBalL.getFirst(idxkey2, billDR.bill_d_no(), billDR.parent_bill_d_no());
				msgL.addAll(checkUpdCntrNE(billDR, BillDR.$bill_d_appl_bal_upd_cntr, r));
			}

			return msgL;
		}

		/**
		 * 入金引継時の補完
		 * 
		 * 入金引継ぎの場合、入力不可項目と補完項目については入金トランから取得する。
		 */
		protected void compBase(RcvR up1) {
			if (!isNull(up1.rcv_no())) {
				setRcvInfo(up1);
			}
			else if (!isNull(up1.setoff_rcv_no())){
				setSetOffRcvInfo(up1);
			}
		}

		/**
		 * 入金ＮＯから入金情報を設定する。
		 * @param up1
		 */
		protected void setRcvInfo(RcvR up1) {
			MST_RCV_R rcvR = getRcvCache(up1.rcv_no());

			up1.slo_no(rcvR.slo_no());
			up1.rcv_dt(rcvR.rcv_dt());
			up1.trd_cur_cd(rcvR.trd_cur_cd());
			up1.xrate(rcvR.xrate());
			up1.xrate_cd(rcvR.xrate_cd());
			up1.rcv_amt(rcvR.rcv_amt());
			up1.ar_sttl_cd1(rcvR.rcv_mtd_cd());
			up1.ar_sttl_typ1(rcvR.rcv_typ());
			up1.bank_ac_cd(rcvR.bank_ac_cd());
			up1.xfr_psn(rcvR.xfr_psn());

			// 入金先、請求先、請求部門は、入金情報の各項目がNull以外の時に入力不可
			// そのため、入金情報を参照してNullかどうかにより取得するか判断する。
			if (!isNull(rcvR.rcst_cd())) {
				up1.rcst_cd(rcvR.rcst_cd());
			}
			if (!isNull(rcvR.bcst_cd())) {
				up1.bcst_cd(rcvR.bcst_cd());
			}
			if (!isNull(rcvR.bill_dpt_cd())) {
				up1.bill_dpt_cd(rcvR.bill_dpt_cd());
			}
		}

		/**
		 * 相殺入金ＮＯから相殺入金情報を設定する。
		 * @param up1
		 */
		protected void setSetOffRcvInfo(RcvR up1) {
			MST_RCV_R rcvR = getRcvCache(up1.setoff_rcv_no());

			up1.slo_no(rcvR.slo_no());
			up1.setoff_dt(rcvR.rcv_dt());
			up1.setoff_trd_cur_cd(rcvR.trd_cur_cd());
			up1.setoff_xrate(rcvR.xrate());
			up1.setoff_xrate_cd(rcvR.xrate_cd());
			up1.setoff_rcv_amt(rcvR.rcv_amt());
			up1.setoff_sttl_cd1(rcvR.rcv_mtd_cd());
			up1.setoff_sttl_typ1(rcvR.rcv_typ());

			// 相殺先は、入金情報の各項目がNull以外の時に入力不可
			// そのため、入金情報を参照してNullかどうかにより取得するか判断する。
			if (!isNull(rcvR.bcst_cd())) {
				up1.setoff_bcst_cd(rcvR.bcst_cd());
			}
		}

		/**
		 * 売掛消込対象に必要なデータの保管
		 * 
		 */
		protected void getDtlInfo(MCList<DtlR> up2) {

			MCList<MST_AR_APPL_SCHD_R> arApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_AR_APPL_SCHD_R arApplSchdL_t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder arApplSchdL_bldr = MCQueryApiBuilder.create(arApplSchdL_t);
			MST_BILL_ACST_R acst1 = MST_BILL_ACST_R.create("ACST1");
			MST_BILL_R bill1 = MST_BILL_R.create("BILL1");
			MAM_STTL_R sttl1 = MAM_STTL_R.create("STTL1");
			arApplSchdL_bldr.setSelect(arApplSchdL_t.ar_appl_schd_no);
			arApplSchdL_bldr.addSelect(arApplSchdL_t.iv_no);
			arApplSchdL_bldr.addSelect(arApplSchdL_t.ar_typ);
			arApplSchdL_bldr.addSelect(arApplSchdL_t.not_appl_bal);
			arApplSchdL_bldr.addSelect(arApplSchdL_t.rcv_mtd_cd.as("ar_sttl_cd1"));
			arApplSchdL_bldr.addSelect(acst1.acst_cd);
			arApplSchdL_bldr.addSelect(acst1.ar_dpt_cd);
			arApplSchdL_bldr.addSelect(bill1.bcst_cd);
			arApplSchdL_bldr.addSelect(bill1.bill_dpt_cd);
			arApplSchdL_bldr.addSelect(sttl1.ar_sttl_typ.as("ar_sttl_typ1"));
			arApplSchdL_bldr.addSelect(bill1.wrk_no);
			arApplSchdL_bldr.addSelect(bill1.bill_mng_no);

			arApplSchdL_bldr.addLeftOuterJoin(acst1, acst1.bill_acst_no.eq(arApplSchdL_t.bill_acst_no));
			arApplSchdL_bldr.addLeftOuterJoin(bill1, bill1.bill_mng_no.eq(acst1.bill_mng_no));
			arApplSchdL_bldr.addLeftOuterJoin(sttl1, sttl1.sttl_cd.eq(arApplSchdL_t.rcv_mtd_cd));

			dbSelectKey("MSBGL0210_MST_AR_APPL_SCHD_S02", arApplSchdL, arApplSchdL_bldr, up2);

			MCIndexKey key = arApplSchdL.createIndex(MST_AR_APPL_SCHD_R.$ar_appl_schd_no);
			for (DtlR r : up2()) {
				MST_AR_APPL_SCHD_R tgtR = arApplSchdL.getFirst(key, r.ar_appl_schd_no());
				if(isNull(tgtR)){
					continue;
				}

				r.iv_no(tgtR.iv_no());
				r.ar_typ(tgtR.ar_typ());
				r.ar_sttl_cd1(tgtR.getStringNE("ar_sttl_cd1"));

				r.acst_cd(tgtR.getStringNE("acst_cd"));
				r.ar_dpt_cd(tgtR.getStringNE("ar_dpt_cd"));
				r.bcst_cd(tgtR.getStringNE("bcst_cd"));
				r.bill_dpt_cd(tgtR.getStringNE("bill_dpt_cd"));
				r.ar_sttl_typ1(tgtR.getStringNE("ar_sttl_typ1"));
				r.wrk_no(tgtR.getStringNE("wrk_no"));
				r.bill_mng_no(tgtR.getStringNE("bill_mng_no"));

				r.not_appl_bal(tgtR.not_appl_bal());

				// 源泉税のチェック用に更新前の相殺額を補完
				MST_AR_APPL_ACT_R arApplActR = MST_AR_APPL_ACT_R.create();
				MST_AR_APPL_ACT_R arApplActR_t = MST_AR_APPL_ACT_R.create("T");
				MCQueryApiBuilder arApplActR_bldr = MCQueryApiBuilder.create(arApplActR_t);
				MST_RCV_ACT_D_R t2 = MST_RCV_ACT_D_R.create("T2");
				MST_RCV_ACT_R t3 = MST_RCV_ACT_R.create("T3");
				arApplActR_bldr.addInnerJoin(t2,
						bracket(arApplActR_t.rcv_act_d_no.eq(t2.rcv_act_d_no)
								.and(arApplActR_t.rcv_act_d_seq.eq(t2.rcv_act_d_seq))));
				arApplActR_bldr.addInnerJoin(t3,
						bracket(t2.rcv_act_no.eq(t3.rcv_act_no)
								.and(t2.rcv_act_seq.eq(t3.rcv_act_seq))));
				arApplActR_bldr.addWhereWithAnd(
						t3.rcv_act_no.eq(bind("1")), up0().rcv_act_no());
				arApplActR_bldr.addWhereWithAnd(
						t3.rcv_act_seq.eq(bind("1")), up0().rcv_act_seq());
				arApplActR_bldr.addWhereWithAnd(
						arApplActR_t.ar_appl_schd_no.eq(bind("1")), r.ar_appl_schd_no());
				arApplActR_bldr.addWhereWithAnd(
						arApplActR_t.rcv_mtd_cd.eq(t3.ar_sttl_cd2));
				dbSelect("MSBGL0210_MST_AR_APPL_ACT_S01", arApplActR, arApplActR_bldr);
				r.setoff_amt(nvl(arApplActR.appl_amt(), MCNumber.ZERO));
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<HdrR> notErrHdrL = getChkList(up0());
			MCList<RcvR> notErrRcvL = getChkList(up1());
			MCList<DtlR> notErrDtlL = getChkList(up2());
			MCList<BillDR> notErrBillDL = getChkList(up3());

			if (notErrHdrL.isEmpty() || notErrRcvL.isEmpty()) {
				return msgL;
			}

			HdrR notErrHdrR = notErrHdrL.get(0);
			RcvR notErrRcvR = notErrRcvL.get(0);

			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrHdrR, HdrR.$dpt_cd));
			// 更新の場合は変更前のＤＡＣチェックも行う。
			if (!isNull(up0().rcv_act_no())) {
				msgL.addAll(checkWritableDptCdDac(getOrgRcvActCache(notErrHdrR.rcv_act_no(), notErrHdrR.rcv_act_seq()), MST_RCV_ACT_R.$dpt_cd));
			}

			msgL.addAll(chkReq(notErrHdrR, notErrRcvR));

			msgL.addAll(chkOther(notErrHdrR, notErrRcvR, notErrDtlL, notErrBillDL));

			return msgL;
		}

		/**
		 * 条件付必須チェック
		 * @param up0
		 * @param up1
		 * @return
		 */
		protected MCMessageList chkReq(HdrR up0, RcvR up1) {
			MCMessageList msgL = new MCMessageList();

			// 更新時、取消計上日は必須
			if (!isNull(up0.rcv_act_no())) {
				msgL.addAll(check(up0, HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
			}

			if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0.trd_ptn_typ())) {
				msgL.addAll(check(up1, RcvR.$setoff_bcst_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_trd_cur_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_rcv_amt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_rcv_amt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_sttl_cd1, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_debt_cred_id_typ, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_debt_cred_id_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_bd_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$setoff_rcv_amt, new FXUCL_RequiredValidater()));
			}
			else {
				msgL.addAll(check(up1, RcvR.$rcst_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$rcv_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$trd_cur_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$rcv_amt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1, RcvR.$ar_sttl_cd1, new FXUCL_RequiredValidater()));
				// 入金方法に決済区分が「振込」の決済方法ＣＤが選択
				if (MAC_AR_STTL_TYP.isBANK(up1.ar_sttl_typ1())) {
					msgL.addAll(check(up1, RcvR.$bank_ac_cd, new FXUCL_RequiredValidater()));
				}
				// 相殺方法が選択
				if (!isNull(up1.ar_sttl_cd2())) {
					msgL.addAll(check(up1, RcvR.$debt_cred_id_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up1, RcvR.$debt_cred_id_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up1, RcvR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 条件付リストロジックチェックの処理
			ListLogicBind billDptBind = getListLogicBind(up1(), RcvR.$bill_dpt_cd);
			billDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);

			ListLogicBind bdDptBind = getListLogicBind(up1(), RcvR.$bd_dpt_cd);
			bdDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);

			ListLogicBind setoffBdDptBind = getListLogicBind(up1(), RcvR.$setoff_bd_dpt_cd);
			setoffBdDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);

			ListLogicBind dtlArDptBind = getListLogicBind(up2(), DtlR.$ar_dpt_cd);
			dtlArDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);

			ListLogicBind dtlBillDptBind = getListLogicBind(up2(), DtlR.$bill_dpt_cd);
			dtlBillDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);
		}

		/**
		 * 税マスタ取得
		 * @param taxCd
		 * @param purcFlg
		 * @param slsFlg
		 * @return
		 */
		protected MAM_TAX_R selectTax(String taxCd, boolean purcFlg, boolean slsFlg) {
			MAM_TAX_R taxR = MAM_TAX_R.create();
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder taxR_bldr = MCQueryApiBuilder.create(t);
			taxR_bldr.setSelect(t.tax_rate);
			taxR_bldr.addSelect(t.tax_typ);
			taxR_bldr.setWhere(t.tax_cd.eq(bind("1")), taxCd);
			taxR_bldr.addWhereWithAnd(t.inc_tax_flg.eq(value(true)));
			if (purcFlg) {
				taxR_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
			}
			else if (slsFlg) {
				taxR_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
			}
			dbSelect("MSBGL0210_MAM_TAX_S03", taxR, taxR_bldr);

			return taxR;
		}

		/**
		 * 税マスタの存在チェック
		 * @param up1
		 * @return
		 */
		protected MCMessageList chkTaxExist(RcvR up1) {
			MCMessageList msgL = new MCMessageList();

			// 入金タブの相殺方法に対応する税マスタのチェック
			if (!isNull(up1.tax_cd1())) {
				if (!isNull(up1.ar_sttl_cd2()) && MAC_AR_STTL_TYP.isSETOFF_DR(up1.ar_sttl_typ2())) {

					boolean purcFlg = false;
					boolean slsFlg = false;
					if (MAC_SLS_PURC_TYP.isPURC(up1.sls_purc_typ2())) {
						purcFlg = true;
					}
					else if (MAC_SLS_PURC_TYP.isSLS(up1.sls_purc_typ2())) {
						slsFlg = true;
					}

					MAM_TAX_R taxR = selectTax(up1.tax_cd1(), purcFlg, slsFlg);

					// 売上仕入区分に対応する税マスタがない場合、エラー
					if (isNull(taxR.tax_typ())) {
						msgL.add(new MCMessage(MSBGL0034, up1.tax_cd1()));
					}
					else {
						up1.tax_typ1(taxR.tax_typ());
						up1.tax_rate1(taxR.tax_rate());
					}
				}
			}

			// 相殺タブの相殺方法に対応する税マスタのチェック
			if (!isNull(up1.setoff_tax_cd1())) {
				if (!isNull(up1.setoff_sttl_cd1()) && MAC_AR_STTL_TYP.isSETOFF_DR(up1.setoff_sttl_typ1())) {

					boolean purcFlg = false;
					boolean slsFlg = false;
					if (MAC_SLS_PURC_TYP.isPURC(up1.setoff_sls_purc_typ())) {
						purcFlg = true;
					}
					else if (MAC_SLS_PURC_TYP.isSLS(up1.setoff_sls_purc_typ())) {
						slsFlg = true;
					}

					MAM_TAX_R taxR = selectTax(up1.setoff_tax_cd1(), purcFlg, slsFlg);

					// 売上仕入区分に対応する税マスタがない場合、エラー
					if (isNull(taxR.tax_typ())) {
						msgL.add(new MCMessage(MSBGL0034, up1.setoff_tax_cd1()));
					}
					else {
						up1.setoff_tax_typ1(taxR.tax_typ());
						up1.setoff_tax_rate1(taxR.tax_rate());
					}
				}
			}
			return msgL;
		}

		/**
		 * 固有チェック
		 * @param up0
		 * @param up1
		 * @param up2
		 * @param up3
		 * @return
		 */
		protected MCMessageList chkOther(HdrR up0, RcvR up1, MCList<DtlR> up2, MCList<BillDR> up3) {
			MCMessageList msgL = new MCMessageList();
			// 消込対象の行（訂正していない行を含む）のみサービスに渡す
			MCList<DtlR> tmpUp2 = up2.subList(DtlR.$check, true);

			if (tmpUp2.isEmpty()) {
				msgL.add(new MCMessage(MSBGL0094));
				return msgL;
			}

			// 税マスタの存在チェック
			msgL.addAll(chkTaxExist(up1));

			// 取引パタンが「その他勘定売掛金相殺」以外
			if (!MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0().trd_ptn_typ())) {
				// 入金ＮＯがＮＵＬＬ以外の場合
				if (!isNull(up1().rcv_no())) {
					if (totalDtlAmt(DtlR.$amt1, tmpUp2).isZero()) {
						msgL.add(new MCMessage(MSBGL0092));
					}
					//　未処理残高がマイナスの場合
					if (up1().not_proc_bal().isNegative()) {
						msgL.add(new MCMessage(MSBGL0096));
					}
					//　未処理残高>入金額の場合
					if (up1().not_proc_bal().gt(up1().rcv_amt())) {
						msgL.add(new MCMessage(MSBGL0103));
					}
					//　明細の入金額合計がマイナスの場合
					if (totalDtlAmt(DtlR.$amt1, tmpUp2).isNegative()) {
						msgL.add(new MCMessage(MSBGL0104));
					}
				}
				// 入金ＮＯがＮＵＬＬの場合
				else {
					//　未処理残高が0以外の場合
					if (!up1.not_proc_bal().isZero()) {
						msgL.add(new MCMessage(MSBGL0102));
					}
				}
			}

			// 取引パタンが「その他勘定売掛金相殺」
			else if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0.trd_ptn_typ())) {
				// 相殺入金ＮＯがＮＵＬＬ以外の場合
				if (!isNull(up1.setoff_rcv_no())) {
					if (totalDtlAmt(DtlR.$amt1, tmpUp2).isZero()) {
						msgL.add(new MCMessage(MSBGL0093));
					}

					// 相殺額がプラスの場合
					if (up1.setoff_rcv_amt().isPositive()) {
						if (up1.setoff_not_proc_bal().isNegative()) {
							msgL.add(new MCMessage(MSBGL0096));
						}
						if (up1.setoff_not_proc_bal().gt(up1.setoff_rcv_amt())) {
							msgL.add(new MCMessage(MSBGL0097));
						}
						if (totalDtlAmt(DtlR.$amt1, tmpUp2).isNegative()) {
							msgL.add(new MCMessage(MSBGL0098));
						}
					}
					// 相殺額がマイナスの場合
					else if (up1.setoff_rcv_amt().isNegative()) {
						if (up1.setoff_not_proc_bal().isPositive()) {
							msgL.add(new MCMessage(MSBGL0099));
						}
						if (up1.setoff_rcv_amt().gt(up1.setoff_not_proc_bal())) {
							msgL.add(new MCMessage(MSBGL0100));
						}
						if (totalDtlAmt(DtlR.$amt1, tmpUp2).isPositive()) {
							msgL.add(new MCMessage(MSBGL0101));
						}
					}
				}
				// 入金ＮＯがＮＵＬＬの場合
				else {
					//　未処理残高が０以外の場合
					if (!up1.setoff_not_proc_bal().isZero()) {
						msgL.add(new MCMessage(MSBGL0102));
					}
				}
			}

			MCNumber rcvActAmt;
			MCNumber billDApplAmt;
			MCIndexKey key = up3.createIndex(BillDR.$grp_seq);
			for (DtlR r : tmpUp2) {

				// 取消計上日時点での債権部門存在チェック
				if (!isNull(up0.can_ac_dt()) && !isSame(up0.ac_dt(), up0().can_ac_dt())) {
					if (isNull(MSBGL_ArUtil.getDpt(r.ar_dpt_cd(), up0().can_ac_dt()).dpt_cd())){
						msgL.add(new MCMessage(r, DtlR.$ar_dpt_cd, MSBGL0122, r.ar_dpt_cd(), toYMDString(up0().can_ac_dt()), toDispGUIIndex(r)));
					}
				}
				// 源泉税のチェック
				if (MAC_AR_STTL_TYP.isWTAX(r.ar_sttl_typ1())) {
					if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0.trd_ptn_typ())) {
						
						if (!MAC_AR_STTL_TYP.isWTAX(up1.setoff_sttl_typ1())) {
							msgL.add(new MCMessage(up1, RcvR.$setoff_sttl_typ1, MSBGL0027));
						}

						// 相殺額（画面）－相殺額（更新前） ＞ 未消込残高の場合エラー
						if (nvl(r.amt1(), MCNumber.ZERO).subtract(r.setoff_amt()).gt(r.not_appl_bal())) {
							msgL.add(new MCMessage(r, DtlR.$amt1, MSBGL0038, r.amt1(), r.not_appl_bal(), toDispGUIIndex(r)));
						}
					}
					else {
						if (!MAC_AR_STTL_TYP.isWTAX(up1.ar_sttl_typ2())) {
							msgL.add(new MCMessage(up1, RcvR.$ar_sttl_typ2, MSBGL0027));
						}

						// 相殺額－相殺額（更新前） ＞ 未消込残高の場合エラー
						if (nvl(r.amt2(), MCNumber.ZERO).subtract(r.setoff_amt()).gt(r.not_appl_bal())) {
							msgL.add(new MCMessage(r, DtlR.$amt2, MSBGL0038, r.amt2(), r.not_appl_bal(), toDispGUIIndex(r)));
						}
					}
				}

				MCList<BillDR> tgtL = up3.subList(key, r.grp_seq());
				if(tgtL.isEmpty()){
					continue;
				}

				if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(up0().trd_ptn_typ())) {
					rcvActAmt = sum(r.amt1());
				}
				else {
					rcvActAmt = sum(r.amt1(), r.amt2());
				}
				billDApplAmt = tgtL.sum(BillDR.$appl_amt);
				
				for (BillDR tgtR :  tgtL) {
					// 明細単位で、消込累計額が消込対象額を超えている場合エラーとする
					if (isOverApplTgtAmt(tgtR.appl_tgt_amt(), tgtR.appl_tgt_amt().subtract(tgtR.ttl_appl_amt()))) {
						msgL.add(new MCMessage(MSBGL0009, tgtR.appl_amt(), tgtR.appl_tgt_amt().subtract(tgtR.ttl_appl_amt())));
					}
				}
				
				if (!isSame(rcvActAmt, billDApplAmt)) {
					msgL.add(new MCMessage(MSBGL0095, billDApplAmt, rcvActAmt));
				}
			}
			return msgL;
		}

		/**
		 * 消込累計額が消込対象額を超えている場合エラーとする
		 * @param applTgtAmt 消込対象額
		 * @param notApplAmt 消込対象額から消込累計額を引いた結果
		 * @return エラーの場合Trueを返す
		 */
		protected boolean isOverApplTgtAmt(MCNumber applTgtAmt, MCNumber notApplAmt) {

			return applTgtAmt.multiply(notApplAmt).isNegative();
		}

		protected MCNumber totalDtlAmt(String amt, MCList<DtlR> tmpUp2 ) {
			return tmpUp2.sum(amt);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			copyall(down1(), up1());
			down2().setAll(up2());
			down3().setAll(up3());
		}

		/**
		 * 入金実績共通サービスチェック処理設定　上り電文（RcvR）、（HdrR） > サービス上り電文(RcvActCmn_Chk01_HdrR) 
		 * 
		 * @return
		 */
		protected Map_RcvActCmn_Chk01_HdrR_RcvR<RcvActCmn_Chk01_HdrR,RcvR,HdrR> createMap_RcvActCmn_Chk01_HdrR_RcvR() {
			return new Map_RcvActCmn_Chk01_HdrR_RcvR<RcvActCmn_Chk01_HdrR, RcvR, HdrR>();
		}

		public class Map_RcvActCmn_Chk01_HdrR_RcvR<D extends RcvActCmn_Chk01_HdrR, S extends RcvR, W extends HdrR> extends MAUCC_RowMapperWith<D,S,W>{

			protected W _hR;

			@Override
			public void setWith(W _hR) {
				this._hR = _hR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$peg_no, RcvR.$peg_no);

				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcst_cd, RcvR.$rcst_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bill_dpt_cd, RcvR.$bill_dpt_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bank_ac_cd, RcvR.$bank_ac_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$xfr_psn, RcvR.$xfr_psn);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_no, RcvR.$note_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_mng_no, RcvR.$note_mng_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_typ, RcvR.$note_typ);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_dt, RcvR.$draw_dt);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$due_dt, RcvR.$due_dt);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$drawer_nm, RcvR.$drawer_nm);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_bank_cd, RcvR.$draw_bank_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_branch_cd, RcvR.$draw_branch_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$endrsr, RcvR.$endrsr);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$accptr, RcvR.$accptr);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_rsn_cd, RcvR.$note_rsn_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char1, RcvR.$sub_char1);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char2, RcvR.$sub_char2);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char3, RcvR.$sub_char3);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char1, RcvR.$note_sub_char1);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char2, RcvR.$note_sub_char2);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char3, RcvR.$note_sub_char3);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_no(_hR.rcv_act_no());
				dest.rcv_act_seq(_hR.rcv_act_seq());

				if (isSame(_hR.getStatus(), Status.CREATE)) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				dest.dpt_cd(_hR.dpt_cd());
				dest.wg_cd(_hR.wg_cd());
				dest.usr_cd(_hR.usr_cd());
				dest.ac_dt(_hR.ac_dt());
				dest.can_ac_dt(_hR.can_ac_dt());
				dest.trd_cd(_hR.trd_cd());
				dest.trd_ptn_typ(_hR.trd_ptn_typ());
				dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(_hR.trd_ptn_typ()));
				dest.bill_basis_dt(_hR.bill_basis_dt());
				dest.hdr_dtl_peg(new MCNumber(1));
				if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(_hR.trd_ptn_typ())) {
					dest.bcst_cd(src.setoff_bcst_cd());
					dest.ar_sttl_cd1(src.setoff_sttl_cd1());
					dest.ar_sttl_typ1(src.setoff_sttl_typ1());
					dest.tax_cd1(src.setoff_tax_cd1());
					dest.tax_typ1(src.setoff_tax_typ1());
					dest.tax_rate1(src.setoff_tax_rate1());
					dest.rcv_no(src.setoff_rcv_no());
					dest.rcv_dt(src.setoff_dt());
					dest.trd_rmrks(src.setoff_trd_rmrks());
					dest.debt_cred_id_typ(src.setoff_debt_cred_id_typ());
					dest.debt_cred_id_cd(src.setoff_debt_cred_id_cd());
					dest.debt_cred_nm(src.setoff_debt_cred_nm());
					dest.bd_dpt_cd(src.setoff_bd_dpt_cd());
					dest.trd_cur_cd(src.setoff_trd_cur_cd());
					dest.xrate(src.setoff_xrate());
					dest.xrate_cd(src.setoff_xrate_cd());
				}
				else {
					dest.bcst_cd(src.bcst_cd());
					dest.ar_sttl_cd1(src.ar_sttl_cd1());
					dest.ar_sttl_typ1(src.ar_sttl_typ1());
					dest.tax_cd2(src.tax_cd1());
					dest.tax_typ2(src.tax_typ1());
					dest.tax_rate2(src.tax_rate1());
					dest.ar_sttl_cd2(src.ar_sttl_cd2());
					dest.ar_sttl_cd2(src.ar_sttl_typ2());
					dest.rcv_no(src.rcv_no());
					dest.rcv_dt(src.rcv_dt());
					dest.trd_rmrks(src.trd_rmrks());
					dest.debt_cred_id_typ(src.debt_cred_id_typ());
					dest.debt_cred_id_cd(src.debt_cred_id_cd());
					dest.debt_cred_nm(src.debt_cred_nm());
					dest.bd_dpt_cd(src.bd_dpt_cd());
					dest.trd_cur_cd(src.trd_cur_cd());
					dest.xrate(src.xrate());
					dest.xrate_cd(src.xrate_cd());
				}
			}
		}

		/**
		 * 入金実績共通サービスチェック処理設定　上り電文（BillDR） > サービス上り電文(RcvActCmn_Upd01_BillDR) 
		 * 
		 * @return
		 */
		protected Map_RcvActCmn_Upd01_BillDR_BillDR<RcvActCmn_Upd01_BillDR,BillDR> createMap_RcvActCmn_Upd01_BillDR_BillDR() {
			return new Map_RcvActCmn_Upd01_BillDR_BillDR<RcvActCmn_Upd01_BillDR, BillDR>();
		}

		public class Map_RcvActCmn_Upd01_BillDR_BillDR<D extends RcvActCmn_Upd01_BillDR, S extends BillDR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Upd01_BillDR.$grp_seq, BillDR.$grp_seq);
				addColumnPathMap(RcvActCmn_Upd01_BillDR.$bill_d_no, BillDR.$bill_d_no);
				addColumnPathMap(RcvActCmn_Upd01_BillDR.$parent_bill_d_no, BillDR.$parent_bill_d_no);
				addColumnPathMap(RcvActCmn_Upd01_BillDR.$bill_mng_no, BillDR.$bill_mng_no);
				addColumnPathMap(RcvActCmn_Upd01_BillDR.$appl_amt, BillDR.$appl_amt);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売掛消込の入金実績を取り消す前のチェックを行う<br>
	 */
	public class Chk02 extends MSBGL_ArApplReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callRcvActCmnChkSrv();
			}
			setDown();
		}

		/**
		 * 入金実績共通サービスのチェック処理を実行する
		 */
		protected void callRcvActCmnChkSrv() {
			MSBGL_RcvActCmnService.RcvActCmn_Chk01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk01();

			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up0(), createMap_RcvActCmn_Chk01_HdrR_Chk02_HdrR());
			ope.up0().add(hdrR);
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(rcvActLock(up0()));
			msgL.addAll(rcvLock(up1()));

			// ロック対象は消込対象の行（訂正していない行を含む）のみ
			MCList<Chk02_DtlR> tmpUp2 = up2().subList(Chk02_DtlR.$check, true);
			MCList<Chk02_BillDR> tmpUp3 = MCList.create(Chk02_BillDR.class);
			for (Chk02_DtlR uR :tmpUp2) {
				MCList<Chk02_BillDR> l = up3().subList(Chk02_BillDR.$grp_seq, uR.grp_seq());
				tmpUp3.addAll(l);
			}

			msgL.addAll(applSchdLock(tmpUp2));
			msgL.addAll(billDLock(tmpUp3));	

			return msgL;
		}

		/**
		 * 入金情報のロック
		 * @param up1
		 * @return
		 */
		protected MCMessageList rcvLock(Chk02_RcvR up1) {
			MCMessageList msgL = new MCMessageList();

			// 入金ＮＯが存在する場合、入金を検索してロックする。
			if (isNull(up1.rcv_no()) && isNull(up1.setoff_rcv_no())) {
				return msgL;
			}

			MST_RCV_R rcvR = MST_RCV_R.create();
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(t);
			rcvR_bldr.setSelect(t.rcv_no);
			rcvR_bldr.addSelect(t.upd_cntr);
			if (!isNull(up1.rcv_no())) {
				rcvR_bldr.setWhere(t.rcv_no.eq(bind("1")), up1.rcv_no());
			}
			else {
				rcvR_bldr.setWhere(t.rcv_no.eq(bind("1")), up1.setoff_rcv_no());
			}
			dbSelectForUpdateNoWait("MSBGL0210_MST_RCV_S02", rcvR, rcvR_bldr);
			msgL.addAll(checkUpdCntrNE(up1, RcvR.$rcv_upd_cntr, rcvR));

			return msgL;
		}

		/**
		 * 入金実績情報のロック
		 * 
		 * @param up0
		 * @return
		 */
		protected MCMessageList rcvActLock(Chk02_HdrR up0) {
			MCMessageList msgL = new MCMessageList();

			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
			MST_RCV_ACT_R rcvActR_t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR_t);
			rcvActR_bldr.setSelect(rcvActR_t.rcv_act_no);
			rcvActR_bldr.addSelect(rcvActR_t.rcv_act_seq);
			rcvActR_bldr.addSelect(rcvActR_t.slip_sts_typ);
			rcvActR_bldr.addSelect(rcvActR_t.trd_ptn_typ);
			rcvActR_bldr.addSelect(rcvActR_t.upd_cntr);
			rcvActR_bldr.addSelect(rcvActR_t.dpt_cd);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_RCV_ACT_S03", rcvActR, rcvActR_bldr, up0);
			msgL.addAll(checkUpdCntrNE(up0, HdrR.$rcv_act_upd_cntr, rcvActR));

			// 更新前入金実績情報をキャッシュ
			initOrgRcvActCache(rcvActR, rcvActR_t, rcvActR_bldr);
			return msgL;
		}

		/**
		 * 売掛明細消込予定のロック
		 * @param up2
		 * @return
		 */
		protected MCMessageList applSchdLock(MCList<Chk02_DtlR> up2) {
			MCMessageList msgL = new MCMessageList();

			// 売掛消込予定ＮＯをもとに売掛消込予定を検索してロックする。
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder arApplSchdL_bldr = MCQueryApiBuilder.create(t);
			arApplSchdL_bldr.setSelect(t.ar_appl_schd_no);
			arApplSchdL_bldr.addSelect(t.upd_cntr);

			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_AR_APPL_SCHD_S03", arApplSchdL, arApplSchdL_bldr, up2);

			MCIndexKey idxkey = arApplSchdL.createIndex(MST_AR_APPL_SCHD_R.$ar_appl_schd_no);
			for (Chk02_DtlR dtlR: up2) {
				MST_AR_APPL_SCHD_R arApplSchdR = arApplSchdL.getFirst(idxkey, dtlR.ar_appl_schd_no());
				msgL.addAll(checkUpdCntrNE(dtlR, DtlR.$ar_appl_schd_upd_cntr, arApplSchdR));
			}
			return msgL;
		}

		/**
		 * 請求明細、請求明細消込残高のロック
		 * @param up3
		 * @return
		 */
		protected MCMessageList billDLock(MCList<Chk02_BillDR> up3) {
			MCMessageList msgL = new MCMessageList();
			if (up3.isEmpty()) {
				return msgL;
			}

			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R billDL_t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(billDL_t);
			billDL_bldr.setSelect(billDL_t.bill_d_no);
			billDL_bldr.addSelect(billDL_t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_BILL_D_S04", billDL, billDL_bldr, up3);

			MCIndexKey idxkey = billDL.createIndex(MST_BILL_D_R.$bill_d_no);
			for (Chk02_BillDR billDR: up3) {
				MST_BILL_D_R r = billDL.getFirst(idxkey, billDR.bill_d_no());
				msgL.addAll(checkUpdCntrNE(billDR, BillDR.$bill_d_upd_cntr, r));
			}

			MCList<MST_BILL_D_APPL_BAL_R> billDApplBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
			MST_BILL_D_APPL_BAL_R billDApplBalL_t = MST_BILL_D_APPL_BAL_R.create("T");
			MCQueryApiBuilder billDApplBalL_bldr = MCQueryApiBuilder.create(billDApplBalL_t);
			billDApplBalL_bldr.setSelect(billDApplBalL_t.bill_d_no);
			billDApplBalL_bldr.setSelect(billDApplBalL_t.parent_bill_d_no);
			billDApplBalL_bldr.addSelect(billDApplBalL_t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0210_MST_BILL_D_APPL_BAL_S02", billDApplBalL, billDApplBalL_bldr, up3);

			MCIndexKey idxkey2 = billDApplBalL.createIndex(MST_BILL_D_APPL_BAL_R.$bill_d_no, MST_BILL_D_APPL_BAL_R.$parent_bill_d_no);
			for (Chk02_BillDR billDR: up3) {
				MST_BILL_D_APPL_BAL_R r = billDApplBalL.getFirst(idxkey2, billDR.bill_d_no(), billDR.parent_bill_d_no());
				msgL.addAll(checkUpdCntrNE(billDR, BillDR.$bill_d_upd_cntr, r));
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_HdrR> notErrHdrL = getChkList(up0());
			Chk02_HdrR notErrHdrR = notErrHdrL.get(0);

			if (isNull(notErrHdrR)) {
				return msgL;
			}

			msgL.addAll(check(notErrHdrR, Chk02_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(getOrgRcvActCache(notErrHdrR.rcv_act_no(), notErrHdrR.rcv_act_seq()), MST_RCV_ACT_R.$dpt_cd));
			// 入金実績明細の取得
			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(t);
			rcvActDL_bldr.setSelect(t.ar_dpt_cd);
			rcvActDL_bldr.setWhere(t.rcv_act_no.eq(bind("rcv_act_no")));
			rcvActDL_bldr.addWhereWithAnd(t.rcv_act_seq.eq(bind("rcv_act_seq")));
			dbSelect("MSBGL0210_MST_RCV_ACT_D_S01", rcvActDL, rcvActDL_bldr, notErrHdrL);
			
			// 債権部門でグループ化したリストに対し、取消計上日で有効かチェック
			MCList<MST_RCV_ACT_D_R> rcvActDGrpL = rcvActDL.groupBy(MST_RCV_ACT_D_R.$ar_dpt_cd);
			for (MST_RCV_ACT_D_R rcvActDGrpR : rcvActDGrpL) {
				if (isNull(MSBGL_ArUtil.getDpt(rcvActDGrpR.ar_dpt_cd(), up0().can_ac_dt()).dpt_cd())){
					msgL.add(new MCMessage(MSBGL0122, rcvActDGrpR.ar_dpt_cd(), toYMDString(up0().can_ac_dt())));
				}
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}

		/**
		 * 入金実績共通サービスチェック処理設定　上り電文（Chk02_HdrR） > サービス上り電文(RcvActCmn_Chk01_HdrR) 
		 * 
		 * @return
		 */
		protected Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<RcvActCmn_Chk01_HdrR,Chk02_HdrR> createMap_RcvActCmn_Chk01_HdrR_Chk02_HdrR() {
			return new Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<RcvActCmn_Chk01_HdrR, Chk02_HdrR>();
		}

		public class Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<D extends RcvActCmn_Chk01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_act_no, Chk02_HdrR.$rcv_act_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_act_seq, Chk02_HdrR.$rcv_act_seq);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売掛消込の入金実績を登録する<br>
	 */
	public class Ins01 extends MSBGL_ArApplReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// チェック処理
			callThisChk01();
			throwUpdErr();

			// 入金実績サービス
			rcvActCmn();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvR.$peg_no, up1());
			setPegNo(DtlR.$peg_no, up2());
			setPegNo(BillDR.$peg_no, up3());
			up0().setStatus(Status.CREATE);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_ArApplReg.Chk01 ope = MSBGL_ArApplReg.crtChk01();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());

			ope.exec();

			copyall(up0(), ope.down0());
			copyall(up1(), ope.down1());
			up2().setAll(ope.down2());
			up3().setAll(ope.down3());
		}

		/**
		 * 入金実績サービスを実行する。
		 * 
		 */
		protected void rcvActCmn() {
			if (up0().isEmpty()) {
				return;
			}

			MSBGL_RcvActCmnService.RcvActCmn_Upd01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd01();

			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up1(), up0(), createMap_RcvActCmn_Chk01_HdrR_RcvR());
			ope.up0().add(hdrR);

			// 消込対象の行のみサービスに渡す
			MCList<DtlR> tmpUp2 = up2().subList(DtlR.$check, true);

			for (DtlR tmp :tmpUp2) {
				RcvActCmn_Chk01_DtlR dtlR = RcvActCmn_Chk01_DtlR.create();
				copy(dtlR, tmp, createMap_RcvActCmn_Chk01_DtlR_DtlR());
				ope.up1().add(dtlR);

				MCList<BillDR> list = up3().subList(BillDR.$grp_seq, dtlR.grp_seq());
				for (BillDR tmp2 :list) {
					RcvActCmn_Upd01_BillDR billR = RcvActCmn_Upd01_BillDR.create();
					copy(billR, tmp2, createMap_RcvActCmn_Upd01_BillDR_BillDR());
					ope.up2().add(billR);
				}
			}

			ope.exec();

			// 下り電文設定
			copy(down0(), ope.down1(), createMap_HdrR_RcvAct_BaseR());

			for (RcvActCmn_Chk01_DtlR r : ope.down0()) {
				DtlR dtlR = DtlR.create();
				copy(dtlR, r, createMap_DtlR_RcvActCmn_Chk01_DtlR());
				down1().add(dtlR);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売掛消込の入金実績を訂正する<br>
	 */
	public class Upd01 extends MSBGL_ArApplReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// チェック処理
			callThisChk01();
			throwUpdErr();

			// 入金実績サービス
			rcvActCmn();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvR.$peg_no, up1());
			setPegNo(DtlR.$peg_no, up2());
			setPegNo(BillDR.$peg_no, up3());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_ArApplReg.Chk01 ope = MSBGL_ArApplReg.crtChk01();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());

			ope.exec();

			copyall(up0(), ope.down0());
			copyall(up1(), ope.down1());
			up2().setAll(ope.down2());
			up3().setAll(ope.down3());
		}

		/**
		 * 入金実績サービスを実行する。
		 * 
		 */
		protected void rcvActCmn() {
			if (up0().isEmpty()) {
				return;
			}

			MSBGL_RcvActCmnService.RcvActCmn_Upd01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd01();

			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up1(), up0(), createMap_RcvActCmn_Chk01_HdrR_RcvR());
			ope.up0().add(hdrR);

			// 消込対象の行（訂正していない行を含む）のみサービスに渡す
			MCList<DtlR> tmpUp2 = up2().subList(DtlR.$check, true);

			for (DtlR tmp :tmpUp2) {
				RcvActCmn_Chk01_DtlR dtlR = RcvActCmn_Chk01_DtlR.create();
				copy(dtlR, tmp, createMap_RcvActCmn_Chk01_DtlR_DtlR());
				ope.up1().add(dtlR);

				MCList<BillDR> list = up3().subList(BillDR.$grp_seq, dtlR.grp_seq());
				for (BillDR tmp2 :list) {
					RcvActCmn_Upd01_BillDR billR = RcvActCmn_Upd01_BillDR.create();
					copy(billR, tmp2, createMap_RcvActCmn_Upd01_BillDR_BillDR());
					ope.up2().add(billR);
				}
			}
			ope.exec();

			// 下り電文設定
			copy(down0(), ope.down1(), createMap_HdrR_RcvAct_BaseR());

			for (RcvActCmn_Chk01_DtlR r : ope.down0()) {
				DtlR dtlR = DtlR.create();
				copy(dtlR, r, createMap_DtlR_RcvActCmn_Chk01_DtlR());
				down1().add(dtlR);
			}
		}
	}

	/**
	 * 入金実績共通サービス更新処理設定　上り電文（HdrR）、（RcvR） > サービス上り電文(RcvActCmn_Chk01_HdrR) 
	 * 
	 * @return
	 */
	protected Map_RcvActCmn_Chk01_HdrR_RcvR<RcvActCmn_Chk01_HdrR,RcvR,HdrR> createMap_RcvActCmn_Chk01_HdrR_RcvR() {
		return new Map_RcvActCmn_Chk01_HdrR_RcvR<RcvActCmn_Chk01_HdrR, RcvR, HdrR>();
	}

	public class Map_RcvActCmn_Chk01_HdrR_RcvR<D extends RcvActCmn_Chk01_HdrR, S extends RcvR, W extends HdrR> extends MAUCC_RowMapperWith<D,S,W>{

		protected W _hR;

		@Override
		public void setWith(W _hR) {
			this._hR = _hR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$peg_no, RcvR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcst_cd, RcvR.$rcst_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bill_dpt_cd, RcvR.$bill_dpt_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bank_ac_cd, RcvR.$bank_ac_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$xfr_psn, RcvR.$xfr_psn);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_no, RcvR.$note_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_mng_no, RcvR.$note_mng_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_typ, RcvR.$note_typ);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_dt, RcvR.$draw_dt);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$due_dt, RcvR.$due_dt);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$drawer_nm, RcvR.$drawer_nm);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_bank_cd, RcvR.$draw_bank_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$draw_branch_cd, RcvR.$draw_branch_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$endrsr, RcvR.$endrsr);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$accptr, RcvR.$accptr);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_rsn_cd, RcvR.$note_rsn_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char1, RcvR.$note_sub_char1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char2, RcvR.$note_sub_char2);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_sub_char3, RcvR.$note_sub_char3);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.rcv_act_no(_hR.rcv_act_no());
			dest.rcv_act_seq(_hR.rcv_act_seq());

			if (isSame(_hR.getStatus(), Status.CREATE)) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			dest.dpt_cd(_hR.dpt_cd());
			dest.wg_cd(_hR.wg_cd());
			dest.usr_cd(_hR.usr_cd());
			dest.ac_dt(_hR.ac_dt());
			dest.can_ac_dt(_hR.can_ac_dt());

			dest.trd_cd(_hR.trd_cd());
			dest.trd_ptn_typ(_hR.trd_ptn_typ());
			dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(_hR.trd_ptn_typ()));
			dest.bill_basis_dt(_hR.bill_basis_dt());
			dest.hdr_dtl_peg(1);
			if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(_hR.trd_ptn_typ())) {
				dest.bcst_cd(src.setoff_bcst_cd());
				dest.ar_sttl_cd1(src.setoff_sttl_cd1());
				dest.ar_sttl_typ1(src.setoff_sttl_typ1());
				dest.tax_cd1(src.setoff_tax_cd1());
				dest.tax_typ1(src.setoff_tax_typ1());
				dest.tax_rate1(src.setoff_tax_rate1());
				dest.rcv_no(src.setoff_rcv_no());
				dest.rcv_dt(src.setoff_dt());
				dest.trd_rmrks(src.setoff_trd_rmrks());
				dest.sub_char1(src.setoff_sub_char1());
				dest.sub_char2(src.setoff_sub_char2());
				dest.sub_char3(src.setoff_sub_char3());

				dest.debt_cred_id_typ(src.setoff_debt_cred_id_typ());
				dest.debt_cred_id_cd(src.setoff_debt_cred_id_cd());
				dest.debt_cred_nm(src.setoff_debt_cred_nm());
				dest.bd_dpt_cd(src.setoff_bd_dpt_cd());
				dest.trd_cur_cd(src.setoff_trd_cur_cd());
				dest.xrate(src.setoff_xrate());
				dest.xrate_cd(src.setoff_xrate_cd());
			}
			else {
				dest.bcst_cd(src.bcst_cd());
				dest.ar_sttl_cd1(src.ar_sttl_cd1());
				dest.ar_sttl_typ1(src.ar_sttl_typ1());
				dest.ar_sttl_cd2(src.ar_sttl_cd2());
				dest.ar_sttl_typ2(src.ar_sttl_typ2());
				dest.tax_cd2(src.tax_cd1());
				dest.tax_typ2(src.tax_typ1());
				dest.tax_rate2(src.tax_rate1());
				dest.rcv_no(src.rcv_no());
				dest.rcv_dt(src.rcv_dt());
				dest.trd_rmrks(src.trd_rmrks());
				dest.sub_char1(src.sub_char1());
				dest.sub_char2(src.sub_char2());
				dest.sub_char3(src.sub_char3());

				dest.debt_cred_id_typ(src.debt_cred_id_typ());
				dest.debt_cred_id_cd(src.debt_cred_id_cd());
				dest.debt_cred_nm(src.debt_cred_nm());
				dest.bd_dpt_cd(src.bd_dpt_cd());
				dest.trd_cur_cd(src.trd_cur_cd());
				dest.xrate(src.xrate());
				dest.xrate_cd(src.xrate_cd());
			}
		}
	}

	/**
	 * 入金実績共通サービス更新処理設定　上り電文（DtlR） > サービス上り電文(RcvActCmn_Chk01_DtlR) 
	 * 
	 * @return
	 */
	protected Map_RcvActCmn_Chk01_DtlR_DtlR<RcvActCmn_Chk01_DtlR,DtlR> createMap_RcvActCmn_Chk01_DtlR_DtlR() {
		return new Map_RcvActCmn_Chk01_DtlR_DtlR<RcvActCmn_Chk01_DtlR, DtlR>();
	}

	public class Map_RcvActCmn_Chk01_DtlR_DtlR<D extends RcvActCmn_Chk01_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$grp_seq, DtlR.$grp_seq);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$acst_cd, DtlR.$acst_cd);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$ar_dpt_cd, DtlR.$ar_dpt_cd);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$wg_cd, DtlR.$wg_cd);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$bcst_cd, DtlR.$bcst_cd);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$bill_dpt_cd, DtlR.$bill_dpt_cd);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$ar_sttl_cd1, DtlR.$ar_sttl_cd1);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$ar_sttl_typ1, DtlR.$ar_sttl_typ1);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$iv_no, DtlR.$iv_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$wrk_no, DtlR.$wrk_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$bill_mng_no, DtlR.$bill_mng_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$ar_typ, DtlR.$ar_typ);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt1, DtlR.$amt1);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt2, DtlR.$amt2);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt3, DtlR.$amt3);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$bill_d_rmrks, DtlR.$bill_d_rmrks);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$ar_appl_schd_no, DtlR.$ar_appl_schd_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_no, DtlR.$rcv_act_d_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_seq, DtlR.$rcv_act_d_seq);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.hdr_dtl_peg(new MCNumber(1));
		}

	}

	/**
	 * 入金実績共通サービス更新処理設定　上り電文（BillDR） > サービス上り電文(RcvActCmn_Upd01_BillDR) 
	 * 
	 * @return
	 */
	protected Map_RcvActCmn_Upd01_BillDR_BillDR<RcvActCmn_Upd01_BillDR,BillDR> createMap_RcvActCmn_Upd01_BillDR_BillDR() {
		return new Map_RcvActCmn_Upd01_BillDR_BillDR<RcvActCmn_Upd01_BillDR, BillDR>();
	}

	public class Map_RcvActCmn_Upd01_BillDR_BillDR<D extends RcvActCmn_Upd01_BillDR, S extends BillDR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Upd01_BillDR.$grp_seq, BillDR.$grp_seq);
			addColumnPathMap(RcvActCmn_Upd01_BillDR.$bill_d_no, BillDR.$bill_d_no);
			addColumnPathMap(RcvActCmn_Upd01_BillDR.$parent_bill_d_no, BillDR.$parent_bill_d_no);
			addColumnPathMap(RcvActCmn_Upd01_BillDR.$bill_mng_no, BillDR.$bill_mng_no);
			addColumnPathMap(RcvActCmn_Upd01_BillDR.$appl_amt, BillDR.$appl_amt);
		}
	}

	/**
	 * 入金実績共通サービス更新処理設定　サービス下り電文（RcvAct_BaseR） > 下り電文(HdrR) 
	 * 
	 * @return
	 */
	protected Map_HdrR_RcvAct_BaseR<HdrR,RcvAct_BaseR> createMap_HdrR_RcvAct_BaseR() {
		return new Map_HdrR_RcvAct_BaseR<HdrR, RcvAct_BaseR>();
	}

	public class Map_HdrR_RcvAct_BaseR<D extends HdrR, S extends RcvAct_BaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(HdrR.$rcv_act_no, RcvAct_BaseR.$rcv_act_no);
			addColumnPathMap(HdrR.$rcv_act_seq, RcvAct_BaseR.$rcv_act_seq);
			addColumnPathMap(HdrR.$rcv_act_rev, RcvAct_BaseR.$rcv_act_rev);
			addColumnPathMap(HdrR.$ac_ym, RcvAct_BaseR.$ac_ym);
		}
	}

	/**
	 * 入金実績共通サービス更新処理設定　サービス下り電文（RcvActCmn_Chk01_DtlR） > 下り電文(DtlR) 
	 * 
	 * @return
	 */
	protected Map_DtlR_RcvActCmn_Chk01_DtlR<DtlR,RcvActCmn_Chk01_DtlR> createMap_DtlR_RcvActCmn_Chk01_DtlR() {
		return new Map_DtlR_RcvActCmn_Chk01_DtlR<DtlR, RcvActCmn_Chk01_DtlR>();
	}

	public class Map_DtlR_RcvActCmn_Chk01_DtlR<D extends DtlR, S extends RcvActCmn_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$rcv_act_d_no, RcvActCmn_Chk01_DtlR.$rcv_act_d_no);
			addColumnPathMap(DtlR.$rcv_act_d_seq, RcvActCmn_Chk01_DtlR.$rcv_act_d_seq);
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売掛消込の入金実績を取り消す<br>
	 */
	public class Del01 extends MSBGL_ArApplReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// チェック処理
			callThisChk02();
			throwCanErr();

			// 入金実績サービス
			rcvActCmn();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvR.$peg_no, up1());
			setPegNo(DtlR.$peg_no, up2());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBGL_ArApplReg.Chk02 ope = MSBGL_ArApplReg.crtChk02();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			ope.up2().setAll(up2());
			ope.exec();

			copyall(up0(), ope.down0());
		}

		/**
		 * 入金実績サービスを実行する。
		 * 
		 */
		protected void rcvActCmn() {
			if (up0().isEmpty()) {
				return;
			}

			MSBGL_RcvActCmnService.RcvActCmn_Upd01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Upd01();

			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up0(), createMap_RcvActCmn_Chk01_HdrR_Chk02_HdrR());
			ope.up0().add(hdrR);

			ope.exec();

			// 下り電文設定
			copy(down0(), ope.down1(), createMap_Chk02_HdrR_RcvAct_BaseR());
		}

		/**
		 * 入金実績共通サービス更新処理設定　サービス下り電文（RcvAct_BaseR） > 下り電文(Chk02_HdrR) 
		 * 
		 * @return
		 */
		protected Map_Chk02_HdrR_RcvAct_BaseR<Chk02_HdrR,RcvAct_BaseR> createMap_Chk02_HdrR_RcvAct_BaseR() {
			return new Map_Chk02_HdrR_RcvAct_BaseR<Chk02_HdrR, RcvAct_BaseR>();
		}

		public class Map_Chk02_HdrR_RcvAct_BaseR<D extends Chk02_HdrR, S extends RcvAct_BaseR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_HdrR.$ac_ym, RcvAct_BaseR.$ac_ym);
			}
		}
	}

	/**
	 * 入金実績共通サービス更新処理設定　上り電文（DtlR） > サービス上り電文(RcvActCmn_Chk01_DtlR) 
	 * 
	 * @return
	 */
	protected Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<RcvActCmn_Chk01_HdrR,Chk02_HdrR> createMap_RcvActCmn_Chk01_HdrR_Chk02_HdrR() {
		return new Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<RcvActCmn_Chk01_HdrR, Chk02_HdrR>();
	}

	public class Map_RcvActCmn_Chk01_HdrR_Chk02_HdrR<D extends RcvActCmn_Chk01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_act_no, Chk02_HdrR.$rcv_act_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_act_seq, Chk02_HdrR.$rcv_act_seq);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
	}

	//FMCB CUSTOM END
}