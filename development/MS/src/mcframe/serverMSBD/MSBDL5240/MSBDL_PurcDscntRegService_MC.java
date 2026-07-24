package mcframe.serverMSBD.MSBDL5240;

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
import mcframe.serverMSBD.MSBDL5240.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMSBD.MSBDL5180.MSBDL_PurcActRegService;
import mcframe.serverMSBD.MSBDL5180.Purc_Chk03_DtlR;
import mcframe.serverMSBD.MSBDL5180.Purc_Chk03_HdrR;
import mcframe.serverMSBD.MSBDL5180.Purc_Chk03_IoR;
import mcframe.serverMSBD.MSBDL5180.Purc_Ins01_DtlR;
import mcframe.serverMSBD.MSBDL5180.Purc_Ins01_HdrR;
import mcframe.serverMSBD.MSBDL5180.Purc_Ins01_IoR;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;

import java.util.Arrays;

import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDscntRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDscntRegService_MC extends MSBDL_PurcDscntRegService_MC_A{
	//FMCB CUSTOM START
	/**
	 * PurcDscnt_Chk01オペレーション.<p>
	 *
	 * 仕入値引登録の更新前チェックを行います。<br>
	 */
	public class PurcDscnt_Chk01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			thisCheck();
			setDown();
		}
		
		/**
		 * チェック処理
		 */
		protected void thisCheck() {
			thisCheckMain();
		}
		
		/**
		 * チェック主処理
		 */
		protected void thisCheckMain() {
			// 後続SVのチェック処理コール
			callCheckSv();
		}
		
		/**
		 * 後続SVのチェック処理を呼び出します。
		 */
		protected void callCheckSv() {
			callPurcActRegServiceChk01();
		}
		
		/**
		 * 仕入実績登録サービスのチェック処理を呼出す
		 */
		protected void callPurcActRegServiceChk01() {
			// エラーの起こっていない伝票を取得
			MCList<PurcDscnt_Ins01_HdrR> hdrL = getChkList(up0());
			
			//　チェック処理
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			MCIndexKey idxkey = up1().createIndex(PurcDscnt_Ins01_DtlR.$hdr_peg_no);
			
			for (PurcDscnt_Ins01_HdrR r : hdrL) {
				// ヘッダの設定
				Purc_Chk03_HdrR hdrR = Purc_Chk03_HdrR.create();
				copy(hdrR, r, createMap_Purc_Chk03_HdrR_PurcDscnt_Ins01_HdrR());
				ope.up0().add(hdrR);
				
				// 明細の設定
				MCList<PurcDscnt_Ins01_DtlR> dtl = up1().subList(idxkey, r.peg_no());
				addAll(ope.up1(), dtl, createMap_Purc_Chk03_DtlR_PurcDscnt_Ins01_DtlR());
				
				// 詳細の設定
				addAll(ope.up2(), dtl, createMap_Purc_Chk03_IoR_PurcDscnt_Ins01_DtlR());
			}
			ope.exec();
			
			String[] destCol = {PurcDscnt_Ins01_DtlR.$purc_dtl_upd_flg};
			String[] srcCol = {Purc_Chk03_DtlR.$purc_dtl_upd_flg};
			copyByPegNo(up1(), destCol, ope.down1(), srcCol);
			copyErrFlg(up1(), ope.down1());
			
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().addAll(up1());
		}
		
		/** 仕入実績登録ＳＶチェック処理（ヘッダ） */
		protected Map_Purc_Chk03_HdrR_PurcDscnt_Ins01_HdrR<Purc_Chk03_HdrR,PurcDscnt_Ins01_HdrR> createMap_Purc_Chk03_HdrR_PurcDscnt_Ins01_HdrR() {
			return new Map_Purc_Chk03_HdrR_PurcDscnt_Ins01_HdrR<Purc_Chk03_HdrR, PurcDscnt_Ins01_HdrR>();
		}
		public class Map_Purc_Chk03_HdrR_PurcDscnt_Ins01_HdrR<D extends Purc_Chk03_HdrR, S extends PurcDscnt_Ins01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$data_crud_typ, PurcDscnt_Ins01_HdrR.$data_crud_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$peg_no, PurcDscnt_Ins01_HdrR.$peg_no);
				addColumnPathMap(Purc_Chk03_HdrR.$err_flg, PurcDscnt_Ins01_HdrR.$err_flg);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, PurcDscnt_Ins01_HdrR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, PurcDscnt_Ins01_HdrR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, PurcDscnt_Ins01_HdrR.$trd_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, PurcDscnt_Ins01_HdrR.$trd_ptn_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_dpt_cd, PurcDscnt_Ins01_HdrR.$purc_dpt_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$wg_cd, PurcDscnt_Ins01_HdrR.$wg_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_usr_cd, PurcDscnt_Ins01_HdrR.$purc_usr_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$sppl_cd, PurcDscnt_Ins01_HdrR.$sppl_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, PurcDscnt_Ins01_HdrR.$trd_cur_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$xrate, PurcDscnt_Ins01_HdrR.$xrate);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_xrate, PurcDscnt_Ins01_HdrR.$ptax_xrate);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, PurcDscnt_Ins01_HdrR.$purc_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, PurcDscnt_Ins01_HdrR.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$pay_basis_dt, PurcDscnt_Ins01_HdrR.$pay_basis_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$pay_schd_dt, PurcDscnt_Ins01_HdrR.$pay_schd_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, PurcDscnt_Ins01_HdrR.$ptax_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_no, PurcDscnt_Ins01_HdrR.$rcpt_iv_no);
				addColumnPathMap(Purc_Chk03_HdrR.$ref_rcpt_iv_no, PurcDscnt_Ins01_HdrR.$ref_rcpt_iv_no);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd1, PurcDscnt_Ins01_HdrR.$tterm_cd1);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks1, PurcDscnt_Ins01_HdrR.$tterm_rmrks1);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd2, PurcDscnt_Ins01_HdrR.$tterm_cd2);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks2, PurcDscnt_Ins01_HdrR.$tterm_rmrks2);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd3, PurcDscnt_Ins01_HdrR.$tterm_cd3);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks3, PurcDscnt_Ins01_HdrR.$tterm_rmrks3);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_rmrks, PurcDscnt_Ins01_HdrR.$trd_rmrks);
				addColumnPathMap(Purc_Chk03_HdrR.$intr_rmrks, PurcDscnt_Ins01_HdrR.$intr_rmrks);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char1, PurcDscnt_Ins01_HdrR.$sub_char1);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char2, PurcDscnt_Ins01_HdrR.$sub_char2);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char3, PurcDscnt_Ins01_HdrR.$sub_char3);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_amt_rnd_typ, PurcDscnt_Ins01_HdrR.$purc_amt_rnd_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_tax_rnd_typ, PurcDscnt_Ins01_HdrR.$purc_tax_rnd_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_tax_calc_typ, PurcDscnt_Ins01_HdrR.$purc_tax_calc_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, PurcDscnt_Ins01_HdrR.$can_ac_dt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_make_flg(true);
			}
		}
		
		/** 仕入実績登録ＳＶチェック処理（明細） */
		protected Map_Purc_Chk03_DtlR_PurcDscnt_Ins01_DtlR<Purc_Chk03_DtlR,PurcDscnt_Ins01_DtlR> createMap_Purc_Chk03_DtlR_PurcDscnt_Ins01_DtlR() {
			return new Map_Purc_Chk03_DtlR_PurcDscnt_Ins01_DtlR<Purc_Chk03_DtlR, PurcDscnt_Ins01_DtlR>();
		}
		public class Map_Purc_Chk03_DtlR_PurcDscnt_Ins01_DtlR<D extends Purc_Chk03_DtlR, S extends PurcDscnt_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$data_crud_typ, PurcDscnt_Ins01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$hdr_peg_no, PurcDscnt_Ins01_DtlR.$hdr_peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$err_flg, PurcDscnt_Ins01_DtlR.$err_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, PurcDscnt_Ins01_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, PurcDscnt_Ins01_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, PurcDscnt_Ins01_DtlR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, PurcDscnt_Ins01_DtlR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, PurcDscnt_Ins01_DtlR.$itm_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, PurcDscnt_Ins01_DtlR.$itm_sub1);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, PurcDscnt_Ins01_DtlR.$itm_sub2);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, PurcDscnt_Ins01_DtlR.$itm_sub3);
				addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, PurcDscnt_Ins01_DtlR.$pay_crryovr_times);
			}
		}
		/** 仕入実績登録ＳＶチェック処理（詳細） */
		protected Map_Purc_Chk03_IoR_PurcDscnt_Ins01_DtlR<Purc_Chk03_IoR,PurcDscnt_Ins01_DtlR> createMap_Purc_Chk03_IoR_PurcDscnt_Ins01_DtlR() {
			return new Map_Purc_Chk03_IoR_PurcDscnt_Ins01_DtlR<Purc_Chk03_IoR, PurcDscnt_Ins01_DtlR>();
		}
		public class Map_Purc_Chk03_IoR_PurcDscnt_Ins01_DtlR<D extends Purc_Chk03_IoR, S extends PurcDscnt_Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, PurcDscnt_Ins01_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$dtl_peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$err_flg, PurcDscnt_Ins01_DtlR.$err_flg);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, PurcDscnt_Ins01_DtlR.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, PurcDscnt_Ins01_DtlR.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, PurcDscnt_Ins01_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, PurcDscnt_Ins01_DtlR.$purc_act_d_seq);
			}
		}	
	}
	/**
	 * PurcDscnt_Ins01オペレーション.<p>
	 *
	 * 仕入値引登録処理を実行します。<br>
	 */
	public class PurcDscnt_Ins01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 登録処理
			callPurcActRegInsSrv();
			// 下り電文設定
			setDown();
		}
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		/**
		 * 仕入実績登録サービスで仕入金額値引情報を登録する
		 */
		protected void callPurcActRegInsSrv() {
			MCList<PurcDscnt_Ins01_HdrR> subL = getChkList(up0());
			MCIndexKey idxkey = up1().createIndex(PurcDscnt_Ins01_DtlR.$hdr_peg_no);
			
			// 仕入実績登録ＳＶ
			MSBDL_PurcActRegService.Purc_Ins01 ope = MSBDL_PurcActRegService.crtPurc_Ins01();			
			// up0(制御ブロック)
			ope.up0().io_make_flg(true);
			ope.up0().amt_calc_flg(up0().get(0).amt_calc_flg());
			// up1(ヘッダ)
			addAll(ope.up1(), subL, createMap_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR());
			
			for (PurcDscnt_Ins01_HdrR r : subL) {
				// up2(明細)
				MCList<PurcDscnt_Ins01_DtlR> dtl = up1().subList(idxkey, r.peg_no());
				addAll(ope.up2(), dtl, createMap_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR());
				// up3(詳細)
				addAll(ope.up3(), dtl, createMap_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR());
				setPegNo(Purc_Ins01_IoR.$peg_no, ope.up3());
			}
			ope.exec();
			
			// 更新サービスの下り電文設定（ヘッダ） 
			String[] hdrDestCols = new String[] {PurcDscnt_Ins01_HdrR.$purc_act_no, PurcDscnt_Ins01_HdrR.$purc_act_rev};
			String[] hdrSrcCols = new String[] {Purc_Ins01_HdrR.$purc_act_no, Purc_Ins01_HdrR.$purc_act_rev};
			copyByPegNo(up0(), hdrDestCols, ope.down0(),  hdrSrcCols);
			
			// 更新サービスの下り電文設定（明細）
			String[] dtlDestCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			String[] dtlSrcCols = new String[] {Purc_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), dtlDestCols, ope.down1(),  dtlSrcCols);
		}
	}
	
	/**
	 * PurcDscnt_Upd01オペレーション.<p>
	 *
	 * 仕入値引情報を更新します。<br>
	 */
	public class PurcDscnt_Upd01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 仕入実績更新
			callPurcActRegUpdSrv();
			// 下り電文設定
			setDown();
		}
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
		/**
		 * 仕入実績更新サービスを呼出す
		 */
		protected void callPurcActRegUpdSrv() {
			MCList<PurcDscnt_Ins01_HdrR> subL = getChkList(up0());
			MCIndexKey idxkey = up1().createIndex(PurcDscnt_Ins01_DtlR.$hdr_peg_no);
			
			MSBDL_PurcActRegService.Purc_Upd01 ope = MSBDL_PurcActRegService.crtPurc_Upd01();
			// up0(制御ブロック)
			ope.up0().io_make_flg(true);
			ope.up0().amt_calc_flg(false);
			// up1(ヘッダ)
			addAll(ope.up1(), subL, createMap_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR());
			
			for (PurcDscnt_Ins01_HdrR r : subL) {
				// up2(明細)
				MCList<PurcDscnt_Ins01_DtlR> dtl = up1().subList(idxkey, r.peg_no());
				addAll(ope.up2(), dtl, createMap_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR());
				// up3(詳細)
				addAll(ope.up3(), dtl, createMap_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR());
				setPegNo(Purc_Ins01_IoR.$peg_no, ope.up3());
			}
			ope.exec();
			
			// 更新サービスの下り電文設定（ヘッダ） 
			String[] hdrDestCols = new String[] {PurcDscnt_Ins01_HdrR.$purc_act_rev};
			String[] hdrSrcCols = new String[] {Purc_Ins01_HdrR.$purc_act_rev};
			copyByPegNo(up0(), hdrDestCols, ope.down0(),  hdrSrcCols);
			
			// SVの下り電文を取得（明細）
			String[] dtlDestCols = new String[] {PurcDscnt_Ins01_DtlR.$purc_act_d_no};
			String[] dtlSrcCols = new String[] {Purc_Ins01_DtlR.$purc_act_d_no};
			copyByPegNo(up1(), dtlDestCols, ope.down1(),  dtlSrcCols);
		}
	}
	/**
	 * PurcDscnt_Del01オペレーション.<p>
	 *
	 * 仕入値引情報を削除します。<br>
	 */
	public class PurcDscnt_Del01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 仕入実績削除
			callPurcActRegDelSrv();
		}
		
		protected void callPurcActRegDelSrv() {
			MCList<PurcDscnt_Ins01_HdrR> subL = getChkList(up0());
			MCIndexKey idxkey = up1().createIndex(PurcDscnt_Ins01_DtlR.$hdr_peg_no);
			
			MSBDL_PurcActRegService.Purc_Del01 ope = MSBDL_PurcActRegService.crtPurc_Del01();
			// up0(制御ブロック)
			ope.up0().io_make_flg(true);
			// up1(ヘッダ)
			addAll(ope.up1(), subL, createMap_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR());
			
			for (PurcDscnt_Ins01_HdrR r : subL) {
				// up2(明細)
				MCList<PurcDscnt_Ins01_DtlR> dtl = up1().subList(idxkey, r.peg_no());
				addAll(ope.up2(), dtl, createMap_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR());
				// up3(詳細)
				addAll(ope.up3(), dtl, createMap_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR());
				setPegNo(Purc_Ins01_IoR.$peg_no, ope.up3());
			}
			ope.exec();
		}
	}
	/** 仕入実績登録ＳＶコール用MAP（ヘッダブロック） */
	protected Map_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR<Purc_Ins01_HdrR,PurcDscnt_Ins01_HdrR> createMap_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR() {
		return new Map_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR<Purc_Ins01_HdrR, PurcDscnt_Ins01_HdrR>();
	}
	public class Map_Purc_Ins01_HdrR_PurcDscnt_Ins01_HdrR<D extends Purc_Ins01_HdrR, S extends PurcDscnt_Ins01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_HdrR.$data_crud_typ, PurcDscnt_Ins01_HdrR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$peg_no, PurcDscnt_Ins01_HdrR.$peg_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_no, PurcDscnt_Ins01_HdrR.$purc_act_no);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_seq, PurcDscnt_Ins01_HdrR.$purc_act_seq);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_act_rev, PurcDscnt_Ins01_HdrR.$purc_act_rev);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cd, PurcDscnt_Ins01_HdrR.$trd_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_ptn_typ, PurcDscnt_Ins01_HdrR.$trd_ptn_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$slip_sts_typ, PurcDscnt_Ins01_HdrR.$slip_sts_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dpt_cd, PurcDscnt_Ins01_HdrR.$purc_dpt_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$wg_cd, PurcDscnt_Ins01_HdrR.$wg_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_usr_cd, PurcDscnt_Ins01_HdrR.$purc_usr_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$sppl_cd, PurcDscnt_Ins01_HdrR.$sppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$asppl_cd, PurcDscnt_Ins01_HdrR.$asppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$bsppl_cd, PurcDscnt_Ins01_HdrR.$bsppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$psppl_cd, PurcDscnt_Ins01_HdrR.$psppl_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$cred_cd, PurcDscnt_Ins01_HdrR.$cred_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_cur_cd, PurcDscnt_Ins01_HdrR.$trd_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_cur_cd, PurcDscnt_Ins01_HdrR.$ptax_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$base_cur_cd, PurcDscnt_Ins01_HdrR.$base_cur_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$xrate_cd, PurcDscnt_Ins01_HdrR.$xrate_cd);
			addColumnPathMap(Purc_Ins01_HdrR.$xrate, PurcDscnt_Ins01_HdrR.$xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_xrate, PurcDscnt_Ins01_HdrR.$ptax_xrate);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_dt, PurcDscnt_Ins01_HdrR.$purc_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ac_dt, PurcDscnt_Ins01_HdrR.$ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$can_ac_dt, PurcDscnt_Ins01_HdrR.$can_ac_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$pay_basis_dt, PurcDscnt_Ins01_HdrR.$pay_basis_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$pay_schd_dt, PurcDscnt_Ins01_HdrR.$pay_schd_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$ptax_dt, PurcDscnt_Ins01_HdrR.$ptax_dt);
			addColumnPathMap(Purc_Ins01_HdrR.$rcpt_iv_no, PurcDscnt_Ins01_HdrR.$rcpt_iv_no);
			addColumnPathMap(Purc_Ins01_HdrR.$ref_rcpt_iv_no, PurcDscnt_Ins01_HdrR.$ref_rcpt_iv_no);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd1, PurcDscnt_Ins01_HdrR.$tterm_cd1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks1, PurcDscnt_Ins01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd2, PurcDscnt_Ins01_HdrR.$tterm_cd2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks2, PurcDscnt_Ins01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_cd3, PurcDscnt_Ins01_HdrR.$tterm_cd3);
			addColumnPathMap(Purc_Ins01_HdrR.$tterm_rmrks3, PurcDscnt_Ins01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Purc_Ins01_HdrR.$trd_rmrks, PurcDscnt_Ins01_HdrR.$trd_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$intr_rmrks, PurcDscnt_Ins01_HdrR.$intr_rmrks);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char1, PurcDscnt_Ins01_HdrR.$sub_char1);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char2, PurcDscnt_Ins01_HdrR.$sub_char2);
			addColumnPathMap(Purc_Ins01_HdrR.$sub_char3, PurcDscnt_Ins01_HdrR.$sub_char3);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_amt_rnd_typ, PurcDscnt_Ins01_HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_rnd_typ, PurcDscnt_Ins01_HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$purc_tax_calc_typ, PurcDscnt_Ins01_HdrR.$purc_tax_calc_typ);
			addColumnPathMap(Purc_Ins01_HdrR.$upri_dec_place, PurcDscnt_Ins01_HdrR.$upri_dec_place);
			addColumnPathMap(Purc_Ins01_HdrR.$amt_dec_place, PurcDscnt_Ins01_HdrR.$amt_dec_place);
		}
	}
	/** 仕入実績登録ＳＶコール用MAP（明細ブロック） */
	protected Map_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR<Purc_Ins01_DtlR,PurcDscnt_Ins01_DtlR> createMap_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR() {
		return new Map_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR<Purc_Ins01_DtlR, PurcDscnt_Ins01_DtlR>();
	}
	public class Map_Purc_Ins01_DtlR_PurcDscnt_Ins01_DtlR<D extends Purc_Ins01_DtlR, S extends PurcDscnt_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_DtlR.$peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$hdr_peg_no, PurcDscnt_Ins01_DtlR.$hdr_peg_no);
			addColumnPathMap(Purc_Ins01_DtlR.$data_crud_typ, PurcDscnt_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_no, PurcDscnt_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_d_seq, PurcDscnt_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_no, PurcDscnt_Ins01_DtlR.$purc_act_no);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_act_seq, PurcDscnt_Ins01_DtlR.$purc_act_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$disp_seq, PurcDscnt_Ins01_DtlR.$disp_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_cd, PurcDscnt_Ins01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub1, PurcDscnt_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub2, PurcDscnt_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_sub3, PurcDscnt_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$itm_nm, PurcDscnt_Ins01_DtlR.$itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$iv_itm_nm, PurcDscnt_Ins01_DtlR.$iv_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_typ, PurcDscnt_Ins01_DtlR.$purc_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$mfg_inst_no, PurcDscnt_Ins01_DtlR.$mfg_inst_no);
			addColumnPathMap(Purc_Ins01_DtlR.$sundry_itm_flg, PurcDscnt_Ins01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_cd, PurcDscnt_Ins01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$sppl_itm_nm, PurcDscnt_Ins01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$sno1, PurcDscnt_Ins01_DtlR.$sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$sno2, PurcDscnt_Ins01_DtlR.$sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$sno3, PurcDscnt_Ins01_DtlR.$sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$sno4, PurcDscnt_Ins01_DtlR.$sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$lot_no, PurcDscnt_Ins01_DtlR.$lot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$sublot_no, PurcDscnt_Ins01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_cd, PurcDscnt_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_unit_qty, PurcDscnt_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_cd, PurcDscnt_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$base_unit_qty, PurcDscnt_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_cd, PurcDscnt_Ins01_DtlR.$tax_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$inc_tax_flg, PurcDscnt_Ins01_DtlR.$inc_tax_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$purc_dtl_upd_flg, PurcDscnt_Ins01_DtlR.$purc_dtl_upd_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_upri, PurcDscnt_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_amt, PurcDscnt_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_cur_tax_amt, PurcDscnt_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_upri, PurcDscnt_Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_amt, PurcDscnt_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$base_cur_tax_amt, PurcDscnt_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_upri, PurcDscnt_Ins01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_amt, PurcDscnt_Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$ptax_cur_tax_amt, PurcDscnt_Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$rsn_cd, PurcDscnt_Ins01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_rate, PurcDscnt_Ins01_DtlR.$wtax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$wtax_amt, PurcDscnt_Ins01_DtlR.$wtax_amt);
			addColumnPathMap(Purc_Ins01_DtlR.$maker_cd, PurcDscnt_Ins01_DtlR.$maker_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$ap_dpt_cd, PurcDscnt_Ins01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$pay_crryovr_times, PurcDscnt_Ins01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_cd, PurcDscnt_Ins01_DtlR.$bd_itm_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub1, PurcDscnt_Ins01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub2, PurcDscnt_Ins01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_sub3, PurcDscnt_Ins01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno1, PurcDscnt_Ins01_DtlR.$bd_sno1);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno2, PurcDscnt_Ins01_DtlR.$bd_sno2);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno3, PurcDscnt_Ins01_DtlR.$bd_sno3);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sno4, PurcDscnt_Ins01_DtlR.$bd_sno4);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_loc_cd, PurcDscnt_Ins01_DtlR.$bd_loc_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_lot_no, PurcDscnt_Ins01_DtlR.$bd_lot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_sublot_no, PurcDscnt_Ins01_DtlR.$bd_sublot_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_dpt_cd, PurcDscnt_Ins01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_wg_cd, PurcDscnt_Ins01_DtlR.$bd_wg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_ctg_cd, PurcDscnt_Ins01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_oper_cd, PurcDscnt_Ins01_DtlR.$bd_oper_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_slo_no, PurcDscnt_Ins01_DtlR.$bd_slo_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_iv_no, PurcDscnt_Ins01_DtlR.$bd_iv_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_po_no, PurcDscnt_Ins01_DtlR.$bd_po_no);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_bp_cd, PurcDscnt_Ins01_DtlR.$bd_bp_cd);
			addColumnPathMap(Purc_Ins01_DtlR.$po_no, PurcDscnt_Ins01_DtlR.$po_no);
			addColumnPathMap(Purc_Ins01_DtlR.$slo_no, PurcDscnt_Ins01_DtlR.$slo_no);
			addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_no, PurcDscnt_Ins01_DtlR.$ref_purc_act_no);
			addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_seq, PurcDscnt_Ins01_DtlR.$ref_purc_act_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_no, PurcDscnt_Ins01_DtlR.$ref_purc_act_d_no);
			addColumnPathMap(Purc_Ins01_DtlR.$ref_purc_act_d_seq, PurcDscnt_Ins01_DtlR.$ref_purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_DtlR.$base_purc_ac_dt, PurcDscnt_Ins01_DtlR.$base_purc_ac_dt);
			addColumnPathMap(Purc_Ins01_DtlR.$intr_rmrks, PurcDscnt_Ins01_DtlR.$intr_rmrks);
			addColumnPathMap(Purc_Ins01_DtlR.$trd_d_rmrks, PurcDscnt_Ins01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char1, PurcDscnt_Ins01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char2, PurcDscnt_Ins01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Ins01_DtlR.$sub_char3, PurcDscnt_Ins01_DtlR.$sub_char3);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_typ, PurcDscnt_Ins01_DtlR.$tax_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$tax_rate, PurcDscnt_Ins01_DtlR.$tax_rate);
			addColumnPathMap(Purc_Ins01_DtlR.$bd_itm_nm, PurcDscnt_Ins01_DtlR.$bd_itm_nm);
			addColumnPathMap(Purc_Ins01_DtlR.$asset_mng_typ, PurcDscnt_Ins01_DtlR.$asset_mng_typ);
			addColumnPathMap(Purc_Ins01_DtlR.$xpns_po_flg, PurcDscnt_Ins01_DtlR.$xpns_po_flg);
			addColumnPathMap(Purc_Ins01_DtlR.$stk_mng_typ, PurcDscnt_Ins01_DtlR.$stk_mng_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.abort_flg(false);
			dest.re_arr_flg(false);
			dest.re_arr_rqst_tm(null);
			dest.ncv_flg(false);
			dest.edi_flg(false);
			dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
		}
	}
	/** 仕入実績登録ＳＶコール用MAP（詳細ブロック） */
	protected Map_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR<Purc_Ins01_IoR,PurcDscnt_Ins01_DtlR> createMap_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR() {
		return new Map_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR<Purc_Ins01_IoR, PurcDscnt_Ins01_DtlR>();
	}
	public class Map_Purc_Ins01_IoR_PurcDscnt_Ins01_DtlR<D extends Purc_Ins01_IoR, S extends PurcDscnt_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Ins01_IoR.$peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$dtl_peg_no, PurcDscnt_Ins01_DtlR.$peg_no);
			addColumnPathMap(Purc_Ins01_IoR.$data_crud_typ, PurcDscnt_Ins01_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Ins01_IoR.$po_no, PurcDscnt_Ins01_DtlR.$po_no);
			addColumnPathMap(Purc_Ins01_IoR.$itm_cd, PurcDscnt_Ins01_DtlR.$itm_cd);
			addColumnPathMap(Purc_Ins01_IoR.$itm_sub1, PurcDscnt_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Ins01_IoR.$itm_sub2, PurcDscnt_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Ins01_IoR.$itm_sub3, PurcDscnt_Ins01_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_no, PurcDscnt_Ins01_DtlR.$purc_act_io_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_io_seq, PurcDscnt_Ins01_DtlR.$purc_act_io_seq);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_no, PurcDscnt_Ins01_DtlR.$purc_act_d_no);
			addColumnPathMap(Purc_Ins01_IoR.$purc_act_d_seq, PurcDscnt_Ins01_DtlR.$purc_act_d_seq);
			addColumnPathMap(Purc_Ins01_IoR.$lot_no, PurcDscnt_Ins01_DtlR.$lot_no);
			addColumnPathMap(Purc_Ins01_IoR.$sublot_no, PurcDscnt_Ins01_DtlR.$sublot_no);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_cd, PurcDscnt_Ins01_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_qty, PurcDscnt_Ins01_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_cd, PurcDscnt_Ins01_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Ins01_IoR.$base_unit_qty, PurcDscnt_Ins01_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_upri, PurcDscnt_Ins01_DtlR.$trd_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_amt, PurcDscnt_Ins01_DtlR.$trd_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$trd_cur_tax_amt, PurcDscnt_Ins01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_upri, PurcDscnt_Ins01_DtlR.$base_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_amt, PurcDscnt_Ins01_DtlR.$base_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$base_cur_tax_amt, PurcDscnt_Ins01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_upri, PurcDscnt_Ins01_DtlR.$ptax_cur_upri);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_amt, PurcDscnt_Ins01_DtlR.$ptax_cur_amt);
			addColumnPathMap(Purc_Ins01_IoR.$ptax_cur_tax_amt, PurcDscnt_Ins01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$wtax_amt, PurcDscnt_Ins01_DtlR.$wtax_amt);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char1, PurcDscnt_Ins01_DtlR.$sub_char1);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char2, PurcDscnt_Ins01_DtlR.$sub_char2);
			addColumnPathMap(Purc_Ins01_IoR.$sub_char3, PurcDscnt_Ins01_DtlR.$sub_char3);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_qty, PurcDscnt_Ins01_DtlR.$trd_unit_conv_qty);
			addColumnPathMap(Purc_Ins01_IoR.$trd_unit_conv_base_qty, PurcDscnt_Ins01_DtlR.$trd_unit_conv_base_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 取引単位が荷姿出ない場合は、荷姿単位を基準単位とする
			if (src.pack_flg()) {
				dest.pack_unit_cd(src.trd_unit_cd());
				dest.pack_unit_qty(src.trd_unit_qty());
			}
			else {
				dest.pack_unit_cd(src.base_unit_cd());
				dest.pack_unit_qty(src.base_unit_qty());
			}
		}
	}
	/**
	 * PurcDscnt_BulkImp_Chk01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、仕入値引情報の登録前のチェックを行います。<br>
	 */
	public class PurcDscnt_BulkImp_Chk01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_BulkImp_Chk01 {
		//----------------------------
		// Cache
		//----------------------------
		/** 製造指図 */
		MCList<MST_MFG_INST_R> _cacheMfgInstL = null;
		/** 品目製造指図 */
		MCList<MST_ITM_MFG_INST_R> _cacheItmMfgInstL = null;
		/** 仕入実績明細(参照用) */
		protected MCList<MST_PURC_ACT_D_R> _cachePurcActDLForRef = null;
		/** 諸口品マスタ */
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
		/** 品目マスタ(ロケール) */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _itmLclCache = null;

		protected void createSundryItmCache(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {

			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_nm);
			_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbc_bldr, dtlL,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub1,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub2,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub3,
					PurcDscnt_BulkImp_Chk01_DtlR.$sno1,
					PurcDscnt_BulkImp_Chk01_DtlR.$sno2,
					PurcDscnt_BulkImp_Chk01_DtlR.$sno3,
					PurcDscnt_BulkImp_Chk01_DtlR.$sno4);
		}

		protected MAM_SUNDRY_ITM_R getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3, String sno1, String sno2, String sno3,
				String sno4) {
			return _sundryItmCache.get(itmCd, itmSub1, itmSub2, itmSub3, sno1, sno2, sno3, sno4);
		}
		
		protected void createItmLclCache(MCList<PurcDscnt_BulkImp_Chk01_DtlR>  dtlL) {

			MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_nm);
			_itmLclCache = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(dbc_bldr,
					dtlL.subList(r -> !isNull(r.prnt_lcl_cd())),
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub1,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub2,
					PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub3,
					PurcDscnt_BulkImp_Chk01_DtlR.$prnt_lcl_cd);
		}

		protected MAM_ITM_LCL_R getItmLcl(String itmCd, String itmSub1, String itmSub2, String itmSub3, String lclCd) {
			return _itmLclCache.get(itmCd, itmSub1, itmSub2, itmSub3, lclCd);
		}

		//----------------------------
		// IndexKey
		//----------------------------
		/** 製造指図 */
		MCIndexKey _idxCacheMfgInst = null;
		/** 品目製造指図  */
		MCIndexKey _idxCacheItmMfgInst = null;
		/** 仕入実績明細(参照用) */
		protected MCIndexKey _idxCachePurcActDForRef = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			setHdrErrFlg(up0());

			MCList<PurcDscnt_BulkImp_Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callPurcDscnt_Chk01(notErrL);
				setHdrErrFlg(notErrL);
			}
		}
		
		@Override
		protected void initUp() {
			super.initUp();

			editUp();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			createCache();

			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up0());

			// 更新データのDACチェック処理
			msgL.addAll(checkWritableDptCdDac(up0(), PurcDscnt_BulkImp_Chk01_DtlR.$purc_dpt_cd));

			completionDtl();

			// 条件付必須チェック
			msgL.addAll(checkReqInCnd(up0()));
			
			msgL.addAll(checkDtlSub(up0()));

			// 負担項目の存在チェック
			msgL.addAll(existBdCheck(up0()));

			return msgL;
		}
		
		/**
		 * 補完処理
		 */
		protected void completionDtl() {
			// 固定値の補完
			up0().setStringNE(PurcDscnt_BulkImp_Chk01_DtlR.$ptax_cur_cd, getCo().ptax_cur_cd());
			up0().setStringNE(PurcDscnt_BulkImp_Chk01_DtlR.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(PurcDscnt_BulkImp_Chk01_DtlR.$xrate_cd, getCo().purc_xrate_cd());
			up0().setStringNE(PurcDscnt_BulkImp_Chk01_DtlR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
			up0().setStringNE(PurcDscnt_BulkImp_Chk01_DtlR.$xrate_rnd_typ, getCo().xrate_rnd_typ());

			for (PurcDscnt_BulkImp_Chk01_DtlR r : up0()) {
				setSundryItmNm(r);

				// 本来設定できないはずの項目は例え上ってきたとしても無視
				ignoreColumn(r);

				// 導出項目の設定
				editColumn(r);
			}
		}

		protected void createCache() {
			// 製造指図
			createCacheMfgInst(up0());
			// 仕入実績明細(参照用)
			createCachePurcActDForRef(up0());
			// 諸口品
			createSundryItmCache(up0());
			// 品目（ロケール）
			createItmLclCache(up0());
		}
		
		/**
		 * キャッシュ作成（製造指図）
		 * @param bindL
		 * @return
		 */
		protected void createCacheMfgInst(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {
			_cacheMfgInstL = MCList.create(MST_MFG_INST_R.class);
			dbSelectKey("MSBDL5240_MST_MFG_INST_S01", _cacheMfgInstL,
					MCQueryApiBuilder.create(MST_MFG_INST_R.create("T")),
					dtlL.subList(r -> !isNull(r.mfg_inst_no())));
			
			_idxCacheMfgInst = _cacheMfgInstL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			// 品目製造指図
			createCacheItmMfgInst(_cacheMfgInstL);
		}
		/**
		 * キャッシュ作成（品目製造指図）
		 * @param bindL
		 * @return
		 */
		protected void createCacheItmMfgInst(MCList<MST_MFG_INST_R> mfgInstL) {
			_cacheItmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder cacheItmMfgInstL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			cacheItmMfgInstL_bldr.addSelect(m1.asst_dpt_cd);
			cacheItmMfgInstL_bldr.addInnerJoin(m1, bracket( t.mfg_loc_cd.eq(m1.loc_cd)));
			dbSelectKey("MSBDL5240_MST_ITM_MFG_INST_S01", _cacheItmMfgInstL,
					cacheItmMfgInstL_bldr, mfgInstL.groupBy(MST_MFG_INST_R.$itm_mfg_inst_no));
			
			_idxCacheItmMfgInst = _cacheItmMfgInstL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
		}
		/**
		 * キャッシュ作成（仕入実績明細）参照用
		 */
		protected void createCachePurcActDForRef(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {
			_cachePurcActDLForRef = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder cachePurcActDLForRef_bldr = MCQueryApiBuilder.create(t);
			cachePurcActDLForRef_bldr.setSelect(t.purc_act_d_no);
			cachePurcActDLForRef_bldr.addSelect(t.purc_act_d_seq);
			cachePurcActDLForRef_bldr.addSelect(t.accpt_dfct_flg);
			cachePurcActDLForRef_bldr.setWhere(t.purc_act_d_no.eq(bind("ref_purc_act_d_no")));
			cachePurcActDLForRef_bldr.addWhereWithAnd(t.purc_act_d_seq.eq(bind("ref_purc_act_d_seq")));
			dbSelect("MSBDL5240_MST_PURC_ACT_D_S01",
					_cachePurcActDLForRef, cachePurcActDLForRef_bldr, dtlL);
			_idxCachePurcActDForRef  = _cachePurcActDLForRef.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
		}

		/**
		 * 条件付必須チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList checkReqInCnd(MCList<PurcDscnt_BulkImp_Chk01_DtlR> hdrL) {

			MCMessageList msgL = new MCMessageList();
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			for (PurcDscnt_BulkImp_Chk01_DtlR hdrR : hdrL) {
				if (!hdrR.sppl_iv_flg()) {
					msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$pay_basis_dt, rv));
				}
				else {
					if (hdrR.pay_spot_flg()) {
						msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$pay_schd_dt, rv));
					}
					else {
						msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$pay_basis_dt, rv));
					}
				}
				if (!isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
					msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$xrate, rv));
				}
				if (!isNull(getCo().ptax_cur_cd()) && !isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd())) {
					msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_xrate, rv));
				}
				if (!hdrR.dscnt_itm_flg()) {
					msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$trd_unit_cd, rv));
					msgL.addAll(check(hdrR, PurcDscnt_BulkImp_Chk01_DtlR.$trd_unit_qty, rv));
				}
			}
			return msgL;
		}

		protected MCMessageList checkDtlSub(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			for (PurcDscnt_BulkImp_Chk01_DtlR r : dtlL) {
				
				if(!isNull(r.trd_ptn_typ()) && !Arrays.asList(getAvailTrdTyp()).contains(MAC_TRD_PTN_TYP.getNE(r.trd_ptn_typ()))) {
					msgL.add(new MCMessage(r, null, MSBDL0613, r.trd_cd(), createTrdPtnTypErrMsg(), toDispGUIIndex(r)));
				}
				
				if ((MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(r.trd_ptn_typ())) 
						&& MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
					msgL.add(new MCMessage(r, null, MSBDL0195, toDispItm(r.itm_cd(), 
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
				}
				
				// 存在チェック（製造指図）
				MST_MFG_INST_R mfgInstR = _cacheMfgInstL.getFirst(_idxCacheMfgInst, r.mfg_inst_no());
				if (!isNull(r.mfg_inst_no()) && isNull(mfgInstR)) {
					msgL.add(new MCMessage(r, null , MSBDL0105, r.mfg_inst_no(), toDispGUIIndex(r)));
				}
				else {
					// 製造指図関連チェック
					msgL.addAll(checkExistMfgInst(r));
				}
				// 仕入実績関連チェック
				msgL.addAll(checkPurcAct(r));
				if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
					MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
							r.sno4());
					if (isNull(sundryItm) || sundryItm.isEmpty()) {
						msgL.add(new MCMessage(r, null, MSBDL0058, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		protected MAC_TRD_PTN_TYP[] getAvailTrdTyp() {
			return new MAC_TRD_PTN_TYP[] {MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS, MAC_TRD_PTN_TYP.PURC_DSCNT, MAC_TRD_PTN_TYP.PURC_XTRA, MAC_TRD_PTN_TYP.PURC_XTRA_XPNS};
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

		@Override
		protected void doSvrChkListLogicMain_addMsgOrNullValCompl(MCNumber paramIndex, MCRow chkTarR, String chkTarCol, MCLogicBase lstLgc, String lstLgcMtd, String listLogicId,
				MCRow bindRow, MCRow constBindRow, MCRow varBindRow, String firstKeyCol, String listOut, String listOutBase, MCMessageList msgLst) {
			if(isSame(chkTarCol,PurcDscnt_BulkImp_Chk01_DtlR.$trd_cd )) {
				chkTarR.setValueNE(PurcDscnt_BulkImp_Chk01_DtlR.$trd_ptn_typ, null);
			}
			super.doSvrChkListLogicMain_addMsgOrNullValCompl(paramIndex, chkTarR, chkTarCol, lstLgc, lstLgcMtd, listLogicId, bindRow, constBindRow, varBindRow, firstKeyCol, listOut,
					listOutBase, msgLst);
		}

		/**
		 * チェック処理（仕入実績関連）
		 */
		protected MCMessageList checkPurcAct(PurcDscnt_BulkImp_Chk01_DtlR dtlR) {
			MCMessageList msgL = new MCMessageList();
			if (isNullAnd(dtlR.ref_purc_act_d_no(), dtlR.ref_purc_act_d_seq())) {
				return msgL;
			}
			MST_PURC_ACT_D_R purcActDtlR = _cachePurcActDLForRef.getFirst(_idxCachePurcActDForRef, dtlR.ref_purc_act_d_no(), dtlR.ref_purc_act_d_seq());
			if (!isNull(purcActDtlR) && purcActDtlR.accpt_dfct_flg()) {
				// 検収不良、または、全数打切の仕入情報を参照情報とすることはできない
				msgL.add(new MCMessage(dtlR, null , MSBDL0104, dtlR.ref_purc_act_no(), dtlR.ref_purc_act_d_no(), toDispGUIIndex(dtlR)));
			}
			return msgL;
		}

		/**
		 * チェック処理（製造指図関連）
		 */
		protected MCMessageList checkExistMfgInst(PurcDscnt_BulkImp_Chk01_DtlR dtlR) {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(dtlR.mfg_inst_no())) {
				MST_MFG_INST_R mfgInstR = _cacheMfgInstL.getFirst(_idxCacheMfgInst, dtlR.mfg_inst_no());
				MST_ITM_MFG_INST_R itmMfgInstR = _cacheItmMfgInstL.getFirst(_idxCacheItmMfgInst, mfgInstR.itm_mfg_inst_no());
				// 負担部門の一致を確認
				if (!isSame(dtlR.bd_dpt_cd(), itmMfgInstR.getStringNE("ASST_DPT_CD"))) {
					//　部門不一致
					msgL.add(new MCMessage(dtlR, null , MSBDL0108, dtlR.bd_dpt_cd(), itmMfgInstR.getStringNE("ASST_DPT_CD"), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
				}
				if (!(isSame(dtlR.itm_cd(), itmMfgInstR.itm_cd())
						&& isSame(dtlR.itm_sub1(), itmMfgInstR.itm_sub1())
						&& isSame(dtlR.itm_sub2(), itmMfgInstR.itm_sub2())
						&& isSame(dtlR.itm_sub3(), itmMfgInstR.itm_sub3())
						&& isSame(dtlR.sno1(), itmMfgInstR.sno1())
						&& isSame(dtlR.sno2(), itmMfgInstR.sno2())
						&& isSame(dtlR.sno3(), itmMfgInstR.sno3())
						&& isSame(dtlR.sno4(), itmMfgInstR.sno4())
					)) {
					// 品目、手配ＮＯ不一致
					msgL.add(new MCMessage(dtlR, null, MSBDL0106, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
							toDispSno(dtlR.sno1(), dtlR.sno2(), dtlR.sno3(), dtlR.sno4()), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
				}
				if (!isSame(dtlR.sppl_cd(), itmMfgInstR.sppl_cd())) {
					// 発注先不一致
					msgL.add(new MCMessage(dtlR, null , MSBDL0107, dtlR.sppl_cd(), dtlR.mfg_inst_no(), toDispGUIIndex(dtlR)));
				}

			}
			return msgL;
		}
		
		/**
		 * チェック処理(負担項目の各種ＮＯの存在チェック）
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 * @return メッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PurcDscnt_BulkImp_Chk01_DtlR> bdLotChkTgtL = MCList.create(PurcDscnt_BulkImp_Chk01_DtlR.class);
					
			for (PurcDscnt_BulkImp_Chk01_DtlR dr : dtlL) {
				if (!isNull(dr.po_no())) {
					if (!existsPoNo(dr.po_no())) {
						msgL.add(new MCMessage(dr, PurcDscnt_BulkImp_Chk01_DtlR.$po_no, MSBDL0084, dr.po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_po_no())) {
					if (!existsPoNo(dr.bd_po_no())) {
						msgL.add(new MCMessage(dr, PurcDscnt_BulkImp_Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.slo_no())) {
					if (!existsSloNo(dr.slo_no())) {
						msgL.add(new MCMessage(dr, PurcDscnt_BulkImp_Chk01_DtlR.$slo_no, MSBDL0176, dr.slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_slo_no())) {
					if (!existsSloNo(dr.bd_slo_no())) {
						msgL.add(new MCMessage(dr, PurcDscnt_BulkImp_Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
					}
				}
				if (!isNull(dr.bd_lot_no())) {
					bdLotChkTgtL.add(dr);
				}
				if (!isNull(dr.bd_iv_no())) {
					if (!existsBdIvNo(dr.bd_iv_no())) {
						msgL.add(new MCMessage(dr, PurcDscnt_BulkImp_Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
					}
				}
				
			}		
			callLotServiceChkBdItm(bdLotChkTgtL);
			
			return msgL;
		}
		
		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param dtlL 明細上り電文リスト(新規、または更新)
		 */
		protected void callLotServiceChkBdItm(MCList<PurcDscnt_BulkImp_Chk01_DtlR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_PurcDscnt_BulkImp_Chk01_DtlR());
			ope.exec();		
			copyErrFlg(dtlL, ope.up0());
		}

		/***
		 * 上り電文編集
		 */
		protected void editUp() {
			// 固定値の補完
			up0().setString(PurcDscnt_BulkImp_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());

			setPegNo(PurcDscnt_BulkImp_Chk01_DtlR.$dtl_peg_no, up0());
			MCList<PurcDscnt_BulkImp_Chk01_DtlR>[] grpL = up0().groupList(getMergeTgtCols());
			int cnt = 0;
			for (MCList<PurcDscnt_BulkImp_Chk01_DtlR> l : grpL) {
				
				l.setNumber(PurcDscnt_BulkImp_Chk01_DtlR.$peg_no, cnt++);
				// 表示順の設定
				setDispSeq(l, PurcDscnt_BulkImp_Chk01_DtlR.$disp_seq);
			}
		}

		/**
		 * 条件に合致しないカラムは、たとえ上りに設定されていたとしても無視します。
		 */
		protected void ignoreColumn(PurcDscnt_BulkImp_Chk01_DtlR dtlR) {
			// 品名
			if (!dtlR.sundry_itm_flg()) {
				dtlR.itm_nm(null);
			}
			// インボイス表記品名
			if (dtlR.sppl_iv_flg() && !dtlR.sundry_itm_flg()) {
				dtlR.iv_itm_nm(null);
			}
			// 源泉税率
			if (!(isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())
					&& (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())
							|| isNull(dtlR.ptax_cur_cd())))) {
				dtlR.wtax_rate(null);
				dtlR.wtax_amt(null);
			}
			// 製造指図ＮＯ
			if (MAC_PURC_TYP.isPURC_ITM(dtlR.purc_typ())) {
				dtlR.mfg_inst_no(null);
			}
			// 負担品目ＣＤ
			if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				dtlR.bd_itm_cd(null);
				dtlR.bd_itm_sub1(null);
				dtlR.bd_itm_sub2(null);
				dtlR.bd_itm_sub3(null);
				dtlR.bd_itm_nm(null);
				dtlR.bd_lot_mng_typ(null);
				dtlR.bd_sublot_mng_typ(null);
				dtlR.bd_lot_no_typ(null);
				dtlR.bd_sublot_no_typ(null);
				dtlR.bd_sno1_mng_typ(null);
				dtlR.bd_sno2_mng_typ(null);
				dtlR.bd_sno3_mng_typ(null);
				dtlR.bd_sno4_mng_typ(null);
				dtlR.bd_sno1(null);
				dtlR.bd_sno2(null);
				dtlR.bd_sno3(null);
				dtlR.bd_sno4(null);
				dtlR.bd_lot_no(null);
				dtlR.bd_sublot_no(null);
				dtlR.bd_ctg_cd(null);
				dtlR.bd_oper_cd(null);
				dtlR.bd_iv_no(null);
				dtlR.bd_loc_cd(null);
				dtlR.bd_po_no(null);
				dtlR.bd_slo_no(null);
			}

			if (!dtlR.sppl_iv_flg()) {
				// 受領インボイスＮＯ
				dtlR.rcpt_iv_no(null);
				// 対応受領インボイスＮＯ
				dtlR.ref_rcpt_iv_no(null);
				// 支払予定日
				dtlR.pay_schd_dt(null);
			}
			else {
				// 支払起算日
				if (dtlR.pay_spot_flg()) {
					dtlR.pay_basis_dt(null);
				}
				// 支払予定日
				else {
					dtlR.pay_schd_dt(null);
				}
			}
		}

		/**
		 * 導出項目等を設定します
		 * @param hdrR
		 * @param dtlR
		 */
		protected void editColumn(PurcDscnt_BulkImp_Chk01_DtlR dtlR) {
			setDefXRate(dtlR);
			setDefPtaxXRate(dtlR);
			if (dtlR.dscnt_itm_flg()) {
				dtlR.trd_unit_cd(dtlR.base_unit_cd());
				dtlR.trd_unit_qty(MCNumber.ONE);
				dtlR.base_unit_qty(MCNumber.ONE);
			}
			else {

			// 基準単位数
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
			setTaxAmt(dtlR);
			
			// 源泉税率
			setDefWtaxRate(dtlR);
			
			// ＩＶ表記品名
			setDefIvItmNm(dtlR);
		}

		/**
		 * 為替レートを設定する
		 * @param r
		 */
		protected void setDefXRate(PurcDscnt_BulkImp_Chk01_DtlR r) {
			if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
				r.xrate(MCNumber.ONE);
			}
			else if (isNull(r.xrate())) {
				try {
					r.xrate(getDefXrate(r.trd_cur_cd(), getCo().base_cur_cd(), getCo().purc_xrate_cd(), r.purc_dt()));
				} catch (MCAppException e) {
					MCMessage msg = e.getMCMessage();
					msg.setCauseRow(r, null);
					MCMessagePool.add(msg);
					r.err_flg(true);
				}
			}
		}
		
		protected void setDefPtaxXRate(PurcDscnt_BulkImp_Chk01_DtlR r) {
			String ptaxCurCd = getCo().ptax_cur_cd();
			
			if(isNull(ptaxCurCd)) {
				clearPtax(r);
				return;
			}
			
			if (isSame(r.trd_cur_cd(), ptaxCurCd)) {
				r.ptax_xrate(MCNumber.ONE);
			}
			else if (isEmpPtaxXrate(ptaxCurCd, r.ptax_xrate())) {
				try {
					r.ptax_xrate(getDefXrate(r.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().purc_xrate_cd(), r.purc_dt()));
				} catch (MCAppException e) {
					MCMessage msg = e.getMCMessage();
					msg.setCauseRow(r, null);
					MCMessagePool.add(msg);
					r.err_flg(true);
				}
			}
		}
		protected boolean isEmpPtaxXrate(String ptaxCurCd, MCNumber ptaxXrate) {
			return !isNull(ptaxCurCd) && isNull(ptaxXrate);
		}
		
		/**
		 * 税額を設定する
		 * @param r
		 */
		protected void setTaxAmt(PurcDscnt_BulkImp_Chk01_DtlR r) {
			// 基準通貨税額
			if (!isNull(r.ptax_cur_cd())
					|| MAC_TAX_CALC_TYP.isSLIP(r.purc_tax_calc_typ())
					|| isSame(r.tax_rate(), MCNumber.ZERO)
					|| isSame(r.xrate(), MCNumber.ZERO)
					|| isNull(r.xrate())) {
				r.base_cur_tax_amt(null);
			}
			// 納税通貨税額
			if (isNull(r.ptax_cur_cd())
					|| MAC_TAX_CALC_TYP.isSLIP(r.purc_tax_calc_typ())
					|| isSame(r.tax_rate(), MCNumber.ZERO)
					|| isSame(r.ptax_xrate(), MCNumber.ZERO)
					|| isNull(r.ptax_xrate())) {
				r.ptax_cur_tax_amt(null);
			}
			// 基準通貨税額が指定されている場合
			if (!isNull(r.base_cur_tax_amt())) {
				if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
					// 取引通貨＝基準通貨の場合　取引通貨税額に手入力された基準通貨を設定
					r.trd_cur_tax_amt(r.base_cur_tax_amt());
				}
				else {
					// 取引通貨＜＞基準通貨の場合　基準通貨税額から取引通貨税額に設定
					r.trd_cur_tax_amt(r.base_cur_tax_amt().divide(r.xrate(),
							r.amt_dec_place().intValue(),
							MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				}
			}
			//基準通貨税額が未入力の場合
			else {
				MCRow rsltRow = getAmtAndTax(r.trd_cur_upri(), r.trd_unit_qty(), r.tax_rate(), r.inc_tax_flg(), 
						r.amt_dec_place(), r.purc_amt_rnd_typ(), r.purc_tax_rnd_typ(), MCNumber.ZERO);
				r.trd_cur_tax_amt(rsltRow.getNumberNE("tax_amt"));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), r.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			// 納税通貨税額が指定されている場合
			if (!isNull(r.ptax_cur_tax_amt())) {
				if (isSame(r.trd_cur_cd(), getCo().ptax_cur_cd())) {
					// 取引通貨＝納税通貨の場合　取引通貨税額に手入力された納税通貨を設定
					r.trd_cur_tax_amt(r.ptax_cur_tax_amt());
				}
				else {
					// 取引通貨＜＞納税通貨の場合　納税通貨税額から取引通貨税額に設定
					r.trd_cur_tax_amt(r.ptax_cur_tax_amt().divide(r.ptax_xrate(),
							r.amt_dec_place().intValue(),
							MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				}
			}
		}

		/**
		 * 源泉徴収税率を設定する
		 * @param up
		 */
		protected void setDefWtaxRate(PurcDscnt_BulkImp_Chk01_DtlR up) {
			if (isNull(up.wtax_rate())
					&& isNullAnd(up.ref_purc_act_no(), up.ref_purc_act_d_no())) {
				MCNumber wtaxRate = execFuncNumber(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
						MAPA_TAX$F_GET_WTAX_RATE(bind("itm_cd"), bind("itm_sub1"),
								bind("itm_sub2"), bind("itm_sub3"), bind("ac_dt")),
						up);
				up.wtax_rate(wtaxRate);
			}
		}

		/**
		 * ＩＶ表記品名を設定する
		 * @param r
		 */
		protected void setDefIvItmNm(PurcDscnt_BulkImp_Chk01_DtlR r) {
			if (r.sppl_iv_flg() && isNull(r.iv_itm_nm())) {
				MAM_ITM_LCL_R itmLclR = getItmLcl(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prnt_lcl_cd());
				r.iv_itm_nm(itmLclR.itm_nm());
			}
		}

		protected void clearPtax(PurcDscnt_BulkImp_Chk01_DtlR r) {
			r.ptax_xrate(null);
			r.ptax_cur_upri(null);
			r.ptax_cur_amt(null);
		}
		
		protected void setSundryItmNm(PurcDscnt_BulkImp_Chk01_DtlR r) {
			if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
				//そのまま上らせる
			}
			else if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && r.sundry_itm_flg()) {
				MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(),
						r.sno4());
				r.itm_nm(sundryItm.itm_nm());
			}
			else {
				r.itm_nm(null);
				r.iv_itm_nm(null);
			}
		}
		
		protected void callPurcDscnt_Chk01(MCList<PurcDscnt_BulkImp_Chk01_DtlR> notErrL) {
			PurcDscnt_Chk01 chkOpe = MSBDL_PurcDscntRegService.crtPurcDscnt_Chk01();

			// 登録・訂正前チェック上り電文設定
			MCList<PurcDscnt_BulkImp_Chk01_DtlR>[] grpL = up0().groupList(PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
			for (MCList<PurcDscnt_BulkImp_Chk01_DtlR> l : grpL) {
				PurcDscnt_BulkImp_Chk01_DtlR hdrR = l.get(0);
				PurcDscnt_Ins01_HdrR opeUp0R = chkOpe.up0().createRow();
				copy(opeUp0R, hdrR, createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR());
				chkOpe.up0().add(opeUp0R);
				
				addAll(chkOpe.up1(), l, createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR());
			}

			chkOpe.exec();

			copyErrFlg(notErrL, chkOpe.down1(), PurcDscnt_BulkImp_Chk01_DtlR.$dtl_peg_no, PurcDscnt_Ins01_DtlR.$peg_no);

			// 関連エラーメッセージを追加
			MCMessagePool.addAll(getRelationErrMsg(chkOpe.down0(), chkOpe.down1()));
		}

		/***
		 * エラーフラグ設定</br>
		 */
		protected void setHdrErrFlg(MCList<PurcDscnt_BulkImp_Chk01_DtlR> notErrL) {
			// 明細に１件でもエラーが存在した場合、同一ヘッダのレコードは全てエラーとする
			MCList<PurcDscnt_BulkImp_Chk01_DtlR>[] grpL = notErrL.groupList(PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
			for (MCList<PurcDscnt_BulkImp_Chk01_DtlR> l : grpL) {
				boolean dtl_err_flg = !isNull(l.getFirst(PurcDscnt_BulkImp_Chk01_DtlR.$err_flg, true));

				l.setBooleanNE(PurcDscnt_BulkImp_Chk01_DtlR.$err_flg, dtl_err_flg);
			}
		}

		/***
		 * ヘッダ行まとめ項目取得
		 * 
		 * @return ヘッダ行まとめ項目
		 */
		protected String[] getMergeTgtCols() {
			return new String[] {
					PurcDscnt_BulkImp_Chk01_DtlR.$trd_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$purc_usr_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$purc_dpt_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$sppl_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$trd_cur_cd,
					PurcDscnt_BulkImp_Chk01_DtlR.$trd_rmrks,
					PurcDscnt_BulkImp_Chk01_DtlR.$intr_rmrks,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd1,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks1,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd2,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks2,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd3,
					PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks3,
					PurcDscnt_BulkImp_Chk01_DtlR.$sub_char1,
					PurcDscnt_BulkImp_Chk01_DtlR.$sub_char2,
					PurcDscnt_BulkImp_Chk01_DtlR.$sub_char3,
					PurcDscnt_BulkImp_Chk01_DtlR.$purc_dt,
					PurcDscnt_BulkImp_Chk01_DtlR.$ac_dt,
					PurcDscnt_BulkImp_Chk01_DtlR.$pay_basis_dt,
					PurcDscnt_BulkImp_Chk01_DtlR.$pay_schd_dt,
					PurcDscnt_BulkImp_Chk01_DtlR.$rcpt_iv_no,
					PurcDscnt_BulkImp_Chk01_DtlR.$ref_rcpt_iv_no,
					PurcDscnt_BulkImp_Chk01_DtlR.$xrate,
					PurcDscnt_BulkImp_Chk01_DtlR.$ptax_dt,
					PurcDscnt_BulkImp_Chk01_DtlR.$ptax_xrate
			};
		}
		
		protected Map_Lot_Chk03_CndR_PurcDscnt_BulkImp_Chk01_DtlR<Lot_Chk03_CndR,PurcDscnt_BulkImp_Chk01_DtlR> createMap_Lot_Chk03_CndR_PurcDscnt_BulkImp_Chk01_DtlR() {
			return new Map_Lot_Chk03_CndR_PurcDscnt_BulkImp_Chk01_DtlR<Lot_Chk03_CndR, PurcDscnt_BulkImp_Chk01_DtlR>();
		}

		public class Map_Lot_Chk03_CndR_PurcDscnt_BulkImp_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends PurcDscnt_BulkImp_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$err_flg, PurcDscnt_BulkImp_Chk01_DtlR.$err_flg);
			}
		}
	}
	/**
	 * PurcDscnt_BulkImp_Ins01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、仕入値引情報の登録を行います。<br>
	 */
	public class PurcDscnt_BulkImp_Ins01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_BulkImp_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callPurcDscnt_Ins01();
		}

		/***
		 * 登録呼び出し
		 */
		protected void callPurcDscnt_Ins01() {
			PurcDscnt_Ins01 insOpe = MSBDL_PurcDscntRegService.crtPurcDscnt_Ins01();

			MCList<PurcDscnt_BulkImp_Chk01_DtlR>[] grpL = up0().groupList(PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
			for (MCList<PurcDscnt_BulkImp_Chk01_DtlR> l : grpL) {
				PurcDscnt_BulkImp_Chk01_DtlR hdrR = l.get(0);

				PurcDscnt_Ins01_HdrR opeUp0R = insOpe.up0().createRow();
				copy(opeUp0R, hdrR, createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR());
				opeUp0R.amt_calc_flg(true);
				insOpe.up0().add(opeUp0R);

				addAll(insOpe.up1(), l, createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR());
			}

			insOpe.exec();
		}
	}
	
	protected static final Class<MSBDL_PurcDscntRegService> CLAZZ = MSBDL_PurcDscntRegService.class;
	protected MCList<MST_PURC_ACT_D_R> _cachePurcActD = null;
	protected MCIndexKey _idxCachePurcActD = null;

	/**
	 * 仕入実績明細トランをキャッシュする
	 * 
	 * @param dtlL　抽出対象リスト
	 */
	protected static void createCachePurcActD(MCList<PurcDscnt_BulkImp_Chk02_DtlR> srcL) {
		object(CLAZZ)._createCachePurcActD(srcL);
	}
	/***
	 * 仕入実績明細レコードリスト取得
	 * 
	 * @param srcL 抽出対象リスト
	 */
	protected void _createCachePurcActD(MCList<PurcDscnt_BulkImp_Chk02_DtlR> srcL) {
		// 仕入実績明細検索
		_cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MCQueryApiBuilder cachePurcActD_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_IO_R t1 = MST_PURC_ACT_IO_R.create("T1");
		cachePurcActD_bldr.setSelect(t.purc_act_d_no, t.purc_act_d_seq, t.purc_act_no, t.purc_act_seq);
		cachePurcActD_bldr.addSelect(t1.purc_act_io_no);
		cachePurcActD_bldr.addSelect(t1.purc_act_io_seq);
		cachePurcActD_bldr.addLeftOuterJoin(t1, bracket( t.purc_act_d_no.eq(t1.purc_act_d_no) 
				.and(t.purc_act_d_seq.eq(t1.purc_act_d_seq))));
		cachePurcActD_bldr.setWhere(t.purc_act_no.eq(bind("purc_act_no")));
		cachePurcActD_bldr.addWhereWithAnd(t.purc_act_seq.eq(bind("purc_act_seq")));
		dbSelect("MSBDL5240_MST_PURC_ACT_D_S02",
				_cachePurcActD, cachePurcActD_bldr, srcL);

		_idxCachePurcActD  = _cachePurcActD.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
	}

	/**
	 * キャッシュから仕入実績明細を取得する
	 * @param r
	 * @param dataCrudTyp
	 * @return　MST_WG_RQST_R
	 */
	protected static MCList<MST_PURC_ACT_D_R> getPurcActDL(PurcDscnt_BulkImp_Chk02_DtlR r) {
		return object(CLAZZ)._getPurcActDL(r);
	}
	protected MCList<MST_PURC_ACT_D_R> _getPurcActDL(PurcDscnt_BulkImp_Chk02_DtlR r) {
		if(_cachePurcActD == null) {
			_cachePurcActD = MCList.create(MST_PURC_ACT_D_R.class);
			_idxCachePurcActD = _cachePurcActD.createIndex(MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq);
		}
		return _cachePurcActD.subList(_idxCachePurcActD, r.purc_act_no(), r.purc_act_seq());
	}

	/**
	 * PurcDscnt_BulkImp_Chk02オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、仕入値引情報の取消前のチェックを行います。<br>
	 */
	public class PurcDscnt_BulkImp_Chk02 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_BulkImp_Chk02 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUp() {
			super.initUp();

			editUp();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			doCompPurcAct(msgL);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			doCompPurcActD();
			
			MCList<PurcDscnt_BulkImp_Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callPurcDscnt_Chk01(notErrL);
				setHdrErrFlg(notErrL);
			}
			
			return msgL;
		}
		
		/***
		 * 上り電文編集
		 */
		protected void editUp() {
			up0().setString(PurcDscnt_BulkImp_Chk02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			setPegNo(up0());
		}
		
		/***
		 * エラーフラグ設定</br>
		 */
		protected void setHdrErrFlg(MCList<PurcDscnt_BulkImp_Chk02_DtlR> notErrL) {
			// 明細に１件でもエラーが存在した場合、同一ヘッダのレコードは全てエラーとする
			MCList<PurcDscnt_BulkImp_Chk02_DtlR>[] grpL = notErrL.groupList(PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_no);
			for (MCList<PurcDscnt_BulkImp_Chk02_DtlR> l : grpL) {
				boolean dtl_err_flg = !isNull(l.getFirst(PurcDscnt_BulkImp_Chk02_DtlR.$err_flg, true));

				l.setBooleanNE(PurcDscnt_BulkImp_Chk02_DtlR.$err_flg, dtl_err_flg);
			}
		}
		
		/***
		 * 仕入実績ヘッダの補完処理
		 */
		protected void doCompPurcAct(MCMessageList msgL) {
			// 仕入実績ヘッダ取得
			MCList<MST_PURC_ACT_R> purcActL = getPurcActL(up0());

			// 値補完
			MCIndexKey indexKey = purcActL.createIndex(MST_PURC_ACT_R.$purc_act_no);
			for (PurcDscnt_BulkImp_Chk02_DtlR destR : up0()) {

				MCList<MST_PURC_ACT_R> srcL = purcActL.subList(indexKey, destR.purc_act_no());
				if (srcL.isEmpty()) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_PURC_ACT", new String[] {
							MST_PURC_ACT_R.$purc_act_no
					}, new Comparable[] {
							destR.purc_act_no()
					}, destR));
					continue;
				}

				srcL.sort(SortType.DESC, MST_PURC_ACT_R.$purc_act_seq);
				MST_PURC_ACT_R srcR = srcL.get(0);
				destR.purc_act_seq(srcR.purc_act_seq());
				destR.purc_act_rev(srcR.purc_act_rev());
				destR.trd_cd(srcR.trd_cd());
				destR.trd_ptn_typ(srcR.trd_ptn_typ());
				destR.can_ac_dt(srcR.ac_dt());
				destR.upd_cntr(srcR.upd_cntr());
				destR.purc_dpt_cd(srcR.purc_dpt_cd());
				msgL.addAll(checkWritableDptCdDac(destR, MST_PURC_ACT_R.$purc_dpt_cd));
			}
		}
		
		/***
		 * 仕入実績明細の補完処理
		 */
		protected void doCompPurcActD() {

			MCList<PurcDscnt_BulkImp_Chk02_DtlR> subL = up0().subList(r -> !isNull(r.purc_act_seq()));
			if (subL.isEmpty()) {
				return ;
			}
			
			createCachePurcActD(subL);
		}

		/***
		 * 仕入実績ヘッダレコードリスト取得
		 * 
		 * @param srcL 抽出対象リスト
		 * @return 仕入実績ヘッダレコードリスト
		 */
		protected MCList<MST_PURC_ACT_R> getPurcActL(MCList<PurcDscnt_BulkImp_Chk02_DtlR> srcL) {
			// ワークテーブル登録
			MCList<MST_PURC_ACT_R> wkDbc = MCList.create(MST_PURC_ACT_R.class);
			srcL.groupBy(PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_no).forEach(r -> {
				MST_PURC_ACT_R tmpR = wkDbc.createRow();
				tmpR.purc_act_no(r.purc_act_no());
				wkDbc.add(tmpR);
			});
			MCQueryApiBuilder wkDbc_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
			dbWkDelete("MSBDL5240_MSW_PURC_ACT_D01", wkDbc_bldr.getBaseDbc());
			dbWkInsert("MSBDL5240_MSW_PURC_ACT_I01", wkDbc, wkDbc_bldr.getBaseDbc());

			// 仕入実績ヘッダ検索
			MCList<MST_PURC_ACT_R> dbc = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			MSW_PURC_ACT_KEY_R w = MSW_PURC_ACT_KEY_R.create("W");
			dbc_bldr.setSelect(t1.purc_act_no, t1.purc_act_seq, t1.purc_act_rev, t1.trd_cd, t1.trd_ptn_typ, t1.ac_dt, t1.purc_dpt_cd, t1.upd_cntr);
			dbc_bldr.addInnerJoin(w, bracket( t1.purc_act_no.eq(w.purc_act_no)));
			dbc_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBDL5240_MST_PURC_ACT_S01", dbc, dbc_bldr);

			return dbc;
		}
		

		
		/***
		 * 取消前チェック呼び出し
		 */
		protected void callPurcDscnt_Chk01(MCList<PurcDscnt_BulkImp_Chk02_DtlR> notErrL) {
			PurcDscnt_Chk01 chkOpe = MSBDL_PurcDscntRegService.crtPurcDscnt_Chk01();
			for (PurcDscnt_BulkImp_Chk02_DtlR r : notErrL) {
				PurcDscnt_Ins01_HdrR opeUp0R = chkOpe.up0().createRow();
				copy(opeUp0R, r, createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR());
				chkOpe.up0().add(opeUp0R);
				
				MCList<MST_PURC_ACT_D_R> subActDL = getPurcActDL(r);
				for (MST_PURC_ACT_D_R purcActDR : subActDL) {
					PurcDscnt_Ins01_DtlR opeUp1R = chkOpe.up1().createRow();
					copy(opeUp1R, r, createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR(purcActDR));
					chkOpe.up1().add(opeUp1R);
				}
			}

			setPegNo(chkOpe.up1());
			chkOpe.exec();

			copyErrFlg(notErrL, chkOpe.down1(), PurcDscnt_BulkImp_Chk01_DtlR.$peg_no, PurcDscnt_Ins01_DtlR.$hdr_peg_no);

			// 関連エラーメッセージを追加
			MCMessagePool.addAll(getRelationErrMsg(chkOpe.down0(), chkOpe.down1()));
		}
	}

	/***
	 * 関連エラーメッセージ取得
	 * 
	 * @param hdrL ヘッダレコードリスト
	 * @param dtlL 明細レコードリスト
	 * @return 関連エラーメッセージリスト
	 */
	protected MCMessageList getRelationErrMsg(MCList<PurcDscnt_Ins01_HdrR> hdrL, MCList<PurcDscnt_Ins01_DtlR> dtlL) {
		MCMessageList resultMsgL = new MCMessageList();

		MCIndexKey dtlIndexKey = dtlL.createIndex(PurcDscnt_Ins01_HdrR.$peg_no);
		for (PurcDscnt_Ins01_HdrR hdrR : hdrL) {
			MCList<PurcDscnt_Ins01_DtlR> tgtDtlL = dtlL.subList(dtlIndexKey, hdrR.peg_no());
			PurcDscnt_Ins01_DtlR causeDtlR = tgtDtlL.getFirst(PurcDscnt_Ins01_HdrR.$err_flg, true);

			// ヘッダ、明細共に正常の場合、次のヘッダへ
			if (!hdrR.err_flg() && isNull(causeDtlR)) {
				continue;
			}

			for (PurcDscnt_Ins01_DtlR dtlR : tgtDtlL) {
				if (hdrR.err_flg()) {
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
	/**
	 * PurcDscnt_BulkImp_Del01オペレーション.<p>
	 *
	 * まとめ登録ツールが取り込んだファイルの情報をもとに、仕入値引情報の削除を行います。<br>
	 */
	public class PurcDscnt_BulkImp_Del01 extends MSBDL_PurcDscntRegService_MC_A.PurcDscnt_BulkImp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callPurcDscnt_Del01();
		}

		/***
		 * 取消呼び出し
		 */
		protected void callPurcDscnt_Del01() {
			PurcDscnt_Del01 delOpe = MSBDL_PurcDscntRegService.crtPurcDscnt_Del01();
			for (PurcDscnt_BulkImp_Chk02_DtlR r : up0()) {
				PurcDscnt_Ins01_HdrR opeUp0R = delOpe.up0().createRow();
				copy(opeUp0R, r, createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR());
				delOpe.up0().add(opeUp0R);
				
				MCList<MST_PURC_ACT_D_R> subActDL = getPurcActDL(r);
				for (MST_PURC_ACT_D_R purcActDR : subActDL) {
					PurcDscnt_Ins01_DtlR opeUp1R = delOpe.up1().createRow();
					copy(opeUp1R, r, createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR(purcActDR));
					delOpe.up1().add(opeUp1R);
				}
			}
			
			setPegNo(delOpe.up1());
			delOpe.exec();
		}
	}
	
	protected Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR<PurcDscnt_Ins01_HdrR,PurcDscnt_BulkImp_Chk01_DtlR> createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR() {
		return new Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR<PurcDscnt_Ins01_HdrR, PurcDscnt_BulkImp_Chk01_DtlR>();
	}

	public class Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk01_DtlR<D extends PurcDscnt_Ins01_HdrR, S extends PurcDscnt_BulkImp_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$peg_no, PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$data_crud_typ, PurcDscnt_BulkImp_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_cd, PurcDscnt_BulkImp_Chk01_DtlR.$trd_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_ptn_typ, PurcDscnt_BulkImp_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_dpt_cd, PurcDscnt_BulkImp_Chk01_DtlR.$purc_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$wg_cd, PurcDscnt_BulkImp_Chk01_DtlR.$wg_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_usr_cd, PurcDscnt_BulkImp_Chk01_DtlR.$purc_usr_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sppl_cd, PurcDscnt_BulkImp_Chk01_DtlR.$sppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$asppl_cd, PurcDscnt_BulkImp_Chk01_DtlR.$asppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$bsppl_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bsppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$psppl_cd, PurcDscnt_BulkImp_Chk01_DtlR.$psppl_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$cred_cd, PurcDscnt_BulkImp_Chk01_DtlR.$cred_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_amt_rnd_typ, PurcDscnt_BulkImp_Chk01_DtlR.$purc_amt_rnd_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_tax_rnd_typ, PurcDscnt_BulkImp_Chk01_DtlR.$purc_tax_rnd_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_tax_calc_typ, PurcDscnt_BulkImp_Chk01_DtlR.$purc_tax_calc_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_cur_cd, PurcDscnt_BulkImp_Chk01_DtlR.$trd_cur_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$upri_dec_place, PurcDscnt_BulkImp_Chk01_DtlR.$upri_dec_place);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$amt_dec_place, PurcDscnt_BulkImp_Chk01_DtlR.$amt_dec_place);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ptax_cur_cd, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_cur_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$base_cur_cd, PurcDscnt_BulkImp_Chk01_DtlR.$base_cur_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_rmrks, PurcDscnt_BulkImp_Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$intr_rmrks, PurcDscnt_BulkImp_Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd1, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks1, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd2, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks2, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_cd3, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_cd3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$tterm_rmrks3, PurcDscnt_BulkImp_Chk01_DtlR.$tterm_rmrks3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char1, PurcDscnt_BulkImp_Chk01_DtlR.$sub_char1);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char2, PurcDscnt_BulkImp_Chk01_DtlR.$sub_char2);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$sub_char3, PurcDscnt_BulkImp_Chk01_DtlR.$sub_char3);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_dt, PurcDscnt_BulkImp_Chk01_DtlR.$purc_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ac_dt, PurcDscnt_BulkImp_Chk01_DtlR.$ac_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$pay_basis_dt, PurcDscnt_BulkImp_Chk01_DtlR.$pay_basis_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$pay_schd_dt, PurcDscnt_BulkImp_Chk01_DtlR.$pay_schd_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$rcpt_iv_no, PurcDscnt_BulkImp_Chk01_DtlR.$rcpt_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ref_rcpt_iv_no, PurcDscnt_BulkImp_Chk01_DtlR.$ref_rcpt_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$xrate_cd, PurcDscnt_BulkImp_Chk01_DtlR.$xrate_cd);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ptax_dt, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_dt);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$ptax_xrate, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_xrate);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.ptax_cur_cd(getCo().ptax_cur_cd());
			dest.base_cur_cd(getCo().base_cur_cd());
			dest.xrate_cd(getCo().purc_xrate_cd());
			
			// 為替レート
			if (isSame(src.trd_cur_cd(), getCo().base_cur_cd())) {
				dest.xrate(MCNumber.ONE);
			}
			else {
				dest.xrate(src.xrate());
			}
			// 納税為替レート
			if (isSame(src.trd_cur_cd(), getCo().ptax_cur_cd())) {
				dest.ptax_xrate(MCNumber.ONE);
			}
			else {
				dest.ptax_xrate(src.ptax_xrate());
			}
		}
	}
	
	/**
	 * 経費値引であるか否か
	 * @return
	 */
	protected boolean isXpns(String trdPtnTyp, String assetMngTyp) {
		if (MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(trdPtnTyp) 
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(trdPtnTyp)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR<PurcDscnt_Ins01_DtlR,PurcDscnt_BulkImp_Chk01_DtlR> createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR() {
		return new Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR<PurcDscnt_Ins01_DtlR, PurcDscnt_BulkImp_Chk01_DtlR>();
	}

	public class Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk01_DtlR<D extends PurcDscnt_Ins01_DtlR, S extends PurcDscnt_BulkImp_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$hdr_peg_no, PurcDscnt_BulkImp_Chk01_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$peg_no, PurcDscnt_BulkImp_Chk01_DtlR.$dtl_peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$data_crud_typ, PurcDscnt_BulkImp_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$dscnt_rsn_cd, PurcDscnt_BulkImp_Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_typ, PurcDscnt_BulkImp_Chk01_DtlR.$purc_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$mfg_inst_no, PurcDscnt_BulkImp_Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_cd, PurcDscnt_BulkImp_Chk01_DtlR.$itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub1, PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub2, PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_sub3, PurcDscnt_BulkImp_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$itm_nm, PurcDscnt_BulkImp_Chk01_DtlR.$itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$iv_itm_nm, PurcDscnt_BulkImp_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sppl_itm_cd, PurcDscnt_BulkImp_Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sppl_itm_nm, PurcDscnt_BulkImp_Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sundry_itm_flg, PurcDscnt_BulkImp_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_unit_cd, PurcDscnt_BulkImp_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_unit_qty, PurcDscnt_BulkImp_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$pack_flg, PurcDscnt_BulkImp_Chk01_DtlR.$pack_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_unit_cd, PurcDscnt_BulkImp_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_unit_qty, PurcDscnt_BulkImp_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_cd, PurcDscnt_BulkImp_Chk01_DtlR.$tax_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$inc_tax_flg, PurcDscnt_BulkImp_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_typ, PurcDscnt_BulkImp_Chk01_DtlR.$tax_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$tax_rate, PurcDscnt_BulkImp_Chk01_DtlR.$tax_rate);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_dtl_upd_flg, PurcDscnt_BulkImp_Chk01_DtlR.$purc_dtl_upd_flg);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_upri, PurcDscnt_BulkImp_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_amt, PurcDscnt_BulkImp_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_cur_tax_amt, PurcDscnt_BulkImp_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_upri, PurcDscnt_BulkImp_Chk01_DtlR.$base_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_amt, PurcDscnt_BulkImp_Chk01_DtlR.$base_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_cur_tax_amt, PurcDscnt_BulkImp_Chk01_DtlR.$base_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_upri, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_cur_upri);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_amt, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ptax_cur_tax_amt, PurcDscnt_BulkImp_Chk01_DtlR.$ptax_cur_tax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$wtax_rate, PurcDscnt_BulkImp_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$wtax_amt, PurcDscnt_BulkImp_Chk01_DtlR.$wtax_amt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$maker_cd, PurcDscnt_BulkImp_Chk01_DtlR.$maker_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ap_dpt_cd, PurcDscnt_BulkImp_Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$pay_crryovr_times, PurcDscnt_BulkImp_Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub1, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub2, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_itm_sub3, PurcDscnt_BulkImp_Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno1, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sno1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno2, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sno2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno3, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sno3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sno4, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sno4);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_lot_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_sublot_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_ctg_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_oper_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_iv_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_loc_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_po_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_po_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_slo_no, PurcDscnt_BulkImp_Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$asset_mng_typ, PurcDscnt_BulkImp_Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_dpt_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$bd_wg_cd, PurcDscnt_BulkImp_Chk01_DtlR.$bd_wg_cd);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$intr_rmrks, PurcDscnt_BulkImp_Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$trd_d_rmrks, PurcDscnt_BulkImp_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char1, PurcDscnt_BulkImp_Chk01_DtlR.$d_sub_char1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char2, PurcDscnt_BulkImp_Chk01_DtlR.$d_sub_char2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sub_char3, PurcDscnt_BulkImp_Chk01_DtlR.$d_sub_char3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_no, PurcDscnt_BulkImp_Chk01_DtlR.$ref_purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_seq, PurcDscnt_BulkImp_Chk01_DtlR.$ref_purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_d_no, PurcDscnt_BulkImp_Chk01_DtlR.$ref_purc_act_d_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$ref_purc_act_d_seq, PurcDscnt_BulkImp_Chk01_DtlR.$ref_purc_act_d_seq);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$base_purc_ac_dt, PurcDscnt_BulkImp_Chk01_DtlR.$base_purc_ac_dt);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno1, PurcDscnt_BulkImp_Chk01_DtlR.$sno1);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno2, PurcDscnt_BulkImp_Chk01_DtlR.$sno2);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno3, PurcDscnt_BulkImp_Chk01_DtlR.$sno3);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sno4, PurcDscnt_BulkImp_Chk01_DtlR.$sno4);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$lot_no, PurcDscnt_BulkImp_Chk01_DtlR.$lot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$sublot_no, PurcDscnt_BulkImp_Chk01_DtlR.$sublot_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$po_no, PurcDscnt_BulkImp_Chk01_DtlR.$po_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$slo_no, PurcDscnt_BulkImp_Chk01_DtlR.$slo_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$disp_seq, PurcDscnt_BulkImp_Chk01_DtlR.$disp_seq);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 経費時の補完
			if (isXpns(src.trd_ptn_typ(), src.asset_mng_typ())) {
				dest.xpns_po_flg(true);
				dest.bd_bp_cd(src.sppl_cd());
			}
			else {
				dest.xpns_po_flg(false);
			}
		}
	}
	
	protected Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR<PurcDscnt_Ins01_HdrR,PurcDscnt_BulkImp_Chk02_DtlR> createMap_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR() {
		return new Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR<PurcDscnt_Ins01_HdrR, PurcDscnt_BulkImp_Chk02_DtlR>();
	}

	public class Map_PurcDscnt_Ins01_HdrR_PurcDscnt_BulkImp_Chk02_DtlR<D extends PurcDscnt_Ins01_HdrR, S extends PurcDscnt_BulkImp_Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$peg_no, PurcDscnt_BulkImp_Chk02_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$data_crud_typ, PurcDscnt_BulkImp_Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$trd_ptn_typ, PurcDscnt_BulkImp_Chk02_DtlR.$trd_ptn_typ);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_no, PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_seq, PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_seq);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$purc_act_rev, PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_rev);
			addColumnPathMap(PurcDscnt_Ins01_HdrR.$can_ac_dt, PurcDscnt_BulkImp_Chk02_DtlR.$can_ac_dt);

		}
	}
	
	protected Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR<PurcDscnt_Ins01_DtlR,PurcDscnt_BulkImp_Chk02_DtlR> createMap_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR(MST_PURC_ACT_D_R purcActD) {
		return new Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR<PurcDscnt_Ins01_DtlR, PurcDscnt_BulkImp_Chk02_DtlR>(purcActD);
	}

	public class Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR<D extends PurcDscnt_Ins01_DtlR, S extends PurcDscnt_BulkImp_Chk02_DtlR> extends MCRowMapper<D,S>{
		MST_PURC_ACT_D_R _purcActD;
		Map_PurcDscnt_Ins01_DtlR_PurcDscnt_BulkImp_Chk02_DtlR(MST_PURC_ACT_D_R purcActD) {
			_purcActD = purcActD;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$peg_no, PurcDscnt_BulkImp_Chk02_DtlR.$dtl_peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$hdr_peg_no, PurcDscnt_BulkImp_Chk02_DtlR.$peg_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$data_crud_typ, PurcDscnt_BulkImp_Chk02_DtlR.$data_crud_typ);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_no, PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_no);
			addColumnPathMap(PurcDscnt_Ins01_DtlR.$purc_act_seq, PurcDscnt_BulkImp_Chk02_DtlR.$purc_act_seq);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.purc_act_d_no(_purcActD.purc_act_d_no());
			dest.purc_act_d_seq(_purcActD.purc_act_d_seq());
			dest.purc_act_io_no(_purcActD.getStringNE("purc_act_io_no"));
			dest.purc_act_io_seq(_purcActD.getNumberNE("purc_act_io_seq"));
		}
	}

	//FMCB CUSTOM END
}