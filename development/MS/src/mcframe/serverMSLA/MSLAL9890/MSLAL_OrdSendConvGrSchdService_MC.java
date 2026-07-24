package mcframe.serverMSLA.MSLAL9890;

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
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.commonMSLA.MSLAR2300.DtlR;
import mcframe.commonMSLA.MSLAR2300.MSLAR_OrdSndIOGrPrnt;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OrdSendConvGrSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OrdSendConvGrSchdService_MC extends MSLAL_OrdSendConvGrSchdService_MC_A{
	//FMCB CUSTOM START

	MCList<MAM_EXT_SYS_R> _extstSysL = null;
	MCIndexKey _extSysIdxkey = null;

	/**
	 * OrdSendConvGrSchd_Conv01オペレーション.<p>
	 *
	 */
	public class OrdSendConvGrSchd_Conv01 extends MSLAL_OrdSendConvGrSchdService_MC_A.OrdSendConvGrSchd_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_ORDSND_GR_SCHD_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("wg_cd", MAC_IF_COL_TYP.WG);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			
		}
	}
	/**
	 * OrdSendConvGrSchd_Conv02オペレーション.<p>
	 *
	 */
	public class OrdSendConvGrSchd_Conv02 extends MSLAL_OrdSendConvGrSchdService_MC_A.OrdSendConvGrSchd_Conv02 {
		
		MCList<MAM_EXT_SYS_R> _extstSysL = null;
		MCIndexKey _extSysIdxkey = null;

		@Override
		protected void call() {
			getExtSys();
			super.call();
		}
		
		
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_ORDSND_GR_SCHD_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OrdSndIOGrPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_ORDSND_GR_SCHD_IF_R());
		}

		protected void getExtSys() {

			_extstSysL = MCList.create(MAM_EXT_SYS_R.class);

			MAM_EXT_SYS_R extSysMst = MAM_EXT_SYS_R.create("M1");
			MCQueryApiBuilder extSysMst_bldr = MCQueryApiBuilder.create(extSysMst);
			extSysMst_bldr.setSelect(extSysMst.ext_sys_cd,extSysMst.null_val_if_flg);

			dbSelect("MSLAL9890_MAM_EXT_SYS_S01", _extstSysL, extSysMst_bldr);

			_extSysIdxkey = _extstSysL.createIndex(MAM_EXT_SYS_R.$ext_sys_cd);

		}
		
		protected Map_DtlR_MST_ORDSND_GR_SCHD_IF_R<DtlR,MST_ORDSND_GR_SCHD_IF_R> createMap_DtlR_MST_ORDSND_GR_SCHD_IF_R() {
			return new Map_DtlR_MST_ORDSND_GR_SCHD_IF_R<DtlR, MST_ORDSND_GR_SCHD_IF_R>();
		}

		public class Map_DtlR_MST_ORDSND_GR_SCHD_IF_R<D extends DtlR, S extends MST_ORDSND_GR_SCHD_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_lno, MST_ORDSND_GR_SCHD_IF_R.$data_lno);
				addColumnPathMap(DtlR.$data_no, MST_ORDSND_GR_SCHD_IF_R.$data_no);
				addColumnPathMap(DtlR.$itm_ord_no, MST_ORDSND_GR_SCHD_IF_R.$itm_ord_no);
				addColumnPathMap(DtlR.$io_schd_no, MST_ORDSND_GR_SCHD_IF_R.$io_schd_no);
				addColumnPathMap(DtlR.$io_schd_typ, MST_ORDSND_GR_SCHD_IF_R.$io_schd_typ);
				addColumnPathMap(DtlR.$io_schd_sts_typ, MST_ORDSND_GR_SCHD_IF_R.$io_schd_sts_typ);
				addColumnPathMap(DtlR.$ver_no, MST_ORDSND_GR_SCHD_IF_R.$ver_no);
				addColumnPathMap(DtlR.$lot_no, MST_ORDSND_GR_SCHD_IF_R.$lot_no);
				addColumnPathMap(DtlR.$sublot_no, MST_ORDSND_GR_SCHD_IF_R.$sublot_no);
				addColumnPathMap(DtlR.$qty, MST_ORDSND_GR_SCHD_IF_R.$qty);
				addColumnPathMap(DtlR.$avl_schd_dt, MST_ORDSND_GR_SCHD_IF_R.$avl_schd_dt);
				addColumnPathMap(DtlR.$lmt_dt, MST_ORDSND_GR_SCHD_IF_R.$lmt_dt);
				addColumnPathMap(DtlR.$sno1, MST_ORDSND_GR_SCHD_IF_R.$sno1);
				addColumnPathMap(DtlR.$sno2, MST_ORDSND_GR_SCHD_IF_R.$sno2);
				addColumnPathMap(DtlR.$sno3, MST_ORDSND_GR_SCHD_IF_R.$sno3);
				addColumnPathMap(DtlR.$sno4, MST_ORDSND_GR_SCHD_IF_R.$sno4);
				addColumnPathMap(DtlR.$sub_char1, MST_ORDSND_GR_SCHD_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MST_ORDSND_GR_SCHD_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MST_ORDSND_GR_SCHD_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MST_ORDSND_GR_SCHD_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MST_ORDSND_GR_SCHD_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MST_ORDSND_GR_SCHD_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MST_ORDSND_GR_SCHD_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MST_ORDSND_GR_SCHD_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MST_ORDSND_GR_SCHD_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MST_ORDSND_GR_SCHD_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_char11, MST_ORDSND_GR_SCHD_IF_R.$sub_char11);
				addColumnPathMap(DtlR.$sub_char12, MST_ORDSND_GR_SCHD_IF_R.$sub_char12);
				addColumnPathMap(DtlR.$sub_char13, MST_ORDSND_GR_SCHD_IF_R.$sub_char13);
				addColumnPathMap(DtlR.$sub_char14, MST_ORDSND_GR_SCHD_IF_R.$sub_char14);
				addColumnPathMap(DtlR.$sub_char15, MST_ORDSND_GR_SCHD_IF_R.$sub_char15);
				addColumnPathMap(DtlR.$sub_char16, MST_ORDSND_GR_SCHD_IF_R.$sub_char16);
				addColumnPathMap(DtlR.$sub_char17, MST_ORDSND_GR_SCHD_IF_R.$sub_char17);
				addColumnPathMap(DtlR.$sub_char18, MST_ORDSND_GR_SCHD_IF_R.$sub_char18);
				addColumnPathMap(DtlR.$sub_char19, MST_ORDSND_GR_SCHD_IF_R.$sub_char19);
				addColumnPathMap(DtlR.$sub_char20, MST_ORDSND_GR_SCHD_IF_R.$sub_char20);
				addColumnPathMap(DtlR.$sub_char21, MST_ORDSND_GR_SCHD_IF_R.$sub_char21);
				addColumnPathMap(DtlR.$sub_char22, MST_ORDSND_GR_SCHD_IF_R.$sub_char22);
				addColumnPathMap(DtlR.$sub_char23, MST_ORDSND_GR_SCHD_IF_R.$sub_char23);
				addColumnPathMap(DtlR.$sub_char24, MST_ORDSND_GR_SCHD_IF_R.$sub_char24);
				addColumnPathMap(DtlR.$sub_char25, MST_ORDSND_GR_SCHD_IF_R.$sub_char25);
				addColumnPathMap(DtlR.$sub_char26, MST_ORDSND_GR_SCHD_IF_R.$sub_char26);
				addColumnPathMap(DtlR.$sub_char27, MST_ORDSND_GR_SCHD_IF_R.$sub_char27);
				addColumnPathMap(DtlR.$sub_char28, MST_ORDSND_GR_SCHD_IF_R.$sub_char28);
				addColumnPathMap(DtlR.$sub_char29, MST_ORDSND_GR_SCHD_IF_R.$sub_char29);
				addColumnPathMap(DtlR.$sub_char30, MST_ORDSND_GR_SCHD_IF_R.$sub_char30);
				addColumnPathMap(DtlR.$sub_num1, MST_ORDSND_GR_SCHD_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MST_ORDSND_GR_SCHD_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MST_ORDSND_GR_SCHD_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_num4, MST_ORDSND_GR_SCHD_IF_R.$sub_num4);
				addColumnPathMap(DtlR.$sub_num5, MST_ORDSND_GR_SCHD_IF_R.$sub_num5);
				addColumnPathMap(DtlR.$sub_dt1, MST_ORDSND_GR_SCHD_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MST_ORDSND_GR_SCHD_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MST_ORDSND_GR_SCHD_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$sub_dt4, MST_ORDSND_GR_SCHD_IF_R.$sub_dt4);
				addColumnPathMap(DtlR.$sub_dt5, MST_ORDSND_GR_SCHD_IF_R.$sub_dt5);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_make_dt(src.ins_ts().toMCDate());
				
				dest.wg_cd(src.if_wg_cd());
				dest.itm_cd  (src.if_itm_cd ());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.loc_cd(src.if_loc_cd());
				
				MAM_EXT_SYS_R extSysR = _extstSysL.getFirst(_extSysIdxkey, src.ext_sys_cd());
				if (!isNull(extSysR) && !extSysR.null_val_if_flg()) {
					// 外部システムマスタの「ＮＵＬＬ文字ＩＦＦＬＧ」を参照し、オフの場合はNULL文字をNULLに変換する。
					dest.itm_sub1(MAC_STR.isNULL_VAL(src.itm_sub1())? null : src.itm_sub1());
					dest.itm_sub2(MAC_STR.isNULL_VAL(src.itm_sub2())? null : src.itm_sub2());
					dest.itm_sub3(MAC_STR.isNULL_VAL(src.itm_sub3())? null : src.itm_sub3());
				}
			}
			
		}

	}

	//FMCB CUSTOM END
}