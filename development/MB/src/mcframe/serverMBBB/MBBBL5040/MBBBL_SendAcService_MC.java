package mcframe.serverMBBB.MBBBL5040;

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
import mcframe.serverMB.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverMBBB.MBBBL5040.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendAcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendAcService_MC extends MBBBL_SendAcService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendAc_Chk01オペレーション.<p>
	 *
	 * 会計データの送信前チェック<br>
	 */
	public class SendAc_Chk01 extends MBBBL_SendAcService_MC_A.SendAc_Chk01 {

		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			//　ロック、更新カウンタチェック
			msgL.addAll(lock(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<SendAc_Chk01_DtlR> notErrL = getChkList(up0());
			for (SendAc_Chk01_DtlR r : notErrL) {
				if (!MAC_DATA_TYP.isJNL_MK(r.data_typ())) {
					msgL.add(new MCMessage(r, null, MBBBL0002, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

	}

	/**
	 * SendAc_Chk02オペレーション.<p>
	 *
	 * 送信済み会計データの取消前チェック<br>
	 */
	public class SendAc_Chk02 extends MBBBL_SendAcService_MC_A.SendAc_Chk02 {

		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			//　ロック、更新カウンタチェック
			msgL.addAll(lock(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<SendAc_Chk02_DtlR> notErrL = getChkList(up0());
			for (SendAc_Chk02_DtlR r : notErrL) {
				if (!MAC_DATA_TYP.isAC_MK(r.data_typ())) {
					msgL.add(new MCMessage(r, null, MBBBL0003, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

	}

	/**
	 * SendAc_Ins01オペレーション.<p>
	 *
	 * 会計データを送信する。<br>
	 */
	public class SendAc_Ins01 extends MBBBL_SendAcService_MC_A.SendAc_Ins01 {

		protected MCList<MCRow> _sendRecvIfUpL = null;
		protected MCList<MBT_JOURNAL_R> _jnlL;
		protected MCIndexKey _jnlKey;

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<SendAc_Chk01_DtlR> notErrL = getChkList(up0());
			upd(notErrL);

			if (!_sendRecvIfUpL.isEmpty()) {
				callSendRecvIf(_sendRecvIfUpL);
			}
		}

		protected void editUp() {
			setPegNo(up0());
			up0().sort(SendAc_Chk01_DtlR.$jnl_grp_no);
			_sendRecvIfUpL = MCList.create(MCRow.class);
			up0().setStringNE(MBT_JOURNAL_SND_IF_R.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().setStringNE(MBT_JOURNAL_SND_IF_R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		}

		protected void callThisChk01() {
			MBBBL_SendAcService.SendAc_Chk01 ope = MBBBL_SendAcService.crtSendAc_Chk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<SendAc_Chk01_DtlR> notErrL) {
			for (SendAc_Chk01_DtlR r : notErrL) {

				MCSavepoint sp = dbTran().setSavepoint();
				try {
					insJnlSndIf(r);
					updJnl(r);
					updHis(r);
				}
				catch (MCAppException ex) {
					handleExRow(ex, sp, r);
				}
			}
			dbTran().commit();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void insJnlSndIf(SendAc_Chk01_DtlR r) {
			// 会計ＩＦ区分単位でデータＮＯを発番
			MCList<MBT_JOURNAL_R> dbc = MCList.create(MBT_JOURNAL_R.class);
			MBT_JOURNAL_R t = MBT_JOURNAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.ac_if_typ);
			dbc_bldr.setWhere(t.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
			dbc_bldr.setOrderByAsc(t.ac_if_typ);
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, dbSelect("MBBBL5040_MBT_JOURNAL_S01", dbc, dbc_bldr));
			r.addNumberColumn("data_no1");
			r.addNumberColumn("data_no2");
			r.addNumberColumn("data_no3");
			for (MBT_JOURNAL_R row : dbc) {
				MCNumber no = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				if (MAC_AC_IF_TYP.isGL(row.ac_if_typ())) {
					r.setNumberNE("data_no1", no);
				}
				else if (MAC_AC_IF_TYP.isAP(row.ac_if_typ())) {
					r.setNumberNE("data_no2", no);
				}
				else if (MAC_AC_IF_TYP.isAR(row.ac_if_typ())) {
					r.setNumberNE("data_no3", no);
				}
				// 送受信ＩＦ登録用データ追加
				addSendRecvIfUpR(no, MAC_AC_IF_TYP.get(row.ac_if_typ()));
			}
			// 仕訳送信ＩＦ作成
			executeUpdate(MBBBL5040_MBT_JOURNAL_SND_IF_I01(), r);
		}

		protected void updJnl(SendAc_Chk01_DtlR r) {
			MBT_JOURNAL_R dbc = MBT_JOURNAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setSet(dbc.send_flg);
			dbc.setBoolean(MBT_JOURNAL_R.$send_flg, true);
			dbc_bldr.setWhere(dbc.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
			dbUpdate("MBBBL5040_MBT_JOURNAL_U01", dbc, dbc_bldr);
		}

		protected void updHis(SendAc_Chk01_DtlR r) {
			MBT_JNL_HISTORY_R dbc = r.jnl_his();
			MBT_JNL_HISTORY_R t = MBT_JNL_HISTORY_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSet(t.data_typ);
			dbc.data_typ(MAC_DATA_TYP.AC_MK.value());
			dbUpdateKey("MBBBL5040_MBT_JNL_HISTORY_U01", dbc, dbc_bldr);
		}

		protected void initJnlCache(MCList<SendAc_Chk01_DtlR> notErrL) {
			MCList<MBT_JNL_HISTORY_R> hisL = MCList.create(MBT_JNL_HISTORY_R.class);
			notErrL.forEach(r -> hisL.add(r.jnl_his()));
			MCQueryApiBuilder hisL_bldr = MCQueryApiBuilder.create(MBT_JNL_HISTORY_R.create("T"));
			dbWkDelete("MBBBL5040_MBW_JNL_HISTORY_D01", hisL_bldr.getBaseDbc());
			dbWkInsert("MBBBL5040_MBW_JNL_HISTORY_I01", hisL, hisL_bldr.getBaseDbc());

			_jnlL = MCList.create(MBT_JOURNAL_R.class);
			MBT_JOURNAL_R jnlL_t = MBT_JOURNAL_R.create("T");
			MCQueryApiBuilder jnlL_bldr = MCQueryApiBuilder.create(jnlL_t);
			MBW_JNL_HISTORY_KEY_R w = MBW_JNL_HISTORY_KEY_R.create("W");
			jnlL_bldr.addInnerJoin(w, w.jnl_grp_no.eq(jnlL_t.jnl_grp_no));
			dbSelect("MBBBL5040_MBT_JOURNAL_S02", _jnlL, jnlL_bldr);

			_jnlKey = _jnlL.createIndex(MBT_JOURNAL_R.$jnl_grp_no);
		}

		protected MCList<MBT_JOURNAL_R> getJnlL(String jnlGrpNo) {
			return _jnlL.subList(_jnlKey, jnlGrpNo);
		}

		/**
		 * 送受信ＩＦ制御の新規追加オペレーションに渡す上り電文にRowを追加する。
		 */
		protected void addSendRecvIfUpR(MCNumber dataNo, MAC_AC_IF_TYP typ) {
			String ifProcTyp = null;
			if (MAC_AC_IF_TYP.isGL(typ)) {
				ifProcTyp = MAC_IF_PROC_TYP.AC_JOURNAL_GL_SEND.value();
			}
			else if (MAC_AC_IF_TYP.isAP(typ)) {
				ifProcTyp = MAC_IF_PROC_TYP.AC_JOURNAL_AP_SEND.value();
			}
			else if (MAC_AC_IF_TYP.isAR(typ)) {
				ifProcTyp = MAC_IF_PROC_TYP.AC_JOURNAL_AR_SEND.value();
			}

			MCRow r = createSendRecvIfUpR(dataNo, up0().get(0).ext_sys_cd(), ifProcTyp);
			_sendRecvIfUpL.add(r);
		}

	}

	/**
	 * SendAc_Del01オペレーション.<p>
	 *
	 * 送信済み会計データを取り消す。<br>
	 */
	public class SendAc_Del01 extends MBBBL_SendAcService_MC_A.SendAc_Del01 {

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<SendAc_Chk02_DtlR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
			up0().sort(SendAc_Chk02_DtlR.$jnl_grp_no);
		}

		protected void callThisChk02() {
			MBBBL_SendAcService.SendAc_Chk02 ope = MBBBL_SendAcService.crtSendAc_Chk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<SendAc_Chk02_DtlR> notErrL) {
			for (SendAc_Chk02_DtlR r : notErrL) {

				MCSavepoint sp = dbTran().setSavepoint();
				try {
					delJnlSndIf(r);
					updJnl(r);
					updHis(r);
					delPftSdrvIf(_ifL);
				}
				catch (MCAppException ex) {
					handleExRow(ex, sp, r);
				}
			}
			dbTran().commit();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void delJnlSndIf(SendAc_Chk02_DtlR r) {
			_ifL = MCList.create(MBT_JOURNAL_SND_IF_R.class);
			MBT_JOURNAL_SND_IF_R ifL_t = MBT_JOURNAL_SND_IF_R.create("T");
			MCQueryApiBuilder ifL_bldr = MCQueryApiBuilder.create(ifL_t);
			ifL_bldr.setWhere(ifL_t.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
			ifL_bldr.setOrderByAsc(ifL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MBBBL5040_MBT_JOURNAL_SND_IF_S01", ifL_bldr);
			MCQueryApiBuilder ifL_bldrSelect = MCQueryApiBuilder.create(ifL_t);
			ifL_bldrSelect.setDistinct();
			ifL_bldrSelect.setSelect(ifL_t.data_no, ifL_t.ext_sys_cd);
			ifL_bldrSelect.setWhere(ifL_t.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());

			dbSelect("MBBBL5040_MBT_JOURNAL_SND_IF_S03", _ifL, ifL_bldrSelect);
			chkDelJnlSndIf(r);
			execDbDelete("MBBBL5040_MBT_JOURNAL_SND_IF_D01", ifL_t, ifL_t.jnl_grp_no.eq(bind("1")),
					r.jnl_grp_no());
		}
		protected void chkDelJnlSndIf(SendAc_Chk02_DtlR r) {
			MAM_EXT_SYS_R exySysR = MAM_EXT_SYS_R.create();
			if (!isNull(_ifL)) {
				exySysR = getExtSysR(_ifL.get(0).ext_sys_cd());
			}
			
			MBT_JOURNAL_SND_IF_R ifL_t = MBT_JOURNAL_SND_IF_R.create("T");
			if (MAC_EXT_SYS_TYP.isAC_SAP(exySysR.ext_sys_typ())) {
				if (execDbCount("MBBBL5040_MBT_JOURNAL_SND_IF_S03", ifL_t,
						ifL_t.jnl_grp_no.eq(bind("1"))
								.and(ifL_t.exe_sts_typ.notIn(bind("2"), bind("3"))),
						r.jnl_grp_no(), MAC_EXE_STS_TYP.NOT_EXE.value(), MAC_EXE_STS_TYP.ERR.value()) > 0) {
					throw new MCAppException(r, null, MBBBL0101, r.jnl_grp_no(),
							toDispGUIIndex(r));
				}
			}
			else {
				if (execDbCount("MBBBL5040_MBT_JOURNAL_SND_IF_S02", ifL_t,
						ifL_t.jnl_grp_no.eq(bind("1"))
								.and(ifL_t.exe_sts_typ.neq(bind("2"))),
						r.jnl_grp_no(), MAC_EXE_STS_TYP.NOT_EXE.value()) > 0) {
					throw new MCAppException(r, null, MBBBL0004, r.jnl_grp_no(),
							toDispGUIIndex(r));
				}
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache;
		protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
			if (_extSysCache  == null) {
				_extSysCache =
					new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(
						MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T"))
					);
			}
			return _extSysCache.get(extSysCd);
		}
		protected MCList<MBT_JOURNAL_SND_IF_R> _ifL = null;

		protected void updJnl(SendAc_Chk02_DtlR r) {
			MBT_JOURNAL_R dbc = MBT_JOURNAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setSet(dbc.send_flg);
			dbc.setBoolean(MBT_JOURNAL_R.$send_flg, false);
			dbc_bldr.setWhere(dbc.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
			dbUpdate("MBBBL5040_MBT_JOURNAL_U02", dbc, dbc_bldr);
		}

		protected void updHis(SendAc_Chk02_DtlR r) {
			MBT_JNL_HISTORY_R dbc = r.jnl_his();
			MBT_JNL_HISTORY_R t = MBT_JNL_HISTORY_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSet(t.data_typ);
			dbc.data_typ(MAC_DATA_TYP.JNL_MK.value());
			dbUpdateKey("MBBBL5040_MBT_JNL_HISTORY_U02", dbc, dbc_bldr);
		}

	}

	////////////////////////////////////////////////////////////////
	// Common

	/**
	 * ロック、更新カウンタチェック
	 */
	protected MCMessageList lock(MCList<? extends MCRow> bindL) {
		MCMessageList msgL = new MCMessageList();

		bindL.sort(MBT_JNL_HISTORY_R.$jnl_grp_no);
		MCList<MBT_JNL_HISTORY_R> selectL = MCList.create(MBT_JNL_HISTORY_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MBT_JNL_HISTORY_R.create("T"));
		selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());

		dbSelectKeyForUpdateNoWait("MBBBL5040_MBT_JNL_HISTORY_S01", selectL, selectL_bldr, bindL);
		MCIndexKey idxkey = selectL.createIndex(MBT_JNL_HISTORY_R.$jnl_grp_no);

		for (MCRow r : bindL) {
			MBT_JNL_HISTORY_R selectR = selectL.getFirst(idxkey, r.getString(MBT_JNL_HISTORY_R.$jnl_grp_no));
			msgL.addAll(checkUpdCntrNE(r, MBT_JNL_HISTORY_R.$upd_cntr, selectR));
		}

		return msgL;
	}

	////////////////////////////////////////////////////////////////
	// Map

	protected Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<MBT_JOURNAL_SND_IF_R,MBT_JOURNAL_R> createMap_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R() {
		return new Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<MBT_JOURNAL_SND_IF_R, MBT_JOURNAL_R>();
	}

	public class Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<D extends MBT_JOURNAL_SND_IF_R, S extends MBT_JOURNAL_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_grp_no, MBT_JOURNAL_R.$jnl_grp_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_ym, MBT_JOURNAL_R.$ac_ym);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_if_typ, MBT_JOURNAL_R.$ac_if_typ);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_cnt_id, MBT_JOURNAL_R.$slip_cnt_id);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_no, MBT_JOURNAL_R.$jnl_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_no_seq, MBT_JOURNAL_R.$jnl_no_seq);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$dc_typ, MBT_JOURNAL_R.$dc_typ);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_slip_dt, MBT_JOURNAL_R.$ac_slip_dt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_dt, MBT_JOURNAL_R.$ac_dt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_no, MBT_JOURNAL_R.$slip_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_seq_no, MBT_JOURNAL_R.$slip_seq_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$dpt_cd, MBT_JOURNAL_R.$dpt_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_cd, MBT_JOURNAL_R.$ac_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_ac_cd, MBT_JOURNAL_R.$sub_ac_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$project_cd, MBT_JOURNAL_R.$project_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd0, MBT_JOURNAL_R.$summary_cd0);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd1, MBT_JOURNAL_R.$summary_cd1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd2, MBT_JOURNAL_R.$summary_cd2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd3, MBT_JOURNAL_R.$summary_cd3);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd4, MBT_JOURNAL_R.$summary_cd4);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd5, MBT_JOURNAL_R.$summary_cd5);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_cd, MBT_JOURNAL_R.$itm_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub1, MBT_JOURNAL_R.$itm_sub1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub2, MBT_JOURNAL_R.$itm_sub2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub3, MBT_JOURNAL_R.$itm_sub3);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_nm, MBT_JOURNAL_R.$itm_nm);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bp_typ, MBT_JOURNAL_R.$bp_typ);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bp_cd, MBT_JOURNAL_R.$bp_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_unit_qty, MBT_JOURNAL_R.$base_unit_qty);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_unit_cd, MBT_JOURNAL_R.$base_unit_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_upri, MBT_JOURNAL_R.$base_cur_upri);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_sum_amt, MBT_JOURNAL_R.$base_cur_sum_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_amt, MBT_JOURNAL_R.$base_cur_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_tax_amt, MBT_JOURNAL_R.$base_cur_tax_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_cd, MBT_JOURNAL_R.$base_cur_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_upri, MBT_JOURNAL_R.$trd_cur_upri);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_sum_amt, MBT_JOURNAL_R.$trd_cur_sum_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_amt, MBT_JOURNAL_R.$trd_cur_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_tax_amt, MBT_JOURNAL_R.$trd_cur_tax_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_cd, MBT_JOURNAL_R.$trd_cur_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_upri, MBT_JOURNAL_R.$ptax_cur_upri);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_sum_amt, MBT_JOURNAL_R.$ptax_cur_sum_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_amt, MBT_JOURNAL_R.$ptax_cur_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_tax_amt, MBT_JOURNAL_R.$ptax_cur_tax_amt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_cd, MBT_JOURNAL_R.$ptax_cur_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$tax_typ, MBT_JOURNAL_R.$tax_typ);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$tax_cd, MBT_JOURNAL_R.$tax_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$foreign_flg, MBT_JOURNAL_R.$foreign_flg);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$xrate, MBT_JOURNAL_R.$xrate);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$xrate_cd, MBT_JOURNAL_R.$xrate_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_xrate, MBT_JOURNAL_R.$ptax_xrate);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_xrate_cd, MBT_JOURNAL_R.$ptax_xrate_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$iv_no, MBT_JOURNAL_R.$iv_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bill_no, MBT_JOURNAL_R.$bill_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slo_no, MBT_JOURNAL_R.$slo_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$po_no, MBT_JOURNAL_R.$po_no);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$usr_cd, MBT_JOURNAL_R.$usr_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$cls_jnl_typ, MBT_JOURNAL_R.$cls_jnl_typ);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$alloc_jnl_flg, MBT_JOURNAL_R.$alloc_jnl_flg);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$spot_flg, MBT_JOURNAL_R.$spot_flg);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sttl_schd_dt, MBT_JOURNAL_R.$sttl_schd_dt);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sttl_cd, MBT_JOURNAL_R.$sttl_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bank_ac_cd, MBT_JOURNAL_R.$bank_ac_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_ac_cd, MBT_JOURNAL_R.$other_ac_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_sub_ac_cd, MBT_JOURNAL_R.$other_sub_ac_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_dpt_cd, MBT_JOURNAL_R.$other_dpt_cd);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$abstract1, MBT_JOURNAL_R.$abstract1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$abstract2, MBT_JOURNAL_R.$abstract2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char1, MBT_JOURNAL_R.$sub_char1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char2, MBT_JOURNAL_R.$sub_char2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char3, MBT_JOURNAL_R.$sub_char3);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char4, MBT_JOURNAL_R.$sub_char4);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char5, MBT_JOURNAL_R.$sub_char5);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char6, MBT_JOURNAL_R.$sub_char6);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char7, MBT_JOURNAL_R.$sub_char7);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char8, MBT_JOURNAL_R.$sub_char8);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char9, MBT_JOURNAL_R.$sub_char9);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char10, MBT_JOURNAL_R.$sub_char10);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num1, MBT_JOURNAL_R.$sub_num1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num2, MBT_JOURNAL_R.$sub_num2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num3, MBT_JOURNAL_R.$sub_num3);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt1, MBT_JOURNAL_R.$sub_dt1);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt2, MBT_JOURNAL_R.$sub_dt2);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt3, MBT_JOURNAL_R.$sub_dt3);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_usr_id, MBT_JOURNAL_R.$ins_usr_id);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_usr_nm, MBT_JOURNAL_R.$ins_usr_nm);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_ts, MBT_JOURNAL_R.$ins_ts);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_func_id, MBT_JOURNAL_R.$ins_func_id);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_cntr, MBT_JOURNAL_R.$upd_cntr);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_usr_id, MBT_JOURNAL_R.$upd_usr_id);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_usr_nm, MBT_JOURNAL_R.$upd_usr_nm);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_ts, MBT_JOURNAL_R.$upd_ts);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_func_id, MBT_JOURNAL_R.$upd_func_id);
			addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_srv_req_no, MBT_JOURNAL_R.$upd_srv_req_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_no(src.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no));
		}

	}

	//FMCB CUSTOM END
}