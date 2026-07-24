package mcframe.serverMABS.MABSL0920;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL5030.MABSL_ProcUpriService;
import mcframe.serverMABS.MABSL5030.ProcUpri_Sprt01_DtlR;
import static mcframe.serverMABS.MABSL0920.Query.*;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ProcUpriChk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ProcUpriChk_MC extends MABSL_ProcUpriChk_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 加工単価の確認を行います。<br>
	 */
	public class Sprt01 extends MABSL_ProcUpriChk_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callProcUpriService();
			srchProcUpri();
		}
		
		protected void callProcUpriService(){
			// 加工単価取得サービス
			MABSL_ProcUpriService.ProcUpri_Sprt01 procService = MABSL_ProcUpriService.crtProcUpri_Sprt01();
			// 上り電文
			setPegNo(up0());
			setAll(procService.up0(), up0(), createMap_ProcUpri_Sprt01_DtlR_Sprt01_DtlR());
			
			procService.exec();
			String[] downCols = new String[] {Sprt01_DtlR.$upri, Sprt01_DtlR.$interim_flg};
			copyByPegNo(up0(), downCols, procService.down0(), downCols);
			down0().setAll(up0());
			for (Sprt01_DtlR r : down0()) {
				if (isNull(r.upri())) {
					r.err_flg(true);
				}
			}
		}
		
		// 加工単価取得
		protected void srchProcUpri() {
			executeQuery(down1(), MABSL0920_MAM_PROC_UPRI_S01());

			//　加工単価区分名の設定
			MAUCL_MCDataUtil.setConstNm(down1());
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(down1());
		}
	}
	
	protected Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<ProcUpri_Sprt01_DtlR,Sprt01_DtlR> createMap_ProcUpri_Sprt01_DtlR_Sprt01_DtlR() {
		return new Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<ProcUpri_Sprt01_DtlR, Sprt01_DtlR>();
	}

	public class Map_ProcUpri_Sprt01_DtlR_Sprt01_DtlR<D extends ProcUpri_Sprt01_DtlR, S extends Sprt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$sppl_cd, Sprt01_DtlR.$sppl_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$unit_cd, Sprt01_DtlR.$unit_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$qty, Sprt01_DtlR.$qty);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$cur_cd, Sprt01_DtlR.$cur_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$proc_upri_typ, Sprt01_DtlR.$proc_upri_typ);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$wg_cd, Sprt01_DtlR.$wg_cd);
			addColumnPathMap(ProcUpri_Sprt01_DtlR.$dt, Sprt01_DtlR.$dt);
		}
		
		@Override
		public void valueCopy(D dest, S src){
			// メーカＣＤ
			if (isNull(src.maker_cd())) {
				dest.maker_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.maker_cd(src.maker_cd());
			}
			// 納入場所ＣＤ
			if (isNull(src.loc_cd())) {
				dest.loc_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.loc_cd(src.loc_cd());
			}
			// 納品先ＣＤ
			if (isNull(src.dlv_cd())) {
				dest.dlv_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.dlv_cd(src.dlv_cd());
			}
		}
	}

	//FMCB CUSTOM END
}