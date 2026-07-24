package mcframe.serverMSBC.MSBCL6110;

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
import mcframe.serverMSBC.MSBCL6110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6010.*;
import mcframe.serverMSBC.MSBCL6070.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMSBC.MSBCL6110.Query.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMAUC.MAUCL5010.*;
import java.util.*;
import mcframe.serverMSLA.MSLAL6210.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverMAUC.MAUCL5020.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstActComService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstActComService_MC extends MSBCL_MfgInstActComService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgInstActCom_Chk01オペレーション.<p>
	 *
	 * 製造指図、製造記録の承認前チェックを行う。<br>
	 */
	public class MfgInstActCom_Chk01 extends
			MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Chk01 {

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			setErrToRtnStsTyp();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック、チェック
			msgL.addAll(lockAndChk());
			
			//指図未承認または、記録未承認の場合
			//検査予定サービスの製造承認関連処理前チェック呼出
			if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())) {
				callInspSchdChk02();
			}
			
			return msgL;
		}
		
		/**
		 * 製造指図のロック
		 */
		protected MCMessageList lockAndChk() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MfgInstActCom_Chk01_DtlR> instL = MCList.create(MfgInstActCom_Chk01_DtlR.class);
			MCList<MfgInstActCom_Chk01_DtlR> actL = MCList.create(MfgInstActCom_Chk01_DtlR.class);
			for (MfgInstActCom_Chk01_DtlR r : up1()) {
				instL.add(r);
				if (!isNull(r.mfg_act_no())) {
					actL.add(r);
				}
			}
			
			// 製造指図の取得
			instL.sort(MfgInstActCom_Chk01_DtlR.$mfg_inst_no);
			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R miL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(miL_t);
			MSVT_MFG_INST_PR_R v1 = MSVT_MFG_INST_PR_R.create("V1");
			miL_bldr.setSelect(
					miL_t.mfg_inst_no,
					miL_t.inst_dt,
					miL_t.aprv_flg,
					miL_t.aprv_dt,
					miL_t.mfg_aprv_role_cd,
					miL_t.upd_cntr
					);
			miL_bldr.addSelect(v1.mfg_sts_typ);
			miL_bldr.addInnerJoin(v1, bracket(miL_t.mfg_inst_no.eq(v1.mfg_inst_no)));
			miL_bldr.setOrderByAsc(miL_t.mfg_inst_no);
			dbSelectKeyForUpdateNoWait("MSBCL6110_MST_MFG_INST_S01", miL, miL_bldr,
					instL.groupBy(MfgInstActCom_Chk01_DtlR.$mfg_inst_no));
			
			// 製造実績の取得
			MCList<MST_MFG_ACT_R> maL = MCList.create(MST_MFG_ACT_R.class);
			if (!actL.isEmpty()) {
				actL.sort(MfgInstActCom_Chk01_DtlR.$mfg_act_no);

				MST_MFG_ACT_R maL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(maL_t);
				maL_bldr.setSelect(
						maL_t.mfg_act_no,
						maL_t.end_act_tm,
						maL_t.aprv_dt,
						maL_t.upd_cntr
						);
				maL_bldr.setOrderByAsc(maL_t.mfg_act_no);
				dbSelectKeyForUpdateNoWait("MSBCL6110_MST_MFG_ACT_S01", maL, maL_bldr,
						actL.groupBy(MfgInstActCom_Chk01_DtlR.$mfg_act_no));
			}
			
			MCIndexKey instKey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCIndexKey actKey = maL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
			for (MfgInstActCom_Chk01_DtlR r : up1()) {
				MST_MFG_INST_R miR = miL.getFirst(instKey, r.mfg_inst_no());
				msgL.addAll(checkUpdCntrNE(r, MfgInstActCom_Chk01_DtlR.$mfg_inst_upd_cntr, miR));
				setErrFlg(r, msgL);

				if (!isNull(miR)) {
					if (!miR.aprv_flg()) {
						msgL.add(new MCMessage(r, null, MSBCL1022, r.mfg_inst_no(),
								toDispGUIIndex(r)));
						r.err_flg(true);
					}
					// 指図承認
					if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())) {
						if (r.aprv_dt().lt(miR.inst_dt())) {
							msgL.add(new MCMessage(r, MfgInstActCom_Chk01_DtlR.$aprv_dt,
									MSBCL1073, toYMDString(miR.inst_dt()),
									toYMDString(r.aprv_dt()), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
					// 指図承認取消
					else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())) {
						String mfgStsTyp = miR.getString(MSVT_MFG_INST_PR_R.$mfg_sts_typ);
						if (MSC_MFG_STS_TYP.isSTT(mfgStsTyp)
								|| MSC_MFG_STS_TYP.isCMPL(mfgStsTyp)) {
							msgL.add(new MCMessage(r, null, MSBCL1021, r.mfg_inst_no(),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
						r.aprv_dt(miR.aprv_dt());
					}
					
					r.login_usr_id(mcframe.serverCore.sys.MCSys.user.ID());
					r.mfg_aprv_role_cd(miR.mfg_aprv_role_cd());
				}
				
				if (!isNull(r.mfg_act_no())) {
					MST_MFG_ACT_R maR = maL.getFirst(actKey, r.mfg_act_no());
					if (!r.err_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgInstActCom_Chk01_DtlR.$mfg_act_upd_cntr, maR));
					}
					if (!isNull(maR)) {
						// 記録承認
						if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(up0().mfg_aprv_sts_typ())) {
							if (r.aprv_dt().lt(maR.end_act_tm().startTimeOfDay())) {
								msgL.add(new MCMessage(r, MfgInstActCom_Chk01_DtlR.$aprv_dt,
										MSBCL1074, toYMDString(maR.end_act_tm()),
										toYMDString(r.aprv_dt()), toDispGUIIndex(r)));
								r.err_flg(true);
							}
						}
						// 記録承認取消
						else if (MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())) {
							r.aprv_dt(maR.aprv_dt());
						}
					}
				}
			}
			
			// 承認担当者ビューの取得
			MAVM_APRV_USR_R auProto_t = MAVM_APRV_USR_R.create("T");
			MCQueryApiBuilder auProto_bldr = MCQueryApiBuilder.create(auProto_t);
			auProto_bldr.setSelect(auProto_t.usr_cd);
			FXUCL_MCDbcCacheStEnd<MAVM_APRV_USR_R> auCache = new FXUCL_MCDbcCacheStEnd<MAVM_APRV_USR_R>(
					auProto_bldr, up1(), MfgInstActCom_Chk01_DtlR.$login_usr_id,
					MfgInstActCom_Chk01_DtlR.$mfg_aprv_role_cd);
			
			for (MfgInstActCom_Chk01_DtlR r : up1()) {
				// 権限チェック
				MAVM_APRV_USR_R au = auCache.get(r.aprv_dt(), r.login_usr_id(), r.mfg_aprv_role_cd());
				if (!r.err_flg() && isNull(au.usr_cd())) {
					msgL.add(new MCMessage(r, null, MSUCL0001, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 生産方法区分を補完する
			MCList<MST_ITM_MFG_INST_R> itmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			MCQueryApiBuilder itmMfgInstL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
			dbSelectKey("MSBCL6110_MST_ITM_MFG_INST_S01", itmMfgInstL, itmMfgInstL_bldr, up1());
			MCIndexKey itmMfgInstIdx = itmMfgInstL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			for (MfgInstActCom_Chk01_DtlR r : up1()) {
				MST_ITM_MFG_INST_R itmMfgInstR = itmMfgInstL.getFirst(itmMfgInstIdx, r.itm_mfg_inst_no());
				if (!isNull(itmMfgInstR)) {
					r.mfg_mtd_typ(itmMfgInstR.mfg_mtd_typ());
				}
			}

			if (!MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())
					&& !MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())) {
				return msgL;
			}
			MCList<MfgInstActCom_Chk01_DtlR> subUpL = up1().subList(r -> (!r.err_flg()));
			if (subUpL.isEmpty()) {
				return msgL;
			}
			MCList<MST_MFG_INST_R> sendOkL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R sendOkL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(sendOkL_t);
			PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
			sendOkL_bldr.setSelect(sendOkL_t.mfg_inst_no);
			sendOkL_bldr.setDistinct();
			sendOkL_bldr.addInnerJoin(t1,
					bracket(t1.attr_char1.eq(sendOkL_t.mfg_inst_no)));
			sendOkL_bldr.addWhereWithAnd(sendOkL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			sendOkL_bldr.addConstWhereWithAnd(t1.not_send_upd_flg.eq(value(true))
					.and(t1.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value())))
					.and(t1.if_proc_typ.in(
							value(MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value()),
							value(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value()),
							value(MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value()))));
			dbSelect("MSBCL6110_MST_MFG_INST_S02", sendOkL, sendOkL_bldr, subUpL, null);
			MCIndexKey sendOkIdx = sendOkL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (MfgInstActCom_Chk01_DtlR r : subUpL) {
				MST_MFG_INST_R sendOkR = sendOkL.getFirst(sendOkIdx, r.mfg_inst_no());
				if (!isNull(sendOkR)) {
					msgL.add(new MCMessage(r, null, MSBCL1201, r.mfg_inst_no(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			return msgL;
		}	
		
		protected void callInspSchdChk02() {
			MCList<MfgInstActCom_Chk01_DtlR>  subUpL = up1().subList(MfgInstActCom_Chk01_DtlR.$mfg_mtd_typ, MSC_MFG_MTD_TYP.INTNL.value());
			if (subUpL.isEmpty()) {
				return;
			}
			MSBFL_InspSchdService.InspSchd_Chk02 ope = MSBFL_InspSchdService.crtInspSchd_Chk02();
			addAll(ope.up0(), subUpL, createMap_InspSchd_Chk02_CndR_MfgInstActCom_Chk01_DtlR());
			ope.exec();
			
			copyErrFlg(subUpL, ope.down0());
		}

		protected Map_InspSchd_Chk02_CndR_MfgInstActCom_Chk01_DtlR<InspSchd_Chk02_CndR,MfgInstActCom_Chk01_DtlR> createMap_InspSchd_Chk02_CndR_MfgInstActCom_Chk01_DtlR() {
			return new Map_InspSchd_Chk02_CndR_MfgInstActCom_Chk01_DtlR<InspSchd_Chk02_CndR, MfgInstActCom_Chk01_DtlR>();
		}

		public class Map_InspSchd_Chk02_CndR_MfgInstActCom_Chk01_DtlR<D extends InspSchd_Chk02_CndR, S extends MfgInstActCom_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Chk02_CndR.$peg_no, MfgInstActCom_Chk01_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Chk02_CndR.$mfg_inst_no, MfgInstActCom_Chk01_DtlR.$mfg_inst_no);
				addColumnPathMap(InspSchd_Chk02_CndR.$err_flg, MfgInstActCom_Chk01_DtlR.$err_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mfg_aprv_sts_typ(up0().mfg_aprv_sts_typ());
			}
		}
		
		protected void setDown() {
			if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ()) || MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())) {
				up1().clear(MfgInstActCom_Chk01_DtlR.$aprv_dt);
			}
			down0().addAll(up1());
		}
		
	}

	/**
	 * MfgInstActCom_Upd01オペレーション.<p>
	 *
	 * 製造指図、製造記録を承認する。<br>
	 */
	public class MfgInstActCom_Upd01 extends
			MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd01 {

		// 製造指図承認取消前の製造指図情報取得用
		protected MCList<MST_MFG_INST_R> _mfgInstL = MCList.create(MST_MFG_INST_R.class);
		// 製造記録承認取消前の製造実績情報取得用
		protected MCList<MST_MFG_ACT_R> _mfgActL = MCList.create(MST_MFG_ACT_R.class);
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				if (!up0().lst_reg_flg()) {
					throw e;
				}
				handleEx(e, up1());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();

			callThisChk01();
			
			if (!up0().lst_reg_flg()) {
				throwUpdErr();
			}

			MCList<MfgInstActCom_Chk01_DtlR> getL = up1().subList(MfgInstActCom_Chk01_DtlR.$err_flg, false);
			
			if (getL.isEmpty()) {
				return;
			}
			
			updAprvStsTyp(getL);
			
			// 指図承認、記録承認のプッシュ通知
			callPushNtc();
			
			if(MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())){
				callInspSchdUpd02();
			}
			
			callLotUpd03();
			// 製造指図送信ＩＦサービスの呼び出し
			callMfgInstSendIf();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(MfgInstActCom_Chk01_DtlR.$peg_no, up1());
		}	
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MfgInstActComService.MfgInstActCom_Chk01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			up1().setAll(ope.down0());
		}
		
		/**
		 * 製造指図、実績テーブルの更新
		 */
		/**
		 * @param getL
		 */
		protected void updAprvStsTyp(MCList<MfgInstActCom_Chk01_DtlR> getL){
			for (MfgInstActCom_Chk01_DtlR up1R : getL) {
				up1R.mfg_aprv_sts_typ(up0().mfg_aprv_sts_typ());
			}
			
			if (MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isACT_ACPT(up0().mfg_aprv_sts_typ())) {
				// ---------------記録承認、記録承認取消から呼ばれた場合の処理---------------
				MCList<MST_MFG_ACT_R> updActL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R updActL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder updActL_bldr = MCQueryApiBuilder.create(updActL_t);
				updActL_bldr.setSet(
						updActL_t.mfg_aprv_sts_typ,
						updActL_t.aprv_dt,
						updActL_t.aprv_tm,
						updActL_t.aprv_dpt_cd,
						updActL_t.aprv_usr_cd,
						updActL_t.aprv_rsn
						);
				
				// 製造実績を更新した上り電文のリスト
				for (MfgInstActCom_Chk01_DtlR up1R : getL) {
					MST_MFG_ACT_R tmpR = MST_MFG_ACT_R.create();
					tmpR.mfg_act_no(up1R.mfg_act_no());
					tmpR.mfg_aprv_sts_typ(up1R.mfg_aprv_sts_typ());
					tmpR.aprv_dt(up1R.aprv_dt());
					tmpR.aprv_tm(up1R.aprv_tm());
					tmpR.aprv_dpt_cd(up1R.aprv_dpt_cd());
					tmpR.aprv_usr_cd(up1R.aprv_usr_cd());
					tmpR.aprv_rsn(up1R.aprv_rsn());
					updActL.add(tmpR);
				}
				
				// 記録承認取消の場合は更新前に製造実績情報をプッシュ通知用に取得する。
				if(MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())) {
					MST_MFG_ACT_R mfgActL_t = MST_MFG_ACT_R.create("T");
					MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(mfgActL_t);
					mfgActL_bldr.setWhere(mfgActL_t.mfg_act_no.eq(bind("mfg_act_no")));
					dbSelect("MSBCL6110_MST_MFG_ACT_S02", _mfgActL, mfgActL_bldr, getL);
				}
				
				MCList<MST_MFG_ACT_R> selActL = MCList.create(MST_MFG_ACT_R.class);
				dbUpdateKey("MSBCL6110_MST_MFG_ACT_U01", updActL, updActL_bldr);

				//　製造実績の承認状況に応じて指図の承認状況を更新する必要があるため、製造指図に紐付く製造実績を取得する
				MST_MFG_ACT_R selActL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder selActL_bldr = MCQueryApiBuilder.create(selActL_t);
				MSVT_MFG_INST_PR_R v1 = MSVT_MFG_INST_PR_R.create("V1");
				selActL_bldr.setSelect(
						selActL_t.mfg_inst_no,
						selActL_t.mfg_aprv_sts_typ
						);
				selActL_bldr.addSelect(v1.mfg_sts_typ);
				selActL_bldr.setWhere(selActL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
				selActL_bldr.addInnerJoin(v1, bracket(selActL_t.mfg_inst_no.eq(v1.mfg_inst_no)));
				dbSelect("MSBCL6110_MST_MFG_ACT_S03", selActL, selActL_bldr, up1());
				
				MCList<MST_MFG_INST_R> updInstLByAct = MCList.create(MST_MFG_INST_R.class);
				MCIndexKey idxkey = selActL.createIndex(MST_MFG_ACT_R.$mfg_inst_no);
				for (MfgInstActCom_Chk01_DtlR up1R : up1()) {
					MST_MFG_INST_R tmpR = MST_MFG_INST_R.create();
					tmpR.mfg_inst_no(up1R.mfg_inst_no());
					
					MCList<MST_MFG_ACT_R> subSelActL = selActL.subList(idxkey, up1R.mfg_inst_no());
					
					boolean isAllActAcpt = isSame(
							subSelActL.subList(MST_MFG_ACT_R.$mfg_aprv_sts_typ,
									MSC_MFG_APRV_STS_TYP.ACT_ACPT.value()).size(),
							subSelActL.size());
					
					// 指図に紐付く実績が全て記録承認済かつ、指図が完了（＝未指図数量もない状態）であれば、指図も記録承認済とする
					if (isAllActAcpt && MSC_MFG_STS_TYP.isCMPL(subSelActL.get(0).getStringNE("mfg_sts_typ"))) {
						tmpR.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value());
					}
					else {
						tmpR.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_ACPT.value());
					}
					updInstLByAct.add(tmpR);
				}
				updInstLByAct = updInstLByAct.groupBy(MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$mfg_aprv_sts_typ);
				MST_MFG_INST_R updInstLByAct_t = MST_MFG_INST_R.create("T");
				MCQueryApiBuilder updInstLByAct_bldr = MCQueryApiBuilder.create(updInstLByAct_t);
				updInstLByAct_bldr.setSet(updInstLByAct_t.mfg_aprv_sts_typ);
				dbUpdateKey("MSBCL6110_MST_MFG_INST_U01", updInstLByAct, updInstLByAct_bldr);
				callRevDataIns01(updInstLByAct);
			}
			else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())
					|| MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())) {
				// ---------------指図承認、指図承認取消から呼ばれた場合の処理---------------
				
				// 指図承認取消の場合は更新前に製造指図情報をプッシュ通知用に取得する。
				if(MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())) {
					MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T");
					MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(mfgInstL_t);
					mfgInstL_bldr.setWhere(mfgInstL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
					dbSelect("MSBCL6110_MST_MFG_INST_S03", _mfgInstL, mfgInstL_bldr, getL);
				}
				
				MCList<MST_MFG_INST_R> updInstL = MCList.create(MST_MFG_INST_R.class);
				MST_MFG_INST_R updInstL_t = MST_MFG_INST_R.create("T");
				MCQueryApiBuilder updInstL_bldr = MCQueryApiBuilder.create(updInstL_t);
				updInstL_bldr.setSet(
						updInstL_t.mfg_aprv_sts_typ,
						updInstL_t.aprv_dt,
						updInstL_t.aprv_tm,
						updInstL_t.aprv_dpt_cd,
						updInstL_t.aprv_usr_cd,
						updInstL_t.aprv_rsn
				);
	
				// 製造指図テーブルの更新
				for (MfgInstActCom_Chk01_DtlR r : getL) {
					MST_MFG_INST_R tmpR = MST_MFG_INST_R.create();
					tmpR.mfg_inst_no(r.mfg_inst_no());
					tmpR.mfg_aprv_sts_typ(r.mfg_aprv_sts_typ());
					tmpR.aprv_dt(r.aprv_dt());
					tmpR.aprv_tm(r.aprv_tm());
					tmpR.aprv_dpt_cd(r.aprv_dpt_cd());
					tmpR.aprv_usr_cd(r.aprv_usr_cd());
					tmpR.aprv_rsn(r.aprv_rsn());
					updInstL.add(tmpR);
				}
				dbUpdateKey("MSBCL6110_MST_MFG_INST_U02", updInstL, updInstL_bldr);
				callRevDataIns01(updInstL);
			}
		}
		
		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {
			
			// ---------------記録承認取消から呼ばれた場合の処理---------------
			if (MSC_MFG_APRV_STS_TYP.isACT_OPN(up0().mfg_aprv_sts_typ())) {
				MCIndexKey mfgActKey = _mfgActL.createIndex(MST_MFG_ACT_R.$act_dpt_cd, MST_MFG_ACT_R.$aprv_dt);
				for(MST_MFG_ACT_R r : _mfgActL.groupBy(MST_MFG_ACT_R.$act_dpt_cd, MST_MFG_ACT_R.$aprv_dt)) {
					if(isNull(r.act_dpt_cd())) {
						continue;
					}
					
					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MCList<MST_MFG_ACT_R> tmpL = _mfgActL.subList(mfgActKey, r.act_dpt_cd(), r.aprv_dt());

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RESULT);
					info.setMsg(new MCMessage(MSBCL1066, tmpL.size()));
					info.addDpt(r.act_dpt_cd(), nvl(r.aprv_dt(), getToday()));
					info.addScrBind(false, false, false, true, MSC_MFG_APRV_STS_TYP.ACT_OPN.value(), MSC_MFG_INST_PR_SRCH_DISP2.DISP_ACT.value(), null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));
					
					mgr.exec();	
				}
			}
			// ---------------記録承認から呼ばれた場合の処理---------------
			else if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(up0().mfg_aprv_sts_typ())) {
				MCList<MST_MFG_ACT_R> mfgActL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R mfgActL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(mfgActL_t);

				mfgActL_bldr.setWhere(mfgActL_t.mfg_act_no.eq(bind("mfg_act_no")));
				dbSelect("MSBCL6110_MST_MFG_ACT_S04", mfgActL, mfgActL_bldr, up1());
				
				MCIndexKey mfgActKey = mfgActL.createIndex(MST_MFG_ACT_R.$act_dpt_cd, MST_MFG_ACT_R.$aprv_dt);
				for(MST_MFG_ACT_R r : mfgActL.groupBy(MST_MFG_ACT_R.$act_dpt_cd, MST_MFG_ACT_R.$aprv_dt)) {
					if(isNull(r.act_dpt_cd())) {
						continue;
					}
					
					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MCList<MST_MFG_ACT_R> tmpL = mfgActL.subList(mfgActKey, r.act_dpt_cd(), r.aprv_dt());

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RESULT);
					info.setMsg(new MCMessage(MSBCL1065, tmpL.size()));
					info.addDpt(r.act_dpt_cd(), r.aprv_dt());
					info.addScrBind(false, false, false, true, MSC_MFG_APRV_STS_TYP.ACT_ACPT.value(), MSC_MFG_INST_PR_SRCH_DISP2.DISP_ACT.value(), toYMDString(r.aprv_dt()), toYMDString(r.aprv_dt()), null, null);
					
					mgr.exec();	
				}
			}
			// ---------------指図承認取消から呼ばれた場合の処理---------------
			else if (MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())) {
				MCIndexKey mfgInstKey = _mfgInstL.createIndex(MST_MFG_INST_R.$inst_dpt_cd, MST_MFG_INST_R.$aprv_dt);
				for(MST_MFG_INST_R r : _mfgInstL.groupBy(MST_MFG_INST_R.$inst_dpt_cd, MST_MFG_INST_R.$aprv_dt)) {
					if(isNull(r.inst_dpt_cd())) {
						continue;
					}
					
					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MCList<MST_MFG_INST_R> tmpL = _mfgInstL.subList(mfgInstKey, r.inst_dpt_cd(), r.aprv_dt());

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_INST_APRV_RESULT);
					info.setMsg(new MCMessage(MSBCL1062, tmpL.size()));
					info.addDpt(r.inst_dpt_cd(), nvl(r.aprv_dt(), getToday()));
					info.addScrBind(false, true, false, false, MSC_MFG_APRV_STS_TYP.INST_OPN.value(), MSC_MFG_INST_PR_SRCH_DISP2.DISP_INST.value(), null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));
					
					mgr.exec();
				}
			}			
			// ---------------指図承認から呼ばれた場合の処理---------------
			else if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())) {
				MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
				MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T");
				MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(mfgInstL_t);

				mfgInstL_bldr.setWhere(mfgInstL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
				dbSelect("MSBCL6110_MST_MFG_INST_S04", mfgInstL, mfgInstL_bldr, up1());
				
				MCIndexKey mfgInstKey = mfgInstL.createIndex(MST_MFG_INST_R.$inst_dpt_cd, MST_MFG_INST_R.$aprv_dt);
				for(MST_MFG_INST_R r : mfgInstL.groupBy(MST_MFG_INST_R.$inst_dpt_cd, MST_MFG_INST_R.$aprv_dt)) {
					if(isNull(r.inst_dpt_cd())) {
						continue;
					}
					
					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MCList<MST_MFG_INST_R> tmpL = mfgInstL.subList(mfgInstKey, r.inst_dpt_cd(), r.aprv_dt());

					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_INST_APRV_RESULT);
					info.setMsg(new MCMessage(MSBCL1061, tmpL.size()));
					info.addDpt(r.inst_dpt_cd(), nvl(r.aprv_dt(), getToday()));
					info.addScrBind(false, true, false, false, MSC_MFG_APRV_STS_TYP.INST_ACPT.value(), MSC_MFG_INST_PR_SRCH_DISP2.DISP_INST.value(), toYMDString(r.aprv_dt()), toYMDString(r.aprv_dt()), null, null);
					
					mgr.exec();
				}
			}
		}

		
		/**
		 * 製造指図承認、承認取消時の検査予定状況の更新
		 */
		protected void callInspSchdUpd02() {
			MCIndexKey idxkey = up1().createIndex(MfgInstActCom_Chk01_DtlR.$mfg_mtd_typ, MfgInstActCom_Chk01_DtlR.$err_flg);
			MCList<MfgInstActCom_Chk01_DtlR>  subUpL = up1().subList(idxkey, MSC_MFG_MTD_TYP.INTNL.value(), false);
			if (subUpL.isEmpty()) {
				return;
			}
			MSBFL_InspSchdService.InspSchd_Upd02 ope = MSBFL_InspSchdService.crtInspSchd_Upd02();
			addAll(ope.up0(), subUpL, createMap_InspSchd_Upd02_CndR_MfgInstActCom_Chk01_DtlR());
			ope.exec();
		}
		
		protected Map_InspSchd_Upd02_CndR_MfgInstActCom_Chk01_DtlR<InspSchd_Upd02_CndR,MfgInstActCom_Chk01_DtlR> createMap_InspSchd_Upd02_CndR_MfgInstActCom_Chk01_DtlR() {
			return new Map_InspSchd_Upd02_CndR_MfgInstActCom_Chk01_DtlR<InspSchd_Upd02_CndR, MfgInstActCom_Chk01_DtlR>();
		}

		public class Map_InspSchd_Upd02_CndR_MfgInstActCom_Chk01_DtlR<D extends InspSchd_Upd02_CndR, S extends MfgInstActCom_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd02_CndR.$mfg_inst_no, MfgInstActCom_Chk01_DtlR.$mfg_inst_no);
				addColumnPathMap(InspSchd_Upd02_CndR.$peg_no, MfgInstActCom_Chk01_DtlR.$peg_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mfg_aprv_sts_typ(up0().mfg_aprv_sts_typ());
			}
		}
		
		/**
		 * ロット管理情報の更新
		 */
		protected void callLotUpd03() {
			MSBFL_LotService.Lot_Upd03 ope = MSBFL_LotService.crtLot_Upd03();
			addAll(ope.up0(), up1(), createMap_Lot_Upd03_CndR_MfgInstActCom_Chk01_DtlR());
			ope.exec();
		}
		
		/**
		 * 製造指図送信ＩＦサービスを呼び出す
		 */
		protected void callMfgInstSendIf() {
			if (!MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ()) && !MSC_MFG_APRV_STS_TYP.isINST_OPN(up0().mfg_aprv_sts_typ())) {
				return;
			}
			MCList<MST_OPER_INST_R> operInstL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder operInstL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t1 = MST_ITM_MFG_INST_R.create("T1");
			operInstL_bldr.setSelect(t.oper_inst_no);
			operInstL_bldr.addSelect(t.oper_cd);
			operInstL_bldr.addSelect(t1.itm_cd);
			operInstL_bldr.addSelect(t1.itm_sub1);
			operInstL_bldr.addSelect(t1.itm_sub2);
			operInstL_bldr.addSelect(t1.itm_sub3);
			operInstL_bldr.addSelect(t1.mfg_loc_cd);
			operInstL_bldr.addInnerJoin(t1, bracket(t.itm_mfg_inst_no.eq(t1.itm_mfg_inst_no)));
			operInstL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			operInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_OPER_INST_S01", operInstL, operInstL_bldr, up1().subList(MfgInstActCom_Chk01_DtlR.$err_flg, false));

			if (operInstL.isEmpty()) {
				return;
			}
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil
					.crtSCMLinkUtil_Srch02();

			operInstL.addNumberColumn("peg_no");
			setPegNo(operInstL);

			for (MST_OPER_INST_R operR : operInstL) {
				SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
				cndR.peg_no(operR.getNumberNE("peg_no"));
				cndR.loc_cd(operR.getStringNE("mfg_loc_cd"));
				cndR.itm_cd(operR.getStringNE("itm_cd"));
				cndR.itm_sub1(operR.getStringNE("itm_sub1"));
				cndR.itm_sub2(operR.getStringNE("itm_sub2"));
				cndR.itm_sub3(operR.getStringNE("itm_sub3"));
				cndR.oper_cd(operR.oper_cd());
				cndR.master_dt(getToday());

				ope.up0().add(cndR);
			}

			ope.exec();

			String[] destCols = new String[] {
					MST_OPER_INST_R.$mes_flg
			};
			String[] srcCols = new String[] {
					SCMLinkUtil_Srch02_CndR.$mes_flg
			};
			copyByPegNo(operInstL, destCols, ope.down0(), srcCols);
			
			String strCrudTyp;
			if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(up0().mfg_aprv_sts_typ())) {
				strCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
			}
			else {
				strCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
			}
			
			MSLAL_MfgInstSendIfService.MfgInstSendIf_Upd01 sendOpe = MSLAL_MfgInstSendIfService.crtMfgInstSendIf_Upd01();
			for (MST_OPER_INST_R operR : operInstL.subList(MST_OPER_INST_R.$mes_flg, true)) {
				MfgInstSendIf_Upd01_DtlOperR ifRow = sendOpe.up0().add();
				ifRow.oper_inst_no(operR.oper_inst_no());
				ifRow.data_crud_typ(strCrudTyp);
			}

			if (!sendOpe.up0().isEmpty()) {
				sendOpe.exec();
			}
		}

		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<MST_MFG_INST_R> argL) {
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			for (MST_MFG_INST_R r : argL) {
				MST_MFG_INST_R wkR = MST_MFG_INST_R.create();
				wkR.mfg_inst_no(r.mfg_inst_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6110_MSW_MFG_INST_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_MFG_INST_I01",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());
			
			MCList<MST_MFG_INST_R> hdrL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R hdrL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(hdrL_t);
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");
			hdrL_bldr.addInnerJoin(w, bracket(hdrL_t.mfg_inst_no.eq(w.mfg_inst_no)));
			dbSelect("MSBCL6110_MST_MFG_INST_S05", hdrL, hdrL_bldr);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_MFG_INST_R hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.mfg_inst_no());
				opeR.rev_no(hdrR.mfg_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_MFG_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		protected Map_Lot_Upd03_CndR_MfgInstActCom_Chk01_DtlR<Lot_Upd03_CndR,MfgInstActCom_Chk01_DtlR> createMap_Lot_Upd03_CndR_MfgInstActCom_Chk01_DtlR() {
			return new Map_Lot_Upd03_CndR_MfgInstActCom_Chk01_DtlR<Lot_Upd03_CndR, MfgInstActCom_Chk01_DtlR>();
		}

		public class Map_Lot_Upd03_CndR_MfgInstActCom_Chk01_DtlR<D extends Lot_Upd03_CndR, S extends MfgInstActCom_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd03_CndR.$itm_mfg_inst_no, MfgInstActCom_Chk01_DtlR.$itm_mfg_inst_no);
			}
		}
		
		protected void handleSuccess(MCList<MfgInstActCom_Chk01_DtlR> l) {
			if (up0().lst_reg_flg()) {
				dbTran().commit();
			}
			for (MfgInstActCom_Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e,
				MCList<MfgInstActCom_Chk01_DtlR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (MfgInstActCom_Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MSC_MFG_APRV_STS_TYP.putNameNE(up1(),
					MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ,
					MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ_nm, getUsrLocale());
			down0().setAll(up1());
		}
	}
	
	/**
	 * MfgInstActCom_Upd02オペレーション.<p>
	 *
	 * 品目製造指図ＮＯまたは製造実績ＮＯから引継対象子品目の情報を親品目に設定する。<br>
	 */
	public class MfgInstActCom_Upd02 extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MSBFL_LotService.Lot_Upd06 lotUpdOpe = MSBFL_LotService.crtLot_Upd06();
			
			setSrvUpByAct(lotUpdOpe);
			
			setSrvUpBySchd(lotUpdOpe);
			
			if (!lotUpdOpe.up0().isEmpty() && !lotUpdOpe.up1().isEmpty()) {
				lotUpdOpe.exec();
			}
		}
		
		protected int _pegNoCnt = 0;

		/**
		 * 投入実績を元にロット情報サービスの上り電文を作成する
		 * @param lotUpdOpe
		 */
		protected void setSrvUpByAct(MSBFL_LotService.Lot_Upd06 lotUpdOpe) {
			
			setSrvUpByActForItm(lotUpdOpe);

			setSrvUpByActForOper(lotUpdOpe);
		}

		/**
		 * 投入実績を元にロット情報サービスの上り電文を作成する（品目単位）
		 * @param lotUpdOpe
		 */
		protected void setSrvUpByActForItm(MSBFL_LotService.Lot_Upd06 lotUpdOpe) {
			MCList<MST_MFG_ACT_R> wkL = MCList.create(MST_MFG_ACT_R.class);
			for (MfgInstActCom_Upd02_CndR r : up0()) {
				if (!isNull(r.mfg_act_no())) {
					MST_MFG_ACT_R wkR = MST_MFG_ACT_R.create();
					wkR.mfg_act_no(r.mfg_act_no());
					wkL.add(wkR);
				}
			}
			
			if (wkL.isEmpty()) {
				return;
			}

			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
			dbWkDelete("MSBCL6110_MSW_MFG_ACT_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_MFG_ACT_I01",
					wkL.groupBy(MST_MFG_ACT_R.$mfg_act_no), wkL_bldr.getBaseDbc());

			MCList<MfgInstActCom_Upd02_InptR> tmpL = MCList.create(MfgInstActCom_Upd02_InptR.class);

			executeQuery(tmpL, MSBCL6110_MST_INPT_ACT_S01());
			if (tmpL.isEmpty()) {
				return;
			}
			
			MCList<MfgInstActCom_Upd02_InptR> inptL = MCList.create(MfgInstActCom_Upd02_InptR.class);
			for (MCList<MfgInstActCom_Upd02_InptR> gL : tmpL.groupList(MfgInstActCom_Upd02_InptR.$mfg_act_no)) {
				// 有効期限、最古入庫日、ロットシーケンスを元に引継ぎ対象の子品目を１件取得する
				gL.sort(MfgInstActCom_Upd02_InptR.$vld_dt,
						MfgInstActCom_Upd02_InptR.$first_gr_dt,
						MfgInstActCom_Upd02_InptR.$lot_seq);
				inptL.add(gL.get(0));
			}
			
			// 投入実績が取得できた製造実績ＮＯについては、出来高実績を取得する
			wkL.clear();
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				MST_MFG_ACT_R wkR = MST_MFG_ACT_R.create();
				wkR.mfg_act_no(inptR.mfg_act_no());
				wkL.add(wkR);
			}
			
			MCList<MfgInstActCom_Upd02_YieldR> yieldL = MCList.create(MfgInstActCom_Upd02_YieldR.class);
			dbWkDelete("MSBCL6110_MSW_MFG_ACT_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_MFG_ACT_I02", wkL, wkL_bldr.getBaseDbc());
			executeQuery(yieldL, MSBCL6110_MSVT_YIELD_ACT_LOT_S01());
			
			if (yieldL.isEmpty()) {
				return;
			}
			
			editYieldLByAct(yieldL);
			
			MCIndexKey upKey = up0().createIndex(MfgInstActCom_Upd02_CndR.$mfg_act_no);
			MCIndexKey yieldKey = yieldL.createIndex(MfgInstActCom_Upd02_YieldR.$mfg_act_no);
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				MCList<MfgInstActCom_Upd02_CndR> upL = up0().subList(upKey, inptR.mfg_act_no());
				// 投入実績が取得できた製造実績ＮＯについては、投入予定の取得が不要なため目印をつける
				upL.setBoolean(MfgInstActCom_Upd02_CndR.$act_flg, true);
				inptR.peg_no(_pegNoCnt);
				yieldL.subList(yieldKey, inptR.mfg_act_no())
						.setNumber(MfgInstActCom_Upd02_YieldR.$chd_peg_no, inptR.peg_no());
				_pegNoCnt++;
			}
			
			addAll(lotUpdOpe.up0(), inptL, createMap_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR());
			addAll(lotUpdOpe.up1(), yieldL, createMap_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR());
		}

		/**
		 * 投入実績を元にロット情報サービスの上り電文を作成する（工程単位）
		 * @param lotUpdOpe
		 */
		protected void setSrvUpByActForOper(MSBFL_LotService.Lot_Upd06 lotUpdOpe) {
			MCList<MST_MFG_ACT_R> wkL = MCList.create(MST_MFG_ACT_R.class);
			for (MfgInstActCom_Upd02_CndR r : up0()) {
				if (!isNull(r.mfg_act_no())) {
					MST_MFG_ACT_R wkR = MST_MFG_ACT_R.create();
					wkR.mfg_act_no(r.mfg_act_no());
					wkL.add(wkR);
				}
			}
			
			if (wkL.isEmpty()) {
				return;
			}

			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
			dbWkDelete("MSBCL6110_MSW_MFG_ACT_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_MFG_ACT_I03",
					wkL.groupBy(MST_MFG_ACT_R.$mfg_act_no), wkL_bldr.getBaseDbc());

			MCList<MfgInstActCom_Upd02_InptR> tmpL = MCList.create(MfgInstActCom_Upd02_InptR.class);

			executeQuery(tmpL, MSBCL6110_MST_INPT_ACT_S02());
			if (tmpL.isEmpty()) {
				return;
			}
			
			MCList<MfgInstActCom_Upd02_InptR> inptL = MCList.create(MfgInstActCom_Upd02_InptR.class);
			for (MCList<MfgInstActCom_Upd02_InptR> gL : tmpL.groupList(MfgInstActCom_Upd02_InptR.$itm_mfg_inst_no)) {
				// 有効期限、最古入庫日、ロットシーケンスを元に引継ぎ対象の子品目を１件取得する
				gL.sort(MfgInstActCom_Upd02_InptR.$vld_dt,
						MfgInstActCom_Upd02_InptR.$first_gr_dt,
						MfgInstActCom_Upd02_InptR.$lot_seq);
				inptL.add(gL.get(0));
			}
			
			// 投入実績が取得できた品目製造指図ＮＯについては、出来高実績を取得する
			MCList<MST_ITM_MFG_INST_R> instWkL = MCList.create(MST_ITM_MFG_INST_R.class);
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				MST_ITM_MFG_INST_R wkR = MST_ITM_MFG_INST_R.create();
				wkR.itm_mfg_inst_no(inptR.itm_mfg_inst_no());
				instWkL.add(wkR);
			}
			
			MCList<MfgInstActCom_Upd02_YieldR> yieldL = MCList.create(MfgInstActCom_Upd02_YieldR.class);
			MCQueryApiBuilder instWkL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6110_MSW_ITM_MFG_INST_D01", instWkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_ITM_MFG_INST_I01", instWkL, instWkL_bldr.getBaseDbc());
			executeQuery(yieldL, MSBCL6110_MSVT_YIELD_ACT_LOT_S02());
			
			if (yieldL.isEmpty()) {
				return;
			}
			
			editYieldLByAct(yieldL);
			
			MCIndexKey upKey = up0().createIndex(MfgInstActCom_Upd02_CndR.$itm_mfg_inst_no);
			MCIndexKey yieldKey = yieldL.createIndex(MfgInstActCom_Upd02_YieldR.$itm_mfg_inst_no);
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				MCList<MfgInstActCom_Upd02_CndR> upL = up0().subList(upKey, inptR.itm_mfg_inst_no());
				// 投入実績が取得できた品目製造指図ＮＯについては、投入予定の取得が不要なため目印をつける
				upL.setBoolean(MfgInstActCom_Upd02_CndR.$act_flg, true);
				inptR.peg_no(_pegNoCnt);
				yieldL.subList(yieldKey, inptR.itm_mfg_inst_no())
						.setNumber(MfgInstActCom_Upd02_YieldR.$chd_peg_no, inptR.peg_no());
				_pegNoCnt++;
			}
			
			addAll(lotUpdOpe.up0(), inptL, createMap_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR());
			addAll(lotUpdOpe.up1(), yieldL, createMap_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR());
		}
		
		protected void editYieldLByAct(MCList<MfgInstActCom_Upd02_YieldR> yieldL) {
			// 最終的にyieldLから取り除くためのリストを作成
			MCList<MfgInstActCom_Upd02_YieldR> removeL = MCList.create(MfgInstActCom_Upd02_YieldR.class);
			
			// yieldLの品目・ロット情報をもとに、出来高実績を検索する。
			MCList<MSVT_YIELD_ACT_LOT_R> yieldActLotL = MCList.create(MSVT_YIELD_ACT_LOT_R.class);
			yieldActLotL = searchYieldAct(yieldL);
			
			MCIndexKey yieldActLotIdx = yieldActLotL.createIndex(
					MSVT_YIELD_ACT_LOT_R.$itm_cd,
					MSVT_YIELD_ACT_LOT_R.$itm_sub1,
					MSVT_YIELD_ACT_LOT_R.$itm_sub2,
					MSVT_YIELD_ACT_LOT_R.$itm_sub3,
					MSVT_YIELD_ACT_LOT_R.$lot_no,
					MSVT_YIELD_ACT_LOT_R.$sublot_no);
			MCList<MSVT_YIELD_ACT_LOT_R> tgtYieldActLotL = MCList.create(MSVT_YIELD_ACT_LOT_R.class);
			
			for (MfgInstActCom_Upd02_YieldR yieldR : yieldL) {
				tgtYieldActLotL = yieldActLotL.subList(yieldActLotIdx,
						yieldR.itm_cd(),
						yieldR.itm_sub1(),
						yieldR.itm_sub2(),
						yieldR.itm_sub3(),
						yieldR.lot_no(),
						yieldR.sublot_no());
				
				// 同一製造実績ＮＯ内で複数の出来高実績がある場合を考慮して、製造実績ＮＯの重複を除く
				tgtYieldActLotL = tgtYieldActLotL.distinctNE(MST_YIELD_ACT_R.$mfg_act_no);
				
				// 親品目のロットに有効期限、使用期限が設定されているかどうかで分岐
				if (!isNull(tgtYieldActLotL.get(0).getDateNE(MST_LOT_R.$vld_dt))
						|| !isNull(tgtYieldActLotL.get(0).getDateNE(MST_LOT_R.$lmt_dt))){
					if (tgtYieldActLotL.size() > 1) {
						// ２件以上取得で更新対象外
						removeL.add(yieldR);
					}
					else if (isSame(tgtYieldActLotL.size(), 1)) {
						// １件取得の場合、自身の製造実績ＮＯでなければ更新対象外
						if (!isSame(yieldR.mfg_act_no(), tgtYieldActLotL.get(0).mfg_act_no())) {
							removeL.add(yieldR);
						}
					}
				}
			}
			
			// yieldLから更新対象外のレコードを除く
			yieldL.removeAll(removeL);
		}
		
		protected MCList<MSVT_YIELD_ACT_LOT_R> searchYieldAct(MCList<MfgInstActCom_Upd02_YieldR> yieldL) {
			MCList<MSVT_YIELD_ACT_LOT_R> yieldActLotL = MCList.create(MSVT_YIELD_ACT_LOT_R.class);
			MSVT_YIELD_ACT_LOT_R yieldActLotR = MSVT_YIELD_ACT_LOT_R.create("T");
			MST_LOT_R lotR = MST_LOT_R.create("T2");
			MCQueryApiBuilder yieldActLotR_bldr = MCQueryApiBuilder.create(yieldActLotR);
			
			yieldActLotR_bldr.addSelect(lotR.vld_dt, lotR.lmt_dt);
			yieldActLotR_bldr.addLeftOuterJoin(lotR, bracket(
					lotR.itm_cd.eq(yieldActLotR.itm_cd))
					.and(lotR.itm_sub1.eq(yieldActLotR.itm_sub1))
					.and(lotR.itm_sub2.eq(yieldActLotR.itm_sub2))
					.and(lotR.itm_sub3.eq(yieldActLotR.itm_sub3))
					.and(lotR.lot_no.eq(yieldActLotR.lot_no))
					.and(lotR.sublot_no.eq(yieldActLotR.sublot_no)));
			
			yieldActLotR_bldr.setWhere(yieldActLotR.itm_cd.eq(bind("itm_cd")));
			yieldActLotR_bldr.addWhereWithAnd(yieldActLotR.itm_sub1.eq(bind("itm_sub1")));
			yieldActLotR_bldr.addWhereWithAnd(yieldActLotR.itm_sub2.eq(bind("itm_sub2")));
			yieldActLotR_bldr.addWhereWithAnd(yieldActLotR.itm_sub3.eq(bind("itm_sub3")));
			yieldActLotR_bldr.addWhereWithAnd(yieldActLotR.lot_no.eq(bind("lot_no")));
			yieldActLotR_bldr.addWhereWithAnd(yieldActLotR.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBCL6110_MST_YIELD_ACT_S04", yieldActLotL, yieldActLotR_bldr, yieldL);
			
			return yieldActLotL;
		}
		
		/**
		 * 投入予定を元にロット情報サービスの上り電文を作成する
		 * @param lotUpdOpe
		 */
		protected void setSrvUpBySchd(MSBFL_LotService.Lot_Upd06 lotUpdOpe) {
			MCList<MST_ITM_MFG_INST_R> wkL = MCList.create(MST_ITM_MFG_INST_R.class);
			for (MfgInstActCom_Upd02_CndR r : up0()) {
				// 投入実績を元に取得した行については、投入予定を元に取得はしない
				if (!r.act_flg() && !isNull(r.itm_mfg_inst_no())) {
					MST_ITM_MFG_INST_R wkR = MST_ITM_MFG_INST_R.create();
					wkR.itm_mfg_inst_no(r.itm_mfg_inst_no());
					wkL.add(wkR);
				}
			}
			
			if (wkL.isEmpty()) {
				return;
			}

			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6110_MSW_ITM_MFG_INST_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_ITM_MFG_INST_I02",
					wkL.groupBy(MST_ITM_MFG_INST_R.$itm_mfg_inst_no), wkL_bldr.getBaseDbc());
			
			MCList<MfgInstActCom_Upd02_InptR> tmpL = MCList.create(MfgInstActCom_Upd02_InptR.class);
			executeQuery(tmpL, MSBCL6110_MST_INPT_SCHD_S02());
			
			if (tmpL.isEmpty()) {
				return;
			}
			
			MCList<MfgInstActCom_Upd02_InptR> inptL = MCList.create(MfgInstActCom_Upd02_InptR.class);
			for (MCList<MfgInstActCom_Upd02_InptR> gL : tmpL.groupList(MfgInstActCom_Upd02_InptR.$itm_mfg_inst_no)) {
				// 有効期限、最古入庫日、ロットシーケンスを元に引継ぎ対象の子品目を１件取得する
				gL.sort(MfgInstActCom_Upd02_InptR.$vld_dt,
						MfgInstActCom_Upd02_InptR.$first_gr_dt,
						MfgInstActCom_Upd02_InptR.$lot_seq);
				inptL.add(gL.get(0));
			}
			
			// 投入予定が取得できた製造指図ＮＯについては、出来高予定を取得する
			wkL.clear();
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				MST_ITM_MFG_INST_R wkR = MST_ITM_MFG_INST_R.create();
				wkR.itm_mfg_inst_no(inptR.itm_mfg_inst_no());
				wkL.add(wkR);
			}
			
			MCList<MfgInstActCom_Upd02_YieldR> yieldL = MCList.create(MfgInstActCom_Upd02_YieldR.class);
			dbWkDelete("MSBCL6110_MSW_ITM_MFG_INST_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6110_MSW_ITM_MFG_INST_I03", wkL, wkL_bldr.getBaseDbc());
			executeQuery(yieldL, MSBCL6110_MST_YIELD_SCHD_S03());

			if (yieldL.isEmpty()) {
				return;
			}
			
			editYieldLBySchd(yieldL);
			
			MCIndexKey yieldKey = yieldL.createIndex(MfgInstActCom_Upd02_YieldR.$itm_mfg_inst_no);
			for (MfgInstActCom_Upd02_InptR inptR : inptL) {
				inptR.peg_no(_pegNoCnt);
				yieldL.subList(yieldKey, inptR.itm_mfg_inst_no())
						.setNumber(MfgInstActCom_Upd02_YieldR.$chd_peg_no, inptR.peg_no());
				_pegNoCnt++;
			}
			
			addAll(lotUpdOpe.up0(), inptL, createMap_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR());
			addAll(lotUpdOpe.up1(), yieldL, createMap_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR());
		}
		
		protected void editYieldLBySchd(MCList<MfgInstActCom_Upd02_YieldR> yieldL) {
			// 最終的にyieldLから取り除くためのリストを作成
			MCList<MfgInstActCom_Upd02_YieldR> removeL = MCList.create(MfgInstActCom_Upd02_YieldR.class);
			
			// yieldLの品目・ロット情報をもとに、品目製造指図を検索する。
			MCList<MST_ITM_MFG_INST_R> itmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			itmMfgInstL = searchItmMfgInst(yieldL);
			
			MCIndexKey itmMfgInstIdx = itmMfgInstL.createIndex(
					MST_YIELD_ACT_R.$itm_cd,
					MST_YIELD_ACT_R.$itm_sub1,
					MST_YIELD_ACT_R.$itm_sub2,
					MST_YIELD_ACT_R.$itm_sub3,
					MST_YIELD_ACT_R.$lot_no,
					MST_YIELD_ACT_R.$sublot_no);
			MCList<MST_ITM_MFG_INST_R> tgtItmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			
			for (MfgInstActCom_Upd02_YieldR yieldR : yieldL) {
				tgtItmMfgInstL = itmMfgInstL.subList(itmMfgInstIdx,
						yieldR.itm_cd(),
						yieldR.itm_sub1(),
						yieldR.itm_sub2(),
						yieldR.itm_sub3(),
						yieldR.lot_no(),
						yieldR.sublot_no());
				
				// 出来高予定に対応する品目製造指図が見つからなかった場合の考慮
				if (isNull(tgtItmMfgInstL)) {
					continue;
				}
				
				// 親品目のロットに有効期限、使用期限が設定されているかどうかで分岐
				if (!isNull(tgtItmMfgInstL.get(0).getDateNE(MST_LOT_R.$vld_dt))
						|| !isNull(tgtItmMfgInstL.get(0).getDateNE(MST_LOT_R.$lmt_dt))){
					if (tgtItmMfgInstL.size() > 1) {
						// ２件以上取得で更新対象外
						removeL.add(yieldR);
					}
					else if (isSame(tgtItmMfgInstL.size(), 1)) {
						// １件取得の場合、自身の品目製造指図ＮＯでなければ更新対象外
						if (!isSame(yieldR.itm_mfg_inst_no(), tgtItmMfgInstL.get(0).itm_mfg_inst_no())) {
							removeL.add(yieldR);
						}
					}
				}
				
			}
			
			// yieldLから更新対象外のレコードを除く
			yieldL.removeAll(removeL);
		}
		
		protected MCList<MST_ITM_MFG_INST_R> searchItmMfgInst(MCList<MfgInstActCom_Upd02_YieldR> yieldL) {
			MCList<MST_ITM_MFG_INST_R> itmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R itmMfgInstR = MST_ITM_MFG_INST_R.create("T");
			MST_LOT_R lotR = MST_LOT_R.create("T2");
			MCQueryApiBuilder itmMfgInstR_bldr = MCQueryApiBuilder.create(itmMfgInstR);
			
			itmMfgInstR_bldr.addSelect(lotR.vld_dt, lotR.lmt_dt);
			itmMfgInstR_bldr.addLeftOuterJoin(lotR, bracket(
					lotR.itm_cd.eq(itmMfgInstR.itm_cd))
					.and(lotR.itm_sub1.eq(itmMfgInstR.itm_sub1))
					.and(lotR.itm_sub2.eq(itmMfgInstR.itm_sub2))
					.and(lotR.itm_sub3.eq(itmMfgInstR.itm_sub3))
					.and(lotR.lot_no.eq(itmMfgInstR.lot_no))
					.and(lotR.sublot_no.eq(itmMfgInstR.sublot_no)));
			
			itmMfgInstR_bldr.setWhere(itmMfgInstR.itm_cd.eq(bind("itm_cd")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub1.eq(bind("itm_sub1")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub2.eq(bind("itm_sub2")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub3.eq(bind("itm_sub3")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.lot_no.eq(bind("lot_no")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.sublot_no.eq(bind("sublot_no")));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_ITM_MFG_INST_S03", itmMfgInstL, itmMfgInstR_bldr, yieldL);
			
			return itmMfgInstL;
		}
		
		protected Map_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR<Lot_Upd06_DtlChdR,MfgInstActCom_Upd02_InptR> createMap_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR() {
			return new Map_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR<Lot_Upd06_DtlChdR, MfgInstActCom_Upd02_InptR>();
		}

		public class Map_Lot_Upd06_DtlChdR_MfgInstActCom_Upd02_InptR<D extends Lot_Upd06_DtlChdR, S extends MfgInstActCom_Upd02_InptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd06_DtlChdR.$peg_no, MfgInstActCom_Upd02_InptR.$peg_no);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_itm_cd, MfgInstActCom_Upd02_InptR.$main_itm_cd);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_itm_sub1, MfgInstActCom_Upd02_InptR.$main_itm_sub1);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_itm_sub2, MfgInstActCom_Upd02_InptR.$main_itm_sub2);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_itm_sub3, MfgInstActCom_Upd02_InptR.$main_itm_sub3);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_lot_no, MfgInstActCom_Upd02_InptR.$main_lot_no);
				addColumnPathMap(Lot_Upd06_DtlChdR.$main_sublot_no, MfgInstActCom_Upd02_InptR.$main_sublot_no);
				addColumnPathMap(Lot_Upd06_DtlChdR.$sublot_mng_typ, MfgInstActCom_Upd02_InptR.$sublot_mng_typ);
				addColumnPathMap(Lot_Upd06_DtlChdR.$vld_dt, MfgInstActCom_Upd02_InptR.$vld_dt);
				addColumnPathMap(Lot_Upd06_DtlChdR.$lmt_dt, MfgInstActCom_Upd02_InptR.$lmt_dt);
				addColumnPathMap(Lot_Upd06_DtlChdR.$lmt_dt_frm, MfgInstActCom_Upd02_InptR.$lmt_dt_frm);

			}
		}
		
		protected Map_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR<Lot_Upd06_DtlParR,MfgInstActCom_Upd02_YieldR> createMap_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR() {
			return new Map_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR<Lot_Upd06_DtlParR, MfgInstActCom_Upd02_YieldR>();
		}

		public class Map_Lot_Upd06_DtlParR_MfgInstActCom_Upd02_YieldR<D extends Lot_Upd06_DtlParR, S extends MfgInstActCom_Upd02_YieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd06_DtlParR.$chd_peg_no, MfgInstActCom_Upd02_YieldR.$chd_peg_no);
				addColumnPathMap(Lot_Upd06_DtlParR.$site_cd, MfgInstActCom_Upd02_YieldR.$site_cd);
				addColumnPathMap(Lot_Upd06_DtlParR.$mfg_loc_cd, MfgInstActCom_Upd02_YieldR.$mfg_loc_cd);
				addColumnPathMap(Lot_Upd06_DtlParR.$gr_dt, MfgInstActCom_Upd02_YieldR.$gr_dt);
				addColumnPathMap(Lot_Upd06_DtlParR.$itm_cd, MfgInstActCom_Upd02_YieldR.$itm_cd);
				addColumnPathMap(Lot_Upd06_DtlParR.$itm_sub1, MfgInstActCom_Upd02_YieldR.$itm_sub1);
				addColumnPathMap(Lot_Upd06_DtlParR.$itm_sub2, MfgInstActCom_Upd02_YieldR.$itm_sub2);
				addColumnPathMap(Lot_Upd06_DtlParR.$itm_sub3, MfgInstActCom_Upd02_YieldR.$itm_sub3);
				addColumnPathMap(Lot_Upd06_DtlParR.$lot_no, MfgInstActCom_Upd02_YieldR.$lot_no);
				addColumnPathMap(Lot_Upd06_DtlParR.$sublot_no, MfgInstActCom_Upd02_YieldR.$sublot_no);

			}
		}
	}
	
	/**
	 * MfgInstActCom_Upd05オペレーション.<p>
	 *
	 * 月次仕掛の登録・更新・削除を行う。<br>
	 */
	public class MfgInstActCom_Upd05 extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd05 {
		/**
		 * 品目製造指図ＮＯを元に品目製造指図テーブルにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MST_ITM_MFG_INST_R> _itmMfgInst;

		/**
		 * 品目製造指図ＮＯを元に製造実績テーブルにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_MFG_ACT_R>> _actForItmMfgInstNo;

		/**
		 * 製造実績ＮＯを元に製造実績テーブルにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_MFG_ACT_R>> _actForMfgActNo;

		/**
		 * 品目製造指図ＮＯを元に工程実績テーブルにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_OPER_ACT_R>> _operForItmMfgInstNo;

		/**
		 * 製造実績ＮＯを元に工程実績テーブルにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_OPER_ACT_R>> _operForMfgActNo;

		/**
		 * 品目製造指図ＮＯを元に出来高情報にアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_MLY_WIP_R>> _yieldForItmMfgInstNo;

		/**
		 * 製造実績ＮＯを元に出来高情報にアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MST_MLY_WIP_R>> _yieldForMfgActNo;

		/**
		 * 製造実績ＮＯを元に出来高実績残にアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MST_YIELD_ACT_REM_R> _remForMfgActNo;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 生産方法区分、製造指図単位区分、品目製造指図ＮＯ、製造実績ＮＯを渡す。サービスの上り電文には製造実績NOも含める。
			// 生産方法区分、製造指図単位区分、品目製造指図ＮＯは必須項目
			// 生産方法区分が品目単位の場合は、製造実績ＮＯが必須。工程単位の場合はnullを渡す（渡しても無視する）
			editUp();

			setCache();

			delWip();

			MCList<MST_MLY_WIP_R> tmpL = calcWip();
			
			MCList<MST_MLY_WIP_R> insL = cmpBlankYm(tmpL);
			
			insWip(insL);
		}

		protected void editUp() {
			for (MfgInstActCom_Upd05_HdrR r : up0()) {
				// 工程単位製造指図の場合は製造実績ＮＯをクリアする
				if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
					r.mfg_act_no(null);
				}
			}
		}
		
		/**
		 * 仕掛更新に必要な情報をキャッシュする
		 */
		protected void setCache() {
			setItmMfgInstCache();

			MCList<MST_MFG_ACT_R> actL = setMfgActCache();

			setOperActCache(actL);

			setYieldCache(actL);
			
			setYieldActRemCache(actL);
		}

		protected static final String ITM_MFG_INST_CMPL_FLG_COL = "__itm_mfg_inst_cmpl_flg__";

		/**
		 * 品目製造指図をキャッシュする
		 * @param bindL
		 */
		protected void setItmMfgInstCache() {
			MCList<MfgInstActCom_Upd05_HdrR> bindL = up0().groupBy(
					MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no);
			bindL.sort(MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no);

			_itmMfgInst = new FXUCL_Cache<MST_ITM_MFG_INST_R>();
			_itmMfgInst.setFixMaxCacheSize(-1);

			MCList<MST_ITM_MFG_INST_R> itmInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R itmInstL_t = MST_ITM_MFG_INST_R.create("T");
			MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T1");
			MCQueryApiBuilder itmInstL_bldr = MCQueryApiBuilder.create(itmInstL_t);
			itmInstL_bldr.setSelect(itmInstL_t.itm_mfg_inst_no);
			itmInstL_bldr.addSelect(itmInstL_t.itm_ord_no);
			itmInstL_bldr.addSelect(itmInstL_t.itm_cd);
			itmInstL_bldr.addSelect(itmInstL_t.itm_sub1);
			itmInstL_bldr.addSelect(itmInstL_t.itm_sub2);
			itmInstL_bldr.addSelect(itmInstL_t.itm_sub3);
			itmInstL_bldr.addSelect(itmInstL_t.mfg_loc_cd);
			itmInstL_bldr.addSelect(itmInstL_t.mfg_str_ln_cd);
			itmInstL_bldr.addSelect(itmInstL_t.sno1);
			itmInstL_bldr.addSelect(itmInstL_t.sno2);
			itmInstL_bldr.addSelect(itmInstL_t.sno3);
			itmInstL_bldr.addSelect(itmInstL_t.sno4);
			itmInstL_bldr.addSelect(itmInstL_t.lot_no);
			itmInstL_bldr.addSelect(itmInstL_t.sublot_no);
			itmInstL_bldr.addSelect(itmInstL_t.base_unit_yield_qty);
			itmInstL_bldr.addSelect(itmInstL_t.base_unit_cd);
			itmInstL_bldr.setOrderByAsc(itmInstL_t.itm_mfg_inst_no);
			dbSelectKeyForUpdate("MSBCL6110_MST_ITM_MFG_INST_S02", itmInstL, itmInstL_bldr, bindL);

			MCList<MSVT_MFG_INST_PR_R> prL = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R prL_t = MSVT_MFG_INST_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(prL_t);
			prL_bldr.setSelect(prL_t.itm_mfg_inst_no);
			prL_bldr.addSelect(prL_t.mfg_sts_typ);
			prL_bldr.setWhere(prL_t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			prL_bldr.addInnerJoin(mfgInstL_t, bracket(prL_t.mfg_inst_no.eq(mfgInstL_t.mfg_inst_no)
					.and(mfgInstL_t.can_flg.eq(value(false)))));
			dbSelect("MSBCL6110_MSVT_MFG_INST_PR_S01", prL, prL_bldr, bindL);


			MCList<MSVT_OPER_INST_PR_R> operPrL = MCList.create(MSVT_OPER_INST_PR_R.class);
			MSVT_OPER_INST_PR_R t = MSVT_OPER_INST_PR_R.create("T");
			MCQueryApiBuilder operPrL_bldr = MCQueryApiBuilder.create(t);
			operPrL_bldr.setSelect(t.itm_mfg_inst_no);
			operPrL_bldr.addSelect(t.mfg_sts_typ);
			operPrL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			dbSelect("MSBCL6110_MSVT_OPER_INST_PR_S01", operPrL, operPrL_bldr, up0()
					.subList(r -> MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())));
			MCIndexKey operIdxkey = operPrL.createIndex(MSVT_OPER_INST_PR_R.$itm_mfg_inst_no);
			MCIndexKey idxkey = prL.createIndex(MSVT_MFG_INST_PR_R.$itm_mfg_inst_no);
			for (MST_ITM_MFG_INST_R imiR : itmInstL) {
				if (isAllMfgInstCmpl(prL.subList(idxkey, imiR.itm_mfg_inst_no()),
						operPrL.subList(operIdxkey, imiR.itm_mfg_inst_no()))) {
					imiR.setBooleanNE(ITM_MFG_INST_CMPL_FLG_COL, true);
				}
				else {
					imiR.setBooleanNE(ITM_MFG_INST_CMPL_FLG_COL, false);
				}
			}

			for (MST_ITM_MFG_INST_R itmInstR : itmInstL) {
				_itmMfgInst.putCache(new String[] {
					itmInstR.itm_mfg_inst_no()
				}, itmInstR);
			}
		}

		protected boolean isAllMfgInstCmpl(MCList<MSVT_MFG_INST_PR_R> prL,
				MCList<MSVT_OPER_INST_PR_R> operPrL) {
			if (prL.isEmpty()) {
				return false;
			}
			for (MSVT_MFG_INST_PR_R prR : prL) {
				if (!MSC_MFG_STS_TYP.isCMPL(prR.mfg_sts_typ())) {
					return false;
				}
			}
			if (!isNull(operPrL.getFirst(MSVT_OPER_INST_PR_R.$mfg_sts_typ,
					MSC_MFG_STS_TYP.YET.value()))) {
				return false;
			}
			return true;
		}

		/**
		 * 製造実績をキャッシュして、取得した製造実績を返す
		 * @param bindL
		 * @return
		 */
		protected MCList<MST_MFG_ACT_R> setMfgActCache() {
			_actForItmMfgInstNo = new FXUCL_Cache<MCList<MST_MFG_ACT_R>>();
			_actForItmMfgInstNo.setFixMaxCacheSize(-1);
			_actForMfgActNo = new FXUCL_Cache<MCList<MST_MFG_ACT_R>>();
			_actForMfgActNo.setFixMaxCacheSize(-1);

			MCList<MST_MFG_ACT_R> ret = MCList.create(MST_MFG_ACT_R.class);
			// 品目単位製造指図の場合は、製造実績ＮＯを条件に取得する。
			MCList<MfgInstActCom_Upd05_HdrR> actBindL = up0().subList(
					MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ,
					MAC_MFG_INST_UNIT_TYP.ITM.value());

			if (!actBindL.isEmpty()) {
				MCList<MST_MFG_ACT_R> tmpL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder tmpL_bldr = MCQueryApiBuilder.create(t);
				editMfgActDml(tmpL, t, tmpL_bldr);
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S05", tmpL, tmpL_bldr,
						actBindL.groupBy(MfgInstActCom_Upd05_HdrR.$mfg_act_no));
				ret.addAll(tmpL);

				for (MST_MFG_ACT_R tmpR : tmpL) {
					MCList<MST_MFG_ACT_R> cache = MCList.create(MST_MFG_ACT_R.class);
					cache.add(tmpR);
					_actForMfgActNo.putCache(new String[] {
						tmpR.mfg_act_no()
					}, cache);
				}
			}

			// 工程単位製造指図の場合は、品目製造指図ＮＯを条件に取得する。
			MCList<MfgInstActCom_Upd05_HdrR> itmBindL = up0().subList(
					MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ,
					MAC_MFG_INST_UNIT_TYP.OPER.value());

			if (!itmBindL.isEmpty()) {
				MCList<MST_MFG_ACT_R> tmpL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder tmpL_bldr = MCQueryApiBuilder.create(t);
				editMfgActDml(tmpL, t, tmpL_bldr);
				tmpL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
				dbSelect("MSBCL6110_MST_MFG_ACT_S06", tmpL, tmpL_bldr,
						itmBindL.groupBy(MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no));
				ret.addAll(tmpL);

				for (MCList<MST_MFG_ACT_R> gL : tmpL
						.groupList(MST_MFG_ACT_R.$itm_mfg_inst_no)) {
					_actForItmMfgInstNo.putCache(new String[] {
						gL.get(0).itm_mfg_inst_no()
					}, gL);
				}
			}
			return ret;
		}

		protected void editMfgActDml(MCList<MST_MFG_ACT_R> tmpL,
				MST_MFG_ACT_R t, MCQueryApiBuilder tmpL_bldr) {
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			tmpL_bldr.setSelect(t.itm_mfg_inst_no);
			tmpL_bldr.addSelect(t.mfg_act_no);
			tmpL_bldr.addSelect(t.mfg_inst_no);
			tmpL_bldr.addSelect(t.st_ac_dt);
			tmpL_bldr.addSelect(t.end_ac_dt);
			tmpL_bldr.addSelect(t2.mfg_mtd_typ);
			tmpL_bldr.addInnerJoin(t2, bracket(t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
		}

		protected static final String WIP_RATE_COL = "tmp_wip_rate";

		/**
		 * 工程実績をキャッシュする
		 * @param actL
		 */
		protected void setOperActCache(MCList<MST_MFG_ACT_R> actL) {
			_operForItmMfgInstNo = new FXUCL_Cache<MCList<MST_OPER_ACT_R>>();
			_operForItmMfgInstNo.setFixMaxCacheSize(-1);
			_operForMfgActNo = new FXUCL_Cache<MCList<MST_OPER_ACT_R>>();
			_operForMfgActNo.setFixMaxCacheSize(-1);

			if (actL.isEmpty()) {
				return;
			}

			MCList<MST_OPER_ACT_R> operL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");
			operL.addNumberColumn("tmp_wip_rate");
			operL_bldr.setSelect(t.itm_mfg_inst_no);
			operL_bldr.addSelect(t.mfg_act_no);
			operL_bldr.addSelect(t2.wip_rate.as("tmp_wip_rate"));
			operL_bldr.addInnerJoin(t2, bracket(t.oper_inst_no.eq(t2.oper_inst_no)));
			operL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL6110_MST_OPER_ACT_S01", operL, operL_bldr, actL);

			for (MCList<MST_OPER_ACT_R> gL : operL
					.groupList(MST_OPER_ACT_R.$mfg_act_no)) {
				_operForMfgActNo.putCache(new String[] {
					gL.get(0).mfg_act_no()
				}, gL);
			}

			for (MCList<MST_OPER_ACT_R> gL : operL
					.groupList(MST_OPER_ACT_R.$itm_mfg_inst_no)) {
				_operForItmMfgInstNo.putCache(new String[] {
					gL.get(0).itm_mfg_inst_no()
				}, gL);
			}
		}

		/**
		 * 実績数や計上年月を取得するために、出来高に関する情報（外注の場合は、入荷や仕入に関する情報）をキャッシュする
		 * @param actL
		 */
		protected void setYieldCache(MCList<MST_MFG_ACT_R> actL) {
			_yieldForItmMfgInstNo = new FXUCL_Cache<MCList<MST_MLY_WIP_R>>();
			_yieldForItmMfgInstNo.setFixMaxCacheSize(-1);
			_yieldForMfgActNo = new FXUCL_Cache<MCList<MST_MLY_WIP_R>>();
			_yieldForMfgActNo.setFixMaxCacheSize(-1);

			if (actL.isEmpty()) {
				return;
			}

			MCList<MST_MFG_ACT_R> intnlActL = MCList.create(MST_MFG_ACT_R.class);
			MCList<MST_MFG_ACT_R> extnlActL = MCList.create(MST_MFG_ACT_R.class);
			for (MST_MFG_ACT_R actR : actL) {
				if (MSC_MFG_MTD_TYP.isINTNL(actR.getStringNE("mfg_mtd_typ"))) {
					intnlActL.add(actR);
				}
				else {
					extnlActL.add(actR);
				}
			}

			// 内製の場合、出来高実績を元に取得
			if (!intnlActL.isEmpty()) {
				MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(t);
				yieldActL_bldr.setSelect(t.itm_mfg_inst_no);
				yieldActL_bldr.addSelect(t.mfg_act_no);
				yieldActL_bldr.addSelect(t.base_unit_qty);
				yieldActL_bldr.addSelect(t.ac_dt);
				yieldActL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
				yieldActL_bldr.addWhereWithAnd(t.yield_typ.neq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
				dbSelect("MSBCL6110_MST_YIELD_ACT_S01", yieldActL, yieldActL_bldr, intnlActL);

				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				for (MST_YIELD_ACT_R yaR : yieldActL) {
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(yaR.itm_mfg_inst_no());
					wipR.mfg_act_no(yaR.mfg_act_no());
					wipR.ym(getAcYm(yaR.ac_dt()));
					wipR.base_unit_act_qty(yaR.base_unit_qty());
					tmpL.add(wipR);
				}

				MCGroupByPolicy ItmMfgInstGp = new MCGroupByPolicy(
						MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$ym);
				ItmMfgInstGp.sum(MST_MLY_WIP_R.$base_unit_act_qty);
				for (MCList<MST_MLY_WIP_R> noGL : tmpL
						.groupList(MST_MLY_WIP_R.$itm_mfg_inst_no)) {
					// 計上年月ごとの数量を計算しキャッシュに設定する（品目製造指図ＮＯ単位）
					_yieldForItmMfgInstNo.putCache(new String[] {
						noGL.get(0).itm_mfg_inst_no()
					}, groupByYm(ItmMfgInstGp, noGL));
				}

				MCGroupByPolicy mfgActGp = new MCGroupByPolicy(
						MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no,
						MST_MLY_WIP_R.$ym);
				mfgActGp.sum(MST_MLY_WIP_R.$base_unit_act_qty);
				for (MCList<MST_MLY_WIP_R> noGL : tmpL
						.groupList(MST_MLY_WIP_R.$mfg_act_no)) {
					// 計上年月ごとの数量を計算しキャッシュに設定する（製造実績ＮＯ単位）
					_yieldForMfgActNo.putCache(new String[] {
						noGL.get(0).mfg_act_no()
					}, groupByYm(mfgActGp, noGL));
				}
			}

			// 外注の場合、入荷実績及び仕入実績を元に取得
			if (!extnlActL.isEmpty()) {
				// 入荷実績を取得
				MCList<MST_MFG_ACT_R> arrL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R arrL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrL_t);
				MST_ARR_SCHD_R s1t2 = MST_ARR_SCHD_R.create("T2");
				MST_ARR_ACT_R s1t3 = MST_ARR_ACT_R.create("T3");
				arrL_bldr.setSelect(arrL_t.mfg_act_no);
				arrL_bldr.addSelect(arrL_t.itm_mfg_inst_no);
				arrL.addBooleanColumn("arr_cmpl_flg");
				arrL_bldr.addSelect(s1t2.cmpl_flg.as("arr_cmpl_flg"));
				arrL_bldr.addSelect(s1t2. base_unit_qty.as("arr_schd_qty"));
				arrL_bldr.addSelect(s1t2.arr_schd_no.as("arr_schd_no"));
				arrL_bldr.addSelect(s1t3.base_unit_qty.as("arr_qty"));
				arrL_bldr.addSelect(s1t3.ac_dt.as("arr_ac_dt"));
				arrL_bldr.addInnerJoin(s1t2, bracket(arrL_t.mfg_inst_no.eq(s1t2.mfg_inst_no)));
				arrL_bldr.addLeftOuterJoin(s1t3, bracket(s1t2.arr_schd_no.eq(s1t3.arr_schd_no)
						.and(s1t3.can_flg.eq(value(false)))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S07", arrL, arrL_bldr, extnlActL);

				MCList<MST_MLY_WIP_R> tmpArrL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_MFG_ACT_R> arrNotActL = MCList.create(MST_MFG_ACT_R.class);
				tmpArrL.addStringColumn("arr_schd_no");
				for (MST_MFG_ACT_R arrR : arrL) {
					if (isNull(arrR.getDateNE("arr_ac_dt"))) {
						arrNotActL.add(arrR);
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(arrR.itm_mfg_inst_no());
					wipR.mfg_act_no(arrR.mfg_act_no());
					wipR.setStringNE("arr_schd_no", arrR.getStringNE("arr_schd_no"));
					wipR.end_ac_dt(arrR.getDateNE("arr_ac_dt"));
					wipR.ym(getAcYm(arrR.getDateNE("arr_ac_dt")));
					wipR.cmpl_flg(arrR.getBooleanNE("arr_cmpl_flg"));
					wipR.base_unit_schd_qty(nvl(arrR.getNumberNE("arr_schd_qty"), MCNumber.ZERO));
					wipR.base_unit_act_qty(nvl(arrR.getNumberNE("arr_qty"), MCNumber.ZERO));
					tmpArrL.add(wipR);
				}

				// 仕入実績を取得
				MCList<MST_MFG_ACT_R> purcL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R purcL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(purcL_t);
				MST_ARR_SCHD_R s2t2 = MST_ARR_SCHD_R.create("T2");
				MST_PURC_SCHD_R s2t3 = MST_PURC_SCHD_R.create("T3");
				MST_PURC_ACT_D_R s2t4 = MST_PURC_ACT_D_R.create("T4");
				MST_PURC_ACT_R s2t5 = MST_PURC_ACT_R.create("T5");
				MCTempView purcAct = createTempView("PURCACT");
				purcL_bldr.setSelect(purcL_t.mfg_act_no);
				purcL_bldr.addSelect(purcL_t.itm_mfg_inst_no);
				purcL_bldr.addSelect(purcAct.pr(s2t4.base_unit_qty).as("purc_qty"));
				purcL.addBooleanColumn("purc_cmpl_flg");
				purcL_bldr.addSelect(s2t3.cmpl_flg.as("purc_cmpl_flg"));
				purcL_bldr.addSelect(s2t3.base_unit_schd_qty.as("purc_schd_qty"));
				purcL_bldr.addSelect(purcAct.pr(s2t5.ac_dt).as("purc_ac_dt"));
				purcL_bldr.addSelect(s2t2.arr_schd_no.as("arr_schd_no"));
				purcL_bldr.addInnerJoin(s2t2, bracket(purcL_t.mfg_inst_no.eq(s2t2.mfg_inst_no)));
				purcL_bldr.addInnerJoin(s2t3, bracket(s2t2.arr_schd_no.eq(s2t3.arr_schd_no)));
				purcL_bldr.addLeftOuterJoin(
						subQuery()
							.select(s2t4.purc_schd_no, s2t4.base_unit_qty, s2t5.ac_dt)
							.from(s2t5
									.innerJoin(s2t4).on(
											bracket(s2t4.purc_act_no.eq(s2t5.purc_act_no)
													.and(s2t4.purc_act_seq.eq(s2t5.purc_act_seq))
													.and(s2t5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
							.view(purcAct)
						, bracket(s2t3.purc_schd_no.eq(purcAct.pr(s2t4.purc_schd_no))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S08", purcL, purcL_bldr, extnlActL);

				MCList<MST_MLY_WIP_R> tmpPurcL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_MFG_ACT_R> purcNotActL = MCList.create(MST_MFG_ACT_R.class);
				tmpPurcL.addStringColumn("arr_schd_no");
				for (MST_MFG_ACT_R purcR : purcL) {
					if (isNull(purcR.getDateNE("purc_ac_dt"))) {
						purcNotActL.add(purcR);
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(purcR.itm_mfg_inst_no());
					wipR.mfg_act_no(purcR.mfg_act_no());
					wipR.setStringNE("arr_schd_no", purcR.getStringNE("arr_schd_no"));
					wipR.end_ac_dt(purcR.getDateNE("purc_ac_dt"));
					wipR.ym(getAcYm(purcR.getDateNE("purc_ac_dt")));
					wipR.cmpl_flg(purcR.getBooleanNE("purc_cmpl_flg"));
					wipR.base_unit_schd_qty(nvl(purcR.getNumberNE("purc_schd_qty"),
							MCNumber.ZERO));
					wipR.base_unit_act_qty(nvl(purcR.getNumberNE("purc_qty"),
							MCNumber.ZERO));
					tmpPurcL.add(wipR);
				}

				// 外注品は必ず品目製造指図単位という前提があるため、製造実績ＮＯ単位でgroupByする
				MCGroupByPolicy mfgActGp = new MCGroupByPolicy(
						MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no,
						"arr_schd_no", MST_MLY_WIP_R.$ym);
				mfgActGp.sum(MST_MLY_WIP_R.$base_unit_act_qty);

				MCList<MST_MLY_WIP_R> ymGArr = extnlGroupByYm(mfgActGp, tmpArrL);
				MCList<MST_MLY_WIP_R> ymGPurc = extnlGroupByYm(mfgActGp, tmpPurcL);
				cmpBlankYmForOutsrc(ymGArr, ymGPurc);
				MCIndexKey arrIdxkey = ymGArr.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no,
						MST_MLY_WIP_R.$mfg_act_no, "arr_schd_no", MST_MLY_WIP_R.$ym);
				MCIndexKey purcIdxkey = ymGPurc.createIndex(
						MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no,
						"arr_schd_no", MST_MLY_WIP_R.$ym);

				// 入荷のみが登録された年月、あるいは仕入のみが登録された年月が存在する可能性があるため、
				// 一旦入荷実績と仕入実績のリストを一つのリストに格納し、groupByする
				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				tmpL.addStringColumn("arr_schd_no");
				cmpBlankYmForOutsrc(tmpArrL, tmpPurcL);
				tmpL.addAll(tmpArrL);
				tmpL.addAll(tmpPurcL);
				// 仕入、入荷が全て完了しているかどうかの判断で使用するIndexKey
				MCIndexKey cmplIdxKey = tmpL.createIndex(
						MST_MLY_WIP_R.$mfg_act_no,
						MST_MLY_WIP_R.$cmpl_flg);
				MCIndexKey cmplSchdIdxKey = tmpL.createIndex(
						MST_MLY_WIP_R.$mfg_act_no,
						"arr_schd_no",
						MST_MLY_WIP_R.$cmpl_flg);
				MCIndexKey arrNotActIdxKey = arrNotActL.createIndex(MST_MFG_ACT_R.$mfg_act_no, "arr_cmpl_flg");
				MCIndexKey purcNotActIdxKey = purcNotActL.createIndex(MST_MFG_ACT_R.$mfg_act_no, "purc_cmpl_flg");
				MCIndexKey arrSchdNotActIdxKey = arrNotActL.createIndex(MST_MFG_ACT_R.$mfg_act_no, "arr_schd_no", "arr_cmpl_flg");
				MCIndexKey purcSchdNotActIdxKey = purcNotActL.createIndex(MST_MFG_ACT_R.$mfg_act_no, "arr_schd_no", "purc_cmpl_flg");
				MCList<MST_MLY_WIP_R> cmplTmpL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_MLY_WIP_R> cacheL = MCList.create(MST_MLY_WIP_R.class);
				cacheL.addStringColumn("arr_schd_no");
				for (MST_MLY_WIP_R tmpR : tmpL.groupBy(MST_MLY_WIP_R.$itm_mfg_inst_no,
						MST_MLY_WIP_R.$mfg_act_no, "arr_schd_no", MST_MLY_WIP_R.$base_unit_schd_qty, MST_MLY_WIP_R.$ym)) {

					MST_MLY_WIP_R cacheR = MST_MLY_WIP_R.create();
					cacheR.itm_mfg_inst_no(tmpR.itm_mfg_inst_no());
					cacheR.mfg_act_no(tmpR.mfg_act_no());
					cacheR.setStringNE("arr_schd_no", tmpR.getStringNE("arr_schd_no"));
					cacheR.base_unit_schd_qty(tmpR.base_unit_schd_qty());
					cacheR.ym(tmpR.ym());

					MST_MLY_WIP_R arrR = ymGArr.getFirst(arrIdxkey,
							tmpR.itm_mfg_inst_no(), tmpR.mfg_act_no(), tmpR.getStringNE("arr_schd_no"), tmpR.ym());
					MST_MLY_WIP_R purcR = ymGPurc.getFirst(purcIdxkey,
							tmpR.itm_mfg_inst_no(), tmpR.mfg_act_no(), tmpR.getStringNE("arr_schd_no"), tmpR.ym());
					if (!isNull(arrR) && !isNull(purcR)) {
						// 入荷と仕入が両方存在する場合は、最小値（入荷と仕入が両方終わっている数量）を設定する
						cacheR.base_unit_act_qty(MCNumber.min(arrR.base_unit_act_qty(),
								purcR.base_unit_act_qty()));

						// 入荷予定、仕入予定に完了FLGがfalseのレコードが存在しない場合、仕掛も完了とする
						if (isNull(tmpL.getFirst(cmplIdxKey, tmpR.mfg_act_no(), false))
								&& isNull(arrNotActL.getFirst(arrNotActIdxKey, tmpR.mfg_act_no(), false))
								&& isNull(purcNotActL.getFirst(purcNotActIdxKey, tmpR.mfg_act_no(), false))) {
							cmplTmpL.addAll(tmpL.subList(cmplIdxKey, tmpR.mfg_act_no(), true));
						}
						if (isNull(tmpL.getFirst(cmplSchdIdxKey, tmpR.mfg_act_no(), tmpR.getStringNE("arr_schd_no"), false))
								&& isNull(arrNotActL.getFirst(arrSchdNotActIdxKey, tmpR.mfg_act_no(), tmpR.getStringNE("arr_schd_no"), false))
								&& isNull(purcNotActL.getFirst(purcSchdNotActIdxKey, tmpR.mfg_act_no(), tmpR.getStringNE("arr_schd_no"), false))) {
							cacheR.cmpl_flg(true);
						}
					}
					else {
						// 入荷と仕入がどちらか片方の場合は、実績は0とみなす
						cacheR.base_unit_act_qty(MCNumber.ZERO);
					}
					
					cacheL.add(cacheR);
				}
				
				String chkMfgActNo = null;
				for (MCList<MST_MLY_WIP_R> cacheGL : cacheL.groupList(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, "arr_schd_no")) {
					MST_MLY_WIP_R latestR = cacheGL.getFirst(MST_MLY_WIP_R.$ym, (MCDate)cacheGL.max(MST_MLY_WIP_R.$ym));
					// 実績が伴っている、かつ打切で完了している場合に、打切数をマイナスで保持する。
					latestR.base_unit_wip_qty(latestR.base_unit_act_qty().subtract((latestR.base_unit_schd_qty())));
					if (!latestR.cmpl_flg() || !latestR.base_unit_wip_qty().isNegative()) {
						latestR.base_unit_wip_qty(MCNumber.ZERO);
					}
					if (!isNull(chkMfgActNo) && isSame(latestR.mfg_act_no(), chkMfgActNo)) {
						continue;
					}
					chkMfgActNo = null;
					if (!isNull(arrNotActL.getFirst(arrNotActIdxKey, latestR.mfg_act_no(), true))
							&& !isNull(purcNotActL.getFirst(purcNotActIdxKey, latestR.mfg_act_no(), true))) {
						MCList<MST_MLY_WIP_R> addArrNotActAbortL = MCList.create(MST_MLY_WIP_R.class);
						addArrNotActAbortL.addStringColumn("arr_schd_no");
						// 入荷実績が未作成のまま打切されているレコードを取得
						for (MST_MFG_ACT_R arrNotActR : arrNotActL.subList(arrNotActIdxKey, latestR.mfg_act_no(), true)) {
							if (isSame(arrNotActR.getStringNE("arr_schd_no"),latestR.getStringNE("arr_schd_no")) 
									|| !isSame(nvl(arrNotActR.getStringNE("arr_qty"), MCNumber.ZERO),MCNumber.ZERO)) {
								continue;
							}
							MST_MLY_WIP_R addArrNotActAbortR = MST_MLY_WIP_R.create();
							addArrNotActAbortR.itm_mfg_inst_no(arrNotActR.itm_mfg_inst_no());
							addArrNotActAbortR.mfg_act_no(arrNotActR.mfg_act_no());
							addArrNotActAbortR.setStringNE("arr_schd_no", arrNotActR.getStringNE("arr_schd_no"));
							addArrNotActAbortR.cmpl_flg(arrNotActR.getBooleanNE("arr_cmpl_flg"));
							addArrNotActAbortR.base_unit_schd_qty(nvl(arrNotActR.getNumberNE("arr_schd_qty"), MCNumber.ZERO));
							addArrNotActAbortR.base_unit_wip_qty(MCNumber.ZERO.subtract(addArrNotActAbortR.base_unit_schd_qty()));
							addArrNotActAbortL.add(addArrNotActAbortR);
						}
						// 仕入実績が未作成のまま打切されているレコードを取得
						MCList<MST_MLY_WIP_R> addPurcNotActAbortL = MCList.create(MST_MLY_WIP_R.class);
						addPurcNotActAbortL.addStringColumn("arr_schd_no");
						for (MST_MFG_ACT_R purcNotActR : purcNotActL.subList(purcNotActIdxKey, latestR.mfg_act_no(), true)) {
							if (isSame(purcNotActR.getStringNE("arr_schd_no"),latestR.getStringNE("arr_schd_no")) 
									|| !isSame(nvl(purcNotActR.getStringNE("purc_qty"), MCNumber.ZERO),MCNumber.ZERO)) {
								continue;
							}
							MST_MLY_WIP_R addPurcNotActAbortR = MST_MLY_WIP_R.create();
							addPurcNotActAbortR.itm_mfg_inst_no(purcNotActR.itm_mfg_inst_no());
							addPurcNotActAbortR.mfg_act_no(purcNotActR.mfg_act_no());
							addPurcNotActAbortR.setStringNE("arr_schd_no", purcNotActR.getStringNE("arr_schd_no"));
							addPurcNotActAbortR.cmpl_flg(purcNotActR.getBooleanNE("purc_cmpl_flg"));
							addPurcNotActAbortR.base_unit_schd_qty(nvl(purcNotActR.getNumberNE("purc_schd_qty"), MCNumber.ZERO));
							addPurcNotActAbortR.base_unit_wip_qty(MCNumber.ZERO.subtract(addPurcNotActAbortR.base_unit_schd_qty()));
							addPurcNotActAbortL.add(addPurcNotActAbortR);
						}
						// 入荷実績・仕入実績がともに未作成のまま打切されている場合に、追加の打切分として仕掛数量から減算する。
						if (!addArrNotActAbortL.isEmpty() && !addPurcNotActAbortL.isEmpty()) {
							MCNumber addAbortQty = MCNumber.ZERO;
							for (MST_MLY_WIP_R r : addArrNotActAbortL) {
								if (!isNull(addPurcNotActAbortL.getFirst("arr_schd_no", r.getStringNE("arr_schd_no")))) {
									addAbortQty = addAbortQty.add(r.base_unit_wip_qty());
								}
							}
							latestR.base_unit_wip_qty(latestR.base_unit_wip_qty().add(addAbortQty));
							chkMfgActNo = latestR.mfg_act_no();
						}
					}
					for (MST_MLY_WIP_R r : cacheGL) {
						r.base_unit_wip_qty(latestR.base_unit_wip_qty());
					}
				}
				MCGroupByPolicy cacheGp = new MCGroupByPolicy(
						MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym);
				cacheGp.sum(MST_MLY_WIP_R.$base_unit_act_qty, MST_MLY_WIP_R.$base_unit_wip_qty);
				cacheL = cacheL.groupBy(cacheGp);
				
				// 入荷と仕入が完了していない場合は、終了計上日をnullにクリアする
				// 完了している場合は、終了計上日に計上日の最大値を設定する
				MCIndexKey cmplTmpIdxKey = cmplTmpL.createIndex(MST_MLY_WIP_R.$mfg_act_no);
				for (MST_MFG_ACT_R extnlActR : extnlActL) {
					for (MST_MFG_ACT_R actR : _actForMfgActNo.getCache(extnlActR.mfg_act_no())) {
						MCList<MST_MLY_WIP_R> cmplSubL = cmplTmpL
								.subList(cmplTmpIdxKey, actR.mfg_act_no());
						if (cmplSubL.isEmpty()) {
							actR.end_ac_dt(null);
						}
						else {
							actR.end_ac_dt((MCDate)cmplSubL.max(MST_MLY_WIP_R.$end_ac_dt));
						}
					}
				}

				for (MCList<MST_MLY_WIP_R> noGL : cacheL
						.groupList(MST_MLY_WIP_R.$mfg_act_no)) {
					_yieldForMfgActNo.putCache(new String[] {
						noGL.get(0).mfg_act_no()
					}, noGL);
				}
			}
		}

		/**
		 * 外注の入荷実績、仕入実績の空白の期間を補完する
		 * @param arrL
		 * @param purcL
		 */
		protected void cmpBlankYmForOutsrc(MCList<MST_MLY_WIP_R> arrL, MCList<MST_MLY_WIP_R> purcL) {
			// 1月に入荷100、2月に仕入100など、入荷と仕入の年月が異なるような場合に
			// 後続の基準単位実績数量や完了FLGの値を正しく設定するために必要なレコードを補完する
			// 例：
			// ・補完前
			// 入荷：1月100個
			// 仕入：2月100個
			// ・補完後
			// 入荷：1月100個, 2月100個
			// 仕入：1月0個, 2月100個
			// ※入荷の2月100個と仕入の1月0個を補完する
			Set<String> mfgActNoSet = new HashSet<String>();
			Map<String, MCList<MST_MLY_WIP_R>> arrMap = new HashMap<String, MCList<MST_MLY_WIP_R>>();
			for (MCList<MST_MLY_WIP_R> gL : arrL
					.groupList(MST_MLY_WIP_R.$mfg_act_no)) {
				mfgActNoSet.add(gL.get(0).mfg_act_no());
				arrMap.put(gL.get(0).mfg_act_no(), gL);
			}
			Map<String, MCList<MST_MLY_WIP_R>> purcMap = new HashMap<String, MCList<MST_MLY_WIP_R>>();
			for (MCList<MST_MLY_WIP_R> gL : purcL
					.groupList(MST_MLY_WIP_R.$mfg_act_no)) {
				mfgActNoSet.add(gL.get(0).mfg_act_no());
				purcMap.put(gL.get(0).mfg_act_no(), gL);
			}
			
			for (String mfgActNo : mfgActNoSet) {
				MCList<MST_MLY_WIP_R> subArrL = arrMap.get(mfgActNo);
				MCList<MST_MLY_WIP_R> subPurcL = purcMap.get(mfgActNo);
				if (subArrL == null || subPurcL == null) {
					continue;
				}
				cmpBlankYmForOutsrcSub(subArrL, subPurcL);
			}
			
			// 空白の行を補完したリストに置き換える
			arrL.clear();
			arrMap.values().forEach(l -> arrL.addAll(l));
			purcL.clear();
			purcMap.values().forEach(l -> purcL.addAll(l));
		}

		protected void cmpBlankYmForOutsrcSub(MCList<MST_MLY_WIP_R> arrL, MCList<MST_MLY_WIP_R> purcL) {
			MCDate minArrYm= (MCDate)arrL.min(MST_MLY_WIP_R.$ym);
			MCDate maxArrYm= (MCDate)arrL.max(MST_MLY_WIP_R.$ym);
			MCDate minPurcYm= (MCDate)purcL.min(MST_MLY_WIP_R.$ym);
			MCDate maxPurcYm= (MCDate)purcL.max(MST_MLY_WIP_R.$ym);

			MCDate minYm = null;
			MCDate maxYm = null;
			
			if (minArrYm.lt(minPurcYm)) {
				minYm = minArrYm;
			}
			else {
				minYm = minPurcYm;
			}
			if (maxArrYm.gt(maxPurcYm)) {
				maxYm = maxArrYm;
			}
			else {
				maxYm = maxPurcYm;
			}

			long diff = maxYm.diffMonth(minYm);
			if (diff == 0) {
				return;
			}
			MST_MLY_WIP_R preArrR = null;
			MST_MLY_WIP_R prePurcR = null;
			MCDate currYm = null;
			// 入荷実績の補完
			MCList<MST_MLY_WIP_R> addArrL = MCList.create(MST_MLY_WIP_R.class);
			addArrL.addStringColumn("arr_schd_no");
			for (MCList<MST_MLY_WIP_R> arrGL : arrL.groupList("arr_schd_no")) {
				for (int i = 0; i <= diff; i++) {
					currYm = minYm.addMonth(i);
					
					MST_MLY_WIP_R currArrR = arrGL.getFirst(MST_MLY_WIP_R.$ym, currYm);
					if (isNull(currArrR)) {
						MST_MLY_WIP_R addMonthR = MST_MLY_WIP_R.create();
						addMonthR.addStringColumn("arr_schd_no");
						if (isNull(preArrR)) {
							addMonthR.itm_mfg_inst_no(arrGL.get(0).itm_mfg_inst_no());
							addMonthR.mfg_act_no(arrGL.get(0).mfg_act_no());
							addMonthR.base_unit_act_qty(MCNumber.ZERO);
							addMonthR.setStringNE("arr_schd_no", arrGL.get(0).getStringNE("arr_schd_no"));
							addMonthR.cmpl_flg(arrGL.get(0).cmpl_flg());
						}
						else {
							MCRow.copyvalue(addMonthR, preArrR);
						}
						addMonthR.ym(currYm);
						addArrL.add(addMonthR);
						preArrR = addMonthR;
					}
					else {
						preArrR = currArrR;
					}
				}
				preArrR = null;
			}
			arrL.addAll(addArrL);
			
			// 仕入実績の補完
			MCList<MST_MLY_WIP_R> addPurcL = MCList.create(MST_MLY_WIP_R.class);
			addPurcL.addStringColumn("arr_schd_no");
			for (MCList<MST_MLY_WIP_R> purcGL : purcL.groupList("arr_schd_no")) {
				for (int i = 0; i <= diff; i++) {
					currYm = minYm.addMonth(i);

					MST_MLY_WIP_R currPurcR = purcGL.getFirst(MST_MLY_WIP_R.$ym, currYm);
					if (isNull(currPurcR)) {
						MST_MLY_WIP_R addMonthR = MST_MLY_WIP_R.create();
						addMonthR.addStringColumn("arr_schd_no");
						if (isNull(prePurcR)) {
							addMonthR.itm_mfg_inst_no(purcGL.get(0).itm_mfg_inst_no());
							addMonthR.mfg_act_no(purcGL.get(0).mfg_act_no());
							addMonthR.base_unit_act_qty(MCNumber.ZERO);
							addMonthR.setStringNE("arr_schd_no", purcGL.get(0).getStringNE("arr_schd_no"));
							addMonthR.cmpl_flg(purcGL.get(0).cmpl_flg());
						}
						else {
							MCRow.copyvalue(addMonthR, prePurcR);
						}
						addMonthR.ym(currYm);
						addPurcL.add(addMonthR);
						prePurcR = addMonthR;
					}
					else {
						prePurcR = currPurcR;
					}
				}
				prePurcR = null;
			}
			purcL.addAll(addPurcL);
		}
		/**
		 * 仕掛の管理単位（品目製造指図ＮＯ or 製造実績ＮＯ）、計上年月毎の実績数量を返す
		 * @return
		 */
		protected MCList<MST_MLY_WIP_R> groupByYm(MCGroupByPolicy gp,
				MCList<MST_MLY_WIP_R> gL) {
			MCList<MST_MLY_WIP_R> ymWipKeyGL = gL.groupBy(gp);
			
			for (MCList<MST_MLY_WIP_R> ymGL : ymWipKeyGL.groupList(
					MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no)) {
				ymGL.sort(MST_MLY_WIP_R.$ym);
				MCNumber tmp = MCNumber.ZERO;
				// 実績数量を翌月に加算していく
				for (MST_MLY_WIP_R ymGR : ymGL) {
					ymGR.base_unit_act_qty(ymGR.base_unit_act_qty().add(tmp));
					tmp = ymGR.base_unit_act_qty();
				}
			}
			return ymWipKeyGL;
		}
		protected MCList<MST_MLY_WIP_R> extnlGroupByYm(MCGroupByPolicy gp,
				MCList<MST_MLY_WIP_R> gL) {
			MCList<MST_MLY_WIP_R> ymWipKeyGL = gL.groupBy(gp);
			
			for (MCList<MST_MLY_WIP_R> ymGL : ymWipKeyGL.groupList(
					MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, "arr_schd_no")) {
				ymGL.sort(MST_MLY_WIP_R.$ym);
				MCNumber tmp = MCNumber.ZERO;
				// 実績数量を翌月に加算していく
				for (MST_MLY_WIP_R ymGR : ymGL) {
					ymGR.base_unit_act_qty(ymGR.base_unit_act_qty().add(tmp));
					tmp = ymGR.base_unit_act_qty();
				}
			}
			return ymWipKeyGL;
		}

		/**
		 * 仕掛の予定数を取得するため、製造実績ＮＯ単位に出来高実績残の着手数の合計を取得する（品目単位製造指図のみ使用）
		 * @param actL
		 */
		protected void setYieldActRemCache(MCList<MST_MFG_ACT_R> actL) {
			_remForMfgActNo = new FXUCL_Cache<MST_YIELD_ACT_REM_R>();
			_remForMfgActNo.setFixMaxCacheSize(-1);

			if (actL.isEmpty()) {
				return;
			}

			MCList<MST_YIELD_ACT_REM_R> remL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			MST_MFG_ACT_R t1 = MST_MFG_ACT_R.create("T1");
			remL.addStringColumn(MST_MFG_ACT_R.$mfg_act_no);
			remL_bldr.setSelect(t1.mfg_act_no);
			remL_bldr.addSelect(t.base_unit_yield_qty);
			remL_bldr.addInnerJoin(t1, bracket(t1.mfg_inst_no.eq(t.mfg_inst_no)
					.and(t1.div_seq.eq(t.div_seq))));
			remL_bldr.setWhere(t1.mfg_act_no.eq(bind("mfg_act_no")));
			remL_bldr.addWhereWithAnd(t.yield_typ.neq(bind("1")),
					MAC_YIELD_TYP.BYPROD.value());
			dbSelect("MSBCL6110_MST_YIELD_ACT_REM_S01", remL, remL_bldr, actL);

			if (remL.isEmpty()) {
				return;
			}
			
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_MFG_ACT_R.$mfg_act_no);
			gp.sum(MST_YIELD_ACT_REM_R.$base_unit_yield_qty);

			for (MST_YIELD_ACT_REM_R r : remL.groupBy(gp)) {
				_remForMfgActNo.putCache(new String[] {
						r.getStringNE(MST_MFG_ACT_R.$mfg_act_no)
				}, r);
			}
		}
		
		/**
		 * 未締分の月度仕掛を削除する
		 */
		protected void delWip() {
			delWipByMfgActNo();

			delWipByItmMfgInstNo();
		}

		protected MCList<MST_MLY_WIP_R> _tgtWipByMfgActNoL = MCList.create(MST_MLY_WIP_R.class);
		protected MCList<MST_MLY_WIP_R> _tgtWipByItmMfgInstNoL = MCList.create(MST_MLY_WIP_R.class);

		/**
		 * 製造実績ＮＯで削除する（品目単位製造指図の場合）
		 */
		protected void delWipByMfgActNo() {
			MCList<MST_MLY_WIP_R> bindL = MCList.create(MST_MLY_WIP_R.class);
			for (MfgInstActCom_Upd05_HdrR r : up0().subList(
					MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ,
					MAC_MFG_INST_UNIT_TYP.ITM.value())) {
				MST_MLY_WIP_R bindR = MST_MLY_WIP_R.create();
				bindR.mfg_act_no(r.mfg_act_no());
				bindL.add(bindR);
			}
			
			MST_MLY_WIP_R t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder tgtWipByMfgActNoL_bldr = MCQueryApiBuilder.create(t);
			tgtWipByMfgActNoL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			tgtWipByMfgActNoL_bldr.setOrderByAsc(t.ym);
			dbSelect("MSBCL6110_MST_MLY_WIP_S01", _tgtWipByMfgActNoL, tgtWipByMfgActNoL_bldr,
					bindL.groupBy(MST_MLY_WIP_R.$mfg_act_no));
			
			MST_MLY_WIP_R dbc = MST_MLY_WIP_R.create("T");
			execDbDelete("MSBCL6110_MST_MLY_WIP_D01", dbc,
					dbc.mfg_act_no.eq(bind("mfg_act_no"))
							.and(dbc.closing_flg.eq(value(false))),
					bindL.groupBy(MST_MLY_WIP_R.$mfg_act_no));
		}

		/**
		 * 品目製造指図ＮＯで削除する（工程単位製造指図の場合）
		 */
		protected void delWipByItmMfgInstNo() {
			MCList<MST_MLY_WIP_R> bindL = MCList.create(MST_MLY_WIP_R.class);
			for (MfgInstActCom_Upd05_HdrR r : up0().subList(
					MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ,
					MAC_MFG_INST_UNIT_TYP.OPER.value())) {
				MST_MLY_WIP_R bindR = MST_MLY_WIP_R.create();
				bindR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				bindL.add(bindR);
			}
			
			MST_MLY_WIP_R t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder tgtWipByItmMfgInstNoL_bldr = MCQueryApiBuilder.create(t);
			tgtWipByItmMfgInstNoL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			tgtWipByItmMfgInstNoL_bldr.setOrderByAsc(t.ym);
			dbSelect("MSBCL6110_MST_MLY_WIP_S02", _tgtWipByItmMfgInstNoL, tgtWipByItmMfgInstNoL_bldr,
					bindL.groupBy(MST_MLY_WIP_R.$itm_mfg_inst_no));
			
			MST_MLY_WIP_R dbc = MST_MLY_WIP_R.create("T");
			execDbDelete("MSBCL6110_MST_MLY_WIP_D02", dbc,
					dbc.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no"))
							.and(dbc.closing_flg.eq(value(false))),
					bindL.groupBy(MST_MLY_WIP_R.$itm_mfg_inst_no));
		}

		/**
		 * 仕掛数や年月などを設定した登録用のコンテナを返す
		 */
		protected MCList<MST_MLY_WIP_R> calcWip() {
			MCList<MST_MLY_WIP_R> ret = MCList.create(MST_MLY_WIP_R.class);
			MCIndexKey tgtWipByMfgActNoIdx = _tgtWipByMfgActNoL.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym);
			MCIndexKey tgtWipByItmMfgInstNoIdx = _tgtWipByItmMfgInstNoL.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$ym);

			for (MfgInstActCom_Upd05_HdrR r : up0().groupBy(
					MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no,
					MfgInstActCom_Upd05_HdrR.$mfg_act_no,
					MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ)) {
				// 品目製造指図の取得
				MST_ITM_MFG_INST_R imiR = _itmMfgInst.getCache(r.itm_mfg_inst_no());
				if (isNull(imiR)) {
					continue;
				}

				// 製造実績、工程実績、出来高情報、出来高実績残の取得
				MCList<MST_MFG_ACT_R> maL;
				MCList<MST_OPER_ACT_R> oaL;
				MCList<MST_MLY_WIP_R> yieldL;
				MST_YIELD_ACT_REM_R remR;
				MST_MLY_WIP_R delWipR;
				if (MAC_MFG_INST_UNIT_TYP.isITM(r.mfg_inst_unit_typ())) {
					maL = _actForMfgActNo.getCache(r.mfg_act_no());
					oaL = _operForMfgActNo.getCache(r.mfg_act_no());
					yieldL = _yieldForMfgActNo.getCache(r.mfg_act_no());
					remR = _remForMfgActNo.getCache(r.mfg_act_no());
					delWipR = _tgtWipByMfgActNoL.subList(l -> !l.closing_flg()).getFirst(MST_MLY_WIP_R.$mfg_act_no, r.mfg_act_no());
					if (isNull(delWipR)
							|| isNull(_tgtWipByMfgActNoL.subList(l -> l.closing_flg()).getFirst(MST_MLY_WIP_R.$mfg_act_no, r.mfg_act_no()))) {
						delWipR = MST_MLY_WIP_R.create();
					}
				}
				else {
					maL = _actForItmMfgInstNo.getCache(r.itm_mfg_inst_no());
					oaL = _operForItmMfgInstNo.getCache(r.itm_mfg_inst_no());
					yieldL = _yieldForItmMfgInstNo.getCache(r.itm_mfg_inst_no());
					remR = null; // 工程単位の場合は実績残の着手数を使用しない
					delWipR = _tgtWipByItmMfgInstNoL.subList(w -> !w.closing_flg()).getFirst(MST_MLY_WIP_R.$itm_mfg_inst_no, r.itm_mfg_inst_no());
					if (isNull(delWipR)
							|| isNull(_tgtWipByItmMfgInstNoL.subList(l -> l.closing_flg()).getFirst(MST_MLY_WIP_R.$itm_mfg_inst_no, r.itm_mfg_inst_no()))) {
						delWipR = MST_MLY_WIP_R.create();
					}
				}
				if (maL == null) {
					continue;
				}
				if (oaL == null) {
					continue;
				}

				if (yieldL == null) {
					yieldL = MCList.create(MST_MLY_WIP_R.class);
				}
				
				if (!yieldL.isEmpty()) {
					if (!delWipR.isEmpty() && chkYieldAfterDelWip(yieldL, delWipR)) {
						// 出来高実績で補完できない未締分の月度仕掛を作成する
						MST_MLY_WIP_R closeWipByMfgActNoR =_tgtWipByMfgActNoL.getFirst(tgtWipByMfgActNoIdx, delWipR.itm_mfg_inst_no(), delWipR.mfg_act_no(), delWipR.ym().addMonth(-1));
						MST_MLY_WIP_R closeWipByItmMfgInstNoR =_tgtWipByItmMfgInstNoL.getFirst(tgtWipByItmMfgInstNoIdx, delWipR.itm_mfg_inst_no(), delWipR.ym().addMonth(-1));
						delWipR.base_unit_act_qty(MCNumber.ZERO);
						delWipR.base_unit_wip_qty(yieldL.get(0).base_unit_wip_qty());
						if (!isNull(closeWipByMfgActNoR)) {
							delWipR.base_unit_act_qty((closeWipByMfgActNoR.base_unit_act_qty()));
						}
						else {
							delWipR.base_unit_act_qty(closeWipByItmMfgInstNoR.base_unit_act_qty());
						}
						ret.add(getYieldWip(r, imiR, maL, oaL, remR, delWipR));
					}
					
					MCDate stAcYm = getAcYm((MCDate) maL.min(MST_MFG_ACT_R.$st_ac_dt));
					if (stAcYm.lt((MCDate)yieldL.min(MST_MLY_WIP_R.$ym))) {
						// 出来高の計上年月よりも着手の計上年月が過去の場合、年月=着手計上年月、実績数=0のレコードを作成する
						delWipR = MST_MLY_WIP_R.create();
						ret.add(getNoYieldWip(r, imiR, maL, oaL, remR, delWipR));
					}
					
					// 出来高を元にレコードを作成する
					for (MST_MLY_WIP_R wipR : yieldL) {
						ret.add(getYieldWip(r, imiR, maL, oaL, remR, wipR));
					}
				}
				else {
					ret.add(getNoYieldWip(r, imiR, maL, oaL, remR, delWipR));
					// 出来高がない場合は、年月=着手計上年月、実績数=0のレコードを作成する
				}
			}
			return ret;
		}

		protected boolean chkYieldAfterDelWip (MCList<MST_MLY_WIP_R> yieldL, MST_MLY_WIP_R delWipR) {
			for (MST_MLY_WIP_R r : yieldL) {
				if (delWipR.ym().lte(r.ym())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 出来高が存在する仕掛のコンテナを返す
		 * @param r 電文
		 * @param imiR 品目製造指図
		 * @param maL 製造実績
		 * @param oaL 工程実績
		 * @param remR 出来高実績残
		 * @param wipR 月別仕掛
		 * @return 月別仕掛コンテナ
		 */
		protected MST_MLY_WIP_R getYieldWip(MfgInstActCom_Upd05_HdrR r,
				MST_ITM_MFG_INST_R imiR, MCList<MST_MFG_ACT_R> maL,
				MCList<MST_OPER_ACT_R> oaL,
				MST_YIELD_ACT_REM_R remR,
				MST_MLY_WIP_R wipR) {
			wipR.itm_mfg_inst_no(r.itm_mfg_inst_no());
			wipR.mfg_act_no(r.mfg_act_no());
			copyItmMfgInstToMlyWip(imiR, wipR);
			setSchdQty(imiR, remR, wipR);
			setStAcDt(maL, wipR);
			setEndAcDtAndCmplFlg(r.mfg_inst_unit_typ(),
					imiR.getBooleanNE(ITM_MFG_INST_CMPL_FLG_COL), maL, wipR);
			setWipRate(oaL, wipR);
			setWipQty(wipR);
			
			return wipR;
		}
		
		/**
		 * 品目製造指図の情報を仕掛情報にコピーする
		 * @param imiR
		 * @param wipR
		 */
		protected void copyItmMfgInstToMlyWip(MST_ITM_MFG_INST_R imiR, MST_MLY_WIP_R wipR) {
			wipR.itm_ord_no(imiR.itm_ord_no());
			wipR.itm_cd(imiR.itm_cd());
			wipR.itm_sub1(imiR.itm_sub1());
			wipR.itm_sub2(imiR.itm_sub2());
			wipR.itm_sub3(imiR.itm_sub3());
			wipR.loc_cd(imiR.mfg_loc_cd());
			wipR.str_ln_cd(imiR.mfg_str_ln_cd());
			wipR.asst_typ(MAC_ASST_TYP.CO_PROD.value());
			wipR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			wipR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			wipR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			wipR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			wipR.gd_cd(getDefaultFeedStkGd().gd_cd());
			wipR.lot_no(imiR.lot_no());
			wipR.sublot_no(imiR.sublot_no());
			wipR.sno1(imiR.sno1());
			wipR.sno2(imiR.sno2());
			wipR.sno3(imiR.sno3());
			wipR.sno4(imiR.sno4());
			wipR.base_unit_cd(imiR.base_unit_cd());
		}

		/**
		 * 品目製造指図または出来高実績残から予定数量を設定
		 * @param remL
		 * @param wipR
		 */
		protected void setSchdQty(MST_ITM_MFG_INST_R imiR,
				MST_YIELD_ACT_REM_R remR, MST_MLY_WIP_R wipR) {
			if (isNull(remR)) {
				// 工程単位製造指図の場合は出来高実績残がnullになるため、品目製造指図の出来高予定数を設定
				// ※指図数ではなく出来高予定数とする（予定通り進捗したら仕掛が0になるようにするため）
				wipR.base_unit_schd_qty(imiR.base_unit_yield_qty());
			}
			else {
				// 品目単位製造指図の場合は出来高実績残から着手数を設定
				wipR.base_unit_schd_qty(remR.base_unit_yield_qty());
			}
		}
		
		/**
		 * 出来高がない仕掛情報のコンテナを返す
		 * @return
		 */
		protected MST_MLY_WIP_R getNoYieldWip(MfgInstActCom_Upd05_HdrR r,
				MST_ITM_MFG_INST_R imiR, MCList<MST_MFG_ACT_R> maL,
				MCList<MST_OPER_ACT_R> oaL,
				MST_YIELD_ACT_REM_R remR,
				MST_MLY_WIP_R delWipR) {
			MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
			wipR.itm_mfg_inst_no(r.itm_mfg_inst_no());
			wipR.mfg_act_no(r.mfg_act_no());
			copyItmMfgInstToMlyWip(imiR, wipR);
			setSchdQty(imiR, remR, wipR);
			setStAcDt(maL, wipR);
			wipR.ym(nvl(delWipR.ym() ,getAcYm(wipR.st_ac_dt())));
			setEndAcDtAndCmplFlg(r.mfg_inst_unit_typ(),
					imiR.getBooleanNE(ITM_MFG_INST_CMPL_FLG_COL), maL, wipR);
			wipR.base_unit_act_qty(MCNumber.ZERO);
			setWipRate(oaL, wipR);
			setWipQty(wipR);
			return wipR;
		}
		
		protected void setStAcDt(MCList<MST_MFG_ACT_R> maL, MST_MLY_WIP_R wipR) {
			wipR.st_ac_dt((MCDate) maL.min(MST_MFG_ACT_R.$st_ac_dt));
		}

		/**
		 * 終了計上日、完了ＦＬＧを設定する
		 * @param mfgInstUnitTyp
		 * @param itmMfgInstCmpl
		 * @param maL
		 * @param wipR
		 */
		protected void setEndAcDtAndCmplFlg(String mfgInstUnitTyp,
				boolean itmMfgInstCmpl, MCList<MST_MFG_ACT_R> maL,
				MST_MLY_WIP_R wipR) {
			MCDate endAcDt = null;
			if (MAC_MFG_INST_UNIT_TYP.isOPER(mfgInstUnitTyp)) {
				if (itmMfgInstCmpl) {
					endAcDt = (MCDate) maL.max(MST_MFG_ACT_R.$end_ac_dt);
				}
			}
			else {
				endAcDt = (MCDate) maL.max(MST_MFG_ACT_R.$end_ac_dt);
			}
			// 仮設定（cmpBlankYmメソッド内で、cmpl_flgがfalseのレコードはnullに上書きされる）
			wipR.end_ac_dt(endAcDt);
			
			if (!isNull(endAcDt)) {
				// 終了計上年月より過去の年月は完了にしない
				MCDate endAcYm = getAcYm(endAcDt);
				if (wipR.ym().gte(endAcYm)) {
					wipR.cmpl_flg(true);
				}
			}
			else {
				wipR.cmpl_flg(false);
			}
		}

		/**
		 * 仕掛進捗率を設定する
		 * @param oaL
		 * @param wipR
		 */
		protected void setWipRate(MCList<MST_OPER_ACT_R> oaL, MST_MLY_WIP_R wipR) {
			if (wipR.cmpl_flg()) {
				// 完了時は仕掛在庫がないので進捗率も0とする
				wipR.wip_rate(MCNumber.ZERO);
			}
			else {
				// 進捗率の指定がない場合は、50固定
				wipR.wip_rate(nvl((MCNumber) oaL.max(WIP_RATE_COL), MCNumber.valueOf(50)));
			}
		}

		/**
		 * 仕掛数量を設定する
		 * @param wipR
		 */
		protected void setWipQty(MST_MLY_WIP_R wipR) {
			if (wipR.cmpl_flg()) {
				wipR.base_unit_wip_qty(MCNumber.ZERO);
			}
			else {
				wipR.base_unit_wip_qty(nvl(wipR.base_unit_wip_qty(), MCNumber.ZERO).add(
						wipR.base_unit_schd_qty().subtract(wipR.base_unit_act_qty())));
				if (wipR.base_unit_wip_qty().isNegative()) {
					// 負の場合は0にする
					wipR.base_unit_wip_qty(MCNumber.ZERO);
				}
			}
		}
		
		/**
		 * 空白の年月を補完する
		 * @param wipL
		 * @return
		 */
		protected MCList<MST_MLY_WIP_R> cmpBlankYm(MCList<MST_MLY_WIP_R> wipL) {
			MCList<MST_MLY_WIP_R> retL = MCList.create(MST_MLY_WIP_R.class);
			
			// ・1月に着手し、3月に100計上
			// ・1月に100計上し、3月に200計上
			// など着手及び出来高に空白の年月（例では2月が空白の年月）がある場合、前月のデータで補完する
			MCList<MST_MLY_WIP_R> cmp1L = MCList.create(MST_MLY_WIP_R.class);
			for (MCList<MST_MLY_WIP_R> gbL : wipL.groupList(
					MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no)) {
				gbL.sort(MCList.SortType.ASC, MST_MLY_WIP_R.$ym);
				
				MST_MLY_WIP_R preR = gbL.get(0);
				for (MST_MLY_WIP_R currR : gbL) {
					long diff = currR.ym().diffMonth(preR.ym());
					if (diff > 1) {
						// 差が１よりも大きい場合は、補完が必要
						for (int i = 1; i < diff; i++) {
							MST_MLY_WIP_R tmpR = preR.clone();
							tmpR.ym(preR.ym().addMonth(i));
							cmp1L.add(tmpR);
						}
					}
					cmp1L.add(currR);
					preR = currR;
				}
			}
			
			// ・3月に100計上、4月に完了
			// など最終出来高の計上年月以降に完了した場合、完了の計上年月までのデータを補完する
			for (MCList<MST_MLY_WIP_R> gbL : cmp1L.groupList(
					MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no)) {
				gbL.sort(MCList.SortType.DESC, MST_MLY_WIP_R.$ym);
				
				MST_MLY_WIP_R lastYieldR = gbL.get(0);
				MCDate endYm = getAcYm(lastYieldR.end_ac_dt());
				if (!isNull(endYm)) {
					
					long diff = endYm.diffMonth(lastYieldR.ym()); 
					if (diff > 0) {
						// 差が０よりも大きい場合は、補完が必要
						for (int i = 1; i <= diff; i++) {
							MST_MLY_WIP_R tmp = lastYieldR.clone();
							tmp.ym(lastYieldR.ym().addMonth(i));

							if (i == diff) {
								tmp.cmpl_flg(true);
								tmp.base_unit_wip_qty(MCNumber.ZERO);
								tmp.wip_rate(MCNumber.ZERO);
							}
							retL.add(tmp);
						}
					}
				}
				retL.addAll(gbL);
			}
			
			// 上記、完了の計上年月までのデータを補完するために仮設定していた終了計上日の再設定（完了ＦＬＧがfalseの場合はnullにする）
			for (MST_MLY_WIP_R retR : retL) {
				if (!retR.cmpl_flg()) {
					retR.end_ac_dt(null);
				}
			}
			
			return retL;
		}

		/**
		 * 仕掛を登録する
		 */
		protected void insWip(MCList<MST_MLY_WIP_R> wipL) {
			MCList<MST_MLY_WIP_R> insL = MCList.create(MST_MLY_WIP_R.class);
			MCDate stkClYm = getStkClYm();
			for (MST_MLY_WIP_R insR : wipL) {
				if (!isNull(stkClYm) && stkClYm.gte(insR.ym())) {
					// 締め済みの年月は除く ※処理の最初で、削除していないため締め済みの年月のレコードは残っている	
					continue;
				}
				insL.add(insR);
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_MLY_WIP_R.create("T"));
				dbInsert("MSBCL6110_MST_MLY_WIP_I01", insL, insL_bldr);
			}
		}
	}

	/**
	 * MfgInstActCom_Upd06オペレーション.<p>
	 *
	 * 出来高実績および出来高実績残の現品票発行済ＦＬＧをオンに更新する。<br>
	 */
	public class MfgInstActCom_Upd06 extends
			MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd06 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文の出来高実績ＮＯで出来高実績を参照し、出来高予定ＮＯと分割連番を取得
			MST_YIELD_ACT_R dbcL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(dbcL_t);
			dbcL_bldr.setSelect(dbcL_t.yield_schd_no, dbcL_t.div_seq);
			FXUCL_MCDbcCache<MST_YIELD_ACT_R> cache = new FXUCL_MCDbcCache<MST_YIELD_ACT_R>(
					dbcL_bldr, up0(), MfgInstActCom_Upd06_DtlR.$yield_act_no);

			// 更新対象の出来高実績残の編集
			MCList<MST_YIELD_ACT_REM_R> updActRemL = MCList.create(MST_YIELD_ACT_REM_R.class);
			// 更新対象の出来高実績の編集
			MCList<MST_YIELD_ACT_R> updActL = MCList.create(MST_YIELD_ACT_R.class);

			for (MfgInstActCom_Upd06_DtlR r : up0()) {
				MST_YIELD_ACT_REM_R updR = MST_YIELD_ACT_REM_R.create();

				if (!isNull(r.yield_act_no())) {
					MST_YIELD_ACT_R dbR = cache.get(r.yield_act_no());
					if (isNull(dbR)) {
						continue;
					}
					// 上り電文に出来高実績ＮＯが設定されている場合、更新対象に出来高実績の出来高予定ＮＯと分割連番を設定
					updR.yield_schd_no(dbR.yield_schd_no());
					updR.div_seq(dbR.div_seq());
					updR.stk_lst_prnt_flg(true);
					
					// 紐づく出来高実績も更新対象とする。
					MST_YIELD_ACT_R actR = MST_YIELD_ACT_R.create();
					actR.yield_act_no(r.yield_act_no());
					actR.stk_lst_prnt_flg(true);
					updActL.add(actR);
				}
				else {
					// 上り電文に出来高実績ＮＯが設定されていない場合、更新対象に上り電文の出来高予定ＮＯを設定
					updR.yield_schd_no(r.yield_schd_no());
					updR.div_seq(MCNumber.ZERO); // 出来高予定の場合はゼロ固定
					updR.stk_lst_prnt_flg(true);
				}
				updActRemL.add(updR);
			}
			if (!updActRemL.isEmpty()) {
				MST_YIELD_ACT_REM_R updActRemL_t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder updActRemL_bldr = MCQueryApiBuilder.create(updActRemL_t);
				updActRemL_bldr.setSet(updActRemL_t.stk_lst_prnt_flg);
				dbUpdateKey("MSBCL6110_MST_YIELD_ACT_REM_U01", updActRemL, updActRemL_bldr);
			}
			if (!updActL.isEmpty()) {
				MST_YIELD_ACT_R updActL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder updActL_bldr = MCQueryApiBuilder.create(updActL_t);
				updActL_bldr.setSet(updActL_t.stk_lst_prnt_flg);
				dbUpdateKey("MSBCL6110_MST_YIELD_ACT_U01", updActL, updActL_bldr);
			}
		}

	}

	/**
	 * MfgInstActCom_Upd07オペレーション.<p>
	 *
	 * 上り電文で指定された値に応じて、仕掛締・締解除処理を実行する。<br>
	 */
	public class MfgInstActCom_Upd07 extends
			MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd07 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			updateClosingFlg(up0().ym(), up0().closing_flg());

			if (up0().closing_flg()) {
				executeUpdate(MSBCL6110_MST_MLY_WIP_S01(), up0());
				executeUpdate(MSBCL6110_MST_MLY_WIP_S02(), up0());
			}
			else {
				updateCmplFlg();
				
				delUselessIntnlWip();
				
				delUselessExtnlWip();
			}
		}

		/**
		 * MST_MLY_WIP(月別仕掛)の締対象年月の締ＦＬＧを更新します。
		 * 
		 * @param ym 締対象年月
		 * @param closingFlg 締ＦＬＧ
		 */
		protected void updateClosingFlg(MCDate ym, boolean closingFlg) {
			MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
			wipR.ym(up0().ym());
			wipR.closing_flg(closingFlg);
			MST_MLY_WIP_R dbc = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(dbc.closing_flg);
			builder.setWhere(dbc.ym.eq(bindEx("ym")));
			dbUpdate("MSBCL6110_MST_MLY_WIP_U01", wipR, builder);
		}
		
		/**
		 * MST_MLY_WIP(月別仕掛)の締対象年月の完了ＦＬＧを更新します。
		 */
		protected void updateCmplFlg() {
			// 外注の月別仕掛を取得
			MCDate acYm = getAcYm(up0().ym());
			MCList<MST_MLY_WIP_R> wipL =  MCList.create(MST_MLY_WIP_R.class);
			MST_MLY_WIP_R wipL_t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder wipL_bldr = MCQueryApiBuilder.create(wipL_t);
			MST_ITM_MFG_INST_R s1t2 = MST_ITM_MFG_INST_R.create("T2");
			wipL_bldr.setSelect(wipL_t.mfg_act_no);
			wipL_bldr.addInnerJoin(s1t2, bracket(wipL_t.itm_mfg_inst_no.eq(s1t2.itm_mfg_inst_no)));
			wipL_bldr.setWhere(wipL_t.cmpl_flg.eq(value(false)));
			wipL_bldr.addWhereWithAnd(wipL_t.closing_flg.eq(value(false)));
			wipL_bldr.addWhereWithAnd(wipL_t.ym.eq(value(acYm)));
			wipL_bldr.addWhereWithAnd(s1t2.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
			dbSelect("MSBCL6110_MST_MLY_WIP_S03", wipL, wipL_bldr);
			
			if(!wipL.isEmpty()) {
				MCList<MST_MFG_ACT_R> arrL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R arrL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrL_t);
				MST_ARR_SCHD_R s2t2 = MST_ARR_SCHD_R.create("T2");
				MST_ARR_ACT_R s2t3 = MST_ARR_ACT_R.create("T3");
				arrL_bldr.setSelect(arrL_t.mfg_act_no);
				arrL_bldr.addSelect(arrL_t.itm_mfg_inst_no);
				arrL.addBooleanColumn("arr_cmpl_flg");
				arrL_bldr.addSelect(s2t2.cmpl_flg.as("arr_cmpl_flg"));
				arrL_bldr.addSelect(s2t3.ac_dt.as("arr_ac_dt"));
				arrL_bldr.addInnerJoin(s2t2, bracket(arrL_t.mfg_inst_no.eq(s2t2.mfg_inst_no)));
				arrL_bldr.addLeftOuterJoin(s2t3, bracket(s2t2.arr_schd_no.eq(s2t3.arr_schd_no)
						.and(s2t3.can_flg.eq(value(false)))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S09", arrL, arrL_bldr, wipL);

				MCList<MST_MLY_WIP_R> tmpArrL = MCList.create(MST_MLY_WIP_R.class);
				for (MST_MFG_ACT_R arrR : arrL) {
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(arrR.itm_mfg_inst_no());
					wipR.mfg_act_no(arrR.mfg_act_no());
					wipR.ym(getAcYm(arrR.getDateNE("arr_ac_dt")));
					wipR.cmpl_flg(arrR.getBooleanNE("arr_cmpl_flg"));
					tmpArrL.add(wipR);
				}
				
				MCList<MST_MFG_ACT_R> purcL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R purcL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(purcL_t);
				MST_ARR_SCHD_R s3t2 = MST_ARR_SCHD_R.create("T2");
				MST_PURC_SCHD_R s3t3 = MST_PURC_SCHD_R.create("T3");
				MST_PURC_ACT_D_R s3t4 = MST_PURC_ACT_D_R.create("T4");
				MST_PURC_ACT_R s3t5 = MST_PURC_ACT_R.create("T5");
				purcL_bldr.setSelect(purcL_t.mfg_act_no);
				purcL_bldr.addSelect(purcL_t.itm_mfg_inst_no);
				purcL.addBooleanColumn("purc_cmpl_flg");
				purcL_bldr.addSelect(s3t3.cmpl_flg.as("purc_cmpl_flg"));
				purcL_bldr.addSelect(s3t5.ac_dt.as("purc_ac_dt"));
				purcL_bldr.addInnerJoin(s3t2, bracket(purcL_t.mfg_inst_no.eq(s3t2.mfg_inst_no)));
				purcL_bldr.addInnerJoin(s3t3, bracket(s3t2.arr_schd_no.eq(s3t3.arr_schd_no)));
				purcL_bldr.addLeftOuterJoin(s3t4, bracket(s3t3.purc_schd_no.eq(s3t4.purc_schd_no)));
				purcL_bldr.addLeftOuterJoin(s3t5, bracket(s3t4.purc_act_no.eq(s3t5.purc_act_no)
						.and(s3t4.purc_act_seq.eq(s3t5.purc_act_seq))
						.and(s3t5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S10", purcL, purcL_bldr, wipL);
				
				MCList<MST_MLY_WIP_R> tmpPurcL = MCList.create(MST_MLY_WIP_R.class);
				for (MST_MFG_ACT_R purcR : purcL) {
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(purcR.itm_mfg_inst_no());
					wipR.mfg_act_no(purcR.mfg_act_no());
					wipR.ym(getAcYm(purcR.getDateNE("purc_ac_dt")));
					wipR.cmpl_flg(purcR.getBooleanNE("purc_cmpl_flg"));
					tmpPurcL.add(wipR);
				}
				
				MCGroupByPolicy mfgActGp = new MCGroupByPolicy(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym);
				MCList<MST_MLY_WIP_R> ymGArr = tmpArrL.groupBy(mfgActGp);
				MCList<MST_MLY_WIP_R> ymGPurc = tmpPurcL.groupBy(mfgActGp);
				MCIndexKey arrIdxkey = ymGArr.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym);
				MCIndexKey purcIdxkey = ymGPurc.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym);
				
				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				tmpL.addAll(tmpArrL);
				tmpL.addAll(tmpPurcL);
				MCIndexKey cmplIdxKey = tmpL.createIndex(MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$cmpl_flg);
				MCList<MST_MLY_WIP_R> updL = MCList.create(MST_MLY_WIP_R.class);
				for (MST_MLY_WIP_R tmpR : tmpL.groupBy(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no, MST_MLY_WIP_R.$ym)) {
					MCList<MST_MLY_WIP_R> preTmpL = tmpL.subList(cmplIdxKey, tmpR.mfg_act_no(), true);
					if (chkActDtAfterClose(preTmpL, tmpR.ym())) {
						continue;
					}

					MST_MLY_WIP_R arrR = ymGArr.getFirst(arrIdxkey, tmpR.itm_mfg_inst_no(), tmpR.mfg_act_no(), tmpR.ym());
					MST_MLY_WIP_R purcR = ymGPurc.getFirst(purcIdxkey, tmpR.itm_mfg_inst_no(), tmpR.mfg_act_no(), tmpR.ym());
					if (!isNull(arrR) && !isNull(purcR) && acYm.gteDate(tmpR.ym())
							&& isNull(tmpL.getFirst(cmplIdxKey, tmpR.mfg_act_no(), false))) {
						MST_MLY_WIP_R updR = MST_MLY_WIP_R.create();
						updR.itm_mfg_inst_no(tmpR.itm_mfg_inst_no());
						updR.mfg_act_no(tmpR.mfg_act_no());
						updR.ym(acYm);
						updR.base_unit_wip_qty(MCNumber.ZERO);
						updR.wip_rate(MCNumber.ZERO);
						updR.cmpl_flg(true);
						updL.add(updR);
					}
				}
				MST_MLY_WIP_R updL_t = MST_MLY_WIP_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(updL_t.cmpl_flg, updL_t.base_unit_wip_qty, updL_t.wip_rate);
				dbUpdateKey("MSBCL6110_MST_MLY_WIP_U02", updL, updL_bldr);
				
				MCList<MST_MLY_WIP_R> delWipL = MCList.create(MST_MLY_WIP_R.class);
				MST_MLY_WIP_R delWipL_t = MST_MLY_WIP_R.create("T");
				MCQueryApiBuilder delWipL_bldr = MCQueryApiBuilder.create(delWipL_t);
				delWipL_bldr.setSelect(delWipL_t.ym, delWipL_t.itm_mfg_inst_no, delWipL_t.mfg_act_no);
				MST_ITM_MFG_INST_R s1t3 = MST_ITM_MFG_INST_R.create("T2");
				delWipL_bldr.addInnerJoin(s1t3, bracket(delWipL_t.itm_mfg_inst_no.eq(s1t3.itm_mfg_inst_no)));
				delWipL_bldr.setWhere(delWipL_t.closing_flg.eq(value(false)));
				delWipL_bldr.addWhereWithAnd(delWipL_t.ym.gt(value(acYm)));
				delWipL_bldr.addWhereWithAnd(delWipL_t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
				delWipL_bldr.addWhereWithAnd(delWipL_t.mfg_act_no.eq(bind("mfg_act_no")));
				delWipL_bldr.addWhereWithAnd(s1t3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
				dbSelect("MSBCL6110_MST_MLY_WIP_S04", delWipL, delWipL_bldr, updL);
				
				dbDeleteKey("MSBCL6110_MST_MLY_WIP_D03", delWipL, delWipL_bldr);
			}
		}

		protected boolean chkActDtAfterClose(MCList<MST_MLY_WIP_R> preTmpL, MCDate ym) {
			for (MST_MLY_WIP_R r : preTmpL) {
				if (!isNull(r.ym()) && r.ym().gtDate(ym)) {
					return true;
				}
			}
			return false;
		}

		/**
		 * MST_MLY_WIP(月別仕掛)の締解除に伴う不要な内製レコードを削除します。
		 */
		protected void delUselessIntnlWip() {
			MCDate acYm = getAcYm(up0().ym()).addMonth(MCNumber.ONE);
			// 内製の月別仕掛を取得
			MCList<MST_MLY_WIP_R> intnlDelWipL =  MCList.create(MST_MLY_WIP_R.class);
			MST_MLY_WIP_R intnlWipL_t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder intnlWipL_bldr = MCQueryApiBuilder.create(intnlWipL_t);
			MST_ITM_MFG_INST_R s1t2 = MST_ITM_MFG_INST_R.create("T2");
			intnlWipL_bldr.setSelect(intnlWipL_t.mfg_act_no, intnlWipL_t.itm_mfg_inst_no, intnlWipL_t.ym);
			intnlWipL_bldr.addInnerJoin(s1t2, bracket(intnlWipL_t.itm_mfg_inst_no.eq(s1t2.itm_mfg_inst_no)));
			intnlWipL_bldr.setWhere(intnlWipL_t.cmpl_flg.eq(value(false)));
			intnlWipL_bldr.addWhereWithAnd(intnlWipL_t.closing_flg.eq(value(false)));
			intnlWipL_bldr.addWhereWithAnd(intnlWipL_t.ym.eq(value(acYm)));
			intnlWipL_bldr.addWhereWithAnd(s1t2.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.INTNL.value())));
			dbSelect("MSBCL6110_MST_MLY_WIP_S05", intnlDelWipL, intnlWipL_bldr);
			
			MCList<MST_MLY_WIP_R> itmDelWipL = MCList.create(MST_MLY_WIP_R.class);
			MCList<MST_MLY_WIP_R> operDelWipL = MCList.create(MST_MLY_WIP_R.class);
			for (MST_MLY_WIP_R r :intnlDelWipL) {
				if (!isNull(r.mfg_act_no())) {
					itmDelWipL.add(r);
				}
				else {
					operDelWipL.add(r);
				}
			}
			
			// 品目単位製造指図
			if(!itmDelWipL.isEmpty()) {
				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R yieldL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldL_t);
				yieldActL_bldr.setSelect(yieldL_t.itm_mfg_inst_no);
				yieldActL_bldr.addSelect(yieldL_t.mfg_act_no);
				yieldActL_bldr.addSelect(yieldL_t.ac_dt);
				yieldActL_bldr.setWhere(yieldL_t.mfg_act_no.eq(bind("mfg_act_no")));
				yieldActL_bldr.addWhereWithAnd(yieldL_t.yield_typ.neq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
				dbSelect("MSBCL6110_MST_YIELD_ACT_S02", yieldActL, yieldActL_bldr, itmDelWipL);
				
				for (MST_YIELD_ACT_R yieldActR : yieldActL) {
					if (isNull(yieldActR.ac_dt()) || !yieldActR.ac_dt().gte(acYm)) {
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(yieldActR.itm_mfg_inst_no());
					wipR.mfg_act_no(yieldActR.mfg_act_no());
					wipR.ym(getAcYm(yieldActR.ac_dt()));
					tmpL.add(wipR);
				}
				
				delWip(tmpL, itmDelWipL);
			}
			
			// 工程単位製造指図
			if(!operDelWipL.isEmpty()) {
				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R yieldL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldL_t);
				yieldActL_bldr.setSelect(yieldL_t.itm_mfg_inst_no);
				yieldActL_bldr.addSelect(yieldL_t.ac_dt);
				yieldActL_bldr.setWhere(yieldL_t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
				yieldActL_bldr.addWhereWithAnd(yieldL_t.yield_typ.neq(bind("1")), MAC_YIELD_TYP.BYPROD.value());
				dbSelect("MSBCL6110_MST_YIELD_ACT_S03", yieldActL, yieldActL_bldr, operDelWipL);
				
				for (MST_YIELD_ACT_R yieldActR : yieldActL) {
					if (isNull(yieldActR.ac_dt()) || !yieldActR.ac_dt().gte(acYm)) {
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(yieldActR.itm_mfg_inst_no());
					wipR.ym(getAcYm(yieldActR.ac_dt()));
					tmpL.add(wipR);
				}
				
				delWip(tmpL, operDelWipL);
			}
		}

		/**
		 * MST_MLY_WIP(月別仕掛)の締解除に伴う不要な外注レコードを削除します。
		 */
		protected void delUselessExtnlWip() {
			MCDate acYm = getAcYm(up0().ym()).addMonth(MCNumber.ONE);
			// 外注の月別仕掛を取得
			MCList<MST_MLY_WIP_R> extnlDelWipL =  MCList.create(MST_MLY_WIP_R.class);
			MST_MLY_WIP_R extnlWipL_t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder extnlWipL_bldr = MCQueryApiBuilder.create(extnlWipL_t);
			MST_ITM_MFG_INST_R s2t2 = MST_ITM_MFG_INST_R.create("T2");
			extnlWipL_bldr.setSelect(extnlWipL_t.mfg_act_no, extnlWipL_t.itm_mfg_inst_no, extnlWipL_t.ym,
					extnlWipL_t.base_unit_wip_qty);
			extnlWipL_bldr.addInnerJoin(s2t2, bracket(extnlWipL_t.itm_mfg_inst_no.eq(s2t2.itm_mfg_inst_no)));
			extnlWipL_bldr.setWhere(extnlWipL_t.cmpl_flg.eq(value(false)));
			extnlWipL_bldr.addWhereWithAnd(extnlWipL_t.closing_flg.eq(value(false)));
			extnlWipL_bldr.addWhereWithAnd(extnlWipL_t.ym.eq(value(acYm)));
			extnlWipL_bldr.addWhereWithAnd(s2t2.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
			dbSelect("MSBCL6110_MST_MLY_WIP_S06", extnlDelWipL, extnlWipL_bldr);
			
			if(!extnlDelWipL.isEmpty()) {
				MCList<MST_MLY_WIP_R> tmpL = MCList.create(MST_MLY_WIP_R.class);
				MCList<MST_MFG_ACT_R> arrL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R arrL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrL_t);
				MST_ARR_SCHD_R s3t2 = MST_ARR_SCHD_R.create("T2");
				MST_ARR_ACT_R s3t3 = MST_ARR_ACT_R.create("T3");
				arrL_bldr.setSelect(arrL_t.mfg_act_no);
				arrL_bldr.addSelect(arrL_t.itm_mfg_inst_no);
				arrL.addBooleanColumn("arr_cmpl_flg");
				arrL_bldr.addSelect(s3t2.cmpl_flg.as("arr_cmpl_flg"));
				arrL_bldr.addSelect(s3t3.ac_dt.as("arr_ac_dt"));
				arrL_bldr.addInnerJoin(s3t2, bracket(arrL_t.mfg_inst_no.eq(s3t2.mfg_inst_no)));
				arrL_bldr.addLeftOuterJoin(s3t3, bracket(s3t2.arr_schd_no.eq(s3t3.arr_schd_no)
						.and(s3t3.can_flg.eq(value(false)))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S11", arrL, arrL_bldr, extnlDelWipL);

				for (MST_MFG_ACT_R arrR : arrL) {
					if (isNull(arrR.getDateNE("arr_ac_dt")) || !arrR.getDateNE("arr_ac_dt").gte(acYm)) {
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(arrR.itm_mfg_inst_no());
					wipR.mfg_act_no(arrR.mfg_act_no());
					wipR.ym(getAcYm(arrR.getDateNE("arr_ac_dt")));
					wipR.cmpl_flg(arrR.getBooleanNE("arr_cmpl_flg"));
					tmpL.add(wipR);
				}
				
				MCList<MST_MFG_ACT_R> purcL = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R purcL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(purcL_t);
				MST_ARR_SCHD_R s4t2 = MST_ARR_SCHD_R.create("T2");
				MST_PURC_SCHD_R s4t3 = MST_PURC_SCHD_R.create("T3");
				MST_PURC_ACT_D_R s4t4 = MST_PURC_ACT_D_R.create("T4");
				MST_PURC_ACT_R s4t5 = MST_PURC_ACT_R.create("T5");
				MCTempView purcAct = createTempView("PURCACT");
				purcL_bldr.setSelect(purcL_t.mfg_act_no);
				purcL_bldr.addSelect(purcL_t.itm_mfg_inst_no);
				purcL.addBooleanColumn("purc_cmpl_flg");
				purcL_bldr.addSelect(s4t3.cmpl_flg.as("purc_cmpl_flg"));
				purcL_bldr.addSelect(purcAct.pr(s4t5.ac_dt).as("purc_ac_dt"));
				purcL_bldr.addInnerJoin(s4t2, bracket(purcL_t.mfg_inst_no.eq(s4t2.mfg_inst_no)));
				purcL_bldr.addInnerJoin(s4t3, bracket(s4t2.arr_schd_no.eq(s4t3.arr_schd_no)));
				purcL_bldr.addLeftOuterJoin(
						subQuery()
							.select(s4t4.purc_schd_no, s4t4.base_unit_qty, s4t5.ac_dt)
							.from(s4t5
									.innerJoin(s4t4).on(
											bracket(s4t4.purc_act_no.eq(s4t5.purc_act_no)
													.and(s4t4.purc_act_seq.eq(s4t5.purc_act_seq))
													.and(s4t5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
							.view(purcAct)
						, bracket(s4t3.purc_schd_no.eq(purcAct.pr(s4t4.purc_schd_no))));
				dbSelectKey("MSBCL6110_MST_MFG_ACT_S12", purcL, purcL_bldr, extnlDelWipL);
				
				for (MST_MFG_ACT_R purcR : purcL) {
					if (isNull(purcR.getDateNE("purc_ac_dt")) || !purcR.getDateNE("purc_ac_dt").gte(acYm)) {
						continue;
					}
					MST_MLY_WIP_R wipR = MST_MLY_WIP_R.create();
					wipR.itm_mfg_inst_no(purcR.itm_mfg_inst_no());
					wipR.mfg_act_no(purcR.mfg_act_no());
					wipR.ym(getAcYm(purcR.getDateNE("purc_ac_dt")));
					wipR.cmpl_flg(purcR.getBooleanNE("purc_cmpl_flg"));
					tmpL.add(wipR);
				}
				
				delWip(tmpL, extnlDelWipL);
				
				if (!isNull(extnlDelWipL)) {
					MCDate updAcYm = getAcYm(up0().ym());
					MCList<MST_MLY_WIP_R> updWipL =  MCList.create(MST_MLY_WIP_R.class);
					MST_MLY_WIP_R updWipL_t = MST_MLY_WIP_R.create("T");
					MCQueryApiBuilder updWipL_bldr = MCQueryApiBuilder.create(updWipL_t);
					MST_ITM_MFG_INST_R s5t2 = MST_ITM_MFG_INST_R.create("T2");
					updWipL_bldr.setSelect(updWipL_t.mfg_act_no, updWipL_t.itm_mfg_inst_no, updWipL_t.ym,
							extnlWipL_t.base_unit_wip_qty);
					updWipL_bldr.addInnerJoin(s5t2, bracket(updWipL_t.itm_mfg_inst_no.eq(s5t2.itm_mfg_inst_no)));
					updWipL_bldr.setWhere(updWipL_t.cmpl_flg.eq(value(false)));
					updWipL_bldr.addWhereWithAnd(updWipL_t.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
					updWipL_bldr.addWhereWithAnd(updWipL_t.closing_flg.eq(value(false)));
					updWipL_bldr.addWhereWithAnd(updWipL_t.ym.eq(value(updAcYm)));
					updWipL_bldr.addWhereWithAnd(s5t2.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
					dbSelect("MSBCL6110_MST_MLY_WIP_S07", updWipL, updWipL_bldr, extnlDelWipL);
					
					if (!isNull(updWipL)) {
						updWip(updWipL, extnlDelWipL);
					}
				}
			}
		}
		protected void delWip(MCList<MST_MLY_WIP_R> tmpL, MCList<MST_MLY_WIP_R> DelWipL) {
			if (!isNull(tmpL)) {
				MCIndexKey ChkDelWipIdx = tmpL.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no);
				MCList<MST_MLY_WIP_R> removeDelWipL =  MCList.create(MST_MLY_WIP_R.class);
				for (MST_MLY_WIP_R delWipR : DelWipL) {
					if (!isNull(tmpL.getFirst(ChkDelWipIdx, delWipR.itm_mfg_inst_no(), delWipR.mfg_act_no()))) {
						removeDelWipL.add(delWipR);
					}
				}
				DelWipL.removeAll(removeDelWipL);
			}
			MST_MLY_WIP_R delWipL_t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder delWipL_bldr = MCQueryApiBuilder.create(delWipL_t);
			dbDeleteKey("MSBCL6110_MST_MLY_WIP_D04", DelWipL, delWipL_bldr);
		}
		protected void updWip(MCList<MST_MLY_WIP_R> updWipL, MCList<MST_MLY_WIP_R> DelWipL) {
			MCIndexKey ChkUpdWipIdx = updWipL.createIndex(MST_MLY_WIP_R.$itm_mfg_inst_no, MST_MLY_WIP_R.$mfg_act_no);
			MCList<MST_MLY_WIP_R> removeUpdWipL =  MCList.create(MST_MLY_WIP_R.class);
			MST_MLY_WIP_R updWipR = MST_MLY_WIP_R.create();
			for (MST_MLY_WIP_R delWipR : DelWipL) {
				updWipR =updWipL.getFirst(ChkUpdWipIdx, delWipR.itm_mfg_inst_no(), delWipR.mfg_act_no());
				if (isSame(updWipR.base_unit_wip_qty(), delWipR.base_unit_wip_qty())) {
					removeUpdWipL.add(updWipR);
				}
				else {
					updWipR.base_unit_wip_qty(delWipR.base_unit_wip_qty());
				}
			}
			updWipL.removeAll(removeUpdWipL);
			MST_MLY_WIP_R updWipL_t = MST_MLY_WIP_R.create("T");
			MCQueryApiBuilder updWipL_bldr = MCQueryApiBuilder.create(updWipL_t);
			updWipL_bldr.setSet(updWipL_t.base_unit_wip_qty);
			dbUpdateKey("MSBCL6110_MST_MLY_WIP_U03", updWipL, updWipL_bldr);
		}
	}
	/**
	 * MfgInstActCom_Sprt01オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯの発番を行う。<br>
	 */
	public class MfgInstActCom_Sprt01 extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Sprt01 {
		/**
		 * ヘッダから投入データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstActCom_Sprt01_DtlR>> _dtlCache;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setChdCache();
			setLotNo();
			setSublotNo();
			setDown();
		}
		
		protected void setChdCache() {
			_dtlCache = new FXUCL_Cache<MCList<MfgInstActCom_Sprt01_DtlR>>();
			_dtlCache.setFixMaxCacheSize(-1);
			
			MCIndexKey idxkey = up1().createIndex(MfgInstActCom_Sprt01_DtlR.$hdr_peg_no, MfgInstActCom_Sprt01_DtlR.$main_itm_flg);
			for (MfgInstActCom_Sprt01_HdrR hdrR : up0()) {
				MCList<MfgInstActCom_Sprt01_DtlR> val = MCList.create(MfgInstActCom_Sprt01_DtlR.class);
				// 副産品の場合は、peg_noとhdr_peg_noに異なる値が設定される
				for (MfgInstActCom_Sprt01_DtlR inptR : up1().subList(idxkey, hdrR.hdr_peg_no(), true)) {
					if (!isNullOrNullVal(inptR.lot_no())) {
						val.add(inptR);
					}
				}
				// 引継対象子品目が複数ある場合は、古いロットが優先（有効期限はカスタマイズ用項目のため、ソートでは使用しない）
				val.sort(MfgInstActCom_Sprt01_DtlR.$first_gr_dt, MfgInstActCom_Sprt01_DtlR.$lot_seq);
				
				_dtlCache.putCache(new MCNumber[]{hdrR.hdr_peg_no()} ,val);
			}
		}
		
		protected void setLotNo() {
			for (MfgInstActCom_Sprt01_HdrR hdrR : up0()) {
				if (!hdrR.lot_issue_flg()) {
					continue;
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(hdrR.lot_mng_typ())) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1052, toDispGUIIndex(hdrR)));
					continue;
				}
				if (!isNull(hdrR.lot_no())) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1056, toDispGUIIndex(hdrR)));
					continue;
				}
				
				ElmArgsR arg = ElmArgsR.create();
				arg.num_ptn_cd(hdrR.lot_no_ptn_cd());
				arg.peg_no(hdrR.peg_no());
				arg.itm_cd(hdrR.itm_cd());
				arg.itm_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_cd));
				arg.itm_sub1(hdrR.itm_sub1());
				arg.itm_sub1_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub1));
				arg.itm_sub2(hdrR.itm_sub2());
				arg.itm_sub2_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub2));
				arg.itm_sub3(hdrR.itm_sub3());
				arg.itm_sub3_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub3));
				arg.loc_cd(hdrR.mfg_loc_cd());
				arg.loc_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_cd));
				arg.bp_cd(nullValToNull(hdrR.sppl_cd()));
				arg.bp_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sppl_cd));
				arg.wg_cd(hdrR.mfg_loc_wg_cd());
				arg.wg_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_wg_cd));
				arg.site_cd(hdrR.mfg_loc_site_cd());
				arg.site_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_site_cd));
				arg.dt(hdrR.yield_dt());
				arg.dt_label_nm(hdrR.yield_dt_label_nm());
				MCList<MfgInstActCom_Sprt01_DtlR> chdL = _dtlCache.getCache(hdrR.hdr_peg_no());
				if (!isNull(chdL)) {
					arg.chd_lot_no(nullValToNull(chdL.get(0).lot_no()));
				}
				arg.chd_lot_no_label_nm(MAC_NUM_PROC.MFG_CHD_LOT_NO.name(getUsrLocale()));
				arg.sno1(nullValToNull(hdrR.sno1()));
				arg.sno1_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno1));
				arg.sno2(nullValToNull(hdrR.sno2()));
				arg.sno2_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno2));
				arg.sno3(nullValToNull(hdrR.sno3()));
				arg.sno3_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno3));
				arg.sno4(nullValToNull(hdrR.sno4()));
				arg.sno4_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno4));
				arg.co_cd(getCo().co_cd());
				
				MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
				MCList<MfgInstActCom_Sprt01_HdrR> issueL = MCList.create(MfgInstActCom_Sprt01_HdrR.class);
				args.add(arg);
				issueL.add(hdrR);
				try {
					setNum(MAC_NUM_BIZ_TYP.LOT, args);
					String[] srcCols = new String[]{ElmArgsR.$new_no};
					String[] destCols = new String[]{MfgInstActCom_Sprt01_HdrR.$lot_no};
					copyByPegNo(issueL, destCols, args, srcCols);
				}
				catch (MCAppException e){
					if (!hdrR.no_exception_flg() ){
						throw e;
					}
					MCMessage msg = e.getMCMessage();
					msg.setCauseRow(hdrR, MfgInstActCom_Sprt01_HdrR.$lot_no);
					if (!getNrmlNumErrMsgIdList().contains(msg.getID())) {
						throw e;
					}
					hdrR.err_flg(true);
					if (!hdrR.no_err_msg_flg()) {
						MCMessagePool.add(msg);
					}
				}
			}
		}
		
		protected void setSublotNo() {
			for (MfgInstActCom_Sprt01_HdrR hdrR : up0()) {
				if (!hdrR.sublot_issue_flg()) {
					continue;
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(hdrR.sublot_mng_typ())) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1053, toDispGUIIndex(hdrR)));
					continue;
				}
				if (!isNull(hdrR.sublot_no())) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1057, toDispGUIIndex(hdrR)));
					continue;
				}

				ElmArgsR arg = ElmArgsR.create();
				arg.num_ptn_cd(hdrR.sublot_no_ptn_cd());
				arg.peg_no(hdrR.peg_no());
				arg.itm_cd(hdrR.itm_cd());
				arg.itm_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_cd));
				arg.itm_sub1(hdrR.itm_sub1());
				arg.itm_sub1_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub1));
				arg.itm_sub2(hdrR.itm_sub2());
				arg.itm_sub2_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub2));
				arg.itm_sub3(hdrR.itm_sub3());
				arg.itm_sub3_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$itm_sub3));
				arg.loc_cd(hdrR.mfg_loc_cd());
				arg.loc_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_cd));
				arg.bp_cd(nullValToNull(hdrR.sppl_cd()));
				arg.bp_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sppl_cd));
				arg.wg_cd(hdrR.mfg_loc_wg_cd());
				arg.wg_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_wg_cd));
				arg.site_cd(hdrR.mfg_loc_site_cd());
				arg.site_cd_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$mfg_loc_site_cd));
				arg.dt(hdrR.yield_dt());
				arg.dt_label_nm(hdrR.yield_dt_label_nm());
				MCList<MfgInstActCom_Sprt01_DtlR> chdL = _dtlCache.getCache(hdrR.hdr_peg_no());
				if (!isNull(chdL)) {
					arg.chd_sublot_no(chdL.get(0).sublot_no());
				}
				arg.chd_lot_no_label_nm(MAC_NUM_PROC.MFG_CHD_SUBLOT_NO.name(getUsrLocale()));
				arg.sno1(nullValToNull(hdrR.sno1()));
				arg.sno1_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno1));
				arg.sno2(nullValToNull(hdrR.sno2()));
				arg.sno2_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno2));
				arg.sno3(nullValToNull(hdrR.sno3()));
				arg.sno3_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno3));
				arg.sno4(nullValToNull(hdrR.sno4()));
				arg.sno4_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$sno4));
				arg.lot_no(nullValToNull(hdrR.lot_no()));
				arg.lot_no_label_nm(getLabel(hdrR, MfgInstActCom_Sprt01_HdrR.$lot_no));
				arg.co_cd(getCo().co_cd());
				
				MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
				MCList<MfgInstActCom_Sprt01_HdrR> issueL = MCList.create(MfgInstActCom_Sprt01_HdrR.class);
				args.add(arg);
				issueL.add(hdrR);
				try {
					setNum(MAC_NUM_BIZ_TYP.SUBLOT, args);
					String[] srcCols = new String[]{ElmArgsR.$new_no};
					String[] destCols = new String[]{MfgInstActCom_Sprt01_HdrR.$sublot_no};
					copyByPegNo(issueL, destCols, args, srcCols);
				}
				catch (MCAppException e){
					if (!hdrR.no_exception_flg() ){
						throw e;
					}
					MCMessage msg = e.getMCMessage();
					msg.setCauseRow(hdrR, MfgInstActCom_Sprt01_HdrR.$sublot_no);
					if (!getNrmlNumErrMsgIdList().contains(msg.getID())) {
						throw e;
					}
					hdrR.err_flg(true);
					if (!hdrR.no_err_msg_flg()) {
						MCMessagePool.add(msg);
					}
				}
			}
		}
		
		protected void setDown() {
			for (MfgInstActCom_Sprt01_HdrR hdrR : up0()) {
				// 発番ＩＤにNULL文字が設定されている可能性があるため、ロットＮＯにNULL文字が設定されていたらここでクリアする
				if (hdrR.lot_issue_flg() && MAC_STR.isNULL_VAL(hdrR.lot_no())) {
					hdrR.lot_no(null);
				}
				if (hdrR.sublot_issue_flg() && MAC_STR.isNULL_VAL(hdrR.sublot_no())) {
					hdrR.sublot_no(null);
				}
				down0().add(hdrR);
			}
		}
	}
	/**
	 * MfgInstActCom_Upd04オペレーション.<p>
	 *
	 * 製造着手時の実績残・受払予定の更新処理<br>
	 */
	public class MfgInstActCom_Upd04 extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd04 {

		/**
		 * 製造指図ＮＯを元に明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd04_HdrR>> _hdrCacheByMfgInstNo;

		/**
		 * 製造指図ＮＯ＋分割連番を元に明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgInstActCom_Upd04_HdrR> _hdrCacheByDivSeq;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			// キャッシュの作成
			setCache();
			
			// 上り電文の製造指図ＮＯに紐付く、工程指図、各種予定テーブルを取得する
			// ※受払予定の削除及び、着手時再計算で使用する
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> byL = MCList.create(MST_YIELD_SCHD_R.class);
			srchInstAndSchd(oiL, ysL, isL, wsL, byL);
			
			// 受注状況更新サービス（完了の取消）の呼び出し
			callSloStsInsSrvCmplDel(up1(), ysL);
			
			// 実績登録時に登録した残テーブルを削除する
			delRem(up1());
			
			// 着手中の実績残テーブルを作成する
			insRem(up1(), oiL, ysL, isL, wsL, byL);
			
			// 受払予定を削除する
			delSeqIoSchd(ysL, isL, byL);

			// 受注状況更新サービスの呼び出し
			callSloStsInsSrv(up1(), ysL);
		}
		
		protected void setCache() {
			_hdrCacheByDivSeq = new FXUCL_Cache<MfgInstActCom_Upd04_HdrR>();
			_hdrCacheByDivSeq.setFixMaxCacheSize(-1);
			
			for (MfgInstActCom_Upd04_HdrR hdrR : up1()) {
				_hdrCacheByDivSeq.putCache(new Comparable[]{hdrR.mfg_inst_no(), hdrR.div_seq()}, hdrR);
			}
			
			_hdrCacheByMfgInstNo = new FXUCL_Cache<MCList<MfgInstActCom_Upd04_HdrR>>();
			_hdrCacheByMfgInstNo.setFixMaxCacheSize(-1);
			for (MCList<MfgInstActCom_Upd04_HdrR> gL : up1()
					.groupList(MfgInstActCom_Upd04_HdrR.$mfg_inst_no)) {
				_hdrCacheByMfgInstNo.putCache(new String[]{gL.get(0).mfg_inst_no()}, gL);
			}
		}
		
		protected static final String HDR_MFG_STS_TYP_COL = "tmp_hdr_mfg_sts_typ";
		protected static final String BASE_INPT_REM_QTY_COL = "tmp_base_inpt_rem_qty";
		protected static final String BASE_FXD_REM_QTY_COL = "tmp_base_fxd_rem_qty";
		
		/**
		 * 上り電文の製造指図ＮＯに対応する工程指図、各種予定テーブルを取得する
		 */
		protected void srchInstAndSchd(MCList<MST_OPER_INST_R> oiL,
				MCList<MST_YIELD_SCHD_R> ysL,
				MCList<MST_INPT_SCHD_R> isL,
				MCList<MST_WK_SCHD_R> wsL,
				MCList<MST_YIELD_SCHD_R> byL) {

			MCList<MfgInstActCom_Upd04_HdrR> bindL = up1().groupBy(MfgInstActCom_Upd04_HdrR.$mfg_inst_no);

			MST_OPER_INST_R oiL_t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(oiL_t);
			MSVT_MFG_INST_PR_R s1t2 = MSVT_MFG_INST_PR_R.create("T2");
			oiL_bldr.setSelect(
					oiL_t.oper_inst_no,
					oiL_t.mfg_inst_no
					);
			oiL_bldr.addSelect(s1t2.mfg_sts_typ.as("tmp_hdr_mfg_sts_typ"));
			oiL_bldr.addInnerJoin(s1t2, bracket(oiL_t.mfg_inst_no.eq(s1t2.mfg_inst_no)));
			oiL_bldr.setWhere(oiL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			oiL_bldr.addWhereWithAnd(oiL_t.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_OPER_INST_S02", oiL, oiL_bldr, bindL);

			MCList<MST_YIELD_SCHD_R> tmpYsL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R tmpYsL_t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder tmpYsL_bldr = MCQueryApiBuilder.create(tmpYsL_t);
			MSVT_MFG_INST_PR_R s2t2 = MSVT_MFG_INST_PR_R.create("T2");
			MAM_ITM_R s2m2 = MAM_ITM_R.create("M2");
			tmpYsL_bldr.setSelect(
					tmpYsL_t.yield_schd_no,
					tmpYsL_t.mfg_inst_no,
					tmpYsL_t.oper_inst_no,
					tmpYsL_t.yield_typ,
					tmpYsL_t.itm_cd,
					tmpYsL_t.itm_sub1,
					tmpYsL_t.itm_sub2,
					tmpYsL_t.itm_sub3,
					tmpYsL_t.trd_unit_cd
					);
			tmpYsL_bldr.addSelect(
					s2t2.mfg_sts_typ.as("tmp_hdr_mfg_sts_typ")
					);
			tmpYsL_bldr.addSelect(
					s2m2.dec_place.as("base_dec_place"),
					s2m2.rnd_typ.as("base_rnd_typ")
					);
			tmpYsL_bldr.addInnerJoin(s2t2,
					bracket(tmpYsL_t.mfg_inst_no.eq(s2t2.mfg_inst_no)));
			tmpYsL_bldr.addLeftOuterJoin(s2m2,
					bracket(s2m2.itm_cd.eq(tmpYsL_t.itm_cd)
							.and(s2m2.itm_sub1.eq(tmpYsL_t.itm_sub1))
							.and(s2m2.itm_sub2.eq(tmpYsL_t.itm_sub2))
							.and(s2m2.itm_sub3.eq(tmpYsL_t.itm_sub3))));
			tmpYsL_bldr.setWhere(tmpYsL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			tmpYsL_bldr.addWhereWithAnd(tmpYsL_t.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_YIELD_SCHD_S01", tmpYsL, tmpYsL_bldr, bindL);
			MCJoinerList<MST_YIELD_SCHD_R> joinList = new MCJoinerList<>();
			joinList
			.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(),r.itm_sub3(), r.trd_unit_cd()
			))
			.addSelect(m -> toArray(
					m.dec_place, m.rnd_typ, m.conv_base_qty, m.conv_qty
			))
			.addMap((r, m) -> {
				r.setNumberNE("trd_dec_place", m.dec_place());
				r.setStringNE("trd_rnd_typ", m.rnd_typ());
				r.setNumberNE("conv_base_qty", m.conv_base_qty());
				r.setNumberNE("conv_qty", m.conv_qty());
			});
			joinList.join(tmpYsL);
			ysL.addAll(tmpYsL.subList(MST_YIELD_SCHD_R.$yield_typ,
					MAC_YIELD_TYP.GOOD.value()));
			byL.addAll(tmpYsL.subList(MST_YIELD_SCHD_R.$yield_typ,
					MAC_YIELD_TYP.BYPROD.value()));

			MST_INPT_SCHD_R isL_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(isL_t);
			MSVT_MFG_INST_PR_R s3t2 = MSVT_MFG_INST_PR_R.create("T2");
			MSVT_INPT_SCHD_PR_R s3t3 = MSVT_INPT_SCHD_PR_R.create("T3");
			MST_MFG_INST_R s3t4 = MST_MFG_INST_R.create("T4");
			MAM_ITM_R s3m1 = MAM_ITM_R.create("M1");
			isL_bldr.setSelect(
					isL_t.inpt_schd_no,
					isL_t.mfg_inst_no,
					isL_t.oper_inst_no,
					isL_t.recalc_grp,
					isL_t.recalc_grp_seq
					);
			isL_bldr.addSelect(s3t2.mfg_sts_typ.as("tmp_hdr_mfg_sts_typ"));
			isL_bldr.addSelect(isL_t.base_unit_inpt_qty
					.subtract(s3t3.base_unit_inpt_qty).as("tmp_base_inpt_rem_qty"));
			isL_bldr.addSelect(isL_t.base_unit_fxd_rqmt_qty
					.subtract(s3t3.base_unit_fxd_rqmt_qty).as("tmp_base_fxd_rem_qty"));
			isL_bldr.addSelect(isL_t.cont_inpt_qty
					.subtract(s3t3.cont_inpt_qty).as("tmp_cont_inpt_rem_qty"));
			isL_bldr.addSelect(isL_t.cont_fxd_rqmt_qty
					.subtract(s3t3.cont_fxd_rqmt_qty).as("tmp_cont_fxd_rem_qty"));
			isL_bldr.addSelect(s3t4.base_unit_inst_qty);
			isL.addBooleanColumn("cont_fctr_flg");
			isL_bldr.addSelect(s3m1.cont_fctr_flg);
			isL_bldr.addInnerJoin(s3t2, bracket(isL_t.mfg_inst_no.eq(s3t2.mfg_inst_no)));
			isL_bldr.addInnerJoin(s3t3,
					bracket(isL_t.inpt_schd_no.eq(s3t3.inpt_schd_no)));
			isL_bldr.addInnerJoin(s3t4, bracket(isL_t.mfg_inst_no.eq(s3t4.mfg_inst_no)));
			isL_bldr.addLeftOuterJoin(s3m1,
					bracket(isL_t.itm_cd.eq(s3m1.itm_cd)
							.and(isL_t.itm_sub1.eq(s3m1.itm_sub1))
							.and(isL_t.itm_sub2.eq(s3m1.itm_sub2))
							.and(isL_t.itm_sub3.eq(s3m1.itm_sub3))));
			isL_bldr.setWhere(isL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			isL_bldr.addWhereWithAnd(
					isL_t.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			isL_bldr.addWhereWithAnd(isL_t.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_INPT_SCHD_S01", isL, isL_bldr, bindL);

			MST_WK_SCHD_R wsL_t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(wsL_t);
			MSVT_MFG_INST_PR_R s4t2 = MSVT_MFG_INST_PR_R.create("T2");
			wsL_bldr.setSelect(
					wsL_t.wk_schd_no,
					wsL_t.mfg_inst_no,
					wsL_t.oper_inst_no
					);
			wsL_bldr.addSelect(s4t2.mfg_sts_typ.as("tmp_hdr_mfg_sts_typ"));
			wsL_bldr.addInnerJoin(s4t2, bracket(wsL_t.mfg_inst_no.eq(s4t2.mfg_inst_no)));
			wsL_bldr.setWhere(wsL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			wsL_bldr.addWhereWithAnd(wsL_t.can_flg.eq(value(false)));
			dbSelect("MSBCL6110_MST_WK_SCHD_S01", wsL, wsL_bldr, bindL);
		}
		
		/**
		 * 受払予定を削除する
		 */
		protected void delSeqIoSchd(
				MCList<MST_YIELD_SCHD_R> ysL,
				MCList<MST_INPT_SCHD_R> isL,
				MCList<MST_YIELD_SCHD_R> byL) {
			
			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			
			// 受払予定の削除
			// ※残数がある場合の受払予定復活処理はUpd08で行う
			if (!ysL.isEmpty()) {
				addAll(o.up0(), ysL, createMap_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R());
			}
			if (!byL.isEmpty()) {
				addAll(o.up0(), byL, createMap_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R());
			}
			if (!isL.isEmpty()) {
				addAll(o.up0(), isL, createMap_MSW_IO_SCHD_DEL_R_MST_INPT_SCHD_R());
			}
			o.exec();
		}
		
		// 出来高・副産品（指図済の受払予定の削除）
		protected Map_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R<MSW_IO_SCHD_DEL_R,MST_YIELD_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R<MSW_IO_SCHD_DEL_R, MST_YIELD_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_YIELD_SCHD_R<D extends MSW_IO_SCHD_DEL_R, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				if (MAC_YIELD_TYP.isBYPROD(src.yield_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.BYMFG.value());
				}
				else {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value());
				}
				dest.io_schd_sts_typ(getIoSchdStsTyp(src.getString(HDR_MFG_STS_TYP_COL)));
			}
		}
		
		protected String getIoSchdStsTyp(String hdrMfgStsTyp) {
			// 受払状況区分は製造指図の状況に従う
			if (MSC_MFG_STS_TYP.isORD(hdrMfgStsTyp)) {
				// 指図済の場合は「指図済」
				return MSC_IO_SCHD_STS_TYP.ORD.value();
			}
			else if (MSC_MFG_STS_TYP.isSTT(hdrMfgStsTyp)
					|| MSC_MFG_STS_TYP.isCMPL(hdrMfgStsTyp)) {
				// 着手中または完了（※製造は完了だが投入実績が未計上の状態）の場合は「着手中」
				return MSC_IO_SCHD_STS_TYP.STT.value();
			}
			return null;
		}
		
		// 投入（指図済の受払予定の削除）
		protected Map_MSW_IO_SCHD_DEL_R_MST_INPT_SCHD_R<MSW_IO_SCHD_DEL_R,MST_INPT_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_INPT_SCHD_R() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_INPT_SCHD_R<MSW_IO_SCHD_DEL_R, MST_INPT_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_INPT_SCHD_R<D extends MSW_IO_SCHD_DEL_R, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				dest.io_schd_sts_typ(getIoSchdStsTyp(src.getString(HDR_MFG_STS_TYP_COL)));
			}
		}
		
		/**
		 * 実績登録時に登録した残テーブルを削除する
		 */
		protected void delRem(MCList<MfgInstActCom_Upd04_HdrR> hdrUpL) {
			MCList<MfgInstActCom_Upd04_HdrR> delHdrL = hdrUpL.subList(r -> isDelRem(r));
			if (!delHdrL.isEmpty()) {
				MST_MFG_ACT_REM_R dbc1 = MST_MFG_ACT_REM_R.create("T");
				execDbDelete("MSBCL6110_MST_MFG_ACT_REM_D01", dbc1, dbc1.mfg_inst_no.eq(bind("mfg_inst_no"))
						.and(dbc1.div_seq.eq(bind("div_seq"))), delHdrL);

				MST_OPER_ACT_REM_R dbc2 = MST_OPER_ACT_REM_R.create("T");
				execDbDelete("MSBCL6110_MST_OPER_ACT_REM_D01", dbc2, dbc2.mfg_inst_no.eq(bind("mfg_inst_no"))
						.and(dbc2.div_seq.eq(bind("div_seq"))), delHdrL);

				MST_YIELD_ACT_REM_R dbc3 = MST_YIELD_ACT_REM_R.create("T");
				execDbDelete("MSBCL6110_MST_YIELD_ACT_REM_D01", dbc3, dbc3.mfg_inst_no.eq(bind("mfg_inst_no"))
						.and(dbc3.div_seq.eq(bind("div_seq"))), delHdrL);

				MST_INPT_ACT_REM_R dbc4 = MST_INPT_ACT_REM_R.create("T");
				execDbDelete("MSBCL6110_MST_INPT_ACT_REM_D01", dbc4, dbc4.mfg_inst_no.eq(bind("mfg_inst_no"))
						.and(dbc4.div_seq.eq(bind("div_seq"))), delHdrL);

				MST_WK_ACT_REM_R dbc5 = MST_WK_ACT_REM_R.create("T");
				execDbDelete("MSBCL6110_MST_WK_ACT_REM_D01", dbc5, dbc5.mfg_inst_no.eq(bind("mfg_inst_no"))
						.and(dbc5.div_seq.eq(bind("div_seq"))), delHdrL);
			}
		}
		
		protected boolean isDelRem(MfgInstActCom_Upd04_HdrR hdrUpR) {
			if (up0().is_src_mfg_inst_srv_flg()) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(hdrUpR.data_crud_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 着手時再計算サービスを実行した結果を元に、残テーブルを作成する
		 */
		protected void insRem(
				MCList<MfgInstActCom_Upd04_HdrR> hdrUpL,
				MCList<MST_OPER_INST_R> oiL,
				MCList<MST_YIELD_SCHD_R> ysL,
				MCList<MST_INPT_SCHD_R> isL,
				MCList<MST_WK_SCHD_R> wsL,
				MCList<MST_YIELD_SCHD_R> byL) {
			
			// 着手時再計算サービス（ヘッダのデータ更新区分が新規と削除が同時に上ってきた場合を考慮し、削除の行も渡す必要がある）
			MSBCL_MfgReCalcService.MfgReCalc_Sprt03 o = MSBCL_MfgReCalcService.crtMfgReCalc_Sprt03();
			
			// ヘッダの上り電文作成
			addAll(o.up0(), hdrUpL, createMap_MfgReCalc_Sprt03_HdrR_MfgInstActCom_Upd04_HdrR());
			setPegNo(o.up0());
			MCIndexKey oUp0Key = o.up0().createIndex(MfgReCalc_Sprt03_HdrR.$peg_no);
			
			FXUCL_Cache<MfgReCalc_Sprt03_HdrR> recalcHdrCache = new FXUCL_Cache<MfgReCalc_Sprt03_HdrR>();
			recalcHdrCache.setFixMaxCacheSize(-1);
			
			// 工程の上り電文作成及び、ヘッダ紐付けNOのキャッシュ作成
			MCIndexKey oiIdxKey = oiL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
			for (MfgReCalc_Sprt03_HdrR oUp0R : o.up0()) {
				MCList<MST_OPER_INST_R> oiSubL = oiL.subList(oiIdxKey, oUp0R.mfg_inst_no());
				MCList<MfgReCalc_Sprt03_DtlOperR> oUp1L = MCList.create(MfgReCalc_Sprt03_DtlOperR.class);
				addAll(oUp1L, oiSubL, createMap_MfgReCalc_Sprt03_DtlOperR_MST_OPER_INST_R());
				
				for (MfgReCalc_Sprt03_DtlOperR oUp1R : oUp1L) {
					oUp1R.hdr_peg_no(oUp0R.peg_no());
				}
				o.up1().addAll(oUp1L);
				recalcHdrCache.putCache(new MCNumber[]{oUp0R.peg_no()}, oUp0R);
			}
			setPegNo(o.up1());
			
			// 各種予定の上り電文作成及び、工程紐付けNOのキャッシュ作成
			FXUCL_Cache<MfgReCalc_Sprt03_DtlOperR> recalcOperCache = new FXUCL_Cache<MfgReCalc_Sprt03_DtlOperR>();
			recalcOperCache.setFixMaxCacheSize(-1);

			MCIndexKey ysIdxKey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			MCIndexKey isIdxKey = isL.createIndex(MST_INPT_SCHD_R.$oper_inst_no);
			MCIndexKey wsIdxKey = wsL.createIndex(MST_WK_SCHD_R.$oper_inst_no);
			MCIndexKey byIdxKey = byL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
			for (MfgReCalc_Sprt03_DtlOperR oUp1R : o.up1()) {
				// o.up0()から製造指図ＮＯ、分割連番を取得し、上り電文のヘッダを取得する（更新ステータスを取得するため）
				MfgReCalc_Sprt03_HdrR oUp0r = o.up0().getFirst(oUp0Key, oUp1R.hdr_peg_no());
				MfgInstActCom_Upd04_HdrR upHdrR = _hdrCacheByDivSeq.getCache(oUp0r.mfg_inst_no(), oUp0r.div_seq());
				
				// 出来高
				MCList<MST_YIELD_SCHD_R> ysSubL = ysL.subList(ysIdxKey, oUp1R.oper_inst_no());
				MCList<MfgReCalc_Sprt03_DtlYieldR> oUp2L = MCList.create(MfgReCalc_Sprt03_DtlYieldR.class);
				addAll(oUp2L, ysSubL, createMap_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R());
				for (MfgReCalc_Sprt03_DtlYieldR oUp2R : oUp2L) {
					oUp2R.hdr_peg_no(oUp1R.hdr_peg_no());
					oUp2R.oper_peg_no(oUp1R.peg_no());
				}
				o.up2().addAll(oUp2L);
				
				// 副産品
				MCList<MST_YIELD_SCHD_R> bySubL = byL.subList(byIdxKey, oUp1R.oper_inst_no());
				MCList<MfgReCalc_Sprt03_DtlYieldR> oUp3L = MCList.create(MfgReCalc_Sprt03_DtlYieldR.class);
				addAll(oUp3L, bySubL, createMap_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R());
				for (MfgReCalc_Sprt03_DtlYieldR oUp3R : oUp3L) {
					oUp3R.hdr_peg_no(oUp1R.hdr_peg_no());
					oUp3R.oper_peg_no(oUp1R.peg_no());
				}
				o.up3().addAll(oUp3L);
				
				// 投入
				MCList<MST_INPT_SCHD_R> isSubL = getIsSubL(upHdrR, isL.subList(isIdxKey, oUp1R.oper_inst_no()));
				MCList<MfgReCalc_Sprt03_DtlInptR> oUp4L = MCList.create(MfgReCalc_Sprt03_DtlInptR.class);
				addAll(oUp4L, isSubL, createMap_MfgReCalc_Sprt03_DtlInptR_MST_INPT_SCHD_R());
				for (MfgReCalc_Sprt03_DtlInptR oUp4R : oUp4L) {
					oUp4R.hdr_peg_no(oUp1R.hdr_peg_no());
					oUp4R.oper_peg_no(oUp1R.peg_no());
				}
				o.up4().addAll(oUp4L);
				
				// 工数
				MCList<MST_WK_SCHD_R> wsSubL = wsL.subList(wsIdxKey, oUp1R.oper_inst_no());
				MCList<MfgReCalc_Sprt03_DtlWkR> oUp5L = MCList.create(MfgReCalc_Sprt03_DtlWkR.class);
				addAll(oUp5L, wsSubL, createMap_MfgReCalc_Sprt03_DtlWkR_MST_WK_SCHD_R());
				for (MfgReCalc_Sprt03_DtlWkR oUp5R : oUp5L) {
					oUp5R.hdr_peg_no(oUp1R.hdr_peg_no());
					oUp5R.oper_peg_no(oUp1R.peg_no());
				}
				o.up5().addAll(oUp5L);
				
				recalcOperCache.putCache(new MCNumber[]{oUp1R.peg_no()}, oUp1R);
			}
			
			// 紐付けＮＯの設定
			setPegNo(o.up2(), o.up3(), o.up4(), o.up5());
			
			// 製造再計算サービスの実行
			o.exec();
			
			// 実績残テーブルの登録
			// ※ここでは着手中として登録する（完了にする処理や実績数に応じた残数設定処理は、Upd08で行う）
			// 製造実績残
			insMfgActRem(hdrUpL);
			// 工程実績残
			insOperActRem(recalcHdrCache, o.up1());
			// 出来高実績残（出来高）
			insYieldActRem(recalcHdrCache, recalcOperCache, o.up2(), ysL, false);
			// 出来高実績残（副産品）
			insYieldActRem(recalcHdrCache, recalcOperCache, o.up3(), byL, true);
			// 投入実績残
			insInptActRem(recalcHdrCache, recalcOperCache, o.up4());
			// 工数実績残
			insWkActRem(recalcHdrCache, recalcOperCache, o.up5());
		}

		/**
		 * 実績残テーブル登録対象の投入予定を絞り込みます
		 * @param upHdrR 上り電文のヘッダ
		 * @param isL 投入予定
		 * @return
		 */
		protected MCList<MST_INPT_SCHD_R> getIsSubL(MfgInstActCom_Upd04_HdrR upHdrR, MCList<MST_INPT_SCHD_R> isL) {
			MCList<MST_INPT_SCHD_R> isSubL = MCList.create(MST_INPT_SCHD_R.class);

			boolean excludeFlg = true;
			for (MST_INPT_SCHD_R isR : isL) {
				if (!isNullOrZeroOrMinus(isR.getNumberNE(BASE_INPT_REM_QTY_COL))
						|| !isNullOrZeroOrMinus(isR.getNumberNE(BASE_FXD_REM_QTY_COL))) {
					excludeFlg = false;
					break;
				}
				// 製造指図数量と着手数量が等しくない＝着手時分割されている場合、データの絞込は行わない
				if (!isSame(isR.getNumberNE("base_unit_inst_qty"), upHdrR.base_unit_st_qty())) {
					excludeFlg = false;
					break;
				}
			}
			
			// ヘッダのステータスが新規の場合でも、同一再計算Ｇの投入予定がすべて完了でないなら、データの絞込は行わない（isLをそのまま返す）
			if (!excludeFlg || !MAC_DATA_CRUD_TYP.isCRT(upHdrR.data_crud_typ())) {
				return isL;
			}
			
			// ヘッダのステータスが新規の場合（着手時）、数量がゼロ以下のレコードを除外する
			for (MST_INPT_SCHD_R isR : isL) {
				if (isNullOrZeroOrMinus(isR.getNumberNE(BASE_INPT_REM_QTY_COL))
						&& isNullOrZeroOrMinus(isR.getNumberNE(BASE_FXD_REM_QTY_COL))) {
					continue;
				}
				isSubL.add(isR);
			}
			return isSubL;
		}
		
		/**
		 * 数量がnull、ゼロ、マイナスのいずれかの場合はtrue
		 * @param num
		 * @return
		 */
		protected boolean isNullOrZeroOrMinus(MCNumber num) {
			return isNull(num) || num.isZero() || num.isNegative();
		}

		protected void insMfgActRem(MCList<MfgInstActCom_Upd04_HdrR> hdrUpL) {
			MCList<MST_MFG_ACT_REM_R> mfgRemL = MCList.create(MST_MFG_ACT_REM_R.class);
			for (MfgInstActCom_Upd04_HdrR r : hdrUpL) {
				if (isInsActRem(r)) {
					MST_MFG_ACT_REM_R mfgRemR = MST_MFG_ACT_REM_R.create();
					mfgRemR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
					mfgRemR.mfg_inst_no(r.mfg_inst_no());
					mfgRemR.div_seq(r.div_seq());
					mfgRemR.itm_mfg_inst_no(r.itm_mfg_inst_no());
					mfgRemR.base_unit_mfg_qty(r.base_unit_st_qty());
					mfgRemR.base_unit_mfg_rem_qty(r.base_unit_st_qty());
					mfgRemR.base_unit_mfg_abort_qty(MCNumber.ZERO);
					mfgRemL.add(mfgRemR);
				}
			}

			if (!mfgRemL.isEmpty()) {
				MCQueryApiBuilder mfgRemL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T"));
				dbInsertEx("MSBCL6110_MST_MFG_ACT_REM_I01", mfgRemL, mfgRemL_bldr);
			}
		}
		
		protected boolean isInsActRem(MfgInstActCom_Upd04_HdrR hdrUpR) {
			if (up0().is_src_mfg_inst_srv_flg()) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isCRT(hdrUpR.data_crud_typ())) {
				return true;
			}
			return false;
		}
		
		protected void insOperActRem(FXUCL_Cache<MfgReCalc_Sprt03_HdrR> recalcHdrCache,
				MCList<MfgReCalc_Sprt03_DtlOperR> recalcOperL) {
			
			MCList<MST_OPER_ACT_REM_R> operRemL = MCList.create(MST_OPER_ACT_REM_R.class);
			for (MfgReCalc_Sprt03_DtlOperR recalcOperR : recalcOperL) {
				MfgReCalc_Sprt03_HdrR recalcHdrR = recalcHdrCache.getCache(recalcOperR.hdr_peg_no());
				MfgInstActCom_Upd04_HdrR upHdrR = _hdrCacheByDivSeq.getCache(recalcHdrR.mfg_inst_no(), recalcOperR.div_seq());
				if (isInsActRem(upHdrR)) {
					MST_OPER_ACT_REM_R operRemR = MST_OPER_ACT_REM_R.create();
					operRemR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					operRemR.oper_inst_no(recalcOperR.oper_inst_no());
					operRemR.div_seq(recalcOperR.div_seq());
					operRemR.base_unit_qty(recalcOperR.base_unit_st_qty());
					operRemR.base_unit_rem_qty(operRemR.base_unit_qty());
					operRemR.base_unit_abort_qty(MCNumber.ZERO);

					operRemR.mfg_inst_no(recalcHdrR.mfg_inst_no());
					operRemR.itm_mfg_inst_no(upHdrR.itm_mfg_inst_no());

					operRemL.add(operRemR);
				}
			}

			if (!operRemL.isEmpty()) {
				MCQueryApiBuilder operRemL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T"));
				dbInsertEx("MSBCL6110_MST_OPER_ACT_REM_I01", operRemL, operRemL_bldr);
			}
		}

		protected void insYieldActRem(FXUCL_Cache<MfgReCalc_Sprt03_HdrR> recalcHdrCache,
				FXUCL_Cache<MfgReCalc_Sprt03_DtlOperR> recalcOperCache,
				MCList<MfgReCalc_Sprt03_DtlYieldR> recalcYieldL,
				MCList<MST_YIELD_SCHD_R> yieldSchdL, boolean isByProd) {
			
			MCList<MST_YIELD_ACT_REM_R> yieldRemL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MCIndexKey yieldSchdKey = yieldSchdL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			
			for (MfgReCalc_Sprt03_DtlYieldR recalcYieldR : recalcYieldL) {
				MfgReCalc_Sprt03_HdrR recalcHdrR = recalcHdrCache.getCache(recalcYieldR.hdr_peg_no());
				MfgReCalc_Sprt03_DtlOperR recalcOperR = recalcOperCache.getCache(recalcYieldR.oper_peg_no());
				MfgInstActCom_Upd04_HdrR upHdrR = _hdrCacheByDivSeq.getCache(recalcHdrR.mfg_inst_no(), recalcYieldR.div_seq());
				MST_YIELD_SCHD_R yieldSchdR = yieldSchdL.getFirst(yieldSchdKey, recalcYieldR.yield_schd_no());
				if (isInsActRem(upHdrR)) {
					MST_YIELD_ACT_REM_R yieldRemR = MST_YIELD_ACT_REM_R.create();
					yieldRemR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					yieldRemR.yield_schd_no(recalcYieldR.yield_schd_no());
					yieldRemR.div_seq(recalcYieldR.div_seq());
					if (isByProd) {
						yieldRemR.yield_typ(MAC_YIELD_TYP.BYPROD.value());
					}
					else {
						yieldRemR.yield_typ(MAC_YIELD_TYP.GOOD.value());
					}

					yieldRemR.base_unit_yield_qty(recalcYieldR.base_unit_yield_st_qty());
					yieldRemR.base_unit_yield_rem_qty(yieldRemR.base_unit_yield_qty());
					yieldRemR.base_unit_yield_abort_qty(MCNumber.ZERO);

					// 再計算結果の基準単位数を取引単位数に変換し、また基準単位数に戻したとき、元の基準単位数に戻らない場合は基準単位数を取引単位数に設定
					MCNumber trdQty = rvrsBaseUnitConv(recalcYieldR.base_unit_yield_st_qty(),
							yieldSchdR.getNumberNE("CONV_BASE_QTY"),
							yieldSchdR.getNumberNE("CONV_QTY"),
							yieldSchdR.getNumberNE("TRD_DEC_PLACE"),
							yieldSchdR.getStringNE("TRD_RND_TYP"));
					MCNumber baseQty = convToBaseUnit(trdQty,
							yieldSchdR.getNumberNE("CONV_BASE_QTY"),
							yieldSchdR.getNumberNE("CONV_QTY"),
							yieldSchdR.getNumberNE("BASE_DEC_PLACE"),
							yieldSchdR.getStringNE("BASE_RND_TYP"));

					if (isSame(baseQty, recalcYieldR.base_unit_yield_st_qty())) {
						yieldRemR.trd_unit_yield_qty(trdQty);
					}
					else {
						yieldRemR.trd_unit_yield_qty(recalcYieldR.base_unit_yield_st_qty());
					}
					yieldRemR.trd_unit_yield_rem_qty(yieldRemR.trd_unit_yield_qty());
					yieldRemR.trd_unit_yield_abort_qty(MCNumber.ZERO);

					yieldRemR.stk_lst_prnt_flg(false);
	
					yieldRemR.mfg_inst_no(recalcHdrR.mfg_inst_no());
					yieldRemR.itm_mfg_inst_no(upHdrR.itm_mfg_inst_no());
					yieldRemR.oper_inst_no(recalcOperR.oper_inst_no());
				
					yieldRemL.add(yieldRemR);
				}
			}
			
			if (!yieldRemL.isEmpty()) {
				MCQueryApiBuilder yieldRemL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T"));
				dbInsertEx("MSBCL6110_MST_YIELD_ACT_REM_I01", yieldRemL, yieldRemL_bldr);
			}
		}
		
		protected void insInptActRem(FXUCL_Cache<MfgReCalc_Sprt03_HdrR> recalcHdrCache,
				FXUCL_Cache<MfgReCalc_Sprt03_DtlOperR> recalcOperCache,
				MCList<MfgReCalc_Sprt03_DtlInptR> recalcInptL) {
			
			MCList<MST_INPT_ACT_REM_R> inptRemL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (MfgReCalc_Sprt03_DtlInptR recalcInptR : recalcInptL) {
				MfgReCalc_Sprt03_HdrR recalcHdrR = recalcHdrCache.getCache(recalcInptR.hdr_peg_no());
				MfgReCalc_Sprt03_DtlOperR recalcOperR = recalcOperCache.getCache(recalcInptR.oper_peg_no());
				MfgInstActCom_Upd04_HdrR upHdrR = _hdrCacheByDivSeq.getCache(recalcHdrR.mfg_inst_no(), recalcInptR.div_seq());
				if (isInsInptActRem(upHdrR, recalcInptR)) {
					MST_INPT_ACT_REM_R inptRemR = MST_INPT_ACT_REM_R.create();
					inptRemR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					inptRemR.inpt_schd_no(recalcInptR.inpt_schd_no());
					inptRemR.div_seq(recalcInptR.div_seq());
					inptRemR.base_unit_inpt_qty(nvl(recalcInptR.base_unit_inpt_st_qty(), MCNumber.ZERO));
					inptRemR.base_unit_rqmt_qty(nvl(recalcInptR.base_unit_rqmt_st_qty(), MCNumber.ZERO));
					inptRemR.base_unit_fxd_rqmt_qty(nvl(recalcInptR.base_unit_fxd_rqmt_st_qty(), MCNumber.ZERO));
					
					if (!isNull(recalcInptR.cont_inpt_st_qty())
							|| !isNull(recalcInptR.cont_rqmt_st_qty())
							|| !isNull(recalcInptR.cont_fxd_rqmt_st_qty())) {
						inptRemR.cont_inpt_qty(nvl(recalcInptR.cont_inpt_st_qty(), MCNumber.ZERO));
						inptRemR.cont_rqmt_qty(nvl(recalcInptR.cont_rqmt_st_qty(), MCNumber.ZERO));
						inptRemR.cont_fxd_rqmt_qty(nvl(recalcInptR.cont_fxd_rqmt_st_qty(), MCNumber.ZERO));
					}
					
					inptRemR.base_unit_inpt_rem_qty(inptRemR.base_unit_inpt_qty());
					inptRemR.base_unit_rqmt_rem_qty(inptRemR.base_unit_rqmt_qty());
					inptRemR.base_unit_fxd_rqmt_rem_qty(inptRemR.base_unit_fxd_rqmt_qty());
					inptRemR.cont_inpt_rem_qty(inptRemR.cont_inpt_qty());
					inptRemR.cont_rqmt_rem_qty(inptRemR.cont_rqmt_qty());
					inptRemR.cont_fxd_rqmt_rem_qty(inptRemR.cont_fxd_rqmt_qty());
					inptRemR.base_unit_inpt_abort_qty(MCNumber.ZERO);
					
					inptRemR.mfg_inst_no(recalcHdrR.mfg_inst_no());
					inptRemR.itm_mfg_inst_no(upHdrR.itm_mfg_inst_no());
					inptRemR.oper_inst_no(recalcOperR.oper_inst_no());
					
					inptRemL.add(inptRemR);
				}
			}
			
			if (!inptRemL.isEmpty()) {
				MCQueryApiBuilder inptRemL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T"));
				dbInsertEx("MSBCL6110_MST_INPT_ACT_REM_I01", inptRemL, inptRemL_bldr);
			}
		}
		
		protected boolean isInsInptActRem(MfgInstActCom_Upd04_HdrR upHdrR, MfgReCalc_Sprt03_DtlInptR recalcInptR) {
			if (!isInsActRem(upHdrR)) {
				return false;
			}
			
			if (isNullAnd(recalcInptR.base_unit_inpt_st_qty(), recalcInptR.base_unit_fxd_rqmt_st_qty())) {
				if (isNullAnd(recalcInptR.cont_inpt_st_qty(), recalcInptR.cont_fxd_rqmt_st_qty())) {
					// 投入については同一ＢＯＭから発生した投入予定については、先入先出しで消化していくため、
					// 着手時再計算の結果、nullとなった投入は登録対象外とする
					return false;
				}
			}
			return true;
		}
		
		protected void insWkActRem(FXUCL_Cache<MfgReCalc_Sprt03_HdrR> recalcHdrCache,
				FXUCL_Cache<MfgReCalc_Sprt03_DtlOperR> recalcOperCache,
				MCList<MfgReCalc_Sprt03_DtlWkR> recalcWkL) {
			MCList<MST_WK_ACT_REM_R> wkRemL = MCList.create(MST_WK_ACT_REM_R.class);
			for (MfgReCalc_Sprt03_DtlWkR recalcWkR : recalcWkL) {
				MfgReCalc_Sprt03_HdrR recalcHdrR = recalcHdrCache.getCache(recalcWkR.hdr_peg_no());
				MfgReCalc_Sprt03_DtlOperR recalcOperR = recalcOperCache.getCache(recalcWkR.oper_peg_no());
				MfgInstActCom_Upd04_HdrR upHdrR = _hdrCacheByDivSeq.getCache(recalcHdrR.mfg_inst_no(), recalcWkR.div_seq());
				if (isInsActRem(upHdrR)) {
					MST_WK_ACT_REM_R wkRemR = MST_WK_ACT_REM_R.create();
					wkRemR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					wkRemR.wk_schd_no(recalcWkR.wk_schd_no());
					wkRemR.div_seq(recalcWkR.div_seq());
					wkRemR.fxd_wk_cost(recalcWkR.st_fxd_wk_cost());
					wkRemR.wk_cost(recalcWkR.st_wk_cost());
					wkRemR.rem_wk_cost(recalcWkR.st_sum_wk_cost());
					wkRemR.abort_wk_cost(MCNumber.ZERO);
					
					wkRemR.mfg_inst_no(recalcHdrR.mfg_inst_no());
					wkRemR.itm_mfg_inst_no(upHdrR.itm_mfg_inst_no());
					wkRemR.oper_inst_no(recalcOperR.oper_inst_no());
					
					wkRemL.add(wkRemR);
				}
			}
			
			if (!wkRemL.isEmpty()) {
				MCQueryApiBuilder wkRemL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T"));
				dbInsertEx("MSBCL6110_MST_WK_ACT_REM_I01", wkRemL, wkRemL_bldr);
			}
		}
		
		// 着手時再計算（ヘッダ）
		protected Map_MfgReCalc_Sprt03_HdrR_MfgInstActCom_Upd04_HdrR<MfgReCalc_Sprt03_HdrR,MfgInstActCom_Upd04_HdrR> createMap_MfgReCalc_Sprt03_HdrR_MfgInstActCom_Upd04_HdrR() {
			return new Map_MfgReCalc_Sprt03_HdrR_MfgInstActCom_Upd04_HdrR<MfgReCalc_Sprt03_HdrR, MfgInstActCom_Upd04_HdrR>();
		}

		public class Map_MfgReCalc_Sprt03_HdrR_MfgInstActCom_Upd04_HdrR<D extends MfgReCalc_Sprt03_HdrR, S extends MfgInstActCom_Upd04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$mfg_inst_no, MfgInstActCom_Upd04_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$div_seq, MfgInstActCom_Upd04_HdrR.$div_seq);
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$base_unit_st_qty, MfgInstActCom_Upd04_HdrR.$base_unit_st_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (up0().is_src_mfg_inst_srv_flg()) {
					// 指図訂正から呼ばれた場合は、CRTで渡す（UPDだと、現在登録済みのDBの値をselectして返すようになってしまうため）
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(src.data_crud_typ());
				}
				dest.is_src_mfg_inst_srv_flg(up0().is_src_mfg_inst_srv_flg());
			}
		}

		// 着手時再計算（工程）
		protected Map_MfgReCalc_Sprt03_DtlOperR_MST_OPER_INST_R<MfgReCalc_Sprt03_DtlOperR,MST_OPER_INST_R> createMap_MfgReCalc_Sprt03_DtlOperR_MST_OPER_INST_R() {
			return new Map_MfgReCalc_Sprt03_DtlOperR_MST_OPER_INST_R<MfgReCalc_Sprt03_DtlOperR, MST_OPER_INST_R>();
		}

		public class Map_MfgReCalc_Sprt03_DtlOperR_MST_OPER_INST_R<D extends MfgReCalc_Sprt03_DtlOperR, S extends MST_OPER_INST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlOperR.$oper_inst_no, MST_OPER_INST_R.$oper_inst_no);
			}
		}

		// 着手時再計算（出来高・副産品）
		protected Map_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<MfgReCalc_Sprt03_DtlYieldR,MST_YIELD_SCHD_R> createMap_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R() {
			return new Map_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<MfgReCalc_Sprt03_DtlYieldR, MST_YIELD_SCHD_R>();
		}

		public class Map_MfgReCalc_Sprt03_DtlYieldR_MST_YIELD_SCHD_R<D extends MfgReCalc_Sprt03_DtlYieldR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
			}
		}

		// 着手時再計算（投入）
		protected Map_MfgReCalc_Sprt03_DtlInptR_MST_INPT_SCHD_R<MfgReCalc_Sprt03_DtlInptR,MST_INPT_SCHD_R> createMap_MfgReCalc_Sprt03_DtlInptR_MST_INPT_SCHD_R() {
			return new Map_MfgReCalc_Sprt03_DtlInptR_MST_INPT_SCHD_R<MfgReCalc_Sprt03_DtlInptR, MST_INPT_SCHD_R>();
		}

		public class Map_MfgReCalc_Sprt03_DtlInptR_MST_INPT_SCHD_R<D extends MfgReCalc_Sprt03_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$recalc_grp, MST_INPT_SCHD_R.$recalc_grp);
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$recalc_grp_seq, MST_INPT_SCHD_R.$recalc_grp_seq);
			}
		}

		// 着手時再計算（工数）
		protected Map_MfgReCalc_Sprt03_DtlWkR_MST_WK_SCHD_R<MfgReCalc_Sprt03_DtlWkR,MST_WK_SCHD_R> createMap_MfgReCalc_Sprt03_DtlWkR_MST_WK_SCHD_R() {
			return new Map_MfgReCalc_Sprt03_DtlWkR_MST_WK_SCHD_R<MfgReCalc_Sprt03_DtlWkR, MST_WK_SCHD_R>();
		}

		public class Map_MfgReCalc_Sprt03_DtlWkR_MST_WK_SCHD_R<D extends MfgReCalc_Sprt03_DtlWkR, S extends MST_WK_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlWkR.$wk_schd_no, MST_WK_SCHD_R.$wk_schd_no);
			}
		}
		
		/**
		 * 受注状況更新サービスを呼び出します。
		 */
		protected void callSloStsInsSrv(MCList<MfgInstActCom_Upd04_HdrR> hdrUpL,
				MCList<MST_YIELD_SCHD_R> ysL) {
			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();
			
			MCList<MfgInstActCom_Upd04_HdrR> callHdrL = MCList.create(MfgInstActCom_Upd04_HdrR.class);
			MCIndexKey ysIdxKey = ysL.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);
			for (MfgInstActCom_Upd04_HdrR upHdrR : hdrUpL) {
				if (isCallSloStsInsSrv(upHdrR, ysL, ysIdxKey)) {
					callHdrL.add(upHdrR);
				}
			}
			
			if (callHdrL.isEmpty()) {
				return;
			}
			
			MCList<MST_MFG_INST_R> miL = getMfgInstForSloStsSrv(callHdrL);
			MCIndexKey miIdxKey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);

			// 数量として製造指図ＮＯ＋分割連番に紐付く出来高実績残の基準単位着手数量の合計を取得する
			MCList<MST_YIELD_ACT_REM_R> yarL = getYieldActRemForSloStsSrv(callHdrL);
			MCIndexKey yarIdxKey = yarL.createIndex(MST_YIELD_ACT_REM_R.$mfg_inst_no, MST_YIELD_ACT_REM_R.$div_seq);
			
			for (MfgInstActCom_Upd04_HdrR upHdrR : callHdrL) {
				// 製造着手の行を作成
				SloSts_DtlR stUpR = SloSts_DtlR.create();
				stUpR.slo_sts_typ(MSC_SLO_STS_TYP.MFG_ST.value());
				stUpR.data_crud_typ(upHdrR.data_crud_typ());

				// 出来高実績残から数量を取得
				MST_YIELD_ACT_REM_R yarR = yarL.getFirst(yarIdxKey, upHdrR.mfg_inst_no(), upHdrR.div_seq());
				
				if (!MAC_DATA_CRUD_TYP.isDEL(upHdrR.data_crud_typ())) {
					stUpR.st_act_tm(upHdrR.st_act_tm());
					stUpR.qty(yarR.base_unit_yield_qty());
				}

				copy(stUpR, upHdrR, createMap_SloSts_DtlR_MfgInstActCom_Upd04_HdrR());
				
				MST_MFG_INST_R miR = miL.getFirst(miIdxKey, upHdrR.mfg_inst_no());
				stUpR.itm_cd(miR.getStringNE("itm_cd"));
				stUpR.itm_sub1(miR.getStringNE("itm_sub1"));
				stUpR.itm_sub2(miR.getStringNE("itm_sub2"));
				stUpR.itm_sub3(miR.getStringNE("itm_sub3"));
				stUpR.sno1(miR.getStringNE("sno1"));
				stUpR.sno2(miR.getStringNE("sno2"));
				stUpR.sno3(miR.getStringNE("sno3"));
				stUpR.sno4(miR.getStringNE("sno4"));
				stUpR.unit_cd(miR.base_unit_cd());
				stUpR.st_schd_tm(miR.st_schd_tm());
				
				o.up0().add(stUpR);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/**
		 * 完了している製造実績を取り消す場合、受注状況更新サービスを呼び出します。
		 */
		protected void callSloStsInsSrvCmplDel(MCList<MfgInstActCom_Upd04_HdrR> hdrUpL,
				MCList<MST_YIELD_SCHD_R> ysL) {
			// 受注状況更新サービスは、当オペレーション（Upd04）で着手と着手取消、Upd08で完了と完了取消を行っている。
			// ただし、完了している製造実績を取り消す場合は以下の問題が発生するため、Upd08ではなくここで完了の取り消しを行う。
			// ・Upd08で完了取消を行うと、着手→完了→着手取消→完了取消となってしまう。着手取消より前に完了取消を行いたい。
			// ・取消時にはUpd04で実績残テーブルの削除を行っているため、Upd08で実績残テーブルが参照できず、取消前のステータスが完了だったか判断できない。

			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();
			
			MCList<MfgInstActCom_Upd04_HdrR> callHdrL = MCList.create(MfgInstActCom_Upd04_HdrR.class);
			MCIndexKey ysIdxKey = ysL.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);
			for (MfgInstActCom_Upd04_HdrR upHdrR : hdrUpL) {
				if (isCallSloStsInsSrv(upHdrR, ysL, ysIdxKey)) {
					callHdrL.add(upHdrR);
				}
			}
			
			if (callHdrL.isEmpty()) {
				return;
			}

			// 製造指図ＮＯ＋分割連番で製造実績残テーブルを取得
			MCList<MST_MFG_ACT_REM_R> marL = getMfgActRemForSloStsSrvCmplDel(callHdrL);
			MCIndexKey marIdxKey = marL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no, MST_MFG_ACT_REM_R.$div_seq);

			for (MfgInstActCom_Upd04_HdrR r : callHdrL) {
				
				MST_MFG_ACT_REM_R remR = marL.getFirst(marIdxKey, r.mfg_inst_no(), r.div_seq());
				
				// 完了した製造実績の取消時のみ処理する
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || !MSC_MFG_STS_TYP.isCMPL(remR.mfg_sts_typ())) {
					continue;
				}
				
				// 製造完了の取消の行を作成
				SloSts_DtlR endUpR = SloSts_DtlR.create();
				copy(endUpR, r, createMap_SloSts_DtlR_MfgInstActCom_Upd04_HdrR());

				// 受注状況区分は完了、データ更新区分は削除
				endUpR.slo_sts_typ(MSC_SLO_STS_TYP.MFG_CMPL.value());
				endUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

				// 製造指図、品目製造指図の値を設定
				endUpR.itm_cd(remR.getStringNE("itm_cd"));
				endUpR.itm_sub1(remR.getStringNE("itm_sub1"));
				endUpR.itm_sub2(remR.getStringNE("itm_sub2"));
				endUpR.itm_sub3(remR.getStringNE("itm_sub3"));
				endUpR.sno1(remR.getStringNE("sno1"));
				endUpR.sno2(remR.getStringNE("sno2"));
				endUpR.sno3(remR.getStringNE("sno3"));
				endUpR.sno4(remR.getStringNE("sno4"));
				endUpR.unit_cd(remR.getStringNE("base_unit_cd"));
				endUpR.st_schd_tm(remR.getDateNE("st_schd_tm"));
				endUpR.end_schd_tm(remR.getDateNE("end_schd_tm"));

				// 着手実績日、終了実績日、数量には何も設定しない
				endUpR.st_act_tm(null);
				endUpR.end_act_tm(null);
				endUpR.qty(null);

				o.up0().add(endUpR);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected MCList<MST_MFG_INST_R> getMfgInstForSloStsSrv(
				MCList<MfgInstActCom_Upd04_HdrR> callHdrL) {
			MCList<MST_MFG_INST_R> instL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			instL_bldr.setSelect(t.mfg_inst_no);
			instL_bldr.addSelect(t.base_unit_cd);
			instL_bldr.addSelect(t.st_schd_tm);
			instL_bldr.addSelect(t2.itm_cd);
			instL_bldr.addSelect(t2.itm_sub1);
			instL_bldr.addSelect(t2.itm_sub2);
			instL_bldr.addSelect(t2.itm_sub3);
			instL_bldr.addSelect(t2.sno1);
			instL_bldr.addSelect(t2.sno2);
			instL_bldr.addSelect(t2.sno3);
			instL_bldr.addSelect(t2.sno4);
			instL_bldr.addInnerJoin(t2,
					bracket(t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			dbSelectKey("MSBCL6110_MST_MFG_INST_S06", instL, instL_bldr, callHdrL);
			
			return instL;
		}
		
		protected MCList<MST_YIELD_ACT_REM_R> getYieldActRemForSloStsSrv(
				MCList<MfgInstActCom_Upd04_HdrR> callHdrL) {
			MCList<MST_YIELD_ACT_REM_R> remL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			remL_bldr.setSelect(t.mfg_inst_no);
			remL_bldr.addSelect(t.div_seq);
			remL_bldr.addSelect(t.base_unit_yield_qty);
			remL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			remL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			remL_bldr.addWhereWithAnd(
					t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
			dbSelect("MSBCL6110_MST_YIELD_ACT_REM_S02", remL, remL_bldr,
					callHdrL.groupBy(MfgInstActCom_Upd04_HdrR.$mfg_inst_no,
							MfgInstActCom_Upd04_HdrR.$div_seq));

			if (!remL.isEmpty()) {
				MCGroupByPolicy gbp = new MCGroupByPolicy(
						MST_YIELD_ACT_REM_R.$mfg_inst_no,
						MST_YIELD_ACT_REM_R.$div_seq);
				gbp.sum(MST_YIELD_ACT_REM_R.$base_unit_yield_qty);
				return remL.groupBy(gbp);
			}
			
			return remL;
		}
		
		protected MCList<MST_MFG_ACT_REM_R> getMfgActRemForSloStsSrvCmplDel(
				MCList<MfgInstActCom_Upd04_HdrR> callHdrL) {
			MCList<MST_MFG_ACT_REM_R> remL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			MST_MFG_INST_R t4 = MST_MFG_INST_R.create("T4");
			remL_bldr.setSelect(t.mfg_inst_no);
			remL_bldr.addSelect(t.div_seq);
			remL_bldr.addSelect(t.mfg_sts_typ);
			remL_bldr.addSelect(t2.itm_cd);
			remL_bldr.addSelect(t2.itm_sub1);
			remL_bldr.addSelect(t2.itm_sub2);
			remL_bldr.addSelect(t2.itm_sub3);
			remL_bldr.addSelect(t2.sno1);
			remL_bldr.addSelect(t2.sno2);
			remL_bldr.addSelect(t2.sno3);
			remL_bldr.addSelect(t2.sno4);
			remL_bldr.addSelect(t3.mfg_act_no);
			remL_bldr.addSelect(t4.base_unit_cd);
			remL_bldr.addSelect(t4.st_schd_tm);
			remL_bldr.addSelect(t4.end_schd_tm);
			remL_bldr.addInnerJoin(t2, bracket(t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			remL_bldr.addInnerJoin(t3, bracket(t.mfg_inst_no.eq(t3.mfg_inst_no)
					.and(t.div_seq.eq(t3.div_seq))));
			remL_bldr.addInnerJoin(t4, bracket(t.mfg_inst_no.eq(t4.mfg_inst_no)));
			dbSelectKey("MSBCL6110_MST_MFG_ACT_REM_S01", remL, remL_bldr, callHdrL);

			return remL;
		}
		
		protected boolean isCallSloStsInsSrv(MfgInstActCom_Upd04_HdrR upHdrR,
				MCList<MST_YIELD_SCHD_R> ysL, MCIndexKey ysIdxKey) {
			if (up0().is_src_mfg_inst_srv_flg()) {
				return false;
			}
			if (MSC_MFG_MTD_TYP.isEXTNL(upHdrR.mfg_mtd_typ())) {
				return false;
			}
			if (isNull(ysL.getFirst(ysIdxKey, upHdrR.mfg_inst_no()))) {
				// 出来高が存在しない場合は、受注状況更新サービスを実行しない（数量が取得できないため）
				return false;
			}
			return true;
		}
		
		protected Map_SloSts_DtlR_MfgInstActCom_Upd04_HdrR<SloSts_DtlR,MfgInstActCom_Upd04_HdrR> createMap_SloSts_DtlR_MfgInstActCom_Upd04_HdrR() {
			return new Map_SloSts_DtlR_MfgInstActCom_Upd04_HdrR<SloSts_DtlR, MfgInstActCom_Upd04_HdrR>();
		}

		public class Map_SloSts_DtlR_MfgInstActCom_Upd04_HdrR<D extends SloSts_DtlR, S extends MfgInstActCom_Upd04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$mfg_inst_no, MfgInstActCom_Upd04_HdrR.$mfg_inst_no);
				addColumnPathMap(SloSts_DtlR.$mfg_act_no, MfgInstActCom_Upd04_HdrR.$mfg_act_no);
				addColumnPathMap(SloSts_DtlR.$st_act_tm, MfgInstActCom_Upd04_HdrR.$st_act_tm);
			}
		}
	}
	
	
	/**
	 * MfgInstActCom_Upd08オペレーション.<p>
	 *
	 * 残数分の受払予定の登録及び、各種実績残の更新<br>
	 */
	public class MfgInstActCom_Upd08 extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd08 {
		
		// 製造指図ＮＯ、分割連番でヘッダコンテナを取得するためのキャッシュ
		protected FXUCL_Cache<MfgInstActCom_Upd08_HdrR> _upHdrCache;
		
		// 各種指図・予定をキー（各種ＮＯ）で抽出するためのキャッシュ
		protected FXUCL_Cache<MfgInstActCom_Upd08_HdrInstR> _hdrInstCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlOperInstR> _dtlOperInstByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlYieldSchdR> _dtlYieldSchdByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlInptSchdR> _dtlInptSchdByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlWkSchdR> _dtlWkSchdByKeyCache;

		// 各種指図・予定を製造指図ＮＯで抽出するためのキャッシュ
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlOperInstR>> _dtlOperInstByMfgCache;
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlYieldSchdR>> _dtlYieldSchdByMfgCache;
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptSchdR>> _dtlInptSchdByMfgCache;
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlWkSchdR>> _dtlWkSchdByMfgCache;

		// 各種実績残をキー（各種ＮＯ、分割連番）で抽出するためのキャッシュ
		protected FXUCL_Cache<MfgInstActCom_Upd08_HdrActRemR> _hdrActRemByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlOperActRemR> _dtlOperActRemByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlYieldActRemR> _dtlYieldActRemByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlInptActRemR> _dtlInptActRemByKeyCache;
		protected FXUCL_Cache<MfgInstActCom_Upd08_DtlWkActRemR> _dtlWkActRemByKeyCache;

		// 出来高実績残を工程指図ＮＯ、分割連番で抽出するためのキャッシュ（工程のステータスに連動して出来高のステータスを変更する際に使用）
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlYieldActRemR>> _dtlYieldActRemByOperCache;

		// 投入実績残を代替のキー（工程指図ＮＯ、分割連番、代替グループＣＤ、代替グループ連番）で抽出するためのキャッシュ（代替の処理に使用）
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptActRemR>> _dtlInptActRemByAltCache;

		// 投入実績残を製造指図ＮＯ、分割連番で抽出するためのキャッシュ（製造指図ＮＯ、分割連番単位に投入が完了しているか判断するために使用）
		protected FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptActRemR>> _dtlInptActRemByMfgCache;

		// 残数打切対象の製造指図ＮＯを格納するためのハッシュセット（着手残数を取得する際、打切対象の場合は残数を０にするのに使用）
		protected Set<String> _abortSet;
		
		// 投入数量、固定必要数量は0だが必要数量が正の投入予定（投入はしないが余分に数量を確保するために存在する投入予定）
		protected Set<String> _spareInptSchdNoSet = new HashSet<String>();

		// 工程実績を工程指図ＮＯで抽出するためのキャッシュ（バックフラッシュ未反映判定用）
		protected FXUCL_Cache<MCList<MST_OPER_ACT_R>> _dtlWkOperActByKeyCache;

		// 出来高実績残のワークテーブルが初期化されたかを判断するためのフラグ
		protected Boolean _isWkDelMswYieldActRemFlg = false;

		// 出来高実績のワークテーブルが初期化されたかを判断するためのフラグ
		protected Boolean _isWkDelMswYieldActFlg = false;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MfgInstActCom_Upd08_HdrR> miNoL = up1()
					.groupBy(MfgInstActCom_Upd08_HdrR.$mfg_inst_no);
			
			// 前処理
			preProc();
			
			// 処理対象の各種ＮＯをワークテーブルに追加
			insWkTbl(miNoL);

			// 使用するテーブルの取得
			srchTblBfrUpdActRem(miNoL);

			// 取得したテーブルから上り電文を編集
			editUpByTbl();
			
			// 各種実績残テーブル（分割連番＞０）の更新
			updActRem();

			// 更新後のテーブルの再取得
			srchTblBfrUpdPr(miNoL);
			
			// 各種実績残テーブル（分割連番＝０）の更新
			updPr(miNoL);
			
			// 残数分の受払予定の登録処理
			insIoSchd(miNoL);
			
			// 受注状況更新サービスの呼び出し
			callSloStsInsSrv();
			
			// 下り電文の設定
			setDown();
		}
		
		protected void preProc() {
			_upHdrCache = new FXUCL_Cache<MfgInstActCom_Upd08_HdrR>();
			_upHdrCache.setFixMaxCacheSize(-1);
			_abortSet = new HashSet<String>();

			for (MfgInstActCom_Upd08_HdrR r : up1()) {
				_upHdrCache.putCache(new Comparable[]{r.mfg_inst_no(), r.div_seq()}, r);
				if (r.abort_flg()) {
					_abortSet.add(r.mfg_inst_no());
				}
			}
			
			for (MfgInstActCom_Upd08_DtlYieldR r : up3()) {
				r.yield_typ(MAC_YIELD_TYP.GOOD.value());
			}
			
			for (MfgInstActCom_Upd08_DtlYieldR r : up6()) {
				r.yield_typ(MAC_YIELD_TYP.BYPROD.value());
			}
		}
		
		/**
		 * 上り電文から処理対象の各種ＮＯをワークテーブルに追加する。
		 */
		protected void insWkTbl(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			insMfgWkTbl(miNoL);
			insOperWkTbl();
			insYieldWkTbl();
			insInptWkTbl();
			insWkWkTbl();
			insByProdWkTbl();
		}

		/**
		 * 製造指図ＮＯをワークテーブルに追加する。
		 */
		protected void insMfgWkTbl(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			MCList<MST_MFG_INST_R> dbcL = MCList.create(MST_MFG_INST_R.class);
			for (MfgInstActCom_Upd08_HdrR hdrR : miNoL) {
				MST_MFG_INST_R dbcR = MST_MFG_INST_R.create();
				dbcR.mfg_inst_no(hdrR.mfg_inst_no());
				dbcL.add(dbcR);
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_MFG_INST_D02", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_MFG_INST_I02",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 工程指図・実績ＮＯをワークテーブルに追加する。
		 */
		protected void insOperWkTbl() {
			insOperActRemWkTbl();
			insOperActWkTbl();
		}

		/**
		 * 工程指図ＮＯ・分割連番をワークテーブルに追加する。
		 */
		protected void insOperActRemWkTbl() {
			MCList<MST_OPER_ACT_REM_R> dbcL = MCList.create(MST_OPER_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_DtlOperR dtlR : up2()) {
				if (!isNull(dtlR.oper_inst_no()) && !isNull(dtlR.div_seq())) {
					MST_OPER_ACT_REM_R dbcR = MST_OPER_ACT_REM_R.create();
					dbcR.oper_inst_no(dtlR.oper_inst_no());
					dbcR.div_seq(dtlR.div_seq());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_OPER_ACT_REM_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_OPER_ACT_REM_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 工程実績ＮＯをワークテーブルに追加する。
		 */
		protected void insOperActWkTbl() {
			MCList<MST_OPER_ACT_R> dbcL = MCList.create(MST_OPER_ACT_R.class);
			for (MfgInstActCom_Upd08_DtlOperR dtlR : up2()) {
				if (!isNull(dtlR.oper_act_no())) {
					MST_OPER_ACT_R dbcR = MST_OPER_ACT_R.create();
					dbcR.oper_act_no(dtlR.oper_act_no());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_OPER_ACT_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_OPER_ACT_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 出来高予定・実績ＮＯ（出来高）をワークテーブルに追加する。
		 */
		protected void insYieldWkTbl() {
			insYieldActRemWkTbl();
			insYieldWkActTbl();
		}
		
		/**
		 * 出来高予定ＮＯ・分割連番（出来高）をワークテーブルに追加する。
		 */
		protected void insYieldActRemWkTbl() {
			MCList<MST_YIELD_ACT_REM_R> dbcL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_DtlYieldR dtlR : up3()) {
				if (!isNull(dtlR.yield_schd_no()) && !isNull(dtlR.div_seq())) {
					MST_YIELD_ACT_REM_R dbcR = MST_YIELD_ACT_REM_R.create();
					dbcR.yield_schd_no(dtlR.yield_schd_no());
					dbcR.div_seq(dtlR.div_seq());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_YIELD_ACT_REM_D01", dbcL_bldr.getBaseDbc());
				_isWkDelMswYieldActRemFlg = true;
				dbWkInsert("MSBCL6110_MSW_YIELD_ACT_REM_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 出来高実績ＮＯ（出来高）をワークテーブルに追加する。
		 */
		protected void insYieldWkActTbl() {
			MCList<MST_YIELD_ACT_R> dbcL = MCList.create(MST_YIELD_ACT_R.class);
			for (MfgInstActCom_Upd08_DtlYieldR dtlR : up3()) {
				if (!isNull(dtlR.yield_act_no())) {
					MST_YIELD_ACT_R dbcR = MST_YIELD_ACT_R.create();
					dbcR.yield_act_no(dtlR.yield_act_no());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_YIELD_ACT_D01", dbcL_bldr.getBaseDbc());
				_isWkDelMswYieldActFlg = true;
				dbWkInsert("MSBCL6110_MSW_YIELD_ACT_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 投入予定・実績ＮＯをワークテーブルに追加する。
		 */
		protected void insInptWkTbl() {
			insInptActRemWkTbl();
			insInptActWkTbl();
		}
		
		/**
		 * 投入予定ＮＯ・分割連番をワークテーブルに追加する。
		 */
		protected void insInptActRemWkTbl() {
			MCList<MST_INPT_ACT_REM_R> dbcL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_DtlInptR dtlR : up4()) {
				if (!isNull(dtlR.inpt_schd_no()) && !isNull(dtlR.div_seq())) {
					MST_INPT_ACT_REM_R dbcR = MST_INPT_ACT_REM_R.create();
					dbcR.inpt_schd_no(dtlR.inpt_schd_no());
					dbcR.div_seq(dtlR.div_seq());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_INPT_ACT_REM_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_INPT_ACT_REM_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 投入実績ＮＯをワークテーブルに追加する。
		 */
		protected void insInptActWkTbl() {
			MCList<MST_INPT_ACT_R> dbcL = MCList.create(MST_INPT_ACT_R.class);
			for (MfgInstActCom_Upd08_DtlInptR dtlR : up4()) {
				if (!isNull(dtlR.inpt_act_no())) {
					MST_INPT_ACT_R dbcR = MST_INPT_ACT_R.create();
					dbcR.inpt_act_no(dtlR.inpt_act_no());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_INPT_ACT_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_INPT_ACT_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 工数予定・実績ＮＯをワークテーブルに追加する。
		 */
		protected void insWkWkTbl() {
			insWkActRemWkTbl();
			insWkActWkTbl();
		}
		
		/**
		 * 工数予定ＮＯ・分割連番をワークテーブルに追加する。
		 */
		protected void insWkActRemWkTbl() {
			MCList<MST_WK_ACT_REM_R> dbcL = MCList.create(MST_WK_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_DtlWkR dtlR : up5()) {
				if (!isNull(dtlR.wk_schd_no()) && !isNull(dtlR.div_seq())) {
					MST_WK_ACT_REM_R dbcR = MST_WK_ACT_REM_R.create();
					dbcR.wk_schd_no(dtlR.wk_schd_no());
					dbcR.div_seq(dtlR.div_seq());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_WK_ACT_REM_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_WK_ACT_REM_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 工数実績ＮＯをワークテーブルに追加する。
		 */
		protected void insWkActWkTbl() {
			MCList<MST_WK_ACT_R> dbcL = MCList.create(MST_WK_ACT_R.class);
			for (MfgInstActCom_Upd08_DtlWkR dtlR : up5()) {
				if (!isNull(dtlR.wk_act_no())) {
					MST_WK_ACT_R dbcR = MST_WK_ACT_R.create();
					dbcR.wk_act_no(dtlR.wk_act_no());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_R.create("T"));
				dbWkDelete("MSBCL6110_MSW_WK_ACT_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6110_MSW_WK_ACT_I01",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 出来高予定・実績ＮＯ（副産品）をワークテーブルに追加する。
		 */
		protected void insByProdWkTbl() {
			insByProdActRemWkTbl();
			insByProdActWkTbl();
		}
		
		/**
		 * 出来高予定ＮＯ・分割連番（副産品）をワークテーブルに追加する。
		 */
		protected void insByProdActRemWkTbl() {
			MCList<MST_YIELD_ACT_REM_R> dbcL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_DtlYieldR dtlR : up6()) {
				if (!isNull(dtlR.yield_schd_no()) && !isNull(dtlR.div_seq())) {
					MST_YIELD_ACT_REM_R dbcR = MST_YIELD_ACT_REM_R.create();
					dbcR.yield_schd_no(dtlR.yield_schd_no());
					dbcR.div_seq(dtlR.div_seq());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T"));
				if (!_isWkDelMswYieldActRemFlg) {
					dbWkDelete("MSBCL6110_MSW_YIELD_ACT_REM_D02", dbcL_bldr.getBaseDbc());
				}
				dbWkInsert("MSBCL6110_MSW_YIELD_ACT_REM_I02",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 出来高実績ＮＯ（副産品）をワークテーブルに追加する。
		 */
		protected void insByProdActWkTbl() {
			MCList<MST_YIELD_ACT_R> dbcL = MCList.create(MST_YIELD_ACT_R.class);
			for (MfgInstActCom_Upd08_DtlYieldR dtlR : up6()) {
				if (!isNull(dtlR.yield_act_no())) {
					MST_YIELD_ACT_R dbcR = MST_YIELD_ACT_R.create();
					dbcR.yield_act_no(dtlR.yield_act_no());
					dbcL.add(dbcR);
				}
			}
			if (!dbcL.isEmpty()) {
				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				if (!_isWkDelMswYieldActFlg) {
					dbWkDelete("MSBCL6110_MSW_YIELD_ACT_D02", dbcL_bldr.getBaseDbc());
				}
				dbWkInsert("MSBCL6110_MSW_YIELD_ACT_I02",
						dbcL.groupBy(dbcL_bldr.getBaseDbc().getKeyColumn()), dbcL_bldr.getBaseDbc());
			}
		}

		/**
		 * 製造指図、品目製造指図、製造指図進捗ビューを取得し、キャッシュする。
		 */
		protected void srchMfgInst() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_HdrInstR> tblL = MCList.create(MfgInstActCom_Upd08_HdrInstR.class);
			executeQuery(tblL, MSBCL6110_MST_MFG_INST_S01());

			// キャッシュの初期化
			_hdrInstCache = new FXUCL_Cache<MfgInstActCom_Upd08_HdrInstR>();
			_hdrInstCache.setFixMaxCacheSize(-1);

			// 製造指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrInstR r : tblL) {
				_hdrInstCache.putCache(new String[] {r.mfg_inst_no()}, r);
			}
		}
		
		/**
		 * 工程指図、工程指図進捗ビューを取得し、キャッシュする。
		 */
		protected void srchOperInst(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlOperInstR> tblL = MCList.create(MfgInstActCom_Upd08_DtlOperInstR.class);
			executeQuery(tblL, MSBCL6110_MST_OPER_INST_S01());

			// キャッシュの初期化
			_dtlOperInstByMfgCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlOperInstR>>();
			_dtlOperInstByMfgCache.setFixMaxCacheSize(-1);

			_dtlOperInstByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlOperInstR>();
			_dtlOperInstByKeyCache.setFixMaxCacheSize(-1);

			MCIndexKey key = tblL.createIndex(MfgInstActCom_Upd08_DtlOperInstR.$mfg_inst_no);

			// 製造指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				MCList<MfgInstActCom_Upd08_DtlOperInstR> subL = tblL.subList(key, r.mfg_inst_no());
				_dtlOperInstByMfgCache.putCache(new String[] {r.mfg_inst_no()}, subL);
			}

			// 工程指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlOperInstR r : tblL) {
				_dtlOperInstByKeyCache.putCache(new String[] {r.oper_inst_no()}, r);
			}
		}
		
		/**
		 * 出来高予定、出来高予定進捗ビュー（出来高）を取得し、キャッシュする。
		 */
		protected void srchYieldSchd(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlYieldSchdR> tblL = MCList.create(MfgInstActCom_Upd08_DtlYieldSchdR.class);
			executeQuery(tblL, MSBCL6110_MST_YIELD_SCHD_S04());

			// 受払予定区分に「製造」を設定（受払予定の作成・削除で使用）
			tblL.setString(MfgInstActCom_Upd08_DtlYieldSchdR.$io_schd_typ, MSC_IO_SCHD_TYP.MFG.value());
			
			// キャッシュの初期化
			_dtlYieldSchdByMfgCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlYieldSchdR>>();
			_dtlYieldSchdByMfgCache.setFixMaxCacheSize(-1);

			_dtlYieldSchdByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlYieldSchdR>();
			_dtlYieldSchdByKeyCache.setFixMaxCacheSize(-1);

			MCIndexKey key = tblL.createIndex(MfgInstActCom_Upd08_DtlYieldSchdR.$mfg_inst_no);

			// 製造指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				MCList<MfgInstActCom_Upd08_DtlYieldSchdR> subL = tblL.subList(key, r.mfg_inst_no());
				_dtlYieldSchdByMfgCache.putCache(new String[] {r.mfg_inst_no()}, subL);
			}

			// 出来高予定ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlYieldSchdR r : tblL) {
				_dtlYieldSchdByKeyCache.putCache(new String[] {r.yield_schd_no()}, r);
			}
		}
		
		/**
		 * 投入予定、投入予定進捗ビューを取得し、キャッシュする。
		 */
		protected void srchInptSchd(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlInptSchdR> tblL = MCList.create(MfgInstActCom_Upd08_DtlInptSchdR.class);
			executeQuery(tblL, MSBCL6110_MST_INPT_SCHD_S01());

			// 受払予定区分に「投入」を設定（受払予定の作成・削除で使用）
			tblL.setString(MfgInstActCom_Upd08_DtlYieldSchdR.$io_schd_typ, MSC_IO_SCHD_TYP.INPT.value());
			
			// キャッシュの初期化
			_dtlInptSchdByMfgCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptSchdR>>();
			_dtlInptSchdByMfgCache.setFixMaxCacheSize(-1);

			_dtlInptSchdByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlInptSchdR>();
			_dtlInptSchdByKeyCache.setFixMaxCacheSize(-1);

			// 製造指図ＮＯをキーとする場合、指図書のみ品は対象外とする
			MCList<MfgInstActCom_Upd08_DtlInptSchdR> tblTgtL = tblL.subList(r -> !MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ()));
			MCIndexKey key = tblTgtL.createIndex(MfgInstActCom_Upd08_DtlInptSchdR.$mfg_inst_no);

			// 製造指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				MCList<MfgInstActCom_Upd08_DtlInptSchdR> subL = tblTgtL.subList(key, r.mfg_inst_no());
				_dtlInptSchdByMfgCache.putCache(new String[] {r.mfg_inst_no()}, subL);
			}

			// 投入予定ＮＯをキーとしてキャッシュ
			// 投入予定ＮＯをキーとする場合、指図書のみ品も対象とする
			for (MfgInstActCom_Upd08_DtlInptSchdR r : tblL) {
				_dtlInptSchdByKeyCache.putCache(new String[] {r.inpt_schd_no()}, r);
				if (isSpareInptSchd(r)) {
					_spareInptSchdNoSet.add(r.inpt_schd_no());
				}
			}
		}
		protected boolean isSpareInptSchd(MfgInstActCom_Upd08_DtlInptSchdR r) {
			if (r.base_unit_inpt_qty().isZero()
					&& r.base_unit_fxd_rqmt_qty().isZero()
					&& r.base_unit_rqmt_qty().isPositive()) {
				return true;
			}
			return false;
		}
		
		/**
		 * 工数予定、工数予定進捗ビューを取得し、キャッシュする。
		 */
		protected void srchWkSchd(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlWkSchdR> tblL = MCList.create(MfgInstActCom_Upd08_DtlWkSchdR.class);
			executeQuery(tblL, MSBCL6110_MST_WK_SCHD_S01());

			// キャッシュの初期化
			_dtlWkSchdByMfgCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlWkSchdR>>();
			_dtlWkSchdByMfgCache.setFixMaxCacheSize(-1);

			_dtlWkSchdByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlWkSchdR>();
			_dtlWkSchdByKeyCache.setFixMaxCacheSize(-1);

			MCIndexKey key = tblL.createIndex(MfgInstActCom_Upd08_DtlWkSchdR.$mfg_inst_no);

			// 製造指図ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				MCList<MfgInstActCom_Upd08_DtlWkSchdR> subL = tblL.subList(key, r.mfg_inst_no());
				_dtlWkSchdByMfgCache.putCache(new String[] {r.mfg_inst_no()}, subL);
			}

			// 工数予定ＮＯをキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlWkSchdR r : tblL) {
				_dtlWkSchdByKeyCache.putCache(new String[] {r.wk_schd_no()}, r);
			}
		}
		
		/**
		 * 製造実績残を取得し、キャッシュする。
		 */
		protected void srchMfgActRem() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_HdrActRemR> tblL = MCList.create(MfgInstActCom_Upd08_HdrActRemR.class);
			executeQuery(tblL, MSBCL6110_MST_MFG_ACT_REM_S01());

			_hdrActRemByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_HdrActRemR>();
			_hdrActRemByKeyCache.setFixMaxCacheSize(-1);
			
			// 製造指図ＮＯ、分割連番をキーとしてキャッシュ
			for (MfgInstActCom_Upd08_HdrActRemR r : tblL) {
				_hdrActRemByKeyCache.putCache(new Comparable<?>[] {r.mfg_inst_no(), r.div_seq()}, r);
			}
		}
		
		/**
		 * 工程実績残を取得し、キャッシュする。
		 */
		protected void srchOperActRem() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlOperActRemR> tblL = MCList.create(MfgInstActCom_Upd08_DtlOperActRemR.class);
			executeQuery(tblL, MSBCL6110_MST_OPER_ACT_REM_S01());

			// キャッシュの初期化
			_dtlOperActRemByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlOperActRemR>();
			_dtlOperActRemByKeyCache.setFixMaxCacheSize(-1);

			// 工程指図ＮＯ、分割連番をキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlOperActRemR r : tblL) {
				_dtlOperActRemByKeyCache.putCache(new Comparable<?>[] {r.oper_inst_no(), r.div_seq()}, r);
			}
		}
		
		/**
		 * 出来高実績残（出来高）を取得し、キャッシュする。
		 */
		protected void srchYieldActRem() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlYieldActRemR> tblL = MCList.create(MfgInstActCom_Upd08_DtlYieldActRemR.class);
			executeQuery(tblL, MSBCL6110_MST_YIELD_ACT_REM_S03());

			// キャッシュの初期化
			_dtlYieldActRemByOperCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlYieldActRemR>>();
			_dtlYieldActRemByOperCache.setFixMaxCacheSize(-1);
			
			_dtlYieldActRemByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlYieldActRemR>();
			_dtlYieldActRemByKeyCache.setFixMaxCacheSize(-1);

			MCIndexKey key = tblL.createIndex(MfgInstActCom_Upd08_DtlYieldActRemR.$oper_inst_no, MfgInstActCom_Upd08_DtlYieldActRemR.$div_seq);

			// 工程指図ＮＯ、分割連番をキーとしてキャッシュ
			MCList<MfgInstActCom_Upd08_DtlYieldActRemR> operL = tblL.groupBy(MfgInstActCom_Upd08_DtlYieldActRemR.$oper_inst_no, MfgInstActCom_Upd08_DtlYieldActRemR.$div_seq);
			for (MfgInstActCom_Upd08_DtlYieldActRemR r : operL) {
				MCList<MfgInstActCom_Upd08_DtlYieldActRemR> subL = tblL.subList(key, r.oper_inst_no(), r.div_seq());
				_dtlYieldActRemByOperCache.putCache(new Comparable<?>[] {r.oper_inst_no(), r.div_seq()}, subL);
			}
			
			// 出来高予定ＮＯ、分割連番をキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlYieldActRemR r : tblL) {
				_dtlYieldActRemByKeyCache.putCache(new Comparable<?>[] {r.yield_schd_no(), r.div_seq()}, r);
			}
		}
		
		/**
		 * 投入実績残を取得し、キャッシュする。
		 */
		protected void srchInptActRem() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlInptActRemR> tblL = MCList.create(MfgInstActCom_Upd08_DtlInptActRemR.class);
			executeQuery(tblL, MSBCL6110_MST_INPT_ACT_REM_S01());

			// キャッシュの初期化
			_dtlInptActRemByAltCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptActRemR>>();
			_dtlInptActRemByAltCache.setFixMaxCacheSize(-1);
			
			_dtlInptActRemByMfgCache = new FXUCL_Cache<MCList<MfgInstActCom_Upd08_DtlInptActRemR>>();
			_dtlInptActRemByMfgCache.setFixMaxCacheSize(-1);
			
			_dtlInptActRemByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlInptActRemR>();
			_dtlInptActRemByKeyCache.setFixMaxCacheSize(-1);

			MCIndexKey key = tblL.createIndex(MfgInstActCom_Upd08_DtlInptActRemR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlInptActRemR.$div_seq, MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_cd,
					MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_seq);

			// 工程指図ＮＯ、分割連番、代替グループＣＤ、代替グループ連番をキーとしてキャッシュ
			MCList<MfgInstActCom_Upd08_DtlInptActRemR> altL = tblL
					.subList(r -> !isNull(r.alt_grp_cd()))
					.groupBy(MfgInstActCom_Upd08_DtlInptActRemR.$oper_inst_no,
							MfgInstActCom_Upd08_DtlInptActRemR.$div_seq,
							MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_cd,
							MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_seq);
			for (MfgInstActCom_Upd08_DtlInptActRemR r : altL) {
				MCList<MfgInstActCom_Upd08_DtlInptActRemR> subL = tblL.subList(key, r.oper_inst_no(),
						r.div_seq(), r.alt_grp_cd(), r.alt_grp_seq());
				_dtlInptActRemByAltCache.putCache(new Comparable<?>[] {
						r.oper_inst_no(), r.div_seq(), r.alt_grp_cd(), r.alt_grp_seq()}, subL);
			}
			
			// 製造指図ＮＯ、分割連番をキーとしてキャッシュ
			for (MCList<MfgInstActCom_Upd08_DtlInptActRemR> l : tblL.groupList(
					MfgInstActCom_Upd08_DtlInptActRemR.$mfg_inst_no, MfgInstActCom_Upd08_DtlInptActRemR.$div_seq)) {
				MfgInstActCom_Upd08_DtlInptActRemR r = l.get(0);
				_dtlInptActRemByMfgCache.putCache(new Comparable<?>[] {
						r.mfg_inst_no(), r.div_seq()}, l);
			}
			
			// 投入予定ＮＯ、分割連番をキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlInptActRemR r : tblL) {
				_dtlInptActRemByKeyCache.putCache(new Comparable<?>[] {r.inpt_schd_no(), r.div_seq()}, r);
			}
		}
		
		/**
		 * 工数実績残を取得し、キャッシュする。
		 */
		protected void srchWkActRem() {
			// テーブル取得
			MCList<MfgInstActCom_Upd08_DtlWkActRemR> tblL = MCList.create(MfgInstActCom_Upd08_DtlWkActRemR.class);
			executeQuery(tblL, MSBCL6110_MST_WK_ACT_REM_S01());

			// キャッシュの初期化
			_dtlWkActRemByKeyCache = new FXUCL_Cache<MfgInstActCom_Upd08_DtlWkActRemR>();
			_dtlWkActRemByKeyCache.setFixMaxCacheSize(-1);

			// 工数予定ＮＯ、分割連番をキーとしてキャッシュ
			for (MfgInstActCom_Upd08_DtlWkActRemR r : tblL) {
				_dtlWkActRemByKeyCache.putCache(new Comparable<?>[] {r.wk_schd_no(), r.div_seq()}, r);
			}
		}
		
		/**
		 * 工程実績を取得し、キャッシュする。
		 */
		protected void srchOperActForJudgeBkfRef() {
			// テーブル取得
			MCList<MST_OPER_ACT_R> dbcL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MSW_OPER_ACT_REM_KEY_R S1KEY = MSW_OPER_ACT_REM_KEY_R.create("KEY");
			dbcL_bldr.setSelect(t.oper_act_no);
			dbcL_bldr.addSelect(t.oper_inst_no);
			dbcL_bldr.addSelect(t.bkf_not_ref_flg);
			dbcL_bldr.addInnerJoin(S1KEY, t.oper_inst_no.eq(S1KEY.oper_inst_no));
			dbSelect("MSBCL6110_MST_OPER_ACT_S02", dbcL, dbcL_bldr);
			
			// 上り電文に含まれる工程実績はキャッシュ作成から除外
			MCIndexKey k = up2().createIndex(MfgInstActCom_Upd08_DtlOperR.$oper_act_no);
			MCList<MST_OPER_ACT_R> dbcLtmp = MCList.create(MST_OPER_ACT_R.class);
			for(MST_OPER_ACT_R dbcLR : dbcL) {
				if (isNull(up2().getFirst(k, dbcLR.oper_act_no()))){
					dbcLtmp.add(dbcLR);
				}
			}

			// キャッシュの初期化
			_dtlWkOperActByKeyCache = new FXUCL_Cache<MCList<MST_OPER_ACT_R>>();
			_dtlWkOperActByKeyCache.setFixMaxCacheSize(-1);

			// 工程指図ＮＯをキーとしてキャッシュ
			MCIndexKey key = dbcLtmp.createIndex(MST_OPER_ACT_R.$oper_inst_no);
			for (MST_OPER_ACT_R r : dbcLtmp.distinctNE(MST_OPER_ACT_R.$oper_inst_no)) {
				MCList<MST_OPER_ACT_R> subL = dbcLtmp.subList(key, r.oper_inst_no());
				_dtlWkOperActByKeyCache.putCache(new Comparable<?>[] {r.oper_inst_no()}, subL);
			}
		}
		
		/**
		 * 取得したテーブルの内容で上り電文を編集します
		 */
		protected void editUpByTbl() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// 受注状況更新サービス呼び出しのために、更新前の製造状況区分を保持
			for (MfgInstActCom_Upd08_HdrR r : up1()) {
				if (!up0().is_src_mfg_inst_srv_flg()) {
					MfgInstActCom_Upd08_HdrActRemR oldR = _hdrActRemByKeyCache
							.getCache(r.mfg_inst_no(), r.div_seq());
					if (isNull(oldR)) {
						r.old_mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					}
					else {
						r.old_mfg_sts_typ(oldR.mfg_sts_typ());
					}
				}
			}

			// 同一代替Ｇの投入実績を抽出するため、代替グループコード、連番を保持
			for (MfgInstActCom_Upd08_DtlInptR r : up4()) {
				MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache.getCache(r.inpt_schd_no());
				if (!isNull(schdR)) {
					r.alt_grp_cd(schdR.alt_grp_cd());
					r.alt_grp_seq(schdR.alt_grp_seq());
				}
			}
		}
		
		/**
		 * 各種実績残テーブル（分割連番＞０）の更新（updActRem）を実行前に取得が必要なテーブルを検索する
		 * @param miNoL
		 */
		protected void srchTblBfrUpdActRem(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			srchInptSchd(miNoL);
			srchMfgActRem();
			srchOperActRem();
			srchYieldActRem();
			srchInptActRem();
			srchWkActRem();
			srchOperActForJudgeBkfRef();
		}
		
		/**
		 * 各種実績残テーブル（分割連番＞０）の更新（メイン処理）
		 */
		protected void updActRem() {
			// 各種実績のＤＢコンテナ
			MCList<MST_OPER_ACT_REM_R> operUpdL = MCList.create(MST_OPER_ACT_REM_R.class);
			MCList<MST_YIELD_ACT_REM_R> yieldByProdUpdL = MCList.create(MST_YIELD_ACT_REM_R.class);
			// 上り電文の打切ＦＬＧを保持するカラムを追加
			yieldByProdUpdL.addBooleanColumn("tmp_abort_flg");

			// 各種実績の登録
			updMfgRem();
			updOperRem(operUpdL);
			updYieldByProdRem(yieldByProdUpdL);
			updInptRem();
			updWkRem();
			
			// 登録した工程実績を元に出来高実績、副産品実績のステータス等を更新
			updYieldActRemByOper(operUpdL, yieldByProdUpdL);
		}
		
		/**
		 * 製造実績残テーブルの更新
		 * @param hdrL
		 */
		protected void updMfgRem() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MCList<MST_MFG_ACT_REM_R> updL = MCList.create(MST_MFG_ACT_REM_R.class);
			MCList<MST_MFG_ACT_REM_R> delL = MCList.create(MST_MFG_ACT_REM_R.class);
			
			for (MfgInstActCom_Upd08_HdrR upHdrR : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(upHdrR.data_crud_typ())) {
					MST_MFG_ACT_REM_R dbc = MST_MFG_ACT_REM_R.create();
					dbc.mfg_inst_no(upHdrR.mfg_inst_no());
					dbc.div_seq(upHdrR.div_seq());
					delL.add(dbc);
				}
				else {
					MST_MFG_ACT_REM_R dbc = MST_MFG_ACT_REM_R.create();
					MfgInstActCom_Upd08_HdrActRemR dbRemR = _hdrActRemByKeyCache
							.getCache(upHdrR.mfg_inst_no(), upHdrR.div_seq());
	
					dbc.mfg_inst_no(upHdrR.mfg_inst_no());
					dbc.div_seq(upHdrR.div_seq());
					dbc.mfg_sts_typ(upHdrR.mfg_sts_typ());
					
					// 製造実績残については完了時に残数を０にする
					if (MSC_MFG_STS_TYP.isCMPL(upHdrR.mfg_sts_typ())) {
						dbc.base_unit_mfg_rem_qty(MCNumber.ZERO);
					}
					else {
						// 完了でない場合、着手数－実績数を残数に設定し、打切数を０にする
						dbc.base_unit_mfg_rem_qty(dbRemR.base_unit_mfg_qty()
								.subtract(sum(
										nvl(upHdrR.base_unit_yield_qty(), MCNumber.ZERO),
										nvl(upHdrR.base_unit_dfct_qty(), MCNumber.ZERO))));
						if (dbc.base_unit_mfg_rem_qty().isNegative()) {
							dbc.base_unit_mfg_rem_qty(MCNumber.ZERO);
						}
					}
	
					// 製造実績については実績打切ができないため、分割連番＞０の打切数は常に０となる
					dbc.base_unit_mfg_abort_qty(MCNumber.ZERO);

					updL.add(dbc);
				}
			}
			
			if (!updL.isEmpty()) {
				MST_MFG_ACT_REM_R updL_t = MST_MFG_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(
						updL_t.mfg_sts_typ,
						updL_t.base_unit_mfg_rem_qty,
						updL_t.base_unit_mfg_abort_qty
						);
				dbUpdateKey("MSBCL6110_MST_MFG_ACT_REM_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T"));
				dbDeleteKey("MSBCL6110_MST_MFG_ACT_REM_D02", delL.groupBy(delL_bldr.getBaseDbc().getKeyColumn()), delL_bldr);
			}
		}
		
		protected void updOperRem(MCList<MST_OPER_ACT_REM_R> updL) {

			if (up2().isEmpty()) {
				return;
			}

			MCList<MfgInstActCom_Upd08_DtlOperR> upOperL = MCList.create(MfgInstActCom_Upd08_DtlOperR.class);
			upOperL.addAll(up2());
			
			// 削除行の数量、着手日、終了日をクリアする（実績数を合計するときに0とみなしたいので）
			for (MfgInstActCom_Upd08_DtlOperR upOperR : upOperL) {
				if (MAC_DATA_CRUD_TYP.isDEL(upOperR.data_crud_typ())) {
					upOperR.base_unit_qty(MCNumber.ZERO);
					upOperR.st_act_dt(null);
					upOperR.end_act_dt(null);
				}
			}
			
			// 上り電文の対象となっていない実績を抽出し、対象に追加
			// ※行コピーで複数行登録した後に、片方だけが更新された場合を考慮
			upOperL.addAll(srchOperAct());

			MCList<MST_OPER_ACT_REM_R> delL = MCList.create(MST_OPER_ACT_REM_R.class);
			for (MCList<MfgInstActCom_Upd08_DtlOperR> gL : upOperL.groupList(
					MfgInstActCom_Upd08_DtlOperR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlOperR.$div_seq)) {

				gL.sort(MCList.SortType.ASC_NULL_AHEAD, MfgInstActCom_Upd08_DtlOperR.$end_act_dt);
				MfgInstActCom_Upd08_DtlOperR upOperR = gL.get(0);
				
				String hdrDataCrudTyp = _upHdrCache
						.getCache(upOperR.mfg_inst_no(), upOperR.div_seq())
						.data_crud_typ();
				
				String hdrMfgStsTyp = _upHdrCache
						.getCache(upOperR.mfg_inst_no(), upOperR.div_seq())
						.mfg_sts_typ();
				
				MST_OPER_ACT_REM_R dbc = MST_OPER_ACT_REM_R.create();
				dbc.oper_inst_no(upOperR.oper_inst_no());
				dbc.div_seq(upOperR.div_seq());
				if (MAC_DATA_CRUD_TYP.isDEL(hdrDataCrudTyp)) {
					delL.add(dbc);
				}
				else {
					MfgInstActCom_Upd08_DtlOperActRemR dbRemR = _dtlOperActRemByKeyCache
							.getCache(upOperR.oper_inst_no(), upOperR.div_seq());
					
					MCNumber actQty = gL.sum(MfgInstActCom_Upd08_DtlOperR.$base_unit_qty); // 実績数
					MCNumber stQty = dbRemR.base_unit_qty(); // 着手数
					MCNumber remQty = stQty.subtract(actQty); // 残数（着手数-実績数）
					MCDate stDt = (MCDate) gL.min(MfgInstActCom_Upd08_DtlOperR.$st_act_dt);
					
					MCDate endDt = null;
					if (MSC_MFG_STS_TYP.isCMPL(hdrMfgStsTyp)) {
						// 工程実績が分割されているとき、完了のまま一部実績のみが削除された場合を考慮し、
						// データ更新区分が削除のレコードは除いて終了実績日を設定する
						if (isNull(gL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()))
								.getFirst(MfgInstActCom_Upd08_DtlOperR.$end_act_dt, null))) {
							endDt = (MCDate) gL.max(MfgInstActCom_Upd08_DtlOperR.$end_act_dt);
						}
					}
					else {
						if (isNull(gL.getFirst(MfgInstActCom_Upd08_DtlOperR.$end_act_dt, null))) {
							endDt = (MCDate) gL.max(MfgInstActCom_Upd08_DtlOperR.$end_act_dt);
						}
					}

					if (remQty.isNegative()) {
						remQty = MCNumber.ZERO;
					}
					
					// 終了実績日が設定され、すべての工程実績の未完了フラグがオフの場合は完了、それ以外は着手中
					if (!isNull(endDt) && isAllOperCmpl(gL)) {
						// 終了実績日が設定されている場合は完了
						dbc.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						dbc.base_unit_rem_qty(MCNumber.ZERO);
						dbc.base_unit_abort_qty(remQty);
					}
					else if (!isNull(stDt)) {
						// 着手実績日が設定されている場合は着手中
						dbc.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						dbc.base_unit_rem_qty(remQty);
						dbc.base_unit_abort_qty(MCNumber.ZERO);
					}
					else {
						// 着手実績日、終了実績日ともに未設定の場合は指図済
						dbc.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
						dbc.base_unit_rem_qty(remQty);
						dbc.base_unit_abort_qty(MCNumber.ZERO);
					}
					updL.add(dbc);
				}
			}

			if (!updL.isEmpty()) {
				MST_OPER_ACT_REM_R updL_t = MST_OPER_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(
						updL_t.mfg_sts_typ,
						updL_t.base_unit_rem_qty,
						updL_t.base_unit_abort_qty
						);
				dbUpdateKey("MSBCL6110_MST_OPER_ACT_REM_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T"));
				dbDeleteKey("MSBCL6110_MST_OPER_ACT_REM_D02", delL, delL_bldr);
			}
		}
		
		/**
		 * 上り電文対象外の工程実績の取得
		 * @return
		 */
		protected MCList<MfgInstActCom_Upd08_DtlOperR> srchOperAct() {
			MCList<MfgInstActCom_Upd08_DtlOperR> retL = MCList.create(MfgInstActCom_Upd08_DtlOperR.class);

			MCList<MST_OPER_ACT_R> tblL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder tblL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_INST_R t1 = MST_OPER_INST_R.create("T1");
			MSW_OPER_ACT_REM_KEY_R S1KEY = MSW_OPER_ACT_REM_KEY_R.create("S1KEY");
			MSW_OPER_ACT_KEY_R S2KEY = MSW_OPER_ACT_KEY_R.create("S2KEY");
			tblL_bldr.setSelect(
					t.oper_act_no,
					t.oper_inst_no,
					t.div_seq,
					t.itm_mfg_inst_no,
					t.base_unit_qty,
					t.st_act_tm,
					t.end_act_tm
					);
			tblL_bldr.addSelect(t1.mfg_inst_no);
			tblL_bldr.addInnerJoin(t1, bracket(t.oper_inst_no.eq(t1.oper_inst_no)));
			tblL_bldr.setWhere(exists(subQuery()
					.select(S1KEY.oper_inst_no, S1KEY.div_seq)
					.from(S1KEY)
					.where(t.oper_inst_no.eq(S1KEY.oper_inst_no)
							.and(t.div_seq.eq(S1KEY.div_seq)))));
			tblL_bldr.addWhereWithAnd(notExists(subQuery()
					.select(S2KEY.oper_act_no)
					.from(S2KEY)
					.where(t.oper_act_no.eq(S2KEY.oper_act_no))));
			dbSelect("MSBCL6110_MST_OPER_ACT_S03", tblL, tblL_bldr);

			for (MST_OPER_ACT_R tblR : tblL) {
				MfgInstActCom_Upd08_DtlOperR retR = MfgInstActCom_Upd08_DtlOperR.create();
				retR.oper_act_no(tblR.oper_act_no());
				retR.oper_inst_no(tblR.oper_inst_no());
				retR.div_seq(tblR.div_seq());
				retR.mfg_inst_no(tblR.getStringNE("MFG_INST_NO"));
				retR.itm_mfg_inst_no(tblR.itm_mfg_inst_no());
				retR.base_unit_qty(tblR.base_unit_qty());
				retR.st_act_dt(tblR.st_act_tm());
				retR.end_act_dt(tblR.end_act_tm());
				retL.add(retR);
			}
			return retL;
		}
		
		protected void updYieldByProdRem(
				MCList<MST_YIELD_ACT_REM_R> updL) {
			MCList<MfgInstActCom_Upd08_DtlYieldR> upYieldByProdL = MCList.create(MfgInstActCom_Upd08_DtlYieldR.class);
			
			upYieldByProdL.addAll(up3());
			// 副産品の場合、計画外実績が存在するため、計画外で追加された行を除く
			// ※計画外では残テーブルは作成しない仕様なので
			upYieldByProdL.addAll(up6().subList(subR -> !isNull(subR.yield_schd_no())));

			if (upYieldByProdL.isEmpty()) {
				return;
			}
			
			// 削除行の数量をクリアする（実績数を合計するときに0とみなしたいので）
			for (MfgInstActCom_Upd08_DtlYieldR r : upYieldByProdL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.trd_unit_yield_qty(MCNumber.ZERO);
					r.base_unit_yield_qty(MCNumber.ZERO);
				}
			}

			// 上り電文の対象となっていない実績を抽出し、対象に追加
			// ※行コピーで複数行登録した後に、片方だけが更新された場合を考慮
			upYieldByProdL.addAll(srchYieldByProdAct());

			MCList<MST_YIELD_ACT_REM_R> delL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (MCList<MfgInstActCom_Upd08_DtlYieldR> gL : upYieldByProdL.groupList(
					MfgInstActCom_Upd08_DtlYieldR.$yield_schd_no,
					MfgInstActCom_Upd08_DtlYieldR.$div_seq)) {
				
				MfgInstActCom_Upd08_DtlYieldR upYieldR = gL.get(0);
				
				MfgInstActCom_Upd08_DtlYieldActRemR dbRemR = _dtlYieldActRemByKeyCache
						.getCache(upYieldR.yield_schd_no(), upYieldR.div_seq());
				
				String hdrDataCrudTyp = _upHdrCache
						.getCache(upYieldR.mfg_inst_no(), upYieldR.div_seq())
						.data_crud_typ();				
				
				MST_YIELD_ACT_REM_R dbc = MST_YIELD_ACT_REM_R.create();
				dbc.yield_schd_no(upYieldR.yield_schd_no());
				dbc.div_seq(upYieldR.div_seq());
				if (MAC_DATA_CRUD_TYP.isDEL(hdrDataCrudTyp)) {
					delL.add(dbc);
				}
				else {
					MCNumber baseActQty = gL.sum(MfgInstActCom_Upd08_DtlYieldR.$base_unit_yield_qty); // 基準単位実績数
					MCNumber baseStQty = dbRemR.base_unit_yield_qty(); // 基準単位着手数
					MCNumber baseRemQty = baseStQty.subtract(baseActQty); // 基準単位残数
					if (baseRemQty.isNegative()) {
						baseRemQty = MCNumber.ZERO;
					}
	
					// 着手時分割で基準単位と取引単位に端数が生じる場合は取引単位着手数に基準単位数が設定されているため、
					// 取引単位の着手数－実績数は算出せず、基準単位の残数を取引単位の残数に換算する。
					// この場合出来高実績残テーブルに対して、取引単位着手数に基準単位数、取引単位残数に取引単位数が設定される状況が発生するが、
					// 分割連番＞０の出来高実績残の取引単位残数は参照する機能が存在しないため、
					// 「取引単位着手数に基準単位数が設定されている場合、取引単位残数にも基準単位を設定する」といったことは行わない。
					MCNumber trdRemQty = rvrsBaseUnitConv(baseRemQty, dbRemR.trd_unit_conv_base_qty(),
							dbRemR.trd_unit_conv_qty(), dbRemR.trd_unit_dec_place(),
							dbRemR.trd_unit_rnd_typ());
					
					// ステータスの更新、打切数の設定はここで実施せず、後の処理で実施
					// 理由：
					//  出来高実績のステータスは工程実績のステータスに連動するため、工程実績を参照し、完了かどうかを判断しなければならない。
					//  このvalueCopyメソッドでも更新後の工程実績を参照してステータスを取得することは可能だが、
					//  この処理は更新対象となった出来高（単票画面から実行された場合、対象チェックがオンの出来高）のみにしか実施されないため、
					//  工程に紐付くすべての出来高がオンにならないため、後の処理ですべての出来高に対して実施するようにしている。
					dbc.mfg_sts_typ(dbRemR.mfg_sts_typ());
					dbc.yield_schd_no(upYieldR.yield_schd_no());
					dbc.div_seq(upYieldR.div_seq());
					dbc.trd_unit_yield_rem_qty(trdRemQty);
					dbc.base_unit_yield_rem_qty(baseRemQty);
	
					// 打切フラグを一時カラムに設定する
					dbc.setBooleanNE("tmp_abort_flg", isYieldAbort(gL));
					updL.add(dbc);
				}
			}

			if (!updL.isEmpty()) {
				// 出来高実績の場合、ステータスと打切数は後の処理で更新するため、更新対象としない
				MST_YIELD_ACT_REM_R updL_t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(
						updL_t.trd_unit_yield_rem_qty,
						updL_t.base_unit_yield_rem_qty
						);
				dbUpdateKey("MSBCL6110_MST_YIELD_ACT_REM_U02", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T"));
				dbDeleteKey("MSBCL6110_MST_YIELD_ACT_REM_D02", delL, delL_bldr);
			}
		}
		
		/**
		 * 出来高・副産品実績の基準単位数量を指図時の取引単位数量に換算し、集計します。
		 * @param schdR 出来高・副産品予定の情報
		 * @param actL 出来高・副産品実績の情報
		 * @return
		 */
		protected MCNumber sumTrdUnitQty(MfgInstActCom_Upd08_DtlYieldActRemR schdR,
				MCList<MfgInstActCom_Upd08_DtlYieldR> actL) {

			MCNumber trdActQty = MCNumber.ZERO;
			
			// 出来高・副産品実績を取引単位でグループ化
			for (MCList<MfgInstActCom_Upd08_DtlYieldR> grpL : actL.groupList(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_cd)) {
				MfgInstActCom_Upd08_DtlYieldR actR = grpL.get(0);
				MCNumber sumTrdQty = grpL.sum(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_yield_qty);
				MCNumber sumBaseQty = grpL.sum(MfgInstActCom_Upd08_DtlYieldR.$base_unit_yield_qty);

				// 出来高予定の取引単位ＣＤと実績の取引単位ＣＤが一致しない場合、実績の基準単位を取引単位に換算する
				if (!isSame(schdR.trd_unit_cd(), actR.trd_unit_cd())) {
					sumTrdQty = rvrsBaseUnitConv(sumBaseQty, schdR.trd_unit_conv_base_qty(),
							schdR.trd_unit_conv_qty(), schdR.trd_unit_dec_place(),
							schdR.trd_unit_rnd_typ());
				}
				trdActQty = trdActQty.add(sumTrdQty);
			}

			return trdActQty;
		}
		
		/**
		 * 上り電文対象外の出来高実績の取得
		 * @return
		 */
		protected MCList<MfgInstActCom_Upd08_DtlYieldR> srchYieldByProdAct() {
			MCList<MfgInstActCom_Upd08_DtlYieldR> retL = MCList.create(MfgInstActCom_Upd08_DtlYieldR.class);

			MCList<MST_YIELD_ACT_R> tblL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder tblL_bldr = MCQueryApiBuilder.create(t);
			MST_YIELD_SCHD_R t1 = MST_YIELD_SCHD_R.create("T1");
			MSW_YIELD_ACT_REM_KEY_R S1KEY = MSW_YIELD_ACT_REM_KEY_R.create("S1KEY");
			MSW_YIELD_ACT_KEY_R S2KEY = MSW_YIELD_ACT_KEY_R.create("S2KEY");
			tblL_bldr.setSelect(
					t.yield_act_no,
					t.yield_schd_no,
					t.div_seq,
					t.itm_mfg_inst_no,
					t.trd_unit_qty,
					t.base_unit_qty,
					t.yield_typ
					);
			tblL_bldr.addSelect(t1.mfg_inst_no, t1.oper_inst_no);
			tblL_bldr.addInnerJoin(t1, bracket(t.yield_schd_no.eq(t1.yield_schd_no)));
			tblL_bldr.setWhere(exists(subQuery()
					.select(S1KEY.yield_schd_no, S1KEY.div_seq)
					.from(S1KEY)
					.where(t.yield_schd_no.eq(S1KEY.yield_schd_no)
							.and(t.div_seq.eq(S1KEY.div_seq)))));
			tblL_bldr.addWhereWithAnd(notExists(subQuery()
					.select(S2KEY.yield_act_no)
					.from(S2KEY)
					.where(t.yield_act_no.eq(S2KEY.yield_act_no))));
			dbSelect("MSBCL6110_MST_YIELD_ACT_S02", tblL, tblL_bldr);

			for (MST_YIELD_ACT_R tblR : tblL) {
				MfgInstActCom_Upd08_DtlYieldR retR = MfgInstActCom_Upd08_DtlYieldR.create();
				retR.yield_act_no(tblR.yield_act_no());
				retR.yield_schd_no(tblR.yield_schd_no());
				retR.div_seq(tblR.div_seq());
				retR.mfg_inst_no(tblR.getStringNE("MFG_INST_NO"));
				retR.itm_mfg_inst_no(tblR.itm_mfg_inst_no());
				retR.oper_inst_no(tblR.getStringNE("OPER_INST_NO"));
				retR.trd_unit_yield_qty(tblR.trd_unit_qty());
				retR.base_unit_yield_qty(tblR.base_unit_qty());
				if (MAC_YIELD_TYP.isBYPROD(tblR.yield_typ())) {
					retR.yield_typ(MAC_YIELD_TYP.BYPROD.value());
				}
				else {
					retR.yield_typ(MAC_YIELD_TYP.GOOD.value());
				}
				retL.add(retR);
			}
			return retL;
		}
		/**
		 * 未完了の工程実績が存在しない場合はtrueを返す
		 * @param operL
		 * @return
		 */
		protected boolean isAllOperCmpl(MCList<MfgInstActCom_Upd08_DtlOperR> operL) {
			for (MfgInstActCom_Upd08_DtlOperR r : operL) {
				if (r.not_cmpl_flg()) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 打切の出来高実績が存在する場合はtrueを返す
		 * @param yieldL
		 * @return
		 */
		protected boolean isYieldAbort(MCList<MfgInstActCom_Upd08_DtlYieldR> yieldL) {
			for (MfgInstActCom_Upd08_DtlYieldR r : yieldL) {
				if (r.abort_flg()) {
					return true;
				}
			}
			return false;
		}

		protected void updInptRem() {
			// 計画外で追加された行を除く
			// ※計画外では残テーブルは作成しない仕様なので
			MCList<MfgInstActCom_Upd08_DtlInptR> upInptL = up4().subList(
					subR -> !isNull(subR.inpt_schd_no()));

			if (upInptL.isEmpty()) {
				return;
			}

			// 上り電文の数量を投入実績テーブルの値で更新する（投入実績更新時のロット提案により、変更されている場合があるため）
			updInptActQty();
			
			// 削除行の数量をクリアする（行削除してしまうと以降の処理の対象とならないため）
			for (MfgInstActCom_Upd08_DtlInptR r : upInptL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.base_unit_inpt_qty(MCNumber.ZERO);
					r.base_unit_fxd_rqmt_qty(MCNumber.ZERO);
					r.cont_inpt_qty(MCNumber.ZERO);
					r.cont_fxd_rqmt_qty(MCNumber.ZERO);
				}
			}

			// 上り電文の対象となっていない実績を抽出し、対象に追加
			upInptL.addAll(srchInptAct());

			MCIndexKey keys = upInptL.createIndex(MfgInstActCom_Upd08_DtlInptR.$mfg_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$div_seq);
			
			// 各実績を指図・予定ＮＯ＋分割連番で集計した結果を格納するリスト
			MCList<MfgInstActCom_Upd08_DtlInptR> inptL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
			// 削除行を除いた上り電文を格納するリスト（inptLに集計する前のリスト）
			MCList<MfgInstActCom_Upd08_DtlInptR> tmpInptL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);

			MCList<MST_INPT_ACT_REM_R> updL = MCList.create(MST_INPT_ACT_REM_R.class);
			MCList<MST_INPT_ACT_REM_R> delL = MCList.create(MST_INPT_ACT_REM_R.class);
			
			for (MfgInstActCom_Upd08_HdrR r : up1()) {
				Comparable[] vals = new Comparable[] {
						r.mfg_inst_no(), r.div_seq()
				};

				// ヘッダ行の製造指図ＮＯ、分割連番に該当する各リストを抽出
				MCList<MfgInstActCom_Upd08_DtlInptR> inptSubL = upInptL.subList(keys, vals);

				// ヘッダの製造状況が削除の場合はすべて削除
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					for (MfgInstActCom_Upd08_DtlInptR inptSubR : inptSubL) {
						MST_INPT_ACT_REM_R dbc = MST_INPT_ACT_REM_R.create();
						dbc.inpt_schd_no(inptSubR.inpt_schd_no());
						dbc.div_seq(inptSubR.div_seq());
						delL.add(dbc);
					}
					continue;
				}
				
				// 代替品とそれ以外に分類
				MCList<MfgInstActCom_Upd08_DtlInptR> altInptSubL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
				MCList<MfgInstActCom_Upd08_DtlInptR> notAltInptSubL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
				for (MfgInstActCom_Upd08_DtlInptR inptSubR : inptSubL) {
					MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache.getCache(inptSubR.inpt_schd_no());
					inptSubR.alt_itm_fix_flg(schdR.alt_itm_fix_flg());
					if (isNull(inptSubR.alt_grp_cd()) || inptSubR.alt_itm_fix_flg()) {
						notAltInptSubL.add(inptSubR);
					}
					else {
						altInptSubL.add(inptSubR);
					}
				}
				
				// 代替品以外の場合は投入予定ＮＯ単位に削除するかどうか判断
				for (MCList<MfgInstActCom_Upd08_DtlInptR> grpL : notAltInptSubL
						.groupList(MfgInstActCom_Upd08_DtlInptR.$inpt_schd_no)) {
					// 同一投入予定ＮＯの実績がすべて削除ステータスの場合は指図済に戻す
					if (isDelInptOnly(grpL)) {
						for (MfgInstActCom_Upd08_DtlInptR inptSubR : grpL) {
							// キャッシュを取得
							MfgInstActCom_Upd08_DtlInptActRemR remR = _dtlInptActRemByKeyCache
									.getCache(inptSubR.inpt_schd_no(),
											inptSubR.div_seq());
							MST_INPT_ACT_REM_R dbc = MST_INPT_ACT_REM_R.create();
							dbc.inpt_schd_no(inptSubR.inpt_schd_no());
							dbc.div_seq(inptSubR.div_seq());
							// 製造状況は指図済、残数には着手数を設定
							dbc.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
							dbc.base_unit_inpt_rem_qty(remR.base_unit_inpt_qty());
							dbc.base_unit_rqmt_rem_qty(remR.base_unit_rqmt_qty());
							dbc.base_unit_fxd_rqmt_rem_qty(remR.base_unit_fxd_rqmt_qty());
							dbc.base_unit_inpt_abort_qty(MCNumber.ZERO);
							dbc.cont_inpt_rem_qty(remR.cont_inpt_qty());
							dbc.cont_rqmt_rem_qty(remR.cont_rqmt_qty());
							dbc.cont_fxd_rqmt_rem_qty(remR.cont_fxd_rqmt_qty());
							updL.add(dbc);
						}
					}
					else {
						// 削除行以外が存在する場合は後続の処理に渡す
						tmpInptL.addAll(grpL);
					}
				}
				
				// 代替品の場合は代替Ｇ単位に削除するかどうか判断
				for (MCList<MfgInstActCom_Upd08_DtlInptR> grpL : altInptSubL.groupList(
						MfgInstActCom_Upd08_DtlInptR.$oper_inst_no,
						MfgInstActCom_Upd08_DtlInptR.$div_seq,
						MfgInstActCom_Upd08_DtlInptR.$alt_grp_cd,
						MfgInstActCom_Upd08_DtlInptR.$alt_grp_seq)) {
					// 同一代替Ｇの実績がすべて削除ステータスの場合は指図済に戻す
					if (isDelInptOnly(grpL)) {
						// キャッシュから同一代替Ｇの実績残を抽出
						MfgInstActCom_Upd08_DtlInptR grpR = grpL.get(0);
						MCList<MfgInstActCom_Upd08_DtlInptActRemR> remL = _dtlInptActRemByAltCache
								.getCache(grpR.oper_inst_no(), grpR.div_seq(), grpR.alt_grp_cd(),
										grpR.alt_grp_seq());

						for (MfgInstActCom_Upd08_DtlInptActRemR remR : remL) {
							MST_INPT_ACT_REM_R dbc = MST_INPT_ACT_REM_R.create();
							dbc.inpt_schd_no(remR.inpt_schd_no());
							dbc.div_seq(remR.div_seq());
							// 製造状況は指図済、残数には着手数を設定
							dbc.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
							dbc.base_unit_inpt_rem_qty(remR.base_unit_inpt_qty());
							dbc.base_unit_rqmt_rem_qty(remR.base_unit_rqmt_qty());
							dbc.base_unit_fxd_rqmt_rem_qty(remR.base_unit_fxd_rqmt_qty());
							dbc.base_unit_inpt_abort_qty(MCNumber.ZERO);
							dbc.cont_inpt_rem_qty(remR.cont_inpt_qty());
							dbc.cont_rqmt_rem_qty(remR.cont_rqmt_qty());
							dbc.cont_fxd_rqmt_rem_qty(remR.cont_fxd_rqmt_qty());
							updL.add(dbc);
						}
					}
					else {
						// 削除行以外が存在する場合は後続の処理に渡す
						tmpInptL.addAll(grpL);
					}
				}
			}

			// 抽出したリストを実績残のキーでグループ化し、実績数を集計
			MCGroupByPolicy inptGp = new MCGroupByPolicy(
					MfgInstActCom_Upd08_DtlInptR.$inpt_schd_no,
					MfgInstActCom_Upd08_DtlInptR.$mfg_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$div_seq);
			inptGp.sum(MfgInstActCom_Upd08_DtlInptR.$base_unit_inpt_qty,
					MfgInstActCom_Upd08_DtlInptR.$base_unit_fxd_rqmt_qty,
					MfgInstActCom_Upd08_DtlInptR.$cont_inpt_qty,
					MfgInstActCom_Upd08_DtlInptR.$cont_fxd_rqmt_qty);
			inptGp.max(MfgInstActCom_Upd08_DtlInptR.$abort_flg,
					MfgInstActCom_Upd08_DtlInptR.$lst_reg_flg);
			// srchInptAct()で上り電文対象外の実績を取得する際、あえてabort_flgを取得していない。（常にfalse）
			// これは、上り電文から取得されたabort_flgを優先させたいため。
			// 上り電文対象外の実績にabort_flgがオンのレコードがあったとしても、上り電文の値がオフならばオフとなる。
			inptL = tmpInptL.groupBy(inptGp);

			// 投入実績の場合、代替とそれ以外で処理が異なる
			MCList<MfgInstActCom_Upd08_DtlInptR> notAltInptL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
			MCList<MfgInstActCom_Upd08_DtlInptR> altInptL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);

			for (MfgInstActCom_Upd08_DtlInptR r : inptL) {
				// 投入予定から代替の処理に必要な項目を取得
				MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache.getCache(r.inpt_schd_no());
				r.alt_grp_cd(schdR.alt_grp_cd());
				r.alt_grp_seq(schdR.alt_grp_seq());
				r.alt_itm_fix_flg(schdR.alt_itm_fix_flg());

				if (isNull(r.alt_grp_cd()) || r.alt_itm_fix_flg()) {
					notAltInptL.add(r);
				}
				else {
					altInptL.add(r);
				}
			}
			
			// 代替以外の場合の投入実績残の設定
			if (!notAltInptL.isEmpty()) {
				editNotAltQty(notAltInptL);
			}

			// 代替の場合の投入実績残の設定（同一代替Ｇ、連番の投入実績残に対しても値を設定）
			MCList<MfgInstActCom_Upd08_DtlInptR> altInptAllL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
			if (!altInptL.isEmpty()) {
				altInptAllL.addAll(editAltQty(altInptL));
			}

			MCList<MfgInstActCom_Upd08_DtlInptR> newInptL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);
			newInptL.addAll(notAltInptL);
			newInptL.addAll(altInptAllL);

			for (MfgInstActCom_Upd08_DtlInptR r : newInptL) {
				MST_INPT_ACT_REM_R dbc = MST_INPT_ACT_REM_R.create();
				dbc.inpt_schd_no(r.inpt_schd_no());
				dbc.div_seq(r.div_seq());
				dbc.mfg_sts_typ(r.mfg_sts_typ());
				dbc.base_unit_inpt_rem_qty(r.base_unit_inpt_rem_qty());
				dbc.base_unit_rqmt_rem_qty(r.base_unit_rqmt_rem_qty());
				dbc.base_unit_fxd_rqmt_rem_qty(r.base_unit_fxd_rqmt_rem_qty());
				dbc.base_unit_inpt_abort_qty(r.base_unit_inpt_abort_qty());
				dbc.cont_inpt_rem_qty(r.cont_inpt_rem_qty());
				dbc.cont_rqmt_rem_qty(r.cont_rqmt_rem_qty());
				dbc.cont_fxd_rqmt_rem_qty(r.cont_fxd_rqmt_rem_qty());
				updL.add(dbc);
			}
			if (!updL.isEmpty()) {
				MST_INPT_ACT_REM_R updL_t = MST_INPT_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(
						updL_t.mfg_sts_typ,
						updL_t.base_unit_inpt_rem_qty,
						updL_t.base_unit_rqmt_rem_qty,
						updL_t.base_unit_fxd_rqmt_rem_qty,
						updL_t.base_unit_inpt_abort_qty,
						updL_t.cont_inpt_rem_qty,
						updL_t.cont_rqmt_rem_qty,
						updL_t.cont_fxd_rqmt_rem_qty
						);
				dbUpdateKey("MSBCL6110_MST_INPT_ACT_REM_U01", updL, updL_bldr);
			}
			
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T"));
				dbDeleteKey("MSBCL6110_MST_INPT_ACT_REM_D02", delL, delL_bldr);
			}
		}
		
		/**
		 * 上り電文の数量を投入実績テーブルの値で更新する
		 */
		protected void updInptActQty() {
			// 削除以外のレコードの投入実績を取得し、数量を設定
			MCList<MfgInstActCom_Upd08_DtlInptR> tgtL = up4().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (tgtL.isEmpty()) {
				return;
			}

			MCList<MST_INPT_ACT_R> actL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			actL_bldr.setSelect(
					t.inpt_act_no,
					t.base_unit_inpt_qty,
					t.base_unit_fxd_loss_qty,
					t.cont_qty,
					t.cont_fxd_loss_qty,
					t.act_cont_fctr
					);
			dbSelectKey("MSBCL6110_MST_INPT_ACT_S03", actL, actL_bldr, tgtL);
			if (actL.isEmpty()) {
				return;
			}

			MCIndexKey key = actL.createIndex(MST_INPT_ACT_R.$inpt_act_no);
			for (MfgInstActCom_Upd08_DtlInptR tgtR : tgtL) {
				MST_INPT_ACT_R actR = actL.getFirst(key, tgtR.inpt_act_no());
				if (!isNull(actR)) {
					tgtR.base_unit_inpt_qty(actR.base_unit_inpt_qty());
					tgtR.base_unit_fxd_rqmt_qty(actR.base_unit_fxd_loss_qty());
					tgtR.cont_inpt_qty(actR.cont_qty());
					tgtR.cont_fxd_rqmt_qty(actR.cont_fxd_loss_qty());
					tgtR.act_cont_fctr(actR.act_cont_fctr());
				}
			}
		}
		
		/**
		 * 引数のリストのデータ更新区分がすべて削除の場合はtrue
		 * @param l
		 * @return
		 */
		protected boolean isDelInptOnly(MCList<MfgInstActCom_Upd08_DtlInptR> l) {
			for (MfgInstActCom_Upd08_DtlInptR r : l) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 上り電文対象外の投入実績の取得
		 * @return
		 */
		protected MCList<MfgInstActCom_Upd08_DtlInptR> srchInptAct() {
			MCList<MfgInstActCom_Upd08_DtlInptR> retL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);

			MST_INPT_SCHD_R t1 = MST_INPT_SCHD_R.create("T1");
			MSW_INPT_ACT_REM_KEY_R S1KEY = MSW_INPT_ACT_REM_KEY_R.create("S1KEY");
			MSW_INPT_ACT_KEY_R S2KEY = MSW_INPT_ACT_KEY_R.create("S2KEY");

			MCList<MST_INPT_ACT_R> tblL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R tblL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder tblL_bldr = MCQueryApiBuilder.create(tblL_t);
			tblL_bldr.setSelect(
					tblL_t.inpt_act_no,
					tblL_t.inpt_schd_no,
					tblL_t.div_seq,
					tblL_t.itm_mfg_inst_no,
					tblL_t.base_unit_inpt_qty,
					tblL_t.base_unit_fxd_loss_qty,
					tblL_t.cont_qty
					);
			tblL_bldr.addSelect(
					t1.mfg_inst_no,
					t1.oper_inst_no,
					t1.alt_grp_cd,
					t1.alt_grp_seq
					);
			tblL_bldr.addInnerJoin(t1, bracket(tblL_t.inpt_schd_no.eq(t1.inpt_schd_no)));
			tblL_bldr.setWhere(exists(subQuery()
					.select(S1KEY.inpt_schd_no, S1KEY.div_seq)
					.from(S1KEY)
					.where(tblL_t.inpt_schd_no.eq(S1KEY.inpt_schd_no)
							.and(tblL_t.div_seq.eq(S1KEY.div_seq)))));
			tblL_bldr.addWhereWithAnd(notExists(subQuery()
					.select(S2KEY.inpt_act_no)
					.from(S2KEY)
					.where(tblL_t.inpt_act_no.eq(S2KEY.inpt_act_no))));
			dbSelect("MSBCL6110_MST_INPT_ACT_S04", tblL, tblL_bldr);

			// 上り電文対象外の同一代替Ｇのレコードを抽出する
			MCList<MfgInstActCom_Upd08_DtlInptR> tgtL = up4().groupBy(
					MfgInstActCom_Upd08_DtlInptR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_cd,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_seq);
			MCList<MST_INPT_ACT_R> addL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder addL_bldr = MCQueryApiBuilder.create(t);
			addL_bldr.setSelect(
					t.inpt_act_no,
					t.inpt_schd_no,
					t.div_seq,
					t.itm_mfg_inst_no,
					t.base_unit_inpt_qty,
					t.base_unit_fxd_loss_qty,
					t.cont_qty
					);
			addL_bldr.addSelect(
					t1.mfg_inst_no,
					t1.oper_inst_no,
					t1.alt_grp_cd,
					t1.alt_grp_seq
					);
			addL_bldr.addInnerJoin(t1, bracket(t.inpt_schd_no.eq(t1.inpt_schd_no)));
			addL_bldr.setWhere(t1.oper_inst_no.eq(bind("oper_inst_no"))
					.and(t1.alt_grp_cd.eq(bind("alt_grp_cd")))
					.and(t1.alt_grp_seq.eq(bind("alt_grp_seq"))));
			addL_bldr.addWhereWithAnd(t1.alt_itm_fix_flg.eq(value(false)));
			addL_bldr.addConstWhereWithAnd(notExists(subQuery()
					.select(S1KEY.inpt_schd_no, S1KEY.div_seq)
					.from(S1KEY)
					.where(t.inpt_schd_no.eq(S1KEY.inpt_schd_no)
							.and(t.div_seq.eq(S1KEY.div_seq))))
							.and(notExists(subQuery()
									.select(S2KEY.inpt_act_no)
									.from(S2KEY)
									.where(t.inpt_act_no.eq(S2KEY.inpt_act_no)))));
			dbSelect("MSBCL6110_MST_INPT_ACT_S05", addL, addL_bldr, tgtL, null);
			tblL.addAll(addL);

			for (MST_INPT_ACT_R tblR : tblL) {
				MfgInstActCom_Upd08_DtlInptR retR = MfgInstActCom_Upd08_DtlInptR.create();
				retR.inpt_act_no(tblR.inpt_act_no());
				retR.inpt_schd_no(tblR.inpt_schd_no());
				retR.div_seq(tblR.div_seq());
				retR.mfg_inst_no(tblR.getStringNE("MFG_INST_NO"));
				retR.itm_mfg_inst_no(tblR.itm_mfg_inst_no());
				retR.oper_inst_no(tblR.getStringNE("OPER_INST_NO"));
				retR.alt_grp_cd(tblR.getStringNE("ALT_GRP_CD"));
				retR.alt_grp_seq(tblR.getNumberNE("ALT_GRP_SEQ"));
				retR.base_unit_inpt_qty(tblR.base_unit_inpt_qty());
				retR.base_unit_fxd_rqmt_qty(tblR.base_unit_fxd_loss_qty());
				retR.cont_inpt_qty(tblR.cont_qty());
				retL.add(retR);
			}
			return retL;
		}

		/**
		 * 投入実績残に対して投入実績数を反映する際、残数の算出を行う
		 * @param inptR
		 */
		protected MCList<MfgInstActCom_Upd08_DtlInptR> editAltQty(MCList<MfgInstActCom_Upd08_DtlInptR> inptL) {
			// 投入実績残を工程指図ＮＯ、分割連番、代替グループＣＤ、代替グループ連番単位に処理
			String[] gb = {
					MfgInstActCom_Upd08_DtlInptR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$div_seq,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_cd,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_seq
			};
			MCList<MfgInstActCom_Upd08_DtlInptR> gbL = inptL.groupBy(gb);
			
			//同一工程指図ＮＯ、分割連番、代替グループＣＤ、代替グループ連番単位の投入実績サブリスト作成用
			MCIndexKey k = inptL.createIndex(MfgInstActCom_Upd08_DtlInptR.$oper_inst_no,
					MfgInstActCom_Upd08_DtlInptR.$div_seq,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_cd,
					MfgInstActCom_Upd08_DtlInptR.$alt_grp_seq);
			
			//同一工程指図ＮＯ、分割連番、代替グループＣＤ、代替グループ連番単位で投入実績上１つでも打切フラグがオンのものがあれば、後続の処理に使用するgbL引き継ぐ
			for (MfgInstActCom_Upd08_DtlInptR gbLR : gbL) {
				MCList<MfgInstActCom_Upd08_DtlInptR> inptL2 = inptL.subList(k,gbLR.oper_inst_no(), gbLR.div_seq(), gbLR.alt_grp_cd(), gbLR.alt_grp_seq());
				for (MfgInstActCom_Upd08_DtlInptR inptL2R : inptL2) {
					if( gbLR.oper_inst_no().equals(inptL2R.oper_inst_no()) && 
						gbLR.div_seq().eq(inptL2R.div_seq()) && 
						gbLR.alt_grp_cd().equals(inptL2R.alt_grp_cd()) && 
						gbLR.alt_grp_seq().eq(inptL2R.alt_grp_seq())) {
						if(inptL2R.abort_flg()) {
							gbLR.abort_flg(inptL2R.abort_flg());
							break;
						}
					}
				}
				for (MfgInstActCom_Upd08_DtlInptR inptL2R : inptL2) {
					if( gbLR.oper_inst_no().equals(inptL2R.oper_inst_no()) && 
						gbLR.div_seq().eq(inptL2R.div_seq()) && 
						gbLR.alt_grp_cd().equals(inptL2R.alt_grp_cd()) && 
						gbLR.alt_grp_seq().eq(inptL2R.alt_grp_seq())) {
						if(inptL2R.lst_reg_flg()) {
							gbLR.lst_reg_flg(inptL2R.lst_reg_flg());
							break;
						}
					}
				}
			}

			MCIndexKey key = inptL.createIndex(MfgInstActCom_Upd08_DtlInptR.$inpt_schd_no, MfgInstActCom_Upd08_DtlInptR.$div_seq);
			MCList<MfgInstActCom_Upd08_DtlInptR> newL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);

			String altQty = "alt_qty"; //代替元数量（実績残テーブルの着手数）
			String inptQty = "inpt_qty"; //投入実績数（上り電文の実績数）
			String decPlace = "dec_place"; //小数部有効桁数
			
			for (MfgInstActCom_Upd08_DtlInptR gbR : gbL) {
				// 投入実績残テーブルから該当する工程指図ＮＯ、分割連番、代替グループのレコードを抽出
				MCList<MfgInstActCom_Upd08_DtlInptActRemR> remL = _dtlInptActRemByAltCache
						.getCache(gbR.oper_inst_no(), gbR.div_seq(), gbR.alt_grp_cd(),
								gbR.alt_grp_seq());
				
				// remLのクローンを格納するリスト
				MCList<MfgInstActCom_Upd08_DtlInptR> newSubL = MCList.create(MfgInstActCom_Upd08_DtlInptR.class);

				newSubL.addNumberColumn(altQty);
				newSubL.addNumberColumn(inptQty);
				newSubL.addNumberColumn(decPlace);

			// 抽出した投入実績残テーブルを編集
				for (MfgInstActCom_Upd08_DtlInptActRemR remR : remL) {
					
					MfgInstActCom_Upd08_DtlInptR newR = MfgInstActCom_Upd08_DtlInptR.create();
					newR.addNumberColumn(altQty);
					newR.addNumberColumn(inptQty);
					newR.addNumberColumn(decPlace);

					copyValue(newR, remR, createMap_MfgInstActCom_Upd08_DtlInptR_MfgInstActCom_Upd08_DtlInptActRemR());

					// 投入予定テーブルを取得
					MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache.getCache(remR.inpt_schd_no());
					// 上り電文の投入実績を取得
					MfgInstActCom_Upd08_DtlInptR inptR = inptL.getFirst(key, remR.inpt_schd_no(), remR.div_seq());
					
					// 投入予定、上り電文の投入実績から残数を算出する項目を設定
					newR.setNumber(altQty, remR.base_unit_inpt_qty()); // 元数には着手数
					if (isNull(inptR)) {
						newR.setNumber(inptQty, MCNumber.ZERO); // 投入数はゼロ
					}
					else {
						newR.setNumber(inptQty, inptR.base_unit_inpt_qty()); // 投入数には実績数
					}
					newR.setNumber(decPlace, schdR.getNumberNE("DEC_PLACE")); // 小数部有効桁数は品目マスタから
					newR.abort_flg(gbR.abort_flg()); //代替グループ単位の打切フラグをセット
					newR.lst_reg_flg(gbR.lst_reg_flg());
					newSubL.add(newR);
				}

				// ユーティリティから投入残数を算出
				reCalcAltQty(newSubL, altQty, inptQty, decPlace,
						MST_INPT_ACT_REM_R.$base_unit_inpt_rem_qty);
				
				newL.addAll(newSubL);
			}
			
			// newLに投入残数以外の値を設定
			for (MfgInstActCom_Upd08_DtlInptR r : newL) {

				// 投入予定テーブルを取得
				MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache.getCache(r.inpt_schd_no());
				// 上り電文の投入実績を取得
				MfgInstActCom_Upd08_DtlInptR inptR = inptL.getFirst(key, r.inpt_schd_no(), r.div_seq());

				// 打切数はゼロ
				r.base_unit_inpt_abort_qty(MCNumber.ZERO);

				// 固定必要数の着手数－実績数を残数に設定（実績数が未設定の場合は残数にゼロを設定）※代替で混在可の場合は固定必要数が０のため、上記で案分する必要がない
				if (isNull(inptR) || isNull(inptR.base_unit_fxd_rqmt_qty())) {
					r.base_unit_fxd_rqmt_rem_qty(r.base_unit_fxd_rqmt_qty());
				}
				else {
					r.base_unit_fxd_rqmt_rem_qty(r.base_unit_fxd_rqmt_qty().subtract(inptR.base_unit_fxd_rqmt_qty()));
				}
				
				if (r.base_unit_inpt_rem_qty().isNegative()) {
					r.base_unit_inpt_rem_qty(MCNumber.ZERO);
				}
				if (r.base_unit_fxd_rqmt_rem_qty().isNegative()) {
					r.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
				}

				// 必要残数は不使用項目のため、投入残数を設定
				r.base_unit_rqmt_rem_qty(r.base_unit_inpt_rem_qty());

				// 有効成分対象の場合、投入残数を有効成分に換算
				if (schdR.cont_fctr_flg()) {
					r.cont_inpt_rem_qty(convToContFctrUnit(r.base_unit_inpt_rem_qty(),
							nvl(r.act_cont_fctr(), schdR.std_cont_fctr()),
							schdR.cont_fctr_dec_place(), schdR.cont_fctr_rnd_typ()));
					r.cont_rqmt_rem_qty(convToContFctrUnit(r.base_unit_rqmt_rem_qty(),
							nvl(r.act_cont_fctr(), schdR.std_cont_fctr()),
							schdR.cont_fctr_dec_place(), schdR.cont_fctr_rnd_typ()));
					r.cont_fxd_rqmt_rem_qty(convToContFctrUnit(r.base_unit_fxd_rqmt_rem_qty(),
							nvl(r.act_cont_fctr(), schdR.std_cont_fctr()),
							schdR.cont_fctr_dec_place(), schdR.cont_fctr_rnd_typ()));
				}
				else {
					r.cont_inpt_rem_qty(null);
					r.cont_rqmt_rem_qty(null);
					r.cont_fxd_rqmt_rem_qty(null);
				}

				// 投入残数、固定必要残数がゼロになったら完了
				if (isInptQtyCmpl(r, schdR)) {
					r.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
				}
				else {
					if (((!isNull(inptR) && inptR.abort_flg()) || r.abort_flg()) && (!chkBfNotRef(r) || (!r.lst_reg_flg()))) { //代替グループ内で投入実績がないものは、グループ単位で設定した打切りフラグを参照
						// 打切フラグがオンの場合、残数を打切数に設定し、完了とする
						r.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						r.base_unit_inpt_abort_qty(r.base_unit_inpt_rem_qty());
						r.base_unit_inpt_rem_qty(MCNumber.ZERO);
					}
					else {
						r.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
					}
				}
			}
			return newL;
		}
		
		protected boolean isInptQtyCmpl(MfgInstActCom_Upd08_DtlInptR r, MfgInstActCom_Upd08_DtlInptSchdR schdR) {
			if (!schdR.cont_fctr_flg()) {
				if (r.base_unit_inpt_rem_qty().isZero() && r.base_unit_fxd_rqmt_rem_qty().isZero()) {
					return true;
				}
			}
			else {
				if (r.cont_inpt_rem_qty().isZero() && r.cont_fxd_rqmt_rem_qty().isZero()) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 投入実績残に対して投入実績数を反映する際、残数の算出を行う
		 */
		protected void editNotAltQty(MCList<MfgInstActCom_Upd08_DtlInptR> inptL) {
			for (MfgInstActCom_Upd08_DtlInptR r : inptL) {
				// 更新前の実績残テーブルの取得
				MfgInstActCom_Upd08_DtlInptActRemR remR = _dtlInptActRemByKeyCache
						.getCache(r.inpt_schd_no(), r.div_seq());
				
				// 投入残数を必要残数に換算するため、投入予定テーブルから子投入数量と子必要数量、品目マスタから小数部有効桁数と端数処理区分を取得
				MfgInstActCom_Upd08_DtlInptSchdR schdR = _dtlInptSchdByKeyCache
						.getCache(r.inpt_schd_no());

				// 打切数はゼロ
				r.base_unit_inpt_abort_qty(MCNumber.ZERO);

				// 着手数－実績数を残数に設定（実績数が未設定の場合はnvlでゼロを設定）
				r.base_unit_inpt_rem_qty(remR.base_unit_inpt_qty().subtract(nvl(r.base_unit_inpt_qty(), MCNumber.ZERO)));
				r.base_unit_fxd_rqmt_rem_qty(remR.base_unit_fxd_rqmt_qty().subtract(nvl(r.base_unit_fxd_rqmt_qty(), MCNumber.ZERO)));

				if (r.base_unit_inpt_rem_qty().isNegative()) {
					r.base_unit_inpt_rem_qty(MCNumber.ZERO);
				}
				if (r.base_unit_fxd_rqmt_rem_qty().isNegative()) {
					r.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
				}

				// 必要残数は不使用項目のため、投入残数を設定
				r.base_unit_rqmt_rem_qty(r.base_unit_inpt_rem_qty());

				if (schdR.cont_fctr_flg()) {
					// 着手数－実績数を残数に設定（実績数が未設定の場合はnvlでゼロを設定）
					r.cont_inpt_rem_qty(nvl(remR.cont_inpt_qty(), MCNumber.ZERO)
							.subtract(nvl(r.cont_inpt_qty(), MCNumber.ZERO)));
					r.cont_fxd_rqmt_rem_qty(nvl(remR.cont_fxd_rqmt_qty(), MCNumber.ZERO)
							.subtract(nvl(r.cont_fxd_rqmt_qty(), MCNumber.ZERO)));

					if (!isNull(r.cont_inpt_rem_qty())) {
						if (r.cont_inpt_rem_qty().isNegative()) {
							r.cont_inpt_rem_qty(MCNumber.ZERO);
						}
					}
					if (!isNull(r.cont_fxd_rqmt_rem_qty())) {
						if (r.cont_fxd_rqmt_rem_qty().isNegative()) {
							r.cont_fxd_rqmt_rem_qty(MCNumber.ZERO);
						}
					}

					// 必要残数は不使用項目のため、投入残数を設定
					r.cont_rqmt_rem_qty(r.cont_inpt_rem_qty());

				}
				else {
					r.cont_inpt_rem_qty(null);
					r.cont_rqmt_rem_qty(null);
					r.cont_fxd_rqmt_rem_qty(null);
				}


				// 投入残数、固定必要残数がゼロになったら完了
				if (isInptQtyCmpl(r, schdR)) {
					r.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
				}
				else {
					if (r.abort_flg() && (!chkBfNotRef(r) || (!r.lst_reg_flg()))) {
						// 打切フラグがオンの場合、残数を打切数に設定し、完了とする
						r.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						r.base_unit_inpt_abort_qty(r.base_unit_inpt_rem_qty());
						r.base_unit_inpt_rem_qty(MCNumber.ZERO);
						r.base_unit_rqmt_rem_qty(MCNumber.ZERO);
						r.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
						if (schdR.cont_fctr_flg()) {
							r.cont_inpt_rem_qty(MCNumber.ZERO);
							r.cont_rqmt_rem_qty(MCNumber.ZERO);
							r.cont_fxd_rqmt_rem_qty(MCNumber.ZERO);
						}
					}
					else {
						r.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
					}
				}
			}
		}
		
		/**
		 * 工程指図内でバックフラッシュ未反映フラグがONのものがある場合、trueを返す
		 */
		protected boolean chkBfNotRef(MfgInstActCom_Upd08_DtlInptR r) {
			//キャッシュより工程実績を取得
			MCList<MST_OPER_ACT_R> operActL = _dtlWkOperActByKeyCache.getCache(r.oper_inst_no());

			//バックフラッシュ未反映フラグの判定
			if(!isNull(operActL) && (boolean)operActL.max(MST_OPER_ACT_R.$bkf_not_ref_flg)) {
				return true;
			}
			return false;
		}
		
		protected void updWkRem() {
			// 上り電文から計画外で追加された行を除く
			MCList<MfgInstActCom_Upd08_DtlWkR> upWkL = up5().subList(
					subR -> !isNull(subR.wk_schd_no()));

			// 削除行の数量をクリアする（実績数を合計するときに0とみなしたいので）
			for (MfgInstActCom_Upd08_DtlWkR r : upWkL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.act_wk_cost(MCNumber.ZERO);
				}
			}

			// 上り電文の対象となっていない実績を抽出し、対象に追加
			// ※行コピーで複数行登録した後に、片方だけが更新された場合を考慮
			upWkL.addAll(srchWkAct());

			MCList<MST_WK_ACT_REM_R> updL = MCList.create(MST_WK_ACT_REM_R.class);
			MCList<MST_WK_ACT_REM_R> delL = MCList.create(MST_WK_ACT_REM_R.class);
			for (MCList<MfgInstActCom_Upd08_DtlWkR> gL : upWkL.groupList(
					MfgInstActCom_Upd08_DtlWkR.$wk_schd_no,
					MfgInstActCom_Upd08_DtlWkR.$div_seq)) {

				// 打切FLGオンの行が最初に来るようにソート
				gL.sort(MCList.SortType.DESC, MfgInstActCom_Upd08_DtlWkR.$abort_flg);
				MfgInstActCom_Upd08_DtlWkR upWkR = gL.get(0);
				
				MfgInstActCom_Upd08_DtlWkActRemR dbRemR = _dtlWkActRemByKeyCache
						.getCache(upWkR.wk_schd_no(), upWkR.div_seq());
				
				String hdrDataCrudTyp = _upHdrCache
						.getCache(upWkR.mfg_inst_no(), upWkR.div_seq())
						.data_crud_typ();
				MST_WK_ACT_REM_R dbc = MST_WK_ACT_REM_R.create();
				dbc.wk_schd_no(upWkR.wk_schd_no());
				dbc.div_seq(upWkR.div_seq());

				if (MAC_DATA_CRUD_TYP.isDEL(hdrDataCrudTyp)) {
					delL.add(dbc);
				}
				else if (isDelWkOnly(gL)) {
					// 削除行しか存在しない場合は指図済に戻す
					dbc.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					dbc.abort_wk_cost(MCNumber.ZERO);
					dbc.rem_wk_cost(sum(dbRemR.wk_cost(),dbRemR.fxd_wk_cost()));
					updL.add(dbc);
				}
				else {
					MCNumber actCost = gL.sum(MfgInstActCom_Upd08_DtlWkR.$act_wk_cost); // 実績工数
					MCNumber stCost = sum(dbRemR.wk_cost(),dbRemR.fxd_wk_cost()); // 着手工数
					MCNumber remCost = stCost.subtract(actCost); // 残工数
					if (remCost.isNegative()) {
						remCost = MCNumber.ZERO;
					}
	
					if (upWkR.abort_flg()) {
						// 打切フラグがオンの場合、残数を打切数に設定し、完了とする
						dbc.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						dbc.abort_wk_cost(remCost);
						dbc.rem_wk_cost(MCNumber.ZERO);
					}
					else {
						// 残数がすべてゼロになったら完了
						if (remCost.isZero()) {
							dbc.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						}
						else {
							dbc.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						}
						dbc.abort_wk_cost(MCNumber.ZERO);
						dbc.rem_wk_cost(remCost);
					}
					updL.add(dbc);
				}
			}
			
			if (!updL.isEmpty()) {
				MST_WK_ACT_REM_R updL_t = MST_WK_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(
						updL_t.mfg_sts_typ,
						updL_t.rem_wk_cost,
						updL_t.abort_wk_cost
						);
				dbUpdateKey("MSBCL6110_MST_WK_ACT_REM_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T"));
				dbDeleteKey("MSBCL6110_MST_WK_ACT_REM_D02", delL, delL_bldr);
			}
		}

		protected boolean isDelWkOnly(MCList<MfgInstActCom_Upd08_DtlWkR> l) {
			for (MfgInstActCom_Upd08_DtlWkR r : l) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 上り電文対象外の工数実績の取得
		 * @return
		 */
		protected MCList<MfgInstActCom_Upd08_DtlWkR> srchWkAct() {
			MCList<MfgInstActCom_Upd08_DtlWkR> retL = MCList.create(MfgInstActCom_Upd08_DtlWkR.class);

			MCList<MST_WK_ACT_R> tblL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder tblL_bldr = MCQueryApiBuilder.create(t);
			MST_WK_SCHD_R t1 = MST_WK_SCHD_R.create("T1");
			MSW_WK_ACT_REM_KEY_R S1KEY = MSW_WK_ACT_REM_KEY_R.create("S1KEY");
			MSW_WK_ACT_KEY_R S2KEY = MSW_WK_ACT_KEY_R.create("S2KEY");
			tblL_bldr.setSelect(
					t.wk_act_no,
					t.wk_schd_no,
					t.div_seq,
					t.itm_mfg_inst_no,
					t.wk_cost
					);
			tblL_bldr.addSelect(
					t1.mfg_inst_no,
					t1.oper_inst_no
					);
			tblL_bldr.addInnerJoin(t1, bracket(t.wk_schd_no.eq(t1.wk_schd_no)));
			tblL_bldr.setWhere(exists(subQuery()
					.select(S1KEY.wk_schd_no, S1KEY.div_seq)
					.from(S1KEY)
					.where(t.wk_schd_no.eq(S1KEY.wk_schd_no)
							.and(t.div_seq.eq(S1KEY.div_seq)))));
			tblL_bldr.addWhereWithAnd(notExists(subQuery()
					.select(S2KEY.wk_act_no)
					.from(S2KEY)
					.where(t.wk_act_no.eq(S2KEY.wk_act_no))));
			dbSelect("MSBCL6110_MST_WK_ACT_S01", tblL, tblL_bldr);

			for (MST_WK_ACT_R tblR : tblL) {
				MfgInstActCom_Upd08_DtlWkR retR = MfgInstActCom_Upd08_DtlWkR.create();
				retR.wk_act_no(tblR.wk_act_no());
				retR.wk_schd_no(tblR.wk_schd_no());
				retR.div_seq(tblR.div_seq());
				retR.mfg_inst_no(tblR.getStringNE("MFG_INST_NO"));
				retR.itm_mfg_inst_no(tblR.itm_mfg_inst_no());
				retR.oper_inst_no(tblR.getStringNE("OPER_INST_NO"));
				retR.act_wk_cost(tblR.wk_cost());
				retL.add(retR);
			}
			return retL;
		}

		protected void updYieldActRemByOper(
				MCList<MST_OPER_ACT_REM_R> operActRemL,
				MCList<MST_YIELD_ACT_REM_R> yieldByProdActRemL) {

			if (operActRemL.isEmpty()) {
				return;
			}

			// キャッシュの再取得
			srchYieldActRem();
			
			// 上記で更新対象となった出来高実績残（出来高・副産品）のインデックスキー
			MCIndexKey idxKey = yieldByProdActRemL.createIndex(MST_YIELD_ACT_REM_R.$yield_schd_no, MST_YIELD_ACT_REM_R.$div_seq);

			// 工程実績残に対し、出来高実績残を完了させる
			// ※工程実績残に紐付く全ての出来高が処理対象となっているわけではないため、出来高実績を別途取得する
			MCList<MST_YIELD_ACT_REM_R> stsUpdYieldL = MCList.create(MST_YIELD_ACT_REM_R.class);

						// 出来高実績、副産品実績の上り電文を一つに集約
						MCList<MfgInstActCom_Upd08_DtlYieldR> upL = MCList.create(MfgInstActCom_Upd08_DtlYieldR.class);
						upL.addAll(up3());
						upL.addAll(up6());
						MCIndexKey upKey = upL.createIndex(MfgInstActCom_Upd08_DtlYieldR.$yield_schd_no, MfgInstActCom_Upd08_DtlYieldR.$div_seq);
						
						// 集約した上り電文から削除行以外のものを抽出して、出来高実績格納用のリストに追加
						MCList<MfgInstActCom_Upd08_DtlYieldR> yieldActL = MCList.create(MfgInstActCom_Upd08_DtlYieldR.class);
						yieldActL.addAll(upL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
						
						// 対象の工程実績残に紐付く出来高実績（出来高実績残ではない）を抽出して、出来高実績格納用のリストに追加
						// ※上り電文対象のものは除く
						MCList<MST_YIELD_ACT_R> yieldActDbL = MCList.create(MST_YIELD_ACT_R.class);
						MST_YIELD_ACT_R t1 = MST_YIELD_ACT_R.create("T");
						MST_YIELD_ACT_REM_R t2 = MST_YIELD_ACT_REM_R.create("T1");
						MCQueryApiBuilder yieldActDbL_bldr = MCQueryApiBuilder.create(t1);

						yieldActDbL_bldr.setSelect(t1.yield_schd_no, t1.div_seq);
						yieldActDbL_bldr.addInnerJoin(t2, bracket( t1.yield_schd_no.eq(t2.yield_schd_no) .and(t1.div_seq.eq(t2.div_seq))));
						yieldActDbL_bldr.setWhere(t2.oper_inst_no.eq(bind("oper_inst_no")).and(t2.div_seq.eq(bind("div_seq"))));
						dbSelect("MSBCL6110_MST_YIELD_ACT_S03", yieldActDbL, yieldActDbL_bldr, operActRemL);
						
						for (MST_YIELD_ACT_R yieldActDbR : yieldActDbL) {
							MfgInstActCom_Upd08_DtlYieldR upR = upL.getFirst(upKey, yieldActDbR.yield_schd_no(), yieldActDbR.div_seq());
							if (isNull(upR)) {
								MfgInstActCom_Upd08_DtlYieldR yieldActR = MfgInstActCom_Upd08_DtlYieldR.create();
								yieldActR.yield_schd_no(yieldActDbR.yield_schd_no());
								yieldActR.div_seq(yieldActDbR.div_seq());
								yieldActL.add(yieldActR);
							}
						}
						MCIndexKey yieldActKey = yieldActL.createIndex(MfgInstActCom_Upd08_DtlYieldR.$yield_schd_no, MfgInstActCom_Upd08_DtlYieldR.$div_seq);
			for (MST_OPER_ACT_REM_R operR : operActRemL) {
				// 更新対象となった工程実績残に紐付く出来高実績残を抽出
				MCList<MfgInstActCom_Upd08_DtlYieldActRemR> stsUpdYieldSubL = MCList.create(MfgInstActCom_Upd08_DtlYieldActRemR.class);
				stsUpdYieldSubL.addAll(_dtlYieldActRemByOperCache.getCache(operR.oper_inst_no(), operR.div_seq()));
				
				for (MfgInstActCom_Upd08_DtlYieldActRemR r : stsUpdYieldSubL) {
					MST_YIELD_ACT_REM_R yieldR = MST_YIELD_ACT_REM_R.create();
					yieldR.yield_schd_no(r.yield_schd_no());
					yieldR.div_seq(r.div_seq());
					yieldR.mfg_inst_no(r.mfg_inst_no());
					yieldR.yield_typ(r.yield_typ());

					// 工程実績が完了しているか、または出来高実績受信ＩＦ取込の打切フラグがオン、もしくは出来高実績残の一時カラムに設定された打切フラグがオンの場合、打切
					MST_YIELD_ACT_REM_R remR = yieldByProdActRemL.getFirst(idxKey, r.yield_schd_no(), r.div_seq());
					boolean abortFlg = false;
					if (!isNull(remR)) {
						abortFlg = remR.getBooleanNE("tmp_abort_flg");
					}
					if (MSC_MFG_STS_TYP.isCMPL(operR.mfg_sts_typ()) || r.yield_abort_flg() || abortFlg) {
						// 打切数に残数を設定し、残数をゼロにする
						yieldR.trd_unit_yield_abort_qty(r.trd_unit_yield_rem_qty());
						yieldR.trd_unit_yield_rem_qty(MCNumber.ZERO);
						yieldR.base_unit_yield_abort_qty(r.base_unit_yield_rem_qty());
						yieldR.base_unit_yield_rem_qty(MCNumber.ZERO);
						yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					}
					else {
						// 工程実績が完了していない場合
						// 打切数にはゼロを設定
						yieldR.trd_unit_yield_abort_qty(MCNumber.ZERO);
						yieldR.base_unit_yield_abort_qty(MCNumber.ZERO);

						if (MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())
								&& !yieldByProdActRemL.contains(idxKey, r.yield_schd_no(), r.div_seq())) {
							// 更新対象外かつ更新前のステータスが完了の場合、打切数を残数に設定する
							// ※工程実績を完了から未完了にした場合、打切数を復活させる
							yieldR.trd_unit_yield_rem_qty(
									r.trd_unit_yield_abort_qty());
							yieldR.base_unit_yield_rem_qty(
									r.base_unit_yield_abort_qty());
							yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						}
						else {
							// ただし、上記の出来高実績残更新対象（単票画面の場合は選択チェックがオンの出来高・副産品）の場合、
							// そこで残数が再計算されているため、再取得したキャッシュの値を設定
							yieldR.trd_unit_yield_rem_qty(r.trd_unit_yield_rem_qty());
							yieldR.base_unit_yield_rem_qty(r.base_unit_yield_rem_qty());
							if (isSame(r.base_unit_yield_qty(), r.base_unit_yield_rem_qty())) {
								// 着手数と残数量が同じ場合
								MfgInstActCom_Upd08_DtlYieldR yieldActR = yieldActL.getFirst(yieldActKey, r.yield_schd_no(), r.div_seq());
								if (isNull(yieldActR)) {
									// 出来高実績格納用のリストにレコードが存在しない場合、指図済
									yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
								}
								else {
									// 出来高実績格納用のリストにレコードが存在する場合（出来高実績を数量0で登録した場合）、着手中
									yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
								}
							}
							else {
								yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
						}
						
						// 残数がゼロの場合、工程実績が完了していなくても出来高実績は完了（基準単位で判断）
						if (yieldR.base_unit_yield_rem_qty().isZero()) {
							yieldR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						}
					}
					stsUpdYieldL.add(yieldR);
				}
			}

			// 出来高実績残の更新
			if (!stsUpdYieldL.isEmpty()) {
				MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdYieldL_bldr = MCQueryApiBuilder.create(t);
				stsUpdYieldL_bldr.setSet(
						t.mfg_sts_typ,
						t.trd_unit_yield_rem_qty,
						t.trd_unit_yield_abort_qty,
						t.base_unit_yield_rem_qty,
						t.base_unit_yield_abort_qty);
				dbUpdateKey("MSBCL6110_MST_YIELD_ACT_REM_U03", stsUpdYieldL, stsUpdYieldL_bldr);
			}
		}
		
		/**
		 * 各種実績残テーブル（分割連番＝０）の更新（updPr）を実行前に取得が必要なテーブルを検索する
		 * @param miNoL
		 */
		protected void srchTblBfrUpdPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			// 指図・予定粒度に集計して実績残テーブルを参照しているため、指図・予定データを再取得する
			srchMfgInst();
			srchOperInst(miNoL);
			srchYieldSchd(miNoL);
			srchInptSchd(miNoL);
			srchWkSchd(miNoL);
			
			// 実績残テーブルは、投入のみ下り電文設定（全投入完了）で使用されているため再取得する
			srchInptActRem();
		}
		
		/**
		 * 各種実績残テーブル（分割連番＝０）の更新
		 */
		protected void updPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			updMfgPr(miNoL);
			updOperPr(miNoL);
			updYieldByProdPr(miNoL);
			updInptPr(miNoL);
			updWkPr(miNoL);
			
			// 指図書のみ品、代替で代替品目指定されなかった品目は上記で更新されないため、製造実績のステータスにあわせてここで更新
			updInptPrByHdr(miNoL);
		}
		
		/**
		 * 分割連番＝０の製造実績残を更新する
		 */
		protected void updMfgPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MCList<MST_MFG_ACT_REM_R> updL = MCList.create(MST_MFG_ACT_REM_R.class);
			
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				MST_MFG_ACT_REM_R updR = MST_MFG_ACT_REM_R.create();

				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MfgInstActCom_Upd08_HdrInstR srchR = _hdrInstCache.getCache(r.mfg_inst_no());

				// 製造指図ＮＯ、分割連番を設定
				updR.mfg_inst_no(srchR.mfg_inst_no());
				updR.div_seq(MCNumber.ZERO);

				if (isNull(srchR.max_sts_typ())) {
					// 分割連番＞０のレコードが存在しない場合
					updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
					updR.base_unit_mfg_qty(MCNumber.ZERO); //着手数量には０
					updR.base_unit_mfg_rem_qty(srchR.base_unit_inst_qty()); //残数量には製造数量
					updR.base_unit_mfg_abort_qty(MCNumber.ZERO); //打切数量には０
				}
				else {
					// 分割連番＞０のレコードが存在する場合
					
					// 着手残数の初期値は、指図数-着手数合計
					MCNumber stRemQty = srchR.base_unit_inst_qty().subtract(srchR.sum_mfg_qty());
					if (stRemQty.isNegative()) {
						stRemQty = MCNumber.ZERO;
					}
					
					// 残数打切時
					if (_abortSet.contains(r.mfg_inst_no())) {
						// 打切数量には着手残数量を設定
						updR.base_unit_mfg_abort_qty(stRemQty);
						// 着手残数に０を再設定
						stRemQty = MCNumber.ZERO;
					}
					// 打切FLGがオンのレコードがない（＝残数打切取消）
					else {
						// 打切数量には０を設定
						updR.base_unit_mfg_abort_qty(MCNumber.ZERO);
					}

					if (MSC_MFG_STS_TYP.isCMPL(srchR.min_sts_typ())) {
						if (stRemQty.isZero()) {
							// 分割連番＞０のすべてのレコードが完了（＝製造状況区分の最小値が完了）かつ着手残数量＝０の場合、分割連番＝０のレコードも完了にする
							updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
						}
						else {
							// 着手残数量＞０の場合、着手中にする
							updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						}
					}
					else {
						// 完了以外のレコードが存在する場合
						if (MSC_MFG_STS_TYP.isCMPL(srchR.max_sts_typ())) {
							// １件でも完了のレコードが存在する場合は着手中にする
							updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						}
						else {
							// 上記以外は製造状況区分の最大値とする
							updR.mfg_sts_typ(srchR.max_sts_typ());
						}
					}

					// 分割連番＞０の着手数量の合計を分割連番＝０の着手数量とする
					updR.base_unit_mfg_qty(srchR.sum_mfg_qty());
					
					// 残数＝指図数－（分割連番＞０の実績数の合計）－打切数量で算出。
					// ※分割連番＞０の実績数は（分割連番＞０の着手数－残数）で算出
					MCNumber actQty = srchR.sum_mfg_qty().subtract(
							srchR.sum_rem_qty().subtract(updR.base_unit_mfg_abort_qty()));
					updR.base_unit_mfg_rem_qty(srchR.base_unit_inst_qty().subtract(actQty));
				}
				updL.add(updR);
			}

			// 製造状況区分、着手数量、残数量、打切数量を更新対象とする
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(
					t.mfg_sts_typ,
					t.base_unit_mfg_qty,
					t.base_unit_mfg_rem_qty,
					t.base_unit_mfg_abort_qty);

			// 分割連番＝０のレコードの更新
			dbUpdateKey("MSBCL6110_MST_MFG_ACT_REM_U02", updL, updL_bldr);
		}

		/**
		 * 分割連番＝０の工程実績残を更新する
		 */
		protected void updOperPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MCList<MST_OPER_ACT_REM_R> updL = MCList.create(MST_OPER_ACT_REM_R.class);

			for (MfgInstActCom_Upd08_HdrR r : miNoL) {

				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MCList<MfgInstActCom_Upd08_DtlOperInstR> srchL = _dtlOperInstByMfgCache
						.getCache(r.mfg_inst_no());

				for (MfgInstActCom_Upd08_DtlOperInstR srchR : srchL) {

					MST_OPER_ACT_REM_R updR = MST_OPER_ACT_REM_R.create();

					// 工程指図ＮＯ、分割連番を設定
					updR.oper_inst_no(srchR.oper_inst_no());
					updR.div_seq(MCNumber.ZERO);

					if (isNull(srchR.max_sts_typ())) {
						// 分割連番＞０のレコードが存在しない場合
						updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
						updR.base_unit_qty(MCNumber.ZERO); //着手数量には０
						updR.base_unit_rem_qty(srchR.base_unit_qty()); //残数量には製造数量
						updR.base_unit_abort_qty(MCNumber.ZERO); //打切数量には０
					}
					else {
						// 分割連番＞０のレコードが存在する場合

						// 着手残数の初期値は、指図数-着手数合計
						MCNumber stRemQty = srchR.base_unit_qty().subtract(srchR.sum_qty());
						if (stRemQty.isNegative()) {
							stRemQty = MCNumber.ZERO;
						}
						
						// 残数打切時
						if (_abortSet.contains(r.mfg_inst_no())) {
							// 打切数量には着手残数量を設定
							updR.base_unit_abort_qty(stRemQty);
							// 着手残数に０を再設定
							stRemQty = MCNumber.ZERO;
						}
						else {
							// 打切数量には０を設定
							updR.base_unit_abort_qty(MCNumber.ZERO);
						}

						if (MSC_MFG_STS_TYP.isCMPL(srchR.min_sts_typ())) {
							if (stRemQty.isZero()) {
								// 分割連番＞０のすべてのレコードが完了（＝製造状況区分の最小値が完了）かつ着手残数量＝０の場合、分割連番＝０のレコードも完了にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
							}
							else {
								// 着手残数量＞０の場合、着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
						}
						else {
							// 完了以外のレコードが存在する場合
							if (MSC_MFG_STS_TYP.isCMPL(srchR.max_sts_typ())) {
								// １件でも完了のレコードが存在する場合は着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
							else {
								// 上記以外は製造状況区分の最大値とする
								updR.mfg_sts_typ(srchR.max_sts_typ());
							}
						}

						// 分割枝番＞０の着手数量の合計を分割枝番＝０の着手数量とする
						updR.base_unit_qty(srchR.sum_qty());

						// 残数＝指図数－（分割連番＞０の実績数の合計）で算出。分割連番＞０の実績数は（分割連番＞０の着手数－残数）で算出
						MCNumber actQty = srchR.sum_qty()
								.subtract(srchR.sum_rem_qty().subtract(updR.base_unit_abort_qty()));
						updR.base_unit_rem_qty(
								srchR.base_unit_qty().subtract(actQty));
						if (updR.base_unit_rem_qty().isNegative()) {
							updR.base_unit_rem_qty(MCNumber.ZERO);
						}
					}
					updL.add(updR);
				}
			}

			// 製造状況区分、着手数量、残数量、打切数量を更新対象とする
			MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(
					t.mfg_sts_typ,
					t.base_unit_qty,
					t.base_unit_rem_qty,
					t.base_unit_abort_qty);

			// 分割連番＝０のレコードの更新
			dbUpdateKey("MSBCL6110_MST_OPER_ACT_REM_U02", updL, updL_bldr);
		}

		/**
		 * 分割連番＝０の出来高実績残（出来高・副産品）を更新する
		 */
		protected void updYieldByProdPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MCList<MST_YIELD_ACT_REM_R> updL = MCList.create(MST_YIELD_ACT_REM_R.class);

			for (MfgInstActCom_Upd08_HdrR r : miNoL) {

				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MCList<MfgInstActCom_Upd08_DtlYieldSchdR> srchL = _dtlYieldSchdByMfgCache
						.getCache(r.mfg_inst_no());

				for (MfgInstActCom_Upd08_DtlYieldSchdR srchR : srchL) {

					MST_YIELD_ACT_REM_R updR = MST_YIELD_ACT_REM_R.create();

					// 出来高予定ＮＯ、分割連番を設定
					updR.yield_schd_no(srchR.yield_schd_no());
					updR.div_seq(MCNumber.ZERO);

					if (isNull(srchR.max_sts_typ())) {
						// 分割連番＞０のレコードが存在しない場合
						updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
						updR.trd_unit_yield_qty(MCNumber.ZERO); //着手数量には０
						updR.base_unit_yield_qty(MCNumber.ZERO); //着手数量には０
						updR.trd_unit_yield_rem_qty(srchR.trd_unit_yield_qty()); //残数量には製造数量
						updR.base_unit_yield_rem_qty(srchR.base_unit_yield_qty()); //残数量には製造数量
						updR.trd_unit_yield_abort_qty(MCNumber.ZERO); //打切数量には０
						updR.base_unit_yield_abort_qty(MCNumber.ZERO); //打切数量には０
					}
					else {
						// 分割連番＞０のレコードが存在する場合

						// 着手残数の初期値は、指図数-着手数合計
						MCNumber stRemQty = srchR.base_unit_yield_qty().subtract(srchR.sum_base_qty());
						if (stRemQty.isNegative()) {
							stRemQty = MCNumber.ZERO;
						}
						
						// 残数打切時
						if (_abortSet.contains(r.mfg_inst_no())) {
							// 打切数量には着手残数量を設定
							updR.base_unit_yield_abort_qty(stRemQty);
							// 着手残数に０を再設定
							stRemQty = MCNumber.ZERO;
						}
						else {
							// 打切数量には０を設定
							updR.base_unit_yield_abort_qty(MCNumber.ZERO);
						}

						if (MSC_MFG_STS_TYP.isCMPL(srchR.min_sts_typ())) {
							if (stRemQty.isZero()) {
								// 分割連番＞０のすべてのレコードが完了（＝製造状況区分の最小値が完了）かつ着手残数量＝０の場合、分割連番＝０のレコードも完了にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
							}
							else {
								// 着手残数量＞０の場合、着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
						}
						else {
							// 完了以外のレコードが存在する場合
							if (MSC_MFG_STS_TYP.isCMPL(srchR.max_sts_typ())) {
								// １件でも完了のレコードが存在する場合は着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
							else {
								// 上記以外は製造状況区分の最大値とする
								updR.mfg_sts_typ(srchR.max_sts_typ());
							}
						}

						// 基準単位数量の設定
						// 分割枝番＞０の着手数量の合計を分割枝番＝０の着手数量とする
						updR.base_unit_yield_qty(srchR.sum_base_qty());

						// 残数＝指図数－（分割連番＞０の実績数の合計）で算出。分割連番＞０の実績数は（分割連番＞０の着手数－残数）で算出
						MCNumber baseActQty = srchR.sum_base_qty()
								.subtract(nvl(srchR.sum_base_rem_qty(), MCNumber.ZERO)
										.subtract(updR.base_unit_yield_abort_qty()));
						updR.base_unit_yield_rem_qty(
								srchR.base_unit_yield_qty().subtract(baseActQty));
						if (updR.base_unit_yield_rem_qty().isNegative()) {
							updR.base_unit_yield_rem_qty(MCNumber.ZERO);
						}

						// 取引単位数量は基準単位数量を換算する
						updR.trd_unit_yield_qty(rvrsBaseUnitConv(
								updR.base_unit_yield_qty(),
								srchR.trd_unit_conv_base_qty(), srchR.trd_unit_conv_qty(),
								srchR.trd_unit_dec_place(), srchR.trd_unit_rnd_typ()));
						updR.trd_unit_yield_rem_qty(rvrsBaseUnitConv(
								updR.base_unit_yield_rem_qty(),
								srchR.trd_unit_conv_base_qty(), srchR.trd_unit_conv_qty(),
								srchR.trd_unit_dec_place(), srchR.trd_unit_rnd_typ()));
						updR.trd_unit_yield_abort_qty(rvrsBaseUnitConv(
								updR.base_unit_yield_abort_qty(),
								srchR.trd_unit_conv_base_qty(), srchR.trd_unit_conv_qty(),
								srchR.trd_unit_dec_place(), srchR.trd_unit_rnd_typ()));
					}
					updL.add(updR);
				}
			}

			// 分割連番＝０のレコードの更新
			if (!updL.isEmpty()) {
				// 製造状況区分、着手数量、残数量、打切数量を更新対象とする
				MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(
						t.mfg_sts_typ,
						t.trd_unit_yield_qty,
						t.trd_unit_yield_rem_qty,
						t.trd_unit_yield_abort_qty,
						t.base_unit_yield_qty,
						t.base_unit_yield_rem_qty,
						t.base_unit_yield_abort_qty);
				dbUpdateKey("MSBCL6110_MST_YIELD_ACT_REM_U04", updL, updL_bldr);
			}
		}

		/**
		 * 分割連番＝０の投入実績残を更新する
		 */
		protected void updInptPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			Map<String, String> spareInptSchdStsMap = getSpareInptSchdStsMap();
			MCList<MST_INPT_ACT_REM_R> updL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {

				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MCList<MfgInstActCom_Upd08_DtlInptSchdR> srchL = _dtlInptSchdByMfgCache
						.getCache(r.mfg_inst_no());

				for (MfgInstActCom_Upd08_DtlInptSchdR srchR : srchL) {

					MST_INPT_ACT_REM_R updR = MST_INPT_ACT_REM_R.create();

					// 投入予定ＮＯ、分割連番を設定
					updR.inpt_schd_no(srchR.inpt_schd_no());
					updR.div_seq(MCNumber.ZERO);

					if (isNull(srchR.max_sts_typ())) {
						// 分割連番＞０のレコードが存在しない場合
						if (!_spareInptSchdNoSet.contains(srchR.inpt_schd_no())) {
							updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
						}
						else {
							if (MSC_MFG_STS_TYP.isCMPL(spareInptSchdStsMap.get(srchR.inpt_schd_no()))) {
								// 投入数量＝０かつ、固定必要数量＝０かつ、必要数量＞０の投入予定は
								// 予定通りの数量で製造できなかった場合に在庫を余分に確保するための投入予定である
								// ※投入数量と必要数量に差異がある場合に、製造指図時のロット割れによって発生しうる。

								// この投入予定に対しては、投入実績が登録されない。
								// ※投入予定数を超過して投入実績を登録する場合、投入数量＝０かつ、固定必要数量＝０の投入予定ではなく、
								// 投入数量＞０または固定必要数量＞０の投入予定に対する実績として登録する想定であるため。
								// よって投入実績の登録ではなく、工程が完了したタイミングで投入予定を完了にする。
								// ※投入残数量の計算時にロス数量は加味していない。よって、失敗した数量はロス数量として登録し、
								// 正常に投入できた数量は投入実績数量として登録することで、ロス数量によって投入が完了してしまうことを防いでいる
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value()); //製造状況区分は完了
							}
							else {
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
							}
						}
						updR.base_unit_inpt_qty(MCNumber.ZERO); //着手数量には０
						updR.base_unit_rqmt_qty(MCNumber.ZERO); //着手数量には０
						updR.base_unit_fxd_rqmt_qty(MCNumber.ZERO); //着手数量には０
						updR.cont_inpt_qty(MCNumber.ZERO); //着手数量には０
						updR.cont_rqmt_qty(MCNumber.ZERO); //着手数量には０
						updR.cont_fxd_rqmt_qty(MCNumber.ZERO); //着手数量には０
						updR.base_unit_inpt_rem_qty(srchR.base_unit_inpt_qty()); //残数量には製造数量
						updR.base_unit_rqmt_rem_qty(srchR.base_unit_rqmt_qty()); //残数量には製造数量
						updR.base_unit_fxd_rqmt_rem_qty(srchR.base_unit_fxd_rqmt_qty()); //残数量には製造数量
						updR.cont_inpt_rem_qty(srchR.cont_inpt_qty()); //残数量には製造数量
						updR.cont_rqmt_rem_qty(srchR.cont_rqmt_qty()); //残数量には製造数量
						updR.cont_fxd_rqmt_rem_qty(srchR.cont_fxd_rqmt_qty()); //残数量には製造数量
						updR.base_unit_inpt_abort_qty(MCNumber.ZERO); //打切数量には０
						// 残数打切時
						if (_abortSet.contains(srchR.mfg_inst_no())) {
							updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value()); //製造状況区分は完了
							updR.base_unit_inpt_rem_qty(MCNumber.ZERO); //基準単位投入残数量は0
							updR.base_unit_rqmt_rem_qty(MCNumber.ZERO); //基準単位必要残数量は0
							updR.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO); //基準単位固定必要残数量は0
							updR.cont_inpt_rem_qty(MCNumber.ZERO); //有効成分（投入残数量）は0
							updR.cont_rqmt_rem_qty(MCNumber.ZERO); //有効成分（必要残数量）は0
							updR.cont_fxd_rqmt_rem_qty(MCNumber.ZERO); //有効成分（固定必要残数量）は0
							updR.base_unit_inpt_abort_qty(srchR.base_unit_inpt_qty()); //打切数量には基準単位投入着手数量
						}
					}
					else {
						// 分割連番＞０のレコードが存在する場合

						// 着手残数の初期値は、指図数-着手数合計
						// 打切数に設定するため各数量の残数も計算する
						MCNumber stRemQty = MCNumber.ZERO;
						MCNumber stRemInptQty = MCNumber.ZERO;
						MCNumber stRemRqmtQty = MCNumber.ZERO;
						MCNumber stRemFxdRqmtQty = MCNumber.ZERO;
						MCNumber stRemContInptQty = MCNumber.ZERO;
						MCNumber stRemContRqmtQty = MCNumber.ZERO;
						MCNumber stRemContFxdRqmtQty = MCNumber.ZERO;
						stRemInptQty = srchR.base_unit_inpt_qty()
								.subtract(srchR.sum_inpt_qty());
						stRemRqmtQty = srchR.base_unit_rqmt_qty()
								.subtract(srchR.sum_rqmt_qty());
						stRemFxdRqmtQty = srchR.base_unit_fxd_rqmt_qty()
								.subtract(srchR.sum_fxd_rqmt_qty());
						if (srchR.cont_fctr_flg()) {
							stRemQty = sum(
									nvl(srchR.cont_inpt_qty(), MCNumber.ZERO)
											.subtract(nvl(srchR.sum_cont_inpt_qty(), MCNumber.ZERO)),
									nvl(srchR.cont_fxd_rqmt_qty(), MCNumber.ZERO)
											.subtract(nvl(srchR.sum_cont_fxd_rqmt_qty(), MCNumber.ZERO)));
							stRemContInptQty = nvl(srchR.cont_inpt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_inpt_qty(), MCNumber.ZERO));
							stRemContRqmtQty = nvl(srchR.cont_rqmt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_rqmt_qty(), MCNumber.ZERO));
							stRemContFxdRqmtQty = nvl(srchR.cont_fxd_rqmt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_fxd_rqmt_qty(), MCNumber.ZERO));
						}
						else {
							stRemQty = sum(
									srchR.base_unit_inpt_qty()
											.subtract(srchR.sum_inpt_qty()),
									srchR.base_unit_fxd_rqmt_qty()
											.subtract(srchR.sum_fxd_rqmt_qty()));
						}
						if (stRemQty.isNegative()) {
							stRemQty = MCNumber.ZERO;
						}
						
						// 基準単位投入数量以外は打切数を持っていないため、変数として定義
						MCNumber stAbortRqmtQty = MCNumber.ZERO;
						MCNumber stAbortFxdRqmtQty = MCNumber.ZERO;
						MCNumber stAbortContInptQty = MCNumber.ZERO;
						MCNumber stAbortContRqmtQty = MCNumber.ZERO;
						MCNumber stAbortContFxdRqmtQty = MCNumber.ZERO;

						// 残数打切時
						if (_abortSet.contains(r.mfg_inst_no())) {
							// 打切数量には着手残数量を設定
							updR.base_unit_inpt_abort_qty(stRemInptQty);
							stAbortRqmtQty = stRemRqmtQty;
							stAbortFxdRqmtQty = stRemFxdRqmtQty;
							stAbortContInptQty = stRemContInptQty;
							stAbortContRqmtQty = stRemContRqmtQty;
							stAbortContFxdRqmtQty = stRemContFxdRqmtQty;

							// 着手残数に０を再設定
							stRemQty = MCNumber.ZERO;
						}
						else {
							// 打切数量には０を設定
							updR.base_unit_inpt_abort_qty(MCNumber.ZERO);
						}

						if (MSC_MFG_STS_TYP.isCMPL(srchR.min_sts_typ())) {
							if (stRemQty.isZero()) {
								// 分割連番＞０のすべてのレコードが完了（＝製造状況区分の最小値が完了）かつ着手残数量＝０の場合、分割連番＝０のレコードも完了にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
							}
							else {
								// 着手残数量＞０の場合、着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
						}
						else {
							// 完了以外のレコードが存在する場合
							if (MSC_MFG_STS_TYP.isCMPL(srchR.max_sts_typ())) {
								// １件でも完了のレコードが存在する場合は着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
							else {
								// 上記以外は製造状況区分の最大値とする
								updR.mfg_sts_typ(srchR.max_sts_typ());
							}
						}

						// 分割枝番＞０の着手数量の合計を分割枝番＝０の着手数量とする
						updR.base_unit_inpt_qty(srchR.sum_inpt_qty());
						updR.base_unit_rqmt_qty(srchR.sum_rqmt_qty());
						updR.base_unit_fxd_rqmt_qty(srchR.sum_fxd_rqmt_qty());
						updR.cont_inpt_qty(srchR.sum_cont_inpt_qty());
						updR.cont_rqmt_qty(srchR.sum_cont_rqmt_qty());
						updR.cont_fxd_rqmt_qty(srchR.sum_cont_fxd_rqmt_qty());

						// 残数＝指図数－（分割連番＞０の実績数の合計）で算出。分割連番＞０の実績数は（分割連番＞０の着手数－残数）で算出
						MCNumber inptActQty = nvl(srchR.sum_inpt_qty(), MCNumber.ZERO)
								.subtract(nvl(srchR.sum_inpt_rem_qty(), MCNumber.ZERO)
										.subtract(updR.base_unit_inpt_abort_qty()));
						MCNumber rqmtActQty = nvl(srchR.sum_rqmt_qty(), MCNumber.ZERO)
								.subtract(nvl(srchR.sum_rqmt_rem_qty(), MCNumber.ZERO)
										.subtract(stAbortRqmtQty));
						MCNumber fxdActQty = nvl(srchR.sum_fxd_rqmt_qty(), MCNumber.ZERO)
								.subtract(nvl(srchR.sum_fxd_rqmt_rem_qty(), MCNumber.ZERO)
										.subtract(stAbortFxdRqmtQty));
						updR.base_unit_inpt_rem_qty(
								srchR.base_unit_inpt_qty().subtract(inptActQty));
						updR.base_unit_rqmt_rem_qty(
								srchR.base_unit_rqmt_qty().subtract(rqmtActQty));
						updR.base_unit_fxd_rqmt_rem_qty(
								srchR.base_unit_fxd_rqmt_qty().subtract(fxdActQty));

						if (updR.base_unit_inpt_rem_qty().isNegative()) {
							updR.base_unit_inpt_rem_qty(MCNumber.ZERO);
						}
						if (updR.base_unit_rqmt_rem_qty().isNegative()) {
							updR.base_unit_rqmt_rem_qty(MCNumber.ZERO);
						}
						if (updR.base_unit_fxd_rqmt_rem_qty().isNegative()) {
							updR.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
						}

						// 有効成分対象の場合
						if (srchR.cont_fctr_flg()) {
							MCNumber contInptActQty = nvl(srchR.sum_cont_inpt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_inpt_rem_qty(), MCNumber.ZERO)
											.subtract(stAbortContInptQty));
							MCNumber contRqmtActQty = nvl(srchR.sum_cont_rqmt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_rqmt_rem_qty(), MCNumber.ZERO)
											.subtract(stAbortContRqmtQty));
							MCNumber contFxdActQty = nvl(srchR.sum_cont_fxd_rqmt_qty(), MCNumber.ZERO)
									.subtract(nvl(srchR.sum_cont_fxd_rqmt_rem_qty(), MCNumber.ZERO)
											.subtract(stAbortContFxdRqmtQty));
							updR.cont_inpt_rem_qty(
									nvl(srchR.cont_inpt_qty(), MCNumber.ZERO).subtract(contInptActQty));
							updR.cont_rqmt_rem_qty(
									nvl(srchR.cont_rqmt_qty(), MCNumber.ZERO).subtract(contRqmtActQty));
							updR.cont_fxd_rqmt_rem_qty(
									nvl(srchR.cont_fxd_rqmt_qty(), MCNumber.ZERO).subtract(contFxdActQty));
							if (updR.cont_inpt_rem_qty().isNegative()) {
								updR.cont_inpt_rem_qty(MCNumber.ZERO);
							}
							if (updR.cont_rqmt_rem_qty().isNegative()) {
								updR.cont_rqmt_rem_qty(MCNumber.ZERO);
							}
							if (updR.cont_fxd_rqmt_rem_qty().isNegative()) {
								updR.cont_fxd_rqmt_rem_qty(MCNumber.ZERO);
							}
						}
						else {
							updR.cont_inpt_rem_qty(null);
							updR.cont_rqmt_rem_qty(null);
							updR.cont_fxd_rqmt_rem_qty(null);
						}
					}
					updL.add(updR);
				}
			}

			// 製造状況区分、着手数量、残数量、打切数量を更新対象とする
			MST_INPT_ACT_REM_R t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(
					t.mfg_sts_typ,
					t.base_unit_inpt_qty,
					t.base_unit_rqmt_qty,
					t.base_unit_fxd_rqmt_qty,
					t.cont_inpt_qty,
					t.cont_rqmt_qty,
					t.cont_fxd_rqmt_qty,
					t.base_unit_inpt_rem_qty,
					t.base_unit_rqmt_rem_qty,
					t.base_unit_fxd_rqmt_rem_qty,
					t.cont_inpt_rem_qty,
					t.cont_rqmt_rem_qty,
					t.cont_fxd_rqmt_rem_qty,
					t.base_unit_inpt_abort_qty
					);

			// 分割連番＝０のレコードの更新
			dbUpdateKey("MSBCL6110_MST_INPT_ACT_REM_U02", updL, updL_bldr);
		}
		protected Map<String, String> getSpareInptSchdStsMap() {
			Map<String, String> ret = new HashMap<String, String>();
			if (_spareInptSchdNoSet.isEmpty()) {
				return ret;
			}
			MCList<MSVT_INPT_SCHD_PR_R> bindL = MCList.create(MSVT_INPT_SCHD_PR_R.class);
			for (String val : _spareInptSchdNoSet) {
				MSVT_INPT_SCHD_PR_R bindR = MSVT_INPT_SCHD_PR_R.create();
				bindR.inpt_schd_no(val);
				bindL.add(bindR);
			}
			
			MCList<MSVT_INPT_SCHD_PR_R> selL = MCList.create(MSVT_INPT_SCHD_PR_R.class);
			MSVT_INPT_SCHD_PR_R t = MSVT_INPT_SCHD_PR_R.create("T");
			MCQueryApiBuilder selL_bldr = MCQueryApiBuilder.create(t);
			MSVT_OPER_INST_PR_R t2 = MSVT_OPER_INST_PR_R.create("T2");
			selL_bldr.setSelect(t.inpt_schd_no);
			selL_bldr.addSelect(t2.mfg_sts_typ.as("oper_sts"));
			selL_bldr.addInnerJoin(t2, bracket(t.oper_inst_no.eq(t2.oper_inst_no)));
			dbSelectKey("MSBCL6110_MSVT_INPT_SCHD_PR_S01", selL, selL_bldr, bindL);
			
			for (MSVT_INPT_SCHD_PR_R selR : selL) {
				ret.put(selR.inpt_schd_no(), selR.getStringNE("oper_sts"));
			}
			return ret;
		}

		/**
		 * 分割連番＝０の工数実績残を更新する
		 */
		protected void updWkPr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			MCList<MST_WK_ACT_REM_R> updL = MCList.create(MST_WK_ACT_REM_R.class);

			for (MfgInstActCom_Upd08_HdrR r : miNoL) {

				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MCList<MfgInstActCom_Upd08_DtlWkSchdR> srchL = _dtlWkSchdByMfgCache
						.getCache(r.mfg_inst_no());

				for (MfgInstActCom_Upd08_DtlWkSchdR srchR : srchL) {

					MST_WK_ACT_REM_R updR = MST_WK_ACT_REM_R.create();

					// 工数実績ＮＯ、分割連番を設定
					updR.wk_schd_no(srchR.wk_schd_no());
					updR.div_seq(MCNumber.ZERO);

					if (isNull(srchR.max_sts_typ())) {
						// 分割連番＞０のレコードが存在しない場合
						updR.wk_cost(MCNumber.ZERO); //着手数量には０
						updR.fxd_wk_cost(MCNumber.ZERO); //着手数量には０
						updR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value()); //製造状況区分は指図済
						updR.rem_wk_cost(sum(srchR.wk_cost(), srchR.fxd_wk_cost())); //残数量には工数
						updR.abort_wk_cost(MCNumber.ZERO); //打切数量には０
					}
					else {
						// 分割連番＞０のレコードが存在する場合

						// 着手残数の初期値は、指図数-着手数合計
						MCNumber stRemQty = sum(srchR.wk_cost(), srchR.fxd_wk_cost())
								.subtract(sum(srchR.sum_wk_cost(),
										srchR.sum_fxd_wk_cost()));
						if (stRemQty.isNegative()) {
							stRemQty = MCNumber.ZERO;
						}
						
						// 残数打切時
						if (_abortSet.contains(r.mfg_inst_no())) {
							// 打切数量には着手残数量を設定
							updR.abort_wk_cost(stRemQty);
							// 着手残数に０を再設定
							stRemQty = MCNumber.ZERO;
						}
						else {
							// 打切数量には０を設定
							updR.abort_wk_cost(MCNumber.ZERO);
						}

						if (MSC_MFG_STS_TYP.isCMPL(srchR.min_sts_typ())) {
							if (stRemQty.isZero()) {
								// 分割連番＞０のすべてのレコードが完了（＝製造状況区分の最小値が完了）かつ着手残数量＝０の場合、分割連番＝０のレコードも完了にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
							}
							else {
								// 着手残数量＞０の場合、着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
						}
						else {
							// 完了以外のレコードが存在する場合
							if (MSC_MFG_STS_TYP.isCMPL(srchR.max_sts_typ())) {
								// １件でも完了のレコードが存在する場合は着手中にする
								updR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
							}
							else {
								// 上記以外は製造状況区分の最大値とする
								updR.mfg_sts_typ(srchR.max_sts_typ());
							}
						}

						// 分割枝番＞０の着手数量の合計を分割枝番＝０の着手数量とする
						updR.wk_cost(srchR.sum_wk_cost());
						updR.fxd_wk_cost(srchR.sum_fxd_wk_cost());

						// 残数＝指図数－（分割連番＞０の実績数の合計）で算出。分割連番＞０の実績数は（分割連番＞０の着手数－残数）で算出
						MCNumber inptActQty = sum(srchR.sum_wk_cost(),
								srchR.sum_fxd_wk_cost()).subtract(
										nvl(srchR.sum_rem_wk_cost(), MCNumber.ZERO)
												.subtract(updR.abort_wk_cost()));
						updR.rem_wk_cost(sum(srchR.wk_cost(), srchR.fxd_wk_cost())
								.subtract(inptActQty));
						if (updR.rem_wk_cost().isNegative()) {
							updR.rem_wk_cost(MCNumber.ZERO);
						}
					}
					updL.add(updR);
				}
			}

			// 製造状況区分、着手数量、残数量、打切数量を更新対象とする
			MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(
					t.mfg_sts_typ,
					t.wk_cost,
					t.fxd_wk_cost,
					t.rem_wk_cost,
					t.abort_wk_cost
					);

			// 分割連番＝０のレコードの更新
			dbUpdateKey("MSBCL6110_MST_WK_ACT_REM_U02", updL, updL_bldr);
		}
		
		/**
		 * 指図書のみ品、代替で代替品目指定されなかった品目を製造実績のステータスにあわせて更新
		 * @param miNoL
		 */
		protected void updInptPrByHdr(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {

			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			// ヘッダを抽出
			MCList<MSVT_MFG_INST_PR_R> hdrL = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R hdrL_t = MSVT_MFG_INST_PR_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(hdrL_t);
			hdrL_bldr.setSelect(hdrL_t.mfg_inst_no, hdrL_t.mfg_sts_typ);
			dbSelectKey("MSBCL6110_MSVT_MFG_INST_PR_S02", hdrL, hdrL_bldr,
					miNoL.groupBy(MfgInstActCom_Upd08_HdrR.$mfg_inst_no));

			if (hdrL.isEmpty()) {
				return;
			}

			// ヘッダの製造指図ＮＯに紐付く投入実績残を取得（指図書のみ品、代替品のみ）
			MCList<MST_INPT_ACT_REM_R> updL = MCList.create(MST_INPT_ACT_REM_R.class);

			MST_INPT_SCHD_R t1 = MST_INPT_SCHD_R.create("T1");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");

			// 指図書のみ品の抽出
			MCList<MST_INPT_ACT_REM_R> noMrpInstL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R noMrpInstL_t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder noMrpInstL_bldr = MCQueryApiBuilder.create(noMrpInstL_t);
			noMrpInstL_bldr.setSelect(
					noMrpInstL_t.mfg_inst_no,
					noMrpInstL_t.inpt_schd_no,
					noMrpInstL_t.div_seq
					);
			noMrpInstL_bldr.addSelect(
					t1.base_unit_inpt_qty,
					t1.base_unit_rqmt_qty,
					t1.base_unit_fxd_rqmt_qty,
					t1.cont_inpt_qty,
					t1.cont_rqmt_qty,
					t1.cont_fxd_rqmt_qty,
					m1.cont_fctr_flg
					);
			noMrpInstL.addBooleanColumn("cont_fctr_flg");
			noMrpInstL_bldr.addInnerJoin(t1,
					bracket(noMrpInstL_t.inpt_schd_no.eq(t1.inpt_schd_no)));
			noMrpInstL_bldr.addLeftOuterJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			noMrpInstL_bldr.setWhere(noMrpInstL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			noMrpInstL_bldr.addWhereWithAnd(noMrpInstL_t.div_seq.eq(value(0)));
			noMrpInstL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			noMrpInstL_bldr.addWhereWithAnd(t1.inpt_ctl_typ.eq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			dbSelect("MSBCL6110_MST_INPT_ACT_REM_S01", noMrpInstL, noMrpInstL_bldr, hdrL);
			if (!noMrpInstL.isEmpty()) {
				updL.addAll(noMrpInstL);
			}

			// 指定されなかった代替品の抽出
			MCList<MST_INPT_ACT_REM_R> notFixedAltL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R notFixedAltL_t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder notFixedAltL_bldr = MCQueryApiBuilder.create(notFixedAltL_t);
			notFixedAltL_bldr.setSelect(
					notFixedAltL_t.mfg_inst_no,
					notFixedAltL_t.inpt_schd_no,
					notFixedAltL_t.div_seq
					);
			notFixedAltL_bldr.addSelect(
					t1.base_unit_inpt_qty,
					t1.base_unit_rqmt_qty,
					t1.base_unit_fxd_rqmt_qty,
					t1.cont_inpt_qty,
					t1.cont_rqmt_qty,
					t1.cont_fxd_rqmt_qty,
					m1.cont_fctr_flg
					);
			notFixedAltL.addBooleanColumn("cont_fctr_flg");
			notFixedAltL_bldr.addInnerJoin(t1,
					bracket(notFixedAltL_t.inpt_schd_no.eq(t1.inpt_schd_no)));
			notFixedAltL_bldr.addLeftOuterJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			notFixedAltL_bldr.setWhere(notFixedAltL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			notFixedAltL_bldr.addWhereWithAnd(notFixedAltL_t.div_seq.eq(value(0)));
			notFixedAltL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			notFixedAltL_bldr.addWhereWithAnd(t1.alt_grp_cd.isNotNull());
			notFixedAltL_bldr.addWhereWithAnd(t1.alt_itm_fix_flg.eq(value(false)));
			notFixedAltL_bldr.addWhereWithAnd(t1.base_unit_inpt_qty.eq(value(0)));
			notFixedAltL_bldr.addWhereWithAnd(t1.base_unit_rqmt_qty.eq(value(0)));
			notFixedAltL_bldr.addWhereWithAnd(t1.base_unit_fxd_rqmt_qty.eq(value(0)));
			dbSelect("MSBCL6110_MST_INPT_ACT_REM_S02", notFixedAltL, notFixedAltL_bldr, hdrL);
			if (!notFixedAltL.isEmpty()) {
				updL.addAll(notFixedAltL);
			}

			if (updL.isEmpty()) {
				return;
			}

			MCIndexKey hdrKey = hdrL.createIndex(MfgInstActCom_Upd08_HdrR.$mfg_inst_no);
			
			// ステータスを更新
			for (MST_INPT_ACT_REM_R remR : updL) {
				MSVT_MFG_INST_PR_R hdrR = hdrL.getFirst(hdrKey, remR.mfg_inst_no());
				if (MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
					// ヘッダが完了している場合は完了
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					remR.base_unit_inpt_rem_qty(MCNumber.ZERO);
					remR.base_unit_rqmt_rem_qty(MCNumber.ZERO);
					remR.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
					if (remR.getBooleanNE("cont_fctr_flg")) {
						remR.cont_inpt_rem_qty(MCNumber.ZERO);
						remR.cont_rqmt_rem_qty(MCNumber.ZERO);
						remR.cont_fxd_rqmt_rem_qty(MCNumber.ZERO);
					}
				}
				else {
					// ヘッダが完了以外の場合は指図済
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
					remR.base_unit_inpt_rem_qty(remR.getNumberNE("base_unit_inpt_qty"));
					remR.base_unit_rqmt_rem_qty(remR.getNumberNE("base_unit_rqmt_qty"));
					remR.base_unit_fxd_rqmt_rem_qty(
							remR.getNumberNE("base_unit_fxd_rqmt_qty"));
					remR.cont_inpt_rem_qty(remR.getNumberNE("cont_inpt_qty"));
					remR.cont_rqmt_rem_qty(remR.getNumberNE("cont_rqmt_qty"));
					remR.cont_fxd_rqmt_rem_qty(remR.getNumberNE("cont_fxd_rqmt_qty"));
				}
			}

			MST_INPT_ACT_REM_R updL_t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
			updL_bldr.setSet(
					updL_t.base_unit_inpt_rem_qty,
					updL_t.base_unit_rqmt_rem_qty,
					updL_t.base_unit_fxd_rqmt_rem_qty,
					updL_t.cont_inpt_rem_qty,
					updL_t.cont_rqmt_rem_qty,
					updL_t.cont_fxd_rqmt_rem_qty,
					updL_t.mfg_sts_typ);
			dbUpdateKey("MSBCL6110_MST_INPT_ACT_REM_U03", updL, updL_bldr);
		}
		
		protected void insIoSchd(MCList<MfgInstActCom_Upd08_HdrR> miNoL) {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd09 inptOpe = MSBCL_MfgInstTblRegService
					.crtMfgInstTblReg_Upd09();
			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 yieldByProdOpe = MSBCL_MfgInstTblRegService
					.crtMfgInstTblReg_Upd10();
			
			for (MfgInstActCom_Upd08_HdrR r : miNoL) {
				// 投入の受払予定作成
				MCList<MfgInstActCom_Upd08_DtlInptSchdR> srchIsL = _dtlInptSchdByMfgCache
						.getCache(r.mfg_inst_no());
				addAll(inptOpe.up0(), srchIsL, createMap_MfgInstTblReg_Upd09_DtlInptR_MfgInstActCom_Upd08_DtlInptSchdR());
				
				// 出来高副産品の受払予定
				MCList<MfgInstActCom_Upd08_DtlYieldSchdR> srchYsL = _dtlYieldSchdByMfgCache
						.getCache(r.mfg_inst_no());
				addAll(yieldByProdOpe.up0(), srchYsL,
						createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstActCom_Upd08_DtlYieldSchdR());
			}
			
			if (!inptOpe.up0().isEmpty()) {
				inptOpe.exec();
			}
			if (!yieldByProdOpe.up0().isEmpty()) {
				yieldByProdOpe.exec();
			}
		}
		
		protected Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstActCom_Upd08_DtlInptSchdR<MfgInstTblReg_Upd09_DtlInptR,MfgInstActCom_Upd08_DtlInptSchdR> createMap_MfgInstTblReg_Upd09_DtlInptR_MfgInstActCom_Upd08_DtlInptSchdR() {
			return new Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstActCom_Upd08_DtlInptSchdR<MfgInstTblReg_Upd09_DtlInptR, MfgInstActCom_Upd08_DtlInptSchdR>();
		}

		public class Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstActCom_Upd08_DtlInptSchdR<D extends MfgInstTblReg_Upd09_DtlInptR, S extends MfgInstActCom_Upd08_DtlInptSchdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no, MfgInstActCom_Upd08_DtlInptSchdR.$inpt_schd_no);
			}
		}
		
		protected Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstActCom_Upd08_DtlYieldSchdR<MfgInstTblReg_Upd10_DtlYieldR,MfgInstActCom_Upd08_DtlYieldSchdR> createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstActCom_Upd08_DtlYieldSchdR() {
			return new Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstActCom_Upd08_DtlYieldSchdR<MfgInstTblReg_Upd10_DtlYieldR, MfgInstActCom_Upd08_DtlYieldSchdR>();
		}

		public class Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstActCom_Upd08_DtlYieldSchdR<D extends MfgInstTblReg_Upd10_DtlYieldR, S extends MfgInstActCom_Upd08_DtlYieldSchdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd10_DtlYieldR.$yield_schd_no, MfgInstActCom_Upd08_DtlYieldSchdR.$yield_schd_no);
			}
		}
		
		/**
		 * 受注状況更新サービスを呼び出します。
		 */
		protected void callSloStsInsSrv() {
			// 工数実績一覧登録から呼ばれた場合は何もしない
			if (up0().is_src_wk_act_reg_flg()) {
				return;
			}
			
			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();
			for (MfgInstActCom_Upd08_HdrR r : up1()) {
				if (!isCallSloStsInsSrv(r)) {
					continue;
				}
				
				if (MSC_MFG_STS_TYP.isCMPL(r.old_mfg_sts_typ())
						|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
					// 製造完了の行を作成
					SloSts_DtlR endUpR = SloSts_DtlR.create();

					endUpR.slo_sts_typ(MSC_SLO_STS_TYP.MFG_CMPL.value());
					if (!MSC_MFG_STS_TYP.isCMPL(r.old_mfg_sts_typ()) && MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
						endUpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else if (MSC_MFG_STS_TYP.isCMPL(r.old_mfg_sts_typ()) && MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
						endUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
					else {
						endUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					
					if (!MAC_DATA_CRUD_TYP.isDEL(endUpR.data_crud_typ())) {
						// 完了している製造実績の取消の場合、このロジックでは処理できないため、Upd04のcallSloStsInsSrvCmplDelメソッドで実施している。
						// ※理由はcallSloStsInsSrvCmplDelメソッドにコメントとして記載している。
						endUpR.st_act_tm(r.st_act_tm());
						endUpR.end_act_tm(r.end_act_tm());
						endUpR.qty(r.base_unit_yield_qty());
					}
					copy(endUpR, r, createMap_SloSts_DtlR_MfgInstActCom_Upd08_HdrR());
					o.up0().add(endUpR);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected boolean isCallSloStsInsSrv(MfgInstActCom_Upd08_HdrR r){
			if (up0().is_src_mfg_inst_srv_flg()) {
				return false;
			}
			if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
				return false;
			}
			if (isNull(_dtlYieldSchdByMfgCache.getCache(r.mfg_inst_no()))) {
				// 出来高が存在しない場合は、受注状況更新サービスを実行しない（数量が取得できないため）
				return false;
			}
			return true;
		}
		
		protected Map_MfgInstActCom_Upd08_DtlInptR_MfgInstActCom_Upd08_DtlInptActRemR<MfgInstActCom_Upd08_DtlInptR,MfgInstActCom_Upd08_DtlInptActRemR> createMap_MfgInstActCom_Upd08_DtlInptR_MfgInstActCom_Upd08_DtlInptActRemR() {
			return new Map_MfgInstActCom_Upd08_DtlInptR_MfgInstActCom_Upd08_DtlInptActRemR<MfgInstActCom_Upd08_DtlInptR, MfgInstActCom_Upd08_DtlInptActRemR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlInptR_MfgInstActCom_Upd08_DtlInptActRemR<D extends MfgInstActCom_Upd08_DtlInptR, S extends MfgInstActCom_Upd08_DtlInptActRemR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$inpt_schd_no, MfgInstActCom_Upd08_DtlInptActRemR.$inpt_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$div_seq, MfgInstActCom_Upd08_DtlInptActRemR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$mfg_inst_no, MfgInstActCom_Upd08_DtlInptActRemR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$itm_mfg_inst_no, MfgInstActCom_Upd08_DtlInptActRemR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$oper_inst_no, MfgInstActCom_Upd08_DtlInptActRemR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_inpt_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_inpt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_fxd_rqmt_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_inpt_qty, MfgInstActCom_Upd08_DtlInptActRemR.$cont_inpt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_fxd_rqmt_qty, MfgInstActCom_Upd08_DtlInptActRemR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$alt_grp_cd, MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_cd);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$alt_grp_seq, MfgInstActCom_Upd08_DtlInptActRemR.$alt_grp_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_inpt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_inpt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_rqmt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_rqmt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_fxd_rqmt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_fxd_rqmt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_inpt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$cont_inpt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_rqmt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$cont_rqmt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_fxd_rqmt_rem_qty, MfgInstActCom_Upd08_DtlInptActRemR.$cont_fxd_rqmt_rem_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_inpt_abort_qty, MfgInstActCom_Upd08_DtlInptActRemR.$base_unit_inpt_abort_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$mfg_sts_typ, MfgInstActCom_Upd08_DtlInptActRemR.$mfg_sts_typ);
			}
		}

		protected Map_SloSts_DtlR_MfgInstActCom_Upd08_HdrR<SloSts_DtlR,MfgInstActCom_Upd08_HdrR> createMap_SloSts_DtlR_MfgInstActCom_Upd08_HdrR() {
			return new Map_SloSts_DtlR_MfgInstActCom_Upd08_HdrR<SloSts_DtlR, MfgInstActCom_Upd08_HdrR>();
		}

		public class Map_SloSts_DtlR_MfgInstActCom_Upd08_HdrR<D extends SloSts_DtlR, S extends MfgInstActCom_Upd08_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$mfg_inst_no, MfgInstActCom_Upd08_HdrR.$mfg_inst_no);
				addColumnPathMap(SloSts_DtlR.$mfg_act_no, MfgInstActCom_Upd08_HdrR.$mfg_act_no);
				addColumnPathMap(SloSts_DtlR.$st_act_tm, MfgInstActCom_Upd08_HdrR.$st_act_tm);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// ヘッダの製造指図ＮＯで対象テーブルを取得
				MfgInstActCom_Upd08_HdrInstR srchR = _hdrInstCache.getCache(src.mfg_inst_no());
				dest.itm_cd(srchR.itm_cd());
				dest.itm_sub1(srchR.itm_sub1());
				dest.itm_sub2(srchR.itm_sub2());
				dest.itm_sub3(srchR.itm_sub3());
				dest.sno1(srchR.sno1());
				dest.sno2(srchR.sno2());
				dest.sno3(srchR.sno3());
				dest.sno4(srchR.sno4());
				dest.unit_cd(srchR.base_unit_cd());
				dest.st_schd_tm(srchR.st_schd_tm());
				dest.end_schd_tm(srchR.end_schd_tm());
			}
		}
		
		/**
		 * 下り電文を編集します。
		 */
		protected void setDown() {
			// 全投入完了フラグの設定
			for (MfgInstActCom_Upd08_HdrR hdrR : up1()) {
				
				// 工数実績一覧登録から呼ばれた場合は何もしない
				if (up0().is_src_wk_act_reg_flg()) {
					continue;
				}

				hdrR.all_inpt_cmpl_flg(true);
				
				// 製造指図ＮＯ、分割連番で投入実績残を取得
				MCList<MfgInstActCom_Upd08_DtlInptActRemR> remL = _dtlInptActRemByMfgCache
						.getCache(hdrR.mfg_inst_no(), hdrR.div_seq());
				// 投入実績残が存在しない場合はtrue（記録承認可能かどうかの判断条件で使用されるためfalseではなくtrueを返す必要がある）
				if (isNull(remL)) {
					continue;
				}

				// 完了でないレコードが存在する場合はfalse
				for (MfgInstActCom_Upd08_DtlInptActRemR remR : remL) {
					if (!MSC_MFG_STS_TYP.isCMPL(remR.mfg_sts_typ())) {
						hdrR.all_inpt_cmpl_flg(false);
						continue;
					}
				}
			}
			
			// 下り電文に設定
			down0().setAll(up1());
		}

	}

	/**
	 * MfgInstActCom_Upd03オペレーション.<p>
	 *
	 * 着手後の製造指図訂正時、製造実績残テーブルを再作成する。<br>
	 */
	public class MfgInstActCom_Upd03
			extends MSBCL_MfgInstActComService_MC_A.MfgInstActCom_Upd03 {
		/**
		 * 未完了（着手中かつ終了実績日あり）の工程実績ＮＯを格納する
		 */
		Set<String> _notCmplOperActNo = new HashSet<String>();
		/**
		 * 投入打切の投入実績ＮＯを格納する
		 */
		Set<String> _inptAbort = new HashSet<String>();
		/**
		 * 工数打切の工数実績ＮＯを格納する
		 */
		Set<String> _wkAbort = new HashSet<String>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// ヘッダとなる製造実績残、製造実績の取得
			MCList<MST_MFG_ACT_REM_R> hdrL = srchHdr();

			if (hdrL.isEmpty()) {
				return;
			}
			// Upd08実行時に工程の未完了フラグを設定するが、Upd04で実績残テーブルが再作成されてしまうと未完了かどうか判断できない
			// ここで未完了の工程実績ＮＯを保持しておく
			// ※未完了＝工程実績残が着手中かつ工程実績終了日が設定済
			getNotCmplOper(hdrL);
			// Upd04で投入実績残テーブルが再作成されてしまうと打切っていた投入レコードの判断がつかなくなるため、
			// ここで打切られている投入の投入実績ＮＯを保持しておく
			getAbortInpt(hdrL);
			// Upd04で工数実績残テーブルが再作成されてしまうと打切っていた工数レコードの判断がつかなくなるため、
			// ここで打切られている工数の工数実績ＮＯを保持しておく
			getAbortWk(hdrL);

			// 実績残登録・受払予定削除処理
			callThisUpd04(hdrL);

			// 実績残更新・受払予定復活処理
			callThisUpd08(hdrL);
		}

		/**
		 * ヘッダとなる製造実績残、製造実績を取得します。
		 */
		protected MCList<MST_MFG_ACT_REM_R> srchHdr() {
			MCList<MST_MFG_ACT_REM_R> dbcL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_MFG_ACT_R t1 = MST_MFG_ACT_R.create("T1");

			dbcL_bldr.setSelect(
					t.itm_mfg_inst_no,
					t.mfg_inst_no,
					t.div_seq,
					t.base_unit_mfg_qty,
					t.mfg_sts_typ
					);
			dbcL_bldr.addSelect(
					t1.mfg_act_no,
					t1.base_unit_yield_qty,
					t1.base_unit_dfct_qty
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.mfg_inst_no.eq(t.mfg_inst_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6110_MST_MFG_ACT_REM_S02", dbcL, dbcL_bldr,
					up0().groupBy(MfgInstActCom_Upd03_HdrR.$mfg_inst_no));
			return dbcL;
		}
		/**
		 * 未完了の工程実績ＮＯを取得します。
		 * @param hdrL
		 */
		protected void getNotCmplOper(MCList<MST_MFG_ACT_REM_R> hdrL) {
			MCList<MST_OPER_ACT_R> dbcL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_ACT_REM_R t1 = MST_OPER_ACT_REM_R.create("T1");
			dbcL_bldr.setSelect(t.oper_act_no);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.oper_inst_no.eq(t.oper_inst_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t1.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t1.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(t.end_act_tm.isNotNull());
			dbcL_bldr.addWhereWithAnd(t1.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value())));
			dbSelect("MSBCL6110_MST_OPER_ACT_S04", dbcL, dbcL_bldr, hdrL);
			for (MST_OPER_ACT_R r : dbcL) {
				_notCmplOperActNo.add(r.oper_act_no());
			}
		}
		/**
		 * 打切られている投入の投入実績ＮＯを取得します。
		 * @param hdrL
		 */
		protected void getAbortInpt(MCList<MST_MFG_ACT_REM_R> hdrL) {
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MST_INPT_ACT_REM_R t1 = MST_INPT_ACT_REM_R.create("T1");
			MCList<MST_INPT_ACT_R> dbcL = MCList.create(MST_INPT_ACT_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.inpt_act_no);
			dbcL_bldr.addInnerJoin(t1, bracket( t1.inpt_schd_no.eq(t.inpt_schd_no) .and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t1.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t1.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(t1.base_unit_inpt_abort_qty.neq(value(0)));
			dbSelect("MSBCL6110_MST_INPT_ACT_S06", dbcL, dbcL_bldr, hdrL);
			for (MST_INPT_ACT_R r : dbcL) {
				_inptAbort.add(r.inpt_act_no());
			}
		}
		/**
		 * 打切られている工数の投入実績ＮＯを取得します。
		 * @param hdrL
		 */
		protected void getAbortWk(MCList<MST_MFG_ACT_REM_R> hdrL) {
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MST_WK_ACT_REM_R t1 = MST_WK_ACT_REM_R.create("T1");
			MCList<MST_WK_ACT_R> dbcL = MCList.create(MST_WK_ACT_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.wk_act_no);
			dbcL_bldr.addInnerJoin(t1, bracket( t1.wk_schd_no.eq(t.wk_schd_no) .and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t1.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t1.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(t1.abort_wk_cost.neq(value(0)));
			dbSelect("MSBCL6110_MST_WK_ACT_S02", dbcL, dbcL_bldr, hdrL);
			for (MST_WK_ACT_R r : dbcL) {
				_wkAbort.add(r.wk_act_no());
			}
		}

		/**
		 * 実績残登録・受払予定削除処理（Upd04）を実行します。
		 * @param hdrL
		 */
		protected void callThisUpd04(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MSBCL_MfgInstActComService.MfgInstActCom_Upd04 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd04();

			// コントロールの設定
			o.up0().is_src_mfg_inst_srv_flg(true); //呼出元製造指図サービスＦＬＧはtrue

			// ヘッダの設定
			for (MST_MFG_ACT_REM_R r : hdrL) {
				MfgInstActCom_Upd04_HdrR hdrR = MfgInstActCom_Upd04_HdrR.create();
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分は「新規」
				hdrR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				hdrR.mfg_inst_no(r.mfg_inst_no());
				hdrR.div_seq(r.div_seq());
				hdrR.base_unit_st_qty(r.base_unit_mfg_qty());
				o.up1().add(hdrR);
			}

			o.exec();
		}

		/**
		 * 実績残更新・受払予定復活処理（Upd08）を実行します。
		 * @param hdrL
		 */
		protected void callThisUpd08(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MSBCL_MfgInstActComService.MfgInstActCom_Upd08 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd08();

			// コントロールの設定
			o.up0().is_src_mfg_inst_srv_flg(true); //呼出元製造指図サービスＦＬＧはtrue
			o.up0().is_src_wk_act_reg_flg(false); //呼出元工数実績一覧ＦＬＧはfalse

			MCIndexKey up0Key = up0().createIndex(MfgInstActCom_Upd03_HdrR.$mfg_inst_no);
			
			// ヘッダの設定
			for (MST_MFG_ACT_REM_R r : hdrL) {
				MfgInstActCom_Upd08_HdrR newR = MfgInstActCom_Upd08_HdrR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分は「新規」
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.div_seq(r.div_seq());
				newR.mfg_act_no(r.getStringNE("mfg_act_no"));
				newR.mfg_sts_typ(r.mfg_sts_typ());
				newR.base_unit_yield_qty(r.getNumberNE("base_unit_yield_qty"));
				newR.base_unit_dfct_qty(r.getNumberNE("base_unit_dfct_qty"));
				// 打切フラグは上り電文から設定
				MfgInstActCom_Upd03_HdrR up0R = up0().getFirst(up0Key, r.mfg_inst_no());
				newR.abort_flg(up0R.abort_flg());
				o.up1().add(newR);
			}
			// 紐付けＮＯの設定
			setPegNo(o.up1());

			// 工程の設定
			for (MST_OPER_ACT_REM_R r : srchOper(hdrL)) {
				MfgInstActCom_Upd08_DtlOperR newR = MfgInstActCom_Upd08_DtlOperR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				newR.oper_act_no(r.getStringNE("oper_act_no"));
				newR.oper_inst_no(r.oper_inst_no());
				newR.div_seq(r.div_seq());
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				newR.base_unit_qty(r.getNumberNE("base_unit_qty"));
				if (!isNull(r.getDateNE("st_act_tm"))) {
					newR.st_act_dt(r.getDateNE("st_act_tm").trunc(MCDateFieldType.DAY));
				}
				if (!isNull(r.getDateNE("end_act_tm"))) {
					newR.end_act_dt(r.getDateNE("end_act_tm").trunc(MCDateFieldType.DAY));
				}
				// 工程実績が未完了の場合、未完了フラグをオン
				if (!isNull(newR.oper_act_no()) && _notCmplOperActNo.contains(newR.oper_act_no())) {
					newR.not_cmpl_flg(true);
				}
				o.up2().add(newR);
			}

			// 出来高の設定
			for (MST_YIELD_ACT_REM_R r : srchYield(hdrL)) {
				MfgInstActCom_Upd08_DtlYieldR newR = MfgInstActCom_Upd08_DtlYieldR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				newR.yield_act_no(r.getStringNE("yield_act_no"));
				newR.yield_schd_no(r.yield_schd_no());
				newR.div_seq(r.div_seq());
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				newR.oper_inst_no(r.oper_inst_no());
				newR.trd_unit_yield_qty(r.getNumberNE("trd_unit_qty"));
				newR.base_unit_yield_qty(r.getNumberNE("base_unit_qty"));
				newR.trd_unit_cd(r.getStringNE("trd_unit_cd"));
				o.up3().add(newR);
			}

			// 投入の設定
			for (MST_INPT_ACT_REM_R r : srchInpt(hdrL)) {
				MfgInstActCom_Upd08_DtlInptR newR = MfgInstActCom_Upd08_DtlInptR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				newR.inpt_act_no(r.getStringNE("inpt_act_no"));
				newR.inpt_schd_no(r.inpt_schd_no());
				newR.div_seq(r.div_seq());
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				newR.oper_inst_no(r.oper_inst_no());
				newR.base_unit_inpt_qty(r.getNumberNE("base_unit_inpt_qty"));
				newR.base_unit_fxd_rqmt_qty(r.getNumberNE("base_unit_fxd_loss_qty"));
				if (r.getBooleanNE("cont_fctr_flg")) {
					newR.cont_inpt_qty(r.getNumberNE("cont_qty"));
					newR.cont_fxd_rqmt_qty(r.getNumberNE("cont_fxd_loss_qty"));
					newR.act_cont_fctr(r.getNumberNE("act_cont_fctr"));
				}
				newR.abort_flg(false);
				// 打切の場合は、打切フラグをオンで上書き
				if (!isNull(newR.inpt_act_no()) && _inptAbort.contains(newR.inpt_act_no())) {
					newR.abort_flg(true);
				}
				o.up4().add(newR);
			}

			// 工数の設定
			for (MST_WK_ACT_REM_R r : srchWk(hdrL)) {
				MfgInstActCom_Upd08_DtlWkR newR = MfgInstActCom_Upd08_DtlWkR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				newR.wk_act_no(r.getStringNE("wk_act_no"));
				newR.wk_schd_no(r.wk_schd_no());
				newR.div_seq(r.div_seq());
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				newR.oper_inst_no(r.oper_inst_no());
				newR.act_wk_cost(r.getNumberNE("wk_cost"));
				newR.abort_flg(false);
				// 打切の場合は、打切フラグをオンで上書き
				if (!isNull(newR.wk_act_no()) && _wkAbort.contains(newR.wk_act_no())) {
					newR.abort_flg(true);
				}
				o.up5().add(newR);
			}

			// 副産品の設定
			for (MST_YIELD_ACT_REM_R r : srchByProd(hdrL)) {
				MfgInstActCom_Upd08_DtlYieldR newR = MfgInstActCom_Upd08_DtlYieldR.create();
				newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				newR.yield_act_no(r.getStringNE("yield_act_no"));
				newR.yield_schd_no(r.yield_schd_no());
				newR.div_seq(r.div_seq());
				newR.mfg_inst_no(r.mfg_inst_no());
				newR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				newR.oper_inst_no(r.oper_inst_no());
				newR.trd_unit_yield_qty(r.getNumberNE("trd_unit_qty"));
				newR.base_unit_yield_qty(r.getNumberNE("base_unit_qty"));
				newR.trd_unit_cd(r.getStringNE("trd_unit_cd"));
				o.up6().add(newR);
			}

			o.exec();
		}

		/**
		 * 工程実績残、工程実績を取得します。
		 */
		protected MCList<MST_OPER_ACT_REM_R> srchOper(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MCList<MST_OPER_ACT_REM_R> dbcL = MCList.create(MST_OPER_ACT_REM_R.class);
			MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_ACT_R t1 = MST_OPER_ACT_R.create("T1");

			dbcL_bldr.setSelect(
					t.oper_inst_no,
					t.div_seq, t.mfg_inst_no,
					t.itm_mfg_inst_no
					);
			dbcL_bldr.addSelect(
					t1.oper_act_no,
					t1.base_unit_qty, t1.st_act_tm,
					t1.end_act_tm
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.oper_inst_no.eq(t.oper_inst_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6110_MST_OPER_ACT_REM_S01", dbcL, dbcL_bldr, hdrL);
			return dbcL;
		}

		/**
		 * 出来高実績残、出来高実績を取得します。
		 */
		protected MCList<MST_YIELD_ACT_REM_R> srchYield(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MCList<MST_YIELD_ACT_REM_R> dbcL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_YIELD_ACT_R t1 = MST_YIELD_ACT_R.create("T1");

			dbcL_bldr.setSelect(
					t.yield_schd_no,
					t.div_seq, t.mfg_inst_no,
					t.itm_mfg_inst_no,
					t.oper_inst_no
					);
			dbcL_bldr.addSelect(
					t1.yield_act_no,
					t1.trd_unit_qty,
					t1.base_unit_qty,
					t1.trd_unit_cd
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.yield_schd_no.eq(t.yield_schd_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
			dbSelect("MSBCL6110_MST_YIELD_ACT_REM_S03", dbcL, dbcL_bldr, hdrL);
			return dbcL;
		}

		/**
		 * 投入実績残、投入実績を取得します。
		 */
		protected MCList<MST_INPT_ACT_REM_R> srchInpt(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MCList<MST_INPT_ACT_REM_R> dbcL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_INPT_ACT_R t1 = MST_INPT_ACT_R.create("T1");
			MST_INPT_SCHD_R t2 = MST_INPT_SCHD_R.create("T2");

			dbcL_bldr.setSelect(
					t.inpt_schd_no,
					t.div_seq,
					t.mfg_inst_no,
					t.itm_mfg_inst_no,
					t.oper_inst_no
					);
			dbcL_bldr.addSelect(
					t1.inpt_act_no,
					t1.base_unit_inpt_qty,
					t1.base_unit_fxd_loss_qty,
					t1.cont_qty,
					t1.act_cont_fctr,
					t1.cont_fxd_loss_qty
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.inpt_schd_no.eq(t.inpt_schd_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addInnerJoin(t2, bracket(t2.inpt_schd_no.eq(t.inpt_schd_no)));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(bracket(t2.prov_typ.isNull()
					.or(t2.prov_typ.neq(value(MAC_PROV_TYP.SS.value()))))); //自給を除外
			dbcL_bldr.addWhereWithAnd(
					t2.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value()))); //指図書のみを除外

			dbSelect("MSBCL6110_MST_INPT_ACT_REM_S03", dbcL, dbcL_bldr, hdrL);
			return dbcL;
		}

		/**
		 * 工数実績残、工数実績を取得します。
		 */
		protected MCList<MST_WK_ACT_REM_R> srchWk(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MCList<MST_WK_ACT_REM_R> dbcL = MCList.create(MST_WK_ACT_REM_R.class);
			MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_WK_ACT_R t1 = MST_WK_ACT_R.create("T1");

			dbcL_bldr.setSelect(
					t.wk_schd_no,
					t.div_seq,
					t.mfg_inst_no,
					t.itm_mfg_inst_no,
					t.oper_inst_no
					);
			dbcL_bldr.addSelect(
					t1.wk_act_no,
					t1.wk_cost
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.wk_schd_no.eq(t.wk_schd_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6110_MST_WK_ACT_REM_S01", dbcL, dbcL_bldr, hdrL);
			return dbcL;
		}

		/**
		 * 副産品実績残、副産品実績を取得します。
		 */
		protected MCList<MST_YIELD_ACT_REM_R> srchByProd(MCList<MST_MFG_ACT_REM_R> hdrL) {

			MCList<MST_YIELD_ACT_REM_R> dbcL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MST_YIELD_ACT_R t1 = MST_YIELD_ACT_R.create("T1");

			dbcL_bldr.setSelect(
					t.yield_schd_no,
					t.div_seq,
					t.mfg_inst_no,
					t.itm_mfg_inst_no,
					t.oper_inst_no
					);
			dbcL_bldr.addSelect(
					t1.yield_act_no,
					t1.trd_unit_qty,
					t1.base_unit_qty,
					t1.trd_unit_cd
					);
			dbcL_bldr.addInnerJoin(t1, bracket(t1.yield_schd_no.eq(t.yield_schd_no)
					.and(t1.div_seq.eq(t.div_seq))));
			dbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbcL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbcL_bldr.addWhereWithAnd(t.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value())));
			dbSelect("MSBCL6110_MST_YIELD_ACT_REM_S04", dbcL, dbcL_bldr, hdrL);
			return dbcL;
		}

	}

	//FMCB CUSTOM END
}