package mcframe.serverMBBB.MBBBL5050;

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
import mcframe.serverMBBB.MBBBL5050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonMA.meta.MA_META;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendNoteService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendNoteService_MC extends MBBBL_SendNoteService_MC_A{
	//FMCB CUSTOM START

	// 処理ＮＯ取得用
	protected static final String PROC_NO_NUM = "PROC_NO_NUM";
	protected int _proc_no_length = MA_META.JNL_PROC_NO.length();

	// キャッシュ
	protected static final Class<MBBBL_SendNoteService> CLAZZ = MBBBL_SendNoteService.class;
	protected MCList<MAM_NOTE_RSN_R> _noteRsnL;
	protected MCIndexKey _noteRsnKey;
	protected MCList<MAM_AC_DPT_R> _acDptL;
	protected MCIndexKey _acDptKey;

	/**
	 * SendNote_Chk01オペレーション.<p>
	 *
	 * 手形情報送信前チェック<br>
	 */
	public class SendNote_Chk01 extends MBBBL_SendNoteService_MC_A.SendNote_Chk01 {

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
	 * SendNote_Chk02オペレーション.<p>
	 *
	 * 手形情報送信取消前チェック<br>
	 */
	public class SendNote_Chk02 extends MBBBL_SendNoteService_MC_A.SendNote_Chk02 {

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
	 * SendNote_Upd01オペレーション.<p>
	 *
	 * 手形情報を送信する。<br>
	 */
	public class SendNote_Upd01 extends MBBBL_SendNoteService_MC_A.SendNote_Upd01 {

		protected String _procNo = null;
		protected MCNumber _dataNo = null;
		protected MCList<MBT_AC_NOTE_R> _acNoteL = null;
		protected MCList<MBT_NOTE_SND_IF_R> _ifL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
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

		protected void execMain(){
			callThisChk01();
			throwUpdErr();
			main();
		}

		protected void callThisChk01() {
			MBBBL_SendNoteService.SendNote_Chk01 o = MBBBL_SendNoteService.crtSendNote_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			getProcNo();
			getAcNoteL();
			if (_acNoteL.isEmpty()) {
				return ;
			}
			editSndIfL();
			throwErr(msgOpeErr());
			insSndIf();
			insNoteHis();
			updAcNote();

			if (!_ifL.isEmpty()) {
				callSendRecvIf(createSendRecvIfUpL());
			}
		}

		protected void getProcNo() {
			MCNumber procNo;
			MBT_NOTE_HISTORY_R noteHis = MBT_NOTE_HISTORY_R.create();
			MBT_NOTE_HISTORY_R t = MBT_NOTE_HISTORY_R.create("T");
			MCQueryApiBuilder noteHis_bldr = MCQueryApiBuilder.create(t);
			noteHis_bldr.addMax(toNumber(t.proc_no), PROC_NO_NUM);
			dbSelect("MBBBL5050_MBT_NOTE_HISTORY_S01", noteHis, noteHis_bldr);
			procNo = nvl(noteHis.getNumberNE(PROC_NO_NUM), MCNumber.ZERO);
			procNo = procNo.add(1);
			_procNo = lpad(procNo.toString(), _proc_no_length, "0");
		}


		protected void getAcNoteL() {
			_acNoteL = MCList.create(MBT_AC_NOTE_R.class);
			MBT_AC_NOTE_R t = MBT_AC_NOTE_R.create("T");
			MCQueryApiBuilder acNoteL_bldr = MCQueryApiBuilder.create(t);
			acNoteL_bldr.removeSelect(MBT_AC_NOTE_R.$note_rsn_cd);
			acNoteL_bldr.addSelect(nvl(t.note_rsn_cd, value(up0().note_rsn_cd())).as("note_rsn_cd"));
			acNoteL_bldr.setWhere(t.ac_ym.eq(bind("1")), up0().ym());
			acNoteL_bldr.addWhereWithAnd(t.fin_flg.eq(value(false)));
			acNoteL_bldr.setOrderByAsc(t.data_no);
			dbSelectForUpdateNoWait("MBBBL5050_MBT_AC_NOTE_S01", _acNoteL, acNoteL_bldr);
		}

		protected void editSndIfL() {
			_ifL = MCList.create(MBT_NOTE_SND_IF_R.class);

			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			doSeqCache(MAC_NUM_SYS_TYP.NOTE_SND_IF_DATA_LNO, _acNoteL.size());
			initNoteRsnCache(_acNoteL);
			initAcDptCache(_acNoteL);

			for (MBT_AC_NOTE_R r : _acNoteL) {
				MAM_NOTE_RSN_R rsnR = getNoteRsnR(r.note_rsn_cd());
				if (isNull(rsnR)) {
					MCMessagePool.add(new MCMessage(rsnR, null, MBBBL0009, r.data_no(), r.note_rsn_cd()));
					continue ;
				}
				MAM_AC_DPT_R dptR = null;
				if (rsnR.dpt_id_flg()){
					dptR = getAcDptR(r.dpt_cd(), r.ac_dt());
					if (isNull(dptR) || isNull(dptR.slip_cnt_id())) {
						MCMessagePool.add(new MCMessage(rsnR, null, MBBBL0010, r.data_no(), r.dpt_cd(), r.note_rsn_cd()));
						continue ;
					}
				}

				MBT_NOTE_SND_IF_R ifR = MBT_NOTE_SND_IF_R.create();

				ifR.setValuesByName(r);
				ifR.proc_no(_procNo);
				ifR.data_lno(getSequence(MAC_NUM_SYS_TYP.NOTE_SND_IF_DATA_LNO.value()));
				ifR.data_no(_dataNo);
				ifR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				ifR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				ifR.ext_sys_cd(up0().ext_sys_cd());
				ifR.ac_cd(rsnR.ac_cd());
				ifR.sub_ac_cd(rsnR.sub_ac_cd());
				if (rsnR.dpt_id_flg()){
					ifR.slip_cnt_id(dptR.slip_cnt_id());
				}
				else {
					ifR.slip_cnt_id(rsnR.slip_cnt_id());
				}
				ifR.abstract1(getAbstract(rsnR.abstract2(), rsnR.abs_b_typ(), r));

				r.slip_cnt_id(ifR.slip_cnt_id());
				r.fin_flg(true);
				r.proc_no(_procNo);

				_ifL.add(ifR);
			}
		}

		protected String getAbstract(String abs, String absBTyp, MBT_AC_NOTE_R r) {
			if (MAC_ABS_B_TYP.isMST(absBTyp)) {
				return abs;
			}
			else if (MAC_ABS_B_TYP.isSUB1(absBTyp)) {
				return nvl(abs,"") + nvl(r.sub_char1(),"");
			}
			else if (MAC_ABS_B_TYP.isSUB2(absBTyp)) {
				return nvl(abs,"") + nvl(r.sub_char2(),"");
			}
			else if (MAC_ABS_B_TYP.isSUB3(absBTyp)) {
				return nvl(abs,"") + nvl(r.sub_char3(),"");
			}
			else if (MAC_ABS_B_TYP.isSUB4(absBTyp)) {
				return nvl(abs,"") + nvl(r.sub_char4(),"");
			}
			else if (MAC_ABS_B_TYP.isSUB5(absBTyp)) {
				return nvl(abs,"") + nvl(r.sub_char5(),"");
			}
			return abs;
		}

		protected void insSndIf() {
			MCQueryApiBuilder ifL_bldr = MCQueryApiBuilder.create(MBT_NOTE_SND_IF_R.create("T"));
			dbInsertEx("MBBBL5050_MBT_NOTE_SND_IF_I01", _ifL, ifL_bldr);
		}

		protected void insNoteHis() {
			MBT_NOTE_HISTORY_R dbc = MBT_NOTE_HISTORY_R.create();
			dbc.proc_no(_procNo);
			dbc.ac_ym(up0().ym());
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_NOTE_HISTORY_R.create("T"));
			dbInsertEx("MBBBL5050_MBT_NOTE_HISTORY_I01", dbc, dbc_bldr);
		}

		protected void updAcNote() {
			MBT_AC_NOTE_R t = MBT_AC_NOTE_R.create("T");
			MCQueryApiBuilder acNoteL_bldr = MCQueryApiBuilder.create(t);
			acNoteL_bldr.setSet(t.fin_flg, t.proc_no, t.slip_cnt_id);
			dbUpdateKey("MBBBL5050_MBT_AC_NOTE_U01", _acNoteL, acNoteL_bldr);
		}

		/**
		 * 送受信ＩＦ制御の新規追加オペレーションに渡す上り電文を返す。
		 */
		protected MCList<MCRow> createSendRecvIfUpL() {
			MCList<MCRow> l = MCList.create(MCRow.class);
			MCRow r = createSendRecvIfUpR(_dataNo, up0().ext_sys_cd(), MAC_IF_PROC_TYP.AC_NOTE_SEND.value());
			l.add(r);
			return l;
		}

	}

	/**
	 * SendNote_Del01オペレーション.<p>
	 *
	 * 手形情報の送信を取り消す。<br>
	 */
	public class SendNote_Del01 extends MBBBL_SendNoteService_MC_A.SendNote_Del01 {

		protected MCList<MBT_NOTE_HISTORY_R> _noteHisL = null;
		protected MCList<MBT_NOTE_SND_IF_R> _ifL = null;
		protected MBT_NOTE_SND_IF_R _ifL_t = null;
		protected MCQueryApiBuilder _ifL_bldr = null;
		protected String _procNo = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
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

		protected void execMain(){
			callThisChk02();
			throwUpdErr();
			main();
		}

		protected void callThisChk02() {
			MBBBL_SendNoteService.SendNote_Chk02 o = MBBBL_SendNoteService.crtSendNote_Chk02();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			lockNoteHis();
			for (MBT_NOTE_HISTORY_R r : _noteHisL) {
				lockSndIf(r.proc_no());

				if (!chkSndIf()) {
					continue;
				}

				delSndIf(r.proc_no());
				updAcNote(r.proc_no());
				delNoteHis(r);
				delPftSdrvIf(_ifL);
			}
		}

		protected void lockNoteHis() {
			_noteHisL = MCList.create(MBT_NOTE_HISTORY_R.class);
			MBT_NOTE_HISTORY_R t = MBT_NOTE_HISTORY_R.create("T");
			MCQueryApiBuilder noteHisL_bldr = MCQueryApiBuilder.create(t);
			noteHisL_bldr.setWhere(t.ac_ym.eq(bind("1")), up0().ym());
			noteHisL_bldr.setOrderByAsc(t.getKeyColumn$());
			dbSelectForUpdateNoWait("MBBBL5050_MBT_NOTE_HISTORY_S03", _noteHisL, noteHisL_bldr);
		}

		protected void lockSndIf(String procNo) {
			_ifL = MCList.create(MBT_NOTE_SND_IF_R.class);
			_ifL_t = MBT_NOTE_SND_IF_R.create("T");
			_ifL_bldr = MCQueryApiBuilder.create(_ifL_t);
			_ifL_bldr.setWhere(_ifL_t.proc_no.eq(bind("1")), procNo);
			_ifL_bldr.setOrderByAsc(_ifL_t.getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MBBBL5050_MBT_NOTE_SND_IF_S01", _ifL_bldr);
			_procNo = procNo;
		}

		protected boolean chkSndIf() {
			MBT_NOTE_SND_IF_R t = MBT_NOTE_SND_IF_R.create("T");
			if (execDbCount("MBBBL5050_MBT_NOTE_SND_IF_S02", t,
					t.proc_no.eq(bind("1")).and(t.exe_sts_typ.neq(bind("2"))), _procNo,
					MAC_EXE_STS_TYP.NOT_EXE.value()) > 0) {
				return false;
			}
			return true;
		}

		protected void delSndIf(String procNo) {
			_ifL_bldr = MCQueryApiBuilder.create(_ifL_t);
			_ifL_bldr.setWhere(_ifL_t.proc_no.eq(bind("1")), procNo);
			_ifL_bldr.setDistinct();
			_ifL_bldr.setSelect(_ifL_t.data_no);
			dbSelect("MBBBL5050_MBT_NOTE_SND_IF_S03", _ifL, _ifL_bldr);
			execDbDelete("MBBBL5050_MBT_NOTE_SND_IF_D01", _ifL_t, _ifL_t.proc_no.eq(bind("1")), _procNo);
		}

		protected void updAcNote(String procNo) {
			MBT_AC_NOTE_R dbc = MBT_AC_NOTE_R.create();
			dbc.fin_flg(false);
			dbc.proc_no(null);
			dbc.slip_cnt_id(null);
			MBT_AC_NOTE_R t = MBT_AC_NOTE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSet(t.fin_flg, t.proc_no, t.slip_cnt_id);
			dbc_bldr.setWhere(t.proc_no.eq(bind("1")), procNo);
			dbUpdate("MBBBL5050_MBT_AC_NOTE_U02", dbc, dbc_bldr);
		}

		protected void delNoteHis(MBT_NOTE_HISTORY_R dbc) {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_NOTE_HISTORY_R.create("T"));
			dbDeleteKey("MBBBL5050_MBT_NOTE_HISTORY_D01", dbc, dbc_bldr);
		}

	}

	///////////////////////////////////////////////////////////////////
	// キャッシュ

	protected void initNoteRsnCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insNoteRsnWk(l);

		// 検索
		MCList<MAM_NOTE_RSN_R> dbc = MCList.create(MAM_NOTE_RSN_R.class);
		MAM_NOTE_RSN_R t = MAM_NOTE_RSN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_NOTE_RSN_KEY_R w = MAW_NOTE_RSN_KEY_R.create("W");
		dbc_bldr.setSelect(t.note_rsn_cd, t.ac_cd, t.sub_ac_cd, t.dpt_id_flg, t.slip_cnt_id, t.abs_b_typ, t.abstract2);
		dbc_bldr.addInnerJoin(w, w.note_rsn_cd.eq(t.note_rsn_cd));
		dbSelect("MBBBL5050_MAM_NOTE_RSN_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._noteRsnL = dbc;
		object(CLAZZ)._noteRsnKey = object(CLAZZ)._noteRsnL.createIndex(MAM_NOTE_RSN_R.$note_rsn_cd);
	}

	protected void insNoteRsnWk(MCList<? extends MCRow> l) {
		MCList<MAM_NOTE_RSN_R> dbc = MCList.create(MAM_NOTE_RSN_R.class);
		for (MCRow r : l) {
			MAM_NOTE_RSN_R row = dbc.createRow();
			row.note_rsn_cd(r.getString(MAM_NOTE_RSN_R.$note_rsn_cd));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_NOTE_RSN_R.$note_rsn_cd);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_NOTE_RSN_R.create("T"));
		dbWkDelete("MBBBL5050_MAW_NOTE_RSN_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MBBBL5050_MAW_NOTE_RSN_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_NOTE_RSN_R getNoteRsnR(String noteRsnCd) {
		MAM_NOTE_RSN_R r = object(CLAZZ)._noteRsnL.getFirst(object(CLAZZ)._noteRsnKey, noteRsnCd);
		if (isNull(r) || isNull(r.note_rsn_cd())) {
			return null;
		}
		return r;
	}


	protected void initAcDptCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insAcDptWk(l);

		// 検索
		MCList<MAM_AC_DPT_R> dbc = MCList.create(MAM_AC_DPT_R.class);
		MAM_AC_DPT_R t = MAM_AC_DPT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_AC_DPT_KEY_R w = MAW_AC_DPT_KEY_R.create("W");
		dbc_bldr.setDistinct();
		dbc_bldr.setSelect(t.ac_dpt_cd, t.st_dt, t.end_dt, t.slip_cnt_id);
		dbc_bldr.addInnerJoin(w, w.ac_dpt_cd.eq(t.ac_dpt_cd)
				.and(w.st_dt.between(t.st_dt, t.end_dt)));
		dbSelect("MBBBL5050_MAM_AC_DPT_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._acDptL = dbc;
		object(CLAZZ)._acDptKey = object(CLAZZ)._acDptL.createIndex(MAM_AC_DPT_R.$ac_dpt_cd);
	}

	protected void insAcDptWk(MCList<? extends MCRow> l) {
		MCList<MAM_AC_DPT_R> dbc = MCList.create(MAM_AC_DPT_R.class);
		for (MCRow r : l) {
			MAM_AC_DPT_R row = dbc.createRow();
			row.ac_dpt_cd(r.getString("dpt_cd"));
			row.st_dt(r.getDate("ac_dt"));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_AC_DPT_R.$ac_dpt_cd, MAM_AC_DPT_R.$st_dt);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_AC_DPT_R.create("T"));
		dbWkDelete("MBBBL5050_MAW_AC_DPT_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MBBBL5050_MAW_AC_DPT_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_AC_DPT_R getAcDptR(String acDptCd, MCDate acDt) {
		for (MAM_AC_DPT_R r : object(CLAZZ)._acDptL.subList(object(CLAZZ)._acDptKey, acDptCd)) {
			if (r.st_dt().lteDate(acDt) && r.end_dt().gteDate(acDt)) {
				return r;
			}
		}
		return null;
	}

	//FMCB CUSTOM END
}