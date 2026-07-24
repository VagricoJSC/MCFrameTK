package mcframe.serverMBBE.MBBEL5030;

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
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.releaseDBTran;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import mcframe.serverMABS.MABSL0120.*;
import mcframe.serverMABS.MABSL0140.*;
import mcframe.serverMABC.MABCL0520.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_RecvExtMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_RecvExtMstService_MC extends MBBEL_RecvExtMstService_MC_A{
	//FMCB CUSTOM START

	protected static final String EXE_STS_TYP = "exe_sts_typ";
	protected static final String DATA_NO = "data_no";
	protected static final String DATA_LNO = "data_lno";
	protected static final String ST_DT = "st_dt";
	protected static final String ST_DT_KEY = "st_dt_key";
	protected static final String BATCH_LOG_NO = "batch_log_no";
	protected static final String LOG_SUB_KEY1 = "log_sub_key1";
	protected static final String LOG_SUB_KEY2 = "log_sub_key2";
	protected static final String UPD_CNTR = "upd_cntr";
	protected static final String MST_UPD_CNTR = "mst_upd_cntr";
	protected static final String DATA_CRUD_TYP = "data_crud_typ";
	
	protected static final Class<MBBEL_RecvExtMstService_MC> CLAZZ = MBBEL_RecvExtMstService_MC.class;

	/**
	 * RecvExtMst_Chk01オペレーション.<p>
	 *
	 * 外部マスタ取込を行う前のチェック処理<br>
	 */
	public class RecvExtMst_Chk01 extends MBBEL_RecvExtMstService_MC_A.RecvExtMst_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			chkExtMasterTyp(msgL);
			chkDuplicatedExtSys(msgL);
			return msgL;
		}
		
		protected void chkExtMasterTyp(MCMessageList msgL) {
			if (!MAC_EXT_MASTER_TYP.is_recv(up0().ext_master_typ())) {
				msgL.add(new MCMessage(up0(), null , MBBEL0103, up0().ext_master_typ()));
			}
		}
		
		protected void chkDuplicatedExtSys(MCMessageList msgL) {
			if (isNull(up1())) return;
			if (up1().groupBy(RecvExtMst_Chk01_DtlR.$ext_sys_cd).size() > 1) {
				msgL.add(new MCMessage(up0(), null , MBBEL0101));
			}
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	
	/**
	 * RecvExtMst_Upd01オペレーション.<p>
	 *
	 * 外部マスタ取込を行う。（メイン処理）<br>
	 */
	public class RecvExtMst_Upd01 extends MBBEL_RecvExtMstService_MC_A.RecvExtMst_Upd01 {
		
		protected MCDBTransaction _mstTran = null;
		protected MCDBTransaction _ifTran = null;
		
		protected MCList<? extends MCDBContainer> _ifL = null;
		protected MCDBContainer _ifL_t = null;
		
		protected MCQueryApiBuilder _ifL_bldr = null;
		
		protected MCList<MCRow> _mstL = null;
		protected  MCDBContainer _mstR = null;
		protected  MCDBContainer _mstR_ = null;
		
		protected MCQueryApiBuilder _mstR_bldr = null;
		
		protected mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker _chkOpe = null;
		protected mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater _updOpe = null;
		
		protected MCPredicate _keyWhere = null;
		protected MCPredicate _wKkeyWhere = null;
		
		String[] _mstKeyCols = null;
		//マスタの更新方法が「削除後に新規登録」の場合true
		protected boolean _isRemake = false;
		
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
		
		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			initProc();
			main();
		}
		
		protected void callThisChk01() {
			//共通チェック呼び出し
			MBBEL_RecvExtMstService.RecvExtMst_Chk01 o = MBBEL_RecvExtMstService.crtRecvExtMst_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}
		
		protected void initProc() {
			//マスタチェック基準日の補完
			if (isNull(up0().master_check_dt())) {
				up0().master_check_dt(getToday());
			}
		}
		
		protected void main() {
			if (MAC_EXT_MASTER_TYP.isPURC_UPRI(up0().ext_master_typ())) {
				_isRemake = true;
				copyPurcUpri();
			}
			if (MAC_EXT_MASTER_TYP.isPROC_UPRI(up0().ext_master_typ())) {
				_isRemake = true;
				copyProcUpri();
			}
			if (MAC_EXT_MASTER_TYP.isBP(up0().ext_master_typ())) {
				_isRemake = false;
				copyBP();
			}
		}

		protected void copyPurcUpri() {
			_mstR = MAM_PURC_UPRI_R.create("M");
			_mstR_ = MAM_PURC_UPRI__R.create("M");
			_ifL = MCList.create(MBT_PURC_UPRI_IF_R.class);
			_chkOpe = MABSL_PurcUpriReg.crtPurcUpri_UpdChk01();
			_updOpe = MABSL_PurcUpriReg.crtPurcUpri_Upd01();
			copyMaster();
		}
		
		protected void copyProcUpri() {
			_mstR = MAM_PROC_UPRI_R.create("M");
			_mstR_ = MAM_PROC_UPRI__R.create("M");
			_ifL = MCList.create(MBT_PROC_UPRI_IF_R.class);
			_chkOpe = MABSL_ProcUpriReg.crtProcUpri_UpdChk01();
			_updOpe = MABSL_ProcUpriReg.crtProcUpri_Upd01();
			copyMaster();
		}
		
		protected void copyBP() {
			_mstR = MAM_BP_R.create("M");
			_ifL = MCList.create(MBT_BP_IF_R.class);
			_chkOpe = MABCL_BpLst.crtBpLst_UpdChk01();
			_updOpe = MABCL_BpLst.crtBpLst_Upd01();
			copyMaster2();
		}
		
		protected void copyMaster() {
			_mstR_bldr = MCQueryApiBuilder.create(_mstR);
			_ifL_t = _ifL.createInstance().createRow();
			_ifL_t.setAlias("T");
			_ifL_bldr = MCQueryApiBuilder.create(_ifL_t);
			
			logger().writeProcessLog(MBBBL0012, getTableNm());
			
			_wKkeyWhere = null;
			_mstKeyCols = null;
			boolean dataExist = false;
			
			for (MCRow r : getDataNoL()) {
				dataExist = true;
				
				MCSavepoint sp = dbTran().setSavepoint();
				try {
					MCNumber dataNo = r.getNumber(DATA_NO);
					setMstOpe();
					getIfData(dataNo);
					chkIfData();
					setGrpErr(dataNo);
					throwUpdErr();
					
					setNullVal();
					callMstChk();
					setGrpErr(dataNo);
					throwUpdErr();
					
					setWkforDelete();
					delMst();
					editMstL();
					callMstUpd();
					setGrpErr(dataNo);
					throwUpdErr();
					
					setOK();
					resetImpFlg();
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
		
		protected void copyMaster2() {
			_mstR_bldr = MCQueryApiBuilder.create(_mstR);
			_ifL_t = _ifL.createInstance().createRow();
			_ifL_t.setAlias("T");
			_ifL_bldr = MCQueryApiBuilder.create(_ifL_t);

			logger().writeProcessLog(MBBBL0012, getTableNm());

			_keyWhere = null;
			_mstKeyCols = null;
			boolean dataExist = false;

			for (MCRow r : getDataNoL()) {
				dataExist = true;
				
				MCSavepoint sp = dbTran().setSavepoint();
				try {
					MCNumber dataNo = r.getNumber(DATA_NO);
					setMstOpe();
					getIfData(dataNo);
					chkIfData();
					setGrpErr(dataNo);
					throwUpdErr();

					callMstChk();
					setGrpErr(dataNo);
					throwUpdErr();
					
					editDBCList();
					callMstUpd();
					setGrpErr(dataNo);
					throwUpdErr();
					
					setOK();
					resetImpFlg();
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
		
		protected MCList<? extends MCDBContainer> getDataNoL() {
			MCList<? extends MCDBContainer> dbc = _ifL.createInstance();
			MCDBContainer t = dbc.createRow();
			t.setAlias("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.getColumn$(DATA_NO));
			dbc_bldr.setOrderByAsc(t.getColumn$(DATA_NO));
			setWhere(dbc, t, dbc_bldr);
			if (isNull(up1())) {
				dbSelect(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "S01"), dbc, dbc_bldr);
			}
			else {
				dbSelect(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "S02"), dbc, dbc_bldr, up1());
			}
			return dbc;
		}
		
		protected void setMstOpe() {
			_ifL = _ifL.createInstance();
			if (MAC_EXT_MASTER_TYP.isPURC_UPRI(up0().ext_master_typ())) {
				_chkOpe = MABSL_PurcUpriReg.crtPurcUpri_UpdChk01();
				_updOpe = MABSL_PurcUpriReg.crtPurcUpri_Upd01();
			}
			else if (MAC_EXT_MASTER_TYP.isPROC_UPRI(up0().ext_master_typ())) {
				_chkOpe = MABSL_ProcUpriReg.crtProcUpri_UpdChk01();
				_updOpe = MABSL_ProcUpriReg.crtProcUpri_Upd01();
			}
			else if (MAC_EXT_MASTER_TYP.isBP(up0().ext_master_typ())) {
				_chkOpe = MABCL_BpLst.crtBpLst_UpdChk01();
				_updOpe = MABCL_BpLst.crtBpLst_Upd01();
			}
		}
		
		protected void getIfData(MCNumber dataNo) {
			setCurrentDBTran(_ifTran);
			selectIfData(dataNo);
			complIfData();
			returnedCurrentDBTran();
		}
		
		protected void selectIfData(MCNumber dataNo) {
			if (!_isRemake) {
				MCDBContainer m = (MCDBContainer)_mstR.createInstance();
				m.setAlias("M");
				_ifL_bldr.addSelect(((MCNumberPermColumn) m.getColumn$("upd_cntr")).as(MST_UPD_CNTR));
				MCPredicate condition = getKeyWhere(_ifL_t, m);
				_ifL_bldr.addLeftOuterJoin(m, bracket(value(0).eq(value(0)).and(condition)));
				_ifL_bldr.setLockTable(_ifL_t.getColumn$(DATA_NO));
			}
			_ifL_bldr.setLockTable(_ifL_t.getColumn$(DATA_NO));
			// 検索条件の設定
			setWhere(_ifL, _ifL_t, _ifL_bldr, dataNo);
			// 検索＋ロック
			dbSelectForUpdate(createSqlId(LOGIC_ID, _ifL_bldr.getBaseDbc(), "S03"), _ifL, _ifL_bldr);
			_ifL.sort(getKeyColumn());
			// ＰＧ実行状況区分初期値は「未処理」
			_ifL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			logger().writeProcessLog(MBBBL0008, dataNo, _ifL.size());
		}
		
		protected void complIfData() {
			if (MAC_EXT_MASTER_TYP.isPROC_UPRI(up0().ext_master_typ())) {
				_ifL.setStringNE("proc_upri_typ", MAC_PROC_UPRI_TYP.ITM.value());
			}
		}
		
		protected void setWhere(MCList<? extends MCDBContainer> dbc, MCDBContainer t,
				MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(MCQueryApiBuilder
					.makeEq(t.getColumn$("imp_flg"), value(true))
					.and(MCQueryApiBuilder.makeIn(t.getColumn$("exe_sts_typ"),
							value(MAC_EXE_STS_TYP.NOT_EXE.value()),
							value(MAC_EXE_STS_TYP.ERR.value()
									)))
					.and(MCQueryApiBuilder.makeEq(t.getColumn$("ext_sys_cd"), value(up0().ext_sys_cd()))));
			if (!isNull(dataNo)) {
				dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(t.getColumn$("data_no"), value(dataNo)));
			}
		}
		
		protected void setWhere(MCList<? extends MCDBContainer> dbc, MCDBContainer t,
				MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.addConstWhereWithAnd(MCQueryApiBuilder
					.makeEq(t.getColumn$("imp_flg"), value(true))
					.and(MCQueryApiBuilder.makeIn(t.getColumn$("exe_sts_typ"),
							value(MAC_EXE_STS_TYP.NOT_EXE.value()),
							value(MAC_EXE_STS_TYP.ERR.value()
									)))
					.and(MCQueryApiBuilder.makeEq(t.getColumn$("ext_sys_cd"), value(up0().ext_sys_cd()))));
			if (!isNull(up1())) {
				dbc_bldr.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(t.getColumn$("data_no"), bind("data_no")));
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
		
		protected MCPredicate getWkKeyWhere(MCDBContainer t, MCDBContainer m) {
			if (_wKkeyWhere == null) {
				for (String col : getGrpKey()) {
					MCPermColumn mainCol = t.getColumn$(col);
					MCPermColumn joinCol = m.getColumn$(col);
					MCPredicate c = MCQueryApiBuilder.makeEq(mainCol, joinCol);
					_wKkeyWhere = (_wKkeyWhere == null) ? c : _wKkeyWhere.and(c);
				}
			}
			return _wKkeyWhere;
		}
		
		protected String[] getKeyColumn() {
			if (_mstKeyCols == null) {
				List<String> colL = new ArrayList<String>();
				for (String col : _mstR.getKeyColumn()) {
					if (isSame(col, "proc_upri_typ")) {
						continue;
					}
					colL.add(col);
				}
				_mstKeyCols = colL.toArray(new String[colL.size()]);
			}
			return _mstKeyCols;
		}
		
		protected void chkIfData() {
			// 基本キー重複チェック処理
			String baseKeyNms = getNmStrByCols(_mstR, getKeyColumn());
			for (MCList<? extends MCDBContainer> l : _ifL.groupList(getKeyColumn())) {
				if (l.size() > 1) {
					for (MCDBContainer r : l) {
						setIfRowErr(r, null, MBBBL0006, r.getNumber(DATA_LNO), baseKeyNms);
					}
				}
			}
		}
		
		protected void setNullVal() {
			for (MCDBContainer r : _ifL) {
				if (isNull(r.getString("itm_sub1"))) {
					r.setString("itm_sub1", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("itm_sub2"))) {
					r.setString("itm_sub2", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("itm_sub3"))) {
					r.setString("itm_sub3", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("wg_cd"))) {
					r.setString("wg_cd", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("maker_cd"))) {
					r.setString("maker_cd", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("loc_cd"))) {
					r.setString("loc_cd", MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.getString("dlv_cd"))) {
					r.setString("dlv_cd", MAC_STR.NULL_VAL.value());
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
				// データ更新区分に応じてステータスと更新カウンタを追加
				if (MAC_DATA_CRUD_TYP.isCRT(ifRow.getString(DATA_CRUD_TYP))) {
					tmpRow.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(ifRow.getString(DATA_CRUD_TYP))) {
						tmpRow.setStatus(MCRow.MODIFY);
						tmpRow.setNumber(UPD_CNTR, ifRow.getNumber(MST_UPD_CNTR));
					}
				else if (MAC_DATA_CRUD_TYP.isDEL(ifRow.getString(DATA_CRUD_TYP))) {
						tmpRow.setStatus(MCRow.DELETE );
						tmpRow.setNumber(UPD_CNTR, ifRow.getNumber(MST_UPD_CNTR));
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
		
		/**
		 * マスタのチェックを行います。<br>
		 * 過去データ（適用終了日がマスタチェック基準日より前）の場合は、<br>
		 * 論理削除フラグがオンのマスタも含めて、関連マスタの存在チェックを行います。<br>
		 * （過去データの場合は、関連マスタが論理削除されている可能性があるため）
		 * 
		 */
		protected void callMstChk() {
			// マスタチェック実行
			if(_isRemake) {
				MCList<? extends MCDBContainer> chkDtL = _ifL.createInstance();
				MCList<? extends MCDBContainer> chkDtOldL = _ifL.createInstance();
				MCDate chkDt = up0().master_check_dt();
				chkDtL = _ifL.subList(r -> chkDt.lteDate(r.getDateNE("end_dt")));
				chkDtOldL = _ifL.subList(r -> !chkDt.lteDate(r.getDateNE("end_dt")));
				
				callMstChkDt(chkDtL);
				callMstChkDtOld(chkDtOldL);
			}
			
			else{
				((MCList<?>) _chkOpe.up(0)).addAllByName(_ifL);
				_chkOpe.exec();
			}
			
			// 後処理
			MCMessageList newMsgL = new MCMessageList();
			MCMessageList msgChkList = MCMessagePool.getMessageList();
			MCIndexKey idxIf = _ifL.createIndex(getKeyColumn());
			for (MCMessage msgRow : msgChkList) {

				Comparable<?>[] bind = msgRow.getCauseRow().toArray(getKeyColumn());
				MCDBContainer errIfRow = _ifL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
				// エラーになったＩＦレコードをメッセージリストへ設定
				msgRow.setCauseRow(errIfRow, msgRow.getCauseColumn());

				newMsgL.add(msgRow);
			}
			
			MCMessagePool.clear();
			MCMessagePool.addAll(newMsgL);
		}
		
		protected void callMstChkDt(MCList<? extends MCDBContainer> ifL) {
			if (isNull(ifL)) return;
			
			((MCList<?>)_chkOpe.up(0)).clear();
			((MCList<?>)_chkOpe.up(0)).addAllByName(ifL);
			_chkOpe.exec();
		}
		
		protected void callMstChkDtOld(MCList<? extends MCDBContainer> ifL) {
			if (isNull(ifL)) return;
			
			setDelFlgCtl(false);
			try {
				callMstChkDt(ifL);
			}
			catch (MCAppException ex) {
				throw ex;
			}
			finally {
				setDelFlgCtl(true);
			}
		}
		
		
		/**
		 * 論理削除フラグ制御のオン・オフを設定します。<p>
		 * @param flg 論理削除フラグ制御のオン・オフ<p>
		 */
		protected void setDelFlgCtl(boolean flg) {
			MCRow r = MCRow.create();
			r.setStringNE("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
			String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
			execProc(createSqlId(LOGIC_ID, procid, "RecvExtMst_Upd01_setDelFlgCtl")
					, procid, r, ":del_flg_ctl");
		}
		
		protected void setWkforDelete() {
			// 削除対象データのキーをワークに登録
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(_mstR);
			
			dbWkDelete(createSqlId(LOGIC_ID, wkL_bldr.getBaseDbc().getPkWorkDbc(), "D01"), wkL_bldr.getBaseDbc());
			dbWkInsert(createSqlId(LOGIC_ID, wkL_bldr.getBaseDbc().getPkWorkDbc(), "I01"), _ifL.groupBy(getGrpKey()), wkL_bldr.getBaseDbc());
		}
		
		protected void delMst() {
			MCList<MCRow> mstL = MCList.create(MCRow.class);
			MCDBContainer m = (MCDBContainer)_mstR_.createInstance();
			m.setAlias("M");
			_mstR_bldr = MCQueryApiBuilder.create(m);
			MCDBContainer w1 = (MCDBContainer)_mstR.getPkWorkDbc().createInstance();
			w1.setAlias("W1");
			MCPredicate condition = getWkKeyWhere(m, w1);
			_mstR_bldr.addInnerJoin(w1, bracket(value(0).eq(value(0)).and(condition)));
			
			dbSelectForUpdate(createSqlId(LOGIC_ID, _mstR_bldr.getBaseDbc(), "S04"), mstL, _mstR_bldr);
			dbDeleteKey(createSqlId(LOGIC_ID, _mstR_bldr.getBaseDbc(), "D02"), mstL, _mstR_bldr);
			
			execDbWkDelete(createSqlId(LOGIC_ID, w1, "D03"), w1);
		}
		
		protected void editMstL() {
			_mstL = MCList.create(MCRow.class);
			
			for (MCDBContainer r : _ifL) {
				MCRow mstR = createNewMstRow(_mstR.createInstance(), r);
				mstR.setValuesByName(r);
				_mstL.add(mstR);
			}
			
			// 共通側チェックオペレーションでエラーＲＯＷを確定するため
			int paramRowIndex = 0;
			for (MCRow mstR : _mstL) {
				mstR.setParamIndex(0);
				mstR.setParamRowIndex(paramRowIndex);
				paramRowIndex++;
			}
		}
		
		protected void callMstUpd() {
			try {
				// マスタ登録実行
				((MCList<?>)_updOpe.up(0)).addAllByName(_mstL);
				_updOpe.exec();
			}
			catch (MCAppException ex) {
				MCMessageList newMsgL = new MCMessageList();
				MCMessageList msgChkList = ex.getCauseMessageList();
				MCIndexKey idxIf = _ifL.createIndex(getKeyColumn());
				for (MCMessage msgRow : msgChkList) {

					Comparable<?>[] bind = msgRow.getCauseRow().toArray(getKeyColumn());
					MCDBContainer errIfRow = _ifL.getFirst(idxIf, bind);
					// ＩＦレコードをエラーにする
					errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
					// エラーになったＩＦレコードをメッセージリストへ設定
					msgRow.setCauseRow(errIfRow, msgRow.getCauseColumn());
					
					newMsgL.add(msgRow);
				}
				
				MCMessagePool.clear();
				MCMessagePool.addAll(newMsgL);
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
			_ifL_bldr.setSet(
					_ifL_t.getColumn$("imp_flg"),
					_ifL_t.getColumn$(EXE_STS_TYP),
					_ifL_t.getColumn$(BATCH_LOG_NO),
					_ifL_t.getColumn$(LOG_SUB_KEY1),
					_ifL_t.getColumn$(LOG_SUB_KEY2));
			dbUpdateKey(createSqlId(LOGIC_ID, _ifL_bldr.getBaseDbc(), "U01"), _ifL, _ifL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_ifL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}
		
		protected void setOK() {
			for (MCDBContainer r : _ifL) {
				if (!MAC_EXE_STS_TYP.isERR(r.getString(EXE_STS_TYP))) {
					r.setString(EXE_STS_TYP,MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		protected void resetImpFlg() {
			for (MCDBContainer r : _ifL) {
				if (MAC_EXE_STS_TYP.isOK(r.getString(EXE_STS_TYP))) {
					r.setBoolean("imp_flg",false);
				}
			}
		}
		
		protected String[] getGrpKey() {
			return new String[] { 
					"itm_cd",
					"itm_sub1",
					"itm_sub2",
					"itm_sub3",
					"wg_cd",
					"sppl_cd"};
		}
		
		/**
		 * データNO単位でエラーにする
		 */
		protected void setGrpErr(MCNumber dataNo) {
			MCList<? extends MCDBContainer> errL = _ifL.subList(r -> MAC_EXE_STS_TYP.isERR(r.getString(EXE_STS_TYP)));
			if (isNull(errL)) {
				return;
			}
			
			for (MCDBContainer ifR : _ifL) {
				if (!MAC_EXE_STS_TYP.isERR(ifR.getString(EXE_STS_TYP))) {
					MCMessagePool.add(new MCMessage(ifR, null, MBBEL0102, dataNo));
					ifR.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
				}
			}
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
	
	/**
	 * RecvExtMst_Upd02オペレーション.<p>
	 *
	 * 外部マスタ取込を行う。（ＩＦデータ確認から呼び出される）<br>
	 */
	public class RecvExtMst_Upd02 extends MBBEL_RecvExtMstService_MC_A.RecvExtMst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callThisUpd01();
		}
		
		protected void callThisUpd01() {
			MBBEL_RecvExtMstService.RecvExtMst_Upd01 o = MBBEL_RecvExtMstService.crtRecvExtMst_Upd01();
			
			String extMasterTyp = null;
			IfDataImp_Upd01_DtlR hdr = up0().get(0);
			if (MAC_IF_PROC_TYP.isEXT_PURC_UPRI_RECV(hdr.if_proc_typ())) {
				extMasterTyp = MAC_EXT_MASTER_TYP.PURC_UPRI.value();
			}
			else if (MAC_IF_PROC_TYP.isEXT_PROC_UPRI_RECV(hdr.if_proc_typ())) {
				extMasterTyp = MAC_EXT_MASTER_TYP.PROC_UPRI.value();
			}
			else if (MAC_IF_PROC_TYP.isEXT_BP_RECV(hdr.if_proc_typ())) {
				extMasterTyp = MAC_EXT_MASTER_TYP.BP.value();
			}
			o.up0().ext_master_typ(extMasterTyp);
			o.up0().ext_sys_cd(hdr.ext_sys_cd());
			
			setAll(o.up1(), up0(), createMap_RecvExtMst_Chk01_DtlR_IfDataImp_Upd01_DtlR());
			o.exec();
		}
		
		protected Map_RecvExtMst_Chk01_DtlR_IfDataImp_Upd01_DtlR<RecvExtMst_Chk01_DtlR,IfDataImp_Upd01_DtlR> createMap_RecvExtMst_Chk01_DtlR_IfDataImp_Upd01_DtlR() {
			return new Map_RecvExtMst_Chk01_DtlR_IfDataImp_Upd01_DtlR<RecvExtMst_Chk01_DtlR, IfDataImp_Upd01_DtlR>();
		}

		public class Map_RecvExtMst_Chk01_DtlR_IfDataImp_Upd01_DtlR<D extends RecvExtMst_Chk01_DtlR, S extends IfDataImp_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RecvExtMst_Chk01_DtlR.$data_no, IfDataImp_Upd01_DtlR.$data_no);
				addColumnPathMap(RecvExtMst_Chk01_DtlR.$ext_sys_cd, IfDataImp_Upd01_DtlR.$ext_sys_cd);

			}
		}
	}

	//FMCB CUSTOM END
}