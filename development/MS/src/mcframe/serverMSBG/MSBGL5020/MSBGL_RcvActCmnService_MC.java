package mcframe.serverMSBG.MSBGL5020;

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
import mcframe.serverMSBG.MSBGL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL5010.*;
import mcframe.serverMSBG.MSBGL5050.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBG.MSBGL5090.*;
import mcframe.serverMSBG.MSBGL5100.*;
import mcframe.serverMSBG.MSBGL5110.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverMSUC.MSUCL0130.MSUCL_AmtUtil;
import static mcframe.serverMSBG.MSBGL5020.Query.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvActCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvActCmnService_MC extends MSBGL_RcvActCmnService_MC_A{
	//FMCB CUSTOM START
	
	protected static final Class<MSBGL_RcvActCmnService> CLAZZ = MSBGL_RcvActCmnService.class;

	/**
	 * 入金実績情報のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_RCV_ACT_R> _rcvActCache = null;

	/**
	 * 入金実績情報をキャッシュする
	 * 
	 * l 上り電文
	 * @return キャッシュ情報
	 */
	protected static FXUCL_MCDbcCache<MST_RCV_ACT_R> initRcvActCache(MCList<RcvActCmn_Chk01_HdrR> l) {
		return object(CLAZZ)._initRcvActCache(l);
	}
	protected FXUCL_MCDbcCache<MST_RCV_ACT_R> _initRcvActCache(MCList<RcvActCmn_Chk01_HdrR> l) {
		if (_rcvActCache == null) {
			MCList<MST_RCV_ACT_R> dbcL = MCList.create(MST_RCV_ACT_R.class);
			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			setSelectRcvAct(dbcL, t, dbcL_bldr);
			addJoinRcvAct(dbcL, t, dbcL_bldr);
			_rcvActCache = new FXUCL_MCDbcCache<MST_RCV_ACT_R>(dbcL, dbcL_bldr, l,
					RcvActCmn_Chk01_HdrR.$rcv_act_no, RcvActCmn_Chk01_HdrR.$rcv_act_seq);
		}
		return _rcvActCache;
	}
	protected static FXUCL_MCDbcCache<MST_RCV_ACT_R> getRcvActCache() {
		return object(CLAZZ)._rcvActCache;
	}

	/** 
	 * Select句追加 
	 * @param t 
	 * @param dbcL_bldr */
	protected void setSelectRcvAct(MCList<MST_RCV_ACT_R> dbcL, MST_RCV_ACT_R t, MCQueryApiBuilder dbcL_bldr) {
		MST_NOTE_R t2 = MST_NOTE_R.create("T2");
		dbcL.addBooleanColumn("mat_flg");
		dbcL_bldr.addSelect(t2.mat_flg);
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$subttl1);
		dbcL_bldr.addSelect(value(0).subtract(t.subttl1).as("subttl1"));
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$subttl2);
		dbcL_bldr.addSelect(value(0).subtract(t.subttl2).as("subttl2"));
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$subttl3);
		dbcL_bldr.addSelect(value(0).subtract(t.subttl3).as("subttl3"));
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$base_cur_subttl1);
		dbcL_bldr.addSelect(value(0).subtract(t.base_cur_subttl1).as("base_cur_subttl1"));
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$base_cur_subttl2);
		dbcL_bldr.addSelect(value(0).subtract(t.base_cur_subttl2).as("base_cur_subttl2"));
		dbcL_bldr.removeSelect(MST_RCV_ACT_R.$base_cur_subttl3);
		dbcL_bldr.addSelect(value(0).subtract(t.base_cur_subttl3).as("base_cur_subttl3"));
	}

	/** Where句追加 
	 * @param t 
	 * @param dbcL_bldr */
	protected void addJoinRcvAct(MCList<MST_RCV_ACT_R> dbcL, MST_RCV_ACT_R t, MCQueryApiBuilder dbcL_bldr) {
		MST_NOTE_R t2 = MST_NOTE_R.create("T2");
		MST_RCV_R t3 = MST_RCV_R.create("T3");
		dbcL_bldr.addLeftOuterJoin(t2, t.note_mng_no.eq(t2.note_mng_no));
		dbcL_bldr.addLeftOuterJoin(t3, t.rcv_no.eq(t3.rcv_no));
	}

	/**
	 * RcvActCmn_Chk01オペレーション.<p>
	 *
	 * 前受仮受登録、売掛消込登録から入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Chk01 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// トラン情報のキャッシュ
			initRcvActCache(up0());

			for (RcvActCmn_Chk01_HdrR hdrR : up0()) {
				checkMain(hdrR, up1().subList(RcvActCmn_Chk01_DtlR.$hdr_dtl_peg, hdrR.hdr_dtl_peg()));
				down0().add(hdrR);
			}
		}

		/**
		 * チェック処理<br />
		 * 上り電文のチェックを行う
		 * 
		 * @param hdrR
		 * @param dtlL
		 */
		protected void checkMain(RcvActCmn_Chk01_HdrR hdrR, MCList<RcvActCmn_Chk01_DtlR> dtlL) {

			// 更新、取消の場合
			if (isCanOrUpd(hdrR.data_crud_typ())) {
				// 取消データを検索してキャッシュする
				MST_RCV_ACT_R canRcvActR = getRcvActCache().get(hdrR.rcv_act_no(), hdrR.rcv_act_seq());

				// 取消データのチェック
				if (checkCanRcvAct(canRcvActR)) {
					return;
				}

				// 入金データのチェック
				checkRcv(canRcvActR.trd_ptn_typ(), canRcvActR.rcv_no());

				// 手形データのチェック
				checkNote(canRcvActR.ar_sttl_typ1(), canRcvActR.note_no());

				// 取引パタンのチェック
				checkTrdPtnTyp(canRcvActR.trd_ptn_typ());
			}
			// 更新、新規の場合
			if (isUpdOrCrt(hdrR.data_crud_typ())) {

				// 入金データのチェック
				checkRcv(hdrR.trd_ptn_typ(), hdrR.rcv_no());

				// 手形データのチェック
				checkNote(hdrR.ar_sttl_typ1(), hdrR.note_no());

				// 取引パタンのチェック
				checkTrdPtnTyp(hdrR.trd_ptn_typ());
			}
			// 計上日チェック
			checkAcDt(hdrR, dtlL);
		}

		/**
		 * 取消入金実績のチェック<br />
		 * 取消データの存在チェック、状態チェックを行う
		 * 
		 * @param delRcvActR 取消入金実績
		 */
		protected boolean checkCanRcvAct(MST_RCV_ACT_R delRcvActR) {
			// 更新、取消データの存在チェック
			if (delRcvActR.isEmpty()) {
				MCMessagePool.add(new MCMessage(MSBGL0049));
				return true;
			}

			// 更新、取消データの状態チェック（ステータスが新規以外はエラー）
			if (!MAC_SLIP_STS_TYP.isCRT(delRcvActR.slip_sts_typ())) {
				MCMessagePool.add(new MCMessage(MSBGL0050));
				return true;
			}

			// 更新、取消データの状態チェック（消込済の場合エラー）
			if (MAC_TRD_PTN_TYP.isRCV_ADV(delRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isRCV_SUSP(delRcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(delRcvActR.trd_ptn_typ())) {
				MST_RCV_R rcvR = MST_RCV_R.create("T");
				MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
				rcvR_bldr.setSelect(sum(rcvR.rcv_proc_amt).as("sum_rcv_proc_amt"));
				rcvR_bldr.setWhere(rcvR.src_rcv_act_no.eq(bind("rcv_act_no")));
				rcvR_bldr.addWhereWithAnd(rcvR.src_rcv_act_seq.eq(bind("rcv_act_seq")));
				dbSelect("MSBGL5020_MST_RCV_S01", rcvR, rcvR_bldr, delRcvActR);
				
				if (!rcvR.getNumber("sum_rcv_proc_amt").isZero()) {
					MCMessagePool.add(new MCMessage(MSBGL0051));
					return true;
				}
			}
			return false;
		}

		/**
		 * 入金チェック
		 * 更新する入金データのチェックを行う
		 * 
		 * @param trdPtnTyp 取引パタン区分
		 * @param rcvNo 入金ＮＯ
		 */
		protected void checkRcv(String trdPtnTyp, String rcvNo) {

			if (isNull(rcvNo)) {
				return;
			}

			MST_RCV_R rcvR = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
			MST_NOTE_R t2 = MST_NOTE_R.create("T2");
			rcvR_bldr.setSelect(rcvR.rcv_no, rcvR.dat_typ, t2.note_mng_no);
			rcvR_bldr.addWhereWithAnd(rcvR.rcv_no.eq(bind("rcv_no")));
			rcvR_bldr.addLeftOuterJoin(t2, rcvR.note_mng_no.eq(t2.note_mng_no));
			rcvR_bldr.setLockTable(rcvR.rcv_no);

			MCRow cndR = MCRow.create();
			cndR.addStringColumn("rcv_no", rcvNo);
			
			if (dbSelectForUpdateNoWait("MSBGL5020_MST_RCV_S02",
					rcvR, rcvR_bldr, cndR) == 0) {
				MCMessagePool.add(new MCMessage(MSBGL0055));
			}
			
			lockNote(rcvR);
			
			// 取引区分と入金情報の整合性チェック
			// 売掛消込（売上代金入金）の場合、入金の入金情報が使用できる
			if (MAC_TRD_PTN_TYP.isRCV_AR(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isRCV(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0056));
				}
			}
			// 前受金入金の場合、入金の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isRCV(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0057));
				}
			}
			// 前受仮受登録（仮受金入金）の場合、入金の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isRCV(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0058));
				}
			}
			// 売掛消込（前受金相殺）の場合、前受の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isADV(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0059));
				}
			}
			// 仮受金相殺（売掛金）の場合、仮受の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isSUSP(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0060));
				}
			}
			// 仮受金その他相殺の場合、仮受の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isSUSP(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0061));
				}
			}
			// 前受金その他相殺の場合、前受の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isADV(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0062));
				}
			}
			// 仮受金相殺（前受）の場合、仮受の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isSUSP(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0063));
				}
			}
			// その他勘定売掛金相殺の場合、買掛金相殺の入金情報が使用できる
			else if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)) {
				if (!MSC_RCV_DAT_TYP.isAP(rcvR.dat_typ())) {
					MCMessagePool.add(new MCMessage(MSBGL0064));
				}
			}
			// その他
			else {
				MCMessagePool.add(new MCMessage(MSBGL0065));
			}
		}
		
		protected void lockNote(MST_RCV_R rcvR) {
			if (!isNull(rcvR.note_mng_no())) {
				MST_NOTE_R t = MST_NOTE_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
				builder.setSelect(t.note_mng_no);
				builder.setWhere(t.note_mng_no.eq(bind("1")), rcvR.note_mng_no());
				dbSelectForUpdateNoFetch("MSBGL5020_MST_NOTE_S01", builder);
			}
		}

		/**
		 * 手形チェック<br />
		 * 手形データのチェックを行う
		 * 
		 * @param arSttlTyp 債権決済区分
		 * @param noteNo 手形番号
		 */
		protected void checkNote(String arSttlTyp, String noteNo) {
			if (!MAC_AR_STTL_TYP.isNOTE(arSttlTyp)) {
				return;
			}
			if (isNull(noteNo)) {
				MCMessagePool.add(new MCMessage(MSBGL0066));
			}
		}

		/**
		 * 使用可能な取引区分であるかをチェック
		 * 
		 * @param trdPtnTyp 取引パタン区分
		 */
		protected void checkTrdPtnTyp(String trdPtnTyp) {

			if(!(isArApplTrdPtnTyp(trdPtnTyp) || isAdvSuspTrdPtnTyp(trdPtnTyp))){
				MCMessagePool.add(new MCMessage(MSBGL0045));
			}
		}

		/**
		 * 前受仮受登録画面で使用する取引区分の場合、true。それ以外はfalse
		 * 
		 * @param trdPtnTyp 取引パタン区分
		 * @return 判定結果
		 */
		protected boolean isAdvSuspTrdPtnTyp(String trdPtnTyp) {

			if (MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp) 
					|| MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)) {
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * 計上日の締日チェック<br />
		 * 計上日、取消計上日が締められている場合はエラーとする
		 * 
		 * @param hdrR ヘッダ情報
		 * @param dtlL 明細情報
		 */
		protected void checkAcDt(RcvActCmn_Chk01_HdrR hdrR,
				MCList<RcvActCmn_Chk01_DtlR> dtlL) {

			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();

			// 前受仮受登録
			if (dtlL.isEmpty()) {
				Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
				cndR.peg_no(hdrR.peg_no());
				cndR.ac_dt(hdrR.ac_dt());
				cndR.can_ac_dt(hdrR.can_ac_dt());
				cndR.rcv_cls_chk_flg(true);
				op.up0().add(cndR);
			}
			// 売掛消込登録
			else {
				MCList<RcvActCmn_Chk01_DtlR> groupL = dtlL.groupBy(getAcstGroupByPolicy());
				// 変更前の売掛先ＣＤを取得
				MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
				MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
				MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(t);
				rcvActDL_bldr.setSelect(t.acst_cd);
				dbSelectKey("MSBGL5020_MST_RCV_ACT_D_S01", rcvActDL, rcvActDL_bldr, groupL);

				MCIndexKey idxkey = rcvActDL.createIndex(MST_RCV_ACT_D_R.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_seq);

				Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
				cndR.peg_no(hdrR.peg_no());
				cndR.ac_dt(hdrR.ac_dt());
				cndR.can_ac_dt(hdrR.can_ac_dt());
				cndR.rcv_cls_chk_flg(true);
				op.up0().add(cndR);

				// 明細単位に締処理提供サービスの上り電文を設定
				for (RcvActCmn_Chk01_DtlR dtlR : groupL) {
					Cl_Chk03_CndBpR cndBpR = Cl_Chk03_CndBpR.create();
					cndBpR.bp_cd(dtlR.acst_cd());
					MST_RCV_ACT_D_R rcvActDR = rcvActDL.getFirst(
							idxkey, dtlR.rcv_act_d_no(), dtlR.rcv_act_d_seq());
					if (!isNull(rcvActDR)) {
						cndBpR.old_bp_cd(rcvActDR.acst_cd());
					}
					op.up2().add(cndBpR);
				}
			}
			op.exec();
		}

		protected MCGroupByPolicy getAcstGroupByPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(RcvActCmn_Chk01_DtlR.$acst_cd);
			gp.max(RcvActCmn_Chk01_DtlR.$rcv_act_d_no, RcvActCmn_Chk01_DtlR.$rcv_act_d_seq);
			return gp;
		}
	}

	/**
	 * RcvActCmn_Chk02オペレーション.<p>
	 *
	 * 請求残高振替の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Chk02 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 債権決済区分チェック
			MCMessagePool.addAll(checkArSttlTyp());

			for (RcvActCmn_Chk02_HdrR hdrR : up0()) {

				MCList<RcvActCmn_Chk02_SwToR> swToL =
						up1().subList(RcvActCmn_Chk02_SwToR.$hdr_dtl_peg,
								hdrR.hdr_dtl_peg());

				MCList<RcvActCmn_Chk02_SwFrR> swFrL =
						up2().subList(RcvActCmn_Chk02_SwFrR.$hdr_dtl_peg,
								hdrR.hdr_dtl_peg());

				checkAcDt(hdrR, swToL, swFrL);

				// 下り電文の設定
				down0().add(hdrR);
				down1().addAll(swToL);
				down2().addAll(swFrL);
			}
		}

		/**
		 * 債権決済区分チェック<br />
		 * 振替の債権決済区分に対応する決済方法ＣＤが取得できない場合エラーとする
		 * 
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkArSttlTyp() {
			MCMessageList msgL = new MCMessageList();
			if (MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.SW.value()).isEmpty()) {
				msgL.add(new MCMessage(MSBGL0028));
			}
			return msgL;
		}
	}

	/**
	 * RcvActCmn_Chk03オペレーション.<p>
	 *
	 * 未請求残高振替の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Chk03 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			for (RcvActCmn_Chk03_HdrR hdrR : up0()) {
				MCList<RcvActCmn_Chk03_SwToR> swToL =
						up1().subList(RcvActCmn_Chk03_SwToR.$hdr_dtl_peg,
								hdrR.hdr_dtl_peg());

				MCList<RcvActCmn_Chk03_SwFrR> swFrL =
						up2().subList(RcvActCmn_Chk03_SwFrR.$hdr_dtl_peg,
								hdrR.hdr_dtl_peg());

				checkAcDt(hdrR, swToL, swFrL);

				// 下り電文の設定
				down0().add(hdrR);
				down1().addAll(swToL);
				down2().addAll(swFrL);
			}
		}
	}

	/**
	 * 計上日の締日チェック<br />
	 * 計上日が締められている場合はエラーとする
	 * 
	 * @param hdrR ヘッダ情報
	 * @param swToL 振替先情報
	 * @param swFrL 振替元情報
	 */
	protected void checkAcDt(MCRow hdrR, MCList<?> swToL, MCList<?> swFrL) {

		MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();

		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
		MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
		billDL.addStringColumn("acst_cd");
		billDL_bldr.setSelect(t.bill_d_no);
		billDL_bldr.addSelect(t2.acst_cd);
		billDL_bldr.addInnerJoin(t2, bracket( t.bill_acst_no.eq(t2.bill_acst_no)));
		dbSelectKey("MSBGL5020_MST_BILL_D_S01", billDL, billDL_bldr, swFrL);
		MCList<MST_BILL_D_R> groupL = billDL.groupBy(getAcstGroupByPolicy());
		MCIndexKey idxkey = groupL.createIndex(MST_BILL_D_R.$bill_d_no);

		Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
		cndR.peg_no(0);
		cndR.ac_dt(hdrR.getDate("ac_dt"));
		cndR.rcv_cls_chk_flg(true);
		op.up0().add(cndR);

		// 振替元
		for (MCRow swFrR : swFrL) {
			MST_BILL_D_R billDR = groupL.getFirst(idxkey, swFrR.getString("bill_d_no"));
			if (isNull(billDR)) {
				continue;
			}
			Cl_Chk03_CndBpR cndBpR = Cl_Chk03_CndBpR.create();
			cndBpR.bp_cd(billDR.getString("acst_cd"));
			op.up2().add(cndBpR);
		}
		// 振替先
		for (MCRow swToR : swToL) {
			MST_BILL_D_R billDR = groupL.getFirst("acst_cd", swToR.getString("acst_cd"));
			if (!isNull(billDR)) {
				continue;
			}
			Cl_Chk03_CndBpR cndBpR = Cl_Chk03_CndBpR.create();
			cndBpR.bp_cd(swToR.getString("acst_cd"));
			op.up2().add(cndBpR);
		}
		op.exec();
	}

	protected MCGroupByPolicy getAcstGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy("acst_cd");
		gp.max("bill_d_no");
		return gp;
	}

	/**
	 * RcvActCmn_Chk04オペレーション.<p>
	 *
	 * 消費税差額調整の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Chk04 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// カスタマイズ用
		}
	}

	/**
	 * RcvActCmn_Chk05オペレーション.<p>
	 *
	 * 消費税差額調整の入金実績を取消する共通処理<br>
	 */
	public class RcvActCmn_Chk05 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Chk05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// カスタマイズ用
		}
	}

	/**
	 * RcvActCmn_Upd01オペレーション.<p>
	 *
	 * 前受仮受登録、売掛消込登録から入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Upd01 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Upd01 {
		/**
		 * 同一インボイスで売掛予定消込の金額、基準通貨額、為替差損益の集計値を格納したリスト
		 */
		protected MCList<RcvActD_InfoR> _sameIvRcvActL = null;
		/**
		 * 同一インボイスで売掛予定消込の金額、基準通貨額、為替差損益の集計値を格納
		 */
		protected RcvActD_InfoR _sameIvRcvActR = null;
		
		protected MCList<RcvActCmn_Upd01_BillDApplActR> _applRecL = null;
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
		protected void initBpCache(MCList<RcvActCmn_Chk01_DtlR> bcstCdL) {
			MAM_BP_R bpR = MAM_BP_R.create("BP");
			MCQueryApiBuilder bpBldr = MCQueryApiBuilder.create(bpR);
			bpBldr.setSelect(bpR.bp_cd);
			bpBldr.addSelect(bpR.auto_line_appl_flg);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpBldr,
					bcstCdL.groupBy(RcvActCmn_Chk01_DtlR.$bcst_cd),
					RcvActCmn_Chk01_DtlR.$bcst_cd);
		}
		
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {
			initBpCache(up1());
			for (RcvActCmn_Chk01_HdrR hdrR : up0()) {
				execMain(hdrR, up1().subList(RcvActCmn_Chk01_HdrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg()));
			}
		}

		/**
		 * メイン処理実行<br />
		 * 上り電文のヘッダ単位にメイン処理を実行する
		 * 
		 * @param hdrR 上り電文ヘッダ情報
		 * @param dtlL 上り電文明細情報
		 */
		protected void execMain(RcvActCmn_Chk01_HdrR hdrR, MCList<RcvActCmn_Chk01_DtlR> dtlL) {

			RcvAct_InfoR delRcvActInfoR = RcvAct_InfoR.create();

			if (isCanOrUpd(hdrR.data_crud_typ())) {
				MST_RCV_ACT_R delRcvActR = getRcvActCache().get(hdrR.rcv_act_no(), hdrR.rcv_act_seq());
				copy(delRcvActInfoR, delRcvActR, createMap_RcvAct_InfoR_MST_RCV_ACT_R());
			}

			MCList<MST_RCV_ACT_D_R> delRcvActDL = getDelRcvActD(hdrR);

			RcvAct_InfoR hR = createHdrInfo(hdrR);
			RcvAct_BaseR baseR = createRcvActBase(hR, delRcvActInfoR);

			MCList<MST_RCV_ACT_D_R> rcvActDL = null;

			if (isCanOrUpd(hdrR.data_crud_typ())) {
				baseR.setDateNE("dis_ac_dt", delRcvActInfoR.ac_dt());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					baseR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$dpt_cd), hdrR.dpt_cd());
					baseR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$wg_cd), hdrR.wg_cd());
					baseR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$bd_dpt_cd), hdrR.bd_dpt_cd());
					baseR.setDateNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$ac_dt), hdrR.ac_dt());
				}
				MCList<MST_RCV_ACT_D_R> oldRcvActDL = delRcvActDL.clone();
				delRcvAct(baseR, delRcvActInfoR, delRcvActDL);
				prepPrnt(baseR.rcv_act_no(), baseR.can_rcv_act_seq());
				setBillDApplAct(hdrR, dtlL, delRcvActInfoR, oldRcvActDL);
			}
			if (isUpdOrCrt(hdrR.data_crud_typ())) {
				MCList<RcvActD_InfoR> dL = createDtlInfo(dtlL);
				setAmt(hR, dL);
				setBillIvNo(dL);
				rcvActDL = createRcvAct(baseR, hR, dL, up2());
				prepPrnt(baseR.rcv_act_no(), baseR.rcv_act_seq());
			}

			execRcvActIfCrt(delRcvActDL, rcvActDL);

			prnt(hdrR);

			addAll(down0(), rcvActDL, createMap_RcvActD());

			MCRow.copyall(down1(), baseR);
		}
		/**
		 * 請求ヘッダ用のインボイスＮＯを設定する
		 */
		protected void setBillIvNo(MCList<RcvActD_InfoR> dL) {
			MCList<MST_BILL_R> dbc = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.bill_mng_no, t.bill_each_sls_flg);
			dbc_bldr.setWhere(t.bill_mng_no.eq(bind("tgt_rcv_bill_mng_no")));
			dbSelect("MSBGL5020_MST_BILL_S01", dbc, dbc_bldr, dL);
			
			MCIndexKey idx = dbc.createIndex(MST_BILL_R.$bill_mng_no);
			for (RcvActD_InfoR dR : dL) {
				MST_BILL_R billR = dbc.getFirst(idx, dR.tgt_rcv_bill_mng_no());
				if (!isNull(billR) && billR.bill_each_sls_flg()) {
					dR.bill_iv_no(dR.iv_no());
				}
			}
		}

		/**
		 * 取消対象の入金実績明細を取得する
		 * 
		 * @param hdrR 上り電文ヘッダ情報
		 * @return 取消対象の入金実績明細情報
		 */
		protected MCList<MST_RCV_ACT_D_R> getDelRcvActD(RcvActCmn_Chk01_HdrR hdrR) {

			if (isCanOrUpd(hdrR.data_crud_typ())) {
				MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
				MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
				MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(t);
				rcvActDL_bldr.setWhere(t.rcv_act_no.eq(bind("rcv_act_no")));
				rcvActDL_bldr.addWhereWithAnd(t.rcv_act_seq.eq(bind("rcv_act_seq")));
				dbSelect("MSBGL5020_MST_RCV_ACT_D_S02", rcvActDL, rcvActDL_bldr, hdrR);
				return rcvActDL;
			}
			else {
				return null;
			}
		}

		/**
		 * 上り電文からヘッダ情報を作成
		 * 
		 * @param hdrR ヘッダ情報
		 * @return
		 */
		protected RcvAct_InfoR createHdrInfo(RcvActCmn_Chk01_HdrR hdrR) {
			
			RcvAct_InfoR hR = RcvAct_InfoR.create();
			copy(hR, hdrR, createMap_RcvAct_InfoR_RcvActCmn_Chk01_HdrR());
			setHeaderInfo(hR);
			
			return hR;
		}

		MSBGL_ArSlipPrntService.ArSlip_Prnt01 _prnt01 =
				MSBGL_ArSlipPrntService.crtArSlip_Prnt01();

		/**
		 * 帳票フォームごとに印刷処理の準備をする
		 * 
		 * @param rcvActNo 入金実績ＮＯ
		 * @param rcvActSeq 入金実績連番
		 */
		protected void prepPrnt(String rcvActNo, MCNumber rcvActSeq) {
			// 債権伝票発行サービスの上り電文を設定する
			ArSlip_Prnt01_HdrR hdrR = ArSlip_Prnt01_HdrR.create();
			hdrR.rcv_act_no(rcvActNo);
			hdrR.rcv_act_seq(rcvActSeq);
			_prnt01.up0().add(hdrR);
		}

		/**
		 * prepPrntで準備した条件で印刷処理を実行する
		 * 
		 * @param hdrR ヘッダ情報
		 */
		protected void prnt(RcvActCmn_Chk01_HdrR hdrR) {

			// 入金自動消込の場合は印刷を行わない
			if (isPrnt(hdrR)) {
				return;
			}
			if (!_prnt01.up0().isEmpty()) {
				_prnt01.exec();
			}
		}

		/**
		 * 帳票の印刷を行うか判定する
		 * 
		 * @param hdrR ヘッダ情報
		 * @return 入金自動消込ＦＬＧ
		 */
		protected boolean isPrnt(RcvActCmn_Chk01_HdrR hdrR) {
			return hdrR.rcv_auto_appl_flg();
		}

		// MST_RCV_ACT_D_R → RcvActCmn_Chk01_DtlR
		protected Map_RcvActD<RcvActCmn_Chk01_DtlR, MST_RCV_ACT_D_R> createMap_RcvActD() {
			return new Map_RcvActD<RcvActCmn_Chk01_DtlR, MST_RCV_ACT_D_R>();
		}
		public class Map_RcvActD<D extends RcvActCmn_Chk01_DtlR, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_no, MST_RCV_ACT_D_R.$gen_rcv_no);
				addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_no);
				addColumnPathMap(RcvActCmn_Chk01_DtlR.$rcv_act_d_seq, MST_RCV_ACT_D_R.$rcv_act_d_seq);
			}
		}

		/**
		 * ヘッダ情報への追加設定
		 * 
		 * @param hR ヘッダ情報
		 */
		protected void setHeaderInfo(RcvAct_InfoR hR) {
			if (!isNull(hR.note_mng_no())) {
				MST_NOTE_R noteR = MST_NOTE_R.create("T");
				MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(noteR);
				noteR_bldr.setSelect(noteR.mat_flg);
				noteR.note_mng_no(hR.note_mng_no());
				dbSelectKey("MSBGL5020_MST_NOTE_S02", noteR, noteR_bldr, noteR);
				hR.mat_flg(noteR.mat_flg());
			}
		}

		/**
		 * 入金実績の基本情報（元実績、取消実績、新規実績）を作成する
		 * 
		 * @param hR 実績の基本ヘッダ情報
		 * @param delRcvActInfoR 削除対象実績情報
		 * @return 実績基本情報
		 */
		protected RcvAct_BaseR createRcvActBase(RcvAct_InfoR hR, RcvAct_InfoR delRcvActInfoR) {

			RcvAct_BaseR baseR = RcvAct_BaseR.create();
			baseR.setAttributes(hR);

			// 更新・取消
			if (MAC_DATA_CRUD_TYP.isUPD(hR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hR.data_crud_typ())) {
				baseR.rcv_act_no(delRcvActInfoR.rcv_act_no());
				baseR.rcv_act_seq(delRcvActInfoR.rcv_act_seq());
				baseR.old_rcv_act_seq(delRcvActInfoR.rcv_act_seq());
				baseR.old_rcv_act_rev(delRcvActInfoR.rcv_act_rev());
				baseR.can_rcv_act_seq(delRcvActInfoR.rcv_act_seq().add(1));
				baseR.can_rcv_act_rev(delRcvActInfoR.rcv_act_rev());
				baseR.can_ac_dt(hR.can_ac_dt());
				baseR.can_ac_ym(getAcYm(hR.can_ac_dt()));
				baseR.can_trd_cd(delRcvActInfoR.trd_cd());
			}
			// 新規・更新
			if (MAC_DATA_CRUD_TYP.isCRT(hR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(hR.data_crud_typ())) {
				if (MAC_DATA_CRUD_TYP.isCRT(hR.data_crud_typ())) {
					String rcvActNo = getRcvActNo(hR.dpt_cd(), hR.wg_cd(), hR.ac_dt(), hR.trd_cd());
					baseR.rcv_act_no(rcvActNo);
					baseR.rcv_act_seq(1);
					baseR.rcv_act_rev(1);
				}
				else {
					baseR.rcv_act_no(hR.rcv_act_no());
					baseR.rcv_act_seq(baseR.can_rcv_act_seq().add(1));
					baseR.rcv_act_rev(baseR.can_rcv_act_rev().add(1));
				}
				baseR.ac_ym(hR.ac_ym());
			}
			return baseR;
		}

		/**
		 * 上り電文から明細情報を作成
		 * 
		 * @param dtlL 上り電文（明細）
		 * @return 明細情報
		 */
		protected MCList<RcvActD_InfoR> createDtlInfo(MCList<RcvActCmn_Chk01_DtlR> dtlL) {
			MCList<RcvActD_InfoR> dL = MCList.create(RcvActD_InfoR.class);
			addAll(dL, dtlL, createMap_RcvActD_InfoR_RcvActCmn_Chk01_DtlR());
			return dL;
		}

		/**
		 * 入金実績、入金実績明細の金額を設定する<p>
		 * 引数のコンテナに下記の金額を設定する<br>
		 * 金額、消費税額、基準金額、基準消費税額
		 * 
		 * @param hR ヘッダ情報
		 * @param dL 明細情報
		 */
		protected void setAmt(RcvAct_InfoR hR, MCList<RcvActD_InfoR> dL) {

			// 仮受金・前受金の相殺により残高がゼロになる場合、仮受金・前受金の基準通貨金額の調整（以下）を行う。
			// 入金時の基準通貨金額と、相殺時の基準通貨金額合計に差額が発生していた場合、差額分を今回の実績の基準通貨金額
			// で調整する。今回の実績が複数明細の場合、差額を基準通貨金額の割合で割り振る。
			// また、為替差損益の計算において調整分の基準通貨金額も考慮するために、相殺の基準通貨金額を調整した後で為替差損益の計算を行う。
			MCNumber ttlAmt1 = dL.sum(RcvActD_InfoR.$amt1);
			boolean isAdjust = false;
			MST_RCV_R rcvR = MST_RCV_R.create();
			if (!isSame(getBaseCur().cur_cd(), hR.trd_cur_cd())) {
				// 仮受金を分割している場合を考慮して、以下の入金情報の未処理残高を取得して判定する
				// ・今回対象の入金に分割元入金ＮＯが設定されている場合、その分割元入金ＮＯが、
				//  入金ＮＯ、分割元入金ＮＯに設定されているデータの未処理残高の合計
				// ・今回対象の入金に分割元入金ＮＯが設定されていない場合、今回対象の入金ＮＯが、
				//  入金ＮＯ、分割元入金ＮＯに設定されているデータの未処理残高の合計
				rcvR = getRcvR(hR.rcv_no());
				MCNumber notProcBalSum = getNotProcBalSum(isNull(rcvR.div_src_rcv_no()) ? hR.rcv_no() : rcvR.div_src_rcv_no());
				
				isAdjust = isComplAppl(rcvR, ttlAmt1, notProcBalSum);
			}
			_sameIvRcvActL = MCList.create(RcvActD_InfoR.class);
			_sameIvRcvActL.addNumberColumn("sum_amt");
			_sameIvRcvActL.addNumberColumn("sum_base_cur_amt");
			_sameIvRcvActL.addNumberColumn("sum_exc_gain_loss");
			for (RcvActD_InfoR dR : dL) {
				// 明細の金額設定
				setAmt(dR, hR, isAdjust);
			}
			if (isAdjust) {
				MCNumber bcurTtlAmt1 = dL.sum(RcvActD_InfoR.$base_cur_amt1);
				MCNumber adjustAmt = getDiffBcurAmt(rcvR, hR, bcurTtlAmt1, ttlAmt1);
				if (!adjustAmt.isZero()) {
					FXUCC_Divide.prop(dL, adjustAmt, getBaseCur().amt_dec_place().intValue(), "base_cur_amt1", "base_cur_amt1_add");
				}
				else {
					dL.setNumberNE("base_cur_amt1_add", MCNumber.ZERO);
				}
				for (RcvActD_InfoR dR : dL) {
					// CUL_Divide.propの結果を反映する
					dR.base_cur_amt1(dR.base_cur_amt1().add(dR.getNumberNE("base_cur_amt1_add")));
					// 為替差損益
					setXchngGl(dR, hR);
				}
			}

			// 明細単位消費税額の合計とヘッダ単位で計算した場合の消費税額に差異がある場合の調整
			adjustTaxAmt(hR, dL);

			// ヘッダの金額設定
			RcvActD_InfoR sumR = getSum(dL);
			hR.amt(MCNumber.sum(sumR.amt1(), sumR.amt2(), sumR.amt3()));
			hR.subttl1(sumR.amt1());
			hR.subttl2(sumR.amt2());
			hR.subttl3(sumR.amt3());
			hR.tax_amt(MCNumber.sum(sumR.tax_amt1(), sumR.tax_amt2(), sumR.tax_amt3()));
			hR.tax_subttl1(sumR.tax_amt1());
			hR.tax_subttl2(sumR.tax_amt2());
			hR.tax_subttl3(sumR.tax_amt3());
			hR.base_cur_amt(MCNumber.sum(sumR.base_cur_amt1(), sumR.base_cur_amt2(),sumR.base_cur_amt3()));
			hR.base_cur_subttl1(sumR.base_cur_amt1());
			hR.base_cur_subttl2(sumR.base_cur_amt2());
			hR.base_cur_subttl3(sumR.base_cur_amt3());
			hR.base_cur_tax_amt(MCNumber.sum(sumR.base_cur_tax_amt1(), sumR.base_cur_tax_amt2(),sumR.base_cur_tax_amt3()));
			hR.base_cur_tax_subttl1(sumR.base_cur_tax_amt1());
			hR.base_cur_tax_subttl2(sumR.base_cur_tax_amt2());
			hR.base_cur_tax_subttl3(sumR.base_cur_tax_amt3());

			// 与信を更新する場合に与信管理先を設定
			if (reqUpdCred(hR)) {
				hR.cred_cd(MSBGL_ArUtil.getBp(hR.bcst_cd()).ar_cred_cd());
			}
		}

		protected void setAmt(RcvActD_InfoR dR, RcvAct_InfoR hR, boolean isAdjust) {

			dR.amt1(nvl(dR.amt1(), MCNumber.ZERO));
			dR.amt2(nvl(dR.amt2(), MCNumber.ZERO));
			dR.amt3(nvl(dR.amt3(), MCNumber.ZERO));
			setTaxAmt(dR, hR);
			dR.tax_amt1(nvl(dR.tax_amt1(), MCNumber.ZERO));
			dR.tax_amt2(nvl(dR.tax_amt2(), MCNumber.ZERO));
			dR.tax_amt3(nvl(dR.tax_amt3(), MCNumber.ZERO));
			setBaseCurAmt(dR, hR);
			dR.base_cur_tax_amt1(nvl(dR.base_cur_tax_amt1(), MCNumber.ZERO));
			dR.base_cur_tax_amt2(nvl(dR.base_cur_tax_amt2(), MCNumber.ZERO));
			dR.base_cur_tax_amt3(nvl(dR.base_cur_tax_amt3(), MCNumber.ZERO));
			if (!isAdjust) {
				setXchngGl(dR, hR);
			}
		}

		/**
		 * 明細の税額合計（金額１，２，３それぞれ）と、実績単位で計算した税額（金額１，２，３それぞれ）に<br>
		 * 差異が発生する場合、明細の金額が最も大きいレコードの税額に差額を加算する。
		 * 
		 * @param hR ヘッダ情報
		 * @param dL 明細情報
		 */
		protected void adjustTaxAmt(RcvAct_InfoR hR, MCList<RcvActD_InfoR> dL) {

			MCNumber tax1 = dL.sum(RcvActD_InfoR.$tax_amt1);
			MCNumber tax2 = dL.sum(RcvActD_InfoR.$tax_amt2);
			MCNumber tax3 = dL.sum(RcvActD_InfoR.$tax_amt3);

			MCNumber amt1 = dL.sum(RcvActD_InfoR.$amt1);
			MCNumber amt2 = dL.sum(RcvActD_InfoR.$amt2);
			MCNumber amt3 = dL.sum(RcvActD_InfoR.$amt3);

			MCNumber diff1 = isNullOr(tax1, hR.tax_rate1()) ?
					MCNumber.ZERO :
					getTaxAmt(amt1, hR.tax_rate1(), hR.trd_cur_cd()).subtract(tax1);
			MCNumber diff2 = isNullOr(tax2, hR.tax_rate2()) ?
					MCNumber.ZERO :
					getTaxAmt(amt2, hR.tax_rate2(), hR.trd_cur_cd()).subtract(tax2);
			MCNumber diff3 = isNullOr(tax3, hR.tax_rate3()) ?
					MCNumber.ZERO :
					getTaxAmt(amt3, hR.tax_rate3(), hR.trd_cur_cd()).subtract(tax3);

			MCNumber amtDecPlace = getBaseCur().amt_dec_place();
			String rndMode = getCo().xrate_rnd_typ();
			if (!diff1.isZero()) {
				RcvActD_InfoR dR = getAdjustRow(RcvActD_InfoR.$amt1, diff1, dL);
				dR.tax_amt1(dR.tax_amt1().add(diff1));
				dR.base_cur_tax_amt1(convToBaseCur(dR.tax_amt1(), hR.xrate(), amtDecPlace, rndMode));
			}
			if (!diff2.isZero()) {
				RcvActD_InfoR dR = getAdjustRow(RcvActD_InfoR.$amt2, diff2, dL);
				dR.tax_amt2(dR.tax_amt2().add(diff2));
				dR.base_cur_tax_amt2(convToBaseCur(dR.tax_amt2(), hR.xrate(), amtDecPlace, rndMode));
			}
			if (!diff3.isZero()) {
				RcvActD_InfoR dR = getAdjustRow(RcvActD_InfoR.$amt3, diff3, dL);
				dR.tax_amt3(dR.tax_amt3().add(diff3));
				dR.base_cur_tax_amt3(convToBaseCur(dR.tax_amt3(), hR.xrate(), amtDecPlace, rndMode));
			}
		}

		/**
		 * 消費税の調整額を載せる明細行を取得する
		 * 
		 * @param numberColumn 金額カラム名
		 * @param diff 差額
		 * @param dL 明細リスト
		 * @return 消費税の調整額を載せる明細行
		 */
		protected RcvActD_InfoR getAdjustRow(String numberColumn, MCNumber diff, MCList<RcvActD_InfoR> dL) {

			MCRowMatcher<RcvActD_InfoR> m = createAmtIsNotZeroMatcher(numberColumn);
			MCList<RcvActD_InfoR> notZeroL = dL.subList(m);

			// 差額が正の場合、明細の金額が最大の行、差額が負の場合、明細の金額が最小の行に調整額を載せる
			MCNumber tgtAmt = diff.isPositive() ?
					(MCNumber) notZeroL.max(numberColumn) :
					(MCNumber) notZeroL.min(numberColumn);

			return notZeroL.getFirst(numberColumn, tgtAmt);
		}

		protected MCRowMatcher<RcvActD_InfoR> createAmtIsNotZeroMatcher(String numberColumn) {

			return new AmtIsNotZeroMatcher<RcvActD_InfoR>(numberColumn);
		}

		/**
		 * 明細の金額が0以外の行を返す
		 */
		public class AmtIsNotZeroMatcher<T extends RcvActD_InfoR> implements MCRowMatcher<T> {

			protected String _numberColumn = null;

			public AmtIsNotZeroMatcher(String numberColumn) {
				_numberColumn = numberColumn;
			}

			@Override
			public boolean match(T row) {

				if (row.getNumberNE(_numberColumn).isZero()) {
					return false;
				}
				return true;
			}
		}

		/**
		 * 明細の金額を合計した結果を返す
		 * 
		 * @param dL 合計対象の明細
		 * @return 合計金額が設定されたコンテナ（金額以外は全てnull）
		 */
		protected RcvActD_InfoR getSum(MCList<RcvActD_InfoR> dL) {

			MCGroupByPolicy gp = new MCGroupByPolicy();

			gp.sum(
					RcvActD_InfoR.$amt1,
					RcvActD_InfoR.$amt2,
					RcvActD_InfoR.$amt3,
					RcvActD_InfoR.$base_cur_amt1,
					RcvActD_InfoR.$base_cur_amt2,
					RcvActD_InfoR.$base_cur_amt3,
					RcvActD_InfoR.$tax_amt1,
					RcvActD_InfoR.$tax_amt2,
					RcvActD_InfoR.$tax_amt3,
					RcvActD_InfoR.$base_cur_tax_amt1,
					RcvActD_InfoR.$base_cur_tax_amt2,
					RcvActD_InfoR.$base_cur_tax_amt3);

			RcvActD_InfoR sumR = dL.groupBy(gp).get(0);

			return sumR;

		}

		/**
		 * 税金額を設定する
		 * 
		 * @param dR 明細情報（設定対象のコンテナ）
		 * @param hR ヘッダ情報
		 */
		protected void setTaxAmt(RcvActD_InfoR dR, RcvAct_InfoR hR) {
			if (!isNull(hR.ar_sttl_cd1())) {
				dR.tax_amt1(getTaxAmt(dR.amt1(), hR.tax_rate1(), hR.trd_cur_cd()));
			}
			if (!isNull(hR.ar_sttl_cd2())) {
				dR.tax_amt2(getTaxAmt(dR.amt2(), hR.tax_rate2(), hR.trd_cur_cd()));
			}
			if (!isNull(hR.ar_sttl_cd3())) {
				dR.tax_amt3(getTaxAmt(dR.amt3(), hR.tax_rate3(), hR.trd_cur_cd()));
			}
		}

		/**
		 * 税込み金額から税額を計算する
		 * 
		 * @param incTaxAmt 消費税込み金額
		 * @param taxRate 消費税率
		 * @param curCd 通貨コード
		 * @return 消費税額
		 */
		protected MCNumber getTaxAmt(MCNumber incTaxAmt, MCNumber taxRate, String curCd) {

			MCNumber ret = MAUCL_AmtUtil.getIncTaxAmt(incTaxAmt, taxRate,
					MSBGL_ArUtil.getCur(curCd).amt_dec_place(), getCo().setoff_tax_rnd_typ());

			return ret;
		}

		/**
		 * 基準通貨換算した金額を設定する
		 * 
		 * @param dR 明細情報（設定対象のコンテナ）
		 * @param hR ヘッダ情報
		 */
		protected void setBaseCurAmt(RcvActD_InfoR dR, RcvAct_InfoR hR) {

			MCNumber amtDecPlace = getBaseCur().amt_dec_place();
			String rndMode = getCo().xrate_rnd_typ();
			
			convToBaseCur(dR.amt1(), hR.xrate(), amtDecPlace, rndMode);
			
			dR.base_cur_amt1(convToBaseCur(dR.amt1(), hR.xrate(), amtDecPlace, rndMode));
			dR.base_cur_amt2(convToBaseCur(dR.amt2(), hR.xrate(), amtDecPlace, rndMode));
			dR.base_cur_amt3(convToBaseCur(dR.amt3(), hR.xrate(), amtDecPlace, rndMode));

			dR.base_cur_tax_amt1(convToBaseCur(dR.tax_amt1(), hR.xrate(), amtDecPlace, rndMode));
			dR.base_cur_tax_amt2(convToBaseCur(dR.tax_amt2(), hR.xrate(), amtDecPlace, rndMode));
			dR.base_cur_tax_amt3(convToBaseCur(dR.tax_amt3(), hR.xrate(), amtDecPlace, rndMode));
		}

		/**
		 * 為替差損益を設定する
		 * 
		 * @param dR 明細情報（設定対象のコンテナ）
		 * @param hR ヘッダ情報
		 */
		protected void setXchngGl(RcvActD_InfoR dR, RcvAct_InfoR hR) {

			if (!reqCalcXchngGl(hR)) {
				dR.trd_xrate(hR.xrate());
				dR.exc_gain_loss(MCNumber.ZERO);
				return;
			}

			String[] keys = {
					RcvActD_InfoR.$iv_no, RcvActD_InfoR.$acst_cd, RcvActD_InfoR.$ar_typ, RcvActD_InfoR.$ar_dpt_cd, RcvActD_InfoR.$wrk_no
			};
			Comparable<?>[] vals = {
					dR.iv_no(), dR.acst_cd(), dR.ar_typ(), dR.ar_dpt_cd(), dR.wrk_no()
			};
			
			_sameIvRcvActR = _sameIvRcvActL.getFirst(keys, vals);
			if (isNull(_sameIvRcvActR)) {
				_sameIvRcvActR = RcvActD_InfoR.create();
				_sameIvRcvActR.setValuesByName(dR, keys);
				_sameIvRcvActR.addNumberColumn("sum_amt", MCNumber.ZERO);
				_sameIvRcvActR.addNumberColumn("sum_base_cur_amt", MCNumber.ZERO);
				_sameIvRcvActR.addNumberColumn("sum_exc_gain_loss", MCNumber.ZERO);
				_sameIvRcvActL.add(_sameIvRcvActR);
			}
						
			MCNumber slsXrate = MSBGL_ArUtil.getXrate(dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ(), null);

			boolean isCalcXchngReq = isApplBalZero(dR, hR);

			// 売上時の為替レートと入金時の為替レートが同じ場合は為替差損益を0として処理終了
			// ただし今回の消込で未消込残高が0になる場合は端数の調整を行うので後続の処理を行う
			if (hR.xrate().eq(slsXrate) && !isCalcXchngReq) {
				dR.trd_xrate(hR.xrate());
				dR.exc_gain_loss(MCNumber.ZERO);
				sumTempDtlAmt(dR);
				return;
			}

			MCNumber amtDecPlace = getBaseCur().amt_dec_place();
			String rndMode = getCo().xrate_rnd_typ();
			
			// 取引時点の為替レートでの換算金額取得
			MCNumber trdAmt1 = convToBaseCur(sum(dR.amt1(), dR.amt2(), dR.amt3()),
					slsXrate, amtDecPlace, rndMode);
			MCNumber trdAmt2 = convToBaseCur(sum(dR.amt1(), dR.amt2(), dR.amt3()),
					hR.xrate(), amtDecPlace, rndMode);

			// 為替差損益の計算、調整を行う
			// 今回発生する為替差損益は以下の計算式で求める
			// 売掛消込時点の為替レートでの換算金額 － 取引時点の為替レートでの換算金額（差益がプラス）
			MCNumber gl = calcXchngGl(dR, hR, trdAmt2.subtract(trdAmt1), isCalcXchngReq);
			if (hR.xrate().eq(slsXrate)
					&& (MAC_TRD_PTN_TYP.isRCV_AR(hR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(hR.trd_ptn_typ()))) {
				// 売上時と入金時の為替レートが同じ場合、為替差損益を作成せず、基準通貨額で調整する
				if (!dR.base_cur_amt1().isZero()) {
					dR.base_cur_amt1(dR.base_cur_amt1().subtract(gl));
				}
				else {
					dR.base_cur_amt2(dR.base_cur_amt2().subtract(gl));
				}
			}
			else {
				// 仮受金相殺、前受金相殺の場合、
				// 前受金・仮受金の基準通貨金額と、前受金・仮受金相殺の基準通貨金額の合計の差を為替差損益として計上する
				dR.exc_gain_loss(gl);
				if (isCrtExcGainLoss4Rev(dR)) {
					dR.setNumberNE("slsXrate",
						MSBGL_ArUtil.srchSlsXrate(
							dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ(), null));
					
					MST_AR_XRATE_REV_HIS_R hisXrateR =
						MSBGL_ArUtil.srchXrateHis(
							dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ());
					dR.setNumberNE("new_xrate", hisXrateR.new_xrate());
					dR.setStringNE(MST_AR_XRATE_REV_HIS_R.$ar_xrate_rev_his_no, hisXrateR.ar_xrate_rev_his_no());
					
					dR.setBooleanNE("isCalcXchngReq", isCalcXchngReq);
				}
			}
			dR.trd_xrate(slsXrate);

			sumTempDtlAmt(dR);
		}
		
		protected void sumTempDtlAmt(RcvActD_InfoR dR) {
			_sameIvRcvActR.setValueNE("sum_amt", sum(_sameIvRcvActR.getNumberNE("sum_amt"), dR.amt1(), dR.amt2(), dR.amt3()));
			_sameIvRcvActR.setValueNE("sum_base_cur_amt",
					sum(_sameIvRcvActR.getNumberNE("sum_base_cur_amt"), dR.base_cur_amt1(), dR.base_cur_amt2(), dR.base_cur_amt3()));
			_sameIvRcvActR.setValueNE("sum_exc_gain_loss", sum(_sameIvRcvActR.getNumberNE("sum_exc_gain_loss"), dR.exc_gain_loss()));
		}

		protected boolean isCrtExcGainLoss4Rev(MCRow dR) {
			return
				!isNull(dR.getNumberNE("xrateRevHisGainLoss"))
					&&  !dR.getNumberNE("xrateRevHisGainLoss").isZero();
		}

		/**
		 * 為替差損益トランの為替差損益に登録する値を計算する。<BR>
		 * ・今回の消込で未消込残高が0になる場合<BR>
		 * 今回発生した為替差損益に以下の１と２の差額を加算した金額を返す。<BR>
		 * １．売上の基準通貨金額の合計
		 * ２．入金時の基準通貨金額合計（今回の入金額含む） － 為替差損益合計（今回の為替差損益含む）
		 * （消込対象のインボイスの未消込残高が0になるタイミングで１、２の金額に差額が発生
		 * する場合がある。１、２の差額を未消込残高が0になる際の為替差損益項目で調整する。<BR>
		 * その為、今回の為替差損益にセットされる値は、今回発生した為替差損益に調整金額を<BR>
		 * 加算した合計となる。）<BR>
		 * 
		 * ・今回の消込で未消込残高が0になる場合以外<BR>
		 * 今回入金額から発生した為替差損益をそのまま返す。
		 * @param dR 明細情報
		 * @param hR ヘッダ情報
		 * @param xchng_gl 今回発生した為替差損益
		 * @param isCalcXchngReq 為替差損益調整をする場合、<tt>true</tt>、しない場合、<tt>false</tt>
		 */
		protected MCNumber calcXchngGl(RcvActD_InfoR dR, RcvAct_InfoR hR,
				MCNumber xchng_gl, boolean isCalcXchngReq) {
			dR.setNumberNE("xrateRevHisGainLoss", getXrateRevHisGainLoss(dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ()));

			if (isCalcXchngReq) {
				MCList<MST_RCV_ACT_D_R> rcvActDL =
						getRcvActDL(dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ());
					dR.setNumberNE("sumAmt", rcvActDL.sum("amt"));
					
					MCList<MST_AR_EXC_GAIN_LOSS_R> gainLossL = getArGainLossL4RcvAct(rcvActDL);
					dR.setNumberNE("rcvActGainLoss",
						nvl(gainLossL.sum(MST_AR_EXC_GAIN_LOSS_R.$exc_gain_loss), MCNumber.ZERO));
					dR.setNumberNE("xrateRevHisGainLossRcvAct",
						nvl(gainLossL.subList(r -> !isNull(r.ref_ar_xrate_rev_his_no()))
								.sum(MST_AR_EXC_GAIN_LOSS_R.$exc_gain_loss), MCNumber.ZERO));
				
				MCNumber bcurSlsAmt = getBaseCurSlsAmt(dR.acst_cd(), dR.ar_dpt_cd(), hR.trd_cur_cd(), dR.iv_no(), dR.wrk_no(), dR.ar_typ());
				MCNumber bcurRcvAmt = getBaseCurRcvAmtForUpd01(dR, hR, xchng_gl);
				return xchng_gl.add(bcurRcvAmt.subtract(bcurSlsAmt));
			}

			return xchng_gl;
		}

		/**
		 * 今回消込対象となるインボイスの未消込額が0になる時点での<BR>
		 * 基準通貨入金額合計 - 為替差損益合計 <BR>
		 * を取得する
		 * @param dR 明細情報
		 * @param hR ヘッダ情報
		 * @param xchng_gl 今回発生した為替差損益
		 * @return
		 */
		protected MCNumber getBaseCurRcvAmtForUpd01(RcvActD_InfoR dR, RcvAct_InfoR hR, MCNumber xchng_gl) {
			return   MCNumber.sum(
					dR.getNumberNE("sumAmt"),
					dR.getNumberNE("rcvActGainLoss").negate(),
					dR.getNumberNE("xrateRevHisGainLoss").negate(),
					dR.base_cur_amt1(),
					dR.base_cur_amt2(),
					dR.base_cur_amt3(),
					xchng_gl.negate(),
					nvl(_sameIvRcvActR.getNumberNE("sum_base_cur_amt"), MCNumber.ZERO),
					nvl(_sameIvRcvActR.getNumberNE("sum_exc_gain_loss"), MCNumber.ZERO).negate());
		}
		
		/**
		 * 為替差損益の計算が必要かどうか
		 * 
		 * @param hR ヘッダ情報
		 * @return 為替差損益の計算が必要な場合に true
		 */
		protected boolean reqCalcXchngGl(RcvAct_InfoR hR) {

			if (isSame(getBaseCur().cur_cd(), hR.trd_cur_cd())) {
				return false;
			}

			// 売掛消込に関連する取引区分
			if (MAC_TRD_PTN_TYP.isRCV_AR(hR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(hR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(hR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(hR.trd_ptn_typ())) {
				return true;
			}

			return false;
		}

		/**
		 * インボイス毎に今回の消込で未消込残高が0になる場合<tt>true</tt>、それ以外は<tt>false</tt>を返す。
		 * 
		 * @param dR 明細情報
		 * @param hR ヘッダ情報
		 * @return 判定結果
		 */
		protected boolean isApplBalZero(RcvActD_InfoR dR, RcvAct_InfoR hR) {
			MST_AR_APPL_SCHD_R arApplSchdR = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder arApplSchdR_bldr = MCQueryApiBuilder.create(arApplSchdR);
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			MST_BILL_R t3 = MST_BILL_R.create("T3");
			arApplSchdR_bldr.setSelect(arApplSchdR.iv_no);
			arApplSchdR_bldr.addSum(arApplSchdR.not_appl_bal, "sum_not_appl_bal");
			arApplSchdR_bldr.addGroupBy(arApplSchdR.iv_no);
			arApplSchdR_bldr.setWhere(arApplSchdR.iv_no.eq(bind("1")), dR.iv_no());
			arApplSchdR_bldr.addInnerJoin(t2, bracket( arApplSchdR.bill_acst_no.eq(t2.bill_acst_no)));
			arApplSchdR_bldr.addInnerJoin(t3, bracket( t2.bill_mng_no.eq(t3.bill_mng_no)));
			arApplSchdR_bldr.addWhereWithAnd(t3.trd_cur_cd.eq(bind("1")), hR.trd_cur_cd());
			arApplSchdR_bldr.addWhereWithAnd(t2.acst_cd.eq(bind("1")), dR.acst_cd());
			arApplSchdR_bldr.addWhereWithAnd(arApplSchdR.ar_typ.eq(bind("1")), dR.ar_typ());
			arApplSchdR_bldr.addWhereWithAnd(t2.ar_dpt_cd.eq(bind("1")), dR.ar_dpt_cd());
			arApplSchdR_bldr.addWhereWithAnd(bracket(t3.wrk_no.eq(bind("1"))
					.or(t3.wrk_no.isNull())
					.and(bind("1").isNull())), dR.wrk_no());
			dbSelect("MSBGL5020_MST_AR_APPL_SCHD_S01", arApplSchdR, arApplSchdR_bldr);

			if (isSame(arApplSchdR.getNumber("sum_not_appl_bal"),
					MCNumber.sum(dR.amt1(), dR.amt2(), dR.amt3(), _sameIvRcvActR.getNumber("sum_amt")))) {
				return true;
			}

			return false;
		}

		/**
		 * 新規入金実績の作成<br />
		 * 入金情報を登録した場合は入金ＮＯをセットした入金実績明細を返す<br>
		 * 入金情報を登録しない場合は入金ＮＯはnullのまま返す
		 * 
		 * @param baseR ベース情報
		 * @param hR 入金実績ヘッダ情報
		 * @param dL 入金実績明細情報
		 * @param billDL 請求明細情報
		 * @return 入金実績明細
		 */
		protected MCList<MST_RCV_ACT_D_R> createRcvAct(RcvAct_BaseR baseR,
				RcvAct_InfoR hR, MCList<RcvActD_InfoR> dL, MCList<RcvActCmn_Upd01_BillDR> billDL) {

			execComProc(hR, dL);

			Object[] o = insNewRcvAct(baseR, hR, dL);
			MST_RCV_ACT_R rcvActR = (MST_RCV_ACT_R) o[0];
			MCList<MST_RCV_ACT_D_R> rcvActDL = (MCList<MST_RCV_ACT_D_R>) o[1];

			if (reqCreateRcv(hR.trd_ptn_typ())) {
				insRcv(rcvActR, rcvActDL, hR);
			}
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ()) ||
					MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ())) {
				// 本メソッドでは入金実績以外は更新しない
			}
			else {
				insNote(hR, rcvActR);
				insArExcGainLoss(rcvActDL);
				insArApplAct(rcvActR, rcvActDL);
				insRcvSchdApplAct(rcvActR, rcvActDL);
				execArCmnForCrt(rcvActR, rcvActDL);
				execArDtlApplRegForCrt(hR, rcvActDL, billDL);
			}
			return rcvActDL;
		}

		/**
		 * 入金実績に対応する入金情報を追加する<br>
		 * 同時に入金実績明細の発生入金ＮＯに追加した入金ＮＯを設定する
		 * 
		 * @param rcvActR 実績ヘッダ
		 * @param rcvActDL 実績明細
		 * @param hR ヘッダ情報
		 */
		protected void insRcv(MST_RCV_ACT_R rcvActR, MCList<MST_RCV_ACT_D_R> rcvActDL,
				RcvAct_InfoR hR) {

			MCList<MST_RCV_R> advL = createRcvForAdv(rcvActR, rcvActDL, hR);
			MCQueryApiBuilder advL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_I01", advL, advL_bldr);
			
			MCList<MST_RCV_ACT_D_R> updL = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R updL_t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
			updL_bldr.setSetVL(updL_t.gen_rcv_no, bindEx("gen_rcv_no"));
			updL_bldr.setWhere(updL_t.rcv_act_d_no.eq(bindEx("rcv_act_d_no")));
			updL_bldr.addWhereWithAnd(updL_t.rcv_act_d_seq.eq(bindEx("rcv_act_d_seq")));

			for (MST_RCV_R advR : advL) {
				MST_RCV_ACT_D_R updR = MST_RCV_ACT_D_R.create();
				updR.gen_rcv_no(advR.rcv_no());
				updR.rcv_act_d_no(advR.src_rcv_act_d_no());
				updR.rcv_act_d_seq(advR.src_rcv_act_d_seq());
				updL.add(updR);
			}

			dbUpdate("MSBGL5020_MST_RCV_ACT_D_U01", updL, updL_bldr);
		}

		/**
		 * 明細消込処理の実行<br />
		 * 売掛明細消込サービスを呼び出す<br>
		 * 自動明細消込対象の場合は自動明細消込を呼び出す
		 * 
		 * @param hR ヘッダ情報
		 * @param rcvActDL 入金実績明細情報
		 * @param billDL 請求明細情報
		 */
		protected void execArDtlApplRegForCrt(RcvAct_InfoR hR,
				MCList<MST_RCV_ACT_D_R> rcvActDL,
				MCList<RcvActCmn_Upd01_BillDR> billDL) {

			// 入金自動明細消込サービス
			MSBGL_ArDtlApplService.ArDtlAppl_Upd02 op = MSBGL_ArDtlApplService.crtArDtlAppl_Upd02();
			MCIndexKey key = null;
			
			if (!isNull(billDL)) {
				key = billDL.createIndex(RcvActCmn_Upd01_BillDR.$grp_seq);
			}

			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {

				if (!isNull(billDL)) {

					MCList<RcvActCmn_Upd01_BillDR> tgtBillDL =
							billDL.subList(key, rcvActDR.getNumber(RcvActCmn_Upd01_BillDR.$grp_seq));

					if (!tgtBillDL.isEmpty()) {
						tgtBillDL.setString(RcvActCmn_Upd01_BillDR.$rcv_act_no, rcvActDR.rcv_act_no());
						tgtBillDL.setNumber(RcvActCmn_Upd01_BillDR.$rcv_act_seq, rcvActDR.rcv_act_seq());
						tgtBillDL.setString(RcvActCmn_Upd01_BillDR.$rcv_act_d_no, rcvActDR.rcv_act_d_no());
						tgtBillDL.setNumber(RcvActCmn_Upd01_BillDR.$rcv_act_d_seq, rcvActDR.rcv_act_d_seq());
						up_UPD01_c0_0(c0_up0, tgtBillDL);
						c0_up0.setBoolean("ar_appl_flg", true);
						c0.exec();
						c0_up0.clear();
						continue;
					}
				}

				MAM_BP_R bpR = _bpCache.get(rcvActDR.bcst_cd());
				if (bpR.auto_line_appl_flg()) {
					ArDtlAppl_Upd02_DtlR up0R = ArDtlAppl_Upd02_DtlR.create();
					up0R.rcv_act_d_no(rcvActDR.rcv_act_d_no());
					up0R.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
					up0R.appl_tgt_amt(MCNumber.sum(
							rcvActDR.trd_cur_amt1(),
							rcvActDR.trd_cur_amt2(),
							rcvActDR.trd_cur_amt3()
							));
					op.up0().add(up0R);
				}
			}
			if (!op.up0().isEmpty()) {
				op.exec();
			}
		}

		/**
		 * 入金実績ＩＦ作成サービスの実行<br />
		 * 入金実績に登録した情報をもとに入金実績ＩＦ作成サービスを呼び出す
		 * 
		 * @param delRcvActDL
		 * @param rcvActDL
		 */
		protected void execRcvActIfCrt(MCList<MST_RCV_ACT_D_R> delRcvActDL,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {
			
			MCList<MST_RCV_ACT_D_R> tgtL = MCList.create(MST_RCV_ACT_D_R.class);
			tgtL.addAll(delRcvActDL);
			tgtL.addAll(rcvActDL);
			
			MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 op = MSBGL_RcvActIfCrtService.crtRcvActIfCrt_Ins01();
			for (MST_RCV_ACT_D_R rcvActDR : tgtL) {
				RcvActIfCrt_Ins01_CndR cndR = RcvActIfCrt_Ins01_CndR.create();
				cndR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
				cndR.rcv_act_d_seq(nvl(rcvActDR.getNumberNE("can_rcv_act_d_seq"), rcvActDR.rcv_act_d_seq()));
				op.up0().add(cndR);
			}
			op.exec();
		}

		/**
		 * 新規の前受で発生する入金情報を作成する
		 * 
		 * @param rcvActR 入金実績情報
		 * @param rcvActDL 入金実績明細情報
		 * @param hR ヘッダ情報
		 * @return 前受で発生する入金情報
		 */
		protected MCList<MST_RCV_R> createRcvForAdv(MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL, RcvAct_InfoR hR) {

			MCList<MST_RCV_R> advL = MCList.create(MST_RCV_R.class);

			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {

				MST_RCV_R advR = createRcvForAdv(rcvActR, rcvActDR, hR);
				advL.add(advR);
				rcvActDR.gen_rcv_no(advR.rcv_no());
			}

			return advL;
		}

		protected MST_RCV_R createRcvForAdv(MST_RCV_ACT_R rcvActR, MST_RCV_ACT_D_R rcvActDR,
				RcvAct_InfoR hR) {

			MST_RCV_R advR = MST_RCV_R.create();
			advR.setAttributes(rcvActDR);

			advR.rcv_no(getRcvNo(rcvActR));
			advR.slo_no(hR.slo_no());
			advR.dat_typ(getRcvDatTyp(rcvActR.trd_ptn_typ()));
			advR.rcst_cd(rcvActR.rcst_cd());
			advR.bcst_cd(rcvActR.bcst_cd());
			advR.bill_dpt_cd(rcvActR.bill_dpt_cd());
			advR.acst_cd(null);
			advR.asppl_cd(null);
			advR.bsppl_cd(null);
			advR.rcv_dpt_cd(rcvActR.dpt_cd());
			advR.wg_cd(rcvActR.wg_cd());
			advR.rcv_usr_cd(rcvActR.usr_cd());
			advR.rcv_dt(rcvActR.rcv_dt());
			advR.ac_dt();
			advR.rcv_mtd_cd(rcvActR.ar_sttl_cd1());
			advR.rcv_typ(rcvActR.ar_sttl_typ1());
			advR.bank_ac_cd(rcvActR.bank_ac_cd());
			advR.xfr_psn(rcvActR.xfr_psn());
			advR.note_mng_no(rcvActR.note_mng_no());
			advR.trd_cur_cd(rcvActR.trd_cur_cd());
			advR.base_cur_cd(getBaseCur().cur_cd());
			advR.xrate_cd(rcvActR.xrate_cd());
			advR.xrate(rcvActR.xrate());
			advR.rcv_rmrks();
			advR.src_rcv_act_no(rcvActR.rcv_act_no());
			advR.src_rcv_act_seq(rcvActR.rcv_act_seq());
			advR.src_rcv_act_d_no(rcvActDR.rcv_act_d_no());
			advR.src_rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
			advR.pay_act_no();
			advR.rcv_amt(MCNumber.sum(rcvActDR.trd_cur_amt1(), rcvActDR.trd_cur_amt2(), rcvActDR.trd_cur_amt3()));
			advR.rcv_proc_amt(0);
			advR.not_proc_bal(MCNumber.sum(rcvActDR.trd_cur_amt1(), rcvActDR.trd_cur_amt2(), rcvActDR.trd_cur_amt3()));
			advR.com_paid(0);
			advR.bill_setoff_amt(0);
			advR.auto_appl_basis_dt();
			advR.rcv_auto_appl_tgt_flg(false);
			advR.auto_appl_sts_typ(MSC_AUTO_APPL_STS_TYP.EXCLD.value());
			advR.seq_no();
			advR.prnt_flg();
			advR.div_src_rcv_no();
			advR.div_flg();
			advR.sub_char1();
			advR.sub_char2();
			advR.sub_char3();
			return advR;
		}

		/**
		 * 入金ＮＯを発番する
		 * 
		 * @param rcvActR 入金実績情報
		 * @return
		 */
		protected String getRcvNo(MST_RCV_ACT_R rcvActR) {

			ElmArgsR args = ElmArgsR.create();
			args.bp_cd(rcvActR.rcst_cd());
			args.co_cd(getCo().co_cd());
			args.dt(rcvActR.rcv_dt());
			args.dpt_cd(rcvActR.dpt_cd());
			args.wg_cd(rcvActR.wg_cd());

			return getNum(MAC_NUM_BIZ_TYP.RCV, args);
		}

		/**
		 * 入金情報区分を取得する
		 * 
		 * @param trdPtnTyp 取引区分
		 * @return 入金情報区分
		 */
		protected String getRcvDatTyp(String trdPtnTyp) {

			if (MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)) {
				return MSC_RCV_DAT_TYP.SUSP.value();
			}
			else {
				return MSC_RCV_DAT_TYP.ADV.value();
			}
		}

		/**
		 * 手形の登録<br />
		 * 債権決済区分が手形、かつ、入金ＮＯが設定されていない場合、<br>
		 * 売掛消込登録で手形が入力されているので手形を登録する
		 * 
		 * @param hR ヘッダ情報
		 * @param rcvActR 入金実績情報
		 */
		protected void insNote(RcvAct_InfoR hR, MST_RCV_ACT_R rcvActR) {

			if (!MAC_AR_STTL_TYP.isNOTE(hR.ar_sttl_typ1())
					|| !isNull(hR.rcv_no())) {
				return;
			}

			// 手形を登録する
			MST_NOTE_R noteR = MST_NOTE_R.create("T");
			MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(noteR);
			copy(noteR, hR, createMap_MST_NOTE_R_RcvAct_InfoR());
			dbInsert("MSBGL5020_MST_NOTE_I01", noteR, noteR_bldr);

			// 入金実績の手形管理ＮＯ、手形番号を更新する
			rcvActR.note_mng_no(noteR.note_mng_no());
			rcvActR.note_no(noteR.note_no());

			MST_RCV_ACT_R dbc = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.note_mng_no, bindEx("note_mng_no"));
			builder.addSetVL(dbc.note_no, bindEx("note_no"));
			dbUpdateKey("MSBGL5020_MST_RCV_ACT_U01", rcvActR, builder);
			
			// 手形情報ＩＦ作成サービスを実行
			MSBGL_NoteIfService.NoteIf_Ins01 op = MSBGL_NoteIfService.crtNoteIf_Ins01();
			NoteIf_Ins01_CndR up0R = NoteIf_Ins01_CndR.create();
			up0R.note_mng_no(noteR.note_mng_no());
			up0R.del_flg(false);
			up0R.rcv_act_flg(true);
			op.up0().add(up0R);
			op.exec();
		}

		/**
		 * 為替差損益の登録<br />
		 * 入金実績明細に為替差損益が設定されている場合、
		 * その入金実績明細に紐づけて為替差損益を登録する
		 * 
		 * @param rcvActDL 入金実績明細情報
		 */
		protected void insArExcGainLoss(MCList<MST_RCV_ACT_D_R> rcvActDL) {
			
			MCList<MST_AR_EXC_GAIN_LOSS_R> insL = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);
			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {
				
				MCNumber excGainLoss = rcvActDR.getNumberNE("exc_gain_loss");
				
				if (!isNull(excGainLoss) && !excGainLoss.isZero()) {
					if (isCrtExcGainLoss4Rev(rcvActDR)) {
						MST_AR_EXC_GAIN_LOSS_R eglR = crtExcGainLoss4Rev(rcvActDR);
						insL.add(eglR);
						excGainLoss = excGainLoss.subtract(eglR.exc_gain_loss());
					}
					
					MST_AR_EXC_GAIN_LOSS_R insR = MST_AR_EXC_GAIN_LOSS_R.create();
					insR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
					insR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
					insR.exc_gain_loss(excGainLoss);
					insL.add(insR);
				}
			}
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_AR_EXC_GAIN_LOSS_R.create("T"));
			dbInsert("MSBGL5020_MST_AR_EXC_GAIN_LOSS_I01", insL, insL_bldr);
		}
		protected MST_AR_EXC_GAIN_LOSS_R crtExcGainLoss4Rev(MST_RCV_ACT_D_R rcvActDR) {
			
			// (入金額 * 取引時為替レート) - (入金額 * 評価替時レート)
			MCNumber amt = sum(rcvActDR.trd_cur_amt1(), rcvActDR.trd_cur_amt2(), rcvActDR.trd_cur_amt3());
			MCNumber excGainLoss1 = convToBaseCur(
					amt, rcvActDR.getNumberNE("slsXrate"),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			MCNumber excGainLoss2 = convToBaseCur(
					amt, rcvActDR.getNumberNE("new_xrate"),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
					
			MCNumber excGainLoss = excGainLoss1.subtract(excGainLoss2);

			if (rcvActDR.getBooleanNE("isCalcXchngReq")) {
				// 全額入金の場合、最終行のみ為替差損益の調整を行う。xrateRevHisGainLoss に合わせる
				MCNumber adjGainLoss =  
					rcvActDR.getNumberNE("xrateRevHisGainLoss").multiply(-1)
					.subtract(
						rcvActDR.getNumberNE("xrateRevHisGainLossRcvAct").add(excGainLoss)
					);
				excGainLoss = excGainLoss.add(adjGainLoss);
			}
			
			MST_AR_EXC_GAIN_LOSS_R excGainLossR = MST_AR_EXC_GAIN_LOSS_R.create();
			excGainLossR.exc_gain_loss(excGainLoss);
			excGainLossR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
			excGainLossR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
			excGainLossR.ref_ar_xrate_rev_his_no(rcvActDR.getStringNE("ar_xrate_rev_his_no"));
			
			return excGainLossR;
		}

		/**
		 * 新規登録時の売掛消込実績の登録、更新を行う
		 * 
		 * @param rcvActR 入金実績情報
		 * @param rcvActDL 入金実績明細情報
		 */
		protected void insArApplAct(MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<MST_AR_APPL_ACT_R> arApplActL = srchArApplAct(rcvActDL, rcvActR);

			MCIndexKey idk = arApplActL.createIndex(
					MST_AR_APPL_ACT_R.$ar_appl_schd_no,
					MST_AR_APPL_ACT_R.$rcv_act_d_no,
					MST_AR_APPL_ACT_R.$rcv_act_d_seq,
					MST_AR_APPL_ACT_R.$rcv_mtd_cd
					);

			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {
				MST_AR_APPL_ACT_R arApplActR = arApplActL.getFirst(idk,
						rcvActDR.getString("ar_appl_schd_no"),
						rcvActDR.rcv_act_d_no(),
						rcvActDR.rcv_act_d_seq(),
						rcvActR.ar_sttl_cd1());

				// 相殺額のみ指定されている場合があるので、入金額が0以外のデータを対象とする
				// ただし、入金額と相殺額の両方が0の場合でも売掛消込実績が作られるようにする
				if (!rcvActDR.trd_cur_amt1().isZero() 
					|| rcvActDR.trd_cur_amt1().isZero() && rcvActDR.trd_cur_amt2().isZero()) {
					if (isNull(arApplActR)) {
						insArApplAct(rcvActDR, rcvActR, false);
					}
					else {
						updArApplAct(rcvActDR, rcvActR, arApplActR, false);
					}
				}
				// 相殺方法ＣＤが設定されている、かつ、相殺額がゼロ以外の場合、
				// 相殺の処理を実行する
				if (!isNull(rcvActR.ar_sttl_cd2()) && !rcvActDR.trd_cur_amt2().isZero()) {
					MST_AR_APPL_ACT_R setoffArApplActR = arApplActL.getFirst(idk,
							rcvActDR.getString("ar_appl_schd_no"),
							rcvActDR.rcv_act_d_no(),
							rcvActDR.rcv_act_d_seq(),
							rcvActR.ar_sttl_cd2());

					if (isNull(setoffArApplActR)) {
						insArApplAct(rcvActDR, rcvActR, true);
					}
					else {
						updArApplAct(rcvActDR, rcvActR, setoffArApplActR, false);
					}
				}
				updArApplSchd(rcvActDR);
			}
		}

		/**
		 * 売掛消込実績の検索<br />
		 * 売掛消込予定ＮＯ、入金実績明細ＮＯ、連番を条件に売掛消込実績を検索する
		 * 
		 * @param rcvActDL 入金実績明細情報
		 * @param rcvActR 入金実績情報
		 * @return
		 */
		protected MCList<MST_AR_APPL_ACT_R> srchArApplAct(
				MCList<MST_RCV_ACT_D_R> rcvActDL, MST_RCV_ACT_R rcvActR) {

			MCList<MST_AR_APPL_ACT_R> arApplActL = MCList.create(MST_AR_APPL_ACT_R.class);
			MST_AR_APPL_ACT_R arApplActL_t = MST_AR_APPL_ACT_R.create("T");
			MCQueryApiBuilder arApplActL_bldr = MCQueryApiBuilder.create(arApplActL_t);
			arApplActL_bldr.addWhereWithAnd(arApplActL_t.ar_appl_schd_no.eq(bind("ar_appl_schd_no")));
			arApplActL_bldr.addWhereWithAnd(arApplActL_t.rcv_act_d_no.eq(bind("rcv_act_d_no")));
			arApplActL_bldr.addWhereWithAnd(arApplActL_t.rcv_act_d_seq.eq(bind("rcv_act_d_seq")));
			arApplActL_bldr.addWhereWithAnd(arApplActL_t.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd1());
			dbSelect("MSBGL5020_MST_AR_APPL_ACT_S01", arApplActL, arApplActL_bldr, rcvActDL);

			// 相殺方法ＣＤが設定されている場合、相殺の売掛消込実績を検索する。
			if (!isNull(rcvActR.ar_sttl_cd2())) {
				MCList<MST_AR_APPL_ACT_R> setoffArApplActL = MCList.create(MST_AR_APPL_ACT_R.class);
				MST_AR_APPL_ACT_R setoffArApplActL_t = MST_AR_APPL_ACT_R.create("T");
				MCQueryApiBuilder setoffArApplActL_bldr = MCQueryApiBuilder.create(setoffArApplActL_t);
				setoffArApplActL_bldr.addWhereWithAnd(setoffArApplActL_t.ar_appl_schd_no.eq(bind("ar_appl_schd_no")));
				setoffArApplActL_bldr.addWhereWithAnd(setoffArApplActL_t.rcv_act_d_no.eq(bind("rcv_act_d_no")));
				setoffArApplActL_bldr.addWhereWithAnd(setoffArApplActL_t.rcv_act_d_seq.eq(bind("rcv_act_d_seq")));
				setoffArApplActL_bldr.addWhereWithAnd(setoffArApplActL_t.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd2());
				dbSelect("MSBGL5020_MST_AR_APPL_ACT_S02", setoffArApplActL, setoffArApplActL_bldr, rcvActDL);
				arApplActL.addAll(setoffArApplActL);
			}
			return arApplActL;
		}

		/**
		 * 売掛消込実績の登録<br />
		 * 売掛消込実績を登録する
		 * 
		 * @param rcvActDR 入金実績明細情報
		 * @param rcvActR 入金実績情報
		 * @param setoffFlg 相殺ＦＬＧ
		 */
		protected void insArApplAct(MST_RCV_ACT_D_R rcvActDR, MST_RCV_ACT_R rcvActR,
				boolean setoffFlg) {
			MST_AR_APPL_ACT_R insR = MST_AR_APPL_ACT_R.create("T");
			insR.ar_appl_act_no(getStrSeq(MSC_NUM_SYS_TYP.ARAPPLACT));
			insR.ar_appl_schd_no(rcvActDR.getString("ar_appl_schd_no"));
			insR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
			insR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
			insR.rcv_act_dt(rcvActR.rcv_dt());
			if (setoffFlg) {
				insR.rcv_mtd_cd(rcvActR.ar_sttl_cd2());
				insR.appl_amt(rcvActDR.trd_cur_amt2());
			}
			else {
				insR.rcv_mtd_cd(rcvActR.ar_sttl_cd1());
				insR.appl_amt(rcvActDR.trd_cur_amt1());
			}
			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(insR);
			dbInsert("MSBGL5020_MST_AR_APPL_ACT_I01", insR, insR_bldr);
		}

		/**
		 * 売掛消込実績の更新<br />
		 * 売掛消込実績を更新する
		 * 
		 * @param rcvActDR 入金実績明細情報
		 * @param rcvActR 入金実績情報
		 * @param arApplActR 売掛消込実績情報
		 * @param setoffFlg 相殺ＦＬＧ
		 */
		protected void updArApplAct(MST_RCV_ACT_D_R rcvActDR, MST_RCV_ACT_R rcvActR,
				MST_AR_APPL_ACT_R arApplActR, boolean setoffFlg) {
			// 更新項目設定
			arApplActR.rcv_act_dt(rcvActR.rcv_dt());
			if (setoffFlg) {
				arApplActR.rcv_mtd_cd(rcvActR.ar_sttl_cd2());
				arApplActR.appl_amt(rcvActDR.trd_cur_amt2());
			}
			else {
				arApplActR.rcv_mtd_cd(rcvActR.ar_sttl_cd1());
				arApplActR.appl_amt(rcvActDR.trd_cur_amt1());
			}
			MCQueryApiBuilder arApplActR_bldr = MCQueryApiBuilder.create(MST_AR_APPL_ACT_R.create("T"));
			dbUpdateKey("MSBGL5020_MST_AR_APPL_ACT_U01", arApplActR, arApplActR_bldr);
		}

		/**
		 * 売掛消込予定の更新<br />
		 * 売掛消込予定の消込額と未消込残高を更新する
		 * 
		 * @param rcvActDR 入金実績情報
		 */
		protected void updArApplSchd(MST_RCV_ACT_D_R rcvActDR) {
			// 売掛消込予定の消込額、未消込残高を更新する

			MST_AR_APPL_SCHD_R dbc = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setWhere(dbc.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
			builder.setSetVL(dbc.appl_amt,
					dbc.appl_amt.add(nvl(bindEx("trd_cur_amt1"), value(0)))
							.add(nvl(bindEx("trd_cur_amt2"), value(0))));
			builder.addSetVL(dbc.not_appl_bal,
					dbc.not_appl_bal.subtract(nvl(bindEx("trd_cur_amt1"), value(0)))
							.subtract(nvl(bindEx("trd_cur_amt2"), value(0))));
			dbUpdate("MSBGL5020_MST_AR_APPL_SCHD_U01", rcvActDR, builder);
		}

		/**
		 * 入金予定消込実績の更新<br />
		 * 入金予定消込実績を登録または更新する
		 * 
		 * @param rcvActR 入金実績情報
		 * @param rcvActDL 入金実績明細情報
		 */
		protected void insRcvSchdApplAct(MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<MST_RCV_SCHD_APPL_ACT_R> insL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);

			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {
				MST_RCV_SCHD_APPL_ACT_R r =
						srchRcvSchdApplAct(rcvActDR, rcvActR, false);
				// 相殺額のみ指定されている場合があるので、入金額が0以外のデータを対象とする
				// ただし、入金額と相殺額の両方が0の場合でも入金予定消込実績が作られるようにする
				if (!rcvActDR.trd_cur_amt1().isZero() 
					|| rcvActDR.trd_cur_amt1().isZero() && rcvActDR.trd_cur_amt2().isZero()) {
					if (r.isEmpty()) {
						insL.add(insRcvSchdApplAct(rcvActDR, rcvActR, false));
					}
					else {
						updRcvSchdApplActForCrt(r, rcvActDR.trd_cur_amt1());
						insL.add(r);
					}
				}
				// 相殺方法ＣＤが設定されている、かつ、相殺額がゼロ以外の場合
				if (!isNull(rcvActR.ar_sttl_cd2()) && !rcvActDR.trd_cur_amt2().isZero()) {
					MST_RCV_SCHD_APPL_ACT_R setoffR =
							srchRcvSchdApplAct(rcvActDR, rcvActR, true);
					if (setoffR.isEmpty()) {
						insL.add(insRcvSchdApplAct(rcvActDR, rcvActR, true));
					}
					else {
						updRcvSchdApplActForCrt(setoffR, rcvActDR.trd_cur_amt2());
						insL.add(setoffR);
					}
				}
			}
			updBillForCrt(insL);
		}

		/**
		 * 入金予定消込実績ＮＯをもとに入金実績額を更新する
		 * 
		 * @param updR 入金予定消込実績
		 * @param trdCurAmt 取引通貨金額
		 */
		protected void updRcvSchdApplActForCrt(MST_RCV_SCHD_APPL_ACT_R updR, MCNumber trdCurAmt) {
			updR.rcv_act_amt(trdCurAmt);

			MST_RCV_SCHD_APPL_ACT_R dbc = MST_RCV_SCHD_APPL_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setWhere(dbc.rcv_schd_appl_act_no.eq(bindEx("rcv_schd_appl_act_no")));
			builder.setSetVL(dbc.rcv_act_amt, dbc.rcv_act_amt.add(bindEx("rcv_act_amt")));
			dbUpdate("MSBGL5020_MST_RCV_SCHD_APPL_ACT_U01", updR, builder);
		}

		/**
		 * 入金予定消込実績の検索<br />
		 * 入金予定消込実績を検索する
		 * 
		 * @param rcvActDR 入金実績明細情報
		 * @param rcvActR 入金実績情報
		 * @param setoffFlg 相殺ＦＬＧ
		 * @return
		 */
		protected MST_RCV_SCHD_APPL_ACT_R srchRcvSchdApplAct(
				MST_RCV_ACT_D_R rcvActDR, MST_RCV_ACT_R rcvActR, boolean setoffFlg) {

			MST_RCV_SCHD_APPL_ACT_R r = MST_RCV_SCHD_APPL_ACT_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(r);
			if (setoffFlg) {
				r_bldr.addWhereWithAnd(r.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd2());
			}
			else {
				r_bldr.addWhereWithAnd(r.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd1());	
			}
			r_bldr.addWhereWithAnd(r.rcv_act_dt.eq(bind("1")), rcvActR.rcv_dt());
			r_bldr.addWhereWithAnd(r.bill_mng_no.eq(bind("1")), rcvActDR.getString("tgt_rcv_bill_mng_no"));
			dbSelect("MSBGL5020_MST_RCV_SCHD_APPL_ACT_S01", r, r_bldr);

			return r;
		}

		/**
		 * 入金予定消込実績の登録<br />
		 * 入金予定消込実績ＮＯを発番して登録する
		 * 
		 * @param rcvActDR 入金実績明細情報
		 * @param rcvActR 入金実績情報
		 * @param setoffFlg 相殺ＦＬＧ
		 * @return
		 */
		protected MST_RCV_SCHD_APPL_ACT_R insRcvSchdApplAct(
				MST_RCV_ACT_D_R rcvActDR, MST_RCV_ACT_R rcvActR, boolean setoffFlg) {
			MST_RCV_SCHD_APPL_ACT_R insR = MST_RCV_SCHD_APPL_ACT_R.create("T");
			insR.rcv_schd_appl_act_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHDAPPLACT));
			insR.bill_mng_no(rcvActDR.getString("tgt_rcv_bill_mng_no"));
			insR.rcv_act_dt(rcvActR.rcv_dt());
			if (setoffFlg) {
				insR.rcv_mtd_cd(rcvActR.ar_sttl_cd2());
				insR.rcv_typ(rcvActR.ar_sttl_typ2());
				insR.rcv_act_amt(rcvActDR.trd_cur_amt2());
			}
			else {
				insR.rcv_mtd_cd(rcvActR.ar_sttl_cd1());
				insR.rcv_typ(rcvActR.ar_sttl_typ1());
				insR.rcv_act_amt(rcvActDR.trd_cur_amt1());
			}
			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(insR);
			dbInsert("MSBGL5020_MST_RCV_SCHD_APPL_ACT_I01", insR, insR_bldr);
			return insR;
		}

		/**
		 * 請求ヘッダの更新<br />
		 * 入金予定消込実績の情報をもとに請求ヘッダの入金実績額、未消込残高を更新する
		 * 
		 * @param insL 入金予定消込実績
		 */
		protected void updBillForCrt(MCList<MST_RCV_SCHD_APPL_ACT_R> insL) {

			MCList<MST_RCV_SCHD_APPL_ACT_R> billMngNoL = insL.groupBy(getRcvSchdApplActGP());

			for (MST_RCV_SCHD_APPL_ACT_R billMngNoR : billMngNoL) {

				MST_BILL_R dbc = MST_BILL_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setWhere(dbc.bill_mng_no.eq(bindEx("bill_mng_no")));
				builder.setSetVL(dbc.last_rcv_dt, bindEx("rcv_act_dt"));
				builder.addSetVL(dbc.rcv_act_amt, dbc.rcv_act_amt.add(bindEx("rcv_act_amt")));
				builder.addSetVL(dbc.not_appl_bal, dbc.not_appl_bal.subtract(bindEx("rcv_act_amt")));
				dbUpdate("MSBGL5020_MST_BILL_U01", billMngNoR, builder);
			}
		}

		/**
		 * 入金予定消込実績を請求管理ＮＯでグルーピングするMCGroupByPolicyを設定
		 * 
		 * @return gp
		 */
		protected MCGroupByPolicy getRcvSchdApplActGP() {
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_RCV_SCHD_APPL_ACT_R.$bill_mng_no);
			gp.max(MST_RCV_SCHD_APPL_ACT_R.$rcv_act_dt);
			gp.sum(MST_RCV_SCHD_APPL_ACT_R.$rcv_act_amt);
			return gp;
		}

		/**
		 * 債権共通サービスを実行する
		 * 
		 * @param rcvActR 入金実績
		 * @param rcvActDL 入金実績明細
		 */
		protected void execArCmnForCrt(MST_RCV_ACT_R rcvActR, MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<ArCmn_Upd01_DtlR> dtlL = MCList.create(ArCmn_Upd01_DtlR.class);
			addAll(dtlL, rcvActDL, createMap_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R(rcvActR));
			execArCmnService(MSC_AR_OPE_TYP.AR_APPL, dtlL);

			setBillMngNo(rcvActDL);
		}

		/**
		 * 入金実績ヘッダ、入金実績明細を追加する<p>
		 * 戻り値として作成した入金実績情報を返す
		 * 
		 * @param baseR ベース情報
		 * @param hR 実績ヘッダ情報
		 * @param dL 実績明細情報
		 * @return 作成した入金実績（第1要素：入金実績ヘッダ、第2要素：入金実績明細）
		 */
		protected Object[] insNewRcvAct(RcvAct_BaseR baseR, RcvAct_InfoR hR,
				MCList<RcvActD_InfoR> dL) {

			MST_RCV_ACT_R rcvActR = createNewRcvAct(baseR, hR);
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_I01", rcvActR, rcvActR_bldr);

			MCList<MST_RCV_ACT_D_R> rcvActDL = createNewRcvActD(baseR, hR, dL);
			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_D_I01", rcvActDL, rcvActDL_bldr);

			return new Object[] {
					rcvActR,
					rcvActDL
			};
		}

		/**
		 * 入金実績の取消処理を行う
		 * 
		 * @param baseR 実績基本情報
		 * @param orgHR 入金実績ヘッダ情報
		 * @param delRcvActDL 取消対象の入金実績明細情報
		 */
		protected void delRcvAct(RcvAct_BaseR baseR, RcvAct_InfoR orgHR,
				MCList<MST_RCV_ACT_D_R> delRcvActDL) {

			MCList<RcvActD_InfoR> dtlL = getRcvActDForCred(delRcvActDL);
			execComProc(orgHR, dtlL);

			if (!reqCreateRcv(orgHR.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(orgHR.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(orgHR.trd_ptn_typ())) {
				execArDtlApplRegForDel(baseR);
			}

			disOrgRcvAct(baseR);

			MST_RCV_ACT_R canRcvActR = insCanRcvAct(baseR);
			MCList<ArCmn_Upd01_DtlR> arInL = insCanRcvActD(baseR, canRcvActR, delRcvActDL);

			if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(orgHR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(orgHR.trd_ptn_typ())) {
				return;
			}
			if (reqCreateRcv(orgHR.trd_ptn_typ())) {
				delRcvForDel(baseR);
			}
			else {
				delNoteForDel(orgHR);
				delArExcGainLoss(delRcvActDL);
				delRcvSchdApplAct(canRcvActR, arInL);
				delArApplAct(arInL);
				execArCmnForDel(baseR, arInL);
			}
		}

		/**
		 * 取消時の与信更新用に入金実績明細から明細情報を取得する
		 * 
		 * @param delRcvActDL
		 * @return 与信更新用の明細情報
		 */
		protected MCList<RcvActD_InfoR> getRcvActDForCred(
				MCList<MST_RCV_ACT_D_R> delRcvActDL) {
			MCList<RcvActD_InfoR> dtlL = MCList.create(RcvActD_InfoR.class);
			addAll(dtlL, delRcvActDL, createMap_RcvActD_InfoR_MST_RCV_ACT_D_R());
			return dtlL;
		}

		/**
		 * 関連する入金情報を削除する
		 * 
		 * @param baseR 削除条件
		 */
		protected void delRcvForDel(RcvAct_BaseR baseR) {
			MST_RCV_R t = MST_RCV_R.create("T");
			execDbDelete("MSBGL5020_MST_RCV_D01", t,
					t.src_rcv_act_no.eq(bind("rcv_act_no"))
					.and(t.src_rcv_act_seq.eq(bind("old_rcv_act_seq"))), baseR);
		}

		/**
		 * 関連する手形情報を削除する
		 * 
		 * @param hR ヘッダ情報
		 */
		protected void delNoteForDel(RcvAct_InfoR hR) {

			if (!MAC_AR_STTL_TYP.isNOTE(hR.ar_sttl_typ1())
					|| !isNull(hR.rcv_no())) {
				return;
			}

			// 手形情報ＩＦ作成サービスを実行
			MSBGL_NoteIfService.NoteIf_Ins01 op = MSBGL_NoteIfService.crtNoteIf_Ins01();
			NoteIf_Ins01_CndR up0R = NoteIf_Ins01_CndR.create();
			up0R.note_mng_no(hR.note_mng_no());
			up0R.del_flg(true);
			up0R.rcv_act_flg(true);
			op.up0().add(up0R);
			op.exec();

			// 手形トランを論理削除
			MST_NOTE_R noteR = MST_NOTE_R.create("T");
			noteR.note_mng_no(hR.note_mng_no());
			noteR.can_flg(true);
			MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(noteR);
			noteR_bldr.setSet(noteR.can_flg);
			dbUpdateKey("MSBGL5020_MST_NOTE_U01", noteR, noteR_bldr);
		}

		/**
		 * 債権為替差損益を削除する
		 * 
		 * @param rcvActDL 入金実績明細
		 */
		protected void delArExcGainLoss(MCList<MST_RCV_ACT_D_R> rcvActDL) {
			// 無効となった入金実績明細ＮＯ、入金実績明細連番で債権為替差損益を検索
			MCList<MST_AR_EXC_GAIN_LOSS_R> l = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);
			MST_AR_EXC_GAIN_LOSS_R t = MST_AR_EXC_GAIN_LOSS_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setWhere(t.rcv_act_d_no.eq(bind("rcv_act_d_no")));
			l_bldr.addWhereWithAnd(t.rcv_act_d_seq.eq(bind("old_rcv_act_d_seq")));
			dbSelect("MSBGL5020_MST_AR_EXC_GAIN_LOSS_S01", l, l_bldr, rcvActDL);

			// 検索結果がない場合は処理終了
			if (l.isEmpty()) {
				return;
			}

			// 取消の入金実績明細ＮＯ、入金実績明細連番で、為替差損益を符号反転して登録する
			MCIndexKey idk = rcvActDL.createIndex("rcv_act_d_no", "old_rcv_act_d_seq");
			for (MST_AR_EXC_GAIN_LOSS_R r : l) {
				MST_RCV_ACT_D_R rcvActDR = rcvActDL.getFirst(idk, r.rcv_act_d_no(), r.rcv_act_d_seq());
				r.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
				r.exc_gain_loss(r.exc_gain_loss().negate());
			}
			dbInsertEx("MSBGL5020_MST_AR_EXC_GAIN_LOSS_I02", l, l_bldr);
		}

		/**
		 * 入金予定消込実績の取消
		 * 
		 * @param rcvActR 入金実績
		 * @param dtlL 明細情報
		 */
		protected void delRcvSchdApplAct(MST_RCV_ACT_R rcvActR, MCList<ArCmn_Upd01_DtlR> dtlL) {

			MCList<MST_RCV_SCHD_APPL_ACT_R> rcvSchdApplActL =
					getRcvSchdApplAct(rcvActR, dtlL, false);

			// 無効の入金実績明細に紐付く入金予定消込情報なので、
			// 必ず存在する想定だが、念のため存在する場合のみ処理を行う
			if (!rcvSchdApplActL.isEmpty()) {
				delRcvSchdApplAct(rcvSchdApplActL, dtlL, false);
			}

			if (!isNull(rcvActR.ar_sttl_cd2())) {
				MCList<MST_RCV_SCHD_APPL_ACT_R> setoffApplActL =
						getRcvSchdApplAct(rcvActR, dtlL, true);
				// 無効の入金実績明細に紐付く入金予定消込情報なので、
				// 必ず存在する想定だが、念のため存在する場合のみ処理を行う
				if (!setoffApplActL.isEmpty()) {
					delRcvSchdApplAct(setoffApplActL, dtlL, true);
				}
			}
		}

		/**
		 * 入金予定消込実績の取得
		 * 
		 * @param rcvActR 入金実績
		 * @param dtlL 明細情報
		 * @param setoffFlg 相殺ＦＬＧ
		 * 
		 * @return
		 */
		protected MCList<MST_RCV_SCHD_APPL_ACT_R> getRcvSchdApplAct(
				MST_RCV_ACT_R rcvActR, MCList<ArCmn_Upd01_DtlR> dtlL, boolean setoffFlg) {
			
			MCList<MST_RCV_SCHD_APPL_ACT_R> l = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
			MST_RCV_SCHD_APPL_ACT_R t = MST_RCV_SCHD_APPL_ACT_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			MST_AR_APPL_SCHD_R t3 = MST_AR_APPL_SCHD_R.create("T3");
			MST_AR_APPL_ACT_R t4 = MST_AR_APPL_ACT_R.create("T4");
			l_bldr.addSelect(t4.rcv_act_d_no);
			l_bldr.addSelect(t4.rcv_act_d_seq);
			l_bldr.addInnerJoin(t2, bracket( t.bill_mng_no.eq(t2.bill_mng_no)));
			l_bldr.addInnerJoin(t3, bracket( t2.bill_acst_no.eq(t3.bill_acst_no)));
			l_bldr.addInnerJoin(t4, bracket( t3.ar_appl_schd_no.eq(t4.ar_appl_schd_no)));
			l_bldr.addWhereWithAnd(t.rcv_act_dt.eq(bind("1")), rcvActR.rcv_dt());
			l_bldr.addWhereWithAnd(t4.rcv_act_d_no.eq(bind("act_d_no")));
			l_bldr.addWhereWithAnd(t4.rcv_act_d_seq.eq(bind("old_act_d_seq")));
			if (setoffFlg) {
				l_bldr.addWhereWithAnd(t.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd2());
				l_bldr.addWhereWithAnd(t4.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd2());
			}
			else {
				l_bldr.addWhereWithAnd(t.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd1());
				l_bldr.addWhereWithAnd(t4.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd1());
			}
			dbSelect("MSBGL5020_MST_RCV_SCHD_APPL_ACT_S02", l, l_bldr, dtlL);

			return l;
		}

		/**
		 * 請求ヘッダの更新、入金予定消込実績の更新、削除
		 * 
		 * @param delL 削除対象の入金予定消込実績
		 * @param dtlL 明細情報
		 * @param setoffFlg 相殺ＦＬＧ
		 */
		protected void delRcvSchdApplAct(MCList<MST_RCV_SCHD_APPL_ACT_R> delL,
				MCList<ArCmn_Upd01_DtlR> dtlL, boolean setoffFlg) {

			MCIndexKey idk = dtlL.createIndex(
					ArCmn_Upd01_DtlR.$act_d_no, "old_act_d_seq");

			for (MST_RCV_SCHD_APPL_ACT_R delR : delL) {
				ArCmn_Upd01_DtlR dtlR = dtlL.getFirst(idk,
						delR.getString("rcv_act_d_no"), delR.getNumber("rcv_act_d_seq"));
				// 必ず存在するはずだが念のため取得できない場合の制御を入れておく
				if (isNull(dtlR)) {
					continue;
				}
				if (setoffFlg) {
					updRcvSchdApplActForDel(delR, dtlR.trd_cur_amt2().negate());
				}
				else {
					updRcvSchdApplActForDel(delR, dtlR.trd_cur_amt1().negate());
				}

				// 削除する入金予定消込実績に紐付く請求ヘッダを更新する
				updBillForDel(delR);
			}
		}

		/**
		 * 入金予定消込実績ＮＯをもとに入金実績額を更新する
		 * 
		 * @param delR 削除対象の入金予定消込実績
		 * @param trdCurAmt 取引通貨金額
		 */
		protected void updRcvSchdApplActForDel(MST_RCV_SCHD_APPL_ACT_R delR, MCNumber trdCurAmt) {
			delR.rcv_act_amt(trdCurAmt);

			MST_RCV_SCHD_APPL_ACT_R dbc = MST_RCV_SCHD_APPL_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setWhere(dbc.rcv_schd_appl_act_no.eq(bindEx("rcv_schd_appl_act_no")));
			builder.setSetVL(dbc.rcv_act_amt, dbc.rcv_act_amt.subtract(bindEx("rcv_act_amt")));
			dbUpdate("MSBGL5020_MST_RCV_SCHD_APPL_ACT_U02", delR, builder);
		}

		/**
		 * 請求管理ＮＯをもとに、入金実績額、未消込残高を更新する
		 * 
		 * @param delR 削除対象の入金予定消込実績
		 */
		protected void updBillForDel(MST_RCV_SCHD_APPL_ACT_R delR) {

			MST_BILL_R dbc = MST_BILL_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setWhere(dbc.bill_mng_no.eq(bindEx("bill_mng_no")));
			builder.setSetVL(dbc.rcv_act_amt, dbc.rcv_act_amt.subtract(bindEx("rcv_act_amt")));
			builder.addSetVL(dbc.not_appl_bal, dbc.not_appl_bal.add(bindEx("rcv_act_amt")));
			dbUpdate("MSBGL5020_MST_BILL_U02", delR, builder);
		}

		/**
		 * 売掛消込実績の削除<br />
		 * 売掛消込実績を削除する
		 * 
		 * @param dtlL 明細情報
		 */
		protected void delArApplAct(MCList<ArCmn_Upd01_DtlR> dtlL) {

			MCList<MST_AR_APPL_ACT_R> arApplActL = srchArApplAct(dtlL);

			// 削除する売掛消込実績に紐付く売掛消込予定を更新
			for (MST_AR_APPL_ACT_R r : arApplActL.groupBy(getArApplActGP())) {
				MST_AR_APPL_SCHD_R dbc = MST_AR_APPL_SCHD_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setWhere(dbc.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
				builder.setSetVL(dbc.appl_amt, dbc.appl_amt.subtract(bindEx("appl_amt")));
				builder.addSetVL(dbc.not_appl_bal, dbc.not_appl_bal.add(bindEx("appl_amt")));
				dbUpdate("MSBGL5020_MST_AR_APPL_SCHD_U02", r, builder);
			}
			// 売掛消込実績の削除
			MCQueryApiBuilder arApplActL_bldr = MCQueryApiBuilder.create(MST_AR_APPL_ACT_R.create("T"));
			dbDeleteKey("MSBGL5020_MST_AR_APPL_ACT_D01", arApplActL, arApplActL_bldr);
		}

		/**
		 * 売掛消込実績を検索する
		 * 
		 * @param dtlL 明細情報
		 */
		protected MCList<MST_AR_APPL_ACT_R> srchArApplAct(MCList<ArCmn_Upd01_DtlR> dtlL) {
			// 削除対象の売掛消込実績を検索
			MCList<MST_AR_APPL_ACT_R> arApplActL = MCList.create(MST_AR_APPL_ACT_R.class);
			MST_AR_APPL_ACT_R t = MST_AR_APPL_ACT_R.create("T");
			MCQueryApiBuilder arApplActL_bldr = MCQueryApiBuilder.create(t);
			arApplActL_bldr.setWhere(t.rcv_act_d_no.eq(bind("act_d_no")));
			arApplActL_bldr.addWhereWithAnd(t.rcv_act_d_seq.eq(bind("old_act_d_seq")));
			dbSelect("MSBGL5020_MST_AR_APPL_ACT_S03", arApplActL, arApplActL_bldr, dtlL);
			return arApplActL;
		}

		/**
		 * 売掛消込実績を売掛消込予定ＮＯでグルーピングするMCGroupByPolicyを設定
		 * 
		 * @return
		 */
		protected MCGroupByPolicy getArApplActGP() {
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_AR_APPL_ACT_R.$ar_appl_schd_no);
			gp.sum(MST_AR_APPL_ACT_R.$appl_amt);
			return gp;
		}

		/**
		 * 債権共通処理を実行する
		 * 
		 * @param baseR ベース情報
		 * @param dtlL 債権共通サービスの上り電文
		 */
		protected void execArCmnForDel(RcvAct_BaseR baseR, MCList<ArCmn_Upd01_DtlR> dtlL) {
			execArCmnService(MSC_AR_OPE_TYP.AR_APPL, dtlL);
			setBillIdForDel(baseR);
		}

		/**
		 * 入金実績明細に債権共通サービスで発番した請求管理ＮＯを設定する
		 * 
		 * @param baseR ベース情報
		 */
		protected void setBillIdForDel(RcvAct_BaseR baseR) {
			executeUpdate(MSBGL5020_MST_RCV_ACT_D_U01(), baseR);
		}

		/**
		 * 取引パタン区分が仮受前受相殺画面で選択されるもので、且つ入金情報を作成しているものかを判定する。<BR>
		 * 前受金入金、仮受金入金、仮受金前受金相殺の場合trueを返し、仮受その他相殺は入金情報が作成されないのでfalseを返す。<BR>
		 * そのほかの取引区分もfalseを返す。
		 * 
		 * @param trdPtnTyp 取引パタン区分
		 * @return 前受、仮受、仮受前受相殺、の場合true
		 */
		protected boolean reqCreateRcv(String trdPtnTyp) {
			return MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp) || MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp);
		}

		/**
		 * 入金実績削除時、請求明細の消込戻しを行う
		 * 
		 * @param baseR 入金実績基本情報
		 */
		protected void execArDtlApplRegForDel(RcvAct_BaseR baseR) {

			MCList<RcvActCmn_Upd01_BillDApplActR> applRecL = getBillDApplRecForDel(baseR);
			_applRecL = applRecL;

			if (!isNull(applRecL)) {
				execArDtlApplRegForDel(applRecL);
			}
		}

		/**
		 * 請求明細消込残高更新用の、請求明細消込実績情報を取得する。<BR>
		 * 更新日時チェックも行う。
		 * 
		 * @param baseR 伝票基本情報
		 * @param refTime 明細の参照日時
		 * @return 請求明細消込実績情報
		 */
		protected MCList<RcvActCmn_Upd01_BillDApplActR> getBillDApplRecForDel(
				RcvAct_BaseR baseR) {
			MCList<RcvActCmn_Upd01_BillDApplActR> applRecL = MCList
					.create(RcvActCmn_Upd01_BillDApplActR.class);
			executeQuery(applRecL, MSBGL5020_MST_BILL_D_APPL_ACT_S01(), baseR);

			return applRecL;
		}

		/**
		 * 売掛明細消込処理を実行する
		 * 
		 * @param applRecL 取消対象の消込実績
		 */
		protected void execArDtlApplRegForDel(MCList<RcvActCmn_Upd01_BillDApplActR> applActL) {

			MSBGL_ArDtlApplService.ArDtlAppl_Upd01 op = MSBGL_ArDtlApplService.crtArDtlAppl_Upd01();

			MCList<RcvActCmn_Upd01_BillDApplActR> srchTgtL = MCList.create(RcvActCmn_Upd01_BillDApplActR.class);

			MCIndexKey key = up2().createIndex(RcvActCmn_Upd01_BillDR.$bill_d_no, RcvActCmn_Upd01_BillDR.$parent_bill_d_no);

			for (RcvActCmn_Upd01_BillDApplActR applActR : applActL) {
				ArDtlAppl_Chk01_DtlR dR = ArDtlAppl_Chk01_DtlR.create();
				dR.setAttributes(applActR);

				dR.rcv_act_ac_ym(applActR.ac_ym());
				dR.rcv_act_d_no(applActR.rcv_act_d_no());
				dR.rcv_act_d_seq(applActR.rcv_act_d_seq());
				dR.rcv_act_no(applActR.rcv_act_no());
				dR.rcv_act_seq(applActR.rcv_act_seq());
				dR.ac_ym(applActR.appl_ac_ym());
				dR.bill_d_no(applActR.bill_d_no());
				dR.parent_bill_d_no(applActR.parent_bill_d_no());
				dR.bill_mng_no(applActR.appl_bill_mng_no());
				dR.acst_cd(applActR.acst_cd());
				dR.iv_no(applActR.iv_no());
				dR.trd_cur_cd(applActR.trd_cur_cd());
				dR.wrk_no(applActR.wrk_no());
				dR.ar_typ(applActR.ar_typ());
				dR.ar_dpt_cd(applActR.ar_dpt_cd());
				dR.appl_amt(0);
				dR.ar_appl_flg(false);

				op.up0().add(dR);

				// 後から請求明細消込残高を検索するリスト
				if (up2().contains(key, dR.bill_d_no(), dR.parent_bill_d_no())) {
					srchTgtL.add(applActR);
				}
			}

			op.exec();
		}

		/**
		 * 無効となる入金実績の伝票状況区分を更新する
		 * 
		 * @param baseR 更新条件
		 */
		protected void disOrgRcvAct(RcvAct_BaseR baseR) {
			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR);
			rcvActR_bldr.setSet(rcvActR.slip_sts_typ);
			rcvActR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
			rcvActR_bldr.setWhere(rcvActR.rcv_act_no.eq(bind("rcv_act_no")));
			rcvActR_bldr.addWhereWithAnd(rcvActR.rcv_act_seq.eq(bind("old_rcv_act_seq")));
			dbUpdate("MSBGL5020_MST_RCV_ACT_U02", rcvActR, rcvActR_bldr, baseR);
		}

		/**
		 * 取消請求起算日を取得する
		 * <p>
		 * 「旧実績の請求起算日がnull」ならnullを返す<br>
		 * 「旧実績の請求起算日 < 赤伝計上日」なら赤伝計上日を返す<br>
		 * 「旧実績の請求起算日 >= 赤伝計上日」なら旧伝請求起算日を返す<br>
		 * 
		 * @param canRcvActAcDt 取消実績の計上日
		 * @param oldRcvActBillBasisDt 旧実績の請求起算日
		 * @return 取消実績の請求起算日
		 */
		protected MCDate getCanRcvActBillBasisDt(MCDate canRcvActAcDt,
				MCDate oldRcvActBillBasisDt) {

			if (isNull(oldRcvActBillBasisDt)) {
				return null;
			}
			else if (oldRcvActBillBasisDt.lt(canRcvActAcDt)) {
				return canRcvActAcDt;
			}
			else {
				return oldRcvActBillBasisDt;
			}
		}

		/**
		 * 取消実績を登録する
		 * 
		 * @param baseR ベース情報
		 * @return 登録した取消実績
		 */
		protected MST_RCV_ACT_R insCanRcvAct(RcvAct_BaseR baseR) {
			MST_RCV_ACT_R rcvActR = createCanRcvAct(baseR);
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_I02", rcvActR, rcvActR_bldr);
			return rcvActR;
		}

		protected MST_RCV_ACT_R createCanRcvAct(RcvAct_BaseR baseR) {

			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(rcvActR);
			rcvActR.setAttributes(baseR);
			dbSelectKey("MSBGL5020_MST_RCV_ACT_S01", rcvActR, rcvActR_bldr, baseR.rcv_act_no(), baseR.old_rcv_act_seq());

			// 無効にした入金実績から取消実績を作成する
			rcvActR.rcv_act_no(baseR.rcv_act_no());
			rcvActR.rcv_act_seq(baseR.can_rcv_act_seq());
			rcvActR.rcv_act_rev(baseR.can_rcv_act_rev());
			rcvActR.ac_dt(baseR.can_ac_dt());
			rcvActR.ac_ym(baseR.can_ac_ym());
			rcvActR.trd_cd(baseR.can_trd_cd());
			rcvActR.bill_basis_dt(getCanRcvActBillBasisDt(baseR.can_ac_dt(), rcvActR.bill_basis_dt()));
			rcvActR.trd_cur_amt(rcvActR.trd_cur_amt().negate());
			rcvActR.subttl1(rcvActR.subttl1().negate());
			rcvActR.subttl2(rcvActR.subttl2().negate());
			rcvActR.subttl3(rcvActR.subttl3().negate());
			rcvActR.base_cur_amt(rcvActR.base_cur_amt().negate());
			rcvActR.base_cur_subttl1(rcvActR.base_cur_subttl1().negate());
			rcvActR.base_cur_subttl2(rcvActR.base_cur_subttl2().negate());
			rcvActR.base_cur_subttl3(rcvActR.base_cur_subttl3().negate());
			rcvActR.base_cur_tax_amt(rcvActR.base_cur_tax_amt().negate());
			rcvActR.base_cur_tax_subttl1(rcvActR.base_cur_tax_subttl1().negate());
			rcvActR.base_cur_tax_subttl2(rcvActR.base_cur_tax_subttl2().negate());
			rcvActR.base_cur_tax_subttl3(rcvActR.base_cur_tax_subttl3().negate());
			rcvActR.tax_amt(rcvActR.tax_amt().negate());
			rcvActR.tax_subttl1(rcvActR.tax_subttl1().negate());
			rcvActR.tax_subttl2(rcvActR.tax_subttl2().negate());
			rcvActR.tax_subttl3(rcvActR.tax_subttl3().negate());
			rcvActR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			rcvActR.par_rcv_act_no(baseR.rcv_act_no());
			rcvActR.par_rcv_act_seq(baseR.can_rcv_act_seq());
			rcvActR.rcv_auto_appl_flg(rcvActR.rcv_auto_appl_flg());
			rcvActR.prnt_flg(false);
			rcvActR.setDateNE("dis_ac_dt", baseR.getDateNE("dis_ac_dt"));
			rcvActR.setDateNE(RcvAct_BaseR.$can_ac_dt, baseR.can_ac_dt());
			rcvActR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$dpt_cd), baseR.getStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$dpt_cd)));
			rcvActR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$wg_cd), baseR.getStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$wg_cd)));
			rcvActR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$bd_dpt_cd), baseR.getStringNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$bd_dpt_cd)));
			rcvActR.setDateNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$ac_dt), baseR.getDateNE(MAUCL_DptUtil.getCrtColumn(MST_RCV_ACT_R.$ac_dt)));
			
			MCList<MST_RCV_ACT_R> tgtRcvActL = MCList.create(MST_RCV_ACT_R.class);
			tgtRcvActL.add(rcvActR);
			String[] keys = new String[] {
					MST_RCV_ACT_R.$dpt_cd,
					MST_RCV_ACT_R.$bd_dpt_cd};
			// 部門変換
			MAUCL_DptUtil.setCanDpt(tgtRcvActL, keys, null);
			
			// ＷＧの取り直し
			rcvActR.wg_cd(MSBGL_ArUtil.getWgCd(rcvActR.dpt_cd(), rcvActR.ac_dt()));

			return rcvActR;
		}

		/**
		 * 入金実績明細の取消実績を追加する<br>
		 * 同時に債権共通サービスのための引数を作成する
		 * 
		 * @param baseR 基本情報
		 * @param rcvActR 実績ヘッダ情報
		 * @param delRcvActDL 削除対象の入金実績明細情報
		 * @return 債権共通サービスの引数
		 */
		protected MCList<ArCmn_Upd01_DtlR> insCanRcvActD(RcvAct_BaseR baseR,
				MST_RCV_ACT_R rcvActR, MCList<MST_RCV_ACT_D_R> delRcvActDL) {

			MCList<ArCmn_Upd01_DtlR> arInL = MCList.create(ArCmn_Upd01_DtlR.class);

			for (MST_RCV_ACT_D_R rcvActDR : delRcvActDL) {

				rcvActDR.setNumberNE("old_rcv_act_d_seq", rcvActDR.rcv_act_d_seq());
				rcvActDR.setNumberNE("can_rcv_act_d_seq", rcvActDR.rcv_act_d_seq().add(1));

				rcvActDR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq().add(1));
				rcvActDR.rcv_act_no(baseR.rcv_act_no());
				rcvActDR.rcv_act_seq(baseR.can_rcv_act_seq());
				rcvActDR.trd_cur_amt1(rcvActDR.trd_cur_amt1().negate());
				rcvActDR.trd_cur_amt2(rcvActDR.trd_cur_amt2().negate());
				rcvActDR.trd_cur_amt3(rcvActDR.trd_cur_amt3().negate());
				rcvActDR.base_cur_amt1(rcvActDR.base_cur_amt1().negate());
				rcvActDR.base_cur_amt2(rcvActDR.base_cur_amt2().negate());
				rcvActDR.base_cur_amt3(rcvActDR.base_cur_amt3().negate());
				rcvActDR.trd_cur_tax_amt1(rcvActDR.trd_cur_tax_amt1().negate());
				rcvActDR.trd_cur_tax_amt2(rcvActDR.trd_cur_tax_amt2().negate());
				rcvActDR.trd_cur_tax_amt3(rcvActDR.trd_cur_tax_amt3().negate());
				rcvActDR.base_cur_tax_amt1(rcvActDR.base_cur_tax_amt1().negate());
				rcvActDR.base_cur_tax_amt2(rcvActDR.base_cur_tax_amt2().negate());
				rcvActDR.base_cur_tax_amt3(rcvActDR.base_cur_tax_amt3().negate());
				rcvActDR.trd_xrate(rcvActDR.trd_xrate());

				// rcvActDR → baseR
				baseR.setStringNE("rcv_act_d_no", rcvActDR.rcv_act_d_no());
				baseR.setNumberNE("old_rcv_act_d_seq", rcvActDR.getNumberNE("old_rcv_act_d_seq"));
				baseR.setNumberNE("can_rcv_act_d_seq", rcvActDR.rcv_act_d_seq());

				// 債権共通処理のための引数を設定する
				ArCmn_Upd01_DtlR arInR = ArCmn_Upd01_DtlR.create();
				executeQuery(arInR, MSBGL5020_MST_BILL_D_S01(), baseR);
				arInR.bill_basis_dt(rcvActR.bill_basis_dt());
				arInR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
				arInR.ar_appl_schd_no(getDelArApplSchdNo(rcvActDR, rcvActR));
				arInR.ar_dpt_cd(rcvActDR.ar_dpt_cd());
				arInR.bill_dpt_cd(rcvActDR.bill_dpt_cd());
				arInR.sls_dpt_cd(rcvActDR.bill_dpt_cd());
				arInR.bill_d_rmrks(rcvActDR.bill_d_rmrks());

				arInL.add(arInR);
			}

			MCQueryApiBuilder delRcvActDL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_D_I02", delRcvActDL, delRcvActDL_bldr);

			return arInL;
		}

		/**
		 * 売掛消込予定ＮＯ取得<br />
		 * 取消対象の入金実績明細に紐づく売掛消込予定ＮＯを取得する
		 * 
		 * @param rcvActDR 検索条件
		 * @return 検索結果の売掛消込予定ＮＯ
		 */
		protected String getDelArApplSchdNo(MST_RCV_ACT_D_R rcvActDR, MST_RCV_ACT_R rcvActR) {
			MST_AR_APPL_ACT_R arApplActR = MST_AR_APPL_ACT_R.create("T");
			MCQueryApiBuilder arApplActR_bldr = MCQueryApiBuilder.create(arApplActR);
			arApplActR_bldr.setSelect(arApplActR.ar_appl_schd_no);
			arApplActR_bldr.addWhereWithAnd(arApplActR.rcv_act_d_no.eq(bind("1")), rcvActDR.rcv_act_d_no());
			arApplActR_bldr.addWhereWithAnd(arApplActR.rcv_act_d_seq.eq(bind("1")), rcvActDR.getNumber("old_rcv_act_d_seq"));
			arApplActR_bldr.addWhereWithAnd(arApplActR.rcv_mtd_cd.eq(bind("1")), rcvActR.ar_sttl_cd1());
			dbSelect("MSBGL5020_MST_AR_APPL_ACT_S04", arApplActR, arApplActR_bldr);
			return arApplActR.ar_appl_schd_no();
		}

		/**
		 * 売掛明細消込の情報を設定する<br />
		 * 訂正時に訂正前の売掛明細消込を引き継いで再登録するが、以下のいずれかの場合は引き継がない。<br />
		 * ・売掛明細消込を保全できない項目が変更された場合<br />
		 * ・売掛明細消込情報が手動で指定された場合<br />
		 * ・請求先の自動明細消込ＦＬＧがオンの場合<br />
		 */
		protected void setBillDApplAct(RcvActCmn_Chk01_HdrR hdrR, MCList<RcvActCmn_Chk01_DtlR> dtlL,
				RcvAct_InfoR delRcvActInfoR, MCList<MST_RCV_ACT_D_R> delRcvActDL) {
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && !isNull(_applRecL)) {
				MCIndexKey delRcvActDIdx = delRcvActDL.createIndex(MST_RCV_ACT_D_R.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_seq);
				MCIndexKey up2Idx = up2().createIndex(RcvActCmn_Upd01_BillDR.$grp_seq);
				MCIndexKey applRecIdx = _applRecL.createIndex(RcvActCmn_Upd01_BillDApplActR.$rcv_act_d_no, RcvActCmn_Upd01_BillDApplActR.$rcv_act_d_seq);
				
				MCList<RcvActCmn_Upd01_BillDR> addBillDL = MCList.create(RcvActCmn_Upd01_BillDR.class);
				for (RcvActCmn_Chk01_DtlR dtlR : dtlL) {
					if (!isCopy(hdrR, dtlR, delRcvActInfoR, delRcvActDL, up2Idx, delRcvActDIdx)) {
						continue;
					}
					
					MCList<RcvActCmn_Upd01_BillDApplActR> tmpBillL = _applRecL.subList(applRecIdx, dtlR.rcv_act_d_no(), dtlR.rcv_act_d_seq());
					for (RcvActCmn_Upd01_BillDApplActR tmpBillR : tmpBillL) {
						RcvActCmn_Upd01_BillDR tmpTgtBillDR = RcvActCmn_Upd01_BillDR.create();
						tmpTgtBillDR.grp_seq(dtlR.grp_seq());
						tmpTgtBillDR.bill_d_no(tmpBillR.bill_d_no());
						tmpTgtBillDR.parent_bill_d_no(tmpBillR.parent_bill_d_no());
						tmpTgtBillDR.bill_mng_no(tmpBillR.appl_bill_mng_no());
						tmpTgtBillDR.appl_amt(tmpBillR.appl_amt());
						addBillDL.add(tmpTgtBillDR);
					}
				}
				up2().addAll(addBillDL);
			}
		}

		protected boolean isCopy(RcvActCmn_Chk01_HdrR hdrR, RcvActCmn_Chk01_DtlR dtlR,
				RcvAct_InfoR delRcvActInfoR, MCList<MST_RCV_ACT_D_R> delRcvActDL,
				MCIndexKey up2Idx, MCIndexKey delRcvActDIdx) {
			if (isChangedCols(hdrR, dtlR, delRcvActInfoR, delRcvActDL, delRcvActDIdx)
					|| !isEmptyBillDL(dtlR, up2Idx)
					|| isAutoLineAppl(dtlR)) {
				return false;
			}
			return true;
		}

		/**
		 * 売掛明細消込を保全できない項目が変更されたか判定する<br />
		 * 以下のいずれかの項目の値が変更された場合は、訂正前の売掛明細消込情報を引き継がない。<br />
		 * ・計上日：売掛明細消込にて受注状況を書き込む際に設定しているため<br />
		 * ・入金額あるいは相殺額：明細消込可能な金額が変わるため<br />
		 */
		protected boolean isChangedCols(RcvActCmn_Chk01_HdrR hdrR, RcvActCmn_Chk01_DtlR dtlR,
				RcvAct_InfoR delRcvActInfoR, MCList<MST_RCV_ACT_D_R> delRcvActDL, MCIndexKey delRcvActDIdx) {
			MST_RCV_ACT_D_R delRcvActDR = delRcvActDL.getFirst(delRcvActDIdx, dtlR.rcv_act_d_no(), dtlR.rcv_act_d_seq());
			if (isNewRow(delRcvActDR)
					|| !isSame(hdrR.ac_dt(), delRcvActInfoR.ac_dt())
					|| !isSame(nvl(dtlR.amt1(), MCNumber.ZERO), delRcvActDR.trd_cur_amt1())
					|| !isSame(nvl(dtlR.amt2(), MCNumber.ZERO), delRcvActDR.trd_cur_amt2())
					|| !isSame(nvl(dtlR.amt3(), MCNumber.ZERO), delRcvActDR.trd_cur_amt3())) {
				return true;
			}
			return false;
		}

		protected boolean isEmptyBillDL(RcvActCmn_Chk01_DtlR dtlR, MCIndexKey up2Idx) {
			MCList<RcvActCmn_Upd01_BillDR> tgtBillDL = up2().subList(up2Idx, dtlR.grp_seq());
			if (tgtBillDL.isEmpty()) {
				return true;
			}
			return false;
		}

		protected boolean isAutoLineAppl(RcvActCmn_Chk01_DtlR dtlR) {
			MAM_BP_R bpR = _bpCache.get(dtlR.bcst_cd());
			if (bpR.auto_line_appl_flg()) {
				return true;
			}
			return false;
		}

		protected boolean isNewRow(MST_RCV_ACT_D_R delRcvActDR) {
			if (isNull(delRcvActDR)) {
				return true;
			}
			return false;
		}

		// RcvActCmn_Chk01_HdrR → RcvAct_InfoR
		protected Map_RcvAct_InfoR_RcvActCmn_Chk01_HdrR<RcvAct_InfoR,RcvActCmn_Chk01_HdrR> createMap_RcvAct_InfoR_RcvActCmn_Chk01_HdrR() {
			return new Map_RcvAct_InfoR_RcvActCmn_Chk01_HdrR<RcvAct_InfoR, RcvActCmn_Chk01_HdrR>();
		}

		public class Map_RcvAct_InfoR_RcvActCmn_Chk01_HdrR<D extends RcvAct_InfoR, S extends RcvActCmn_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvAct_InfoR.$rcv_act_no, RcvActCmn_Chk01_HdrR.$rcv_act_no);
				addColumnPathMap(RcvAct_InfoR.$rcv_act_seq, RcvActCmn_Chk01_HdrR.$rcv_act_seq);
				addColumnPathMap(RcvAct_InfoR.$data_crud_typ, RcvActCmn_Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(RcvAct_InfoR.$can_ac_dt, RcvActCmn_Chk01_HdrR.$can_ac_dt);
				addColumnPathMap(RcvAct_InfoR.$dpt_cd, RcvActCmn_Chk01_HdrR.$dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$wg_cd, RcvActCmn_Chk01_HdrR.$wg_cd);
				addColumnPathMap(RcvAct_InfoR.$usr_cd, RcvActCmn_Chk01_HdrR.$usr_cd);
				addColumnPathMap(RcvAct_InfoR.$rcst_cd, RcvActCmn_Chk01_HdrR.$rcst_cd);
				addColumnPathMap(RcvAct_InfoR.$bcst_cd, RcvActCmn_Chk01_HdrR.$bcst_cd);
				addColumnPathMap(RcvAct_InfoR.$bill_dpt_cd, RcvActCmn_Chk01_HdrR.$bill_dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$ac_dt, RcvActCmn_Chk01_HdrR.$ac_dt);
				addColumnPathMap(RcvAct_InfoR.$ac_ym, RcvActCmn_Chk01_HdrR.$ac_ym);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd1, RcvActCmn_Chk01_HdrR.$ar_sttl_cd1);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ1, RcvActCmn_Chk01_HdrR.$ar_sttl_typ1);
				addColumnPathMap(RcvAct_InfoR.$tax_cd1, RcvActCmn_Chk01_HdrR.$tax_cd1);
				addColumnPathMap(RcvAct_InfoR.$tax_typ1, RcvActCmn_Chk01_HdrR.$tax_typ1);
				addColumnPathMap(RcvAct_InfoR.$tax_rate1, RcvActCmn_Chk01_HdrR.$tax_rate1);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd2, RcvActCmn_Chk01_HdrR.$ar_sttl_cd2);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ2, RcvActCmn_Chk01_HdrR.$ar_sttl_typ2);
				addColumnPathMap(RcvAct_InfoR.$tax_cd2, RcvActCmn_Chk01_HdrR.$tax_cd2);
				addColumnPathMap(RcvAct_InfoR.$tax_typ2, RcvActCmn_Chk01_HdrR.$tax_typ2);
				addColumnPathMap(RcvAct_InfoR.$tax_rate2, RcvActCmn_Chk01_HdrR.$tax_rate2);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd3, RcvActCmn_Chk01_HdrR.$ar_sttl_cd3);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ3, RcvActCmn_Chk01_HdrR.$ar_sttl_typ3);
				addColumnPathMap(RcvAct_InfoR.$tax_cd3, RcvActCmn_Chk01_HdrR.$tax_cd3);
				addColumnPathMap(RcvAct_InfoR.$tax_typ3, RcvActCmn_Chk01_HdrR.$tax_typ3);
				addColumnPathMap(RcvAct_InfoR.$tax_rate3, RcvActCmn_Chk01_HdrR.$tax_rate3);
				addColumnPathMap(RcvAct_InfoR.$trd_cd, RcvActCmn_Chk01_HdrR.$trd_cd);
				addColumnPathMap(RcvAct_InfoR.$ar_trd_grp_typ, RcvActCmn_Chk01_HdrR.$ar_trd_grp_typ);
				addColumnPathMap(RcvAct_InfoR.$trd_ptn_typ, RcvActCmn_Chk01_HdrR.$trd_ptn_typ);
				addColumnPathMap(RcvAct_InfoR.$bill_basis_dt, RcvActCmn_Chk01_HdrR.$bill_basis_dt);
				addColumnPathMap(RcvAct_InfoR.$rcv_no, RcvActCmn_Chk01_HdrR.$rcv_no);
				addColumnPathMap(RcvAct_InfoR.$slo_no, RcvActCmn_Chk01_HdrR.$slo_no);
				addColumnPathMap(RcvAct_InfoR.$rcv_dt, RcvActCmn_Chk01_HdrR.$rcv_dt);
				addColumnPathMap(RcvAct_InfoR.$bank_ac_cd, RcvActCmn_Chk01_HdrR.$bank_ac_cd);
				addColumnPathMap(RcvAct_InfoR.$xfr_psn, RcvActCmn_Chk01_HdrR.$xfr_psn);
				addColumnPathMap(RcvAct_InfoR.$trd_rmrks, RcvActCmn_Chk01_HdrR.$trd_rmrks);
				addColumnPathMap(RcvAct_InfoR.$note_no, RcvActCmn_Chk01_HdrR.$note_no);
				addColumnPathMap(RcvAct_InfoR.$note_mng_no, RcvActCmn_Chk01_HdrR.$note_mng_no);
				addColumnPathMap(RcvAct_InfoR.$note_typ, RcvActCmn_Chk01_HdrR.$note_typ);
				addColumnPathMap(RcvAct_InfoR.$draw_dt, RcvActCmn_Chk01_HdrR.$draw_dt);
				addColumnPathMap(RcvAct_InfoR.$due_dt, RcvActCmn_Chk01_HdrR.$due_dt);
				addColumnPathMap(RcvAct_InfoR.$drawer_nm, RcvActCmn_Chk01_HdrR.$drawer_nm);
				addColumnPathMap(RcvAct_InfoR.$draw_bank_cd, RcvActCmn_Chk01_HdrR.$draw_bank_cd);
				addColumnPathMap(RcvAct_InfoR.$draw_branch_cd, RcvActCmn_Chk01_HdrR.$draw_branch_cd);
				addColumnPathMap(RcvAct_InfoR.$endrsr, RcvActCmn_Chk01_HdrR.$endrsr);
				addColumnPathMap(RcvAct_InfoR.$accptr, RcvActCmn_Chk01_HdrR.$accptr);
				addColumnPathMap(RcvAct_InfoR.$note_rsn_cd, RcvActCmn_Chk01_HdrR.$note_rsn_cd);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_id_typ, RcvActCmn_Chk01_HdrR.$debt_cred_id_typ);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_id_cd, RcvActCmn_Chk01_HdrR.$debt_cred_id_cd);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_nm, RcvActCmn_Chk01_HdrR.$debt_cred_nm);
				addColumnPathMap(RcvAct_InfoR.$bd_dpt_cd, RcvActCmn_Chk01_HdrR.$bd_dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$trd_cur_cd, RcvActCmn_Chk01_HdrR.$trd_cur_cd);
				addColumnPathMap(RcvAct_InfoR.$xrate, RcvActCmn_Chk01_HdrR.$xrate);
				addColumnPathMap(RcvAct_InfoR.$xrate_cd, RcvActCmn_Chk01_HdrR.$xrate_cd);
				addColumnPathMap(RcvAct_InfoR.$rcv_auto_appl_flg, RcvActCmn_Chk01_HdrR.$rcv_auto_appl_flg);
				addColumnPathMap(RcvAct_InfoR.$bill_dtl_adv_flg, RcvActCmn_Chk01_HdrR.$bill_dtl_adv_flg);
				addColumnPathMap(RcvAct_InfoR.$sub_char1, RcvActCmn_Chk01_HdrR.$sub_char1);
				addColumnPathMap(RcvAct_InfoR.$sub_char2, RcvActCmn_Chk01_HdrR.$sub_char2);
				addColumnPathMap(RcvAct_InfoR.$sub_char3, RcvActCmn_Chk01_HdrR.$sub_char3);
				addColumnPathMap(RcvAct_InfoR.$note_sub_char1, RcvActCmn_Chk01_HdrR.$note_sub_char1);
				addColumnPathMap(RcvAct_InfoR.$note_sub_char2, RcvActCmn_Chk01_HdrR.$note_sub_char2);
				addColumnPathMap(RcvAct_InfoR.$note_sub_char3, RcvActCmn_Chk01_HdrR.$note_sub_char3);
			}
			@Override
			public void valueCopy(D dest, S src) {
				// 削除以外の場合、計上年月をセット
				if (isNull(dest.ac_ym()) && !MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.ac_ym(getAcYm(src.ac_dt()));
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ()) && !MAC_AR_STTL_TYP.isNOTE(src.ar_sttl_typ1())) {
					dest.note_mng_no(null);
				}
			}
		}

		// RcvActCmn_Chk01_DtlR → RcvActD_InfoR
		protected Map_RcvActD_InfoR_RcvActCmn_Chk01_DtlR<RcvActD_InfoR,RcvActCmn_Chk01_DtlR> createMap_RcvActD_InfoR_RcvActCmn_Chk01_DtlR() {
			return new Map_RcvActD_InfoR_RcvActCmn_Chk01_DtlR<RcvActD_InfoR, RcvActCmn_Chk01_DtlR>();
		}

		public class Map_RcvActD_InfoR_RcvActCmn_Chk01_DtlR<D extends RcvActD_InfoR, S extends RcvActCmn_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActD_InfoR.$grp_seq, RcvActCmn_Chk01_DtlR.$grp_seq);
				addColumnPathMap(RcvActD_InfoR.$tgt_rcv_bill_mng_no, RcvActCmn_Chk01_DtlR.$bill_mng_no);
				addColumnPathMap(RcvActD_InfoR.$bcst_cd, RcvActCmn_Chk01_DtlR.$bcst_cd);
				addColumnPathMap(RcvActD_InfoR.$bill_dpt_cd, RcvActCmn_Chk01_DtlR.$bill_dpt_cd);
				addColumnPathMap(RcvActD_InfoR.$acst_cd, RcvActCmn_Chk01_DtlR.$acst_cd);
				addColumnPathMap(RcvActD_InfoR.$ar_dpt_cd, RcvActCmn_Chk01_DtlR.$ar_dpt_cd);
				addColumnPathMap(RcvActD_InfoR.$wg_cd, RcvActCmn_Chk01_DtlR.$wg_cd);
				addColumnPathMap(RcvActD_InfoR.$iv_no, RcvActCmn_Chk01_DtlR.$iv_no);
				addColumnPathMap(RcvActD_InfoR.$wrk_no, RcvActCmn_Chk01_DtlR.$wrk_no);
				addColumnPathMap(RcvActD_InfoR.$ar_typ, RcvActCmn_Chk01_DtlR.$ar_typ);
				addColumnPathMap(RcvActD_InfoR.$ar_sttl_cd1, RcvActCmn_Chk01_DtlR.$ar_sttl_cd1);
				addColumnPathMap(RcvActD_InfoR.$ar_sttl_typ1, RcvActCmn_Chk01_DtlR.$ar_sttl_typ1);
				addColumnPathMap(RcvActD_InfoR.$amt1, RcvActCmn_Chk01_DtlR.$amt1);
				addColumnPathMap(RcvActD_InfoR.$amt2, RcvActCmn_Chk01_DtlR.$amt2);
				addColumnPathMap(RcvActD_InfoR.$amt3, RcvActCmn_Chk01_DtlR.$amt3);
				addColumnPathMap(RcvActD_InfoR.$bill_d_rmrks, RcvActCmn_Chk01_DtlR.$bill_d_rmrks);
				addColumnPathMap(RcvActD_InfoR.$ar_appl_schd_no, RcvActCmn_Chk01_DtlR.$ar_appl_schd_no);
				addColumnPathMap(RcvActD_InfoR.$rcv_act_d_no, RcvActCmn_Chk01_DtlR.$rcv_act_d_no);
				addColumnPathMap(RcvActD_InfoR.$rcv_act_d_seq, RcvActCmn_Chk01_DtlR.$rcv_act_d_seq);
			}
		}

		// MST_RCV_ACT_R → RcvAct_InfoR
		protected Map_RcvAct_InfoR_MST_RCV_ACT_R<RcvAct_InfoR,MST_RCV_ACT_R> createMap_RcvAct_InfoR_MST_RCV_ACT_R() {
			return new Map_RcvAct_InfoR_MST_RCV_ACT_R<RcvAct_InfoR, MST_RCV_ACT_R>();
		}

		public class Map_RcvAct_InfoR_MST_RCV_ACT_R<D extends RcvAct_InfoR, S extends MST_RCV_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvAct_InfoR.$rcv_act_no, MST_RCV_ACT_R.$rcv_act_no);
				addColumnPathMap(RcvAct_InfoR.$rcv_act_seq, MST_RCV_ACT_R.$rcv_act_seq);
				addColumnPathMap(RcvAct_InfoR.$rcv_act_rev, MST_RCV_ACT_R.$rcv_act_rev);
				addColumnPathMap(RcvAct_InfoR.$dpt_cd, MST_RCV_ACT_R.$dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$wg_cd, MST_RCV_ACT_R.$wg_cd);
				addColumnPathMap(RcvAct_InfoR.$usr_cd, MST_RCV_ACT_R.$usr_cd);
				addColumnPathMap(RcvAct_InfoR.$rcst_cd, MST_RCV_ACT_R.$rcst_cd);
				addColumnPathMap(RcvAct_InfoR.$bcst_cd, MST_RCV_ACT_R.$bcst_cd);
				addColumnPathMap(RcvAct_InfoR.$cred_cd, MST_RCV_ACT_R.$cred_cd);
				addColumnPathMap(RcvAct_InfoR.$bill_dpt_cd, MST_RCV_ACT_R.$bill_dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$ac_dt, MST_RCV_ACT_R.$ac_dt);
				addColumnPathMap(RcvAct_InfoR.$ac_ym, MST_RCV_ACT_R.$ac_ym);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd1, MST_RCV_ACT_R.$ar_sttl_cd1);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ1, MST_RCV_ACT_R.$ar_sttl_typ1);
				addColumnPathMap(RcvAct_InfoR.$tax_cd1, MST_RCV_ACT_R.$tax_cd1);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd2, MST_RCV_ACT_R.$ar_sttl_cd2);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ2, MST_RCV_ACT_R.$ar_sttl_typ2);
				addColumnPathMap(RcvAct_InfoR.$tax_cd2, MST_RCV_ACT_R.$tax_cd2);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_cd3, MST_RCV_ACT_R.$ar_sttl_cd3);
				addColumnPathMap(RcvAct_InfoR.$ar_sttl_typ3, MST_RCV_ACT_R.$ar_sttl_typ3);
				addColumnPathMap(RcvAct_InfoR.$tax_cd3, MST_RCV_ACT_R.$tax_cd3);
				addColumnPathMap(RcvAct_InfoR.$trd_cd, MST_RCV_ACT_R.$trd_cd);
				addColumnPathMap(RcvAct_InfoR.$ar_trd_grp_typ, MST_RCV_ACT_R.$ar_trd_grp_typ);
				addColumnPathMap(RcvAct_InfoR.$trd_ptn_typ, MST_RCV_ACT_R.$trd_ptn_typ);
				addColumnPathMap(RcvAct_InfoR.$bill_basis_dt, MST_RCV_ACT_R.$bill_basis_dt);
				addColumnPathMap(RcvAct_InfoR.$rcv_no, MST_RCV_ACT_R.$rcv_no);
				addColumnPathMap(RcvAct_InfoR.$rcv_dt, MST_RCV_ACT_R.$rcv_dt);
				addColumnPathMap(RcvAct_InfoR.$bank_ac_cd, MST_RCV_ACT_R.$bank_ac_cd);
				addColumnPathMap(RcvAct_InfoR.$xfr_psn, MST_RCV_ACT_R.$xfr_psn);
				addColumnPathMap(RcvAct_InfoR.$trd_rmrks, MST_RCV_ACT_R.$trd_rmrks);
				addColumnPathMap(RcvAct_InfoR.$note_no, MST_RCV_ACT_R.$note_no);
				addColumnPathMap(RcvAct_InfoR.$note_mng_no, MST_RCV_ACT_R.$note_mng_no);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_id_typ, MST_RCV_ACT_R.$debt_cred_id_typ);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_id_cd, MST_RCV_ACT_R.$debt_cred_id_cd);
				addColumnPathMap(RcvAct_InfoR.$debt_cred_nm, MST_RCV_ACT_R.$debt_cred_nm);
				addColumnPathMap(RcvAct_InfoR.$bd_dpt_cd, MST_RCV_ACT_R.$bd_dpt_cd);
				addColumnPathMap(RcvAct_InfoR.$trd_cur_cd, MST_RCV_ACT_R.$trd_cur_cd);
				addColumnPathMap(RcvAct_InfoR.$xrate, MST_RCV_ACT_R.$xrate);
				addColumnPathMap(RcvAct_InfoR.$xrate_cd, MST_RCV_ACT_R.$xrate_cd);
				addColumnPathMap(RcvAct_InfoR.$rcv_auto_appl_flg, MST_RCV_ACT_R.$rcv_auto_appl_flg);
				addColumnPathMap(RcvAct_InfoR.$tax_amt, MST_RCV_ACT_R.$tax_amt);
				addColumnPathMap(RcvAct_InfoR.$tax_subttl1, MST_RCV_ACT_R.$tax_subttl1);
				addColumnPathMap(RcvAct_InfoR.$tax_subttl2, MST_RCV_ACT_R.$tax_subttl2);
				addColumnPathMap(RcvAct_InfoR.$tax_subttl3, MST_RCV_ACT_R.$tax_subttl3);
				addColumnPathMap(RcvAct_InfoR.$subttl1, MST_RCV_ACT_R.$subttl1);
				addColumnPathMap(RcvAct_InfoR.$subttl2, MST_RCV_ACT_R.$subttl2);
				addColumnPathMap(RcvAct_InfoR.$subttl3, MST_RCV_ACT_R.$subttl3);
				addColumnPathMap(RcvAct_InfoR.$slip_sts_typ, MST_RCV_ACT_R.$slip_sts_typ);
				addColumnPathMap(RcvAct_InfoR.$base_cur_cd, MST_RCV_ACT_R.$base_cur_cd);
				addColumnPathMap(RcvAct_InfoR.$base_cur_amt, MST_RCV_ACT_R.$base_cur_amt);
				addColumnPathMap(RcvAct_InfoR.$base_cur_subttl1, MST_RCV_ACT_R.$base_cur_subttl1);
				addColumnPathMap(RcvAct_InfoR.$base_cur_subttl2, MST_RCV_ACT_R.$base_cur_subttl2);
				addColumnPathMap(RcvAct_InfoR.$base_cur_subttl3, MST_RCV_ACT_R.$base_cur_subttl3);
				addColumnPathMap(RcvAct_InfoR.$par_rcv_act_no, MST_RCV_ACT_R.$par_rcv_act_no);
				addColumnPathMap(RcvAct_InfoR.$par_rcv_act_seq, MST_RCV_ACT_R.$par_rcv_act_seq);
				addColumnPathMap(RcvAct_InfoR.$base_cur_tax_amt, MST_RCV_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(RcvAct_InfoR.$base_cur_tax_subttl1, MST_RCV_ACT_R.$base_cur_tax_subttl1);
				addColumnPathMap(RcvAct_InfoR.$base_cur_tax_subttl2, MST_RCV_ACT_R.$base_cur_tax_subttl2);
				addColumnPathMap(RcvAct_InfoR.$base_cur_tax_subttl3, MST_RCV_ACT_R.$base_cur_tax_subttl3);
				addColumnPathMap(RcvAct_InfoR.$prnt_flg, MST_RCV_ACT_R.$prnt_flg);
				addColumnPathMap(RcvAct_InfoR.$sub_char1, MST_RCV_ACT_R.$sub_char1);
				addColumnPathMap(RcvAct_InfoR.$sub_char2, MST_RCV_ACT_R.$sub_char2);
				addColumnPathMap(RcvAct_InfoR.$sub_char3, MST_RCV_ACT_R.$sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.mat_flg(src.getBoolean("mat_flg"));
			}
		}

		// RcvAct_InfoR → MST_NOTE_R
		protected Map_MST_NOTE_R_RcvAct_InfoR<MST_NOTE_R,RcvAct_InfoR> createMap_MST_NOTE_R_RcvAct_InfoR() {
			return new Map_MST_NOTE_R_RcvAct_InfoR<MST_NOTE_R, RcvAct_InfoR>();
		}

		public class Map_MST_NOTE_R_RcvAct_InfoR<D extends MST_NOTE_R, S extends RcvAct_InfoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_NOTE_R.$note_no, RcvAct_InfoR.$note_no);
				addColumnPathMap(MST_NOTE_R.$note_typ, RcvAct_InfoR.$note_typ);
				addColumnPathMap(MST_NOTE_R.$draw_dt, RcvAct_InfoR.$draw_dt);
				addColumnPathMap(MST_NOTE_R.$due_dt, RcvAct_InfoR.$due_dt);
				addColumnPathMap(MST_NOTE_R.$drawer_nm, RcvAct_InfoR.$drawer_nm);
				addColumnPathMap(MST_NOTE_R.$draw_bank_cd, RcvAct_InfoR.$draw_bank_cd);
				addColumnPathMap(MST_NOTE_R.$draw_branch_cd, RcvAct_InfoR.$draw_branch_cd);
				addColumnPathMap(MST_NOTE_R.$endrsr, RcvAct_InfoR.$endrsr);
				addColumnPathMap(MST_NOTE_R.$accptr, RcvAct_InfoR.$accptr);
				addColumnPathMap(MST_NOTE_R.$note_rsn_cd, RcvAct_InfoR.$note_rsn_cd);
				addColumnPathMap(MST_NOTE_R.$mat_flg, RcvAct_InfoR.$mat_flg);
				addColumnPathMap(MST_NOTE_R.$sub_char1, RcvAct_InfoR.$note_sub_char1);
				addColumnPathMap(MST_NOTE_R.$sub_char2, RcvAct_InfoR.$note_sub_char2);
				addColumnPathMap(MST_NOTE_R.$sub_char3, RcvAct_InfoR.$note_sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.note_mng_no(getStrSeq(MSC_NUM_SYS_TYP.NOTEMNG));
				dest.note_amt(src.subttl1());
				dest.appl_amt(src.subttl1());
				dest.not_appl_bal(0);
				dest.susp_amt(0);
				dest.adv_amt(0);
			}
		}

		// MST_RCV_ACT_D_R → RcvActD_InfoR
		protected Map_RcvActD_InfoR_MST_RCV_ACT_D_R<RcvActD_InfoR,MST_RCV_ACT_D_R> createMap_RcvActD_InfoR_MST_RCV_ACT_D_R() {
			return new Map_RcvActD_InfoR_MST_RCV_ACT_D_R<RcvActD_InfoR, MST_RCV_ACT_D_R>();
		}

		public class Map_RcvActD_InfoR_MST_RCV_ACT_D_R<D extends RcvActD_InfoR, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvActD_InfoR.$bcst_cd, MST_RCV_ACT_D_R.$bcst_cd);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.amt1(src.trd_cur_amt1().negate());
				dest.amt2(src.trd_cur_amt2().negate());
				dest.amt3(src.trd_cur_amt3().negate());
			}
		}
	}

	/**
	 * RcvActCmn_Upd02オペレーション.<p>
	 *
	 * 請求残高振替の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Upd02 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {
			for (RcvActCmn_Chk02_HdrR hdrR : up0()) {
				RcvActCmn_Chk02_SwToR swToR = up1().getFirst(RcvActCmn_Chk02_SwToR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());
				MCList<RcvActCmn_Chk02_SwFrR> swFrL = up2().subList(RcvActCmn_Chk02_SwFrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());
				execMain(hdrR, swToR, swFrL);
			}
		}

		/**
		 * メイン処理実行<br />
		 * 上り電文のヘッダ単位にメイン処理を実行します
		 * 
		 * @param hdrR
		 * @param swToR
		 * @param swFrL
		 */
		protected void execMain(RcvActCmn_Chk02_HdrR hdrR,
				RcvActCmn_Chk02_SwToR swToR, MCList<RcvActCmn_Chk02_SwFrR> swFrL) {

			// 振替元基本情報
			MCList<RcvActCmn_Upd02_SwBaseR> baseFrL = createFrSwBase(hdrR, swFrL);
			MCList<RcvActD_InfoR> dFrL = createFrDtlBase(hdrR, baseFrL);
			
			MCIndexKey rcvActPegKey = baseFrL.createIndex(RcvActCmn_Upd02_SwBaseR.$rcv_act_peg);
			// 為替レートごとに入金実績ヘッダを登録するため、振替元情報を為替レートでグループ化
			for (MCList<RcvActD_InfoR> dFrXrateL : dFrL.groupList(RcvActD_InfoR.$trd_xrate)) {
				MCList<RcvActCmn_Upd02_SwBaseR> baseFrTgtL = MCList.create(RcvActCmn_Upd02_SwBaseR.class);
				// 処理中のリスト「dFrXrateL」に紐づく上り電文を抽出
				for (RcvActD_InfoR dFrXrateR : dFrXrateL.groupBy(RcvActD_InfoR.$rcv_act_peg)) {
					baseFrTgtL.addAll(baseFrL.subList(rcvActPegKey, dFrXrateR.rcv_act_peg()));
				}
				adjustBaseCurAmt(hdrR.trd_cur_cd(), dFrXrateL, baseFrTgtL);
				RcvAct_InfoR hFrR = createFrHdrBase(hdrR, swToR, baseFrTgtL);
				RcvAct_BaseR rcvActFrR = createRcvActBaseForSw(hFrR);
				setHdrXrate(hFrR, swToR, hdrR, dFrXrateL);

				// 振替先基本情報
				RcvAct_InfoR hToR = createToHdrBase(hdrR, swToR, baseFrTgtL);
				MCList<RcvActD_InfoR> dToL = createToDtlBase(hdrR, swToR, baseFrTgtL);
				RcvAct_BaseR rcvActToR = createRcvActBaseForSw(hToR);

				// 振替元更新
				MCList<MST_RCV_ACT_D_R> rcvActDL = updFr(hFrR, dFrXrateL, baseFrTgtL, rcvActFrR, rcvActToR);

				// 振替先更新
				updTo(hToR, dToL, rcvActToR, baseFrTgtL, swToR);

				// 入金実績ＩＦ作成サービス
				execRcvActIfCrtService(rcvActDL);

				// 振替伝票発行
				prnt(rcvActFrR.rcv_act_no(), rcvActFrR.rcv_act_seq());
			}
		}

		protected void adjustBaseCurAmt(String trdCurCd, MCList<RcvActD_InfoR> dtlFrL, MCList<RcvActCmn_Upd02_SwBaseR> grpList)	{
			MCIndexKey key = grpList.createIndex(RcvActCmn_Upd02_SwBaseR.$rcv_act_peg);
			for (RcvActD_InfoR dtlFrR : dtlFrL) {
				if (needsAdjustBaseCurAmt(trdCurCd, dtlFrR.acst_cd(), dtlFrR.ar_dpt_cd(), dtlFrR.iv_no(), dtlFrR.wrk_no(), dtlFrR.ar_typ(),	dtlFrR.amt1())) {
					MCNumber diffAmt = calcBaseCurDiff(trdCurCd, dtlFrR.acst_cd(), dtlFrR.ar_dpt_cd(), dtlFrR.iv_no(), dtlFrR.wrk_no(),
							dtlFrR.ar_typ(), dtlFrR.bcst_cd(), dtlFrR.bill_dpt_cd(), dtlFrR.base_cur_amt1());
					if (!diffAmt.isZero()) {
						dtlFrR.base_cur_amt1(dtlFrR.base_cur_amt1().add(diffAmt.negate()));
						MCList<RcvActCmn_Upd02_SwBaseR> tgtGrpList = grpList.subList(key, dtlFrR.rcv_act_peg());
						FXUCC_Divide.prop(tgtGrpList, diffAmt.negate(), getBaseCur().amt_dec_place().intValue(),
								RcvActCmn_Upd02_SwBaseR.$base_cur_sw_amt, RcvActCmn_Upd02_SwBaseR.$base_cur_amt_add);
						for (RcvActCmn_Upd02_SwBaseR r : tgtGrpList) {
							r.base_cur_sw_amt(r.base_cur_sw_amt().add(r.base_cur_amt_add()));
						}
					}
				}
			}
		}

		/**
		 * 振替元のヘッダ基本情報を設定する
		 * 
		 * @param hdrR
		 * @param swToR
		 * @param swFrL
		 * @return 振替元ヘッダ基本情報
		 */
		protected RcvAct_InfoR createFrHdrBase(RcvActCmn_Chk02_HdrR hdrR,
				RcvActCmn_Chk02_SwToR swToR, MCList<RcvActCmn_Upd02_SwBaseR> swFrL) {
			RcvAct_InfoR hR = RcvAct_InfoR.create();
			hR.setAttributes(hdrR);

			hR.data_crud_typ(hdrR.data_crud_typ());
			hR.dpt_cd(hdrR.dpt_cd());
			hR.wg_cd(hdrR.wg_cd());
			hR.usr_cd(hdrR.usr_cd());
			hR.ac_dt(hdrR.ac_dt());
			hR.ac_ym(hdrR.ac_ym());
			hR.trd_cd(hdrR.trd_cd());
			hR.bill_basis_dt(hdrR.bill_basis_dt());
			hR.ar_trd_grp_typ(hdrR.ar_trd_grp_typ());
			hR.trd_ptn_typ(hdrR.trd_ptn_typ());
			hR.rcv_dt(hdrR.rcv_dt());
			hR.trd_rmrks(hdrR.trd_rmrks());
			hR.trd_cur_cd(swFrL.get(0).trd_cur_cd());
			hR.base_cur_cd(getCo().base_cur_cd());
			hR.xrate(swToR.xrate());
			hR.xrate_cd(swToR.xrate_cd());
			hR.subttl1(swFrL.sum(RcvActCmn_Chk02_SwFrR.$sw_amt));
			hR.subttl2(0);
			hR.subttl3(0);
			hR.amt(hR.subttl1());
			hR.tax_subttl1(0);
			hR.tax_subttl2(0);
			hR.tax_subttl3(0);
			hR.tax_amt(0);
			hR.base_cur_subttl1(swFrL.sum(RcvActCmn_Chk02_SwFrR.$base_cur_sw_amt));
			hR.base_cur_subttl2(0);
			hR.base_cur_subttl3(0);
			hR.base_cur_amt(hR.base_cur_subttl1());
			hR.base_cur_tax_subttl1(0);
			hR.base_cur_tax_subttl2(0);
			hR.base_cur_tax_subttl3(0);
			hR.base_cur_tax_amt(0);
			hR.sub_char1(hdrR.sub_char1());
			hR.sub_char2(hdrR.sub_char2());
			hR.sub_char3(hdrR.sub_char3());

			return hR;
		}

		/**
		 * 振替元基本情報の作成
		 * @param swFrL
		 * @return 振替元基本情報
		 */
		protected MCList<RcvActCmn_Upd02_SwBaseR> createFrSwBase(
				RcvActCmn_Chk02_HdrR hdrR, MCList<RcvActCmn_Chk02_SwFrR> swFrL) {
			MCList<RcvActCmn_Upd02_SwBaseR> swBaseL = MCList.create(RcvActCmn_Upd02_SwBaseR.class);

			for (RcvActCmn_Chk02_SwFrR frR : swFrL) {
				RcvActCmn_Upd02_SwBaseR frBaseR = getFrBase(frR, hdrR);
				swBaseL.add(frBaseR);
			}

			return swBaseL;
		}

		/**
		 * 振替元基本情報を検索する
		 * 
		 * @param frR
		 * @return 検索結果
		 */
		protected RcvActCmn_Upd02_SwBaseR getFrBase(
				RcvActCmn_Chk02_SwFrR frR, RcvActCmn_Chk02_HdrR hdrR) {
			RcvActCmn_Upd02_SwBaseR frBaseR = RcvActCmn_Upd02_SwBaseR.create();

			executeQuery(frBaseR, MSBGL5020_MST_BILL_D_APPL_BAL_S01(), frR);

			frBaseR.sw_amt(frR.sw_amt());
			frBaseR.base_cur_sw_amt(frR.base_cur_sw_amt());
			frBaseR.sw_dt(hdrR.rcv_dt());

			return frBaseR;
		}

		/**
		 * 振替元の明細基本情報を作成する
		 * 
		 * @param hdrR
		 * @param baseFrL
		 * @return 振替元明細基本情報
		 */
		protected MCList<RcvActD_InfoR> createFrDtlBase(
				RcvActCmn_Chk02_HdrR hdrR, MCList<RcvActCmn_Upd02_SwBaseR> baseFrL) {

			MCList<RcvActD_InfoR> dtlFrL = MCList.create(RcvActD_InfoR.class);
			MCList<RcvActCmn_Upd02_SwBaseR> grpL = baseFrL.groupBy(getFrDtlBaseGroupByPolicy());
			MCIndexKey baseKeyBillNo = baseFrL.createIndex(RcvActCmn_Upd02_SwBaseR.$bill_d_no);
			int rcvActPeg = 0;
			for (RcvActCmn_Upd02_SwBaseR grpR : grpL) {
				RcvActD_InfoR dtlFrR = RcvActD_InfoR.create();
				rcvActPeg++;
				dtlFrR.rcv_act_peg(MCNumber.valueOf(rcvActPeg));
				dtlFrR.setAttributes(hdrR);

				dtlFrR.bcst_cd(grpR.bcst_cd());
				dtlFrR.bill_dpt_cd(grpR.bill_dpt_cd());
				dtlFrR.acst_cd(grpR.acst_cd());
				dtlFrR.ar_dpt_cd(grpR.ar_dpt_cd());
				dtlFrR.wg_cd(grpR.wg_cd());
				dtlFrR.iv_no(grpR.iv_no());
				dtlFrR.bill_iv_no(grpR.bill_iv_no());
				dtlFrR.wrk_no(grpR.wrk_no());
				dtlFrR.ar_typ(grpR.ar_typ());
				dtlFrR.amt1(grpR.sw_amt());
				dtlFrR.amt2(0);
				dtlFrR.amt3(0);
				dtlFrR.tax_amt1(0);
				dtlFrR.tax_amt2(0);
				dtlFrR.tax_amt3(0);
				dtlFrR.base_cur_amt1(grpR.base_cur_sw_amt());
				dtlFrR.base_cur_amt2(0);
				dtlFrR.base_cur_amt3(0);
				dtlFrR.base_cur_tax_amt1(0);
				dtlFrR.base_cur_tax_amt2(0);
				dtlFrR.base_cur_tax_amt3(0);
				dtlFrR.exc_gain_loss(0);
				if (isSame(getBaseCur().cur_cd(), hdrR.trd_cur_cd())) {
					dtlFrR.trd_xrate(1);
				}

				MCList<RcvActCmn_Upd02_SwBaseR> subGrpList = baseFrL.subList(getFromDtlBaseGroupKey(), getBaseFrVal(grpR));
				dtlFrR.trd_xrate(srchXrate(subGrpList, grpR, baseFrL, hdrR, baseKeyBillNo));
				// 振替元入金実績明細に設定する為替レートで、振替元請求明細の基準通貨金額を再計算する
				for (RcvActCmn_Upd02_SwBaseR subGrpR : subGrpList) {
					subGrpR.rcv_act_peg(MCNumber.valueOf(rcvActPeg));
					subGrpR.xrate(dtlFrR.trd_xrate());
					subGrpR.base_cur_sw_amt(
							convToBaseCur(subGrpR.sw_amt(), dtlFrR.trd_xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				}
				// 振替元入金実績明細に対応する、振替元請求明細の合計値
				dtlFrR.base_cur_amt1(subGrpList.sum(RcvActCmn_Upd02_SwBaseR.$base_cur_sw_amt));
				dtlFrL.add(dtlFrR);
			}

			return dtlFrL;
		}
			
		
		protected Comparable<?>[] getBaseFrVal(RcvActCmn_Upd02_SwBaseR grpR) {
			return new Comparable<?>[] {
					grpR.bcst_cd(), grpR.bill_dpt_cd(), grpR.acst_cd(), grpR.ar_dpt_cd(), grpR.wg_cd(), grpR.iv_no(), grpR.bill_iv_no(),
					grpR.wrk_no(), grpR.ar_typ(), grpR.xrate()
			};
		}

		protected Comparable<?>[] getBaseToVal(RcvActCmn_Upd02_SwBaseR grpR) {
			return new Comparable<?>[] {
					grpR.iv_no(), grpR.ar_typ(), grpR.xrate()
			};
		}
		protected void setHdrXrate(RcvAct_InfoR hFrR, RcvActCmn_Chk02_SwToR swToR, RcvActCmn_Chk02_HdrR hdrR, MCList<RcvActD_InfoR> dFrL) {
			RcvActD_InfoR dFrR = dFrL.get(0);
			if (isSame(getBaseCur().cur_cd(), hdrR.trd_cur_cd())) {
				hFrR.xrate(1);
				swToR.xrate(1);
			}
			else {
				hFrR.xrate(dFrR.trd_xrate());
				swToR.xrate(dFrR.trd_xrate());
			}
		}
		
		/**
		 * 振替元の入金実績明細のグループ条件を設定する
		 * 
		 * @return MCGroupByPolicy 振替元のグループ条件
		 */
		protected MCGroupByPolicy getFrDtlBaseGroupByPolicy() {

			// 振替元のキー
			MCGroupByPolicy gp = new MCGroupByPolicy(getFromDtlBaseGroupKey());

			// 合計の条件
			gp.sum(
					RcvActCmn_Upd02_SwBaseR.$sw_amt,
					RcvActCmn_Upd02_SwBaseR.$base_cur_sw_amt);

			//　グループ化対象のリストは新規伝票の為替レートのみ取得されているので、同一インボイスＮＯ内で為替レートは一意であり、maxを取得すればよい
			gp.max(RcvActCmn_Upd02_SwBaseR.$crt_bill_d_xrate);
			// 新規伝票が取得できなかった場合、請求明細ＮＯが最大のレコードから為替レートを取得するため
			gp.max(RcvActCmn_Upd02_SwBaseR.$bill_d_no);

			return gp;
		}

		protected String[] getFromDtlBaseGroupKey() {
			return new String[] {RcvActCmn_Upd02_SwBaseR.$bcst_cd,
					RcvActCmn_Upd02_SwBaseR.$bill_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$acst_cd,
					RcvActCmn_Upd02_SwBaseR.$ar_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$wg_cd,
					RcvActCmn_Upd02_SwBaseR.$iv_no,
					RcvActCmn_Upd02_SwBaseR.$bill_iv_no,
					RcvActCmn_Upd02_SwBaseR.$wrk_no,
					RcvActCmn_Upd02_SwBaseR.$ar_typ,
					RcvActCmn_Upd02_SwBaseR.$xrate};
		}

		protected RcvAct_BaseR createRcvActBaseForSw(RcvAct_InfoR hR) {
			RcvAct_BaseR baseR = RcvAct_BaseR.create();
			baseR.setAttributes(hR);

			baseR.trd_cd(hR.trd_cd());
			baseR.rcv_act_no(getRcvActNo(hR.dpt_cd(), hR.wg_cd(), hR.ac_dt(), hR.trd_cd()));
			baseR.rcv_act_seq(1);
			baseR.rcv_act_rev(1);
			baseR.ac_ym(hR.ac_ym());

			return baseR;
		}

		/**
		 * 振替先のヘッダ基本情報を作成する
		 * 
		 * @param hdrR
		 * @param swToR
		 * @param swFrL
		 * @return 振替先ヘッダ基本情報
		 */
		protected RcvAct_InfoR createToHdrBase(RcvActCmn_Chk02_HdrR hdrR,
				RcvActCmn_Chk02_SwToR swToR, MCList<RcvActCmn_Upd02_SwBaseR> swFrL) {
			RcvAct_InfoR hR = RcvAct_InfoR.create();
			hR.setAttributes(hdrR);

			hR.data_crud_typ(hdrR.data_crud_typ());
			hR.dpt_cd(hdrR.dpt_cd());
			hR.wg_cd(hdrR.wg_cd());
			hR.usr_cd(hdrR.usr_cd());
			hR.ac_dt(hdrR.ac_dt());
			hR.ac_ym(hdrR.ac_ym());
			hR.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()));
			hR.bill_basis_dt(hdrR.bill_basis_dt());
			hR.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.ar_trd_grp_typ());
			hR.trd_ptn_typ(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value());
			hR.rcv_dt(hdrR.rcv_dt());
			hR.trd_rmrks(hdrR.trd_rmrks());
			hR.trd_cur_cd(hdrR.trd_cur_cd());
			hR.base_cur_cd(getCo().base_cur_cd());
			hR.xrate(swToR.xrate());
			hR.xrate_cd(swToR.xrate_cd());
			hR.subttl1(swFrL.sum(RcvActCmn_Chk02_SwFrR.$sw_amt));
			hR.subttl2(0);
			hR.subttl3(0);
			hR.amt(hR.subttl1());
			hR.tax_subttl1(0);
			hR.tax_subttl2(0);
			hR.tax_subttl3(0);
			hR.tax_amt(0);
			hR.base_cur_subttl1(swFrL.sum(RcvActCmn_Chk02_SwFrR.$base_cur_sw_amt));
			hR.base_cur_subttl2(0);
			hR.base_cur_subttl3(0);
			hR.base_cur_amt(hR.base_cur_subttl1());
			hR.base_cur_tax_subttl1(0);
			hR.base_cur_tax_subttl2(0);
			hR.base_cur_tax_subttl3(0);
			hR.base_cur_tax_amt(0);
			hR.sub_char1(hdrR.sub_char1());
			hR.sub_char2(hdrR.sub_char2());
			hR.sub_char3(hdrR.sub_char3());

			return hR;
		}

		/**
		 * 振替先の明細基本情報を作成する
		 * 
		 * @param hdrR
		 * @param swToR
		 * @param baseFrL
		 * @return 振替先明細基本情報
		 */
		protected MCList<RcvActD_InfoR> createToDtlBase(RcvActCmn_Chk02_HdrR hdrR,
				RcvActCmn_Chk02_SwToR swToR, MCList<RcvActCmn_Upd02_SwBaseR> baseFrL) {

			MCList<RcvActD_InfoR> dtlToL = MCList.create(RcvActD_InfoR.class);
			MCList<RcvActCmn_Upd02_SwBaseR> grpL = baseFrL.groupBy(getToDtlBaseGroupByPolicy());

			for (RcvActCmn_Upd02_SwBaseR grpR : grpL) {

				RcvActD_InfoR dtlToR = RcvActD_InfoR.create();
				dtlToR.setAttributes(hdrR);

				dtlToR.bcst_cd(swToR.bcst_cd());
				dtlToR.bill_dpt_cd(swToR.bill_dpt_cd());
				dtlToR.acst_cd(swToR.acst_cd());
				dtlToR.ar_dpt_cd(swToR.ar_dpt_cd());
				dtlToR.wg_cd(swToR.wg_cd());
				dtlToR.iv_no(grpR.iv_no());
				dtlToR.wrk_no(swToR.wrk_no());
				dtlToR.ar_typ(grpR.ar_typ());
				dtlToR.amt1(grpR.sw_amt());
				dtlToR.amt2(0);
				dtlToR.amt3(0);
				dtlToR.tax_amt1(0);
				dtlToR.tax_amt2(0);
				dtlToR.tax_amt3(0);
				dtlToR.base_cur_amt1(grpR.base_cur_sw_amt());
				dtlToR.base_cur_amt2(0);
				dtlToR.base_cur_amt3(0);
				dtlToR.base_cur_tax_amt1(0);
				dtlToR.base_cur_tax_amt2(0);
				dtlToR.base_cur_tax_amt3(0);
				dtlToR.exc_gain_loss(0);
				if (isSame(getBaseCur().cur_cd(), hdrR.trd_cur_cd())) {
					dtlToR.trd_xrate(1);
				}
				else {
					dtlToR.trd_xrate(grpR.xrate());
				}

				dtlToL.add(dtlToR);
			}
			return dtlToL;
		}

		protected MCNumber srchXrate(MCList<RcvActCmn_Upd02_SwBaseR> grpList,
				RcvActCmn_Upd02_SwBaseR grpR, MCList<RcvActCmn_Upd02_SwBaseR> baseFrL,
				RcvActCmn_Chk02_HdrR hdrR, MCIndexKey baseKeyBillNo) {

			MCList<RcvActCmn_Upd02_SwBaseR> arSwList = grpList.subList(
					RcvActCmn_Upd02_SwBaseR.$trd_ptn_typ,
					MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value());
			if (!isNull(MSBGL_ArUtil.srchXrateHis(grpR.acst_cd(), grpR.ar_dpt_cd(),
					hdrR.trd_cur_cd(), grpR.iv_no(), grpR.wrk_no(), grpR.ar_typ())
					.new_xrate())) {
				// 請求残高振替（＋）の請求明細が存在しない場合は、評価替の為替レートを返す。
				if (arSwList.isEmpty()) {
					return MSBGL_ArUtil.srchXrateHis(grpR.acst_cd(), grpR.ar_dpt_cd(),
							hdrR.trd_cur_cd(), grpR.iv_no(), grpR.wrk_no(), grpR.ar_typ())
							.new_xrate();
				}
				// 請求残高振替（＋）の請求明細の計上年月 ＜＝ 為替レート評価替の計上年月
				// の場合は、請求残高振替（＋）の請求明細に対して為替レート評価替が行われているので、評価替の為替レートを返す。
				if (((MCDate) arSwList.max(RcvActCmn_Upd02_SwBaseR.$ac_ym))
						.lte(MSBGL_ArUtil.srchXrateHis(grpR.acst_cd(), grpR.ar_dpt_cd(),
								hdrR.trd_cur_cd(), grpR.iv_no(), grpR.wrk_no(),
								grpR.ar_typ()).ac_ym())) {
					return MSBGL_ArUtil.srchXrateHis(grpR.acst_cd(), grpR.ar_dpt_cd(),
							hdrR.trd_cur_cd(), grpR.iv_no(), grpR.wrk_no(), grpR.ar_typ())
							.new_xrate();
				}
			}

			if (!arSwList.isEmpty()) {
				arSwList.sort(SortType.DESC, RcvActCmn_Upd02_SwBaseR.$bill_d_no);
				RcvActCmn_Upd02_SwBaseR tgtSwBillD = arSwList.get(0);
				if (!isNull(tgtSwBillD.xrate())) {
					return tgtSwBillD.xrate();
				}
			}

			return nvl(grpR.crt_bill_d_xrate(), baseFrL.getFirst(baseKeyBillNo, grpR.bill_d_no()).xrate());
		}

	
		/**
		 * 振替先の入金実績明細のグループ条件を設定する
		 * 
		 * @return MCGroupByPolicy 振替先のグループ条件
		 */
		protected MCGroupByPolicy getToDtlBaseGroupByPolicy() {

			// 振替先はインボイスＮｏごとに分割するのでインボイスＮｏでグループ化する
			MCGroupByPolicy gp = new MCGroupByPolicy(getToDtlBaseGroupKey());

			// 合計の条件
			gp.sum(RcvActCmn_Upd02_SwBaseR.$sw_amt, RcvActCmn_Upd02_SwBaseR.$base_cur_sw_amt);
			return gp;
		}

		protected String[] getToDtlBaseGroupKey() {
			return new String[] {
					RcvActCmn_Upd02_SwBaseR.$iv_no, 
					RcvActCmn_Upd02_SwBaseR.$ar_typ,
					RcvActCmn_Upd02_SwBaseR.$xrate
			};
		}

				
		/**
		 * 振替元の更新処理
		 * 
		 * @param hFrR 振替元ヘッダ情報
		 * @param dFrR 振替元明細情報
		 * @param frBaseL 振替元基本情報
		 * @param rcvActFrR 振替元入金実績情報
		 * @param rcvActToR 振替先入金実績情報
		 */
		protected MCList<MST_RCV_ACT_D_R> updFr(RcvAct_InfoR hFrR,
				MCList<RcvActD_InfoR> dFrL, MCList<RcvActCmn_Upd02_SwBaseR> frBaseL,
				RcvAct_BaseR rcvActFrR, RcvAct_BaseR rcvActToR) {

			// 追加情報の設定
			setFrHdrInfo(hFrR, frBaseL, rcvActToR);

			// 共通処理
			execComProc(hFrR, null);

			// 入金実績情報の作成
			Object[] o = insFrRcvAct(hFrR, dFrL, rcvActFrR, rcvActToR);
			MST_RCV_ACT_R rcvActR = (MST_RCV_ACT_R) o[0];
			MCList<MST_RCV_ACT_D_R> rcvActDL = (MCList<MST_RCV_ACT_D_R>) o[1];

			insArApplAct(frBaseL, rcvActDL);

			// 債権共通サービス実行
			execArReg(MSC_AR_OPE_TYP.ARSW_OUT_BILL_BAL, rcvActR, rcvActDL);

			// 振替元の明細消込
			execFrArDtlApplReg(hFrR, frBaseL, rcvActDL);
			
			return rcvActDL;
		}

		/**
		 * 振替元ヘッダ情報に追加情報を設定
		 * 
		 * @param hFrR
		 * @param frBaseL
		 * @param rcvActToR
		 */
		protected void setFrHdrInfo(RcvAct_InfoR hFrR,
				MCList<RcvActCmn_Upd02_SwBaseR> frBaseL, RcvAct_BaseR rcvActToR) {

			// 請求先ＣＤの設定
			hFrR.bcst_cd(frBaseL.get(0).bcst_cd()); // 振替元は全て同じ請求先（画面での検索時に請求先は必須のため）
			// 振替元の請求部門ＣＤがすべて同じ場合、入金実績の請求部門に設定する
			MCList<RcvActCmn_Upd02_SwBaseR> subL = frBaseL.groupBy(RcvActCmn_Upd02_SwBaseR.$bill_dpt_cd);
			if (subL.size() == 1) {
				hFrR.bill_dpt_cd(subL.get(0).bill_dpt_cd());
			}
			// 与信管理先ＣＤの設定
			hFrR.cred_cd(MSBGL_ArUtil.getBp(hFrR.bcst_cd()).ar_cred_cd());
			// 親実績情報の設定
			hFrR.par_rcv_act_no(rcvActToR.rcv_act_no());
			hFrR.par_rcv_act_seq(rcvActToR.rcv_act_seq());
		}

		protected Object[] insFrRcvAct(RcvAct_InfoR hFrR, MCList<RcvActD_InfoR> dFrL,
				RcvAct_BaseR rcvActFrR, RcvAct_BaseR rcvActToR) {

			// 振替元の入金実績ヘッダ作成
			MST_RCV_ACT_R rcvActR = createNewRcvAct(rcvActFrR, hFrR);

			// 親入金実績ＮＯは共通処理createNewRcvActと異なるのでここで上書きする。
			rcvActR.par_rcv_act_no(rcvActToR.rcv_act_no());
			rcvActR.par_rcv_act_seq(rcvActToR.rcv_act_seq());
			
			// 振替元の入金実績明細作成
			MCList<MST_RCV_ACT_D_R> rcvActDL = createNewRcvActD(rcvActFrR, hFrR, dFrL);

			// 入金実績情報の基準入金額を設定
			setBaseCurAmt(rcvActR, rcvActDL);

			
			// 入金実績ヘッダ、明細挿入
			insRcvAct(rcvActR);
			insRcvActD(rcvActDL);
			
			return new Object[] {
				rcvActR,
				rcvActDL
			};
		}

		/**
		 * 振替元の売掛消込実績、入金予定消込実績を登録する。
		 * 
		 * @param frBaseL
		 * @param rcvActDL
		 */
		protected void insArApplAct(MCList<RcvActCmn_Upd02_SwBaseR> frBaseL, 
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			String[] key = {
					RcvActCmn_Upd02_SwBaseR.$bcst_cd,
					RcvActCmn_Upd02_SwBaseR.$bill_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$acst_cd,
					RcvActCmn_Upd02_SwBaseR.$ar_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$wg_cd,
					RcvActCmn_Upd02_SwBaseR.$iv_no,
					RcvActCmn_Upd02_SwBaseR.$wrk_no,
					RcvActCmn_Upd02_SwBaseR.$ar_typ
					};

			MCList<MST_RCV_SCHD_APPL_ACT_R> insL = MCList.create(MST_RCV_SCHD_APPL_ACT_R.class);
			// 請求管理ＮＯごとに振替額の合計をグルーピングして処理する
			MCIndexKey idk = rcvActDL.createIndex(key);
			for (RcvActCmn_Upd02_SwBaseR r: frBaseL.groupBy(getArApplActGroupByBplicy())) {
				MST_RCV_ACT_D_R rcvActDR = rcvActDL.getFirst(idk, r.bcst_cd(), r.bill_dpt_cd(),
						r.acst_cd(), r.ar_dpt_cd(), r.wg_cd(), r.iv_no(), r.wrk_no(), r.ar_typ());

				// 売掛消込実績の登録
				insArApplActForSw(r, rcvActDR);
				// 請求ヘッダの更新
				updBillForSw(r);
				// 入金予定消込実績の登録情報を設定
				insL.add(insRcvSchdApplActForSw(r));
			}
			// 入金予定消込実績の登録
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_RCV_SCHD_APPL_ACT_R.create("T"));
			dbInsertEx("MSBGL5020_MST_RCV_SCHD_APPL_ACT_I02", insL, insL_bldr);
		}

		protected MCGroupByPolicy getArApplActGroupByBplicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy(
					RcvActCmn_Upd02_SwBaseR.$bill_mng_no,
					RcvActCmn_Upd02_SwBaseR.$bcst_cd,
					RcvActCmn_Upd02_SwBaseR.$bill_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$acst_cd,
					RcvActCmn_Upd02_SwBaseR.$ar_dpt_cd,
					RcvActCmn_Upd02_SwBaseR.$wg_cd,
					RcvActCmn_Upd02_SwBaseR.$iv_no,
					RcvActCmn_Upd02_SwBaseR.$wrk_no,
					RcvActCmn_Upd02_SwBaseR.$ar_typ);
			gp.max(RcvActCmn_Upd02_SwBaseR.$sw_dt);
			gp.max(RcvActCmn_Upd02_SwBaseR.$trd_cur_cd);
			gp.sum(RcvActCmn_Upd02_SwBaseR.$sw_amt);
			return gp;
		}

		/**
		 * 売掛消込実績に振替の実績情報を登録する
		 * 
		 * @param r
		 */
		protected void insArApplActForSw(RcvActCmn_Upd02_SwBaseR r, MST_RCV_ACT_D_R rcvActDR) {
			// 請求管理ＮＯから売掛消込予定を検索する
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL = srchArApplSchd(r);

			MCList<MST_AR_APPL_ACT_R> arApplActL = MCList.create(MST_AR_APPL_ACT_R.class);
			for (MST_AR_APPL_SCHD_R arApplSchdR : arApplSchdL) {
				arApplActL.add(setArApplActForSw(arApplSchdR, rcvActDR, r));
			}
			if (!arApplActL.isEmpty() && arApplActL.sum("ratio").isZero()) {
				arApplActL.setNumber("ratio", MCNumber.ONE);
			}
			FXUCC_Divide.prop(arApplActL, r.sw_amt(), MSBGL_ArUtil.getCur(r.trd_cur_cd()).amt_dec_place().intValue(),
					"ratio", MST_AR_APPL_ACT_R.$appl_amt);
			updArApplSchdForSw(arApplActL);
			MCQueryApiBuilder arApplActL_bldr = MCQueryApiBuilder.create(MST_AR_APPL_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_AR_APPL_ACT_I02", arApplActL, arApplActL_bldr);
		}

		/**
		 * 請求管理ＮＯをもとに売掛消込予定を検索する
		 * 
		 * @param billMngNo
		 * @return arApplSchdL
		 */
		protected MCList<MST_AR_APPL_SCHD_R> srchArApplSchd(RcvActCmn_Upd02_SwBaseR r) {
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);
			MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
			MCQueryApiBuilder arApplSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
			arApplSchdL_bldr.addInnerJoin(t2, bracket( t.bill_acst_no.eq(t2.bill_acst_no)));
			arApplSchdL_bldr.addWhereWithAnd(t2.bill_mng_no.eq(bind("1")), r.bill_mng_no());
			arApplSchdL_bldr.addWhereWithAnd(t2.acst_cd.eq(bind("1")), r.acst_cd());
			arApplSchdL_bldr.addWhereWithAnd(t2.ar_dpt_cd.eq(bind("1")), r.ar_dpt_cd());
			arApplSchdL_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), r.iv_no());
			arApplSchdL_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), r.ar_typ());
			dbSelect("MSBGL5020_MST_AR_APPL_SCHD_S02", arApplSchdL, arApplSchdL_bldr);
			return arApplSchdL;
		}

		/**
		 * 売掛消込実績情報を設定する
		 * 
		 * @param arApplSchdR
		 * @param rcvActDR
		 * @param r
		 * @return arApplActR
		 */
		protected MST_AR_APPL_ACT_R setArApplActForSw(MST_AR_APPL_SCHD_R arApplSchdR,
				MST_RCV_ACT_D_R rcvActDR, RcvActCmn_Upd02_SwBaseR r) {
			MST_AR_APPL_ACT_R arApplActR = MST_AR_APPL_ACT_R.create();
			arApplActR.ar_appl_act_no(getStrSeq(MSC_NUM_SYS_TYP.ARAPPLACT));
			arApplActR.ar_appl_schd_no(arApplSchdR.ar_appl_schd_no());
			arApplActR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
			arApplActR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
			arApplActR.rcv_mtd_cd(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.SW.value()).sttl_cd());
			arApplActR.rcv_act_dt(r.sw_dt());
			arApplActR.addNumberColumn("ratio", arApplSchdR.not_appl_bal());
			return arApplActR;
		}

		/**
		 * 売掛消込予定の更新
		 * 
		 * @param updL
		 */
		protected void updArApplSchdForSw(MCList<MST_AR_APPL_ACT_R> updL) {
			for (MST_AR_APPL_ACT_R r : updL) {
				MST_AR_APPL_SCHD_R dbc = MST_AR_APPL_SCHD_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setWhere(dbc.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
				builder.setSetVL(dbc.appl_amt, dbc.appl_amt.add(bindEx("appl_amt")));
				builder.addSetVL(dbc.not_appl_bal, dbc.not_appl_bal.subtract(bindEx("appl_amt")));
				dbUpdate("MSBGL5020_MST_AR_APPL_SCHD_U03", r, builder);
			}
		}

		/**
		 * 振替元の振替額を請求ヘッダに反映する
		 * 
		 * @param r
		 */
		protected void updBillForSw(RcvActCmn_Upd02_SwBaseR r) {
			MST_BILL_R dbc = MST_BILL_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setWhere(dbc.bill_mng_no.eq(bindEx("bill_mng_no")));
			builder.setSetVL(dbc.rcv_act_amt, dbc.rcv_act_amt.add(bindEx("sw_amt")));
			builder.addSetVL(dbc.not_appl_bal, dbc.not_appl_bal.subtract(bindEx("sw_amt")));
			builder.addSetVL(dbc.last_rcv_dt, bindEx("sw_dt"));
			dbUpdate("MSBGL5020_MST_BILL_U03", r, builder);
		}

		/**
		 * 入金予定消込実績の登録情報を作成する
		 * 
		 * @param r
		 * @return insR
		 */
		protected MST_RCV_SCHD_APPL_ACT_R insRcvSchdApplActForSw(
				RcvActCmn_Upd02_SwBaseR r) {
			MST_RCV_SCHD_APPL_ACT_R insR = MST_RCV_SCHD_APPL_ACT_R.create();
			insR.rcv_schd_appl_act_no(getStrSeq(MSC_NUM_SYS_TYP.RCVSCHDAPPLACT));
			insR.bill_mng_no(r.bill_mng_no());
			insR.rcv_act_dt(r.sw_dt());
			insR.rcv_mtd_cd(MSBGL_ArUtil.getArSttlCd(MAC_AR_STTL_TYP.SW.value()).sttl_cd());
			insR.rcv_typ(MAC_AR_STTL_TYP.SW.value());
			insR.rcv_act_amt(r.sw_amt());
			return insR;
		}

		/**
		 * 明細消込処理<br>
		 * 
		 * @param hR 振替ヘッダ情報
		 * @param frBaseL　振替元請求明細情報
		 * @param frRcvActDL 振替元入金実績明細情報
		 */
		protected void execFrArDtlApplReg(RcvAct_InfoR hR, MCList<RcvActCmn_Upd02_SwBaseR> frBaseL,
				MCList<MST_RCV_ACT_D_R> frRcvActDL) {

			MSBGL_ArDtlApplService.ArDtlAppl_Upd01 op = MSBGL_ArDtlApplService.crtArDtlAppl_Upd01();
			addAll(op.up0(), frBaseL, createMap_ArDtlApplRegFr(hR, frRcvActDL));
			op.exec();
			
		}

		// RcvActCmn_Upd02_SwBaseR → ArDtlAppl_Chk01_DtlR
		protected Map_ArDtlApplRegFr<ArDtlAppl_Chk01_DtlR, RcvActCmn_Upd02_SwBaseR> createMap_ArDtlApplRegFr(
				RcvAct_InfoR hR, MCList<MST_RCV_ACT_D_R> rcvActDL) {
			return new Map_ArDtlApplRegFr<ArDtlAppl_Chk01_DtlR, RcvActCmn_Upd02_SwBaseR>(hR, rcvActDL);
		}

		public class Map_ArDtlApplRegFr<D extends ArDtlAppl_Chk01_DtlR, S extends RcvActCmn_Upd02_SwBaseR> extends MCRowMapper<D, S> {

			MCList<MST_RCV_ACT_D_R> rcvActDL;
			RcvAct_InfoR hR;

			public Map_ArDtlApplRegFr(RcvAct_InfoR hdrR, MCList<MST_RCV_ACT_D_R> rcvActDL) {
				this.rcvActDL = rcvActDL;
				this.hR = hdrR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$bill_d_no, RcvActCmn_Upd02_SwBaseR.$bill_d_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$parent_bill_d_no, RcvActCmn_Upd02_SwBaseR.$parent_bill_d_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$bill_mng_no, RcvActCmn_Upd02_SwBaseR.$bill_mng_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$ac_dt, RcvActCmn_Upd02_SwBaseR.$ac_dt);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$appl_amt, RcvActCmn_Upd02_SwBaseR.$sw_amt);
			}

			@Override
			public void valueCopy(D dest, S src) {

				String[] keys = {
						MST_RCV_ACT_D_R.$acst_cd,
						MST_RCV_ACT_D_R.$ar_dpt_cd,
						MST_RCV_ACT_D_R.$iv_no,
						MST_RCV_ACT_D_R.$wrk_no,
						MST_RCV_ACT_D_R.$ar_typ
				};

				Comparable<?>[] vals = {
						src.acst_cd(),
						src.ar_dpt_cd(),
						src.iv_no(),
						src.wrk_no(),
						src.ar_typ()
				};

				MST_RCV_ACT_D_R subR = rcvActDL.getFirst(keys, vals);
				dest.rcv_act_ac_ym(hR.ac_ym());
				dest.rcv_act_d_no(subR.rcv_act_d_no());
				dest.rcv_act_d_seq(subR.rcv_act_d_seq());
				dest.rcv_act_no(subR.rcv_act_no());
				dest.rcv_act_seq(subR.rcv_act_seq());
			}
		}

		/**
		 * 振替先情報を更新する
		 * 
		 * @param hToR
		 * @param dToL
		 * @param RcvActToR
		 * @param frBaseL
		 * @param swToR
		 */
		protected void updTo(RcvAct_InfoR hToR, MCList<RcvActD_InfoR> dToL, 
				RcvAct_BaseR rcvActToR, MCList<RcvActCmn_Upd02_SwBaseR> frBaseL, 
				RcvActCmn_Chk02_SwToR swToR) {

			// 不足項目の設定
			setToHdrInfo(hToR, dToL, rcvActToR, swToR);
			setToDtlInfo(dToL);

			// 共通処理
			execComProc(hToR, null);

			// 入金実績作成
			Object[] o = insToRcvAct(hToR, dToL, rcvActToR);
			MST_RCV_ACT_R rcvActR = (MST_RCV_ACT_R) o[0];
			MCList<MST_RCV_ACT_D_R> rcvActDL = (MCList<MST_RCV_ACT_D_R>) o[1];

			// 債権共通呼び出し
			execArReg(MSC_AR_OPE_TYP.ARSW_IN_BILL_BAL, rcvActR, rcvActDL);

			// 振替先請求明細消込残高作成
			insToBillDApplBal(frBaseL, rcvActR, rcvActDL);

			// 振替先請求明細消込共通処理（振替伝票に対する消込処理）
			execToArDtlApplReg(rcvActR, rcvActDL);
		}

		protected void setToHdrInfo(RcvAct_InfoR hToR, MCList<RcvActD_InfoR> dToL,
				RcvAct_BaseR slipToR, RcvActCmn_Chk02_SwToR swToR) {

			hToR.bcst_cd(swToR.bcst_cd());
			hToR.bill_dpt_cd(swToR.bill_dpt_cd());
			hToR.cred_cd(MSBGL_ArUtil.getBp(hToR.bcst_cd()).ar_cred_cd());

			// 金額は反転する
			hToR.amt(hToR.amt().negate());
			hToR.subttl1(hToR.subttl1().negate());
			hToR.base_cur_subttl1(hToR.base_cur_subttl1().negate());
			hToR.subttl2(hToR.subttl2().negate());
			hToR.base_cur_subttl2(hToR.base_cur_subttl2().negate());
			hToR.subttl3(hToR.subttl3().negate());
			hToR.base_cur_subttl3(hToR.base_cur_subttl3().negate());

			hToR.rcv_act_no(slipToR.rcv_act_no());
			hToR.rcv_act_seq(slipToR.rcv_act_seq());
		}

		protected void setToDtlInfo(MCList<RcvActD_InfoR> dToL) {

			for (RcvActD_InfoR dToR : dToL) {

				// 金額は反転する
				dToR.amt1(dToR.amt1().negate());
				dToR.base_cur_amt1(dToR.base_cur_amt1().negate());
				dToR.amt2(dToR.amt2().negate());
				dToR.base_cur_amt2(dToR.base_cur_amt2().negate());
				dToR.amt3(dToR.amt3().negate());
				dToR.base_cur_amt3(dToR.base_cur_amt3().negate());
			}
		}

		/**
		 * 入金実績ヘッダ・明細を追加する<p>
		 * 戻り値として作成した入金実績ヘッダ・明細を返す
		 * 
		 * @param hToR ヘッダ情報
		 * @param dToL 明細情報
		 * @param rcvActToR 振替先基本情報
		 * @return 作成した入金実績（第1要素：ヘッダ、第2要素：明細）
		 */
		protected Object[] insToRcvAct(RcvAct_InfoR hToR, MCList<RcvActD_InfoR> dToL,
				RcvAct_BaseR rcvActToR) {

			// 振替先伝票ヘッダ・明細作成（明細は１件のみ）
			MST_RCV_ACT_R rcvActR = createNewRcvAct(rcvActToR, hToR);
			MCList<MST_RCV_ACT_D_R> rcvActDL = createNewRcvActD(rcvActToR, hToR, dToL);

			// 債権伝票ヘッダの基準金額の設定
			setBaseCurAmt(rcvActR, rcvActDL);

			// ヘッダ・明細追加
			insRcvAct(rcvActR);
			insRcvActD(rcvActDL);

			return new Object[] {
					rcvActR,
					rcvActDL
			};
		}

		/**
		 * 振替先請求明細消込残高情報の作成
		 * 
		 * @param frBaseL 振替元基本情報
		 * @param rcvActR 振替先入金実績
		 * @param rcvActL 振替先入金実績明細
		 * @return 振替先請求明細消込残高情報
		 */
		protected void insToBillDApplBal(MCList<RcvActCmn_Upd02_SwBaseR> frBaseL,
				MST_RCV_ACT_R rcvActR, MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<MST_BILL_D_APPL_BAL_R> applBalL = createToBillDApplBal(frBaseL, rcvActR, rcvActDL);
			MCQueryApiBuilder applBalL_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));

			dbInsert("MSBGL5020_MST_BILL_D_APPL_BAL_I01", applBalL, applBalL_bldr);
		}

		/**
		 * 振替先請求明細消込残高情報の作成
		 * 
		 * @param frBaseL 振替元基本情報
		 * @param rcvActR 振替先入金実績
		 * @param rcvActL 振替先入金実績明細
		 * @return 振替先請求明細消込残高情報
		 */
		protected MCList<MST_BILL_D_APPL_BAL_R> createToBillDApplBal(
				MCList<RcvActCmn_Upd02_SwBaseR> frBaseL, MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<MST_BILL_D_APPL_BAL_R> applBalL = MCList.create(MST_BILL_D_APPL_BAL_R.class);

			// グループキー毎の処理
			MCGroupByPolicy gp = new MCGroupByPolicy(
					RcvActCmn_Upd02_SwBaseR.$parent_bill_d_no,
					RcvActCmn_Upd02_SwBaseR.$iv_no,
					RcvActCmn_Upd02_SwBaseR.$ar_typ);

			gp.sum(RcvActCmn_Upd02_SwBaseR.$sw_amt);

			MCList<RcvActCmn_Upd02_SwBaseR> grpL = frBaseL.groupBy(gp);

			for (RcvActCmn_Upd02_SwBaseR grpR : grpL) {
				MST_BILL_D_APPL_BAL_R applBalR = createToBillDApplBal(grpR, rcvActR, rcvActDL);
				applBalL.add(applBalR);
			}

			return applBalL;
		}

		protected MST_BILL_D_APPL_BAL_R createToBillDApplBal(RcvActCmn_Upd02_SwBaseR frBaseR,
				MST_RCV_ACT_R rcvActR, MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MST_BILL_D_APPL_BAL_R applBalR = MST_BILL_D_APPL_BAL_R.create();

			applBalR.parent_bill_d_no(frBaseR.parent_bill_d_no());
			applBalR.bill_d_no(getToRelatedRcvActD(rcvActDL, frBaseR).getString("bill_d_no"));
			applBalR.appl_amt(0);
			applBalR.not_appl_bal(frBaseR.sw_amt());
			applBalR.appl_tgt_amt(frBaseR.sw_amt());
			applBalR.last_appl_dt(null);

			return applBalR;
		}

		/**
		 * 引数のベース情報に関連する入金実績明細を取得する<br>
		 * 振替先の入金実績明細はインボイスＮＯ、債権区分ごとに作成されるのでベース情報の
		 * インボイスＮＯ、債権区分をキーにして入金実績明細のリストから対象を検索する
		 * 
		 * @param rcvActDToL 入金実績明細のリスト
		 * @param baseR ベース情報
		 * @return ベース情報に関連する入金実績明細
		 */
		protected MST_RCV_ACT_D_R getToRelatedRcvActD(MCList<MST_RCV_ACT_D_R> rcvActDToL,
				RcvActCmn_Upd02_SwBaseR baseR) {

			return rcvActDToL.getFirst(
					new String[] {MST_RCV_ACT_D_R.$iv_no, MST_RCV_ACT_D_R.$ar_typ},
					new Comparable[] {baseR.iv_no(), baseR.ar_typ()}
					);
		}

		/**
		 * 振替先請求明細消込処理<br>
		 * 
		 * @param rcvActR 振替元基本情報
		 * @param rcvActDL 振替元入金実績明細情報
		 */
		protected void execToArDtlApplReg(MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MSBGL_ArDtlApplService.ArDtlAppl_Upd01 op = MSBGL_ArDtlApplService.crtArDtlAppl_Upd01();

			for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {

				// 振替先請求明細消込残高作成（振替伝票に対する残高設定）
				// この残高に対して以下で消込処理を行う
				MST_BILL_D_APPL_BAL_R applBalR = createToBillDApplBal(rcvActDR);
				MCQueryApiBuilder applBalR_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));
				dbInsert("MSBGL5020_MST_BILL_D_APPL_BAL_I02", applBalR, applBalR_bldr);

				ArDtlAppl_Chk01_DtlR dR = ArDtlAppl_Chk01_DtlR.create();
				copy(dR, rcvActDR, createMap_InfoBillD(rcvActR));
				op.up0().add(dR);
			}

			op.exec();
		}

		/**
		 * 振替先の請求明細消込残高情報を作成する<br>
		 * 振替伝票のための消込残高<br>
		 * 最終的には処理の中で消しこまれる
		 * 
		 * @param rcvActDR 振替入金実績票情報
		 * @return 振替先の請求明細消込残高情報
		 */
		protected MST_BILL_D_APPL_BAL_R createToBillDApplBal(MST_RCV_ACT_D_R rcvActDR) {

			MST_BILL_D_APPL_BAL_R applBalR = MST_BILL_D_APPL_BAL_R.create();

			applBalR.bill_d_no(rcvActDR.getString("bill_d_no"));
			applBalR.parent_bill_d_no(rcvActDR.getString("bill_d_no"));
			applBalR.last_appl_dt(null);
			applBalR.appl_tgt_amt(MCNumber.sum(rcvActDR.trd_cur_amt1(),
					rcvActDR.trd_cur_amt2(), rcvActDR.trd_cur_amt3()));
			applBalR.appl_amt(0);
			applBalR.not_appl_bal(MCNumber.sum(rcvActDR.trd_cur_amt1(),
					rcvActDR.trd_cur_amt2(), rcvActDR.trd_cur_amt3()));
			return applBalR;
		}

		// MST_RCV_ACT_D_R → ArDtlAppl_Chk01_DtlR
		protected Map_InfoBillD<ArDtlAppl_Chk01_DtlR, MST_RCV_ACT_D_R> createMap_InfoBillD(MST_RCV_ACT_R rcvActToR) {
			return new Map_InfoBillD<ArDtlAppl_Chk01_DtlR, MST_RCV_ACT_D_R>(rcvActToR);
		}

		public class Map_InfoBillD<D extends ArDtlAppl_Chk01_DtlR, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D, S> {
			MST_RCV_ACT_R rcvActToR;

			public Map_InfoBillD(MST_RCV_ACT_R rcvActToR) {
				this.rcvActToR = rcvActToR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_d_seq, MST_RCV_ACT_D_R.$rcv_act_d_seq);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$bill_mng_no, MST_RCV_ACT_D_R.$bill_mng_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_no, MST_RCV_ACT_D_R.$rcv_act_no);
				addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_seq, MST_RCV_ACT_D_R.$rcv_act_seq);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_ac_ym(rcvActToR.ac_ym());
				dest.bill_d_no(src.getString("bill_d_no"));
				dest.parent_bill_d_no(src.getString("bill_d_no"));
				dest.appl_amt(MCNumber.sum(src.trd_cur_amt1(),
						src.trd_cur_amt2(), src.trd_cur_amt3()));
				// 振替先分は月次売掛残高を更新しない
				dest.no_upd_ar_bal_flg(true);
			}
		}

		/**
		 * 債権共通サービスを実行する
		 * 
		 * @param arOpeTyp 債権更新処理区分
		 * @param rcvActR 入金実績情報
		 * @param rcvActDL 入金実績明細情報
		 */
		protected void execArReg(MSC_AR_OPE_TYP arOpeTyp, MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<ArCmn_Upd01_DtlR> dtlL = MCList.create(ArCmn_Upd01_DtlR.class);
			addAll(dtlL, rcvActDL, createMap_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R(rcvActR));
			execArCmnService(arOpeTyp, dtlL);

			// 後処理
			setBillMngNo(rcvActDL);
		}

		/**
		 * 入金実績ヘッダを登録する
		 * 
		 * @param insR
		 */
		protected void insRcvAct(MST_RCV_ACT_R insR) {
			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_I03", insR, insR_bldr);
		}

		/**
		 * 入金実績明細を登録する
		 * 
		 * @param insL
		 */
		protected void insRcvActD(MCList<MST_RCV_ACT_D_R> insL) {
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_D_I03", insL, insL_bldr);
		}

		/**
		 * ヘッダの基準金額を明細の基準金額から計算する
		 * 
		 * @param rcvActR 入金実績ヘッダ基本情報
		 * @param rcvActDL 入金実績明細基本情報
		 */
		protected void setBaseCurAmt(MST_RCV_ACT_R rcvActR,
				MCList<MST_RCV_ACT_D_R> rcvActDL) {

			rcvActR.base_cur_subttl1(rcvActDL.sum(MST_RCV_ACT_D_R.$base_cur_amt1));
			rcvActR.base_cur_subttl2(rcvActDL.sum(MST_RCV_ACT_D_R.$base_cur_amt2));
			rcvActR.base_cur_subttl3(rcvActDL.sum(MST_RCV_ACT_D_R.$base_cur_amt3));
			rcvActR.base_cur_amt(MCNumber.sum(
					rcvActR.base_cur_subttl1(),
					rcvActR.base_cur_subttl2(),
					rcvActR.base_cur_subttl3())
					);
		}

		/**
		 * 入金実績ＩＦ作成サービス<br />
		 * 
		 * @param rcvActNoFr
		 * @param rcvActSeqFr
		 */
		protected void execRcvActIfCrtService(MCList<MST_RCV_ACT_D_R> rcvActDL) {
			MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 op =
					MSBGL_RcvActIfCrtService.crtRcvActIfCrt_Ins01();
			for (MST_RCV_ACT_D_R r : rcvActDL) {
				RcvActIfCrt_Ins01_CndR cndR = RcvActIfCrt_Ins01_CndR.create();
				cndR.rcv_act_d_no(r.rcv_act_d_no());
				cndR.rcv_act_d_seq(r.rcv_act_d_seq());
				op.up0().add(cndR);
			}
			op.exec();
		}

		/**
		 * 振替伝票の発行<br />
		 * 
		 * @param rcvActNoFr
		 * @param rcvActSeqFr
		 */
		protected void prnt(String rcvActNoFr, MCNumber rcvActSeqFr) {
			MSBGL_ArSlipPrntService.ArSlip_Prnt01 op =
					MSBGL_ArSlipPrntService.crtArSlip_Prnt01();
			ArSlip_Prnt01_HdrR hdrR = ArSlip_Prnt01_HdrR.create();
			hdrR.rcv_act_no(rcvActNoFr);
			hdrR.rcv_act_seq(rcvActSeqFr);
			op.up0().add(hdrR);
			op.exec();
		}

		/**
		 * 下り電文用の振替伝票情報をセットする
		 * 
		 * @param slipFrR 振替元伝票情報
		 * @param slipToR 振替先伝票情報
		 */
		protected void setDown(RcvAct_BaseR rcvActFrR, RcvAct_BaseR rcvActToR) {
			down0().fr_trd_cd(rcvActFrR.trd_cd());
			down0().fr_rcv_act_no(rcvActFrR.rcv_act_no());
			down0().fr_rcv_act_seq(rcvActFrR.rcv_act_seq());
			down0().fr_rcv_act_rev(rcvActFrR.rcv_act_rev());
			down0().to_trd_cd(rcvActToR.trd_cd());
			down0().to_rcv_act_no(rcvActToR.rcv_act_no());
			down0().to_rcv_act_seq(rcvActToR.rcv_act_seq());
			down0().to_rcv_act_rev(rcvActToR.rcv_act_rev());
		}
	}

	/**
	 * RcvActCmn_Upd03オペレーション.<p>
	 *
	 * 未請求残高振替の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Upd03 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {
			for (RcvActCmn_Chk03_HdrR hdrR : up0()) {
				RcvActCmn_Chk03_SwToR swToR = up1().getFirst(RcvActCmn_Chk03_SwToR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());
				MCList<RcvActCmn_Chk03_SwFrR> swFrL = up2().subList(RcvActCmn_Chk03_SwFrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());
				MCList<RcvActCmn_Upd03_BillDR> swFrDtlL = up3().subList(RcvActCmn_Chk03_SwFrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());
				execMain(hdrR, swToR, swFrL, swFrDtlL);
			}
		}

		/**
		 * メイン処理実行<br />
		 * 上り電文のヘッダ単位にメイン処理を実行します
		 * 
		 * @param hdrR 上り電文のヘッダ情報
		 * @param swToR 上り電文の振替先情報
		 * @param swFrL 上り電文の振替元情報
		 * @param billDL 上り電文の請求明細情報
		 */
		protected void execMain(RcvActCmn_Chk03_HdrR hdrR, RcvActCmn_Chk03_SwToR swToR,
				MCList<RcvActCmn_Chk03_SwFrR> swFrL, MCList<RcvActCmn_Upd03_BillDR> billDL) {

			MCDate acYm = getAcYm(hdrR.ac_dt());
			MST_RCV_ACT_R toRcvActBaseR = createToRcvActBase(acYm, hdrR, swToR);
			MST_RCV_ACT_R frRcvActBaseR = createFrRcvActBase(acYm, toRcvActBaseR, hdrR);

			MCList<RcvActCmn_Upd03_BillDR> bcstL =
					billDL.groupBy(RcvActCmn_Upd03_BillDR.$bcst_cd);
			bcstL.sort(RcvActCmn_Upd03_BillDR.$bcst_cd);

			MCList<MST_RCV_ACT_R> frRcvActL = MCList.create(MST_RCV_ACT_R.class);
			MCList<MST_RCV_ACT_D_R> frRcvActDL = MCList.create(MST_RCV_ACT_D_R.class);

			for (RcvActCmn_Upd03_BillDR bcstR : bcstL) {

				// 入金実績の基本情報を複製
				MST_RCV_ACT_R toRcvActR = toRcvActBaseR.clone();
				MST_RCV_ACT_R frRcvActR = frRcvActBaseR.clone();

				// 請求先ＣＤで請求明細を絞り込み
				MCList<RcvActCmn_Upd03_BillDR> subL =
						billDL.subList(RcvActCmn_Upd03_BillDR.$bcst_cd, bcstR.bcst_cd());

				// 振替元・振替先更新
				MCList<MST_RCV_ACT_D_R> insFrRcvActDL = updateFrInfo(frRcvActR, toRcvActR, subL, hdrR);
				updateToInfo(toRcvActR, subL, hdrR, swToR);

				frRcvActL.add(frRcvActR);
				frRcvActDL.addAll(insFrRcvActDL);
			}
			execArRegFrTo(hdrR, swToR, swFrL);
			
			// 印刷処理
			prnt(frRcvActL);

			execRcvActIfCrtService(frRcvActDL);
		}

		/**
		 * 振替元、振替先の情報をもとに債権共通サービスを実行する
		 * 
		 * @param swToR 上り電文の振替先情報
		 * @param swFrL 上り電文の振替元情報
		 * @return acYms 計上年月が格納された配列
		 */
		protected MCDate[] execArRegFrTo(RcvActCmn_Chk03_HdrR hdrR,
				RcvActCmn_Chk03_SwToR swToR, MCList<RcvActCmn_Chk03_SwFrR> swFrL) {

			MCDate[] acYms = new MCDate[2];

			// 債権共通への引数コンテナ
			MCList<ArCmn_Upd01_DtlR> dltL = MCList.create(ArCmn_Upd01_DtlR.class);

			// 振替元更新
			acYms[0] = setArRegFrInfo(dltL, hdrR, swFrL);
			execArCmnService(MSC_AR_OPE_TYP.ARSW_OUT_NOT_BILL_BAL, dltL);

			// 振替先更新（コンテナは振替元で使用したものを上書きして再利用する）
			acYms[1] = setArRegToInfo(dltL, hdrR, swToR);
			execArCmnService(MSC_AR_OPE_TYP.ARSW_IN_NOT_BILL_BAL, dltL);

			return acYms;
		}

		/**
		 * 振替元の債権共通サービス上り電文を作成
		 * 
		 * @param dtlL 債権共通サービスの上り電文コンテナ
		 * @param swToR 上り電文の振替先情報
		 * @param swFrL 上り電文の振替元情報
		 * @return 振替元の計上年月
		 */
		protected MCDate setArRegFrInfo(MCList<ArCmn_Upd01_DtlR> dtlL,
				RcvActCmn_Chk03_HdrR hdrR, MCList<RcvActCmn_Chk03_SwFrR> swFrL) {

			// 振替元用計上年月取得
			MCDate acYm = getAcYm(hdrR.ac_dt());
			up0().addDateColumn("inpt_ac_dt", hdrR.ac_dt());

			// 振替元の情報を追加
			for (RcvActCmn_Chk03_SwFrR frR : swFrL) {
				dtlL.add(getArRegFrInfo(frR, hdrR, acYm));
			}

			return acYm;
		}

		/**
		 * 振替元の債権共通サービス上り電文情報を検索
		 * 
		 * @param frR 上り電文の振替元情報
		 * @param swToR 上り電文の振替先情報
		 * @param acYm 計上年月
		 * @return 請求明細の検索結果
		 */
		protected ArCmn_Upd01_DtlR getArRegFrInfo(RcvActCmn_Chk03_SwFrR frR,
				RcvActCmn_Chk03_HdrR hdrR, MCDate acYm) {

			ArCmn_Upd01_DtlR dtlR = ArCmn_Upd01_DtlR.create();

			// 振替元の請求明細情報を取得
			executeQuery(dtlR, MSBGL5020_MST_BILL_D_S02(), frR);

			// 追加設定
			dtlR.inpt_ac_dt(hdrR.ac_dt());
			dtlR.inpt_ac_ym(acYm);

			return dtlR;
		}
		
		/**
		 * 振替先の債権共通サービス上り電文を作成
		 * 
		 * @param dtlL 債権共通サービスの上り電文コンテナ
		 * @param hdrR 上り電文のヘッダ情報
		 * @param swToR 上り電文の振替先情報
		 * @return 振替先の計上年月
		 */
		protected MCDate setArRegToInfo(MCList<ArCmn_Upd01_DtlR> dtlL,
				RcvActCmn_Chk03_HdrR hdrR, RcvActCmn_Chk03_SwToR swToR) {

			// 振替先売掛先から振替先請求先を取得（債権共通に渡すため）
			MAM_BP_R acstR = MAM_BP_R.create("T");
			MCQueryApiBuilder acstR_bldr = MCQueryApiBuilder.create(acstR);
			acstR.bp_cd(swToR.acst_cd());
			dbSelectKey("MSBGL5020_MAM_BP_S02", acstR, acstR_bldr, acstR);

			// 振替先用計上年月取得
			MCDate acYm = getAcYm(hdrR.ac_dt());

			for (ArCmn_Upd01_DtlR dtlR : dtlL) {
				dtlR.bcst_cd(acstR.bcst_cd());
				dtlR.bill_dpt_cd(swToR.bill_dpt_cd());
				dtlR.acst_cd(swToR.acst_cd());
				dtlR.wrk_no(swToR.wrk_no());
				dtlR.ac_dt(hdrR.ac_dt());
				dtlR.ac_ym(acYm);
				dtlR.inpt_ac_dt(hdrR.ac_dt());
				dtlR.inpt_ac_ym(acYm);
				dtlR.ar_dpt_cd(swToR.ar_dpt_cd());
			}
			return acYm;
		}

		/**
		 * 振替先の入金実績ベースを作成する
		 * 
		 * @param acYm 計上年月
		 * @param hdrR 上り電文のヘッダ情報
		 * @param swToR 上り電文の振替先情報
		 * @return 振替先の入金実績情報
		 */
		protected MST_RCV_ACT_R createToRcvActBase(MCDate acYm,
				RcvActCmn_Chk03_HdrR hdrR, RcvActCmn_Chk03_SwToR swToR) {

			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
			rcvActR.setAttributes(swToR);

			rcvActR.rcv_act_no(getRcvActNo(hdrR.dpt_cd(), hdrR.wg_cd(),
					hdrR.ac_dt(), hdrR.trd_cd()));
			rcvActR.rcv_act_seq(1);
			rcvActR.rcv_act_rev(1);
			rcvActR.ac_ym(acYm);
			rcvActR.ac_dt(hdrR.ac_dt());
			rcvActR.trd_ptn_typ(MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.value());
			rcvActR.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(rcvActR.trd_ptn_typ()));
			rcvActR.dpt_cd(hdrR.dpt_cd());
			rcvActR.wg_cd(hdrR.wg_cd());
			rcvActR.par_rcv_act_no(rcvActR.rcv_act_no());
			rcvActR.par_rcv_act_seq(rcvActR.rcv_act_seq());
			rcvActR.ar_trd_grp_typ(MAC_TRD_PTN_TYP.ar_trd_grp_typ(rcvActR.trd_ptn_typ()));
			rcvActR.xrate(swToR.xrate());
			rcvActR.xrate_cd(swToR.xrate_cd());
			rcvActR.bcst_cd(swToR.bcst_cd());
			rcvActR.bill_dpt_cd(swToR.bill_dpt_cd());
			rcvActR.trd_cur_cd(swToR.trd_cur_cd());
			setAcRsn(rcvActR);

			return rcvActR;
		}

		/**
		 * 振替元の入金実績ベースを作成する
		 * 
		 * @param acYm 計上年月
		 * @param toRcvActR 振替先入金実績情報
		 * @param hdrR 上り電文のヘッダ情報
		 * @return 振替元の入金実績情報
		 */
		protected MST_RCV_ACT_R createFrRcvActBase(MCDate acYm,
				MST_RCV_ACT_R toRcvActR, RcvActCmn_Chk03_HdrR hdrR) {

			MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
			rcvActR.setAttributes(hdrR);

			rcvActR.rcv_act_no(getRcvActNo(hdrR.dpt_cd(), hdrR.wg_cd(),
					hdrR.ac_dt(), hdrR.trd_cd()));
			rcvActR.rcv_act_seq(1);
			rcvActR.rcv_act_rev(1);
			rcvActR.ac_ym(acYm);
			rcvActR.trd_cd(hdrR.trd_cd());
			rcvActR.par_rcv_act_no(toRcvActR.rcv_act_no());
			rcvActR.par_rcv_act_seq(toRcvActR.rcv_act_seq());
			rcvActR.ac_dt(hdrR.ac_dt());
			rcvActR.ar_trd_grp_typ(hdrR.ar_trd_grp_typ());
			rcvActR.trd_ptn_typ(hdrR.trd_ptn_typ());
			setAcRsn(rcvActR);

			return rcvActR;
		}

		/**
		 * 振替元を更新する<p>
		 * ①入金実績の作成<br>
		 * ②与信の更新<br>
		 * ③請求明細振替情報の作成<br>
		 * @param frR 振替元入金実績情報
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細
		 */
		protected MCList<MST_RCV_ACT_D_R> updateFrInfo(MST_RCV_ACT_R rcvActR,
				MST_RCV_ACT_R toR, MCList<RcvActCmn_Upd03_BillDR> billDL,
				RcvActCmn_Chk03_HdrR hdrR) {
			// 入金実績、入金実績明細の作成
			crtFrRcvAct(rcvActR, toR, billDL, hdrR);
			MCList<MST_RCV_ACT_D_R> insFrRcvActDL = insFrRcvActHD(rcvActR, billDL);

			// 与信の更新
			updCred(rcvActR.cred_cd(), rcvActR.trd_cur_cd(), rcvActR.trd_cur_amt().negate(),
					rcvActR.trd_ptn_typ(), MSC_CRED_UPD_TYP.UPD_CHK);

			// 請求明細振替情報の作成
			insBillDSwAct(billDL);

			return insFrRcvActDL;
		}

		/**
		 * 振替元の入金実績を更新する
		 * 
		 * @param frR 振替元入金実績情報
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 * @param hdrR 上り電文のヘッダ情報
		 */
		protected void crtFrRcvAct(MST_RCV_ACT_R frR, MST_RCV_ACT_R toR,
				MCList<RcvActCmn_Upd03_BillDR> billDL, RcvActCmn_Chk03_HdrR hdrR) {
			setInsFrRcvAct(frR, toR, billDL, hdrR);
		}

		/**
		 * 振替元の入金実績の更新条件を設定する
		 * 
		 * @param frR 振替元入金実績情報
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 * @param hdrR 上り電文のヘッダ情報
		 */
		protected void setInsFrRcvAct(MST_RCV_ACT_R frR, MST_RCV_ACT_R toR,
				MCList<RcvActCmn_Upd03_BillDR> billDL, RcvActCmn_Chk03_HdrR hdrR) {

			frR.bcst_cd(billDL.get(0).bcst_cd());
			frR.bill_dpt_cd(billDL.get(0).bill_dpt_cd());
			frR.cred_cd(MSBGL_ArUtil.getBp(frR.bcst_cd()).ar_cred_cd());
			frR.dpt_cd(hdrR.dpt_cd());
			frR.wg_cd(hdrR.wg_cd());
			frR.usr_cd(hdrR.usr_cd());
			frR.rcv_dt(hdrR.sw_dt());
			frR.trd_cur_cd(billDL.get(0).trd_cur_cd());
			frR.base_cur_cd(getBaseCur().cur_cd());
			frR.xrate(toR.xrate());
			frR.xrate_cd(toR.xrate_cd());
			frR.trd_cur_amt(getSumAmt(billDL));
			frR.subttl1(frR.trd_cur_amt());
			frR.subttl2(0);
			frR.subttl3(0);
			frR.tax_amt(0);
			frR.tax_subttl1(0);
			frR.tax_subttl2(0);
			frR.tax_subttl3(0);
			frR.base_cur_amt(getSumBaseCurAmt(billDL));
			frR.base_cur_subttl1(frR.base_cur_amt());
			frR.base_cur_subttl2(0);
			frR.base_cur_subttl3(0);
			frR.base_cur_tax_amt(0);
			frR.base_cur_tax_subttl1(0);
			frR.base_cur_tax_subttl2(0);
			frR.base_cur_tax_subttl3(0);
			frR.trd_rmrks(hdrR.trd_rmrks());
			frR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			frR.par_rcv_act_no(toR.rcv_act_no());
			frR.par_rcv_act_seq(toR.rcv_act_seq());
			frR.ar_slip_prnt_typ(MSC_AR_SLIP_PRNT_TYP.ARSW.value());
		}

		/**
		 * 振替元の入金実績明細を更新する
		 * @param frR 振替元入金実績情報
		 * @param billDL 請求明細情報
		 */
		protected MCList<MST_RCV_ACT_D_R> insFrRcvActHD(MST_RCV_ACT_R rcvActR, MCList<RcvActCmn_Upd03_BillDR> billDL) {
			MCList<MST_RCV_ACT_D_R> rcvActDL = createFrRcvActD(rcvActR, billDL);
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_I04", rcvActR, rcvActR_bldr);
			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_D_I04", rcvActDL, rcvActDL_bldr);
			return rcvActDL;
		}

		/**
		 * 振替元の入金実績明細情報を作成する
		 * 
		 * @param frR 振替元入金実績情報
		 * @param billDL 請求明細情報
		 * @return 入金実績明細情報
		 */
		protected MCList<MST_RCV_ACT_D_R> createFrRcvActD(
				MST_RCV_ACT_R rcvActR, MCList<RcvActCmn_Upd03_BillDR> billDL) {

			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);

			MCList<RcvActCmn_Upd03_BillDR> keyL = billDL.groupBy(getFrRcvActDKey());
			keyL.sort(getFrRcvActDKey());

			int cnt = 0;
			for (RcvActCmn_Upd03_BillDR keyR : keyL) {

				MCList<RcvActCmn_Upd03_BillDR> subL = billDL.subList(getFrRcvActDKey(), keyR);

				MST_RCV_ACT_D_R rcvActDR = createFrRcvActD(keyR, rcvActR, subL, cnt);
				rcvActDL.add(rcvActDR);

				// 発番した値を請求明細にフィードバック
				subL.setValue(RcvActCmn_Upd03_BillDR.$rcv_act_d_no, rcvActDR.rcv_act_d_no());
				subL.setValue(RcvActCmn_Upd03_BillDR.$rcv_act_d_seq, rcvActDR.rcv_act_d_seq());
				
				// 振替元の基準通貨金額調整
				MCList<RcvActCmn_Upd03_BillDR> updBillDL = adjustBaseCurAmt(rcvActR.trd_cur_cd(), rcvActDR, subL, rcvActR);
				updBillDBaseCurAmt(updBillDL);
				cnt++;
			}
			
			return rcvActDL;
		}

		protected void updBillDBaseCurAmt(MCList<RcvActCmn_Upd03_BillDR> updBillDL) {
			MST_BILL_D_R dbc = MST_BILL_D_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.base_cur_amt, bindEx("base_cur_amt"));
			dbUpdateKey("MSBGL5020_MST_BILL_D_U01", updBillDL, builder);
		}

		protected MCList<RcvActCmn_Upd03_BillDR> adjustBaseCurAmt(String trdCurCd, MST_RCV_ACT_D_R actDR,
				MCList<RcvActCmn_Upd03_BillDR> grpList, MST_RCV_ACT_R rcvActR) {
			
			// 基準通貨金額調整を反映する請求明細
			MCList<RcvActCmn_Upd03_BillDR> updBillDL = MCList.create(RcvActCmn_Upd03_BillDR.class);
			
			// 債権共通処理で、今回振替した金額分の売掛消込予定を更新済なので、needsAdjustBaseCurAmtメソッドの金額にはMCNumber.ZEROを渡す
			if (needsAdjustBaseCurAmt(trdCurCd, actDR.acst_cd(), actDR.ar_dpt_cd(), actDR.iv_no(), actDR.wrk_no(), actDR.ar_typ(),
					actDR.trd_cur_amt1())) {
				
				// 債権共通処理で、今回振替した請求明細を振替済なので振替額を除いた金額で差額を求める。calcBaseCurDiffメソッドの金額にはMCNumber.ZEROを渡す。
				MCNumber diffAmt = calcBaseCurDiff(trdCurCd, actDR.acst_cd(), actDR.ar_dpt_cd(), actDR.iv_no(), actDR.wrk_no(),
						actDR.ar_typ(), actDR.bcst_cd(), actDR.bill_dpt_cd(), actDR.base_cur_amt1());
				
				if (!diffAmt.isZero()) {
					actDR.base_cur_amt1(actDR.base_cur_amt1().add(diffAmt.negate()));
					setSwAmt(grpList);
					FXUCC_Divide.prop(grpList, diffAmt.negate(), getBaseCur().amt_dec_place().intValue(),
							RcvActCmn_Upd03_BillDR.$base_cur_sw_amt, RcvActCmn_Upd03_BillDR.$base_cur_amt_add);
					for (RcvActCmn_Upd03_BillDR r : grpList) {
						MCNumber addBillDAmt = r.base_cur_amt_add().multiply(MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ()));
						r.base_cur_amt(r.base_cur_amt().add(addBillDAmt));
						updBillDL.add(r);
						// 入金実績ヘッダにも差額を反映
						rcvActR.base_cur_amt(rcvActR.base_cur_amt().add(r.base_cur_amt_add()));
						rcvActR.base_cur_subttl1(rcvActR.base_cur_subttl1().add(r.base_cur_amt_add()));
					}
				}
			}
			return updBillDL;
		}

		protected void setSwAmt(MCList<RcvActCmn_Upd03_BillDR> tgtL) {
			for (RcvActCmn_Upd03_BillDR r : tgtL) {
				MCNumber amt = MCNumber.sum(r.base_cur_amt(), r.base_cur_tax_amt()).multiply(MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ()));
				r.base_cur_sw_amt(amt);
			}
		}
		
		/**
		 * 入金実績明細を集約するためのキー情報
		 * 
		 * @return 入金実績明細のキー情報の配列
		 */
		protected String[] getFrRcvActDKey() {
			return new String[] {
					RcvActCmn_Upd03_BillDR.$bill_dpt_cd,
					RcvActCmn_Upd03_BillDR.$acst_cd,
					RcvActCmn_Upd03_BillDR.$ar_dpt_cd,
					RcvActCmn_Upd03_BillDR.$wg_cd,
					RcvActCmn_Upd03_BillDR.$bill_d_iv_no,
					RcvActCmn_Upd03_BillDR.$trd_cur_cd,
					RcvActCmn_Upd03_BillDR.$wrk_no,
					RcvActCmn_Upd03_BillDR.$ar_typ
			};
		}

		/**
		 * 入金実績明細情報を作成する
		 * 
		 * @param keyR 入金実績明細のキー情報
		 * @param frR 振替元の入金実績情報
		 * @param subL キー情報で集約した請求明細
		 * @param cnt ループカウント
		 * @return 入金実績明細情報
		 */
		protected MST_RCV_ACT_D_R createFrRcvActD(RcvActCmn_Upd03_BillDR keyR,
				MST_RCV_ACT_R frR, MCList<RcvActCmn_Upd03_BillDR> subL, int cnt) {

			MST_RCV_ACT_D_R rcvActDR = MST_RCV_ACT_D_R.create();

			rcvActDR.rcv_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTD));
			rcvActDR.rcv_act_d_seq(1);
			rcvActDR.rcv_act_no(frR.rcv_act_no());
			rcvActDR.rcv_act_seq(frR.rcv_act_seq());
			rcvActDR.disp_seq(cnt);
			rcvActDR.bill_mng_no(null);
			rcvActDR.bcst_cd(frR.bcst_cd());
			rcvActDR.bill_dpt_cd(keyR.bill_dpt_cd());
			rcvActDR.acst_cd(keyR.acst_cd());
			rcvActDR.ar_dpt_cd(keyR.ar_dpt_cd());
			rcvActDR.wg_cd(keyR.wg_cd());
			rcvActDR.iv_no(keyR.bill_d_iv_no());
			rcvActDR.wrk_no(keyR.wrk_no());
			rcvActDR.ar_typ(keyR.ar_typ());
			rcvActDR.ar_sttl_cd1(null);
			rcvActDR.ar_sttl_typ1(null);
			rcvActDR.trd_cur_amt1(getSumAmt(subL));
			rcvActDR.trd_cur_tax_amt1(0);
			rcvActDR.trd_cur_amt2(0);
			rcvActDR.trd_cur_tax_amt2(0);
			rcvActDR.trd_cur_amt3(0);
			rcvActDR.trd_cur_tax_amt3(0);
			rcvActDR.base_cur_amt1(getSumBaseCurAmt(subL));
			rcvActDR.base_cur_tax_amt1(0);
			rcvActDR.base_cur_amt2(0);
			rcvActDR.base_cur_tax_amt2(0);
			rcvActDR.base_cur_amt3(0);
			rcvActDR.base_cur_tax_amt3(0);
			rcvActDR.trd_xrate(frR.xrate());
			rcvActDR.gen_rcv_no(null);
			rcvActDR.sub_char1(null);
			rcvActDR.sub_char2(null);
			rcvActDR.sub_char3(null);
			rcvActDR.appl_cmpl_flg(false);

			return rcvActDR;
		}

		/**
		 * 振替先を更新する<p>
		 * ①入金実績の作成<br>
		 * ②与信の更新<br>
		 * ③請求明細振替情報の作成
		 * 
		 * @param toR 振替先情報
		 * @param billDL 請求明細
		 */
		protected void updateToInfo(MST_RCV_ACT_R toR, MCList<RcvActCmn_Upd03_BillDR> billDL,
				RcvActCmn_Chk03_HdrR hdrR, RcvActCmn_Chk03_SwToR swToR) {
			// 入金実績、入金実績明細の作成
			insToRcvAct(toR, billDL, hdrR);
			insToRcvActD(toR, swToR, billDL);
			// 与信の更新
			updCred(toR.cred_cd(), toR.trd_cur_cd(), toR.trd_cur_amt().negate(),
					toR.trd_ptn_typ(), MSC_CRED_UPD_TYP.UPD_CHK);
			// 請求明細振替情報の作成
			insBillDSwAct(billDL);
		}

		/**
		 * 振替先の入金実績を更新する
		 * 
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 * @param hdrR 上り電文のヘッダ情報
		 */
		protected void insToRcvAct(MST_RCV_ACT_R toR, MCList<RcvActCmn_Upd03_BillDR> billDL, RcvActCmn_Chk03_HdrR hdrR) {
			setInsToRcvAct(toR, billDL, hdrR);
			MCQueryApiBuilder toR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_I05", toR, toR_bldr);
		}

		/**
		 * 振替先の入金実績の更新条件を設定する
		 * 
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 * @param hdrR 上り電文のヘッダ情報
		 */
		protected void setInsToRcvAct(MST_RCV_ACT_R toR,
				MCList<RcvActCmn_Upd03_BillDR> billDL, RcvActCmn_Chk03_HdrR hdrR) {

			toR.cred_cd(MSBGL_ArUtil.getBp(toR.bcst_cd()).ar_cred_cd());
			toR.tax_amt(0);
			toR.base_cur_tax_amt(0);
			toR.rcv_no(null);
			toR.base_cur_cd(getBaseCur().cur_cd());
			toR.rcv_dt(hdrR.sw_dt());
			toR.ac_dt(hdrR.ac_dt());
			toR.ac_ym(getAcYm(hdrR.ac_dt()));
			toR.usr_cd(hdrR.usr_cd());
			toR.xfr_psn(null);
			toR.note_no(null);
			toR.bd_dpt_cd(null);
			toR.debt_cred_id_typ(null);
			toR.debt_cred_id_cd(null);
			toR.debt_cred_nm(null);
			toR.subttl2(0);
			toR.subttl3(0);
			toR.tax_subttl1(0);
			toR.tax_subttl2(0);
			toR.tax_subttl3(0);
			toR.base_cur_subttl2(0);
			toR.base_cur_subttl3(0);
			toR.base_cur_tax_subttl1(0);
			toR.base_cur_tax_subttl2(0);
			toR.base_cur_tax_subttl3(0);
			toR.trd_rmrks(hdrR.trd_rmrks());
			toR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			toR.ar_slip_prnt_typ(MSC_AR_SLIP_PRNT_TYP.ARSW.value());
			toR.trd_cur_amt(getSumAmt(billDL).negate());
			toR.subttl1(toR.trd_cur_amt());
			toR.base_cur_amt(getSumBaseCurAmt(billDL).negate());
			toR.base_cur_subttl1(toR.base_cur_amt());
		}

		/**
		 * 振替先の入金実績明細を更新する
		 * 
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 */
		protected void insToRcvActD(MST_RCV_ACT_R toR,
				RcvActCmn_Chk03_SwToR swToR, MCList<RcvActCmn_Upd03_BillDR> billDL) {
			
			MCList<MST_RCV_ACT_D_R> rcvActDL = createToRcvActD(toR, swToR, billDL);
			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL5020_MST_RCV_ACT_D_I05", rcvActDL, rcvActDL_bldr);
		}

		/**
		 *  振替先の入金実績明細情報を作成する
		 *  
		 * @param toR 振替先入金実績情報
		 * @param billDL 請求明細情報
		 * @return 入金実績明細情報
		 */
		protected MCList<MST_RCV_ACT_D_R> createToRcvActD(MST_RCV_ACT_R toR,
				RcvActCmn_Chk03_SwToR swToR, MCList<RcvActCmn_Upd03_BillDR> billDL) {

			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);

			MCList<RcvActCmn_Upd03_BillDR> keyL = billDL.groupBy(getToRcvActDKey());
			keyL.sort(getToRcvActDKey());

			int cnt = 0;
			for (RcvActCmn_Upd03_BillDR keyR : keyL) {

				MCList<RcvActCmn_Upd03_BillDR> subL = billDL.subList(getToRcvActDKey(), keyR);

				MST_RCV_ACT_D_R rcvActDR = createToArSlipD(keyR, toR, swToR, subL, cnt);
				rcvActDL.add(rcvActDR);
				subL.setValue(RcvActCmn_Upd03_BillDR.$rcv_act_d_no, rcvActDR.rcv_act_d_no());
				subL.setValue(RcvActCmn_Upd03_BillDR.$rcv_act_d_seq, rcvActDR.rcv_act_d_seq());

				cnt++;
			}
			return rcvActDL;
		}

		/**
		 * 入金実績明細を集約するためのキー情報
		 * 
		 * @return 入金実績明細のキー情報の配列
		 */
		protected String[] getToRcvActDKey() {
			return new String[] {
					RcvActCmn_Upd03_BillDR.$bill_d_iv_no,
					RcvActCmn_Upd03_BillDR.$ar_typ
			};
		}

		/**
		 * 入金実績明細情報を作成する
		 * 
		 * @param keyR 入金実績明細のキー情報
		 * @param toR 振替先の入金実績情報
		 * @param subL キー情報で集約した請求明細
		 * @param cnt ループカウント
		 * @return 入金実績明細情報
		 */
		protected MST_RCV_ACT_D_R createToArSlipD(RcvActCmn_Upd03_BillDR keyR,
				MST_RCV_ACT_R toR, RcvActCmn_Chk03_SwToR swToR, 
				MCList<RcvActCmn_Upd03_BillDR> subL, int cnt) {

			MST_RCV_ACT_D_R rcvActDR = MST_RCV_ACT_D_R.create();

			rcvActDR.rcv_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTD));
			rcvActDR.rcv_act_d_seq(1);
			rcvActDR.rcv_act_no(toR.rcv_act_no());
			rcvActDR.rcv_act_seq(toR.rcv_act_seq());
			rcvActDR.disp_seq(cnt);
			rcvActDR.bill_mng_no(null);
			rcvActDR.bcst_cd(toR.bcst_cd());
			rcvActDR.bill_dpt_cd(toR.bill_dpt_cd());
			rcvActDR.acst_cd(swToR.acst_cd());
			rcvActDR.ar_dpt_cd(swToR.ar_dpt_cd());
			rcvActDR.wg_cd(swToR.wg_cd());
			rcvActDR.iv_no(keyR.bill_d_iv_no());
			rcvActDR.wrk_no(swToR.wrk_no());
			rcvActDR.ar_typ(keyR.ar_typ());
			rcvActDR.ar_sttl_cd1(null);
			rcvActDR.ar_sttl_typ1(null);
			rcvActDR.trd_cur_amt1(getSumAmt(subL).negate());
			rcvActDR.trd_cur_tax_amt1(MCNumber.ZERO);
			rcvActDR.trd_cur_amt2(MCNumber.ZERO);
			rcvActDR.trd_cur_tax_amt2(MCNumber.ZERO);
			rcvActDR.trd_cur_amt3(MCNumber.ZERO);
			rcvActDR.trd_cur_tax_amt3(MCNumber.ZERO);
			rcvActDR.base_cur_amt1(getSumBaseCurAmt(subL).negate());
			rcvActDR.base_cur_tax_amt1(MCNumber.ZERO);
			rcvActDR.base_cur_amt2(MCNumber.ZERO);
			rcvActDR.base_cur_tax_amt2(MCNumber.ZERO);
			rcvActDR.base_cur_amt3(MCNumber.ZERO);
			rcvActDR.base_cur_tax_amt3(MCNumber.ZERO);
			rcvActDR.trd_xrate(toR.xrate());
			rcvActDR.gen_rcv_no(null);
			rcvActDR.sub_char1(null);
			rcvActDR.sub_char2(null);
			rcvActDR.sub_char3(null);
			rcvActDR.appl_cmpl_flg(false);

			return rcvActDR;
		}

		/**
		 * リストの金額（税込）の合計を取得する
		 * 
		 * @param billDL 対象のリスト
		 * @return 金額（税込）の合計
		 */
		protected MCNumber getSumAmt(MCList<RcvActCmn_Upd03_BillDR> billDL) {
			MCNumber sum = MCNumber.ZERO;
			// 金額と消費税の合計を計算（取引区分ごとに符号を加味して加算する）
			for (RcvActCmn_Upd03_BillDR r : billDL) {
				MCNumber amt = MCNumber.sum(r.trd_cur_amt(), r.trd_cur_tax_amt()).multiply(
						MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ()));
				sum = MCNumber.sum(sum, amt);
			}
			return sum;
		}

		/**
		 * リストの基準金額（税込）の合計を取得する
		 * 
		 * @param billDL 対象のリスト
		 * @return 基準金額（税込）の合計
		 */
		protected MCNumber getSumBaseCurAmt(MCList<RcvActCmn_Upd03_BillDR> billDL) {
			MCNumber sum = MCNumber.ZERO;
			// 金額と消費税の合計を計算（取引区分ごとに符号を加味して加算する）
			for (RcvActCmn_Upd03_BillDR r : billDL) {
				MCNumber amt = MCNumber.sum(r.base_cur_amt(),
						r.base_cur_tax_amt()).multiply(
								MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ()));
				sum = MCNumber.sum(sum, amt);
			}
			return sum;
		}

		/**
		 * 請求明細振替実績を登録する
		 * 
		 * @param billDL 請求明細情報
		 */
		protected void insBillDSwAct(MCList<RcvActCmn_Upd03_BillDR> billDL) {
			MCList<MST_BILL_D_SW_ACT_R> swActL = createBillDSwAct(billDL);
			MCQueryApiBuilder swActL_bldr = MCQueryApiBuilder.create(MST_BILL_D_SW_ACT_R.create("T"));
			dbInsert("MSBGL5020_MST_BILL_D_SW_ACT_I01", swActL, swActL_bldr);
		}

		/**
		 * 請求明細振替実績情報を作成する
		 * 
		 * @param billDL 請求明細情報
		 * @return 請求明細振替実績情報
		 */
		protected MCList<MST_BILL_D_SW_ACT_R> createBillDSwAct(
				MCList<RcvActCmn_Upd03_BillDR> billDL) {
			
			MCList<MST_BILL_D_SW_ACT_R> swActL = MCList.create(MST_BILL_D_SW_ACT_R.class);
			
			for (RcvActCmn_Upd03_BillDR billDR : billDL) {
				swActL.add(createBillDSwAct(billDR));
			}
			
			return swActL;
		}

		/**
		 * 請求明細振替実績情報を設定する
		 * 
		 * @param billDR 請求明細情報
		 * @return 請求明細振替実績情報
		 */
		protected MST_BILL_D_SW_ACT_R createBillDSwAct(RcvActCmn_Upd03_BillDR billDR) {

			MST_BILL_D_SW_ACT_R swActR = MST_BILL_D_SW_ACT_R.create();
			swActR.setAttributes(billDR);

			swActR.rcv_act_d_no(billDR.rcv_act_d_no());
			swActR.rcv_act_d_seq(billDR.rcv_act_d_seq());
			swActR.sw_bill_d_no(billDR.bill_d_no());
			return swActR;
		}

		/**
		 * 印刷処理を実行する
		 * 
		 * @param frRcvActR 振替元入金実績
		 */
		protected void prnt(MCList<MST_RCV_ACT_R> frRcvActL) {
			MSBGL_ArSlipPrntService.ArSlip_Prnt01 op =
					MSBGL_ArSlipPrntService.crtArSlip_Prnt01();

			for (MST_RCV_ACT_R frRcvActR : frRcvActL) {
				ArSlip_Prnt01_HdrR hdrR = ArSlip_Prnt01_HdrR.create();
				hdrR.rcv_act_no(frRcvActR.rcv_act_no());
				hdrR.rcv_act_seq(frRcvActR.rcv_act_seq());
				op.up0().add(hdrR);	
			}
			op.exec();
		}

		/**
		 * 入金実績ＩＦサービスを実行する
		 * 
		 * @param frRcvActDL 振替元入金実績明細
		 */
		protected void execRcvActIfCrtService(MCList<MST_RCV_ACT_D_R> frRcvActDL) {
			MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 op =
					MSBGL_RcvActIfCrtService.crtRcvActIfCrt_Ins01();

			for (MST_RCV_ACT_D_R frRcvActDR : frRcvActDL) {
				RcvActIfCrt_Ins01_CndR cndR = RcvActIfCrt_Ins01_CndR.create();
				cndR.rcv_act_d_no(frRcvActDR.rcv_act_d_no());
				cndR.rcv_act_d_seq(frRcvActDR.rcv_act_d_seq());
				op.up0().add(cndR);
			}
			op.exec();
		}
	}

	/**
	 * RcvActCmn_Upd04オペレーション.<p>
	 *
	 * 消費税差額調整の入金実績を登録する共通処理<br>
	 */
	public class RcvActCmn_Upd04 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {
			for (RcvActCmn_Chk04_CndR r : up0()) {
				execMain(r);
			}
		}

		/**
		 * メイン処理実行<br />
		 * 上り電文の単位にメイン処理を実行します
		 * 
		 * @param cndR
		 */
		protected void execMain(RcvActCmn_Chk04_CndR cndR) {
			// 対象請求データの請求先ＣＤ、通貨ＣＤを取得する
			MST_BILL_R billInfo = getBillInfo(cndR);

			MCList<MCRow> regL = MCList.create(MCRow.class);

			// 税ＣＤ毎にループする
			for (MCList<MST_BILL_D_R> tgtTaxL : getTgtTaxL(billInfo).groupList(MAM_TAX_R.$tax_rate)) {
				// 税率に対応する税CDを特定しているので、この時点で混在はない
				// 後続で作成する請求明細や受払実績にはこの税を使用する
				billInfo.setStringNE("tax_cd", tgtTaxL.getString(0, "tax_cd"));
				
				// 売掛先、債権部門、債権区分別のリストを取得
				MCList<MST_BILL_D_R> taxL = makeTaxL(tgtTaxL);
				
				// 取引通貨による税差額調整（取引通貨）
				adjustTax(tgtTaxL, taxL, regL, billInfo);
				
				// 為替レートによる税差額調整（基準通貨）
				adjustTaxBcur(tgtTaxL, taxL, regL, billInfo);
				
			}
			for (MCList<MCRow> l : regL.groupList("tax_cd")) {
				// 複数税ＣＤに対応するようbillInfoの税ＣＤを置き換える
				billInfo.setString("tax_cd", l.get(0).getString("tax_cd"));
				// 入金実績を登録する
				Object[] o = regRcvAct(l, billInfo, cndR);
				// 受払実績登録サービス実行
				callIoActSvCrt(o, billInfo);
			}
			// 登録するデータが存在する場合
			if (!regL.isEmpty()) {
				callIoActSvUpd();
			}
		}

		/**
		 * 対象請求取得<br />
		 * 
		 * 対象とする請求を取得する。
		 * 
		 * @return 請求
		 */
		protected MST_BILL_R getBillInfo(RcvActCmn_Chk04_CndR cndR) {

			MST_BILL_R r = MST_BILL_R.create("T");
			MAM_CUR_R cur1 = MAM_CUR_R.create(MST_BILL_R.$CUR1);
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(r);
			r_bldr.addSelect(cur1.amt_dec_place);
			r_bldr.activeForeign(MST_BILL_R.$CUR1);
			dbSelectKey("MSBGL5020_MST_BILL_S02", r, r_bldr, cndR.bill_mng_no());
			return r;
		}

		/**
		 * 税ＣＤ取得<br />
		 * 税ＣＤを取得する。
		 * 
		 * @return 税ＣＤを格納したリスト
		 */
		protected MCList<? extends MCRow> getTaxCdL(RcvActCmn_Chk04_CndR cndR) {
			MCList<MST_BILL_D_R> l = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			MAM_TAX_R m1 = MAM_TAX_R.create("M1");
			l.addBooleanColumn("inc_tax_flg");
			l_bldr.setDistinct();
			l_bldr.setSelect(t.tax_cd,m1.inc_tax_flg);
			l_bldr.addInnerJoin(m1, bracket( t.tax_cd.eq(m1.tax_cd)));
			l_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")), cndR.bill_mng_no());
			l_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
			l_bldr.addOrderByAsc(t.tax_cd, m1.inc_tax_flg);
			dbSelect("MSBGL5020_MST_BILL_D_S02", l, l_bldr);
			return l;
		}

		/**
		 * 売掛先別消費税調整額リスト作成<br />
		 * 
		 * 売掛先、債権部門、債権区分別に消費税調整額リストを作成する。
		 */
		protected MCList<MST_BILL_D_R> makeTaxL(MCList<MST_BILL_D_R> tgtTaxL) {
			MCGroupByPolicy plcy = new MCGroupByPolicy(getAdjustTaxKey());
			plcy.sum(
				MST_BILL_D_R.$trd_cur_amt,
				MST_BILL_D_R.$trd_cur_tax_amt,
				MST_BILL_D_R.$base_cur_tax_amt
			);
			
			MCList<MST_BILL_D_R> l = tgtTaxL.groupBy(plcy);
			
			// 昇順と降順が混ざっているのでJava側でソート
			l.sort(getCtaxLSortPolicy());
			
			// 金額と消費税の合計を一時カラムに設定
			// (値を取得するときは任意の一行から取得することを想定)
			l.addNumberColumn("total_amt", l.sum(MST_BILL_D_R.$trd_cur_amt));
			l.addNumberColumn("total_tax_amt", l.sum(MST_BILL_D_R.$trd_cur_tax_amt));
			l.addNumberColumn("total_bcur_tax_amt", l.sum(MST_BILL_D_R.$base_cur_tax_amt));
			
			return l;
		}
		/**
		 * 税差額計算の対象を取得する
		 */
		protected MCList<MST_BILL_D_R> getTgtTaxL(MST_BILL_R billInfo) {
			MCList<MST_BILL_D_R> tgtTaxL = MCList.create(MST_BILL_D_R.class);
			tgtTaxL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			tgtTaxL.addStringColumn(MST_BILL_ACST_R.$acst_cd);
			tgtTaxL.addStringColumn(MST_BILL_ACST_R.$ar_dpt_cd);
			tgtTaxL.addNumberColumn(MST_RCV_ACT_D_R.$trd_cur_tax_amt1);
			tgtTaxL.addNumberColumn(MST_RCV_ACT_D_R.$trd_cur_tax_amt2);
			tgtTaxL.addNumberColumn(MST_RCV_ACT_D_R.$base_cur_tax_amt1);
			tgtTaxL.addNumberColumn(MST_RCV_ACT_D_R.$base_cur_tax_amt2);
			tgtTaxL.addStringColumn(MST_RCV_ACT_R.$tax_cd1);
			tgtTaxL.addStringColumn(MST_RCV_ACT_R.$tax_cd2);
			tgtTaxL.addNumberColumn(MAM_TAX_R.$tax_rate);
			tgtTaxL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			tgtTaxL.addBooleanColumn(MAM_TAX_R.$sls_flg);
			tgtTaxL.addBooleanColumn("bill_tax_disp_flg1");
			tgtTaxL.addBooleanColumn("bill_tax_disp_flg2");
			
			// 請求明細、入金実績明細から税差額計算の対象を取得
			executeQuery(tgtTaxL, MSBGL5020_MST_BILL_D_S03(), billInfo);
			if (!isNull(tgtTaxL)) {
				MCList<MST_BILL_D_R> newTgtTaxL = adjTgtTaxL(tgtTaxL, billInfo);
				tgtTaxL.clear();
				tgtTaxL.addAll(newTgtTaxL);
			}
			// 前受金に対して売掛先別情報を設定
			setAcstInf4Adv(tgtTaxL);
			
			// 各種税額をまとめる
			calcTgTaxL(tgtTaxL);
			
			return tgtTaxL;
		}
		protected MCList<MST_BILL_D_R> adjTgtTaxL(MCList<MST_BILL_D_R> orgTgtTaxL, MST_BILL_R billInfo) {
			MCList<MST_BILL_D_R> newTgtTaxL = MCList.create(MST_BILL_D_R.class);

			for (MST_BILL_D_R orgTgtTaxR : orgTgtTaxL) {
				if (MAC_AR_STTL_TYP.isSETOFF_DR(orgTgtTaxR.getString("ar_sttl_typ1"))
						&& !orgTgtTaxR.getBooleanNE("bill_tax_disp_flg1")) {
					continue;
				}
				if (MAC_AR_STTL_TYP.isSETOFF_DR(orgTgtTaxR.getString("ar_sttl_typ2"))
						&& !orgTgtTaxR.getBooleanNE("bill_tax_disp_flg2")) {
					continue;
				}
				// 都度請求の場合は入金情報を請求書に表示しないので、入金（相殺）データを請求時税調整の対象外とする。
				if (billInfo.bill_each_sls_flg()
						&& MSC_BILL_D_TYP.isRCV(orgTgtTaxR.bill_d_typ())
						&& !MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(orgTgtTaxR.trd_ptn_typ())) {
					continue;
				}
				newTgtTaxL.add(orgTgtTaxR);
			}
			return newTgtTaxL;
		}
		/**
		 * 前受金に対して売掛先別情報を設定する
		 */
		protected void setAcstInf4Adv(MCList<MST_BILL_D_R> tgtTaxL) {
			if (tgtTaxL.isEmpty()) {
				return;
			}
			// 売掛先別一覧請求の並びに合わせる
			// 前渡金の税額は↑の先頭に含めて計算する
			String[] cols = 	new String[getAdjustTaxKey().length - 1];		// 税率は除く
			System.arraycopy(getAdjustTaxKey(), 0, cols, 0, cols.length);
			tgtTaxL.sort(cols);
			
			MST_BILL_D_R baseR = tgtTaxL.get(0);
			for (MST_BILL_D_R r : tgtTaxL) {
				if (isNullAnd(r.toArray(cols))) {
					for (String s : cols) {
						r.setValueNE(s, baseR.getValueNE(s));
					}
				}
			}
		}
		
		/**
		 * 税をまとめる<br>
		 * 複数の項目に散らばっている税をひとつの項目にまとめる
		 */
		protected void calcTgTaxL(MCList<MST_BILL_D_R> tgtTaxL) {
			
			MCList<MST_BILL_D_R> taxL = MCList.create(MST_BILL_D_R.class);
			for (MST_BILL_D_R r : tgtTaxL) {
				if (isNullAnd(r.toArray("tax_cd", "tax_cd1", "tax_cd2"))) {
					continue;
				}
				
				MST_BILL_D_R taxR = taxL.add();
				for (String s : getAdjustTaxKey()) {
					taxR.setValueNE(s, r.getValueNE(s));
				}
				taxR.xrate(r.xrate());
				
				MCNumber pm = MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.getBoolean(MAM_ITM_R.$dscnt_itm_flg));
				if (!isNull(r.getString("tax_cd"))) {
					taxR.tax_cd(r.getString("tax_cd"));
					taxR.trd_cur_amt(r.trd_cur_amt().multiply(pm));
					taxR.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(pm));
					taxR.base_cur_tax_amt(r.base_cur_tax_amt().multiply(pm));
					// MSUCL0130#getTaxDiff用に一時カラムを追加（amt は内税・外税関係なく常に税抜金額）
					taxR.setNumberNE("amt", taxR.trd_cur_amt());
				}
				else if (!isNull(r.getString("tax_cd1"))) {
					taxR.tax_cd(r.getString("tax_cd1"));
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(r.getString("ar_sttl_typ1")) ? -1 : 1;
					taxR.trd_cur_amt(r.getNumber("trd_cur_amt1").multiply(pm).multiply(sign));
					taxR.trd_cur_tax_amt(r.getNumber("trd_cur_tax_amt1").multiply(pm).multiply(sign));
					taxR.base_cur_tax_amt(r.getNumber("base_cur_tax_amt1").multiply(pm).multiply(sign));
					// MSUCL0130#getTaxDiff用に一時カラムを追加（amt は内税・外税関係なく常に税抜金額）
					taxR.setNumberNE("amt", taxR.trd_cur_amt().subtract(taxR.trd_cur_tax_amt()));
				}
				else if (!isNull(r.getString("tax_cd2"))) {
					taxR.tax_cd(r.getString("tax_cd2"));
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(r.getString("ar_sttl_typ2")) ? -1 : 1;
					taxR.trd_cur_amt(r.getNumber("trd_cur_amt2").multiply(pm).multiply(sign));
					taxR.trd_cur_tax_amt(r.getNumber("trd_cur_tax_amt2").multiply(pm).multiply(sign));
					taxR.base_cur_tax_amt(r.getNumber("base_cur_tax_amt2").multiply(pm).multiply(sign));
					// MSUCL0130#getTaxDiff用に一時カラムを追加（amt は内税・外税関係なく常に税抜金額）
					taxR.setNumberNE("amt", taxR.trd_cur_amt().subtract(taxR.trd_cur_tax_amt()));
				}
				
				MAM_TAX_R dbc = getTaxR(taxR.tax_cd());
				taxR.setNumberNE(MAM_TAX_R.$tax_rate, dbc.tax_rate());
				taxR.setBooleanNE(MAM_TAX_R.$inc_tax_flg, dbc.inc_tax_flg());
				taxR.setBooleanNE(MAM_TAX_R.$sls_flg, dbc.sls_flg());
			}
			
			// 税率に対する税CDを統一する
			initTaxMap(taxL);
			taxL.forEach(r -> {
				r.tax_cd(getTaxCd(r.getNumber(MAM_TAX_R.$tax_rate)));
			});
			
			tgtTaxL.setAll(taxL);
		}
		
		protected Map<MCNumber, String> _taxMap;
		protected void initTaxMap(MCList<MST_BILL_D_R> tgtTaxL) {
			_taxMap = new HashMap<>();
			
			// 税率に対して代表となる（税差額の請求明細や受払実績を作成する際に使用する）税CDを特定する
			// 同じ税率内で外税、内税が混在する場合は外税を優先する
			MCSortPolicy plcy = new MCSortPolicy();
			plcy.add(SortType.DESC, MAM_TAX_R.$sls_flg);
			plcy.add(SortType.ASC, MAM_TAX_R.$inc_tax_flg);
			plcy.add(SortType.ASC, "tax_cd");
			
			for (MCList<MST_BILL_D_R> taxL : tgtTaxL.groupList(MAM_TAX_R.$tax_rate)) {
				taxL.sort(plcy);
				MST_BILL_D_R taxR = taxL.get(0);
				_taxMap.put(taxR.getNumber(MAM_TAX_R.$tax_rate), taxR.tax_cd());
			}
		}
		protected String getTaxCd(MCNumber taxRate) {
			return _taxMap.get(taxRate);
		}
		
		protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache;
		protected MAM_TAX_R getTaxR(String taxCd) {
			if (_taxCache == null) {
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_TAX_R.create("T"));
				_taxCache = new FXUCL_MCDbcCache<>(bldr);
			}
			return _taxCache.get(taxCd);
		}
		
		/**
		 * 消費税差額調整を行う単位
		 */
		protected String[] _adjustTaxKey;
		protected String[] getAdjustTaxKey() {
			if (_adjustTaxKey == null) {
				_adjustTaxKey = new String[]{
					MST_BILL_ACST_R.$ar_dpt_cd,
					MST_BILL_ACST_R.$acst_cd,
					MST_BILL_ACST_R.$ar_typ,
					MAM_TAX_R.$tax_rate
				};
			}
			return _adjustTaxKey;
		}
		protected void adjustTax(MCList<MST_BILL_D_R> tgtTaxL, MCList<MST_BILL_D_R> taxL, MCList<MCRow> regL, MST_BILL_R billInfo) {
			if (!MSBGL_ArUtil.getTaxOnBillFlg(billInfo.bcst_cd())) {
				return;
			}
			// 消費税差額を取得
			MCNumber totalAmt = taxL.getNumber(0, "total_amt");
			MCNumber totalTaxAmt = taxL.getNumber(0, "total_tax_amt");
			
			MCNumber taxDiff =
				MSUCL_AmtUtil.getTaxDiff(
					tgtTaxL,
					MSBGL_ArUtil.getBp(billInfo.bcst_cd()).bill_tax_rnd_typ(),
					billInfo.getNumber(MAM_CUR_R.$amt_dec_place),
					tgtTaxL.getNumber(0, MAM_TAX_R.$tax_rate),
					null,
					totalTaxAmt
				);
			taxL.addNumberColumn("tax_diff", taxDiff);
			
			if (!taxDiff.isZero()) {
				// 金額の合計が0の場合、税額による割振りを行う。0以外の場合は金額による割り振りを行う
				String propCol = totalAmt.isZero() ? MST_BILL_D_R.$trd_cur_tax_amt : MST_BILL_D_R.$trd_cur_amt;
				String allocCol = "alloc_amt";
				String adjCol = "adj_amt";
			
				taxL.addNumberColumn(allocCol);
				
				FXUCC_Divide.prop(
					taxL, taxDiff,
					billInfo.getNumber("amt_dec_place").intValue(),
					propCol, allocCol
				);
				
				// 税ＣＤごとに計算した調整額を売掛先毎にまとめる
				setTotalAjst(taxL, regL, billInfo, adjCol, allocCol);
			}
		}
		protected void adjustTaxBcur(MCList<MST_BILL_D_R> tgtTaxL, MCList<MST_BILL_D_R> taxL, MCList<MCRow> regL, MST_BILL_R billInfo) {
			String allocCol = "alloc_bcur_amt";
			String adjCol = "adj_bcur_amt";
			
			if (isSame(billInfo.trd_cur_cd(), getCo().base_cur_cd())) {
				if (nvl(taxL.getNumberNE(0, "tax_diff"), MCNumber.ZERO).isZero()) {
					return;
				}
				taxL.forEach(r -> {
					// 基準通貨税額＝取引通貨税額
					r.setNumberNE(allocCol, r.getNumberNE("alloc_amt"));
				});
				
				// 税ＣＤごとに計算した調整額を売掛先毎にまとめる
				setTotalAjst(taxL, regL, billInfo, adjCol, allocCol);
			}
			else {
				if (nvl(taxL.getNumberNE(0, "tax_diff"), MCNumber.ZERO).isZero()
					&& !getCo().bill_xrate_conv_flg()) {
					return;
				}
				
				// 消費税差額を取得
				MCNumber totalAmt = taxL.getNumber(0, "total_amt");
				MCNumber totalBCurTaxAmt = taxL.getNumber(0, "total_bcur_tax_amt");
				
				MCNumber bcurTaxDiff =
					MSUCL_AmtUtil.getTaxDiff(
						tgtTaxL,
						getCo().xrate_rnd_typ(),
						getBaseCur().amt_dec_place(),
						tgtTaxL.getNumber(0, MAM_TAX_R.$tax_rate),
						getCo().bill_xrate_conv_flg() ? billInfo.bill_xrate() : 
							getXrate(billInfo.trd_cur_cd(), getCo().base_cur_cd(), getCo().sls_xrate_cd(), billInfo.base_dt()),
						totalBCurTaxAmt
					);
				
				if (!bcurTaxDiff.isZero()) {
					// 金額の合計が0の場合、税額による割振りを行う。0以外の場合は金額による割り振りを行う
					String propCol = totalAmt.isZero() ? MST_BILL_D_R.$base_cur_tax_amt : MST_BILL_D_R.$trd_cur_amt;
				
					taxL.addNumberColumn(allocCol);
					
					FXUCC_Divide.prop(
						taxL, bcurTaxDiff,
						getBaseCur().amt_dec_place().intValue(),
						propCol, allocCol
					);
					
					// 税ＣＤごとに計算した調整額を売掛先毎にまとめる
					setTotalAjst(taxL, regL, billInfo, adjCol, allocCol);
				}
			}
		}

		/**
		 * 売掛先別消費税調整額リストソートポリシー取得<br />
		 * 
		 * 売掛先別消費税調整額リストのソートポリシーを取得する。
		 * 
		 * @return 売掛先別消費税調整額リストのソートポリシー
		 */
		protected MCSortPolicy getCtaxLSortPolicy() {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.DESC, MST_BILL_D_R.$trd_cur_amt);
			sp.add(SortType.ASC, MST_BILL_D_R.$trd_cur_tax_amt);
			return sp;
		}

		/**
		 * 消費税差額取得<br />
		 * 
		 * 請求単位の消費税額と、明細単位の消費税額の合計との差額を取得する。
		 * 
		 * @param bcstCd 請求先ＣＤ
		 * @param curCd 通貨ＣＤ
		 * @param incTax 内税ＦＬＧ
		 * @param taxCd 税ＣＤ
		 * @param billDTotalAmt 請求単位の金額合計
		 * @param billDTotalTaxAmt 請求単位の消費税額合計
		 * 
		 * @return 請求単位の消費税額と、明細単位の消費税額の合計との差額
		 */
		protected MCNumber getTaxDiff(String bcstCd, String curCd,
				String taxCd, MCNumber billDTotalAmt, MCNumber billDTotalTaxAmt) {

			// 請求単位の消費税
			MCNumber billTaxAmt = getBillTaxAmt(billDTotalAmt, taxCd, curCd, bcstCd);

			// 請求単位の消費税と、明細単位の消費税合計の差額
			return billTaxAmt.subtract(billDTotalTaxAmt);
		}

		/**
		 * 請求金額と税率から消費税額を計算する
		 * 
		 * @param amt 請求金額
		 * @param tax_rate 税率
		 * @param cur_cd 通貨ＣＤ
		 * @param bcst_cd 請求先ＣＤ
		 * @return
		 */
		protected MCNumber getBillTaxAmt(MCNumber amt, String taxCd, String cur_cd,
				String bcst_cd) {

			MAM_TAX_R taxR = MAM_TAX_R.create("T");
			MCQueryApiBuilder taxR_bldr = MCQueryApiBuilder.create(taxR);
			dbSelectKey("MSBGL5020_MAM_TAX_S01", taxR, taxR_bldr, taxCd);

			return MAUCL_AmtUtil.getTaxAmt(amt, taxR.tax_rate(),
					MSBGL_ArUtil.getCur(cur_cd).amt_dec_place(),
					MSBGL_ArUtil.getBp(bcst_cd).bill_tax_rnd_typ());
		}

		/**
		 * 消費税調整額登録情報作成<br />
		 * 
		 * 消費税調整額登録情報を作成する。
		 * 
		 * @param infoL 消費税調整額リスト
		 * 各Rowは消費税額(tax_amt)、売掛先ＣＤ(acst_cd)、債権部門(ar_dpt_cd)、債権区分(ar_typ)を持っている前提。
		 * @param regL 消費税調整額登録情報
		 * @param billInfo 請求情報
		 * @param adjCol 調整額格納先項目名
		 * @param allocCol 調整額格納元項目名
		 */
		protected void setTotalAjst(MCList<? extends MCRow> infoL, MCList<MCRow> regL, MST_BILL_R billInfo, String adjCol, String allocCol) {
			String[] keys = {"tax_cd", "acst_cd", "ar_dpt_cd", "ar_typ"};
			for (MCRow info : infoL) {
				MCNumber allocAmt = info.getNumber(allocCol);
				// 金額が0の場合は飛ばす
				if (allocAmt.isZero()) {
					continue;
				}

				Comparable<?>[] vals = {
						billInfo.getString("tax_cd"), info.getString("acst_cd"), info.getString("ar_dpt_cd"), info.getString("ar_typ"),
				};
				MCRow r = regL.getFirst(keys, vals);

				if (isNull(r)) {
					r = MCRow.create();
					r.setStringNE("tax_cd", billInfo.getString("tax_cd"));
					r.setStringNE("acst_cd", info.getString("acst_cd"));
					r.setStringNE("ar_dpt_cd", info.getString("ar_dpt_cd"));
					r.setStringNE("ar_typ", info.getString("ar_typ"));
					r.setNumberNE(adjCol, allocAmt);
					regL.add(r);
				}
				else {
					r.setNumberNE(adjCol, nvl(r.getNumberNE(adjCol), MCNumber.ZERO).add(allocAmt));
				}
			}
		}

		/**
		 * 入金実績登録<br />
		 * 
		 * 入金実績の登録を行う。
		 * 
		 * @param regL 消費税調整額登録情報
		 * @param billInfo 請求
		 */
		protected Object[] regRcvAct(MCList<MCRow> regL, MST_BILL_R billInfo,
				RcvActCmn_Chk04_CndR cndR) {
			// データ件数をチェック
			chkDataCnt(regL);

			// 入金実績ヘッダ登録
			MST_RCV_ACT_R rcvActR = insRcvAct(regL, billInfo);

			// 入金実績明細登録
			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			for (int lno = 1; lno <= regL.size(); lno++) {
				MCRow regR = regL.get(lno - 1);
				MST_SLS_ACT_D_R slsActDR = getSlsAct(regR, billInfo);
				slsActDL.add(slsActDR);
				
				regR.addNumberColumn("xrate", slsActDR.getNumber("xrate"));
				regR.addStringColumn("iv_no", slsActDR.getString("iv_no"));
				// 明細登録
				MST_RCV_ACT_D_R rcvActDR = insRcvActD(lno, billInfo, regR, rcvActR, cndR);
				// 債権共通サービスの呼び出し
				callArCmnService(rcvActR, rcvActDR, billInfo);
				rcvActDL.add(rcvActDR);
			}
			
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbInsertEx("MSBGL5020_MST_RCV_ACT_I06", rcvActR, rcvActR_bldr);

			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T"));
			dbInsertEx("MSBGL5020_MST_RCV_ACT_D_I06", rcvActDL, rcvActDL_bldr);

			return new Object[] {
					rcvActR,
					rcvActDL
					,slsActDL
			};
		}

		/**
		 * データ件数チェック<br />
		 * 
		 * 登録情報が処理可能な件数かをチェックする。
		 * 
		 * @param regL 消費税調整額登録情報
		 * 
		 * @throws HED0005W 登録情報が処理可能な件数を超えたとき
		 */
		protected void chkDataCnt(MCList<MCRow> regL) {
			int dataCntLength = Integer.toString(regL.size()).length();
			int lnoLength = MST_RCV_ACT_D_R.rcv_act_seq_META.length();
			if (dataCntLength > lnoLength) {
				MCNumber maxCnt = MCNumber.TEN.pow(lnoLength).subtract(1);
				// 消費税差額調整伝票の明細が{1}件を超えました。
				throw new MCAppException("", maxCnt);
			}
		}

		/**
		 * 入金実績新規登録<br />
		 * 入金実績を新規登録する。
		 * 
		 * @param regL 消費税調整額登録情報
		 * @param billInfo 請求
		 * 
		 * @return 登録した入金実績
		 */
		protected MST_RCV_ACT_R insRcvAct(MCList<MCRow> regL, MST_BILL_R billInfo) {
			MST_RCV_ACT_R insR = MST_RCV_ACT_R.create();

			copy(insR, billInfo, createMapRcvAct());

			java.util.function.Function<String, MCNumber> sum = s -> {
				MCNumber amt = MCNumber.ZERO;
				for (MCRow r : regL) {
					amt = amt.add(nvl(r.getNumberNE(s), MCNumber.ZERO));
				}
				return amt;
			};
			MCNumber rcvAmt = sum.apply("adj_amt");
			MCNumber rcvBcurAmt = sum.apply("adj_bcur_amt");
			insR.tax_amt(rcvAmt);
			insR.tax_subttl1(rcvAmt);
			insR.tax_subttl2(MCNumber.ZERO);
			insR.tax_subttl3(MCNumber.ZERO);

			insR.base_cur_tax_amt(rcvBcurAmt);
			insR.base_cur_tax_subttl1(rcvBcurAmt);
			insR.base_cur_tax_subttl2(MCNumber.ZERO);
			insR.base_cur_tax_subttl3(MCNumber.ZERO);


			return insR;
		}

		/**
		 * 入金実績明細新規登録<br />
		 * 入金実績明細を新規登録する。
		 * 
		 * @param lno 行ＮＯ
		 * @param billInfo 請求
		 * @param regR 消費税調整額登録情報
		 * @param rcvActR 登録した入金実績
		 * @param cndR 上り電文情報
		 * @return 登録した入金実績明細
		 */
		protected MST_RCV_ACT_D_R insRcvActD(int lno, MST_BILL_R billInfo, MCRow regR,
				MST_RCV_ACT_R rcvActR, RcvActCmn_Chk04_CndR cndR) {
			MST_RCV_ACT_D_R insR = MST_RCV_ACT_D_R.create();

			insR.rcv_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTD));
			insR.rcv_act_d_seq(1);
			insR.rcv_act_no(rcvActR.rcv_act_no());
			insR.rcv_act_seq(rcvActR.rcv_act_seq());
			insR.disp_seq(lno);
			insR.bcst_cd(rcvActR.bcst_cd());
			insR.bill_dpt_cd(rcvActR.bill_dpt_cd());
			insR.acst_cd(regR.getString("acst_cd"));
			insR.ar_dpt_cd(regR.getString("ar_dpt_cd"));
			insR.wg_cd(MSBGL_ArUtil.getDpt(insR.ar_dpt_cd(), rcvActR.ac_dt()).wg_cd());
			insR.iv_no(regR.getString("iv_no"));
			if (billInfo.bill_each_sls_flg()) {
				insR.setStringNE("bill_iv_no", insR.iv_no());
			}
			insR.trd_cur_tax_amt1(nvl(regR.getNumberNE("adj_amt"), MCNumber.ZERO));
			insR.trd_cur_tax_amt2(MCNumber.ZERO);
			insR.trd_cur_tax_amt3(MCNumber.ZERO);
			insR.base_cur_tax_amt1(nvl(regR.getNumberNE("adj_bcur_amt"), MCNumber.ZERO));
			insR.base_cur_tax_amt2(MCNumber.ZERO);
			insR.base_cur_tax_amt3(MCNumber.ZERO);
			insR.bill_mng_no(cndR.bill_mng_no());
			insR.trd_cur_amt1(MCNumber.ZERO);
			insR.trd_cur_amt2(MCNumber.ZERO);
			insR.trd_cur_amt3(MCNumber.ZERO);
			insR.base_cur_amt1(MCNumber.ZERO);
			insR.base_cur_amt2(MCNumber.ZERO);
			insR.base_cur_amt3(MCNumber.ZERO);
			insR.trd_xrate(regR.getNumber("xrate"));
			insR.wrk_no(billInfo.wrk_no());
			insR.ar_typ(regR.getString("ar_typ"));

			return insR;
		}


		/**
		 * 債権共通サービス呼出<br />
		 * 債権共通サービスを呼び出し、消費税差額の調整を行う。
		 * 
		 * @param rcvActR 登録した入金実績
		 * @param rcvActDR 登録した入金実績明細
		 */
		protected void callArCmnService(MST_RCV_ACT_R rcvActR, MST_RCV_ACT_D_R rcvActDR,
				MST_BILL_R billInfo) {
			ArCmn_Upd01_DtlR dtlR = ArCmn_Upd01_DtlR.create();
			MCList<ArCmn_Upd01_DtlR> dtlL = MCList.create(ArCmn_Upd01_DtlR.class);
			copy(dtlR, rcvActDR, createMap_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R(rcvActR));
			setTaxDiffBillCl(dtlR, rcvActDR, billInfo);
			dtlL.add(dtlR);

			execArCmnService(MSC_AR_OPE_TYP.TAX_DIFF_BILL_CL, dtlL);
		}
		
		/**
		 * 消費税差額調整に必要な情報を個別に設定する
		 * 
		 * @param dtlR
		 * @param rcvActDR
		 */
		protected void setTaxDiffBillCl(ArCmn_Upd01_DtlR dtlR, MST_RCV_ACT_D_R rcvActDR,
				MST_BILL_R billInfo) {
			dtlR.trd_cur_tax_amt(rcvActDR.trd_cur_tax_amt1());
			dtlR.base_cur_tax_amt(rcvActDR.base_cur_tax_amt1());
			dtlR.bill_cl_dt(billInfo.bill_cl_dt());
			dtlR.tgt_flg(true);
		}

		/**
		 * 受払実績サービスを実行する
		 * 
		 * @param o 入金実績、入金実績明細のコンテナを格納したオブジェクト
		 * @param billInfo 今回対象となる請求情報
		 */
		protected void callIoActSvCrt(Object[] o, MST_BILL_R billInfo) {

			// 消費税差額の入金実績、入金実績明細の情報
			MST_RCV_ACT_R rcvActR = (MST_RCV_ACT_R) o[0];
			MCList<MST_RCV_ACT_D_R> rcvActDL = (MCList<MST_RCV_ACT_D_R>) o[1];
			MCList<MST_SLS_ACT_D_R> slsActDL = (MCList<MST_SLS_ACT_D_R>) o[2];

			MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);
			for (int i = 0; i < rcvActDL.size(); i++) {
				MST_RCV_ACT_D_R rcvActDR = rcvActDL.get(i);
				MST_SLS_ACT_D_R slsActDR = slsActDL.get(i);
				IoAct_Ins01_DtlR dtlR = setIoActDtl(rcvActR, rcvActDR, slsActDR);
				ioActL.add(dtlR);
			}

			execIoActSv(ioActL);
		}

		/**
		 * 受払実績サービスの上り電文を設定する
		 * 
		 * @param rcvActR 入金実績情報
		 * @param rcvActDR 入金実績明細情報
		 * @param slsActDR 売上実績、売上実績明細情報
		 * @return 受払実績サービスの上り電文
		 */
		protected IoAct_Ins01_DtlR setIoActDtl(MST_RCV_ACT_R rcvActR, MST_RCV_ACT_D_R rcvActDR,
				MST_SLS_ACT_D_R slsActDR) {
			IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();

			String trdPtnTyp = slsActDR.getString("trd_ptn_typ");
			
			ioActR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			ioActR.ac_dt(rcvActR.ac_dt());
			ioActR.act_tm(getToday());
			ioActR.act_no(rcvActR.rcv_act_no());
			ioActR.act_seq(rcvActR.rcv_act_seq());
			ioActR.act_rev_no(rcvActR.rcv_act_rev());
			ioActR.act_d_no(rcvActDR.rcv_act_d_no());
			ioActR.act_d_seq(rcvActDR.rcv_act_d_seq());
			ioActR.un_fix_flg(false);
			ioActR.trd_cd(slsActDR.getString("trd_cd"));
			ioActR.trd_ptn_typ(trdPtnTyp);
			ioActR.trn_typ(MSC_TRN_TYP.RCV_ACT.value());
			ioActR.io_act_typ(getIoActTyp(trdPtnTyp));
			ioActR.rsn_cd(slsActDR.rsn_cd());
			// 部門ＣＤは計上日を基準に取り直して設定する
			ioActR.sls_dpt_cd(getDptCd(slsActDR.getString("sls_dpt_cd"), ioActR.ac_dt()));
			ioActR.ar_dpt_cd(getDptCd(slsActDR.getString("ar_dpt_cd"), ioActR.ac_dt()));
			ioActR.sls_usr_cd(slsActDR.getString("sls_usr_cd"));
			ioActR.itm_cd(slsActDR.itm_cd());
			ioActR.itm_sub1(slsActDR.itm_sub1());
			ioActR.itm_sub2(slsActDR.itm_sub2());
			ioActR.itm_sub3(slsActDR.itm_sub3());
			ioActR.itm_nm(slsActDR.itm_nm());
			ioActR.stk_mng_typ(slsActDR.stk_mng_typ());
			ioActR.sundry_itm_flg(slsActDR.sundry_itm_flg());
			ioActR.lot_no(slsActDR.lot_no());
			ioActR.sublot_no(slsActDR.sublot_no());
			ioActR.sno1(slsActDR.sno1());
			ioActR.sno2(slsActDR.sno2());
			ioActR.sno3(slsActDR.sno3());
			ioActR.sno4(slsActDR.sno4());
			ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			ioActR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			ioActR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			ioActR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			ioActR.stk_bp_cd(MAC_STR.NULL_VAL.value());
			ioActR.trd_unit_cd(slsActDR.trd_unit_cd());
			ioActR.trd_unit_qty(0);
			ioActR.pack_unit_cd(slsActDR.getString("pack_unit_cd"));
			ioActR.pack_unit_qty(0);
			ioActR.base_unit_cd(slsActDR.base_unit_cd());
			ioActR.base_unit_qty(0);
			
			MCNumber pm = MAUCL_TrdUtil.getAmtDispPm(
				isNullOrNullVal(trdPtnTyp) ? MAC_TRD_PTN_TYP.SLS.value() : trdPtnTyp,
				slsActDR.getBoolean("dscnt_itm_flg"));
			ioActR.trd_cur_cd(slsActDR.getString("trd_cur_cd"));
			ioActR.trd_cur_tax_amt(	rcvActDR.trd_cur_tax_amt1().multiply(pm));
			ioActR.base_cur_cd(slsActDR.getString("base_cur_cd"));
			ioActR.base_cur_tax_amt(rcvActDR.base_cur_tax_amt1().multiply(pm));
			ioActR.ptax_cur_cd(getCo().ptax_cur_cd());
			ioActR.tax_cd(slsActDR.getString("tax_cd"));
			ioActR.xrate_cd(slsActDR.getString("xrate_cd"));
			ioActR.xrate(slsActDR.getNumber("xrate"));
			if (!isNull(getCo().ptax_cur_cd())) {
				ioActR.ptax_xrate_cd(slsActDR.getString("xrate_cd"));
				ioActR.ptax_xrate(slsActDR.getNumber("ptax_xrate"));
				
				if (isSame(getCo().ptax_cur_cd(), ioActR.trd_cur_cd())) {
					ioActR.ptax_cur_tax_amt(ioActR.trd_cur_tax_amt());
				}
				else {
					ioActR.ptax_cur_tax_amt(getPtaxCurTaxAmt(ioActR.trd_cur_tax_amt(), ioActR.ptax_xrate()));
				}
			}
			ioActR.slo_no(slsActDR.slo_no());
			ioActR.iv_no(slsActDR.getString("iv_no"));
			ioActR.dlv_cd(slsActDR.dlv_cd());
			ioActR.tdlv_cd(slsActDR.tdlv_cd());
			ioActR.acst_cd(slsActDR.getString("acst_cd"));
			ioActR.cst_cd(slsActDR.getString("cst_cd"));
			ioActR.dest_cd1(slsActDR.dest_cd1());
			ioActR.dest_cd2(slsActDR.dest_cd2());
			ioActR.dest_cd3(slsActDR.dest_cd3());
			ioActR.cst_itm_cd(slsActDR.cst_itm_cd());
			ioActR.cst_itm_nm(slsActDR.cst_itm_nm());
			ioActR.no_gi_alloc_flg(true);
			ioActR.trd_rmrks(slsActDR.getString("trd_rmrks"));
			ioActR.trd_d_rmrks(slsActDR.trd_d_rmrks());
			// 取引パタン区分よる制御
			if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP.isSLS_CNSGN(trdPtnTyp)) {
				// 納品先がNULLの場合はNULL文字を設定する
				ioActR.stk_arrv_bp_cd(isNull(slsActDR.dlv_cd()) ? MAC_STR.NULL_VAL.value() : slsActDR.dlv_cd());
				ioActR.gi_wg_cd(getLocWgCd(slsActDR.loc_cd()));
				ioActR.gi_loc_cd(slsActDR.loc_cd());
				ioActR.gi_str_ln_cd(slsActDR.str_ln_cd());
				ioActR.gi_gd_cd(slsActDR.gd_cd());
				if (isNull(ioActR.gi_loc_cd())) {
					ioActR.bd_dpt_cd(ioActR.sls_dpt_cd());
					ioActR.bd_wg_cd(MSBGL_ArUtil.getWgCd(ioActR.sls_dpt_cd(), ioActR.ac_dt()));
				}
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp)) {
				ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				ioActR.gr_wg_cd(getLocWgCd(slsActDR.loc_cd()));
				ioActR.gr_loc_cd(slsActDR.loc_cd());
				ioActR.gr_str_ln_cd(slsActDR.str_ln_cd());
				ioActR.gr_gd_cd(slsActDR.gd_cd());
			}
			else if (MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp) || MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp)) {
				ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				ioActR.bd_dpt_cd(ioActR.sls_dpt_cd());
				ioActR.bd_wg_cd(MSBGL_ArUtil.getWgCd(ioActR.sls_dpt_cd(), ioActR.ac_dt()));
			}
			else {
				// 売上実績が取得できなかった場合
				ioActR.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS.value());
				ioActR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				ioActR.bd_dpt_cd(ioActR.ar_dpt_cd());
				ioActR.bd_wg_cd(MSBGL_ArUtil.getWgCd(ioActR.ar_dpt_cd(), ioActR.ac_dt()));
			}

			return ioActR;
		}

		/**
		 * 場所に対するＷＧを取得
		 * 
		 * @param loc_cd
		 * @return wg_cd
		 */
		protected String getLocWgCd(String loc_cd) {
			MAM_LOC_R locR = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(locR);
			locR_bldr.setSelect(locR.wg_cd);
			locR_bldr.setWhere(locR.loc_cd.eq(bind("1")), loc_cd);
			dbSelect("MSBGL5020_MAM_LOC_S01", locR, locR_bldr);
			return locR.wg_cd();
		}

		/**
		 * 納税通貨税額の取得
		 * 取引通貨税額を納税為替レートで換算する
		 * 
		 * @param trdCurTaxAmt 取引通貨税額
		 * @param ptaxXrate 納税為替レート
		 * @return 納税通貨税額
		 */
		protected MCNumber getPtaxCurTaxAmt(MCNumber trdCurTaxAmt, MCNumber ptaxXrate) {
			MCRow inRow = MCRow.create();
			MCRow outRow = MCRow.create();
			String ptaxCurCd = "O_PTAX_CUR_CD";
			String upriDecPlace = "O_UPRI_DEC_PLACE";
			String amtDecPlace = "O_AMT_DEC_PLACE";
			outRow.addStringColumn(ptaxCurCd);
			outRow.addNumberColumn(upriDecPlace);
			outRow.addNumberColumn(amtDecPlace);

			String procId = "MAPA_XCHNG$P_GET_PTAX_CUR_INFO";
			execProc(createSqlId(LOGIC_ID, "MAPA_XCHNG$P_GET_PTAX_CUR_INFO", "01"),
					procId,
					inRow,
					outRow,
					":" + ptaxCurCd+ ", " +  ":" + upriDecPlace+ ", " +  ":" + amtDecPlace,
					ptaxCurCd, upriDecPlace, amtDecPlace);
			
			return convCur(trdCurTaxAmt, ptaxXrate,
					outRow.getNumber(amtDecPlace), getCo().xrate_rnd_typ());
		}

		/**
		 * 受払区分を取得する
		 * 
		 * @param trdPtnTyp 取引パタン区分
		 * @return 受払区分
		 */
		protected String getIoActTyp(String trdPtnTyp) {
			String ioActTyp;

			if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)) {
				ioActTyp = MSC_IO_ACT_TYP.SLS.value();
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp)) {
				ioActTyp = MSC_IO_ACT_TYP.SLS_RTN_GR.value();
			}
			else if (MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp)) {
				ioActTyp = MSC_IO_ACT_TYP.SLS_DSCNT.value();
			}
			else if (MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp)) {
				ioActTyp = MSC_IO_ACT_TYP.SLS_XTRA.value();
			}
			else {
				ioActTyp = null;
			}

			return ioActTyp;
		}

		/** 日付に対して有効な部門ＣＤをキャッシュ */
		protected FXUCL_MCFuncCache<String> _dptCdCache;

		protected String getDptCd(String dptCd, MCDate acDt) {
			if (_dptCdCache == null) {
				_dptCdCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_DPT$F_GET_DPT_CD(value((String) in[0]), value((MCDate) in[1]));
				});
			}
			return _dptCdCache.get(dptCd, acDt);
		}

		/**
		 * 売上実績取得<br />
		 * 今回請求締対象の請求管理ＮＯと消費税差額調整対象の税ＣＤを条件に、
		 * 請求明細、売上実績、売上実績明細の情報を取得する
		 * 
		 * @param billInfo 請求情報
		 * @return 売上実績、売上実績明細情報
		 */
		protected MST_SLS_ACT_D_R getSlsAct(MCRow regR, MST_BILL_R billInfo) {
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
			MST_BILL_D_R t3 = MST_BILL_D_R.create("T3");
			MST_BILL_ACST_R t4 = MST_BILL_ACST_R.create("T4");
			MST_SLS_ACT_IO_R t5 = MST_SLS_ACT_IO_R.create("T5");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			slsActDL_bldr.addSelect(t2.trd_cd);
			slsActDL_bldr.addSelect(t2.trd_ptn_typ);
			slsActDL_bldr.addSelect(t2.sls_dpt_cd);
			slsActDL_bldr.addSelect(t2.wg_cd);
			slsActDL_bldr.addSelect(t2.ar_dpt_cd);
			slsActDL_bldr.addSelect(t2.sls_usr_cd);
			slsActDL_bldr.addSelect(t2.trd_cur_cd);
			slsActDL_bldr.addSelect(t2.base_cur_cd);
			slsActDL_bldr.addSelect(t3.tax_cd);
			slsActDL_bldr.addSelect(t2.xrate_cd);
			slsActDL_bldr.addSelect(t3.xrate);
			slsActDL_bldr.addSelect(t2.iv_no);
			slsActDL_bldr.addSelect(t2.cst_cd);
			slsActDL_bldr.addSelect(t2.acst_cd);
			slsActDL_bldr.addSelect(t2.trd_rmrks);
			slsActDL_bldr.addSelect(t5.pack_unit_cd);
			slsActDL_bldr.addSelect(t2.ptax_xrate);
			slsActDL_bldr.addSelect(itm.dscnt_itm_flg);
			slsActDL.addBooleanColumn("dscnt_itm_flg");
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$trd_unit_cd);
			slsActDL_bldr.addSelect(t5.trd_unit_cd);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$base_unit_cd);
			slsActDL_bldr.addSelect(t5.base_unit_cd);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$lot_no);
			slsActDL_bldr.addSelect(t5.lot_no);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$sublot_no);
			slsActDL_bldr.addSelect(t5.sublot_no);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$gd_cd);
			slsActDL_bldr.addSelect(t5.gd_cd);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$loc_cd);
			slsActDL_bldr.addSelect(t5.loc_cd);
			slsActDL_bldr.removeSelect(MST_SLS_ACT_D_R.$str_ln_cd);
			slsActDL_bldr.addSelect(t5.str_ln_cd);

			slsActDL_bldr.addInnerJoin(t2, bracket(t.sls_act_no.eq(t2.sls_act_no)
					.and(t.sls_act_seq.eq(t2.sls_act_seq))));
			slsActDL_bldr.addInnerJoin(t3, bracket(t.sls_act_d_no.eq(t3.act_d_no)
					.and(t.sls_act_d_seq.eq(t3.act_d_seq))));
			slsActDL_bldr.addInnerJoin(t4, bracket(t3.bill_acst_no.eq(t4.bill_acst_no)));
			slsActDL_bldr.addInnerJoin(t5, bracket(t.sls_act_d_no.eq(t5.sls_act_d_no)
					.and(t.sls_act_d_seq.eq(t5.sls_act_d_seq))));
			slsActDL_bldr.addLeftOuterJoin(itm, bracket(t.itm_cd.eq(itm.itm_cd)
							.and(t.itm_sub1.eq(itm.itm_sub1))
							.and(t.itm_sub2.eq(itm.itm_sub2))
							.and(t.itm_sub3.eq(itm.itm_sub3))));
			slsActDL_bldr.addWhereWithAnd(t3.bill_mng_no.eq(bind("bill_mng_no")));
			slsActDL_bldr.addWhereWithAnd(t3.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())));
			slsActDL_bldr.addWhereWithAnd(t4.acst_cd.eq(bind("1")), regR.getString("acst_cd"));
			slsActDL_bldr.addWhereWithAnd(t4.ar_dpt_cd.eq(bind("1")), regR.getString("ar_dpt_cd"));
			slsActDL_bldr.addWhereWithAnd(t4.ar_typ.eq(bind("1")), regR.getString("ar_typ"));
			slsActDL_bldr.addConstWhereWithAnd(t.bd_dpt_cd.isNull());
			slsActDL_bldr.setOrderByAsc(t3.bill_d_no);
			dbSelect("MSBGL5020_MST_SLS_ACT_D_S01",
				slsActDL, slsActDL_bldr, getBillMngNo4SlsAct(regR, billInfo));

			if (slsActDL.isEmpty()) {
				return createSlsActR(regR, billInfo);
			}
			else {
				MST_SLS_ACT_D_R slsActDR = slsActDL.getFirst(MST_SLS_ACT_D_R.$tax_cd, billInfo.getString("tax_cd"));
				if (isNull(slsActDR)) {
					slsActDR = slsActDL.get(0);
				}
				return slsActDR;
			}
		}
		/**
		 * 売上実績を取得するための請求管理ＮＯを取得する
		 */
		protected MCList<MST_BILL_R> getBillMngNo4SlsAct(MCRow regR, MST_BILL_R billInfo) {
			// 請求締対象に売上が含まれていない場合に税差額が発生した場合を考慮して、
			// 締対象の請求を含め、請求明細区分「売上」を持つ請求が属する請求管理ＮＯを取得する
			MST_BILL_ACST_R t4 = MST_BILL_ACST_R.create("T4");
			MST_BILL_D_R t5 = MST_BILL_D_R.create("T5");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t4);
			bldr.setSelect(max(t4.bill_mng_no).as("bill_mng_no"));
			bldr.addInnerJoin(t5,
				t5.bill_mng_no.eq(t4.bill_mng_no).and(t5.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value()))));
			bldr.addWhereWithAnd(t4.bill_mng_no.lte(bind("1")), billInfo.bill_mng_no());
			bldr.addWhereWithAnd(t4.acst_cd.eq(bind("1")), regR.getString("acst_cd"));
			bldr.addWhereWithAnd(t4.ar_dpt_cd.eq(bind("1")), regR.getString("ar_dpt_cd"));
			bldr.addWhereWithAnd(t4.ar_typ.eq(bind("1")), regR.getString("ar_typ"));
			
			MCList<MST_BILL_R> rsltL = MCList.create(MST_BILL_R.class);
			dbSelect("MSBGL5020_MST_BILL_D_S08", rsltL, bldr);
			
			return rsltL.distinctNE(MST_BILL_R.$bill_mng_no);
		}

		/**
		 * 受払実績の作成に使用する売上実績を生成する
		 */
		protected MST_SLS_ACT_D_R createSlsActR(MCRow regR, MST_BILL_R billInfo) {
			// 売上実績が取得できなかった場合に補完する売上実績を生成する
			// 売上実績が全くない売掛先や債権部門に請求残高振替が行われると売上実績が取得できないケースがある
			
			MST_SLS_ACT_D_R slsActR = MST_SLS_ACT_D_R.create();
			slsActR.addStringColumn("trd_cd");
			slsActR.addStringColumn("trd_ptn_typ");
			slsActR.addStringColumn("sls_dpt_cd");
			slsActR.addStringColumn("wg_cd");
			slsActR.addStringColumn("ar_dpt_cd");
			slsActR.addStringColumn("sls_usr_cd");
			slsActR.addStringColumn("trd_cur_cd");
			slsActR.addStringColumn("base_cur_cd");
			slsActR.addStringColumn("xrate_cd");
			slsActR.addNumberColumn("xrate");
			slsActR.addStringColumn("iv_no");
			slsActR.addStringColumn("cst_cd");
			slsActR.addStringColumn("acst_cd");
			slsActR.addStringColumn("trd_rmrks");
			slsActR.addStringColumn("pack_unit_cd");
			slsActR.addNumberColumn("ptax_xrate");
			slsActR.addBooleanColumn("dscnt_itm_flg");
			
			// NULL不可項目の初期値
			slsActR.setStringNE("itm_cd", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("itm_sub1", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("itm_sub2", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("itm_sub3", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("stk_mng_typ", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("lot_no", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("sublot_no", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("sno1", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("sno2", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("sno3", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("sno4", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("iv_no", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("trd_unit_cd", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("pack_unit_cd", MAC_STR.NULL_VAL.value());
			slsActR.setStringNE("base_unit_cd", MAC_STR.NULL_VAL.value());
			
			// 売上実績が取得できなかった場合に最低限設定する項目
			slsActR.setStringNE("tax_cd", regR.getStringNE("tax_cd"));
			slsActR.setStringNE("acst_cd", regR.getStringNE("acst_cd"));
			slsActR.setStringNE("ar_dpt_cd", regR.getStringNE("ar_dpt_cd"));
			slsActR.setStringNE("ar_typ", regR.getStringNE("ar_typ"));
			slsActR.setStringNE("trd_cur_cd", billInfo.trd_cur_cd());
			slsActR.setStringNE("base_cur_cd", getCo().base_cur_cd());
			slsActR.setStringNE("xrate_cd", getCo().sls_xrate_cd());
			slsActR.setNumberNE("xrate",
				getXrate(
					slsActR.getStringNE("trd_cur_cd"),
					slsActR.getStringNE("base_cur_cd"),
					slsActR.getStringNE("xrate_cd"),
					billInfo.base_dt()));
			if (!isNull(getCo().ptax_cur_cd())) {
				slsActR.setNumberNE("ptax_xrate",
					getXrate(
						slsActR.getStringNE("trd_cur_cd"),
						getCo().ptax_cur_cd(),
						slsActR.getStringNE("xrate_cd"),
						billInfo.base_dt()));
			}
			
			return slsActR;
		}
		protected MCNumber getXrate(String trdCurCd, String baseCurCd, String xrateCd, MCDate baseDt) {
			MCRow bindR = MCRow.create();
			bindR.addStringColumn("I_TRD_CUR_CD", trdCurCd);
			bindR.addStringColumn("I_BASE_CUR_CD", baseCurCd);
			bindR.addStringColumn("I_XRATE_CD", xrateCd);
			bindR.addDateColumn("I_BASE_DT", baseDt);
			return execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
					MAPA_XCHNG$F_GET_XRATE(bind("i_trd_cur_cd"), bind("i_base_cur_cd"), bind("i_xrate_cd"), bind("i_base_dt")),
					bindR);
		}
		// MST_BILL_R → MST_RCV_ACT_R
		protected MapRcvAct<MST_RCV_ACT_R, MST_BILL_R> createMapRcvAct() {
			return new MapRcvAct<MST_RCV_ACT_R, MST_BILL_R>();
		}

		public class MapRcvAct<D extends MST_RCV_ACT_R, S extends MST_BILL_R> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_R.$bcst_cd, MST_BILL_R.$bcst_cd);
				addColumnPathMap(MST_RCV_ACT_R.$bill_dpt_cd, MST_BILL_R.$bill_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_R.$trd_cur_cd, MST_BILL_R.$trd_cur_cd);
			}
			@Override
			public void valueCopy(D dest, S src) {
				MCDate acDt = getAcDt(src);
				MCDate acYm = getAcYm(acDt);
				dest.rcv_act_seq(1);
				dest.rcv_act_rev(1);
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()));
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value());
				dest.ar_trd_grp_typ(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value());
				dest.dpt_cd(MSBGL_ArUtil.getBcstDpt(src.bcst_cd(), acDt, src.bill_dpt_cd(), src.bill_dpt_cd()));
				dest.wg_cd(MSBGL_ArUtil.getDpt(dest.dpt_cd(), acDt).wg_cd());
				dest.rcv_act_no(getRcvActNo(dest.dpt_cd(), dest.wg_cd(), acDt, dest.trd_cd()));
				dest.rcst_cd(null);
				dest.cred_cd(MSBGL_ArUtil.getBp(src.bcst_cd()).ar_cred_cd());
				dest.trd_ac_rsn_cd(getTrdAcRsnCd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())));
				dest.base_cur_cd(getBaseCur().cur_cd());
				dest.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				dest.par_rcv_act_no(dest.rcv_act_no());
				dest.par_rcv_act_seq(dest.rcv_act_seq());
				dest.ar_slip_prnt_typ(MSC_AR_SLIP_PRNT_TYP.TAX_DIFF.value());
				dest.xrate(1);
				dest.xrate_cd(getCo().sls_xrate_cd());
				dest.trd_cur_amt(MCNumber.ZERO);
				dest.base_cur_amt(MCNumber.ZERO);
				dest.rcv_dt(acDt);
				dest.ac_dt(acDt);
				dest.ac_ym(acYm);
				dest.tax_cd1(src.getString("tax_cd"));
				dest.subttl1(MCNumber.ZERO);
				dest.subttl2(MCNumber.ZERO);
				dest.subttl3(MCNumber.ZERO);
				dest.base_cur_subttl1(MCNumber.ZERO);
				dest.base_cur_subttl2(MCNumber.ZERO);
				dest.base_cur_subttl3(MCNumber.ZERO);
			}

			/**
			 * 計上日取得<br />
			 * 
			 * 計上日を取得する。
			 * 
			 * @param billInfo 請求
			 * 
			 * @return 計上日
			 */
			protected MCDate getAcDt(MST_BILL_R billInfo) {
				// 締請求でない場合、運用日付が計上日
				if (MAC_BILL_CL_TYP
						.isSEL(MSBGL_ArUtil.getBp(billInfo.bcst_cd()).bill_cl_typ())
						|| MAC_BILL_CL_TYP.isEACH_SLS(
								MSBGL_ArUtil.getBp(billInfo.bcst_cd()).bill_cl_typ())) {
					return getToday();
				}

				MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
				Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
				cndR.ac_dt(billInfo.bill_cl_dt());
				cndR.rcv_cls_chk_flg(true);
				op.up0().add(cndR);
				op.up1().no_msg_flg(true);
				op.exec();
				// 請求締日が締まっている場合、運用日付が計上日
				if (op.down0().get(0).err_flg()) {
					return getToday();
				}
				// 請求締日が締まっていない場合、請求締日が計上日
				else {
					// 請求締日が運用日付よりも後の場合、運用日付を計上日とする
					if (getToday().lt(billInfo.bill_cl_dt())) {
						return getToday();
					}
					else {
						return billInfo.bill_cl_dt();
					}
				}
			}

			/**
			 * 会計理由ＣＤ取得<br />
			 * 
			 * 取引ＣＤをもとに取引マスタより会計理由ＣＤを取得する
			 * 
			 * @param trdCd 取引ＣＤ
			 * @return 会計理由ＣＤ
			 */
			protected String getTrdAcRsnCd(String trdCd) {
				MAM_TRD_R trdR = MAM_TRD_R.create("T");
				MCQueryApiBuilder trdR_bldr = MCQueryApiBuilder.create(trdR);
				dbSelectKey("MSBGL5020_MAM_TRD_S01", trdR, trdR_bldr, trdCd);
				return trdR.ac_rsn_cd();
			}
		}
	}

	/**
	 * RcvActCmn_Del01オペレーション.<p>
	 *
	 * 消費税差額調整の入金実績を取消する共通処理<br>
	 */
	public class RcvActCmn_Del01 extends MSBGL_RcvActCmnService_MC_A.RcvActCmn_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 処理を実行します。<p>
		 */
		@Override
		protected void doIt() {

			for (RcvActCmn_Chk04_CndR cndR : up0()) {
				execMain(cndR);
			}
		}

		/**
		 * メイン処理実行<br />
		 * 
		 * 上り電文の単位にメイン処理を実行します
		 * 
		 * @param cndR 上り電文
		 */
		protected void execMain(RcvActCmn_Chk04_CndR cndR) {
			// 取消を行う入金実績を取得
			MCList<MST_RCV_ACT_R> disRcvActL = lockRcvAct(cndR);

			if (disRcvActL.isEmpty()) {
				return;
			}

			for (MST_RCV_ACT_R disRcvActR : disRcvActL) {
				// 取消の入金実績の作成
				MST_RCV_ACT_R canRcvActR = canRcvAct(disRcvActR);

				for (MST_RCV_ACT_D_R disRcvActDR : getRcvActDL(disRcvActR)) {
					// 債権部門存在チェック
					if (!isSame(disRcvActR.ac_dt(), canRcvActR.ac_dt())) {
						if (isNull(MSBGL_ArUtil.getDpt(disRcvActDR.ar_dpt_cd(), canRcvActR.ac_dt()).dpt_cd())){
							MCAppException ex = new MCAppException(new MCMessage(MSBGL0122, disRcvActDR.ar_dpt_cd(), toYMDString(canRcvActR.ac_dt())));
							throw ex;
						}
					}
					// 取消の入金実績明細を作成
					MST_RCV_ACT_D_R canRcvActDR = insCanRcvActD(canRcvActR, disRcvActDR);
					// 債権共通サービスを呼び出す
					callArCmnService(disRcvActR, disRcvActDR, canRcvActR, canRcvActDR);
				}
				// 受払実績登録サービスを呼び出す
				callIoActSvDel(canRcvActR);
			}
			callIoActSvUpd();
		}

		/**
		 * 受払実績サービスの呼出し（取消用）
		 * 
		 * @param canRcvActR 取消の入金実績
		 */
		protected void callIoActSvDel(MST_RCV_ACT_R canRcvActR) {

			MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);

			IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
			ioActR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			ioActR.can_ac_dt(canRcvActR.ac_dt());
			ioActR.act_no(canRcvActR.rcv_act_no());
			ioActR.trn_typ(MSC_TRN_TYP.RCV_ACT.value());
			ioActL.add(ioActR);
			
			execIoActSv(ioActL);
		}

		/**
		 * 債権共通サービスの実行<br />
		 * 
		 * 債権共通サービスを実行する
		 * 
		 * @param disRcvActR
		 * @param disRcvActDR
		 * @param canRcvActR
		 * @param canRcvActDR
		 */
		protected void callArCmnService(MST_RCV_ACT_R disRcvActR, MST_RCV_ACT_D_R disRcvActDR,
				MST_RCV_ACT_R canRcvActR, MST_RCV_ACT_D_R canRcvActDR) {
			MSBGL_ArCmnService.ArCmn_Upd01 op = MSBGL_ArCmnService.crtArCmn_Upd01();
			op.up0().add(makeArCmnDtl(disRcvActR, disRcvActDR, canRcvActR, canRcvActDR));
			op.up1().ar_ope_typ(MSC_AR_OPE_TYP.TAX_DIFF_BILL_CL.value());
			op.exec();
		}

		/**
		 * 債権共通サービスの上り電文作成<br />
		 * 
		 * 債権共通サービスに渡す上り電文を作成する
		 * 
		 * @param disRcvActR
		 * @param disRcvActDR
		 * @param canRcvActR
		 * @param canRcvActDR
		 * @return 債権共通サービスの上り電文
		 */
		protected ArCmn_Upd01_DtlR makeArCmnDtl(
				MST_RCV_ACT_R disRcvActR, MST_RCV_ACT_D_R disRcvActDR,
				MST_RCV_ACT_R canRcvActR, MST_RCV_ACT_D_R canRcvActDR) {

			// 取り消した債権伝票明細に紐付く請求明細を取得
			MST_BILL_D_R disBillDR = getDisBillDR(
					disRcvActDR.rcv_act_d_no(), disRcvActDR.rcv_act_d_seq());

			// 債権共通処理に渡す引数の作成
			ArCmn_Upd01_DtlR r = ArCmn_Upd01_DtlR.create();
			copy(r, disBillDR, createMap_ArCmn_Upd01_DtlR_MST_BILL_D_R());
			
			r.act_no(canRcvActR.rcv_act_no());
			r.act_seq(canRcvActR.rcv_act_seq());
			r.act_rev(canRcvActR.rcv_act_rev());
			r.act_d_no(canRcvActDR.rcv_act_d_no());
			r.act_d_seq(canRcvActDR.rcv_act_d_seq());
			r.trd_cur_cd(disRcvActR.trd_cur_cd());
			r.bcst_cd(disRcvActR.bcst_cd());
			r.acst_cd(disRcvActDR.acst_cd());
			r.ac_dt(canRcvActR.ac_dt());
			r.ac_ym(canRcvActR.ac_ym());
			r.ar_dpt_cd(disRcvActDR.ar_dpt_cd());
			r.bill_dpt_cd(disRcvActDR.bill_dpt_cd());
			r.iv_no(disRcvActDR.iv_no());
			r.ar_typ(disRcvActDR.ar_typ());
			r.tgt_flg(true);
			
			r.ar_trd_grp_typ(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value());
			r.trd_ptn_typ(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value());
			r.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
			r.trd_cur_tax_amt(disBillDR.trd_cur_tax_amt().negate());
			r.base_cur_tax_amt(disBillDR.base_cur_tax_amt().negate());
			r.bill_cl_dt(disBillDR.getDate("bill_cl_dt"));
			
			return r;
		}

		/**
		 * 請求明細取得<br />
		 * 
		 * 無効にした入金実績明細に紐づく請求明細を取得する
		 * 
		 * @param rcvActDNo 無効にした入金実績明細の入金実績明細ＮＯ
		 * @param rcvActDSeq 無効にした入金実績明細の入金実績明細連番
		 * 
		 * @return 請求明細
		 */
		protected MST_BILL_D_R getDisBillDR(String rcvActDNo, MCNumber rcvActDSeq) {
			MST_BILL_D_R r = MST_BILL_D_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(r);
			MST_BILL_R t1 = MST_BILL_R.create("T1");
			r.addDateColumn("bill_cl_dt");
			r_bldr.addInnerJoin(t1, bracket( r.bill_mng_no.eq(t1.bill_mng_no)));
			r_bldr.addSelect(t1.bill_cl_dt);
			r_bldr.addWhereWithAnd(r.act_d_no.eq(bind("1")), rcvActDNo);
			r_bldr.addWhereWithAnd(r.act_d_seq.eq(bind("1")), rcvActDSeq);
			r_bldr.addWhereWithAnd(r.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())));
			dbSelectForUpdate("MSBGL5020_MST_BILL_D_S04", r, r_bldr);
			return r;
		}

		/**
		 * 入金実績ロック<br />
		 * 
		 * 取消を行う入金実績をロックして返却する
		 * 
		 * @param cndR 検索条件
		 * @return 取消を行う入金実績。存在しなかった場合は空のＤＢコンテナ。
		 */
		protected MCList<MST_RCV_ACT_R> lockRcvAct(RcvActCmn_Chk04_CndR cndR) {
			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R billDL_t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(billDL_t);

			billDL_bldr.setDistinct();
			billDL_bldr.setSelect(billDL_t.act_no.as("rcv_act_no"));
			billDL_bldr.addSelect(billDL_t.act_seq.as("rcv_act_seq"));
			billDL_bldr.addWhereWithAnd(billDL_t.bill_mng_no.eq(bind("1")), cndR.bill_mng_no());
			billDL_bldr.addWhereWithAnd(billDL_t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())));
			billDL_bldr.addWhereWithAnd(billDL_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBGL5020_MST_BILL_D_S05", billDL, billDL_bldr);

			MCList<MST_RCV_ACT_R> lockL = MCList.create(MST_RCV_ACT_R.class);
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbSelectKeyForUpdate("MSBGL5020_MST_RCV_ACT_S02", lockL, lockL_bldr, billDL);

			return lockL;
		}

		/**
		 * 無効の入金実績更新<br />
		 * 
		 * 入金実績を無効に更新する
		 * 
		 * @param disRcvActR 無効にする入金実績情報
		 * @return 取消の入金実績情報
		 */
		protected MST_RCV_ACT_R canRcvAct(MST_RCV_ACT_R disRcvActR) {
			// 入金実績の取消
			MST_RCV_ACT_R dbc = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.slip_sts_typ, value(MAC_SLIP_STS_TYP.DIS.value()));
			dbUpdateKey("MSBGL5020_MST_RCV_ACT_U03", disRcvActR, builder);

			// 赤伝発行
			MST_RCV_ACT_R canRcvAct = insCanRcvAct(disRcvActR);

			return canRcvAct;
		}

		/**
		 * 取消の入金実績登録<br />
		 * 
		 * 取消の入金実績を登録する
		 * 
		 * @param canRcvActR 取消の入金実績
		 * @param disRcvActDR 無効の入金実績明細
		 * @return 登録した取消の入金実績明細
		 */
		protected MST_RCV_ACT_D_R insCanRcvActD(MST_RCV_ACT_R canRcvActR,
				MST_RCV_ACT_D_R disRcvActDR) {
			MST_RCV_ACT_D_R insR = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(insR);
			copy(insR, disRcvActDR, canRcvActR, createMap_MST_RCV_ACT_D());
			dbInsertEx("MSBGL5020_MST_RCV_ACT_D_I07", insR, insR_bldr);

			return insR;
		}

		/**
		 * 無効入金実績明細取得<br />
		 * 
		 * 無効にする入金実績明細を取得する
		 * 
		 * @param disRcvActR 無効の入金実績
		 * @return 無効にする入金実績明細
		 */
		protected MCList<MST_RCV_ACT_D_R> getRcvActDL(MST_RCV_ACT_R disRcvActR) {
			MCList<MST_RCV_ACT_D_R> l = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.addWhereWithAnd(t.rcv_act_no.eq(bind("1")), disRcvActR.rcv_act_no());
			l_bldr.addWhereWithAnd(t.rcv_act_seq.eq(bind("1")), disRcvActR.rcv_act_seq());
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBGL5020_MST_RCV_ACT_D_S03", l, l_bldr);

			return l;
		}

		/**
		 * 取消入金実績の登録<br />
		 * 
		 * 取消の入金実績を登録する
		 * 
		 * @param info 
		 * @return
		 */
		protected MST_RCV_ACT_R insCanRcvAct(MST_RCV_ACT_R info) {
			MST_RCV_ACT_R insR = MST_RCV_ACT_R.create("T");
			copy(insR, info, createMap_MST_RCV_ACT());

			// 伝票訂正可否チェック
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.ac_dt(info.ac_dt());
			cndR.rcv_cls_chk_flg(true);
			op.up0().add(cndR);
			op.up1().no_msg_flg(true);
			op.exec();

			MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(insR);
			dbInsertEx("MSBGL5020_MST_RCV_ACT_I07", insR, insR_bldr);

			return insR;
		}

		// MST_RCV_ACT_R → MST_RCV_ACT_R
		protected Map_MST_RCV_ACT<MST_RCV_ACT_R,MST_RCV_ACT_R> createMap_MST_RCV_ACT() {
			return new Map_MST_RCV_ACT<MST_RCV_ACT_R, MST_RCV_ACT_R>();
		}
		public class Map_MST_RCV_ACT<D extends MST_RCV_ACT_R, S extends MST_RCV_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_R.$rcv_act_no, MST_RCV_ACT_R.$rcv_act_no);
				addColumnPathMap(MST_RCV_ACT_R.$trd_cd, MST_RCV_ACT_R.$trd_cd);
				addColumnPathMap(MST_RCV_ACT_R.$rcv_act_rev, MST_RCV_ACT_R.$rcv_act_rev);
				addColumnPathMap(MST_RCV_ACT_R.$ar_trd_grp_typ, MST_RCV_ACT_R.$ar_trd_grp_typ);
				addColumnPathMap(MST_RCV_ACT_R.$trd_ptn_typ, MST_RCV_ACT_R.$trd_ptn_typ);
				addColumnPathMap(MST_RCV_ACT_R.$rcv_no, MST_RCV_ACT_R.$rcv_no);
				addColumnPathMap(MST_RCV_ACT_R.$dpt_cd, MST_RCV_ACT_R.$dpt_cd);
				addColumnPathMap(MST_RCV_ACT_R.$wg_cd, MST_RCV_ACT_R.$wg_cd);
				addColumnPathMap(MST_RCV_ACT_R.$usr_cd, MST_RCV_ACT_R.$usr_cd);
				addColumnPathMap(MST_RCV_ACT_R.$rcst_cd, MST_RCV_ACT_R.$rcst_cd);
				addColumnPathMap(MST_RCV_ACT_R.$bcst_cd, MST_RCV_ACT_R.$bcst_cd);
				addColumnPathMap(MST_RCV_ACT_R.$bill_dpt_cd, MST_RCV_ACT_R.$bill_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_R.$cred_cd, MST_RCV_ACT_R.$cred_cd);
				addColumnPathMap(MST_RCV_ACT_R.$rcv_dt, MST_RCV_ACT_R.$rcv_dt);
				addColumnPathMap(MST_RCV_ACT_R.$bill_basis_dt, MST_RCV_ACT_R.$bill_basis_dt);
				addColumnPathMap(MST_RCV_ACT_R.$trd_cur_cd, MST_RCV_ACT_R.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_R.$base_cur_cd, MST_RCV_ACT_R.$base_cur_cd);
				addColumnPathMap(MST_RCV_ACT_R.$xrate_cd, MST_RCV_ACT_R.$xrate_cd);
				addColumnPathMap(MST_RCV_ACT_R.$xrate, MST_RCV_ACT_R.$xrate);
				addColumnPathMap(MST_RCV_ACT_R.$trd_ac_rsn_cd, MST_RCV_ACT_R.$trd_ac_rsn_cd);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_cd1, MST_RCV_ACT_R.$ar_sttl_cd1);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_typ1, MST_RCV_ACT_R.$ar_sttl_typ1);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd1, MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd1);
				addColumnPathMap(MST_RCV_ACT_R.$tax_cd1, MST_RCV_ACT_R.$tax_cd1);
				addColumnPathMap(MST_RCV_ACT_R.$bank_ac_cd, MST_RCV_ACT_R.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_R.$xfr_psn, MST_RCV_ACT_R.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_R.$note_mng_no, MST_RCV_ACT_R.$note_mng_no);
				addColumnPathMap(MST_RCV_ACT_R.$note_no, MST_RCV_ACT_R.$note_no);
				addColumnPathMap(MST_RCV_ACT_R.$bd_dpt_cd, MST_RCV_ACT_R.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_R.$debt_cred_id_typ, MST_RCV_ACT_R.$debt_cred_id_typ);
				addColumnPathMap(MST_RCV_ACT_R.$debt_cred_id_cd, MST_RCV_ACT_R.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_R.$debt_cred_nm, MST_RCV_ACT_R.$debt_cred_nm);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_cd2, MST_RCV_ACT_R.$ar_sttl_cd2);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_typ2, MST_RCV_ACT_R.$ar_sttl_typ2);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd2, MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd2);
				addColumnPathMap(MST_RCV_ACT_R.$tax_cd2, MST_RCV_ACT_R.$tax_cd2);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_cd3, MST_RCV_ACT_R.$ar_sttl_cd3);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_typ3, MST_RCV_ACT_R.$ar_sttl_typ3);
				addColumnPathMap(MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd3, MST_RCV_ACT_R.$ar_sttl_ac_rsn_cd3);
				addColumnPathMap(MST_RCV_ACT_R.$tax_cd3, MST_RCV_ACT_R.$tax_cd3);
				addColumnPathMap(MST_RCV_ACT_R.$trd_rmrks, MST_RCV_ACT_R.$trd_rmrks);
				addColumnPathMap(MST_RCV_ACT_R.$par_rcv_act_no, MST_RCV_ACT_R.$par_rcv_act_no);
				addColumnPathMap(MST_RCV_ACT_R.$ar_slip_prnt_typ, MST_RCV_ACT_R.$ar_slip_prnt_typ);
				addColumnPathMap(MST_RCV_ACT_R.$rcv_auto_appl_flg, MST_RCV_ACT_R.$rcv_auto_appl_flg);
				addColumnPathMap(MST_RCV_ACT_R.$sub_char1, MST_RCV_ACT_R.$sub_char1);
				addColumnPathMap(MST_RCV_ACT_R.$sub_char2, MST_RCV_ACT_R.$sub_char2);
				addColumnPathMap(MST_RCV_ACT_R.$sub_char3, MST_RCV_ACT_R.$sub_char3);
				addColumnPathMap(MST_RCV_ACT_R.$ins_usr_id, MST_RCV_ACT_R.$ins_usr_id);
				addColumnPathMap(MST_RCV_ACT_R.$ins_usr_nm, MST_RCV_ACT_R.$ins_usr_nm);
				addColumnPathMap(MST_RCV_ACT_R.$ins_ts, MST_RCV_ACT_R.$ins_ts);
				addColumnPathMap(MST_RCV_ACT_R.$ins_func_id, MST_RCV_ACT_R.$ins_func_id);
				addColumnPathMap(MST_RCV_ACT_R.$upd_cntr, MST_RCV_ACT_R.$upd_cntr);
				addColumnPathMap(MST_RCV_ACT_R.$upd_usr_id, MST_RCV_ACT_R.$upd_usr_id);
				addColumnPathMap(MST_RCV_ACT_R.$upd_usr_nm, MST_RCV_ACT_R.$upd_usr_nm);
				addColumnPathMap(MST_RCV_ACT_R.$upd_func_id, MST_RCV_ACT_R.$upd_func_id);
				addColumnPathMap(MST_RCV_ACT_R.$upd_srv_req_no, MST_RCV_ACT_R.$upd_srv_req_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				dest.rcv_act_seq(src.rcv_act_seq().add(1));
				dest.ac_dt(getAcDt(src));
				dest.ac_ym(getAcYm(dest.ac_dt()));
				dest.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
				dest.par_rcv_act_seq(src.par_rcv_act_seq().add(1));
				dest.trd_cur_amt(src.trd_cur_amt().negate());
				dest.subttl1(src.subttl1().negate());
				dest.subttl2(src.subttl2().negate());
				dest.subttl3(src.subttl3().negate());
				dest.tax_amt(src.tax_amt().negate());
				dest.tax_subttl1(src.tax_subttl1().negate());
				dest.tax_subttl2(src.tax_subttl2().negate());
				dest.tax_subttl3(src.tax_subttl3().negate());
				dest.base_cur_amt(src.base_cur_amt().negate());
				dest.base_cur_subttl1(src.base_cur_subttl1().negate());
				dest.base_cur_subttl2(src.base_cur_subttl2().negate());
				dest.base_cur_subttl3(src.base_cur_subttl3().negate());
				dest.base_cur_tax_amt(src.base_cur_tax_amt().negate());
				dest.base_cur_tax_subttl1(src.base_cur_tax_subttl1().negate());
				dest.base_cur_tax_subttl2(src.base_cur_tax_subttl2().negate());
				dest.base_cur_tax_subttl3(src.base_cur_tax_subttl3().negate());
			}

			/**
			 * 計上日取得<br />
			 * 
			 * 計上日を取得する。
			 * 
			 * @param srcR 判定条件
			 * 
			 * @return 計上日
			 */
			protected MCDate getAcDt(S srcR) {
				// 取消伝票の計上日の締チェックを行い、締まっている場合、運用日付を計上日とする
				// 締まっていない場合、取消伝票の計上日を赤伝の計上日とする
				// 運用日を計上日とする場合、運用日の締チェックを行い、締っている場合エラーとする
				MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
				Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
				cndR.ac_dt(srcR.ac_dt());
				cndR.rcv_cls_chk_flg(true);
				op.up0().add(cndR);
				op.up1().no_msg_flg(true);
				op.exec();

				if (op.down0().get(0).err_flg()) {
					return getToday();
				}
				else {
					return cndR.ac_dt();
				}
			}
		}

		// MST_RCV_ACT_D_R → MST_RCV_ACT_D_R
		protected Map_MST_RCV_ACT_D<MST_RCV_ACT_D_R,MST_RCV_ACT_D_R,MST_RCV_ACT_R> createMap_MST_RCV_ACT_D() {
			return new Map_MST_RCV_ACT_D<MST_RCV_ACT_D_R, MST_RCV_ACT_D_R,MST_RCV_ACT_R>();
		}
		public class Map_MST_RCV_ACT_D<D extends MST_RCV_ACT_D_R, S extends MST_RCV_ACT_D_R, W extends MST_RCV_ACT_R>
				extends MAUCC_RowMapperWith<D,S,W>{

			protected W _hdrR;

			@Override
			public void setWith(W _hdrR) {
				this._hdrR = _hdrR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_D_R.$disp_seq, MST_RCV_ACT_D_R.$disp_seq);
				addColumnPathMap(MST_RCV_ACT_D_R.$bill_mng_no, MST_RCV_ACT_D_R.$bill_mng_no);
				addColumnPathMap(MST_RCV_ACT_D_R.$bcst_cd, MST_RCV_ACT_D_R.$bcst_cd);
				addColumnPathMap(MST_RCV_ACT_D_R.$bill_dpt_cd, MST_RCV_ACT_D_R.$bill_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_D_R.$acst_cd, MST_RCV_ACT_D_R.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_D_R.$ar_dpt_cd, MST_RCV_ACT_D_R.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_D_R.$wg_cd, MST_RCV_ACT_D_R.$wg_cd);
				addColumnPathMap(MST_RCV_ACT_D_R.$iv_no, MST_RCV_ACT_D_R.$iv_no);
				addColumnPathMap(MST_RCV_ACT_D_R.$wrk_no, MST_RCV_ACT_D_R.$wrk_no);
				addColumnPathMap(MST_RCV_ACT_D_R.$ar_typ, MST_RCV_ACT_D_R.$ar_typ);
				addColumnPathMap(MST_RCV_ACT_D_R.$ar_sttl_cd1, MST_RCV_ACT_D_R.$ar_sttl_cd1);
				addColumnPathMap(MST_RCV_ACT_D_R.$ar_sttl_typ1, MST_RCV_ACT_D_R.$ar_sttl_typ1);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_amt1, MST_RCV_ACT_D_R.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_tax_amt1, MST_RCV_ACT_D_R.$trd_cur_tax_amt1);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_amt2, MST_RCV_ACT_D_R.$trd_cur_amt2);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_tax_amt2, MST_RCV_ACT_D_R.$trd_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_amt3, MST_RCV_ACT_D_R.$trd_cur_amt3);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_cur_tax_amt3, MST_RCV_ACT_D_R.$trd_cur_tax_amt3);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_amt1, MST_RCV_ACT_D_R.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_tax_amt1, MST_RCV_ACT_D_R.$base_cur_tax_amt1);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_amt2, MST_RCV_ACT_D_R.$base_cur_amt2);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_tax_amt2, MST_RCV_ACT_D_R.$base_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_amt3, MST_RCV_ACT_D_R.$base_cur_amt3);
				addColumnPathMap(MST_RCV_ACT_D_R.$base_cur_tax_amt3, MST_RCV_ACT_D_R.$base_cur_tax_amt3);
				addColumnPathMap(MST_RCV_ACT_D_R.$trd_xrate, MST_RCV_ACT_D_R.$trd_xrate);
				addColumnPathMap(MST_RCV_ACT_D_R.$gen_rcv_no, MST_RCV_ACT_D_R.$gen_rcv_no);
				addColumnPathMap(MST_RCV_ACT_D_R.$sub_char1, MST_RCV_ACT_D_R.$sub_char1);
				addColumnPathMap(MST_RCV_ACT_D_R.$sub_char2, MST_RCV_ACT_D_R.$sub_char2);
				addColumnPathMap(MST_RCV_ACT_D_R.$sub_char3, MST_RCV_ACT_D_R.$sub_char3);
				addColumnPathMap(MST_RCV_ACT_D_R.$appl_cmpl_flg, MST_RCV_ACT_D_R.$appl_cmpl_flg);
				addColumnPathMap(MST_RCV_ACT_D_R.$ins_usr_id, MST_RCV_ACT_D_R.$ins_usr_id);
				addColumnPathMap(MST_RCV_ACT_D_R.$ins_usr_nm, MST_RCV_ACT_D_R.$ins_usr_nm);
				addColumnPathMap(MST_RCV_ACT_D_R.$ins_ts, MST_RCV_ACT_D_R.$ins_ts);
				addColumnPathMap(MST_RCV_ACT_D_R.$ins_func_id, MST_RCV_ACT_D_R.$ins_func_id);
				addColumnPathMap(MST_RCV_ACT_D_R.$upd_cntr, MST_RCV_ACT_D_R.$upd_cntr);
				addColumnPathMap(MST_RCV_ACT_D_R.$upd_usr_id, MST_RCV_ACT_D_R.$upd_usr_id);
				addColumnPathMap(MST_RCV_ACT_D_R.$upd_usr_nm, MST_RCV_ACT_D_R.$upd_usr_nm);
				addColumnPathMap(MST_RCV_ACT_D_R.$upd_func_id, MST_RCV_ACT_D_R.$upd_func_id);
				addColumnPathMap(MST_RCV_ACT_D_R.$upd_srv_req_no, MST_RCV_ACT_D_R.$upd_srv_req_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.rcv_act_d_no(src.rcv_act_d_no());
				dest.rcv_act_d_seq(src.rcv_act_d_seq().add(1));
				dest.rcv_act_no(_hdrR.rcv_act_no());
				dest.rcv_act_seq(_hdrR.rcv_act_seq());
				dest.trd_cur_amt1(src.trd_cur_amt1().negate());
				dest.trd_cur_amt2(src.trd_cur_amt2().negate());
				dest.trd_cur_amt3(src.trd_cur_amt3().negate());
				dest.trd_cur_tax_amt1(src.trd_cur_tax_amt1().negate());
				dest.trd_cur_tax_amt2(src.trd_cur_tax_amt2().negate());
				dest.trd_cur_tax_amt3(src.trd_cur_tax_amt3().negate());
				dest.base_cur_amt1(src.base_cur_amt1().negate());
				dest.base_cur_amt2(src.base_cur_amt2().negate());
				dest.base_cur_amt3(src.base_cur_amt3().negate());
				dest.base_cur_tax_amt1(src.base_cur_tax_amt1().negate());
				dest.base_cur_tax_amt2(src.base_cur_tax_amt2().negate());
				dest.base_cur_tax_amt3(src.base_cur_tax_amt3().negate());
			}
		}

		// MST_BILL_D_R → ArCmn_Upd01_DtlR
		protected Map_ArCmn_Upd01_DtlR_MST_BILL_D_R<ArCmn_Upd01_DtlR,MST_BILL_D_R> createMap_ArCmn_Upd01_DtlR_MST_BILL_D_R() {
			return new Map_ArCmn_Upd01_DtlR_MST_BILL_D_R<ArCmn_Upd01_DtlR, MST_BILL_D_R>();
		}

		public class Map_ArCmn_Upd01_DtlR_MST_BILL_D_R<D extends ArCmn_Upd01_DtlR, S extends MST_BILL_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cd, MST_BILL_D_R.$trd_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$bill_mng_no, MST_BILL_D_R.$bill_mng_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$rcv_typ, MST_BILL_D_R.$rcv_typ);
				addColumnPathMap(ArCmn_Upd01_DtlR.$rcv_mtd_cd, MST_BILL_D_R.$rcv_mtd_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$cst_cd, MST_BILL_D_R.$cst_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dlv_cd, MST_BILL_D_R.$dlv_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dlv_nm, MST_BILL_D_R.$dlv_nm);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dlv_sundry_flg, MST_BILL_D_R.$dlv_sundry_flg);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dest_cd1, MST_BILL_D_R.$dest_cd1);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dest_cd2, MST_BILL_D_R.$dest_cd2);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dest_cd3, MST_BILL_D_R.$dest_cd3);
				addColumnPathMap(ArCmn_Upd01_DtlR.$ac_dt, MST_BILL_D_R.$ac_dt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$ac_ym, MST_BILL_D_R.$ac_ym);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dlv_dt, MST_BILL_D_R.$dlv_dt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$bill_basis_dt, MST_BILL_D_R.$bill_basis_dt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$rcv_dt, MST_BILL_D_R.$rcv_dt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$bill_crryovr_times, MST_BILL_D_R.$bill_crryovr_times);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sls_dpt_cd, MST_BILL_D_R.$sls_dpt_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sls_usr_cd, MST_BILL_D_R.$sls_usr_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$dlv_slip_no, MST_BILL_D_R.$dlv_slip_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$iv_no, MST_BILL_D_R.$iv_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$slo_no, MST_BILL_D_R.$slo_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$slo_d_no, MST_BILL_D_R.$slo_d_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$cst_po_no, MST_BILL_D_R.$cst_po_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$cst_po_d_no, MST_BILL_D_R.$cst_po_d_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$itm_cd, MST_BILL_D_R.$itm_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$itm_sub1, MST_BILL_D_R.$itm_sub1);
				addColumnPathMap(ArCmn_Upd01_DtlR.$itm_sub2, MST_BILL_D_R.$itm_sub2);
				addColumnPathMap(ArCmn_Upd01_DtlR.$itm_sub3, MST_BILL_D_R.$itm_sub3);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sno1, MST_BILL_D_R.$sno1);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sno2, MST_BILL_D_R.$sno2);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sno3, MST_BILL_D_R.$sno3);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sno4, MST_BILL_D_R.$sno4);
				addColumnPathMap(ArCmn_Upd01_DtlR.$itm_nm, MST_BILL_D_R.$itm_nm);
				addColumnPathMap(ArCmn_Upd01_DtlR.$sundry_itm_flg, MST_BILL_D_R.$sundry_itm_flg);
				addColumnPathMap(ArCmn_Upd01_DtlR.$cst_itm_cd, MST_BILL_D_R.$cst_itm_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$cst_itm_nm, MST_BILL_D_R.$cst_itm_nm);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_unit_cd, MST_BILL_D_R.$trd_unit_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_unit_qty, MST_BILL_D_R.$trd_unit_qty);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_unit_cd, MST_BILL_D_R.$base_unit_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_unit_qty, MST_BILL_D_R.$base_unit_qty);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_upri, MST_BILL_D_R.$trd_cur_upri);
				addColumnPathMap(ArCmn_Upd01_DtlR.$interim_flg, MST_BILL_D_R.$interim_flg);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt, MST_BILL_D_R.$trd_cur_amt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt1, MST_BILL_D_R.$trd_cur_amt1);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt2, MST_BILL_D_R.$trd_cur_amt2);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt3, MST_BILL_D_R.$trd_cur_amt3);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_dscnt_amt, MST_BILL_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$xrate, MST_BILL_D_R.$xrate);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_upri, MST_BILL_D_R.$base_cur_upri);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt, MST_BILL_D_R.$base_cur_amt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt1, MST_BILL_D_R.$base_cur_amt1);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt2, MST_BILL_D_R.$base_cur_amt2);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt3, MST_BILL_D_R.$base_cur_amt3);
				addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_dscnt_amt, MST_BILL_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$tax_cd, MST_BILL_D_R.$tax_cd);
				addColumnPathMap(ArCmn_Upd01_DtlR.$wtax_rate, MST_BILL_D_R.$wtax_rate);
				addColumnPathMap(ArCmn_Upd01_DtlR.$wtax_amt, MST_BILL_D_R.$wtax_amt);
				addColumnPathMap(ArCmn_Upd01_DtlR.$trd_d_rmrks, MST_BILL_D_R.$trd_d_rmrks);
				addColumnPathMap(ArCmn_Upd01_DtlR.$par_act_no, MST_BILL_D_R.$par_act_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$par_act_seq, MST_BILL_D_R.$par_act_seq);
				addColumnPathMap(ArCmn_Upd01_DtlR.$bill_d_typ, MST_BILL_D_R.$bill_d_typ);
				addColumnPathMap(ArCmn_Upd01_DtlR.$ref_iv_no, MST_BILL_D_R.$ref_iv_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$wrk_no, MST_BILL_D_R.$wrk_no);
				addColumnPathMap(ArCmn_Upd01_DtlR.$ar_typ, MST_BILL_D_R.$ar_typ);
			}
		}
	}

	// ////////////////// ロジック内共通処理 //////////////////////

	/**
	 * 更新、取消処理の場合はtrue、それ以外はfalseを返す
	 * @param execTyp 処理区分
	 * @return
	 */
	protected boolean isCanOrUpd(String dataCrudTyp) {
		return MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp) || MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp);
	}

	/**
	 * 更新、新規処理の場合はtrue、それ以外はfalseを返す
	 * @param execTyp 処理区分
	 * @return
	 */
	protected boolean isUpdOrCrt(String dataCrudTyp) {
		return MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp) || MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp);
	}

	/**
	 * 売掛消込登録画面で使用する取引区分の場合、true。それ以外はfalse
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @return 判定結果
	 */
	protected boolean isArApplTrdPtnTyp(String trdPtnTyp) {

		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isRCV_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 債権共通サービスを起動する
	 * 
	 * @param arOpeTyp
	 * @param dtlL
	 */
	protected void execArCmnService(MSC_AR_OPE_TYP arOpeTyp, MCList<ArCmn_Upd01_DtlR> dtlL) {

		MSBGL_ArCmnService.ArCmn_Upd01 op = MSBGL_ArCmnService.crtArCmn_Upd01();

		op.up0().addAll(dtlL);
		op.up1().ar_ope_typ(arOpeTyp.value());
		op.exec();
	}

	/**
	 * 受払実績サービスを実行する（IoAct_Ins01）
	 * 
	 * @param ioActL 受払実績サービスの上り電文
	 */
	protected void execIoActSv(MCList<IoAct_Ins01_DtlR> ioActL) {
		MSBEL_IoActService.IoAct_Ins01 op = MSBEL_IoActService.crtIoAct_Ins01();
		op.up0().setAll(ioActL);
		op.exec();
	}

	/**
	 * 受払実績サービスを実行する（IoAct_Upd01）
	 */
	protected void callIoActSvUpd() {
		MSBEL_IoActService.IoAct_Upd01 op = MSBEL_IoActService.crtIoAct_Upd01();
		op.exec();
	}

	/**
	 * 入金実績ＮＯを発番する
	 * 
	 * @return 入金実績ＮＯ
	 */
	protected String getRcvActNo(String dptCd, String wgCd, MCDate dt, String trdCd) {
		ElmArgsR args = ElmArgsR.create();
		args.co_cd(getCo().co_cd());
		args.dpt_cd(dptCd);
		args.wg_cd(wgCd);
		args.dt(dt);
		args.trd_cd(trdCd);
		return getNum(MAC_NUM_BIZ_TYP.RCVACT, args);
	}

	/**
	 * 入金実績更新時の共通処理<p>
	 * １．入金情報の更新<br>
	 * ２．与信情報の更新<br>
	 * ３．手形情報の更新
	 * 
	 * @param rcvActInfoR 入金実績基本情報
	 */
	protected void execComProc(RcvAct_InfoR rcvActInfoR, MCList<RcvActD_InfoR> dtlL) {
		updRcv(rcvActInfoR);
		updCred(rcvActInfoR, dtlL);
		updNote(rcvActInfoR);
	}

	/**
	 * 入金情報を更新する
	 * 
	 * @param slipInfoR ヘッダ情報
	 */
	protected void updRcv(RcvAct_InfoR slipInfoR) {

		// 入金のチェックと更新
		if (!isNull(slipInfoR.rcv_no())) {
			MST_RCV_R rcvR = createRcv(slipInfoR);
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			rcvR_bldr.setSetVL(rcvR.rcv_proc_amt, rcvR.rcv_proc_amt.add(bindEx("rcv_proc_amt")));
			rcvR_bldr.addSetVL(rcvR.not_proc_bal, rcvR.not_proc_bal.subtract(bindEx("rcv_proc_amt")));
			if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(slipInfoR.trd_ptn_typ())) {
				rcvR_bldr.addSetVL(rcvR.bill_setoff_amt, rcvR.bill_setoff_amt.add(bindEx("rcv_proc_amt")));
			}
			dbUpdateKey("MSBGL5020_MST_RCV_U01", rcvR, rcvR_bldr);
		}
	}

	/**
	 * 入金管理情報の作成
	 * 
	 * @param hR 入金実績基本ヘッダ情報
	 * @return 入金情報
	 */
	protected MST_RCV_R createRcv(RcvAct_InfoR hR) {

		MST_RCV_R rcvR = MST_RCV_R.create();
		rcvR.rcv_no(hR.rcv_no());
		rcvR.rcv_proc_amt(hR.subttl1());

		return rcvR;
	}

	/**
	 * 与信情報を更新する
	 * 
	 * @param hR ヘッダ情報
	 */
	protected void updCred(RcvAct_InfoR hR, MCList<RcvActD_InfoR> dtlL) {

		// 売掛消込登録、前受仮受登録の与信更新
		if (!isNull(dtlL)) {
			// 与信情報の更新が必要かどうか判定
			if (!reqUpdCred(hR)) {
				return;
			}
			MCList<RcvActD_InfoR> groupL = dtlL.groupBy(getCredGroupByPolicy());
			for (RcvActD_InfoR dtlR : groupL) {
				MCNumber credAmt = MCNumber.ZERO;
				credAmt = getUpdCredAmtForDtl(hR, dtlR);
				if (credAmt.isZero()) {
					continue;
				}
				String credCd = MSBGL_ArUtil.getBp(nvl(dtlR.bcst_cd(), hR.bcst_cd())).ar_cred_cd();
				updCred(credCd, hR.trd_cur_cd(), credAmt,
						hR.trd_ptn_typ(), getCredUpdTyp(hR.ar_trd_grp_typ()));
			}
			return;
		}
		// 請求残高振替時の与信更新
		MCNumber credAmt = MCNumber.ZERO;
		credAmt = getUpdCredAmt(hR);

		if (credAmt.isZero()) {
			return;
		}
		updCred(hR.cred_cd(), hR.trd_cur_cd(), credAmt,
				hR.trd_ptn_typ(), getCredUpdTyp(hR.ar_trd_grp_typ()));
	}

	/**
	 * 明細情報を請求先毎にグルーピングするMCGroupByPolicyを取得
	 * 
	 * @return MCGroupByPolicy
	 */
	protected MCGroupByPolicy getCredGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(RcvActD_InfoR.$bcst_cd);
		gp.sum(RcvActD_InfoR.$amt1, RcvActD_InfoR.$amt2, RcvActD_InfoR.$amt3);
		return gp;
	}

	/**
	 * 与信更新の対象となる金額を取得する。<BR>
	 * @param hR ヘッダ情報
	 * @return 与信更新額
	 */
	protected MCNumber getUpdCredAmt(RcvAct_InfoR hR) {

		// 請求残高振替受入
		if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(hR.trd_ptn_typ())) {
			return MCNumber.sum(hR.subttl1(), hR.subttl2(), hR.subttl3()).negate();
		}
		return MCNumber.sum(hR.subttl1(), hR.subttl2(), hR.subttl3());
	}

	/**
	 * 与信更新の対象となる金額を取得する。<BR>
	 * @param hR ヘッダ情報
	 * @return 与信更新額
	 */
	protected MCNumber getUpdCredAmtForDtl(RcvAct_InfoR hR, RcvActD_InfoR dtlR) {

		// 前受金売掛金相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(hR.trd_ptn_typ())) {
			// 売掛消込登録画面で入力された相殺額については与信更新の対象とする
			return dtlR.amt2();
		}
		// 仮受金その他勘定相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ())) {
			return MCNumber.ZERO;
		}
		// 仮受金入金
		if (MAC_TRD_PTN_TYP.isRCV_SUSP(hR.trd_ptn_typ())) {
			return MCNumber.ZERO;
		}
		// 未決済手形
		if (isNotMatNoteTgt(hR) && MAC_AR_STTL_TYP.isNOTE(hR.ar_sttl_typ1())
				&& !hR.mat_flg()) {
			// 相殺額のみ更新対象とする。
			// 手形分の金額は決済時に更新される。
			return dtlR.amt2();
		}
		// 前受金その他勘定相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ())) {
			return MCNumber.sum(dtlR.amt1(), dtlR.amt2(), dtlR.amt3()).negate();
		}
		return MCNumber.sum(dtlR.amt1(), dtlR.amt2(), dtlR.amt3());
	}

	/**
	 * 未決済手形の与信更新の対象かどうか
	 * @return 判定結果
	 */
	protected boolean isNotMatNoteTgt(RcvAct_InfoR hR) {
		return MAC_AR_TRD_GRP_TYP.isRCV(hR.ar_trd_grp_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ());
	}

	/**
	 * 与信情報の更新が必要かどうかを判断する<p>
	 * 
	 * @param hR ヘッダ情報
	 * @return 与信情報の更新が必要な場合にtrue
	 */
	protected boolean reqUpdCred(RcvAct_InfoR hR) {

		// 前受金売掛金相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(hR.trd_ptn_typ())) {
			// 相殺額がある場合は与信更新の対象
			if (!hR.subttl2().isZero()) {
				return true;
			}
			return false;
		}

		// 仮受金その他勘定相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ())) {
			return false;
		}

		// 仮受金入金
		if (MAC_TRD_PTN_TYP.isRCV_SUSP(hR.trd_ptn_typ())) {
			return false;
		}

		// 未決済手形
		if (isNotMatNoteTgt(hR) && MAC_AR_STTL_TYP.isNOTE(hR.ar_sttl_typ1())
				&& !hR.mat_flg()) {
			// 相殺額がある場合は与信更新の対象
			if (!hR.subttl2().isZero()) {
				return true;
			}
			return false;
		}

		return true;
	}

	/**
	 * 与信更新区分を取得する
	 * 
	 * @param hR ヘッダ情報
	 * @return 与信更新区分
	 */
	protected MSC_CRED_UPD_TYP getCredUpdTyp(String arTrdGrpTyp) {

		if (MAC_AR_TRD_GRP_TYP.isARSW(arTrdGrpTyp)) {
			return MSC_CRED_UPD_TYP.UPD_CHK;
		}
		else {
			return MSC_CRED_UPD_TYP.UPD;
		}
	}

	/**
	 * 与信サービスを実行する
	 * 
	 * @param credCd 与信管理先ＣＤ
	 * @param curCd 通貨ＣＤ
	 * @param amt 対象金額
	 * @param trdPtnTyp 取引パタン区分
	 * @param credUpdTyp 与信更新区分
	 */
	protected void updCred(String credCd, String curCd, MCNumber amt,
			String trdPtnTyp, MSC_CRED_UPD_TYP credUpdTyp) {
		MSBGL_CredService.Cred_Upd01 op = MSBGL_CredService.crtCred_Upd01();

		Cred_Upd01_CndR up0R = Cred_Upd01_CndR.create();
		up0R.cred_upd_typ(credUpdTyp.value());
		up0R.cred_cd(credCd);
		up0R.cur_cd(curCd);
		up0R.amt(amt);
		up0R.trd_ptn_typ(trdPtnTyp);
		op.up0().add(up0R);

		op.exec();

		handleCredRegRslt(op.down1());
	}

	/**
	 * 与信更新処理の結果をハンドリングする<br>
	 * 結果にエラーが存在する場合はエラーリストを作成し、例外を発生させる<br>
	 * エラーが無い場合は何もしない
	 * 
	 * @param errL 与信更新の結果
	 */
	protected void handleCredRegRslt(MCList<Cred_Upd01_ErrR> errL) {

		if (errL.isEmpty()) {
			return;
		}

		MCMessageList msgList = new MCMessageList();
		for (Cred_Upd01_ErrR errR : errL) {
			MCMessage msg = new MCMessage(MSBGL0044, errR.cred_cd(), errR.cur_cd(), errR.cred_amt(), errR.cred_limit());
			msgList.add(msg);
		}
		MCAppException ex = new MCAppException(MSBGL0031);
		ex.addCauseMessageList(msgList);
		throw ex;
	}

	/**
	 * 手形情報を更新する <p>
	 * 入金情報をロックしているので手形情報はロックしない<br>
	 * 入金情報＞手形情報の順で処理をする前提
	 * 
	 * @param hR ヘッダ情報
	 */
	protected void updNote(RcvAct_InfoR hR) {

		if (!MAC_AR_STTL_TYP.isNOTE(hR.ar_sttl_typ1())
				|| isNull(hR.rcv_no())) {
			return;
		}

		// 手形情報の更新
		MST_NOTE_R noteR = createNote(hR);
		MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));

		// 前受
		if (MAC_TRD_PTN_TYP.isRCV_ADV(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.adv_amt, noteR.adv_amt.add(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U02", noteR, noteR_bldr);
		}
		// 仮受
		else if (MAC_TRD_PTN_TYP.isRCV_SUSP(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.susp_amt, noteR.susp_amt.add(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U03", noteR, noteR_bldr);
		}
		// 前受、仮受、仮受前受相殺、仮受その他相殺、前受その他相殺以外の場合、消込額、未消込残高を更新
		else if (!MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(hR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.appl_amt, noteR.appl_amt.add(bindEx("appl_amt")));
			noteR_bldr.addSetVL(noteR.not_appl_bal, noteR.not_appl_bal.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U04", noteR, noteR_bldr);
		}

		// 前受相殺
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.adv_amt, noteR.adv_amt.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U05", noteR, noteR_bldr);
		}
		// 仮受前受相殺
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.adv_amt, noteR.adv_amt.add(bindEx("appl_amt")));
			noteR_bldr.addSetVL(noteR.susp_amt, noteR.susp_amt.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U06", noteR, noteR_bldr);
		}
		// 前受その他相殺
		else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.adv_amt, noteR.adv_amt.subtract(bindEx("appl_amt")));
			// 前受その他相殺をすると消込額は更新せず、未消込残高のみ更新するので
			// 手形額 － 消込額 != 未消込残高 となる。
			// （消込額を更新してしまうと手形決済バッチで与信更新の対象となってしまうため）
			noteR_bldr.addSetVL(noteR.not_appl_bal, noteR.not_appl_bal.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U07", noteR, noteR_bldr);
		}
		// 仮受その他相殺
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.susp_amt, noteR.susp_amt.subtract(bindEx("appl_amt")));
			// 仮受その他相殺をすると消込額は更新せず、未消込残高のみ更新するので
			// 手形額 － 消込額 != 未消込残高 となる。
			// （消込額を更新してしまうと手形決済バッチで与信更新の対象となってしまうため）
			noteR_bldr.addSetVL(noteR.not_appl_bal, noteR.not_appl_bal.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U08", noteR, noteR_bldr);
		}
		// 仮受金相殺
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(hR.trd_ptn_typ())) {
			noteR_bldr.setSetVL(noteR.susp_amt, noteR.susp_amt.subtract(bindEx("appl_amt")));
			dbUpdateKey("MSBGL5020_MST_NOTE_U09", noteR, noteR_bldr);
		}
	}

	/**
	 * 手形情報の作成
	 * 
	 * @param headerR 入金実績基本情報
	 * @return 手形情報
	 */
	protected MST_NOTE_R createNote(RcvAct_InfoR hR) {

		MST_NOTE_R noteR = MST_NOTE_R.create();
		noteR.note_mng_no(hR.note_mng_no());
		noteR.appl_amt(hR.subttl1());

		return noteR;
	}

	protected MST_RCV_R getRcvR(String rcvNo) {
		MST_RCV_R rcvR = MST_RCV_R.create("T");
		MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
		rcvR_bldr.setSelect(rcvR.rcv_no);
		rcvR_bldr.addSelect(rcvR.xrate);
		rcvR_bldr.addSelect(rcvR.rcv_amt);
		rcvR_bldr.addSelect(rcvR.not_proc_bal);
		rcvR_bldr.addSelect(rcvR.div_src_rcv_no);
		rcvR_bldr.setWhere(rcvR.rcv_no.eq(bind("1")), rcvNo);
		dbSelect("MSBGL5020_MST_RCV_S03", rcvR, rcvR_bldr);
		return rcvR;
	}
	
	protected MCNumber getNotProcBalSum(String rcvNo) {
		MST_RCV_R rcvR = MST_RCV_R.create("T");
		MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(rcvR);
		rcvR_bldr.addSum(rcvR.not_proc_bal, "not_proc_bal");
		rcvR_bldr.setWhere(rcvR.rcv_no.eq(bind("1")).or(rcvR.div_src_rcv_no.eq(bind("1"))), rcvNo);
		dbSelect("MSBGL5020_MST_RCV_S04", rcvR, rcvR_bldr);
		return rcvR.getNumber("not_proc_bal");
	}

	protected boolean isComplAppl(MST_RCV_R rcvR, MCNumber applAmt, MCNumber notProcBalSum){

		// 仮受金あるいは前受金の相殺時の実績
		// （前受金売掛金相殺、仮受金前受金相殺、仮受金売掛金相殺、仮受金その他勘定相殺）、
		// または、売上代金入金、売掛金その他相殺、前受金入金、仮受金入金の実績で入金情報を参照する場合
		if (!isNull(rcvR.rcv_no())) {
			return isSame(notProcBalSum, applAmt);
		}
		// 売上代金入金、売掛金その他相殺、前受金入金、仮受金入金の実績で入金情報を参照しない場合
		else {
			return true;
		}
	}

	protected MCNumber getDiffBcurAmt(MST_RCV_R rcvR, RcvAct_InfoR hR, MCNumber regBcurApplAmt, MCNumber regApplAmt) {
		MCNumber bcurRcvAmt = null;
		MCNumber bcurApplAmt = null;
		MCNumber diffAmt = null;

		// 仮受金あるいは前受金の相殺時の実績
		// （前受金売掛金相殺、仮受金前受金相殺、仮受金売掛金相殺、仮受金その他勘定相殺、前受金その他勘定相殺）の場合
		if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(hR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(hR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(hR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(hR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(hR.trd_ptn_typ())) {

			bcurRcvAmt = getBcurRcvAmt(hR.rcv_no());
			bcurApplAmt = getBcurApplAmt(hR.rcv_no());
			diffAmt = bcurRcvAmt.subtract(bcurApplAmt.add(regBcurApplAmt));
			return diffAmt;
		}
		// 売上代金入金、売掛金その他相殺、前受金入金、仮受金入金の実績で入金情報を参照する場合
		else if (!isNull(hR.rcv_no())) {
			bcurRcvAmt = convToBaseCur(rcvR.rcv_amt(), rcvR.xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			bcurApplAmt = getBcurApplAmt(hR.rcv_no());
			diffAmt = bcurRcvAmt.subtract(bcurApplAmt.add(regBcurApplAmt));
		}
		// 売上代金入金、売掛金その他相殺、前受金入金、仮受金入金の実績で入金情報を参照しない場合
		else {
			bcurRcvAmt = convToBaseCur(regApplAmt, hR.xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			diffAmt = bcurRcvAmt.subtract(regBcurApplAmt);
		}

		return diffAmt;
	}

	protected MCNumber getBcurRcvAmt(String rcvNo) {
		MST_RCV_ACT_D_R slipDR = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder slipDR_bldr = MCQueryApiBuilder.create(slipDR);
		slipDR_bldr.setSelect(bracket( slipDR.base_cur_amt1.add(slipDR.base_cur_amt2)).as("base_cur_adv_amt"));
		slipDR_bldr.setWhere(slipDR.gen_rcv_no.eq(bind("1")), rcvNo);
		dbSelect("MSBGL5020_MST_RCV_ACT_D_S04", slipDR, slipDR_bldr);
		return slipDR.getNumberNE("base_cur_adv_amt");
	}

	protected MCNumber getBcurApplAmt(String rcvNo) {
		MST_RCV_ACT_R slipR = MST_RCV_ACT_R.create("T");
		MCQueryApiBuilder slipR_bldr = MCQueryApiBuilder.create(slipR);
		slipR_bldr.addSum(slipR.base_cur_subttl1, "base_cur_subttl1");
		slipR_bldr.setWhere(slipR.rcv_no.eq(bind("1")), rcvNo);
		dbSelect("MSBGL5020_MST_RCV_ACT_S03", slipR, slipR_bldr);
		return nvl(slipR.getNumberNE("base_cur_subttl1"), MCNumber.ZERO);
	}
	
	/**
	 * 帳票区分（出力タイプ）を取得する
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @return 帳票区分
	 */
	protected MSC_AR_SLIP_PRNT_TYP getPrntTyp(String trdPtnTyp) {

		// 債権伝票
		if (MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp) || MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isRCV_AR(trdPtnTyp)) {
			return MSC_AR_SLIP_PRNT_TYP.GEN;
		}
		// 相殺伝票
		else if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdPtnTyp)) {
			return MSC_AR_SLIP_PRNT_TYP.SETOFF;
		}
		// 振替伝票
		else if (MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdPtnTyp)) {
			return MSC_AR_SLIP_PRNT_TYP.ARSW;
		}
		// 仮受金その他相殺伝票
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)) {
			return MSC_AR_SLIP_PRNT_TYP.SETOFF_SUSP;
		}
		
		return null;
	}

	/**
	 * 新規の入金実績情報を作成する
	 * 
	 * @param baseR 基本情報
	 * @param hR 基本ヘッダ情報
	 * @return 入金実績情報
	 */
	protected MST_RCV_ACT_R createNewRcvAct(RcvAct_BaseR baseR, RcvAct_InfoR hR) {

		MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();
		rcvActR.setAttributes(hR);

		rcvActR.rcv_act_no(baseR.rcv_act_no());
		rcvActR.rcv_act_seq(baseR.rcv_act_seq());
		rcvActR.trd_cd(hR.trd_cd());
		rcvActR.rcv_act_rev(baseR.rcv_act_rev());
		rcvActR.ar_trd_grp_typ(hR.ar_trd_grp_typ());
		rcvActR.trd_ptn_typ(hR.trd_ptn_typ());
		rcvActR.rcv_no(hR.rcv_no());
		rcvActR.dpt_cd(hR.dpt_cd());
		rcvActR.wg_cd(hR.wg_cd());
		rcvActR.usr_cd(hR.usr_cd());
		rcvActR.rcst_cd(hR.rcst_cd());
		rcvActR.bcst_cd(hR.bcst_cd());
		rcvActR.bill_dpt_cd(hR.bill_dpt_cd());
		rcvActR.cred_cd(hR.cred_cd());
		rcvActR.rcv_dt(hR.rcv_dt());
		rcvActR.ac_dt(hR.ac_dt());
		rcvActR.bill_basis_dt(hR.bill_basis_dt());
		rcvActR.ac_ym(hR.ac_ym());
		rcvActR.trd_cur_cd(hR.trd_cur_cd());
		rcvActR.base_cur_cd(getBaseCur().cur_cd());
		rcvActR.xrate_cd(hR.xrate_cd());
		rcvActR.xrate(hR.xrate());
		rcvActR.ar_sttl_cd1(hR.ar_sttl_cd1());
		rcvActR.ar_sttl_typ1(hR.ar_sttl_typ1());
		rcvActR.tax_cd1(hR.tax_cd1());
		rcvActR.bank_ac_cd(hR.bank_ac_cd());
		rcvActR.xfr_psn(hR.xfr_psn());
		rcvActR.note_mng_no(hR.note_mng_no());
		rcvActR.note_no(hR.note_no());
		rcvActR.bd_dpt_cd(hR.bd_dpt_cd());
		rcvActR.debt_cred_id_typ(hR.debt_cred_id_typ());
		rcvActR.debt_cred_id_cd(hR.debt_cred_id_cd());
		rcvActR.debt_cred_nm(hR.debt_cred_nm());
		rcvActR.ar_sttl_cd2(hR.ar_sttl_cd2());
		rcvActR.ar_sttl_typ2(hR.ar_sttl_typ2());
		rcvActR.tax_cd2(hR.tax_cd2());
		rcvActR.ar_sttl_cd3(hR.ar_sttl_cd3());
		rcvActR.ar_sttl_typ3(hR.ar_sttl_typ3());
		rcvActR.tax_cd3(hR.tax_cd3());
		rcvActR.trd_cur_amt(hR.amt());
		rcvActR.subttl1(hR.subttl1());
		rcvActR.subttl2(hR.subttl2());
		rcvActR.subttl3(hR.subttl3());
		rcvActR.tax_amt(hR.tax_amt());
		rcvActR.tax_subttl1(hR.tax_subttl1());
		rcvActR.tax_subttl2(hR.tax_subttl2());
		rcvActR.tax_subttl3(hR.tax_subttl3());
		rcvActR.base_cur_amt(hR.base_cur_amt());
		rcvActR.base_cur_subttl1(hR.base_cur_subttl1());
		rcvActR.base_cur_subttl2(hR.base_cur_subttl2());
		rcvActR.base_cur_subttl3(hR.base_cur_subttl3());
		rcvActR.base_cur_tax_amt(hR.base_cur_tax_amt());
		rcvActR.base_cur_tax_subttl1(hR.base_cur_tax_subttl1());
		rcvActR.base_cur_tax_subttl2(hR.base_cur_tax_subttl2());
		rcvActR.base_cur_tax_subttl3(hR.base_cur_tax_subttl3());
		rcvActR.trd_rmrks(hR.trd_rmrks());
		rcvActR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
		rcvActR.par_rcv_act_no(baseR.rcv_act_no());
		rcvActR.par_rcv_act_seq(baseR.rcv_act_seq());
		rcvActR.ar_slip_prnt_typ(getPrntTyp(hR.trd_ptn_typ()).value());
		rcvActR.rcv_auto_appl_flg(hR.rcv_auto_appl_flg());
		rcvActR.prnt_flg(hR.prnt_flg());
		rcvActR.bill_dtl_adv_flg(hR.bill_dtl_adv_flg());
		rcvActR.sub_char1(hR.sub_char1());
		rcvActR.sub_char2(hR.sub_char2());
		rcvActR.sub_char3(hR.sub_char3());
		setAcRsn(rcvActR);

		return rcvActR;
	}

	/**
	 * 会計理由ＣＤを設定する
	 * 
	 * @param r
	 */
	protected void setAcRsn(MST_RCV_ACT_R r) {

		// 取引マスタ
		MAM_TRD_R trdR = MAM_TRD_R.create("T");
		MCQueryApiBuilder trdR_bldr = MCQueryApiBuilder.create(trdR);
		dbSelectKey("MSBGL5020_MAM_TRD_S02", trdR, trdR_bldr, r.trd_cd());
		r.trd_ac_rsn_cd(trdR.ac_rsn_cd());

		// 決済方法マスタ
		if (!isNull(r.ar_sttl_cd1())) {
			MAM_STTL_R sttlR = MAM_STTL_R.create("T");
			MCQueryApiBuilder sttlR_bldr = MCQueryApiBuilder.create(sttlR);
			dbSelectKey("MSBGL5020_MAM_STTL_S01", sttlR, sttlR_bldr, r.ar_sttl_cd1());
			r.ar_sttl_ac_rsn_cd1(sttlR.ac_rsn_cd());
		}
		if (!isNull(r.ar_sttl_cd2())) {
			MAM_STTL_R sttlR = MAM_STTL_R.create("T");
			MCQueryApiBuilder sttlR_bldr = MCQueryApiBuilder.create(sttlR);
			dbSelectKey("MSBGL5020_MAM_STTL_S02", sttlR, sttlR_bldr, r.ar_sttl_cd2());
			r.ar_sttl_ac_rsn_cd2(sttlR.ac_rsn_cd());
		}
		if (!isNull(r.ar_sttl_cd3())) {
			MAM_STTL_R sttlR = MAM_STTL_R.create("T");
			MCQueryApiBuilder sttlR_bldr = MCQueryApiBuilder.create(sttlR);
			dbSelectKey("MSBGL5020_MAM_STTL_S03", sttlR, sttlR_bldr, r.ar_sttl_cd3());
			r.ar_sttl_ac_rsn_cd3(sttlR.ac_rsn_cd());
		}
	}

	/**
	 * 入金実績明細に対応する請求明細の請求管理ＮＯと請求明細ＮＯを設定する<p>
	 * 引数のコンテナに 請求管理ＮＯと請求明細ＮＯを設定する<br>
	 * また請求管理ＮＯはデータベースに反映する
	 * 
	 * @param rcvActDL 入金実績明細（請求管理ＮＯと請求明細ＮＯが格納される）
	 */
	protected void setBillMngNo(MCList<MST_RCV_ACT_D_R> rcvActDL) {

		for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {
			MST_BILL_D_R billDR = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDR_bldr = MCQueryApiBuilder.create(billDR);
			billDR_bldr.setSelect(billDR.bill_mng_no);
			billDR_bldr.addSelect(billDR.bill_d_no);
			billDR_bldr.setWhere(billDR.act_d_no.eq(bind("rcv_act_d_no")));
			billDR_bldr.addWhereWithAnd(billDR.act_d_seq.eq(bind("rcv_act_d_seq")));
			billDR_bldr.addWhereWithAnd(billDR.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())));
			dbSelect("MSBGL5020_MST_BILL_D_S06", billDR, billDR_bldr, rcvActDR);
			// 結果の格納
			rcvActDR.bill_mng_no(billDR.bill_mng_no());
			rcvActDR.addStringColumn("bill_d_no", billDR.bill_d_no());
		}

		// 入金実績明細への反映
		MST_RCV_ACT_D_R rcvActDL_t = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(rcvActDL_t);
		rcvActDL_bldr.setSetVL(rcvActDL_t.bill_mng_no, bindEx("bill_mng_no"));
		rcvActDL_bldr.setWhere(rcvActDL_t.rcv_act_d_no.eq(bindEx("rcv_act_d_no")));
		rcvActDL_bldr.addWhereWithAnd(rcvActDL_t.rcv_act_d_seq.eq(bindEx("rcv_act_d_seq")));
		dbUpdate("MSBGL5020_MST_RCV_ACT_D_U02", rcvActDL, rcvActDL_bldr);
	}

	/**
	 * 新規の入金実績明細情報を作成する
	 * 
	 * @param baseR 基本情報
	 * @param hR ヘッダ情報
	 * @param dL 明細情報
	 * @return 入金実績明細情報
	 */
	protected MCList<MST_RCV_ACT_D_R> createNewRcvActD(RcvAct_BaseR baseR,
			RcvAct_InfoR hR, MCList<RcvActD_InfoR> dL) {

		MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);

		for (int i = 0; i < dL.size(); i++) {
			MST_RCV_ACT_D_R rcvActDR = createNewRcvActD(baseR, hR, dL.get(i), i+1);
			rcvActDL.add(rcvActDR);
		}

		return rcvActDL;
	}


	/**
	 * インボイス毎に今回の消込で未消込残高が0になる場合<tt>true</tt>、それ以外は<tt>false</tt>を返す。
	 * 
	 * @param dR 明細情報
	 * @param hR ヘッダ情報
	 * @return 判定結果
	 */
	protected boolean isApplBalZero(RcvActD_InfoR dR, RcvAct_InfoR hR) {
		MST_AR_APPL_SCHD_R arApplSchdR = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder arApplSchdR_bldr = MCQueryApiBuilder.create(arApplSchdR);
		MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
		MST_BILL_R t3 = MST_BILL_R.create("T3");
		arApplSchdR_bldr.setSelect(arApplSchdR.iv_no);
		arApplSchdR_bldr.addSum(arApplSchdR.not_appl_bal, "sum_not_appl_bal");
		arApplSchdR_bldr.addGroupBy(arApplSchdR.iv_no);
		arApplSchdR_bldr.setWhere(arApplSchdR.iv_no.eq(bind("1")), dR.iv_no());
		arApplSchdR_bldr.addInnerJoin(t2, bracket( arApplSchdR.bill_acst_no.eq(t2.bill_acst_no)));
		arApplSchdR_bldr.addInnerJoin(t3, bracket( t2.bill_mng_no.eq(t3.bill_mng_no)));
		arApplSchdR_bldr.addWhereWithAnd(t3.trd_cur_cd.eq(bind("1")), hR.trd_cur_cd());
		arApplSchdR_bldr.addWhereWithAnd(t2.acst_cd.eq(bind("1")), dR.acst_cd());
		arApplSchdR_bldr.addWhereWithAnd(arApplSchdR.ar_typ.eq(bind("1")), dR.ar_typ());
		arApplSchdR_bldr.addWhereWithAnd(t2.ar_dpt_cd.eq(bind("1")), dR.ar_dpt_cd());
		arApplSchdR_bldr.addWhereWithAnd(bracket(t3.wrk_no.eq(bind("1"))
				.or(t3.wrk_no.isNull())
				.and(bind("1").isNull())), dR.wrk_no());
		dbSelect("MSBGL5020_MST_AR_APPL_SCHD_S03", arApplSchdR, arApplSchdR_bldr);

		if (isSame(arApplSchdR.getNumber("sum_not_appl_bal"), MCNumber.sum(dR.amt1(), dR.amt2(), dR.amt3()))) {
			return true;
		}

		return false;
	}

	/**
	 * 新規の入金実績明細を作成する
	 * 
	 * @param baseR
	 * @param hR
	 * @param dR
	 * @param cnt
	 * @return
	 */
	protected MST_RCV_ACT_D_R createNewRcvActD(RcvAct_BaseR baseR, RcvAct_InfoR hR, RcvActD_InfoR dR, int cnt) {

		MST_RCV_ACT_D_R rcvActDR = MST_RCV_ACT_D_R.create();
		rcvActDR.setAttributes(dR);

		// 上り電文に入金実績明細ＮＯがない場合は新規発番する
		if (isNull(dR.rcv_act_d_no())) {
			rcvActDR.rcv_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTD));
			rcvActDR.rcv_act_d_seq(1);
		}
		else {
			rcvActDR.rcv_act_d_no(dR.rcv_act_d_no());
			rcvActDR.rcv_act_d_seq(dR.rcv_act_d_seq().add(2));
		}
		rcvActDR.rcv_act_no(baseR.rcv_act_no());
		rcvActDR.rcv_act_seq(baseR.rcv_act_seq());
		rcvActDR.disp_seq(cnt);
		rcvActDR.bill_mng_no(null);
		rcvActDR.bcst_cd(dR.bcst_cd());
		rcvActDR.bill_dpt_cd(dR.bill_dpt_cd());
		rcvActDR.acst_cd(dR.acst_cd());
		rcvActDR.ar_dpt_cd(dR.ar_dpt_cd());
		rcvActDR.wg_cd(dR.wg_cd());
		rcvActDR.iv_no(dR.iv_no());
		rcvActDR.setStringNE(RcvActD_InfoR.$bill_iv_no, dR.bill_iv_no());
		rcvActDR.wrk_no(dR.wrk_no());
		rcvActDR.ar_typ(dR.ar_typ());
		rcvActDR.ar_sttl_cd1(dR.ar_sttl_cd1());
		rcvActDR.ar_sttl_typ1(dR.ar_sttl_typ1());
		rcvActDR.trd_cur_amt1(dR.amt1());
		rcvActDR.trd_cur_tax_amt1(dR.tax_amt1());
		rcvActDR.trd_cur_amt2(dR.amt2());
		rcvActDR.trd_cur_tax_amt2(dR.tax_amt2());
		rcvActDR.trd_cur_amt3(dR.amt3());
		rcvActDR.trd_cur_tax_amt3(dR.tax_amt3());
		rcvActDR.base_cur_amt1(dR.base_cur_amt1());
		rcvActDR.base_cur_tax_amt1(dR.base_cur_tax_amt1());
		rcvActDR.base_cur_amt2(dR.base_cur_amt2());
		rcvActDR.base_cur_tax_amt2(dR.base_cur_tax_amt2());
		rcvActDR.base_cur_amt3(dR.base_cur_amt3());
		rcvActDR.base_cur_tax_amt3(dR.base_cur_tax_amt3());
		rcvActDR.trd_xrate(dR.trd_xrate());
		rcvActDR.gen_rcv_no(null);
		rcvActDR.bill_d_rmrks(dR.bill_d_rmrks());
		rcvActDR.appl_cmpl_flg(false);
		rcvActDR.addStringColumn("ar_appl_schd_no", dR.ar_appl_schd_no());
		rcvActDR.addStringColumn("tgt_rcv_bill_mng_no", dR.tgt_rcv_bill_mng_no());
		rcvActDR.addNumberColumn("exc_gain_loss", dR.exc_gain_loss());
		// 入金実績明細と明細消込を行う請求明細の紐付け
		// 売掛消込時に明細消込を同時に行う場合（自動消込ではなく売掛消込登録で消込対象の明細を指定した場合）に使用する
		rcvActDR.addNumberColumn("grp_seq", dR.grp_seq());
		rcvActDR.setNumberNE("xrateRevHisGainLossRcvAct", dR.getNumberNE("xrateRevHisGainLossRcvAct"));
		rcvActDR.setNumberNE("xrateRevHisGainLoss", dR.getNumberNE("xrateRevHisGainLoss"));
		rcvActDR.setNumberNE("slsXrate", dR.getNumberNE("slsXrate"));
		rcvActDR.setNumberNE("new_xrate", dR.getNumberNE("new_xrate"));
		rcvActDR.setStringNE("ar_xrate_rev_his_no", dR.getStringNE("ar_xrate_rev_his_no"));
		rcvActDR.setBooleanNE("isCalcXchngReq", dR.getBooleanNE("isCalcXchngReq"));

		return rcvActDR;
	}

	// MST_RCV_ACT_D_R → ArCmn_Upd01_DtlR
	protected Map_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R<ArCmn_Upd01_DtlR,MST_RCV_ACT_D_R> createMap_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R(MST_RCV_ACT_R rcvActR) {
		return new Map_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R<ArCmn_Upd01_DtlR, MST_RCV_ACT_D_R>(rcvActR);
	}

	public class Map_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R<D extends ArCmn_Upd01_DtlR, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D,S>{

		protected MST_RCV_ACT_R rcvActR;

		public Map_ArCmn_Upd01_DtlR_MST_RCV_ACT_D_R(MST_RCV_ACT_R rcvActR) {
			this.rcvActR = rcvActR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArCmn_Upd01_DtlR.$act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_no);
			addColumnPathMap(ArCmn_Upd01_DtlR.$act_d_seq, MST_RCV_ACT_D_R.$rcv_act_d_seq);
			addColumnPathMap(ArCmn_Upd01_DtlR.$bill_mng_no, MST_RCV_ACT_D_R.$bill_mng_no);
			addColumnPathMap(ArCmn_Upd01_DtlR.$acst_cd, MST_RCV_ACT_D_R.$acst_cd);
			addColumnPathMap(ArCmn_Upd01_DtlR.$ar_dpt_cd, MST_RCV_ACT_D_R.$ar_dpt_cd);
			addColumnPathMap(ArCmn_Upd01_DtlR.$bill_dpt_cd, MST_RCV_ACT_D_R.$bill_dpt_cd);
			addColumnPathMap(ArCmn_Upd01_DtlR.$sls_dpt_cd, MST_RCV_ACT_D_R.$bill_dpt_cd);
			addColumnPathMap(ArCmn_Upd01_DtlR.$iv_no, MST_RCV_ACT_D_R.$iv_no);
			addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt1, MST_RCV_ACT_D_R.$trd_cur_amt1);
			addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt2, MST_RCV_ACT_D_R.$trd_cur_amt2);
			addColumnPathMap(ArCmn_Upd01_DtlR.$trd_cur_amt3, MST_RCV_ACT_D_R.$trd_cur_amt3);
			addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt1, MST_RCV_ACT_D_R.$base_cur_amt1);
			addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt2, MST_RCV_ACT_D_R.$base_cur_amt2);
			addColumnPathMap(ArCmn_Upd01_DtlR.$base_cur_amt3, MST_RCV_ACT_D_R.$base_cur_amt3);
			addColumnPathMap(ArCmn_Upd01_DtlR.$bill_d_rmrks, MST_RCV_ACT_D_R.$bill_d_rmrks);
			addColumnPathMap(ArCmn_Upd01_DtlR.$wrk_no, MST_RCV_ACT_D_R.$wrk_no);
			addColumnPathMap(ArCmn_Upd01_DtlR.$ar_typ, MST_RCV_ACT_D_R.$ar_typ);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.trd_cd(rcvActR.trd_cd());
			dest.act_no(rcvActR.rcv_act_no());
			dest.act_seq(rcvActR.rcv_act_seq());
			dest.act_rev(rcvActR.rcv_act_rev());
			dest.trd_cur_cd(rcvActR.trd_cur_cd());
			dest.ar_trd_grp_typ(rcvActR.ar_trd_grp_typ());
			dest.trd_ptn_typ(rcvActR.trd_ptn_typ());
			dest.ar_appl_schd_no(src.getStringNE("ar_appl_schd_no"));
			dest.bcst_cd(isNull(rcvActR.bcst_cd()) ? src.bcst_cd() : rcvActR.bcst_cd());
			dest.ac_dt(rcvActR.ac_dt());
			dest.ac_ym(rcvActR.ac_ym());
			dest.bill_crryovr_times(MCNumber.ZERO);
			dest.bill_basis_dt(rcvActR.bill_basis_dt());
			dest.rcv_dt(rcvActR.rcv_dt());
			dest.rcv_typ(rcvActR.ar_sttl_typ1());
			dest.rcv_mtd_cd(rcvActR.ar_sttl_cd1());
			dest.trd_unit_qty(MCNumber.ZERO);
			dest.base_unit_qty(MCNumber.ZERO);
			dest.trd_cur_upri(MCNumber.ZERO);
			dest.inc_tax_flg(false);
			dest.interim_flg(false);
			dest.trd_cur_amt(MCNumber.sum(src.trd_cur_amt1(), src.trd_cur_amt2(), src.trd_cur_amt3()));
			if(isArApplTrdPtnTyp(rcvActR.trd_ptn_typ())){
				dest.xrate(rcvActR.xrate());
			}
			else {
				dest.xrate(src.trd_xrate());
			}
			dest.base_cur_upri(MCNumber.ZERO);
			dest.base_cur_amt(MCNumber.sum(src.base_cur_amt1(), src.base_cur_amt2(), src.base_cur_amt3()));
			dest.base_cur_tax_amt(MCNumber.ZERO);
			// 取引パタン区分：請求時税差額の場合、税ＣＤを設定
			if (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(rcvActR.trd_ptn_typ())) {
				dest.tax_cd(rcvActR.tax_cd1());
			}
			dest.trd_cur_tax_amt(MCNumber.ZERO);
			dest.wtax_amt(MCNumber.ZERO);
			dest.trd_d_rmrks(null);
			dest.par_act_no(rcvActR.par_rcv_act_no());
			dest.par_act_seq(rcvActR.par_rcv_act_seq());
			dest.bill_d_typ(MSC_BILL_D_TYP.RCV.value());
			dest.slip_sts_typ(rcvActR.slip_sts_typ());
			dest.rcv_schd_dt(null);
			dest.tgt_flg(false);
			dest.ar_wrk_no(null);
			dest.bill_cl_dt(null);
			dest.bill_iv_no(src.getStringNE(RcvActD_InfoR.$bill_iv_no));
		}
	}


	
	/**
	 * インボイス毎に今回の消込で未消込残高が0になる場合<tt>true</tt>、それ以外は<tt>false</tt>を返す。
	 * 
	 * @param dR 明細情報
	 * @param hR ヘッダ情報
	 * @return 判定結果
	 */
	protected boolean isApplBalZero(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp,
			MCNumber amt) {
		MST_AR_APPL_SCHD_R arApplSchdR = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder arApplSchdR_bldr = MCQueryApiBuilder.create(arApplSchdR);
		MST_BILL_ACST_R t2 = MST_BILL_ACST_R.create("T2");
		MST_BILL_R t3 = MST_BILL_R.create("T3");
		arApplSchdR_bldr.setSelect(arApplSchdR.iv_no);
		arApplSchdR_bldr.addSum(arApplSchdR.not_appl_bal, "sum_not_appl_bal");
		arApplSchdR_bldr.addGroupBy(arApplSchdR.iv_no);
		arApplSchdR_bldr.setWhere(arApplSchdR.iv_no.eq(bind("1")), ivNo);
		arApplSchdR_bldr.addInnerJoin(t2, bracket( arApplSchdR.bill_acst_no.eq(t2.bill_acst_no)));
		arApplSchdR_bldr.addInnerJoin(t3, bracket( t2.bill_mng_no.eq(t3.bill_mng_no)));
		arApplSchdR_bldr.addWhereWithAnd(t3.trd_cur_cd.eq(bind("1")), trcCurCd);
		arApplSchdR_bldr.addWhereWithAnd(t2.acst_cd.eq(bind("1")), acstCd);
		arApplSchdR_bldr.addWhereWithAnd(arApplSchdR.ar_typ.eq(bind("1")), arTyp);
		arApplSchdR_bldr.addWhereWithAnd(t2.ar_dpt_cd.eq(bind("1")), arDptCd);
		arApplSchdR_bldr.addWhereWithAnd(bracket(t3.wrk_no.eq(bind("1"))
				.or(t3.wrk_no.isNull())
				.and(bind("1").isNull())), wrkNo);
		dbSelect("MSBGL5020_MST_AR_APPL_SCHD_S04", arApplSchdR, arApplSchdR_bldr);

		if (isSame(arApplSchdR.getNumber("sum_not_appl_bal"), amt)) {
			return true;
		}

		return false;
	}


	protected MCNumber calcXchngGl(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp,
			String bcstCd, String billDptCd, MCNumber bcurSwAmt) {

			MCNumber bcurSlsAmt = getBaseCurSlsAmt(acstCd, arDptCd, trcCurCd, ivNo, wrkNo, arTyp);
			MCNumber bcurRcvAmt = getBaseCurRcvAmt(acstCd, arDptCd, trcCurCd, ivNo, wrkNo, arTyp, bcstCd, billDptCd);
			return bcurRcvAmt.add(bcurSwAmt).subtract(bcurSlsAmt);

	}

	/**
	 * 今回消込対象となるインボイスに対応した売上の基準通貨金額合計を取得する。
	 */
	protected MCNumber getBaseCurSlsAmt(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp) {
		MST_BILL_D_R billDR = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billDR_bldr = MCQueryApiBuilder.create(billDR);
		MST_BILL_ACST_R acst = MST_BILL_ACST_R.create("ACST");
		MST_BILL_R bill = MST_BILL_R.create("BILL");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		
		billDR_bldr.addSum(cases()
				.when(MSPA_AR_UTIL$F_GET_AMT_DISP_PM(billDR.trd_ptn_typ,
						itm.dscnt_itm_flg).eq(value(1)))
				.then(billDR.base_cur_amt.add(billDR.base_cur_tax_amt))
				.when(MSPA_AR_UTIL$F_GET_AMT_DISP_PM(billDR.trd_ptn_typ,
						itm.dscnt_itm_flg).eq(value(-1)))
				.then(value(0).subtract(
						bracket(billDR.base_cur_amt.add(billDR.base_cur_tax_amt))))
				.otherwise(nullValue()), "base_cur_amt");
		billDR_bldr.addLeftOuterJoin(acst, bracket( billDR.bill_acst_no.eq(acst.bill_acst_no)));
		billDR_bldr.addLeftOuterJoin(bill, bracket( billDR.bill_mng_no.eq(bill.bill_mng_no)));
		billDR_bldr.addLeftOuterJoin(itm, bracket(billDR.itm_cd.eq(itm.itm_cd)
						.and(billDR.itm_sub1.eq(itm.itm_sub1))
						.and(billDR.itm_sub2.eq(itm.itm_sub2))
						.and(billDR.itm_sub3.eq(itm.itm_sub3))));
		billDR_bldr.setWhere(billDR.iv_no.eq(bind("1")), ivNo);
		billDR_bldr.addWhereWithAnd(acst.acst_cd.eq(bind("1")), acstCd);
		billDR_bldr.addWhereWithAnd(acst.ar_dpt_cd.eq(bind("1")), arDptCd);
		billDR_bldr.addWhereWithAnd(bracket(bill.wrk_no.eq(bind("1"))
				.or(bill.wrk_no.isNull())
				.and(bind("1").isNull())), wrkNo);
		billDR_bldr.addWhereWithAnd(bill.trd_cur_cd.eq(bind("1")), trcCurCd);
		billDR_bldr.addWhereWithAnd(billDR.ar_typ.eq(bind("1")), arTyp);
		billDR_bldr.addWhereWithAnd(
				bracket(billDR.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value()))
						.or(billDR.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
								value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))));
		billDR_bldr.addWhereWithAnd(billDR.valid_flg.eq(value(true)));

		dbSelect("MSBGL5020_MST_BILL_D_S07", billDR, billDR_bldr);

		return billDR.getNumberNE("base_cur_amt");
	}

	


	protected MCNumber getBaseCurRcvAmt(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp, String bcstCd, String billDptCd) {

		// 入金実績から基準通貨入金額の合計を取得する
		MCList<MST_RCV_ACT_D_R> rcvActDL = getRcvActDL(acstCd, arDptCd, trcCurCd, ivNo, wrkNo, arTyp);
		MCNumber sumAmt = rcvActDL.sum("amt");

		// 入金実績に紐づく為替差損益を取得する
		MCList<MST_AR_EXC_GAIN_LOSS_R> gainLossL = getArGainLossL4RcvAct(rcvActDL);
		MCNumber rcvActGainLoss = nvl(gainLossL.sum(MST_AR_EXC_GAIN_LOSS_R.$exc_gain_loss), MCNumber.ZERO);

		// 為替レート評価替に紐づく為替差損益を取得する
		MCNumber xrateRevHisGainLoss = getXrateRevHisGainLoss(acstCd, arDptCd, trcCurCd, ivNo, wrkNo, arTyp);
		
		return MCNumber.sum(sumAmt, rcvActGainLoss.negate(), xrateRevHisGainLoss.negate());
	}
	protected MCList<MST_RCV_ACT_D_R> getRcvActDL(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp) {
		MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
		MST_RCV_ACT_D_R rcvActDL_t = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(rcvActDL_t);
		MST_RCV_ACT_R rcvact = MST_RCV_ACT_R.create("RCVACT");

		rcvActDL_bldr.setSelect(rcvActDL_t.rcv_act_d_no);
		rcvActDL_bldr.addSelect(rcvActDL_t.rcv_act_d_seq);
		rcvActDL_bldr.addSelect(rcvActDL_t.base_cur_amt1.add(rcvActDL_t.base_cur_amt2)
				.add(rcvActDL_t.base_cur_amt3).as("amt"));
		rcvActDL_bldr.addLeftOuterJoin(rcvact, bracket(rcvActDL_t.rcv_act_no.eq(rcvact.rcv_act_no)
						.and(rcvActDL_t.rcv_act_seq.eq(rcvact.rcv_act_seq))));
		rcvActDL_bldr.setWhere(rcvActDL_t.acst_cd.eq(bind("1")), acstCd);
		rcvActDL_bldr.addWhereWithAnd(rcvActDL_t.ar_dpt_cd.eq(bind("1")), arDptCd);
		rcvActDL_bldr.addWhereWithAnd(rcvact.trd_cur_cd.eq(bind("1")), trcCurCd);
		rcvActDL_bldr.addWhereWithAnd(rcvActDL_t.iv_no.eq(bind("1")), ivNo);
		rcvActDL_bldr.addWhereWithAnd(bracket(rcvActDL_t.wrk_no.eq(bind("1"))
								.or(rcvActDL_t.wrk_no.isNull())
								.and(bind("1").isNull())), wrkNo);
		rcvActDL_bldr.addWhereWithAnd(rcvActDL_t.ar_typ.eq(bind("1")), arTyp);
		rcvActDL_bldr.addWhereWithAnd(
				rcvact.trd_ptn_typ.notIn(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()),
						value(MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.value()),
						value(MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.value())));

		dbSelect("MSBGL5020_MST_RCV_ACT_D_S05", rcvActDL, rcvActDL_bldr);
		
		return rcvActDL;
	}
	protected MCList<MST_AR_EXC_GAIN_LOSS_R> getArGainLossL4RcvAct(MCList<MST_RCV_ACT_D_R> rcvActDL) {
		MCList<MST_AR_EXC_GAIN_LOSS_R> gainLossL = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);
		MST_AR_EXC_GAIN_LOSS_R gainLossL_t = MST_AR_EXC_GAIN_LOSS_R.create("T");
		MCQueryApiBuilder gainLossL_bldr = MCQueryApiBuilder.create(gainLossL_t);

		gainLossL_bldr.setWhere(gainLossL_t.rcv_act_d_no.eq(bind("rcv_act_d_no")));
		gainLossL_bldr.addWhereWithAnd(gainLossL_t.rcv_act_d_seq.eq(bind("rcv_act_d_seq")));
		dbSelect("MSBGL5020_MST_AR_EXC_GAIN_LOSS_S02", gainLossL, gainLossL_bldr, rcvActDL);
		
		return gainLossL;
	}
	protected MCNumber getXrateRevHisGainLoss(String acstCd, String arDptCd, String trcCurCd, String ivNo, String wrkNo, String arTyp) {
		MCList<MST_AR_XRATE_REV_HIS_R> xrateRevHisL = MCList.create(MST_AR_XRATE_REV_HIS_R.class);
		MST_AR_XRATE_REV_HIS_R xrateRevHisL_t = MST_AR_XRATE_REV_HIS_R.create("T");
		MCQueryApiBuilder xrateRevHisL_bldr = MCQueryApiBuilder.create(xrateRevHisL_t);
		MST_AR_EXC_GAIN_LOSS_R xrateRevHisL_t2 = MST_AR_EXC_GAIN_LOSS_R.create("T2");
		xrateRevHisL_bldr.setSelect(xrateRevHisL_t2.exc_gain_loss);
		xrateRevHisL_bldr.setWhere(xrateRevHisL_t.acst_cd.eq(bind("1")), acstCd);
		xrateRevHisL_bldr.addWhereWithAnd(xrateRevHisL_t.ar_dpt_cd.eq(bind("1")), arDptCd);
		xrateRevHisL_bldr.addWhereWithAnd(xrateRevHisL_t.trd_cur_cd.eq(bind("1")), trcCurCd);
		xrateRevHisL_bldr.addWhereWithAnd(xrateRevHisL_t.iv_no.eq(bind("1")), ivNo);
		xrateRevHisL_bldr.addWhereWithAnd(bracket( xrateRevHisL_t.wrk_no.eq(bind("1"))
				.or(xrateRevHisL_t.wrk_no.isNull())
				.and(bind("1").isNull())), wrkNo);
		xrateRevHisL_bldr.addWhereWithAnd(xrateRevHisL_t.ar_typ.eq(bind("1")), arTyp);
		xrateRevHisL_bldr.addInnerJoin(xrateRevHisL_t2, bracket( xrateRevHisL_t.ar_xrate_rev_his_no.eq(xrateRevHisL_t2.ar_xrate_rev_his_no)));
		dbSelect("MSBGL5020_MST_AR_XRATE_REV_HIS_S01", xrateRevHisL, xrateRevHisL_bldr);
		
		return nvl(xrateRevHisL.sum("exc_gain_loss"), MCNumber.ZERO);
	}


	/**
	 * 振替により、振替元の売掛残高が「0」になる場合に、基準通貨金額の調整を行う。
	 * 
	 */
	protected boolean needsAdjustBaseCurAmt(String trdCurCd, String acstCd, String arDptCd, String ivNo, String wrkNo, String arTyp, MCNumber amt) {
		if (isSame(getBaseCur().cur_cd(), trdCurCd)) {
			return false;
		}

		if (!isApplBalZero(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, amt)) {
			return false;
		}
		return true;
	}


	protected MCNumber calcBaseCurDiff(String trdCurCd, String acstCd, String arDptCd, String ivNo, String wrkNo, String arTyp,
			String bcstCd, String billDptCd, MCNumber baseCurAmt) {
		// 売上の基準通貨金額と、入金の基準通貨金額の差額を求める。為替差損益の計算と同じ。
		MCNumber xchngGl = calcXchngGl(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, bcstCd, billDptCd, baseCurAmt);
		return xchngGl;
	}

	//FMCB CUSTOM END
}