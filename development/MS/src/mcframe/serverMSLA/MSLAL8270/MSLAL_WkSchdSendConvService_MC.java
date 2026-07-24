package mcframe.serverMSLA.MSLAL8270;

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
import mcframe.commonMSLA.MSLAR1270.*;

import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import java.util.Arrays;
import java.util.HashMap;
import mcframe.serverMSUC.MSUCL0090.MSUCL_SCMLinkUtil;
import mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_WkSchdSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_WkSchdSendConvService_MC extends MSLAL_WkSchdSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * WkSchdSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class WkSchdSendConv_Conv01 extends MSLAL_WkSchdSendConvService_MC_A.WkSchdSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_WK_SCHD_SEND_IF_R.class);
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvItmCol("mfg_itm_cd", "mfg_itm_sub1", "mfg_itm_sub2", "mfg_itm_sub3");
			_ifDBC.addCnvCol("oper_cd", MAC_IF_COL_TYP.OPER);
			_ifDBC.addCnvCol("mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("wk_cost_cd", MAC_IF_COL_TYP.WK_COST);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}
	}
	/**
	 * WkSchdSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class WkSchdSendConv_Conv02 extends MSLAL_WkSchdSendConvService_MC_A.WkSchdSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_WK_SCHD_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_WkSchdPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_WK_SCHD_SEND_IF_R());
		}
	}

	public class Map_DtlR_MST_WK_SCHD_SEND_IF_R<D extends DtlR, S extends MST_WK_SCHD_SEND_IF_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$data_lno, MST_WK_SCHD_SEND_IF_R.$data_lno);
			addColumnPathMap(DtlR.$data_no, MST_WK_SCHD_SEND_IF_R.$data_no);
			addColumnPathMap(DtlR.$data_crud_typ, MST_WK_SCHD_SEND_IF_R.$data_crud_typ);
			addColumnPathMap(DtlR.$wk_schd_no, MST_WK_SCHD_SEND_IF_R.$wk_schd_no);
			addColumnPathMap(DtlR.$oper_inst_no, MST_WK_SCHD_SEND_IF_R.$oper_inst_no);
			addColumnPathMap(DtlR.$mfg_inst_no, MST_WK_SCHD_SEND_IF_R.$mfg_inst_no);
			addColumnPathMap(DtlR.$mfg_inst_rev, MST_WK_SCHD_SEND_IF_R.$mfg_inst_rev);
			addColumnPathMap(DtlR.$mfg_loc_nm, MST_WK_SCHD_SEND_IF_R.$mfg_loc_nm);
			addColumnPathMap(DtlR.$mfg_itm_nm, MST_WK_SCHD_SEND_IF_R.$mfg_itm_nm);
			addColumnPathMap(DtlR.$oper_nm, MST_WK_SCHD_SEND_IF_R.$oper_nm);
			addColumnPathMap(DtlR.$oper_seq, MST_WK_SCHD_SEND_IF_R.$oper_seq);
			addColumnPathMap(DtlR.$wk_cost_nm, MST_WK_SCHD_SEND_IF_R.$wk_cost_nm);
			addColumnPathMap(DtlR.$wk_cost_calc_flg, MST_WK_SCHD_SEND_IF_R.$wk_cost_calc_flg);
			addColumnPathMap(DtlR.$fxd_wk_cost, MST_WK_SCHD_SEND_IF_R.$fxd_wk_cost);
			addColumnPathMap(DtlR.$wk_cost, MST_WK_SCHD_SEND_IF_R.$wk_cost);
			addColumnPathMap(DtlR.$wk_cost_unit_nm, MST_WK_SCHD_SEND_IF_R.$wk_cost_unit_nm);
			addColumnPathMap(DtlR.$disp_seq, MST_WK_SCHD_SEND_IF_R.$disp_seq);
			addColumnPathMap(DtlR.$abort_flg, MST_WK_SCHD_SEND_IF_R.$abort_flg);
			addColumnPathMap(DtlR.$intr_rmrks, MST_WK_SCHD_SEND_IF_R.$intr_rmrks);
			addColumnPathMap(DtlR.$mfg_sts_typ, MST_WK_SCHD_SEND_IF_R.$mfg_sts_typ);
			addColumnPathMap(DtlR.$co_nm, MST_WK_SCHD_SEND_IF_R.$co_nm);
			addColumnPathMap(DtlR.$sub_char1, MST_WK_SCHD_SEND_IF_R.$sub_char1);
			addColumnPathMap(DtlR.$sub_char2, MST_WK_SCHD_SEND_IF_R.$sub_char2);
			addColumnPathMap(DtlR.$sub_char3, MST_WK_SCHD_SEND_IF_R.$sub_char3);
			addColumnPathMap(DtlR.$sub_char4, MST_WK_SCHD_SEND_IF_R.$sub_char4);
			addColumnPathMap(DtlR.$sub_char5, MST_WK_SCHD_SEND_IF_R.$sub_char5);
			addColumnPathMap(DtlR.$sub_char6, MST_WK_SCHD_SEND_IF_R.$sub_char6);
			addColumnPathMap(DtlR.$sub_char7, MST_WK_SCHD_SEND_IF_R.$sub_char7);
			addColumnPathMap(DtlR.$sub_char8, MST_WK_SCHD_SEND_IF_R.$sub_char8);
			addColumnPathMap(DtlR.$sub_char9, MST_WK_SCHD_SEND_IF_R.$sub_char9);
			addColumnPathMap(DtlR.$sub_char10, MST_WK_SCHD_SEND_IF_R.$sub_char10);
			addColumnPathMap(DtlR.$sub_char11, MST_WK_SCHD_SEND_IF_R.$sub_char11);
			addColumnPathMap(DtlR.$sub_char12, MST_WK_SCHD_SEND_IF_R.$sub_char12);
			addColumnPathMap(DtlR.$sub_char13, MST_WK_SCHD_SEND_IF_R.$sub_char13);
			addColumnPathMap(DtlR.$sub_char14, MST_WK_SCHD_SEND_IF_R.$sub_char14);
			addColumnPathMap(DtlR.$sub_char15, MST_WK_SCHD_SEND_IF_R.$sub_char15);
			addColumnPathMap(DtlR.$sub_char16, MST_WK_SCHD_SEND_IF_R.$sub_char16);
			addColumnPathMap(DtlR.$sub_char17, MST_WK_SCHD_SEND_IF_R.$sub_char17);
			addColumnPathMap(DtlR.$sub_char18, MST_WK_SCHD_SEND_IF_R.$sub_char18);
			addColumnPathMap(DtlR.$sub_char19, MST_WK_SCHD_SEND_IF_R.$sub_char19);
			addColumnPathMap(DtlR.$sub_char20, MST_WK_SCHD_SEND_IF_R.$sub_char20);
			addColumnPathMap(DtlR.$sub_char21, MST_WK_SCHD_SEND_IF_R.$sub_char21);
			addColumnPathMap(DtlR.$sub_char22, MST_WK_SCHD_SEND_IF_R.$sub_char22);
			addColumnPathMap(DtlR.$sub_char23, MST_WK_SCHD_SEND_IF_R.$sub_char23);
			addColumnPathMap(DtlR.$sub_char24, MST_WK_SCHD_SEND_IF_R.$sub_char24);
			addColumnPathMap(DtlR.$sub_char25, MST_WK_SCHD_SEND_IF_R.$sub_char25);
			addColumnPathMap(DtlR.$sub_char26, MST_WK_SCHD_SEND_IF_R.$sub_char26);
			addColumnPathMap(DtlR.$sub_char27, MST_WK_SCHD_SEND_IF_R.$sub_char27);
			addColumnPathMap(DtlR.$sub_char28, MST_WK_SCHD_SEND_IF_R.$sub_char28);
			addColumnPathMap(DtlR.$sub_char29, MST_WK_SCHD_SEND_IF_R.$sub_char29);
			addColumnPathMap(DtlR.$sub_char30, MST_WK_SCHD_SEND_IF_R.$sub_char30);
			addColumnPathMap(DtlR.$sub_num1, MST_WK_SCHD_SEND_IF_R.$sub_num1);
			addColumnPathMap(DtlR.$sub_num2, MST_WK_SCHD_SEND_IF_R.$sub_num2);
			addColumnPathMap(DtlR.$sub_num3, MST_WK_SCHD_SEND_IF_R.$sub_num3);
			addColumnPathMap(DtlR.$sub_num4, MST_WK_SCHD_SEND_IF_R.$sub_num4);
			addColumnPathMap(DtlR.$sub_num5, MST_WK_SCHD_SEND_IF_R.$sub_num5);
			addColumnPathMap(DtlR.$sub_dt1, MST_WK_SCHD_SEND_IF_R.$sub_dt1);
			addColumnPathMap(DtlR.$sub_dt2, MST_WK_SCHD_SEND_IF_R.$sub_dt2);
			addColumnPathMap(DtlR.$sub_dt3, MST_WK_SCHD_SEND_IF_R.$sub_dt3);
			addColumnPathMap(DtlR.$sub_dt4, MST_WK_SCHD_SEND_IF_R.$sub_dt4);
			addColumnPathMap(DtlR.$sub_dt5, MST_WK_SCHD_SEND_IF_R.$sub_dt5);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.MES_WK_SCHD_SEND.value());
			dest.data_make_dt(src.ins_ts().toMCDate());
			dest.mfg_loc_cd(src.if_mfg_loc_cd());
			dest.mfg_itm_cd(src.if_mfg_itm_cd());
			dest.mfg_itm_sub1(src.if_mfg_itm_sub1());
			dest.mfg_itm_sub2(src.if_mfg_itm_sub2());
			dest.mfg_itm_sub3(src.if_mfg_itm_sub3());
			dest.oper_cd(src.if_oper_cd());
			dest.wk_cost_cd(src.if_wk_cost_cd());
			dest.co_cd(src.if_co_cd());
		}
	}
	/**
	 * WkSchdSendConv_Conv03オペレーション.<p>
	 *
	 */
	public class WkSchdSendConv_Conv03 extends MSLAL_WkSchdSendConvService_MC_A.WkSchdSendConv_Conv03 {
		protected final String _IOT_PF_COMPANY_KEY = "company";

		protected final String _IOT_PF_ORGANIZATION_KEY = "organization";

		protected final String _IOT_PF_DEVICE_ID_KEY = "device_id";

		protected final String _IOT_PF_DEVICE_ID_VALUE = "mcframe";

		protected final String _IOT_PF_DOCUMENT_TYPE_KEY = "documentType";

		protected final String _IOT_PF_DOCUMENT_TYPE_VALUE = "WkSchdDoc";

		protected final String _IOT_PF_DOCUMENT_TYPE_VALUE2 = "WkSchdDoc2";

		protected final String _IOT_PF_DOCUMENT_KEY = "document";

		protected final String _IOT_PF_WK_SCHD_KEY = "wk_schd";

		protected final String _SYS_PARM_COMPANY_KEY = "IOT_PF_COMPANY";

		protected final String _SYS_PARM_ORGANIZATION_KEY = "IOT_PF_ORGANIZATION";

		protected final String _SYS_PARM_DATA_RECV_PATTERN_KEY = "IOT_PF_DATA_RECV_PATTERN";

		protected final String _SYS_PARM_ORGANIZATION_SEPARATOR = ",";

		protected final String _DB_PARAM_IOT_PF_DATA_RECV_PATTERN_KEY = "Iotpf-Data-Recv-Pattern";

		protected final String _DB_PARAM_IOT_PF_ORGANIZATION_KEY = "Iotpf-Organization";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert
					.crtSendIfDBContainer(MST_WK_SCHD_SEND_IF_R.class);
		}

		@Override
		protected String convertMCDBtoJson(MCList<?> ifL) {
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new Map_DtlR_MST_WK_SCHD_SEND_IF_R());
			String jsonStr = PFUCL_AppSys.createJsonObj(MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value())
					.toJson(new HashMap<String, Object>() {
						{
							put(_IOT_PF_COMPANY_KEY, getSysParm(_SYS_PARM_COMPANY_KEY));
							// SCMIF制御マスタから紐づけたHTTPヘッダマスタを検索する
							MCList<MAM_SCM_IF_CTL_R> dbc = getHttpHeader();
							// 外部システムCDの取得・設定
							setExtSysCd(dbc, (MCList<MST_WK_SCHD_SEND_IF_R>)ifL);

							// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていた場合はそちらのデータを設定する。登録されていない場合はシステムパラメータの値を使用する。
							put(_IOT_PF_ORGANIZATION_KEY,
									Arrays.asList(getOrganizationValue(dbc, ifL)
											.split(_SYS_PARM_ORGANIZATION_SEPARATOR)));
							put(_IOT_PF_DEVICE_ID_KEY, _IOT_PF_DEVICE_ID_VALUE);
							String dataRcvPtn = getIotpfDataRecvPatternValue(dbc, ifL);
							if (isNull(dataRcvPtn) || dataRcvPtn.equals("1")) {
								put(_IOT_PF_DOCUMENT_TYPE_KEY,
										_IOT_PF_DOCUMENT_TYPE_VALUE2);
							}
							else if (dataRcvPtn.equals("0")) {
								put(_IOT_PF_DOCUMENT_TYPE_KEY,
										_IOT_PF_DOCUMENT_TYPE_VALUE);
							}
							else {
								put(_IOT_PF_DOCUMENT_TYPE_KEY,
										_IOT_PF_DOCUMENT_TYPE_VALUE2);
							}
							put(_IOT_PF_DOCUMENT_KEY, new HashMap<String, Object>() {
								{
									put(_IOT_PF_WK_SCHD_KEY,
											MCDataConvUtil.toMap(dtlL));
								}
							});
						}
					});
			return jsonStr;
		}

		protected MCList<MAM_SCM_IF_CTL_R> getHttpHeader() {
			// SCMIF制御マスタとHTTPヘッダマスタを結合し、外部システムコードとインターフェース処理区分が一致する、論理削除されていないデータを取得する

			MCList<MAM_SCM_IF_CTL_R> dbc = MCList.create(MAM_SCM_IF_CTL_R.class);
			MAM_SCM_IF_CTL_R m1 = MAM_SCM_IF_CTL_R.create("M1");
			MAM_HTTP_HEADER_R m2 = MAM_HTTP_HEADER_R.create("M2");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(m2);
			dbc_bldr.addSelect(m1.if_proc_typ);
			dbc_bldr.addSelect(m1.loc_cd);
			dbc.addStringColumn("http_header_nm");
			dbc.addStringColumn("http_header_val");
			dbc_bldr.addInnerJoin(m1, bracket(m2.ext_sys_cd.eq(m1.ext_sys_cd)
					.and(m2.if_proc_typ.eq(m1.if_proc_typ))));
			dbc_bldr.setWhere(
					m1.del_flg.eq(value(false)).and(m2.del_flg.eq(value(false))));

			dbSelect("MSLAL8270_MAM_SCM_IF_CTL_S01", dbc, dbc_bldr);

			return dbc;
		}

		protected String getOrganizationValue(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL,
				MCList<?> ifL) {

			for (MST_WK_SCHD_SEND_IF_R r : (MCList<MST_WK_SCHD_SEND_IF_R>) ifL) {
				for (MAM_SCM_IF_CTL_R tempScmIfCtlR : scmIfCtlL) {
					if (r.ext_sys_cd().equals(tempScmIfCtlR.ext_sys_cd())
							&& r.if_mfg_loc_cd().equals(tempScmIfCtlR.loc_cd())
							&& r.getStringNE("IF_PROC_TYP").equals(tempScmIfCtlR.if_proc_typ())
							&& tempScmIfCtlR.getStringNE("http_header_nm").equals(_DB_PARAM_IOT_PF_ORGANIZATION_KEY)) {
						return tempScmIfCtlR.getStringNE("http_header_val");
					}
				}
			}

			// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていない場合は既存のシステムパラメータを設定する。
			return getSysParm(_SYS_PARM_ORGANIZATION_KEY);
		}

		protected String getIotpfDataRecvPatternValue(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL,
				MCList<?> ifL) {

			for (MST_WK_SCHD_SEND_IF_R r : (MCList<MST_WK_SCHD_SEND_IF_R>) ifL) {
				for (MAM_SCM_IF_CTL_R tempScmIfCtlR : scmIfCtlL) {
					if (r.ext_sys_cd().equals(tempScmIfCtlR.ext_sys_cd())
							&& r.if_mfg_loc_cd().equals(tempScmIfCtlR.loc_cd())
							&& r.getStringNE("IF_PROC_TYP").equals(tempScmIfCtlR.if_proc_typ())
							&& tempScmIfCtlR.getStringNE("http_header_nm").equals(_DB_PARAM_IOT_PF_DATA_RECV_PATTERN_KEY)) {
						return tempScmIfCtlR.getStringNE("http_header_val");
					}
				}
			}

			// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていない場合は既存のシステムパラメータを設定する。
			return getSysParm(_SYS_PARM_DATA_RECV_PATTERN_KEY);
		}
		/**
		 * 外部システムCDを取得・設定する
		 */
		protected void setExtSysCd(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL, MCList<MST_WK_SCHD_SEND_IF_R> sendL) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			HashMap<MCNumber, MST_WK_SCHD_SEND_IF_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_WK_SCHD_SEND_IF_R wkSchdSendIfR : sendL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value());
				r.loc_cd(wkSchdSendIfR.mfg_loc_cd());
				r.itm_cd(wkSchdSendIfR.mfg_itm_cd());
				r.itm_sub1(wkSchdSendIfR.mfg_itm_sub1());
				r.itm_sub2(wkSchdSendIfR.mfg_itm_sub2());
				r.itm_sub3(wkSchdSendIfR.mfg_itm_sub3());
				r.oper_cd(wkSchdSendIfR.oper_cd());
				r.ext_sys_cd(wkSchdSendIfR.ext_sys_cd());
				r.wk_cost_cd(wkSchdSendIfR.wk_cost_cd());
				r.master_dt(getToday());

				map.put(peg, wkSchdSendIfR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				for (SCMLinkUtil_Srch01_CndR row : o.down0()) {
					if (map.containsKey(row.peg_no())) {
						MST_WK_SCHD_SEND_IF_R ssR = map.get(row.peg_no());
						ssR.ext_sys_cd(row.ext_sys_cd());
					}
				}
			}
		}
	}

	//FMCB CUSTOM END
}