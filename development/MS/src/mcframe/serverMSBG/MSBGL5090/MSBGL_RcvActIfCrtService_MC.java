package mcframe.serverMSBG.MSBGL5090;

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
import static mcframe.serverMSBG.MSBGL5090.Query.*;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvActIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvActIfCrtService_MC extends MSBGL_RcvActIfCrtService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * RcvActIfCrt_Ins01オペレーション.<p>
	 *
	 * 入金実績、入金実績明細、為替レート評価替履歴、為替差損益の情報をもとに入金実績ＩＦを作成する。<br>
	 */
	public class RcvActIfCrt_Ins01 extends MSBGL_RcvActIfCrtService_MC_A.RcvActIfCrt_Ins01 {
		protected MCList<RcvActIfCrt_Ins01_RcvActR> _rcvActL;
		protected MCIndexKey _rcvActLIdx;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			write();
		}

		/**
		 * 入金実績ＩＦ書込みメイン処理
		 */
		protected void write() {

			MCList<MST_RCV_ACT_IF_R> insL = MCList.create(MST_RCV_ACT_IF_R.class);
			
			getRcvActData();

			for (RcvActIfCrt_Ins01_CndR r : up0()) {

				if (isNull(r.ar_xrate_rev_his_no())) {
					insL.addAll(getIfDataForRcvAct(r));
				}
				else {
					insL.addAll(getIfDataForXrateRevHis(r));
				}
			}

			// 入金実績ＩＦに登録
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_IF_R.create("T"));
			dbInsert("MSBGL5090_MST_RCV_ACT_IF_I01", insL, insL_bldr);
		}
		
		protected void getRcvActData() {
			_rcvActL = MCList.create(RcvActIfCrt_Ins01_RcvActR.class);
			
			MCList<RcvActIfCrt_Ins01_CndR> bindL =
				up0()
					.subList(r -> !isNull(r.rcv_act_d_no()) && !isNull(r.rcv_act_d_seq()))
					.distinctNE(RcvActIfCrt_Ins01_CndR.$rcv_act_d_no, RcvActIfCrt_Ins01_CndR.$rcv_act_d_seq);
			
			executeQuery(_rcvActL, MSBGL5090_MST_RCV_ACT_D_S01(), bindL);
			
			_rcvActLIdx =  _rcvActL.createIndex(
				RcvActIfCrt_Ins01_CndR.$rcv_act_d_no, RcvActIfCrt_Ins01_CndR.$rcv_act_d_seq
			);
		}
		protected MCList<RcvActIfCrt_Ins01_RcvActR> getRcvActL(RcvActIfCrt_Ins01_CndR r) {
		
			MCList<RcvActIfCrt_Ins01_RcvActR> rcvActL =
				_rcvActL.subList(_rcvActLIdx, r.rcv_act_d_no(), r.rcv_act_d_seq());
			
			if (!isNull(r.ref_ar_xrate_rev_his_no())) {
				rcvActL = rcvActL.subList(
					RcvActIfCrt_Ins01_CndR.$ref_ar_xrate_rev_his_no, r.ref_ar_xrate_rev_his_no());
			}
			
			return rcvActL;
		}
		protected RcvActIfCrt_Ins01_RcvActR getRcvActR(RcvActIfCrt_Ins01_CndR r) {
			RcvActIfCrt_Ins01_RcvActR rcvActR = _rcvActL.getFirst(_rcvActLIdx, r.rcv_act_d_no(), r.rcv_act_d_seq());
			
			if (isNull(rcvActR)) {
				rcvActR = RcvActIfCrt_Ins01_RcvActR.create();
			};
			
			return rcvActR;
		}

		/**
		 * 入金実績ＩＦ情報取得<br />
		 * 
		 * 上り電文の入金実績明細ＮＯ、入金実績明細連番をもとに<br>
		 * 入金実績ＩＦを作成して、入金実績ＩＦリストを返却する
		 * 
		 * @param r 上り電文
		 * @return 登録対象の入金実績ＩＦ
		 */
		protected MCList<MST_RCV_ACT_IF_R> getIfDataForRcvAct(RcvActIfCrt_Ins01_CndR r) {
			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			RcvActIfCrt_Ins01_RcvActR rcvActR = getRcvActR(r);

			// 売上代金入金
			if (MAC_TRD_PTN_TYP.isRCV_AR(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeRcvAr(rcvActR, r));
			}
			// 前受金入金
			else if (MAC_TRD_PTN_TYP.isRCV_ADV(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeRcvAdv(rcvActR));
			}
			// 仮受金入金
			else if (MAC_TRD_PTN_TYP.isRCV_SUSP(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeRcvSusp(rcvActR));
			}
			// 前受金売掛金相殺、仮受金売掛金相殺
			else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(rcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSetoffAr(rcvActR, r));
			}
			// 仮受金前受金相殺
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSetoffSuspAdv(rcvActR));
			}
			// 仮受金その他相殺
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSetoffSuspOth(rcvActR));
			}
			// 前受金その他相殺
			else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSetoffAdvOth(rcvActR));
			}
			// その他勘定売掛金相殺
			else if (MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSetoffOthAr(rcvActR, r));
			}
			// 請求残高振替払出、未請求残高振替払出
			else if (MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(rcvActR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARSW_OUT_NOT_BILL_BAL(rcvActR.trd_ptn_typ())) {
				rcvActIfL.addAll(writeSwBillBal(rcvActR));
			}
			return rcvActIfL;
		}

		/**
		 * 共通の情報の設定<br />
		 * 
		 * @param dest 設定先の入金実績ＩＦ
		 * @param src 設定元の入金実績情報
		 */
		protected void writeCommonData(MST_RCV_ACT_IF_R dest, RcvActIfCrt_Ins01_RcvActR src) {
			copy(dest, src, createWriteCommonData());
		}

		/**
		 * 為替差損益の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @param rcvDptCd 入金部門ＣＤ
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeExcGainLossForRcvAct(
				RcvActIfCrt_Ins01_RcvActR src, String rcvDptCd) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteExcGainLossForRcvAct());
			// 入金部門を引き継ぐ
			dest.rcv_dpt_cd(rcvDptCd);
			rcvActIfL.add(dest);

			return rcvActIfL;
		}

		/**
		 * 売上代金入金(入金)の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeRcvAr(RcvActIfCrt_Ins01_RcvActR src,
				RcvActIfCrt_Ins01_CndR r) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			copy(dest, src, createWriteRcvAr());
			writeCommonData(dest, src);

			// 為替レート評価替の処理で入金調整時に作成された為替差損益の場合、
			// （上記の場合は参照為替レート評価替履歴ＮＯがＮＵＬＬ以外で連携されてくる）
			// 入金実績、相殺のＩＦデータは作成済なので作成しない。
			if (isNull(r.ref_ar_xrate_rev_his_no())) {
				if (!isAmtZero(dest)) {
					rcvActIfL.add(dest);
				}
				// 相殺がある場合
				if (!src.trd_cur_amt2().isZero()) {
					rcvActIfL.addAll(writeSetoff(src, dest.rcv_dpt_cd()));
				}
			}
			// 為替差損益がある場合
			for (RcvActIfCrt_Ins01_RcvActR raR : getRcvActL(r)) {
				if (!raR.dtl_exc_gain_loss().isZero()) {
					rcvActIfL.addAll(writeExcGainLossForRcvAct(raR, dest.rcv_dpt_cd()));
				}
			}
			return rcvActIfL;
		}

		/**
		 * 売上代金入金(相殺)、前受金売掛金相殺（相殺）の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @param rcvDptCd 入金部門ＣＤ
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoff(RcvActIfCrt_Ins01_RcvActR src,
				String rcvDptCd) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoff());
			// 入金部門を引き継ぐ
			dest.rcv_dpt_cd(rcvDptCd);
			rcvActIfL.add(dest);

			return rcvActIfL;
		}

		/**
		 * 前受金入金（入金）の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeRcvAdv(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteRcvAdv());

			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}
			// 相殺がある場合
			if (!src.trd_cur_amt2().isZero()) {
				rcvActIfL.addAll(writeRcvAdvSetoff(src));
			}
			return rcvActIfL;
		}

		/**
		 * 前受金入金(相殺)の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeRcvAdvSetoff(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteRcvAdvSetoff());
			rcvActIfL.add(dest);

			return rcvActIfL;
		}

		/**
		 * 仮受金入金の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeRcvSusp(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteRcvSusp());
			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}

			return rcvActIfL;
		}

		/**
		 * 前受金売掛金相殺(入金)、仮受金売掛金相殺(入金)の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffAr(RcvActIfCrt_Ins01_RcvActR src,
				RcvActIfCrt_Ins01_CndR r) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoffAr());

			// 為替レート評価替の処理で入金調整時に作成された為替差損益の場合、
			// （上記の場合は参照為替レート評価替履歴ＮＯがＮＵＬＬ以外で連携されてくる）
			// 入金実績、相殺のＩＦデータは作成済なので作成しない。
			if (isNull(r.ref_ar_xrate_rev_his_no())) {
				if (!isAmtZero(dest)) {
					rcvActIfL.add(dest);
				}
				// 相殺がある場合
				if (!src.trd_cur_amt2().isZero()) {
					rcvActIfL.addAll(writeSetoff(src, dest.rcv_dpt_cd()));
				}
			}
			// 為替差損益がある場合
			for (RcvActIfCrt_Ins01_RcvActR raR : getRcvActL(r)) {
				if (!raR.dtl_exc_gain_loss().isZero()) {
					rcvActIfL.addAll(writeExcGainLossForRcvAct(raR, dest.rcv_dpt_cd()));
				}
			}

			return rcvActIfL;
		}

		/**
		 * 仮受金前受金相殺(入金)の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffSuspAdv(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoffSuspAdv());
			
			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}
			// 相殺がある場合
			if (!src.trd_cur_amt2().isZero()) {
				rcvActIfL.addAll(writeSetoffSuspAdvSetoff(src, dest.rcv_dpt_cd()));
			}
			return rcvActIfL;
		}

		/**
		 * 仮受金前受金相殺（相殺）の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @param rcvDptCd 入金部門ＣＤ
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffSuspAdvSetoff(
				RcvActIfCrt_Ins01_RcvActR src, String rcvDptCd) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoffSuspAdvSetoff());
			dest.rcv_dpt_cd(rcvDptCd);
			rcvActIfL.add(dest);

			return rcvActIfL;
		}

		/**
		 * 仮受金その他相殺の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffSuspOth(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoffSuspOth());
			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}

			return rcvActIfL;
		}

		/**
		 * 前受金その他相殺の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffAdvOth(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSetoffAdvOth());
			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}

			return rcvActIfL;
		}

		/**
		 * 売掛金その他勘定相殺の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSetoffOthAr(RcvActIfCrt_Ins01_RcvActR src,
				RcvActIfCrt_Ins01_CndR r) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			// 支払実績登録で売掛金相殺の登録を行った際に作成された入金を使用した売掛金買掛金相殺の場合、
			// 支払実績側の情報を会計に送り、売掛消込の情報は送らない。ただし為替差損益は送信する。
			if (!MAC_DEBT_CRED_ID_TYP.isBSPPL(src.debt_cred_id_typ())
					|| isNull(src.rcv_no())) {

				MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
				writeCommonData(dest, src);
				copy(dest, src, createWriteSetoffOthAr());
				// 為替レート評価替の処理で入金調整時に作成された為替差損益の場合、
				// （上記の場合は参照為替レート評価替履歴ＮＯがＮＵＬＬ以外で連携されてくる）
				// 入金実績、相殺のＩＦデータは作成済なので作成しない。
				if (isNull(r.ref_ar_xrate_rev_his_no())) {
					if (!isAmtZero(dest)) {
						rcvActIfL.add(dest);
					}
				}
			}
			// 為替差損益がある場合
			for (RcvActIfCrt_Ins01_RcvActR raR : getRcvActL(r)) {
				if (!raR.dtl_exc_gain_loss().isZero()) {
					rcvActIfL.addAll(writeExcGainLossForRcvAct(raR, src.dpt_cd()));
				}
			}
			return rcvActIfL;
		}

		/**
		 * 請求残高振替、未請求残高振替の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeSwBillBal(RcvActIfCrt_Ins01_RcvActR src) {

			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			writeCommonData(dest, src);
			copy(dest, src, createWriteSwBillBal());
			if (!isAmtZero(dest)) {
				rcvActIfL.add(dest);
			}

			return rcvActIfL;
		}

		protected boolean isAmtZero(MST_RCV_ACT_IF_R dest) {
			return dest.trd_cur_amt().isZero() && dest.trd_cur_tax_amt().isZero()
					&& dest.base_cur_amt().isZero() && dest.base_cur_tax_amt().isZero();
		}

		// //////////////////// Mapper /////////////////////////////
		
		// 共通データ設定用のMapper
		protected MapWriteCommonData<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteCommonData() {
			return new MapWriteCommonData<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteCommonData<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_ym, RcvActIfCrt_Ins01_RcvActR.$ac_ym);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_dt, RcvActIfCrt_Ins01_RcvActR.$ac_dt);
				addColumnPathMap(MST_RCV_ACT_IF_R.$rcv_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$rcst_cd, RcvActIfCrt_Ins01_RcvActR.$rcst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_cd, RcvActIfCrt_Ins01_RcvActR.$base_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate_cd, RcvActIfCrt_Ins01_RcvActR.$xrate_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate, RcvActIfCrt_Ins01_RcvActR.$xrate);
				addColumnPathMap(MST_RCV_ACT_IF_R.$usr_cd, RcvActIfCrt_Ins01_RcvActR.$usr_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$wrk_no, RcvActIfCrt_Ins01_RcvActR.$wrk_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_typ, RcvActIfCrt_Ins01_RcvActR.$ar_typ);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_rmrks, RcvActIfCrt_Ins01_RcvActR.$trd_rmrks);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_no, RcvActIfCrt_Ins01_RcvActR.$rcv_act_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_seq, RcvActIfCrt_Ins01_RcvActR.$rcv_act_seq);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_rev, RcvActIfCrt_Ins01_RcvActR.$rcv_act_rev);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_d_no, RcvActIfCrt_Ins01_RcvActR.$rcv_act_d_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_d_seq, RcvActIfCrt_Ins01_RcvActR.$rcv_act_d_seq);
			}
			@Override
			public void valueCopy(D dest, S src) {
				if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
					//赤伝ＦＬＧを設定
					dest.can_flg(true);
				}
				dest.rcv_act_if_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTIF));
				dest.ac_slip_typ(getAcSlipTyp(src));
				dest.sub_dpt_cd1(null);
				dest.sub_dpt_cd2(null);
				dest.sub_dpt_cd3(null);
				dest.foreign_flg(MSBGL_ArUtil.isForeign(nvl(src.rcst_cd(), src.bcst_cd())));
				dest.bill_no(null);
				dest.trd_d_rmrks(null);
				dest.sub_char3(null);
				dest.sub_char4(null);
				dest.sub_char5(null);
				dest.sub_char6(null);
				dest.sub_char7(null);
				dest.sub_char8(null);
				dest.sub_char9(null);
				dest.sub_char10(null);
				dest.sub_num1(null);
				dest.sub_num2(null);
				dest.sub_num3(null);
				dest.sub_dt1(null);
				dest.sub_dt2(null);
				dest.sub_dt3(null);
				dest.a_imp_flg(false);
			}
			protected String getAcSlipTyp(S src) {
				return MAC_TRD_PTN_TYP.ac_slip_typ(src.trd_ptn_typ());
			}
		}

		// 為替差損益データ設定用Mapper
		protected MapWriteExcGainLossForRcvAct<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteExcGainLossForRcvAct() {
			return new MapWriteExcGainLossForRcvAct<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteExcGainLossForRcvAct<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate_cd, RcvActIfCrt_Ins01_RcvActR.$xrate_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate, RcvActIfCrt_Ins01_RcvActR.$xrate);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$dtl_exc_gain_loss);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
			}

			@Override
			public void valueCopy(D dest, S src) {
				// MapWriteCommonDataで設定した会計伝票区分、為替レートＣＤ、為替レートを置き換える
				// 為替差損益が0の場合はこの処理は呼ばれないという前提
				if (src.dtl_exc_gain_loss().isPositive()) {
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_LOSS_APPL.value());
					}
					else {
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_GAIN_APPL.value());
					}
				}
				else {
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_GAIN_APPL.value());
					}
					else {
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_LOSS_APPL.value());
					}
				}
				dest.ac_rsn_cd(null);
				dest.so_dpt_cd(null);
				dest.setoff_cd(null);
				dest.base_cur_tax_amt(0);
				dest.trd_cur_amt(0);
				dest.trd_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.sub_char1(null);
				dest.sub_char2(null);
				if(MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(src.trd_ptn_typ())){
					dest.so_dpt_cd(src.bd_dpt_cd());
					dest.setoff_cd(src.debt_cred_id_cd());
				}
				if (MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(src.trd_ptn_typ())) {
					dest.ac_rsn_cd(src.trd_ac_rsn_cd());
				} else {
					// 売上代金入金、その他勘定売掛金相殺の場合
					dest.ac_rsn_cd(src.ar_sttl_ac_rsn_cd1());
				}
			}
		}

		// 売上代金入金(入金)データ設定用のMapper
		protected MapWriteRcvAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteRcvAr() {
			return new MapWriteRcvAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteRcvAr<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.so_dpt_cd(null);
				dest.setoff_cd(null);
				dest.base_cur_tax_amt(0);
				dest.trd_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.sub_char1(null);
				dest.sub_char2(null);
			}
		}

		// 売上代金入金(相殺)、前受金売掛金相殺（相殺）データ設定用のMapper
		protected MapWriteSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoff() {
			return new MapWriteSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoff<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$tax_cd, RcvActIfCrt_Ins01_RcvActR.$tax_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.base_cur_amt(src.base_cur_amt2().subtract(src.base_cur_tax_amt2()));
				dest.trd_cur_amt(src.trd_cur_amt2().subtract(src.trd_cur_tax_amt2()));
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				setSubChar(dest, src);
			}
		}

		// 前受金入金（入金）データ設定用のMapper
		protected MapWriteRcvAdv<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteRcvAdv() {
			return new MapWriteRcvAdv<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteRcvAdv<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.so_dpt_cd(null);
				dest.acst_cd(null);
				dest.setoff_cd(null);
				dest.base_cur_tax_amt(0);
				dest.trd_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.sub_char1(null);
				dest.sub_char2(null);
			}
		}

		// 前受金入金(相殺)データ設定用のMapper
		protected MapWriteRcvAdvSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteRcvAdvSetoff() {
			return new MapWriteRcvAdvSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteRcvAdvSetoff<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$tax_cd, RcvActIfCrt_Ins01_RcvActR.$tax_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.acst_cd(null);
				dest.base_cur_amt(src.base_cur_amt2().subtract(src.base_cur_tax_amt2()));
				dest.trd_cur_amt(src.trd_cur_amt2().subtract(src.trd_cur_tax_amt2()));
				dest.iv_no(null);
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				setSubChar(dest, src);
			}
		}

		// 仮受金入金データ設定用のMapper
		protected MapWriteRcvSusp<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteRcvSusp() {
			return new MapWriteRcvSusp<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteRcvSusp<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.so_dpt_cd(null);
				dest.acst_cd(null);
				dest.setoff_cd(null);
				dest.base_cur_tax_amt(0);
				dest.trd_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.sub_char1(null);
				dest.sub_char2(null);
			}
		}

		// 前受金売掛金相殺(入金)、仮受金売掛金相殺(入金)データ設定用のMapper
		protected MapWriteSetoffAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffAr() {
			return new MapWriteSetoffAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffAr<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$trd_ac_rsn_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);

			}
			@Override
			public void valueCopy(D dest, S src) {
				// 入金部門に仮受金の部門を上書きで設定
				dest.rcv_dpt_cd(getAdvSuspDptCd(src.rcv_no(), src.ac_dt(), src.trd_ptn_typ(), null));
				dest.so_dpt_cd(null);
				dest.setoff_cd(null);
				dest.trd_cur_tax_amt(0);
				dest.base_cur_tax_amt(0);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.tax_cd(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
			}
		}

		// 仮受金前受金相殺(入金)データ設定用のMapper
		protected MapWriteSetoffSuspAdv<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffSuspAdv() {
			return new MapWriteSetoffSuspAdv<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffSuspAdv<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$trd_ac_rsn_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);

			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.so_dpt_cd(getAdvSuspDptCd(src.rcv_no(), src.ac_dt(), src.trd_ptn_typ(), null));
				// 入金部門に仮受金の部門を上書きで設定
				dest.rcv_dpt_cd(dest.so_dpt_cd());
				dest.acst_cd(null);
				dest.setoff_cd(null);
				dest.trd_cur_tax_amt(0);
				dest.base_cur_tax_amt(0);
				dest.iv_no(null);
				dest.tax_cd(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
			}
		}

		// 仮受金前受金相殺（相殺）データ設定用のMapper
		protected MapWriteSetoffSuspAdvSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffSuspAdvSetoff() {
			return new MapWriteSetoffSuspAdvSetoff<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffSuspAdvSetoff<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_tax_amt2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$tax_cd, RcvActIfCrt_Ins01_RcvActR.$tax_cd2);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.acst_cd(null);
				dest.base_cur_amt(src.base_cur_amt2().subtract(src.base_cur_tax_amt2()));
				dest.trd_cur_amt(src.trd_cur_amt2().subtract(src.trd_cur_tax_amt2()));
				dest.iv_no(null);
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				setSubChar(dest, src);
			}
		}

		// 仮受金その他相殺データ設定用のMapper
		protected MapWriteSetoffSuspOth<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffSuspOth() {
			return new MapWriteSetoffSuspOth<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffSuspOth<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd3);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.rcv_dpt_cd(getAdvSuspDptCd(src.getStringNE(MST_RCV_ACT_R.$rcv_no), src.ac_dt(), src.trd_ptn_typ(), src.ar_sttl_ac_rsn_cd3()));
				dest.acst_cd(null);
				dest.trd_cur_tax_amt(0);
				dest.base_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(null);
				setSubChar(dest, src);
			}
		}

		// 前受金その他相殺データ設定用のMapper
		protected MapWriteSetoffAdvOth<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffAdvOth() {
			return new MapWriteSetoffAdvOth<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffAdvOth<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd3);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$bank_ac_cd, RcvActIfCrt_Ins01_RcvActR.$bank_ac_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xfr_psn, RcvActIfCrt_Ins01_RcvActR.$xfr_psn);
				addColumnPathMap(MST_RCV_ACT_IF_R.$note_no, RcvActIfCrt_Ins01_RcvActR.$note_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.ar_dpt_cd(null);
				dest.rcv_dpt_cd(getAdvSuspDptCd(src.getStringNE(MST_RCV_ACT_R.$rcv_no), src.ac_dt(), src.trd_ptn_typ(), src.ar_sttl_ac_rsn_cd3()));
				dest.acst_cd(null);
				dest.trd_cur_tax_amt(0);
				dest.base_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(null);
				setSubChar(dest, src);
			}
		}

		// 売掛金その他勘定相殺データ設定用のMapper
		protected MapWriteSetoffOthAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSetoffOthAr() {
			return new MapWriteSetoffOthAr<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSetoffOthAr<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$ar_sttl_ac_rsn_cd1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$so_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$bd_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$setoff_cd, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_tax_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_tax_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_tax_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$tax_cd, RcvActIfCrt_Ins01_RcvActR.$tax_cd1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$sub_char1, RcvActIfCrt_Ins01_RcvActR.$debt_cred_id_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.base_cur_amt(src.base_cur_amt1().subtract(src.base_cur_tax_amt1()));
				dest.trd_cur_amt(src.trd_cur_amt1().subtract(src.trd_cur_tax_amt1()));
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				setSubChar(dest, src);
			}
		}

		// 請求残高振替、未請求残高振替データ設定用のMapper
		protected MapWriteSwBillBal<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR> createWriteSwBillBal() {
			return new MapWriteSwBillBal<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_RcvActR>();
		}
		public class MapWriteSwBillBal<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_RcvActR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_rsn_cd, RcvActIfCrt_Ins01_RcvActR.$trd_ac_rsn_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_RcvActR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_RcvActR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_RcvActR.$base_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_amt, RcvActIfCrt_Ins01_RcvActR.$trd_cur_amt1);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_RcvActR.$trd_cur_cd);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.trd_cur_tax_amt(0);
				dest.base_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.iv_no(src.iv_no());
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				
				//振替先情報の設定
				setSwToInfo(dest,src);
			}
		}

		/**
		 * 仮受金の場合は仮受金の部門を返す。<BR>
		 * 仮受金相殺で作成された前受金の場合は仮受金の部門を返す。それ以外の前受金の場合は前受金の部門を返す。<BR>
		 * 入金登録の入金ＮＯを渡すことはできない。<BR>
		 * なお、各部門ＣＤは組織変更対応された部門ＣＤに変換される。
		 * 
		 * @param rcvNo 入金ＮＯ（仮受金、前受金）
		 * @param acDt 計上日
		 * @param trdPtnTyp 取引パタン区分
		 * @param acRsnCd 会計理由ＣＤ
		 * @return 部門ＣＤ
		 */
		protected String getAdvSuspDptCd(String rcvNo, MCDate acDt, String trdPtnTyp, String acRsnCd) {
			MST_RCV_ACT_R rcvActR = getSlip(rcvNo);
			String tmpDptCd = null;
			String tmpRcvActNo = null;
			if (MAC_TRD_PTN_TYP.isRCV_SUSP(rcvActR.trd_ptn_typ())) {
				tmpDptCd = rcvActR.dpt_cd();
				tmpRcvActNo = rcvActR.rcv_act_no();
			}
			else {
				MST_RCV_ACT_R preRcvActR = getSlip(rcvActR.rcv_no());
				if (isNull(preRcvActR.dpt_cd())) {
					tmpDptCd = rcvActR.dpt_cd();
					tmpRcvActNo = rcvActR.rcv_act_no();
				}
				else {
					tmpDptCd = preRcvActR.dpt_cd();
					tmpRcvActNo = preRcvActR.rcv_act_no();
				}
			}
			
			return getNewDpt(tmpDptCd, acDt, trdPtnTyp, tmpRcvActNo, acRsnCd);
		}
		
		/**
		 * 組織変更対応の部門取得
		 * @param tmpDptCd 引継元の部門ＣＤ
		 * @param acDt 計上日
		 * @param trdPtnTyp 取引パタン区分
		 * @param rcvActNo 引継元の入金実績ＮＯ
		 * @param acRsnCd 会計理由ＣＤ
		 * @return 部門ＣＤ
		 */
		protected String getNewDpt(String tmpDptCd, MCDate acDt, String trdPtnTyp, String rcvActNo, String acRsnCd) {
			MST_RCV_ACT_R tmpRow = MST_RCV_ACT_R.create();
			tmpRow.addStringColumn("dpt_nm");
			tmpRow.ac_dt(acDt);
			tmpRow.dpt_cd(tmpDptCd);
			
			// 組織変更対応の部門取得
			MAUCL_DptUtil.setDpt(tmpRow, MST_RCV_ACT_R.$dpt_cd, "dpt_nm", MST_RCV_ACT_R.$ac_dt, false);
			
			// 部門名が取得できなかった場合
			if (isNull(tmpRow.getStringNE("dpt_nm"))) {
				// 取引が前受金その他相殺または仮受金その他相殺の場合
				if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp) ||
					MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)) {
					// 会計理由が仕訳対象の場合はエラー
					if (!isAcInvalid(acRsnCd)) {	
						throw new MCAppException(MSBGL0120 ,rcvActNo, tmpDptCd);
					}
					// 会計理由が仕訳対象外の場合は取得できなければ引継元の部門を返す
					return tmpDptCd;
				}
				// 上記以外の取引の場合はエラー
				throw new MCAppException(MSBGL0121 ,rcvActNo, tmpDptCd);
			}
			
			return tmpRow.dpt_cd();
		}
		
		/**
		 * 会計理由が仕訳対象外か判断
		 * @param acRsnCd
		 * @return 仕訳対象外：true/仕訳対象：false
		 */
		protected boolean isAcInvalid(String acRsnCd) {
			MAM_AC_RSN_R acRsnR = MAM_AC_RSN_R.create();
			MAM_AC_RSN_R t = MAM_AC_RSN_R.create("T");
			MCQueryApiBuilder acRsnR_bldr = MCQueryApiBuilder.create(t);
			acRsnR_bldr.setSelect(t.ac_invalid_flg);
			dbSelectKey("MSBGL5090_MAM_AC_RSN_S01", acRsnR, acRsnR_bldr, acRsnCd);
			return acRsnR.ac_invalid_flg();
		}
		protected MST_RCV_ACT_R getSlip(String rcvNo) {
			MCRow r = MCRow.create();
			r.addStringColumn("rcv_no", rcvNo);
			MCList<MST_RCV_ACT_R> retL = MCList.create(MST_RCV_ACT_R.class);
			executeQuery(retL, MSBGL5090_MST_RCV_ACT_S01(), r);
			MST_RCV_ACT_R ret = MST_RCV_ACT_R.create();
			if (!retL.isEmpty()) {
				ret = retL.get(0);
			}
			return ret;
		}

		/**
		 * 振替先情報の設定<br />
		 * 
		 * @param dest 設定先の入金実績ＩＦ
		 * @param src 設定元の入金実績情報
		 */
		protected void setSwToInfo(MST_RCV_ACT_IF_R dest, RcvActIfCrt_Ins01_RcvActR src){
			MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
			executeQuery(rsltL, MSBGL5090_MST_RCV_ACT_D_S02(), src);
			MST_RCV_ACT_D_R r = MST_RCV_ACT_D_R.create();
			if (!rsltL.isEmpty()) {
				r = rsltL.get(0);
			}
			dest.so_dpt_cd(r.ar_dpt_cd());
			dest.setoff_cd(r.acst_cd());
			dest.sub_char1(MAC_DEBT_CRED_ID_TYP.BCST.value());
			dest.sub_char2(r.bcst_cd());
		}

		protected void setSubChar(MST_RCV_ACT_IF_R dest, RcvActIfCrt_Ins01_RcvActR src) {
			int subChar2Len = MST_RCV_ACT_IF_R.sub_char2_META.length();
			if (!isNull(src.debt_cred_nm()) && subChar2Len < src.debt_cred_nm().length() ) {
				dest.sub_char2(src.debt_cred_nm().substring(0, subChar2Len));
			}
			else {
				dest.sub_char2(src.debt_cred_nm());
			}
		}

		/**
		 * 入金実績ＩＦ取得<br />
		 * 
		 * 為替レート評価替履歴、為替差損益をもとに<br>
		 * 入金実績ＩＦ情報を作成して返却する
		 * 
		 * @param r 上り電文
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> getIfDataForXrateRevHis(RcvActIfCrt_Ins01_CndR r) {
			MCList<MST_RCV_ACT_IF_R> xrateRevHisL = MCList.create(MST_RCV_ACT_IF_R.class);
			
			// 為替レート評価替履歴、為替差損益を検索する
			RcvActIfCrt_Ins01_XrateRevHisR xrateRevHisR = RcvActIfCrt_Ins01_XrateRevHisR.create();
			executeQuery(xrateRevHisR, MSBGL5090_MST_AR_XRATE_REV_HIS_S01(), r);
			
			xrateRevHisL.addAll(writeExcGainLossForXrateRevHis(xrateRevHisR));
			
			return xrateRevHisL;
		}

		/**
		 * 為替差損益の設定<br />
		 * 
		 * @param src 設定元の入金実績情報
		 * @return 入金実績ＩＦリスト
		 */
		protected MCList<MST_RCV_ACT_IF_R> writeExcGainLossForXrateRevHis(
				RcvActIfCrt_Ins01_XrateRevHisR src) {
			MCList<MST_RCV_ACT_IF_R> rcvActIfL = MCList.create(MST_RCV_ACT_IF_R.class);			

			MST_RCV_ACT_IF_R dest = MST_RCV_ACT_IF_R.create();
			copy(dest, src, createWriteExcGainLossForXrateRevHis());
			
			rcvActIfL.add(dest);
			
			return rcvActIfL;
		}

		// 為替差損益データ設定用Mapper
		protected MapWriteExcGainLossForXrateRevHis<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_XrateRevHisR> createWriteExcGainLossForXrateRevHis() {
			return new MapWriteExcGainLossForXrateRevHis<MST_RCV_ACT_IF_R, RcvActIfCrt_Ins01_XrateRevHisR>();
		}
		public class MapWriteExcGainLossForXrateRevHis<D extends MST_RCV_ACT_IF_R, S extends RcvActIfCrt_Ins01_XrateRevHisR>
				extends MCRowMapper<D, S> {
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_ym, RcvActIfCrt_Ins01_XrateRevHisR.$ac_ym);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ac_dt, RcvActIfCrt_Ins01_XrateRevHisR.$ac_dt);
				addColumnPathMap(MST_RCV_ACT_IF_R.$act_d_no, RcvActIfCrt_Ins01_XrateRevHisR.$ar_xrate_rev_his_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_dpt_cd, RcvActIfCrt_Ins01_XrateRevHisR.$ar_dpt_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$acst_cd, RcvActIfCrt_Ins01_XrateRevHisR.$acst_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_cd, RcvActIfCrt_Ins01_XrateRevHisR.$base_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$base_cur_amt, RcvActIfCrt_Ins01_XrateRevHisR.$exc_gain_loss);
				addColumnPathMap(MST_RCV_ACT_IF_R.$trd_cur_cd, RcvActIfCrt_Ins01_XrateRevHisR.$trd_cur_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate_cd, RcvActIfCrt_Ins01_XrateRevHisR.$xrate_cd);
				addColumnPathMap(MST_RCV_ACT_IF_R.$xrate, RcvActIfCrt_Ins01_XrateRevHisR.$xrate);
				addColumnPathMap(MST_RCV_ACT_IF_R.$wrk_no, RcvActIfCrt_Ins01_XrateRevHisR.$wrk_no);
				addColumnPathMap(MST_RCV_ACT_IF_R.$ar_typ, RcvActIfCrt_Ins01_XrateRevHisR.$ar_typ);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_act_if_no(getStrSeq(MSC_NUM_SYS_TYP.RCVACTIF));
				dest.act_no(null);
				dest.act_seq(null);
				dest.act_rev(null);
				dest.act_d_seq(1);
				// 為替差損益が0の場合はこの処理は呼ばれないという前提
				if (src.exc_gain_loss().isPositive()) {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_GAIN_REV.value());
				}
				else {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AR_EX_LOSS_REV.value());
				}
				dest.ac_rsn_cd(null);
				dest.rcv_dpt_cd(null);
				dest.so_dpt_cd(null);
				dest.sub_dpt_cd1(null);
				dest.sub_dpt_cd2(null);
				dest.sub_dpt_cd3(null);
				dest.rcst_cd(null);
				dest.setoff_cd(null);
				dest.foreign_flg(MSBGL_ArUtil.isForeign(src.acst_cd()));
				dest.base_cur_tax_amt(0);
				dest.trd_cur_amt(0);
				dest.trd_cur_tax_amt(0);
				dest.tax_cd(null);
				dest.bill_no(null);
				dest.usr_cd(null);
				dest.iv_no(MAC_STR.isNULL_VAL(src.iv_no()) ? null : src.iv_no());
				dest.bank_ac_cd(null);
				dest.xfr_psn(null);
				dest.note_no(null);
				dest.trd_rmrks(null);
				dest.trd_d_rmrks(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
				dest.sub_char3(null);
				dest.sub_char4(null);
				dest.sub_char5(null);
				dest.sub_char6(null);
				dest.sub_char7(null);
				dest.sub_char8(null);
				dest.sub_char9(null);
				dest.sub_char10(null);
				dest.sub_num1(null);
				dest.sub_num2(null);
				dest.sub_num3(null);
				dest.sub_dt1(null);
				dest.sub_dt2(null);
				dest.sub_dt3(null);
			}
		}
	}

	//FMCB CUSTOM END
}