package mcframe.serverMSLA.MSLAL6410;

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
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMSLA.MSLAL6410.Query.*;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverPF.dbc.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mcframe.serverMSUC.MSUCL0090.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_InspInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_InspInstSendIfService_MC extends MSLAL_InspInstSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の検査指図をＩＦテーブルに書き込む<br>
	 */
	public class InspInstSendIf_Upd01 extends MSLAL_InspInstSendIfService_MC_A.InspInstSendIf_Upd01 {
		/**
		 * 送信対象情報
		 */
		protected MCList<MST_INSP_INST_SEND_IF_R> _inspInstL;
		/**
		 * 送信対象情報を検査ＮＯ単位にグループ化したリスト
		 */
		protected ArrayList<MCList<MST_INSP_INST_SEND_IF_R>> _groupedInspInstL;
		/**
		 * 送信ＩＦ情報
		 */
		protected MCList<MST_INSP_INST_SEND_IF_R> _inspInstIfInsL;

		protected MCIndexKey _inspInstIdx;
		protected MCIndexKey _inspInstIfInsLIdx;
		protected MCIndexKey _up0Idx;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initProc();
			getSendInfo();
			if (isNull(_inspInstL)) {
				return;
			}
			makeDataNo();
			makeIFData();
			callESBSendCtrl();
		}

		protected void initProc() {
			_inspInstL = MCList.create(MST_INSP_INST_SEND_IF_R.class);

			_inspInstIfInsL = MCList.create(MST_INSP_INST_SEND_IF_R.class);
			_inspInstIfInsL.addBooleanColumn("not_send_flg");
			_inspInstIfInsL.addBooleanColumn("not_send_upd_flg");
			_inspInstIfInsL.addStringColumn("if_proc_typ");

			_groupedInspInstL = new ArrayList<>();
		}

		protected void getSendInfo() {
			MCList<MST_INSP_INST_R> inspInstL = MCList.create(MST_INSP_INST_R.class);
			up0().forEach(r -> inspInstL.add().insp_no(r.insp_no()));
			MCQueryApiBuilder inspInst_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("INSPINST"));
			MCList<MST_INSP_INST_R> groupedInspInstL = inspInstL.groupBy(InspInstSendIf_Upd01_DtlR.$insp_no);

			dbWkDelete("MSLAL6410_MSW_INSP_INST_D01", inspInst_bldr.getBaseDbc());
			dbWkInsert("MSLAL6410_MSW_INSP_INST_I01", groupedInspInstL, inspInst_bldr.getBaseDbc());

			executeQuery(_inspInstL, MSLAL6410_MST_INSP_INST_S01());

			setExtSysInfo();

			dbWkDelete("MSLAL6410_MSW_INSP_INST_D02", inspInst_bldr.getBaseDbc());
		}

		protected void makeDataNo() {
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, _inspInstL.groupBy("insp_no").size());
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.INSPINSTSENDIF, _inspInstL.size());
		}

		protected void makeIFData() {			
			prepareInitialIfData();
			
			setInspInstIfInsL();
			
			MCQueryApiBuilder inspInstIfInsL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_SEND_IF_R.create("INSPINSTSENDIF"));
			dbInsertEx("MSLAL6410_MST_INSP_INST_SEND_IF_I01", _inspInstIfInsL, inspInstIfInsL_bldr);
		}
		
		protected void prepareInitialIfData() {
			_inspInstL.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.MES_INSP_INST_SEND.value());
			
			for (MCList<MST_INSP_INST_SEND_IF_R> list : _inspInstL.groupList(MST_INSP_INST_SEND_IF_R.$insp_no)) {
				_groupedInspInstL.add(list);
			}
			
			_inspInstIdx = _inspInstL.createIndex(MST_INSP_INST_SEND_IF_R.$insp_no);
			_up0Idx = up0().createIndex(InspInstSendIf_Upd01_DtlR.$insp_no);
		}
		
		
		protected void setInspInstIfInsL() {
			// 検査ＮＯ単位で処理を実行する
			for (MCList<MST_INSP_INST_SEND_IF_R> inspInstL: _groupedInspInstL) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

				// 検査予定の中から、最も優先度の高い外部システムマスタの情報を取得する
				MST_INSP_INST_SEND_IF_R primaryInspSchd = getPrimaryInspSchd(inspInstL);
				String primaryExtSysCd = primaryInspSchd.ext_sys_cd();
				boolean isNullValIf = primaryInspSchd.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg);
				boolean isNotSendUpd = primaryInspSchd.getBooleanNE(MAM_EXT_SYS_R.$not_send_upd_flg);

				if (isNull(primaryInspSchd.ext_sys_cd())) {
					return;
				}

				for (MST_INSP_INST_SEND_IF_R inspInstR: inspInstL) {
					InspInstSendIf_Upd01_DtlR upR = up0().getFirst(_up0Idx, inspInstR.insp_no());

					inspInstR.data_lno(getSequence(MSC_NUM_SYS_TYP.INSPINSTSENDIF.value()));
					inspInstR.data_no(dataNo);
					inspInstR.co_nm(getCo().co_nm());
					inspInstR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					inspInstR.data_crud_typ(upR.data_crud_typ());
					inspInstR.ext_sys_cd(primaryExtSysCd);
					inspInstR.setBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg, isNullValIf);
					inspInstR.setBooleanNE(MAM_EXT_SYS_R.$not_send_upd_flg, isNotSendUpd);

					if (!inspInstR.getBoolean(MAM_EXT_SYS_R.$null_val_if_flg)) {
						inspInstR.itm_sub1(nullValToNull(inspInstR.itm_sub1()));
						inspInstR.itm_sub2(nullValToNull(inspInstR.itm_sub2()));
						inspInstR.itm_sub3(nullValToNull(inspInstR.itm_sub3()));
						inspInstR.lot_no(nullValToNull(inspInstR.lot_no()));
						inspInstR.sublot_no(nullValToNull(inspInstR.sublot_no()));
					}
					
					if(isNotSendUpd && MAC_DATA_CRUD_TYP.isDEL(inspInstR.data_crud_typ())) {
						inspInstR.setBooleanNE("not_send_flg", true);
					}
					_inspInstIfInsL.add(inspInstR);
				}
			}
		}

		protected void setExtSysInfo() {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			Map<MCNumber, MST_INSP_INST_SEND_IF_R> map = new HashMap<>();
			
			prepareScmLinkUtilSrch01Up(ope, map);

			if (ope.up0().isEmpty()) {
				return;
			}
			
			ope.exec();
			for (SCMLinkUtil_Srch01_CndR r : ope.down0()) {
				if (map.containsKey(r.peg_no())) {
					MST_INSP_INST_SEND_IF_R inspInstR = map.get(r.peg_no());
					inspInstR.ext_sys_cd(r.ext_sys_cd());
					inspInstR.setBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg, r.null_val_if_flg());
					inspInstR.setBooleanNE(MAM_EXT_SYS_R.$not_send_upd_flg, r.not_send_upd_flg());
				}
			}
		}
		
		protected void prepareScmLinkUtilSrch01Up(MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 ope, Map<MCNumber, MST_INSP_INST_SEND_IF_R> map) {
			MCNumber peg = MCNumber.ZERO;
			
			for (MST_INSP_INST_SEND_IF_R inspInstR : _inspInstL) {
				SCMLinkUtil_Srch01_CndR r = ope.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.MES_INSP_INST_SEND.value());

				if (MSC_INSP_TYP.isPRDCT(inspInstR.insp_typ())){
					r.loc_cd(inspInstR.mfg_loc_cd());
				}
				else {
					r.loc_cd(inspInstR.schd_loc_cd());
				}
				r.itm_cd(inspInstR.itm_cd());
				r.itm_sub1(inspInstR.itm_sub1());
				r.itm_sub2(inspInstR.itm_sub2());
				r.itm_sub3(inspInstR.itm_sub3());
				r.master_dt(getToday());

				map.put(peg, inspInstR);
				peg = peg.add(1);
			}
		}

		/**
		 * 外部システムＣＤが設定されているデータのうち、検査予定ＮＯの昇順で最初のデータを返す。
		 * @param inspInstL 送信対象情報のリスト
		 * @return 最初に外部システムＣＤが設定されているデータ
		 */
		protected MST_INSP_INST_SEND_IF_R getPrimaryInspSchd(MCList<MST_INSP_INST_SEND_IF_R> inspInstL) {
			inspInstL.sort(MST_INSP_INST_SEND_IF_R.$insp_schd_no);
			MST_INSP_INST_SEND_IF_R firstWithExtSysCd = inspInstL.stream()
					.filter(r -> !isNull(r.ext_sys_cd()))
					.findFirst()
					.orElse(null);
			return firstWithExtSysCd;
		}

		protected void callESBSendCtrl() {
			PFBZL_SendRecvIfCtrl.Ins01 ins01 = PFBZL_SendRecvIfCtrl.crtIns01();
			
			_inspInstIfInsLIdx = _inspInstIfInsL.createIndex(MST_INSP_INST_SEND_IF_R.$insp_no);

			addAll(ins01.up0(),
					_inspInstIfInsL,
					createMap_DtlR_MST_INSP_INST_SEND_IF_R()
			);

			// 送信対象外のデータを更新する
			// 送信後訂正不可フラグがオンの場合、過去データを送信対象外に更新し、送信レコードは1件のみとする
			// ただし、送信レコードが削除の場合は、そのレコードも送信対象外として、送信レコードは0件とする
			PFBZL_SendRecvIfCtrl.Upd01 upd01 = PFBZL_SendRecvIfCtrl.crtUpd01();
			upd01.up0().addAll(getNotSendList(_inspInstIfInsL));
			upd01.up0().addAll(getNotSendOldList(ins01.up0()));

			ins01.exec();
			upd01.exec();
		}

		protected MCList<Upd01_DtlR> getNotSendList(MCList<MST_INSP_INST_SEND_IF_R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if(sendL.isEmpty()) return notSendL;

			sendL.forEach(r -> {
				if(r.getBooleanNE("not_send_flg")) {
					Upd01_DtlR notSendR = notSendL.add();
					notSendR.data_no(r.getNumberNE("data_no"));
					notSendR.not_send_flg(true);
					notSendR.not_send_upd_flg(r.getBooleanNE("not_send_upd_flg"));
				}
			});
			return notSendL;
		}

		/**
		 * 送信対象外とする過去データを取得する。
		 */
		protected MCList<Upd01_DtlR> getNotSendOldList(MCList<DtlR> sendL) {

			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if (sendL.isEmpty()) return notSendL;
			
			MCList<PFT_SDRV_IF_R> sdrvIfL = fetchUnsentSdrvIf(sendL);
			
			// 送信後訂正不可の場合は送信対象外
			if(sdrvIfL.isEmpty()) return notSendL;
			sdrvIfL.forEach(r -> {
				Upd01_DtlR notSendR = notSendL.add();
				notSendR.data_no(r.data_no());
				notSendR.not_send_flg(true);
				notSendR.not_send_upd_flg(r.not_send_upd_flg());
			});

			return notSendL;
		}
		
		/**
		 * 送信後訂正不可の検査指図送信ＩＦレコードに対応する、送信完了でない送受信ＩＦレコードを取得する
		 */
		protected MCList<PFT_SDRV_IF_R> fetchUnsentSdrvIf(MCList<DtlR> sendL) {
			MCList<PFT_SDRV_IF_R> sdrvIfL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("SDRVIF");
			MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(t);
			sdrvIfL_bldr.setSelect(t.data_no, t.not_send_upd_flg);
			sdrvIfL_bldr.addWhereWithAnd(t.if_proc_typ.eq(bind("if_proc_typ")));
			sdrvIfL_bldr.addWhereWithAnd(t.attr_char1.eq(bind("attr_char1")));
			sdrvIfL_bldr.addWhereWithAnd(t.attr_char2.eq(bind("attr_char2")));
			sdrvIfL_bldr.addWhereWithAnd(t.not_send_flg.eq(value(false)));
			sdrvIfL_bldr.addWhereWithAnd(t.sdrv_sts_typ.neq(value(MAC_SDRV_STS_TYP.SEND_OK.value())));
			dbSelectForUpdate("MSLAL6410_PFT_SDRV_IF_S01", sdrvIfL, sdrvIfL_bldr,
					sendL.subList(r -> r.not_send_upd_flg()));

			return sdrvIfL;
		}

		/**
		 * 検査指図と関連する業務情報をセットする。
		 */
		protected <D extends DtlR, S extends MCRow> void setAttrInfo(D dest, S src) {
			MST_INSP_INST_SEND_IF_R inspInstR = _inspInstIfInsL.getFirst(_inspInstIfInsLIdx, src.getStringNE("insp_no"));
			if(!isNull(inspInstR)) {
				dest.attr_char1(inspInstR.insp_no());
				dest.attr_char2(String.valueOf(inspInstR.insp_freq()));
			}
		}

		protected Map_DtlR_MST_INSP_INST_SEND_IF_R<DtlR,MST_INSP_INST_SEND_IF_R> createMap_DtlR_MST_INSP_INST_SEND_IF_R() {
			return new Map_DtlR_MST_INSP_INST_SEND_IF_R<DtlR, MST_INSP_INST_SEND_IF_R>();
		}

		public class Map_DtlR_MST_INSP_INST_SEND_IF_R<D extends DtlR, S extends MST_INSP_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_INSP_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_INSP_INST_SEND_IF_R.$ext_sys_cd);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.if_proc_typ(src.getStringNE("if_proc_typ"));
				dest.not_send_upd_flg(src.getBooleanNE("not_send_upd_flg"));
				setAttrInfo(dest, src);
			}
		}
	}

	//FMCB CUSTOM END
}