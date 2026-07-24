package mcframe.serverMSLA.MSLAL5020;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import static mcframe.serverMSLA.MSLAL5020.Query.*;
import mcframe.serverMSBH.MSBHL5030.*;
import mcframe.serverMSBH.MSBHL5010.*;
import java.util.function.Function;
import mcframe.serverPF.dbc.*;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverPFBZ.PFBZB5010.*;
import java.util.Map;
import java.util.HashMap;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoSendIfService_MC extends MSLAL_PoSendIfService_MC_A{
	//FMCB CUSTOM START
	protected MCList<MST_PO_SEND_IF_R> _sendIfInsL;

	// 送信済データのキャッシュ
	protected MCList<MST_PO_SEND_IF_R> _cacheSendIfL;

	protected MCIndexKey _idxCacheSendIf = null;
	protected MCIndexKey _idxUp0 = null;
	protected MCIndexKey _idxUp1 = null;
	
	/**
	 * PoSendIf_Upd01オペレーション.<p>
	 *
	 * 発注送信ＩＦ情報を登録する。<br>
	 */
	public class PoSendIf_Upd01 extends MSLAL_PoSendIfService_MC_A.PoSendIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			initProc();
			srchSendInfo();
			createCache();
			selectTgtData();
			if (isNull(_sendIfInsL)) {
				return;
			}
			makeDataNo();
			makeIFData();
			insIFData();
			callESBSendCtrl();
			callUpd02();
			registAttachedFormSrv();
			delWk();
		}
		
		protected void createCache() {
			crtWrkForCache();
			createCacheIfData();
		}
		
		protected void createCacheIfData() {
			MST_PO_SEND_IF_R t = MST_PO_SEND_IF_R.create("T");
			MAM_EXT_SYS_R m = MAM_EXT_SYS_R.create("M");
			MCQueryApiBuilder cacheSendIfL_bldr = MCQueryApiBuilder.create(t);
			MSW_PO_D_KEY_R key = MSW_PO_D_KEY_R.create("KEY");
			MST_PO_SEND_IF_R S1V1 = MST_PO_SEND_IF_R.create("V1");
			cacheSendIfL_bldr.addSelect(m.web_api_flg);
			cacheSendIfL_bldr.addInnerJoin(key, bracket(t.po_d_no.eq(key.po_d_no)));
			cacheSendIfL_bldr.addInnerJoin(m, bracket(m.ext_sys_cd.eq(t.ext_sys_cd)));
			cacheSendIfL_bldr.addWhereWithAnd(
					t.data_lno.eq(subQuery().select(max(S1V1.data_lno).as("data_lno"))
							.from(S1V1).where(S1V1.po_d_no.eq(key.po_d_no))));

			dbSelect("MSLAL5020_MST_PO_SEND_IF_S01", _cacheSendIfL, cacheSendIfL_bldr);
			_idxCacheSendIf = _cacheSendIfL.createIndex(MST_PO_SEND_IF_R.$po_d_no);
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			_sendIfInsL = MCList.create(MST_PO_SEND_IF_R.class);
			_sendIfInsL.addBooleanColumn("po_print_flg");
			_sendIfInsL.addBooleanColumn("edi_flg");
			_sendIfInsL.addBooleanColumn("null_val_if_flg");
			_sendIfInsL.addBooleanColumn("web_api_flg");
			_sendIfInsL.addNumberColumn("last_po_rev");
			_sendIfInsL.addNumberColumn("hdr_po_rev");
			_cacheSendIfL = MCList.create(MST_PO_SEND_IF_R.class);
			_cacheSendIfL.addBooleanColumn("web_api_flg");
			_idxUp0 = up0().createIndex(PoSendIf_Upd01_DtlR.$po_no);
			_idxUp1 = up1().createIndex(PoSendIf_Upd01_Dtl2R.$po_d_no);
		}
		
		/**
		 * 送信対象情報取得
		 */
		protected void srchSendInfo() {
			crtWrkForSrch();
			MCRow bind = MCRow.create();
			bind.addDateColumn("today", getToday());
			executeQuery(_sendIfInsL, MSLAL5020_MST_PO_S01(), bind);
		}
		
		/**
		 * ・_sendIfInsLのデータで作成しないデータを除外する。<BR>
		 * ・送信するデータのデータ更新区分を再設定する。
		 * ・システムパラメータ「PO_SEND_APRV_FLG」の値が"1"の場合は、発注承認取消時における、発注送信ＩＦデータの削除データを作成しない
		 */
		protected void selectTgtData() {
			if (isSame(getSysParm("PO_SEND_APRV_FLG"), "1")) {
				_sendIfInsL = selectTgtDataSub1();
			}
			else {
				_sendIfInsL = selectTgtDataSub2();
			}
		}
		
		protected boolean isSentRevNo(MST_PO_SEND_IF_R lastSentR, MST_PO_SEND_IF_R tgtR) {
			return !isNull(lastSentR) && isSame(lastSentR.po_rev(), tgtR.po_rev()) && !MAC_DATA_CRUD_TYP.isDEL(tgtR.data_crud_typ());
		}
		
		protected MCList<MST_PO_SEND_IF_R> selectTgtDataSub1() {
			MCList<MST_PO_SEND_IF_R> editL = MCList.create(MST_PO_SEND_IF_R.class);
			for (MST_PO_SEND_IF_R r : _sendIfInsL) {
				String aprvStsTyp = r.getStringNE("aprv_sts_typ");
				setDtlCrudTyp(r);
				MST_PO_SEND_IF_R oldR = _cacheSendIfL.getFirst(_idxCacheSendIf,r.po_d_no());
				// 発注時に実行された場合は、画面に存在しない発注明細からＩＦデータを作成しない
				// 過去改訂番号で削除されたデータなどが除外される
				PoSendIf_Upd01_DtlR up0R = up0().getFirst(_idxUp0, r.po_no());
				PoSendIf_Upd01_Dtl2R up1R = up1().getFirst(_idxUp1, r.po_d_no());
				if (!up1().isEmpty() && isNull(up1R) && !isDelRow(oldR, r, up0R)) {
					continue;
				}
				if (isSentRevNo(oldR, r)) {
					continue;
				}
				if (r.getBooleanNE("edi_flg")) {
					if (!isNull(aprvStsTyp)) {
						if (MAC_APRV_STS_TYP.isACPT(aprvStsTyp)) {
							if (isDelRow(oldR, r)) {
								oldR.setBooleanNE("null_val_if_flg", r.getBooleanNE("null_val_if_flg"));
								addSentDelIFData(editL, oldR);
							}
							else {
								addIFData(editL, r, oldR);
							}
							
						}
					}
					// 前回承認対象→承認対象外になった、かつ削除行の場合
					else if (isDelRow(oldR, r, up0R)) {
						// 削除データを再送しない
						if (!isNull(oldR) && !MAC_DATA_CRUD_TYP.isDEL(oldR.data_crud_typ())) {
							oldR.setBooleanNE("null_val_if_flg", r.getBooleanNE("null_val_if_flg"));
							addSentDelIFData(editL, oldR);
						}
					}
					// 承認対象外
					else {
						addIFData(editL, r, oldR);
					}
				}
				else {
					// ＥＤＩフラグがオフの場合は、ＩＦデータを作成しない。作成済データがある状態で承認中になったとしても、削除データを作成しない。
				}
			}
			
			return editL;
		}
		
		protected MCList<MST_PO_SEND_IF_R> selectTgtDataSub2() {
			MCList<MST_PO_SEND_IF_R> editL = MCList.create(MST_PO_SEND_IF_R.class);
			for (MST_PO_SEND_IF_R r : _sendIfInsL) {
				String aprvStsTyp = r.getStringNE("aprv_sts_typ");
				// 発注時に実行された場合は、画面に存在しない発注明細からＩＦデータを作成しない
				// 過去改訂番号で削除されたデータなどが除外される
				PoSendIf_Upd01_Dtl2R up1R = up1().getFirst(_idxUp1, r.po_d_no());
				if (!up1().isEmpty() && isNull(up1R)) {
					continue;
				}
				setDtlCrudTyp(r);
				MST_PO_SEND_IF_R oldR = _cacheSendIfL.getFirst(_idxCacheSendIf,
						r.po_d_no());
				if (r.getBooleanNE("edi_flg")) {
					if (!isNull(aprvStsTyp)) {
						if (MAC_APRV_STS_TYP.isACPT(aprvStsTyp)) {
							addIFData(editL, r, oldR);
						}
						// 承認対象で、まだ承認されていない場合
						else {
							// 新規あるいは更新データ送信済の場合に削除データを作成する
							if (isCrtOrUpdSent(oldR)) {
								oldR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								oldR.setBooleanNE("null_val_if_flg", r.getBooleanNE("null_val_if_flg"));
								PoSendIf_Upd01_DtlR up0R = up0().getFirst(_idxUp0, r.po_no());
								// 画面から渡されたデータ更新区分になるのを防ぐため
								up0R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								editL.add(oldR);
							}
						}
					}
					// 承認対象外
					else {
						addIFData(editL, r, oldR);
					}
				}
				else {
					// ＥＤＩフラグがオフの場合は、ＩＦデータを作成しない。作成済データがある状態で承認中になったとしても、削除データを作成しない。
				}
			}
			
			return editL;
		}

		protected void addIFData(MCList<MST_PO_SEND_IF_R> editL, MST_PO_SEND_IF_R r, MST_PO_SEND_IF_R oldR) {
			if (isUnsentOrDelSent(oldR, r)) {
				addWhenUnsentOrDel(editL, r, oldR);
			}
			else {
				if (isNull(oldR) && MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					PoSendIf_Upd01_Dtl2R up1R = up1().getFirst(_idxUp1, r.po_d_no());
					if (!isUp1CrudTypExists(up1R)) {
						r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
				editL.add(r);
			}

		}
		
		protected void setHdrCrudTyp(MCList<MST_PO_SEND_IF_R> ifL, MAC_DATA_CRUD_TYP crudTyp) {
			MST_PO_SEND_IF_R ifR = ifL.get(0);
			PoSendIf_Upd01_DtlR up0R = up0().getFirst(_idxUp0, ifR.po_no());
			if (!isNull(up0R) && !isNull(up0R.data_crud_typ())) {
				ifL.setStringNE(MST_PO_SEND_IF_R.$po_crud_typ, up0R.data_crud_typ());
			}
			else {
				ifL.setStringNE(MST_PO_SEND_IF_R.$po_crud_typ, crudTyp.value());
			}
		}
		
		protected void setDtlCrudTyp(MST_PO_SEND_IF_R r) {
			PoSendIf_Upd01_Dtl2R up1R = up1().getFirst(_idxUp1, r.po_d_no());
			if (isUp1CrudTypExists(up1R)) {
				r.data_crud_typ(up1R.data_crud_typ());
			}
		}
		
		protected boolean isUp1CrudTypExists(PoSendIf_Upd01_Dtl2R up1R) {
			return !isNull(up1R) && !isNull(up1R.data_crud_typ());
		}
		
		protected void addWhenUnsentOrDel(MCList<MST_PO_SEND_IF_R> editL, MST_PO_SEND_IF_R r, MST_PO_SEND_IF_R oldR) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.abort_flg()) {
				// 作成しない。既に削除・打切データ作成済みか、注文書未発行・ＩＦデータ未作成の状態なので、削除・打切は不要。
			}
			else {
				// 注文書が一度も発行されていないかつ、ＩＦデータも未作成の場合にデータ更新区分を新規に付け替える
				if (isUnsent(oldR, r)) {
					PoSendIf_Upd01_DtlR up0R = up0().getFirst(_idxUp0, r.po_no());
					if (!isNull(up0R) && !isNull(up0R.data_crud_typ())) {
						up0R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				// 前回送信したデータが取消データの場合、今回送信するデータのデータ更新区分を新規に付け替える
				if (!isNull(oldR) && MAC_DATA_CRUD_TYP.isDEL(oldR.data_crud_typ())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				editL.add(r);
			}
		}
		
		protected boolean isUnsentOrDelSent(MST_PO_SEND_IF_R oldR, MST_PO_SEND_IF_R r) {
			return isUnsent(oldR, r) || isDelSent(oldR);
		}

		protected boolean isCrtOrUpdSent(MST_PO_SEND_IF_R oldR) {
			return !isNull(oldR) && !MAC_DATA_CRUD_TYP.isDEL(oldR.data_crud_typ()) && !oldR.abort_flg();
		}
		
		protected boolean isDelSent(MST_PO_SEND_IF_R oldR) {
			return !isNull(oldR) && (MAC_DATA_CRUD_TYP.isDEL(oldR.data_crud_typ()) || oldR.abort_flg());
		}
		
		protected boolean isUnsent(MST_PO_SEND_IF_R oldR, MST_PO_SEND_IF_R r) {
			return isNull(oldR) && isPoUnsent(r);
		}
		
		protected boolean isPoUnsent(MST_PO_SEND_IF_R r) {
			return !r.getBooleanNE("po_print_flg") && isNull(r.getNumberNE("last_po_rev"));
		}
		
		protected void crtWrkForSrch() {
			MCList<MST_PO_R> wkL = MCList.create(MST_PO_R.class);
			for (PoSendIf_Upd01_DtlR r : up0()) {
				wkL.add().po_no(r.po_no());
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_PO_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5020_MSW_PO_I01", wkL, wkL_bldr.getBaseDbc());
		}

		protected void crtWrkForCache() {
			MCList<MST_PO_D_R> wkL = MCList.create(MST_PO_D_R.class);
			for (MST_PO_SEND_IF_R r : _sendIfInsL) {
				wkL.add().po_d_no(r.po_d_no());
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5020_MSW_PO_D_I01", wkL, wkL_bldr.getBaseDbc());
		}

		protected void delWk() {
			MCQueryApiBuilder dbcL1_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_PO_D02", dbcL1_bldr.getBaseDbc());
			
			MCQueryApiBuilder dbcL2_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSLAL5020_MSW_PO_D_D02", dbcL2_bldr.getBaseDbc());
		}
		
		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_sendIfInsL.groupBy(MST_PO_R.$po_no).size());
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.POSENDIF, _sendIfInsL.size());
		}

		protected void makeIFData() {
			for (MCList<MST_PO_SEND_IF_R> poL : _sendIfInsL.groupList(MST_PO_SEND_IF_R.$po_no)) {
				boolean incIns = false;
				boolean incUpd = false;
				boolean incDel = false;
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()); 
				for (MST_PO_SEND_IF_R r : poL) {
					r.data_no(dataNo);
					r.data_lno(getSequence(MSC_NUM_SYS_TYP.POSENDIF.value()));
					r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					convNullValToNull(r);

					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						incIns = true;
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						incUpd = true;
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						incDel = true;
					}
				}
				
				// 上り電文でヘッダのデータ更新区分が渡されなかった場合(*)は、ここで求めたデータ更新区分を設定する
				// (*)承認の機能から実行された場合
				MAC_DATA_CRUD_TYP crudTyp;
				if (incIns && !incUpd && !incDel) {
					crudTyp = MAC_DATA_CRUD_TYP.CRT;
				}
				else if (!incIns && !incUpd && incDel) {
					crudTyp = MAC_DATA_CRUD_TYP.DEL;
				}
				else {
					crudTyp = MAC_DATA_CRUD_TYP.UPD;
				}
				setHdrCrudTyp(poL, crudTyp);

			}
		}
		
		protected void convNullValToNull(MST_PO_SEND_IF_R r) {
			if (!r.getBooleanNE("null_val_if_flg")) {
				r.itm_sub1(nullValToNull(r.itm_sub1()));
				r.itm_sub2(nullValToNull(r.itm_sub2()));
				r.itm_sub3(nullValToNull(r.itm_sub3()));
				r.sno1(nullValToNull(r.sno1()));
				r.sno2(nullValToNull(r.sno2()));
				r.sno3(nullValToNull(r.sno3()));
				r.sno4(nullValToNull(r.sno4()));
				r.maker_cd(nullValToNull(r.maker_cd()));
			}
		}
		
		protected void insIFData() {
			MCQueryApiBuilder sendIfInsL_bldr = MCQueryApiBuilder.create(MST_PO_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL5020_MST_PO_SEND_IF_I01", _sendIfInsL, sendIfInsL_bldr);
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			PFBZL_SendRecvIfCtrl.Ins01 o = PFBZL_SendRecvIfCtrl.crtIns01();
			addAll(o.up0(), _sendIfInsL.groupBy(MST_PO_SEND_IF_R.$data_no,
					MST_PO_SEND_IF_R.$ext_sys_cd), createMapESB());
			o.exec();
		}

		protected MapESB<DtlR, MST_PO_SEND_IF_R> createMapESB() {
			return new MapESB<DtlR, MST_PO_SEND_IF_R>();
		}

		public class MapESB<D extends DtlR, S extends MST_PO_SEND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_no(src.data_no());
				dest.if_proc_typ(MAC_IF_PROC_TYP.PO_SEND.value());
				dest.ext_sys_cd(src.ext_sys_cd());
				// 連携しない
				dest.webapi_not_link_flg(true);
			}
		}
		/**
		 * WebAPI連携を行う
		 */
		protected void callUpd02() {
			MCList<MST_PO_SEND_IF_R> sendL =
				_sendIfInsL
					.subList(r -> r.getBooleanNE("web_api_flg"))
					.groupBy(MST_PO_SEND_IF_R.$data_no,MST_PO_SEND_IF_R.$po_no);
			if (isSyncWebApi() && !sendL.isEmpty()) {
				MSLAL_PoSendIfService.PoSendIf_Upd02 o = MSLAL_PoSendIfService.crtPoSendIf_Upd02();
				setAll(o.up0(), sendL, createMap_PoSendIf_Upd02_DtlR_MST_PO_SEND_IF_R());
				o.exec();
			}
		}
		protected Map_PoSendIf_Upd02_DtlR_MST_PO_SEND_IF_R<PoSendIf_Upd02_DtlR,MST_PO_SEND_IF_R> createMap_PoSendIf_Upd02_DtlR_MST_PO_SEND_IF_R() {
			return new Map_PoSendIf_Upd02_DtlR_MST_PO_SEND_IF_R<PoSendIf_Upd02_DtlR, MST_PO_SEND_IF_R>();
		}
		public class Map_PoSendIf_Upd02_DtlR_MST_PO_SEND_IF_R<D extends PoSendIf_Upd02_DtlR, S extends MST_PO_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSendIf_Upd02_DtlR.$po_no, MST_PO_SEND_IF_R.$po_no);
				addColumnPathMap(PoSendIf_Upd02_DtlR.$data_no, MST_PO_SEND_IF_R.$data_no);
			}
		}
		/**
		 * WebAPI連携を同期で行うか
		 */
		protected boolean isSyncWebApi() {
			if (up0().isEmpty()
				|| !up0().get(0).is_src_aprvaf_srv_flg()
				|| MCBooleanUtil.dbStringToBoolean(
						getSysParmNE("GA_PO_APRV_SEND_FLG"))) {
				return true;
			}
			return false;
		}
		/**
		 * 前回承認時から比較して削除された行を追加する。
		 * @param editL 登録対象のリスト
		 * @param oldR 更新前のIFデータ
		 */
		protected void addSentDelIFData(MCList<MST_PO_SEND_IF_R> editL, MST_PO_SEND_IF_R oldR) {
			oldR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			editL.add(oldR);
		}
		protected boolean isDelRow(MST_PO_SEND_IF_R oldR, MST_PO_SEND_IF_R r) {
			return !isNull(oldR) && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());
		}
		protected boolean isDelRow(MST_PO_SEND_IF_R oldR, MST_PO_SEND_IF_R r, PoSendIf_Upd01_DtlR up0R) {
			return !isNull(up0R.bef_aprv_sts_typ()) && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());
		}
	}
	/**
	 * PoSendIf_Upd02オペレーション.<p>
	 *
	 * 発注送信ＩＦを、送信または再送信します<br>
	 */
	public class PoSendIf_Upd02 extends MSLAL_PoSendIfService_MC_A.PoSendIf_Upd02 {
		protected static final String SEND_GRP = "send_grp";
		protected MCList<MST_PO_SEND_IF_R> _sendIfL;
		protected MCIndexKey _sendIfIdx;
		protected MCIndexKey _sendIfPoIdx;
		protected MCIndexKey _sendIfDataIdx;
		protected MCIndexKey _up0PoIdx;
		protected Map<String, MCNumber> _poErrSet;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initProc();
			selectSendTgt();
			send();
			setDown();
		}
		
		protected void initProc() {
			_sendIfL = MCList.create(MST_PO_SEND_IF_R.class);
			_sendIfL.addNumberColumn(SEND_GRP);
			_poErrSet = new HashMap<>();
			_up0PoIdx = up0(). createIndex(PoSendIf_Upd02_DtlR.$po_no);
		}
		
		/**
		 * 送信対象を取得する<br>
		 * 最新のデータだけでなく、送信していない分も送信する
		 */
		protected void selectSendTgt() {
			MST_PO_SEND_IF_R t1 = MST_PO_SEND_IF_R.create("T1");
			MST_PO_SEND_IF_R t2 = MST_PO_SEND_IF_R.create("T2");
			PFT_SDRV_IF_R t3 = PFT_SDRV_IF_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(t2.data_no, t2.ext_sys_cd, t2.po_no, t3.sdrv_sts_typ);
			bldr.addInnerJoin(t2, t2.po_no.eq(t1.po_no));
			bldr.addInnerJoin(t3, t3.data_no.eq(t2.data_no));
			bldr.setWhere(t1.data_no.eq(bind("data_no")));
			bldr.addConstWhereWithAnd(t2.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value())));
			bldr.addConstWhereWithAnd(t3.not_send_flg.eq(value(false)));
			
			dbSelect("MSLAL5020_MST_PO_SEND_IF_S02", _sendIfL, bldr, up0());
			
			for (MCList<MST_PO_SEND_IF_R> gl : _sendIfL.groupList(MST_PO_SEND_IF_R.$po_no)) {
				// データＮＯの新しいデータからさかのぼって、送信対象を特定する
				MCList<MST_PO_SEND_IF_R> tmpL = MCList.create(MST_PO_SEND_IF_R.class);
				gl.sort(SortType.DESC, MST_PO_SEND_IF_R.$data_no);
				for (MST_PO_SEND_IF_R r : gl) {
					if (!isSendTgt(r)) {
						break;
					}
					tmpL.add(r);
				}
				
				// データＮＯの古いデータから送信する
				int i = 0;
				tmpL.sort(SortType.ASC, MST_PO_SEND_IF_R.$data_no);
				for (MST_PO_SEND_IF_R r : tmpL) {
					r.setNumber(SEND_GRP, ++i);
				}
			}
			
			_sendIfL.setAll(_sendIfL.subList(r -> !isNull(r.getNumber(SEND_GRP))));
			_sendIfIdx = _sendIfL.createIndex(SEND_GRP);
			_sendIfPoIdx = _sendIfL.createIndex(MST_PO_SEND_IF_R.$po_no);
			_sendIfDataIdx = _sendIfL.createIndex(MST_PO_SEND_IF_R.$data_no);
		}
		protected boolean isSendTgt(MST_PO_SEND_IF_R r) {
			if (MAC_SDRV_STS_TYP.isNOTYET(r.sdrv_sts_typ())
				|| MAC_SDRV_STS_TYP.isSEND_CONV_ERR(r.sdrv_sts_typ())
				|| MAC_SDRV_STS_TYP.isSEND_ERR(r.sdrv_sts_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 送信対象の発注を送信する
		 */
		protected void send() {
			if (isNull(_sendIfL)) {
				return;
			}
			
			int min = ((MCNumber)_sendIfL.min(SEND_GRP)).intValue();
			int max = ((MCNumber)_sendIfL.max(SEND_GRP)).intValue();
			for (int i=min; i<=max; i++) {
				// 送信対象の発注のうち、データＮＯの古いデータから送信する
				// 送信できなかった発注は、以降の送信対象から除外する
				callESBData(
					_sendIfL
						.subList(_sendIfIdx, MCNumber.valueOf(i))
						.subList(r -> !_poErrSet.containsKey(r.po_no()))
				);
			}
			
			aftrSend();
		}
		protected void aftrSend() {
			for (String poNo : _poErrSet.keySet()) {
				// 送信できなかった発注
				PoSendIf_Upd02_DtlR up0R = up0().getFirst(_up0PoIdx,  poNo);
				MCNumber dataNo = _poErrSet.get(up0R.po_no());
				
				// 送信対象から除外した発注に対するメッセージ
				MCList<MST_PO_SEND_IF_R> poL = _sendIfL
					.subList(_sendIfPoIdx, up0R.po_no())
					.distinctNE(MST_PO_SEND_IF_R.$data_no);
				poL.sort(SortType.ASC, MST_PO_SEND_IF_R.$data_no);
				for (MST_PO_SEND_IF_R poR : poL) {
					if (poR.data_no().gt(dataNo)) {
						MCMessagePool.add(
							new MCMessage(up0R, null, MSLAL0728, poR.data_no(), up0R.po_no())
						);
					}
				}
				
				up0R.err_flg(true);
			}
		}
		
		protected void callESBData(MCList<MST_PO_SEND_IF_R> sendL) {
			if (isNull(sendL)) {
				return;
			}
			saveMsgL();
			
			PFBZB_SendDataConv.Upd02 upd02 = PFBZB_SendDataConv.crtUpd02();
			setAll(upd02.up0(), sendL, createMap_SdrvDtlR_MST_PO_SEND_IF_R());
			upd02.exec();
			
			restoreMsgL();
			aftrCallESBData(sendL);
		}
		protected Map_SdrvDtlR_MST_PO_SEND_IF_R<SdrvDtlR,MST_PO_SEND_IF_R> createMap_SdrvDtlR_MST_PO_SEND_IF_R() {
			return new Map_SdrvDtlR_MST_PO_SEND_IF_R<SdrvDtlR, MST_PO_SEND_IF_R>();
		}
		public class Map_SdrvDtlR_MST_PO_SEND_IF_R<D extends SdrvDtlR, S extends MST_PO_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.PO_SEND.value());
				dest.data_no(src.data_no());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.batch_flg(false);
			}
		}
		
		/**
		 * 送信後処理
		 */
		protected void aftrCallESBData(MCList<MST_PO_SEND_IF_R> sendL) {
			PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
			MST_PO_SEND_IF_R t2 = MST_PO_SEND_IF_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(t2.data_no, t1.sdrv_sts_typ, t2.po_no);
			bldr.addInnerJoin(t2, t2.data_no.eq(t1.data_no));
			bldr.setWhere(t1.data_no.eq(bind("data_no")));
			bldr.addConstWhereWithAnd(t1.sdrv_sts_typ.neq(value(MAC_SDRV_STS_TYP.SEND_OK.value())));
			
			MCList<MST_PO_SEND_IF_R> rsltL = MCList.create(MST_PO_SEND_IF_R.class);
			dbSelect("MSLAL5020_MST_PO_SEND_IF_S03", rsltL, bldr, sendL);
			
			// 送信できなかった発注を退避。以降の送信対象から除外するため
			rsltL.forEach(r -> {
				_poErrSet.put(r.po_no(), r.data_no());
			});
		}
		
		protected MCMessageList _saveMsgL;
		protected void saveMsgL() {
			_saveMsgL = new MCMessageList();
			_saveMsgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
		}
		protected void restoreMsgL() {
			setCauseRow4Up0R(MCMessagePool.getMessageList());
			_saveMsgL.addAll(MCMessagePool.getMessageList());
			
			MCMessagePool.clear();
			MCMessagePool.addAll(_saveMsgL);
			_saveMsgL = null;
		}
		protected void setCauseRow4Up0R(MCMessageList msgL) {
			for (MCMessage msg : msgL) {
				MCRow row = msg.getCauseRow();
				if (isNull(row)) {
					continue;
				}
				
				// データＮＯを元に上り電文のロウと差し替える
				MCNumber dataNo = row.getNumberNE("data_no");
				if (!isNull(dataNo)) {
					MST_PO_SEND_IF_R ifR = _sendIfL.getFirst(_sendIfDataIdx, dataNo);
					if (!isNull(ifR)) {
						PoSendIf_Upd02_DtlR up0R = up0().getFirst(_up0PoIdx,  ifR.po_no());
						msg.setCauseRow(up0R, msg.getCauseColumn());
					}
				}
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/***
	 * 添付帳票登録サービスを呼び出す。
	 */
	protected void registAttachedFormSrv() {

		MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
		MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
		opAttc.up1().upd_cntr_chk_flg(false);
		
		MCGroupByPolicy policy = new MCGroupByPolicy(MST_PO_SEND_IF_R.$po_no);
		MCList<MST_PO_SEND_IF_R> regGrpL = _sendIfInsL.groupBy(policy);

		MCIndexKey idxkey = _sendIfInsL.createIndex(MST_PO_SEND_IF_R.$po_no);
		MCIndexKey idxkey2 = _sendIfInsL.createIndex(MST_PO_SEND_IF_R.$po_no, MST_PO_SEND_IF_R.$data_crud_typ);
		
		// 全明細削除(ヘッダ削除時)のDEL01呼出
		for (MST_PO_SEND_IF_R r : regGrpL) {
			MCList<MST_PO_SEND_IF_R> delBefL = _sendIfInsL.subList(idxkey, r.po_no());
			MCList<MST_PO_SEND_IF_R> delAftL = _sendIfInsL.subList(idxkey2, r.po_no(),
					MAC_DATA_CRUD_TYP.DEL.value());

			if (delBefL.size() == delAftL.size()) {
				Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
				attcUp.biz_typ(MAC_BIZ_TYP.PO_EDI.value());
				attcUp.report_id("MSLAR0020");
				attcUp.biz_key1(delBefL.get(0).po_no());
				attcUp.biz_key2(delBefL.get(0).po_rev().toString());
				opAttcDel.up0().add(attcUp);
			}
		}

		// Upd01呼出
		for (MST_PO_SEND_IF_R r : regGrpL) {

			MST_PO_SEND_IF_R firstR = _sendIfInsL.getFirst(idxkey, r.po_no());
			MCNumber trdAmtSum = new MCNumber(0);
			MCList<MST_PO_SEND_IF_R> datalnoL = _sendIfInsL.subList(idxkey,
					firstR.po_no());
			for (MST_PO_SEND_IF_R sr : datalnoL) {
				//up2電文(data_lno単位)
				Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
				up2.biz_typ(MAC_BIZ_TYP.PO_EDI.value());
				up2.biz_key1(firstR.po_no());
				up2.biz_key2(firstR.po_rev().toString());
				up2.report_id("MSLAR0020");
				up2.data_lno(sr.data_lno());
				opAttc.up2().add(up2);

				// 削除以外の金額サマリ
				if (!MAC_DATA_CRUD_TYP.isDEL(sr.data_crud_typ())) {
					if(!isNull(sr.trd_cur_amt()) && !isNull(sr.trd_cur_tax_amt())) {
						trdAmtSum = trdAmtSum.add(sr.trd_cur_amt().add(sr.trd_cur_tax_amt()));
					}
				}
			}

			//up0電文
			Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
			up.biz_typ(MAC_BIZ_TYP.PO_EDI.value());
			up.biz_key1(firstR.po_no());
			up.biz_key2(firstR.po_rev().toString());
			up.report_id("MSLAR0020");
			up.dt(firstR.po_dt());
			up.amt(trdAmtSum);
			up.bp_cd(firstR.sppl_cd());
			up.cur_cd(firstR.trd_cur_cd());
			up.wg_cd(firstR.wg_cd());
			up.purc_dpt_cd(firstR.purc_dpt_cd());
			up.sppl_cd(firstR.sppl_cd());
			up.wrk_no(firstR.wrk_no());
			up.tterm_cd1(firstR.tterm_cd1());
			up.tterm_cd2(firstR.tterm_cd2());
			up.tterm_cd3(firstR.tterm_cd3());
			up.edi_sub_char1(firstR.edi_sub_char1());
			up.edi_sub_char2(firstR.edi_sub_char2());
			up.edi_sub_char3(firstR.edi_sub_char3());
			up.edi_sub_char4(firstR.edi_sub_char4());
			up.edi_sub_char5(firstR.edi_sub_char5());
			up.if_proc_typ(MAC_IF_PROC_TYP.PO_SEND.value());
			opAttc.up0().add(up);
		}

		if (opAttc.up0().size() > 0) {
			opAttc.exec();
		}
		if (opAttcDel.up0().size() > 0) {
			opAttcDel.exec();
		}
	}

	//FMCB CUSTOM END
}