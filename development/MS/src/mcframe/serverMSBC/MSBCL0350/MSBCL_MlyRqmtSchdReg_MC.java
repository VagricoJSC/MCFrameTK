package mcframe.serverMSBC.MSBCL0350;

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
import mcframe.serverMSBC.MSBCL0350.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL5070.*;
import static mcframe.serverMSBC.MSBCL0350.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MlyRqmtSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MlyRqmtSchdReg_MC extends MSBCL_MlyRqmtSchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_MlyRqmtSchdReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callMlyRqmtChkSrv(notErrL);
			}

			setErrToRtnStsTyp();

			setDown();
		}

		/** 月次生産依頼登録前チェックサービスを実行する */
		protected void callMlyRqmtChkSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Chk01 ope = MSBCL_MlyRqmtRegService.crtMlyRqmtReg_Chk01();
			addAll(ope.up0(), notErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR());
			ope.up1().file_imp_flg(up1().file_imp_flg());

			ope.exec();

			MCIndexKey idx = ope.down0().createIndex(MlyRqmtReg_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<MlyRqmtReg_Chk01_RsltR>> joinkey = notErrL.join(Chk01_RsltR.$peg_no,
					ope.down0(), idx);
			join(notErrL, joinkey, createMap_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Chk01 → MlyRqmtReg_Chk01) */
		protected Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Chk01 → MlyRqmtReg_Chk01) */
		public class Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ,	Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$err_flg, Chk01_RsltR.$err_flg);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd, Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$qty, Chk01_RsltR.$qty);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char1,	Chk01_RsltR.$sub_char1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char2,	Chk01_RsltR.$sub_char2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char3,	Chk01_RsltR.$sub_char3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$upd_cntr, Chk01_RsltR.$upd_cntr);

				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym_key, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym_key, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd_key, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2_key, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3_key, Chk01_RsltR.$itm_sub3);
			}
		}

		/** MlyRqmtReg_Chk01_RsltR → Chk01_RsltR (MlyRqmtReg_Chk01 → Chk01) */
		protected Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<Chk01_RsltR, MlyRqmtReg_Chk01_RsltR> createMap_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR() {
			return new Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<Chk01_RsltR, MlyRqmtReg_Chk01_RsltR>();
		}

		/** MlyRqmtReg_Chk01_RsltR → Chk01_RsltR (MlyRqmtReg_Chk01 → Chk01) */
		public class Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<D extends Chk01_RsltR, S extends MlyRqmtReg_Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$peg_no, MlyRqmtReg_Chk01_RsltR.$peg_no);
				addColumnPathMap(Chk01_RsltR.$err_flg, MlyRqmtReg_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk01_RsltR.$data_crud_typ, MlyRqmtReg_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk01_RsltR.$ym, MlyRqmtReg_Chk01_RsltR.$ym);
				addColumnPathMap(Chk01_RsltR.$itm_cd, MlyRqmtReg_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, MlyRqmtReg_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, MlyRqmtReg_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, MlyRqmtReg_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$mps_grp_cd, MlyRqmtReg_Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(Chk01_RsltR.$strg_loc_cd, MlyRqmtReg_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$mfg_loc_cd, MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$sppl_cd, MlyRqmtReg_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_RsltR.$rqst_loc_cd, MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Chk01_RsltR.$prod_ym, MlyRqmtReg_Chk01_RsltR.$prod_ym);
				addColumnPathMap(Chk01_RsltR.$qty, MlyRqmtReg_Chk01_RsltR.$qty);
				addColumnPathMap(Chk01_RsltR.$unit_cd, MlyRqmtReg_Chk01_RsltR.$unit_cd);
				addColumnPathMap(Chk01_RsltR.$dec_place, MlyRqmtReg_Chk01_RsltR.$dec_place);
				addColumnPathMap(Chk01_RsltR.$wg_cd, MlyRqmtReg_Chk01_RsltR.$wg_cd);
				addColumnPathMap(Chk01_RsltR.$intr_rmrks, MlyRqmtReg_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Chk01_RsltR.$sub_char1, MlyRqmtReg_Chk01_RsltR.$sub_char1);
				addColumnPathMap(Chk01_RsltR.$sub_char2, MlyRqmtReg_Chk01_RsltR.$sub_char2);
				addColumnPathMap(Chk01_RsltR.$sub_char3, MlyRqmtReg_Chk01_RsltR.$sub_char3);
				addColumnPathMap(Chk01_RsltR.$upd_cntr, MlyRqmtReg_Chk01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_MlyRqmtSchdReg_MC_A.Upd01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();
			// チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				// 月次生産依頼登録サービス実行
				callMlyRqmtRegSrv(notErrL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MlyRqmtSchdReg.Chk01 ope = MSBCL_MlyRqmtSchdReg.crtChk01();
			ope.up0().setAll(up0());

			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * 月次生産依頼登録サービスを実行する
		 */
		protected void callMlyRqmtRegSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Upd01 ope = MSBCL_MlyRqmtRegService.crtMlyRqmtReg_Upd01();
			addAll(ope.up0(), notErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR());

			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {

		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk01_RsltR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			for (Chk01_RsltR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Upd01 → MlyRqmtReg_Upd01) */
		protected Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Upd01 → MlyRqmtReg_Upd01) */
		public class Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ,	Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd,Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$strg_loc_cd,Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd,Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd,Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$qty, Chk01_RsltR.$qty);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$intr_rmrks,Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char1,	Chk01_RsltR.$sub_char1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char2,	Chk01_RsltR.$sub_char2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char3,	Chk01_RsltR.$sub_char3);

				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym_key, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym_key, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd_key, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2_key, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3_key, Chk01_RsltR.$itm_sub3);
			}
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_MlyRqmtSchdReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MCList<Srch01_MtrxRsltR> mst = getMaster(up0());
			MCList<Srch01_MtrxRsltR> mly = getMlyRqmt();
			MCList<Srch01_MtrxRsltR> preMly = getPreMlyRqmt();
			MCList<Srch01_MtrxRsltR> fixRqmt = getSumFixRqmt(up0());
			MCList<Srch01_MtrxRsltR> noFixRqmt = getSumNoFixRqmt(up0());
			MCList<Srch01_MtrxRsltR> act = getSumAct(up0());

			down0().setAll(mergeList(mst, mly, preMly, fixRqmt, noFixRqmt, act));
		}

		/** 月次生産依頼情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getMlyRqmt() {
			MCList<Srch01_MtrxRsltR> mly = MCList.create(Srch01_MtrxRsltR.class);
			executeQuery(mly, MSBCL0350_MST_MLY_RQMT_S01(), up0());
			return mly;
		}

		/** 前回分月次生産依頼情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getPreMlyRqmt() {
			MCList<Srch01_MtrxRsltR> preMly = MCList.create(Srch01_MtrxRsltR.class);
			executeQuery(preMly, MSBCL0350_MST_MLY_RQMT_S02(), up0());
			return preMly;
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 */
	public class Srch02 extends MSBCL_MlyRqmtSchdReg_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MCList<Srch01_MtrxRsltR> mst = getMaster(up0());
			MCList<Srch01_MtrxRsltR> mly = getMlyRqmt();
			MCList<Srch01_MtrxRsltR> preMly = getPreMlyRqmt();
			MCList<Srch01_MtrxRsltR> fixRqmt = getSumFixRqmt(up0());
			MCList<Srch01_MtrxRsltR> noFixRqmt = getSumNoFixRqmt(up0());
			MCList<Srch01_MtrxRsltR> act = getSumAct(up0());

			down0().setAll(mergeList(mst, mly, preMly, fixRqmt, noFixRqmt, act));
		}

		/** 月次生産依頼情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getMlyRqmt() {
			MCList<Srch01_MtrxRsltR> mly = MCList.create(Srch01_MtrxRsltR.class);
			executeQuery(mly, MSBCL0350_MST_MLY_RQMT_S03(), up0());
			return mly;
		}

		/** 前回分月次生産依頼情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getPreMlyRqmt() {
			MCList<Srch01_MtrxRsltR> preMly = MCList.create(Srch01_MtrxRsltR.class);
			executeQuery(preMly, MSBCL0350_MST_MLY_RQMT_S04(), up0());
			return preMly;
		}
	}

	/** ベースデータを取得する */
	protected MCList<Srch01_MtrxRsltR> getMaster(Srch01_CndR up0) {
		MCList<Srch01_MtrxRsltR> mst = MCList.create(Srch01_MtrxRsltR.class);
		executeQuery(mst, MSBCL0350_MAM_MPS_ITM_S01(), up0);

		MCList<Srch01_MtrxRsltR> ans = mst.createInstance();
		for (Srch01_MtrxRsltR row : mst) {
			for (MCDate ym = up0.prod_ym_fr(); ym.lte(up0.prod_ym_to()); ym = ym.addMonth(1)) {
				Srch01_MtrxRsltR r = row.clone();
				r.prod_ym(ym);
				r.qty(MCNumber.ZERO);
				r.pre_qty(MCNumber.ZERO);
				r.rqmt_qty(MCNumber.ZERO);
				r.fix_rqmt_qty(MCNumber.ZERO);
				r.no_fix_rqmt_qty(MCNumber.ZERO);
				r.act_qty(MCNumber.ZERO);

				ans.add(r);
			}
		}
		return ans;
	}

	/** 確定日次生産依頼情報を取得する */
	protected MCList<Srch01_MtrxRsltR> getSumFixRqmt(Srch01_CndR up0) {
		MCList<Srch01_MtrxRsltR> fixRqmtSum = MCList.create(Srch01_MtrxRsltR.class);
		executeQuery(fixRqmtSum, MSBCL0350_MST_RQMT_S01(), up0);
		return fixRqmtSum;
	}

	/** 未確定日次生産依頼情報を取得する */
	protected MCList<Srch01_MtrxRsltR> getSumNoFixRqmt(Srch01_CndR up0) {
		MCList<Srch01_MtrxRsltR> noFixRqmtSum = MCList.create(Srch01_MtrxRsltR.class);
		executeQuery(noFixRqmtSum, MSBCL0350_MST_RQMT_S02(), up0);
		return noFixRqmtSum;
	}

	/** 実績情報を取得する  */
	protected MCList<Srch01_MtrxRsltR> getSumAct(Srch01_CndR up0) {
		MCList<Srch01_MtrxRsltR> actSum = MCList.create(Srch01_MtrxRsltR.class);
		executeQuery(actSum, MSBCL0350_MST_YIELD_ACT_S01(), up0);
		return actSum;
	}

	/** マスタを基準に各種情報をマージする */
	protected MCList<Srch01_MtrxRsltR> mergeList(MCList<Srch01_MtrxRsltR> mst,
			MCList<Srch01_MtrxRsltR> mly, MCList<Srch01_MtrxRsltR> preMly,
			MCList<Srch01_MtrxRsltR> fixRqmt, MCList<Srch01_MtrxRsltR> noFixRqmt,
			MCList<Srch01_MtrxRsltR> act) {

		mst.sort(Srch01_MtrxRsltR.$mps_grp_cd);
		String[] keys = new String[]{Srch01_MtrxRsltR.$itm_cd,
				Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3,
				Srch01_MtrxRsltR.$strg_loc_cd, Srch01_MtrxRsltR.$prod_ym};

		MCIndexKey mlyIdx = mly.createIndex(keys);
		MCIndexKey preMlyIdx = preMly.createIndex(keys);
		MCIndexKey fixRqmtIdx = fixRqmt.createIndex(keys);
		MCIndexKey noFixRqmtIdx = noFixRqmt.createIndex(keys);
		MCIndexKey actIdx = act.createIndex(keys);

		for (Srch01_MtrxRsltR row : mst) {
			Comparable<?>[] vals = new Comparable[]{
				row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(),
				row.strg_loc_cd(), row.prod_ym()};

			Srch01_MtrxRsltR r = mly.getFirst(mlyIdx, vals);
			if (!isNull(r)) {
				row.qty(r.qty());
				row.upd_cntr(r.upd_cntr());
				row.intr_rmrks(r.intr_rmrks());
				row.sub_char1(r.sub_char1());
				row.sub_char2(r.sub_char2());
				row.sub_char3(r.sub_char3());
			}

			r = preMly.getFirst(preMlyIdx, vals);
			if (!isNull(r)) {
				row.pre_qty(r.pre_qty());
			}

			r = fixRqmt.getFirst(fixRqmtIdx, vals);
			if (!isNull(r)) {
				row.fix_rqmt_qty(r.fix_rqmt_qty());
			}

			r = noFixRqmt.getFirst(noFixRqmtIdx, vals);
			if (!isNull(r)) {
				row.no_fix_rqmt_qty(r.no_fix_rqmt_qty());
			}

			r = act.getFirst(actIdx, vals);
			if (!isNull(r)) {
				row.act_qty(r.act_qty());
			}

			row.rqmt_qty(
				nvl(row.fix_rqmt_qty(), MCNumber.ZERO).add(nvl(row.no_fix_rqmt_qty(), MCNumber.ZERO)));

			if (!isNullOrNullVal(row.mfg_loc_cd()) && !isNullOrNullVal(row.mfg_loc_nm())){
				row.proc_cd(row.mfg_loc_cd());
				row.proc_nm(row.mfg_loc_nm());
			}
			else if (!isNullOrNullVal(row.sppl_cd()) && !isNullOrNullVal(row.sppl_nm())){
				row.proc_cd(row.sppl_cd());
				row.proc_nm(row.sppl_nm());
			}
			else if (!isNullOrNullVal(row.rqst_loc_cd()) && !isNullOrNullVal(row.rqst_loc_nm())){
				row.proc_cd(row.rqst_loc_cd());
				row.proc_nm(row.rqst_loc_nm());
			}
		}

		removeDelFlgNoTran(mst);

		return mst;
	}

	/** ＭＰＳ品目マスタが論理削除されており、かつトランも存在しない行を削除する */
	protected void removeDelFlgNoTran(MCList<Srch01_MtrxRsltR> mst){
		MCList<Srch01_MtrxRsltR> delL = mst.subList(Srch01_MtrxRsltR.$mst_del_flg, true);
		if(delL.isEmpty()) {
			return;
		}

		MCList<Srch01_MtrxRsltR> removeList = MCList.create(Srch01_MtrxRsltR.class);
		String[] grp = new String[]{Srch01_MtrxRsltR.$itm_cd,
				Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3,
				Srch01_MtrxRsltR.$strg_loc_cd};
		for (MCList<Srch01_MtrxRsltR> l: delL.groupList(grp)) {
			MCNumber sumQty = l.sum(Srch01_MtrxRsltR.$qty);
			if (isSame(sumQty, MCNumber.ZERO)) {
				removeList.addAll(l);
			}
		}

		if(!removeList.isEmpty()) {
			mst.removeAll(removeList);
		}
	}

	//FMCB CUSTOM END
}