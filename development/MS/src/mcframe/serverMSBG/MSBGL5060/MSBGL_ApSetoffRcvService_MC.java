package mcframe.serverMSBG.MSBGL5060;

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
import mcframe.serverMSBG.MSBGL5060.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ApSetoffRcvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ApSetoffRcvService_MC extends MSBGL_ApSetoffRcvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBGL_ApSetoffRcvService> CLAZZ = MSBGL_ApSetoffRcvService.class;

	/**
	 * 入金のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_RCV_R> _rcvCache = null;

	/**
	 * 入金コンテナを取得する。
	 * 
	 * @param rsltL キャッシュ条件
	 * @return 入金コンテナ
	 */
	protected static FXUCL_MCDbcCache<MST_RCV_R> initRcvCache(MCList<ApSetoffRcv_Chk01_DtlR> dtlL) {
		return object(CLAZZ)._initRcvCache(dtlL);
	}

	/**
	 * 入金のコンテナキャッシュを初期化する。
	 * 
	 * @param rsltL キャッシュ条件
	 */
	protected FXUCL_MCDbcCache<MST_RCV_R> _initRcvCache(MCList<ApSetoffRcv_Chk01_DtlR> dtlL) {
		if (_rcvCache == null) {
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			
			_rcvCache = new FXUCL_MCDbcCache<MST_RCV_R>(dbcL_bldr, dtlL, ApSetoffRcv_Chk01_DtlR.$rcv_no);
		}
		return _rcvCache;
	}

	protected static FXUCL_MCDbcCache<MST_RCV_R> getRcvCache() {
		return object(CLAZZ)._rcvCache;
	}	

	/**
	 * ApSetoffRcv_Chk01オペレーション.<p>
	 *
	 * 買掛金相殺の入金の登録・訂正・取消前チェックの共通処理<br>
	 */
	public class ApSetoffRcv_Chk01 extends MSBGL_ApSetoffRcvService_MC_A.ApSetoffRcv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			editRcvUsrCd(getChkList(up0()));

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			initRcvCache(up0().subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));

			// 入金ＮＯの必須チェック
			msgL.addAll(chkRcvNo());
			
			// 入金情報の存在チェック
			msgL.addAll(chkExistsRcv());

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<ApSetoffRcv_Chk01_DtlR> notErrL = getChkList(up0());
			
			// 条件付チェック
			msgL.addAll(chkItmsWithCnd(notErrL));

			// 入金のステータスチェック
			msgL.addAll(chkRcvProcAmt(notErrL));

			// 相殺の決済方法チェック
			msgL.addAll(chkArSetoffCd(notErrL));

			compArTyp();

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 入金ＮＯの必須チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkRcvNo() {
			
			MCMessageList msgL = new MCMessageList();

			for (ApSetoffRcv_Chk01_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$rcv_no, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 入金情報の存在チェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkExistsRcv() {
			MCMessageList msgL = new MCMessageList();

			for (ApSetoffRcv_Chk01_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}
				if (isNull(r.rcv_no())) {
					continue;
				}
				
				MST_RCV_R selectR = getRcvCache().get(r.rcv_no());
				if (isNull(selectR.rcv_no())) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_RCV", new String[] {MST_RCV_R.$rcv_no}, 
							new Comparable[] {r.rcv_no()}, r));
			    }
			}

			return msgL;
		}
		
		/**
		 * 条件付チェックを実行する。
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd(MCList<ApSetoffRcv_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			for (ApSetoffRcv_Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$rcv_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$acst_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$asppl_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$rcv_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$ac_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$trd_cur_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$xrate, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$rcv_amt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ApSetoffRcv_Chk01_DtlR.$rcv_mtd_cd, new FXUCL_RequiredValidater()));
			}

			return msgL;
		}
		
		/**
		 * 入金のステータスチェックを行う。
		 * 
		 * @param notErrL
		 * @return
		 */
		protected MCMessageList chkRcvProcAmt(MCList<ApSetoffRcv_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (ApSetoffRcv_Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}
				
				MST_RCV_R rcvR = getRcvCache().get(r.rcv_no());
				if (!rcvR.rcv_proc_amt().isZero()) {
					msgL.add(new MCMessage(r, null, MSBGL0124, r.rcv_no(),
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		
		/**
		 * 決済方法チェックを行う。
		 * 
		 * @param notErrL
		 * @return
		 */
		protected MCMessageList chkArSetoffCd(MCList<ApSetoffRcv_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (ApSetoffRcv_Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.rcv_typ())
						|| !MAC_DEBT_CRED_ID_TYP.isBSPPL(r.debt_cred_id_typ())) {
					msgL.add(new MCMessage(r, null, MSBGL0125, r.rcv_mtd_cd(),
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		
		/**
		 * 債権区分を補完する
		 */
		protected void compArTyp() {
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MAM_AC_RSN_R m2 = MAM_AC_RSN_R.create("M2");
			MCList<MAM_STTL_R> sttlL = MCList.create(MAM_STTL_R.class);
			MCQueryApiBuilder sttlL_bldr = MCQueryApiBuilder.create(t);
			sttlL.addStringColumn("AR_TYP");
			sttlL_bldr.setSelect(t.sttl_cd);
			sttlL_bldr.addSelect(m2.ar_typ);
			sttlL_bldr.addLeftOuterJoin(m2, t.ac_rsn_cd.eq(m2.ac_rsn_cd));
			sttlL_bldr.setWhere(t.sttl_cd.eq(bind("rcv_mtd_cd")));
			dbSelect("MSBGL5060_MAM_STTL_S01", sttlL, sttlL_bldr, up0());
			
			MCIndexKey idxkey = sttlL.createIndex(MAM_STTL_R.$sttl_cd);
			for (ApSetoffRcv_Chk01_DtlR r : up0()) {
				MAM_STTL_R sttlR = sttlL.getFirst(idxkey, r.rcv_mtd_cd());
				if (isNull(sttlR) || isNull(sttlR.getStringNE("AR_TYP"))) {
					r.ar_typ(MAC_AR_TYP.AR.value());
				}
				else {
					r.ar_typ(sttlR.getStringNE("AR_TYP"));
				}
			}
		}

		/**
		 * 入金担当者が、入金日時点で、入金部門に所属していない場合、クリアする。
		 * 
		 * @param notErrL
		 */
		protected void editRcvUsrCd(MCList<ApSetoffRcv_Chk01_DtlR> notErrL) {

			MCList<ApSetoffRcv_Chk01_DtlR> insUpdL = notErrL
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
							&& !isNull(r.rcv_usr_cd()));
			if (insUpdL.isEmpty()) {
				return;
			}

			MCList<MAM_USR_ACL_R> usrAclL = MCList.create(MAM_USR_ACL_R.class);
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create("T");
			MCQueryApiBuilder usrAclL_bldr = MCQueryApiBuilder.create(t);
			MCIndexKey idxkey = usrAclL.createIndex(MAM_USR_ACL_R.$usr_cd);
			
			usrAclL_bldr.setWhere(t.usr_cd.eq(bind("rcv_usr_cd")));
			usrAclL_bldr.addWhereWithAnd(t.st_dt.lte(bind("rcv_dt")));
			usrAclL_bldr.addWhereWithAnd(t.end_dt.gte(bind("rcv_dt")));
			dbSelect("MSBGL5060_MAM_USR_ACL_S01", usrAclL, usrAclL_bldr, insUpdL);

			for (ApSetoffRcv_Chk01_DtlR r : insUpdL) {
				MAM_USR_ACL_R usrAclR = usrAclL.getFirst(idxkey, r.rcv_usr_cd());
				if (isNull(usrAclR)) {
					r.rcv_usr_cd(null);
				}
				else if (!isSame(r.rcv_dpt_cd(), usrAclR.dpt_cd())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd1())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd2())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd3())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd4())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd5())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd6())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd7())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd8())
						&& !isSame(r.rcv_dpt_cd(), usrAclR.add_dpt_cd9())) {
					r.rcv_usr_cd(null);
				}
			}
		}
	}
	/**
	 * ApSetoffRcv_Upd01オペレーション.<p>
	 *
	 * 買掛金相殺の入金の登録・訂正・取消の共通処理<br>
	 */
	public class ApSetoffRcv_Upd01 extends MSBGL_ApSetoffRcvService_MC_A.ApSetoffRcv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			updRcv();

			setDown();
		}
		
		/**
		 * 下り電文の編集
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 入金Ｎｏを取得する
		 * @param dtlR
		 * @return
		 */
		protected String getRcvNo(ApSetoffRcv_Chk01_DtlR dtlR) {

			if (!isNull(dtlR.rcv_no())) {
				return dtlR.rcv_no();
			}
			ElmArgsR args = ElmArgsR.create();
			args.bp_cd(dtlR.rcst_cd());
			args.co_cd(getCo().co_cd());
			args.dt(dtlR.rcv_dt());
			args.dpt_cd(dtlR.rcv_dpt_cd());
			args.wg_cd(dtlR.wg_cd());
			
			return getNum(MAC_NUM_BIZ_TYP.RCV, args);
		}

		/**
		 * 買掛金相殺の入金を登録・更新・削除する
		 */
		protected void updRcv() {
			MCList<MST_RCV_R> insL = MCList.create(MST_RCV_R.class);
			MCList<MST_RCV_R> updL = MCList.create(MST_RCV_R.class);
			MCList<MST_RCV_R> delL = MCList.create(MST_RCV_R.class);
			
			for (ApSetoffRcv_Chk01_DtlR r : up0()) {
				MST_RCV_R rcvR = MST_RCV_R.create();
				MST_RCV_R orgRcvR = !isNull(r.rcv_no()) ? getRcvCache().get(r.rcv_no()) : null;
				copy(rcvR, r, createMap_MST_RCV_R_ApSetoffRcv_Chk01_DtlR(orgRcvR));
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.rcv_no(rcvR.rcv_no());
					insL.add(rcvR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(rcvR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(rcvR);
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
				dbInsertEx("MSBGL5060_MST_RCV_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
				dbUpdateKey("MSBGL5060_MST_RCV_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
				dbDeleteKey("MSBGL5060_MST_RCV_D01", delL, delL_bldr);
			}
		}
		
		protected Map_MST_RCV_R_ApSetoffRcv_Chk01_DtlR<MST_RCV_R,ApSetoffRcv_Chk01_DtlR> createMap_MST_RCV_R_ApSetoffRcv_Chk01_DtlR(MST_RCV_R orgRcvR) {
			return new Map_MST_RCV_R_ApSetoffRcv_Chk01_DtlR<MST_RCV_R, ApSetoffRcv_Chk01_DtlR>(orgRcvR);
		}

		public class Map_MST_RCV_R_ApSetoffRcv_Chk01_DtlR<D extends MST_RCV_R, S extends ApSetoffRcv_Chk01_DtlR> extends MCRowMapper<D,S>{
			
			protected MST_RCV_R _orgRcvR;
			public Map_MST_RCV_R_ApSetoffRcv_Chk01_DtlR(MST_RCV_R orgRcvR) {
				_orgRcvR = orgRcvR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_R.$rcst_cd, ApSetoffRcv_Chk01_DtlR.$rcst_cd);
				addColumnPathMap(MST_RCV_R.$bcst_cd, ApSetoffRcv_Chk01_DtlR.$bcst_cd);
				addColumnPathMap(MST_RCV_R.$acst_cd, ApSetoffRcv_Chk01_DtlR.$acst_cd);
				addColumnPathMap(MST_RCV_R.$asppl_cd, ApSetoffRcv_Chk01_DtlR.$asppl_cd);
				addColumnPathMap(MST_RCV_R.$bsppl_cd, ApSetoffRcv_Chk01_DtlR.$bsppl_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dpt_cd, ApSetoffRcv_Chk01_DtlR.$rcv_dpt_cd);
				addColumnPathMap(MST_RCV_R.$wg_cd, ApSetoffRcv_Chk01_DtlR.$wg_cd);
				addColumnPathMap(MST_RCV_R.$rcv_usr_cd, ApSetoffRcv_Chk01_DtlR.$rcv_usr_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dt, ApSetoffRcv_Chk01_DtlR.$rcv_dt);
				addColumnPathMap(MST_RCV_R.$ac_dt, ApSetoffRcv_Chk01_DtlR.$ac_dt);
				addColumnPathMap(MST_RCV_R.$rcv_mtd_cd, ApSetoffRcv_Chk01_DtlR.$rcv_mtd_cd);
				addColumnPathMap(MST_RCV_R.$rcv_typ, ApSetoffRcv_Chk01_DtlR.$rcv_typ);
				addColumnPathMap(MST_RCV_R.$trd_cur_cd, ApSetoffRcv_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_R.$xrate, ApSetoffRcv_Chk01_DtlR.$xrate);
				addColumnPathMap(MST_RCV_R.$pay_act_no, ApSetoffRcv_Chk01_DtlR.$pay_act_no);
				addColumnPathMap(MST_RCV_R.$rcv_amt, ApSetoffRcv_Chk01_DtlR.$rcv_amt);
				addColumnPathMap(MST_RCV_R.$not_proc_bal, ApSetoffRcv_Chk01_DtlR.$rcv_amt);
				addColumnPathMap(MST_RCV_R.$ar_typ, ApSetoffRcv_Chk01_DtlR.$ar_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.rcv_no(getRcvNo(src));
				dest.base_cur_cd(getCo().base_cur_cd());
				dest.xrate_cd(getCo().sls_xrate_cd());
				dest.dat_typ(MSC_RCV_DAT_TYP.AP.value());
				dest.auto_appl_sts_typ(MSC_AUTO_APPL_STS_TYP.EXCLD.value());
				dest.rcv_proc_amt(MCNumber.ZERO);
				dest.bill_setoff_amt(MCNumber.ZERO);
				dest.seq_no(getSeqNo(_orgRcvR));
			}
		}

		/**
		 * 枝番を取得する
		 * 
		 * @param orgR 更新前の入金情報
		 * @return 枝番
		 */
		protected MCNumber getSeqNo(MST_RCV_R orgR) {
			
			// 新規時にseq_noは１とし、更新時のseq_noは＋２とする
			if (isNull(orgR)) {
				return MCNumber.ONE;
			}
			else {
				return orgR.seq_no().add(2);
			}
			
		}
	}

	//FMCB CUSTOM END
}