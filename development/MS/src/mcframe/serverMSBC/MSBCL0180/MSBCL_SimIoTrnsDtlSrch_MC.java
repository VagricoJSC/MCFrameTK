package mcframe.serverMSBC.MSBCL0180;

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
import mcframe.serverMSBC.MSBCL0180.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL0070.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_SimIoTrnsDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_SimIoTrnsDtlSrch_MC extends MSBCL_SimIoTrnsDtlSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を在庫発生基準の観点で照会をする<br>
	 */
	public class Srch01 extends MSBCL_SimIoTrnsDtlSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {			
			super.doSearchMain();
			
			editUp(up0());
			
			mapUpContainers(IT);
			so01.exec();
			mapDownContainers(IT);	
		}
		
		@Override
		protected void editListSub() {			
			super.editListSub();
			down1().ac_dt(Cnd().ac_dt());
		}

	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を資産発生基準の観点で照会をする<br>
	 */
	public class Srch02 extends MSBCL_SimIoTrnsDtlSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {			
			super.doSearchMain();
			
			editUp(up0());
			
			mapUpContainers(IT);
			so02.exec();
			mapDownContainers(IT);	
		}
		
		@Override
		protected void editListSub() {			
			super.editListSub();
			down1().ac_dt(Cnd().ac_dt());
		}

	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を使用可能日基準の観点で照会をする<br>
	 */
	public class Srch03 extends MSBCL_SimIoTrnsDtlSrch_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {			
			super.doSearchMain();
			
			editUp(up0());
			
			mapUpContainers(IT);
			so03.exec();
			mapDownContainers(IT);	
		}
		
		@Override
		protected void editListSub() {			
			super.editListSub();
			down1().ac_dt(Cnd().ac_dt());
		}
	}
	
	protected void editUp(CndR r){
		if(r.tgt_ver_flg()){
			r.tgt_ver_flg(true);
			r.non_ver_flg(false);
		}
		else{
			r.tgt_ver_flg(true);
			r.non_ver_flg(true);
		}
		r.dtl_flg(true);
		r.srch_flg(false);
		r.amt_flg(false);
		if (isNull(r.sum_unit_typ()) && !isNull(r.disp_typ())) {
			setSumUnitTyp(r);
		}
	}
	
	protected void setSumUnitTyp(CndR r) {
		if (isSame(r.disp_typ(), "0")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.LOC.value());
		}
		else if (isSame(r.disp_typ(), "1")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.SITE.value());
		}
		else if (isSame(r.disp_typ(), "2")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.WG.value());
		}
		else if (isSame(r.disp_typ(), "3")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.LG_GRP.value());
		}
		else if (isSame(r.disp_typ(), "4")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.ALLOC_GRP.value());
		}
		else if (isSame(r.disp_typ(), "5")) {
			r.sum_unit_typ(MSC_SUM_UNIT_TYP.LOC_GRP.value());
		}
	}

	//FMCB CUSTOM END
}