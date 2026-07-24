package mcframe.serverMGBG.MGBGL5010;

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
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBG.MGBGL5010.*;	// このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;

import mcframe.serverMGBG.MGBGL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PlnAlcIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PlnAlcIfService_MC extends MGBGL_PlnAlcIfService_MC_A{
	//FMCB CUSTOM START

	protected static final String EXE_STS_TYP = "exe_sts_typ";
	protected static final String DATA_NO = "data_no";
	protected static final String DATA_LNO = "data_lno";
	protected static final String ALC_AC_CD = "alc_ac_cd";
	protected static final String WG_CD = "wg_cd";
	protected static final String AC_CD = "ac_cd";
	protected static final String SUB_AC_CD = "sub_ac_cd";
	protected static final String DPT_CD = "dpt_cd";
	protected static final String YM = "ym";
	protected static final String BATCH_LOG_NO = "batch_log_no";
	protected static final String LOG_SUB_KEY1 = "log_sub_key1";
	protected static final String LOG_SUB_KEY2 = "log_sub_key2";
	protected static final String BATCH_FLG = "batch_flg";

	// キャッシュ
	protected static final Class<MGBGL_PlnAlcIfService> CLAZZ = MGBGL_PlnAlcIfService.class;
	protected MCList<MAM_SUB_AC_MAP_R> _subAcMapL;
	protected MCList<MAM_AC_MAP_R> _acMapL;
	protected MCList<MAM_ALC_AC_IMP_R> _alcAcImpL;
	protected MCIndexKey _subAcMapKey;
	protected MCIndexKey _acMapKey;

	/**
	 * PlnAlcIf_Chk01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦ取込前チェック<br>
	 */
	public class PlnAlcIf_Chk01 extends MGBGL_PlnAlcIfService_MC_A.PlnAlcIf_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * PlnAlcIf_Upd01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを取り込む。<br>
	 */
	public class PlnAlcIf_Upd01 extends MGBGL_PlnAlcIfService_MC_A.PlnAlcIf_Upd01 {

		protected MCDBTransaction _mainTran = null;
		protected MCDBTransaction _rcvTran = null;

		protected MCList<MGT_PLN_ALC_AMT_RCV_R> _rcvL = null;
		protected MGT_PLN_ALC_AMT_RCV_R _rcvL_t = null;
		protected MCQueryApiBuilder _rcvL_bldr = null;
		protected MCList<MCRow> _noRcvL = null;
		protected MCList<MCRow> _ifL = null;
		protected mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker _chkOpe = null;
		protected mcframe.serverMAUD.MAUDL5010.MAUDL_Operation _updOpe = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				createIfTran();
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				MCTransactionManager.setCurrentDBTran(_mainTran);
				MCTransactionManager.releaseDBTran(_rcvTran);
				writeEndLogWithLogger(null);
			}
		}

		protected void createIfTran() {
			_mainTran = dbTran();
			_rcvTran = MCTransactionManager.createDBTran();
			MCTransactionManager.setCurrentDBTran(_mainTran);
		}

		protected void execMain(){
			callThisChk01();
			throwUpdErr();
			main();
		}

		protected void callThisChk01() {
			MGBGL_PlnAlcIfService.PlnAlcIf_Chk01 o = MGBGL_PlnAlcIfService.crtPlnAlcIf_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			setRcvDbc();

			for (MCRow r : getDataNoL()) {

				delIf();

				MCSavepoint sp = dbTran().setSavepoint();
				try {
					reset();
					getRcvData(r.getNumber(DATA_NO));
					editDBCList();
					callIfChk();
					throwUpdErr();
					callIfUpd();
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					throw ex;
				}
				finally {
					updRcvData(r.getNumber(DATA_NO));
				}
				dbTran().commit();
			}
		}

		protected void setRcvDbc() {
			_rcvL = MCList.create(MGT_PLN_ALC_AMT_RCV_R.class);
			_rcvL_t = MGT_PLN_ALC_AMT_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);
		}

		/**
		 * 再取込時、データＮＯ毎の処理の最初に削除処理を行う<BR>
		 */
		protected void delIf() {
			if (up0().rerun_flg()) {
				MGT_PLN_ALC_AMT_IF_R t = MGT_PLN_ALC_AMT_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ym.between(bind("ym_fr"), bind("ym_to")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBGL5010_MGT_PLN_ALC_AMT_IF_D01").executeUpdate(up0());
				dbTran().commit();
			}
		}

		protected MCList<MGT_PLN_ALC_AMT_RCV_R> getDataNoL() {
			MCList<MGT_PLN_ALC_AMT_RCV_R> dbc = _rcvL.createInstance();
			MGT_PLN_ALC_AMT_RCV_R t = MGT_PLN_ALC_AMT_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.data_no);
			dbc_bldr.setOrderByAsc(t.data_no);
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect("MGBGL5010_MGT_PLN_ALC_AMT_RCV_S01", dbc, dbc_bldr);
			return dbc;
		}

		protected void setWhere(MCList<MGT_PLN_ALC_AMT_RCV_R> dbc,
				MGT_PLN_ALC_AMT_RCV_R t, MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(t.imp_flg.eq(value(true)));

			// 再取込時、ＰＧ実行状況区分「1：未処理」「3：エラー」による絞り込みはなし
			if (!up0().rerun_flg()) {
				dbc_bldr.addWhereWithAnd(
						t.exe_sts_typ.in(value(MAC_EXE_STS_TYP.NOT_EXE.value()),
								value(MAC_EXE_STS_TYP.ERR.value())));
			}

			dbc_bldr.addWhereWithAnd(t.ym.between(bind("1"), bind("2")), up0().ym_fr(),
					up0().ym_to());
			if (!isNull(up0().calc_ctg_cd())) {
				dbc_bldr.addWhereWithAnd(nvl(t.calc_ctg_cd, bind("1")).eq(bind("2")),
						getCoParm().def_calc_ctg_cd(), up0().calc_ctg_cd());
			}
			if (!isNull(dataNo)) {
				dbc_bldr.addWhereWithAnd(t.data_no.eq(bind("1")), dataNo);
			}
		}

		protected void reset() {
			_rcvL = _rcvL.createInstance();
			_noRcvL = MCList.create(MCRow.class);
			_chkOpe = MGBGL_PlnAlcAmtIfReg.crtChk01();
			_updOpe = MGBGL_PlnAlcAmtIfReg.crtUpd02();
		}

		protected void getRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			selectRcvData(dataNo);
			MCTransactionManager.returnedCurrentDBTran();
		}

		protected void selectRcvData(MCNumber dataNo) {
			// 検索条件の設定
			setWhere(_rcvL, _rcvL_t, _rcvL_bldr, dataNo);
			// 検索＋ロック
			dbSelectForUpdateNoWait("MGBGL5010_MGT_PLN_ALC_AMT_RCV_S02", _rcvL, _rcvL_bldr);
			_rcvL.sort(getCommonKey());
			// ＰＧ実行状況区分初期値は「未処理」
			_rcvL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_PLN_ALC_AMT_RCV_R r : _rcvL) {
				if (isNull(r.getString(MGT_PLN_ALC_AMT_RCV_R.$calc_ctg_cd))) {
					r.setString(MGT_PLN_ALC_AMT_RCV_R.$calc_ctg_cd, getCoParm().def_calc_ctg_cd());
				}
			}
		}


		protected String[] getCommonKey() {
			return new String[] { 
					MGT_PLN_ALC_AMT_RCV_R.$calc_ctg_cd,
					MGT_PLN_ALC_AMT_RCV_R.$ym,
					MGT_PLN_ALC_AMT_RCV_R.$ac_cd,
					MGT_PLN_ALC_AMT_RCV_R.$sub_ac_cd,
					MGT_PLN_ALC_AMT_RCV_R.$dpt_cd,
					MGT_PLN_ALC_AMT_RCV_R.$loc_cd,
					MGT_PLN_ALC_AMT_RCV_R.$oper_cd,
					MGT_PLN_ALC_AMT_RCV_R.$bp_cd,
					MGT_PLN_ALC_AMT_RCV_R.$ctg_cd,
					MGT_PLN_ALC_AMT_RCV_R.$itm_cd,
					MGT_PLN_ALC_AMT_RCV_R.$itm_sub1,
					MGT_PLN_ALC_AMT_RCV_R.$itm_sub2,
					MGT_PLN_ALC_AMT_RCV_R.$itm_sub3,
					MGT_PLN_ALC_AMT_RCV_R.$lot_no,
					MGT_PLN_ALC_AMT_RCV_R.$sublot_no,
					MGT_PLN_ALC_AMT_RCV_R.$sno1,
					MGT_PLN_ALC_AMT_RCV_R.$sno2,
					MGT_PLN_ALC_AMT_RCV_R.$sno3,
					MGT_PLN_ALC_AMT_RCV_R.$sno4
					};
		}

		protected void editDBCList() {
			// チェックＯＫの受信レコード
			MCList<MGT_PLN_ALC_AMT_RCV_R> rcvOkL = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			_ifL = MCList.create(MCRow.class);

			// マスタデータキャッシュ（ALC_AC_CD取得用）
			initSubAcMapCache(rcvOkL);
			initAcMapCache(rcvOkL);

			// チェックＯＫの受信レコードをループ
			for (MGT_PLN_ALC_AMT_RCV_R rcvRow : rcvOkL) {
				if (!isImpTgt(rcvRow)) {
					rcvRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.SKP.value());
				}
			}

			rcvOkL = rcvOkL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// マスタデータキャッシュ（WG_CD取得用）
			initAlcAcImpCache(rcvOkL, up0().wg_cd());

			for (MGT_PLN_ALC_AMT_RCV_R rcvRow : rcvOkL) {
				setWgCd(rcvRow, up0().wg_cd());
				if (!isNull(rcvRow.getStringNE(WG_CD))) {
					MCRow tmpRow = createNewIfRow(rcvRow);
					_ifL.add(tmpRow);
				}
				else if (!MAC_EXE_STS_TYP.isSKP(rcvRow.getString(EXE_STS_TYP))) {
					_noRcvL.add(rcvRow);
				}
			}

			// 共通側チェックオペレーションでエラーＲＯＷを確定するため
			int paramRowIndex = 0;
			for (MCRow r : _ifL) {
				r.setParamIndex(0);
				r.setParamRowIndex(paramRowIndex);
				paramRowIndex++;
			}
		}

		protected boolean isImpTgt(MGT_PLN_ALC_AMT_RCV_R rcvRow) {
			String alcAcCd = getAlcAcCd(rcvRow.getString(AC_CD), rcvRow.getString(SUB_AC_CD), rcvRow.getDate(YM));
			rcvRow.setStringNE(ALC_AC_CD, alcAcCd);
			if(isNull(alcAcCd)){
				return false;
			}
			return true;
		}

		protected MCRow createNewIfRow(MGT_PLN_ALC_AMT_RCV_R srcRow) {
			PlnAlcIf_Upd01_DtlR newRow = PlnAlcIf_Upd01_DtlR.create();
			newRow.setStatus(MCRow.Status.CREATE);
			if (!isNull(srcRow)) {
				newRow.dbc().setValuesByName(srcRow);
			}
			return newRow;
		}

		protected void callIfChk() {
			// チェックオペレーション実行
			((MCList<?>)_chkOpe.up(0)).addAllByName(_ifL);
			((MCRow)_chkOpe.up(1)).setBooleanNE(BATCH_FLG, true);
			_chkOpe.exec();

			// 後処理
			MCMessageList newMsgL = new MCMessageList();
			MCMessageList msgChkList = MCMessagePool.getMessageList();
			MCIndexKey idxIf = _rcvL.createIndex(DATA_LNO);
			for (MCMessage msgRow : msgChkList) {
				Comparable<?>[] bind = msgRow.getCauseRow().toArray(DATA_LNO);
				MGT_PLN_ALC_AMT_RCV_R errIfRow = _rcvL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
				// エラーになったＩＦレコードをメッセージリストへ設定、
				msgRow.setCauseRow(errIfRow, null);
				newMsgL.add(msgRow);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(newMsgL);
		}

		protected void callIfUpd() {
			// 登録オペレーション実行
			((MCList<?>)_updOpe.up(0)).addAllByName(_ifL);
			_updOpe.exec();

			MCList<MGT_PLN_ALC_AMT_RCV_R> l = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_PLN_ALC_AMT_RCV_R r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}

		protected void updRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			updateRcvData();
			_rcvTran.commit();
			MCTransactionManager.returnedCurrentDBTran();
			if (_rcvL.size() > 0) {
				logger().writeProcessLog(MGBGL0004, dataNo, _rcvL.size());
			}
		}

		protected void updateRcvData() {
			_rcvL.removeAll(_noRcvL);
			writeBatchLog();
			// 受信テーブルの更新
			_rcvL_bldr.setSet(
					_rcvL_t.exe_sts_typ, 
					_rcvL_t.batch_log_no,
					_rcvL_t.log_sub_key1,
					_rcvL_t.log_sub_key2);
			dbUpdateKey("MGBGL5010_MGT_PLN_ALC_AMT_RCV_U01", _rcvL, _rcvL_bldr);
		}
		protected void writeBatchLog() {
			logger().setLogKey(_rcvL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}
	}


	protected String getAlcAcCd(String acCd, String subAcCd, MCDate ym) {
		if (!isNull(subAcCd)) {
			MAM_SUB_AC_MAP_R r = getSubAcMapR(acCd, subAcCd, ym);
			if (!isNull(r)) {
				return r.alc_ac_cd();
			}
		}
		MAM_AC_MAP_R r = getAcMapR(acCd, ym);
		if (!isNull(r)) {
			return r.alc_ac_cd();
		}
		return null;
	}

	protected void setWgCd(MCRow r, String wgCd) {
		MCList<MAM_ALC_AC_IMP_R> l = getAlcAcImpL(r.getString(DPT_CD), r.getString(ALC_AC_CD), r.getDate(YM));
		// レコードが取得できない場合はスキップ
		if (l.isEmpty()) {
			r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.SKP.value());
			return ;
		}
		// 引数のWG_CDが指定されている場合は一致するときのみ設定
		for (MAM_ALC_AC_IMP_R row : l) {
			if (isNull(wgCd) || isSame(wgCd, row.wg_cd())) {
				r.setStringNE(WG_CD, row.wg_cd());
				return ;
			}
		}
		// 引数のWG_CDと一致しない場合はスキップにしない
	}

	///////////////////////////////////////////////////////////////////
	// キャッシュ

	protected void initSubAcMapCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insSubAcMapWk(l);

		// 検索
		MCList<MAM_SUB_AC_MAP_R> dbc = MCList.create(MAM_SUB_AC_MAP_R.class);
		MAW_SUB_AC_MAP_KEY_R w = MAW_SUB_AC_MAP_KEY_R.create("W");
		MAM_SUB_AC_MAP_R t = MAM_SUB_AC_MAP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.ac_cd,
				t.sub_ac_cd,
				t.st_dt,
				t.end_dt,
				t.alc_ac_cd);
		dbc_bldr.addInnerJoin(w,
				bracket(w.ac_cd.eq(t.ac_cd)
						.and(w.sub_ac_cd.eq(t.sub_ac_cd))
						.and(w.st_dt.between(t.st_dt, t.end_dt))));
		dbSelect("MGBGL5010_MAM_SUB_AC_MAP_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._subAcMapL = dbc;
		object(CLAZZ)._subAcMapKey = 
				object(CLAZZ)._subAcMapL.createIndex(MAM_SUB_AC_MAP_R.$ac_cd, MAM_SUB_AC_MAP_R.$sub_ac_cd);
	}

	protected void insSubAcMapWk(MCList<? extends MCRow> l) {
		MCList<MAM_SUB_AC_MAP_R> dbc = MCList.create(MAM_SUB_AC_MAP_R.class);
		for (MCRow r : l) {
			MAM_SUB_AC_MAP_R row = dbc.createRow();
			row.ac_cd(r.getString(MAM_SUB_AC_MAP_R.$ac_cd));
			row.sub_ac_cd(r.getString(MAM_SUB_AC_MAP_R.$sub_ac_cd));
			row.st_dt(r.getDate(YM));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_SUB_AC_MAP_R.$ac_cd, MAM_SUB_AC_MAP_R.$sub_ac_cd, MAM_SUB_AC_MAP_R.$st_dt);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_SUB_AC_MAP_R.create("T"));
		dbWkDelete("MGBGL5010_MAW_SUB_AC_MAP_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MGBGL5010_MAW_SUB_AC_MAP_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_SUB_AC_MAP_R getSubAcMapR(String acCd, String subAcCd, MCDate ym) {
		for (MAM_SUB_AC_MAP_R r : object(CLAZZ)._subAcMapL.subList(object(CLAZZ)._subAcMapKey, acCd, subAcCd)) {
			if (r.st_dt().lteDate(ym) && r.end_dt().gteDate(ym)) {
				return r;
			}
		}
		return null;
	}

	protected void initAcMapCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insAcMapWk(l);

		// 検索
		MCList<MAM_AC_MAP_R> dbc = MCList.create(MAM_AC_MAP_R.class);
		MAW_AC_MAP_KEY_R w = MAW_AC_MAP_KEY_R.create("W");
		MAM_AC_MAP_R t = MAM_AC_MAP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.ac_cd,
				t.st_dt,
				t.end_dt,
				t.alc_ac_cd);
		dbc_bldr.addInnerJoin(w, bracket(w.ac_cd.eq(t.ac_cd)
				.and(w.st_dt.between(t.st_dt, t.end_dt))));
		dbSelect("MGBGL5010_MAM_AC_MAP_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._acMapL = dbc;
		object(CLAZZ)._acMapKey = object(CLAZZ)._acMapL.createIndex(MAM_AC_MAP_R.$ac_cd);
	}

	protected void insAcMapWk(MCList<? extends MCRow> l) {
		MCList<MAM_AC_MAP_R> dbc = MCList.create(MAM_AC_MAP_R.class);
		for (MCRow r : l) {
			MAM_AC_MAP_R row = dbc.createRow();
			row.ac_cd(r.getString(MAM_AC_MAP_R.$ac_cd));
			row.st_dt(r.getDate(YM));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_AC_MAP_R.$ac_cd, MAM_AC_MAP_R.$st_dt);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_AC_MAP_R.create("T"));
		dbWkDelete("MGBGL5010_MAW_AC_MAP_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MGBGL5010_MAW_AC_MAP_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_AC_MAP_R getAcMapR(String acCd, MCDate ym) {
		for (MAM_AC_MAP_R r : object(CLAZZ)._acMapL.subList(object(CLAZZ)._acMapKey, acCd)) {
			if (r.st_dt().lteDate(ym) && r.end_dt().gteDate(ym)) {
				return r;
			}
		}
		return null;
	}

	protected void initAlcAcImpCache(MCList<? extends MCRow> l, String wgCd) {
		// ワーク作成
		insAlcAcImpWk(l);

		// 検索
		MCList<MAM_ALC_AC_IMP_R> dbc = MCList.create(MAM_ALC_AC_IMP_R.class);
		MAW_ALC_AC_IMP_KEY_R w = MAW_ALC_AC_IMP_KEY_R.create("W");
		MAM_ALC_AC_IMP_R t = MAM_ALC_AC_IMP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setDistinct();
		dbc_bldr.setSelect(
				t.dpt_cd,
				t.alc_ac_cd,
				t.st_dt,
				t.end_dt,
				t.wg_cd);
		dbc_bldr.addInnerJoin(w,
				bracket(bracket(w.dpt_cd.eq(t.dpt_cd).or(t.dpt_cd.isNull()))
						.and(w.alc_ac_cd.eq(t.alc_ac_cd).or(t.alc_ac_cd.isNull()))
						.and(w.st_dt.between(t.st_dt, t.end_dt))));
		dbSelect("MGBGL5010_MAM_ALC_AC_IMP_S01", dbc, dbc_bldr);

		object(CLAZZ)._alcAcImpL = dbc;
	}

	protected void insAlcAcImpWk(MCList<? extends MCRow> l) {
		MCList<MAM_ALC_AC_IMP_R> dbc = MCList.create(MAM_ALC_AC_IMP_R.class);
		for (MCRow r : l) {
			MAM_ALC_AC_IMP_R row = dbc.createRow();
			row.dpt_cd(r.getString(MAM_ALC_AC_IMP_R.$dpt_cd));
			row.alc_ac_cd(r.getString(MAM_ALC_AC_IMP_R.$alc_ac_cd));
			row.st_dt(r.getDate(YM));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_ALC_AC_IMP_R.$dpt_cd, MAM_ALC_AC_IMP_R.$alc_ac_cd, MAM_ALC_AC_IMP_R.$st_dt);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_ALC_AC_IMP_R.create("T"));
		dbWkDelete("MGBGL5010_MAW_ALC_AC_IMP_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MGBGL5010_MAW_ALC_AC_IMP_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MCList<MAM_ALC_AC_IMP_R> getAlcAcImpL(String dptCd, String alcAcCd, MCDate ym) {
		MCRowMatcher<MAM_ALC_AC_IMP_R> tgtRM = r -> {
			if (r.st_dt().gtDate(ym) || r.end_dt().ltDate(ym)) {
				return false;
			}
			if (isNullAnd(r.alc_ac_cd(), r.dpt_cd())) {
				return true;
			}
			if (!isNullOr(r.alc_ac_cd(), r.dpt_cd())) {
				if (isSame(r.alc_ac_cd(), alcAcCd) && isSame(r.dpt_cd(), dptCd)) {
					return true;
				}
			}
			else if (!isNull(r.dpt_cd())) {
				if (isSame(r.dpt_cd(), dptCd)) {
					return true;
				}
			}
			else if (!isNull(r.alc_ac_cd())) {
				if (isSame(r.alc_ac_cd(), alcAcCd)) {
					return true;
				}
			}
			return false;
		};
		MCList<MAM_ALC_AC_IMP_R> l = object(CLAZZ)._alcAcImpL.subList(tgtRM);
		l.sort(MAM_ALC_AC_IMP_R.$alc_ac_cd, MAM_ALC_AC_IMP_R.$dpt_cd);
		return l;
	}

	//FMCB CUSTOM END
}