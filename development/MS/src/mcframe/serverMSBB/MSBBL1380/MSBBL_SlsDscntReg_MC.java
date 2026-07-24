package mcframe.serverMSBB.MSBBL1380;

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
import mcframe.serverMSBB.MSBBL1380.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6240.*;
import mcframe.serverMSBE.MSBEL5550.MSBEL_ShipRprtPrntService;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd02_HdrR;
import mcframe.serverMSBG.MSBGL5080.MSBGL_CredService;
import static mcframe.serverMSBB.MSBBL1380.Query.*;
import mcframe.commonCore.container.MCRow.Status;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsDscntReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsDscntReg_MC extends MSBBL_SlsDscntReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上値引情報を検索します。<br>
	 */
	public class Srch01 extends MSBBL_SlsDscntReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {

			editCnd();

			super.doSearchMain();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}

			srchDtl();
			
			down0().latest_flg(getLatestFlg());
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {

			// 最新ＦＬＧがオンの場合は、一時カラムに検索条件制御用のカラムを追加
			// 念のため、改訂番号をクリアする
			if (up0().latest_flg()) {
				up0().setStringNE("latest_flg_str", toTrueStr(up0().latest_flg()));
				up0().srch_tgt_rev(null);
			}
			else if (isNull(up0().srch_tgt_rev())) {
				// 画面で制御しているが、仮に最新ＦＬＧがオフ、改訂番号がnullの場合、
				// サーバエラー(検索結果が１件と想定される箇所で、複数件のデータが検索されました。)が発生するので
				// 検索結果が0件になるように加工する
				up0().setStringNE("latest_flg_str", toFalseStr(up0().latest_flg()));
			}
		}

		/**
		 * 売上実績情報（値引・値増）を検索する
		 * @return
		 */
		protected int srchHdr() {

			return executeQuery(down0(), MSBBL1380_SLS_ACT_S01(), up0());

		}

		/**
		 * 売上実績明細情報を検索する
		 */
		protected void srchDtl() {

			up0().setNumberNE(MST_SLS_ACT_R.$sls_act_seq, down0().sls_act_seq());
			up0().prnt_lcl_cd(down0().prnt_lcl_cd());
			int cnt = executeQuery(down1(), MSBBL1380_SLS_ACT_D_S01(), up0());

			if (isSame(cnt, 0)) {
				throw new MCAppException(MSBBL0055, up0().srch_tgt_no(), up0().srch_tgt_rev());
			}
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			if (!down0().cst_iv_flg()) {
				down1().setValueNE(Srch01_DtlR.$iv_itm_nm, null);
			}
			
			// 与信枠残高の取得
			down0().cred_bal(
					callCredSvSrch01(down0().cst_cd(), down0().trd_cur_cd(), down0()));
		}
		
		/**
		 * 改訂番号が最新の場合は最新フラグをtrueにする。
		 */
		protected boolean getLatestFlg() {
			if (up0().latest_flg() || MAC_SLIP_STS_TYP.isCRT(down0().slip_sts_typ())) {
				return true;
			}
			return false;
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 参照元売上実績情報を検索します。<br>
	 */
	public class Srch02 extends MSBBL_SlsDscntReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {

			super.doSearchMain();
			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}

			srchDtl();

		}

		/**
		 * 売上実績情報を検索する
		 * @return
		 */
		protected int srchHdr() {

			return executeQuery(down0(), MSBBL1380_SLS_ACT_S02(), up0());
		}

		/**
		 * 売上実績明細情報を検索する
		 */
		protected void srchDtl() {

			up0().setStringNE(MST_SLS_ACT_R.$sls_act_no, down0().sls_act_no());
			up0().setNumberNE(MST_SLS_ACT_R.$sls_act_seq, down0().sls_act_seq());
			up0().prnt_lcl_cd(down0().prnt_lcl_cd());
			int cnt = executeQuery(down1(), MSBBL1380_SLS_ACT_D_S02(), up0());

			if (isSame(cnt, 0)) {
				throw new MCAppException(MSBBL0055, down0().sls_act_no(), down0().sls_act_seq());
			}
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			// 与信枠残高の取得
			down0().cred_bal(
					callCredSvSrch01(down0().cst_cd(), down0().trd_cur_cd(), down0()));
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上値引情報を新規登録します。<br>
	 */
	public class Ins01 extends MSBBL_SlsDscntReg_MC_A.Ins01 {

		MCList<Sls_Dscnt_HdrR> _hdrL;

		MCList<Sls_Dscnt_DtlR> _dtlL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callSlsDscntServiceChk01();

			throwUpdErr();

			callSlsDscntServiceIns01();

			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			up0().setStatus(Status.CREATE);
		}

		protected void callSlsDscntServiceChk01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Chk01 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Chk01();
			Sls_Dscnt_HdrR oUp0 = ope.up0().createRow();
			copy(oUp0, up0(), createMap_Sls_Dscnt_HdrR_Ins01_HdrR());

			setPegNo(Sls_Dscnt_HdrR.$hdr_peg_no, oUp0);
			ope.up0().add(oUp0);

			addAll(ope.up1(), up1(), createMap_Sls_Dscnt_DtlR_Ins01_DtlR());
			ope.up1().setNumberNE(Sls_Dscnt_DtlR.$hdr_peg_no,
					oUp0.getNumberNE(Sls_Dscnt_HdrR.$hdr_peg_no));
			setPegNo(Sls_Dscnt_DtlR.$dtl_peg_no, ope.up1());

			ope.exec();

			_hdrL = ope.down0();
			_dtlL = ope.down1();
		}

		protected void callSlsDscntServiceIns01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Ins01 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Ins01();
			ope.up0().setAll(_hdrL);
			ope.up0().forEach(r -> r.indiv_prnt_flg(true));
			ope.up1().setAll(_dtlL);
			ope.exec();

			copy(down0(), ope.down0().get(0), createMap_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR());

			// 売上実績サービス内で伝票が分割された場合は、
			// サービス内で通知メッセージを設定するため、呼出元では何もしない

		}

		protected void setDown() {

			// 与信枠残高の取得
			down0().cred_bal(callCredSvSrch01(up0().cst_cd(), up0().trd_cur_cd(), down0()));
			
			// 計上日を設定 (売上値引サービスの下り電文に設定した方がよさそうだが）
			down0().ac_ym(getAcYm(up0().ac_dt()));
		}

		protected Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<Ins01_HdrR, Sls_Dscnt_Rslt_HdrR> createMap_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR() {
			return new Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<Ins01_HdrR, Sls_Dscnt_Rslt_HdrR>();
		}

		public class Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<D extends Ins01_HdrR, S extends Sls_Dscnt_Rslt_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ins01_HdrR.$sls_act_no, Sls_Dscnt_Rslt_HdrR.$sls_act_no);
				addColumnPathMap(Ins01_HdrR.$sls_act_seq,
						Sls_Dscnt_Rslt_HdrR.$sls_act_seq);
				addColumnPathMap(Ins01_HdrR.$sls_act_rev,
						Sls_Dscnt_Rslt_HdrR.$sls_act_rev);
				addColumnPathMap(Ins01_HdrR.$iv_no, Sls_Dscnt_Rslt_HdrR.$iv_no);
				addColumnPathMap(Ins01_HdrR.$dlv_slip_no,
						Sls_Dscnt_Rslt_HdrR.$dlv_slip_no);
				addColumnPathMap(Ins01_HdrR.$aprv_flg, Sls_Dscnt_Rslt_HdrR.$aprv_flg);
				addColumnPathMap(Ins01_HdrR.$aprv_no, Sls_Dscnt_Rslt_HdrR.$aprv_no);
				addColumnPathMap(Ins01_HdrR.$aprv_sts_typ, Sls_Dscnt_Rslt_HdrR.$aprv_sts_typ);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上値引情報を訂正します。<br>
	 */
	public class Upd01 extends MSBBL_SlsDscntReg_MC_A.Upd01 {

		MCList<Sls_Dscnt_HdrR> _hdrL;

		MCList<Sls_Dscnt_DtlR> _dtlL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callSlsDscntServiceChk01();

			throwUpdErr();

			callSlsDscntServiceUpd01();

			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
		}

		protected void callSlsDscntServiceChk01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Chk01 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Chk01();
			Sls_Dscnt_HdrR oUp0 = ope.up0().createRow();
			copy(oUp0, up0(), createMap_Sls_Dscnt_HdrR_Ins01_HdrR());

			setPegNo(Sls_Dscnt_HdrR.$hdr_peg_no, oUp0);
			ope.up0().add(oUp0);

			addAll(ope.up1(), up1(), createMap_Sls_Dscnt_DtlR_Ins01_DtlR());

			ope.up1().setNumberNE(Sls_Dscnt_DtlR.$hdr_peg_no,
					oUp0.getNumberNE(Sls_Dscnt_HdrR.$hdr_peg_no));
			setPegNo(Sls_Dscnt_DtlR.$dtl_peg_no, ope.up1());

			ope.exec();

			_hdrL = ope.down0();
			_dtlL = ope.down1();
		}

		protected void callSlsDscntServiceUpd01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Upd01 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Upd01();
			ope.up0().setAll(_hdrL);
			ope.up0().forEach(r -> r.indiv_prnt_flg(true));
			ope.up1().setAll(_dtlL);
			ope.exec();

			copy(down0(), ope.down0().get(0), createMap_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR());

			// 売上実績サービス内で伝票が分割された場合は、
			// サービス内で通知メッセージを設定するため、呼出元では何もしない

		}

		protected void setDown() {

			// 与信枠残高の取得
			down0().cred_bal(callCredSvSrch01(up0().cst_cd(), up0().trd_cur_cd(), down0()));
			
			// 計上日を設定 (売上値引サービスの下り電文に設定した方がよさそうだが）
			down0().ac_ym(getAcYm(up0().ac_dt()));
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上値引情報を取り消しします。<br>
	 */
	public class Del01 extends MSBBL_SlsDscntReg_MC_A.Del01 {

		MCList<Sls_Dscnt_DelR> _hdrL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			callSlsDscntServiceChk01();

			throwCanErr();

			callSlsDscntServiceDel01();

			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callSlsDscntServiceChk01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Chk02 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Chk02();
			Sls_Dscnt_DelR oUp = ope.up0().createRow();
			copy(oUp, up0(), createMap_Sls_Dscnt_DelR_Del01_HdrR());
			setPegNo(Sls_Dscnt_HdrR.$hdr_peg_no, oUp);
			ope.up0().add(oUp);
			ope.exec();
			_hdrL = ope.down0();
		}

		protected void callSlsDscntServiceDel01() {

			MSBBL_SlsDscntService.Sls_Dscnt_Del01 ope = MSBBL_SlsDscntService
					.crtSls_Dscnt_Del01();
			ope.up0().setAll(_hdrL);
			ope.up0().forEach(r -> r.indiv_prnt_flg(true));
			ope.exec();

		}

		protected void setDown() {
			// 与信枠残高の取得
			Sls_Dscnt_DelR hdr = _hdrL.get(0);
			down0().cred_bal(callCredSvSrch01(hdr.cst_cd(), hdr.trd_cur_cd(), down0()));
		}

		protected Map_Sls_Dscnt_DelR_Del01_HdrR<Sls_Dscnt_DelR, Del01_HdrR> createMap_Sls_Dscnt_DelR_Del01_HdrR() {
			return new Map_Sls_Dscnt_DelR_Del01_HdrR<Sls_Dscnt_DelR, Del01_HdrR>();
		}

		public class Map_Sls_Dscnt_DelR_Del01_HdrR<D extends Sls_Dscnt_DelR, S extends Del01_HdrR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Dscnt_DelR.$sls_act_no, Del01_HdrR.$sls_act_no);
				addColumnPathMap(Sls_Dscnt_DelR.$sls_act_seq, Del01_HdrR.$sls_act_seq);
				addColumnPathMap(Sls_Dscnt_DelR.$can_ac_dt, Del01_HdrR.$can_ac_dt);
				addColumnPathMap(Sls_Dscnt_DelR.$sls_slip_out_flg,
						Del01_HdrR.$sls_slip_out_flg);
				addColumnPathMap(Sls_Dscnt_DelR.$upd_cntr, Del01_HdrR.$upd_cntr);
				addColumnPathMap(Sls_Dscnt_DelR.$peg_no, Del01_HdrR.$peg_no);
			}
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 売上伝票を発行します。<br>
	 */
	public class Prnt01 extends MSBBL_SlsDscntReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			callShipRprtServicePrnt01();
		}

		/**
		 * 出荷帳票発行サービスの納品書発行を呼び出す。
		 */
		protected void callShipRprtServicePrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			ShipRprt_Prnt01_HdrR upR = ShipRprt_Prnt01_HdrR.create();
			upR.dlv_slip_no(up0().dlv_slip_no());
			upR.dlv_slip_seq(up0().dlv_slip_seq());
			upR.sls_prnt_flg(true);
			upR.inc_can_flg(getIncCanFlg());
			ope.up0().add(upR);
			ope.exec();
		}
		protected boolean getIncCanFlg() {
			MST_SLS_ACT_R t = MST_SLS_ACT_R.create("T");
			MST_SLS_ACT_R w = MST_SLS_ACT_R.create("W");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.sls_act_no, t.sls_act_rev);
			bldr.addSelect(subQuery()
				.select(max(w.sls_act_rev))
				.from(w)
				.where(w.sls_act_no.eq(t.sls_act_no))
				.as("max_rev")
			);
			
			MST_SLS_ACT_R rsltR = MST_SLS_ACT_R.create();
			dbSelectKey("MSBBL1380_MST_SLS_ACT_S03", rsltR, bldr, up0());
			
			// 最新の改訂番号のときのみ、訂正に対する取消を出力する
			return isSame(rsltR.sls_act_rev(), rsltR.getNumberNE("max_rev"));
		}
	}

	/**
	 * 	与信サービスの呼出
	 * <p>
	 * 	与信サービス.与信枠残高取得(MSBGL5080.Cred_Srch01)を呼出し、与信枠残高を取得する
	 * </p>
	 * @param cstCd	得意先ＣＤ
	 * @param trdCurCd 取引通貨ＣＤ
	 * @return 与信枠残高
	 */
	protected MCNumber callCredSvSrch01(String cstCd, String curCd, MCRow r) {
		MSBGL_CredService.Cred_Srch01 ope = MSBGL_CredService.crtCred_Srch01();
		ope.up0().cst_cd(cstCd);
		ope.up0().cur_cd(curCd);
		ope.up0().setAttributes(r);
		ope.exec();
		return ope.down0().cred_bal();
	}

	/**
	 * 	上り電文(Ins01_HdrR) -> 売上値引サービス.上り電文(Sls_Dscnt_HdrR)
	 * @return
	 */
	protected Map_Sls_Dscnt_HdrR_Ins01_HdrR<Sls_Dscnt_HdrR, Ins01_HdrR> createMap_Sls_Dscnt_HdrR_Ins01_HdrR() {
		return new Map_Sls_Dscnt_HdrR_Ins01_HdrR<Sls_Dscnt_HdrR, Ins01_HdrR>();
	}

	public class Map_Sls_Dscnt_HdrR_Ins01_HdrR<D extends Sls_Dscnt_HdrR, S extends Ins01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_act_no, Ins01_HdrR.$sls_act_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_act_seq, Ins01_HdrR.$sls_act_seq);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_cd, Ins01_HdrR.$trd_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$ac_dt, Ins01_HdrR.$ac_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$can_ac_dt, Ins01_HdrR.$can_ac_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_dpt_cd, Ins01_HdrR.$sls_dpt_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_usr_cd, Ins01_HdrR.$sls_usr_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_dt, Ins01_HdrR.$sls_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$cst_cd, Ins01_HdrR.$cst_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$iv_no, Ins01_HdrR.$iv_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$ref_iv_no, Ins01_HdrR.$ref_iv_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$rcv_schd_dt, Ins01_HdrR.$rcv_schd_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$bill_basis_dt, Ins01_HdrR.$bill_basis_dt);
			addColumnPathMap(Sls_Dscnt_HdrR.$ar_dpt_cd, Ins01_HdrR.$ar_dpt_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$cst_po_no, Ins01_HdrR.$cst_po_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_cur_cd, Ins01_HdrR.$trd_cur_cd);
			addColumnPathMap(Sls_Dscnt_HdrR.$xrate, Ins01_HdrR.$xrate);
			addColumnPathMap(Sls_Dscnt_HdrR.$ptax_xrate, Ins01_HdrR.$ptax_xrate);
			addColumnPathMap(Sls_Dscnt_HdrR.$aprv_ret_flg, Ins01_HdrR.$aprv_ret_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd1, Ins01_HdrR.$tterm_cd1);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks1, Ins01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd2, Ins01_HdrR.$tterm_cd2);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks2, Ins01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_cd3, Ins01_HdrR.$tterm_cd3);
			addColumnPathMap(Sls_Dscnt_HdrR.$tterm_rmrks3, Ins01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Sls_Dscnt_HdrR.$trd_rmrks, Ins01_HdrR.$trd_rmrks);
			addColumnPathMap(Sls_Dscnt_HdrR.$intr_rmrks, Ins01_HdrR.$intr_rmrks);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char1, Ins01_HdrR.$sub_char1);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char2, Ins01_HdrR.$sub_char2);
			addColumnPathMap(Sls_Dscnt_HdrR.$sub_char3, Ins01_HdrR.$sub_char3);
			addColumnPathMap(Sls_Dscnt_HdrR.$sls_slip_out_flg,
					Ins01_HdrR.$sls_slip_out_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$num_flg, Ins01_HdrR.$num_flg);
			addColumnPathMap(Sls_Dscnt_HdrR.$dlv_slip_no, Ins01_HdrR.$dlv_slip_no);
			addColumnPathMap(Sls_Dscnt_HdrR.$upd_cntr, Ins01_HdrR.$upd_cntr);
			addColumnPathMap(Sls_Dscnt_HdrR.$peg_no, Ins01_HdrR.$peg_no);
		}
	}

	/**
	 * 	上り電文(Ins01_DtlR) -> 売上値引サービス.上り電文(Sls_Dscnt_DtlR)
	 * @return
	 */
	protected Map_Sls_Dscnt_DtlR_Ins01_DtlR<Sls_Dscnt_DtlR, Ins01_DtlR> createMap_Sls_Dscnt_DtlR_Ins01_DtlR() {
		return new Map_Sls_Dscnt_DtlR_Ins01_DtlR<Sls_Dscnt_DtlR, Ins01_DtlR>();
	}

	public class Map_Sls_Dscnt_DtlR_Ins01_DtlR<D extends Sls_Dscnt_DtlR, S extends Ins01_DtlR>
			extends MCRowMapper<D, S> {

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_no, Ins01_DtlR.$sls_act_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_seq, Ins01_DtlR.$sls_act_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_d_no, Ins01_DtlR.$sls_act_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$sls_act_d_seq, Ins01_DtlR.$sls_act_d_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_cd, Ins01_DtlR.$itm_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub1, Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub2, Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_sub3, Ins01_DtlR.$itm_sub3);
			addColumnPathMap(Sls_Dscnt_DtlR.$itm_nm, Ins01_DtlR.$itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$iv_itm_nm, Ins01_DtlR.$iv_itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_cd, Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_unit_qty, Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_cur_upri, Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_cur_amt, Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_cur_tax_amt, Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_cur_upri, Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_cur_amt, Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_cur_tax_amt, Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$ptax_cur_upri, Ins01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Sls_Dscnt_DtlR.$ptax_cur_amt, Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$ptax_cur_tax_amt, Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$tax_cd, Ins01_DtlR.$tax_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$rsn_cd, Ins01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$bill_crryovr_times,
					Ins01_DtlR.$bill_crryovr_times);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_po_d_no, Ins01_DtlR.$cst_po_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_itm_cd, Ins01_DtlR.$cst_itm_cd);
			addColumnPathMap(Sls_Dscnt_DtlR.$cst_itm_nm, Ins01_DtlR.$cst_itm_nm);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno1, Ins01_DtlR.$sno1);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno2, Ins01_DtlR.$sno2);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno3, Ins01_DtlR.$sno3);
			addColumnPathMap(Sls_Dscnt_DtlR.$sno4, Ins01_DtlR.$sno4);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd1, Ins01_DtlR.$dest_cd1);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd2, Ins01_DtlR.$dest_cd2);
			addColumnPathMap(Sls_Dscnt_DtlR.$dest_cd3, Ins01_DtlR.$dest_cd3);
			addColumnPathMap(Sls_Dscnt_DtlR.$slo_no, Ins01_DtlR.$slo_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$slo_d_no, Ins01_DtlR.$slo_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_no, Ins01_DtlR.$ref_sls_act_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_seq, Ins01_DtlR.$ref_sls_act_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_rev, Ins01_DtlR.$ref_sls_act_rev);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_d_no,
					Ins01_DtlR.$ref_sls_act_d_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$ref_sls_act_d_seq,
					Ins01_DtlR.$ref_sls_act_d_seq);
			addColumnPathMap(Sls_Dscnt_DtlR.$base_sls_ac_dt, Ins01_DtlR.$base_sls_ac_dt);
			addColumnPathMap(Sls_Dscnt_DtlR.$lot_no, Ins01_DtlR.$lot_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$sublot_no, Ins01_DtlR.$sublot_no);
			addColumnPathMap(Sls_Dscnt_DtlR.$wtax_rate, Ins01_DtlR.$wtax_rate);
			addColumnPathMap(Sls_Dscnt_DtlR.$wtax_amt, Ins01_DtlR.$wtax_amt);
			addColumnPathMap(Sls_Dscnt_DtlR.$trd_d_rmrks, Ins01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Sls_Dscnt_DtlR.$intr_rmrks, Ins01_DtlR.$intr_rmrks);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char1, Ins01_DtlR.$sub_char1);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char2, Ins01_DtlR.$sub_char2);
			addColumnPathMap(Sls_Dscnt_DtlR.$sub_char3, Ins01_DtlR.$sub_char3);
			addColumnPathMap(Sls_Dscnt_DtlR.$peg_no, Ins01_DtlR.$peg_no);
		}
	}

	/**
	 * 	売上値引サービス.下り電文(Sls_Dscnt_Rslt_HdrR) -> 下り電文(Ins01_HdrR)
	 * @return
	 */
	protected Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<Ins01_HdrR, Sls_Dscnt_Rslt_HdrR> createMap_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR() {
		return new Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<Ins01_HdrR, Sls_Dscnt_Rslt_HdrR>();
	}

	public class Map_Ins01_HdrR_Sls_Dscnt_Rslt_HdrR<D extends Ins01_HdrR, S extends Sls_Dscnt_Rslt_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ins01_HdrR.$sls_act_no, Sls_Dscnt_Rslt_HdrR.$sls_act_no);
			addColumnPathMap(Ins01_HdrR.$sls_act_seq, Sls_Dscnt_Rslt_HdrR.$sls_act_seq);
			addColumnPathMap(Ins01_HdrR.$sls_act_rev, Sls_Dscnt_Rslt_HdrR.$sls_act_rev);
			addColumnPathMap(Ins01_HdrR.$iv_no, Sls_Dscnt_Rslt_HdrR.$iv_no);
			addColumnPathMap(Ins01_HdrR.$dlv_slip_no, Sls_Dscnt_Rslt_HdrR.$dlv_slip_no);
			addColumnPathMap(Ins01_HdrR.$aprv_flg, Sls_Dscnt_Rslt_HdrR.$aprv_flg);
			addColumnPathMap(Ins01_HdrR.$aprv_no, Sls_Dscnt_Rslt_HdrR.$aprv_no);
			addColumnPathMap(Ins01_HdrR.$aprv_sts_typ, Sls_Dscnt_Rslt_HdrR.$aprv_sts_typ);
		}
	}

	//FMCB CUSTOM END
}