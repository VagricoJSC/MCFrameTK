package mcframe.serverMBBB.MBBBL5010;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBB.MBBBL5010.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.releaseDBTran;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import mcframe.serverMABC.MABCL0050.*;
import mcframe.serverMABC.MABCL1000.*;
import mcframe.serverMABC.MABCL1020.*;
import mcframe.serverMABC.MABCL1030.*;
import mcframe.serverMABC.MABCL1130.*;
import mcframe.serverMABC.MABCL1180.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_AcMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_AcMstService_MC extends MBBBL_AcMstService_MC_A{
	//FMCB CUSTOM START

	protected static final String EXE_STS_TYP = "exe_sts_typ";
	protected static final String DATA_NO = "data_no";
	protected static final String DATA_LNO = "data_lno";
	protected static final String UPD_CNTR = "upd_cntr";
	protected static final String MST_UPD_CNTR = "mst_upd_cntr";
	protected static final String ST_DT = "st_dt";
	protected static final String ST_DT_KEY = "st_dt_key";
	protected static final String BATCH_LOG_NO = "batch_log_no";
	protected static final String LOG_SUB_KEY1 = "log_sub_key1";
	protected static final String LOG_SUB_KEY2 = "log_sub_key2";

	/**
	 * AcMst_Chk01オペレーション.<p>
	 *
	 * 会計マスタ取込前チェック<br>
	 */
	public class AcMst_Chk01 extends MBBBL_AcMstService_MC_A.AcMst_Chk01 {

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
	 * AcMst_Upd01オペレーション.<p>
	 *
	 * 会計マスタを取り込む。<br>
	 */
	public class AcMst_Upd01 extends MBBBL_AcMstService_MC_A.AcMst_Upd01 {

		protected MCDBTransaction _mstTran = null;
		protected MCDBTransaction _ifTran = null;
		protected MCList<? extends MCDBContainer> _ifL = null;
		protected MCDBContainer _ifL_t = null;
		protected MCQueryApiBuilder _ifL_bldr = null;
		protected MCList<MCRow> _mstL = null;
		protected MCDBContainer _mstR = null;
		protected MCQueryApiBuilder _mstR_bldr = null;
		protected mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker _chkOpe = null;
		protected mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater _updOpe = null;
		protected MCPredicate _keyWhere = null;

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
				setCurrentDBTran(_mstTran);
				releaseDBTran(_ifTran);
				writeEndLogWithLogger(null);
			}
		}

		protected void createIfTran() {
			_mstTran = dbTran();
			_ifTran = createDBTran();
			setCurrentDBTran(_mstTran);
		}

		protected void execMain(){
			callThisChk01();
			throwUpdErr();
			main();
		}

		protected void callThisChk01() {
			MBBBL_AcMstService.AcMst_Chk01 o = MBBBL_AcMstService.crtAcMst_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			if (up0().ac_tax_flg()) { // 会計税は勘定科目より先に実行
				copyAcTax();
			}
			if (up0().account_flg()) {
				copyAccount();
			}
			if (up0().sub_account_flg()) {
				copySubAccount();
			}
			if (up0().ac_dpt_flg()) {
				copyAcDpt();
			}
			if (up0().bank_flg()) {
				copyBank();
			}
			if (up0().bank_branch_flg()) {
				copyBankBranch();
			}
			if (up0().bank_ac_flg()) {
				copyBankAc();
			}
			if (up0().bac_ac_flg()) {
				copyBacAc();
			}
			if (up0().cur_xrate_flg()) {
				copyCurXrate();
			}
		}

		protected void copyAccount() {
			_mstR = MAM_ACCOUNT_R.create("M");
			_ifL = MCList.create(MBT_ACCOUNT_IF_R.class);
			copyMaster();
		}

		protected void copySubAccount() {
			_mstR = MAM_SUB_ACCOUNT_R.create("M");
			_ifL = MCList.create(MBT_SUB_ACCOUNT_IF_R.class);
			copyMaster();
		}

		protected void copyAcDpt() {
			_mstR = MAM_AC_DPT_R.create("M");
			_ifL = MCList.create(MBT_AC_DPT_IF_R.class);
			copyMaster();
		}

		protected void copyBacAc() {
			_mstR = MAM_BAC_AC_R.create("M");
			_ifL = MCList.create(MBT_BAC_AC_IF_R.class);
			copyMaster();
		}

		protected void copyBank() {
			_mstR = MAM_BANK_R.create("M");
			_ifL = MCList.create(MBT_BANK_IF_R.class);
			copyMaster();
		}

		protected void copyBankBranch() {
			_mstR = MAM_BANK_BRANCH_R.create("M");
			_ifL = MCList.create(MBT_BANK_BRANCH_IF_R.class);
			copyMaster();
		}

		protected void copyBankAc() {
			_mstR = MAM_BANK_AC_R.create("M");
			_ifL = MCList.create(MBT_BANK_AC_IF_R.class);
			copyMaster();
		}

		protected void copyCurXrate() {
			_mstR = MAM_CUR_XRATE_R.create("M");
			_ifL = MCList.create(MBT_CUR_XRATE_IF_R.class);
			copyMaster();
		}

		protected void copyAcTax() {
			_mstR = MAM_AC_TAX_R.create("M");
			_ifL = MCList.create(MBT_AC_TAX_IF_R.class);
			copyMaster();
		}

		protected void copyMaster() {
			
			_mstR_bldr = MCQueryApiBuilder.create(_mstR);
			_ifL_t = _ifL.createInstance().createRow();
			_ifL_t.setAlias("T");
			_ifL_bldr = MCQueryApiBuilder.create(_ifL_t);
			
			logger().writeProcessLog(MBBBL0012, getTableNm());

			_keyWhere = null;
			boolean dataExist = false;

			delMst();

			for (MCRow r : getDataNoL()) {
				dataExist = true;

				MCSavepoint sp = dbTran().setSavepoint();
				try {
					reset();
					getIfData(r.getNumber(DATA_NO));
					chkIfData();
					throwUpdErr();
					editDBCList();
					callMstChk();
					throwUpdErr();
					callMstUpd();
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					throw ex;
				}
				finally {
					updIfData();
				}
				dbTran().commit();
			}

			if (!dataExist) {
				logger().writeProcessLog(MBBBL0011, 0);
			}

			logger().writeProcessLog(MBBBL0013, getTableNm());
		}

		protected String getTableNm() {
			return getDBLabel(_mstR.tableName(), null , getUsrLocale());
		}

		protected void delMst() {
			if (MAC_MASTER_IMP_TYP.isREMAKE(up0().master_imp_typ())) {
				_mstR_bldr.buildDelete(createSqlId(LOGIC_ID, _mstR_bldr.getBaseDbc(), "D50")).executeUpdate();
				dbTran().commit();
			}
		}

		protected MCList<? extends MCDBContainer> getDataNoL() {
			MCList<? extends MCDBContainer> dbc = _ifL.createInstance();
			MCDBContainer t = dbc.createRow();
			t.setAlias("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.getColumn$(DATA_NO));
			dbc_bldr.setOrderByAsc(t.getColumn$(DATA_NO));
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "S50"), dbc, dbc_bldr);
			return dbc;
		}

		protected void reset() {
			_ifL = _ifL.createInstance();

			if (_mstR instanceof MAM_ACCOUNT_R) {
				_chkOpe = MABCL_AccountReg.crtAccount_UpdChk01();
				_updOpe = MABCL_AccountReg.crtAccount_Upd01();
			}
			else if (_mstR instanceof MAM_SUB_ACCOUNT_R) {
				_chkOpe = MABCL_SubAccountReg.crtSubAccount_UpdChk01();
				_updOpe = MABCL_SubAccountReg.crtSubAccount_Upd01();
			}
			else if (_mstR instanceof MAM_AC_DPT_R) {
				_chkOpe = MABCL_AcDptReg.crtAcDpt_UpdChk01();
				_updOpe = MABCL_AcDptReg.crtAcDpt_Upd01();
			}
			else if (_mstR instanceof MAM_BAC_AC_R) {
				_chkOpe = MABCL_BacAcReg.crtBacAc_UpdChk01();
				_updOpe = MABCL_BacAcReg.crtBacAc_Upd01();
			}
			else if (_mstR instanceof MAM_BANK_R) {
				_chkOpe = mcframe.serverMABC.MABCL0031.MABCL_MultiReg.crtBank_UpdChk01();
				_updOpe = mcframe.serverMABC.MABCL0031.MABCL_MultiReg.crtBank_Upd01();
			}
			else if (_mstR instanceof MAM_BANK_BRANCH_R) {
				_chkOpe = mcframe.serverMABC.MABCL0031.MABCL_MultiReg.crtBankBranch_UpdChk01();
				_updOpe = mcframe.serverMABC.MABCL0031.MABCL_MultiReg.crtBankBranch_Upd01();
			}
			else if (_mstR instanceof MAM_BANK_AC_R) {
				_chkOpe = mcframe.serverMABC.MABCL0032.MABCL_MultiReg.crtBankAc_UpdChk01();
				_updOpe = mcframe.serverMABC.MABCL0032.MABCL_MultiReg.crtBankAc_Upd01();
			}
			else if (_mstR instanceof MAM_CUR_XRATE_R) {
				_chkOpe = MABCL_CurXrateReg.crtCurXrate_UpdChk01();
				_updOpe = MABCL_CurXrateReg.crtCurXrate_Upd01();
			}
			else if (_mstR instanceof MAM_AC_TAX_R) {
				_chkOpe = MABCL_AcTaxReg.crtAcTax_UpdChk01();
				_updOpe = MABCL_AcTaxReg.crtAcTax_Upd01();
			}
		}

		protected void getIfData(MCNumber dataNo) {
			setCurrentDBTran(_ifTran);
			selectIfData(dataNo);
			returnedCurrentDBTran();
		}

		protected void selectIfData(MCNumber dataNo) {
			// 検索項目の追加
			if (!MAC_MASTER_IMP_TYP.isADD_ONLY(up0().master_imp_typ())) {
				MCDBContainer m = (MCDBContainer)_mstR.createInstance();
				m.setAlias("M");
				_ifL_bldr.addSelect(((MCNumberPermColumn) m.getColumn$("upd_cntr")).as(MST_UPD_CNTR));
				MCPredicate condition = getKeyWhere(_ifL_t, m);
				_ifL_bldr.addLeftOuterJoin(m, bracket(value(0).eq(value(0)).and(condition)));
				_ifL_bldr.setLockTable(_ifL_t.getColumn$(DATA_NO));
			}
			// 検索条件の設定
			setWhere(_ifL, _ifL_t, _ifL_bldr, dataNo);
			// 検索＋ロック
			dbSelectForUpdateNoWait(createSqlId(LOGIC_ID, _ifL_bldr.getBaseDbc(), "S51"), _ifL, _ifL_bldr);
			_ifL.sort(_mstR.getKeyColumn());
			// ＰＧ実行状況区分初期値は「未処理」
			_ifL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			logger().writeProcessLog(MBBBL0008, dataNo, _ifL.size());
		}

		protected void setWhere(MCList<? extends MCDBContainer> dbc, MCDBContainer t,
				MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(MCQueryApiBuilder
					.makeEq(t.getColumn$("imp_flg"), value(true))
					.and(MCQueryApiBuilder.makeIn(t.getColumn$("exe_sts_typ"),
							value(MAC_EXE_STS_TYP.NOT_EXE.value()),
							value(MAC_EXE_STS_TYP.ERR.value()))));
			if (!isNull(dataNo)) {
				dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(t.getColumn$("data_no"), value(dataNo)));
			}
			if (MAC_MASTER_IMP_TYP.isADD_ONLY(up0().master_imp_typ())) {
				MCDBContainer S1M = _mstR.clone();
				S1M.setAlias("M");
				MCPredicate condition = getKeyWhere(t, S1M);
				dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value(1)).from(S1M)
						.where(value(0).eq(value(0)).and(condition))));
			}
		}

		protected MCPredicate getKeyWhere(MCDBContainer t, MCDBContainer m) {
			if (_keyWhere == null) {
				for (String col : _mstR.getKeyColumn()) {
					MCPermColumn mainCol = t.getColumn$(col);
					MCPermColumn joinCol = m.getColumn$(col);
					MCPredicate c = MCQueryApiBuilder.makeEq(mainCol, joinCol);
					_keyWhere = (_keyWhere == null) ? c : _keyWhere.and(c);
				}
			}
			return _keyWhere;
		}

		protected void chkIfData() {
			// 基本キー重複チェック処理
			String baseKeyNms = getNmStrByCols(_mstR, _mstR.getKeyColumn());
			for (MCList<? extends MCDBContainer> l : _ifL.groupList(_mstR.getKeyColumn())) {
				if (l.size() > 1) {
					for (MCDBContainer r : l) {
						setIfRowErr(r, null, MBBBL0006, r.getNumber(DATA_LNO), baseKeyNms);
					}
				}
			}
		}

		protected void editDBCList() {
			// チェックＯＫのＩＦレコード
			MCList<? extends MCDBContainer> ifOkL = _ifL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			_mstL = MCList.create(MCRow.class);

			// チェックＯＫのＩＦレコードをループ
			for (MCDBContainer ifRow : ifOkL) {
				MCRow tmpRow = createNewMstRow(_mstR.createInstance(), ifRow);
				if (!MAC_MASTER_IMP_TYP.isADD_ONLY(up0().master_imp_typ())) {
					// 削除後再作成時も既存チェックをスルーするため「MODIFY」
					if (!isNull(ifRow.getNumber(MST_UPD_CNTR))) {
						tmpRow.setStatus(MCRow.MODIFY);
						tmpRow.setNumber(UPD_CNTR, ifRow.getNumber(MST_UPD_CNTR));
					}
				}
				_mstL.add(tmpRow);
			}

			// 共通側チェックオペレーションでエラーＲＯＷを確定するため
			int paramRowIndex = 0;
			for (MCRow mstR : _mstL) {
				mstR.setParamIndex(0);
				mstR.setParamRowIndex(paramRowIndex);
				paramRowIndex++;
			}
		}

		protected void callMstChk() {
			// マスタチェック実行
			((MCList<?>)_chkOpe.up(0)).addAllByName(_mstL);
			_chkOpe.exec();

			// 後処理
			MCMessageList newMsgL = new MCMessageList();
			MCMessageList msgChkList = MCMessagePool.getMessageList();
			MCIndexKey idxIf = _ifL.createIndex(_mstR.getKeyColumn());
			for (MCMessage msgRow : msgChkList) {

				// 会計税マスタの勘定科目・補助勘定科目の存在チェックエラーは無視
				if (_chkOpe instanceof MABCL_AcTaxReg.AcTax_UpdChk01
						&& (isSame(msgRow.getID(), MAUAL0008) || isSame(msgRow.getID(), MAUAL0009))) {
					continue;
				}

				Comparable<?>[] bind = msgRow.getCauseRow().toArray(_mstR.getKeyColumn());
				MCDBContainer errIfRow = _ifL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
				// エラーになったＩＦレコードをメッセージリストへ設定、
				msgRow.setCauseRow(errIfRow, msgRow.getCauseColumn());

				newMsgL.add(msgRow);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(newMsgL);
		}

		protected void callMstUpd() {
			// マスタ登録実行
			((MCList<?>)_updOpe.up(0)).addAllByName(_mstL);
			_updOpe.exec();

			MCList<? extends MCDBContainer> l = _ifL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MCDBContainer r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}

		protected void updIfData() {
			setCurrentDBTran(_ifTran);
			updateIfData();
			_ifTran.commit();
			returnedCurrentDBTran();
		}

		protected void updateIfData() {
			writeBatchLog();
			// ＩＦテーブルの更新
			_ifL_bldr.setSet(_ifL_t.getColumn$(EXE_STS_TYP),
					_ifL_t.getColumn$(BATCH_LOG_NO), _ifL_t.getColumn$(LOG_SUB_KEY1),
					_ifL_t.getColumn$(LOG_SUB_KEY2));
			dbUpdateKey(createSqlId(LOGIC_ID, _ifL_bldr.getBaseDbc(), "U50"), _ifL, _ifL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_ifL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}

	}

	protected String getNmStrByCols(MCDBContainer mstRow, String[] cols) {
		String nmStr = "";
		for (String col : cols) {
			String dbLblNm = getDBLabel(mstRow, col);
			if (isNull(nmStr)) {
				nmStr += dbLblNm;
			}
			else {
				nmStr += "," + dbLblNm;
			}
		}
		return nmStr;
	}

	protected String getDBLabel(MCDBContainer tblRow, String colId) {
		String tblNm = tblRow.tableName();
		return getDBLabel(tblNm, colId.toUpperCase());
	}

	protected void setIfRowErr(MCRow row, String colId, String msgId, Object... binds) {
		MCMessagePool.add(new MCMessage(row, colId, msgId, binds));
		row.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
	}

	protected MCRow createNewMstRow(MCRow tmpRow, MCDBContainer srcRow) {
		tmpRow.setStatus(MCRow.Status.CREATE);
		if (!isNull(srcRow)) {
			tmpRow.setValuesByName(srcRow);
			if (srcRow.containsConst(ST_DT)) {
				tmpRow.setDateNE(ST_DT, srcRow.getDate(ST_DT).trunc(MCDateFieldType.DAY));
				tmpRow.setDateNE(ST_DT_KEY, tmpRow.getDate(ST_DT));
			}
		}
		return tmpRow;
	}

	//FMCB CUSTOM END
}