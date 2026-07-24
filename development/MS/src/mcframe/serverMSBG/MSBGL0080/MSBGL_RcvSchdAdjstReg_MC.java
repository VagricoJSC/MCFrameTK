package mcframe.serverMSBG.MSBGL0080;

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
import mcframe.serverMSBG.MSBGL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSBG.MSBGL0080.Query.*;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvSchdAdjstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvSchdAdjstReg_MC extends MSBGL_RcvSchdAdjstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求ヘッダ、入金予定、入金予定消込実績を検索する。<br>
	 */
	public class Srch01 extends MSBGL_RcvSchdAdjstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchBill();
			if (down0().isEmpty()) {
				return;
			}
			srchRcvSchd();
			srchRcvSchdApplAct();
		}

		/**
		 * 請求ヘッダを検索する。
		 */
		protected void srchBill() {
			executeQuery(down0(), MSBGL0080_MST_BILL_S01(), up0());
		}

		/**
		 * 入金予定を検索する。
		 */
		protected void srchRcvSchd() {
			executeQuery(down1(), MSBGL0080_MST_RCV_SCHD_S01(), down0());
		}

		/**
		 * 入金予定消込実績を検索する。
		 */
		protected void srchRcvSchdApplAct() {
			executeQuery(down2(), MSBGL0080_MST_RCV_SCHD_APPL_ACT_S01(), down0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録済みの入金予定調整を更新する前に、チェックを実行する。<br>
	 */
	public class Chk01 extends MSBGL_RcvSchdAdjstReg_MC_A.Chk01 {

		protected MST_BILL_R _billR = MST_BILL_R.create();

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
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			if (!isNull(up0().bill_mng_no())) {

				// 請求ヘッダの検索
				MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
				dbSelectKeyForUpdateNoWait("MSBGL0080_MST_BILL_S01", _billR, billR_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, _billR));
			}
			

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<Chk01_HdrR> notErrHdrL = getChkList(up0());
			if (notErrHdrL.isEmpty()) {
				return msgL;
			}
			
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrHdrL, Chk01_HdrR.$bill_dpt_cd));	
			msgL.addAll(checkSub(notErrHdrL.get(0)));

			return msgL;
		}

		protected MCMessageList checkSub(Chk01_HdrR notErrHdrR) {

			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_Dtl2R> notErrL = getChkList(up1());

			for (Chk01_Dtl2R r : notErrL.subList(MODIFY, DELETE)) {
				msgL.addAll(check(r, Chk01_Dtl2R.$rcv_schd_no, new FXUCL_RequiredValidater()));
			}
			msgL.addAll(checkAtLeastOneDtl(notErrHdrR, notErrL));
			msgL.addAll(checkDecPlace(notErrL, notErrHdrR.amt_dec_place().intValue(), Chk01_Dtl2R.$rcv_schd_amt));
			msgL.addAll(checkUnique());
			
			return msgL;
		}

		protected MCMessageList checkUnique() {

			MCMessageList msgL = new MCMessageList();

			MCList<MST_RCV_SCHD_R> rcvSchdL = srchRcvSchd();
			editRcvSchd(rcvSchdL);
			msgL.addAll(checkAmt(rcvSchdL));
			msgL.addAll(checkDuplicate(rcvSchdL));

			return msgL;
		}

		/**
		 * 入金予定を検索する。
		 * 
		 * @return
		 */
		protected MCList<MST_RCV_SCHD_R> srchRcvSchd() {

			MCList<MST_RCV_SCHD_R> rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder rcvSchdL_bldr = MCQueryApiBuilder.create(t);
			rcvSchdL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), up0().bill_mng_no());
			dbSelect("MSBGL0080_MST_RCV_SCHD_S01", rcvSchdL, rcvSchdL_bldr);

			return rcvSchdL;
		}

		/**
		 * 分割前の入金予定情報と上り電文をマージして、分割後の入金予定情報を作成する。
		 * @param rcvSchdL
		 */
		protected void editRcvSchd(MCList<MST_RCV_SCHD_R> rcvSchdL) {
			MCIndexKey idxkey = rcvSchdL.createIndex(MST_RCV_SCHD_R.$rcv_schd_no);
			
			MCList<MST_RCV_SCHD_R> addL = MCList.create(MST_RCV_SCHD_R.class);
			MCList<MST_RCV_SCHD_R> removeL = MCList.create(MST_RCV_SCHD_R.class);
			
			// 新規行6
			for (Chk01_Dtl2R up1 : up1().subList(Status.CREATE)) {
				MST_RCV_SCHD_R insR = MST_RCV_SCHD_R.create();
				copy(insR, up1, createMap_MST_RCV_SCHD_R_Chk01_Dtl2R());
				addL.add(insR);
			}
			
			//　更新行
			for (Chk01_Dtl2R up1 : up1().subList(Status.MODIFY)) {
				MST_RCV_SCHD_R updR = rcvSchdL.getFirst(idxkey, up1.rcv_schd_no());
				
				copy(updR, up1, createMap_MST_RCV_SCHD_R_Chk01_Dtl2R());
				removeL.add(updR);
				addL.add(updR);
			}
			
			//　削除行
			for (Chk01_Dtl2R up1 : up1().subList(Status.DELETE)) {
				MST_RCV_SCHD_R delR = rcvSchdL.getFirst(idxkey, up1.rcv_schd_no());
				removeL.add(delR);
			}
			
			rcvSchdL.removeAll(removeL);
			rcvSchdL.addAll(addL);
		}

		/**
		 * 分割前後で金額が同じかチェックする。
		 * @param rcvSchdL
		 * @return
		 */
		protected MCMessageList checkAmt(MCList<MST_RCV_SCHD_R> rcvSchdL) {

			MCMessageList msgL = new MCMessageList();

			if (!isSame(_billR.rcv_schd_amt(), rcvSchdL.sum(MST_RCV_SCHD_R.$rcv_schd_amt))) {
				msgL.add(new MCMessage(MSBGL0001, _billR.rcv_schd_amt(), rcvSchdL.sum(MST_RCV_SCHD_R.$rcv_schd_amt)));
			}

			return msgL;
		}

		/**
		 * 入金予定日、入金方法が同じレコードがないかチェックする。
		 * @param rcvSchdL
		 * @return
		 */
		protected MCMessageList checkDuplicate(MCList<MST_RCV_SCHD_R> rcvSchdL) {

			MCMessageList msgL = new MCMessageList();
			
			// 重複レコード抽出
			MCList<MST_RCV_SCHD_R> grpL = rcvSchdL.groupBy(MST_RCV_SCHD_R.$rcv_schd_dt, MST_RCV_SCHD_R.$rcv_mtd_cd);
			MCIndexKey idxkey = rcvSchdL.createIndex(MST_RCV_SCHD_R.$rcv_schd_dt, MST_RCV_SCHD_R.$rcv_mtd_cd);
			
			for (MST_RCV_SCHD_R r : grpL) {
				if (rcvSchdL.subList(idxkey, r.rcv_schd_dt(), r.rcv_mtd_cd()).size() > 1) {
					MST_RCV_SCHD_R dupR = rcvSchdL.getFirst(idxkey, r.rcv_schd_dt(), r.rcv_mtd_cd());
					msgL.add(new MCMessage(MSBGL0002, toYMDString(dupR.rcv_schd_dt()), dupR.rcv_mtd_cd(), toDispGUIIndex(dupR)));
				}
			}

			return msgL;
		}

		protected void setDown() {

			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}


	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録済みの入金予定調整を更新する。<br>
	 */
	public class Upd01 extends MSBGL_RcvSchdAdjstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			setPegNo(up0(), up1());
			callThisChk01();
			throwUpdErr();
			updRcvSchd();
			updArApplSchd();
			updBill();
			
		}

		protected void callThisChk01() {

			MSBGL_RcvSchdAdjstReg.Chk01 ope = MSBGL_RcvSchdAdjstReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void updRcvSchd() {

			MCList<MST_RCV_SCHD_R> ins = MCList.create(MST_RCV_SCHD_R.class);
			MCList<MST_RCV_SCHD_R> upd = MCList.create(MST_RCV_SCHD_R.class);
			MCList<MST_RCV_SCHD_R> del = MCList.create(MST_RCV_SCHD_R.class);

			doSeqCache(MSC_NUM_SYS_TYP.RCVSCHD, up1().subList(Status.CREATE).size());

			for (Chk01_Dtl2R up1 : up1()) {

				MST_RCV_SCHD_R rcvSchdR = MST_RCV_SCHD_R.create();
				rcvSchdR.bill_mng_no(up0().bill_mng_no());

				if (up1.isStatusCreate()) {

					copy(rcvSchdR, up1, createMap_MST_RCV_SCHD_R_Chk01_Dtl2R());
					ins.add(rcvSchdR);
				}

				if (up1.isStatusModify()) {

					MST_RCV_SCHD_R t1 = MST_RCV_SCHD_R.create("T");
					MCQueryApiBuilder rcvSchdR_bldr = MCQueryApiBuilder.create(t1);

					copy(rcvSchdR, up1, createMap_MST_RCV_SCHD_R_Chk01_Dtl2R());
					rcvSchdR_bldr.setSet(t1.rcv_schd_dt);
					rcvSchdR_bldr.addSet(t1.rcv_mtd_cd);
					rcvSchdR_bldr.addSet(t1.rcv_typ);
					rcvSchdR_bldr.addSet(t1.rcv_schd_amt);
					rcvSchdR_bldr.addSet(t1.rcv_schd_no);
					rcvSchdR_bldr.addSet(t1.sub_char1);
					rcvSchdR_bldr.addSet(t1.sub_char2);
					rcvSchdR_bldr.addSet(t1.sub_char3);
					upd.add(rcvSchdR);
				}
				
				
				if (up1.isStatusDelete()) {

					copy(rcvSchdR, up1, createMap_MST_RCV_SCHD_R_Chk01_Dtl2R());
					del.add(rcvSchdR);
				}
			}

			MCQueryApiBuilder ins_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
			dbInsert("MSBGL0080_MST_RCV_SCHD_I01", ins, ins_bldr);
			
			MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
			dbUpdateKey("MSBGL0080_MST_RCV_SCHD_U01", upd, upd_bldr);
			
			//源泉税以外で一番早い入金予定日を源泉税の入金予定日として更新する。
			executeUpdate(MSBGL0080_MST_RCV_SCHD_U01(),up0());

			MCQueryApiBuilder del_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_R.create("T"));
			dbDeleteKey("MSBGL0080_MST_RCV_SCHD_D01", del, del_bldr);
		}

		protected void updArApplSchd(){

			MCList<MST_RCV_SCHD_R> rcvSchdL = srchRcvSchd();
			MCList<MST_BILL_ACST_R> billAcstL = srchBillAcst();
			MST_BILL_R billR = srchBill();

			MSBGL_ArUtil.regArApplSchd(rcvSchdL, billAcstL, billR, true);
		}

		protected MCList<MST_RCV_SCHD_R> srchRcvSchd() {
			
			MCList<MST_RCV_SCHD_R> rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder rcvSchdL_bldr = MCQueryApiBuilder.create(t);

			rcvSchdL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), up0().bill_mng_no());
			dbSelect("MSBGL0080_MST_RCV_SCHD_S02", rcvSchdL, rcvSchdL_bldr);

			return rcvSchdL;
		}

		protected MCList<MST_BILL_ACST_R> srchBillAcst() {

			MCList<MST_BILL_ACST_R> billAcstL = MCList.create(MST_BILL_ACST_R.class);
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder billAcstL_bldr = MCQueryApiBuilder.create(t);

			billAcstL_bldr.setWhere(t.bill_mng_no.eq(bind("1")), up0().bill_mng_no());
			dbSelect("MSBGL0080_MST_BILL_ACST_S01", billAcstL, billAcstL_bldr);

			return billAcstL;
		}

		protected MST_BILL_R srchBill() {

			MST_BILL_R billR = MST_BILL_R.create();
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));

			dbSelectKey("MSBGL0080_MST_BILL_S02", billR, billR_bldr, up0().bill_mng_no());

			return billR;
		}

		protected void updBill(){

			MST_BILL_R billR = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(t);

			billR.bill_mng_no(up0().bill_mng_no());
			billR.rcv_schd_adjst_flg(up0().rcv_schd_adjst_flg());
			billR_bldr.setSet(t.rcv_schd_adjst_flg);
			dbUpdateKey("MSBGL0080_MST_BILL_U01", billR, billR_bldr);
		}
		
		
	}

	protected Map_MST_RCV_SCHD_R_Chk01_Dtl2R<MST_RCV_SCHD_R,Chk01_Dtl2R> createMap_MST_RCV_SCHD_R_Chk01_Dtl2R() {
		return new Map_MST_RCV_SCHD_R_Chk01_Dtl2R<MST_RCV_SCHD_R, Chk01_Dtl2R>();
	}

	public class Map_MST_RCV_SCHD_R_Chk01_Dtl2R<D extends MST_RCV_SCHD_R, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_RCV_SCHD_R.$rcv_schd_dt, Chk01_Dtl2R.$rcv_schd_dt);
			addColumnPathMap(MST_RCV_SCHD_R.$rcv_mtd_cd, Chk01_Dtl2R.$rcv_cd);
			addColumnPathMap(MST_RCV_SCHD_R.$rcv_typ, Chk01_Dtl2R.$rcv_typ);
			addColumnPathMap(MST_RCV_SCHD_R.$rcv_schd_amt, Chk01_Dtl2R.$rcv_schd_amt);
			addColumnPathMap(MST_RCV_SCHD_R.$rcv_schd_no, Chk01_Dtl2R.$rcv_schd_no);
			addColumnPathMap(MST_RCV_SCHD_R.$sub_char1, Chk01_Dtl2R.$sub_char1);
			addColumnPathMap(MST_RCV_SCHD_R.$sub_char2, Chk01_Dtl2R.$sub_char2);
			addColumnPathMap(MST_RCV_SCHD_R.$sub_char3, Chk01_Dtl2R.$sub_char3);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.isStatusCreate()) {
				dest.rcv_schd_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHD));
			}
		}
	}

	//FMCB CUSTOM END
}