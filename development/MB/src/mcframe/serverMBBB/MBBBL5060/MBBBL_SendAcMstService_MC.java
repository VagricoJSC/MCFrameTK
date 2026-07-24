package mcframe.serverMBBB.MBBBL5060;

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
import mcframe.serverMBBB.MBBBL5060.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMBBB.MBBBL5060.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendAcMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendAcMstService_MC extends MBBBL_SendAcMstService_MC_A{
	//FMCB CUSTOM START

	protected static final String DATA_LNO = "data_lno";

	/**
	 * SendAcMst_Chk01オペレーション.<p>
	 *
	 * 会計マスタ情報送信前チェック<br>
	 */
	public class SendAcMst_Chk01 extends MBBBL_SendAcMstService_MC_A.SendAcMst_Chk01 {

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
	 * SendAcMst_Chk02オペレーション.<p>
	 *
	 * 会計マスタ情報送信取消前チェック<br>
	 */
	public class SendAcMst_Chk02 extends MBBBL_SendAcMstService_MC_A.SendAcMst_Chk02 {

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
	 * SendAcMst_Upd01オペレーション.<p>
	 *
	 * 会計マスタ情報を送信する。<br>
	 */
	public class SendAcMst_Upd01 extends MBBBL_SendAcMstService_MC_A.SendAcMst_Upd01 {

		protected MCList<MAM_BP_R> _bpL = null;
		protected MCList<MBT_BP_SND_IF_R> _bpSndIfL = null;
		protected MCList<MBT_BP_SND_IF_R> _ifL = null;
		protected MCNumber _dataNo = null;

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
			MBBBL_SendAcMstService.SendAcMst_Chk01 o = MBBBL_SendAcMstService.crtSendAcMst_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			editUp0();
			insSndIf();

			if (existsIF()) {
				callSendRecvIf(createSendRecvIfUpL());
			}
		}

		protected void getBpL() {
			_bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			MBT_BP_SND_IF_R t2 = MBT_BP_SND_IF_R.create("T2");
			MBT_BP_SND_IF_R S1W = MBT_BP_SND_IF_R.create("W");
			bpL_bldr.setGroupBy(bpL_t.bp_cd);
			bpL_bldr.addMax(t2.data_lno, DATA_LNO);
			bpL_bldr.addLeftOuterJoin(t2, t2.bp_cd.eq(bpL_t.bp_cd));
			bpL_bldr.addWhereWithAnd(t2.master_typ.eq(bind("1")), up0().master_typ());
			bpL_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
									.where(S1W.bp_cd.eq(bpL_t.bp_cd)
											.and(S1W.master_typ.eq(bind("1")))
											.and(S1W.ext_sys_cd.eq(bind("2")))
											.and(S1W.exe_sts_typ.in(
													value(MAC_EXE_STS_TYP.NOT_EXE.value()),
													value(MAC_EXE_STS_TYP.ERR.value()),
													value(MAC_EXE_STS_TYP.SKP.value()))))),
							up0().master_typ(), up0().ext_sys_cd());
			bpL_bldr.addWhereWithAnd(t2.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			if (MAC_MASTER_TYP.isCST(up0().master_typ())) {
				bpL_bldr.addWhereWithAnd(bpL_t.cst_flg.eq(value(true)));
			}
			else if (MAC_MASTER_TYP.isSPL(up0().master_typ())) {
				bpL_bldr.addWhereWithAnd(bpL_t.sppl_flg.eq(value(true)));
			}
			bpL_bldr.setOrderByAsc(bpL_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MBBBL5060_MAM_BP_S01", _bpL, bpL_bldr);
		}

		protected void editSndIfL1() {
			_ifL = MCList.create(MBT_BP_SND_IF_R.class);
			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			doSeqCache(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO, _bpL.size());

			for (MAM_BP_R r : _bpL) {
				MBT_BP_SND_IF_R ifR = MBT_BP_SND_IF_R.create();

				ifR.data_lno(getSequence(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.value()));
				ifR.data_no(_dataNo);
				ifR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				if (isNull(r.getNumber(DATA_LNO))) {
					ifR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					ifR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				ifR.ext_sys_cd(up0().ext_sys_cd());
				ifR.master_typ(up0().master_typ());
				ifR.bp_cd(r.bp_cd());

				_ifL.add(ifR);
			}
		}

		protected void getBpSndIfL() {
			_bpSndIfL = MCList.create(MBT_BP_SND_IF_R.class);
			MBT_BP_SND_IF_R bpSndIfL_t = MBT_BP_SND_IF_R.create("T");
			MCQueryApiBuilder bpSndIfL_bldr = MCQueryApiBuilder.create(bpSndIfL_t);
			MAM_BP_R S1W = MAM_BP_R.create("W");
			bpSndIfL_bldr.setDistinct();
			bpSndIfL_bldr.setSelect(bpSndIfL_t.bp_cd);
			bpSndIfL_bldr.setWhere(bpSndIfL_t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.OK.value())));
			bpSndIfL_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.bp_cd.eq(bpSndIfL_t.bp_cd))));
			bpSndIfL_bldr.addWhereWithAnd(bpSndIfL_t.master_typ.eq(bind("1")),
					up0().master_typ());
			bpSndIfL_bldr.addWhereWithAnd(bpSndIfL_t.ext_sys_cd.eq(bind("1")),
					up0().ext_sys_cd());
			dbSelect("MBBBL5060_MBT_BP_SND_IF_S01", _bpSndIfL, bpSndIfL_bldr);
		}

		protected void editSndIfL2() {
			doSeqCache(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO, _bpSndIfL.size());

			for (MBT_BP_SND_IF_R r : _bpSndIfL) {
				MBT_BP_SND_IF_R ifR = MBT_BP_SND_IF_R.create();

				ifR.data_lno(getSequence(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.value()));
				ifR.data_no(_dataNo);
				ifR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				ifR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				ifR.ext_sys_cd(up0().ext_sys_cd());
				ifR.master_typ(up0().master_typ());
				ifR.bp_cd(r.bp_cd());

				_ifL.add(ifR);
			}
		}
		protected void editUp0() {
			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			up0().setNumberNE("data_no", _dataNo);
			up0().setStringNE("exe_sts_typ", MAC_EXE_STS_TYP.NOT_EXE.value());
			if (MAC_MASTER_TYP.isCST(up0().master_typ())) {
				up0().setStringNE("cst_flg_str", "1");
			}
			else {
				up0().setStringNE("sppl_flg_str", "1");
			}
			up0().setStringNE("send_skip_bp_flg_str", isSame(getSysParm("SEND_SKIP_BP_FLG"),"1") ? "1" : "0");
		}
		protected boolean existsIF() {
			MBT_BP_SND_IF_R t = MBT_BP_SND_IF_R.create("T");
			return execDbCount("MBBBL5060_MBT_BP_SND_IF_S02", t, t.data_no.eq(bind("1")), _dataNo) > 0;
		}

		protected void insSndIf() {
			// 新規・更新データ登録
			executeUpdate(MBBBL5060_MBT_BP_SND_IF_I01(), up0());
			// 削除データ登録
			executeUpdate(MBBBL5060_MBT_BP_SND_IF_I02(), up0());
		}

		/**
		 * 送受信ＩＦ制御の新規追加オペレーションに渡す上り電文を返す。
		 */
		protected MCList<MCRow> createSendRecvIfUpL() {
			String ifProcTyp;
			if (MAC_MASTER_TYP.isCST(up0().master_typ())) {
				ifProcTyp = MAC_IF_PROC_TYP.AC_BP_CST_SEND.value();
			}
			else {
				ifProcTyp = MAC_IF_PROC_TYP.AC_BP_SPPL_SEND.value();
			}

			MCList<MCRow> l = MCList.create(MCRow.class);
			MCRow r = createSendRecvIfUpR(_dataNo, up0().ext_sys_cd(), ifProcTyp);
			l.add(r);
			return l;
		}

	}

	/**
	 * SendAcMst_Del01オペレーション.<p>
	 *
	 * 会計マスタ情報の送信を取り消す。<br>
	 */
	public class SendAcMst_Del01 extends MBBBL_SendAcMstService_MC_A.SendAcMst_Del01 {

		protected MCList<MBT_BP_SND_IF_R> _bpSndIfL = null;

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
			MBBBL_SendAcMstService.SendAcMst_Chk02 o = MBBBL_SendAcMstService.crtSendAcMst_Chk02();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			lockBpSndIf();
			delBpSndIf();
			delPftSdrvIf(_bpSndIfL);
		}

		protected void lockBpSndIf() {
			_bpSndIfL = MCList.create(MBT_BP_SND_IF_R.class);
			MBT_BP_SND_IF_R bpSndIfL_t = MBT_BP_SND_IF_R.create("T");
			MCQueryApiBuilder bpSndIfL_bldr = MCQueryApiBuilder.create(bpSndIfL_t);
			
			bpSndIfL_bldr.setSelect(bpSndIfL_bldr.getBaseDbc().getKeyColumn$());
			bpSndIfL_bldr.setWhere(bpSndIfL_t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpSndIfL_bldr.addWhereWithAnd(bpSndIfL_t.master_typ.eq(bind("1")), up0().master_typ());
			bpSndIfL_bldr.addWhereWithAnd(bpSndIfL_t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			bpSndIfL_bldr.setOrderByAsc(bpSndIfL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MBBBL5060_MBT_BP_SND_IF_S03", bpSndIfL_bldr);
			
			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder bpSndIfL_bldrSelect = MCQueryApiBuilder.create(bpSndIfL_t);
			MBT_BP_SND_IF_R S1W = MBT_BP_SND_IF_R.create("W");
			bpSndIfL_bldrSelect.setDistinct();
			bpSndIfL_bldrSelect.setSelect(bpSndIfL_t.data_no);
			bpSndIfL_bldrSelect.setWhere(bpSndIfL_t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpSndIfL_bldrSelect.addWhereWithAnd(bpSndIfL_t.master_typ.eq(bind("1")), up0().master_typ());
			bpSndIfL_bldrSelect.addWhereWithAnd(bpSndIfL_t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			
			bpSndIfL_bldrSelect.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
							.where(S1W.data_no.eq(bpSndIfL_t.data_no)
									.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBBL5060_MBT_BP_SND_IF_S04", _bpSndIfL, bpSndIfL_bldrSelect);
		}

		protected void delBpSndIf() {
			MBT_BP_SND_IF_R t = MBT_BP_SND_IF_R.create("T");
			execDbDelete("MBBBL5060_MBT_BP_SND_IF_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.master_typ.eq(bind("1")))
							.and(t.ext_sys_cd.eq(bind("2"))),
					up0().master_typ(), up0().ext_sys_cd());
		}

	}

	//FMCB CUSTOM END
}