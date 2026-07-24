package mcframe.serverMSBC.MSBCL0150;

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
import mcframe.serverMSBC.MSBCL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL5020.*;
import mcframe.serverMSBC.MSBCL5050.*;
import static mcframe.serverMSBC.MSBCL0150.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_SimRqmtReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_SimRqmtReg_MC extends MSBCL_SimRqmtReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * シミュレーション管理情報、シミュレーション日次生産依頼を検索する<br>
	 */
	public class Srch01 extends MSBCL_SimRqmtReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchSimMrp();
			if (cnt <= 0) {
				return;
			}

			srchSimRqmt();
		}

		protected int srchSimMrp(){
			return executeQuery(down0(), MSBCL0150_MST_SIM_MRP_S01(), up0());
		}

		protected int srchSimRqmt(){
			return executeQuery(down1(), MSBCL0150_MST_SIM_RQMT_S01(), up0());
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			// 明細行IDの設定
			setRsltSimRowId();
		}

		/**
		 * 	明細行IDの設定<br>
		 * {@link Srch03#setDtlRowId()}
		 */
		protected void setRsltSimRowId() {

			MCIndexKey idxKey = down1().createIndex(Srch01_Rslt2R.$sim_mrp_no);
			int i = 1;
			for (Srch01_Rslt1R r : down0()) {
				r.peg_no1(i);
				MCList<Srch01_Rslt2R> RsltRqmtL = down1().subList(idxKey, r.sim_mrp_no());
				RsltRqmtL.setNumberNE(Srch01_Rslt2R.$peg_no1, i);
				i++;
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 手配ＮＯを発番する<br>
	 */
	public class Sprt01 extends MSBCL_SimRqmtReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			setReleaseFlgCtl(false);
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callSnoSrv();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_Rslt2R.$peg_no2, up0());
		}

		/**
		 * 手配ＮＯ発番サービスを実行する
		 */
		protected void callSnoSrv() {
			MSBCL_RqmtRegService.Rqmt_Sprt01 ope = MSBCL_RqmtRegService.crtRqmt_Sprt01();
			MCList<Rqmt_Sprt01_RsltR> destL = MCList.create(Rqmt_Sprt01_RsltR.class);
			addAll(destL, up0().subList(Sprt01_DtlR.$sno_sprt_flg, true), createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR());
			ope.up0().addAll(destL);
			ope.up1().screen_flg(true);
			ope.exec();
			String[] destCols = {
					Sprt01_DtlR.$sno1, Sprt01_DtlR.$sno2, Sprt01_DtlR.$sno3,
					Sprt01_DtlR.$sno4, Sprt01_DtlR.$wrk_no, Sprt01_DtlR.$wrk_nm
			};
			String[] srcCols = {
					Rqmt_Sprt01_RsltR.$sno1, Rqmt_Sprt01_RsltR.$sno2,
					Rqmt_Sprt01_RsltR.$sno3, Rqmt_Sprt01_RsltR.$sno4,
					Rqmt_Sprt01_RsltR.$wrk_no, Rqmt_Sprt01_RsltR.$wrk_nm
			};
			copyByPegNo(up0(), ope.down0(), Sprt01_DtlR.$peg_no2, destCols, Rqmt_Sprt01_RsltR.$peg_no, srcCols);
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR,Sprt01_DtlR> createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR() {
			return new Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR, Sprt01_DtlR>();
		}

		public class Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<D extends Rqmt_Sprt01_RsltR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Sprt01_RsltR.$peg_no, Sprt01_DtlR.$peg_no2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$strg_loc_cd, Sprt01_DtlR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$site_cd, Sprt01_DtlR.$site_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$wg_cd, Sprt01_DtlR.$wg_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$due_dt, Sprt01_DtlR.$due_dt);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno1, Sprt01_DtlR.$sno1);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno2, Sprt01_DtlR.$sno2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno3, Sprt01_DtlR.$sno3);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno4, Sprt01_DtlR.$sno4);
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * シミュレーションＭＲＰを実行する<br>
	 */
	public class Upd02 extends MSBCL_SimRqmtReg_MC_A.Upd02 {
		@Override
		protected void call() {
			setReleaseFlgCtl(false);
			super.call();
		}

		@Override
		protected void doIt() {
			callMrpUpd();
		}

		protected void callMrpUpd() {
			MSBCL_MrpExecService.MRP_Upd01 ope = MSBCL_MrpExecService.crtMRP_Upd01();
			MCList<Mrp_Upd01_DtlR> destL = MCList.create(Mrp_Upd01_DtlR.class);
			addAll(destL, up0(), createMap_Mrp_Upd01_DtlR_Upd02_DtlR());
			ope.up0().addAll(destL);
			ope.exec();
		}

		protected Map_Mrp_Upd01_DtlR_Upd02_DtlR<Mrp_Upd01_DtlR,Upd02_DtlR> createMap_Mrp_Upd01_DtlR_Upd02_DtlR() {
			return new Map_Mrp_Upd01_DtlR_Upd02_DtlR<Mrp_Upd01_DtlR, Upd02_DtlR>();
		}

		public class Map_Mrp_Upd01_DtlR_Upd02_DtlR<D extends Mrp_Upd01_DtlR, S extends Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Mrp_Upd01_DtlR.$wg_cd, Upd02_DtlR.$wg_cd);
				addColumnPathMap(Mrp_Upd01_DtlR.$sim_mrp_no, Upd02_DtlR.$sim_mrp_no);
				addColumnPathMap(Mrp_Upd01_DtlR.$sim_mrp_typ, Upd02_DtlR.$sim_mrp_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.SIM.value());
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * シミュレーション管理情報、シミュレーション日次生産依頼を登録・訂正・取消可能かチェックする<br>
	 */
	public class Chk01 extends MSBCL_SimRqmtReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_Rslt2R> notErrL = getChkUp1List();

			if (!notErrL.isEmpty()) {
				callRqmtChkSrv(notErrL);
				checkAfterSrv();
			}
			setGrpErrFlg();

			setErrToRtnStsTyp();

			setDown();
		}

		/**
		 * 日次生産依頼電文にエラーがある場合、同一シミュレーションNOの依頼の
		 * エラーフラグとシミュレーション情報のエラーフラグを設定する
		 */
		protected void setGrpErrFlg() {
			MCList<Chk01_Rslt2R>[] grpL = up1().groupList(Chk01_Rslt2R.$peg_no1);
			for (MCList<Chk01_Rslt2R> grp : grpL) {
				boolean err_flg = false;
				for (Chk01_Rslt2R r :grp) {
					if (r.err_flg()) {
						err_flg = true;
						break;
					}
				}
				if (err_flg) {
					grp.setBoolean(Chk01_Rslt2R.$err_flg, true);
					MCList<Chk01_Rslt1R> simL = up0().subList(Chk01_Rslt1R.$peg_no1, grp.get(0).peg_no1());
					simL.setBoolean(Chk01_Rslt1R.$err_flg, true);
				}
			}
		}

		/** シミュレーション上り電文にエラーがある場合、対応する日次依頼情報のエラーフラグを設定する */
		protected void setChildErrFlg(Chk01_Rslt1R simR){
			MCList<Chk01_Rslt2R> rqmtL = up1().subList(Chk01_Rslt2R.$peg_no1, simR.peg_no1());
			if (!rqmtL.isEmpty()) {
				rqmtL.setBoolean(Chk01_Rslt2R.$err_flg, true);
			}
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			msgL.addAll(updCntChkReqCmn(up1()));
			return msgL;
		}

		/**
		 * 更新カウンタチェック前の必須チェック
		 * @param up
		 * @return
		 */
		protected MCMessageList updCntChkReqCmn(MCList<Chk01_Rslt2R> up) {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_Rslt2R r : up) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(check(r, Chk01_Rslt2R.$upd_cntr, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック、排他ロック獲得
			msgL.addAll(lockAndCheckBase());

			//シミュ上り電文チェックエラー時、対応する日次依頼の上り電文のエラーを設定する。
			for(Chk01_Rslt1R r: up0()) {
				setErrFlg(r, msgL);
				if (r.err_flg()) {
					setChildErrFlg(r);
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {

			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_Rslt1R> notErrL = getChkList(up0());
			for (Chk01_Rslt1R r : notErrL) {

				// DAC更新権限チェック
				msgL.addAll(checkWritableWgCdDac(r, Chk01_Rslt1R.$wg_cd));

				// 固有チェック
				msgL.addAll(checkOther(r));
			}

			// ファイル取込の場合、下段に取り込んだデータと上段のシミュレーションＮＯと合わせるかチェック
			if (up2().file_imp_flg()) {
				msgL.addAll(checkSimRqmt());
			}

			return msgL;
		}

		/**
		 * 固有チェック
		 * 	<p>
		 * 	補完処理後に実施される
		 * 	</p>
		 * @return
		 */
		protected MCMessageList checkOther(Chk01_Rslt1R r) {
			MCMessageList msgL = new MCMessageList();

			if (!r.isStatusCreate()) {
				MST_SIM_MRP_R dbc = MST_SIM_MRP_R.create();
				MST_SIM_MRP_R t = MST_SIM_MRP_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.wg_cd);
				dbc_bldr.setWhere(t.sim_mrp_no.eq(bind("1")), r.sim_mrp_no());
				dbSelect("MSBCL0150_MST_SIM_MRP_S01", dbc, dbc_bldr);
				if (!isSame(dbc.wg_cd(),r.wg_cd())) {
					msgL.add(new MCMessage(r, Chk01_Rslt1R.$wg_cd, MSBCL0095, r.wg_cd(), dbc.wg_cd(),toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		/**
		 * ファイル取込の場合、下段に取り込んだデータと上段のシミュレーションＮＯと合わせるかチェック
		 * @return
		 */
		protected MCMessageList checkSimRqmt() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_SIM_RQMT_R> selectL = MCList.create(MST_SIM_RQMT_R.class);
			MST_SIM_RQMT_R t = MST_SIM_RQMT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.rqmt_no, t.sim_mrp_no);
			dbSelectKey("MSBCL0150_MST_SIM_RQMT_S01", selectL, selectL_bldr, up1());

			MCIndexKey idxkey = selectL.createIndex(MST_SIM_RQMT_R.$rqmt_no);
			for (Chk01_Rslt2R r : up1()) {
				if (r.isStatusModify()) {
					MST_SIM_RQMT_R selectR = selectL.getFirst(idxkey, r.rqmt_no());
					if (!isNull(selectR)) {
						if (!isSame(r.sim_mrp_no(), selectR.sim_mrp_no())) {
							msgL.add(new MCMessage(r, Chk01_Rslt1R.$wg_cd, MSBCL0096, 
									r.sim_mrp_no(), r.rqmt_no(), selectR.sim_mrp_no(), toDispGUIIndex(r)));
						}
					}
					else {
						msgL.add(new MCMessage(r, Chk01_Rslt1R.$wg_cd, MSBCL0096, 
								r.sim_mrp_no(), r.rqmt_no(), null, toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();
			MST_SIM_MRP_R _slsSimMrp = MST_SIM_MRP_R.create();
			MCList<Chk01_Rslt1R> bindL = createChk01_Rslt1L();

			for (Chk01_Rslt1R r : up0()) {
				if (!isNull(r.sim_mrp_no())) {
					dbSelectKey("MSBCL0150_MST_SIM_MRP_S02", _slsSimMrp,
							MCQueryApiBuilder.create(MST_SIM_MRP_R.create("T")), r);
					msgL.addAll(checkUpdCntrNE(r, Chk01_Rslt1R.$upd_cntr, _slsSimMrp));
					bindL.add(r);
				}
			}
			MCList<MST_SIM_MRP_R> slsSimMrpL = MCList.create(MST_SIM_MRP_R.class);
			dbSelectKeyForUpdateNoWait("MSBCL0150_MST_SIM_MRP_S03", slsSimMrpL,
					MCQueryApiBuilder.create(MST_SIM_MRP_R.create("T")), bindL);

			return msgL;
		}

		protected void callRqmtChkSrv(MCList<Chk01_Rslt2R> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Chk01 ope = MSBCL_RqmtRegService.crtRqmt_Chk01();
			addAll(ope.up0(), notErrL, createMap_Rqmt_Chk01_RsltR_Chk01_Rslt2R());
			ope.up1().file_imp_flg(up2().file_imp_flg());
			ope.exec();

			MCIndexKey idxkey = ope.down0().createIndex(Rqmt_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<Rqmt_Chk01_RsltR>> joinkey = notErrL.join(
					Chk01_Rslt2R.$peg_no2, ope.down0(), idxkey);
			join(notErrL, joinkey, createMap_Chk01_Rslt2R_Rqmt_Chk01_RsltR());
		}

		protected void checkAfterSrv() {
			if (up2().file_imp_flg()) {
				return ;
			}
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = up1().createIndex(Chk01_Rslt2R.$peg_no1);
			
			for (Chk01_Rslt1R up0R : up0()) {
				if (up0R.isStatusDelete()) {
					continue;
				}
				for (Chk01_Rslt2R up1R : up1().subList(idxkey, up0R.peg_no1())) {
					if (up1R.isStatusDelete()) {
						continue;
					}
					if (!isSame(up0R.wg_cd(), up1R.wg_cd())) {
						up1R.err_flg(true);
						msgL.add(new MCMessage(up1R, Chk01_Rslt2R.$wg_cd, MSBCL0094, up0R.wg_cd(), up1R.strg_loc_cd(), toDispGUIIndex(up1R)));
					}
				}
			}
			
			MCMessagePool.addAll(msgL);
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/** 上り電文のエラーなしリストを取得する */
		protected MCList<Chk01_Rslt2R> getChkUp1List() {
			
			MCList<Chk01_Rslt2R> l = MCList.create(Chk01_Rslt2R.class);
			MCIndexKey idx = up1().createIndex(Chk01_Rslt2R.$peg_no1);

			if (up2().file_imp_flg()) {
				return getChkList(up1());
			}
			else {
				for (Chk01_Rslt1R upR : up0()){
					MCList<Chk01_Rslt2R> up1L = up1().subList(idx, upR.peg_no1());
					up1L.setStringNE(Chk01_Rslt2R.$sim_mrp_typ, upR.sim_mrp_typ());
					if (upR.err_flg()){
						up1L.setBooleanNE(Chk01_Rslt2R.$err_flg, true);
					}
					l.addAll(up1L);
				}
				return getChkList(l);
			}
		}

		protected Map_Rqmt_Chk01_RsltR_Chk01_Rslt2R<Rqmt_Chk01_RsltR,Chk01_Rslt2R> createMap_Rqmt_Chk01_RsltR_Chk01_Rslt2R() {
			return new Map_Rqmt_Chk01_RsltR_Chk01_Rslt2R<Rqmt_Chk01_RsltR, Chk01_Rslt2R>();
		}

		public class Map_Rqmt_Chk01_RsltR_Chk01_Rslt2R<D extends Rqmt_Chk01_RsltR, S extends Chk01_Rslt2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk01_Rslt2R.$peg_no2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk01_Rslt2R.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk01_Rslt2R.$rqmt_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$due_dt, Chk01_Rslt2R.$due_dt);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_cd, Chk01_Rslt2R.$itm_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub1, Chk01_Rslt2R.$itm_sub1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub2, Chk01_Rslt2R.$itm_sub2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub3, Chk01_Rslt2R.$itm_sub3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$strg_loc_cd, Chk01_Rslt2R.$strg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_qty, Chk01_Rslt2R.$rqmt_qty);
				addColumnPathMap(Rqmt_Chk01_RsltR.$wg_cd, Chk01_Rslt1R.$wg_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno1, Chk01_Rslt2R.$sno1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno2, Chk01_Rslt2R.$sno2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno3, Chk01_Rslt2R.$sno3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno4, Chk01_Rslt2R.$sno4);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mfg_loc_cd, Chk01_Rslt2R.$mfg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sppl_cd, Chk01_Rslt2R.$sppl_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqst_loc_cd, Chk01_Rslt2R.$rqst_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_typ, Chk01_Rslt2R.$rqmt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_gnrt_typ, Chk01_Rslt2R.$rqmt_gnrt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$intr_rmrks, Chk01_Rslt2R.$intr_rmrks);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char1, Chk01_Rslt2R.$sub_char1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char2, Chk01_Rslt2R.$sub_char2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char3, Chk01_Rslt2R.$sub_char3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$upd_cntr, Chk01_Rslt2R.$upd_cntr);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sim_mrp_typ, Chk01_Rslt2R.$sim_mrp_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.SIM.value());
			}
		}

		protected Map_Chk01_Rslt2R_Rqmt_Chk01_Rslt2R<Chk01_Rslt2R,Rqmt_Chk01_RsltR> createMap_Chk01_Rslt2R_Rqmt_Chk01_RsltR() {
			return new Map_Chk01_Rslt2R_Rqmt_Chk01_Rslt2R<Chk01_Rslt2R, Rqmt_Chk01_RsltR>();
		}

		public class Map_Chk01_Rslt2R_Rqmt_Chk01_Rslt2R<D extends Chk01_Rslt2R, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_Rslt2R.$err_flg, Rqmt_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk01_Rslt1R.$err_flg, Rqmt_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk01_Rslt2R.$data_crud_typ, Rqmt_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Chk01_Rslt2R.$due_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(Chk01_Rslt2R.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_Rslt2R.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_Rslt2R.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_Rslt2R.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_Rslt2R.$itm_nm, Rqmt_Chk01_RsltR.$itm_nm);
				addColumnPathMap(Chk01_Rslt2R.$strg_loc_cd, Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Chk01_Rslt2R.$strg_loc_nm, Rqmt_Chk01_RsltR.$strg_loc_nm);
				addColumnPathMap(Chk01_Rslt2R.$site_cd, Rqmt_Chk01_RsltR.$site_cd);
				addColumnPathMap(Chk01_Rslt2R.$site_nm, Rqmt_Chk01_RsltR.$site_nm);
				addColumnPathMap(Chk01_Rslt2R.$wg_cd, Rqmt_Chk01_RsltR.$wg_cd);
				addColumnPathMap(Chk01_Rslt2R.$wg_nm, Rqmt_Chk01_RsltR.$wg_nm);
				addColumnPathMap(Chk01_Rslt2R.$strg_loc_grp_cd, Rqmt_Chk01_RsltR.$strg_loc_grp_cd);
				addColumnPathMap(Chk01_Rslt2R.$strg_loc_grp_nm, Rqmt_Chk01_RsltR.$strg_loc_grp_nm);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Chk01_Rslt2R.$unit_cd, Rqmt_Chk01_RsltR.$unit_cd);
				addColumnPathMap(Chk01_Rslt2R.$unit_nm, Rqmt_Chk01_RsltR.$unit_nm);
				addColumnPathMap(Chk01_Rslt2R.$unit_dec_place, Rqmt_Chk01_RsltR.$dec_place);
				addColumnPathMap(Chk01_Rslt2R.$mfg_loc_cd, Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Chk01_Rslt2R.$mfg_loc_nm, Rqmt_Chk01_RsltR.$mfg_loc_nm);
				addColumnPathMap(Chk01_Rslt2R.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_Rslt2R.$sppl_nm, Rqmt_Chk01_RsltR.$sppl_nm);
				addColumnPathMap(Chk01_Rslt2R.$rqst_loc_cd, Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Chk01_Rslt2R.$rqst_loc_nm, Rqmt_Chk01_RsltR.$rqst_loc_nm);
				addColumnPathMap(Chk01_Rslt2R.$rqst_wg_cd, Rqmt_Chk01_RsltR.$rqst_wg_cd);
				addColumnPathMap(Chk01_Rslt2R.$rqst_wg_nm, Rqmt_Chk01_RsltR.$rqst_wg_nm);
				addColumnPathMap(Chk01_Rslt2R.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(Chk01_Rslt2R.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(Chk01_Rslt2R.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(Chk01_Rslt2R.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(Chk01_Rslt2R.$sno1_mng_typ, Rqmt_Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_sno1_flg, Rqmt_Chk01_RsltR.$rqmt_sno1_flg);
				addColumnPathMap(Chk01_Rslt2R.$sno1_num_typ, Rqmt_Chk01_RsltR.$sno1_num_typ);
				addColumnPathMap(Chk01_Rslt2R.$sno2_mng_typ, Rqmt_Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_sno2_flg, Rqmt_Chk01_RsltR.$rqmt_sno2_flg);
				addColumnPathMap(Chk01_Rslt2R.$sno2_num_typ, Rqmt_Chk01_RsltR.$sno2_num_typ);
				addColumnPathMap(Chk01_Rslt2R.$sno3_mng_typ, Rqmt_Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_sno3_flg, Rqmt_Chk01_RsltR.$rqmt_sno3_flg);
				addColumnPathMap(Chk01_Rslt2R.$sno3_num_typ, Rqmt_Chk01_RsltR.$sno3_num_typ);
				addColumnPathMap(Chk01_Rslt2R.$sno4_mng_typ, Rqmt_Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_sno4_flg, Rqmt_Chk01_RsltR.$rqmt_sno4_flg);
				addColumnPathMap(Chk01_Rslt2R.$sno4_num_typ, Rqmt_Chk01_RsltR.$sno4_num_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_typ, Rqmt_Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(Chk01_Rslt2R.$rqmt_typ_nm, Rqmt_Chk01_RsltR.$rqmt_typ_nm);
				addColumnPathMap(Chk01_Rslt2R.$intr_rmrks, Rqmt_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Chk01_Rslt2R.$sub_char1, Rqmt_Chk01_RsltR.$sub_char1);
				addColumnPathMap(Chk01_Rslt2R.$sub_char2, Rqmt_Chk01_RsltR.$sub_char2);
				addColumnPathMap(Chk01_Rslt2R.$sub_char3, Rqmt_Chk01_RsltR.$sub_char3);
				addColumnPathMap(Chk01_Rslt2R.$upd_cntr, Rqmt_Chk01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * シミュレーション管理情報、シミュレーション日次生産依頼を登録・訂正する<br>
	 */
	public class Upd01 extends MSBCL_SimRqmtReg_MC_A.Upd01 {
		@Override
		protected void call() {
			setReleaseFlgCtl(false);
			try {
				super.call();
				handleSuccess(up0(), up1());
			}
			catch (Exception e) {
				handleEx(e, up0(), up1());
			}
			finally {
				setDown();
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_Rslt1R> l1, MCList<Chk01_Rslt2R> l2) {
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
			for (Chk01_Rslt1R r : l1) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
			for (Chk01_Rslt2R r : l2) {
				r.rqmt_rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected void handleSuccess(MCList<Chk01_Rslt1R> l1, MCList<Chk01_Rslt2R> l2) {
			dbTran().commit();
			for (Chk01_Rslt1R r : l1) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			for (Chk01_Rslt2R r : l2) {
				if (!r.err_flg()) {
					r.rqmt_rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();

			MCList<Chk01_Rslt1R> notErr1L = up0().subList(Chk01_Rslt1R.$err_flg, false);
			MCList<Chk01_Rslt2R> notErr2L = up1().subList(Chk01_Rslt1R.$err_flg, false);
			if (notErr1L.size() != 0) {
				updMain(notErr1L, notErr2L);
			}
		}

		protected void editUp() {
			setPegNo(Chk01_Rslt2R.$peg_no2, up1());

			// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
			copyPegNoAndAttr(down1(), up1());

			MCIndexKey idxKey = up0().createIndex(Chk01_Rslt1R.$peg_no1);
			for (Chk01_Rslt2R r : up1()) {
				r.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.MNL.value());
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.setStatus(MCRow.NONE);
				}
				
				Chk01_Rslt1R rslt1R = up0().getFirst(idxKey, r.peg_no1());
				if (!isNull(rslt1R)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					r.setGUIIndex(rslt1R.getGUIIndex());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_SimRqmtReg.Chk01 ope = MSBCL_SimRqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}

		protected void setDown() {
			down0().setAll(up0());

			// up1の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_Rslt2R.$peg_no1, Chk01_Rslt2R.$rqmt_no, Chk01_Rslt2R.$rqmt_rtn_sts_typ};
			copyByPegNo(down1(), up1(), Chk01_Rslt2R.$peg_no2, downCols, Chk01_Rslt2R.$peg_no2, downCols);
			
			MCIndexKey idxkey = down1().createIndex(Chk01_Rslt2R.$peg_no1);
			for (Chk01_Rslt1R down0R : down0()) {
				MCList<Chk01_Rslt2R> subL = down1().subList(idxkey, down0R.peg_no1());
				for (Chk01_Rslt2R subR : subL) {
					subR.rqmt_rtn_sts_typ(down0R.rtn_sts_typ());
				}
			}
		}

		/**
		 * 更新処理
		 * @param up
		 */
		protected void updMain(MCList<Chk01_Rslt1R> notErr1L, MCList<Chk01_Rslt2R> notErr2L) {

			MCList<MST_SIM_MRP_R> insSimMrp = MCList.create(MST_SIM_MRP_R.class);
			MCList<MST_SIM_MRP_R> updSimMrp = MCList.create(MST_SIM_MRP_R.class);
			
			MCList<MST_SIM_RQMT_R> insSimRqmt = MCList.create(MST_SIM_RQMT_R.class);
			MCList<MST_SIM_RQMT_R> updSimRqmt = MCList.create(MST_SIM_RQMT_R.class);
			MCList<MST_SIM_RQMT_R> delSimRqmt = MCList.create(MST_SIM_RQMT_R.class);
			MCIndexKey rqmtKey = notErr2L.createIndex(Chk01_Rslt2R.$peg_no1);
			MCList<Chk01_Rslt2R> rqmtL = MCList.create(Chk01_Rslt2R.class);

			notErr1L.setDateNE(Chk01_Rslt1R.$upd_dt, getToday());

			// 新規・更新で仕分ける
			for (Chk01_Rslt1R row : notErr1L) {
				boolean ins_flg = false;
				rqmtL.setAll(notErr2L.subList(rqmtKey, row.peg_no1()));
				if (row.isStatusCreate()) {
					ins_flg = true;
					updIns(row, rqmtL);
					insSimMrp.add(sim(row,ins_flg));
					for (Chk01_Rslt2R r : rqmtL) {
						insSimRqmt.add(rqmt(r,row,ins_flg));
					}
				}
				else if (row.isStatusModify()) {
					updUpd(row, rqmtL);
					updSimMrp.add(sim(row,ins_flg));
					for (Chk01_Rslt2R r : rqmtL) {
						if (r.isStatusCreate()) {
							ins_flg = true;
							insSimRqmt.add(rqmt(r,row,ins_flg));
						}
						else if (r.isStatusModify()) {
							updSimRqmt.add(rqmt(r,row,ins_flg));
						}
						else if (r.isStatusDelete()) {
							delSimRqmt.add(rqmt(r,row,ins_flg));
						}
					}
				}
			}
			MST_SIM_MRP_R updSimMrp_t = MST_SIM_MRP_R.create("T");
			MCQueryApiBuilder updSimMrp_bldr = MCQueryApiBuilder.create(updSimMrp_t);
			updSimMrp_bldr.setSet(updSimMrp_t.sim_mrp_typ,
					updSimMrp_t.sim_usr_cd,
					updSimMrp_t.intr_rmrks,
					updSimMrp_t.sub_char1,
					updSimMrp_t.sub_char2,
					updSimMrp_t.sub_char3,
					updSimMrp_t.dly_rqmt_flg,
					updSimMrp_t.gi_flg,
					updSimMrp_t.gr_flg,
					updSimMrp_t.ship_flg,
					updSimMrp_t.stk_flg,
					updSimMrp_t.tree_lvl);
			MST_SIM_RQMT_R updSimRqmt_t = MST_SIM_RQMT_R.create("T");
			MCQueryApiBuilder updSimRqmt_bldr = MCQueryApiBuilder.create(updSimRqmt_t);
			updSimRqmt_bldr.setSet(updSimRqmt_t.itm_cd,
					updSimRqmt_t.itm_sub1,
					updSimRqmt_t.itm_sub2,
					updSimRqmt_t.itm_sub3,
					updSimRqmt_t.strg_loc_cd,
					updSimRqmt_t.due_dt,
					updSimRqmt_t.rqmt_qty,
					updSimRqmt_t.mfg_loc_cd,
					updSimRqmt_t.sppl_cd,
					updSimRqmt_t.rqst_loc_cd,
					updSimRqmt_t.sno1,
					updSimRqmt_t.sno2,
					updSimRqmt_t.sno3,
					updSimRqmt_t.sno4, 
					updSimRqmt_t.rqmt_typ,
					updSimRqmt_t.intr_rmrks,
					updSimRqmt_t.sub_char1,
					updSimRqmt_t.sub_char2,
					updSimRqmt_t.sub_char3,
					updSimRqmt_t.rqmt_no);

			dbUpdateKey("MSBCL0150_MST_SIM_MRP_U01", updSimMrp, updSimMrp_bldr);
			dbInsert("MSBCL0150_MST_SIM_MRP_I01", insSimMrp,
					MCQueryApiBuilder.create(MST_SIM_MRP_R.create("T")));
			dbUpdateKey("MSBCL0150_MST_SIM_RQMT_U01", updSimRqmt, updSimRqmt_bldr);
			dbInsert("MSBCL0150_MST_SIM_RQMT_I01", insSimRqmt,
					MCQueryApiBuilder.create(MST_SIM_RQMT_R.create("T")));	
			dbDeleteKey("MSBCL0150_MST_SIM_RQMT_D01", delSimRqmt,
					MCQueryApiBuilder.create(MST_SIM_RQMT_R.create("T")));
		}

		/**
		 * シュミレーション日次生産依頼情報をDBコンテナに挿入する
		 * 
		 */
		protected MST_SIM_RQMT_R rqmt(Chk01_Rslt2R r, Chk01_Rslt1R r1, boolean ins) {
			MST_SIM_RQMT_R row = MST_SIM_RQMT_R.create();
			row.itm_cd(r.itm_cd());
			row.itm_sub1(r.itm_sub1());
			row.itm_sub2(r.itm_sub2());
			row.itm_sub3(r.itm_sub3());
			row.strg_loc_cd(r.strg_loc_cd());
			row.due_dt(r.due_dt());
			row.rqmt_qty(r.rqmt_qty());
			row.mfg_loc_cd(r.mfg_loc_cd());
			row.sppl_cd(r.sppl_cd());
			row.rqst_loc_cd(r.rqst_loc_cd());
			row.sno1(r.sno1());
			row.sno2(r.sno2());
			row.sno3(r.sno3());
			row.sno4(r.sno4());
			row.rqmt_typ(r.rqmt_typ());
			row.intr_rmrks(r.intr_rmrks());
			row.sub_char1(r.sub_char1());
			row.sub_char2(r.sub_char2());
			row.sub_char3(r.sub_char3());
			row.rqmt_no(r.rqmt_no());
			if (ins) {
				row.fix_flg(false);
				row.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.MNL.value());
				row.sim_mrp_no(r1.sim_mrp_no());
				row.wg_cd(r1.wg_cd());
			}
			return row;
		}

		/**
		 * 新規追加の処理
		 * @param insUpR
		 * @param rqmtL
		 */
		protected void updIns(Chk01_Rslt1R insUpR, MCList<Chk01_Rslt2R> rqmtL) {

			getSimMrpNo(insUpR);
			insUpR.mrp_proc_dt(null);
			rqmtL.setString(Chk01_Rslt1R.$wg_cd, insUpR.wg_cd());
			rqmtL.setString(MST_SIM_RQMT_R.$rqmt_gnrt_typ, MSC_RQMT_GNRT_TYP.MNL.value());

			doSeqCache(MSC_NUM_SYS_TYP.SIMRQMT, rqmtL.size());
			for (Chk01_Rslt2R r : rqmtL) {
				r.rqmt_no(getStrSeq(MSC_NUM_SYS_TYP.SIMRQMT));
			}
		}

		protected void getSimMrpNo(Chk01_Rslt1R insUpR) {
			ElmArgsR elm = ElmArgsR.create();
			elm.wg_cd(insUpR.wg_cd());
			elm.co_cd(getCo().co_cd());
			elm.dt(getToday());
			insUpR.sim_mrp_no(getNum(MAC_NUM_BIZ_TYP.SIMMRP, elm));
		}

		/**
		 * 更新の処理
		 * @param updUpR
		 * @param rqmtL
		 */
		protected void updUpd(Chk01_Rslt1R updUpR, MCList<Chk01_Rslt2R> rqmtL) {
			int i = 0;
			for (Chk01_Rslt2R r : rqmtL) {
				if (r.isStatusCreate()) {
					i ++;
				}
			}
			if (i != 0) {
				doSeqCache(MSC_NUM_SYS_TYP.SIMRQMT,i);
			}

			for (Chk01_Rslt2R r : rqmtL) {
				if (r.isStatusCreate()) {
					r.rqmt_no(getStrSeq(MSC_NUM_SYS_TYP.SIMRQMT));
				}
			}
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			@SuppressWarnings("unchecked")
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		@SuppressWarnings("unchecked")
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_Rslt1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Chk01_Rslt1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_Rslt1R> up0L = ((MCList<Chk01_Rslt1R>)ope.up(0));
				MCList<Chk01_Rslt2R> up1L = ((MCList<Chk01_Rslt2R>)ope.up(1));
				up0L.setAll(l);

				// ヘッダに対応する明細を設定
				MCIndexKey dtlIdx = up1().createIndex(Chk01_Rslt2R.$peg_no1);
				for (Chk01_Rslt1R rslt1R : l) {
					up1L.addAll(up1().subList(dtlIdx, rslt1R.peg_no1()));
				}
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 紐付けＮＯ１が同一の上り電文行が、同じMCListに格納されるように分割する
		 *@param list クライアントから渡された上り電文
		 *@param max １スレッドあたりの最大件数
		 *@return
		 */
		protected List<MCList<Chk01_Rslt1R>> splitUp0(MCList<Chk01_Rslt1R> list, int max) {
			List<MCList<Chk01_Rslt1R>> ret = new ArrayList<>();
			MCList<Chk01_Rslt1R> tmp = MCList.create(Chk01_Rslt1R.class);
			for (Chk01_Rslt1R r : list) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_Rslt1R.class);
				}
				tmp.add(r);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * シミュレーション管理情報、シミュレーション日次生産依頼を取り消す<br>
	 */
	public class Del01 extends MSBCL_SimRqmtReg_MC_A.Del01 {
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

		protected void setDown(){
			down0().setAll(up0());
		}

		protected void handleSuccess(MCList<Chk01_Rslt1R> l) {
			dbTran().commit();
			for (Chk01_Rslt1R r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_Rslt1R> l) {
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
			for (Chk01_Rslt1R r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {
			callThisChk01();

			MCList<Chk01_Rslt1R> notErrL = up0().subList(Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				updMain(notErrL);
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			//上り電文のステータスをDELに変更
			up0().setStatus(MCRow.DELETE);
			MSBCL_SimRqmtReg.Chk01 ope = MSBCL_SimRqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 取消処理
		 * @param up
		 */
		protected void updMain(MCList<Chk01_Rslt1R> notErrL){

			MCList<MST_SIM_MRP_R> delSimMrp = MCList.create(MST_SIM_MRP_R.class);	

			for (Chk01_Rslt1R row : notErrL) {
				delSimMrp.add(sim(row,true));
			}

			deleteSimMrp(delSimMrp);
		}

		/**
		 * シミュレーションＮＯの削除処理
		 * @param delSimMrp
		 */
		protected void deleteSimMrp(MCList<MST_SIM_MRP_R> delSimMrp){
			
			MST_SIM_RQMT_R t1 = MST_SIM_RQMT_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_RQMT_D02", t1, t1.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_ITM_ORDER_R t2 = MST_SIM_ITM_ORDER_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_ITM_ORDER_D01", t2, t2.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_OPER_ORDER_R t3 = MST_SIM_OPER_ORDER_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_OPER_ORDER_D01", t3, t3.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_ALLOC_PLN_R t4 = MST_SIM_ALLOC_PLN_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_ALLOC_PLN_D01", t4, t4.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_ITM_LNK_R t5 = MST_SIM_ITM_LNK_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_ITM_LNK_D01", t5, t5.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_MRPRQMT_R t6 = MST_SIM_MRPRQMT_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_MRPRQMT_D01", t6, t6.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			MST_SIM_IO_SCHD_R t7 = MST_SIM_IO_SCHD_R.create("T");
			execDbDelete("MSBCL0150_MST_SIM_IO_SCHD_D01", t7, t7.sim_mrp_no.eq(bind("sim_mrp_no")), delSimMrp);
			
			dbDeleteKey("MSBCL0150_MST_SIM_MRP_D01", delSimMrp,
					MCQueryApiBuilder.create(MST_SIM_MRP_R.create("T")));
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * シミュレーション日次生産依頼をファイル入力する<br>
	 */
	public class Imp01 extends MSBCL_SimRqmtReg_MC_A.Imp01 {
		@Override
		protected void call() {
			setReleaseFlgCtl(false);
			try {
				super.call();
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_Rslt2R> l) {

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
			for (Chk01_Rslt2R r : l) {
				r.rqmt_rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {
			super.doIt();
			editUp();
			callThisChk01();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_Rslt2R.$peg_no2, up0());
			up0().setValue(Chk01_Rslt2R.$rqmt_gnrt_typ, MSC_RQMT_GNRT_TYP.MNL.value());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_SimRqmtReg.Chk01 ope = MSBCL_SimRqmtReg.crtChk01();
			ope.up1().setAll(up0());
			ope.up2().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down1());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
			for (Chk01_Rslt2R r : down0()) {
				if (r.err_flg()) {
					r.rqmt_rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	/**
	 * シュミレーションNO情報をDBコンテナに挿入する
	 */
	protected MST_SIM_MRP_R sim(Chk01_Rslt1R r,boolean ins) {
		MST_SIM_MRP_R row  =MST_SIM_MRP_R.create();
		row.wg_cd(r.wg_cd());
		row.sim_mrp_typ(r.sim_mrp_typ());
		row.sim_usr_cd(r.sim_usr_cd());
		row.dly_rqmt_flg(r.dly_rqmt_flg());
		row.gi_flg(r.gi_flg());
		row.gr_flg(r.gr_flg());
		row.ship_flg(r.ship_flg());
		row.stk_flg(r.stk_flg());
		row.intr_rmrks(r.sim_mrp_intr_rmrks());
		row.sub_char1(r.sim_mrp_sub_char1());
		row.sub_char2(r.sim_mrp_sub_char2());
		row.sub_char3(r.sim_mrp_sub_char3());
		row.sim_mrp_no(r.sim_mrp_no());
		row.tree_lvl(r.tree_lvl());
		if (ins) {
			row.mrp_proc_dt(null);
		}
		return row ;
	}

	@Override
	protected void copyPegNoAndAttr(MCList dest, MCList src) {
		// レプリカにpeg_no2と電文属性を設定する
		for (int i = 0; i < src.size(); i++) {
			MCRow r = src.get(i);
			MCRow s = dest.createRow();
			s.setNumber("peg_no2", r.getNumber("peg_no2"));
			s.setAttributes(r);
			dest.add(s);
		}
	}

	/**
	 * リリースフラグ制御のオン・オフを設定します。<p>
	 * @param flg リリースフラグ制御のオン・オフ<p>
	 */
	protected void setReleaseFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		r.addStringColumn("release_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procId = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":release_flg_ctl");
	}

	//FMCB CUSTOM END
}