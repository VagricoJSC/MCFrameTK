package mcframe.serverMSLA.MSLAL6050;

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
import java.util.Map;
import java.util.ArrayList;

import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;

import static mcframe.serverMSLA.MSLAL6050.Query.*;
import mcframe.serverMSUC.MSUCL0090.*;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_XfrInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_XfrInstSendIfService_MC extends MSLAL_XfrInstSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XfrInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の移動指図をＩＦテーブルに書き込む<br>
	 */
	public class XfrInstSendIf_Upd01 extends MSLAL_XfrInstSendIfService_MC_A.XfrInstSendIf_Upd01 {
		
		//_sendL 送信対象情報
		// _sendIfInsL 今回送信ＩＦ情報
		protected MCList<MST_XFR_INST_SEND_IF_R> _sendL, _sendIfInsL;
		protected ArrayList<MCList<MST_XFR_INST_SEND_IF_R>> _sendXfr;
		protected final String XFR_ALLOC_STS_NO = "xfr_alloc_sts_no";
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initProc();
			getSendInfo();
			if (isNull(_sendL)) {
				return ;
			}
			makeDataNo();
			makeIFData();
			callESBSendCtrl();
		}
		protected void initProc() {
			_sendL = MCList.create(MST_XFR_INST_SEND_IF_R.class);
			_sendXfr = new ArrayList<>();

			_sendL.addStringColumn("pr_sts_typ");
			_sendL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_sendL.addBooleanColumn(MAM_EXT_SYS_R.$not_send_upd_flg);
			_sendL.addBooleanColumn(PFT_SDRV_IF_R.$not_send_flg);

			// 一時カラムも引き継ぎたいのでcloneする
			_sendIfInsL = _sendL.clone();
		}
		protected void getSendInfo() {
			MCList<MST_XFR_ALLOC_STS_R> up = MCList.create(MST_XFR_ALLOC_STS_R.class);
			up0().forEach(r -> up.add().xfr_alloc_sts_no(r.xfr_alloc_sts_no()));
			MCQueryApiBuilder up_bldr = MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T"));
			dbWkDelete("MSLAL6050_MSW_XFR_ALLOC_STS_D01", up_bldr.getBaseDbc());
			
			MCList<MST_XFR_ALLOC_STS_R> up2 = up.groupBy(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
			dbWkInsert("MSLAL6050_MSW_XFR_ALLOC_STS_I01", up2, up_bldr.getBaseDbc());

			executeQuery(_sendL, MSLAL6050_MST_XFR_INST_S01());

			// 外部システムCDを取得・設定する
			setExtSysCd();

			for (MCList<MST_XFR_INST_SEND_IF_R> list : _sendL.groupList(MST_XFR_INST_SEND_IF_R.$xfr_inst_no, MST_XFR_INST_SEND_IF_R.$ext_sys_cd)) {
				_sendXfr.add(list);
			}

			dbWkDelete("MSLAL6050_MSW_XFR_ALLOC_STS_D02", up_bldr.getBaseDbc());
		}

		/**
		 * 外部システムCDを取得・設定する
		 */
		protected void setExtSysCd() {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, MST_XFR_INST_SEND_IF_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_XFR_INST_SEND_IF_R xfR : _sendL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
				r.loc_cd(xfR.gi_loc_cd());
				r.lg_grp_cd(xfR.lg_grp_cd());
				r.master_dt(getToday());

				map.put(peg, xfR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						MST_XFR_INST_SEND_IF_R xfR = map.get(r.peg_no());
						xfR.ext_sys_cd(r.ext_sys_cd());
						xfR.setBoolean(MAM_EXT_SYS_R.$null_val_if_flg, r.null_val_if_flg());
						xfR.setBoolean(MAM_EXT_SYS_R.$not_send_upd_flg, r.not_send_upd_flg());
					}
				}
			}
		}

		protected void makeDataNo() {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, _sendXfr.size());
			doSeqCache(MSC_NUM_SYS_TYP.XFRINSTSENDIF, _sendL.size());
		}
		protected void makeIFData() {
			MCIndexKey upIdx = up0().createIndex(XfrInstSendIf_Upd01_DtlR.$xfr_alloc_sts_no);
			
			for (MCList<MST_XFR_INST_SEND_IF_R> l: _sendXfr) {
				
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				l.sort(MST_XFR_ALLOC_STS_R.$disp_seq);
				
				MCList<MST_XFR_INST_SEND_IF_R> sendL = MCList.create(MST_XFR_INST_SEND_IF_R.class); 
				for (MST_XFR_INST_SEND_IF_R r: l) {
					XfrInstSendIf_Upd01_DtlR upR = up0().getFirst(upIdx, r.xfr_alloc_sts_no());
					
					if(_isNoSendTarget(r)) {
						continue;
					}
					
					r.data_lno(getSequence(MSC_NUM_SYS_TYP.XFRINSTSENDIF.value()));
					r.co_nm(getCo().co_nm());
					r.data_no(dataNo);
					r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					r.data_crud_typ(upR.data_crud_typ());
					
					if (!r.getBoolean(MAM_EXT_SYS_R.$null_val_if_flg)) {
						r.xfr_src_no(nullValToNull(r.xfr_src_no()));
						r.gi_str_ln_cd(nullValToNull(r.gi_str_ln_cd()));
						r.gr_str_ln_cd(nullValToNull(r.gr_str_ln_cd()));
						r.itm_sub1(nullValToNull(r.itm_sub1()));
						r.itm_sub2(nullValToNull(r.itm_sub2()));
						r.itm_sub3(nullValToNull(r.itm_sub3()));
						r.lot_no(nullValToNull(r.lot_no()));
						r.sublot_no(nullValToNull(r.sublot_no()));
						r.sno1(nullValToNull(r.sno1()));
						r.sno2(nullValToNull(r.sno2()));
						r.sno3(nullValToNull(r.sno3()));
						r.sno4(nullValToNull(r.sno4()));
						r.stk_bp_cd(nullValToNull(r.stk_bp_cd()));
					}
					
					_sendIfInsL.add(r);
					sendL.add(r);
				}				
	
				// ESBの送信対象外フラグの設定(データ更新区分を参照するので最後に設定する)
				sendL.setBoolean(PFT_SDRV_IF_R.$not_send_flg, isNotSendFlgForPF(sendL));
		}
			MCQueryApiBuilder sendIfInsL_bldr = MCQueryApiBuilder.create(MST_XFR_INST_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6050_MST_XFR_INST_SEND_IF_I01", _sendIfInsL, sendIfInsL_bldr);
		}
		protected boolean _isNoSendTarget(MST_XFR_INST_SEND_IF_R _sendxfr) {
			// SCM IF制御マスタが未設定
			if (isNull(_sendxfr.ext_sys_cd())) return true;
			//一部完了または完了は扱わない
			if (MSC_PR_STS_TYP.isPART_COMP(_sendxfr.getStringNE("pr_sts_typ"))
				|| MSC_PR_STS_TYP.isCOMP(_sendxfr.getStringNE("pr_sts_typ"))) {
				return true;
			}
			return false;
		}

		/**
		 * 送受信ＩＦ(ESB)の送信対象外フラグに設定する値を取得する
		 */
		protected boolean isNotSendFlgForPF(MCList<MST_XFR_INST_SEND_IF_R> sendL) {
			// 外部システムマスタの送信後訂正不可=オン、かつ全行がデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
			for (MST_XFR_INST_SEND_IF_R r : sendL) {
				if (!r.getBoolean(MAM_EXT_SYS_R.$not_send_upd_flg)
					|| !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		protected void callESBSendCtrl() {

			// 今回作成分
			PFBZL_SendRecvIfCtrl.Ins01 ins01 = PFBZL_SendRecvIfCtrl.crtIns01();
			addAll(
				ins01.up0(),
				_sendIfInsL.groupBy(
					MST_SHIP_INST_SEND_IF_R.$data_no,
					MST_SHIP_INST_SEND_IF_R.$ext_sys_cd,
					MAM_EXT_SYS_R.$not_send_upd_flg),
				createMap_DtlR_MST_XFR_INST_SEND_IF_R()
			);

			// 今回作成分および過去データの送信対象外フラグをオンに更新する。
			PFBZL_SendRecvIfCtrl.Upd01 upd01 = PFBZL_SendRecvIfCtrl.crtUpd01();
			upd01.up0().addAll(getNotSendList(_sendIfInsL));
			upd01.up0().addAll(getNotSendOldList(_sendIfInsL));	// ins01でデータを登録する前に取得する

			if (!ins01.up0().isEmpty()) {
				ins01.exec();
			}
			if (!upd01.up0().isEmpty()) {
				upd01.exec();
			}
		}
		protected Map_DtlR_MST_XFR_INST_SEND_IF_R<DtlR,MST_XFR_INST_SEND_IF_R> createMap_DtlR_MST_XFR_INST_SEND_IF_R() {
			return new Map_DtlR_MST_XFR_INST_SEND_IF_R<DtlR, MST_XFR_INST_SEND_IF_R>();
		}
		public class Map_DtlR_MST_XFR_INST_SEND_IF_R<D extends DtlR, S extends MST_XFR_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_XFR_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_XFR_INST_SEND_IF_R.$ext_sys_cd);
				addColumnPathMap(DtlR.$not_send_upd_flg, MAM_EXT_SYS_R.$not_send_upd_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
			}
		}

		/**
		 * 送信対象外データ取得処理
		 */
		protected MCList<Upd01_DtlR> getNotSendList(MCList<MST_XFR_INST_SEND_IF_R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if(sendL.isEmpty()) return notSendL;
			
			sendL.forEach(r -> {
				if(r.getBooleanNE("not_send_flg")) {
					Upd01_DtlR notSendR = notSendL.add();
					notSendR.data_no(r.data_no());
					notSendR.not_send_flg(true);
					notSendR.not_send_upd_flg(r.getBooleanNE("not_send_upd_flg"));
				}
			});
			return notSendL.groupBy(
				Upd01_DtlR.$data_no, Upd01_DtlR.$not_send_flg, Upd01_DtlR.$not_send_upd_flg);
		}

		/**
		 * 送信対象外の過去データ取得処理
		 */
		protected MCList<Upd01_DtlR> getNotSendOldList(MCList<MST_XFR_INST_SEND_IF_R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if (sendL.isEmpty()) return notSendL;

			MCList<PFT_SDRV_IF_R> sdrvIfL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_INST_SEND_IF_R t2 = MST_XFR_INST_SEND_IF_R.create("T2");
			sdrvIfL_bldr.setSelect(t.data_no, t.not_send_upd_flg);
			sdrvIfL_bldr.addInnerJoin(t2, bracket(t2.data_no.eq(t.data_no)));
			sdrvIfL_bldr.addWhereWithAnd(t2.xfr_inst_no.eq(bind("xfr_inst_no")));
			sdrvIfL_bldr.addWhereWithAnd(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			sdrvIfL_bldr.addWhereWithAnd(t.not_send_flg.eq(value(false)));
			sdrvIfL_bldr.addWhereWithAnd(t.sdrv_sts_typ.neq(value(MAC_SDRV_STS_TYP.SEND_OK.value())));
			sdrvIfL_bldr.setLockTable(t.data_no);
			dbSelectForUpdate("MSLAL6050_PFT_SDRV_IF_S01", sdrvIfL, sdrvIfL_bldr,
					sendL.subList(r -> r.getBoolean("not_send_upd_flg")));

			if(sdrvIfL.isEmpty()) return notSendL;
			sdrvIfL.forEach(r -> {
				Upd01_DtlR notSendR = notSendL.add();
				notSendR.data_no(r.data_no());
				notSendR.not_send_flg(true);
				notSendR.not_send_upd_flg(r.not_send_upd_flg());
			});

			return notSendL.groupBy(
				Upd01_DtlR.$data_no, Upd01_DtlR.$not_send_flg, Upd01_DtlR.$not_send_upd_flg);
		}
	}

	//FMCB CUSTOM END
}