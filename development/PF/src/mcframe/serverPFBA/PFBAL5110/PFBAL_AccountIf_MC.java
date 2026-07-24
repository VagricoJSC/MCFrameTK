package mcframe.serverPFBA.PFBAL5110;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonPFBA.PFBAR5110.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_AccountIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_AccountIf_MC extends PFBAL_AccountIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * AccountIf_Conv01オペレーション.<p>
	 *
	 */
	public class AccountIf_Conv01 extends PFBAL_AccountIf_MC_A.AccountIf_Conv01 {
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
					MBT_ACCOUNT_IF_R.class);
			_IfRptSet.setReportSet(PFBAR_AccountPrnt.create());
			_IfRptSet.setRowMapper(new MBT_ACCOUNT_IF_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$ac_cd, DtlR.$ac_nm, DtlR.$dc_typ
		};

		public class MBT_ACCOUNT_IF_R_DtlR<D extends MBT_ACCOUNT_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(MBT_ACCOUNT_IF_R.$ext_data_no, DtlR.$ext_data_no);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ext_data_lno, DtlR.$ext_data_lno);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_cd, DtlR.$ac_cd);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm, DtlR.$ac_nm);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm_lcl1, DtlR.$ac_nm_lcl1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm_lcl2, DtlR.$ac_nm_lcl2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm_lcl3, DtlR.$ac_nm_lcl3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm2, DtlR.$ac_nm2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm2_lcl1, DtlR.$ac_nm2_lcl1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm2_lcl2, DtlR.$ac_nm2_lcl2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm2_lcl3, DtlR.$ac_nm2_lcl3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$dc_typ, DtlR.$dc_typ);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sub_flg, DtlR.$sub_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ, DtlR.$ac_typ);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_tax_cd, DtlR.$ac_tax_cd);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_tax_typ, DtlR.$ac_tax_typ);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$foreign_flg, DtlR.$foreign_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum0_flg, DtlR.$sum0_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum1_flg, DtlR.$sum1_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum2_flg, DtlR.$sum2_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum3_flg, DtlR.$sum3_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum4_flg, DtlR.$sum4_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$sum5_flg, DtlR.$sum5_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$project_flg, DtlR.$project_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$bp_flg, DtlR.$bp_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$usr_flg, DtlR.$usr_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$bank_ac_flg, DtlR.$bank_ac_flg);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ap_typ, DtlR.$ap_typ);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ar_typ, DtlR.$ar_typ);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ1, DtlR.$ac_typ1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ2, DtlR.$ac_typ2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ3, DtlR.$ac_typ3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ4, DtlR.$ac_typ4);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_typ5, DtlR.$ac_typ5);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$memo1, DtlR.$memo1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$memo2, DtlR.$memo2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$memo3, DtlR.$memo3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char1, DtlR.$if_sub_char1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char2, DtlR.$if_sub_char2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char3, DtlR.$if_sub_char3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char4, DtlR.$if_sub_char4);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char5, DtlR.$if_sub_char5);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char6, DtlR.$if_sub_char6);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char7, DtlR.$if_sub_char7);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char8, DtlR.$if_sub_char8);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char9, DtlR.$if_sub_char9);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char10, DtlR.$if_sub_char10);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char11, DtlR.$if_sub_char11);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char12, DtlR.$if_sub_char12);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char13, DtlR.$if_sub_char13);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char14, DtlR.$if_sub_char14);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char15, DtlR.$if_sub_char15);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char16, DtlR.$if_sub_char16);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char17, DtlR.$if_sub_char17);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char18, DtlR.$if_sub_char18);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char19, DtlR.$if_sub_char19);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char20, DtlR.$if_sub_char20);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char21, DtlR.$if_sub_char21);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char22, DtlR.$if_sub_char22);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char23, DtlR.$if_sub_char23);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char24, DtlR.$if_sub_char24);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char25, DtlR.$if_sub_char25);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char26, DtlR.$if_sub_char26);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char27, DtlR.$if_sub_char27);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char28, DtlR.$if_sub_char28);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char29, DtlR.$if_sub_char29);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_char30, DtlR.$if_sub_char30);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_num1, DtlR.$if_sub_num1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_num2, DtlR.$if_sub_num2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_num3, DtlR.$if_sub_num3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_num4, DtlR.$if_sub_num4);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_num5, DtlR.$if_sub_num5);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_dt1, DtlR.$if_sub_dt1);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_dt2, DtlR.$if_sub_dt2);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_dt3, DtlR.$if_sub_dt3);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_dt4, DtlR.$if_sub_dt4);
				addColumnPathMap(MBT_ACCOUNT_IF_R.$if_sub_dt5, DtlR.$if_sub_dt5);

			}
			
			@Override
			public void valueCopy(D dest, S src) {

				dest.data_lno(getSequence(MAC_NUM_SYS_TYP.ACCOUNT_IF_DATA_LNO.value()));
				dest.data_no(_ifR.data_no());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.imp_flg(true);

			}
		}
	}

	//FMCB CUSTOM END
}