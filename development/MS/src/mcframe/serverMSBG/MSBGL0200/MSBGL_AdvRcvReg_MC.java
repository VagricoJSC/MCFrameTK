package mcframe.serverMSBG.MSBGL0200;

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
import mcframe.serverMSBG.MSBGL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverMSBG.MSBGL5020.*;
import mcframe.serverMSBB.MSBBL6020.*;
import static mcframe.serverMSBG.MSBGL0200.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_AdvRcvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_AdvRcvReg_MC extends MSBGL_AdvRcvReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	* 更新前入金実績情報のキャッシュ
	*/
	protected static final Class<MSBGL_AdvRcvReg> CLAZZ = MSBGL_AdvRcvReg.class;
	protected FXUCL_MCDbcCache<MST_RCV_ACT_R> _orgRcvActCache = null;

	// チェック処理でキャッシュを初期化する
	protected static void initOrgRcvActCache(MST_RCV_ACT_R rcvActR, MCQueryApiBuilder rcvActR_bldr) {
		object(CLAZZ)._initOrgRcvActCache(rcvActR, rcvActR_bldr);
	}
	
	protected void _initOrgRcvActCache(MST_RCV_ACT_R rcvActR, MCQueryApiBuilder rcvActR_bldr) {
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
	protected static void initRcvCache(MST_RCV_R rctR, MCQueryApiBuilder rcvR_bldr) {
		object(CLAZZ)._initRcvCache(rctR, rcvR_bldr);
	}
	
	protected void _initRcvCache(MST_RCV_R rcvR, MCQueryApiBuilder rcvR_bldr) {
		_rcvCache = new FXUCL_MCDbcCache<MST_RCV_R>(rcvR_bldr);
	}
	
	protected static MST_RCV_R getRcvCache(String rcvNo) {
		return object(CLAZZ)._rcvCache.get(rcvNo);
	}
	

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を検索する<br>
	 */
	public class Srch01 extends MSBGL_AdvRcvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			
			editCnd();
			super.doSearchMain();
			
			Srch01_Hdr_RcvR hdrRcvR = Srch01_Hdr_RcvR.create();
			// 検索
			hdrRcvR = getHdrRcv();
			
			if (!chkHdrRcv(hdrRcvR)) {
				return;
			}
			
			// 入金実績明細情報の検索
			MCList<MST_RCV_ACT_D_R> dL = getDtl(hdrRcvR);
			
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
		 * 入金実績情報の検索を行う
		 */
		protected Srch01_Hdr_RcvR getHdrRcv() {
			getLatestRcvActRev(up0());
			
			Srch01_Hdr_RcvR hdrRcvR = Srch01_Hdr_RcvR.create();
			executeQuery(hdrRcvR, MSBGL0200_MST_RCV_ACT_S01(), up0());
			
			if (hdrRcvR.isEmpty()) {
				return hdrRcvR;
			}
			postGetRcvAct(hdrRcvR);
			setPurcSlsFlg(hdrRcvR);

		
			return hdrRcvR;
		}
		
		/**
		 * 検索後処理
		 * 
		 * @param hdrRcvR 入金実績ヘッダ
		 */
		protected void postGetRcvAct(Srch01_Hdr_RcvR hdrRcvR) {
			if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hdrRcvR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hdrRcvR.trd_ptn_typ())) {
				hdrRcvR.creditor_id_typ(hdrRcvR.debt_cred_id_typ());
				hdrRcvR.creditor_id_cd(hdrRcvR.debt_cred_id_cd());
				hdrRcvR.creditor_nm(hdrRcvR.debt_cred_nm());
				hdrRcvR.cred_bd_dpt_cd(hdrRcvR.bd_dpt_cd());
				hdrRcvR.cred_bd_dpt_nm(hdrRcvR.bd_dpt_nm());
			}
			else {
				hdrRcvR.debtor_cred_id_typ(hdrRcvR.debt_cred_id_typ());
				hdrRcvR.debtor_cred_id_cd(hdrRcvR.debt_cred_id_cd());
				hdrRcvR.debtor_cred_nm(hdrRcvR.debt_cred_nm());
				hdrRcvR.debt_bd_dpt_cd(hdrRcvR.bd_dpt_cd());
				hdrRcvR.debt_bd_dpt_nm(hdrRcvR.bd_dpt_nm());
			}
		}
		
		/**
		 * 売上仕入税区分に応じて売上ＦＬＧ、仕入ＦＬＧをセットする。
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
		}
		
		/**
		 * 最新フラグを設定する。
		 */
		protected void setLatestFlg(Srch01_Hdr_RcvR hdrRcvR) {
			
			if (isSame(hdrRcvR.rcv_act_rev(), up0().latest_rcv_act_rev())) {
				hdrRcvR.latest_flg(true);
			}
		}
		
		protected boolean getLatestFlg(Srch01_Hdr_RcvR hdrRcvR) {
			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(hdrRcvR.getStringNE("slip_sts_typ"))) {
				return true;
			}
			return false;
		}
		
		/**
		 * 最新入金実績改訂番号を取得する。
		 * @param cndR 検索条件
		 */
		protected void getLatestRcvActRev(Srch01_CndR cndR) {
			
			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR);
			rcvActR_bldr.setSelect(rcvActR.rcv_act_rev);
			rcvActR_bldr.addMax(rcvActR.rcv_act_rev, "rcv_act_rev");
			rcvActR_bldr.setWhere(rcvActR.rcv_act_no.eq(bind("rcv_act_no")));
			dbSelect("MSBGL0200_MST_RCV_ACT_S01", rcvActR, rcvActR_bldr, cndR);
			
			cndR.latest_rcv_act_rev(rcvActR.rcv_act_rev());
			
			//最新のREV_NOを取得する。
			if (cndR.latest_flg() || isNull(cndR.rcv_act_rev())) {
				
				cndR.rcv_act_rev(rcvActR.rcv_act_rev());
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
		 * 処理可能な取引区分かどうかを判断する<p>
		 * 「前受金入金」「仮受金入金」「仮受金前受金相殺」「仮受金その他勘定相殺」「前受金その他勘定相殺」のみ処理が可能
		 *
		 * @param trdPtnTyp 取引区分
		 * @return 処理可否
		 */
		protected boolean isProcessable(String trdPtnTyp) {

			return (MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp)
						|| MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp));
		}
		
		/**
		 * 入金実績明細を取得する
		 * 
		 * @param hdrRcvR 入金実績ヘッダ
		 * @return 入金実績明細
		 */
		protected MCList<MST_RCV_ACT_D_R> getDtl(Srch01_Hdr_RcvR  hdrRcvR) {
			MCList<MST_RCV_ACT_D_R> dL = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder dL_bldr = MCQueryApiBuilder.create(t);
			MST_RCV_R rcv1 = MST_RCV_R.create("RCV1");
			MST_RCV_ACT_R rcv_act1 = MST_RCV_ACT_R.create("RCV_ACT1");
			MST_RCV_R rcv2 = MST_RCV_R.create("RCV2");

			dL.addNumberColumn("appl_amt");
			dL_bldr.setSelect(t.rcv_act_d_no);
			dL_bldr.addSelect(t.rcv_act_d_seq);
			dL_bldr.addSelect(t.trd_cur_amt1);
			dL_bldr.addSelect(t.trd_cur_amt2);
			dL_bldr.addSelect(t.gen_rcv_no);
			dL_bldr.addSelect(nvl( rcv1.slo_no, rcv2.slo_no).as("slo_no"));
			dL_bldr.addSelect(rcv1.rcv_proc_amt.as("appl_amt"));
			dL_bldr.addLeftOuterJoin(rcv1, rcv1.rcv_no.eq(t.gen_rcv_no));
			dL_bldr.addLeftOuterJoin(rcv_act1, bracket( t.rcv_act_no.eq(rcv_act1.rcv_act_no)
					.and(t.rcv_act_seq.eq(rcv_act1.rcv_act_seq))));
			dL_bldr.addLeftOuterJoin(rcv2, rcv_act1.rcv_no.eq(rcv2.rcv_no));
			dL_bldr.setWhere(t.rcv_act_no.eq(bind("rcv_act_no")));
			dL_bldr.addWhereWithAnd(t.rcv_act_seq.eq(bind("rcv_act_seq")));
			dbSelect("MSBGL0200_MST_RCV_ACT_D_S01", dL, dL_bldr, hdrRcvR);
			return dL;
		}
		
		/**
		 * 入金実績明細のチェック
		 * 
		 * @param dL 入金実績明細
		 * @return 結果がOKの場合はtrue
		 */
		protected boolean chkDtl(MCList<MST_RCV_ACT_D_R> dL) {
			
			if (dL.isEmpty()) {
				throw new MCAppException(MSBGL0112);
			}
			return true;
		}
		
		protected void setDown(Srch01_Hdr_RcvR  hdrRcvR, MCList<MST_RCV_ACT_D_R> dL) {
			copy(down0(), hdrRcvR, createMap_Srch01_HdrR_Srch01_Hdr_RcvR());
			copy(down1(), hdrRcvR, dL.get(0), createMap_Srch01_RcvR_Srch01_Hdr_RcvR());
			copy(down2(), dL.get(0), createMap_Srch01_DtlR_MST_RCV_ACT_D_R());
		}
		
		// Mapper
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
				addColumnPathMap(Srch01_HdrR.$can_ac_dt, Srch01_Hdr_RcvR.$can_ac_dt);
				addColumnPathMap(Srch01_HdrR.$usr_cd, Srch01_Hdr_RcvR.$usr_cd);
				addColumnPathMap(Srch01_HdrR.$usr_nm, Srch01_Hdr_RcvR.$usr_nm);
				addColumnPathMap(Srch01_HdrR.$dpt_cd, Srch01_Hdr_RcvR.$dpt_cd);
				addColumnPathMap(Srch01_HdrR.$dpt_nm, Srch01_Hdr_RcvR.$dpt_nm);
				addColumnPathMap(Srch01_HdrR.$wg_cd, Srch01_Hdr_RcvR.$wg_cd);
				addColumnPathMap(Srch01_HdrR.$wg_nm, Srch01_Hdr_RcvR.$wg_nm);
				addColumnPathMap(Srch01_HdrR.$def_bank_ac_cd, Srch01_Hdr_RcvR.$def_bank_ac_cd);
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
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.latest_flg(getLatestFlg(src));
			}
		}
		
		//Mapper
		protected Map_Srch01_RcvR_Srch01_Hdr_RcvR<Srch01_RcvR,Srch01_Hdr_RcvR,MST_RCV_ACT_D_R> createMap_Srch01_RcvR_Srch01_Hdr_RcvR() {
			return new Map_Srch01_RcvR_Srch01_Hdr_RcvR<Srch01_RcvR, Srch01_Hdr_RcvR, MST_RCV_ACT_D_R>();
		}

		public class Map_Srch01_RcvR_Srch01_Hdr_RcvR<D extends Srch01_RcvR, S extends Srch01_Hdr_RcvR, W extends MST_RCV_ACT_D_R> extends MAUCC_RowMapperWith<D,S,W>{
			
			protected W _hR;

			@Override
			public void setWith(W _hR) {
				this._hR = _hR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RcvR.$rcv_no, Srch01_Hdr_RcvR.$rcv_no);
				addColumnPathMap(Srch01_RcvR.$rcst_cd, Srch01_Hdr_RcvR.$rcst_cd);
				addColumnPathMap(Srch01_RcvR.$rcst_nm, Srch01_Hdr_RcvR.$rcst_nm);
				addColumnPathMap(Srch01_RcvR.$old_rcst_cd, Srch01_Hdr_RcvR.$old_rcst_cd);
				addColumnPathMap(Srch01_RcvR.$rcv_dt, Srch01_Hdr_RcvR.$rcv_dt);
				addColumnPathMap(Srch01_RcvR.$div_flg, Srch01_Hdr_RcvR.$div_flg);
				addColumnPathMap(Srch01_RcvR.$bcst_cd, Srch01_Hdr_RcvR.$bcst_cd);
				addColumnPathMap(Srch01_RcvR.$bcst_nm, Srch01_Hdr_RcvR.$bcst_nm);
				addColumnPathMap(Srch01_RcvR.$old_bcst_cd, Srch01_Hdr_RcvR.$old_bcst_cd);
				addColumnPathMap(Srch01_RcvR.$bill_dpt_cd, Srch01_Hdr_RcvR.$bill_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$bill_dpt_nm, Srch01_Hdr_RcvR.$bill_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$old_bill_dpt_cd, Srch01_Hdr_RcvR.$old_bill_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$trd_cur_cd, Srch01_Hdr_RcvR.$trd_cur_cd);
				addColumnPathMap(Srch01_RcvR.$trd_cur_nm, Srch01_Hdr_RcvR.$trd_cur_nm);
				addColumnPathMap(Srch01_RcvR.$amt_dec_place, Srch01_Hdr_RcvR.$amt_dec_place);
				addColumnPathMap(Srch01_RcvR.$upri_dec_place, Srch01_Hdr_RcvR.$upri_dec_place);
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
				addColumnPathMap(Srch01_RcvR.$ar_sttl_nm2, Srch01_Hdr_RcvR.$ar_sttl_nm2);
				addColumnPathMap(Srch01_RcvR.$sls_purc_typ2, Srch01_Hdr_RcvR.$sls_purc_typ2);
				addColumnPathMap(Srch01_RcvR.$purc_flg, Srch01_Hdr_RcvR.$purc_flg);
				addColumnPathMap(Srch01_RcvR.$sls_flg, Srch01_Hdr_RcvR.$sls_flg);
				addColumnPathMap(Srch01_RcvR.$tax_cd, Srch01_Hdr_RcvR.$tax_cd);
				addColumnPathMap(Srch01_RcvR.$tax_nm, Srch01_Hdr_RcvR.$tax_nm);
				addColumnPathMap(Srch01_RcvR.$tax_rate, Srch01_Hdr_RcvR.$tax_rate);
				addColumnPathMap(Srch01_RcvR.$debtor_id_typ, Srch01_Hdr_RcvR.$debtor_cred_id_typ);
				addColumnPathMap(Srch01_RcvR.$debtor_id_typ_nm, Srch01_Hdr_RcvR.$debtor_cred_id_typ_nm);
				addColumnPathMap(Srch01_RcvR.$debtor_id_cd, Srch01_Hdr_RcvR.$debtor_cred_id_cd);
				addColumnPathMap(Srch01_RcvR.$debtor_nm, Srch01_Hdr_RcvR.$debtor_cred_nm);
				addColumnPathMap(Srch01_RcvR.$debt_bd_dpt_cd, Srch01_Hdr_RcvR.$debt_bd_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$debt_bd_dpt_nm, Srch01_Hdr_RcvR.$debt_bd_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$trd_rmrks, Srch01_Hdr_RcvR.$trd_rmrks);
				addColumnPathMap(Srch01_RcvR.$sub_char1, Srch01_Hdr_RcvR.$sub_char1);
				addColumnPathMap(Srch01_RcvR.$sub_char2, Srch01_Hdr_RcvR.$sub_char2);
				addColumnPathMap(Srch01_RcvR.$sub_char3, Srch01_Hdr_RcvR.$sub_char3);
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
				addColumnPathMap(Srch01_RcvR.$ar_sttl_cd3, Srch01_Hdr_RcvR.$ar_sttl_cd3);
				addColumnPathMap(Srch01_RcvR.$ar_sttl_nm3, Srch01_Hdr_RcvR.$ar_sttl_nm3);
				addColumnPathMap(Srch01_RcvR.$creditor_id_typ, Srch01_Hdr_RcvR.$creditor_id_typ);
				addColumnPathMap(Srch01_RcvR.$creditor_id_typ_nm, Srch01_Hdr_RcvR.$creditor_id_typ_nm);
				addColumnPathMap(Srch01_RcvR.$creditor_id_cd, Srch01_Hdr_RcvR.$creditor_id_cd);
				addColumnPathMap(Srch01_RcvR.$creditor_nm, Srch01_Hdr_RcvR.$creditor_nm);
				addColumnPathMap(Srch01_RcvR.$cred_bd_dpt_cd, Srch01_Hdr_RcvR.$cred_bd_dpt_cd);
				addColumnPathMap(Srch01_RcvR.$cred_bd_dpt_nm, Srch01_Hdr_RcvR.$cred_bd_dpt_nm);
				addColumnPathMap(Srch01_RcvR.$rcv_upd_cntr, Srch01_Hdr_RcvR.$rcv_upd_cntr);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.slo_no(_hR.getStringNE("slo_no"));
				dest.bill_cl_typ(src.bill_cl_typ());
				if (MAC_BILL_CL_TYP.isEACH_SLS(dest.bill_cl_typ())) {
					dest.bill_dtl_adv_flg(false);
				}
				else {
					dest.bill_dtl_adv_flg(src.bill_dtl_adv_flg());
				}
			}
		}
		
		// Mapper
		protected Map_Srch01_DtlR_MST_RCV_ACT_D_R<Srch01_DtlR,MST_RCV_ACT_D_R> createMap_Srch01_DtlR_MST_RCV_ACT_D_R() {
			return new Map_Srch01_DtlR_MST_RCV_ACT_D_R<Srch01_DtlR, MST_RCV_ACT_D_R>();
		}

		public class Map_Srch01_DtlR_MST_RCV_ACT_D_R<D extends Srch01_DtlR, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_DtlR.$amt1, MST_RCV_ACT_D_R.$trd_cur_amt1);
				addColumnPathMap(Srch01_DtlR.$amt2, MST_RCV_ACT_D_R.$trd_cur_amt2);
				addColumnPathMap(Srch01_DtlR.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_no);
				addColumnPathMap(Srch01_DtlR.$rcv_act_d_seq, MST_RCV_ACT_D_R.$rcv_act_d_seq);
				addColumnPathMap(Srch01_DtlR.$rcv_no, MST_RCV_ACT_D_R.$gen_rcv_no);

			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.appl_amt(src.getNumberNE("appl_amt"));
			}
		}
		
		
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入金を検索する<br>
	 */
	public class Srch02 extends MSBGL_AdvRcvReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			// 入金情報の検索
			Srch02_RcvR rcvR = getRcv();
			if (!chkRcv(rcvR)) {
				return;
			}
			
			// 電文の設定
			MCRow.copyall(down0(), rcvR);
		}
		
		/**
		 * 入金情報を取得する
		 * 
		 * @return 入金情報
		 */
		protected Srch02_RcvR getRcv() {
			
			Srch02_RcvR rcvR = Srch02_RcvR.create();
			rcvR.addBooleanColumn("inc_tax_flg");
			executeQuery(rcvR, MSBGL0200_MST_RCV_S01(), up0());
			setTaxCd(rcvR);
			setPurcSlsFlg(rcvR);
			return rcvR;
		}

		protected void setTaxCd(Srch02_RcvR rcvR) {
			if (isNull(rcvR)) {
				return;
			}
			if (!isNull(rcvR.tax_cd()) && !rcvR.getBoolean("inc_tax_flg")) {
				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				MAM_TAX_R t = MAM_TAX_R.create("T");
				MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
				taxL_bldr.setSelect(t.tax_cd);
				taxL_bldr.addSelect(t.tax_nm);
				taxL_bldr.addSelect(t.tax_rate);
				taxL_bldr.setWhere(t.inc_tax_flg.eq(value(true)));
				taxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), rcvR.tax_rate());
				if (MAC_SLS_PURC_TYP.isPURC(rcvR.sls_purc_typ2())) {
					taxL_bldr.addWhereWithAnd(t.purc_flg.eq(value(true)));
				}
				else if (MAC_SLS_PURC_TYP.isSLS(rcvR.sls_purc_typ2())) {
					taxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
				}
				taxL_bldr.setOrderByAsc(t.tax_cd);
				int cnt = dbSelect("MSBGL0200_MAM_TAX_S01", taxL, taxL_bldr);
				
				if (cnt == 0) {
					rcvR.tax_cd(null);
					rcvR.tax_nm(null);
					rcvR.tax_rate(null);
					rcvR.sls_purc_typ2(null);
				}
				else {
					MAM_TAX_R taxR = taxL.get(0);
					rcvR.tax_cd(taxR.tax_cd());
					rcvR.tax_nm(taxR.tax_nm());
					rcvR.tax_rate(taxR.tax_rate());
				}
			}
		}
		/**
		 * 売上仕入税区分に応じて売上ＦＬＧ、仕入ＦＬＧをセットする。
		 * @param hR
		 * @return
		 */
		protected void setPurcSlsFlg(Srch02_RcvR rcvR) {
			if (isNull(rcvR)) {
				return;
			}
			
			// 売上仕入税区分
			if (MAC_SLS_PURC_TYP.isPURC(rcvR.sls_purc_typ2())) {
				rcvR.purc_flg(true);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(rcvR.sls_purc_typ2())) {
				rcvR.sls_flg(true);
			}
		}
		
		/**
		 * 入金情報検索結果のチェック
		 * 
		 * @param rcvR ヘッダ情報
		 * @return チェック結果がOKの場合にtrue
		 */
		protected boolean chkRcv(Srch02_RcvR rcvR) {
			
			if (rcvR.isEmpty()) {
				return false;
			}
			
			if (MSC_RCV_DAT_TYP.isAP(rcvR.dat_typ())) {
				throw new MCAppException(up0(), null, MSBGL0088);
			}

			if (!isNull(rcvR.draw_dt()) && rcvR.draw_dt().gt(getToday())) {
				throw new MCAppException(up0(), null, MSBGL0090);
			}
			
			if (rcvR.not_proc_bal().isZero()) {
				throw new MCAppException(up0(), null, MSBGL0091);
			}
			
			return true;
			
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を登録・訂正する前のチェックを行う<br>
	 */
	public class Chk01 extends MSBGL_AdvRcvReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUp() {
			super.initUp();
			up0().rcv_dt(up1().rcv_dt());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callRcvActCmnSChkSrv();
				callSloRegChkSrv();
			}
			setDown();
		}
		
		/**
		 * 受注登録サービスのチェック処理を実行する
		 */
		protected void callSloRegChkSrv() {	
			MSBBL_SloRegService.Slo_Chk04 ope = MSBBL_SloRegService.crtSlo_Chk04();
			Slo_Upd02_SloR sloR = Slo_Upd02_SloR.create();
			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
			MST_RCV_R rcvR = MST_RCV_R.create();
			
			// 更新時は、訂正前の受注ＮＯ、取引通貨ＣＤ、請求先ＣＤ、入金額+相殺額に差異がある場合のみサービスを呼び出す
			if (!up0().isStatusCreate()) {
				rcvActR = getOrgRcvActCache(up0().rcv_act_no(), up0().rcv_act_seq());
				rcvR = getRcv(rcvActR);
				if (isNull(rcvR) || (isNull(rcvR.rcv_no())) && MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvActR.trd_ptn_typ())) {
					rcvR = getRcvCache(rcvActR.rcv_no());
				}
				
				if ((isNull(rcvR.slo_no()) && isNull(up1().slo_no()))
						|| isSame(rcvR.slo_no(), up1().slo_no())
						&& isSame(rcvActR.trd_cur_cd(), up1().trd_cur_cd())
						&& isSame(rcvActR.bcst_cd(), up1().bcst_cd())
						&& isSame(rcvActR.trd_cur_amt(), up2().amt1().add(up2().amt2()))) {
					return;
				}
			}
			// 新規登録時は受注ＮＯの入力がない場合、サービス呼出不要
			else if (isNull(up1().slo_no())){
				return;
			}
			
			copy(sloR, up1(), createMap_Slo_Upd02_SloR_RcvR());
			setAmt(ope, sloR, rcvActR, rcvR);
			ope.up0().add(sloR);
			
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}
		
		/**
		 * 前受金入金額設定
		 * @param sloR
		 */
		protected void setAmt(MSBBL_SloRegService.Slo_Chk04 ope, Slo_Upd02_SloR sloR, MST_RCV_ACT_R rcvActR, MST_RCV_R rcvR) {
			MCNumber advRcvAmt = null;
			
			//　更新時設定（訂正後に受注情報がない場合）
			if (up0().isStatusModify() && isNull(up1().slo_no())) {
				sloR.slo_no(rcvR.slo_no());
				advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)).negate();
			}

			//　更新時設定（訂正前後で受注情報がある場合）
			else if (up0().isStatusModify() && !isNull(rcvR.slo_no()) && !isNull(up1().slo_no())) {
				// 受注ＮＯ、取引通貨ＣＤが変更された場合、赤伝（訂正前の受注ＮＯ、取引通貨ＣＤ、入金額+相殺額（符号反転））を１行目に設定する。
				if (!(isSame(rcvR.slo_no(), up1().slo_no())
						&& isSame(rcvActR.trd_cur_cd(), up1().trd_cur_cd()))) {
					Slo_Upd02_SloR sloR1 = Slo_Upd02_SloR.create();
					copy(sloR1, rcvR, rcvActR, createMap_Slo_Upd02_SloR_MST_RCV_R());
					ope.up0().add(sloR1);
					
					// 2行目には、訂正後の受注ＮＯ、取引通貨ＣＤ、入金額+相殺額を設定する。
					advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO));
				}
				// 入金額+相殺額のみ変更された場合、（訂正後の入金額+相殺額）－（訂正前の入金額+相殺額）を設定
				else if (!isSame(rcvActR.trd_cur_amt(), up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)))) {
					advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)).subtract(rcvActR.trd_cur_amt());
				}
				//上記以外が変更された場合、０を設定
				else{
					advRcvAmt = MCNumber.ZERO;
				}
			}
			// 新規登録時、または更新時に訂正前に受注情報がない場合
			else {
				advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO));
			}
			
			// 前受金その他勘定相殺の場合は符号を反転する。
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(up0().trd_ptn_typ())) {
				advRcvAmt = advRcvAmt.negate();
			}
			
			sloR.adv_rcv_amt(advRcvAmt);
		}
		
		/**
		 * 入金実績共通サービスのチェック処理を実行する
		 */
		protected void callRcvActCmnSChkSrv() {
			MSBGL_RcvActCmnService.RcvActCmn_Chk01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk01();
			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			
			copy(hdrR, up1(), up0(), createMap_RcvActCmn_Chk01_HdrR_RcvR());
			ope.up0().add(hdrR);
			
			ope.exec();
			copyErrFlg(up0(), ope.down0().get(0));
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkBase());
			compBase(up1());

			up1().xrate_cd(getCo().sls_xrate_cd());
			
			return msgL;
		}
		
		/**
		 * 手形情報の補完
		 */
		protected void compBase(RcvR up1) {
			
			if (isNull(up1.rcv_no())) {
				return;
			}
			
			MST_RCV_R rcvR = getRcvCache(up1.rcv_no());
			if (isNull(rcvR.note_mng_no())) {
				return;
			}
			
			
			MST_NOTE_R noteR = MST_NOTE_R.create("T");
			MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(noteR);
			noteR_bldr.setSelect(noteR.note_mng_no);
			noteR_bldr.addSelect(noteR.note_no);
			dbSelectKey("MSBGL0200_MST_NOTE_S01", noteR, noteR_bldr, rcvR);
			
			if (!noteR.isEmpty()) {
				up1.note_mng_no(noteR.note_mng_no());
				up1.note_no(noteR.note_no());
			}
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
		
			return msgL;
		}
		
		/**
		 * 入金情報のロック
		 * 
		 * @param up1
		 * @return
		 */
		protected MCMessageList rcvLock(RcvR up1) {
			MCMessageList msgL = new MCMessageList();
			
			// 入金ＮＯが存在する場合、入金を検索してロックする。
			// 入金の更新カウンタチェックを行う。	
			if (isNull(up1.rcv_no())) {
				return msgL;
			}
			
			MST_RCV_R rcvR = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
			rcvR_bldr.setSelect(rcvR.upd_cntr);
			rcvR_bldr.addSelect(rcvR.rcv_no);
			rcvR_bldr.addSelect(rcvR.note_mng_no);
			rcvR_bldr.addSelect(rcvR.slo_no);
			dbSelectKeyForUpdateNoWait("MSBGL0200_MST_RCV_S01", rcvR, rcvR_bldr, up1);
			msgL.addAll(checkUpdCntrNE(up1, RcvR.$rcv_upd_cntr, rcvR));
			
			// 入金情報をキャッシュ
			initRcvCache(rcvR, rcvR_bldr);
						
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
			
			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR);
			rcvActR_bldr.setSelect(rcvActR.rcv_act_no);
			rcvActR_bldr.addSelect(rcvActR.rcv_act_seq);
			rcvActR_bldr.addSelect(rcvActR.slip_sts_typ);
			rcvActR_bldr.addSelect(rcvActR.trd_ptn_typ);
			rcvActR_bldr.addSelect(rcvActR.trd_cur_cd);
			rcvActR_bldr.addSelect(rcvActR.trd_cur_amt);
			rcvActR_bldr.addSelect(rcvActR.upd_cntr);
			rcvActR_bldr.addSelect(rcvActR.dpt_cd);
			rcvActR_bldr.addSelect(rcvActR.rcv_no);
			dbSelectKeyForUpdateNoWait("MSBGL0200_MST_RCV_ACT_S02", rcvActR, rcvActR_bldr, up0);
			msgL.addAll(checkUpdCntrNE(up0, HdrR.$rcv_act_upd_cntr, rcvActR));
			
			// 更新前入金実績情報をキャッシュ
			initOrgRcvActCache(rcvActR, rcvActR_bldr);
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<HdrR> notErrHdrL = getChkList(up0());
			MCList<RcvR> notErrRcvL = getChkList(up1());
			if (notErrHdrL.isEmpty() || notErrRcvL.isEmpty()) {
				return msgL;
			}
			
			HdrR notErrHdrR = notErrHdrL.get(0);
			RcvR notErrRcvR = notErrRcvL.get(0);
			compSub();
			
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrHdrR, HdrR.$dpt_cd));
			// 更新の場合は変更前のＤＡＣチェックも行う。
			if (!isNull(notErrHdrR.rcv_act_no())) {
				msgL.addAll(checkWritableDptCdDac(getOrgRcvActCache(notErrHdrR.rcv_act_no(), notErrHdrR.rcv_act_seq()), MST_RCV_ACT_R.$dpt_cd));
			}
			
			msgL.addAll(chkReq(notErrHdrR));
			
			msgL.addAll(chkOther(notErrHdrR, notErrRcvR));
			
			return msgL;
		}
		protected void compSub() {
			if (MAC_BILL_CL_TYP.isEACH_SLS(up1().bill_cl_typ())) {
				up1().bill_dtl_adv_flg(false);
			}
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 条件付リストロジックチェックの処理
			ListLogicBind billDptBind = getListLogicBind(up1(), RcvR.$bill_dpt_cd);
			billDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);
			
			ListLogicBind bdDptBind = getListLogicBind(up1(), RcvR.$debt_bd_dpt_cd);
			bdDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);
			
			ListLogicBind credBdDptBind = getListLogicBind(up1(), RcvR.$cred_bd_dpt_cd);
			credBdDptBind.putBind(DptCols.$i_dt, up0(), HdrR.$ac_dt);
		}
		
		/**
		 * 条件付必須チェック
		 * @param up0
		 * @return
		 */
		protected MCMessageList chkReq(HdrR up0) {
			MCMessageList msgL = new MCMessageList();
			
			// 更新時、取消計上日は必須
			if (!isNull(up0.rcv_act_no())) {
				msgL.addAll(check(up0, HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		/**
		 * 固有チェック
		 * @param up0
		 * @param up1
		 * @return
		 */
		protected MCMessageList chkOther(HdrR up0, RcvR up1) {
			MCMessageList msgL = new MCMessageList();
			
			// 未処理残高のチェック
			if (!isNull(up1.rcv_no())) {
				up1.addStringColumn("rcv_act_no", up0.rcv_act_no());
				up1.addNumberColumn("rcv_act_seq", isNull(up0.rcv_act_seq()) ? null : up0.rcv_act_seq());
				
				MST_RCV_R rcvR = MST_RCV_R.create("T");
				MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
				MST_RCV_ACT_R rcvact = MST_RCV_ACT_R.create("RCVACT");
				rcvR_bldr.setSelect(rcvR.not_proc_bal.add( nvl( rcvact.subttl1, value(0) )).as("not_proc_bal"));
				rcvR_bldr.addLeftOuterJoin(rcvact, rcvR.rcv_no.eq(rcvact.rcv_no)
						.and(rcvact.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(rcvact.rcv_act_no.eq(bind("rcv_act_no")))
						.and(rcvact.rcv_act_seq.eq(bind("rcv_act_seq"))));
				rcvR_bldr.setWhere(rcvR.rcv_no.eq(bind("rcv_no")));
				dbSelect("MSBGL0200_MST_RCV_S02", rcvR, rcvR_bldr, up1);
				
				if (rcvR.not_proc_bal().lt(up2().amt1())) {
					msgL.add(new MCMessage(MSBGL0096));
				}

			}
			// 税マスタの存在チェック
			msgL.addAll(chkTaxExist(up1));
			
			if (isNull(up0.rcv_act_no())) {
				return msgL;
			}

			// 決済方法マスタの存在チェック
			msgL.addAll(chkSttlRcvExist(up1));
							
			// 元入金実績の取得
			MST_RCV_ACT_R orgRcvActR = getOrgRcvActCache(up0.rcv_act_no(), up0.rcv_act_seq());
			
			// 入金実績が取消済みの場合
			if (!MAC_SLIP_STS_TYP.isCRT(orgRcvActR.slip_sts_typ())) {
				msgL.add(new MCMessage(MSBGL0050));
				return msgL;
			}
			// 仮受、前受の入金実績の取消
			if (MAC_TRD_PTN_TYP.isRCV_ADV(orgRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isRCV_SUSP(orgRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(orgRcvActR.trd_ptn_typ())) {
				msgL.addAll(chkRcvForAdv(up0));
			}
			
			return msgL;
		}
		/**
		 * 税マスタ取得
		 * @param taxCd
		 * @param purcFlg
		 * @param slsFlg
		 * @return
		 */
		protected MAM_TAX_R selectTax(String taxCd, boolean purcFlg, boolean slsFlg) {
			MAM_TAX_R taxR = MAM_TAX_R.create("T");
			MCQueryApiBuilder taxR_bldr = MCQueryApiBuilder.create(taxR);
			taxR_bldr.setSelect(taxR.tax_rate);
			taxR_bldr.addSelect(taxR.tax_typ);
			taxR_bldr.setWhere(taxR.tax_cd.eq(bind("1")), taxCd);
			taxR_bldr.addWhereWithAnd(taxR.inc_tax_flg.eq(value(true)));
			if (purcFlg) {
				taxR_bldr.addWhereWithAnd(taxR.purc_flg.eq(value(true)));
			}
			else if (slsFlg) {
				taxR_bldr.addWhereWithAnd(taxR.sls_flg.eq(value(true)));
			}
			dbSelect("MSBGL0200_MAM_TAX_S02", taxR, taxR_bldr);

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
			return msgL;
		}
		
		/**
		 * 決済方法マスタの存在チェック
		 * 
		 * @param up1
		 * @return
		 */
		protected MCMessageList chkSttlRcvExist(RcvR up1) {
			MCMessageList msgL = new MCMessageList();
			
			// 入金引継でない場合のみチェックする
			if (isNull(up1.rcv_no())) {
				MAM_STTL_R sttlR = MAM_STTL_R.create("T");
				MCQueryApiBuilder sttlR_bldr = MCQueryApiBuilder.create(sttlR);
				sttlR_bldr.setSelect(sttlR.rcv_reg_typ);
				sttlR_bldr.setWhere(sttlR.sttl_cd.eq(bind("1")), up1.ar_sttl_cd1());
				dbSelect("MSBGL0200_MAM_STTL_S01", sttlR, sttlR_bldr);

				// 入金方法の入金登録区分が「登録不可」「登録可能」でない場合はエラー。
				if (!(MAC_RCV_REG_TYP.isNON(sttlR.rcv_reg_typ()) || MAC_RCV_REG_TYP.isARB(sttlR.rcv_reg_typ()))) {
					msgL.add(new MCMessage(MSBGL0006, up1.tax_cd1()));
				}
			}
			return msgL;
		}
		
		/**
		 * 前受・仮受から発生した入金情報のチェック<br>
		 * 既に消しこまれている場合は処理できない
		 * 
		 * @param up0
		 * @return
		 */
		protected MCMessageList chkRcvForAdv(HdrR up0) {
			MCMessageList msgL = new MCMessageList();
			
			MST_RCV_R rcvR = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
			rcvR_bldr.setSelect(rcvR.rcv_proc_amt);
			rcvR_bldr.addSelect(rcvR.div_flg);
			rcvR_bldr.addSelect(rcvR.div_src_rcv_no);
			rcvR_bldr.setWhere(rcvR.src_rcv_act_no.eq(bind("1")), up0.rcv_act_no());
			rcvR_bldr.addWhereWithAnd(rcvR.src_rcv_act_seq.eq(bind("1")), up0.rcv_act_seq());
			rcvR_bldr.addWhereWithAnd(rcvR.div_src_rcv_no.isNull());
			
			dbSelect("MSBGL0200_MST_RCV_S03", rcvR, rcvR_bldr);

			// 分割元入金ＮＯがNULL以外の場合は、エラー
			if (!isNull(rcvR.div_src_rcv_no())) {
				msgL.add(new MCMessage(MSBGL0004));
			}
			
			if (rcvR.div_flg()) {
				msgL.add(new MCMessage(MSBGL0007));
			}
			else if (!rcvR.rcv_proc_amt().isZero()) {
				msgL.add(new MCMessage(MSBGL0051));
			}

			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			copyall(down1(), up1());
			copyall(down2(), up2());
		}
		
		/**
		 * 受注登録サービスチェック処理設定　上り電文（RcvR） > サービス上り電文(Slo_Upd02_SloR) 
		 * 
		 * @return
		 */
		protected Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR,RcvR> createMap_Slo_Upd02_SloR_RcvR() {
			return new Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR, RcvR>();
		}
		
		public class Map_Slo_Upd02_SloR_RcvR<D extends Slo_Upd02_SloR, S extends RcvR> extends MCRowMapper<D,S>{
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_Upd02_SloR.$slo_no, RcvR.$slo_no);
				addColumnPathMap(Slo_Upd02_SloR.$trd_cur_cd, RcvR.$trd_cur_cd);
				addColumnPathMap(Slo_Upd02_SloR.$bcst_cd, RcvR.$bcst_cd);
				addColumnPathMap(Slo_Upd02_SloR.$peg_no, RcvR.$peg_no);

			}
		}
		
		/**
		 * 入金実績共通サービスチェック処理設定　上り電文（RcvR,HdrR） > サービス上り電文(RcvActCmn_Chk01_HdrR) 
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
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$bcst_cd, RcvR.$bcst_cd);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_no, RcvR.$rcv_no);
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_no, RcvR.$note_no);
				
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

				dest.ac_dt(_hR.ac_dt());
				dest.can_ac_dt(_hR.can_ac_dt());
				
				dest.trd_cd(_hR.trd_cd());
				dest.trd_ptn_typ(_hR.trd_ptn_typ());
				dest.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(_hR.trd_ptn_typ()));
				dest.hdr_dtl_peg(1);
			}
		}
		
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 前受仮受の入金実績を取り消す前のチェックを行う<br>
	 */
	public class Chk02 extends MSBGL_AdvRcvReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callRcvActCmnSChkSrv();
				callSloRegChkSrv();
			}
			setDown();
		}
		
		/**
		 * 受注登録サービスのチェック処理を実行する
		 */
		protected void callSloRegChkSrv() {	
			MSBBL_SloRegService.Slo_Chk04 ope = MSBBL_SloRegService.crtSlo_Chk04();
			Slo_Upd02_SloR sloR = Slo_Upd02_SloR.create();
			MST_RCV_ACT_R rcvActR = getOrgRcvActCache(up0().rcv_act_no(), up0().rcv_act_seq());
			MST_RCV_R rcvR = getRcv(rcvActR);
			if (isNull(rcvR) || (isNull(rcvR.rcv_no())) && MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvActR.trd_ptn_typ())) {
				rcvR = getRcvCache(rcvActR.rcv_no());
			}
			
			// 取消前の入金実績情報に紐付く入金情報がない、または、受注ＮＯがNullの場合は受注登録サービスの呼出は不要
			if (rcvR.isEmpty() || isNull(rcvR.slo_no())) {
				return;
			}
			
			copy(sloR, rcvR, rcvActR, createMap_Slo_Upd02_SloR_MST_RCV_R());
			ope.up0().add(sloR);
			
			ope.exec();
			copyErrFlg(up0(), ope.down0().get(0));
		}
		
		/**
		 * 入金実績共通サービスのチェック処理を実行する
		 */
		protected void callRcvActCmnSChkSrv() {
			MSBGL_RcvActCmnService.RcvActCmn_Chk01 ope = MSBGL_RcvActCmnService.crtRcvActCmn_Chk01();
			RcvActCmn_Chk01_HdrR hdrR = RcvActCmn_Chk01_HdrR.create();
			copy(hdrR, up1(), up0(), createMap_RcvActCmn_Chk01_Del01_HdrR_Del01_RcvR());
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
			
			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR);
			rcvActR_bldr.setSelect(rcvActR.rcv_act_no);
			rcvActR_bldr.addSelect(rcvActR.rcv_act_seq);
			rcvActR_bldr.addSelect(rcvActR.slip_sts_typ);
			rcvActR_bldr.addSelect(rcvActR.trd_ptn_typ);
			rcvActR_bldr.addSelect(rcvActR.trd_cur_cd);
			rcvActR_bldr.addSelect(rcvActR.trd_cur_amt);
			rcvActR_bldr.addSelect(rcvActR.upd_cntr);
			rcvActR_bldr.addSelect(rcvActR.dpt_cd);
			rcvActR_bldr.addSelect(rcvActR.rcv_no);
			dbSelectKeyForUpdateNoWait("MSBGL0200_MST_RCV_ACT_S03", rcvActR, rcvActR_bldr, up0);
			msgL.addAll(checkUpdCntrNE(up0, HdrR.$rcv_act_upd_cntr, rcvActR));
			
			// 更新前入金実績情報をキャッシュ
			initOrgRcvActCache(rcvActR, rcvActR_bldr);
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
			if (isNull(up1.rcv_no())) {
				return msgL;
			}
			
			MST_RCV_R rcvR = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
			rcvR_bldr.setSelect(rcvR.rcv_no);
			rcvR_bldr.addSelect(rcvR.slo_no);
			rcvR_bldr.addSelect(rcvR.bcst_cd);
			rcvR_bldr.addSelect(rcvR.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0200_MST_RCV_S04", rcvR, rcvR_bldr, up1);
			msgL.addAll(checkUpdCntrNE(up1, RcvR.$rcv_upd_cntr, rcvR));
			// 入金情報をキャッシュ
			initRcvCache(rcvR, rcvR_bldr);
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_HdrR> notErrHdrL = getChkList(up0());
			if (notErrHdrL.isEmpty()) {
				return msgL;
			}
			Chk02_HdrR notErrHdrR = notErrHdrL.get(0);
			
			
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(getOrgRcvActCache(notErrHdrR.rcv_act_no(), notErrHdrR.rcv_act_seq()), MST_RCV_ACT_R.$dpt_cd));

			msgL.addAll(chkOther(notErrHdrR));
			
			return msgL;
		}
		
		/**
		 * 固有チェック
		 * @param up0
		 * @return
		 */
		protected MCMessageList chkOther(Chk02_HdrR up0) {
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(up0.rcv_act_no())) {
				return msgL;
			}
			
			// 元入金実績の取得
			MST_RCV_ACT_R orgRcvActR = getOrgRcvActCache(up0.rcv_act_no(), up0.rcv_act_seq());
			
			// 入金実績が取消済みの場合
			if (!MAC_SLIP_STS_TYP.isCRT(orgRcvActR.slip_sts_typ())) {
				msgL.add(new MCMessage(MSBGL0050));
				return msgL;
			}
			// 仮受、前受の入金実績の取消の場合
			if (MAC_TRD_PTN_TYP.isRCV_ADV(orgRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isRCV_SUSP(orgRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(orgRcvActR.trd_ptn_typ())) {
				msgL.addAll(chkRcvForAdv(up0));
			}
			
			return msgL;
		}
		
		/**
		 * 前受・仮受から発生した入金情報のチェック<br>
		 * 既に消しこまれている場合は処理できない
		 * 
		 * @param up0
		 * @return
		 */
		protected MCMessageList chkRcvForAdv(Chk02_HdrR up0) {
			MCMessageList msgL = new MCMessageList();
			
			MST_RCV_R rcvR = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
			rcvR_bldr.setSelect(sum(rcvR.rcv_proc_amt).as("sum_rcv_proc_amt"));
			rcvR_bldr.setWhere(rcvR.src_rcv_act_no.eq(bind("1")), up0().rcv_act_no());
			rcvR_bldr.addWhereWithAnd(rcvR.src_rcv_act_seq.eq(bind("1")), up0().rcv_act_seq());
			dbSelect("MSBGL0200_MST_RCV_S05", rcvR, rcvR_bldr);

			if (!rcvR.getNumber("sum_rcv_proc_amt").isZero()) {
				msgL.add(new MCMessage(MSBGL0051));
			}

			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}
		
		
		
		// Mapper
		protected Map_RcvActCmn_Chk01_HdrR_Chk02_RcvR<RcvActCmn_Chk01_HdrR,Chk02_RcvR,Chk02_HdrR> createMap_RcvActCmn_Chk01_Del01_HdrR_Del01_RcvR() {
			return new Map_RcvActCmn_Chk01_HdrR_Chk02_RcvR<RcvActCmn_Chk01_HdrR, Chk02_RcvR, Chk02_HdrR>();
		}

		public class Map_RcvActCmn_Chk01_HdrR_Chk02_RcvR<D extends RcvActCmn_Chk01_HdrR, S extends Chk02_RcvR, W extends Chk02_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
			
			protected W _hR;

			@Override
			public void setWith(W _hR) {
				this._hR = _hR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk01_HdrR.$peg_no, RcvR.$peg_no);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_no(_hR.rcv_act_no());
				dest.rcv_act_seq(_hR.rcv_act_seq());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.can_ac_dt(_hR.can_ac_dt());
				
				dest.hdr_dtl_peg(1);
			}
		}
	}
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を登録する<br>
	 */
	public class Ins01 extends MSBGL_AdvRcvReg_MC_A.Ins01 {
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
			
			// 受注更新サービス
			sloCmn();
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvR.$peg_no, up1());
			setPegNo(DtlR.$peg_no, up2());
			up0().setStatus(Status.CREATE);
			up2().setStatus(Status.CREATE);
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_AdvRcvReg.Chk01 ope = MSBGL_AdvRcvReg.crtChk01();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			copyall(ope.up2(), up2());
			
			ope.exec();
			
			copyall(up0(), ope.down0());
			copyall(up1(), ope.down1());
			copyall(up2(), ope.down2());
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
			
			RcvActCmn_Chk01_DtlR dtlR = RcvActCmn_Chk01_DtlR.create();
			copy(dtlR, up2(), createMap_RcvActCmn_Chk01_DtlR_DtlR());
			ope.up1().add(dtlR);
			ope.exec();
			
			// 下り電文設定
			copy(down0(), ope.down1(), createMap_HdrR_RcvAct_BaseR());

			// 仮受金その他相殺、前受金その他相殺の時は入金明細の設定は不要
			if (!(MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(up0().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(up0().trd_ptn_typ()))) {
				copy(down1(), ope.down0().get(0), createMap_DtlR_RcvActCmn_Chk01_DtlR());
			}
		}
		
		/**
		 * 受注更新サービスを実行する。
		 * 
		 */
		protected void sloCmn() {
			if (isNull(up1().slo_no())) {
				return;
			}

			MSBBL_SloRegService.Slo_Upd02 ope = MSBBL_SloRegService.crtSlo_Upd02();
			Slo_Upd02_SloR upd02R = Slo_Upd02_SloR.create();

			copy(upd02R, up1(),up2(), createMap_Slo_Upd02_SloR_RcvR());
			
			// 取引パタン区分が「前受金その他勘定相殺」の場合は符号反転する。
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(up0().trd_ptn_typ())) {
				upd02R.adv_rcv_amt(upd02R.adv_rcv_amt().negate());
			}
			
			ope.up0().add(upd02R);
			ope.exec();
		}
		
		/**
		 * 受注登録サービス処理設定　上り電文（RcvR,DtlR） > サービス上り電文(Slo_Upd02_SloR) 
		 * 
		 * @return
		 */
		protected Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR,RcvR,DtlR> createMap_Slo_Upd02_SloR_RcvR() {
			return new Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR, RcvR,DtlR>();
		}

		public class Map_Slo_Upd02_SloR_RcvR<D extends Slo_Upd02_SloR, S extends RcvR, W extends DtlR> extends MAUCC_RowMapperWith<D,S,W>{
			
			protected W _dR;

			@Override
			public void setWith(W _dR) {
				this._dR = _dR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_Upd02_SloR.$slo_no, RcvR.$slo_no);
				addColumnPathMap(Slo_Upd02_SloR.$trd_cur_cd, RcvR.$trd_cur_cd);

			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.adv_rcv_amt(_dR.amt1().add(nvl(_dR.amt2(), MCNumber.ZERO)));
			}
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を訂正する<br>
	 */
	public class Upd01 extends MSBGL_AdvRcvReg_MC_A.Upd01 {
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
			
			MST_RCV_ACT_R rcvActR = getOrgRcvActCache(up0().rcv_act_no(), up0().rcv_act_seq());
			MST_RCV_R rcvR = getRcv(rcvActR);
			if (isNull(rcvR) || (isNull(rcvR.rcv_no())) && MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvActR.trd_ptn_typ())) {
				rcvR = getRcvCache(rcvActR.rcv_no());
			}
			
			// 入金実績サービス
			rcvActCmn();
			
			// 受注更新サービス
			sloCmn(rcvActR, rcvR);
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvR.$peg_no, up1());
			setPegNo(DtlR.$peg_no, up2());
			up0().setStatus(Status.MODIFY);
			up2().setStatus(Status.MODIFY);
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_AdvRcvReg.Chk01 ope = MSBGL_AdvRcvReg.crtChk01();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			copyall(ope.up2(), up2());
			
			ope.exec();
			
			copyall(up0(), ope.down0());
			copyall(up1(), ope.down1());
			copyall(up2(), ope.down2());
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
			
			RcvActCmn_Chk01_DtlR dtlR = RcvActCmn_Chk01_DtlR.create();
			copy(dtlR, up2(), createMap_RcvActCmn_Chk01_DtlR_DtlR());
			ope.up1().add(dtlR);
			ope.exec();
			
			
			// 下り電文設定
			copy(down0(), ope.down1(), createMap_HdrR_RcvAct_BaseR());
			
			// 仮受金その他相殺、前受金その他相殺の時は入金明細の設定は不要
			if (!(MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(up0().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(up0().trd_ptn_typ()))) {
				copy(down1(), ope.down0().get(0), createMap_DtlR_RcvActCmn_Chk01_DtlR());
			}
		}
		
		/**
		 * 受注更新サービスを実行する。
		 * 
		 */
		protected void sloCmn(MST_RCV_ACT_R rcvActR, MST_RCV_R rcvR) {

			// 訂正前の受注ＮＯ、取引通貨ＣＤ、入金額+相殺額に差異がある場合のみサービスを呼び出す
			if ((isNull(rcvR.slo_no()) && isNull(up1().slo_no()))
					|| isSame(rcvR.slo_no(), up1().slo_no())
							&& isSame(rcvActR.trd_cur_cd(), up1().trd_cur_cd())
							&& isSame(rcvActR.trd_cur_amt(), up2().amt1().add(up2().amt2()))) {
				return;
			}
			
			MSBBL_SloRegService.Slo_Upd02 ope = MSBBL_SloRegService.crtSlo_Upd02();
			Slo_Upd02_SloR upd02R = Slo_Upd02_SloR.create();
			
			copy(upd02R, up1(), createMap_Slo_Upd02_SloR_RcvR());
			setAmt(ope, upd02R, rcvActR, rcvR);
			ope.up0().add(upd02R);

			ope.exec();
		}
		
		/**
		 * 前受金入金額設定
		 * @param sloR
		 */
		protected void setAmt(MSBBL_SloRegService.Slo_Upd02 ope, Slo_Upd02_SloR upd02R, MST_RCV_ACT_R rcvActR, MST_RCV_R rcvR) {
			MCNumber advRcvAmt = null;
			
			//　更新時設定（訂正後の受注情報がない場合）
			if (isNull(up1().slo_no())) {
				upd02R.slo_no(rcvR.slo_no());
				advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)).negate();
			}
			//　更新時設定（訂正前後の受注情報がある場合）
			else if (!isNull(rcvR.slo_no()) && !isNull(up1().slo_no())) {
				// 受注ＮＯ、取引通貨ＣＤが変更された場合、赤伝（訂正前の受注ＮＯ、取引通貨ＣＤ、入金額+相殺額（符号反転））を１行目に設定する。
				if (!(isSame(rcvR.slo_no(), up1().slo_no())
						&& isSame(rcvActR.trd_cur_cd(), up1().trd_cur_cd()))) {
					Slo_Upd02_SloR sloR1 = Slo_Upd02_SloR.create();
					copy(sloR1, rcvR, rcvActR, createMap_Slo_Upd02_SloR_MST_RCV_R());
					ope.up0().add(sloR1);
					
					// ２行目の金額には、訂正後の受注ＮＯ、取引通貨ＣＤ、入金額+相殺額を設定する。
					advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO));
				}
				// 入金額+相殺額のみ変更された場合、（訂正後の入金額+相殺額）－（訂正前の入金額+相殺額）を設定
				else if (!isSame(rcvActR.trd_cur_amt(), up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)))) {
					advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO)).subtract(rcvActR.trd_cur_amt());
				}
			}
			// 訂正前の入金情報がない場合
			else {
				advRcvAmt = up2().amt1().add(nvl(up2().amt2(), MCNumber.ZERO));
			}
			
			// 前受金その他勘定相殺の場合は符号を反転する。
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(up0().trd_ptn_typ())) {
				advRcvAmt = advRcvAmt.negate();
			}
			
			upd02R.adv_rcv_amt(advRcvAmt);
		}
		
		/**
		 * 受注登録サービス処理設定　上り電文（RcvR） > サービス上り電文(Slo_Upd02_SloR) 
		 * 
		 * @return
		 */
		protected Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR,RcvR> createMap_Slo_Upd02_SloR_RcvR() {
			return new Map_Slo_Upd02_SloR_RcvR<Slo_Upd02_SloR, RcvR>();
		}

		public class Map_Slo_Upd02_SloR_RcvR<D extends Slo_Upd02_SloR, S extends RcvR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_Upd02_SloR.$slo_no, RcvR.$slo_no);
				addColumnPathMap(Slo_Upd02_SloR.$trd_cur_cd, RcvR.$trd_cur_cd);

			}
		}
		
	}
	
	// Mapper
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
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bcst_cd, RcvR.$bcst_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bill_dpt_cd, RcvR.$bill_dpt_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_cd1, RcvR.$ar_sttl_cd1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_typ1, RcvR.$ar_sttl_typ1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$tax_cd2, RcvR.$tax_cd1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$tax_typ2, RcvR.$tax_typ1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$tax_rate2, RcvR.$tax_rate1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_cd2, RcvR.$ar_sttl_cd2);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$ar_sttl_typ2, RcvR.$ar_sttl_typ2);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_no, RcvR.$rcv_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$slo_no, RcvR.$slo_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$rcv_dt, RcvR.$rcv_dt);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bank_ac_cd, RcvR.$bank_ac_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$xfr_psn, RcvR.$xfr_psn);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$trd_rmrks, RcvR.$trd_rmrks);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_no, RcvR.$note_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$note_mng_no, RcvR.$note_mng_no);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char1, RcvR.$sub_char1);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char2, RcvR.$sub_char2);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$sub_char3, RcvR.$sub_char3);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$trd_cur_cd, RcvR.$trd_cur_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$xrate, RcvR.$xrate);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$xrate_cd, RcvR.$xrate_cd);
			addColumnPathMap(RcvActCmn_Chk01_HdrR.$bill_dtl_adv_flg, RcvR.$bill_dtl_adv_flg);
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
			
			// 取引パタン区分が「仮受金その他勘定相殺」「前受金その他勘定相殺」
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(_hR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(_hR.trd_ptn_typ())) {
				dest.ar_sttl_cd3(src.ar_sttl_cd3());
				dest.ar_sttl_typ3(src.ar_sttl_typ3());
				dest.debt_cred_id_typ(src.creditor_id_typ());
				dest.debt_cred_id_cd(src.creditor_id_cd());
				dest.debt_cred_nm(src.creditor_nm());
				dest.bd_dpt_cd(src.cred_bd_dpt_cd());
			}
			else {
				dest.debt_cred_id_typ(src.debtor_id_typ());
				dest.debt_cred_id_cd(src.debtor_id_cd());
				dest.debt_cred_nm(src.debtor_nm());
				dest.bd_dpt_cd(src.debt_bd_dpt_cd());
			}
		}
	}
	
	// Mapper
	protected Map_RcvActCmn_Chk01_DtlR_DtlR<RcvActCmn_Chk01_DtlR,DtlR> createMap_RcvActCmn_Chk01_DtlR_DtlR() {
		return new Map_RcvActCmn_Chk01_DtlR_DtlR<RcvActCmn_Chk01_DtlR, DtlR>();
	}

	public class Map_RcvActCmn_Chk01_DtlR_DtlR<D extends RcvActCmn_Chk01_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt1, DtlR.$amt1);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt2, DtlR.$amt2);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$amt3, DtlR.$amt3);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_no, DtlR.$rcv_act_d_no);
			addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_seq, DtlR.$rcv_act_d_seq);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.iv_no(MAC_STR.NULL_VAL.value());
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
			addColumnPathMap(HdrR.$ac_ym, RcvAct_BaseR.$ac_ym);
			addColumnPathMap(HdrR.$rcv_act_no, RcvAct_BaseR.$rcv_act_no);
			addColumnPathMap(HdrR.$rcv_act_seq, RcvAct_BaseR.$rcv_act_seq);
			addColumnPathMap(HdrR.$rcv_act_rev, RcvAct_BaseR.$rcv_act_rev);
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
			addColumnPathMap(DtlR.$rcv_no, RcvActCmn_Chk01_DtlR.$rcv_no);

		}
	}
	
	
	/**
	 * 受注登録サービスチェック処理設定　上り電文（MST_RCV_R,MST_RCV_ACT_R） > サービス上り電文(Slo_Upd02_SloR) 
	 * 
	 * @return
	 */
	protected Map_Slo_Upd02_SloR_MST_RCV_R<Slo_Upd02_SloR,MST_RCV_R,MST_RCV_ACT_R> createMap_Slo_Upd02_SloR_MST_RCV_R() {
		return new Map_Slo_Upd02_SloR_MST_RCV_R<Slo_Upd02_SloR, MST_RCV_R, MST_RCV_ACT_R>();
	}

	public class Map_Slo_Upd02_SloR_MST_RCV_R<D extends Slo_Upd02_SloR, S extends MST_RCV_R, W extends MST_RCV_ACT_R> extends MAUCC_RowMapperWith<D,S,W>{
		
		protected W _rcvActR;

		@Override
		public void setWith(W _rcvActR) {
			this._rcvActR = _rcvActR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Slo_Upd02_SloR.$slo_no, MST_RCV_R.$slo_no);
			addColumnPathMap(Slo_Upd02_SloR.$bcst_cd, MST_RCV_R.$bcst_cd);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.trd_cur_cd(_rcvActR.trd_cur_cd());
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(_rcvActR.trd_ptn_typ())) {
				dest.adv_rcv_amt(_rcvActR.trd_cur_amt());
			}
			else {
				dest.adv_rcv_amt(_rcvActR.trd_cur_amt().negate());
			}
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を取り消す<br>
	 */
	public class Del01 extends MSBGL_AdvRcvReg_MC_A.Del01 {
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
			
			MST_RCV_ACT_R rcvActR = getOrgRcvActCache(up0().rcv_act_no(), up0().rcv_act_seq());
			MST_RCV_R rcvR = getRcv(rcvActR);
			if (isNull(rcvR) || (isNull(rcvR.rcv_no())) && MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvActR.trd_ptn_typ())) {
				rcvR = getRcvCache(rcvActR.rcv_no());
			}
			
			// 入金実績サービス
			rcvActCmn();
			
			// 受注更新サービス
			sloCmn(rcvActR, rcvR);
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(HdrR.$peg_no, up1());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBGL_AdvRcvReg.Chk02 ope = MSBGL_AdvRcvReg.crtChk02();
			copyall(ope.up0(), up0());
			copyall(ope.up1(), up1());
			
			ope.exec();
			
			copyall(up0(), ope.down0());
			copyall(up1(), ope.down1());
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
		}
		
		/**
		 * 受注更新サービスを実行する。
		 * 
		 */
		protected void sloCmn(MST_RCV_ACT_R rcvActR, MST_RCV_R rcvR) {
			MSBBL_SloRegService.Slo_Upd02 ope = MSBBL_SloRegService.crtSlo_Upd02();
			Slo_Upd02_SloR upd02R = Slo_Upd02_SloR.create();

			
			// 取消前の入金実績情報に紐付く入金情報がない、または、受注ＮＯがNullの場合は受注登録サービスの呼出は不要
			if (rcvR.isEmpty() || isNull(rcvR.slo_no())) {
				return;
			}
			
			copy(upd02R, rcvR, rcvActR, createMap_Slo_Upd02_SloR_MST_RCV_R());
			
			ope.up0().add(upd02R);
			ope.exec();
		}
		
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
	 * 入金実績情報に紐付く入金情報取得
	 * @param rcvActR
	 * @return
	 */
	protected MST_RCV_R getRcv(MST_RCV_ACT_R rcvActR) {
		if (rcvActR.isEmpty()) {
			return null;
		}
		
		MST_RCV_R rcvR = MST_RCV_R.create("T");
		MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
		rcvR_bldr.setWhere(rcvR.src_rcv_act_no.eq(bind("1")), rcvActR.rcv_act_no());
		rcvR_bldr.addWhereWithAnd(rcvR.src_rcv_act_seq.eq(bind("1")), rcvActR.rcv_act_seq());
		dbSelect("MSBGL0200_MST_RCV_S06", rcvR, rcvR_bldr);
		return rcvR;
	}

	//FMCB CUSTOM END
}