package mcframe.serverMBBC.MBBCL5020;

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


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBC.MBBCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBC.MBBCL5030.MBBCL_InvoiceAgentLinkService;
import mcframe.serverMBBC.MBBCL5010.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.commonCore.sys.*;
import mcframe.commonCore.param.MCDownloadStream;
import mcframe.commonCore.requester.MCDownloadUtil;
import mcframe.serverCore.messagequeue.MCMQMessage;
import mcframe.serverCore.messagequeue.MCMessageQueue;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import org.apache.commons.io.FileUtils;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBCL_AttachService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBCL_AttachService_MC extends MBBCL_AttachService_MC_A{
	//FMCB CUSTOM START

	// キャッシュ
	protected static final Class<MBBCL_AttachService> CLAZZ = MBBCL_AttachService.class;

	// プレースホルダ
	protected static final String DIR_MCF_HOME = "{MCF_HOME}";
	protected static final String DIR_CO_CD = "{CO_CD}";
	protected static final String DIR_BP_CD = "{BP_CD}";
	protected static final String DIR_TRD_YM = "{TRD_YM}";
	protected static final String DIR_BIZ_TYP = "{BIZ_TYP}";

	protected static final String EXT_SYS_CD = "ext_sys_cd";
	protected static final String USER_CD = "user_cd";
	protected static final String PASSWORD = "password";
	protected static final String WEB_API_FLG = "web_api_flg";
	protected static final String WEB_URL = "web_url";

	/**
	 * Attach_Chk01オペレーション.<p>
	 *
	 * 添付ファイル情報登録・更新前チェック<br>
	 */
	public class Attach_Chk01 extends MBBCL_AttachService_MC_A.Attach_Chk01 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}
		
		@Override
		protected MCMessageList doServerCheckRows(MCNumber paramIndex,
				MCList<? extends MCConstRow> chkTarL) {
			MCMessageList msgL = super.doServerCheckRows(paramIndex, chkTarL);

			// 重複エラーが発生したとき、causeRowではない方の行に対するエラーメッセージを追加する
			MCMessageList addMsgL = new MCMessageList();
			for (MCMessage m : msgL) {
				if (isSame(m.getID(), "FXUCC0031")) {
					int causeRowIndex = MCNumber.valueOf(m.getBindArray()[2]).intValue()
							- 1;
					for(MCRow r : chkTarL) {
						if (isSame(r.getGUIIndex(), causeRowIndex)) {
							addMsgL.add(new MCMessage(r, m.getCauseColumn(), m.getID(), m.getBindArray()[0],
									MCNumber.valueOf(m.getBindArray()[2]),
									MCNumber.valueOf(m.getBindArray()[1])));
							break;
						}
					}
				}
			}
			msgL.addAll(addMsgL);
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// ロック
			msgL.addAll(lock(up0(), up1().upd_cntr_chk_flg()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Attach_Chk01_DtlR> notErrL = getChkList(up0());
			createRptExtSysCache(notErrL);
			for (Attach_Chk01_DtlR r : notErrL) {
				if (r.isStatusDelete() || (!up1().upd_cntr_chk_flg() && !isStrgTgt(r.report_id()))) {
					continue;
				}
				// 帳票保存システムＣＤチェック
				if (isNull(getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()))) {
					if (up1().upd_cntr_chk_flg()) {
						msgL.add(new MCMessage(r, Attach_Chk01_DtlR.$bp_cd, MBBCL0009, r.biz_typ(), r.bp_cd()));
					}
					return msgL;
				}
				// 必須チェック
				for (int i = 2; i <= MAC_BIZ_TYP.key_num(r.biz_typ()).intValue(); i++) {
					msgL.addAll(check(r, "biz_key" + i, new FXUCL_RequiredValidater()));
				}
				if (r.attach_file_flg()) {
					msgL.addAll(check(r, Attach_Chk01_DtlR.$file_bin, new FXUCL_RequiredValidater()));
				}
				// 保存済みファイル存在チェック
				if (r.select_file_flg() && !existsExtFile(r)) {
					msgL.add(new MCMessage(r, Attach_Chk01_DtlR.$file_path, MBBCL0003, r.file_path(), r.file_nm()));
				}

				// 補完
				if (isNull(r.file_path())) {
					MAM_REPORT_STRG_PATH_R pathR = getCacheRptPath(r.biz_typ(), r.bp_cd());
					if (isNull(pathR)) {
						msgL.add(new MCMessage(r, null, MBBCL0004, r.biz_typ(), r.bp_cd()));
					}
					else {
						r.file_path(convPlaceHolder(pathR.report_strg_path(), r));
					}
				}
				if (isNull(r.file_nm())) {
					MAM_REPORT_FILE_NM_R nmR = getCacheRptFileNm(r.biz_typ());
					if (isNull(nmR)) {
						msgL.add(new MCMessage(r, Attach_Chk01_DtlR.$biz_typ, MBBCL0006, r.biz_typ()));
					}
					else {
						r.file_nm(getRptFileNm(r, nmR));
					}
				}
				if (isNullOr(r.file_path(), r.file_nm())) {
					// 補完できなかったレコードはスルー
					continue;
				}
				matchExt(r);

				// 帳票保存システムに対応するパスかチェック
				Map<String, String> m = getExtParamInfo(getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()));
				if (isSame(m.get(WEB_API_FLG), "1") && r.file_path().indexOf("/") != 0 || isSame(m.get(WEB_API_FLG), "0") && r.file_path().indexOf("/") == 0) {
					msgL.add(new MCMessage(r, null, MBBCL0001, m.get(EXT_SYS_CD), r.file_path()));
				}
				// ファイル名重複チェック
				if (r.attach_file_flg() && existsExtFile(r)) {
					msgL.add(new MCMessage(r, Attach_Chk01_DtlR.$file_nm, MBBCL0005, r.file_path(), r.file_nm()));
				}
			}
			return msgL;
		}

		protected boolean existsExtFile(Attach_Chk01_DtlR r) {
			Map<String, String> m = getExtParamInfo(getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()));

			if (isSame(m.get(WEB_API_FLG), "0")) {
				File f = new File(r.file_path(), r.file_nm());
				return f.exists();
			}
			else {
				String path = r.file_path();
				if (!path.matches(".*/$")) {
					path = path + "/";
				}
				String id = MBBCL_InvoiceAgentLinkService.getDocId(getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()), path + r.file_nm());
				r.doc_id(id);
				return !isNull(id);
			}
		}

		protected Map<String, Map<String, String>> _map = new HashMap<>();
		protected Map<String, String> getExtParamInfo(String extSysCd) {
			if (_map.containsKey(extSysCd)) {
				return _map.get(extSysCd);
			}
			_map.put(extSysCd, getExtParaMap(extSysCd));
			return _map.get(extSysCd);
		}

		/** 
		 * 添付元ファイルと保存先ファイルの拡張子を揃える
		 * */
		protected void matchExt(Attach_Chk01_DtlR r) {
			if (!r.attach_file_flg() || isNull(r.file_bin())) {
				return;
			}

			File f = new File(r.file_bin().toString());
			if (isNullOr(f.getName(), r.file_nm())) {
				return;
			}

			String filename = r.file_nm();
			int i = f.getName().lastIndexOf(".");
			if (i != -1) {
				String ext = f.getName().substring(i);
				int j = r.file_nm().lastIndexOf(".");
				if (j == -1) {
					filename = filename + ext;
				}
				else {
					filename = filename.substring(0, j) + ext;
				}
				r.file_nm(filename);
			}
		}
	}
	/**
	 * Attach_Chk02オペレーション.<p>
	 *
	 * 添付ファイル情報削除前チェック<br>
	 */
	public class Attach_Chk02 extends MBBCL_AttachService_MC_A.Attach_Chk02 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// ロック
			msgL.addAll(lock(up0(), false));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Attach_Chk02_DtlR> notErrL = getChkList(up0());
			for (Attach_Chk02_DtlR r : notErrL) {
				// 必須チェック
				for (int i = 2; i <= MAC_BIZ_TYP.del_key_num(r.biz_typ()).intValue(); i++) {
					msgL.addAll(check(r, "biz_key" + i, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}
	}
	/**
	 * Attach_Upd01オペレーション.<p>
	 *
	 * 添付ファイル情報を登録・更新する<br>
	 */
	public class Attach_Upd01 extends MBBCL_AttachService_MC_A.Attach_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();

				if (up1().upd_cntr_chk_flg()) {
					handleSuccess(up0());
				}
			}
			catch (Exception e) {
				if (up1().upd_cntr_chk_flg()) {
					handleEx(e, up0());
				}
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Attach_Chk01_DtlR> notErrL = getChkList(up0());
			notErrL = getStrgTgtList(notErrL);
			upd(notErrL);
			attachFile(notErrL);
			callEdiCsv(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
			createStrgTgtReportCache();
			createRptFileNmCache(up0());
			createRptPathCache(up0());
			createRptMngDefCache(up0());
			if (up1().upd_cntr_chk_flg()) {
				createMaxRevCache(up0());
			}
		}

		protected void callThisChk01() {
			MBBCL_AttachService.Attach_Chk01 ope = MBBCL_AttachService.crtAttach_Chk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected MCList<Attach_Chk01_DtlR> getStrgTgtList(MCList<Attach_Chk01_DtlR> l) {
			MCList<Attach_Chk01_DtlR> newL = l.createInstance();
			createRptExtSysCache(l);
			for (Attach_Chk01_DtlR r : l) {
				if (!up1().upd_cntr_chk_flg() && !isStrgTgt(r.report_id())) {
					continue;
				}
				if (isNull(getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt()))) {
					continue;
				}
				newL.add(r);
			}
			return newL;
		}

		protected void upd(MCList<Attach_Chk01_DtlR> notErrL) {
			if (up1().upd_cntr_chk_flg()) {
				// 備考が変更されただけの場合は、版を上げずに更新のみ行う
				MCList<Attach_Chk01_DtlR> updRmrksL = notErrL.createInstance();
				notErrL.forEach(r->{
					if (r.isStatusModify() && !r.attach_file_flg() && !r.select_file_flg()) {
						updRmrksL.add(r);
					}
				});
				updRmrks(updRmrksL);
				notErrL.removeAll(updRmrksL);
			}
			delAttachment(notErrL);
			editList(notErrL);
			insAttachment(notErrL);
		}
		protected void updRmrks(MCList<Attach_Chk01_DtlR> updRmrksL) {
			if (updRmrksL.isEmpty()) {
				return ;
			}
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(MBT_ATTACHMENT_R.$rmrks1, t.rmrks1, bindEx("rmrks1"));
			bldr.addSet(MBT_ATTACHMENT_R.$rmrks2, t.rmrks2, bindEx("rmrks2"));
			bldr.addSet(MBT_ATTACHMENT_R.$rmrks3, t.rmrks3, bindEx("rmrks3"));
			bldr.addSet(MBT_ATTACHMENT_R.$rmrks4, t.rmrks4, bindEx("rmrks4"));
			bldr.addSet(MBT_ATTACHMENT_R.$rmrks5, t.rmrks5, bindEx("rmrks5"));
			bldr.setWhere(
					t.data_no.eq(bindEx("data_no")).and(t.edition.eq(bindEx("edition"))));
			dbUpdate("MBBCL5020_MBT_ATTACHMENT_U06", updRmrksL, bldr);
		}

		protected void delAttachment(MCList<Attach_Chk01_DtlR> notErrL) {
			delAttachmentByBizKey(notErrL);
		}
		protected void delAttachmentByBizKey(MCList<Attach_Chk01_DtlR> notErrL) {
			if (notErrL.isEmpty()) {
				return ;
			}
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(MBT_ATTACHMENT_R.$data_crud_typ, t.data_crud_typ,
					value(MAC_DATA_CRUD_TYP.DEL.value()));
			bldr.setWhere(t.biz_typ.eq(bindEx("biz_typ"))
					.and(bindEx("report_id").isNull().or(
							t.report_id.eq(bindEx("report_id")).or(t.report_id.isNull())))
					.and(t.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value()))));
			int eqMax = MAC_BIZ_TYP.del_key_num(notErrL.get(0).biz_typ()).intValue();
			for (int i = 1; i <= MAC_BIZ_TYP.key_num(notErrL.get(0).biz_typ())
					.intValue(); i++) {
				String colNm = "biz_key" + i;
				MCStringPermColumn biz_keyN = (MCStringPermColumn) t.getColumn$(colNm);
				if (i <= eqMax || up1().del_flg()) {
					bldr.addWhereWithAnd(biz_keyN.eq(bindEx(colNm)));
				}
				if (up1().upd_cntr_chk_flg() && i > eqMax) {
					bldr.addWhereWithAnd(toNumber(biz_keyN).lt(toNumber(bindEx(colNm)))
							.or(toNumber(biz_keyN).eq(toNumber(bindEx(colNm)))
									.and(t.data_no.eq(bindEx("data_no")))));
				}
			}
			dbUpdate("MBBCL5020_MBT_ATTACHMENT_U02", notErrL, bldr);
		}
		
		protected void editList(MCList<Attach_Chk01_DtlR> notErrL) {
			for (Attach_Chk01_DtlR r : notErrL) {
				if (isNull(r.data_no())) {
					r.data_no(getSequence(MAC_NUM_SYS_TYP.ATTACHMENT.value()).toString());
					r.edition(0);
					r.addStringColumn("data_crud_typ", up1().del_flg() ? MAC_DATA_CRUD_TYP.DEL.value() : MAC_DATA_CRUD_TYP.CRT.value());
					r.addBooleanColumn("archive_flg", r.select_file_flg());
					setRptAttr(r);
				}
				else if (!r.isStatusDelete()) {
					r.edition(r.edition().add(1));
					r.addStringColumn("data_crud_typ", up1().del_flg() ? MAC_DATA_CRUD_TYP.DEL.value() : MAC_DATA_CRUD_TYP.UPD.value());
					if (r.select_file_flg() || r.attach_file_flg()) {
						r.addBooleanColumn("archive_flg", r.select_file_flg());
					}
					else {
						r.addBooleanColumn("archive_flg", true);
					}
					setRptAttr(r);
				}
				// 画面からの更新時、かつkey_numとdel_key_numが違うとき（＝改訂番号あり）自分より大きい改訂番号があったら削除する
				if (up1().upd_cntr_chk_flg() && !up1().del_flg()
						&& !isSame(MAC_BIZ_TYP.key_num(r.biz_typ()),
								MAC_BIZ_TYP.del_key_num(r.biz_typ()))) {
					MBT_ATTACHMENT_R maxRevR = getCacheMaxRev(getDelKeyValues(r));
					if (!isNull(maxRevR)) {
						String revKey = getRevKey(r.biz_typ());
						if (MCNumber.valueOf(maxRevR.getStringNE(revKey)).gt(MCNumber.valueOf(r.getStringNE(revKey)))) {
							r.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
						}
					}
				}
			}
		}

		protected void setRptAttr(Attach_Chk01_DtlR row) {
			for (int i = 1; i <= 20; i++) {
				MAM_REPORT_MNG_DEF_R r = getCacheRptMngDef(row.biz_typ(), lpad(i, 2, "0"));
				if (null == r) {
					continue;
				}
				row.addStringColumn("rpt_attr"+i, getRptAttr(r.rpt_attr_set_typ(), row));
			}
		}

		protected void insAttachment(MCList<Attach_Chk01_DtlR> notErrL) {
			MCList<Attach_Chk01_DtlR> insL = notErrL.subList(MCRow.CREATE,MCRow.MODIFY,MCRow.NONE);
			dbInsert("MBBCL5020_MBT_ATTACHMENT_I01", insL, MCQueryApiBuilder.create(MBT_ATTACHMENT_R.create("T")));
		}

		protected void attachFile(MCList<Attach_Chk01_DtlR> notErrL) {
			MCList<Attach_Chk01_DtlR> bindL = notErrL.createInstance();
			for (Attach_Chk01_DtlR r : notErrL) {
				if (!isNull(r.file_bin())) {
					bindL.add(r);
				}
			}

			if (bindL.isEmpty()) {
				return ;
			}

			try {
				String msgQId = request_consumer01();
				bindL.addStringColumn("msg_queue_id", msgQId);
				updateAttachment(bindL);
			}
			catch (Exception e) {
				throw new MCException(e);
			}
		}

		protected String request_consumer01() throws Exception {
			MCMQMessage target = MCMQMessage.create("consumer01");
			Optional<String> messageQueueId = MCMessageQueue.request(target);
			return messageQueueId.get();
		}

		protected void updateAttachment(MCList<Attach_Chk01_DtlR> bindL) {
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.msg_queue_id, t.file_nm, t.file_path);
			dbUpdateKey("MBBCL5020_MBT_ATTACHMENT_U03", bindL, bldr);
		}

		protected void callEdiCsv(MCList<Attach_Chk01_DtlR> notErrL) {
			MCRowMatcher<Attach_Chk01_DtlR> rm = r -> !isNull(r.if_proc_typ());
			MCList<Attach_Chk01_DtlR> l = notErrL.subList(rm);
			if (l.isEmpty()) {
				return ;
			}

			MBBCL_EdiCsvService.EdiCsv_Prnt01 ope = MBBCL_EdiCsvService.crtEdiCsv_Prnt01();
			addAll(ope.up0(), l, createMap_EdiCsv_Chk01_Dtl1R_Attach_Chk01_DtlR());
			addAll(ope.up1(), up2(), createMap_EdiCsv_Chk01_Dtl2R_Attach_Upd01_Dtl2R());
			ope.exec();
		}
		protected Map_EdiCsv_Chk01_Dtl1R_Attach_Chk01_DtlR<EdiCsv_Chk01_Dtl1R,Attach_Chk01_DtlR> createMap_EdiCsv_Chk01_Dtl1R_Attach_Chk01_DtlR() {
			return new Map_EdiCsv_Chk01_Dtl1R_Attach_Chk01_DtlR<EdiCsv_Chk01_Dtl1R, Attach_Chk01_DtlR>();
		}
		public class Map_EdiCsv_Chk01_Dtl1R_Attach_Chk01_DtlR<D extends EdiCsv_Chk01_Dtl1R, S extends Attach_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$if_proc_typ, Attach_Chk01_DtlR.$if_proc_typ);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_typ, Attach_Chk01_DtlR.$biz_typ);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$report_id, Attach_Chk01_DtlR.$report_id);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key1, Attach_Chk01_DtlR.$biz_key1);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key2, Attach_Chk01_DtlR.$biz_key2);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key3, Attach_Chk01_DtlR.$biz_key3);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key4, Attach_Chk01_DtlR.$biz_key4);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key5, Attach_Chk01_DtlR.$biz_key5);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key6, Attach_Chk01_DtlR.$biz_key6);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key7, Attach_Chk01_DtlR.$biz_key7);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key8, Attach_Chk01_DtlR.$biz_key8);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key9, Attach_Chk01_DtlR.$biz_key9);
				addColumnPathMap(EdiCsv_Chk01_Dtl1R.$biz_key10, Attach_Chk01_DtlR.$biz_key10);
			}
		}
		protected Map_EdiCsv_Chk01_Dtl2R_Attach_Upd01_Dtl2R<EdiCsv_Chk01_Dtl2R,Attach_Upd01_Dtl2R> createMap_EdiCsv_Chk01_Dtl2R_Attach_Upd01_Dtl2R() {
			return new Map_EdiCsv_Chk01_Dtl2R_Attach_Upd01_Dtl2R<EdiCsv_Chk01_Dtl2R, Attach_Upd01_Dtl2R>();
		}
		public class Map_EdiCsv_Chk01_Dtl2R_Attach_Upd01_Dtl2R<D extends EdiCsv_Chk01_Dtl2R, S extends Attach_Upd01_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$data_lno, Attach_Upd01_Dtl2R.$data_lno);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_typ, Attach_Upd01_Dtl2R.$biz_typ);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$report_id, Attach_Upd01_Dtl2R.$report_id);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key1, Attach_Upd01_Dtl2R.$biz_key1);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key2, Attach_Upd01_Dtl2R.$biz_key2);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key3, Attach_Upd01_Dtl2R.$biz_key3);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key4, Attach_Upd01_Dtl2R.$biz_key4);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key5, Attach_Upd01_Dtl2R.$biz_key5);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key6, Attach_Upd01_Dtl2R.$biz_key6);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key7, Attach_Upd01_Dtl2R.$biz_key7);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key8, Attach_Upd01_Dtl2R.$biz_key8);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key9, Attach_Upd01_Dtl2R.$biz_key9);
				addColumnPathMap(EdiCsv_Chk01_Dtl2R.$biz_key10, Attach_Upd01_Dtl2R.$biz_key10);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected String getRptAttr(String rptAttrSetTyp, Attach_Chk01_DtlR row) {
			if (MAC_RPT_ATTR_SET_TYP.isWG_CD(rptAttrSetTyp)) {
				return row.wg_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isSLS_DPT_CD(rptAttrSetTyp)) {
				return row.sls_dpt_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isPURC_DPT_CD(rptAttrSetTyp)) {
				return row.purc_dpt_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isAR_DPT_CD(rptAttrSetTyp)) {
				return row.ar_dpt_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isBILL_DPT_CD(rptAttrSetTyp)) {
				return row.bill_dpt_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isBSPPL_DPT_CD(rptAttrSetTyp)) {
				return row.bsppl_dpt_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isDLV_CD(rptAttrSetTyp)) {
				return row.dlv_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isDEST_CD1(rptAttrSetTyp)) {
				return row.dest_cd1();
			}
			if (MAC_RPT_ATTR_SET_TYP.isDEST_CD2(rptAttrSetTyp)) {
				return row.dest_cd2();
			}
			if (MAC_RPT_ATTR_SET_TYP.isDEST_CD3(rptAttrSetTyp)) {
				return row.dest_cd3();
			}
			if (MAC_RPT_ATTR_SET_TYP.isCST_CD(rptAttrSetTyp)) {
				return row.cst_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isACST_CD(rptAttrSetTyp)) {
				return row.acst_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isSPPL_CD(rptAttrSetTyp)) {
				return row.sppl_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isAP_CD(rptAttrSetTyp)) {
				return row.asppl_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isBCST_CD(rptAttrSetTyp)) {
				return row.bcst_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isBSPPL_CD(rptAttrSetTyp)) {
				return row.bsppl_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isPSPPL_CD(rptAttrSetTyp)) {
				return row.psppl_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isCNTRY_CD(rptAttrSetTyp)) {
				return row.cntry_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isPTAX_CUR_CD(rptAttrSetTyp)) {
				return row.ptax_cur_cd();
			}
			if (MAC_RPT_ATTR_SET_TYP.isTTERM_CD1(rptAttrSetTyp)) {
				return row.tterm_cd1();
			}
			if (MAC_RPT_ATTR_SET_TYP.isTTERM_CD2(rptAttrSetTyp)) {
				return row.tterm_cd2();
			}
			if (MAC_RPT_ATTR_SET_TYP.isTTERM_CD3(rptAttrSetTyp)) {
				return row.tterm_cd3();
			}
			if (MAC_RPT_ATTR_SET_TYP.isWRK_NO(rptAttrSetTyp)) {
				return row.wrk_no();
			}
			if (MAC_RPT_ATTR_SET_TYP.isEDI_SUB_CHAR1(rptAttrSetTyp)) {
				return row.edi_sub_char1();
			}
			if (MAC_RPT_ATTR_SET_TYP.isEDI_SUB_CHAR2(rptAttrSetTyp)) {
				return row.edi_sub_char2();
			}
			if (MAC_RPT_ATTR_SET_TYP.isEDI_SUB_CHAR3(rptAttrSetTyp)) {
				return row.edi_sub_char3();
			}
			if (MAC_RPT_ATTR_SET_TYP.isEDI_SUB_CHAR4(rptAttrSetTyp)) {
				return row.edi_sub_char4();
			}
			if (MAC_RPT_ATTR_SET_TYP.isEDI_SUB_CHAR5(rptAttrSetTyp)) {
				return row.edi_sub_char5();
			}
			return null;
		}
	}
	/**
	 * Attach_Del01オペレーション.<p>
	 *
	 * 添付ファイル情報を削除する<br>
	 */
	public class Attach_Del01 extends MBBCL_AttachService_MC_A.Attach_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			cache();

			// メッセージ退避
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();

			callThisChk02();
			throwUpdErr();
			upd(getStrgTgtList(up0()));

			// 退避したメッセージを戻す
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}

		protected void cache() {
			createStrgTgtReportCache();
		}

		protected void callThisChk02() {
			MBBCL_AttachService.Attach_Chk02 ope = MBBCL_AttachService.crtAttach_Chk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Attach_Chk02_DtlR> l) {
			delAttachment(l);
		}

		protected void delAttachment(MCList<Attach_Chk02_DtlR> l) {
			delAttachmentByBizKey(l);
		}
		protected void delAttachmentByBizKey(MCList<Attach_Chk02_DtlR> l) {
			if (l.isEmpty()) {
				return ;
			}
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(MBT_ATTACHMENT_R.$data_crud_typ, t.data_crud_typ,
					value(MAC_DATA_CRUD_TYP.DEL.value()));
			bldr.setWhere(t.biz_typ.eq(bindEx("biz_typ"))
					.cutoff$and(t.report_id.eq(bindEx("report_id")))
					.and(t.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value()))));
			for (int i = 1; i <= MAC_BIZ_TYP.key_num(l.get(0).biz_typ())
					.intValue(); i++) {
				String colNm = "biz_key" + i;
				MCStringPermColumn biz_keyN = (MCStringPermColumn) t.getColumn$(colNm);
				bldr.addWhereWithAnd(biz_keyN.eq(bindEx(colNm)));
			}
			dbUpdate("MBBCL5020_MBT_ATTACHMENT_U04", l, bldr);
		}

		protected MCList<Attach_Chk02_DtlR> getStrgTgtList(MCList<Attach_Chk02_DtlR> l) {
			MCList<Attach_Chk02_DtlR> newL = l.createInstance();
			for (Attach_Chk02_DtlR r : l) {
				if (!isStrgTgt(r.report_id())) {
					continue;
				}
				newL.add(r);
			}
			return newL;
		}
	}
	/**
	 * Attach_Copy01オペレーション.<p>
	 *
	 * 添付ファイルを外部システムに保存する<br>
	 */
	public class Attach_Copy01 extends MBBCL_AttachService_MC_A.Attach_Copy01 {

		protected MCList<MBT_ATTACHMENT_R> _attachmentList;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			selectAttachment();
			attachFile();
			updateAttachment();
		}

		protected void selectAttachment() {
			_attachmentList = MCList.create(MBT_ATTACHMENT_R.class);
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setWhere(t.msg_queue_id.eq(value(up0().msg_queue_id()))
					.and(t.file_bin.isNotNull()));
			dbSelect("MBBCL5020_MBT_ATTACHMENT_S02", _attachmentList, bldr);
		}

		protected void attachFile() {
			File tmpDir = createTempDir();
			try {
				attachFileMain(tmpDir);
			}
			finally {
				deleteTempDir(tmpDir);
			}
		}
		protected File createTempDir() {
			Path p;
			File f;
			try {
				p = Files.createTempDirectory("mcf_");
				f = p.toFile();
			}
			catch (IOException e) {
				throw new MCException(e);
			}
			return f;
		}
		protected void deleteTempDir(File tmpDir) {
			try {
				FileUtils.deleteDirectory(tmpDir);
			}
			catch (IOException e) {
				throw new MCException(e);
			}
		}

		protected void attachFileMain(File tmpDir) {
			createRptExtSysCache(_attachmentList);
			setPegNo(_attachmentList);
			MBBCL_InvoiceAgentLinkService.IALink_Copy01 ope = MBBCL_InvoiceAgentLinkService.crtIALink_Copy01();

			for (MBT_ATTACHMENT_R r : _attachmentList) {	
				String extSysCd = getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt());
				Map<String, String> m = getExtParamInfo(extSysCd);
	
				if (isSame(m.get(WEB_API_FLG), "0")) {
					File f = outputTmpFile(tmpDir, r);
					
					String fileNm = getAutoNumberingFileNm(r.file_path(), r.file_nm());
					Path src = Paths.get(f.getAbsolutePath());
					Path dest = Paths.get(r.file_path(), fileNm);
					try {
						createExtFolderFS(r.file_path());
						Files.move(src, dest, REPLACE_EXISTING);
						r.doc_id(null);
						r.file_nm(fileNm);
						r.archive_flg(true);
						r.file_bin(null);
					}
					catch (IOException e) {
						throw new MCException(e);
					}
				}
				else {
					File f = outputTmpFile(tmpDir, r);
					mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR addR = ope.up0().add();
					addR.peg_no(r.getNumberNE("peg_no"));
					addR.ext_sys_cd(extSysCd);
					addR.src_file(f.getAbsolutePath());
					addR.file_path(r.file_path());
					addR.file_name(r.file_nm());
					addR.overwrite_flg(up0().retry_flg());
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();

				MCIndexKey idxkey = _attachmentList.createIndex("peg_no");
				ope.down0().forEach(downR -> {
					MBT_ATTACHMENT_R r = _attachmentList.getFirst(idxkey, downR.peg_no());
					if (!isNull(r)) {
						r.doc_id(downR.id());
						r.file_nm(downR.file_name());
						r.archive_flg(true);
						r.file_bin(null);
					}
				});
			}
		}

		protected File outputTmpFile(File tmpDir, MBT_ATTACHMENT_R r) {
			MCDownloadStream dls = getDBFileStream(r.file_bin().toDBPointer());
			File f = MCDownloadUtil.saveFile(dls, tmpDir, r.file_nm());
			return f;
		}

		protected void createExtFolderFS(String filePath) {
			File dir = new File(filePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
		}

		/**
		 * 指定のファイル名が既に存在するとき、「ファイル名(n).xxx」のようなファイル名を返す。
		 */
		protected String getAutoNumberingFileNm(String path, String fileNm) {
			if (up0().retry_flg()) {
				// リトライ時は上書き保存
				return fileNm;
			}

			File f = new File(path, fileNm);
			int idx = fileNm.lastIndexOf(".");

			String ext = "";
			String base = fileNm;
			if (idx >= 0) {
				ext = fileNm.substring(idx);
				base = fileNm.substring(0, idx);
			}

			int i = 0;
			while (f.exists()) {
				i++;
				f = new File(path, base + "(" + i + ")" + ext);
			}
			return f.getName();
		}
		protected Map<String, Map<String, String>> _map = new HashMap<>();
		protected Map<String, String> getExtParamInfo(String extSysCd) {
			if (_map.containsKey(extSysCd)) {
				return _map.get(extSysCd);
			}
			_map.put(extSysCd, getExtParaMap(extSysCd));
			return _map.get(extSysCd);
		}

		protected void updateAttachment() {
			MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.doc_id, t.file_nm, t.archive_flg, t.file_bin);
			dbUpdateKey("MBBCL5020_MBT_ATTACHMENT_U05", _attachmentList, bldr);
		}

		/**
		 * DBポインタが指すデータのストリームを返します。
		 *
		 * @param pointer DBポインタ
		 * @return ストリーム。引数 pointer が未参照を表す場合 null
		 * @throws MCException [WN000085] 引数 pointer が未参照を表す場合
		 * または対応するデータがない場合
		 */
		protected MCDownloadStream getDBFileStream(long pointer) {
			if (pointer == MCBinary.BLANK_DB) {
				throw new MCException(FCBGC0085, "blank pointer");
			}
			MCDownloadStream dls = dbTran().statement().selectBinary(pointer);
			if (dls == null) {
				throw new MCException(FCBGC0085, String.valueOf(pointer));
			}
			return dls;
		}
	}

	/**
	 * ロック
	 */
	protected MCMessageList lock(MCList<? extends MCRow> bindL, boolean updCntrChkFlg) {
		MCMessageList msgL = new MCMessageList();

		bindL.sort(MBT_ATTACHMENT_R.$biz_typ, MBT_ATTACHMENT_R.$biz_key1,
				MBT_ATTACHMENT_R.$biz_key2, MBT_ATTACHMENT_R.$biz_key3,
				MBT_ATTACHMENT_R.$biz_key4, MBT_ATTACHMENT_R.$biz_key5,
				MBT_ATTACHMENT_R.$biz_key6, MBT_ATTACHMENT_R.$biz_key7,
				MBT_ATTACHMENT_R.$biz_key8, MBT_ATTACHMENT_R.$biz_key9,
				MBT_ATTACHMENT_R.$biz_key10, MBT_ATTACHMENT_R.$report_id);
		MCList<MBT_ATTACHMENT_R> selectL = MCList.create(MBT_ATTACHMENT_R.class);
		MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.addWhereWithAnd(t.biz_typ.eq(bind(MBT_ATTACHMENT_R.$biz_typ)));
		if (!updCntrChkFlg) {
			bldr.addWhereWithAnd(t.report_id.eq(bind(MBT_ATTACHMENT_R.$report_id)));
			bldr.addWhereWithAnd(t.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value())));
		}
		bldr.addWhereWithCutOffAnd(t.biz_key1.eq(bind(MBT_ATTACHMENT_R.$biz_key1)));
		bldr.addWhereWithCutOffAnd(t.biz_key2.eq(bind(MBT_ATTACHMENT_R.$biz_key2)));
		bldr.addWhereWithCutOffAnd(t.biz_key3.eq(bind(MBT_ATTACHMENT_R.$biz_key3)));
		bldr.addWhereWithCutOffAnd(t.biz_key4.eq(bind(MBT_ATTACHMENT_R.$biz_key4)));
		bldr.addWhereWithCutOffAnd(t.biz_key5.eq(bind(MBT_ATTACHMENT_R.$biz_key5)));
		bldr.addWhereWithCutOffAnd(t.biz_key6.eq(bind(MBT_ATTACHMENT_R.$biz_key6)));
		bldr.addWhereWithCutOffAnd(t.biz_key7.eq(bind(MBT_ATTACHMENT_R.$biz_key7)));
		bldr.addWhereWithCutOffAnd(t.biz_key8.eq(bind(MBT_ATTACHMENT_R.$biz_key8)));
		bldr.addWhereWithCutOffAnd(t.biz_key9.eq(bind(MBT_ATTACHMENT_R.$biz_key9)));
		bldr.addWhereWithCutOffAnd(t.biz_key10.eq(bind(MBT_ATTACHMENT_R.$biz_key10)));
		bldr.setOrderByAsc(bldr.getBaseDbc().getKeyColumn$());

		dbSelectForUpdateNoWait("MBBCL5020_MBT_ATTACHMENT_S01", selectL, bldr, bindL);

		if (updCntrChkFlg) {
			MCIndexKey idxkey = selectL.createIndex(MBT_ATTACHMENT_R.$data_no, MBT_ATTACHMENT_R.$edition);
			for (MCRow r : bindL) {
				if (isNullOr(r.getString(MBT_ATTACHMENT_R.$data_no), r.getNumber(MBT_ATTACHMENT_R.$edition))) {
					continue;
				}
				MBT_ATTACHMENT_R selectR = selectL.getFirst(idxkey, r.getString(MBT_ATTACHMENT_R.$data_no), r.getNumber(MBT_ATTACHMENT_R.$edition));
				msgL.addAll(checkUpdCntrNE(r, MBT_ATTACHMENT_R.$upd_cntr, selectR));
			}
		}
		else {
			// 既存のデータと紐づけ
			MCIndexKey idxkey = selectL.createIndex(MBT_ATTACHMENT_R.$biz_typ,
					MBT_ATTACHMENT_R.$biz_key1, MBT_ATTACHMENT_R.$biz_key2,
					MBT_ATTACHMENT_R.$biz_key3, MBT_ATTACHMENT_R.$biz_key4,
					MBT_ATTACHMENT_R.$biz_key5, MBT_ATTACHMENT_R.$biz_key6,
					MBT_ATTACHMENT_R.$biz_key7, MBT_ATTACHMENT_R.$biz_key8,
					MBT_ATTACHMENT_R.$biz_key9, MBT_ATTACHMENT_R.$biz_key10, MBT_ATTACHMENT_R.$report_id);
			for (MCList<? extends MCRow> l : bindL.groupList(MBT_ATTACHMENT_R.$biz_typ, MBT_ATTACHMENT_R.$biz_key1,
					MBT_ATTACHMENT_R.$biz_key2, MBT_ATTACHMENT_R.$biz_key3,
					MBT_ATTACHMENT_R.$biz_key4, MBT_ATTACHMENT_R.$biz_key5,
					MBT_ATTACHMENT_R.$biz_key6, MBT_ATTACHMENT_R.$biz_key7,
					MBT_ATTACHMENT_R.$biz_key8, MBT_ATTACHMENT_R.$biz_key9,
					MBT_ATTACHMENT_R.$biz_key10,
					MBT_ATTACHMENT_R.$report_id)) {
				MCRow tmpR = l.get(0);
				MCList<MBT_ATTACHMENT_R> subL = selectL.subList(idxkey,
						tmpR.getString(MBT_ATTACHMENT_R.$biz_typ),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key1),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key2),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key3),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key4),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key5),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key6),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key7),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key8),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key9),
						tmpR.getString(MBT_ATTACHMENT_R.$biz_key10),
						tmpR.getString(MBT_ATTACHMENT_R.$report_id));
				int i = 0;
				for (MCRow r : l) {
					if (subL.size() <= i) {
						break;
					}
					r.setStringNE(MBT_ATTACHMENT_R.$data_no, subL.get(i).data_no());
					r.setNumberNE(MBT_ATTACHMENT_R.$edition, subL.get(i).edition());
				}
			}
		}

		return msgL;
	}

	/**
	 * キャッシュ（保存対象帳票マスタ）
	 */
	protected MCList<MAM_STRG_TGT_REPORT_R> _strgTgtReportL;
	protected MCIndexKey _strgTgtReportKey;
	protected void createStrgTgtReportCache() {
		// 検索
		MCList<MAM_STRG_TGT_REPORT_R> dbc = MCList.create(MAM_STRG_TGT_REPORT_R.class);
		MAM_STRG_TGT_REPORT_R t = MAM_STRG_TGT_REPORT_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.report_id);
		dbSelect("MBBCL5020_MAM_STRG_TGT_REPORT_S01", dbc, bldr);

		object(CLAZZ)._strgTgtReportL = dbc;
		object(CLAZZ)._strgTgtReportKey = object(CLAZZ)._strgTgtReportL.createIndex(MAM_STRG_TGT_REPORT_R.$report_id);
	}
	protected boolean isStrgTgt(String reportId) {
		MAM_STRG_TGT_REPORT_R r = object(CLAZZ)._strgTgtReportL.getFirst(object(CLAZZ)._strgTgtReportKey, reportId);
		if (isNull(r) || isNull(r.report_id())) {
			return false;
		}
		return true;
	}

	/**
	 * キャッシュ（帳票ファイル名称マスタ）
	 */
	protected FXUCL_MCDbcCache<MAM_REPORT_FILE_NM_R> _cacheRptFileNm;
	protected void createRptFileNmCache(MCList<Attach_Chk01_DtlR> upL) {
		MCList<Attach_Chk01_DtlR> bindL = upL.groupBy(MAM_REPORT_FILE_NM_R.$biz_typ);
		MAM_REPORT_FILE_NM_R t = MAM_REPORT_FILE_NM_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.biz_typ, t.rpt_nm_elm_typ1, t.rpt_nm_elm_typ2,
				t.rpt_nm_elm_typ3, t.rpt_nm_elm_typ4, t.rpt_nm_elm_typ5,
				t.rpt_nm_elm_typ6, t.rpt_nm_elm_typ7, t.rpt_nm_elm_typ8,
				t.rpt_nm_elm_typ9, t.rpt_nm_elm_typ10, t.del_flg);
		object(CLAZZ)._cacheRptFileNm = new FXUCL_MCDbcCache<MAM_REPORT_FILE_NM_R>(bldr,
				bindL, MAM_REPORT_FILE_NM_R.$biz_typ);
	}
	protected MAM_REPORT_FILE_NM_R getCacheRptFileNm(String bizTyp) {
		MAM_REPORT_FILE_NM_R r = object(CLAZZ)._cacheRptFileNm.get(bizTyp);
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		return null;
	}

	/**
	 * キャッシュ（帳票保存先マスタ）
	 */
	protected FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R> _cacheRptPath;
	protected void createRptPathCache(MCList<Attach_Chk01_DtlR> upL) {
		MCList<Attach_Chk01_DtlR> bindL = upL.groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ, MAM_REPORT_STRG_PATH_R.$bp_cd);
		MCList<Attach_Chk01_DtlR> bizL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ);
		MCList<Attach_Chk01_DtlR> bpL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$bp_cd);
		bizL.setStringNE(MAM_REPORT_STRG_PATH_R.$bp_cd, MAC_STR.NULL_VAL.value());
		bindL.addAll(bizL);
		bpL.setStringNE(MAM_REPORT_STRG_PATH_R.$biz_typ, MAC_STR.NULL_VAL.value());
		bindL.addAll(bpL);
		Attach_Chk01_DtlR r = bindL.createRow();
		r.biz_typ(MAC_STR.NULL_VAL.value());
		r.bp_cd(MAC_STR.NULL_VAL.value());
		bindL.add(r);
		MAM_REPORT_STRG_PATH_R t = MAM_REPORT_STRG_PATH_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.biz_typ, t.bp_cd, t.report_strg_path, t.del_flg);
		object(CLAZZ)._cacheRptPath = new FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R>(bldr,
				bindL, MAM_REPORT_STRG_PATH_R.$biz_typ, MAM_REPORT_STRG_PATH_R.$bp_cd);
	}
	protected MAM_REPORT_STRG_PATH_R getCacheRptPath(String bizTyp, String bpCd) {
		MAM_REPORT_STRG_PATH_R r = object(CLAZZ)._cacheRptPath.get(bizTyp, bpCd);
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		r = object(CLAZZ)._cacheRptPath.get(bizTyp, MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		r = object(CLAZZ)._cacheRptPath.get(MAC_STR.NULL_VAL.value(), bpCd);
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		r = object(CLAZZ)._cacheRptPath.get(MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		return null;
	}
	
	/**
	 * キャッシュ（帳票保存制御マスタ）
	 * 業務区分, 取引先, 日付をもとに外部システムCDを検索し、キャッシュとして保持します。
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_REPORT_STRG_CTL_R> _cacheRptCtl;
	public static <R extends MCRow> void createRptExtSysCache(MCList<R> upL) {
		MCList<R> bindL = upL.groupBy(MAM_REPORT_STRG_CTL_R.$biz_typ, MAM_REPORT_STRG_CTL_R.$bp_cd);
		MCList<R> bizL = bindL.groupBy(MAM_REPORT_STRG_CTL_R.$biz_typ);
		MCList<R> bpL = bindL.groupBy(MAM_REPORT_STRG_CTL_R.$bp_cd);
		bizL.setStringNE(MAM_REPORT_STRG_CTL_R.$bp_cd, MAC_STR.NULL_VAL.value());
		bindL.addAll(bizL);
		bpL.setStringNE(MAM_REPORT_STRG_CTL_R.$biz_typ, MAC_STR.NULL_VAL.value());
		bindL.addAll(bpL);
		R r = bindL.createRow();
		r.setStringNE(MAM_REPORT_STRG_CTL_R.$bp_cd, MAC_STR.NULL_VAL.value());
		r.setStringNE(MAM_REPORT_STRG_CTL_R.$biz_typ, MAC_STR.NULL_VAL.value());	
		bindL.add(r);
		MAM_REPORT_STRG_CTL_R t = MAM_REPORT_STRG_CTL_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.biz_typ, t.bp_cd, t.rpt_strg_ext_sys_cd, t.del_flg);
		object(CLAZZ)._cacheRptCtl = new FXUCL_MCDbcCacheStEnd<MAM_REPORT_STRG_CTL_R>(bldr, -1,
				bindL, MAM_REPORT_STRG_CTL_R.$biz_typ, MAM_REPORT_STRG_CTL_R.$bp_cd);
	}
	/**
	 * createRptExtSysCache()メソッドを実行してから使用すること
	 */
	public static String getCacheRptExtSysCd(String bizTyp, String bpCd, MCDate dt) {
		MAM_REPORT_STRG_CTL_R r = object(CLAZZ)._cacheRptCtl.get(dt, bizTyp, bpCd);
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return nullValToNull(r.rpt_strg_ext_sys_cd());
		}
		r = object(CLAZZ)._cacheRptCtl.get(dt, bizTyp, MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return nullValToNull(r.rpt_strg_ext_sys_cd());
		}
		r = object(CLAZZ)._cacheRptCtl.get(dt, MAC_STR.NULL_VAL.value(), bpCd);
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return nullValToNull(r.rpt_strg_ext_sys_cd());
		}
		r = object(CLAZZ)._cacheRptCtl.get(dt, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return nullValToNull(r.rpt_strg_ext_sys_cd());
		}
		return getCo().rpt_strg_ext_sys_cd();
	}

	/**
	 * キャッシュ（帳票管理情報定義マスタ）
	 */
	protected MCList<MAM_REPORT_MNG_DEF_R> _cacheRptMngDef;
	protected MCIndexKey _cacheRptMngDefKey;
	protected void createRptMngDefCache(MCList<Attach_Chk01_DtlR> upL) {
		MCList<Attach_Chk01_DtlR> bindL = upL.groupBy(MAM_REPORT_FILE_NM_R.$biz_typ);
		MCList<MAM_REPORT_MNG_DEF_R> rsltL = MCList.create(MAM_REPORT_MNG_DEF_R.class);
		MAM_REPORT_MNG_DEF_R t = MAM_REPORT_MNG_DEF_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.biz_typ, t.rpt_attr_typ, t.rpt_attr_set_typ);
		bldr.setWhere(t.biz_typ.eq(bind("biz_typ")));
		dbSelect("MBBCL5020_MAM_REPORT_MNG_DEF_S01", rsltL, bldr, bindL);

		// インデックス作成
		object(CLAZZ)._cacheRptMngDef = rsltL;
		object(CLAZZ)._cacheRptMngDefKey = 
				object(CLAZZ)._cacheRptMngDef.createIndex(MAM_REPORT_MNG_DEF_R.$biz_typ, MAM_REPORT_MNG_DEF_R.$rpt_attr_typ);
	}
	protected MAM_REPORT_MNG_DEF_R getCacheRptMngDef(String bizTyp, String rptAttrTyp) {
		return object(CLAZZ)._cacheRptMngDef.getFirst(object(CLAZZ)._cacheRptMngDefKey, bizTyp, rptAttrTyp);
	}

	/**
	 * キャッシュ（最新の業務キー）
	 */
	protected MCList<MBT_ATTACHMENT_R> _cacheMaxRev;
	protected MCIndexKey _cacheMaxRevKey;
	protected String[] _delKeys;
	protected String _revKey;
	protected void createMaxRevCache(MCList<Attach_Chk01_DtlR> upL) {
		if (upL.isEmpty()) {
			return;
		}

		String bizTyp = upL.get(0).biz_typ();
		String[] delKeys = getDelKeys(bizTyp);
		MCList<Attach_Chk01_DtlR> bindL = upL.groupBy(delKeys);
		MCList<MBT_ATTACHMENT_R> rsltL = MCList.create(MBT_ATTACHMENT_R.class);
		MBT_ATTACHMENT_R t = MBT_ATTACHMENT_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		for (String delKey : delKeys) {
			MCStringPermColumn biz_keyN = (MCStringPermColumn) t.getColumn$(delKey);
			bldr.addGroupBy(biz_keyN);
			bldr.addWhereWithAnd(biz_keyN.eq(bind(delKey)));
		}
		String revKey = getRevKey(bizTyp);
		MCStringPermColumn biz_keyN = (MCStringPermColumn) t.getColumn$(revKey);
		if (isDelAllRev(bizTyp)) {
			bldr.addGroupFunc(max(toNumber(biz_keyN)), revKey);
		}
		dbSelect("MBBCL5020_MBT_ATTACHMENT_S03", rsltL, bldr, bindL);

		// 上り電文の削除用の業務キーのデータが検索結果になければ追加、データが検索結果にあり改訂番号が小さければ上書きする
		MCIndexKey rsltKey = rsltL.createIndex(delKeys);
		MCList<MBT_ATTACHMENT_R> allL =  rsltL.createInstance();
		String revCol = getRevKey(bizTyp);

		for (Attach_Chk01_DtlR r : bindL) {
			MBT_ATTACHMENT_R rsltR = rsltL.getFirst(rsltKey, getDelKeyValues(r));
			if (isNull(rsltR)) {
				rsltR = MBT_ATTACHMENT_R.create();
				rsltR.setValuesByName(r, getDelKeys(r.biz_typ()));
			}
			// key_numとdel_key_numが違うときのみ改訂番号をチェックする
			if (!isSame(MAC_BIZ_TYP.key_num(bizTyp), MAC_BIZ_TYP.del_key_num(bizTyp))) {
				for (Attach_Chk01_DtlR upR : upL.subList(getDelKeys(r.biz_typ()), getDelKeyValues(r))) {
					if (isNull(rsltR.getStringNE(revCol))
							|| MCNumber.valueOf(rsltR.getStringNE(revCol))
									.lt(MCNumber.valueOf(upR.getStringNE(revCol)))) {
						rsltR.setString(revCol, upR.getStringNE(revCol));
					}
				}
			}
			allL.add(rsltR);
		}

		// インデックス作成
		object(CLAZZ)._cacheMaxRev = allL;
		object(CLAZZ)._cacheMaxRevKey = 
				object(CLAZZ)._cacheMaxRev.createIndex(delKeys);
	}
	protected boolean isDelAllRev(String bizTyp) {
		if (!isSame(MAC_BIZ_TYP.key_num(bizTyp), MAC_BIZ_TYP.del_key_num(bizTyp))) {
			return true;
		}
		return false;
	}
	/**
	 * 引数には削除用の業務キー（改訂番号を除いた業務キー）の値の配列を渡す
	 */
	protected MBT_ATTACHMENT_R getCacheMaxRev(String... delKeys) {
		return object(CLAZZ)._cacheMaxRev.getFirst(object(CLAZZ)._cacheMaxRevKey, delKeys);
	}
	/**
	 * 削除用の業務キー（改訂番号を除いた業務キー）のカラム（biz_key(N)）の配列を取得する
	 */
	protected String[] getDelKeys(String bizTyp) {
		if (object(CLAZZ)._delKeys == null) {
			List<String> delKeys = new ArrayList<String>();
			for (int i = 1; i <= MAC_BIZ_TYP.del_key_num(bizTyp).intValue(); i++) {
				delKeys.add("biz_key" + i);
			}
			object(CLAZZ)._delKeys = delKeys.toArray(new String[0]);
		}
		return object(CLAZZ)._delKeys;
	}
	/**
	 * 改訂番号の業務キーのカラム（biz_key(N)）を取得する
	 */
	protected String getRevKey(String bizTyp) {
		if (object(CLAZZ)._revKey == null) {
			object(CLAZZ)._revKey = "biz_key" + MAC_BIZ_TYP.key_num(bizTyp).intValue();
		}
		return object(CLAZZ)._revKey;
	}
	protected String[] getDelKeyValues(Attach_Chk01_DtlR row) {
		List<String> delKeyValues = new ArrayList<String>();
		for (String delKey : getDelKeys(row.biz_typ())) {
			delKeyValues.add(row.getStringNE(delKey));
		}
		return delKeyValues.toArray(new String[0]);
	}

	/** 
	 * 帳票ＩＤに対する名称を返します。
	 * */
	public static String getReportNm(String reportId) {
		if (null == reportId) {
			return null;
		}
		mcframe.serverCore.report.MCServerReportDefine rd = new
				mcframe.serverCore.report.MCServerReportDefine();
		String[] id = rd.getId(reportId);
		if (id != null) {
			return rd.getReportName(id[0], reportId);
		}
		return null;
	}

	/** 
	 * 帳票ファイル名称マスタから作成した帳票ファイル名称を返します。
	 * */
	public static String getRptFileNm(MCRow r, MAM_REPORT_FILE_NM_R nmR) {
		StringBuilder sb = new StringBuilder();
		String seq = null;
		for (int i=1; i<=10; i++) {
			String typ = nmR.getString("rpt_nm_elm_typ" + i);
			if (isNull(typ)) {
				break;
			}
			if (i > 1) {
				sb.append("_");
			}
			if (MAC_RPT_NM_ELM_TYP.isTRD_DT(typ)) {
				MCDate dt = r.getDate("dt");
				sb.append(isNull(dt) ? "" : dt.toString("yyyyMMdd"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isTRD_AMT(typ)) {
				sb.append(r.getNumber("amt"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isTRD_CUR_CD(typ)) {
				sb.append(r.getString("cur_cd"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isBP_CD(typ)) {
				sb.append(r.getString("bp_cd"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isBIZ_KEY1(typ)) {
				sb.append(r.getString("biz_key1"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isBIZ_KEY2(typ)) {
				sb.append(r.getString("biz_key2"));
			}
			else if (MAC_RPT_NM_ELM_TYP.isSEQ(typ)) {
				if (isNull(seq)) {
					seq = getSequence(MAC_NUM_SYS_TYP.FILENM_SEQ.value()).toString();
				}
				sb.append(seq);
			}
		}
		if (sb.length() == 0) {
			return null;
		}
		String bizTyp = r.getStringNE("biz_typ");
		if (MAC_BIZ_TYP.isSLO_EDI(bizTyp) || MAC_BIZ_TYP.isARR_EDI(bizTyp)
				|| MAC_BIZ_TYP.isACCPT_SLS_EDI(bizTyp)
				|| MAC_BIZ_TYP.isBILL_RCPT_EDI(bizTyp) || MAC_BIZ_TYP.isPO_EDI(bizTyp)
				|| MAC_BIZ_TYP.isSHIP_ACT_EDI(bizTyp)
				|| MAC_BIZ_TYP.isSHIP_ACT_IV_EDI(bizTyp)
				|| MAC_BIZ_TYP.isPURC_ACCPT_EDI(bizTyp) || MAC_BIZ_TYP.isBILL_EDI(bizTyp)
				|| MAC_BIZ_TYP.isDLV_SLIP_SLS_EDI(bizTyp)) {
			sb.append(".csv");
		}
		else {
			sb.append(".pdf");
		}
		return sb.toString();
	}

	/** 
	 * プレースホルダーを置換します。
	 * */
	public static String convPlaceHolder(String path, MCRow r) {
		String tmp = path;
		if (!isNull(tmp)) {
			tmp = tmp.replace(DIR_MCF_HOME, MCSys.env.MCF_HOME());
			tmp = tmp.replace(DIR_CO_CD, MCSys.user.coCD());
			String str = r.getStringNE("bp_cd");
			tmp = tmp.replace(DIR_BP_CD, isNull(str) ? "null" : str);
			MCDate dt = r.getDate("dt");
			tmp = tmp.replace(DIR_TRD_YM, isNull(dt) ? "" : dt.toString("yyyyMM"));
			str = r.getStringNE("biz_typ");
			tmp = tmp.replace(DIR_BIZ_TYP, isNull(str) ? "null" : str);
		}
		return tmp;
	}

	/** 
	 * 外部システム連携用パラメータを取得する
	 * <table border = 1>
	 * <tr>
	 * <th>マップキー</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>ext_sys_cd</td>
	 * <td>外部システムＣＤ</td>
	 * </tr>
	 * <tr>
	 * <td>web_url</td>
	 * <td>Web API にアクセスするためのURL</td>
	 * </tr>
	 * <tr>
	 * <td>web_api_flg</td>
	 * <td>"1" or "0"</td>
	 * </tr>
	 * </table>
	 * */
	public static Map<String, String> getExtParaMap(String extSysCd) {
		Map<String, String> m = new HashMap<>();
		m.put(EXT_SYS_CD, extSysCd);

		MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
		MAM_IF_PROTOCOL_R t2 = MAM_IF_PROTOCOL_R.create("T2");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.web_api_flg, t2.var_str);
		bldr.addLeftOuterJoin(t2, t2.ext_sys_cd.eq(t.ext_sys_cd).and(t2.if_ctl_typ.eq(value(MAC_IF_CTL_TYP.WEB_URL.value()))));
		bldr.setWhere(t.ext_sys_cd.eq(value(extSysCd)));
		dbSelect("MBBCL0030_MAM_EXT_SYS_S01", t, bldr);
		m.put(WEB_URL, t.getStringNE("var_str"));
		m.put(WEB_API_FLG, t.web_api_flg() ? "1" : "0");

		return m;
	}

	//FMCB CUSTOM END
}