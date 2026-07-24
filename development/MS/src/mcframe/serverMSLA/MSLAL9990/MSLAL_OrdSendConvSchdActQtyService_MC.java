package mcframe.serverMSLA.MSLAL9990;

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
import mcframe.commonMSLA.MSLAR2360.DtlR;
import mcframe.commonMSLA.MSLAR2360.MSLAR_OrdSndSchdActQtyPrnt;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OrdSendConvSchdActQtyService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OrdSendConvSchdActQtyService_MC extends MSLAL_OrdSendConvSchdActQtyService_MC_A{
	//FMCB CUSTOM START
	protected static final String DELIMITER = ":";
	/**
	 * OrdSendConvSchdActQty_Conv01オペレーション.<p>
	 *
	 */
	public class OrdSendConvSchdActQty_Conv01 extends MSLAL_OrdSendConvSchdActQtyService_MC_A.OrdSendConvSchdActQty_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_ORDSND_ACT_QTY_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("wg_cd", MAC_IF_COL_TYP.WG);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}
	}
	/**
	 * OrdSendConvSchdActQty_Conv02オペレーション.<p>
	 *
	 */
	public class OrdSendConvSchdActQty_Conv02 extends MSLAL_OrdSendConvSchdActQtyService_MC_A.OrdSendConvSchdActQty_Conv02 {

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
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_ORDSND_ACT_QTY_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OrdSndSchdActQtyPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_ORDSND_ACT_QTY_IF_R());
		}

		protected void getExtSys() {

			_extstSysL = MCList.create(MAM_EXT_SYS_R.class);

			MAM_EXT_SYS_R extSysMst = MAM_EXT_SYS_R.create("M1");
			MCQueryApiBuilder itmMst_bldr = MCQueryApiBuilder.create(extSysMst);

			dbSelect("MSLAL9990_MAM_EXT_SYS_S01", _extstSysL, itmMst_bldr);

			_extSysIdxkey = _extstSysL.createIndex(MAM_EXT_SYS_R.$ext_sys_cd);

		}

		public class Map_DtlR_MST_ORDSND_ACT_QTY_IF_R<D extends DtlR, S extends MST_ORDSND_ACT_QTY_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( DtlR.$data_lno, MST_ORDSND_ACT_QTY_IF_R.$data_lno);
				addColumnPathMap( DtlR.$data_no, MST_ORDSND_ACT_QTY_IF_R.$data_no);
				addColumnPathMap( DtlR.$data_crud_typ, MST_ORDSND_ACT_QTY_IF_R.$data_crud_typ);
				addColumnPathMap( DtlR.$ext_itm_ord_no, MST_ORDSND_ACT_QTY_IF_R.$ext_itm_ord_no);
				addColumnPathMap( DtlR.$ext_oper_ord_no, MST_ORDSND_ACT_QTY_IF_R.$ext_oper_ord_no);
				addColumnPathMap( DtlR.$itm_ord_no, MST_ORDSND_ACT_QTY_IF_R.$itm_ord_no);
				addColumnPathMap( DtlR.$oper_ord_no, MST_ORDSND_ACT_QTY_IF_R.$oper_ord_no);
				addColumnPathMap( DtlR.$itm_ord_sts_typ, MST_ORDSND_ACT_QTY_IF_R.$itm_ord_sts_typ);
				addColumnPathMap( DtlR.$oper_ord_sts_typ, MST_ORDSND_ACT_QTY_IF_R.$oper_ord_sts_typ);
				addColumnPathMap( DtlR.$act_qty, MST_ORDSND_ACT_QTY_IF_R.$act_qty);
				addColumnPathMap( DtlR.$base_unit_cd, MST_ORDSND_OPE_ACT_IF_R.$base_unit_cd);
				addColumnPathMap( DtlR.$base_unit_nm, MST_ORDSND_OPE_ACT_IF_R.$base_unit_nm);
				addColumnPathMap( DtlR.$sub_char1, MST_ORDSND_OPE_ACT_IF_R.$sub_char1);
				addColumnPathMap( DtlR.$sub_char2, MST_ORDSND_OPE_ACT_IF_R.$sub_char2);
				addColumnPathMap( DtlR.$sub_char3, MST_ORDSND_OPE_ACT_IF_R.$sub_char3);
				addColumnPathMap( DtlR.$sub_char4, MST_ORDSND_OPE_ACT_IF_R.$sub_char4);
				addColumnPathMap( DtlR.$sub_char5, MST_ORDSND_OPE_ACT_IF_R.$sub_char5);
				addColumnPathMap( DtlR.$sub_char6, MST_ORDSND_OPE_ACT_IF_R.$sub_char6);
				addColumnPathMap( DtlR.$sub_char7, MST_ORDSND_OPE_ACT_IF_R.$sub_char7);
				addColumnPathMap( DtlR.$sub_char8, MST_ORDSND_OPE_ACT_IF_R.$sub_char8);
				addColumnPathMap( DtlR.$sub_char9, MST_ORDSND_OPE_ACT_IF_R.$sub_char9);
				addColumnPathMap( DtlR.$sub_char10, MST_ORDSND_OPE_ACT_IF_R.$sub_char10);
				addColumnPathMap( DtlR.$sub_char11, MST_ORDSND_OPE_ACT_IF_R.$sub_char11);
				addColumnPathMap( DtlR.$sub_char12, MST_ORDSND_OPE_ACT_IF_R.$sub_char12);
				addColumnPathMap( DtlR.$sub_char13, MST_ORDSND_OPE_ACT_IF_R.$sub_char13);
				addColumnPathMap( DtlR.$sub_char14, MST_ORDSND_OPE_ACT_IF_R.$sub_char14);
				addColumnPathMap( DtlR.$sub_char15, MST_ORDSND_OPE_ACT_IF_R.$sub_char15);
				addColumnPathMap( DtlR.$sub_char16, MST_ORDSND_OPE_ACT_IF_R.$sub_char16);
				addColumnPathMap( DtlR.$sub_char17, MST_ORDSND_OPE_ACT_IF_R.$sub_char17);
				addColumnPathMap( DtlR.$sub_char18, MST_ORDSND_OPE_ACT_IF_R.$sub_char18);
				addColumnPathMap( DtlR.$sub_char19, MST_ORDSND_OPE_ACT_IF_R.$sub_char19);
				addColumnPathMap( DtlR.$sub_char20, MST_ORDSND_OPE_ACT_IF_R.$sub_char20);
				addColumnPathMap( DtlR.$sub_char21, MST_ORDSND_OPE_ACT_IF_R.$sub_char21);
				addColumnPathMap( DtlR.$sub_char22, MST_ORDSND_OPE_ACT_IF_R.$sub_char22);
				addColumnPathMap( DtlR.$sub_char23, MST_ORDSND_OPE_ACT_IF_R.$sub_char23);
				addColumnPathMap( DtlR.$sub_char24, MST_ORDSND_OPE_ACT_IF_R.$sub_char24);
				addColumnPathMap( DtlR.$sub_char25, MST_ORDSND_OPE_ACT_IF_R.$sub_char25);
				addColumnPathMap( DtlR.$sub_char26, MST_ORDSND_OPE_ACT_IF_R.$sub_char26);
				addColumnPathMap( DtlR.$sub_char27, MST_ORDSND_OPE_ACT_IF_R.$sub_char27);
				addColumnPathMap( DtlR.$sub_char28, MST_ORDSND_OPE_ACT_IF_R.$sub_char28);
				addColumnPathMap( DtlR.$sub_char29, MST_ORDSND_OPE_ACT_IF_R.$sub_char29);
				addColumnPathMap( DtlR.$sub_char30, MST_ORDSND_OPE_ACT_IF_R.$sub_char30);
				addColumnPathMap( DtlR.$sub_num1, MST_ORDSND_OPE_ACT_IF_R.$sub_num1);
				addColumnPathMap( DtlR.$sub_num2, MST_ORDSND_OPE_ACT_IF_R.$sub_num2);
				addColumnPathMap( DtlR.$sub_num3, MST_ORDSND_OPE_ACT_IF_R.$sub_num3);
				addColumnPathMap( DtlR.$sub_num4, MST_ORDSND_OPE_ACT_IF_R.$sub_num4);
				addColumnPathMap( DtlR.$sub_num5, MST_ORDSND_OPE_ACT_IF_R.$sub_num5);
				addColumnPathMap( DtlR.$sub_dt1, MST_ORDSND_OPE_ACT_IF_R.$sub_dt1);
				addColumnPathMap( DtlR.$sub_dt2, MST_ORDSND_OPE_ACT_IF_R.$sub_dt2);
				addColumnPathMap( DtlR.$sub_dt3, MST_ORDSND_OPE_ACT_IF_R.$sub_dt3);
				addColumnPathMap( DtlR.$sub_dt4, MST_ORDSND_OPE_ACT_IF_R.$sub_dt4);
				addColumnPathMap( DtlR.$sub_dt5, MST_ORDSND_OPE_ACT_IF_R.$sub_dt5);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_make_dt(src.ins_ts().toMCDate());
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ACT_QTY.value());
				dest.wg_cd(src.if_wg_cd());
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());

				MAM_EXT_SYS_R extSysR = _extstSysL.getFirst(_extSysIdxkey, src.ext_sys_cd());
				if (!isNull(extSysR) && !extSysR.null_val_if_flg()) {
					dest.itm_sub1(MAC_STR.isNULL_VAL(src.if_itm_sub1())? null : src.if_itm_sub1());
					dest.itm_sub2(MAC_STR.isNULL_VAL(src.if_itm_sub2())? null : src.if_itm_sub2());
					dest.itm_sub3(MAC_STR.isNULL_VAL(src.if_itm_sub3())? null : src.if_itm_sub3());
				}

				dest.link_key(createLinkKey(dest));
			}
		}
	}

	protected String createLinkKey(DtlR dest) {
		StringBuilder sb = new StringBuilder();

		if(isNull(dest.itm_cd())) return null;

		sb.append(dest.itm_cd());
		sb.append(DELIMITER);
		sb.append(isNull(dest.itm_sub1())? "" : dest.itm_sub1());
		sb.append(DELIMITER);
		sb.append(isNull(dest.itm_sub2())? "" : dest.itm_sub2());
		sb.append(DELIMITER);
		sb.append(isNull(dest.itm_sub3())? "" : dest.itm_sub3());

		return sb.toString();
	}

	//FMCB CUSTOM END
}