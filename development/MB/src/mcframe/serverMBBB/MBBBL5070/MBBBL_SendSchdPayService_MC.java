package mcframe.serverMBBB.MBBBL5070;

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
import mcframe.serverMBBB.MBBBL5070.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonMA.meta.MA_META;
import mcframe.serverCore.mcjdbc.MCCursor;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
//import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
//import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
//import static mcframe.serverCore.mcjdbc.MCTransactionManager.releaseDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendSchdPayService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendSchdPayService_MC extends MBBBL_SendSchdPayService_MC_A{
	//FMCB CUSTOM START

	// 処理ＮＯ取得用
	protected static final String PROC_NO_NUM = "PROC_NO_NUM";
	protected int _proc_no_length = MA_META.JNL_PROC_NO.length();

	// キャッシュ
	protected static final Class<MBBBL_SendSchdPayService> CLAZZ = MBBBL_SendSchdPayService.class;
	protected MCList<MAM_SCHD_PAY_R> _schdPayL;
	protected MCIndexKey _schdPayKey;
	protected MCList<MAM_AC_DPT_R> _acDptL;
	protected MCIndexKey _acDptKey;
	protected MCList<MAM_COL_MAP_R> _colMapL;
	protected MCIndexKey _colMapKey;

	// 桁数チェック用
	protected int _summary_length = MA_META.SUMMARY_CD.length();

	/**
	 * SendSchdPay_Chk01オペレーション.<p>
	 *
	 * 支払依頼送信前チェック<br>
	 */
	public class SendSchdPay_Chk01 extends MBBBL_SendSchdPayService_MC_A.SendSchdPay_Chk01 {
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
	 * SendSchdPay_Chk02オペレーション.<p>
	 *
	 * 支払依頼送信取消前チェック<br>
	 */
	public class SendSchdPay_Chk02 extends MBBBL_SendSchdPayService_MC_A.SendSchdPay_Chk02 {
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
	 * SendSchdPay_Upd01オペレーション.<p>
	 *
	 * 支払依頼を送信する。<br>
	 */
	public class SendSchdPay_Upd01 extends MBBBL_SendSchdPayService_MC_A.SendSchdPay_Upd01 {

		protected String _procNo = null;
		protected MCNumber _dataNo = null;
		protected MCList<MBT_AC_SCHD_PAY_R> _acSchdPayL = null;
		protected MCList<MBT_SCHD_PAY_SND_IF_R> _ifL = MCList.create(MBT_SCHD_PAY_SND_IF_R.class);

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
			MBBBL_SendSchdPayService.SendSchdPay_Chk01 o = MBBBL_SendSchdPayService.crtSendSchdPay_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			getProcNo();
			MCQueryApiBuilder bldr = lockAcSchdPayL();

			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			initColMapCache();
			MCCursor<MBT_AC_SCHD_PAY_R> cur = bldr.buildSelect("MBBBL5070_MBT_AC_SCHD_PAY_S01").openCursor(up0(), MBT_AC_SCHD_PAY_R.class);
			try {
				while (cur.dbFetch() > 0) {
					MCList<MBT_AC_SCHD_PAY_R> l = cur.getList();
					editSndIfL(l);

					if (hasErrMsg()) {
						continue;
					}

					updAcSchdPay(l);
					insSndIf();
				}
			}
			finally {
				cur.dbCloseCur();
			}

			if (hasErrMsg()) {
				dbTran().rollback();
				throwErr(msgOpeErr());
			}
			insSchdPayHis();

			if (!_ifL.isEmpty()) {
				callSendRecvIf(createSendRecvIfUpL());
			}
		}

		protected void getProcNo() {
			MBT_SCHD_PAY_HISTORY_R schdPayHis = MBT_SCHD_PAY_HISTORY_R.create();
			MBT_SCHD_PAY_HISTORY_R t = MBT_SCHD_PAY_HISTORY_R.create("T");
			MCQueryApiBuilder schdPayHis_bldr = MCQueryApiBuilder.create(t);
			schdPayHis_bldr.addMax(toNumber(t.proc_no), PROC_NO_NUM);
			dbSelect("MBBBL5070_MBT_SCHD_PAY_HISTORY_S01", schdPayHis, schdPayHis_bldr);
			MCNumber procNo = nvl(schdPayHis.getNumberNE(PROC_NO_NUM), MCNumber.ZERO);
			procNo = procNo.add(1);
			_procNo = lpad(procNo.toString(), _proc_no_length, "0");
		}

		protected MCQueryApiBuilder lockAcSchdPayL() {
			_acSchdPayL = MCList.create(MBT_AC_SCHD_PAY_R.class);
			MBT_AC_SCHD_PAY_R t = MBT_AC_SCHD_PAY_R.create("T");
			MCQueryApiBuilder acSchdPayL_bldr = MCQueryApiBuilder.create(t);
			MAM_BANK_AC_R ac = MAM_BANK_AC_R.create("AC");
			MAM_BP_R asppl = MAM_BP_R.create("ASPPL");
			MAM_BP_R psppl = MAM_BP_R.create("PSPPL");
			acSchdPayL_bldr.addSelect(ac.bank_ac_nm, asppl.bp_nm.as("asppl_nm"), psppl.bp_nm.as("psppl_nm"));
			acSchdPayL_bldr.setWhere(t.ac_ym.eq(bind("ym")));
			acSchdPayL_bldr.addWhereWithAnd(t.send_flg.eq(value(false)));
			if (!isNull(up0().wg_cd())) {
				acSchdPayL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
			acSchdPayL_bldr.addLeftOuterJoin(ac, ac.bank_ac_cd.eq(t.bank_ac_cd));
			acSchdPayL_bldr.addLeftOuterJoin(asppl, asppl.bp_cd.eq(t.asppl_cd));
			acSchdPayL_bldr.addLeftOuterJoin(psppl, psppl.bp_cd.eq(t.psppl_cd));
			acSchdPayL_bldr.setOrderByAsc(t.data_no);
			acSchdPayL_bldr.addLockTable(t.data_no);
			dbSelectForUpdateNoWaitNoFetch("MBBBL5070_MBT_AC_SCHD_PAY_S02", acSchdPayL_bldr, up0());

			return acSchdPayL_bldr;
		}

		protected void editSndIfL(MCList<MBT_AC_SCHD_PAY_R> l) {
			if (!hasErrMsg()) {
				doSeqCache(MAC_NUM_SYS_TYP.SCHD_PAY_SND_IF_DATA_LNO, l.size());
				_ifL = MCList.create(MBT_SCHD_PAY_SND_IF_R.class);
			}
			initSchdPayCache(l);
			initAcDptCache(l);

			for (MBT_AC_SCHD_PAY_R r : l) {
				MAM_SCHD_PAY_R payR = getSchdPayR(r.pay_ap_typ(), r.trd_cur_cd(), r.foreign_flg(), r.asppl_cd());
				if (isNull(payR)) {
					MCMessagePool.add(new MCMessage(payR, null, MBBBL0014, r.data_no(),
							r.pay_ap_typ(), r.trd_cur_cd(),
							getForeignTyp(r.foreign_flg()), r.asppl_cd()));
					continue;
				}
				String slipCntId = payR.slip_cnt_id();
				if (payR.dpt_id_flg()) {
					MAM_AC_DPT_R dptR = getAcDptR(r.bsppl_dpt_cd(), r.ac_dt());
					if (isNull(dptR) || isNull(dptR.slip_cnt_id())) {
						MCMessagePool
								.add(new MCMessage(payR, null, MBBBL0015, r.data_no(),
										r.bsppl_dpt_cd(), r.pay_ap_typ(), r.trd_cur_cd(),
										getForeignTyp(r.foreign_flg()), r.asppl_cd()));
						continue;
					}
					slipCntId = dptR.slip_cnt_id();
				}
				String sum0 = getSumColCd(payR.getBooleanNE("sum0_flg"), MAC_SUM_COL_TYP.SUM0.value(), r, payR.ac_cd(), 0);
				String sum1 = getSumColCd(payR.getBooleanNE("sum1_flg"), MAC_SUM_COL_TYP.SUM1.value(), r, payR.ac_cd(), 1);
				String sum2 = getSumColCd(payR.getBooleanNE("sum2_flg"), MAC_SUM_COL_TYP.SUM2.value(), r, payR.ac_cd(), 2);
				String sum3 = getSumColCd(payR.getBooleanNE("sum3_flg"), MAC_SUM_COL_TYP.SUM3.value(), r, payR.ac_cd(), 3);
				String sum4 = getSumColCd(payR.getBooleanNE("sum4_flg"), MAC_SUM_COL_TYP.SUM4.value(), r, payR.ac_cd(), 4);
				String sum5 = getSumColCd(payR.getBooleanNE("sum5_flg"), MAC_SUM_COL_TYP.SUM5.value(), r, payR.ac_cd(), 5);
				String proj = getSumColCd(payR.getBooleanNE("project_flg"), MAC_SUM_COL_TYP.PROJ.value(), r, payR.ac_cd(), 6);

				if (hasErrMsg()) {
					continue;
				}

				MBT_SCHD_PAY_SND_IF_R ifR = MBT_SCHD_PAY_SND_IF_R.create();

				ifR.setValuesByName(r);
				ifR.proc_no(_procNo);
				ifR.data_lno(getSequence(MAC_NUM_SYS_TYP.SCHD_PAY_SND_IF_DATA_LNO.value()));
				ifR.data_no(_dataNo);
				ifR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				ifR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				ifR.ext_sys_cd(up0().ext_sys_cd());
				ifR.ac_cd(payR.ac_cd());
				ifR.sub_ac_cd(payR.sub_ac_cd());
				ifR.slip_cnt_id(slipCntId);
				ifR.abstract1(getAbstract(payR.abstract1(), payR.abs_typ(), r));
				ifR.summary_cd0(sum0);
				ifR.summary_cd1(sum1);
				ifR.summary_cd2(sum2);
				ifR.summary_cd3(sum3);
				ifR.summary_cd4(sum4);
				ifR.summary_cd5(sum5);
				ifR.project_cd(proj);
				if (!useFgnCur(payR, ifR)) {
					ifR.trd_cur_cd(ifR.base_cur_cd());
					ifR.trd_cur_amt(0);
					ifR.xrate_cd(null);
					ifR.xrate(null);
				}
				_ifL.add(ifR);

				r.send_flg(true);
				r.proc_no(_procNo);
			}
		}

		protected String getAbstract(String abs, String absTyp, MBT_AC_SCHD_PAY_R r) {
			if (MAC_ABS_TYP.isMST(absTyp)) {
				return abs;
			}
			else if (MAC_ABS_TYP.isINV(absTyp)) {
				return nvl(abs,"") + nvl(r.iv_no(),"");
			}
			else if (MAC_ABS_TYP.isAC(absTyp)) {
				return nvl(abs,"") + nvl(r.getStringNE("bank_ac_nm"),"");
			}
			else if (MAC_ABS_TYP.isTRANS(absTyp)) {
				return nvl(abs,"") + nvl(r.drawer_nm(),"");
			}
			else if (MAC_ABS_TYP.isTRD_RMRKS(absTyp)) {
				return nvl(abs,"") + nvl(r.trd_rmrks(),"");
			}
			else if (MAC_ABS_TYP.isTRD_D_RMRKS(absTyp)) {
				return nvl(abs,"") + nvl(r.trd_d_rmrks(),"");
			}
			else if (MAC_ABS_TYP.isAPAR(absTyp)) {
				return nvl(abs,"") + nvl(r.getStringNE("asppl_nm"),"");
			}
			else if (MAC_ABS_TYP.isCRE(absTyp)) {
				return nvl(abs,"") + nvl(r.getStringNE("psppl_nm"),"");
			}
			else if (MAC_ABS_TYP.isWRK(absTyp)) {
				return nvl(abs,"") + nvl(r.wrk_no(),"");
			}
			else if (MAC_ABS_TYP.isSUB1(absTyp)) {
				return nvl(abs,"") + nvl(r.sub_char1(),"");
			}
			else if (MAC_ABS_TYP.isSUB2(absTyp)) {
				return nvl(abs,"") + nvl(r.sub_char2(),"");
			}
			else if (MAC_ABS_TYP.isSUB3(absTyp)) {
				return nvl(abs,"") + nvl(r.sub_char3(),"");
			}
			else if (MAC_ABS_TYP.isSUB4(absTyp)) {
				return nvl(abs,"") + nvl(r.sub_char4(),"");
			}
			else if (MAC_ABS_TYP.isSUB5(absTyp)) {
				return nvl(abs,"") + nvl(r.sub_char5(),"");
			}
			return abs;
		}

		protected String getSumColCd(boolean mustFlg, String sumColTyp, MBT_AC_SCHD_PAY_R r, String acCd, int no) {
			String ret = null;
			if (!mustFlg) {
				return ret;
			}

			MAM_COL_MAP_R sumColR = getSumColR(sumColTyp);
			if (sumColR != null) {
				if (MAC_SET_COL_TYP.isUSR(sumColR.set_col_typ())) {
					ret = r.usr_cd();
				}
				else if (MAC_SET_COL_TYP.isAP(sumColR.set_col_typ())) {
					ret = r.asppl_cd();
				}
				else if (MAC_SET_COL_TYP.isSUB1(sumColR.set_col_typ())) {
					ret = r.sub_char1();
				}
				else if (MAC_SET_COL_TYP.isSUB2(sumColR.set_col_typ())) {
					ret = r.sub_char2();
				}
				else if (MAC_SET_COL_TYP.isSUB3(sumColR.set_col_typ())) {
					ret = r.sub_char3();
				}
				else if (MAC_SET_COL_TYP.isSUB4(sumColR.set_col_typ())) {
					ret = r.sub_char4();
				}
				else if (MAC_SET_COL_TYP.isSUB5(sumColR.set_col_typ())) {
					ret = r.sub_char5();
				}
				else if (MAC_SET_COL_TYP.isSUB6(sumColR.set_col_typ())) {
					ret = r.sub_char6();
				}
				else if (MAC_SET_COL_TYP.isSUB7(sumColR.set_col_typ())) {
					ret = r.sub_char7();
				}
				else if (MAC_SET_COL_TYP.isSUB8(sumColR.set_col_typ())) {
					ret = r.sub_char8();
				}
				else if (MAC_SET_COL_TYP.isSUB9(sumColR.set_col_typ())) {
					ret = r.sub_char9();
				}
				else if (MAC_SET_COL_TYP.isSUB10(sumColR.set_col_typ())) {
					ret = r.sub_char10();
				}

				if (isNull(ret)) {
					ret = sumColR.default_cd();
				}
			}
			if (isNull(ret)) {
				if (no == 6) {
					MCMessagePool.add(new MCMessage(sumColR, null, MBBBL0017,  _dataNo, acCd));
				}
				else {
					MCMessagePool.add(new MCMessage(sumColR, null, MBBBL0016, no, _dataNo, acCd));
				}
			}
			else {
				if (ret.length() > _summary_length) {
					MCMessagePool.add(new MCMessage(sumColR, null, MBBBL0018, sumColR.set_col_typ(), sumColTyp, _dataNo));
					ret = null;
				}
			}
			return ret;
		}

		protected boolean useFgnCur(MAM_SCHD_PAY_R payR, MBT_SCHD_PAY_SND_IF_R ifR) {
			return payR.getBooleanNE("foreign_flg") && !isSame(ifR.base_cur_cd(), ifR.trd_cur_cd());
		}

		protected void insSndIf() {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_SCHD_PAY_SND_IF_R.create("T"));
			dbInsertEx("MBBBL5070_MBT_SCHD_PAY_SND_IF_I01", _ifL, dbc_bldr);
		}

		protected void insSchdPayHis() {
			MBT_SCHD_PAY_HISTORY_R dbc = MBT_SCHD_PAY_HISTORY_R.create();
			dbc.proc_no(_procNo);
			dbc.ac_ym(up0().ym());
			dbc.wg_cd(up0().wg_cd());
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_SCHD_PAY_HISTORY_R.create("T"));
			dbInsertEx("MBBBL5070_MBT_SCHD_PAY_HISTORY_I01", dbc, dbc_bldr);
		}

		protected void updAcSchdPay(MCList<MBT_AC_SCHD_PAY_R> l) {
			MBT_AC_SCHD_PAY_R t = MBT_AC_SCHD_PAY_R.create("T");
			MCQueryApiBuilder acSchdPayL_bldr = MCQueryApiBuilder.create(t);
			acSchdPayL_bldr.setSet(t.send_flg, t.proc_no);
			dbUpdateKey("MBBBL5070_MBT_AC_SCHD_PAY_U01", l, acSchdPayL_bldr);
		}

		/**
		 * 送受信ＩＦ制御の新規追加オペレーションに渡す上り電文を返す。
		 */
		protected MCList<MCRow> createSendRecvIfUpL() {
			MCList<MCRow> l = MCList.create(MCRow.class);
			MCRow r = createSendRecvIfUpR(_dataNo, up0().ext_sys_cd(), MAC_IF_PROC_TYP.AC_SCHD_PAY_SEND.value());
			l.add(r);
			return l;
		}
	}
	/**
	 * SendSchdPay_Del01オペレーション.<p>
	 *
	 * 支払依頼の送信を取り消す。<br>
	 */
	public class SendSchdPay_Del01 extends MBBBL_SendSchdPayService_MC_A.SendSchdPay_Del01 {

		protected MCList<MBT_SCHD_PAY_HISTORY_R> _schdPayHisL = null;
		protected MCList<MBT_SCHD_PAY_SND_IF_R> _ifL = null;
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
			MBBBL_SendSchdPayService.SendSchdPay_Chk02 o = MBBBL_SendSchdPayService.crtSendSchdPay_Chk02();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			lockSchdPayHis();
			for (MBT_SCHD_PAY_HISTORY_R r : _schdPayHisL) {
				_procNo = r.proc_no();
				lockSndIf();

				if (!chkSndIf()) {
					continue;
				}

				delSndIf();
				updAcSchdPay();
				delSchdPayHis(r);
				delPftSdrvIf(_ifL);
			}
		}

		protected void lockSchdPayHis() {
			_schdPayHisL = MCList.create(MBT_SCHD_PAY_HISTORY_R.class);
			MBT_SCHD_PAY_HISTORY_R t = MBT_SCHD_PAY_HISTORY_R.create("T");
			MCQueryApiBuilder schdPayHisL_bldr = MCQueryApiBuilder.create(t);
			schdPayHisL_bldr.setWhere(t.ac_ym.eq(bind("1")), up0().ym());
			if (isNull(up0().wg_cd())) {
				schdPayHisL_bldr.addWhereWithAnd(t.wg_cd.isNull());
			}
			else {
				schdPayHisL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), up0().wg_cd());
			}
			schdPayHisL_bldr.setOrderByAsc(schdPayHisL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MBBBL5070_MBT_SCHD_PAY_HISTORY_S02", _schdPayHisL, schdPayHisL_bldr);
		}

		protected void lockSndIf() {
			_ifL = MCList.create(MBT_SCHD_PAY_SND_IF_R.class);
			MBT_SCHD_PAY_SND_IF_R t = MBT_SCHD_PAY_SND_IF_R.create("T");
			MCQueryApiBuilder ifL_bldr = MCQueryApiBuilder.create(t);
			ifL_bldr.setWhere(t.proc_no.eq(bind("1")), _procNo);
			ifL_bldr.setOrderByAsc(ifL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MBBBL5070_MBT_SCHD_PAY_SND_IF_S01", ifL_bldr);
		}

		protected boolean chkSndIf() {
			MBT_SCHD_PAY_SND_IF_R t = MBT_SCHD_PAY_SND_IF_R.create("T");
			return execDbCount("MBBBL5070_MBT_SCHD_PAY_SND_IF_S02", t,
					t.proc_no.eq(bind("1")).and(t.exe_sts_typ.neq(bind("2"))), _procNo,
					MAC_EXE_STS_TYP.NOT_EXE.value()) == 0;
		}

		protected void delSndIf() {
			MBT_SCHD_PAY_SND_IF_R t = MBT_SCHD_PAY_SND_IF_R.create("T");
			MCQueryApiBuilder ifL_bldr = MCQueryApiBuilder.create(t);
			ifL_bldr.setDistinct();
			ifL_bldr.setSelect(t.data_no);
			ifL_bldr.setWhere(t.proc_no.eq(bind("1")), _procNo);
			dbSelect("MBBBL5070_MBT_SCHD_PAY_SND_IF_S03", _ifL, ifL_bldr);
			execDbDelete("MBBBL5070_MBT_SCHD_PAY_SND_IF_D01", t, t.proc_no.eq(bind("1")), _procNo);
		}

		protected void updAcSchdPay() {
			MBT_AC_SCHD_PAY_R dbc = MBT_AC_SCHD_PAY_R.create();
			MBT_AC_SCHD_PAY_R t = MBT_AC_SCHD_PAY_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSet(t.send_flg, t.proc_no);
			dbc.send_flg(false);
			dbc.proc_no(null);
			dbc_bldr.setWhere(t.proc_no.eq(bind("1")), _procNo);
			dbUpdate("MBBBL5070_MBT_AC_SCHD_PAY_U02", dbc, dbc_bldr);
		}

		protected void delSchdPayHis(MBT_SCHD_PAY_HISTORY_R dbc) {
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_SCHD_PAY_HISTORY_R.create("T"));
			dbDeleteKey("MBBBL5070_MBT_SCHD_PAY_HISTORY_D01", dbc, dbc_bldr);
		}
	}

	///////////////////////////////////////////////////////////////////
	// キャッシュ

	/**
	 * 支払依頼科目マスタキャッシュ（＋勘定科目マスタ）
	 */
	protected void initSchdPayCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insSchdPayWk(l);

		// 検索
		MCList<MAM_SCHD_PAY_R> dbc = MCList.create(MAM_SCHD_PAY_R.class);
		MAM_SCHD_PAY_R t = MAM_SCHD_PAY_R.create("T");
		MAM_ACCOUNT_R t2 = MAM_ACCOUNT_R.create("T2");
		MAW_SCHD_PAY_KEY_R w = MAW_SCHD_PAY_KEY_R.create("W");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.pay_ap_typ, t.cur_cd, t.foreign_typ, t.asppl_cd, t.prio,
				t.seq, t.ac_cd, t.sub_ac_cd, t.abs_typ, t.abstract1, t.dpt_id_flg,
				t.slip_cnt_id);
		dbc_bldr.addSelect(t2.sum0_flg, t2.sum1_flg, t2.sum2_flg, t2.sum3_flg,
				t2.sum4_flg, t2.sum5_flg, t2.project_flg, t2.foreign_flg);
		dbc.addBooleanColumn("sum0_flg");
		dbc.addBooleanColumn("sum1_flg");
		dbc.addBooleanColumn("sum2_flg");
		dbc.addBooleanColumn("sum3_flg");
		dbc.addBooleanColumn("sum4_flg");
		dbc.addBooleanColumn("sum5_flg");
		dbc.addBooleanColumn("project_flg");
		dbc.addBooleanColumn("foreign_flg");
		dbc_bldr.addInnerJoin(w, w.pay_ap_typ.eq(t.pay_ap_typ));
		dbc_bldr.addInnerJoin(t2, t2.ac_cd.eq(t.ac_cd)
				.and(t2.del_flg.eq(value(false))));
		dbSelect("MBBBL5070_MAM_SCHD_PAY_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._schdPayL = dbc;
		object(CLAZZ)._schdPayKey = object(CLAZZ)._schdPayL.createIndex(MAM_SCHD_PAY_R.$pay_ap_typ);
	}

	protected void insSchdPayWk(MCList<? extends MCRow> l) {
		MCList<MAM_SCHD_PAY_R> dbc = MCList.create(MAM_SCHD_PAY_R.class);
		for (MCRow r : l) {
			MAM_SCHD_PAY_R row = dbc.createRow();
			row.pay_ap_typ(r.getString(MAM_SCHD_PAY_R.$pay_ap_typ));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_SCHD_PAY_R.$pay_ap_typ);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_SCHD_PAY_R.create("T"));
		dbWkDelete("MBBBL5070_MAW_SCHD_PAY_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MBBBL5070_MAW_SCHD_PAY_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_SCHD_PAY_R getSchdPayR(String payApTyp, String curCd, boolean foreignFlg, String aspplCd) {
		String foreignTyp = getForeignTyp(foreignFlg);

		MCList<MAM_SCHD_PAY_R> l = object(CLAZZ)._schdPayL.subList(object(CLAZZ)._schdPayKey, payApTyp);
		l.sort(MAM_SCHD_PAY_R.$prio, MAM_SCHD_PAY_R.$seq);
		for (MAM_SCHD_PAY_R r : l) {
			if (isSame(nvl(r.cur_cd(), curCd), curCd)
					&& isSame(nvl(r.foreign_typ(), foreignTyp), foreignTyp)
					&& isSame(nvl(r.asppl_cd(), aspplCd), aspplCd)) {
				return r;
			}
		}
		return null;
	}

	protected String getForeignTyp(boolean foreignFlg) {
		return foreignFlg ? MAC_FOREIGN_TYP.ABROAD.value() : MAC_FOREIGN_TYP.INTERNAL.value();
	}

	/**
	 * 会計部門マスタキャッシュ
	 */
	protected void initAcDptCache(MCList<? extends MCRow> l) {
		// ワーク作成
		insAcDptWk(l);

		// 検索
		MCList<MAM_AC_DPT_R> dbc = MCList.create(MAM_AC_DPT_R.class);
		MAM_AC_DPT_R t = MAM_AC_DPT_R.create("T");
		MAW_AC_DPT_KEY_R w = MAW_AC_DPT_KEY_R.create("W");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setDistinct();
		dbc_bldr.setSelect(t.ac_dpt_cd, t.st_dt, t.end_dt, t.slip_cnt_id);
		dbc_bldr.addInnerJoin(w, w.ac_dpt_cd.eq(t.ac_dpt_cd)
				.and(w.st_dt.between(t.st_dt, t.end_dt)));
		dbSelect("MBBBL5070_MAM_AC_DPT_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._acDptL = dbc;
		object(CLAZZ)._acDptKey = object(CLAZZ)._acDptL.createIndex(MAM_AC_DPT_R.$ac_dpt_cd);
	}

	protected void insAcDptWk(MCList<? extends MCRow> l) {
		MCList<MAM_AC_DPT_R> dbc = MCList.create(MAM_AC_DPT_R.class);
		for (MCRow r : l) {
			MAM_AC_DPT_R row = dbc.createRow();
			row.ac_dpt_cd(r.getString("bsppl_dpt_cd"));
			row.st_dt(r.getDate("ac_dt"));
			dbc.add(row);
		}
		dbc = dbc.groupBy(MAM_AC_DPT_R.$ac_dpt_cd, MAM_AC_DPT_R.$st_dt);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_AC_DPT_R.create("T"));
		dbWkDelete("MBBBL5070_MAW_AC_DPT_D01", dbc_bldr.getBaseDbc());
		dbWkInsert("MBBBL5070_MAW_AC_DPT_I01", dbc, dbc_bldr.getBaseDbc());
	}

	protected MAM_AC_DPT_R getAcDptR(String acDptCd, MCDate acDt) {
		for (MAM_AC_DPT_R r : object(CLAZZ)._acDptL.subList(object(CLAZZ)._acDptKey, acDptCd)) {
			if (r.st_dt().lteDate(acDt) && r.end_dt().gteDate(acDt)) {
				return r;
			}
		}
		return null;
	}

	/**
	 * 集計項目対応マスタキャッシュ
	 */
	protected void initColMapCache() {
		// 検索
		MCList<MAM_COL_MAP_R> dbc = MCList.create(MAM_COL_MAP_R.class);
		MAM_COL_MAP_R t = MAM_COL_MAP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.sum_col_typ, t.set_col_typ, t.default_cd);
		dbSelect("MBBBL5070_MAM_COL_MAP_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._colMapL = dbc;
		object(CLAZZ)._colMapKey = object(CLAZZ)._colMapL.createIndex(MAM_COL_MAP_R.$sum_col_typ);
	}

	protected MAM_COL_MAP_R getSumColR(String sumColTyp) {
		MAM_COL_MAP_R r = object(CLAZZ)._colMapL.getFirst(object(CLAZZ)._colMapKey, sumColTyp);
		if (isNull(r) || isNull(r.sum_col_typ())) {
			return null;
		}
		return r;
	}

	//FMCB CUSTOM END
}