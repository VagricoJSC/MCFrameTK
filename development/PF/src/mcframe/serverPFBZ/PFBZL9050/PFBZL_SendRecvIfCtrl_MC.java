package mcframe.serverPFBZ.PFBZL9050;

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
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFUD.PFUDL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL5020.*;

import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mcframe.commonCore.sys.MCFactory;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_SendRecvIfCtrl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_SendRecvIfCtrl_MC extends PFBZL_SendRecvIfCtrl_MC_A{
	//FMCB CUSTOM START
	/**
	 * 更新対象のインターフェーステーブル名
	 */
	private String _tblNm = null;
	
	/**
	 * 更新処理の送受信の方向
	 */
	private boolean _isSend = true;
	
	/**
	 * 取消かどうか
	 */
	private boolean _isCan = false;

	/**
	 * UpdEsb01オペレーション.<p>
	 *
	 */
	public class UpdEsb01 extends PFBZL_SendRecvIfCtrl_MC_A.UpdEsb01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if(up0() == null || up0().isEmpty()) {
				throw new MCException(PFBZL0048);
			}

			if (isNull(_tblNm)) {
				throw new MCException(PFBZL0049);
			}
			try {
				//ＯＫリストの更新
				MCList<UpdEsb01_DtlR> okL = _isSend ?
					up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_CONV_OK.value()) :
					up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_CONV_OK.value());
				if (_isSend) {
					okL.addAll(up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value()));
				}
				
				if(!isNull(okL) && !okL.isEmpty()) {
					updateStatus(_tblNm, MAC_EXE_STS_TYP.OK, okL);
				}

				//ＥＲＲリストの更新
				MCList<UpdEsb01_DtlR> errL = _isSend ?
						up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_CONV_ERR.value()) :
						up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_CONV_ERR.value());

				
				if(!isNull(errL) && !errL.isEmpty()) {
					updateStatus(_tblNm, MAC_EXE_STS_TYP.ERR, errL);
				}
				
				//スキップリストの更新
				MCList<UpdEsb01_DtlR> skpL = up0().subList(UpdEsb01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.NOTYET.value());

				if(!isNull(skpL) && !skpL.isEmpty()) {
					if (_isCan) {
						updateStatus(_tblNm, MAC_EXE_STS_TYP.NOT_EXE, skpL);
					}
					else {
						updateStatus(_tblNm, MAC_EXE_STS_TYP.SKP, skpL);
					}
				}
				
			}
			catch(MCException ex) {
				MCMessagePool.add(PFBZL0050, _tblNm);
				throw ex;
			}
		}

		/**
		 * 送受信の方向を設定する
		 */
		public void setSdrvFlg(boolean isSend) {
			_isSend = isSend;
		}

		/**
		 * 更新対象のＥＳＢインターフェーステーブルをセットする
		 */
		public void setEsbIfTblNm(String tblNm) {
			_tblNm = tblNm;
		}

		/**
		 * 取消かどうかを設定する
		 */
		public void setCanFlg(boolean isCan) {
			_isCan = isCan;
		}
	}

	/**
	 * UpdWk01オペレーション.<p>
	 *
	 */
	public class UpdWk01 extends PFBZL_SendRecvIfCtrl_MC_A.UpdWk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			updSdrvIfWk();
		}

		protected void updSdrvIfWk() {
			MCList<PFW_SDRV_IF_R> wkL = MCList.create(PFW_SDRV_IF_R.class);
			for (UpdWk01_DtlR dtlR : up0()) {
				wkL.add(dtlR.sdrvIfWk());
			}
			
			PFW_SDRV_IF_R dbc = PFW_SDRV_IF_R.create();
			execDbWkDelete(createSqlId(LOGIC_ID, dbc, "D01"), dbc);
			
			MCQueryApiBuilder b2 = MCQueryApiBuilder.create(dbc);
			b2.buildInsert(createSqlId(LOGIC_ID, dbc, "I01")).executeBatchUpdate(wkL);
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends PFBZL_SendRecvIfCtrl_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MCList<Srch01_DtlR> dtlL = makeDtlL(getSendIf());
			down0().addAll(dtlL);
		}
		
		protected MCList<PFT_SDRV_IF_R> getSendIf() {
			MCList<PFT_SDRV_IF_R> ifL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);

			setSelect(dbc, builder);
			addWhereSendStsTyp(dbc, builder);
			addWhereNotSendFlg(dbc, builder);
			addWhereNotSendUpdFlg(dbc, builder);
			setOrderBy(dbc, builder);
			
			dbSelect(createSqlId(LOGIC_ID, dbc, "S02"), ifL, builder);
			return ifL;
		}
		
		protected void setSelect(PFT_SDRV_IF_R t, MCQueryApiBuilder builder) {

			PFT_SDRV_IF_FILE_R tt = PFT_SDRV_IF_FILE_R.create("TT");
			PFT_SDRV_IF_FILE_R t2 = PFT_SDRV_IF_FILE_R.create("T2");
			PFT_IF_FILE_R t3 = PFT_IF_FILE_R.create("T3");
			MAM_EXT_SYS_R m1 = MAM_EXT_SYS_R.create("M1");
			
			builder.setSelectAll();
			builder.addSelect(
						t3.file_id,
						t3.file_path,
						t3.file_nm,
						t3.fproc_typ,
						m1.ext_sys_nm,
						subQuery().select(max(tt.file_id)).from(tt).where(tt.data_no.eq(t2.data_no)).as("max_id"));

			builder.addLeftOuterJoin(t2, t2.data_no.eq(t.data_no));
			builder.addLeftOuterJoin(t3, t3.file_id.eq(t2.file_id));
			builder.addLeftOuterJoin(m1, m1.ext_sys_cd.eq(t.ext_sys_cd));

			builder.addWhereWithCutOffAnd(t.if_proc_typ.like(bind("1")), up0().if_proc_typ());
			builder.addWhereWithCutOffAnd(t.ext_sys_cd.like(bind("1")), up0().ext_sys_cd());
			builder.addWhereWithCutOffAnd(t.data_no.gte(bind("1")), up0().data_no_fr());
			builder.addWhereWithCutOffAnd(t.data_no.lte(bind("1")), up0().data_no_to());
			builder.addWhereWithCutOffAnd(t.ins_ts.gte(bind("1")), up0().ins_ts_fr());
			builder.addWhereWithCutOffAnd(t.ins_ts.lte(bind("1")), up0().ins_ts_to());
			builder.addWhereWithCutOffAnd(t.sdrv_tm.gte(bind("1")), up0().sdrv_tm_fr());
			builder.addWhereWithCutOffAnd(t.sdrv_tm.lte(bind("1")), up0().sdrv_tm_to());
			builder.addWhereWithCutOffAnd(t.batch_log_no.like(bind("1")), up0().batch_log_no());
			builder.addWhereWithCutOffAnd(t.upd_srv_req_no.eq(bind("1")), up0().ins_srv_req_no());
			builder.addWhereWithCutOffAnd(t3.file_nm.like(bind("1")).and(t3.fproc_typ.neq(value(MAC_FPROC_TYP.CANCELED.value()))), up0().file_nm());
			builder.addWhereWithCutOffAnd(t.attr_char1.like(bind("1")), up0().attr_char1());
			builder.addWhereWithCutOffAnd(t.attr_char2.like(bind("1")), up0().attr_char2());
			builder.addWhereWithCutOffAnd(t.attr_char3.like(bind("1")), up0().attr_char3());
			builder.addWhereWithCutOffAnd(t.attr_char4.like(bind("1")), up0().attr_char4());
			builder.addWhereWithCutOffAnd(t.attr_char5.like(bind("1")), up0().attr_char5());
			builder.addWhereWithCutOffAnd(t.attr_char6.like(bind("1")), up0().attr_char6());
			builder.addWhereWithCutOffAnd(t.attr_char7.like(bind("1")), up0().attr_char7());
			builder.addWhereWithCutOffAnd(t.attr_char8.like(bind("1")), up0().attr_char8());
			builder.addWhereWithCutOffAnd(t.attr_char9.like(bind("1")), up0().attr_char9());
			builder.addWhereWithCutOffAnd(t.attr_char10.like(bind("1")), up0().attr_char10());
			builder.addWhereWithCutOffAnd(t.attr_char11.like(bind("1")), up0().attr_char11());
			builder.addWhereWithCutOffAnd(t.attr_char12.like(bind("1")), up0().attr_char12());
			builder.addWhereWithCutOffAnd(t.attr_char13.like(bind("1")), up0().attr_char13());
			builder.addWhereWithCutOffAnd(t.attr_char14.like(bind("1")), up0().attr_char14());
			builder.addWhereWithCutOffAnd(t.attr_char15.like(bind("1")), up0().attr_char15());
			builder.addWhereWithCutOffAnd(t.attr_char16.like(bind("1")), up0().attr_char16());
			builder.addWhereWithCutOffAnd(t.attr_char17.like(bind("1")), up0().attr_char17());
			builder.addWhereWithCutOffAnd(t.attr_char18.like(bind("1")), up0().attr_char18());
			builder.addWhereWithCutOffAnd(t.attr_char19.like(bind("1")), up0().attr_char19());
			builder.addWhereWithCutOffAnd(t.attr_char20.like(bind("1")), up0().attr_char20());
			builder.addWhereWithCutOffAnd(t.attr_char21.like(bind("1")), up0().attr_char21());
			builder.addWhereWithCutOffAnd(t.attr_char22.like(bind("1")), up0().attr_char22());
			builder.addWhereWithCutOffAnd(t.attr_char23.like(bind("1")), up0().attr_char23());
			builder.addWhereWithCutOffAnd(t.attr_char24.like(bind("1")), up0().attr_char24());
			builder.addWhereWithCutOffAnd(t.attr_char25.like(bind("1")), up0().attr_char25());
			builder.addWhereWithCutOffAnd(t.attr_char26.like(bind("1")), up0().attr_char26());
			builder.addWhereWithCutOffAnd(t.attr_char27.like(bind("1")), up0().attr_char27());
			builder.addWhereWithCutOffAnd(t.attr_char28.like(bind("1")), up0().attr_char28());
			builder.addWhereWithCutOffAnd(t.attr_char29.like(bind("1")), up0().attr_char29());
			builder.addWhereWithCutOffAnd(t.attr_char30.like(bind("1")), up0().attr_char30());
			builder.addWhereWithCutOffAnd(t.attr_num1.eq(bind("1")), up0().attr_num1());
			builder.addWhereWithCutOffAnd(t.attr_num2.eq(bind("1")), up0().attr_num2());
			builder.addWhereWithCutOffAnd(t.attr_num3.eq(bind("1")), up0().attr_num3());
			builder.addWhereWithCutOffAnd(t.attr_num4.eq(bind("1")), up0().attr_num4());
			builder.addWhereWithCutOffAnd(t.attr_num5.eq(bind("1")), up0().attr_num5());
			builder.addWhereWithCutOffAnd(t.attr_dt1.gte(bind("1")), up0().attr_dt1_fr());
			builder.addWhereWithCutOffAnd(t.attr_dt1.lte(bind("1")), up0().attr_dt1_to());
			builder.addWhereWithCutOffAnd(t.attr_dt2.gte(bind("1")), up0().attr_dt2_fr());
			builder.addWhereWithCutOffAnd(t.attr_dt2.lte(bind("1")), up0().attr_dt2_to());
			builder.addWhereWithCutOffAnd(t.attr_dt3.gte(bind("1")), up0().attr_dt3_fr());
			builder.addWhereWithCutOffAnd(t.attr_dt3.lte(bind("1")), up0().attr_dt3_to());
			builder.addWhereWithCutOffAnd(t.attr_dt4.gte(bind("1")), up0().attr_dt4_fr());
			builder.addWhereWithCutOffAnd(t.attr_dt4.lte(bind("1")), up0().attr_dt4_to());
			builder.addWhereWithCutOffAnd(t.attr_dt5.gte(bind("1")), up0().attr_dt5_fr());
			builder.addWhereWithCutOffAnd(t.attr_dt5.lte(bind("1")), up0().attr_dt5_to());
			builder.addWhereWithCutOffAnd(t.attr_tm1.gte(bind("1")), up0().attr_tm1_fr());
			builder.addWhereWithCutOffAnd(t.attr_tm1.lte(bind("1")), up0().attr_tm1_to());
			builder.addWhereWithCutOffAnd(t.attr_tm2.gte(bind("1")), up0().attr_tm2_fr());
			builder.addWhereWithCutOffAnd(t.attr_tm2.lte(bind("1")), up0().attr_tm2_to());
			builder.addWhereWithCutOffAnd(t.attr_tm3.gte(bind("1")), up0().attr_tm3_fr());
			builder.addWhereWithCutOffAnd(t.attr_tm3.lte(bind("1")), up0().attr_tm3_to());
			builder.addWhereWithCutOffAnd(t.attr_tm4.gte(bind("1")), up0().attr_tm4_fr());
			builder.addWhereWithCutOffAnd(t.attr_tm4.lte(bind("1")), up0().attr_tm4_to());
			builder.addWhereWithCutOffAnd(t.attr_tm5.gte(bind("1")), up0().attr_tm5_fr());
			builder.addWhereWithCutOffAnd(t.attr_tm5.lte(bind("1")), up0().attr_tm5_to());
			builder.addWhereWithCutOffAnd(m1.ext_sys_nm.like(bind("1")), up0().ext_sys_nm());
		}
		
		// 画面指定の場合は、画面の指定に従う。（ロック対象ではない）
		//　バッチ起動の場合はエラー、および未完了のものを対象とする。
		//
		protected void addWhereSendStsTyp(PFT_SDRV_IF_R t, MCQueryApiBuilder builder) {

			List<String> sdrvSysTyps = new ArrayList<String>();
			sdrvSysTyps.add(null);

			if (up0().notyet_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.NOTYET.value());
			}
			if (up0().send_conv_err_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.SEND_CONV_ERR.value());
			}
			if (up0().send_conv_ok_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.SEND_CONV_OK.value());
			}
			if (up0().send_err_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.SEND_ERR.value());
			}
			if (up0().send_ok_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.SEND_OK.value());
			}
			if (up0().recv_conv_err_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.RECV_CONV_ERR.value());
			}
			if (up0().recv_conv_ok_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.RECV_CONV_OK.value());
			}
			if (up0().recv_err_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.RECV_ERR.value());
			}
			if (up0().recv_ok_flg()) {
				sdrvSysTyps.add(MAC_SDRV_STS_TYP.RECV_OK.value());
			}
			builder.addWhereInWithAnd(t.sdrv_sts_typ, sdrvSysTyps);
		}
		
		protected void addWhereNotSendFlg(PFT_SDRV_IF_R t, MCQueryApiBuilder builder) {
			if (!up0().not_send_flg()) {
				builder.addWhereInWithAnd(t.not_send_flg, Arrays.asList("0"));
			}
		}
		
		protected void addWhereNotSendUpdFlg(PFT_SDRV_IF_R t, MCQueryApiBuilder builder) {
			if (up0().not_send_upd_flg()) {
				builder.addWhereInWithAnd(t.not_send_upd_flg, Arrays.asList("1"));
			}
		}
		protected void setOrderBy(PFT_SDRV_IF_R t, MCQueryApiBuilder builder) {
			builder.setOrderByAsc(t.if_proc_typ, t.data_no);
		}

		protected MCList<Srch01_DtlR> makeDtlL(MCList<PFT_SDRV_IF_R> ifL) {
			
			MCList<MAM_IF_ADAPTER_R> adptrL = MCList.create(MAM_IF_ADAPTER_R.class);
			MCJoinKey<MCList<MAM_IF_ADAPTER_R>> jk = ifAdptrMgr().mrgIfAdptr(ifL, adptrL);
			MAUCC_RowMapperWith<Srch01_DtlR, PFT_SDRV_IF_R, MAM_IF_ADAPTER_R> mapper = createSrch01_DtlR_PFT_SDRV_IF_R();

			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			for (PFT_SDRV_IF_R ifR : ifL) {
				// 同一data_noで最大のfile_idのみ使用
				if (isSame(ifR.getNumberNE(PFT_IF_FILE_R.$file_id), ifR.getNumberNE("max_id"))) {
					MAM_IF_ADAPTER_R ctrlR = ifR.getJoinedRow(jk);
					Srch01_DtlR dtlR = dtlL.createRow();
					copy(dtlR, ifR, ctrlR, mapper);
					dtlL.add(dtlR);
				}
			}

			return dtlL;
		}

		protected Srch01_DtlR_MAM_IF_ADAPTER_R<Srch01_DtlR, PFT_SDRV_IF_R, MAM_IF_ADAPTER_R> createSrch01_DtlR_PFT_SDRV_IF_R() {
			return new Srch01_DtlR_MAM_IF_ADAPTER_R<Srch01_DtlR, PFT_SDRV_IF_R, MAM_IF_ADAPTER_R>();
		}
		public class Srch01_DtlR_MAM_IF_ADAPTER_R<D extends Srch01_DtlR, S extends PFT_SDRV_IF_R, W extends MAM_IF_ADAPTER_R>
				extends MAUCC_RowMapperWith<D,S,W>{
			protected W _adptrR;
			@Override
			public void setWith(W adptrR) {
				this._adptrR = adptrR;
			}
			@Override
			public void valueCopy(D dest, S src){
				dest.sdrvIf(src);

				if (MAC_SDRV_STS_TYP.isNOTYET(dest.sdrv_sts_typ())
				 || MAC_SDRV_STS_TYP.isSEND_CONV_ERR(dest.sdrv_sts_typ())) {
				 	if (!isNull(_adptrR)) {
				 		dest.conv_ope(_adptrR.conv_ope());
				 		dest.file_io_ope(_adptrR.file_io_ope());
				 		dest.web_api_ope(_adptrR.web_api_ope());
				 		dest.cmd_exec_ope(_adptrR.cmd_exec_ope());
				 	}
				}
				else {
					if (!MAC_FPROC_TYP.isCANCELED(src.getStringNE(PFT_IF_FILE_R.$fproc_typ))) {
						dest.file_id(src.getNumberNE(PFT_IF_FILE_R.$file_id));
						dest.file_path(src.getStringNE(PFT_IF_FILE_R.$file_path));
						dest.file_nm(src.getStringNE(PFT_IF_FILE_R.$file_nm));

						if (!isNull(dest.file_path())) {
							dest.file_path(suppressDir(dest.file_path()));	// ready, trash, err を削る
						}
					}
				}
				dest.ext_sys_nm(src.getStringNE(MAM_EXT_SYS_R.$ext_sys_nm));
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 */
	public class Srch02 extends PFBZL_SendRecvIfCtrl_MC_A.Srch02 {

		/**
		 * 通信ルールマスタ管理クラスのインスタンス
		 */
		protected PFUCL_AppSys.IfPrtclMgr<PFT_SDRV_IF_R> _ifPrtclMgr = PFUCL_AppSys.crtSendIfProtocolMgr();
		
		/**
		 * 送信対象となる送信制御トラン
		 */
		protected MCList<PFT_SDRV_IF_R> _ifL = MCList.create(PFT_SDRV_IF_R.class);
		
		/**
		 * 下りの情報
		 */
		protected MCList<Srch02_DtlR> _dtlL = MCList.create(Srch02_DtlR.class);
		
		/**
		 * 運用日付
		 */
		protected MCDate _now = MCDate.now();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			readSendIfL();
			reformIfL();
			setDown();
		}

		protected void readSendIfL() {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			PFT_SDRV_IF_FILE_R t2 = PFT_SDRV_IF_FILE_R.create("T2");
			PFT_IF_FILE_R t3 = PFT_IF_FILE_R.create("T3");

			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelect(t.if_proc_typ, t.ext_sys_cd, t.data_no);
			builder.addSelect(t3.file_id, t3.file_path, t3.file_nm);
			builder.addLeftOuterJoin(t3, t3.file_id.eq(subQuery().select(max(t2.file_id)).from(t2).where(t2.data_no.eq(t.data_no))));
			builder.addWhereWithCutOffAnd(t.if_proc_typ.eq(bind("1")), up0().if_proc_typ());
			builder.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			builder.addWhereWithAnd(t.not_send_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sdrv_sts_typ.in(
							value(MAC_SDRV_STS_TYP.SEND_CONV_OK.value()),
							value(MAC_SDRV_STS_TYP.SEND_ERR.value())));
			builder.addWhereWithAnd(t3.fproc_typ.in(
							value(MAC_FPROC_TYP.NOTYET.value()),
							value(MAC_FPROC_TYP.ERR.value())));
			builder.setOrderByAsc(t.if_proc_typ, t.data_no);
			builder.setLockTable(t.data_no);
			dbSelectForUpdateNoWait(createSqlId(LOGIC_ID, t, "S03"), _ifL, builder);
		}

		protected void reformIfL() {
			
			MCRowMapper<Srch02_DtlR, PFT_SDRV_IF_R> mapper = createDtlR_PFT_SDRV_IF_R();
			for (PFT_SDRV_IF_R ifR : _ifL) {
				Srch02_DtlR dtlR = Srch02_DtlR.create();
				copy(dtlR, ifR, mapper);
				try {
					setIfPrtcl(dtlR);
					chkIfPrtcl(dtlR);
				}
				catch (MCException ex) {
					MCMessagePool.add(dtlR, null, ex.getID(), (Object[])ex.getBindArray());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
				finally {
					_dtlL.add(dtlR);
				}
			}
		}

		protected void setIfPrtcl(Srch02_DtlR dtlR) {
					
			_ifPrtclMgr.set(dtlR);

			setIfCtlTyp(dtlR, Srch02_DtlR.$remote_dir, MAC_IF_CTL_TYP.SEND_RMT_DIR);
			setIfCtlTyp(dtlR, Srch02_DtlR.$transfer_lock_typ, MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP);
			setIfCtlTyp(dtlR, Srch02_DtlR.$sts_fsuffix, MAC_IF_CTL_TYP.STS_FILE_SUFFIX);
			
			String sendType = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP,dtlR.if_proc_typ());
			// FTP送信時のみ設定
			if (isSame(sendType, PFUCL_AppSys._send_typ_ftp)) {
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_host, MAC_IF_CTL_TYP.FTP_HOST);
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_user, MAC_IF_CTL_TYP.FTP_USER);
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_password, MAC_IF_CTL_TYP.FTP_PASS);
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_port, MAC_IF_CTL_TYP.FTP_PORT);
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_mode, MAC_IF_CTL_TYP.FTP_MODE);
				setIfCtlTyp(dtlR, Srch02_DtlR.$ftp_opts, MAC_IF_CTL_TYP.FTP_OPTS);
			}
			// SFTP送信時のみ設定
			else if (isSame(sendType, PFUCL_AppSys._send_typ_sftp)) {
				setIfCtlTyp(dtlR, Srch02_DtlR.$sftp_host, MAC_IF_CTL_TYP.SFTP_HOST);
				setIfCtlTyp(dtlR, Srch02_DtlR.$sftp_user, MAC_IF_CTL_TYP.SFTP_USER);
				setIfCtlTyp(dtlR, Srch02_DtlR.$sftp_password, MAC_IF_CTL_TYP.SFTP_PASS);
				setIfCtlTyp(dtlR, Srch02_DtlR.$sftp_port, MAC_IF_CTL_TYP.SFTP_PORT);
				setIfCtlTyp(dtlR, Srch02_DtlR.$sftp_key_file_path, MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH);
			}
		}

		protected void chkIfPrtcl(Srch02_DtlR dtlR) {

			// FTP/SFTP送信時のみチェック処理を実行
			String sendTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP,
					dtlR.if_proc_typ());
			if (isSame(sendTyp, PFUCL_AppSys._send_typ_copy)) {
				if (isNull(dtlR.remote_dir())) {
					MCMessagePool.add(dtlR, null, PFBZL0064, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
			}
			if (!isSame(sendTyp, PFUCL_AppSys._send_typ_ftp)
					&& !isSame(sendTyp, PFUCL_AppSys._send_typ_sftp)) {
				return;
			}
			if (isSame(sendTyp, PFUCL_AppSys._send_typ_ftp)) {
				if (isNull(dtlR.ftp_host())) {
					MCMessagePool.add(dtlR, null, PFBZL0053, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.FTP_HOST.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
				else if (isNull(dtlR.ftp_user())) {
					MCMessagePool.add(dtlR, null, PFBZL0053, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.FTP_USER.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
				else if (isNull(dtlR.ftp_password())) {
					MCMessagePool.add(dtlR, null, PFBZL0053, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.FTP_PASS.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
			}
			else if (isSame(sendTyp, PFUCL_AppSys._send_typ_sftp)) {
				if (isNull(dtlR.sftp_host())) {
					MCMessagePool.add(dtlR, null, PFBZL0073, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.SFTP_HOST.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
				else if (isNull(dtlR.sftp_user())) {
					MCMessagePool.add(dtlR, null, PFBZL0073, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.SFTP_USER.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
				else if (isNull(dtlR.sftp_password())
						&& isNull(dtlR.sftp_key_file_path())) {
					MCMessagePool.add(dtlR, null, PFBZL0074, dtlR.ext_sys_cd(),
							dtlR.if_proc_typ(), MAC_IF_CTL_TYP.SFTP_PASS.value());
					dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				}
			}
		}

		protected void setIfCtlTyp(Srch02_DtlR dtlR, String col, MAC_IF_CTL_TYP ifCtlTyp) {
			Comparable<?> val = _ifPrtclMgr.getIfCtlString(ifCtlTyp, dtlR.if_proc_typ());
			
			//文字列がブランクを返した場合は数値を取得する
			if(isNull(val)) {
				val = _ifPrtclMgr.getIfCtlNumber(ifCtlTyp, dtlR.if_proc_typ());
			}
			dtlR.setValue(col, val);
		}
		
		protected void setDown() {
			down0().setAll(_dtlL);
		}

		protected DtlR_PFT_SDRV_IF_R<Srch02_DtlR, PFT_SDRV_IF_R> createDtlR_PFT_SDRV_IF_R() {
			return new DtlR_PFT_SDRV_IF_R<Srch02_DtlR, PFT_SDRV_IF_R>();
		}
		public class DtlR_PFT_SDRV_IF_R<D extends Srch02_DtlR, S extends PFT_SDRV_IF_R>
				extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.data_no(src.data_no());
				dest.file_id(src.getNumberNE(PFT_IF_FILE_R.$file_id));
				dest.file_path(src.getStringNE(PFT_IF_FILE_R.$file_path));
				dest.file_nm(src.getStringNE(PFT_IF_FILE_R.$file_nm));
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends PFBZL_SendRecvIfCtrl_MC_A.Ins01 {

		/**
		 * MessagePool保存用
		 */
		protected MCMessageList _poolL = new MCMessageList();
		
		/**
		 * 送受信ＩＦコンテナ（変換処理実行用）
		 */
		protected MCList<PFT_SDRV_IF_R> _ifL = MCList.create(PFT_SDRV_IF_R.class);

		/**
		 * アダプタ情報の参照
		 */
		PFUCL_AppSys.IfAdptrMgr<?> _ifAdptMgr = PFUCL_AppSys.crtIfAdptrlMgr();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preSendIf();
			chkSendIf();
			InsSendIf();
			postSendIf();
		}

		protected void preSendIf() {
			// カスタマイズ用
		}

		protected void postSendIf() {
			MCList<PFT_SDRV_IF_R> webApiTgtL = _ifL.subList(r -> ifAdptrMgr().getWebApiFlg(r));
			webApiTgtL.removeIf(r -> r.getBoolean(mcframe.serverPFUD.PFUDL0030.DtlR.$webapi_not_link_flg));
			if (webApiTgtL.isEmpty()) return;
			mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.Upd02 ope = mcframe.serverPFBZ.PFBZB5010.PFBZB_SendDataConv.crtUpd02();
			addAll(ope.up0(), webApiTgtL, createMap_SdrvDtlR_PFT_SDRV_IF_R());
			ope.exec();
		}

		protected Map_SdrvDtlR_PFT_SDRV_IF_R<SdrvDtlR,PFT_SDRV_IF_R> createMap_SdrvDtlR_PFT_SDRV_IF_R() {
			return new Map_SdrvDtlR_PFT_SDRV_IF_R<SdrvDtlR, PFT_SDRV_IF_R>();
		}

		public class Map_SdrvDtlR_PFT_SDRV_IF_R<D extends SdrvDtlR, S extends PFT_SDRV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SdrvDtlR.$data_no, PFT_SDRV_IF_R.$data_no);
				addColumnPathMap(SdrvDtlR.$if_proc_typ, PFT_SDRV_IF_R.$if_proc_typ);
				addColumnPathMap(SdrvDtlR.$ext_sys_cd, PFT_SDRV_IF_R.$ext_sys_cd);
				addColumnPathMap(SdrvDtlR.$sdrv_sts_typ, PFT_SDRV_IF_R.$sdrv_sts_typ);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.batch_flg(false);
			}
		}
		
		protected void chkSendIf() {
			MCList<mcframe.serverPFUD.PFUDL0030.DtlR> exL = MCList.create(mcframe.serverPFUD.PFUDL0030.DtlR.class);
			for (mcframe.serverPFUD.PFUDL0030.DtlR dtlR : up0()) {
				if (!isSendIf(dtlR.if_proc_typ())) {
					MCMessagePool.add(
						dtlR, null, PFBZL0051, dtlR.if_proc_typ(), dtlR.data_no());
					exL.add(dtlR);
				}
			}
			
			MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create();
			MCRow result = MCRow.create();
			for (MCList<DtlR> dtlL : up0().groupList(MAM_EXT_SYS_R.$ext_sys_cd)) {
				if (dbSelectKey(createSqlId(LOGIC_ID, dbc, "S04"), result, dbc, dtlL.get(0)) != 1) {
					for(DtlR dtlR : dtlL){
						MCMessagePool.add(
								dtlR, null, PFBZL0052, dtlR.ext_sys_cd(), dtlR.data_no());
							exL.add(dtlR);
					}
				}
			}
			if (!exL.isEmpty()) {
				up0().removeAll(exL);
			}
		}

		protected void InsSendIf() {
			getSendIf();

			PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.buildInsert(createSqlId(LOGIC_ID, dbc, "I02")).executeBatchUpdate(_ifL);
		}

		/**
		 * 送受信ＩＦ制御レコードの取得
		 *		
		 * @return 登録用コンテナ
		 */
		protected void getSendIf() {
			MCList<PFT_SDRV_IF_R> ifL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R_DtlR<PFT_SDRV_IF_R, mcframe.serverPFUD.PFUDL0030.DtlR> mapper = createPFT_SDRV_IF_R_DtlR();
			for (mcframe.serverPFUD.PFUDL0030.DtlR dtlR : up0()) {
				if (isNull(ifL.getFirst(_$ifKey, dtlR.toArray("data_no")))) {	
					PFT_SDRV_IF_R row = ifL.createRow();
					copy(row, dtlR, mapper);
					ifL.add(row);
				}
			}
			_ifL.setAll(ifL);
		}


		protected PFT_SDRV_IF_R_DtlR<PFT_SDRV_IF_R, mcframe.serverPFUD.PFUDL0030.DtlR> createPFT_SDRV_IF_R_DtlR() {
			return new PFT_SDRV_IF_R_DtlR<PFT_SDRV_IF_R, mcframe.serverPFUD.PFUDL0030.DtlR>();
		}
		
		public class PFT_SDRV_IF_R_DtlR<D extends PFT_SDRV_IF_R, S extends mcframe.serverPFUD.PFUDL0030.DtlR>
				extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.data_no(src.data_no());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.if_proc_typ(src.if_proc_typ());
				dest.sdrv_sts_typ(MAC_SDRV_STS_TYP.NOTYET.value());
				dest.attr_char1(src.attr_char1());
				dest.attr_char2(src.attr_char2());
				dest.attr_char3(src.attr_char3());
				dest.attr_char4(src.attr_char4());
				dest.attr_char5(src.attr_char5());
				dest.attr_char6(src.attr_char6());
				dest.attr_char7(src.attr_char7());
				dest.attr_char8(src.attr_char8());
				dest.attr_char9(src.attr_char9());
				dest.attr_char10(src.attr_char10());
				dest.attr_char11(src.attr_char11());
				dest.attr_char12(src.attr_char12());
				dest.attr_char13(src.attr_char13());
				dest.attr_char14(src.attr_char14());
				dest.attr_char15(src.attr_char15());
				dest.attr_char16(src.attr_char16());
				dest.attr_char17(src.attr_char17());
				dest.attr_char18(src.attr_char18());
				dest.attr_char19(src.attr_char19());
				dest.attr_char20(src.attr_char20());
				dest.attr_char21(src.attr_char21());
				dest.attr_char22(src.attr_char22());
				dest.attr_char23(src.attr_char23());
				dest.attr_char24(src.attr_char24());
				dest.attr_char25(src.attr_char25());
				dest.attr_char26(src.attr_char26());
				dest.attr_char27(src.attr_char27());
				dest.attr_char28(src.attr_char28());
				dest.attr_char29(src.attr_char29());
				dest.attr_char30(src.attr_char30());
				dest.attr_num1(src.attr_num1());
				dest.attr_num2(src.attr_num2());
				dest.attr_num3(src.attr_num3());
				dest.attr_num4(src.attr_num4());
				dest.attr_num5(src.attr_num5());
				dest.attr_dt1(src.attr_dt1());
				dest.attr_dt2(src.attr_dt2());
				dest.attr_dt3(src.attr_dt3());
				dest.attr_dt4(src.attr_dt4());
				dest.attr_dt5(src.attr_dt5());
				dest.attr_tm1(src.attr_tm1());
				dest.attr_tm2(src.attr_tm2());
				dest.attr_tm3(src.attr_tm3());
				dest.attr_tm4(src.attr_tm4());
				dest.attr_tm5(src.attr_tm5());
				dest.not_send_upd_flg(src.not_send_upd_flg());
				dest.setBooleanNE(
					mcframe.serverPFUD.PFUDL0030.DtlR.$webapi_not_link_flg,
					src.webapi_not_link_flg()
				);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends PFBZL_SendRecvIfCtrl_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			lockAndCheckSendIf(up0());
			updSendIf();
		}

		protected void updSendIf() {
			PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(dbc.not_send_flg, dbc.not_send_upd_flg, dbc.sdrv_if_rmrks);
			builder.addWhereWithAnd(dbc.data_no.eq(bindEx(PFT_SDRV_IF_R.$data_no)));
			
			dbUpdate(createSqlId(LOGIC_ID, dbc, "U01"), up0(), builder);
		}
	}

	/**
	 * Can01オペレーション.<p>
	 *
	 */
	public class Can01 extends PFBZL_SendRecvIfCtrl_MC_A.Can01 {
		@Override
		protected void call() {
			lockAndCheckSendIf(up0());
			updEsbIf();
			updIfFile();
			updSendIf();
			delFile();
		}

		protected void updEsbIf() {
			
			if(isNull(up0()) || up0().isEmpty()) {
				throw new MCException(PFBZL0048);
			}
			
			String bibat = MAC_IF_PROC_TYP.bi_bat(up0().get(0).if_proc_typ());
			if (isSame(bibat, "MABCB0010")) return;
			
			PFBZL_SendRecvIfCtrl.UpdEsb01 ope = PFBZL_SendRecvIfCtrl.crtUpdEsb01();
			for(MCList<Can01_DtlR> subL : up0().groupList(Can01_DtlR.$if_proc_typ)) {
				String tblNm = MAC_IF_PROC_TYP.upd_if_tbl(subL.get(0).if_proc_typ());
				if (isNull(tblNm)) {
					throw new MCException(PFBZL0049);
				}
				setAll(ope.up0(), subL , createMap_UpdEsb01_DtlR_Can01_DtlR());
				ope.setEsbIfTblNm(tblNm);
				ope.setSdrvFlg(true);
				ope.setCanFlg(true);
				ope.exec();
			}
		}
		
		protected Map_UpdEsb01_DtlR_Can01_DtlR<UpdEsb01_DtlR,Can01_DtlR> createMap_UpdEsb01_DtlR_Can01_DtlR() {
			return new Map_UpdEsb01_DtlR_Can01_DtlR<UpdEsb01_DtlR, Can01_DtlR>();
		}

		public class Map_UpdEsb01_DtlR_Can01_DtlR<D extends UpdEsb01_DtlR, S extends Can01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpdEsb01_DtlR.$data_no, SdrvDtlR.$data_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sdrv_sts_typ(MAC_SDRV_STS_TYP.NOTYET.value());
			}
		}
		

		protected void updIfFile() {
			PFT_IF_FILE_R dbc = PFT_IF_FILE_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(PFT_IF_FILE_R.$fproc_typ, dbc.fproc_typ, value(MAC_FPROC_TYP.CANCELED.value()));
			builder.addWhereWithAnd(dbc.file_id.eq(bindEx(PFT_IF_FILE_R.$file_id)));
			
			dbUpdate(createSqlId(LOGIC_ID, dbc, "U02"), up0(), builder);
		}

		protected void updSendIf() {
			PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.conv_ope, nullValue());
			builder.addSetVL(dbc.file_io_ope, nullValue());
			builder.addSetVL(dbc.web_api_ope, nullValue());
			builder.addSetVL(dbc.cmd_exec_ope, nullValue());
			builder.addSet(PFT_SDRV_IF_R.$sdrv_sts_typ, dbc.sdrv_sts_typ, value(MAC_SDRV_STS_TYP.NOTYET.value()));
			builder.addSetVL(dbc.sdrv_tm, nullValue());
			builder.addSetVL(dbc.batch_log_no, nullValue());
			builder.addSetVL(dbc.log_sub_key1, nullValue());
			builder.addSetVL(dbc.log_sub_key2, nullValue());
			builder.addWhereWithAnd(dbc.data_no.eq(bindEx(PFT_SDRV_IF_R.$data_no)));
			
			dbUpdate(createSqlId(LOGIC_ID, dbc, "U03"), up0(), builder);
		}
		
		protected final String _delSuffix = "_Delete";
		protected File _errFile = new File("dummy");
		/**
		 * 送信変換の取消に伴い、ＩＦファイルを削除する
		 */
		protected void delFile() {
			PFT_IF_FILE_R dbc = PFT_IF_FILE_R.create("T");
			MCList<PFT_IF_FILE_R> result = MCList.create(PFT_IF_FILE_R.class);
			dbSelectKey(createSqlId(LOGIC_ID, dbc, "S05"), result, dbc, up0());
			boolean isErr = false;
			MCList<PFT_IF_FILE_R> delFileL = MCList.create(PFT_IF_FILE_R.class);
			for (PFT_IF_FILE_R r : result) {
				File fr = new File(r.file_path(), r.file_nm());
				File to = new File(r.file_path(), r.file_nm() + _delSuffix);
				if (fr.exists()) {
					// リネームしてロックを確認
					if (fr.renameTo(to)) {
						// リネームできた場合は、削除対象に追加
						delFileL.add(r);
					} else {
						// リネームできない場合は、処理を中断
						_errFile = fr;
						isErr = true;
						break;
					}
				}
			}
			if (isErr) {
				// リネームしたファイル名を戻す
				for (PFT_IF_FILE_R r : delFileL) {
					File fr = new File(r.file_path(), r.file_nm() + _delSuffix);
					File to = new File(r.file_path(), r.file_nm());
					fr.renameTo(to);
				}
				throw new MCException(PFBZL0003, _errFile.getParent(), _errFile.getName());
			} else {
				// リネームしたファイルを削除
				for (PFT_IF_FILE_R r : delFileL) {
					File del = new File(r.file_path(), r.file_nm() + _delSuffix);
					del.delete();
				}
			}
		}
	}

	/**
	 * 更新対象のＥＳＢ連携テーブルのステータスを更新する。
	 * @param tblNm 更新対象のＥＳＢ連携テーブル名
	 * @param exeStsTyp　ステータス
	 * @param binds バインド変数
	 */
	protected void updateStatus(String tblNm, MAC_EXE_STS_TYP exeStsTyp, MCList<UpdEsb01_DtlR> binds) {
		Class<?> clazz = createDbcClass(tblNm);
		MCDBContainer dbc = (MCDBContainer)MCFactory.invokeStatic(clazz, "create", new Class[]{String.class}, new Object[]{"T"});
		MCNumberPermColumn data_no = (MCNumberPermColumn)dbc.getColumn$("data_no");
		MCStringPermColumn exe_sts_typ = (MCStringPermColumn)dbc.getColumn$("exe_sts_typ");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		builder.setSet("exe_sts_typ", dbc.getColumn$("exe_sts_typ"), value(exeStsTyp.value()));
		builder.addWhereWithAnd(data_no.eq(bindEx("DATA_NO")));
		builder.addWhereWithAnd(exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value())));
		dbUpdate(createSqlId(LOGIC_ID, dbc, "U04"), binds, builder);
	}

	/**
	 * 送受信ＩＦテーブルのロックと更新カウンタのチェック<p>
	 * @param upL 上り電文
	 */
	protected void lockAndCheckSendIf(MCList<? extends MCRow> upL) {
		PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
		MCList<PFT_SDRV_IF_R> result = MCList.create(PFT_SDRV_IF_R.class);
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.if_proc_typ, t.ext_sys_cd, t.data_no)
			   .addOrderByAsc(t.if_proc_typ, t.ext_sys_cd, t.data_no);
		dbSelectKeyForUpdateNoWait(createSqlId(LOGIC_ID, t, "S01"), result, builder, upL);
		
		checkUpdCntr(upL, _$ifKey, result, _$ifKey);
	}

	//FMCB CUSTOM END
}