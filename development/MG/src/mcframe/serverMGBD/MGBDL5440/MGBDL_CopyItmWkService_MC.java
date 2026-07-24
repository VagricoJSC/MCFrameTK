package mcframe.serverMGBD.MGBDL5440;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL5440.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CopyItmWkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CopyItmWkService_MC extends MGBDL_CopyItmWkService_MC_A{
	//FMCB CUSTOM START

	/**
	 * CopyItmWk_Ins01オペレーション.<p>
	 *
	 * 原価品目工数取込対象を作成します。<br>
	 */
	public class CopyItmWk_Ins01 extends MGBDL_CopyItmWkService_MC_A.CopyItmWk_Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(MGBDL0056);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(MGBDL0057);
			}
		}

		protected void execMain() {

			editUp();
			ins();

			//一括取込
			if (!hasErrMsg() && up0().lump_flg()) {
				lumpImp(up0());
			}
		}

		protected void editUp() {
			if(isNull(up0().imp_ope_typ())) {
				up0().imp_ope_typ(MGC_IMP_OPE_TYP.BATCH.value());
			}
		}

		/**
		 * 取込対象を作成します。
		 */
		protected void ins() {
			execInsProc(up0());
		}

	}

	/**
	 * CopyItmWk_Upd01オペレーション.<p>
	 *
	 * 原価品目工数取込対象から原価品目工数へ取り込みます。<br>
	 */
	public class CopyItmWk_Upd01 extends MGBDL_CopyItmWkService_MC_A.CopyItmWk_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			if(up0().isEmpty()) {
				return;
			}

			//選択行取込
			checkedImp(up0());
		}

	}

	/**
	 * CopyItmWk_Upd02オペレーション.<p>
	 *
	 * 原価品目工数取込対象から全て原価品目工数へ取り込みます。<br>
	 */
	public class CopyItmWk_Upd02 extends MGBDL_CopyItmWkService_MC_A.CopyItmWk_Upd02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			editUp();
			lumpImp(up0());
		}

		protected void editUp() {
			if(isNull(up0().imp_ope_typ())) {
				up0().imp_ope_typ(MGC_IMP_OPE_TYP.BATCH.value());
			}
		}

	}

	/** 取込対象から選択取込を実行します。 */
	protected void checkedImp(CopyItmWk_Upd01_DtlL<CopyItmWk_Upd01_DtlR> l) {
		updCheckedImpFlg(l);

		CopyItmWk_Ins01_CndR r = CopyItmWk_Ins01_CndR.create();
		r.term(l.get(0).term());
		r.imp_ope_typ(MGC_IMP_OPE_TYP.BATCH.value());

		execImpProc(r);
	}

	/** 取込対象から一括取込を実行します。 */
	protected void lumpImp(CopyItmWk_Ins01_CndR r) {
		updLumpImpFlg(r);
		execImpProc(r);
	}

	/** ワークテーブル（キー項目テーブル）を使用して更新対象行の取り込みフラグをオンに更新 */
	protected void updCheckedImpFlg(CopyItmWk_Upd01_DtlL<CopyItmWk_Upd01_DtlR> l) {

		MCList<MGW_IMP_ITM_WK_R> dbc = MCList.create(MGW_IMP_ITM_WK_R.class);
		dbc.addAll(l);

		MCQueryApiBuilder dbc_bldr = createDbcBldr(true);
		dbWkDelete("MGBDL5440_MGW_IMP_ITM_WK_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MGBDL5440_MGW_IMP_ITM_WK_I01", dbc, dbc_bldr.getBaseDbc());
		dbSelectForUpdateNoWaitNoFetch("MGBDL5440_MGW_IMP_ITM_WK_S01", dbc_bldr);
		dbc_bldr.buildUpdate("MGBDL5440_MGW_IMP_ITM_WK_U01").executeUpdate();

		dbTran().commit();
	}

	/** ヘッダ条件で取り込みフラグをオンに一括更新 */
	protected void updLumpImpFlg(CopyItmWk_Ins01_CndR r) {

		MCQueryApiBuilder dbc_bldr = createDbcBldr(false);
		dbSelectForUpdateNoWaitNoFetch("MGBDL5440_MGW_IMP_ITM_WK_S02", dbc_bldr, r);
		dbc_bldr.buildUpdate("MGBDL5440_MGW_IMP_ITM_WK_U02").executeUpdate(r);

		dbTran().commit();
	}

	protected MCQueryApiBuilder createDbcBldr(boolean useWk) {
		MGW_IMP_ITM_WK_R t = MGW_IMP_ITM_WK_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.setSetVL(t.imp_flg, value(true));
		dbc_bldr.addSetVL(t.imp_err_flg, value(false));
		if(useWk) {
			MGW_IMP_ITM_WK_KEY_R S1W = MGW_IMP_ITM_WK_KEY_R.create("W");
			dbc_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X")).from(S1W)
					.where(value(0).eq(value(0))
						.and(t.itm_cd.eq(S1W.itm_cd))
						.and(t.itm_sub1.eq(S1W.itm_sub1))
						.and(t.itm_sub2.eq(S1W.itm_sub2))
						.and(t.itm_sub3.eq(S1W.itm_sub3))
						.and(t.term.eq(S1W.term))
						.and(t.calc_ctg_cd.eq(S1W.calc_ctg_cd))
						.and(t.wg_cd.eq(S1W.wg_cd)))));
		}
		else {
			dbc_bldr.addWhereWithAnd(t.term.eq(bind("term")));
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			if (isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
		}
		dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());

		return dbc_bldr;
	}

	/** 取込対象テーブル作成プロシージャを実行します。 */
	protected void execInsProc(CopyItmWk_Ins01_CndR r) {
		//DEF_WG_CD設定されているの場合、全てＷＧデータを作成する
		String defWgCd = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(defWgCd)) {
			r.wg_cd(null);
		}
		String procId = "MGPA_IMP_ITM_WK$P_INS_MGW";
		execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, r, null,
				":calc_ctg_cd, :wg_cd, :term, :dt, :imp_ope_typ");
	}

	/** 取込プロシージャを実行します。 */
	protected void execImpProc(CopyItmWk_Ins01_CndR r) {
		String procId = "MGPA_IMP_ITM_WK$P_IMP_MGT";
		execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, r, null,
				":term, :imp_ope_typ");
	}

	//FMCB CUSTOM END
}