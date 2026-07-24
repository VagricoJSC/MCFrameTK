package mcframe.serverMSBF.MSBFL5020;

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
import mcframe.serverMSBF.MSBFL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSLA.MSLAL6410.InspInstSendIf_Upd01_DtlR;
import mcframe.serverMSLA.MSLAL6410.MSLAL_InspInstSendIfService;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspInstService_MC extends MSBFL_InspInstService_MC_A{
	//FMCB CUSTOM START
	/**
	 * InspInst_Srch01オペレーション.<p>
	 *
	 * 品目検査、品目パタン、品目規格情報を再取得する。<br>
	 */
	public class InspInst_Srch01 extends MSBFL_InspInstService_MC_A.InspInst_Srch01 {
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

			// 品管関連情報の取得
			setMstInfo();

			// 品目検査規格情報の取得
			srchStd();
		}

		/**
		 * 品管関連情報を取得する。
		 */
		protected void setMstInfo() {
			MCList<InspSchd_Srch01_CndR> mstInfoL = srchMstInfo(up0());

			if (mstInfoL.isEmpty()) {
				return;
			}

			copy(down0(), mstInfoL.get(0),
					createMap_InspInst_Srch01_RsltR_InspSchd_Srch01_CndR());
			if (!isNull(down0().insp_ptn_cd())) {
				MAM_INSP_PTN_R selectR = MAM_INSP_PTN_R.create("T");
				dbSelectKey("MSBFL5020_MAM_INSP_PTN_S01", selectR,
						MCQueryApiBuilder.create(selectR), down0());
				down0().insp_ptn_nm(selectR.insp_ptn_nm());
			}
		}

		/**
		 * 品目検査規格マスタから規格指図登録用データを取得する。
		 */
		protected void srchStd() {
			if (!MAC_INSP_MTD_TYP.isSPEC(down0().insp_mtd_typ()) || isNull(down0().insp_ptn_cd())) {
				return;
			}

			up0().insp_ptn_cd(down0().insp_ptn_cd());
			
			MCList<MAM_INSP_SPEC_R> dbL = MCList.create(MAM_INSP_SPEC_R.class);
			MAM_INSP_SPEC_R t = MAM_INSP_SPEC_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			crtInspSpecL(up0(), dbL_bldr, t);
			dbSelect("MSBFL5020_MAM_INSP_SPEC_S01", dbL, dbL_bldr);

			addAll(down1(), dbL, createMap_InspInst_Srch01_DtlStdR_MAM_INSP_SPEC_R());
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得を呼び出し、品管関連情報を取得する。
		 * 
		 * @param upR
		 * @return 品管関連情報
		 */
		protected MCList<InspSchd_Srch01_CndR> srchMstInfo(InspInst_Srch01_CndR upR) {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
			cndR.peg_no(MCNumber.ZERO);
			cndR.itm_cd(upR.itm_cd());
			cndR.itm_sub1(upR.itm_sub1());
			cndR.itm_sub2(upR.itm_sub2());
			cndR.itm_sub3(upR.itm_sub3());
			cndR.base_dt(upR.master_dt());
			cndR.mfg_loc_cd(upR.mfg_loc_cd());
			cndR.sppl_cd(upR.sppl_cd());
			cndR.maker_cd(upR.maker_cd());
			cndR.insp_typ(upR.insp_typ());
			cndR.insp_ptn_cd(upR.insp_ptn_cd());
			cndR.to_loc_cd(upR.loc_cd());
			cndR.to_site_cd(upR.to_site_cd());
			cndL.add(cndR);

			return callInspSchdService(cndL);
		}

		/**
		 * 品目検査規格マスタからの抽出条件を設定する。
		 * 
		 * @param upR
		 * @param dbL_bldr 
		 * @param t 
		 * @return
		 */
		protected void crtInspSpecL(InspInst_Srch01_CndR upR, MCQueryApiBuilder dbL_bldr, MAM_INSP_SPEC_R t) {
			MAM_INSP_POINT_R m1 = MAM_INSP_POINT_R.create("M1");
			MAM_UNIT_R m2 = MAM_UNIT_R.create("M2");
			dbL_bldr.addSelect(m1.insp_point_nm);
			dbL_bldr.addSelect(m2.unit_nm);
			dbL_bldr.addLeftOuterJoin(m1, t.insp_point_cd.eq(m1.insp_point_cd));
			dbL_bldr.addLeftOuterJoin(m2, t.unit_cd.eq(m2.unit_cd));
			dbL_bldr.setWhere(t.itm_cd.eq(bind("1")), upR.itm_cd());
			dbL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), upR.itm_sub1());
			dbL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), upR.itm_sub2());
			dbL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), upR.itm_sub3());
			dbL_bldr.addWhereWithAnd(t.insp_ptn_cd.eq(bind("1")), upR.insp_ptn_cd());
			dbL_bldr.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), upR.master_dt());
			dbL_bldr.setOrderByAsc(t.insp_seq);
		}

		protected Map_InspInst_Srch01_RsltR_InspSchd_Srch01_CndR<InspInst_Srch01_RsltR,InspSchd_Srch01_CndR> createMap_InspInst_Srch01_RsltR_InspSchd_Srch01_CndR() {
			return new Map_InspInst_Srch01_RsltR_InspSchd_Srch01_CndR<InspInst_Srch01_RsltR, InspSchd_Srch01_CndR>();
		}

		public class Map_InspInst_Srch01_RsltR_InspSchd_Srch01_CndR<D extends InspInst_Srch01_RsltR, S extends InspSchd_Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Srch01_RsltR.$insp_mtd_typ, InspSchd_Srch01_CndR.$insp_mtd_typ);
				addColumnPathMap(InspInst_Srch01_RsltR.$insp_ptn_cd, InspSchd_Srch01_CndR.$insp_ptn_cd);
				addColumnPathMap(InspInst_Srch01_RsltR.$insp_std_no, InspSchd_Srch01_CndR.$insp_std_no);
				addColumnPathMap(InspInst_Srch01_RsltR.$plnt_aprv_flg, InspSchd_Srch01_CndR.$plnt_aprv_flg);
				addColumnPathMap(InspInst_Srch01_RsltR.$insp_aprv_flg, InspSchd_Srch01_CndR.$insp_aprv_flg);
				addColumnPathMap(InspInst_Srch01_RsltR.$spl_qty, InspSchd_Srch01_CndR.$spl_qty);
				addColumnPathMap(InspInst_Srch01_RsltR.$insp_lt, InspSchd_Srch01_CndR.$insp_lt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!MAC_INSP_MTD_TYP.isTTL(src.insp_mtd_typ())) {
					dest.spl_qty(src.spl_qty());
				}
				if (MAC_INSP_MTD_TYP.isSPEC(src.insp_mtd_typ())) {
					dest.std_req_flg(src.std_req_flg());
					dest.std_cnf_req_flg(src.std_cnf_req_flg());
				}
			}
		}

		protected Map_InspInst_Srch01_DtlStdR_MAM_INSP_SPEC_R<InspInst_Srch01_DtlStdR,MAM_INSP_SPEC_R> createMap_InspInst_Srch01_DtlStdR_MAM_INSP_SPEC_R() {
			return new Map_InspInst_Srch01_DtlStdR_MAM_INSP_SPEC_R<InspInst_Srch01_DtlStdR, MAM_INSP_SPEC_R>();
		}

		public class Map_InspInst_Srch01_DtlStdR_MAM_INSP_SPEC_R<D extends InspInst_Srch01_DtlStdR, S extends MAM_INSP_SPEC_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Srch01_DtlStdR.$insp_seq, MAM_INSP_SPEC_R.$insp_seq);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$insp_point_cd, MAM_INSP_SPEC_R.$insp_point_cd);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$insp_point_nm, MAM_INSP_POINT_R.$insp_point_nm);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$insp_qlqn_typ, MAM_INSP_SPEC_R.$insp_qlqn_typ);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$trd_unit_cd, MAM_INSP_SPEC_R.$unit_cd);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$trd_unit_nm, MAM_UNIT_R.$unit_nm);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$ql_std_val, MAM_INSP_SPEC_R.$ql_std_val);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_int_digit, MAM_INSP_SPEC_R.$qn_int_digit);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_int_frac, MAM_INSP_SPEC_R.$qn_int_frac);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_out_min, MAM_INSP_SPEC_R.$qn_out_min);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$sign_out_min_typ, MAM_INSP_SPEC_R.$sign_out_min_typ);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_in_min, MAM_INSP_SPEC_R.$qn_in_min);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$sign_in_min_typ, MAM_INSP_SPEC_R.$sign_in_min_typ);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$sign_in_max_typ, MAM_INSP_SPEC_R.$sign_in_max_typ);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_in_max, MAM_INSP_SPEC_R.$qn_in_max);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$sign_out_max_typ, MAM_INSP_SPEC_R.$sign_out_max_typ);
				addColumnPathMap(InspInst_Srch01_DtlStdR.$qn_out_max, MAM_INSP_SPEC_R.$qn_out_max);
			}
		}
	}

	/**
	 * InspInst_Chk04オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	public class InspInst_Chk04 extends MSBFL_InspInstService_MC_A.InspInst_Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理
		 */
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();

			// 検査指図情報取得
			MCList<MST_INSP_INST_R> instL = selInspInstL();
			// 検査実績情報取得
			MCList<MST_INSP_ACT_R> instActL = selInspActL();
			// 規格検査実績情報取得
			MCList<MST_STD_INSP_ACT_R> stdActL = selStdInspActL();

			MCIndexKey instIdxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey actIdxkey = instActL.createIndex(MST_INSP_ACT_R.$insp_no);
			MCIndexKey stdIdxkey = stdActL.createIndex(MST_STD_INSP_ACT_R.$insp_no);
			for (InspInst_Chk04_RsltR chkR : up0()) {
				MST_INSP_INST_R instR = instL.getFirst(instIdxkey, chkR.insp_no());
				if (isNull(instR)) {
					continue;
				}

				// 検査状況区分：指図済（承認取消）の場合
				if (MSC_INSP_STS_TYP.isORD(instR.insp_sts_typ())) {
					MST_STD_INSP_ACT_R stdR = stdActL.getFirst(stdIdxkey, chkR.insp_no());
					if (!isNull(stdR)) {
						// 検査承認状況が指図承認済の場合
						if (MSC_INSP_APRV_STS_TYP.isINST_ACPT(instR.insp_aprv_sts_typ())) {
							msgL.add(new MCMessage(chkR, null, MSBFL0025, chkR.insp_no(), toDispGUIIndex(chkR)));
							chkR.err_flg(true);
						}
						else {
							msgL.add(new MCMessage(chkR, null, MSBFL0024, chkR.insp_no(), toDispGUIIndex(chkR)));
							chkR.err_flg(true);
						}
					}
				}
				// 検査状況区分：指図済以外の場合
				else {
					MST_INSP_ACT_R actR = instActL.getFirst(actIdxkey, chkR.insp_no());
					if (!isNull(actR)) {
						msgL.add(new MCMessage(chkR, null, MSBFL0023, chkR.insp_no(), toDispGUIIndex(chkR)));
						chkR.err_flg(true);
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査指図情報を取得する。
		 * 
		 * @return 検査指図情報リスト
		 */
		protected MCList<MST_INSP_INST_R> selInspInstL() {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5020_MST_INSP_INST_S01", instL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());
			return instL;
		}

		/**
		 * 検査実績情報を取得する。
		 * 
		 * @return 検査指図実績リスト
		 */
		protected MCList<MST_INSP_ACT_R> selInspActL() {
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			MCList<MST_INSP_ACT_R> bindL = MCList.create(MST_INSP_ACT_R.class);

			for (InspInst_Chk04_RsltR chkR : up0()) {
				MST_INSP_ACT_R bindR = MST_INSP_ACT_R.create();
				bindR.insp_no(chkR.insp_no());
				bindL.add(bindR);
			}

			dbSelectColumn("MSBFL5020_MST_INSP_ACT_S01", actL,
					MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T")), bindL,
					MST_INSP_ACT_R.$insp_no);

			return actL;
		}

		/**
		 * 規格検査実績情報を取得する。
		 * 
		 * @return 規格検査実績情報リスト
		 */
		protected MCList<MST_STD_INSP_ACT_R> selStdInspActL() {
			MCList<MST_STD_INSP_ACT_R> stdActL = MCList.create(MST_STD_INSP_ACT_R.class);
			MCList<MST_STD_INSP_ACT_R> bindL = MCList.create(MST_STD_INSP_ACT_R.class);

			for (InspInst_Chk04_RsltR chkR : up0()) {
				MST_STD_INSP_ACT_R bindR = MST_STD_INSP_ACT_R.create();
				bindR.insp_no(chkR.insp_no());
				bindL.add(bindR);
			}

			dbSelectColumn("MSBFL5020_MST_STD_INSP_ACT_S01", stdActL,
					MCQueryApiBuilder.create(MST_STD_INSP_ACT_R.create("T")), bindL,
					MST_STD_INSP_ACT_R.$insp_no);

			return stdActL;
		}
	}

	/**
	 * InspInst_Chk05オペレーション.<p>
	 *
	 * 検査指図の更新・取消・承認取消の共通チェック処理<br>
	 */
	public class InspInst_Chk05 extends MSBFL_InspInstService_MC_A.InspInst_Chk05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			checkMain();

			setDown();
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected void checkMain() {
			chkNoSendUpdFlg(up0());
			return;
		}

		/**
		 * 送信後訂正不可フラグのチェックを行う。
		 * 送信後訂正不可かつ、既に送信済の場合はエラーとする。
		 */
		protected void chkNoSendUpdFlg(MCList<InspInst_Chk05_RsltR> upL) {
			MCList<MST_INSP_INST_R> sendOkL = fetchSendOkLWithNoSendUpd(upL);
			MCIndexKey sendOkIdx = sendOkL.createIndex(MST_INSP_INST_R.$insp_no);
			for (InspInst_Chk05_RsltR upR : upL) {
				String inspNo = upR.getStringNE(MST_INSP_INST_R.$insp_no);
				if (!isNull(sendOkL.getFirst(sendOkIdx, inspNo))) {
					MCMessagePool.add(new MCMessage(upR, null, MSBFL0200, inspNo, toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
		}

		/**
		 * 送信後訂正不可かつ送信完了の送受信ＩＦを取得する。
		 */
		protected MCList<MST_INSP_INST_R> fetchSendOkLWithNoSendUpd(MCList<InspInst_Chk05_RsltR> upL) {
			MCList<MST_INSP_INST_R> sendOkL = MCList.create(MST_INSP_INST_R.class);
			if (upL.isEmpty()) {
				return sendOkL;
			}

			MST_INSP_INST_R inspInst = MST_INSP_INST_R.create("INSPINST");
			MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(inspInst);
			PFT_SDRV_IF_R sdrvIf = PFT_SDRV_IF_R.create("SDRVIF");
			sendOkL_bldr.setSelect(inspInst.insp_no);
			sendOkL_bldr.setDistinct();
			sendOkL_bldr.addInnerJoin(sdrvIf, bracket(sdrvIf.attr_char1.eq(inspInst.insp_no)));
			sendOkL_bldr.addWhereWithAnd(inspInst.insp_no.eq(bind("insp_no")));
			sendOkL_bldr.addWhereWithAnd(inspInst.insp_freq.eq(bind("insp_freq")));
			sendOkL_bldr.addConstWhereWithAnd(sdrvIf.not_send_upd_flg.eq(value(true))
					.and(sdrvIf.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value())))
					.and(sdrvIf.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_INST_SEND.value()))));
			dbSelect("MSBCL5020_PFT_SDRV_IF_S01", sendOkL, sendOkL_bldr, upL, null);

			return sendOkL;
		}
	}

	/**
	 * InspInst_Ins01オペレーション.<p>
	 *
	 * 検査指図情報を作成する。<br>
	 */
	public class InspInst_Ins01 extends MSBFL_InspInstService_MC_A.InspInst_Ins01 {
		MCList<MST_INSP_SCHD_R> _updSchdL = MCList.create(MST_INSP_SCHD_R.class);
		MCList<MST_INSP_INST_R> _insInstL = MCList.create(MST_INSP_INST_R.class);
		MCList<MST_STD_INSP_INST_R> _insStdInstL = MCList.create(MST_STD_INSP_INST_R.class);

		// 検査予定（上り電文） 設定済ＦＬＧ
		protected boolean hasSchdUp = false;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 検査指図登録情報作成
			crtInspInstL();

			// 検査予定更新情報編集
			editInspSchdL();

			// 規格検査指図情報作成
			crtStdInspInstL();

			// 登録処理実行
			insMain();

			// ロット情報サービスの区分更新
			callLotUpd05();

			// 受注状況更新
			callSloStsRegServiceIns02(_updSchdL, _insInstL);

			// 受払状況更新
			callIoSchdService(_updSchdL, _insInstL);

			callPushNtc(_insInstL);

			callInspInstSendIfService(_insInstL);
			
			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			up0().sort(InspInst_Ins01_RsltR.$insp_schd_no);
			up0().setValueNE(InspInst_Ins01_RsltR.$insp_sts_typ, MSC_INSP_STS_TYP.ORD.value());

			MCList<MST_INSP_SCHD_R> bindL = null;
			MST_INSP_SCHD_R bindR = null;
			if (isNull(up2())) {
				hasSchdUp = false;

				bindL = MCList.create(MST_INSP_SCHD_R.class);
				for (InspInst_Ins01_RsltR upR : up0()) {
					bindR = MST_INSP_SCHD_R.create();
					bindR.insp_schd_no(upR.insp_schd_no());
					bindL.add(bindR);
				}
				// ＤＢの検査予定情報取得
				_updSchdL = selInspSchdDbL(bindL);

			}
			else {
				hasSchdUp = true;

				bindL = MCList.create(MST_INSP_SCHD_R.class);
				for (InspInst_Ins01_RsltSchdR upR : up2()) {
					bindR = MST_INSP_SCHD_R.create();
					bindR.insp_schd_no(upR.insp_schd_no());
					bindL.add(bindR);
				}
				// ＤＢの検査予定情報取得
				_updSchdL = selInspSchdDbL(bindL);
			}

			// 上り電文補完
			compUpData();

			// 品管マスタ関連情報取得
			MCList<InspSchd_Srch01_CndR> mstRsltL = callInspSchdService(crtInspSchdSrch01Cnd());

			String[] destCols = new String[] {InspInst_Ins01_RsltR.$std_req_flg, InspInst_Ins01_RsltR.$std_cnf_req_flg, 
					InspInst_Ins01_RsltR.$insp_aprv_flg, InspInst_Ins01_RsltR.$insp_aprv_role_cd, InspInst_Ins01_RsltR.$inst_rslt_issue_flg};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$std_req_flg, InspSchd_Srch01_CndR.$std_cnf_req_flg, 
					InspSchd_Srch01_CndR.$insp_aprv_flg, InspSchd_Srch01_CndR.$insp_aprv_role_cd, InspSchd_Srch01_CndR.$inst_rslt_issue_flg};
			copyByPegNo(up0(), destCols, mstRsltL, srcCols);
			MCList<InspInst_Ins01_RsltR> aprvSubUpL = up0().subList(InspInst_Ins01_RsltR.$insp_aprv_flg, true);
			if (!aprvSubUpL.isEmpty()) {
				aprvSubUpL.setStringNE(InspInst_Ins01_RsltR.$insp_aprv_sts_typ, MSC_INSP_APRV_STS_TYP.INST_OPN.value());
			}
		}

		/**
		 * 実行処理
		 */
		protected void insMain() {
			// 検査予定更新
			if (!_updSchdL.isEmpty()) {
				MST_INSP_SCHD_R updSchdL_t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder updSchdL_bldr = MCQueryApiBuilder.create(updSchdL_t);
				// 更新項目設定
				editInspSchdLSetStmt(_updSchdL, updSchdL_t, updSchdL_bldr);

				dbUpdateKey("MSBFL5020_MST_INSP_SCHD_U01", _updSchdL, updSchdL_bldr);
			}
			// 検査指図登録
			if (!_insInstL.isEmpty()) {
				dbInsertEx("MSBFL5020_MST_INSP_INST_I01", _insInstL,
						MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")));
			}
			// 規格検査指図登録
			if (!_insStdInstL.isEmpty()) {
				dbInsertEx("MSBFL5020_MST_STD_INSP_INST_I01", _insStdInstL,
						MCQueryApiBuilder.create(MST_STD_INSP_INST_R.create("T")));
			}
		}

		/**
		 * プッシュ通知を実行する。
		 * 
		 * @param instL
		 */
		protected void callPushNtc(MCList<MST_INSP_INST_R> instL) {
			MCList<MST_INSP_INST_R> tmpL = MCList.create(MST_INSP_INST_R.class);
			for (MST_INSP_INST_R instR : instL) {
				if (!isNull(instR.insp_aprv_sts_typ())) {
					tmpL.add(instR);
				}
			}

			if (!tmpL.isEmpty()) {

				MCIndexKey idxkey = tmpL.createIndex(MST_INSP_INST_R.$insp_aprv_role_cd,
						MST_INSP_INST_R.$inst_dt);
				for (MST_INSP_INST_R instR : tmpL.groupBy(
						MST_INSP_INST_R.$insp_aprv_role_cd, MST_INSP_INST_R.$inst_dt)) {
					int cnt = tmpL
							.subList(idxkey, instR.insp_aprv_role_cd(), instR.inst_dt())
							.size();
					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MAUCL_PushNtcInfo info = mgr
							.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RQST);
					info.setMsg(new MCMessage(MSBFL0086, cnt));
					info.addAprvRole(instR.insp_aprv_role_cd(),
							nvl(instR.inst_dt(), getToday()));
					info.addScrBind(MSC_INSP_INST_LIST_REG_OPE.OPE_APRV.value());

					mgr.exec();
				}
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			// 定数名設定
			putNames();

			// 検査指図
			down0().setAll(up0());

			// 規格検査指図
			down1().setAll(up1());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_INSP_STS_TYP.putNameNE(up0(), InspInst_Ins01_RsltR.$insp_sts_typ, InspInst_Ins01_RsltR.$insp_sts_typ_nm, getUsrLocale());
			MSC_INSP_APRV_STS_TYP.putNameNE(up0(), InspInst_Ins01_RsltR.$insp_aprv_sts_typ, InspInst_Ins01_RsltR.$insp_aprv_sts_typ_nm, getUsrLocale());
		}

		/**
		 * ＤＢの検査予定情報を取得する。
		 * 
		 * @param bindL 検査条件
		 * @return 検査予定情報
		 */
		protected MCList<MST_INSP_SCHD_R> selInspSchdDbL(MCList<MST_INSP_SCHD_R> bindL) {

			MCList<MST_INSP_SCHD_R> inspSchdDbL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder inspSchdDbL_bldr = MCQueryApiBuilder.create(t);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_SUNDRY_ITM_R m2 = MAM_SUNDRY_ITM_R.create("M2");
			MAM_LOC_R m3 = MAM_LOC_R.create("M3");
			inspSchdDbL_bldr.addSelect(
					decode(m1.sundry_itm_flg, value(true), m2.itm_nm, nullValue()).as("itm_nm"));
			inspSchdDbL_bldr.addSelect(m1.sublot_mng_typ);
			inspSchdDbL_bldr.addSelect(m3.site_cd.as("to_site_cd"));

			inspSchdDbL_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3)));
			inspSchdDbL_bldr.addLeftOuterJoin(m2, t.itm_cd.eq(m2.itm_cd)
							.and(t.itm_sub1.eq(m2.itm_sub1))
							.and(t.itm_sub2.eq(m2.itm_sub2))
							.and(t.itm_sub3.eq(m2.itm_sub3))
							.and(t.sno1.eq(m2.sno1))
							.and(t.sno2.eq(m2.sno2))
							.and(t.sno3.eq(m2.sno3))
							.and(t.sno4.eq(m2.sno4)));
			inspSchdDbL_bldr.addLeftOuterJoin(m3, t.loc_cd.eq(m3.loc_cd));
			dbSelectColumn("MSBFL5020_MST_INSP_SCHD_S01", inspSchdDbL, inspSchdDbL_bldr, bindL,
					MST_INSP_SCHD_R.$insp_schd_no);

			return inspSchdDbL;
		}

		/**
		 * データ補完<br>
		 * 
		 * ＤＢから取得した検査予定情報で上り電文に補完する。
		 */
		protected void compUpData() {
			MCIndexKey indkey = _updSchdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MST_INSP_SCHD_R schdR = null;
			for (InspInst_Ins01_RsltR upR : up0()) {
				if (hasSchdUp) {
					schdR = _updSchdL.get(0);
				}
				else {
					schdR = _updSchdL.getFirst(indkey, upR.insp_schd_no());
				}
				upR.src_no1(schdR.src_no1());
				upR.src_no2(schdR.src_no2());
				upR.insp_typ(schdR.insp_typ());
				upR.itm_cd(schdR.itm_cd());
				upR.itm_sub1(schdR.itm_sub1());
				upR.itm_sub2(schdR.itm_sub2());
				upR.itm_sub3(schdR.itm_sub3());
				upR.itm_nm(schdR.getStringNE(InspInst_Ins01_RsltR.$itm_nm));
				upR.lot_no(nvl(schdR.lot_no(), MAC_STR.NULL_VAL.value()));
				upR.sublot_no(nvl(schdR.sublot_no(), MAC_STR.NULL_VAL.value()));
				upR.own_insp_no(schdR.own_insp_no());
				upR.insp_bind_typ(schdR.insp_bind_typ());
				upR.sublot_mng_typ(schdR.getStringNE(InspInst_Ins01_RsltR.$sublot_mng_typ));
				if (MAC_SUBLOT_MNG_TYP.isSTK(upR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				upR.lmt_up_flg(schdR.lmt_up_flg());
				upR.mfg_loc_cd(schdR.mfg_loc_cd());
				upR.sppl_cd(schdR.sppl_cd());
				upR.maker_cd(schdR.maker_cd());
				upR.from_site_cd(schdR.from_site_cd());
				upR.to_site_cd(schdR.getStringNE(InspInst_Ins01_RsltR.$to_site_cd));
				if (isNull(upR.master_dt())) {
					upR.master_dt(schdR.master_dt());
				}
			}
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 */
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			for (MST_INSP_INST_R r : _insInstL) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(r.insp_typ());
				oR.lmt_up_flg(r.lmt_up_flg());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				oR.plnt_aprv_sts_typ(getPlntAprvStsTyp(r));
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(true);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 受注状況更新サービスの受注状況更新（手配ＮＯ）を呼び出す。
		 * 
		 * @param schdL
		 * @param instL
		 */
		protected void callSloStsRegServiceIns02(MCList<MST_INSP_SCHD_R> schdL,
				MCList<MST_INSP_INST_R> instL) {
			MSBBL_SloStsRegService.SloSts_Ins02 ope = MSBBL_SloStsRegService
					.crtSloSts_Ins02();

			MCIndexKey idxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
			MST_INSP_INST_R instR = null;
			for (MST_INSP_SCHD_R schdR : schdL) {

				instR = instL.getFirst(idxkey, schdR.insp_no());

				SloSts_DtlR dtlR = SloSts_DtlR.create();

				copy(dtlR, schdR, createMap_SloSts_DtlR_MST_INSP_SCHD_R());
				dtlR.unit_cd(schdR.base_unit_cd());
				dtlR.qty(schdR.base_unit_qty());
				dtlR.biz_tm(instR.inst_dt());
				dtlR.st_schd_tm(instR.st_tm());
				dtlR.end_schd_tm(instR.end_tm());
				dtlR.slo_sts_typ(MSC_SLO_STS_TYP.INSP_INST.value());
				ope.up0().add(dtlR);
			}

			ope.exec();
		}

		protected void callInspInstSendIfService(MCList<MST_INSP_INST_R> inspInstL) {
			MCList<InspInst_Ins01_RsltR> limsL = up0().subList(r -> r.lims_flg());
			if (limsL.isEmpty()) {
				return;
			}
			
			MSLAL_InspInstSendIfService.InspInstSendIf_Upd01 ope = MSLAL_InspInstSendIfService.crtInspInstSendIf_Upd01();
			
			setAll(ope.up0(), crtSendIfL(inspInstL, limsL), createMap_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R());

			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected MCList<MST_INSP_INST_R> crtSendIfL(MCList<MST_INSP_INST_R> inspInstL, MCList<InspInst_Ins01_RsltR> limsL) {
			MCIndexKey inspInstIdxKey = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			MCList<MST_INSP_INST_R> sendIfL = MCList.create(MST_INSP_INST_R.class);
			
			for (InspInst_Ins01_RsltR limsR : limsL) {
				MST_INSP_INST_R instR = inspInstL.getFirst(inspInstIdxKey, limsR.insp_no());
				// 検査承認対象の場合は、承認時に送信する
				if (instR.insp_aprv_flg()) {
					continue;
				}

				if (MSC_INSP_STS_TYP.isORD(instR.insp_sts_typ())) {
					instR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
					sendIfL.add(instR);
				}
			}
			return sendIfL;
		}

		/**
		 * 検査予定の更新情報を編集する。
		 */
		protected void editInspSchdL() {
			MCIndexKey idxkey = _insInstL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey schdIdxkey = null;
			if (hasSchdUp) {
				schdIdxkey = up2().createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			}
			for (MST_INSP_SCHD_R updR : _updSchdL) {
				MST_INSP_INST_R instR = _insInstL.getFirst(idxkey, updR.insp_no());

				updR.insp_schd_sts_typ(MSC_INSP_STS_TYP.ORD.value());
				// 検査方法区分は全数検査の場合、設定しない
				if (!isNull(instR) && MAC_INSP_MTD_TYP.isTTL(instR.insp_mtd_typ())) {
					updR.smpl_inst_qty(null);
					continue;
				}
				if (hasSchdUp) {
					updR.smpl_inst_qty(up2().getFirst(schdIdxkey, updR.insp_schd_no()).smpl_inst_qty());
				}
				else {
					updR.smpl_inst_qty(updR.smpl_schd_qty());
				}
			}
		}

		/**
		 * 検査指図登録情報を作成する。
		 */
		protected void crtInspInstL() {
			if (hasSchdUp) {
				for (InspInst_Ins01_RsltR upR : up0()) {
					MST_INSP_SCHD_R schdR = _updSchdL.get(0);

					MST_INSP_INST_R instR = MST_INSP_INST_R.create();
					upR.insp_no(getInspNo(upR));
					copy(instR, schdR, createMap_MST_INSP_INST_R_MST_INSP_SCHD_R());
					copy(instR, upR, createMap_MST_INSP_INST_R_InspInst_Ins01_RsltR());
					if (MAC_SUBLOT_MNG_TYP.isSTK(schdR.getStringNE(InspInst_Ins01_RsltR.$sublot_mng_typ))) {
						instR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					instR.itm_nm(schdR.getStringNE(MST_INSP_INST_R.$itm_nm));
					instR.col_schd_flg(false);
					instR.seq(MCNumber.ONE);
					_updSchdL.setValueNE(MST_INSP_SCHD_R.$insp_no, instR.insp_no());
					_updSchdL.setValueNE(MST_INSP_SCHD_R.$own_insp_no, instR.insp_no());
					if (_updSchdL.size() > 1) {
						instR.col_schd_flg(true);
						instR.pack_unit_qty(_updSchdL.sum(MST_INSP_SCHD_R.$pack_unit_qty));
						instR.base_unit_qty(_updSchdL.sum(MST_INSP_SCHD_R.$base_unit_qty));
					}
					_insInstL.add(instR);
				}
			}
			else {
				// 指図登録情報作成
				MCList<InspInst_Ins01_RsltR> collectList = MCList.create(InspInst_Ins01_RsltR.class);
				for (InspInst_Ins01_RsltR upR : up0()) {
					if (isCollectTgtSchd(upR)) {
						//まとめ対象のリストにadd
						collectList.add(upR);
					}
					else {
						//まとめ対象外の予定は、検査指図コンテナに格納する。
						_insInstL.add(createInstR(upR));
					}
				}
				if (!collectList.isEmpty()) {
					//まとめた結果を検査指図コンテナに格納する。
					_insInstL.addAll(collectSchd(collectList));
				}
			}
		}

		/**
		 * 規格検査指図登録情報を作成する。
		 */
		protected void crtStdInspInstL() {
			if (hasSchdUp) {
				MST_INSP_INST_R instR = _insInstL.get(0);
				for (InspInst_Ins01_RsltStdR upR : up1()) {
					MST_STD_INSP_INST_R stdR = MST_STD_INSP_INST_R.create();
					upR.std_insp_inst_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSI));
					copy(stdR, upR, createMap_MST_STD_INSP_INST_R_InspInst_Ins01_RsltStdR());
					stdR.insp_no(instR.insp_no());
					stdR.insp_typ(instR.insp_typ());
					stdR.insp_freq(instR.insp_freq());
					_insStdInstL.add(stdR);
				}
			}
			else {
				for (MST_INSP_INST_R instR : _insInstL) {
					if (MAC_INSP_MTD_TYP.isSPEC(instR.insp_mtd_typ())) {
						MCList<MAM_INSP_SPEC_R> inspSpecL = selInspSpecL(instR);
						if (inspSpecL.isEmpty()) {
							continue;
						}
						_insStdInstL.addAll(crtStdInspInstL(instR, inspSpecL));
					}
				}
			}
		}

		/**
		 * 
		 * 検査指図に対応する検査規格指図登録用のMST_STD_INSP_INST_Lを返す。
		 * @param instR 検査指図のrow
		 * @param specL 検査指図のrowを元に取得したMAM_INSP_SPEC_L
		 * @return
		 */
		protected MCList<MST_STD_INSP_INST_R> crtStdInspInstL(
				MST_INSP_INST_R instR, MCList<MAM_INSP_SPEC_R> specL) {
			
			MCList<MST_STD_INSP_INST_R> stdInstL = MCList.create(MST_STD_INSP_INST_R.class);

			for (MAM_INSP_SPEC_R specR : specL) {
				MST_STD_INSP_INST_R stdInstR = MST_STD_INSP_INST_R.create();

				copy(stdInstR, specR, createMap_MST_STD_INSP_INST_R_MAM_INSP_SPEC_R());
				stdInstR.std_insp_inst_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSI));
				stdInstR.insp_typ(instR.insp_typ());
				stdInstR.insp_no(instR.insp_no());
				stdInstR.insp_freq(instR.insp_freq());
				stdInstR.add_point_flg(false);

				stdInstL.add(stdInstR);
			}

			return stdInstL;
		}

		/**
		 * 検査指図情報に従い、品目検査規格情報を取得する。
		 * 
		 * @param cnd 検査指図情報
		 * @return 品目検査規格情報
		 */
		protected MCList<MAM_INSP_SPEC_R> selInspSpecL(MST_INSP_INST_R cnd) {
			MCList<MAM_INSP_SPEC_R> dbc = MCList.create(MAM_INSP_SPEC_R.class);
			MAM_INSP_SPEC_R t = MAM_INSP_SPEC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), cnd.itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), cnd.itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), cnd.itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), cnd.itm_sub3());
			dbc_bldr.addWhereWithAnd(t.insp_ptn_cd.eq(bind("1")), cnd.insp_ptn_cd());
			dbc_bldr.addWhereWithAnd(bind("1").between(t.st_dt, t.end_dt), cnd.master_dt());

			dbSelect("MSBFL5020_MAM_INSP_SPEC_S02", dbc, dbc_bldr);

			return dbc;
		}

		/**
		 * 検査予定のまとめ処理を行い、まとめた結果の検査指図コンテナを返す
		 * @param collectList まとめ対象のリスト
		 * @return
		 */
		protected MCList<MST_INSP_INST_R> collectSchd(MCList<InspInst_Ins01_RsltR> collectList) {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			
			collectList.sort(hdrCols(false));

			InspInst_Ins01_RsltR firstR = collectList.get(0).clone();
			// ダブルカウントを防ぐため、firstRではnullにしておく必要がある。
			MST_INSP_INST_R row = createInstR(firstR);
			row.pack_unit_qty(null);
			row.base_unit_qty(null);
			// 最初の行はinstLにaddしておく
			instL.add(row);

			// 一つ前のrowを保持する変数
			InspInst_Ins01_RsltR prevR = firstR;
			// まとめられた予定の数を保持する変数
			int collectedCnt = 1;
			for (InspInst_Ins01_RsltR r : collectList) {
				MST_INSP_SCHD_R schdR = _updSchdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.insp_schd_no());
				if (isColSame(r, prevR, hdrCols(MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())))) {
					// 一つ前の行とまとめることができる場合の処理。(又は最初の行の場合)
					MST_INSP_INST_R lastR = instL.get(instL.size()-1);
					// 後で検査予定の検査ＮＯを更新するので、検査ＮＯを上り電文のrowに設定しておく
					schdR.insp_no(lastR.insp_no());
					r.insp_no(lastR.insp_no());

					if (collectedCnt > 1) {
						lastR.col_schd_flg(true);
					}

					lastR.insp_aprv_flg(getInspAprvFlg(lastR, r));
					lastR.pack_unit_qty(MCNumber.sum(lastR.pack_unit_qty(), schdR.pack_unit_qty()));
					lastR.base_unit_qty(MCNumber.sum(lastR.base_unit_qty(), schdR.base_unit_qty()));
					lastR.st_tm(getMinMCDate(lastR.st_tm(), r.st_tm()));
					lastR.end_tm(getMaxMCDate(lastR.end_tm(), r.end_tm()));
					lastR.master_dt(getMaxMCDate(lastR.master_dt(), r.master_dt()));
					
					collectedCnt++;
				}
				else {
					// 一つ前の行とまとめることができない場合の処理
					instL.add(createInstR(r));
					collectedCnt = 1;
				}
				prevR = r;
			}
			return instL;
		}

		/**
		 * DB登録用の検査指図コンテナへaddするためのMST_INSP_INST_Rを返す。<br>
		 * 検査ＮＯの発番も本メソッドで行う。
		 * @param r 上り電文コンテナ
		 * @return
		 */
		protected MST_INSP_INST_R createInstR(InspInst_Ins01_RsltR r) {

			MST_INSP_INST_R instR = MST_INSP_INST_R.create();

			MST_INSP_SCHD_R schdR = _updSchdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.insp_schd_no());
			r.insp_no(getInspNo(r));
			schdR.insp_no(r.insp_no());
			copy(instR, schdR, createMap_MST_INSP_INST_R_MST_INSP_SCHD_R());
			copy(instR, r, createMap_MST_INSP_INST_R_InspInst_Ins01_RsltR());
			instR.itm_nm(schdR.getStringNE(MST_INSP_INST_R.$itm_nm));
			instR.seq(MCNumber.ONE);
			if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
				instR.sublot_no(MAC_STR.NULL_VAL.value());
			}

			return instR;
		}

		/**
		 * 検査ＮＯ発番し、引数として渡された上り電文のrowに設定する。
		 * @param 上り電文のrow
		 */
		protected String getInspNo(InspInst_Ins01_RsltR r) {
			ElmArgsR args = ElmArgsR.create();
			args.itm_cd(r.itm_cd());
			args.itm_sub1(r.itm_sub1());
			args.itm_sub2(r.itm_sub2());
			args.itm_sub3(r.itm_sub3());
			args.dpt_cd(r.inst_dpt_cd());
			args.co_cd(getCo().co_cd());
			args.dt(r.inst_dt());
			args.str(r.insp_typ());
			args.site_cd(r.to_site_cd());

			return getNum(MAC_NUM_BIZ_TYP.INSP, args);
		}

		/**
		 * まとめ対象の検査予定かどうかを返す。
		 * @return
		 */
		protected boolean isCollectTgtSchd(InspInst_Ins01_RsltR r) {
			if (!canCollectInspTyp(r)) {
				return false;
			}
			if (isNull(r.insp_bind_typ()) || MAC_INSP_BIND_TYP.isACT(r.insp_bind_typ())) {
				return false;
			}

			return true;
		}

		/**
		 * まとめ可能な検査種類かどうかを返す。
		 * @param r 行
		 * @return
		 */
		protected boolean canCollectInspTyp(InspInst_Ins01_RsltR r) {
			return (MSC_INSP_TYP.isACCPT((r.insp_typ()))
					|| MSC_INSP_TYP.isPRDCT(r.insp_typ()) 
					|| MSC_INSP_TYP.isLOT(r.insp_typ()));
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得の検索条件を設定する。
		 * 
		 * @return 検索条件
		 */
		protected MCList<InspSchd_Srch01_CndR> crtInspSchdSrch01Cnd() {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			for (InspInst_Ins01_RsltR upR : up0()) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
				copy(cndR, upR, createMap_InspSchd_Srch01_CndR_InspInst_Ins01_RsltR());
				cndL.add(cndR);
			}

			return cndL;
		}

		/**
		 * 本メソッドで返される配列に含まれるカラムパスの値が
		 * 異なる検査予定はまとめ対象とならない。
		 * 
		 * @param isDelSublotFlg サブロットＮＯが含まないＦＬＧ
		 * @return
		 */
		protected String[] hdrCols(boolean isDelSublotFlg) {
			// ・まとめ単位に以下を追加（品目品管マスタのキー項目です。）
			//  製造場所ＣＤ、発注先ＣＤ、メーカＣＤ、工場・物流倉庫ＣＤ、出荷元工場・物流倉庫ＣＤ
			if (isDelSublotFlg) {
				return new String[]{
						InspInst_Ins01_RsltR.$insp_freq,
						InspInst_Ins01_RsltR.$src_no1,
						InspInst_Ins01_RsltR.$src_no2,
						InspInst_Ins01_RsltR.$insp_typ,
						InspInst_Ins01_RsltR.$insp_mtd_typ,
						InspInst_Ins01_RsltR.$itm_cd,
						InspInst_Ins01_RsltR.$itm_sub1,
						InspInst_Ins01_RsltR.$itm_sub2,
						InspInst_Ins01_RsltR.$itm_sub3,
						InspInst_Ins01_RsltR.$itm_nm,
						InspInst_Ins01_RsltR.$lot_no,
						InspInst_Ins01_RsltR.$own_insp_no,
						//以下マスタの値(異なるマスタを採用した検査予定はまとめの対象としないために必要)
						//※検査指図登録(単票の画面)ではマスタの適用日が一つに決まるため、
						//マスタから取得した項目が同一かどうかのチェックを行っていないが、
						//一括指図では、検査予定のマスタ適用日が一つに決まらず、
						//異なるマスタ値を採用する可能性があるため、以下の項目もチェック対象に加えている。
						InspInst_Ins01_RsltR.$insp_bind_typ,
						InspInst_Ins01_RsltR.$insp_ptn_cd,
						InspInst_Ins01_RsltR.$insp_std_no,
						InspInst_Ins01_RsltR.$insp_aprv_flg,
						InspInst_Ins01_RsltR.$std_req_flg,
						InspInst_Ins01_RsltR.$std_cnf_req_flg,
						InspInst_Ins01_RsltR.$lmt_up_flg,
						InspInst_Ins01_RsltR.$mfg_loc_cd,
						InspInst_Ins01_RsltR.$sppl_cd,
						InspInst_Ins01_RsltR.$maker_cd,
						InspInst_Ins01_RsltR.$from_site_cd,
						InspInst_Ins01_RsltR.$to_site_cd
				};
			}

			return new String[]{
					InspInst_Ins01_RsltR.$insp_freq,
					InspInst_Ins01_RsltR.$src_no1,
					InspInst_Ins01_RsltR.$src_no2,
					InspInst_Ins01_RsltR.$insp_typ,
					InspInst_Ins01_RsltR.$insp_mtd_typ,
					InspInst_Ins01_RsltR.$itm_cd,
					InspInst_Ins01_RsltR.$itm_sub1,
					InspInst_Ins01_RsltR.$itm_sub2,
					InspInst_Ins01_RsltR.$itm_sub3,
					InspInst_Ins01_RsltR.$itm_nm,
					InspInst_Ins01_RsltR.$lot_no,
					InspInst_Ins01_RsltR.$sublot_no,
					InspInst_Ins01_RsltR.$own_insp_no,
					//以下マスタの値(異なるマスタを採用した検査予定はまとめの対象としないために必要)
					//※検査指図登録(単票の画面)ではマスタの適用日が一つに決まるため、
					//マスタから取得した項目が同一かどうかのチェックを行っていないが、
					//一括指図では、検査予定のマスタ適用日が一つに決まらず、
					//異なるマスタ値を採用する可能性があるため、以下の項目もチェック対象に加えている。
					InspInst_Ins01_RsltR.$insp_bind_typ,
					InspInst_Ins01_RsltR.$insp_ptn_cd,
					InspInst_Ins01_RsltR.$insp_std_no,
					InspInst_Ins01_RsltR.$insp_aprv_flg,
					InspInst_Ins01_RsltR.$std_req_flg,
					InspInst_Ins01_RsltR.$std_cnf_req_flg,
					InspInst_Ins01_RsltR.$lmt_up_flg,
					InspInst_Ins01_RsltR.$mfg_loc_cd,
					InspInst_Ins01_RsltR.$sppl_cd,
					InspInst_Ins01_RsltR.$maker_cd,
					InspInst_Ins01_RsltR.$from_site_cd,
					InspInst_Ins01_RsltR.$to_site_cd
			};
		}

		/**
		 * r1とr2のうち未来のマスタ適用日をもつrowの検査承認対象FLGを返す。
		 * @param r1
		 * @param r2
		 * @return
		 */
		protected boolean getInspAprvFlg(MST_INSP_INST_R r1, InspInst_Ins01_RsltR r2) {
			if (isNull(r1.master_dt())) return r2.insp_aprv_flg();
			if (isNull(r2.master_dt())) return r1.insp_aprv_flg();
			if (r1.master_dt().lt(r2.master_dt())) return r2.insp_aprv_flg();
			return r1.insp_aprv_flg();
		}

		/**
		 * d1とd2のうち未来の日付を返す。両方nullの場合はnullを返す。
		 * @param d1
		 * @param d2
		 * @return
		 */
		protected MCDate getMaxMCDate(MCDate d1, MCDate d2) {
			//両方nullの場合はnullが返るので注意
			if (isNull(d1)) return d2;
			if (isNull(d2)) return d1;
			if (d1.lt(d2)) return d2;
			return d1;
		}

		/**
		 * d1とd2のうち過去の日付を返す。両方nullの場合はnullを返す。
		 * @param d1
		 * @param d2
		 * @return
		 */
		protected MCDate getMinMCDate(MCDate d1, MCDate d2) {
			//両方nullの場合はnullが返るので注意
			if (isNull(d1)) return d2;
			if (isNull(d2)) return d1;
			if (d1.lt(d2)) return d1;
			return d2;
		}

		protected Map_InspSchd_Srch01_CndR_InspInst_Ins01_RsltR<InspSchd_Srch01_CndR,InspInst_Ins01_RsltR> createMap_InspSchd_Srch01_CndR_InspInst_Ins01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_InspInst_Ins01_RsltR<InspSchd_Srch01_CndR, InspInst_Ins01_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_InspInst_Ins01_RsltR<D extends InspSchd_Srch01_CndR, S extends InspInst_Ins01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, InspInst_Ins01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, InspInst_Ins01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, InspInst_Ins01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, InspInst_Ins01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, InspInst_Ins01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, InspInst_Ins01_RsltR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, InspInst_Ins01_RsltR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, InspInst_Ins01_RsltR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, InspInst_Ins01_RsltR.$master_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_typ, InspInst_Ins01_RsltR.$insp_typ);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_site_cd, InspInst_Ins01_RsltR.$to_site_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_ptn_cd, InspInst_Ins01_RsltR.$insp_ptn_cd);
			}
		}
	}
	/**
	 * InspInst_Upd01オペレーション.<p>
	 *
	 * 検査指図情報を更新する。<br>
	 */
	public class InspInst_Upd01 extends MSBFL_InspInstService_MC_A.InspInst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 検査指図更新
			MCList<MST_INSP_INST_R> instL = updInspInst();

			// 検査予定更新
			MCList<MST_INSP_SCHD_R> schdL = updInspSchd();

			// 規格検査指図更新
			updStdInspInst(instL);

			// 受注状況更新
			callSloStsRegServiceIns02(schdL, instL);

			// 受払状況更新
			callIoSchdService(schdL, instL);

			callLotUpd05(schdL, instL);

			// プッシュ通知
			callPushNtc();

			callInspInstSendIfService(instL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			up0().sort(InspInst_Upd01_RsltR.$insp_no);

			// DBから検査指図情報を取得し、電文に補完する。
			compInspInstUp();

			// 品管マスタ関連情報取得
			MCList<InspSchd_Srch01_CndR> mstRsltL = callInspSchdService(crtInspSchdSrch01Cnd());

			String[] destCols = new String[] {InspInst_Upd01_RsltR.$std_req_flg, InspInst_Upd01_RsltR.$std_cnf_req_flg, 
					InspInst_Upd01_RsltR.$insp_aprv_flg, InspInst_Upd01_RsltR.$insp_aprv_role_cd, InspInst_Upd01_RsltR.$inst_rslt_issue_flg};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$std_req_flg, InspSchd_Srch01_CndR.$std_cnf_req_flg, 
					InspSchd_Srch01_CndR.$insp_aprv_flg, InspSchd_Srch01_CndR.$insp_aprv_role_cd, InspSchd_Srch01_CndR.$inst_rslt_issue_flg};
			copyByPegNo(up0(), destCols, mstRsltL, srcCols);
		}

		/**
		 * 検査指図情報を取得し、上り電文を補完する。
		 */
		protected void compInspInstUp() {
			MCList<MST_INSP_INST_R> inspInstL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5020_MST_INSP_INST_S02", inspInstL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());

			MCIndexKey idxkey = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			for (InspInst_Upd01_RsltR upR : up0()) {
				MST_INSP_INST_R instR = inspInstL.getFirst(idxkey, upR.insp_no());
				if (isNull(instR)) {
					continue;
				}
				upR.itm_cd(instR.itm_cd());
				upR.itm_sub1(instR.itm_sub1());
				upR.itm_sub2(instR.itm_sub2());
				upR.itm_sub3(instR.itm_sub3());
				upR.insp_typ(instR.insp_typ());
				upR.insp_sts_typ(instR.insp_sts_typ());
				upR.insp_freq(instR.insp_freq());
				upR.old_inst_dt(instR.inst_dt());
				upR.mfg_loc_cd(instR.mfg_loc_cd());
				upR.sppl_cd(instR.sppl_cd());
				upR.maker_cd(instR.maker_cd());
				upR.to_site_cd(instR.to_site_cd());
				upR.old_insp_aprv_flg(instR.insp_aprv_flg());
				upR.old_insp_aprv_role_cd(instR.insp_aprv_role_cd());
				upR.insp_rslt_prnt_flg(instR.insp_rslt_prnt_flg());
				upR.seq(instR.seq());
			}
		}

		/**
		 * 検査予定を更新する。
		 * 
		 * @return
		 */
		protected MCList<MST_INSP_SCHD_R> updInspSchd() {
			MCList<MST_INSP_SCHD_R> inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder inspSchdL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBFL5020_MST_INSP_SCHD_S02", inspSchdL, inspSchdL_bldr, up2());

			MCIndexKey idxkey = up2().createIndex(InspInst_Upd01_RsltSchdR.$insp_schd_no);
			for (MST_INSP_SCHD_R schdR : inspSchdL) {
				schdR.smpl_inst_qty(
						up2().getFirst(idxkey, schdR.insp_schd_no()).smpl_inst_qty());
			}

			inspSchdL_bldr.setSet(t.smpl_inst_qty);
			dbUpdateKey("MSBFL5020_MST_INSP_SCHD_U02", inspSchdL, inspSchdL_bldr);

			return inspSchdL;
		}

		/**
		 * 検査指図を更新する。
		 * 
		 * return 更新後の検査指図情報
		 */
		protected MCList<MST_INSP_INST_R> updInspInst() {
			MCList<MST_INSP_INST_R> updInstL = MCList.create(MST_INSP_INST_R.class);
			
			for (InspInst_Upd01_RsltR upR : up0()) {
				MST_INSP_INST_R instR = MST_INSP_INST_R.create();

				copy(instR, upR, createMap_MST_INSP_INST_R_InspInst_Upd01_RsltR());

				// 検査方法区分は全数検査の場合
				if (MAC_INSP_MTD_TYP.isTTL(upR.insp_mtd_typ())) {
					instR.std_req_flg(false);
					instR.std_cnf_req_flg(false);
				}
				updInstL.add(instR);
			}

			if (!updInstL.isEmpty()) {
				MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updInstL_bldr = MCQueryApiBuilder.create(t);
				editInspInstLSetStmt(updInstL, t, updInstL_bldr);
				dbUpdateKey("MSBFL5020_MST_INSP_INST_U01", updInstL, updInstL_bldr);
			}

			return updInstL;
		}
		

		/**
		 * 受注状況更新サービスの受注状況更新（手配ＮＯ）を呼び出す。
		 * 
		 * @param schdL
		 * @param instL
		 */
		protected void callSloStsRegServiceIns02(MCList<MST_INSP_SCHD_R> schdL,
				MCList<MST_INSP_INST_R> instL) {
			MSBBL_SloStsRegService.SloSts_Ins02 ope = MSBBL_SloStsRegService
					.crtSloSts_Ins02();

			MCIndexKey idxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
			MST_INSP_INST_R instR = null;
			for (MST_INSP_SCHD_R schdR : schdL) {

				instR = instL.getFirst(idxkey, schdR.insp_no());

				SloSts_DtlR dtlR = SloSts_DtlR.create();

				copy(dtlR, schdR, createMap_SloSts_DtlR_MST_INSP_SCHD_R());
				dtlR.unit_cd(schdR.base_unit_cd());
				dtlR.qty(schdR.base_unit_qty());
				dtlR.biz_tm(instR.inst_dt());
				dtlR.st_schd_tm(instR.st_tm());
				dtlR.end_schd_tm(instR.end_tm());
				dtlR.slo_sts_typ(MSC_SLO_STS_TYP.INSP_INST_UPD.value());
				ope.up0().add(dtlR);
			}

			ope.exec();
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 */
		protected void callLotUpd05(MCList<MST_INSP_SCHD_R> schdL, MCList<MST_INSP_INST_R> instL) {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			MCIndexKey idx = schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			
			for (MST_INSP_INST_R r : instL) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				MST_INSP_SCHD_R schdR = schdL.getFirst(idx, r.insp_no());
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(schdR.insp_typ());
				oR.lmt_up_flg(schdR.lmt_up_flg());
				oR.itm_cd(schdR.itm_cd());
				oR.itm_sub1(schdR.itm_sub1());
				oR.itm_sub2(schdR.itm_sub2());
				oR.itm_sub3(schdR.itm_sub3());
				oR.lot_no(schdR.lot_no());
				oR.sublot_no(schdR.sublot_no());
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				oR.plnt_aprv_sts_typ(getPlntAprvStsTyp(r));
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(true);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			MCList<InspInst_Upd01_RsltR> insL = MCList.create(InspInst_Upd01_RsltR.class);
			MCList<InspInst_Upd01_RsltR> delL = MCList.create(InspInst_Upd01_RsltR.class);

			for (InspInst_Upd01_RsltR upR : up0()) {
				if (upR.insp_aprv_flg() || upR.old_insp_aprv_flg()) {
					// 承認役割が変わった場合
					if(!isSame(upR.old_insp_aprv_flg(), upR.insp_aprv_flg()) || !isSame(upR.old_insp_aprv_role_cd(), upR.insp_aprv_role_cd())) {
						if (upR.insp_aprv_flg() && !isNull(upR.insp_aprv_role_cd())) {
							insL.add(upR);
						}
						if (upR.old_insp_aprv_flg() && !isNull(upR.old_insp_aprv_role_cd())) {
							delL.add(upR);
						}
					}
				}
			}

			MCIndexKey oldIdxkey = delL.createIndex(InspInst_Upd01_RsltR.$old_insp_aprv_role_cd, InspInst_Upd01_RsltR.$old_inst_dt);
			for (InspInst_Upd01_RsltR delR : delL.groupBy(InspInst_Upd01_RsltR.$old_insp_aprv_role_cd, InspInst_Upd01_RsltR.$old_inst_dt)) {
				int cnt = delL.subList(oldIdxkey, delR.old_insp_aprv_role_cd(), delR.old_inst_dt()).size();

				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RQST);
				info.setMsg(new MCMessage(MSBFL0087, cnt));
				info.addAprvRole(delR.old_insp_aprv_role_cd(), nvl(delR.old_inst_dt(), getToday()));
				mgr.exec();
			}

			MCIndexKey idxkey = insL.createIndex(InspInst_Upd01_RsltR.$insp_aprv_role_cd, InspInst_Upd01_RsltR.$inst_dt);
			for (InspInst_Upd01_RsltR insR : insL.groupBy(InspInst_Upd01_RsltR.$insp_aprv_role_cd, InspInst_Upd01_RsltR.$inst_dt)) {
				int cnt = insL.subList(idxkey, insR.insp_aprv_role_cd(), insR.inst_dt()).size();

				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RQST);
				info.setMsg(new MCMessage(MSBFL0086, cnt));
				info.addAprvRole(insR.insp_aprv_role_cd(), nvl(insR.inst_dt(), getToday()));
				info.addScrBind(MSC_INSP_INST_LIST_REG_OPE.OPE_APRV.value());

				mgr.exec();
			}
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param updL_bldr 
		 * @param t 
		 */
		protected void editInspInstLSetStmt(MCList<MST_INSP_INST_R> updL, MST_INSP_INST_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.insp_freq);
			updL_bldr.addSet(t.insp_mtd_typ);
			updL_bldr.addSet(t.inst_dt);
			updL_bldr.addSet(t.inst_dpt_cd);
			updL_bldr.addSet(t.inst_usr_cd);
			updL_bldr.addSet(t.master_dt);
			updL_bldr.addSet(t.st_tm);
			updL_bldr.addSet(t.end_tm);
			updL_bldr.addSet(t.insp_ptn_cd);
			updL_bldr.addSet(t.std_req_flg);
			updL_bldr.addSet(t.std_cnf_req_flg);
			updL_bldr.addSet(t.insp_std_no);
			updL_bldr.addSet(t.plnt_aprv_flg);
			updL_bldr.addSet(t.insp_aprv_flg);
			updL_bldr.addSet(t.insp_aprv_role_cd);
			updL_bldr.addSet(t.insp_rslt_prnt_flg);
			updL_bldr.addSet(t.insp_rslt_prnt_tm);
			updL_bldr.addSet(t.seq);
			updL_bldr.addSet(t.lims_flg);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}

		/**
		 * 規格検査指図の登録、更新、削除を行う。
		 * 
		 * @param inspInstL 検査指図情報リスト
		 */
		protected void updStdInspInst(MCList<MST_INSP_INST_R> inspInstL) {
			MCList<MST_STD_INSP_INST_R> insStdL = MCList.create(MST_STD_INSP_INST_R.class);
			MCList<MST_STD_INSP_INST_R> updStdL = MCList.create(MST_STD_INSP_INST_R.class);
			MCList<MST_STD_INSP_INST_R> delStdL = MCList.create(MST_STD_INSP_INST_R.class);

			MCIndexKey idxkey = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			for (InspInst_Upd01_RsltStdR stdUpR : up1()) {
				MST_STD_INSP_INST_R stdR = MST_STD_INSP_INST_R.create();
				if (MAC_DATA_CRUD_TYP.isCRT(stdUpR.data_crud_typ())) {
					MST_INSP_INST_R instR = inspInstL.getFirst(idxkey, stdUpR.insp_no());

					stdUpR.std_insp_inst_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSI));
					copy(stdR, stdUpR, createMap_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR());
					stdR.insp_typ(instR.insp_typ());
					stdR.insp_no(instR.insp_no());
					stdR.insp_freq(instR.insp_freq());

					insStdL.add(stdR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(stdUpR.data_crud_typ())) {
					copy(stdR, stdUpR, createMap_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR());
					updStdL.add(stdR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(stdUpR.data_crud_typ())) {
					stdR.std_insp_inst_no(stdUpR.std_insp_inst_no());
					delStdL.add(stdR);
				}
			}

			// 上り電文として渡されなかった検査規格指図を削除用のdbContainerにaddする。
			addDelNoUpStdL(delStdL);

			if (!insStdL.isEmpty()) {
				dbInsertEx("MSBFL5020_MST_STD_INSP_INST_I02", insStdL,
						MCQueryApiBuilder.create(MST_STD_INSP_INST_R.create("T")));
			}
			if (!updStdL.isEmpty()) {
				// 更新項目設定
				MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
				MCQueryApiBuilder updStdL_bldr = MCQueryApiBuilder.create(t);
				editStdInspInstLSetStmt(updStdL, t, updStdL_bldr);

				dbUpdateKey("MSBFL5020_MST_STD_INSP_INST_U01", updStdL, updStdL_bldr);
			}
			if (!delStdL.isEmpty()) {
				dbDeleteKey("MSBFL5020_MST_STD_INSP_INST_D01", delStdL,
						MCQueryApiBuilder.create(MST_STD_INSP_INST_R.create("T")));
			}
		}

		/**
		 * 上り電文として渡されなかった検査規格指図を削除用のdbContainerにaddする。
		 */
		protected void addDelNoUpStdL(MCList<MST_STD_INSP_INST_R> delStdL) {
			// 検査パタンの変更や抜取規格検査⇒抜取検査の変更等で、
			// 上り電文に含まれない検査規格指図をdeleteするための処理。
			MCList<MST_STD_INSP_INST_R> dbL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);

			dbL_bldr.setSelect(t.std_insp_inst_no);
			dbL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5020_MST_STD_INSP_INST_S01", dbL, dbL_bldr, up0());

			MCIndexKey idxkey = up1()
					.createIndex(InspInst_Upd01_RsltStdR.$std_insp_inst_no);
			for (MST_STD_INSP_INST_R dbR : dbL) {
				MCIndexKey delIdxkey = delStdL
						.createIndex(MST_STD_INSP_INST_R.$std_insp_inst_no);
				if (isNullAnd(up1().getFirst(idxkey, dbR.std_insp_inst_no()),
						delStdL.getFirst(delIdxkey, dbR.std_insp_inst_no()))) {
					delStdL.add(dbR);
				}
			}
		}

		/**
		 * 規格検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param updL_bldr 
		 * @param t 
		 */
		protected void editStdInspInstLSetStmt(MCList<MST_STD_INSP_INST_R> updL,
				MST_STD_INSP_INST_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.insp_seq);
			updL_bldr.addSet(t.insp_point_cd);
			updL_bldr.addSet(t.insp_qlqn_typ);
			updL_bldr.addSet(t.trd_unit_cd);
			updL_bldr.addSet(t.qn_out_min);
			updL_bldr.addSet(t.sign_out_min_typ);
			updL_bldr.addSet(t.qn_in_min);
			updL_bldr.addSet(t.sign_in_min_typ);
			updL_bldr.addSet(t.sign_in_max_typ);
			updL_bldr.addSet(t.qn_in_max);
			updL_bldr.addSet(t.sign_out_max_typ);
			updL_bldr.addSet(t.qn_out_max);
			updL_bldr.addSet(t.qn_int_digit);
			updL_bldr.addSet(t.qn_int_frac);
			updL_bldr.addSet(t.ql_std_val);
			updL_bldr.addSet(t.add_point_flg);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}

		protected void callInspInstSendIfService(MCList<MST_INSP_INST_R> inspInstL) {
			MCList<InspInst_Upd01_RsltR> limsL = up0().subList(r -> r.lims_flg());
			if (limsL.isEmpty()) {
				return;
			}

			MSLAL_InspInstSendIfService.InspInstSendIf_Upd01 ope = MSLAL_InspInstSendIfService.crtInspInstSendIf_Upd01();
			setAll(ope.up0(), crtSendIfL(inspInstL, limsL), createMap_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R());
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected MCList<MST_INSP_INST_R> crtSendIfL(MCList<MST_INSP_INST_R> inspInstL, MCList<InspInst_Upd01_RsltR> limsL) {
			MCIndexKey inspInstIdxKey = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			MCList<MST_INSP_INST_R> sendIfL = MCList.create(MST_INSP_INST_R.class);
			
			// 過去の検査送信ＩＦ情報取得
			MCList<MST_INSP_INST_SEND_IF_R> inspInstSendIfL = getInspInstSendIf(inspInstL);
			MCIndexKey sendIfIdxKey = inspInstSendIfL.createIndex(MST_INSP_INST_SEND_IF_R.$insp_no, MST_INSP_INST_SEND_IF_R.$insp_freq);
			
			for (InspInst_Upd01_RsltR limsR : limsL) {
				MST_INSP_INST_R instR = inspInstL.getFirst(inspInstIdxKey, limsR.insp_no());
				// 検査承認対象の場合は、承認時に送信する
				if (instR.insp_aprv_flg()) {
					continue;
				}
				String strCrudTyp = null;
				if (MSC_INSP_STS_TYP.isORD(instR.insp_sts_typ())) {
					MST_INSP_INST_SEND_IF_R inspInstSendIfR = inspInstSendIfL.getFirst(sendIfIdxKey, instR.insp_no(), instR.insp_freq());
					if (isNull(inspInstSendIfR) || MAC_DATA_CRUD_TYP.isDEL(inspInstSendIfR.data_crud_typ())) {
						// 過去の検査送信ＩＦが存在しない、または更新区分が削除の場合は、新規
						strCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
					}
					else {
						strCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
					}
				}

				if (!isNull(strCrudTyp)) {
					instR.setStringNE("data_crud_typ", strCrudTyp);
					sendIfL.add(instR);
				}
			}
			return sendIfL;
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
			// 規格検査指図
			down1().addAll(up1());
		}
		/**
		 * 検査予定登録サービスの品管関連マスタ取得の検索条件を設定する。
		 * 
		 * @return 検索条件
		 */
		protected MCList<InspSchd_Srch01_CndR> crtInspSchdSrch01Cnd() {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			addAll(cndL, up0(), createMap_InspSchd_Srch01_CndR_InspInst_Upd01_RsltR());;

			return cndL;
		}

		protected Map_InspSchd_Srch01_CndR_InspInst_Upd01_RsltR<InspSchd_Srch01_CndR,InspInst_Upd01_RsltR> createMap_InspSchd_Srch01_CndR_InspInst_Upd01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_InspInst_Upd01_RsltR<InspSchd_Srch01_CndR, InspInst_Upd01_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_InspInst_Upd01_RsltR<D extends InspSchd_Srch01_CndR, S extends InspInst_Upd01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, InspInst_Upd01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, InspInst_Upd01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, InspInst_Upd01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, InspInst_Upd01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, InspInst_Upd01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, InspInst_Upd01_RsltR.$master_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_typ, InspInst_Upd01_RsltR.$insp_typ);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, InspInst_Upd01_RsltR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, InspInst_Upd01_RsltR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, InspInst_Upd01_RsltR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_site_cd, InspInst_Upd01_RsltR.$to_site_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_ptn_cd, InspInst_Upd01_RsltR.$insp_ptn_cd);
			}
		}
	}
	/**
	 * InspInst_Upd02オペレーション.<p>
	 *
	 * 検査指図を承認する。<br>
	 */
	public class InspInst_Upd02 extends MSBFL_InspInstService_MC_A.InspInst_Upd02 {
		MCList<MST_INSP_INST_R> _updL = MCList.create(MST_INSP_INST_R.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 前処理
			prepare();

			// 検査指図承認
			updMain();

			// ロット情報サービスの区分更新
			callLotUpd05();

			// プッシュ通知
			callPushNtc();

			callInspInstSendIfService();

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			up0().sort(InspInst_Upd02_RsltR.$insp_no);
			up0().setStringNE(InspInst_Upd02_RsltR.$insp_aprv_sts_typ, MSC_INSP_APRV_STS_TYP.INST_ACPT.value());
		}

		/**
		 * 検査指図承認を行う。
		 */
		protected void updMain() {

			for (InspInst_Upd02_RsltR rsltR : up0()) {
				MST_INSP_INST_R instR = MST_INSP_INST_R.create();

				copy(instR, rsltR, createMap_MST_INSP_INST_R_InspInst_Upd02_RsltR());

				_updL.add(instR);
			}

			if (!_updL.isEmpty()) {

				MST_INSP_INST_R updL_t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editInspInstLSetStmt(_updL, updL_t, updL_bldr);

				dbUpdateKey("MSBFL5020_MST_INSP_INST_U02", _updL, updL_bldr);
			}
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param _updL_bldr 
		 * @param t 
		 */
		protected void editInspInstLSetStmt(MCList<MST_INSP_INST_R> updL, MST_INSP_INST_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.insp_aprv_sts_typ);
			updL_bldr.addSet(t.aprv_dt);
			updL_bldr.addSet(t.aprv_dpt_cd);
			updL_bldr.addSet(t.aprv_usr_cd);
			updL_bldr.addSet(t.aprv_tm);
			updL_bldr.addSet(t.aprv_rsn);
			updL_bldr.addSet(t.lims_flg);
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 */
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			instL_bldr.setSelect(t.insp_no);
			instL_bldr.addSelect(t.itm_cd);
			instL_bldr.addSelect(t.itm_sub1);
			instL_bldr.addSelect(t.itm_sub2);
			instL_bldr.addSelect(t.itm_sub3);
			instL_bldr.addSelect(t.lot_no);
			instL_bldr.addSelect(t.sublot_no);
			instL_bldr.addSelect(t.insp_typ);
			instL_bldr.addSelect(t.lmt_up_flg);
			dbSelectKey("MSBFL5020_MST_INSP_INST_S03", instL, instL_bldr, up0());
			MCIndexKey idx = instL.createIndex(MST_INSP_INST_R.$insp_no);
			
			for (InspInst_Upd02_RsltR r : up0()) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				MST_INSP_INST_R instR = instL.getFirst(idx, r.insp_no());
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(instR.insp_typ());
				oR.lmt_up_flg(instR.lmt_up_flg());
				oR.itm_cd(instR.itm_cd());
				oR.itm_sub1(instR.itm_sub1());
				oR.itm_sub2(instR.itm_sub2());
				oR.itm_sub3(instR.itm_sub3());
				oR.lot_no(instR.lot_no());
				oR.sublot_no(instR.sublot_no());
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				oR.plnt_aprv_sts_typ(null);
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(true);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5020_MST_INSP_INST_S04", selectL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), _updL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$inst_dpt_cd, MST_INSP_INST_R.$aprv_dt);
			for (MST_INSP_INST_R instR : selectL.groupBy(MST_INSP_INST_R.$inst_dpt_cd, MST_INSP_INST_R.$aprv_dt)) {
				int cnt = selectL.subList(idxkey, instR.inst_dpt_cd(), instR.aprv_dt()).size();
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RESULT);
				info.setMsg(new MCMessage(MSBFL0088, cnt));
				info.addDpt(instR.inst_dpt_cd(), nvl(instR.aprv_dt(), getToday()));
				info.addScrBind(MSC_INSP_INST_LIST_REG_OPE.OPE_REF.value(), false, false, true, false, false, MSC_INSP_APRV_STS_TYP.INST_ACPT.value(), toYMDString(instR.aprv_dt()), toYMDString(instR.aprv_dt()), null, null);

				mgr.exec();
			}
		}

		protected void callInspInstSendIfService() {
			MCList<InspInst_Upd02_RsltR> limsL = up0().subList(r -> r.lims_flg());
			if (limsL.isEmpty()) {
				return;
			}
			
			MSLAL_InspInstSendIfService.InspInstSendIf_Upd01 ope = MSLAL_InspInstSendIfService.crtInspInstSendIf_Upd01();
			setAll(ope.up0(), crtSendIfL(limsL), createMap_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R());

			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected MCList<MST_INSP_INST_R> crtSendIfL(MCList<InspInst_Upd02_RsltR> limsL) {
			MCIndexKey updLIdxKey = _updL.createIndex(MST_INSP_INST_R.$insp_no);
			MCList<MST_INSP_INST_R> sendIfL = MCList.create(MST_INSP_INST_R.class);
			
			for (InspInst_Upd02_RsltR rsltR : limsL) {
				MST_INSP_INST_R instR = _updL.getFirst(updLIdxKey, rsltR.insp_no());

				if (MSC_INSP_APRV_STS_TYP.isINST_ACPT(instR.insp_aprv_sts_typ())) {
					instR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
					sendIfL.add(instR);
				}
			}
			return sendIfL;
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			// 定数名設定
			MSC_INSP_APRV_STS_TYP.putNameNE(up0(), InspInst_Ins01_RsltR.$insp_aprv_sts_typ, InspInst_Ins01_RsltR.$insp_aprv_sts_typ_nm, getUsrLocale());

			down0().addAll(up0());
		}
	}
	/**
	 * InspInst_Del01オペレーション.<p>
	 *
	 * 検査指図を取り消す。<br>
	 */
	public class InspInst_Del01 extends MSBFL_InspInstService_MC_A.InspInst_Del01 {
		MCList<MST_INSP_INST_R> _updL = MCList.create(MST_INSP_INST_R.class);
		MCList<MST_INSP_INST_R> _delL = MCList.create(MST_INSP_INST_R.class);
		MCList<MST_INSP_INST_R> _updPushL = MCList.create(MST_INSP_INST_R.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 前処理
			prepare();
			
			// 検査指図送信ＩＦの登録（指図取消）
			// 各種指図・予定テーブル更新前に実行する
			callInspInstSendIfService(_delL);

			// 検査指図取消
			delMain();

			// 検査指図の承認取消
			updMain();

			// ロット情報サービスの区分更新
			callLotUpd05();

			// プッシュ通知
			callPushNtc();
			
			// 検査指図送信ＩＦの登録（承認取消）
			callInspInstSendIfService(_updL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			// 検査指図情報を取得し、処理対象リストの作成
			crtInspInstL();
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			MCIndexKey idxkey = up0().createIndex(InspInst_Del01_RsltR.$insp_no);
			if (!_updL.isEmpty()) {
				for (MST_INSP_INST_R updR : _updL) {
					InspInst_Del01_RsltR rsltR = up0().getFirst(idxkey, updR.insp_no());
					rsltR.insp_aprv_sts_typ(updR.insp_aprv_sts_typ());
					MSC_INSP_APRV_STS_TYP.putNameNE(rsltR, InspInst_Del01_RsltR.$insp_aprv_sts_typ, InspInst_Del01_RsltR.$insp_aprv_sts_typ_nm, getUsrLocale());
				}
			}
			else {
				for (MST_INSP_INST_R delR : _delL) {
					InspInst_Del01_RsltR rsltR = up0().getFirst(idxkey, delR.insp_no());
					rsltR.insp_sts_typ(MSC_INSP_STS_TYP.YET.value());
					MSC_INSP_STS_TYP.putNameNE(rsltR, InspInst_Del01_RsltR.$insp_sts_typ, InspInst_Del01_RsltR.$insp_sts_typ_nm, getUsrLocale());
				}
			}
			down0().addAll(up0());
		}

		/**
		 * 上り電文により、検査指図処理対象リストを作成する。
		 */
		protected void crtInspInstL() {

			MCList<MST_INSP_INST_R> dbL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5020_MST_INSP_INST_S05", dbL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());

			for (MST_INSP_INST_R dbR : dbL) {
				// 指図承認済の場合
				if (MSC_INSP_APRV_STS_TYP.isINST_ACPT(dbR.insp_aprv_sts_typ())) {
					_updL.add(dbR);
				}
				else {
					_delL.add(dbR);
				}
			}
		}

		/**
		 * 検査指図の取消を行う。
		 */
		protected void delMain() {

			// 検査予定更新
			MCList<MST_INSP_SCHD_R> schdL = updInspSchd();

			// 規格検査指図削除
			delStdInspInst();

			// 検査指図削除
			delInspInst();

			// 受注状況更新
			callSloStsRegServiceIns02(schdL);

			// 受払状況更新
			callIoSchdService(schdL, null);
		}

		/**
		 * 検査指図の承認取消を行う。
		 */
		protected void updMain() {

			// 検査指図の承認取消
			updInspInst();
		}

		/**
		 * 検査指図を削除する。
		 */
		protected void delInspInst() {
			if (!_delL.isEmpty()) {
				dbDeleteKey("MSBFL5020_MST_INSP_INST_D01", _delL,
						MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")));
			}
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 */
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			MCIndexKey updIdx = _updL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey delIdx = _delL.createIndex(MST_INSP_INST_R.$insp_no);
			
			// 品管マスタ関連情報取得
			MCList<InspSchd_Srch01_CndR> itmInspL = callInspSchdService(crtInspSchdSrch01Cnd(up0(), delIdx));
			MCIndexKey itmInspIdx = itmInspL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			
			for (InspInst_Del01_RsltR r : up0()) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				boolean inspInstFlg = false;
				boolean inspInstAprvFlg = false;
				
				InspSchd_Srch01_CndR itmInspR = itmInspL.getFirst(itmInspIdx, r.peg_no());
				
				MST_INSP_INST_R instR = _updL.getFirst(updIdx, r.insp_no());
				if (isNull(instR)) {
					instR = _delL.getFirst(delIdx, r.insp_no());
					inspInstFlg = true;
				}
				else {
					inspInstAprvFlg = true;
				}
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(instR.insp_typ());
				oR.lmt_up_flg(instR.lmt_up_flg());
				oR.itm_cd(instR.itm_cd());
				oR.itm_sub1(instR.itm_sub1());
				oR.itm_sub2(instR.itm_sub2());
				oR.itm_sub3(instR.itm_sub3());
				oR.lot_no(instR.lot_no());
				oR.sublot_no(instR.sublot_no());
				oR.quality_typ(null);
				oR.stk_insp_typ(null);
				if (MSC_INSP_TYP.isLOT(instR.insp_typ()) && instR.lmt_up_flg()) {
					oR.plnt_aprv_sts_typ(null);
				}
				else {
					oR.plnt_aprv_sts_typ(getPlntAprvStsTyp(itmInspR));
				}
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(inspInstFlg);
				oR.insp_inst_aprv_flg(inspInstAprvFlg);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		protected String getPlntAprvStsTyp(InspSchd_Srch01_CndR itmInspR) {
			if (!isNull(itmInspR) && itmInspR.plnt_aprv_flg()) {
				return MSC_PLNT_APRV_STS_TYP.OPN.value();
			}
			return null;
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得の検索条件を設定する。
		 * 
		 * @return 検索条件
		 */
		protected MCList<InspSchd_Srch01_CndR> crtInspSchdSrch01Cnd(MCList<InspInst_Del01_RsltR> upL, MCIndexKey delIdx) {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			for (InspInst_Del01_RsltR upR : upL) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
				MST_INSP_INST_R instR = _delL.getFirst(delIdx, upR.insp_no());
				copy(cndR, instR, createMap_InspSchd_Srch01_CndR_MST_INSP_INST_R());
				cndR.peg_no(upR.peg_no());
				cndL.add(cndR);
			}

			return cndL;
		}

		protected Map_InspSchd_Srch01_CndR_MST_INSP_INST_R<InspSchd_Srch01_CndR,MST_INSP_INST_R> createMap_InspSchd_Srch01_CndR_MST_INSP_INST_R() {
			return new Map_InspSchd_Srch01_CndR_MST_INSP_INST_R<InspSchd_Srch01_CndR, MST_INSP_INST_R>();
		}

		public class Map_InspSchd_Srch01_CndR_MST_INSP_INST_R<D extends InspSchd_Srch01_CndR, S extends MST_INSP_INST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, MST_INSP_INST_R.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, MST_INSP_INST_R.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, MST_INSP_INST_R.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, MST_INSP_INST_R.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, MST_INSP_INST_R.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, MST_INSP_INST_R.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, MST_INSP_INST_R.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, MST_INSP_INST_R.$master_dt);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_typ, MST_INSP_INST_R.$insp_typ);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_site_cd, MST_INSP_INST_R.$to_site_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$insp_ptn_cd, MST_INSP_INST_R.$insp_ptn_cd);
			}
		}

		protected void callInspInstSendIfService(MCList<MST_INSP_INST_R> targetList) {
			MCList<InspInst_Del01_RsltR> limsL = up0().subList(r -> r.lims_flg());
			if (limsL.isEmpty() || targetList.isEmpty()) {
				return;
			}

			MSLAL_InspInstSendIfService.InspInstSendIf_Upd01 ope = MSLAL_InspInstSendIfService.crtInspInstSendIf_Upd01();
			setAll(ope.up0(), crtSendIfL(targetList, limsL), createMap_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R());

			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected MCList<MST_INSP_INST_R> crtSendIfL(MCList<MST_INSP_INST_R> inspInstL, MCList<InspInst_Del01_RsltR> limsL) {
			MCIndexKey inspInstIdxKey = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			MCList<MST_INSP_INST_R> sendIfL = MCList.create(MST_INSP_INST_R.class);
			
			// 過去の検査送信ＩＦ情報取得
			MCList<MST_INSP_INST_SEND_IF_R> oldSendIfL = getInspInstSendIf(inspInstL);
			MCIndexKey idxKeySendIf = oldSendIfL.createIndex(MST_INSP_INST_SEND_IF_R.$insp_no, MST_INSP_INST_SEND_IF_R.$insp_freq);
			
			for (InspInst_Del01_RsltR rsltR : limsL) {
				MST_INSP_INST_R inspInstR = inspInstL.getFirst(inspInstIdxKey, rsltR.insp_no());

				String strCrudTyp = setDataCrudTyp(inspInstR);

				MST_INSP_INST_SEND_IF_R sendIfR = oldSendIfL.getFirst(idxKeySendIf, inspInstR.insp_no(), inspInstR.insp_freq());
				if (isNull(sendIfR) || MAC_DATA_CRUD_TYP.isDEL(sendIfR.data_crud_typ())) {
					// 過去の検査送信ＩＦが存在しない、または更新区分が「削除」の場合は、送信対象外
					continue;
				}

				if (!isNull(strCrudTyp)) {
					inspInstR.setStringNE("data_crud_typ", strCrudTyp);
					sendIfL.add(inspInstR);
				}
			}
			return sendIfL;
		}

		protected String setDataCrudTyp(MST_INSP_INST_R inspInstR) {
			if (inspInstR.insp_aprv_flg()) {
				if (MSC_INSP_APRV_STS_TYP.isINST_OPN(inspInstR.insp_aprv_sts_typ())) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
			}
			else {
				if (MSC_INSP_STS_TYP.isJDG(inspInstR.insp_sts_typ()) || MSC_INSP_STS_TYP.isORD(inspInstR.insp_sts_typ())) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
			}
			return null;
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			if (!_updL.isEmpty()) {
				MCIndexKey idxkey = _updPushL.createIndex(MST_INSP_INST_R.$inst_dpt_cd, MST_INSP_INST_R.$aprv_dt);
				for (MST_INSP_INST_R instR : _updPushL.groupBy(MST_INSP_INST_R.$inst_dpt_cd, MST_INSP_INST_R.$aprv_dt)) {
					int cnt = _updPushL.subList(idxkey, instR.inst_dpt_cd(), instR.aprv_dt()).size();

					MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
					MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RESULT);
					info.setMsg(new MCMessage(MSBFL0089, cnt));
					info.addDpt(instR.inst_dpt_cd(), nvl(instR.aprv_dt(), getToday()));
					info.addScrBind(MSC_INSP_INST_LIST_REG_OPE.OPE_REF.value(), false, false, true, false, false, MSC_INSP_APRV_STS_TYP.INST_OPN.value(), null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));

					mgr.exec();
				}
			}
			else if (!_delL.isEmpty()) {
				MCList<MST_INSP_INST_R> tmp = _delL.subList(MST_INSP_INST_R.$insp_aprv_flg, true);
				if (!tmp.isEmpty()) {
					MCIndexKey idxkey = tmp.createIndex(MST_INSP_INST_R.$insp_aprv_role_cd, MST_INSP_INST_R.$inst_dt);
					for (MST_INSP_INST_R instR : tmp.groupBy(MST_INSP_INST_R.$insp_aprv_role_cd, MST_INSP_INST_R.$inst_dt)) {
						int cnt = tmp.subList(idxkey, instR.insp_aprv_role_cd(), instR.inst_dt()).size();
						
						MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
						MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_APRV_RQST);
						info.setMsg(new MCMessage(MSBFL0087, cnt));
						info.addAprvRole(instR.insp_aprv_role_cd(), nvl(instR.inst_dt(), getToday()));

						mgr.exec();
					}
				}
			}
		}

		/**
		 * 規格検査指図を削除する。
		 */
		protected void delStdInspInst() {
			MCList<MST_STD_INSP_INST_R> delStdL = MCList.create(MST_STD_INSP_INST_R.class);
			MCList<MST_STD_INSP_INST_R> bindL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R bindR = null;
			for (MST_INSP_INST_R delR : _delL) {
				bindR = MST_STD_INSP_INST_R.create();
				bindR.insp_no(delR.insp_no());
				bindL.add(bindR);
			}
			MCQueryApiBuilder delStdL_bldr = MCQueryApiBuilder.create(MST_STD_INSP_INST_R.create("T"));
			dbSelectColumn("MSBFL5020_MST_STD_INSP_INST_S02", delStdL, delStdL_bldr, bindL,
					MST_INSP_INST_R.$insp_no);

			if (!delStdL.isEmpty()) {
				dbDeleteKey("MSBFL5020_MST_STD_INSP_INST_D02", delStdL, delStdL_bldr);
			}
		}

		/**
		 * 検査予定を更新する。
		 */
		protected MCList<MST_INSP_SCHD_R> updInspSchd() {
			MCList<MST_INSP_SCHD_R> updSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> rtnSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> bindL = MCList.create(MST_INSP_SCHD_R.class);
			for (MST_INSP_INST_R delR : _delL) {
				MST_INSP_SCHD_R bindR = MST_INSP_SCHD_R.create();
				bindR.insp_no(delR.insp_no());
				bindL.add(bindR);
			}
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder updSchdL_bldr = MCQueryApiBuilder.create(t);
			dbSelectColumn("MSBFL5020_MST_INSP_SCHD_S03", updSchdL, updSchdL_bldr, bindL, MST_INSP_INST_R.$insp_no);

			rtnSchdL.setAll(updSchdL.clone());
			if (!updSchdL.isEmpty()) {
				updSchdL.setStringNE(MST_INSP_SCHD_R.$insp_schd_sts_typ, MSC_INSP_STS_TYP.YET.value());
				updSchdL.clear(MST_INSP_SCHD_R.$insp_no, MST_INSP_SCHD_R.$smpl_inst_qty);

				// 更新項目設定
				editInspSchdLSetStmt(updSchdL, t, updSchdL_bldr);

				dbUpdateKey("MSBFL5020_MST_INSP_SCHD_U03", updSchdL, updSchdL_bldr);
			}

			return rtnSchdL;
		}

		/**
		 * 検査指図の承認取消を行う。
		 */
		protected void updInspInst() {
			_updPushL = _updL.clone();
			MCIndexKey idxkey = up0().createIndex(InspInst_Del01_RsltR.$insp_no);
			for (MST_INSP_INST_R updR : _updL) {
				InspInst_Del01_RsltR upR = up0().getFirst(idxkey, updR.insp_no());

				upR.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.INST_OPN.value());
				updR.insp_aprv_sts_typ(upR.insp_aprv_sts_typ());
				updR.aprv_dt(null);
				updR.aprv_tm(null);
				updR.aprv_usr_cd(null);
				updR.aprv_dpt_cd(null);
				updR.aprv_rsn(upR.aprv_rsn());
				updR.lims_flg(upR.lims_flg());
			}

			if (!_updL.isEmpty()) {
				// 更新項目設定
				MST_INSP_INST_R updL_t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editInspInstLSetStmt(_updL, updL_t, updL_bldr);

				dbUpdateKey("MSBFL5020_MST_INSP_INST_U03", _updL, updL_bldr);
			}
		}

		/**
		 * 受注状況更新サービスの受注状況更新（手配ＮＯ）を呼び出す。
		 */
		protected void callSloStsRegServiceIns02(MCList<MST_INSP_SCHD_R> schdL) {
			MSBBL_SloStsRegService.SloSts_Ins02 ope = MSBBL_SloStsRegService.crtSloSts_Ins02();

			addAll(ope.up0(), schdL, createMap_SloSts_DtlR_MST_INSP_SCHD_R());
			ope.up0().setValueNE(SloSts_DtlR.$slo_sts_typ, MSC_SLO_STS_TYP.INSP_INST_CAN.value());

			ope.exec();
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param _updL_bldr 
		 * @param t 
		 */
		protected void editInspInstLSetStmt(MCList<MST_INSP_INST_R> updL, MST_INSP_INST_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.insp_aprv_sts_typ);
			updL_bldr.addSet(t.aprv_dt);
			updL_bldr.addSet(t.aprv_tm);
			updL_bldr.addSet(t.aprv_usr_cd);
			updL_bldr.addSet(t.aprv_dpt_cd);
			updL_bldr.addSet(t.aprv_rsn);
			updL_bldr.addSet(t.lims_flg);
		}
	}

	/**
	 * 受払予定サービスの状況更新を呼び出す。
	 */
	protected void callIoSchdService(MCList<MST_INSP_SCHD_R> schdL,
			MCList<MST_INSP_INST_R> instL) {
		MSBEL_IoSchdService.IoSchd_Upd01 ioSchdUpd01 = MSBEL_IoSchdService
				.crtIoSchd_Upd01();

		MCDate endTm = null;
		MCIndexKey idxkey = null;
		if (!isNull(instL)) {
			idxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
		}
		for (MST_INSP_SCHD_R schdR : schdL) {
			// 先行検査　または　期限再検査の場合、実行しない。
			if (MSC_INSP_TYP.isPRCD(schdR.insp_typ()) || schdR.lmt_up_flg()) {
				continue;
			}
			if (isNull(instL)) {
				endTm = schdR.end_tm();
			}
			else {
				MST_INSP_INST_R instR = instL.getFirst(idxkey, schdR.insp_no());
				endTm = instR.end_tm();
			}

			// 出庫
			IoSchd_Upd01_DtlR giSchdR = IoSchd_Upd01_DtlR.create();
			giSchdR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GI.value());
			giSchdR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
			giSchdR.io_schd_no(schdR.insp_schd_no());
			giSchdR.io_schd_seq(null);
			giSchdR.upd_io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
			giSchdR.upd_insp_cmpl_schd_dt(endTm.trunc(MCDateFieldType.DAY));
			ioSchdUpd01.up0().add(giSchdR);

			// 入庫
			IoSchd_Upd01_DtlR grSchdR = IoSchd_Upd01_DtlR.create();
			grSchdR.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value());
			grSchdR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
			grSchdR.io_schd_no(schdR.insp_schd_no());
			grSchdR.io_schd_seq(null);
			grSchdR.upd_io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value());
			grSchdR.upd_insp_cmpl_schd_dt(endTm.trunc(MCDateFieldType.DAY));
			ioSchdUpd01.up0().add(grSchdR);
		}

		if (!ioSchdUpd01.up0().isEmpty()) {
			ioSchdUpd01.exec();
		}
	}

	/**
	 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
	 * @param cndL 上り電文
	 * @return 品管関連マスタ情報
	 */
	protected MCList<InspSchd_Srch01_CndR> callInspSchdService(MCList<InspSchd_Srch01_CndR> cndL) {

		MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService.crtInspSchd_Srch01();

		srch01.up0().setAll(cndL);

		if (!srch01.up0().isEmpty()) {
			srch01.exec();
		}

		return srch01.down0();
	}

	/**
	 * 検査予定テーブル更新用のdbContainerのset句を編集する。
	 * @param updL 更新用リスト
	 * @param _updSchdL_bldr 
	 * @param _updSchdL_t 
	 */
	protected void editInspSchdLSetStmt(MCList<MST_INSP_SCHD_R> updL,
			MST_INSP_SCHD_R t, MCQueryApiBuilder updL_bldr) {
		updL_bldr.setSet(t.insp_schd_sts_typ);
		updL_bldr.addSet(t.insp_no);
		updL_bldr.addSet(t.smpl_inst_qty);
	}

	protected String getPlntAprvStsTyp(MST_INSP_INST_R r) {
		if (r.plnt_aprv_flg()) {
			return MSC_PLNT_APRV_STS_TYP.OPN.value();
		}
		return null;
	}

	protected MCList<MST_INSP_INST_SEND_IF_R> getInspInstSendIf(MCList<MST_INSP_INST_R> inspInstL) {
		MCQueryApiBuilder inspInst_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("INSPINST"));
		dbWkDelete("MSLAL5020_MSW_INSP_INST_D01", inspInst_bldr.getBaseDbc());
		dbWkInsert("MSLAL5020_MSW_INSP_INST_I01", inspInstL, inspInst_bldr.getBaseDbc());

		MCList<MST_INSP_INST_SEND_IF_R> inspInstSendIfL = MCList.create(MST_INSP_INST_SEND_IF_R.class);
		MST_INSP_INST_SEND_IF_R inspInstSendIf = MST_INSP_INST_SEND_IF_R.create("INSPINSTSENDIF");
		MSW_INSP_INST_KEY_R inspInstWk = MSW_INSP_INST_KEY_R.create("INSPINSTWK");
		MCQueryApiBuilder inspInstSendIf_bldr = MCQueryApiBuilder.create(inspInstSendIf);
		inspInstSendIf_bldr.setSelect(inspInstSendIf.data_lno);
		inspInstSendIf_bldr.addSelect(inspInstSendIf.insp_no);
		inspInstSendIf_bldr.addSelect(inspInstSendIf.insp_freq);
		inspInstSendIf_bldr.addInnerJoin(inspInstWk, inspInstSendIf.insp_no.eq(inspInstWk.insp_no));
		dbSelect("MSBFL5020_MST_INSP_INST_SEND_IF_S01", inspInstSendIfL, inspInstSendIf_bldr);
		return inspInstSendIfL;
	}

	// Mapping
	protected Map_MST_INSP_INST_R_MST_INSP_SCHD_R<MST_INSP_INST_R,MST_INSP_SCHD_R> createMap_MST_INSP_INST_R_MST_INSP_SCHD_R() {
		return new Map_MST_INSP_INST_R_MST_INSP_SCHD_R<MST_INSP_INST_R, MST_INSP_SCHD_R>();
	}

	public class Map_MST_INSP_INST_R_MST_INSP_SCHD_R<D extends MST_INSP_INST_R, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, MST_INSP_SCHD_R.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_freq, MST_INSP_SCHD_R.$insp_freq);
			addColumnPathMap(MST_INSP_INST_R.$src_no1, MST_INSP_SCHD_R.$src_no1);
			addColumnPathMap(MST_INSP_INST_R.$src_no2, MST_INSP_SCHD_R.$src_no2);
			addColumnPathMap(MST_INSP_INST_R.$insp_typ, MST_INSP_SCHD_R.$insp_typ);
			addColumnPathMap(MST_INSP_INST_R.$insp_bind_typ, MST_INSP_SCHD_R.$insp_bind_typ);
			addColumnPathMap(MST_INSP_INST_R.$itm_cd, MST_INSP_SCHD_R.$itm_cd);
			addColumnPathMap(MST_INSP_INST_R.$itm_sub1, MST_INSP_SCHD_R.$itm_sub1);
			addColumnPathMap(MST_INSP_INST_R.$itm_sub2, MST_INSP_SCHD_R.$itm_sub2);
			addColumnPathMap(MST_INSP_INST_R.$itm_sub3, MST_INSP_SCHD_R.$itm_sub3);
			addColumnPathMap(MST_INSP_INST_R.$sppl_cd, MST_INSP_SCHD_R.$sppl_cd);
			addColumnPathMap(MST_INSP_INST_R.$maker_cd, MST_INSP_SCHD_R.$maker_cd);
			addColumnPathMap(MST_INSP_INST_R.$mfg_loc_cd, MST_INSP_SCHD_R.$mfg_loc_cd);
			addColumnPathMap(MST_INSP_INST_R.$from_site_cd, MST_INSP_SCHD_R.$from_site_cd);
			addColumnPathMap(MST_INSP_INST_R.$bp_lot_no, MST_INSP_SCHD_R.$bp_lot_no);
			addColumnPathMap(MST_INSP_INST_R.$pack_unit_qty, MST_INSP_SCHD_R.$pack_unit_qty);
			addColumnPathMap(MST_INSP_INST_R.$pack_unit_cd, MST_INSP_SCHD_R.$pack_unit_cd);
			addColumnPathMap(MST_INSP_INST_R.$base_unit_qty, MST_INSP_SCHD_R.$base_unit_qty);
			addColumnPathMap(MST_INSP_INST_R.$base_unit_cd, MST_INSP_SCHD_R.$base_unit_cd);
			addColumnPathMap(MST_INSP_INST_R.$lmt_up_flg, MST_INSP_SCHD_R.$lmt_up_flg);
		}
	}

	protected Map_MST_STD_INSP_INST_R_MAM_INSP_SPEC_R<MST_STD_INSP_INST_R,MAM_INSP_SPEC_R> createMap_MST_STD_INSP_INST_R_MAM_INSP_SPEC_R() {
		return new Map_MST_STD_INSP_INST_R_MAM_INSP_SPEC_R<MST_STD_INSP_INST_R, MAM_INSP_SPEC_R>();
	}

	public class Map_MST_STD_INSP_INST_R_MAM_INSP_SPEC_R<D extends MST_STD_INSP_INST_R, S extends MAM_INSP_SPEC_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_seq, MAM_INSP_SPEC_R.$insp_seq);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_point_cd, MAM_INSP_SPEC_R.$insp_point_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_qlqn_typ, MAM_INSP_SPEC_R.$insp_qlqn_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_min, MAM_INSP_SPEC_R.$qn_out_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_max, MAM_INSP_SPEC_R.$qn_out_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_min_typ, MAM_INSP_SPEC_R.$sign_out_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_max_typ, MAM_INSP_SPEC_R.$sign_out_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_min, MAM_INSP_SPEC_R.$qn_in_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_max, MAM_INSP_SPEC_R.$qn_in_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_min_typ, MAM_INSP_SPEC_R.$sign_in_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_max_typ, MAM_INSP_SPEC_R.$sign_in_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$trd_unit_cd, MAM_INSP_SPEC_R.$unit_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_digit, MAM_INSP_SPEC_R.$qn_int_digit);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_frac, MAM_INSP_SPEC_R.$qn_int_frac);
			addColumnPathMap(MST_STD_INSP_INST_R.$ql_std_val, MAM_INSP_SPEC_R.$ql_std_val);
		}
	}

	protected Map_MST_INSP_INST_R_InspInst_Ins01_RsltR<MST_INSP_INST_R,InspInst_Ins01_RsltR> createMap_MST_INSP_INST_R_InspInst_Ins01_RsltR() {
		return new Map_MST_INSP_INST_R_InspInst_Ins01_RsltR<MST_INSP_INST_R, InspInst_Ins01_RsltR>();
	}

	public class Map_MST_INSP_INST_R_InspInst_Ins01_RsltR<D extends MST_INSP_INST_R, S extends InspInst_Ins01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, InspInst_Ins01_RsltR.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_sts_typ, InspInst_Ins01_RsltR.$insp_sts_typ);
			addColumnPathMap(MST_INSP_INST_R.$insp_mtd_typ, InspInst_Ins01_RsltR.$insp_mtd_typ);
			addColumnPathMap(MST_INSP_INST_R.$lot_no, InspInst_Ins01_RsltR.$lot_no);
			addColumnPathMap(MST_INSP_INST_R.$sublot_no, InspInst_Ins01_RsltR.$sublot_no);
			addColumnPathMap(MST_INSP_INST_R.$inst_dt, InspInst_Ins01_RsltR.$inst_dt);
			addColumnPathMap(MST_INSP_INST_R.$inst_dpt_cd, InspInst_Ins01_RsltR.$inst_dpt_cd);
			addColumnPathMap(MST_INSP_INST_R.$inst_usr_cd, InspInst_Ins01_RsltR.$inst_usr_cd);
			addColumnPathMap(MST_INSP_INST_R.$master_dt, InspInst_Ins01_RsltR.$master_dt);
			addColumnPathMap(MST_INSP_INST_R.$st_tm, InspInst_Ins01_RsltR.$st_tm);
			addColumnPathMap(MST_INSP_INST_R.$end_tm, InspInst_Ins01_RsltR.$end_tm);
			addColumnPathMap(MST_INSP_INST_R.$insp_ptn_cd, InspInst_Ins01_RsltR.$insp_ptn_cd);
			addColumnPathMap(MST_INSP_INST_R.$std_req_flg, InspInst_Ins01_RsltR.$std_req_flg);
			addColumnPathMap(MST_INSP_INST_R.$std_cnf_req_flg, InspInst_Ins01_RsltR.$std_cnf_req_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_std_no, InspInst_Ins01_RsltR.$insp_std_no);
			addColumnPathMap(MST_INSP_INST_R.$plnt_aprv_flg, InspInst_Ins01_RsltR.$plnt_aprv_flg);
			addColumnPathMap(MST_INSP_INST_R.$lims_flg, InspInst_Ins01_RsltR.$lims_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_flg, InspInst_Ins01_RsltR.$insp_aprv_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_sts_typ, InspInst_Ins01_RsltR.$insp_aprv_sts_typ);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_role_cd, InspInst_Ins01_RsltR.$insp_aprv_role_cd);
			addColumnPathMap(MST_INSP_INST_R.$intr_rmrks, InspInst_Ins01_RsltR.$intr_rmrks);
			addColumnPathMap(MST_INSP_INST_R.$sub_char1, InspInst_Ins01_RsltR.$sub_char1);
			addColumnPathMap(MST_INSP_INST_R.$sub_char2, InspInst_Ins01_RsltR.$sub_char2);
			addColumnPathMap(MST_INSP_INST_R.$sub_char3, InspInst_Ins01_RsltR.$sub_char3);
			addColumnPathMap(MST_INSP_INST_R.$to_site_cd, InspInst_Ins01_RsltR.$to_site_cd);
		}
	}

	protected Map_MST_STD_INSP_INST_R_InspInst_Ins01_RsltStdR<MST_STD_INSP_INST_R,InspInst_Ins01_RsltStdR> createMap_MST_STD_INSP_INST_R_InspInst_Ins01_RsltStdR() {
		return new Map_MST_STD_INSP_INST_R_InspInst_Ins01_RsltStdR<MST_STD_INSP_INST_R, InspInst_Ins01_RsltStdR>();
	}

	public class Map_MST_STD_INSP_INST_R_InspInst_Ins01_RsltStdR<D extends MST_STD_INSP_INST_R, S extends InspInst_Ins01_RsltStdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STD_INSP_INST_R.$std_insp_inst_no, InspInst_Ins01_RsltStdR.$std_insp_inst_no);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_no, InspInst_Ins01_RsltStdR.$insp_no);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_seq, InspInst_Ins01_RsltStdR.$insp_seq);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_point_cd, InspInst_Ins01_RsltStdR.$insp_point_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_qlqn_typ, InspInst_Ins01_RsltStdR.$insp_qlqn_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_min, InspInst_Ins01_RsltStdR.$qn_out_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_max, InspInst_Ins01_RsltStdR.$qn_out_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_min_typ, InspInst_Ins01_RsltStdR.$sign_out_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_max_typ, InspInst_Ins01_RsltStdR.$sign_out_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_min, InspInst_Ins01_RsltStdR.$qn_in_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_max, InspInst_Ins01_RsltStdR.$qn_in_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_min_typ, InspInst_Ins01_RsltStdR.$sign_in_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_max_typ, InspInst_Ins01_RsltStdR.$sign_in_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$trd_unit_cd, InspInst_Ins01_RsltStdR.$trd_unit_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_digit, InspInst_Ins01_RsltStdR.$qn_int_digit);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_frac, InspInst_Ins01_RsltStdR.$qn_int_frac);
			addColumnPathMap(MST_STD_INSP_INST_R.$ql_std_val, InspInst_Ins01_RsltStdR.$ql_std_val);
			addColumnPathMap(MST_STD_INSP_INST_R.$add_point_flg, InspInst_Ins01_RsltStdR.$add_point_flg);
			addColumnPathMap(MST_STD_INSP_INST_R.$intr_rmrks, InspInst_Ins01_RsltStdR.$intr_rmrks);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char1, InspInst_Ins01_RsltStdR.$sub_char1);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char2, InspInst_Ins01_RsltStdR.$sub_char2);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char3, InspInst_Ins01_RsltStdR.$sub_char3);

		}
	}

	protected Map_MST_INSP_INST_R_InspInst_Upd01_RsltR<MST_INSP_INST_R,InspInst_Upd01_RsltR> createMap_MST_INSP_INST_R_InspInst_Upd01_RsltR() {
		return new Map_MST_INSP_INST_R_InspInst_Upd01_RsltR<MST_INSP_INST_R, InspInst_Upd01_RsltR>();
	}

	public class Map_MST_INSP_INST_R_InspInst_Upd01_RsltR<D extends MST_INSP_INST_R, S extends InspInst_Upd01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, InspInst_Upd01_RsltR.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_mtd_typ, InspInst_Upd01_RsltR.$insp_mtd_typ);
			addColumnPathMap(MST_INSP_INST_R.$insp_sts_typ, InspInst_Upd01_RsltR.$insp_sts_typ);
			addColumnPathMap(MST_INSP_INST_R.$inst_dt, InspInst_Upd01_RsltR.$inst_dt);
			addColumnPathMap(MST_INSP_INST_R.$inst_dpt_cd, InspInst_Upd01_RsltR.$inst_dpt_cd);
			addColumnPathMap(MST_INSP_INST_R.$inst_usr_cd, InspInst_Upd01_RsltR.$inst_usr_cd);
			addColumnPathMap(MST_INSP_INST_R.$master_dt, InspInst_Upd01_RsltR.$master_dt);
			addColumnPathMap(MST_INSP_INST_R.$st_tm, InspInst_Upd01_RsltR.$st_tm);
			addColumnPathMap(MST_INSP_INST_R.$end_tm, InspInst_Upd01_RsltR.$end_tm);
			addColumnPathMap(MST_INSP_INST_R.$insp_ptn_cd, InspInst_Upd01_RsltR.$insp_ptn_cd);
			addColumnPathMap(MST_INSP_INST_R.$insp_std_no, InspInst_Upd01_RsltR.$insp_std_no);
			addColumnPathMap(MST_INSP_INST_R.$plnt_aprv_flg, InspInst_Upd01_RsltR.$plnt_aprv_flg);
			addColumnPathMap(MST_INSP_INST_R.$lims_flg, InspInst_Upd01_RsltR.$lims_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_flg, InspInst_Upd01_RsltR.$insp_aprv_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_role_cd, InspInst_Upd01_RsltR.$insp_aprv_role_cd);
			addColumnPathMap(MST_INSP_INST_R.$intr_rmrks, InspInst_Upd01_RsltR.$intr_rmrks);
			addColumnPathMap(MST_INSP_INST_R.$sub_char1, InspInst_Upd01_RsltR.$sub_char1);
			addColumnPathMap(MST_INSP_INST_R.$sub_char2, InspInst_Upd01_RsltR.$sub_char2);
			addColumnPathMap(MST_INSP_INST_R.$sub_char3, InspInst_Upd01_RsltR.$sub_char3);
			addColumnPathMap(MST_INSP_INST_R.$insp_typ, InspInst_Upd01_RsltR.$insp_typ);
			addColumnPathMap(MST_INSP_INST_R.$insp_freq, InspInst_Upd01_RsltR.$insp_freq);
			addColumnPathMap(MST_INSP_INST_R.$std_req_flg, InspInst_Upd01_RsltR.$std_req_flg);
			addColumnPathMap(MST_INSP_INST_R.$std_cnf_req_flg, InspInst_Upd01_RsltR.$std_cnf_req_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.insp_rslt_prnt_flg()) {
				dest.seq(src.seq().add(MCNumber.ONE));
			}
			else {
				dest.seq(src.seq());
			}
			dest.insp_rslt_prnt_flg(false);
			dest.insp_rslt_prnt_tm(null);
		}
	}

	protected Map_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR<MST_STD_INSP_INST_R,InspInst_Upd01_RsltStdR> createMap_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR() {
		return new Map_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR<MST_STD_INSP_INST_R, InspInst_Upd01_RsltStdR>();
	}

	public class Map_MST_STD_INSP_INST_R_InspInst_Upd01_RsltStdR<D extends MST_STD_INSP_INST_R, S extends InspInst_Upd01_RsltStdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STD_INSP_INST_R.$std_insp_inst_no, InspInst_Upd01_RsltStdR.$std_insp_inst_no);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_seq, InspInst_Upd01_RsltStdR.$insp_seq);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_point_cd, InspInst_Upd01_RsltStdR.$insp_point_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$insp_qlqn_typ, InspInst_Upd01_RsltStdR.$insp_qlqn_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_min, InspInst_Upd01_RsltStdR.$qn_out_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_out_max, InspInst_Upd01_RsltStdR.$qn_out_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_min_typ, InspInst_Upd01_RsltStdR.$sign_out_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_out_max_typ, InspInst_Upd01_RsltStdR.$sign_out_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_min, InspInst_Upd01_RsltStdR.$qn_in_min);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_in_max, InspInst_Upd01_RsltStdR.$qn_in_max);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_min_typ, InspInst_Upd01_RsltStdR.$sign_in_min_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$sign_in_max_typ, InspInst_Upd01_RsltStdR.$sign_in_max_typ);
			addColumnPathMap(MST_STD_INSP_INST_R.$trd_unit_cd, InspInst_Upd01_RsltStdR.$trd_unit_cd);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_digit, InspInst_Upd01_RsltStdR.$qn_int_digit);
			addColumnPathMap(MST_STD_INSP_INST_R.$qn_int_frac, InspInst_Upd01_RsltStdR.$qn_int_frac);
			addColumnPathMap(MST_STD_INSP_INST_R.$ql_std_val, InspInst_Upd01_RsltStdR.$ql_std_val);
			addColumnPathMap(MST_STD_INSP_INST_R.$add_point_flg, InspInst_Upd01_RsltStdR.$add_point_flg);
			addColumnPathMap(MST_STD_INSP_INST_R.$intr_rmrks, InspInst_Upd01_RsltStdR.$intr_rmrks);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char1, InspInst_Upd01_RsltStdR.$sub_char1);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char2, InspInst_Upd01_RsltStdR.$sub_char2);
			addColumnPathMap(MST_STD_INSP_INST_R.$sub_char3, InspInst_Upd01_RsltStdR.$sub_char3);

		}
	}

	protected Map_MST_INSP_INST_R_InspInst_Upd02_RsltR<MST_INSP_INST_R,InspInst_Upd02_RsltR> createMap_MST_INSP_INST_R_InspInst_Upd02_RsltR() {
		return new Map_MST_INSP_INST_R_InspInst_Upd02_RsltR<MST_INSP_INST_R, InspInst_Upd02_RsltR>();
	}

	public class Map_MST_INSP_INST_R_InspInst_Upd02_RsltR<D extends MST_INSP_INST_R, S extends InspInst_Upd02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, InspInst_Upd02_RsltR.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_aprv_sts_typ, InspInst_Upd02_RsltR.$insp_aprv_sts_typ);
			addColumnPathMap(MST_INSP_INST_R.$aprv_dt, InspInst_Upd02_RsltR.$aprv_dt);
			addColumnPathMap(MST_INSP_INST_R.$aprv_dpt_cd, InspInst_Upd02_RsltR.$aprv_dpt_cd);
			addColumnPathMap(MST_INSP_INST_R.$aprv_usr_cd, InspInst_Upd02_RsltR.$aprv_usr_cd);
			addColumnPathMap(MST_INSP_INST_R.$aprv_tm, InspInst_Upd02_RsltR.$aprv_tm);
			addColumnPathMap(MST_INSP_INST_R.$aprv_rsn, InspInst_Upd02_RsltR.$aprv_rsn);
			addColumnPathMap(MST_INSP_INST_R.$lims_flg, InspInst_Upd02_RsltR.$lims_flg);
		}
	}

	protected Map_SloSts_DtlR_MST_INSP_SCHD_R<SloSts_DtlR,MST_INSP_SCHD_R> createMap_SloSts_DtlR_MST_INSP_SCHD_R() {
		return new Map_SloSts_DtlR_MST_INSP_SCHD_R<SloSts_DtlR, MST_INSP_SCHD_R>();
	}

	public class Map_SloSts_DtlR_MST_INSP_SCHD_R<D extends SloSts_DtlR, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$itm_cd, MST_INSP_SCHD_R.$itm_cd);
			addColumnPathMap(SloSts_DtlR.$itm_sub1, MST_INSP_SCHD_R.$itm_sub1);
			addColumnPathMap(SloSts_DtlR.$itm_sub2, MST_INSP_SCHD_R.$itm_sub2);
			addColumnPathMap(SloSts_DtlR.$itm_sub3, MST_INSP_SCHD_R.$itm_sub3);
			addColumnPathMap(SloSts_DtlR.$sno1, MST_INSP_SCHD_R.$sno1);
			addColumnPathMap(SloSts_DtlR.$sno2, MST_INSP_SCHD_R.$sno2);
			addColumnPathMap(SloSts_DtlR.$sno3, MST_INSP_SCHD_R.$sno3);
			addColumnPathMap(SloSts_DtlR.$sno4, MST_INSP_SCHD_R.$sno4);
			addColumnPathMap(SloSts_DtlR.$insp_no, MST_INSP_SCHD_R.$insp_no);
		}
	}
	
	protected Map_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R<InspInstSendIf_Upd01_DtlR,MST_INSP_INST_R> createMap_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R() {
		return new Map_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R<InspInstSendIf_Upd01_DtlR, MST_INSP_INST_R>();
	}

	public class Map_InspInstSendIf_Upd01_DtlR_MST_INSP_INST_R<D extends InspInstSendIf_Upd01_DtlR, S extends MST_INSP_INST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInstSendIf_Upd01_DtlR.$insp_no, MST_INSP_INST_R.$insp_no);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE("data_crud_typ"));
		}
	}

	//FMCB CUSTOM END
}