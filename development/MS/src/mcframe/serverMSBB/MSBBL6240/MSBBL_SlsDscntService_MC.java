package mcframe.serverMSBB.MSBBL6240;

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
import mcframe.serverMSBB.MSBBL6240.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBA.MBBAL5010.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBB.MSBBL6010.MSBBL_SlsActService;
import mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_DtlR;
import mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR;
import mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR;
import mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_RsltR;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR;
import mcframe.serverMSBF.MSBFL5210.MSBFL_LotService;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;

import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran; 	
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;	
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;	
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;	

import java.util.HashSet;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsDscntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsDscntService_MC extends MSBBL_SlsDscntService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sls_Dscnt_Chk01オペレーション.<p>
	 *
	 */
	public class Sls_Dscnt_Chk01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_Chk01 {

		/** 
		 * 得意先マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;

		/**
		 * 上り電文の品名を退避する一時カラム名
		 */
		protected static final String _up_itm_nm = "_up_itm_nm";
		protected static final String _up_iv_itm_nm = "_up_iv_itm_nm";

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
			down0().addAll(up0());
			down1().addAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheck() {
			saveAndClearItmNm();
			return super.doServerCheck();
		}

		/**
		 * 品名の退避およびクリア処理
		 * <p>
		 * 	後続のdoSvrChkListLogic処理にて、品目リストロジックから品名（他）が補完されるが<br>
		 * 	すでに値が設定されていた場合、補完処理はキャンセルされるため、上り電文の品名を一時カラムに退避しておき<br>
		 * 	品名をクリアする。<br>
		 * 	諸口品も含め、一旦品目マスタの品名を設定したのち、補完処理(compSubDtl)にて<br>
		 * 	諸口品ＦＬＧがオンの明細は、退避した品名を設定しなおす<br>
		 * </p>
		 */
		protected void saveAndClearItmNm() {

			for (Sls_Dscnt_DtlR r : up1()) {
				r.setStringNE(_up_itm_nm, r.itm_nm());
				r.setStringNE(_up_iv_itm_nm, r.iv_itm_nm());
				r.itm_nm(null);
				r.iv_itm_nm(null);
			}
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得、補完処理
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create();
			MCList<MST_SLS_ACT_D_R> slsActDIOL = MCList.create(MST_SLS_ACT_D_R.class);

			MCMessageList msgL = new MCMessageList();
			MCIndexKey idxKey = up1().createIndex(Sls_Dscnt_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_HdrR hdr : up0()) {

				// ヘッダ伝票とヘッダ紐付けＮＯが同じ明細行を抽出
				MCList<Sls_Dscnt_DtlR> dtlL = up1().subList(idxKey, hdr.hdr_peg_no());

				if (hasErrFlgOn(hdr, dtlL)) {
					continue;
				}

				if (!isNull(hdr.sls_act_no())) {

					// 売上実績ヘッダの排他ロック獲得、更新カウンタチェック
					slsActR = MST_SLS_ACT_R.create();
					dbSelectKeyForUpdateNoWait("MSBBL6240_MST_SLS_ACT_S01", slsActR,
							MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), hdr);

					msgL.addAll(checkUpdCntrNE(hdr, Sls_Dscnt_HdrR.$upd_cntr, slsActR));

					if (!isNull(slsActR)) {
						// 更新前データに対するDAC権限チェック
						slsActR.setAttributes(hdr);
						msgL.addAll(checkWritableDptCdDac(slsActR,
								Sls_Dscnt_HdrR.$sls_dpt_cd));
					}

					if (hasErrFlgOn(hdr, dtlL)) {
						continue;
					}

					// 売上実績明細(+ 売上実績受払)の排他ロック獲得 （更新カウンタチェックは省略）
					slsActDIOL = MCList.create(MST_SLS_ACT_D_R.class);
					MST_SLS_ACT_D_R t1 = MST_SLS_ACT_D_R.create("T");
					MCQueryApiBuilder slsActDIOL_bldr = MCQueryApiBuilder.create(t1);
					MST_SLS_ACT_IO_R tt = MST_SLS_ACT_IO_R.create("T2");
					slsActDIOL_bldr.setSelect(t1.getKeyColumn$());
					slsActDIOL_bldr.addSelect(t1.dlv_slip_d_no);
					slsActDIOL_bldr.addSelect(tt.sls_act_io_no);
					slsActDIOL_bldr.addSelect(tt.sls_act_io_seq);
					slsActDIOL_bldr.addInnerJoin(tt,
							bracket(t1.sls_act_d_no.eq(tt.sls_act_d_no)
									.and(t1.sls_act_d_seq.eq(tt.sls_act_d_seq))));
					slsActDIOL_bldr.setWhere(t1.sls_act_no.eq(bind("sls_act_no"))
							.and(t1.sls_act_seq.eq(bind("sls_act_seq"))), hdr);
					slsActDIOL_bldr.setOrderByAsc(slsActDIOL_bldr.getBaseDbc().getKeyColumn$());
					slsActDIOL_bldr.setLockTable(t1.sls_act_d_no);
					dbSelectForUpdate("MSBBL6240_MST_SLS_ACT_D_S01", slsActDIOL, slsActDIOL_bldr, hdr);

					// トランデータ補完
					compBaseHdr(hdr, slsActR);
					compBaseDtl(dtlL, slsActDIOL);
				}
			}
			return msgL;
		}

		/**
		 * トランザクションデータからの補完処理（ヘッダ）
		 */
		protected void compBaseHdr(Sls_Dscnt_HdrR hdr, MST_SLS_ACT_R dbc) {
			hdr.sls_act_rev(dbc.sls_act_rev());
			hdr.trd_cd(dbc.trd_cd());
			hdr.trd_ptn_typ(dbc.trd_ptn_typ());
			hdr.aprv_flg(dbc.aprv_flg());
			hdr.aprv_no(dbc.aprv_no());
			hdr.aprv_sts_typ(dbc.aprv_sts_typ());
			hdr.dlv_slip_no(dbc.dlv_slip_no());
		}

		/**
		 * トランザクションデータからの補完処理（明細）
		 * <p>
		 * 	売上実績明細と売上実績受払は1:1の関係なので<br>
		 * 	売上実績サービス呼出で必要となる売上実績受払ＮＯを明細の一時カラムに格納する<br>
		 * </p>
		 */
		protected void compBaseDtl(MCList<Sls_Dscnt_DtlR> dtlL,
				MCList<MST_SLS_ACT_D_R> slsActDIOL) {
			if (slsActDIOL.isEmpty()) {
				return;
			}
			String[] keyCols = slsActDIOL.get(0).getKeyColumn();
			MCIndexKey idxKey = slsActDIOL.createIndex(keyCols);
			for (Sls_Dscnt_DtlR r : dtlL) {
				if (isNull(r.sls_act_d_no())) {
					continue;
				}

				MST_SLS_ACT_D_R dbc = slsActDIOL.getFirst(idxKey, r.toArray(keyCols));
				if (!isNull(dbc)) {
					r.sls_act_io_no(dbc.getStringNE(MST_SLS_ACT_IO_R.$sls_act_io_no));
					r.sls_act_io_seq(dbc.getNumberNE(MST_SLS_ACT_IO_R.$sls_act_io_seq));
					r.dlv_slip_d_no(dbc.dlv_slip_d_no());
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 得意先マスタのキャッシュ作成
			crtBpCache(up0());

			// 上り電文の補完
			doComp();
			// 条件付チェック、固有チェック、補完処理など
			msgL.addAll(checkSub());

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey idxKey = up1().createIndex(Sls_Dscnt_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_HdrR hdr : up0()) {

				// 売上都度請求以外、計上日≦請求起算日チェック
				if (!MAC_BILL_CL_TYP.isEACH_SLS(hdr.bill_cl_typ())) {
					msgL.addAll(check(hdr, new String[] {Sls_Dscnt_HdrR.$ac_dt, Sls_Dscnt_HdrR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
				}
				// ヘッダ伝票とヘッダ紐付けＮＯが同じ明細行を抽出
				MCList<Sls_Dscnt_DtlR> dtlL = up1().subList(idxKey, hdr.hdr_peg_no());
				// 明細が1件以上あるかチェック
				msgL.addAll(checkAtLeastOneDtl(hdr, dtlL));
				if (hasErrFlgOn(hdr, dtlL)) {
					continue;
				}

				if(!Arrays.asList(getAvailTrdTyp()).contains(MAC_TRD_PTN_TYP.getNE(hdr.trd_ptn_typ()))) {
					msgL.add(new MCMessage(hdr, null, MSBDL0613, hdr.trd_cd(), createTrdPtnTypErrMsg(), toDispGUIIndex(hdr)));
				}

				// DAC更新権限チェック
				msgL.addAll(checkWritableDptCdDac(hdr, Sls_Dscnt_HdrR.$sls_dpt_cd));

				// 条件付き必須入力チェック
				msgL.addAll(checkReqSub(hdr, dtlL));

				// 存在チェック
				msgL.addAll(checkExistsSub(hdr, dtlL));

				// 承認状況チェック
				// ※承認提供サービスでチェックし、エラーメッセージはメッセージプールに格納される
				if (isAprvTgt(hdr.trd_ptn_typ())) {
					checkAprvSts(hdr, dtlL);
				}

				// 補完処理
				compSubHdr(hdr);
				msgL.addAll(compSubDtl(hdr, dtlL));

				// 表示順の補完
				setDispSeq(dtlL);
			}
			return msgL;
		}

		protected MAC_TRD_PTN_TYP[] getAvailTrdTyp() {
			return new MAC_TRD_PTN_TYP[] {MAC_TRD_PTN_TYP.SLS_DSCNT, MAC_TRD_PTN_TYP.SLS_XTRA};
		}

		protected String createTrdPtnTypErrMsg() {
			StringBuffer bindSB = null;
			for (MAC_TRD_PTN_TYP r : getAvailTrdTyp()) {
				if (null == bindSB) {
					bindSB = new StringBuffer("");
					bindSB.append(r.name());
				}
				else {
					bindSB.append("、");
					bindSB.append(r.name());
				}
			}
			return bindSB.toString();
		}

		/**
		 * 条件付き必須入力チェック
		 * @return
		 */
		protected MCMessageList checkReqSub(Sls_Dscnt_HdrR hdr,
				MCList<Sls_Dscnt_DtlR> dtlL) {

			MCMessageList msgL = new MCMessageList();

			// インボイスＮＯ
			if (hdr.cst_iv_flg()) {
				if (!hdr.num_flg()) {
					// インボイス取引ＦＬＧがオンで自動フラグがオフの場合は必須チェック
					msgL.addAll(check(hdr, Sls_Dscnt_HdrR.$iv_no,
							new FXUCL_RequiredValidater()));
				}
			}

			// 入金予定日
			// インボイス取引ＦＬＧがオン、かつ、請求締処理区分が売上都度請求の場合は必須
			if (hdr.cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(hdr.bill_cl_typ())) {
				msgL.addAll(check(hdr, Sls_Dscnt_HdrR.$rcv_schd_dt,
						new FXUCL_RequiredValidater()));
			}

			// 請求起算日
			// 請求締処理区分が売上都度請求以外の場合、必須
			if (!MAC_BILL_CL_TYP.isEACH_SLS(hdr.bill_cl_typ())) {
				msgL.addAll(check(hdr, Sls_Dscnt_HdrR.$bill_basis_dt,
						new FXUCL_RequiredValidater()));
			}

			// 為替レート
			// 補完後の値でチェックを行う。
			msgL.addAll(check(hdr, Sls_Dscnt_HdrR.$xrate,
					new FXUCL_SmallLargeValidater(MCNumber.ZERO, null)));

			// 納税為替レート
			// 補完後の値でチェックを行う。
			msgL.addAll(check(hdr, Sls_Dscnt_HdrR.$ptax_xrate,
					new FXUCL_SmallLargeValidater(MCNumber.ZERO, null)));

			// 明細のチェック
			for (Sls_Dscnt_DtlR dtlR : dtlL) {
				// 品名
				// 諸口品かつ、非在庫管理品の場合、必須
				if (dtlR.sundry_itm_flg() && !MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
					// 必須チェック用に、退避した品名を元に戻す
					String tmpItmNm = dtlR.itm_nm();
					dtlR.itm_nm(dtlR.getStringNE(_up_itm_nm));

					msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$itm_nm,
							new FXUCL_RequiredValidater()));

					// 再び退避する。
					dtlR.itm_nm(tmpItmNm);
				}

				// 取引単位ＣＤ
				// 補完後の値でチェックを行う。
				msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$trd_unit_cd,
						new FXUCL_RequiredValidater()));

				// 取引単位数量
				// 補完後の値でチェックを行う。
				msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$trd_unit_qty,
						new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$trd_unit_qty,
						new mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater()));

				// 手配ＮＯ１
				// 手配ＮＯ１管理区分が管理する（必須）の場合、必須
				if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno1_mng_typ())) {
					String tmpSno1 = dtlR.sno1();
					dtlR.sno1(MAC_STR.isNULL_VAL(dtlR.sno1()) ? null : dtlR.sno1());

					msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$sno1,
							new FXUCL_RequiredValidater()));

					dtlR.sno1(tmpSno1);
				}

				// 手配ＮＯ２
				// 手配ＮＯ２管理区分が管理する（必須）の場合、必須
				if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno2_mng_typ())) {
					String tmpSno2 = dtlR.sno2();
					dtlR.sno2(MAC_STR.isNULL_VAL(dtlR.sno2()) ? null : dtlR.sno2());

					msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$sno2,
							new FXUCL_RequiredValidater()));

					dtlR.sno2(tmpSno2);
				}

				// 手配ＮＯ３
				// 手配ＮＯ３管理区分が管理する（必須）の場合、必須
				if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno3_mng_typ())) {
					String tmpSno3 = dtlR.sno3();
					dtlR.sno3(MAC_STR.isNULL_VAL(dtlR.sno3()) ? null : dtlR.sno3());

					msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$sno3,
							new FXUCL_RequiredValidater()));

					dtlR.sno3(tmpSno3);
				}

				// 手配ＮＯ４
				// 手配ＮＯ４管理区分が管理する（必須）の場合、必須
				if (MAC_SNO_MNG_TYP.isMNG_REQ(dtlR.sno4_mng_typ())) {
					String tmpSno4 = dtlR.sno4();
					dtlR.sno4(MAC_STR.isNULL_VAL(dtlR.sno4()) ? null : dtlR.sno4());

					msgL.addAll(check(dtlR, Sls_Dscnt_DtlR.$sno4,
							new FXUCL_RequiredValidater()));

					dtlR.sno4(tmpSno4);
				}
			}
			return msgL;

		}

		/**
		 * 存在チェック
		 * <p>
		 * 	リストロジックで対応できない項目の存在チェック
		 * </p>
		 * @param hdr
		 * @param dtlL
		 */
		protected MCMessageList checkExistsSub(Sls_Dscnt_HdrR hdr,
				MCList<Sls_Dscnt_DtlR> dtlL) {

			MCMessageList msgL = new MCMessageList();

			for (Sls_Dscnt_DtlR r : dtlL) {

				// 参照売上実績情報の存在チェック
				if (!isExistsRefSlsAct(r)) {
					msgL.add(new MCMessage(r, Sls_Dscnt_DtlR.$ref_sls_act_no, MSBBL0049,
							r.ref_sls_act_no(), r.ref_sls_act_seq(),
							r.ref_sls_act_d_no(), r.ref_sls_act_d_seq(),
							toDispGUIIndex(r)));
				}
			}

			// ロット存在チェック
			// ※ロット情報サービスでチェックし、エラーメッセージはメッセージプールに格納される
			callLotSrv(dtlL);

			// インボイスＮＯ存在チェック
			if (isExistsIvNo(hdr)) {
				msgL.add(new MCMessage(hdr, Sls_Dscnt_HdrR.$iv_no, MSBBL0290, hdr.iv_no(), toDispGUIIndex(hdr)));
			}
			return msgL;
		}

		/**
		 * 参照売上実績存在チェック
		 * @param r
		 * @return
		 */
		protected boolean isExistsRefSlsAct(Sls_Dscnt_DtlR r) {

			// 参照～項目がすべて未設定の場合はtrueを返す
			if (isNullAnd(r.ref_sls_act_no(), r.ref_sls_act_seq(), r.ref_sls_act_rev(),
					r.ref_sls_act_d_no(), r.ref_sls_act_d_seq())) {
				return true;
			}

			// １つでも欠けていたらfalse
			if (isNullOr(r.ref_sls_act_no(), r.ref_sls_act_seq(), r.ref_sls_act_rev(),
					r.ref_sls_act_d_no(), r.ref_sls_act_d_seq())) {
				return false;
			}

			MCList<MST_SLS_ACT_D_R> selectL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_R t2 = MST_SLS_ACT_R.create("T2");
			selectL_bldr.setSelect(t.sls_act_d_no);
			selectL_bldr.addInnerJoin(t2, bracket( t.sls_act_no.eq(t2.sls_act_no)
					.and(t.sls_act_seq.eq(t2.sls_act_seq))));
			selectL_bldr.addWhereWithAnd(t2.sls_act_no.eq(bind("1")), r.ref_sls_act_no());
			selectL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("1")), r.ref_sls_act_seq());
			selectL_bldr.addWhereWithAnd(t.sls_act_d_no.eq(bind("1")), r.ref_sls_act_d_no());
			selectL_bldr.addWhereWithAnd(t.sls_act_d_seq.eq(bind("1")), r.ref_sls_act_d_seq());
			selectL_bldr.addWhereWithAnd(t2.slip_sts_typ.in( value(MAC_SLIP_STS_TYP.CRT.value()), value(MAC_SLIP_STS_TYP.DIS.value())));
			dbSelect("MSBBL6240_MST_SLS_ACT_D_S02", selectL, selectL_bldr);

			return !selectL.isEmpty();
		}

		/**
		 * 	ロット（サブロット）存在チェック
		 * <p>
		 * 	MSBFL_LotService.Lot_Chk03サービスを呼び出してチェックを行う
		 * </p>
		 * @param dtlL
		 */
		protected void callLotSrv(MCList<Sls_Dscnt_DtlR> dtlL) {

			MCList<Sls_Dscnt_DtlR> chkL = dtlL.createInstance();
			for (Sls_Dscnt_DtlR r : dtlL) {
				if (!isNullVal(r.lot_no()) || !isNullVal(r.sublot_no())) {
					chkL.add(r);
				}
			}

			if (chkL.isEmpty()) {
				return;
			}

			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), chkL, createMap_Lot_Chk03_CndR_Sls_Dscnt_DtlR());
			// エラー時は呼出先でエラーメッセージをメッセージプールに格納してくれている
			ope.exec();

			copyErrFlg(dtlL, ope.down0());
		}

		/*** インボイスＮＯリスト */
		private MCList<MST_IV_NO_R> _ivNoL = null;
		/*** インボイスＮＯリストのインデックスキー */
		private MCIndexKey _ivNoIndexKey = null;

		/***
		 * インボイスＮＯリスト取得
		 * 
		 * @return インボイスＮＯリスト
		 */
		protected MCList<MST_IV_NO_R> getIvNoL() {
			if(_ivNoL == null) {

				_ivNoL = MCList.create(MST_IV_NO_R.class);
				MST_IV_NO_R t = MST_IV_NO_R.create("T");
				MCQueryApiBuilder _ivNoL_bldr = MCQueryApiBuilder.create(t);
				_ivNoL_bldr.setSelect(t.iv_no);
				dbSelectKey("MSBBL6240_MST_IV_NO_S01", _ivNoL, _ivNoL_bldr, up0().groupBy(Sls_Dscnt_HdrR.$iv_no));
				_ivNoIndexKey = _ivNoL.createIndex(MST_IV_NO_R.$iv_no);
			}

			return _ivNoL;
		}

		/***
		 * インボイスＮＯ存在チェック
		 * 
		 * @param hdrR ヘッダレコード
		 * @return 存在有無
		 */
		protected boolean isExistsIvNo(Sls_Dscnt_HdrR hdrR) {
			if (isNull(hdrR.iv_no())) {
				return false;
			}

			if (!isNull(hdrR.sls_act_no())) {
				return false;
			}

			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				return false;
			}

			return !isNull(getIvNoL().getFirst(_ivNoIndexKey, hdrR.iv_no()));
		}
		/**
		 * 承認状況チェック
		 * <p>
		 * 	売上実績ヘッダが承認対象で、承認状況区分が<br>
		 * 	最終承認済または、一次承認済み、かつ承認引戻ＦＬＧがオンの場合は<br>
		 * 	承認提供サービス(Aprv_Chk01)を呼出し<br>
		 * 	承認訂正可否判定を行う
		 * </p>
		 * @return
		 */
		protected void checkAprvSts(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			if (needExecAprvService(hdr)) {
					// 承認提供サービス呼出
					callAprvSrv(hdr, dtlL);
			}
		}

		/**
		 * 承認提供サービス(MBBAL5010.Aprv_Chk01)の呼出<br>
		 */
		protected void callAprvSrv(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			MBBAL_AprvService.Aprv_Chk01 ope = MBBAL_AprvService.crtAprv_Chk01();
			Aprv_Chk01_Rslt1R oUp = ope.up0().createRow();
			copy(oUp, hdr, createMap_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR());

			// 承認金額を設定
			oUp.src_amt1(calcAprvSrcAmt(hdr,
					dtlL.subList(Status.CREATE, Status.MODIFY, Status.NONE)));
			ope.up0().add(oUp);
			ope.exec();
			copyErrFlg(hdr, ope.down0().get(0));
			// 下り電文なし
			// なお、エラー時は呼出先サービスにてメッセージプールに格納される
		}

		/**
		 * ListLogicで補完できない項目を補完する（ヘッダ）
		 */
		protected void compSubHdr(Sls_Dscnt_HdrR hdr) {

			// 計上年月
			hdr.ac_ym(getAcYm(hdr.ac_dt()));

			// インボイスＮＯ
			// 値がnullの場合はnull文字に補完する (インボイス取引対象外、自動ＦＬＧがオンの場合を想定）
			if (isNull(hdr.iv_no())) {
				hdr.iv_no(MAC_STR.NULL_VAL.value());
			}

			// 得意先マスタの属性情報の補完（ListLogicで設定できない属性情報を設定する）
			MAM_BP_R cst = getBpCache(hdr.cst_cd());
			// 請求先の取得
			MAM_BP_R acst = getBpCache(cst.acst_cd());
			hdr.bcst_cd(acst.bcst_cd());
			// 与信管理先の取得
			MAM_BP_R bcst = getBpCache(acst.bcst_cd());
			hdr.cred_cd(bcst.ar_cred_cd());

			// 請求起算日
			// インボイス取引の場合は計上日を設定
			// 上記以外で未指定時は、計上日を設定
			if (hdr.cst_iv_flg()) {
				hdr.bill_basis_dt(hdr.ac_dt());
			}
			else {
				if (isNull(hdr.bill_basis_dt())) {
					hdr.bill_basis_dt(hdr.ac_dt());
				}
			}

			// 基準通貨ＣＤ
			hdr.base_cur_cd(getCo().base_cur_cd());

			// 為替レートＣＤ
			hdr.xrate_cd(getCo().sls_xrate_cd());

			// 為替レート
			// 未指定時は為替レートマスタより取得
			if (isNull(hdr.xrate())) {
				hdr.xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_SLS_XRATE", "01"),
						MAPA_XCHNG$F_GET_SLS_XRATE( bind("trd_cur_cd"), bind("sls_dt")), hdr));
			}

			// 納税通貨ＣＤ
			hdr.ptax_cur_cd(getCo().ptax_cur_cd());

			// 納税為替レート
			// 未指定時は為替レートマスタより取得
			if (isNull(hdr.ptax_xrate()) && !isNull(hdr.ptax_cur_cd())) {
				hdr.ptax_xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
						MAPA_XCHNG$F_GET_XRATE( bind("trd_cur_cd"), bind("ptax_cur_cd"), bind("xrate_cd"), bind("sls_dt")), hdr));
			}
		}

		/**
		 * ListLogicで補完できない項目を補完する（明細）
		 */
		protected MCMessageList compSubDtl(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = getSundryItm(dtlL);
			
			MCIndexKey idxkey = sundryItmL.createIndex(MAM_SUNDRY_ITM_R.$itm_cd,
					MAM_SUNDRY_ITM_R.$itm_sub1,
					MAM_SUNDRY_ITM_R.$itm_sub2,
					MAM_SUNDRY_ITM_R.$itm_sub3,
					MAM_SUNDRY_ITM_R.$sno1,
					MAM_SUNDRY_ITM_R.$sno2,
					MAM_SUNDRY_ITM_R.$sno3,
					MAM_SUNDRY_ITM_R.$sno4);
			
			MAM_SUNDRY_ITM_R sundryItmR = null;

			for (Sls_Dscnt_DtlR r : dtlL) {

				// 諸口品ＦＬＧがオンの品目は、退避した一時カラムから上り電文の品名を設定しなおす
				if (r.sundry_itm_flg()) {
					
					if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						
						sundryItmR = sundryItmL.getFirst(idxkey, 
								r.itm_cd(), 
								r.itm_sub1(), 
								r.itm_sub2(), 
								r.itm_sub3(), 
								r.sno1(),
								r.sno2(), 
								r.sno3(), 
								r.sno4());
						
						if (!isNull(sundryItmR) && !sundryItmR.isEmpty()) {
							r.itm_nm(sundryItmR.itm_nm());
						}
						else {
							msgL.add(new MCMessage(r,
												   Sls_Dscnt_DtlR.$itm_cd,
												   MSBBL0251,
												   toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
												   toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
												   toDispGUIIndex(r)));
						}
					}
					else {
						r.itm_nm(r.getString(_up_itm_nm));
					}
					
					r.iv_itm_nm(r.getString(_up_iv_itm_nm));	
				}
				else {
					r.itm_nm(null);
					r.iv_itm_nm(null);
				}

				// 基準単位数量の計算
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_std_qty(),
						r.trd_unit_conv_qty(), r.base_unit_dec_place(),
						r.base_unit_rnd_typ()));
			}
			return msgL;
		}
		
		/**
		 * 諸口品マスタを取得する。
		 * @param dtlL 売上値引明細
		 * @return 諸口品マスタ
		 */
		protected MCList<MAM_SUNDRY_ITM_R> getSundryItm(MCList<Sls_Dscnt_DtlR> dtlL) {
			
			MCList<MAM_SUNDRY_ITM_R> bindL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			MCIndexKey idxkey = dtlL.createIndex(Sls_Dscnt_DtlR.$sundry_itm_flg, Sls_Dscnt_DtlR.$stk_mng_typ);
			
			setAll(bindL, dtlL.subList(idxkey, true, MAC_STK_MNG_TYP.MNG.value()), createMap_MAM_SUNDRY_ITM_R_Sls_Dscnt_DtlR());
			
			MCList<MAM_SUNDRY_ITM_R> sundryItmL = MCList.create(MAM_SUNDRY_ITM_R.class);
			
			if (!bindL.isEmpty()) {
				MCQueryApiBuilder sundryItmL_bldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));
				sundryItmL_bldr.setSelectAll();
				dbSelectKey("MSBBL6240_MAM_SUNDRY_ITM_S01", sundryItmL, sundryItmL_bldr, bindL);
			}
			
			return sundryItmL;
		}

		/**
		 * 取引先マスタの取得
		 * @param cst_cd
		 * @return
		 */
		protected MAM_BP_R getBpCache(String cst_cd) {
			return _cacheBp.get(cst_cd);
		}

		protected void crtBpCache(MCList<Sls_Dscnt_HdrR> dtlL) {
			_cacheBp = null;
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.bp_cd);
			dbc_bldr.addSelect(t.bcst_cd);
			dbc_bldr.addSelect(t.acst_cd);
			dbc_bldr.addSelect(t.ar_cred_cd);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, dtlL, Sls_Dscnt_HdrR.$cst_cd);

		}

		protected Map_Lot_Chk03_CndR_Sls_Dscnt_DtlR<Lot_Chk03_CndR, Sls_Dscnt_DtlR> createMap_Lot_Chk03_CndR_Sls_Dscnt_DtlR() {
			return new Map_Lot_Chk03_CndR_Sls_Dscnt_DtlR<Lot_Chk03_CndR, Sls_Dscnt_DtlR>();
		}

		public class Map_Lot_Chk03_CndR_Sls_Dscnt_DtlR<D extends Lot_Chk03_CndR, S extends Sls_Dscnt_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Sls_Dscnt_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Sls_Dscnt_DtlR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Sls_Dscnt_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Sls_Dscnt_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Sls_Dscnt_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Sls_Dscnt_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Sls_Dscnt_DtlR.$sublot_no);
			}
		}

		/**
		 * 	引数の文字列がnullまたはNULL文字か判定する
		 * @param str
		 * @return
		 */
		protected boolean isNullVal(String str) {
			if (isNull(str) || MAC_STR.isNULL_VAL(str)) {
				return true;
			}
			return false;
		}
		/***
		 * 補完処理
		 */
		protected void doComp() {
			MCIndexKey indexKey = up1().createIndex(Sls_Dscnt_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_HdrR hdrR : up0()) {
				// ヘッダの補完
				doHdrComp(hdrR);

				// 明細の補完
				up1().subList(indexKey, hdrR.hdr_peg_no()).forEach(dtlR -> doDtlComp(hdrR, dtlR));
			}
		}

		/***
		 * ヘッダの補完処理
		 */
		protected void doHdrComp(Sls_Dscnt_HdrR hdrR) {
			// インボイスＮＯ
			if (!isNull(hdrR.cst_cd()) && hdrR.cst_iv_flg() && !hdrR.num_flg()) {
				// 未編集
			}
			else {
				hdrR.iv_no(null);
			}

			// 対応インボイスＮＯ
			// 自動発番
			if (!isNull(hdrR.cst_cd()) && hdrR.cst_iv_flg()) {
				// 未編集
			}
			else {
				hdrR.ref_iv_no(null);
				hdrR.num_flg(false);
			}

			// 入金予定日
			if (!isNull(hdrR.cst_cd()) && hdrR.cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {
				// 未編集
			}
			else {
				hdrR.rcv_schd_dt(null);
			}

			// 請求起算日
			if (MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {
				hdrR.bill_basis_dt(null);
			}

			// 為替レート
			if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
				hdrR.xrate(null);
			}

			// 納税為替レート
			if (isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd())) {
				hdrR.ptax_xrate(null);
			}
		}

		/***
		 * 明細の補完処理
		 */
		protected void doDtlComp(Sls_Dscnt_HdrR hdrR, Sls_Dscnt_DtlR dtlR) {
			// インボイス表記用品名
			if (!isNull(hdrR.cst_cd()) && hdrR.cst_iv_flg()) {
				// 未編集
			}
			else {
				dtlR.iv_itm_nm(null);
			}

			// 取引単位ＣＤ
			// 取引単位数量
			if (dtlR.dscnt_itm_flg()) {
				dtlR.trd_unit_cd(dtlR.base_unit_cd());
				dtlR.trd_unit_qty(MCNumber.ONE);
				dtlR.trd_unit_std_qty(MCNumber.ONE);
				dtlR.trd_unit_conv_qty(MCNumber.ONE);
				dtlR.pack_flg(true);
			}

			// 手配ＮＯ１
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno1_mng_typ())) {
				dtlR.sno1(MAC_STR.NULL_VAL.value());
			}

			// 手配ＮＯ２
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno2_mng_typ())) {
				dtlR.sno2(MAC_STR.NULL_VAL.value());
			}

			// 手配ＮＯ３
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno3_mng_typ())) {
				dtlR.sno3(MAC_STR.NULL_VAL.value());
			}

			// 手配ＮＯ４
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno4_mng_typ())) {
				dtlR.sno4(MAC_STR.NULL_VAL.value());
			}

			// 仕向先ＣＤ２
			if (isNull(dtlR.dest_cd1())) {
				dtlR.dest_cd2(null);
			}

			// 仕向先ＣＤ３
			if (isNull(dtlR.dest_cd2())) {
				dtlR.dest_cd3(null);
			}

			// 売上実績情報
			setRefSlsAct(dtlR);

			// ロットＮＯ
			if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
				dtlR.lot_no(MAC_STR.NULL_VAL.value());
			}

			// サブロットＮＯ
			if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.sublot_mng_typ())) {
				dtlR.sublot_no(MAC_STR.NULL_VAL.value());
			}

			// 源泉税率
			if (!isNull(hdrR.trd_cur_cd()) && isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd()) && 
					(isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
				// 未編集
			}
			else {
				dtlR.wtax_rate(null);
			}

			// 源泉税額
			if (isNull(dtlR.wtax_rate())) {
				dtlR.wtax_amt(null);
			}
			else {
				dtlR.wtax_amt(getWtaxAmt(dtlR.trd_cur_upri(), dtlR.trd_unit_qty(), 
						dtlR.wtax_rate(), hdrR.amt_dec_place(), hdrR.sls_amt_rnd_typ()));
			}
		}

		/***
		 * 売上実績情報設定
		 * 
		 * @param dtlR 明細レコード
		 */
		protected void setRefSlsAct(Sls_Dscnt_DtlR dtlR) {
			// 参照売上実績ＮＯ、参照売上実績明細ＮＯが未設定の場合、値をクリア
			if (isNullOr(dtlR.ref_sls_act_no(), dtlR.ref_sls_act_d_no())) {
				dtlR.ref_sls_act_seq(null);
				dtlR.ref_sls_act_rev(null);
				dtlR.ref_sls_act_d_seq(null);
				return;
			}

			if (!isNullOr(dtlR.ref_sls_act_seq(), dtlR.ref_sls_act_rev(), dtlR.ref_sls_act_d_seq())) {
				return;
			}

			// 参照売上実績連番、参照売上実績改訂番号、参照売上実績明細連番が未設定の場合、ＤＢ値で補完
			MCList<MST_SLS_ACT_D_R> refSlsActdDL = 
					getRefSlsActDL().subList(_refSlsActDIndexKey, dtlR.ref_sls_act_no(), dtlR.ref_sls_act_d_no());
			if (!refSlsActdDL.isEmpty()) {
				refSlsActdDL.sort(SortType.DESC, MST_SLS_ACT_D_R.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				MST_SLS_ACT_D_R srcR = refSlsActdDL.get(0);
				dtlR.ref_sls_act_seq(srcR.sls_act_seq());
				dtlR.ref_sls_act_rev(srcR.getNumberNE(MST_SLS_ACT_R.$sls_act_rev));
				dtlR.ref_sls_act_d_seq(srcR.sls_act_d_seq());
			}
		}

		/*** 参照売上実績明細リスト */
		private MCList<MST_SLS_ACT_D_R> _refSlsActdDL = null;
		/*** 参照売上実績明細リストのインデックスキー */
		private MCIndexKey _refSlsActDIndexKey = null;

		/***
		 * 参照売上実績明細リス取得
		 * 
		 * @return 参照売上実績明細リスト
		 */
		protected MCList<MST_SLS_ACT_D_R> getRefSlsActDL() {
			if(_refSlsActdDL == null) {
				// ワークテーブル登録
				MCList<MST_SLS_ACT_R> wkDbc = MCList.create(MST_SLS_ACT_R.class);
				up1().groupBy(Sls_Dscnt_DtlR.$ref_sls_act_no).forEach(r -> {
					if (!isNull(r.ref_sls_act_no())) {
						MST_SLS_ACT_R tmpR = wkDbc.createRow();
						tmpR.sls_act_no(r.ref_sls_act_no());
						wkDbc.add(tmpR);
					}
				});
				MCQueryApiBuilder wkDbc_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T"));
				dbWkDelete("MSBBL6240_MSW_SLS_ACT_D01", wkDbc_bldr.getBaseDbc());
				dbWkInsert("MSBBL6240_MSW_SLS_ACT_I01", wkDbc, wkDbc_bldr.getBaseDbc());
				
				_refSlsActdDL = MCList.create(MST_SLS_ACT_D_R.class);
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder refSlsActdDL_bldr = MCQueryApiBuilder.create(t2);
				MSW_SLS_ACT_KEY_R w = MSW_SLS_ACT_KEY_R.create("W");
				MST_SLS_ACT_R tt = MST_SLS_ACT_R.create("T2");
				_refSlsActdDL.addNumberColumn(MST_SLS_ACT_R.$sls_act_rev);
				refSlsActdDL_bldr.setSelect(t2.sls_act_d_no, t2.sls_act_d_seq, t2.sls_act_no, t2.sls_act_seq);
				refSlsActdDL_bldr.addSelect(tt.sls_act_rev);
				refSlsActdDL_bldr.addInnerJoin(w, bracket( t2.sls_act_no.eq(w.sls_act_no)));
				refSlsActdDL_bldr.addInnerJoin(tt, bracket( t2.sls_act_no.eq(tt.sls_act_no)
						.and(t2.sls_act_seq.eq(tt.sls_act_seq))));
				dbSelect("MSBBL6240_MST_SLS_ACT_D_S03", _refSlsActdDL, refSlsActdDL_bldr);
				_refSlsActDIndexKey = _refSlsActdDL.createIndex(MST_SLS_ACT_D_R.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_d_no);
			}

			return _refSlsActdDL;
		}

		/***
		 * 源泉税額取得
		 * 
		 * @param upri 取引通貨単価
		 * @param qty 取引単位数量
		 * @param rate 源泉税率
		 * @param decPlace 小数部有効桁数
		 * @param rndTyp 金額端数処理区分
		 * @return 源泉税額
		 */
		protected MCNumber getWtaxAmt(MCNumber upri, MCNumber qty, MCNumber rate, MCNumber decPlace, String rndTyp) {
			// 金額取得
			MCNumber amt = getAmt(upri, qty, decPlace, rndTyp);

			// 税額取得
			return getTaxAmt(amt, rate, decPlace, getCo().wtax_rnd_typ());
		}
	}

	/**
	 * Sls_Dscnt_Chk02オペレーション.<p>
	 *
	 */
	public class Sls_Dscnt_Chk02 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_Chk02 {

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
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			for (Sls_Dscnt_DelR hdr : up0()) {

				// 売上実績ヘッダの排他ロック獲得、更新カウンタチェック
				MST_SLS_ACT_R slsActR = MST_SLS_ACT_R.create();
				dbSelectKeyForUpdateNoWait("MSBBL6240_MST_SLS_ACT_S02", slsActR,
						MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T")), hdr);
				msgL.addAll(checkUpdCntrNE(hdr, Sls_Dscnt_HdrR.$upd_cntr, slsActR));
				if (!isNull(hdr)) {
					// 更新前データに対するDAC権限チェック
					slsActR.setAttributes(hdr);
					msgL.addAll(checkWritableDptCdDac(slsActR, Sls_Dscnt_HdrR.$sls_dpt_cd));
				}

				compBase(hdr, slsActR);

				// 売上実績明細の排他ロック獲得と明細行数チェック（念のため）
				MCList<MST_SLS_ACT_D_R> dbcSlsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder dbcSlsActDL_bldr = MCQueryApiBuilder.create(t2);
				dbcSlsActDL_bldr.setWhere(t2.sls_act_no.eq(bind("1")), hdr.sls_act_no());
				dbcSlsActDL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("1")), hdr.sls_act_seq());
				dbSelectForUpdate("MSBBL6240_MST_SLS_ACT_D_S04", dbcSlsActDL, dbcSlsActDL_bldr);

				// 明細が1件以上あるかチェック
				msgL.addAll(checkAtLeastOneDtl(slsActR, dbcSlsActDL));

			}
			return msgL;
		}

		/**
		 * トラン情報の補完
		 * @param hdr
		 */
		protected void compBase(Sls_Dscnt_DelR hdr, MST_SLS_ACT_R dbc) {
			hdr.sls_act_rev(dbc.sls_act_rev());
			hdr.trd_cd(dbc.trd_cd());
			hdr.trd_ptn_typ(dbc.trd_ptn_typ());
			hdr.dlv_slip_no(dbc.dlv_slip_no());
			hdr.aprv_flg(dbc.aprv_flg());
			hdr.aprv_no(dbc.aprv_no());
			hdr.cst_cd(dbc.cst_cd());
			hdr.trd_cur_cd(dbc.trd_cur_cd());
			hdr.slip_sts_typ(dbc.slip_sts_typ());

		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (hasErr()) {
				return msgL;
			}

			// 承認状況チェック
			checkAprvSts();

			msgL.addAll(checkExists());
			return msgL;
		}

		/**
		 * 承認状況チェック
		 * <p>
		 * 	売上実績ヘッダが承認対象の場合は<br>
		 * 	承認提供サービス(Aprv_Chk04)を呼出し<br>
		 * 	承認取消可否判定を行う
		 * </p>
		 * @return
		 */
		protected MCMessageList checkAprvSts() {
			MCMessageList msgL = new MCMessageList();

			for (Sls_Dscnt_DelR r : up0()) {
				if (r.aprv_flg()) {
					// 承認提供サービス呼出
					callAprvSrv(r);
				}
			}
			return msgL;
		}

		/**
		 * 承認提供サービス(MBBAL5010.Aprv_Chk04)の呼出<br>
		 */
		protected void callAprvSrv(Sls_Dscnt_DelR hdr) {

			MBBAL_AprvService.Aprv_Chk04 ope = MBBAL_AprvService.crtAprv_Chk04();
			Aprv_Chk04_Rslt1R oUp = ope.up0().createRow();
			oUp.aprv_no(hdr.aprv_no());
			oUp.peg_no(hdr.peg_no());
			oUp.setAttributes(hdr);
			ope.up0().add(oUp);
			ope.exec();

			//　エラー時は呼出先サービスにてメッセージプールに格納される
			copyErrFlg(hdr, ope.down0().get(0));
		}
		protected MCMessageList checkExists() {
			MCMessageList msgL = new MCMessageList();

			MCList<Sls_Dscnt_DelR> noErrL = up0().subList(Sls_Dscnt_DelR.$err_flg, false);
			for (Sls_Dscnt_DelR r : noErrL) {
				if (!MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), MST_SLS_ACT_R.create("T").tableName(), 
							new String [] {MST_SLS_ACT_R.$sls_act_no, MST_SLS_ACT_R.$sls_act_seq}, 
							new Comparable[] {r.sls_act_no(), r.sls_act_seq()}, r));
				}
			}

			return msgL;
		}
	}

	/**
	 * Sls_Dscnt_Ins01オペレーション.<p>
	 *
	 */
	public class Sls_Dscnt_Ins01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 値引登録画面呼出時は1伝票分だが、業務データ取込時はN件分の伝票がリストで渡されるため、ループ処理で伝票単位で処理を行う
			MCIndexKey idxKey = up1().createIndex(Sls_Dscnt_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_HdrR hdr : up0()) {

				// ヘッダ伝票とヘッダ紐付けＮＯが同じ明細行を抽出
				MCList<Sls_Dscnt_DtlR> dtlL = up1().subList(idxKey, hdr.hdr_peg_no());

				// 売上実績ＮＯの発番
				hdr.sls_act_no(getSlsActNo(hdr));

				// 承認提供サービスの呼出
				if (isAprvTgt(hdr.trd_ptn_typ())) {
					callAprvSrv(hdr, dtlL);
				}

				// 売上実績サービスの呼出
				callSlsActRegSrv(hdr, dtlL);

				// 受払実績サービスの呼出
				callIoActSrv();
				
				// 承認情報を下り電文に設定
				setAprvDown(hdr);

			}
		}

		// 売上実績サービスの呼出
		protected void callSlsActRegSrv(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			SlsAct_Upd01_HdrR up0 = ope.up0().createRow();
			copy(up0, hdr, up2(), createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR());
			ope.up0().add(up0);
			addAll(ope.up1(), dtlL, createMap_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR());
			addAll(ope.up2(), dtlL, createMap_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR());
			ope.up3().indiv_prnt_flg(hdr.indiv_prnt_flg());
			ope.exec();

			// 下り電文のセット
			// 売上実績サービスにて伝票が分割される場合があるので注意
			addAll(down0(), ope.down0(),
					createMap_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR());
			down1().addAll(crtSls_Dscnt_Rslt_Dtl(ope.down0()));
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSrv() {
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}
		
		/**
		 * 承認情報を下り電文へ設定する。
		 * @param hdr
		 */
		protected void setAprvDown(Sls_Dscnt_HdrR hdr) {

			MCList<Sls_Dscnt_Rslt_HdrR> downL = down0().subList(Sls_Dscnt_HdrR.$sls_act_no, hdr.sls_act_no());
			
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_flg, hdr.aprv_flg());
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_no, hdr.aprv_no());
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_sts_typ, hdr.aprv_sts_typ());
		}

		/**
		 * 売上実績ＮＯを発番する
		 * @param hdr
		 * @return
		 */
		protected String getSlsActNo(Sls_Dscnt_HdrR hdr) {
			ElmArgsR elm = ElmArgsR.create();
			elm.dpt_cd(hdr.sls_dpt_cd());
			elm.co_cd(getCo().co_cd());
			elm.bp_cd(hdr.cst_cd());
			elm.wg_cd(hdr.wg_cd());
			elm.trd_cd(hdr.trd_cd());
			elm.dt(hdr.sls_dt());
			return getNum(MAC_NUM_BIZ_TYP.SLSACT, elm);
		}

		/**
		 * 承認提供サービス(MBBAL5010.Aprv_Upd01)の呼出<br>
		 */
		protected void callAprvSrv(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			MBBAL_AprvService.Aprv_Upd01 ope = MBBAL_AprvService.crtAprv_Upd01();
			Aprv_Chk01_Rslt1R oUp = ope.up0().createRow();
			copy(oUp, hdr, createMap_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR());

			// 承認金額を設定
			oUp.src_amt1(calcAprvSrcAmt(hdr,
					dtlL.subList(Status.CREATE, Status.MODIFY, Status.NONE)));
			ope.up0().add(oUp);

			ope.exec();

			Aprv_Upd01_Dtl1R oDown0 = ope.down0().get(0);
			// 承認関連情報を上り電文に設定
			if (oDown0.aprv_flg()) {
				hdr.aprv_flg(true);
				hdr.aprv_no(oDown0.aprv_no());
				hdr.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
			}
			else {
				hdr.aprv_flg(false);
			}
		}

		protected Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<SlsAct_Upd01_HdrR,Sls_Dscnt_HdrR, Sls_Dscnt_CndR> createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR() {
			return new Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<SlsAct_Upd01_HdrR, Sls_Dscnt_HdrR, Sls_Dscnt_CndR>();
		}

		public class Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<D extends SlsAct_Upd01_HdrR, S extends Sls_Dscnt_HdrR, W extends Sls_Dscnt_CndR>  
			extends MAUCC_RowMapperWith<D,S,W>{
			protected W _sls_Dscnt_CndR;
			@Override
			public void setWith(W _sls_Dscnt_CndR){
				this._sls_Dscnt_CndR = _sls_Dscnt_CndR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no,
						Sls_Dscnt_HdrR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no,
						Sls_Dscnt_HdrR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Sls_Dscnt_HdrR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ,
						Sls_Dscnt_HdrR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Sls_Dscnt_HdrR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd,
						Sls_Dscnt_HdrR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd,
						Sls_Dscnt_HdrR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Sls_Dscnt_HdrR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Sls_Dscnt_HdrR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Sls_Dscnt_HdrR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Sls_Dscnt_HdrR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, Sls_Dscnt_HdrR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Sls_Dscnt_HdrR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1,
						Sls_Dscnt_HdrR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Sls_Dscnt_HdrR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2,
						Sls_Dscnt_HdrR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Sls_Dscnt_HdrR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3,
						Sls_Dscnt_HdrR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt,
						Sls_Dscnt_HdrR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt,
						Sls_Dscnt_HdrR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Sls_Dscnt_HdrR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Sls_Dscnt_HdrR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Sls_Dscnt_HdrR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Sls_Dscnt_HdrR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Sls_Dscnt_HdrR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd,
						Sls_Dscnt_HdrR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd,
						Sls_Dscnt_HdrR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Sls_Dscnt_HdrR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Sls_Dscnt_HdrR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd,
						Sls_Dscnt_HdrR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate,
						Sls_Dscnt_HdrR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Sls_Dscnt_HdrR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks,
						Sls_Dscnt_HdrR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, Sls_Dscnt_HdrR.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, Sls_Dscnt_HdrR.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ,
						Sls_Dscnt_HdrR.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Sls_Dscnt_HdrR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Sls_Dscnt_HdrR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Sls_Dscnt_HdrR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
						Sls_Dscnt_HdrR.$sls_slip_out_flg);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				if (_sls_Dscnt_CndR.bulk_imp_flg()) {
					dest.amt_calc_flg(true);
				}
				else {
					dest.amt_calc_flg(false);
				}
			}
		}

		protected Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<SlsAct_Upd01_DtlR, Sls_Dscnt_DtlR> createMap_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<SlsAct_Upd01_DtlR, Sls_Dscnt_DtlR>();
		}

		public class Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<D extends SlsAct_Upd01_DtlR, S extends Sls_Dscnt_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no,
						Sls_Dscnt_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no,
						Sls_Dscnt_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Sls_Dscnt_DtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Sls_Dscnt_DtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Sls_Dscnt_DtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Sls_Dscnt_DtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Sls_Dscnt_DtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Sls_Dscnt_DtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Sls_Dscnt_DtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Sls_Dscnt_DtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Sls_Dscnt_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Sls_Dscnt_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Sls_Dscnt_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Sls_Dscnt_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Sls_Dscnt_DtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Sls_Dscnt_DtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Sls_Dscnt_DtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Sls_Dscnt_DtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Sls_Dscnt_DtlR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Sls_Dscnt_DtlR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Sls_Dscnt_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Sls_Dscnt_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd,
						Sls_Dscnt_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty,
						Sls_Dscnt_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd,
						Sls_Dscnt_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty,
						Sls_Dscnt_DtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri,
						Sls_Dscnt_DtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Sls_Dscnt_DtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Sls_Dscnt_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Sls_Dscnt_DtlR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Sls_Dscnt_DtlR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Sls_Dscnt_DtlR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Sls_Dscnt_DtlR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Sls_Dscnt_DtlR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Sls_Dscnt_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Sls_Dscnt_DtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg,
						Sls_Dscnt_DtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, Sls_Dscnt_DtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, Sls_Dscnt_DtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times,
						Sls_Dscnt_DtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ,
						Sls_Dscnt_DtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg,
						Sls_Dscnt_DtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd,
						Sls_Dscnt_DtlR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no,
						Sls_Dscnt_DtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd,
						Sls_Dscnt_DtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm,
						Sls_Dscnt_DtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks,
						Sls_Dscnt_DtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks,
						Sls_Dscnt_DtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Sls_Dscnt_DtlR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Sls_Dscnt_DtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, Sls_Dscnt_DtlR.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Sls_Dscnt_DtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Sls_Dscnt_DtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Sls_Dscnt_DtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Sls_Dscnt_DtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Sls_Dscnt_DtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no,
						Sls_Dscnt_DtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq,
						Sls_Dscnt_DtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no,
						Sls_Dscnt_DtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq,
						Sls_Dscnt_DtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_sls_ac_dt,
						Sls_Dscnt_DtlR.$base_sls_ac_dt);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.pri_prnt_flg(true);
			}
		}

		protected Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<SlsAct_Upd01_IoR, Sls_Dscnt_DtlR> createMap_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR() {
			return new Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<SlsAct_Upd01_IoR, Sls_Dscnt_DtlR>();
		}

		public class Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<D extends SlsAct_Upd01_IoR, S extends Sls_Dscnt_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Sls_Dscnt_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Sls_Dscnt_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Sls_Dscnt_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Sls_Dscnt_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Sls_Dscnt_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Sls_Dscnt_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Sls_Dscnt_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Sls_Dscnt_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd,
						Sls_Dscnt_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty,
						Sls_Dscnt_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd,
						Sls_Dscnt_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty,
						Sls_Dscnt_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_peg_no(MCNumber.ONE);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.pack_unit_cd(src.pack_flg() ? src.trd_unit_cd() : src.base_unit_cd());
				dest.pack_unit_qty(src.pack_flg() ? src.trd_unit_qty() : src
						.base_unit_qty());
			}
		}

		protected Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<Sls_Dscnt_Rslt_HdrR, SlsAct_Upd01_RsltR> createMap_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR() {
			return new Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<Sls_Dscnt_Rslt_HdrR, SlsAct_Upd01_RsltR>();
		}

		public class Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<D extends Sls_Dscnt_Rslt_HdrR, S extends SlsAct_Upd01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$hdr_peg_no,
						SlsAct_Upd01_RsltR.$hdr_peg_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_no,
						SlsAct_Upd01_RsltR.$sls_act_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_seq,
						SlsAct_Upd01_RsltR.$sls_act_seq);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_rev,
						SlsAct_Upd01_RsltR.$sls_act_rev);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$dlv_slip_no,
						SlsAct_Upd01_RsltR.$dlv_slip_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$iv_no, SlsAct_Upd01_RsltR.$iv_no);
			}
		}
	}

	/**
	 * Sls_Dscnt_Upd01オペレーション.<p>
	 *
	 */
	public class Sls_Dscnt_Upd01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 値引登録画面呼出時は1伝票分だが、業務データ取込時はN件分の伝票がリストで渡されるため、ループ処理で伝票単位で処理を行う
			MCIndexKey idxKey = up1().createIndex(Sls_Dscnt_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_HdrR hdr : up0()) {

				// ヘッダ伝票とヘッダ紐付けＮＯが同じ明細行を抽出
				MCList<Sls_Dscnt_DtlR> dtlL = up1().subList(idxKey, hdr.hdr_peg_no());

				// 承認提供サービスの呼出
				if (isAprvTgt(hdr.trd_ptn_typ())) {
					callAprvSrv(hdr, dtlL);
				}

				// 売上実績サービスの呼出
				callSlsActRegSrv(hdr, dtlL);

				// 受払実績サービスの呼出
				callIoActSrv();
				
				// 承認情報を下り電文に設定
				setAprvDown(hdr);
			}
		}

		// 売上実績サービスの呼出
		protected void callSlsActRegSrv(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			SlsAct_Upd01_HdrR oUp = ope.up0().createRow();
			copy(oUp, hdr, createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR());
			ope.up0().add(oUp);
			addAll(ope.up1(), dtlL, createMap_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR());
			addAll(ope.up2(), dtlL, createMap_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR());
			ope.up3().indiv_prnt_flg(hdr.indiv_prnt_flg());
			ope.exec();

			// 下り電文のセット
			// 売上実績サービスにて伝票が分割される場合があるので注意
			addAll(down0(), ope.down0(),
					createMap_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR());
			down1().addAll(crtSls_Dscnt_Rslt_Dtl(ope.down0()));
		}

		/**
		 * 承認提供サービス(MBBAL5010.Aprv_Upd01)の呼出<br>
		 */
		protected void callAprvSrv(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

			// 更新前の承認状況区分が「一次承認済」「最終承認済」の場合は、承認引戻ＦＬＧがオンでなければ実行しない
			if (!needExecAprvService(hdr)) {
				return;
			}

			MBBAL_AprvService.Aprv_Upd01 ope = MBBAL_AprvService.crtAprv_Upd01();
			Aprv_Chk01_Rslt1R oUp = ope.up0().createRow();
			copy(oUp, hdr, createMap_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR());
			
			// 承認金額を設定
			oUp.src_amt1(calcAprvSrcAmt(hdr,
					dtlL.subList(Status.CREATE, Status.MODIFY, Status.NONE)));
			ope.up0().add(oUp);

			ope.exec();
			Aprv_Upd01_Dtl1R oDown0 = ope.down0().get(0);
			// 承認関連情報を上り電文に設定
			if (oDown0.aprv_flg()) {
				hdr.aprv_flg(true);
				hdr.aprv_no(oDown0.aprv_no());
				hdr.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
			}
			else {
				hdr.aprv_flg(false);
				hdr.aprv_no(null);
				hdr.aprv_sts_typ(null);
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSrv() {
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}
		
		/**
		 * 承認情報を下り電文へ設定する。
		 * @param hdr
		 */
		protected void setAprvDown(Sls_Dscnt_HdrR hdr) {

			MCList<Sls_Dscnt_Rslt_HdrR> downL = down0().subList(Sls_Dscnt_HdrR.$sls_act_no, hdr.sls_act_no());
			
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_flg, hdr.aprv_flg());
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_no, hdr.aprv_no());
			downL.setValue(Sls_Dscnt_Rslt_HdrR.$aprv_sts_typ, hdr.aprv_sts_typ());
		}

		/**
		 * 更新区分を取得する
		 * 	<p>
		 * 	判定ルール<br>
		 * 	1. 売上明細ＮＯがnullの場合：新規(CRT)
		 * 	2. 上記以外で行ステータスがDELETEの場合：削除(DEL)
		 * 	3.　上記以外の場合：更新(UPD)
		 * 	</p>
		 * @param dtl
		 * @return
		 */
		protected String getDataCrudTyp(Sls_Dscnt_DtlR dtl) {
			if (isNull(dtl.sls_act_d_no())) {
				return MAC_DATA_CRUD_TYP.CRT.value();
			}
			else if (dtl.isStatusDelete()) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			return MAC_DATA_CRUD_TYP.UPD.value();
		}

		protected Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<SlsAct_Upd01_HdrR, Sls_Dscnt_HdrR> createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR() {
			return new Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<SlsAct_Upd01_HdrR, Sls_Dscnt_HdrR>();
		}

		public class Map_SlsAct_Upd01_HdrR_Sls_Dscnt_HdrR<D extends SlsAct_Upd01_HdrR, S extends Sls_Dscnt_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no,
						Sls_Dscnt_HdrR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no,
						Sls_Dscnt_HdrR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq,
						Sls_Dscnt_HdrR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev,
						Sls_Dscnt_HdrR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Sls_Dscnt_HdrR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ,
						Sls_Dscnt_HdrR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Sls_Dscnt_HdrR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Sls_Dscnt_HdrR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd,
						Sls_Dscnt_HdrR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd,
						Sls_Dscnt_HdrR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Sls_Dscnt_HdrR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Sls_Dscnt_HdrR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Sls_Dscnt_HdrR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Sls_Dscnt_HdrR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, Sls_Dscnt_HdrR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Sls_Dscnt_HdrR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1,
						Sls_Dscnt_HdrR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Sls_Dscnt_HdrR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2,
						Sls_Dscnt_HdrR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Sls_Dscnt_HdrR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3,
						Sls_Dscnt_HdrR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt,
						Sls_Dscnt_HdrR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt,
						Sls_Dscnt_HdrR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Sls_Dscnt_HdrR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Sls_Dscnt_HdrR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Sls_Dscnt_HdrR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Sls_Dscnt_HdrR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Sls_Dscnt_HdrR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd,
						Sls_Dscnt_HdrR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd,
						Sls_Dscnt_HdrR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Sls_Dscnt_HdrR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Sls_Dscnt_HdrR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd,
						Sls_Dscnt_HdrR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate,
						Sls_Dscnt_HdrR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Sls_Dscnt_HdrR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks,
						Sls_Dscnt_HdrR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no,
						Sls_Dscnt_HdrR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, Sls_Dscnt_HdrR.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, Sls_Dscnt_HdrR.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ,
						Sls_Dscnt_HdrR.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Sls_Dscnt_HdrR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Sls_Dscnt_HdrR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Sls_Dscnt_HdrR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
						Sls_Dscnt_HdrR.$sls_slip_out_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.amt_calc_flg(false);
			}
		}

		protected Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<SlsAct_Upd01_DtlR, Sls_Dscnt_DtlR> createMap_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR() {
			return new Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<SlsAct_Upd01_DtlR, Sls_Dscnt_DtlR>();
		}

		public class Map_SlsAct_Upd01_DtlR_Sls_Dscnt_DtlR<D extends SlsAct_Upd01_DtlR, S extends Sls_Dscnt_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no,
						Sls_Dscnt_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no,
						Sls_Dscnt_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no,
						Sls_Dscnt_DtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq,
						Sls_Dscnt_DtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Sls_Dscnt_DtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Sls_Dscnt_DtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Sls_Dscnt_DtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Sls_Dscnt_DtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Sls_Dscnt_DtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Sls_Dscnt_DtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Sls_Dscnt_DtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Sls_Dscnt_DtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Sls_Dscnt_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Sls_Dscnt_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Sls_Dscnt_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Sls_Dscnt_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Sls_Dscnt_DtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Sls_Dscnt_DtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Sls_Dscnt_DtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Sls_Dscnt_DtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Sls_Dscnt_DtlR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Sls_Dscnt_DtlR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Sls_Dscnt_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Sls_Dscnt_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd,
						Sls_Dscnt_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty,
						Sls_Dscnt_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd,
						Sls_Dscnt_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty,
						Sls_Dscnt_DtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri,
						Sls_Dscnt_DtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Sls_Dscnt_DtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Sls_Dscnt_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Sls_Dscnt_DtlR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Sls_Dscnt_DtlR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Sls_Dscnt_DtlR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Sls_Dscnt_DtlR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Sls_Dscnt_DtlR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Sls_Dscnt_DtlR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Sls_Dscnt_DtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg,
						Sls_Dscnt_DtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, Sls_Dscnt_DtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, Sls_Dscnt_DtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times,
						Sls_Dscnt_DtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ,
						Sls_Dscnt_DtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg,
						Sls_Dscnt_DtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd,
						Sls_Dscnt_DtlR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no,
						Sls_Dscnt_DtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd,
						Sls_Dscnt_DtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm,
						Sls_Dscnt_DtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks,
						Sls_Dscnt_DtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks,
						Sls_Dscnt_DtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Sls_Dscnt_DtlR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Sls_Dscnt_DtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, Sls_Dscnt_DtlR.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Sls_Dscnt_DtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Sls_Dscnt_DtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Sls_Dscnt_DtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Sls_Dscnt_DtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Sls_Dscnt_DtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no,
						Sls_Dscnt_DtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq,
						Sls_Dscnt_DtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no,
						Sls_Dscnt_DtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq,
						Sls_Dscnt_DtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_sls_ac_dt,
						Sls_Dscnt_DtlR.$base_sls_ac_dt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no,
						Sls_Dscnt_DtlR.$dlv_slip_d_no);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(getDataCrudTyp(src));
				dest.pri_prnt_flg(true);
			}
		}

		protected Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<SlsAct_Upd01_IoR, Sls_Dscnt_DtlR> createMap_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR() {
			return new Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<SlsAct_Upd01_IoR, Sls_Dscnt_DtlR>();
		}

		public class Map_SlsAct_Upd01_IoR_Sls_Dscnt_DtlR<D extends SlsAct_Upd01_IoR, S extends Sls_Dscnt_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Sls_Dscnt_DtlR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Sls_Dscnt_DtlR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no,
						Sls_Dscnt_DtlR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq,
						Sls_Dscnt_DtlR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Sls_Dscnt_DtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Sls_Dscnt_DtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Sls_Dscnt_DtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Sls_Dscnt_DtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Sls_Dscnt_DtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Sls_Dscnt_DtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd,
						Sls_Dscnt_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty,
						Sls_Dscnt_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd,
						Sls_Dscnt_DtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty,
						Sls_Dscnt_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_peg_no(MCNumber.ONE);
				dest.data_crud_typ(getDataCrudTyp(src));
				dest.pack_unit_cd(src.pack_flg() ? src.trd_unit_cd() : src.base_unit_cd());
				dest.pack_unit_qty(src.pack_flg() ? src.trd_unit_qty() : src
						.base_unit_qty());
			}
		}

		protected Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<Sls_Dscnt_Rslt_HdrR, SlsAct_Upd01_RsltR> createMap_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR() {
			return new Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<Sls_Dscnt_Rslt_HdrR, SlsAct_Upd01_RsltR>();
		}

		public class Map_Sls_Dscnt_Rslt_HdrR_SlsAct_Upd01_RsltR<D extends Sls_Dscnt_Rslt_HdrR, S extends SlsAct_Upd01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$hdr_peg_no,
						SlsAct_Upd01_RsltR.$hdr_peg_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_no,
						SlsAct_Upd01_RsltR.$sls_act_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_seq,
						SlsAct_Upd01_RsltR.$sls_act_seq);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$sls_act_rev,
						SlsAct_Upd01_RsltR.$sls_act_rev);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$dlv_slip_no,
						SlsAct_Upd01_RsltR.$dlv_slip_no);
				addColumnPathMap(Sls_Dscnt_Rslt_HdrR.$iv_no, SlsAct_Upd01_RsltR.$iv_no);
			}
		}
	}

	/**
	 * Sls_Dscnt_Del01オペレーション.<p>
	 *
	 */
	public class Sls_Dscnt_Del01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 値引登録画面呼出時は1伝票分だが、業務データ取込時はN件分の伝票がリストで渡されるため、ループ処理で伝票単位で処理を行う
			for (Sls_Dscnt_DelR hdr : up0()) {

				// 売上実績サービスの呼出
				callSlsActRegSrv(hdr);

				// 承認提供サービスの呼出
				if (isAprvTgt(hdr.trd_ptn_typ())) {
					callAprvSrv(hdr);
				}

			}
			// 受払実績サービスの呼出
			callIoActSrv();
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSrv() {
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}
		
		protected void callSlsActRegSrv(Sls_Dscnt_DelR hdr) {

			// 売上実績明細（＋売上実績明細受払）情報を取得
			MCList<MST_SLS_ACT_D_R> selectL = selectSlsActDIO(hdr);

			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();

			SlsAct_Upd01_HdrR tmpR = ope.up0().createRow();
			copy(tmpR, hdr, createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_DelR());
			ope.up0().add(tmpR);
			addAll(ope.up1(), selectL, createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R());
			addAll(ope.up2(), selectL, createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_D_R());
			ope.up3().indiv_prnt_flg(hdr.indiv_prnt_flg());
			ope.exec();

		}

		/**
		 * 承認提供サービス(MBAAL5010.Aprv_Del01)の呼出
		 * @param hdr
		 */
		protected void callAprvSrv(Sls_Dscnt_DelR hdr) {
			MBBAL_AprvService.Aprv_Del01 ope = MBBAL_AprvService.crtAprv_Del01();
			Aprv_Chk04_Rslt1R oUp = ope.up0().createRow();
			oUp.aprv_no(hdr.aprv_no());
			oUp.setAttributes(hdr);
			ope.up0().add(oUp);
			ope.exec();
		}

		protected Map_SlsAct_Upd01_HdrR_Sls_Dscnt_DelR<SlsAct_Upd01_HdrR, Sls_Dscnt_DelR> createMap_SlsAct_Upd01_HdrR_Sls_Dscnt_DelR() {
			return new Map_SlsAct_Upd01_HdrR_Sls_Dscnt_DelR<SlsAct_Upd01_HdrR, Sls_Dscnt_DelR>();
		}

		public class Map_SlsAct_Upd01_HdrR_Sls_Dscnt_DelR<D extends SlsAct_Upd01_HdrR, S extends Sls_Dscnt_DelR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no,
						Sls_Dscnt_DelR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no,
						Sls_Dscnt_DelR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq,
						Sls_Dscnt_DelR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev,
						Sls_Dscnt_DelR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Sls_Dscnt_DelR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ,
						Sls_Dscnt_DelR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Sls_Dscnt_DelR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no,
						Sls_Dscnt_DelR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_prnt_flg,
						Sls_Dscnt_DelR.$sls_slip_out_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.ship_act_service_via_flg(false);
				dest.ship_act_service_via_flg(false);
				dest.ship_act_service_exec_flg(false);
				dest.amt_calc_flg(false);
			}
		}

		protected Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R> createMap_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R() {
			return new Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<SlsAct_Upd01_DtlR, MST_SLS_ACT_D_R>();
		}

		public class Map_SlsAct_Upd01_DtlR_MST_SLS_ACT_D_R<D extends SlsAct_Upd01_DtlR, S extends MST_SLS_ACT_D_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no,
						MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq,
						MST_SLS_ACT_D_R.$sls_act_d_seq);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.getNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no));
				dest.dtl_peg_no(src.getNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no));
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		protected Map_SlsAct_Upd01_IoR_MST_SLS_ACT_D_R<SlsAct_Upd01_IoR, MST_SLS_ACT_D_R> createMap_SlsAct_Upd01_IoR_MST_SLS_ACT_D_R() {
			return new Map_SlsAct_Upd01_IoR_MST_SLS_ACT_D_R<SlsAct_Upd01_IoR, MST_SLS_ACT_D_R>();
		}

		public class Map_SlsAct_Upd01_IoR_MST_SLS_ACT_D_R<D extends SlsAct_Upd01_IoR, S extends MST_SLS_ACT_D_R>
				extends MCRowMapper<D, S> {

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.getNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no));
				dest.dtl_peg_no(src.getNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no));
				dest.io_peg_no(MCNumber.ONE);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		/**
		 * 売上実績明細と売上実績受払（のキー項目）を取得する
		 * @param hdr
		 * @return
		 */
		protected MCList<MST_SLS_ACT_D_R> selectSlsActDIO(Sls_Dscnt_DelR hdr) {

			MCList<MST_SLS_ACT_D_R> selectL = MCList.create(MST_SLS_ACT_D_R.class);
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_IO_R t2 = MST_SLS_ACT_IO_R.create("T2");
			selectL_bldr.setSelect(t2.sls_act_io_no);
			selectL_bldr.setSelect(t2.sls_act_io_seq);
			selectL_bldr.addInnerJoin(t2, bracket( t.sls_act_d_no.eq(t2.sls_act_d_no)
					.and(t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
			selectL_bldr.setWhere(t.sls_act_no.eq(bind("1")), hdr.sls_act_no());
			selectL_bldr.addWhereWithAnd(t.sls_act_seq.eq(bind("1")), hdr.sls_act_seq());
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBBL6240_MST_SLS_ACT_D_S05", selectL, selectL_bldr);

			// 紐付けＮＯの設定
			int i = 1;
			selectL.setNumberNE(SlsAct_Upd01_DtlR.$hdr_peg_no, hdr.hdr_peg_no());
			for (MST_SLS_ACT_D_R r : selectL) {
				r.setNumberNE(SlsAct_Upd01_DtlR.$dtl_peg_no, MCNumber.valueOf(i++));
			}
			return selectL;
		}
	}

	/**
	 * 承認対象の取引パタン区分かどうか判定する
	 * 
	 * @param trdPtnTyp
	 * @return
	 */
	protected boolean isAprvTgt(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp) || MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp);
	}

	/**
	 * 承認作成元金額の計算
	 * <p>
	 * 	明細から承認対象の金額（伝票の税込金額）を計算する
	 * </p>
	 * @param dtlL
	 * @return
	 */
	protected MCNumber calcAprvSrcAmt(Sls_Dscnt_HdrR hdr, MCList<Sls_Dscnt_DtlR> dtlL) {

		MCNumber amt = MCNumber.ZERO;

		// 売上税計算区分が伝票単位で、且つ明細の税ＣＤが1種類の場合は、伝票単位で税計算
		if (MAC_TAX_CALC_TYP.isSLIP(hdr.sls_tax_calc_typ())
				&& dtlL.groupList(Sls_Dscnt_DtlR.$tax_cd).length == 1) {

			// 明細のΣ（取引通貨単価×取引単位数量）を計算
			for (Sls_Dscnt_DtlR r : dtlL) {
				amt = amt.add(getAmt(r.trd_cur_upri(), r.trd_unit_qty(),
						hdr.amt_dec_place(), hdr.sls_amt_rnd_typ()));
			}

			Sls_Dscnt_DtlR dtlR = dtlL.get(0);
			if (dtlR.inc_tax_flg()) {
				// 内税の場合は、計算結果は税込金額なので何もしない
			}
			else {
				// 外税の場合は、税額を計算して加算する
				amt = amt.add(getTaxAmt(amt, dtlR.tax_rate(), hdr.amt_dec_place(),
						hdr.sls_tax_rnd_typ()));
			}

		}
		// 上記以外は明細単位で計算
		else {
			for (Sls_Dscnt_DtlR r : dtlL) {
				MCRow tmp = getAmtAndTax(r.trd_cur_upri(), r.trd_unit_qty(),
						r.tax_rate(), r.inc_tax_flg(), hdr.amt_dec_place(),
						hdr.sls_amt_rnd_typ(), hdr.sls_tax_rnd_typ());
				amt = amt.add(tmp.getNumberNE("inc_tax_amt"));
			}
		}

		return amt;
	}

	/**
	 * 売上実績サービス(SlsAct_Upd01)の下り電文から売上実績明細情報を検索し<br>
	 * 売上値引サービス(Sls_Dscnt_Ins01, Sls_Dscnt_Upd01)の下り電文を生成する
	 * @param down
	 * @return
	 */
	protected MCList<Sls_Dscnt_Rslt_DtlR> crtSls_Dscnt_Rslt_Dtl(
			MCList<SlsAct_Upd01_RsltR> down) {

		MCList<Sls_Dscnt_Rslt_DtlR> retL = MCList.create(Sls_Dscnt_Rslt_DtlR.class);
		MCList<Sls_Dscnt_Rslt_DtlR> rsltDL;
		MCList<MST_SLS_ACT_D_R> dbc = MCList.create(MST_SLS_ACT_D_R.class);

		for (SlsAct_Upd01_RsltR r : down) {

			rsltDL = MCList.create(Sls_Dscnt_Rslt_DtlR.class);

			// 売上実績明細情報を検索
			dbc.clear();
			MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sls_act_d_no);
			dbc_bldr.setSelect(t.sls_act_d_seq);
			dbc_bldr.addWhereWithAnd(t.sls_act_no.eq(bind("1")), r.sls_act_no());
			dbc_bldr.addWhereWithAnd(t.sls_act_seq.eq(bind("1")), r.sls_act_seq());
			dbSelect("MSBBL6240_MST_SLS_ACT_D_S06", dbc, dbc_bldr);
			addAll(rsltDL, dbc, createMap_Sls_Dscnt_Rslt_DtlR_MST_SLS_ACT_D_R());
			rsltDL.setNumberNE(Sls_Dscnt_Rslt_DtlR.$sls_act_rev, r.sls_act_rev());
			rsltDL.setNumberNE(Sls_Dscnt_Rslt_DtlR.$hdr_peg_no, r.hdr_peg_no());

			retL.addAll(rsltDL);
		}
		return retL;
	}
	
	/**
	 * 承認処理を実装する必要かどうか。
	 * @param hdrR 売上値引ヘッダ
	 * @return 必要な場合はtrue
	 */
	protected boolean needExecAprvService(Sls_Dscnt_HdrR hdrR) {
			
		if ((!MAC_APRV_STS_TYP.isFIX(hdrR.aprv_sts_typ()) && !MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ()))
						|| ((MAC_APRV_STS_TYP.isFIX(hdrR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) && hdrR.aprv_ret_flg())) {
			return true;
		}
		
		return false;
	}

	protected Map_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR<Aprv_Chk01_Rslt1R, Sls_Dscnt_HdrR> createMap_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR() {
		return new Map_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR<Aprv_Chk01_Rslt1R, Sls_Dscnt_HdrR>();
	}

	public class Map_Aprv_Chk01_Rslt1R_Sls_Dscnt_HdrR<D extends Aprv_Chk01_Rslt1R, S extends Sls_Dscnt_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Aprv_Chk01_Rslt1R.$aprv_no, Sls_Dscnt_HdrR.$aprv_no);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$biz_usr_cd, Sls_Dscnt_HdrR.$sls_usr_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$master_dt, Sls_Dscnt_HdrR.$ac_dt);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_dpt_cd, Sls_Dscnt_HdrR.$sls_dpt_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_bp_cd, Sls_Dscnt_HdrR.$cst_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$src_cur_cd1, Sls_Dscnt_HdrR.$trd_cur_cd);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$aprv_src_no1, Sls_Dscnt_HdrR.$sls_act_no);
			addColumnPathMap(Aprv_Chk01_Rslt1R.$peg_no, Sls_Dscnt_HdrR.$peg_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MAC_TRD_PTN_TYP.isSLS_DSCNT(src.trd_ptn_typ())) {
				dest.aprv_func_typ(MAC_APRV_FUNC_TYP.SLS_DSCNT.value());
			}
			else if (MAC_TRD_PTN_TYP.isSLS_XTRA(src.trd_ptn_typ())) {
				dest.aprv_func_typ(MAC_APRV_FUNC_TYP.SLS_XTRA.value());
			}
		}
	}

	protected Map_Sls_Dscnt_Rslt_DtlR_MST_SLS_ACT_D_R<Sls_Dscnt_Rslt_DtlR, MST_SLS_ACT_D_R> createMap_Sls_Dscnt_Rslt_DtlR_MST_SLS_ACT_D_R() {
		return new Map_Sls_Dscnt_Rslt_DtlR_MST_SLS_ACT_D_R<Sls_Dscnt_Rslt_DtlR, MST_SLS_ACT_D_R>();
	}

	public class Map_Sls_Dscnt_Rslt_DtlR_MST_SLS_ACT_D_R<D extends Sls_Dscnt_Rslt_DtlR, S extends MST_SLS_ACT_D_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_Rslt_DtlR.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
			addColumnPathMap(Sls_Dscnt_Rslt_DtlR.$sls_act_seq,
					MST_SLS_ACT_D_R.$sls_act_seq);
			addColumnPathMap(Sls_Dscnt_Rslt_DtlR.$sls_act_d_no,
					MST_SLS_ACT_D_R.$sls_act_d_no);
			addColumnPathMap(Sls_Dscnt_Rslt_DtlR.$sls_act_d_seq,
					MST_SLS_ACT_D_R.$sls_act_d_seq);
		}
	}
			
	protected Map_MAM_SUNDRY_ITM_R_Sls_Dscnt_DtlR<MAM_SUNDRY_ITM_R,Sls_Dscnt_DtlR> createMap_MAM_SUNDRY_ITM_R_Sls_Dscnt_DtlR() {
		return new Map_MAM_SUNDRY_ITM_R_Sls_Dscnt_DtlR<MAM_SUNDRY_ITM_R, Sls_Dscnt_DtlR>();
	}

	public class Map_MAM_SUNDRY_ITM_R_Sls_Dscnt_DtlR<D extends MAM_SUNDRY_ITM_R, S extends Sls_Dscnt_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_cd, Sls_Dscnt_DtlR.$itm_cd);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub1, Sls_Dscnt_DtlR.$itm_sub1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub2, Sls_Dscnt_DtlR.$itm_sub2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$itm_sub3, Sls_Dscnt_DtlR.$itm_sub3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno1, Sls_Dscnt_DtlR.$sno1);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno2, Sls_Dscnt_DtlR.$sno2);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno3, Sls_Dscnt_DtlR.$sno3);
			addColumnPathMap(MAM_SUNDRY_ITM_R.$sno4, Sls_Dscnt_DtlR.$sno4);
		}
	}
	/**
	 * Sls_Dscnt_BulkImp_Chk01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、売上値引情報の登録前のチェックを行います。<br>
	 */
	public class Sls_Dscnt_BulkImp_Chk01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_BulkImp_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			callSls_Dscnt_Chk01();

			setErrFlg();

			return msgL;
		}

		@Override
		protected void initUp() {
			super.initUp();

			editUp();
		}

		/***
		 * 上り電文編集
		 */
		protected void editUp() {
			up0().setStatus(Status.CREATE);
			setPegNo(up0());
		}

		/***
		 * 登録・訂正前チェック呼び出し
		 */
		protected void callSls_Dscnt_Chk01() {
			Sls_Dscnt_Chk01 chkOpe = MSBBL_SlsDscntService.crtSls_Dscnt_Chk01();

			MCList<Sls_Dscnt_BulkImp_DtlR> hdrL = MCList.create(Sls_Dscnt_BulkImp_DtlR.class);
			
			// 登録・訂正前チェック上り電文設定
			MCList<Sls_Dscnt_BulkImp_DtlR>[] grpL = up0().groupList(getMergeTgtCols());
			for (MCList<Sls_Dscnt_BulkImp_DtlR> l : grpL) {
				Sls_Dscnt_BulkImp_DtlR hdrR = l.get(0);
				l.setNumberNE(Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no, hdrR.peg_no());
				
				hdrL.add(hdrR);
				
				// 同一ヘッダにエラーがある行すべて個別チェックの対象外とする
				if(hasErrFlgOn(l)) {
					continue;
				}
				
				Sls_Dscnt_HdrR opeUp0R = chkOpe.up0().createRow();
				copy(opeUp0R, hdrR, createMap_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR());
				chkOpe.up0().add(opeUp0R);
				
				addAll(chkOpe.up1(), l, createMap_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR());
			}

			chkOpe.exec();

			// 登録・訂正前チェックの下り電文を、自身の上り電文に反映
			copyByPegNo(up0(), chkOpe.down0(), Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no, 
					getHdrDestCols(), Sls_Dscnt_HdrR.$hdr_peg_no, getHdrSrcCols());
			copyByPegNo(up0(), getDtlDestCols(), chkOpe.down1(), getDtlSrcCols());
			
			// 関連エラーメッセージを追加
			MCMessagePool.addAll(getRelationErrMsg(hdrL, up0()));
		}

		/***
		 * 関連エラーメッセージ取得
		 * 
		 * @param hdrL ヘッダレコードリスト
		 * @param dtlL 明細レコードリスト
		 * @return 関連エラーメッセージリスト
		 */
		protected MCMessageList getRelationErrMsg(MCList<Sls_Dscnt_BulkImp_DtlR> hdrL, MCList<Sls_Dscnt_BulkImp_DtlR> dtlL) {
			MCMessageList resultMsgL = new MCMessageList();
			MCIndexKey dtlIndexKey = dtlL.createIndex(Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no);
			for (Sls_Dscnt_BulkImp_DtlR hdrR : hdrL) {
				MCList<Sls_Dscnt_BulkImp_DtlR> tgtDtlL = dtlL.subList(dtlIndexKey, hdrR.hdr_peg_no());
				Sls_Dscnt_BulkImp_DtlR causeDtlR = tgtDtlL.getFirst(Sls_Dscnt_BulkImp_DtlR.$err_flg, true);

				// ヘッダ、明細共に正常の場合、次のヘッダへ
				if (!hdrR.hdr_err_flg() && isNull(causeDtlR)) {
					continue;
				}

				for (Sls_Dscnt_BulkImp_DtlR dtlR : tgtDtlL) {
					if (hdrR.hdr_err_flg()) {
						if (!isSame(hdrR.getGUIIndex(), dtlR.getGUIIndex())) {
							resultMsgL.add(new MCMessage(dtlR, null, MSUCL0020, hdrR.getGUIIndex() + 1, toDispGUIIndex(dtlR)));
						}

						// ヘッダエラーの場合、明細の関連メッセージは不要。
						continue;
					}

					// 明細エラーメッセージの追加
					if (!dtlR.err_flg() && !isNull(causeDtlR)) {
						resultMsgL.add(new MCMessage(dtlR, null, MSUCL0021, causeDtlR.getGUIIndex() + 1, toDispGUIIndex(dtlR)));
					}
				}
			}

			return resultMsgL;
		}

		/***
		 * エラーフラグ設定</br>
		 */
		protected void setErrFlg() {
			// 明細に１件でもエラーが存在した場合、同一ヘッダのレコードは全てエラーとする
			MCList<Sls_Dscnt_BulkImp_DtlR>[] grpL = up0().groupList(Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no);
			for (MCList<Sls_Dscnt_BulkImp_DtlR> l : grpL) {
				boolean hdr_err_flg = l.get(0).hdr_err_flg();
				boolean dtl_err_flg = !isNull(l.getFirst(Sls_Dscnt_BulkImp_DtlR.$dtl_err_flg, true));
				boolean err_flg = !isNull(l.getFirst(Sls_Dscnt_BulkImp_DtlR.$err_flg, true));

				l.setBooleanNE(Sls_Dscnt_BulkImp_DtlR.$err_flg, hdr_err_flg || dtl_err_flg || err_flg);
			}
		}

		/***
		 * ヘッダ行まとめ項目取得
		 * 
		 * @return ヘッダ行まとめ項目
		 */
		protected String[] getMergeTgtCols() {
			return new String[] {
					Sls_Dscnt_BulkImp_DtlR.$trd_cd,				// 取引ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$ac_dt,				// 計上日
					Sls_Dscnt_BulkImp_DtlR.$sls_usr_cd,			// 売上担当者ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$sls_dpt_cd,			// 売上部門ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$sls_dt,				// 売上日
					Sls_Dscnt_BulkImp_DtlR.$cst_cd,				// 得意先ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$iv_no,				// インボイスＮＯ
					Sls_Dscnt_BulkImp_DtlR.$ref_iv_no,			// 対応インボイスＮＯ
					Sls_Dscnt_BulkImp_DtlR.$rcv_schd_dt,		// 入金予定日
					Sls_Dscnt_BulkImp_DtlR.$bill_basis_dt,		// 請求起算日
					Sls_Dscnt_BulkImp_DtlR.$ar_dpt_cd,			// 債権部門ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$cst_po_no,			// 得意先注文ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$trd_cur_cd,			// 取引通貨ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$xrate,				// 為替レート
					Sls_Dscnt_BulkImp_DtlR.$ptax_xrate,			// 納税為替レート
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd1,			// 取引条件ＣＤ１
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks1,		// 取引条件備考１
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd2,			// 取引条件ＣＤ２
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks2,		// 取引条件備考２
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd3,			// 取引条件ＣＤ３
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks3,		// 取引条件備考３
					Sls_Dscnt_BulkImp_DtlR.$trd_rmrks,			// 取引備考
					Sls_Dscnt_BulkImp_DtlR.$intr_rmrks,			// 内部備考
					Sls_Dscnt_BulkImp_DtlR.$sub_char1,			// 予備１
					Sls_Dscnt_BulkImp_DtlR.$sub_char2,			// 予備２
					Sls_Dscnt_BulkImp_DtlR.$sub_char3,			// 予備３
					Sls_Dscnt_BulkImp_DtlR.$num_flg,			// 自動発番ＦＬＧ
			};
		}

		/***
		 * コピー先（ヘッダ）対象項目取得
		 * 
		 * @return コピー先（ヘッダ）対象項目
		 */
		protected String[] getHdrDestCols() {
			return new String[] {
					Sls_Dscnt_BulkImp_DtlR.$trd_cd,				// 取引ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$trd_ptn_typ,		// 取引パタン区分
					Sls_Dscnt_BulkImp_DtlR.$ac_ym,				// 計上年月
					Sls_Dscnt_BulkImp_DtlR.$ac_dt,				// 計上日
					Sls_Dscnt_BulkImp_DtlR.$sls_usr_cd,			// 売上担当者ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$sls_dpt_cd,			// 売上部門ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$sls_dt,				// 売上日
					Sls_Dscnt_BulkImp_DtlR.$cst_cd,				// 得意先ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$iv_no,				// インボイスＮＯ
					Sls_Dscnt_BulkImp_DtlR.$ref_iv_no,			// 対応インボイスＮＯ
					Sls_Dscnt_BulkImp_DtlR.$rcv_schd_dt,		// 入金予定日
					Sls_Dscnt_BulkImp_DtlR.$bill_basis_dt,		// 請求起算日
					Sls_Dscnt_BulkImp_DtlR.$ar_dpt_cd,			// 債権部門ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$cst_po_no,			// 得意先注文ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$trd_cur_cd,			// 取引通貨ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$base_cur_cd,		// 基準通貨ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$xrate,				// 為替レート
					Sls_Dscnt_BulkImp_DtlR.$ptax_cur_cd,		// 納税通貨ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$ptax_xrate,			// 納税為替レート
					Sls_Dscnt_BulkImp_DtlR.$aprv_ret_flg,		// 承認引戻
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd1,			// 取引条件ＣＤ１
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks1,		// 取引条件備考１
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd2,			// 取引条件ＣＤ２
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks2,		// 取引条件備考２
					Sls_Dscnt_BulkImp_DtlR.$tterm_cd3,			// 取引条件ＣＤ３
					Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks3,		// 取引条件備考３
					Sls_Dscnt_BulkImp_DtlR.$trd_rmrks,			// 取引備考
					Sls_Dscnt_BulkImp_DtlR.$intr_rmrks,			// 内部備考
					Sls_Dscnt_BulkImp_DtlR.$aprv_flg,			// 承認対象
					Sls_Dscnt_BulkImp_DtlR.$aprv_no,			// 承認ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$aprv_sts_typ,		// 承認状況区分
					Sls_Dscnt_BulkImp_DtlR.$sub_char1,			// 予備１
					Sls_Dscnt_BulkImp_DtlR.$sub_char2,			// 予備２
					Sls_Dscnt_BulkImp_DtlR.$sub_char3,			// 予備３
					Sls_Dscnt_BulkImp_DtlR.$sls_slip_out_flg,	// 売上伝票即時発行
					Sls_Dscnt_BulkImp_DtlR.$num_flg,			// 自動発番ＦＬＧ
					Sls_Dscnt_BulkImp_DtlR.$cred_cd,			// 与信管理先ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$bcst_cd,			// 請求先ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$acst_cd,			// 売掛先ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$xrate_cd,			// 為替レートＣＤ
					Sls_Dscnt_BulkImp_DtlR.$amt_dec_place,		// 金額小数部有効桁数
					Sls_Dscnt_BulkImp_DtlR.$sls_tax_calc_typ,	// 売上税計算区分
					Sls_Dscnt_BulkImp_DtlR.$sls_amt_rnd_typ,	// 売上金額端数処理区分
					Sls_Dscnt_BulkImp_DtlR.$sls_tax_rnd_typ,	// 売上税端数処理区分
					Sls_Dscnt_BulkImp_DtlR.$dlv_slip_no,		// 納品書ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$wg_cd,				// ワーキンググループＣＤ
					Sls_Dscnt_BulkImp_DtlR.$cst_iv_flg,			// 得意先インボイス取引
					Sls_Dscnt_BulkImp_DtlR.$hdr_err_flg,		// ヘッダエラー
			};
		}

		/***
		 * コピー元（ヘッダ）対象項目取得
		 * 
		 * @return コピー先（ヘッダ）対象項目
		 */
		protected String[] getHdrSrcCols() {
			return new String[] {
					Sls_Dscnt_HdrR.$trd_cd,						// 取引ＣＤ
					Sls_Dscnt_HdrR.$trd_ptn_typ,				// 取引パタン区分
					Sls_Dscnt_HdrR.$ac_ym,						// 計上年月
					Sls_Dscnt_HdrR.$ac_dt,						// 計上日
					Sls_Dscnt_HdrR.$sls_usr_cd,					// 売上担当者ＣＤ
					Sls_Dscnt_HdrR.$sls_dpt_cd,					// 売上部門ＣＤ
					Sls_Dscnt_HdrR.$sls_dt,						// 売上日
					Sls_Dscnt_HdrR.$cst_cd,						// 得意先ＣＤ
					Sls_Dscnt_HdrR.$iv_no,						// インボイスＮＯ
					Sls_Dscnt_HdrR.$ref_iv_no,					// 対応インボイスＮＯ
					Sls_Dscnt_HdrR.$rcv_schd_dt,				// 入金予定日
					Sls_Dscnt_HdrR.$bill_basis_dt,				// 請求起算日
					Sls_Dscnt_HdrR.$ar_dpt_cd,					// 債権部門ＣＤ
					Sls_Dscnt_HdrR.$cst_po_no,					// 得意先注文ＮＯ
					Sls_Dscnt_HdrR.$trd_cur_cd,					// 取引通貨ＣＤ
					Sls_Dscnt_HdrR.$base_cur_cd,				// 基準通貨ＣＤ
					Sls_Dscnt_HdrR.$xrate,						// 為替レート
					Sls_Dscnt_HdrR.$ptax_cur_cd,				// 納税通貨ＣＤ
					Sls_Dscnt_HdrR.$ptax_xrate,					// 納税為替レート
					Sls_Dscnt_HdrR.$aprv_ret_flg,				// 承認引戻
					Sls_Dscnt_HdrR.$tterm_cd1,					// 取引条件ＣＤ１
					Sls_Dscnt_HdrR.$tterm_rmrks1,				// 取引条件備考１
					Sls_Dscnt_HdrR.$tterm_cd2,					// 取引条件ＣＤ２
					Sls_Dscnt_HdrR.$tterm_rmrks2,				// 取引条件備考２
					Sls_Dscnt_HdrR.$tterm_cd3,					// 取引条件ＣＤ３
					Sls_Dscnt_HdrR.$tterm_rmrks3,				// 取引条件備考３
					Sls_Dscnt_HdrR.$trd_rmrks,					// 取引備考
					Sls_Dscnt_HdrR.$intr_rmrks,					// 内部備考
					Sls_Dscnt_HdrR.$aprv_flg,					// 承認対象
					Sls_Dscnt_HdrR.$aprv_no,					// 承認ＮＯ
					Sls_Dscnt_HdrR.$aprv_sts_typ,				// 承認状況区分
					Sls_Dscnt_HdrR.$sub_char1,					// 予備１
					Sls_Dscnt_HdrR.$sub_char2,					// 予備２
					Sls_Dscnt_HdrR.$sub_char3,					// 予備３
					Sls_Dscnt_HdrR.$sls_slip_out_flg,			// 売上伝票即時発行
					Sls_Dscnt_HdrR.$num_flg,					// 自動発番
					Sls_Dscnt_HdrR.$cred_cd,					// 与信管理先ＣＤ
					Sls_Dscnt_HdrR.$bcst_cd,					// 請求先ＣＤ
					Sls_Dscnt_HdrR.$acst_cd,					// 売掛先ＣＤ
					Sls_Dscnt_HdrR.$xrate_cd,					// 為替レートＣＤ
					Sls_Dscnt_HdrR.$amt_dec_place,				// 金額小数部有効桁数
					Sls_Dscnt_HdrR.$sls_tax_calc_typ,			// 売上税計算区分
					Sls_Dscnt_HdrR.$sls_amt_rnd_typ,			// 売上金額端数処理区分
					Sls_Dscnt_HdrR.$sls_tax_rnd_typ,			// 売上税端数処理区分
					Sls_Dscnt_HdrR.$dlv_slip_no,				// 納品書ＮＯ
					Sls_Dscnt_HdrR.$wg_cd,						// ワーキンググループＣＤ
					Sls_Dscnt_HdrR.$cst_iv_flg,					// 得意先インボイス取引
					Sls_Dscnt_HdrR.$err_flg,					// エラー
			};
		}

		/***
		 * コピー先（明細）対象項目取得
		 * 
		 * @return コピー先（明細）対象項目
		 */
		protected String[] getDtlDestCols() {
			return new String[] {
					Sls_Dscnt_BulkImp_DtlR.$dtl_peg_no,			// 明細紐付けＮＯ
					Sls_Dscnt_BulkImp_DtlR.$itm_cd,				// 品目ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$itm_sub1,			// 枝番１
					Sls_Dscnt_BulkImp_DtlR.$itm_sub2,			// 枝番２
					Sls_Dscnt_BulkImp_DtlR.$itm_sub3,			// 枝番３
					Sls_Dscnt_BulkImp_DtlR.$itm_nm,				// 品名
					Sls_Dscnt_BulkImp_DtlR.$iv_itm_nm,			// インボイス表記用品名
					Sls_Dscnt_BulkImp_DtlR.$trd_unit_cd,		// 取引単位ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$trd_unit_qty,		// 取引単位数量
					Sls_Dscnt_BulkImp_DtlR.$trd_cur_upri,		// 取引通貨単価
					Sls_Dscnt_BulkImp_DtlR.$tax_cd,				// 税ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$inc_tax_flg,		// 内税
					Sls_Dscnt_BulkImp_DtlR.$tax_rate,			// 税率
					Sls_Dscnt_BulkImp_DtlR.$tax_typ,			// 税区分
					Sls_Dscnt_BulkImp_DtlR.$rsn_cd,				// 理由ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$bill_crryovr_times,	// 請求繰越回数
					Sls_Dscnt_BulkImp_DtlR.$cst_po_d_no,		// 得意先注文明細ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$cst_itm_cd,			// 得意先品目ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$cst_itm_nm,			// 得意先品名
					Sls_Dscnt_BulkImp_DtlR.$sno1,				// 手配ＮＯ１
					Sls_Dscnt_BulkImp_DtlR.$sno2,				// 手配ＮＯ２
					Sls_Dscnt_BulkImp_DtlR.$sno3,				// 手配ＮＯ３
					Sls_Dscnt_BulkImp_DtlR.$sno4,				// 手配ＮＯ４
					Sls_Dscnt_BulkImp_DtlR.$sno1_mng_typ,		// 手配ＮＯ１管理区分
					Sls_Dscnt_BulkImp_DtlR.$sno2_mng_typ,		// 手配ＮＯ２管理区分
					Sls_Dscnt_BulkImp_DtlR.$sno3_mng_typ,		// 手配ＮＯ３管理区分
					Sls_Dscnt_BulkImp_DtlR.$sno4_mng_typ,		// 手配ＮＯ４管理区分
					Sls_Dscnt_BulkImp_DtlR.$dest_cd1,			// 仕向先ＣＤ１
					Sls_Dscnt_BulkImp_DtlR.$dest_cd2,			// 仕向先ＣＤ２
					Sls_Dscnt_BulkImp_DtlR.$dest_cd3,			// 仕向先ＣＤ３
					Sls_Dscnt_BulkImp_DtlR.$slo_no,				// 受注ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$slo_d_no,			// 受注明細ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_no,		// 参照売上実績ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_seq,	// 参照売上実績連番
					Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_rev,	// 参照売上実績改訂番号
					Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_d_no,	// 参照売上実績明細ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_d_seq,	// 参照売上実績明細連番
					Sls_Dscnt_BulkImp_DtlR.$base_sls_ac_dt,	// 売上計上日（基）
					Sls_Dscnt_BulkImp_DtlR.$lot_no,				// ロットＮＯ
					Sls_Dscnt_BulkImp_DtlR.$sublot_no,			// サブロットＮＯ
					Sls_Dscnt_BulkImp_DtlR.$wtax_rate,			// 源泉税率
					Sls_Dscnt_BulkImp_DtlR.$wtax_amt,			// 源泉税額
					Sls_Dscnt_BulkImp_DtlR.$trd_d_rmrks,		// 取引明細備考
					Sls_Dscnt_BulkImp_DtlR.$intr_d_rmrks,		// 内部明細備考
					Sls_Dscnt_BulkImp_DtlR.$d_sub_char1,		// 明細予備１
					Sls_Dscnt_BulkImp_DtlR.$d_sub_char2,		// 明細予備２
					Sls_Dscnt_BulkImp_DtlR.$d_sub_char3,		// 明細予備３
					Sls_Dscnt_BulkImp_DtlR.$disp_seq,			// 表示順
					Sls_Dscnt_BulkImp_DtlR.$base_unit_cd,		// 基準単位ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$base_unit_qty,		// 基準単位数量
					Sls_Dscnt_BulkImp_DtlR.$trd_unit_std_qty,	// 取引単位基準数
					Sls_Dscnt_BulkImp_DtlR.$trd_unit_conv_qty,	// 取引単位換算数
					Sls_Dscnt_BulkImp_DtlR.$pack_flg,			// 取引単位荷姿
					Sls_Dscnt_BulkImp_DtlR.$base_unit_dec_place,// 基準単位小数部有効桁数
					Sls_Dscnt_BulkImp_DtlR.$base_unit_rnd_typ,	// 基準単位端数処理区分
					Sls_Dscnt_BulkImp_DtlR.$stk_mng_typ,		// 在庫管理区分
					Sls_Dscnt_BulkImp_DtlR.$sundry_itm_flg,		// 諸口品
					Sls_Dscnt_BulkImp_DtlR.$itm_jnl_cd,			// 品目仕訳ＣＤ
					Sls_Dscnt_BulkImp_DtlR.$sls_act_io_no,		// 売上実績受払ＮＯ
					Sls_Dscnt_BulkImp_DtlR.$sls_act_io_seq,		// 売上実績受払連番
					Sls_Dscnt_BulkImp_DtlR.$dtl_err_flg,		// 明細エラー
					Sls_Dscnt_BulkImp_DtlR.$dlv_slip_d_no,		// 納品書明細ＮＯ
			};
		}

		/***
		 * コピー元（明細）対象項目取得
		 * 
		 * @return コピー元（明細）対象項目
		 */
		protected String[] getDtlSrcCols() {
			return new String[] {
					Sls_Dscnt_DtlR.$dtl_peg_no,					// 明細紐付けＮＯ
					Sls_Dscnt_DtlR.$itm_cd,						// 品目ＣＤ
					Sls_Dscnt_DtlR.$itm_sub1,					// 枝番１
					Sls_Dscnt_DtlR.$itm_sub2,					// 枝番２
					Sls_Dscnt_DtlR.$itm_sub3,					// 枝番３
					Sls_Dscnt_DtlR.$itm_nm,						// 品名
					Sls_Dscnt_DtlR.$iv_itm_nm,					// インボイス表記用品名
					Sls_Dscnt_DtlR.$trd_unit_cd,				// 取引単位ＣＤ
					Sls_Dscnt_DtlR.$trd_unit_qty,				// 取引単位数量
					Sls_Dscnt_DtlR.$trd_cur_upri,				// 取引通貨単価
					Sls_Dscnt_DtlR.$tax_cd,						// 税ＣＤ
					Sls_Dscnt_DtlR.$inc_tax_flg,				// 内税
					Sls_Dscnt_DtlR.$tax_rate,					// 税率
					Sls_Dscnt_DtlR.$tax_typ,					// 税区分
					Sls_Dscnt_DtlR.$rsn_cd,						// 理由ＣＤ
					Sls_Dscnt_DtlR.$bill_crryovr_times,			// 請求繰越回数
					Sls_Dscnt_DtlR.$cst_po_d_no,				// 得意先注文明細ＮＯ
					Sls_Dscnt_DtlR.$cst_itm_cd,					// 得意先品目ＣＤ
					Sls_Dscnt_DtlR.$cst_itm_nm,					// 得意先品名
					Sls_Dscnt_DtlR.$sno1,						// 手配ＮＯ１
					Sls_Dscnt_DtlR.$sno2,						// 手配ＮＯ２
					Sls_Dscnt_DtlR.$sno3,						// 手配ＮＯ３
					Sls_Dscnt_DtlR.$sno4,						// 手配ＮＯ４
					Sls_Dscnt_DtlR.$sno1_mng_typ,				// 手配ＮＯ１管理区分
					Sls_Dscnt_DtlR.$sno2_mng_typ,				// 手配ＮＯ２管理区分
					Sls_Dscnt_DtlR.$sno3_mng_typ,				// 手配ＮＯ３管理区分
					Sls_Dscnt_DtlR.$sno4_mng_typ,				// 手配ＮＯ４管理区分
					Sls_Dscnt_DtlR.$dest_cd1,					// 仕向先ＣＤ１
					Sls_Dscnt_DtlR.$dest_cd2,					// 仕向先ＣＤ２
					Sls_Dscnt_DtlR.$dest_cd3,					// 仕向先ＣＤ３
					Sls_Dscnt_DtlR.$slo_no,						// 受注ＮＯ
					Sls_Dscnt_DtlR.$slo_d_no,					// 受注明細ＮＯ
					Sls_Dscnt_DtlR.$ref_sls_act_no,				// 参照売上実績ＮＯ
					Sls_Dscnt_DtlR.$ref_sls_act_seq,			// 参照売上実績連番
					Sls_Dscnt_DtlR.$ref_sls_act_rev,			// 参照売上実績改訂番号
					Sls_Dscnt_DtlR.$ref_sls_act_d_no,			// 参照売上実績明細ＮＯ
					Sls_Dscnt_DtlR.$ref_sls_act_d_seq,			// 参照売上実績明細連番
					Sls_Dscnt_DtlR.$base_sls_ac_dt,			// 売上計上日（基）
					Sls_Dscnt_DtlR.$lot_no,						// ロットＮＯ
					Sls_Dscnt_DtlR.$sublot_no,					// サブロットＮＯ
					Sls_Dscnt_DtlR.$wtax_rate,					// 源泉税率
					Sls_Dscnt_DtlR.$wtax_amt,					// 源泉税額
					Sls_Dscnt_DtlR.$trd_d_rmrks,				// 取引明細備考
					Sls_Dscnt_DtlR.$intr_rmrks,					// 内部明細備考
					Sls_Dscnt_DtlR.$sub_char1,					// 明細予備１
					Sls_Dscnt_DtlR.$sub_char2,					// 明細予備２
					Sls_Dscnt_DtlR.$sub_char3,					// 明細予備３
					Sls_Dscnt_DtlR.$disp_seq,					// 表示順
					Sls_Dscnt_DtlR.$base_unit_cd,				// 基準単位ＣＤ
					Sls_Dscnt_DtlR.$base_unit_qty,				// 基準単位数量
					Sls_Dscnt_DtlR.$trd_unit_std_qty,			// 取引単位基準数
					Sls_Dscnt_DtlR.$trd_unit_conv_qty,			// 取引単位換算数
					Sls_Dscnt_DtlR.$pack_flg,					// 取引単位荷姿
					Sls_Dscnt_DtlR.$base_unit_dec_place,		// 基準単位小数部有効桁数
					Sls_Dscnt_DtlR.$base_unit_rnd_typ,			// 基準単位端数処理区分
					Sls_Dscnt_DtlR.$stk_mng_typ,				// 在庫管理区分
					Sls_Dscnt_DtlR.$sundry_itm_flg,				// 諸口品
					Sls_Dscnt_DtlR.$itm_jnl_cd,					// 品目仕訳ＣＤ
					Sls_Dscnt_DtlR.$sls_act_io_no,				// 売上実績受払ＮＯ
					Sls_Dscnt_DtlR.$sls_act_io_seq,				// 売上実績受払連番
					Sls_Dscnt_DtlR.$err_flg,					// エラー
					Sls_Dscnt_DtlR.$dlv_slip_d_no,				// 納品書明細ＮＯ
			};
		}
	}

	protected Map_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR<Sls_Dscnt_HdrR,Sls_Dscnt_BulkImp_DtlR> createMap_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR() {
		return new Map_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR<Sls_Dscnt_HdrR, Sls_Dscnt_BulkImp_DtlR>();
	}

	public class Map_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR<D extends Sls_Dscnt_HdrR, S extends Sls_Dscnt_BulkImp_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_HdrR.$hdr_peg_no, Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_cd, Sls_Dscnt_BulkImp_DtlR.$trd_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_ptn_typ, Sls_Dscnt_BulkImp_DtlR.$trd_ptn_typ);
			addColumnPathMap(Sls_Dscnt_HdrR.$ac_ym, Sls_Dscnt_BulkImp_DtlR.$ac_ym);
			addColumnPathMap(Sls_Dscnt_HdrR.$ac_dt, Sls_Dscnt_BulkImp_DtlR.$ac_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_usr_cd, Sls_Dscnt_BulkImp_DtlR.$sls_usr_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_dpt_cd, Sls_Dscnt_BulkImp_DtlR.$sls_dpt_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_dt, Sls_Dscnt_BulkImp_DtlR.$sls_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$cst_cd, Sls_Dscnt_BulkImp_DtlR.$cst_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$iv_no, Sls_Dscnt_BulkImp_DtlR.$iv_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$ref_iv_no, Sls_Dscnt_BulkImp_DtlR.$ref_iv_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$rcv_schd_dt, Sls_Dscnt_BulkImp_DtlR.$rcv_schd_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$bill_basis_dt, Sls_Dscnt_BulkImp_DtlR.$bill_basis_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$ar_dpt_cd, Sls_Dscnt_BulkImp_DtlR.$ar_dpt_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$cst_po_no, Sls_Dscnt_BulkImp_DtlR.$cst_po_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_cur_cd, Sls_Dscnt_BulkImp_DtlR.$trd_cur_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$base_cur_cd, Sls_Dscnt_BulkImp_DtlR.$base_cur_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$xrate, Sls_Dscnt_BulkImp_DtlR.$xrate);
			addColumnPathMap(Sls_Dscnt_HdrR.$ptax_cur_cd, Sls_Dscnt_BulkImp_DtlR.$ptax_cur_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$ptax_xrate, Sls_Dscnt_BulkImp_DtlR.$ptax_xrate);
			addColumnPathMap(Sls_Dscnt_HdrR.$aprv_ret_flg, Sls_Dscnt_BulkImp_DtlR.$aprv_ret_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd1, Sls_Dscnt_BulkImp_DtlR.$tterm_cd1);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks1, Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks1);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd2, Sls_Dscnt_BulkImp_DtlR.$tterm_cd2);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks2, Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks2);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd3, Sls_Dscnt_BulkImp_DtlR.$tterm_cd3);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks3, Sls_Dscnt_BulkImp_DtlR.$tterm_rmrks3);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_rmrks, Sls_Dscnt_BulkImp_DtlR.$trd_rmrks);
			addColumnPathMap(Sls_Dscnt_HdrR.$intr_rmrks, Sls_Dscnt_BulkImp_DtlR.$intr_rmrks);
			addColumnPathMap(Sls_Dscnt_HdrR.$aprv_flg, Sls_Dscnt_BulkImp_DtlR.$aprv_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$aprv_no, Sls_Dscnt_BulkImp_DtlR.$aprv_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$aprv_sts_typ, Sls_Dscnt_BulkImp_DtlR.$aprv_sts_typ);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char1, Sls_Dscnt_BulkImp_DtlR.$sub_char1);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char2, Sls_Dscnt_BulkImp_DtlR.$sub_char2);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char3, Sls_Dscnt_BulkImp_DtlR.$sub_char3);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_slip_out_flg, Sls_Dscnt_BulkImp_DtlR.$sls_slip_out_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$num_flg, Sls_Dscnt_BulkImp_DtlR.$num_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$cred_cd, Sls_Dscnt_BulkImp_DtlR.$cred_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$bcst_cd, Sls_Dscnt_BulkImp_DtlR.$bcst_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$acst_cd, Sls_Dscnt_BulkImp_DtlR.$acst_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$xrate_cd, Sls_Dscnt_BulkImp_DtlR.$xrate_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$amt_dec_place, Sls_Dscnt_BulkImp_DtlR.$amt_dec_place);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_tax_calc_typ, Sls_Dscnt_BulkImp_DtlR.$sls_tax_calc_typ);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_amt_rnd_typ, Sls_Dscnt_BulkImp_DtlR.$sls_amt_rnd_typ);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_tax_rnd_typ, Sls_Dscnt_BulkImp_DtlR.$sls_tax_rnd_typ);
			addColumnPathMap(Sls_Dscnt_HdrR.$dlv_slip_no, Sls_Dscnt_BulkImp_DtlR.$dlv_slip_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$wg_cd, Sls_Dscnt_BulkImp_DtlR.$wg_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$cst_iv_flg, Sls_Dscnt_BulkImp_DtlR.$cst_iv_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$peg_no, Sls_Dscnt_BulkImp_DtlR.$peg_no);
		}
	}

	protected Map_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR<Sls_Dscnt_DtlR,Sls_Dscnt_BulkImp_DtlR> createMap_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR() {
		return new Map_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR<Sls_Dscnt_DtlR, Sls_Dscnt_BulkImp_DtlR>();
	}

	public class Map_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR<D extends Sls_Dscnt_DtlR, S extends Sls_Dscnt_BulkImp_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_DtlR.$hdr_peg_no, Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$dtl_peg_no, Sls_Dscnt_BulkImp_DtlR.$peg_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_cd, Sls_Dscnt_BulkImp_DtlR.$itm_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub1, Sls_Dscnt_BulkImp_DtlR.$itm_sub1);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub2, Sls_Dscnt_BulkImp_DtlR.$itm_sub2);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub3, Sls_Dscnt_BulkImp_DtlR.$itm_sub3);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_nm, Sls_Dscnt_BulkImp_DtlR.$itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$iv_itm_nm, Sls_Dscnt_BulkImp_DtlR.$iv_itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_cd, Sls_Dscnt_BulkImp_DtlR.$trd_unit_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_qty, Sls_Dscnt_BulkImp_DtlR.$trd_unit_qty);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_cur_upri, Sls_Dscnt_BulkImp_DtlR.$trd_cur_upri);
			addColumnPathMap(Sls_Dscnt_DtlR.$tax_cd, Sls_Dscnt_BulkImp_DtlR.$tax_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$inc_tax_flg, Sls_Dscnt_BulkImp_DtlR.$inc_tax_flg);
			addColumnPathMap(Sls_Dscnt_DtlR.$tax_rate, Sls_Dscnt_BulkImp_DtlR.$tax_rate);
			addColumnPathMap(Sls_Dscnt_DtlR.$tax_typ, Sls_Dscnt_BulkImp_DtlR.$tax_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$rsn_cd, Sls_Dscnt_BulkImp_DtlR.$rsn_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$bill_crryovr_times, Sls_Dscnt_BulkImp_DtlR.$bill_crryovr_times);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_po_d_no, Sls_Dscnt_BulkImp_DtlR.$cst_po_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_itm_cd, Sls_Dscnt_BulkImp_DtlR.$cst_itm_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_itm_nm, Sls_Dscnt_BulkImp_DtlR.$cst_itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno1, Sls_Dscnt_BulkImp_DtlR.$sno1);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno2, Sls_Dscnt_BulkImp_DtlR.$sno2);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno3, Sls_Dscnt_BulkImp_DtlR.$sno3);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno4, Sls_Dscnt_BulkImp_DtlR.$sno4);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno1_mng_typ, Sls_Dscnt_BulkImp_DtlR.$sno1_mng_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno2_mng_typ, Sls_Dscnt_BulkImp_DtlR.$sno2_mng_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno3_mng_typ, Sls_Dscnt_BulkImp_DtlR.$sno3_mng_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno4_mng_typ, Sls_Dscnt_BulkImp_DtlR.$sno4_mng_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd1, Sls_Dscnt_BulkImp_DtlR.$dest_cd1);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd2, Sls_Dscnt_BulkImp_DtlR.$dest_cd2);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd3, Sls_Dscnt_BulkImp_DtlR.$dest_cd3);
			addColumnPathMap(Sls_Dscnt_DtlR.$slo_no, Sls_Dscnt_BulkImp_DtlR.$slo_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$slo_d_no, Sls_Dscnt_BulkImp_DtlR.$slo_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_no, Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_seq, Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_rev, Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_rev);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_d_no, Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_d_seq, Sls_Dscnt_BulkImp_DtlR.$ref_sls_act_d_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_sls_ac_dt, Sls_Dscnt_BulkImp_DtlR.$base_sls_ac_dt);
			addColumnPathMap(Sls_Dscnt_DtlR.$lot_no, Sls_Dscnt_BulkImp_DtlR.$lot_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$sublot_no, Sls_Dscnt_BulkImp_DtlR.$sublot_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$wtax_rate, Sls_Dscnt_BulkImp_DtlR.$wtax_rate);
			addColumnPathMap(Sls_Dscnt_DtlR.$wtax_amt, Sls_Dscnt_BulkImp_DtlR.$wtax_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_d_rmrks, Sls_Dscnt_BulkImp_DtlR.$trd_d_rmrks);
			addColumnPathMap(Sls_Dscnt_DtlR.$intr_rmrks, Sls_Dscnt_BulkImp_DtlR.$intr_d_rmrks);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char1, Sls_Dscnt_BulkImp_DtlR.$d_sub_char1);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char2, Sls_Dscnt_BulkImp_DtlR.$d_sub_char2);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char3, Sls_Dscnt_BulkImp_DtlR.$d_sub_char3);
			addColumnPathMap(Sls_Dscnt_DtlR.$disp_seq, Sls_Dscnt_BulkImp_DtlR.$disp_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_unit_cd, Sls_Dscnt_BulkImp_DtlR.$base_unit_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_unit_qty, Sls_Dscnt_BulkImp_DtlR.$base_unit_qty);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_std_qty, Sls_Dscnt_BulkImp_DtlR.$trd_unit_std_qty);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_conv_qty, Sls_Dscnt_BulkImp_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(Sls_Dscnt_DtlR.$pack_flg, Sls_Dscnt_BulkImp_DtlR.$pack_flg);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_unit_dec_place, Sls_Dscnt_BulkImp_DtlR.$base_unit_dec_place);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_unit_rnd_typ, Sls_Dscnt_BulkImp_DtlR.$base_unit_rnd_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$stk_mng_typ, Sls_Dscnt_BulkImp_DtlR.$stk_mng_typ);
			addColumnPathMap(Sls_Dscnt_DtlR.$sundry_itm_flg, Sls_Dscnt_BulkImp_DtlR.$sundry_itm_flg);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_jnl_cd, Sls_Dscnt_BulkImp_DtlR.$itm_jnl_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_io_no, Sls_Dscnt_BulkImp_DtlR.$sls_act_io_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_io_seq, Sls_Dscnt_BulkImp_DtlR.$sls_act_io_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$peg_no, Sls_Dscnt_BulkImp_DtlR.$peg_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$dlv_slip_d_no, Sls_Dscnt_BulkImp_DtlR.$dlv_slip_d_no);
		}
	}

	/**
	 * Sls_Dscnt_BulkImp_Ins01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、売上値引情報の登録を行います。<br>
	 */
	public class Sls_Dscnt_BulkImp_Ins01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_BulkImp_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callSls_Dscnt_Ins01();
		}

		/***
		 * 登録呼び出し
		 */
		protected void callSls_Dscnt_Ins01() {
			Sls_Dscnt_Ins01 insOpe = MSBBL_SlsDscntService.crtSls_Dscnt_Ins01();

			MCList<Sls_Dscnt_BulkImp_DtlR>[] grpL = up0().groupList(Sls_Dscnt_BulkImp_DtlR.$hdr_peg_no);
			for (MCList<Sls_Dscnt_BulkImp_DtlR> l : grpL) {
				Sls_Dscnt_BulkImp_DtlR hdrR = l.get(0);

				Sls_Dscnt_HdrR opeUp0R = insOpe.up0().createRow();
				copy(opeUp0R, hdrR, createMap_Sls_Dscnt_HdrR_Sls_Dscnt_BulkImp_DtlR());
				insOpe.up0().add(opeUp0R);

				addAll(insOpe.up1(), l, createMap_Sls_Dscnt_DtlR_Sls_Dscnt_BulkImp_DtlR());
			}

			insOpe.up2().bulk_imp_flg(true);
			insOpe.exec();
		}
	}

	/**
	 * Sls_Dscnt_BulkImp_Chk02オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、売上値引情報の取消前のチェックを行います。<br>
	 */
	public class Sls_Dscnt_BulkImp_Chk02 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_BulkImp_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			doComp();

			callSls_Dscnt_Chk02();

			return msgL;
		}

		@Override
		protected void initUp() {
			super.initUp();

			editUp();
		}

		/***
		 * 上り電文編集
		 */
		protected void editUp() {
			up0().setStatus(Status.DELETE);
			setPegNo(up0());
		}

		/***
		 * 補完処理
		 */
		protected void doComp() {
			// 売上実績ヘッダ取得
			MCList<MST_SLS_ACT_R> slsActL = getSlsActL(up0());

			// 値補完
			MCIndexKey indexKey = slsActL.createIndex(MST_SLS_ACT_R.$sls_act_no);
			for (Sls_Dscnt_BulkImp_DelR destR : up0()) {
				destR.hdr_peg_no(destR.peg_no());

				MCList<MST_SLS_ACT_R> srcL = slsActL.subList(indexKey, destR.sls_act_no());
				if (srcL.isEmpty()) {
					continue;
				}

				srcL.sort(SortType.DESC, MST_SLS_ACT_R.$sls_act_seq);
				MST_SLS_ACT_R srcR = srcL.get(0);
				destR.sls_act_seq(srcR.sls_act_seq());
				destR.can_ac_dt(srcR.ac_dt());
				destR.upd_cntr(srcR.upd_cntr());
			}
		}

		/***
		 * 売上実績ヘッダレコードリスト取得
		 * 
		 * @param srcL 抽出対象リスト
		 * @return 売上実績ヘッダレコードリスト
		 */
		protected MCList<MST_SLS_ACT_R> getSlsActL(MCList<Sls_Dscnt_BulkImp_DelR> srcL) {
			// ワークテーブル登録
			MCList<MST_SLS_ACT_R> wkDbc = MCList.create(MST_SLS_ACT_R.class);
			srcL.groupBy(Sls_Dscnt_DelR.$sls_act_no).forEach(r -> {
				MST_SLS_ACT_R tmpR = wkDbc.createRow();
				tmpR.sls_act_no(r.sls_act_no());
				wkDbc.add(tmpR);
			});
			MCQueryApiBuilder wkDbc_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T"));
			dbWkDelete("MSBBL6240_MSW_SLS_ACT_D02", wkDbc_bldr.getBaseDbc());
			dbWkInsert("MSBBL6240_MSW_SLS_ACT_I02", wkDbc, wkDbc_bldr.getBaseDbc());

			// 売上実績ヘッダ検索
			MCList<MST_SLS_ACT_R> dbc = MCList.create(MST_SLS_ACT_R.class);
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			MSW_SLS_ACT_KEY_R w = MSW_SLS_ACT_KEY_R.create("W");
			dbc_bldr.setSelect(t1.sls_act_no, t1.sls_act_seq, t1.ac_dt, t1.upd_cntr);
			dbc_bldr.addInnerJoin(w, bracket( t1.sls_act_no.eq(w.sls_act_no)));
			dbSelect("MSBBL6240_MST_SLS_ACT_S03", dbc, dbc_bldr);

			return dbc;
		}

		/***
		 * 取消前チェック呼び出し
		 */
		protected void callSls_Dscnt_Chk02() {
			Sls_Dscnt_Chk02 chkOpe = MSBBL_SlsDscntService.crtSls_Dscnt_Chk02();
			addAll(chkOpe.up0(), up0(), createMap_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR());
			chkOpe.exec();

			copyByPegNo(up0(), getDelDestCols(), chkOpe.down0(), getDelSrcCols());
		}

		/***
		 * コピー先（取消）対象項目取得
		 * 
		 * @return コピー先（取消）対象項目
		 */
		protected String[] getDelDestCols() {
			return new String[] {
					Sls_Dscnt_DelR.$sls_act_rev,				// 売上実績改訂番号
					Sls_Dscnt_DelR.$trd_cd,						// 取引ＣＤ
					Sls_Dscnt_DelR.$trd_ptn_typ,				// 取引パタン区分
					Sls_Dscnt_DelR.$dlv_slip_no,				// 納品書ＮＯ
					Sls_Dscnt_DelR.$aprv_flg,					// 承認対象
					Sls_Dscnt_DelR.$aprv_no,					// 承認ＮＯ
					Sls_Dscnt_DelR.$aprv_sts_typ,				// 承認状況区分
					Sls_Dscnt_DelR.$trd_cur_cd,					// 取引通貨ＣＤ
					Sls_Dscnt_DelR.$cst_cd,						// 得意先ＣＤ
					Sls_Dscnt_DelR.$err_flg,					// エラー
			};
		}

		/***
		 * コピー元（取消）対象項目取得
		 * 
		 * @return コピー元（取消）対象項目
		 */
		protected String[] getDelSrcCols() {
			return new String[] {
					Sls_Dscnt_BulkImp_DelR.$sls_act_rev,		// 売上実績改訂番号
					Sls_Dscnt_BulkImp_DelR.$trd_cd,				// 取引ＣＤ
					Sls_Dscnt_BulkImp_DelR.$trd_ptn_typ,		// 取引パタン区分
					Sls_Dscnt_BulkImp_DelR.$dlv_slip_no,		// 納品書ＮＯ
					Sls_Dscnt_BulkImp_DelR.$aprv_flg,			// 承認対象
					Sls_Dscnt_BulkImp_DelR.$aprv_no,			// 承認ＮＯ
					Sls_Dscnt_BulkImp_DelR.$aprv_sts_typ,		// 承認状況区分
					Sls_Dscnt_BulkImp_DelR.$trd_cur_cd,			// 取引通貨ＣＤ
					Sls_Dscnt_BulkImp_DelR.$cst_cd,				// 得意先ＣＤ
					Sls_Dscnt_BulkImp_DelR.$err_flg,			// エラー
			};
		}
	}

	protected Map_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR<Sls_Dscnt_DelR,Sls_Dscnt_BulkImp_DelR> createMap_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR() {
		return new Map_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR<Sls_Dscnt_DelR, Sls_Dscnt_BulkImp_DelR>();
	}

	public class Map_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR<D extends Sls_Dscnt_DelR, S extends Sls_Dscnt_BulkImp_DelR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_DelR.$hdr_peg_no, Sls_Dscnt_BulkImp_DelR.$hdr_peg_no);
			addColumnPathMap(Sls_Dscnt_DelR.$sls_act_no, Sls_Dscnt_BulkImp_DelR.$sls_act_no);
			addColumnPathMap(Sls_Dscnt_DelR.$sls_act_seq, Sls_Dscnt_BulkImp_DelR.$sls_act_seq);
			addColumnPathMap(Sls_Dscnt_DelR.$sls_act_rev, Sls_Dscnt_BulkImp_DelR.$sls_act_rev);
			addColumnPathMap(Sls_Dscnt_DelR.$trd_cd, Sls_Dscnt_BulkImp_DelR.$trd_cd);
			addColumnPathMap(Sls_Dscnt_DelR.$trd_ptn_typ, Sls_Dscnt_BulkImp_DelR.$trd_ptn_typ);
			addColumnPathMap(Sls_Dscnt_DelR.$can_ac_dt, Sls_Dscnt_BulkImp_DelR.$can_ac_dt);
			addColumnPathMap(Sls_Dscnt_DelR.$dlv_slip_no, Sls_Dscnt_BulkImp_DelR.$dlv_slip_no);
			addColumnPathMap(Sls_Dscnt_DelR.$aprv_flg, Sls_Dscnt_BulkImp_DelR.$aprv_flg);
			addColumnPathMap(Sls_Dscnt_DelR.$aprv_no, Sls_Dscnt_BulkImp_DelR.$aprv_no);
			addColumnPathMap(Sls_Dscnt_DelR.$aprv_sts_typ, Sls_Dscnt_BulkImp_DelR.$aprv_sts_typ);
			addColumnPathMap(Sls_Dscnt_DelR.$sls_slip_out_flg, Sls_Dscnt_BulkImp_DelR.$sls_slip_out_flg);
			addColumnPathMap(Sls_Dscnt_DelR.$trd_cur_cd, Sls_Dscnt_BulkImp_DelR.$trd_cur_cd);
			addColumnPathMap(Sls_Dscnt_DelR.$cst_cd, Sls_Dscnt_BulkImp_DelR.$cst_cd);
			addColumnPathMap(Sls_Dscnt_DelR.$upd_cntr, Sls_Dscnt_BulkImp_DelR.$upd_cntr);
			addColumnPathMap(Sls_Dscnt_DelR.$peg_no, Sls_Dscnt_BulkImp_DelR.$peg_no);
		}
	}

	/**
	 * Sls_Dscnt_BulkImp_Del01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、売上値引情報の削除を行います。<br>
	 */
	public class Sls_Dscnt_BulkImp_Del01 extends MSBBL_SlsDscntService_MC_A.Sls_Dscnt_BulkImp_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callSls_Dscnt_Del01();
		}

		/***
		 * 取消呼び出し
		 */
		protected void callSls_Dscnt_Del01() {
			Sls_Dscnt_Del01 delOpe = MSBBL_SlsDscntService.crtSls_Dscnt_Del01();
			addAll(delOpe.up0(), up0(), createMap_Sls_Dscnt_DelR_Sls_Dscnt_BulkImp_DelR());
			delOpe.exec();
		}
	}

	//FMCB CUSTOM END
}