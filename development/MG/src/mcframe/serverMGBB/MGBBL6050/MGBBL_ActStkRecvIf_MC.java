package mcframe.serverMGBB.MGBBL6050;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonMGBB.MGBBR6050.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ActStkRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ActStkRecvIf_MC extends MGBBL_ActStkRecvIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * ActStkIf_Conv01オペレーション.<p>
	 *
	 */
	public class ActStkIf_Conv01 extends MGBBL_ActStkRecvIf_MC_A.ActStkIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class,
					MGT_ACT_STK_RCV_R.class);
			_IfRptSet.setReportSet(MGBBR_ActStkPrnt.create());
			_IfRptSet.setRowMapper(new MGT_ACT_STK_RCV_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$calc_ctg_cd,
				DtlR.$wg_cd,
				DtlR.$ym,
				DtlR.$mng_dpt_cd,
				DtlR.$itm_cd,
				DtlR.$itm_sub1,
				DtlR.$itm_sub2,
				DtlR.$itm_sub3,
				DtlR.$lot_no,
				DtlR.$sublot_no,
				DtlR.$sno1,
				DtlR.$sno2,
				DtlR.$sno3,
				DtlR.$sno4,
				DtlR.$asst_typ,
				DtlR.$qty
		};

		public class MGT_ACT_STK_RCV_R_DtlR<D extends MGT_ACT_STK_RCV_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MGT_ACT_STK_RCV_R.$ext_data_no, DtlR.$ext_data_no);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$ext_data_lno, DtlR.$ext_data_lno);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$calc_ctg_cd, DtlR.$calc_ctg_cd);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$wg_cd, DtlR.$wg_cd);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$ym, DtlR.$ym);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$mng_dpt_cd, DtlR.$mng_dpt_cd);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$lot_no, DtlR.$lot_no);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sublot_no, DtlR.$sublot_no);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sno1, DtlR.$sno1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sno2, DtlR.$sno2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sno3, DtlR.$sno3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sno4, DtlR.$sno4);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$bp_cd, DtlR.$bp_cd);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$asst_typ, DtlR.$asst_typ);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$qty, DtlR.$qty);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$first_gr_dt, DtlR.$first_gr_dt);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$vld_dt, DtlR.$vld_dt);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$lmt_dt, DtlR.$lmt_dt);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$non_mov_base_dt, DtlR.$non_mov_base_dt);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$rmrks, DtlR.$rmrks);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char1, DtlR.$if_sub_char1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char2, DtlR.$if_sub_char2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char3, DtlR.$if_sub_char3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char4, DtlR.$if_sub_char4);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char5, DtlR.$if_sub_char5);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char6, DtlR.$if_sub_char6);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char7, DtlR.$if_sub_char7);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char8, DtlR.$if_sub_char8);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char9, DtlR.$if_sub_char9);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char10, DtlR.$if_sub_char10);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char11, DtlR.$if_sub_char11);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char12, DtlR.$if_sub_char12);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char13, DtlR.$if_sub_char13);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char14, DtlR.$if_sub_char14);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char15, DtlR.$if_sub_char15);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char16, DtlR.$if_sub_char16);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char17, DtlR.$if_sub_char17);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char18, DtlR.$if_sub_char18);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char19, DtlR.$if_sub_char19);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char20, DtlR.$if_sub_char20);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char21, DtlR.$if_sub_char21);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char22, DtlR.$if_sub_char22);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char23, DtlR.$if_sub_char23);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char24, DtlR.$if_sub_char24);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char25, DtlR.$if_sub_char25);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char26, DtlR.$if_sub_char26);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char27, DtlR.$if_sub_char27);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char28, DtlR.$if_sub_char28);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char29, DtlR.$if_sub_char29);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_char30, DtlR.$if_sub_char30);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_num1, DtlR.$if_sub_num1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_num2, DtlR.$if_sub_num2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_num3, DtlR.$if_sub_num3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_num4, DtlR.$if_sub_num4);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_num5, DtlR.$if_sub_num5);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_dt1, DtlR.$if_sub_dt1);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_dt2, DtlR.$if_sub_dt2);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_dt3, DtlR.$if_sub_dt3);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_dt4, DtlR.$if_sub_dt4);
				addColumnPathMap(MGT_ACT_STK_RCV_R.$if_sub_dt5, DtlR.$if_sub_dt5);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_lno(getSequence(MGC_NUM_SYS_TYP.ACT_STK_RCV_DATA_LNO.value()));

				dest.data_no(_ifR.data_no());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.imp_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}