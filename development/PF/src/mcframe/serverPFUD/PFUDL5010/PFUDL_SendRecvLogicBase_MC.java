package mcframe.serverPFUD.PFUDL5010;

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
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mcframe.serverCore.mcjdbc.MCCursor;

import mcframe.commonCore.report.MCCSVFile;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.sys.MCExec;
import mcframe.commonCore.sys.MCFactory;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import mcframe.serverPFUD.PFUDL0040.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.serverPFBZ.PFBZL9060.PFBZL_CSVFmt;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileFmt;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo;
import mcframe.serverPFBZ.PFBZL9080.PFBZL_FixLenFileWriter;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverCore.requester.cooperate.*;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "PFUDL_SendRecvLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUDL_SendRecvLogicBase_MC extends PFUDL_SendRecvLogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * ConvBase01オペレーション.<p>
	 *
	 */
	public class ConvBase01 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase01 {

		/**
		 * 送受信IFのDBCのインスタンス
		 * 	
		 */
		protected PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> _ifDBC = null;

		/**
		 * 送受信コード変換時の取引先キー項目名
		 */
		protected String _cnvBpCol = null;

		public String getCnvBpCol() {
			return _cnvBpCol;
		}

		/**
		 * 送受信コード変換時の外部システムＣＤ
		 */
		protected String _extSysCd = null;

		/**
		 * 送受信コード変換時のＩＦ処理区分
		 */
		protected String _ifProcTyp = null;

		@Override
		protected void call() {

			setCnvBpCol();
			crtIfDBC();
			if (_ifDBC == null || up0().isEmpty()) {
				return;
			}

			boolean isErr = false;
			try {
				setCdCnvKey();
				insSdrvIfWk();
				setCnvIfCols();
				lockIfL();
				setBpList(getCnvBpCol());
				setCoCd(up0().get(0).co_cd());
				isErr = execCnv();
			}
			catch (Exception ex) {
				handleEx(ex, up0());
				isErr = true;
			}
			finally {
				setDown0(isErr);
				pushAlertMsg();
			}
		}

		/**
		 * 送受信IFのDBCのインスタンスを生成します
		 * 
		 */
		protected void crtIfDBC() {
			// サブクラスで実装
		}

		/**
		 * 変換対象の項目を設定します
		 * 
		 */
		protected void setCnvIfCols() {
			// サブクラスで実装
		}

		/**
		 * コード変換できない場合などにプッシュ通知します。
		 */
		protected void pushAlertMsg() {
			// サブクラスで実装
		}

		/**
		 * 送受信処理のコード変換において、変換マスタのキーとして取引先を用いる
		 * 場合、その変換処理のキーとして利用する項目名指定します
		 * （指定しない場合は変換時のキーとして取引先ＣＤはNULL固定で取得）
		 */
		protected void setCnvBpCol() {
			// サブクラスで実装
		}

		/**
		 * 変換対象の項目を変換します<br>
		 * また、変換した項目をIF送信用テーブルに書き戻します
		 * 
		 * @param cnvBpValue	変換後の取引先ＣＤ
		 */
		protected void execCnvIfCols(String cnvBpValue) {
			_ifDBC.execCnvIfCols(cnvBpValue);
		}

		/**
		 * DBCを利用してIF対象データをロックします
		 * 
		 */
		protected void lockIfL() {
			// addSelectIfCnvColumns()で作成される外部結合が含まれるSQLでは
			// ロックができないので、外部結合なしの状態で先にロックだけする
			_ifDBC.initSelect();
			_ifDBC.addWhereIfConv();
			_ifDBC.setOrderBy();
			dbSelectForUpdateNoFetch(createSqlId(LOGIC_ID, _ifDBC.getBuilder().getBaseDbc(), "S01"), _ifDBC.getBuilder());
		}

		/*
		 * 処理対象のＩＦ処理区分と外部システムＣＤのキーを保持します。
		 */
		protected void setCdCnvKey() {
			if (up0().size() > 0) {
				_extSysCd = up0().get(0).ext_sys_cd();
				_ifProcTyp = up0().get(0).if_proc_typ();
			}
		}

		/*
		 * 変換対象リストに存在する取引先項目のキー要素をリスト化します
		 * 
		 * 取引先キーが指定されていない場合は処理をスキップします
		 * 
		 */
		protected void setBpList(String cnvBpCol) {
			if (isNull(cnvBpCol)) {
				return;
			}

			_ifDBC.setCnvBpList(cnvBpCol, _extSysCd);
		}
		
		protected void setCoCd(String coCd) {
			if (isNull(coCd)) {
				return;
			}

			_ifDBC.setCoCd(coCd);
		}

		/**
		 * コード変換処理実行
		 * 
		 * コード変換において取引先がコード変換マスタのキーとなる場合は、
		 * データにと登録された取引先ごとに変換処理を実行する
		 */
		protected boolean execCnv() {
			boolean isErr = false;

			//取引先指定なしの変換
			if (_ifDBC.getCnvBpMap() == null || _ifDBC.getCnvBpMap().isEmpty()) {
				isErr = execCnvSub(null, null);
				return isErr;
			}

			//取引先指定ありの変換
			for (java.util.Map.Entry<String, String> cnvBpEntry : _ifDBC.getCnvBpMap().entrySet()) {
				//一度エラーとなったら、フラグはそのままエラーとする
				if (execCnvSub(cnvBpEntry.getKey(), cnvBpEntry.getValue())) {
					isErr = true;
				}
			}
			//変換済みのデータを一括で後続に引き渡す
			shareL = _ifDBC.getAllIfL();
			return isErr;
		}

		/**
		 * 取引先単位に変換処理を実行する
		 * 
		 * @param cnvBpKey		変換前の取引先ＣＤ
		 * @param cnvBpValue	変換後の取引先ＣＤ
		 * @return
		 */
		protected boolean execCnvSub(String cnvBpKey, String cnvBpValue) {
			setSelSQL(cnvBpKey, cnvBpValue);
			setUpdSQL();
			execCnvIfCols(cnvBpValue);

			return !_ifDBC.getExIfL().isEmpty();
		}

		/**
		 * IF対象データを取得するSQLを設定します
		 * 
		 */
		protected void setSelSQL(String cnvBpKey, String cnvBpValue) {
			// Listを引数にしたSQLは実行後にWhere句がクリアされるので、再設定が必要
			_ifDBC.initSelect();
			_ifDBC.addSelectIfCtrlColumns();
			_ifDBC.addSelectIfCnvColumns(cnvBpKey, cnvBpValue, getCnvBpCol());
			_ifDBC.addWhereIfConv();
			MCQueryApiBuilder builder = _ifDBC.getBuilder();
			addSelSQL(builder);
			builder.setOrderBy();
		}

		/**
		 * IF対象データを更新するSQLを設定します
		 * 
		 */
		protected void setUpdSQL() {
			_ifDBC.addSetIfColumns();
			addUpdSQL(_ifDBC.getBuilder());
		}

		/**
		 * IF対象データを取得するときのSQLをカスタマイズします<br>
		 * <br>
		 * ここでは既定のSQLが出来上がっているので、setSelectなど<br>
		 * SQLを再設定するような実装はできません
		 * 
		 * @param builder	クエリAPIビルダー
		 */
		protected void addSelSQL(MCQueryApiBuilder builder) {
			// サブクラスで実装
		}

		/**
		 * IF対象データを更新するときのSQLをカスタマイズします<br>
		 * <br>
		 * ここでは既定のSQLが出来上がっているので、setSetなど<br>
		 * SQLを再設定するような実装はできません
		 * 
		 * @param builder	クエリAPIビルダー
		 */
		protected void addUpdSQL(MCQueryApiBuilder builder) {
			// サブクラスで実装
		}

		/**
		 * 下り電文に変換エラーの情報を設定します
		 * 
		 */
		protected void setDown0(boolean isErr) {
			MCIndexKey idx = _ifDBC.getExIfL().createIndex(_$ifKey);
			MCIndexKey idxNotConvIf = _ifDBC.getIgnoredConvIfL().createIndex(_$ifKey);
			boolean existsNotConvIf = !(_ifDBC.getIgnoredConvIfL().isEmpty());
			down0().setAll(up0());
			for (ConvDtlR dR : down0()) {
				if (existsNotConvIf) {
					if (!isNull(_ifDBC.getIgnoredConvIfL().getFirst(idxNotConvIf, dR.toArray(_$ifKey)))) {
						dR.sdrv_sts_typ(getSendStsTypOfNotYet());
						continue;
					}
				}
				if (isErr) {
					if (!isNull(_ifDBC.getExIfL().getFirst(idx, dR.toArray(_$ifKey)))) {
						if (isSendIf(dR.if_proc_typ())) {
							dR.sdrv_sts_typ(getSendStsTypOfError());
						}
						else {
							dR.sdrv_sts_typ(getRecvStsTypOfError());
						}
					}
					else {
						// 変換対象なし
						if (isSendIf(dR.if_proc_typ())) {
							dR.sdrv_sts_typ(getSendStsTypOfError());
						}
						else {
							dR.sdrv_sts_typ(null); // 受信はエラー扱いしない
						}
					}
				}
				else {
					if (isSendIf(dR.if_proc_typ())) {
						dR.sdrv_sts_typ(getSendStsTypOfSuccess());
					}
					else {
						dR.sdrv_sts_typ(getRecvStsTypOfSuccess());
					}
				}
			}
		}

		/**
		 * 正常時の送信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getSendStsTypOfSuccess() {
			return MAC_SDRV_STS_TYP.SEND_CONV_OK.value();
		}

		/**
		 * エラー時の送信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getSendStsTypOfError() {
			return MAC_SDRV_STS_TYP.SEND_CONV_ERR.value();
		}
		
		protected String getSendStsTypOfNotYet() {
			return MAC_SDRV_STS_TYP.NOTYET.value();
		}

		/**
		 * 正常時の受信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getRecvStsTypOfSuccess() {
			return MAC_SDRV_STS_TYP.RECV_CONV_OK.value();
		}

		/**
		 * エラー時の受信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getRecvStsTypOfError() {
			return MAC_SDRV_STS_TYP.RECV_CONV_ERR.value();
		}

		/**
		 * 送受信ワークに対象データを書き込みます
		 * 
		 */
		protected void insSdrvIfWk() {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_ConvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, ConvDtlR> mapper = createUpdWk01_DtlR_ConvDtlR();
			for (ConvDtlR dtlR : up0()) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().createRow();
				copy(row, dtlR, mapper);
				ope.up0().add(row);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		/**
		 * ConvDtlR→Upd01_DtlRへ設定
		 * 
		 * @return
		 */
		protected UpdWk01_DtlR_ConvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, ConvDtlR> createUpdWk01_DtlR_ConvDtlR() {
			return new UpdWk01_DtlR_ConvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, ConvDtlR>();
		}

		public class UpdWk01_DtlR_ConvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends ConvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.data_no(src.data_no());
			}
		}
	}

	/**
	 * ConvBase02オペレーション.<p>
	 *
	 */
	public class ConvBase02 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase02 {

		/**
		 * ファイル出力用のレポートセットのインスタンス
		 * 
		 */
		protected PFBZL_FileOutput.IfSendReportSet<? extends MCRow, ? extends MCDBContainer> _IfRptSet = null;

		@Override
		protected void call() {

			crtRptSet();

			preWrite();
			if (_IfRptSet == null || up0().isEmpty()) {
				return;
			}
			for (MCList<SdrvDtlR> ifL : convSendIfL(up0())) {
				boolean isErr = false;
				try {
					insSdrvIfWk(ifL);
					String extSysTyp = ifAdptrMgr().getExtSysTyp(ifL.get(0).sdrvIf());
					if (MAC_EXT_SYS_TYP.isEDI_MCF(extSysTyp)) {
						// EDI(MCF)の場合はファイル出力処理をしない
						writeMCF(ifL);
					}
					else {
						write();
					}
				}
				catch (MCException ex) {
					handleEx(ex, ifL);
					isErr = true;
				}
				finally {
					setDown0(ifL, isErr);
				}
			}
		}

		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		protected void crtRptSet() {
			// サブクラスで実装
		}

		/**
		 * ＩＦデータの実行状況区分をスキップに更新する処理などを実行します
		 */
		protected void preWrite() {
			// サブクラスで実装
		}

		/**
		 * 送信IFのレポートセットのインスタンスを生成し返す
		 * @return　IfSendReportSet
		 */
		public PFBZL_FileOutput.IfSendReportSet<? extends MCRow, ? extends MCDBContainer> getIfSendReportSet() {
			crtRptSet();
			return _IfRptSet;
		}

		/**
		 * 送信処理を実行します<br>
		 * 
		 */
		protected void write() {
			_IfRptSet.write();
		}

		/**
		 * 送信先とデータ共有をします<br>
		 */
		protected void writeMCF(MCList<SdrvDtlR> sdrvDtlL) {
			// 帳票コンテナにデータを保持する
			_IfRptSet.writeMCF();

			if (shareRptSetL == null) {
				shareRptSetL = new ArrayList<MCReportSet>();
			}
			for (MCReportSet rs : _IfRptSet.getRptSetL()) {
				shareRptSetL.add(rs);
			}
			callEdiMcfOperation(sdrvDtlL);
		}

		@SuppressWarnings("unchecked")  //MCList(MCRow)のキャスト
		protected void callEdiMcfOperation(MCList<SdrvDtlR> sdrvDtlL) {
			PFT_SDRV_IF_R sdrvIfR = sdrvDtlL.get(0).sdrvIf();
			String ifProcTyp = MAC_IF_PROC_TYP.co_recv_if_proc_typ(sdrvIfR.if_proc_typ());

			// 連携先の会社ＣＤを設定する
			sdrvDtlL.addStringColumn("coCd");
			setIfCoCd(sdrvDtlL);

			MCList<MCRow> rptSetList = MCList.create(MCRow.class);
			for (MCReportSet r : shareRptSetL) {
				rptSetList.addAll(r.getAll());
			}

			MCIndexKey rptSetKey = rptSetList.createIndex("data_no");
			for (MCList<SdrvDtlR> grpL : sdrvDtlL.groupList("coCd")) {
				MCOperation ope = createRecvOperation(MAC_IF_PROC_TYP.co_recv_ope(sdrvIfR.if_proc_typ()), MCOperation.class);
				MCList<MCRow> up0 = (MCList<MCRow>) ope.up(0);
				MCRow up0R = up0.add();
				up0R.setValue("if_proc_typ", ifProcTyp);
				MCList<MCRow> up1 = (MCList<MCRow>) ope.up(1);
				for (SdrvDtlR r : grpL) {
					up1.addAll(rptSetList.subList(rptSetKey, r.data_no()));
				}

				MCMessage msg = null;
				try {
					MCMessageList msgList = MCCooperateInvokeManager.exec(grpL.get(0).getString("coCd"), ope);
					// 受信側で送受信ＩＦ、ＩＦテーブルに登録できなかった場合は、送信側にメッセージを連携する
					MCList<MCRow> down0 = (MCList<MCRow>) ope.down(0);
					MCRow downR = down0.getFirst("if_ins_flg", true);
					if (isNull(downR)) {
						MCMessagePool.addAll(msgList);
						msg = new MCMessage(PFUCL0008, MAC_IF_PROC_TYP.co_recv_ope(sdrvIfR.if_proc_typ()));
					}
				}
				catch (Exception ex) {
					// 受信側で送受信ＩＦ、ＩＦテーブルに登録できた場合は、送信側ではエラーとしない
					MCList<MCRow> down0 = (MCList<MCRow>) ope.down(0);
					MCRow downR = down0.getFirst("if_ins_flg", true);
					if (isNull(downR)) {
						msg = new MCMessage(PFUCL0008, MAC_IF_PROC_TYP.co_recv_ope(sdrvIfR.if_proc_typ()));
						handleEx(ex, up0R);
					}
				}

				if (msg != null) {
					throw new MCException(msg);
				}
			}
		}

		protected <T extends IfMCOperation> T createRecvOperation(String ope, Class<T> clazz) {
			String[] arr = parseOperation(ope);
			return createOperation(arr[0], // moduleId
					arr[1], // logicId
					arr[2], // operationId
					clazz);
		}

		/**
		 * オペレーション文字列からモジュールID、ロジックID、オペレーションIDを取得します
		 * 
		 * @param operation	オペレーション文字列
		 * @return	[0]：モジュールID
		 * 			[1]：ロジックID
		 * 			[2]：オペレーションID
		 */
		protected String[] parseOperation(String operation) {
			if (isNull(operation)) {
				throw new MCAppException(PFUCL0004);
			}
			String[] arr = operation.split("\\."), ret = new String[3];
			if (arr.length == 3) {
				System.arraycopy(arr, 0, ret, 0, arr.length);
			}
			return ret;
		}

		protected void setIfCoCd(MCList<SdrvDtlR> sdrvIfL) {
			PFT_SDRV_IF_R sdrvIfR = sdrvIfL.get(0).sdrvIf();

			MCList<MCRow> selectL = MCList.create(MCRow.class);
			String ifTblNm = MAC_IF_PROC_TYP.upd_if_tbl(sdrvIfR.if_proc_typ());
			String ifCoCdCol = MAC_IF_PROC_TYP.co_recv_co_col(sdrvIfR.if_proc_typ());
			if (isNull(ifTblNm)) return;
			Class<?> clazz = createDbcClass(ifTblNm);
			MCDBContainer dbc = (MCDBContainer)MCFactory.invokeStatic(clazz, "create", new Class[]{String.class}, new Object[]{"T"});
			PFW_SDRV_IF_R pfw = PFW_SDRV_IF_R.create("PFW");
			MCNumberPermColumn data_no = (MCNumberPermColumn)dbc.getColumn$("data_no");

			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.addSelect(data_no, dbc.getColumn$(ifCoCdCol));
			builder.addInnerJoin(pfw,
					data_no.eq(pfw.data_no)
					.and(pfw.if_proc_typ.eq(value(sdrvIfR.if_proc_typ())))
					.and(pfw.ext_sys_cd.eq(value(sdrvIfR.ext_sys_cd()))));
			
			dbSelect(createSqlId(LOGIC_ID, dbc, "S02"), selectL, builder);
			
			MCIndexKey key = selectL.createIndex("data_no");
			for (SdrvDtlR r : sdrvIfL) {
				MCRow selectR = selectL.getFirst(key, r.data_no());
				if (!isNull(selectR)) {
					r.setString("coCd", selectR.getString(ifCoCdCol));
				}
			}
		}

		/**
		 * 下り電文を設定します
		 * 
		 */
		protected void setDown0(MCList<SdrvDtlR> ifL, boolean isErr) {
			if (!isErr) {
				HashMap<MCNumber, File> retMap = _IfRptSet.getRetInf();
				for (SdrvDtlR dtlR : ifL) {
					if (retMap.containsKey(dtlR.data_no())) {
						File file = retMap.get(dtlR.data_no());
						if (file != null) {
							dtlR.file_path(file.getParent());
							dtlR.file_nm(file.getName());
							dtlR.sdrv_sts_typ(getSendStsTypOfSuccess());
						}
						else {
							dtlR.sdrv_sts_typ(getSendStsTypOfError());
						}
					}
					else {
						if (MAC_EXT_SYS_TYP.isEDI_MCF(ifAdptrMgr().getExtSysTyp(ifL.get(0).sdrvIf()))) {
							dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_OK.value());
						}
						else {
							dtlR.sdrv_sts_typ(getSendStsTypOfError());
						}
					}
				}
			}
			else {
				ifL.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, getSendStsTypOfError());
			}
			down0().addAll(ifL);
		}

		/**
		 * 正常時の送信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getSendStsTypOfSuccess() {
			return MAC_SDRV_STS_TYP.SEND_CONV_OK.value();
		}

		/**
		 * エラー時の送信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getSendStsTypOfError() {
			return MAC_SDRV_STS_TYP.SEND_CONV_ERR.value();
		}

		/**
		 * 処理用に送信データを加工します
		 * 
		 * @param dtlR
		 * @param ifL
		 * @return
		 */
		protected ArrayList<MCList<SdrvDtlR>> convSendIfL(MCList<SdrvDtlR> up) {

			SdrvDtlR dtlR = up.get(0);

			ArrayList<MCList<SdrvDtlR>> arr = new ArrayList<>();

			ifPrtclMgr().set(dtlR);
			if (isSame(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, dtlR.if_proc_typ()), _send_file_grp_1)) {
				String[] keys = {
						SdrvDtlR.$if_proc_typ, SdrvDtlR.$ext_sys_cd
				};
				MCIndexKey idx = up0().createIndex(keys);
				for (SdrvDtlR grpR : up0().groupBy(keys)) {
					arr.add(up0().subList(idx, grpR.if_proc_typ(), grpR.ext_sys_cd()));
				}
			}
			else {
				arr.add(up0()); // ファイル出力時に振り分ける
			}

			return arr;
		}

		/**
		 * 送受信ワークに対象データを書き込みます
		 * 
		 * @param dtlL
		 */
		protected void insSdrvIfWk(MCList<SdrvDtlR> dtlL) {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> mapper = createUpdWk01_DtlR_SdrvDtlR();
			for (SdrvDtlR dtlR : dtlL) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().createRow();
				copy(row, dtlR, mapper);
				ope.up0().add(row);
			}
			ope.exec();
		}

		/**
		 * SdrvDtlR→UpdWk01_DtlRへ設定
		 * 
		 * @return
		 */
		protected UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> createUpdWk01_DtlR_SdrvDtlR() {
			return new UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR>();
		}

		public class UpdWk01_DtlR_SdrvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.if_proc_typ(src.if_proc_typ());
				dest.data_no(src.data_no());
			}
		}

		public void initCache(MCList<? extends MCDBContainer> ifL) {
			
		}
	}

	/**
	 * ConvBase03オペレーション.<p>
	 *
	 */
	public class ConvBase03 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase03 {

		/**
		 * ファイル入力用のレポートセットのインスタンス
		 * 
		 */
		protected PFBZL_FileInput.IfRecvReportSet<? extends MCDBContainer, ? extends MCRow> _IfRptSet = null;

		/**
		 * ファイル読み込みを実行します
		 */
		@Override
		protected void call() {

			crtRptSet();
			if (_IfRptSet == null || up0().isEmpty()) {

				return;
			}

			for (SdrvDtlR dtlR : up0()) {
				boolean isErr = false;
				String svp = "svp_" + dtlR.data_no().toString();
				try {
					dbTran().setSavepoint(svp);

					init(dtlR);
					preRecv(dtlR);
					recv();

					isErr = !_IfRptSet.getErrList().isEmpty();
					if (!isErr) {
						postRecv(dtlR);
					}
				}
				catch (MCException ex) {
					handleEx(ex, dtlR);
					isErr = true;
				}
				finally {
					if (isErr) {
						dbTran().rollback(svp);
						try {
							postRecvFail(dtlR);
						}
						catch (MCException ex) {
							handleEx(ex, dtlR);
						}
					}
					setDown0(dtlR, isErr);
					MCMessagePool.addAll(_IfRptSet.getErrList());
				}
			}
		}

		/**
		 * 受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		protected void crtRptSet() {
			// サブクラスで実装
		}

		/**
		 * 初期処理をします
		 * 
		 * @param dtlR
		 */
		protected void init(SdrvDtlR dtlR) {

			_IfRptSet.init(dtlR.sdrvIf(), dtlR.ifFile());
		}

		protected void preRecv(SdrvDtlR dtlR) {
		}

		protected void postRecv(SdrvDtlR dtlR) {
		}

		protected void postRecvFail(SdrvDtlR dtlR) {
		}

		/**
		 * 受信処理を実行します<br>
		 * 
		 */
		protected void recv() {
			_IfRptSet.read();
		}

		/**
		 * 下り電文に受信レコード情報を設定します
		 * 
		 * @param dtlR
		 * @param isErr
		 */
		protected void setDown0(SdrvDtlR dtlR, boolean isErr) {
			String sts = getRecvStsTypOfError(dtlR);
			if (!isErr) {
				sts = getRecvStsTypOfSuccess(dtlR);
			}
			dtlR.sdrv_sts_typ(sts);
			down0().add(dtlR);
		}

		/**
		 * 正常時の受信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getRecvStsTypOfSuccess(SdrvDtlR dtlR) {
			//定数定義：ＩＦ処理区分にコード変換の指定が無い場合は、コード変換処理が存在しないと判定する		
			return !isNull(MAC_IF_PROC_TYP.conv_ope(dtlR.if_proc_typ())) ? MAC_SDRV_STS_TYP.RECV_OK.value() : MAC_SDRV_STS_TYP.RECV_CONV_OK.value();
		}

		/**
		 * エラー時の受信状況区分を取得します
		 * 
		 * @return
		 */
		protected String getRecvStsTypOfError(SdrvDtlR dtlR) {
			return MAC_SDRV_STS_TYP.RECV_ERR.value();
		}

	}

	/**
	 * ConvBase04オペレーション.<p>
	 *
	 */
	public class ConvBase04 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase04 {
		/**
		 * データ受信用のレポートセットのインスタンス
		 * 
		 */
		protected PFBZL_FileInput.IfRecvReportSet<? extends MCDBContainer, ? extends MCRow> _IfRptSet = null;
		

		/** 使用するロガー **/
		protected FXBAL_BatchLogger _logger = null;
		/** 対象件数 */
		protected int _totalCnt = 0;
		/** エラー件数 */
		protected int _errorCnt = 0;
		
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;
		@Override
		protected void call() {
			crtRptSet();
			setRptSetData();
			if (_IfRptSet == null || up0().isEmpty()) {
				return;
			}

			setDataNo(up0());

			// / 送受信ＩＦとＩＦテーブルの登録
			for (SdrvDtlR dtlR : up0()) {
				boolean isErr = false;
				String svp = "svp_" + dtlR.data_no().toString();
				try {
					dbTran().setSavepoint(svp);

					init(dtlR);
					preRecv(dtlR);

					insSdrvIf(dtlR);
					insRecvIf(dtlR, _IfRptSet);
					dtlR.if_ins_flg(true);

				}
				catch (Exception ex) {
					isErr = true;
					handleEx(ex, dtlR);
				}
				finally {
					if (isErr) {
						dbTran().rollback(svp);
					}
				}
			}
			// IF登録処理を確定させる。
			dbTran().commit();
			
			// 成功したものがない場合は終了
			MCList<SdrvDtlR> insdDtlL = up0().subList(SdrvDtlR.$if_ins_flg, true);
			if (insdDtlL.isEmpty()) {
				down0().setAll(up0());
				return ;
			}

			// コード変換とリアルタイム取込ログ開始。
			// コード変換処理ではデータ参照制御用文字列を指定せずにロガーを取得するため、ここでもデータ参照制御用文字列は指定しない。
			// リアルタイム取込処理もデータ参照制御用文字列を指定していないため、開始、終了ログはネストする。
			
			MCMessageList insIfMsgs = new MCMessageList();
			MCMessageList convMsgs = new MCMessageList();
			MCMessageList impMsgs = new MCMessageList();
			
			insIfMsgs.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			initLogger();
			setLogKey(up0(), _logger);
			writeStartLog(_logger);
			
			// コード変換
			for (SdrvDtlR dtlR : insdDtlL) {
				boolean isErr = false;
				String svp = "svp_" + dtlR.data_no().toString();
				try {
					dbTran().setSavepoint(svp);
					
					procConvBeginLog(dtlR, _logger);
					
					recvIf(dtlR);
					updRecvIf(dtlR, true);
				}
				catch (Exception ex) {
					isErr = true;
					handleEx(ex, dtlR);
				}
				finally {
					// 変換処理側でバッチログを出力しないので、ここで出力する
					procConvMsgLog(_logger);
					convMsgs.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					if (isErr) {
						dbTran().rollback(svp);
					}
				}
			}
			// コード変換を確定させる
			dbTran().commit();
			
			calcRsltCnt(insdDtlL);
			procConvWarnLog(insdDtlL, _logger);
			convMsgs.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			// リアルタイム取込
			callImpOpe(insdDtlL.subList(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_CONV_OK.value()));
			impMsgs.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			_logger.writeProcessLog(impMsgs);
			
			writeEndLog(_logger);
			
			// 取得できたメッセージはすべて返す。結果メッセージをどうするかは利用側で決めること。
			MCMessagePool.addAll(insIfMsgs);
			MCMessagePool.addAll(convMsgs);
			MCMessagePool.addAll(impMsgs);
			down0().setAll(up0());
		}

		/**
		 * 受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		protected void crtRptSet() {
			// サブクラスで実装
		}

		/**
		 * 受信ＩＦのレポートセットに上り電文の内容を設定します
		 */
		protected void setRptSetData() {
			// サブクラスで実装
		}

		protected void setDataNo(MCList<SdrvDtlR> sdrvDtlL) {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, sdrvDtlL.size());
			for (SdrvDtlR dtlR : sdrvDtlL) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				dtlR.data_no(dataNo);
			}
		}

		/**
		 * 初期処理をします
		 * 
		 * @param dtlR
		 */
		protected void init(SdrvDtlR dtlR) {
			dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.NOTYET.value());
			// 会社間連携時は外部システムＣＤを補完する
			if (!dtlR.not_coopr_flg()) {
				String extSysCd = getExtSysCd();
				if (isNull(extSysCd)) {
					throw new MCAppException(PFUCL0009);
				}
				dtlR.ext_sys_cd(extSysCd);
			}
			ifPrtclMgr().init(dtlR);
		}


		protected void recvIf(SdrvDtlR r) {
			// コード変換直前に最新のコード変換アダプタをセットする
			r.sdrvIf().conv_ope(ifAdptrMgr().getConvOpe(r.sdrvIf()));

			// 後処理（コード変換）
			if (!MAC_SDRV_STS_TYP.isRECV_ERR(r.sdrv_sts_typ()) && !isNull(r.sdrvIf().conv_ope())) {

				ConvDtlR upR = ConvDtlR.create();
				copy(upR, r, createConvDtlR_SdrvDtlR());

				MCList<ConvDtlR> upL = MCList.create(ConvDtlR.class);
				upL.add(upR);
				// コード変換処理を実行
				callPostOperation(r.sdrvIf().conv_ope(), upL, null);

				r.sdrv_sts_typ(upL.get(0).sdrv_sts_typ());
			}
		}

		/**
		 * 送受信ＩＦを登録します
		 * 
		 * @param dtlR
		 */
		protected void insSdrvIf(SdrvDtlR dtlR) {
			dtlR.sdrvIf().sdrv_tm(MCDate.now());
			if (dtlR.not_coopr_flg()) {
				dtlR.sdrvIf().sdrv_clt_id(MCSys.user.clientID());
				dtlR.sdrvIf().sdrv_usr_id(MCSys.user.ID());
				dtlR.sdrvIf().sdrv_usr_nm(MCSys.user.name());
			}

			PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ifR);
			dbInsert(createSqlId(LOGIC_ID, ifR, "I01"), ifR, builder);
		}

		protected ConvDtlR_DtlR<ConvDtlR, SdrvDtlR> createConvDtlR_SdrvDtlR() {
			return new ConvDtlR_DtlR<ConvDtlR, SdrvDtlR>();
		}

		public class ConvDtlR_DtlR<D extends ConvDtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_no(src.data_no());
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
			}
		}

		/**
		 * 送受信ＩＦを更新します
		 * 
		 * @param dtlR
		 * @param execRecvOpe
		 */
		protected void updRecvIf(SdrvDtlR dtlR, boolean execRecvOpe) {
			MCList<PFT_SDRV_IF_R> ifL = MCList.create(PFT_SDRV_IF_R.class), exL = MCList.create(PFT_SDRV_IF_R.class);
			MCDate tm = MCDate.now();

			if (isNull(dtlR.sdrv_sts_typ())) { // 処理対象外
				exL.add(dtlR.sdrvIf());
			}
			else {
				PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
				if (MAC_SDRV_STS_TYP.isRECV_CONV_OK(ifR.sdrv_sts_typ())) {
					ifR.sdrv_tm(tm);
				}
				else {
					ifR.conv_ope(null); // 変換完了以外は更新しない
				}
				ifL.add(ifR);
			}

			if (!ifL.isEmpty()) {
				PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.conv_ope,
							   dbc.sdrv_sts_typ,
							   dbc.batch_log_no,
							   dbc.log_sub_key1,
							   dbc.log_sub_key2);
				if (execRecvOpe) {
					builder.addSet(dbc.sdrv_tm);
				}
				dbUpdateKey(createSqlId(LOGIC_ID, dbc, "U01"), ifL, builder);
			}

			if (!exL.isEmpty()) {
				PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.batch_log_no,
							   dbc.log_sub_key1,
							   dbc.log_sub_key2);
				dbUpdateKey(createSqlId(LOGIC_ID, dbc, "U02"), exL, builder);
			}
		}

		protected void callImpOpe(MCList<SdrvDtlR> sdrvDtlL) {
			MCList<Upd01_DtlR> upL = MCList.create(Upd01_DtlR.class);
			MCRowMapper<Upd01_DtlR, SdrvDtlR> mapper = createUpd01_Dtl_SdrvDtlR();

			// 外部システムＣＤ毎に即時取込みするか否かが決定する
			for (MCList<SdrvDtlR> dtlL : sdrvDtlL.groupList(SdrvDtlR.$ext_sys_cd)) {
				SdrvDtlR grpR = dtlL.get(0);
				if (isNull(grpR) || isNull(grpR.ext_sys_cd()) || !ifAdptrMgr().getRealImpFlg(grpR.sdrvIf())) {
					continue;
				}

				setAll(upL, dtlL, mapper);

				try {
					callImpOperation(MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()), upL);
					MCMessagePool.add(PFBZL0025, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
				}
				catch (Exception ex) {
					MCMessagePool.add(PFBZL0026, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
					MCLog.write(ex);
				}
			}
		}

		protected Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR> createUpd01_Dtl_SdrvDtlR() {
			return new Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR>();
		}

		public class Upd01_Dtl_SdrvDtlR<D extends Upd01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_no(src.data_no());
				dest.if_proc_typ(src.if_proc_typ());
			}
		}

		protected void preRecv(SdrvDtlR dtlR) {
		}

		protected void postRecv(SdrvDtlR dtlR) {
		}

		/**
		 * バッチログを初期化します
		 */
		protected void initLogger() {
			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			_logger = getConcurrentLogger();
		}
		
		/**
		 * ログにキーをセットします
		 * @param keyL セット対象のリスト
		 */
		protected void setLogKey(MCList<? extends MCRow> keyL, FXBAL_BatchLogger logger) {
			if (keyL == null || keyL.isEmpty()) {
				return;
			}
			if (keyL.get(0).contains(SdrvDtlR.$sdrvIf)) {
				MCList<PFT_SDRV_IF_R> sdrvL = keyL.innerRowList(SdrvDtlR.$sdrvIf, PFT_SDRV_IF_R.class);
				logger.setLogKey(sdrvL, PFT_SDRV_IF_R.$batch_log_no, PFT_SDRV_IF_R.$log_sub_key1, PFT_SDRV_IF_R.$log_sub_key2);
			}
			else {
				logger.setLogKey(keyL);
			}
		}
		/**
		 * 開始ログを出力します
		 * @param logger ロガー
		 */
		protected void writeStartLog(FXBAL_BatchLogger logger) {
			logger.writeStartLog(PFBZL0046);
			pushStartLog(logger);
		}
		/**
		 * 終了ログを出力します
		 * @param logger ロガー
		 */
		protected void writeEndLog(FXBAL_BatchLogger logger) {
			
			logger.writeEndLog(PFBZL0047);
			pushEndLog(logger);
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger.close();
			}
		}
		/**
		 * 変換処理開始ログ
		 * @param upR
		 */
		protected void procConvBeginLog(SdrvDtlR upR, FXBAL_BatchLogger logger) {
			logger.writeProcessLog(
				PFBZL0016
				, upR.ext_sys_cd()
				, upR.if_proc_typ()
				, ifAdptrMgr().getConvOpe(upR.sdrvIf()));
		}
		/**
		 * 変換処理後のメッセージログ
		 */
		protected void procConvMsgLog(FXBAL_BatchLogger logger) {
			logger.writeDataLog(MCMessagePool.getMessageList());

		}

		/**
		 * 処理結果件数を設定する。
		 */
		protected <T extends SdrvDtlR>void calcRsltCnt(MCList<T> insdDtlL) {
			_totalCnt = _errorCnt = 0;
			for (SdrvDtlR dtlR : insdDtlL) {
				if (MAC_SDRV_STS_TYP.isRECV_ERR(dtlR.sdrv_sts_typ())
				 || MAC_SDRV_STS_TYP.isRECV_CONV_ERR(dtlR.sdrv_sts_typ())) {
					_errorCnt++;
				}
				_totalCnt++;
			}
		}
		/**
		 * 変換処理の完了ログ
		 */
		protected <T extends SdrvDtlR>void procConvWarnLog(MCList<T> insdDtlL, FXBAL_BatchLogger logger) {

			if (_errorCnt > 0) {
				logger.writeProcessLog(MAUDL0009);
				pushErrorLog(logger);
			}
			else if (_totalCnt == 0) {
				logger.writeProcessLog(PFBZL0017);
			}
		}
	}

	/**
	 * ConvBase05オペレーション.<p>
	 *
	 */
	public class ConvBase05 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase05 {
		/**
		 * 送受信IFのDBCのインスタンス
		 * 	
		 */
		protected PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> _ifDBC = null;
		
		/**
		 * HTTPメソッド
		 */
		protected String _httpMethod = "POST";
		
		@Override
		protected void call() {
			
			setIfDBC();
			
			if (_ifDBC == null || up0().isEmpty()) return;
			int size =  up0().groupList(convSendIfLKey(up0())).length;
			int cnt = 0;
			for (MCList<SdrvDtlR> ifL : up0().groupList(convSendIfLKey(up0()))) {
				boolean isErr = false;
				try {
					insSdrvIfWk(ifL);
					post();
					cnt ++;
					setDown0(ifL, isErr);
				}
				catch (Exception e) {
					isErr = true;
					while (cnt < size) {
						MCList<SdrvDtlR> errIfL = up0().groupList(convSendIfLKey(up0()))[cnt];
						setDown0(errIfL, isErr);
						cnt ++;
					}
					throw e;
				}
			}
		}

		/**
		 * WebAPI送信処理を実行します<br>
		 * 
		 */
		protected void post() {
			_ifDBC.checkIfL();
			_ifDBC.initSelect();
			_ifDBC.addSelectIfCtrlColumns();
			_ifDBC.addWhereIfWrite();
			_ifDBC.setOrderBy();

			MCList<?> _ifL = _ifDBC.getIfL();
			MCQueryApiBuilder builder = _ifDBC.getBuilder();
			dbSelect(createSqlId(LOGIC_ID, builder.getBaseDbc(), "S03"), _ifL, builder);
			if (!_ifL.isEmpty()) {
				sendRequest(_ifL);
			}
		}

		protected void sendRequest(MCList<?> ifL) {
			MCRow fR = ifL.get(0);
			String ifpt = fR.getStringNE(MAM_IF_ADAPTER_R.$if_proc_typ);
			MCSimpleRequester r = new MCSimpleRequester(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_REQ_ID, ifpt));
			r.setMethod(_httpMethod);

			// HTTPヘッダの設定
			for (MAM_HTTP_HEADER_R hhr : httpHdrMgr().getHttpHeaderL(fR)) {
				r.setHeader(hhr.http_header_nm(), hhr.http_header_val());
			}
			String url = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_URL, ifpt);
			String resb = sendRequestSub(r, url, ifL);
			int resi = r.getResponseCode();
			setresponseCode(resb, resi ,ifL);
		}

		protected String sendRequestSub(MCSimpleRequester r, String url, MCList<?> ifL) {
			return r.request(url, convertMCDBtoJson(ifL));
		}

		/**
		 * レスポンスを保持します<br>
		 * @param resb レスポンスメッセージ
		 * @param resi レスポンスコード
		 * @param _ifL DBコンテナ
		 */
		protected void setresponseCode(String resb, int resi, MCList<?> _ifL) {
			MCNumber responseCode = new MCNumber(resi);
			_ifL.addNumberColumn("response_code", responseCode);
		}
		
		/**
		 * HTTPメソッドを設定します<br>
		 * 
		 */
		protected void setHttpMethod() {
			// サブクラスで実装
		}
		/**
		 * 送受信IFのDBCのインスタンスを生成します<br>
		 * 
		 */
		protected void setIfDBC() {
			// サブクラスで実装
		}
		protected String convertMCDBtoJson(MCList<?> ifL) {
			return "";
			// サブクラスで実装
		}
		/**
		 * 下り電文を設定します<br>
		 * 
		 */
		protected void setDown0(MCList<SdrvDtlR> ifL, boolean isErr) {
			if (isErr) {
				ifL.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
			}
			else {
				ifL.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
			}
			down0().addAll(ifL);
		}
		
		/**
		 * 処理用に送信データを加工します<br>
		 * 
		 * @param up
		 * @return
		 */
		protected String[] convSendIfLKey(MCList<SdrvDtlR> up) {
			SdrvDtlR dtlR = up.get(0);
			ifPrtclMgr().set(dtlR);
			
			List<String> kl = new ArrayList<>();
			kl.add(PFT_SDRV_IF_R.$if_proc_typ);
			kl.add(PFT_SDRV_IF_R.$ext_sys_cd);
			boolean isExtSys = isSame(mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys._send_file_grp_2, ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, dtlR.getStringNE("if_proc_typ")));
			if (isExtSys) {
				kl.add(PFT_SDRV_IF_R.$data_no);
			}
			return kl.toArray(new String[kl.size()]);
		}
		/**
		 * 送受信ワークに対象データを書き込みます<br>
		 * 
		 * @param dtlL
		 */
		protected void insSdrvIfWk(MCList<SdrvDtlR> dtlL) {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> mapper = createUpdWk01_DtlR_SdrvDtlR();
			for (SdrvDtlR dtlR : dtlL) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().createRow();
				copy(row, dtlR, mapper);
				ope.up0().add(row);
			}
			ope.exec();
		}
		/**
		 * SdrvDtlR→UpdWk01_DtlRへ設定します<br>
		 * 
		 * @return
		 */
		protected UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> createUpdWk01_DtlR_SdrvDtlR() {
			return new UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR>();
		}
	
		public class UpdWk01_DtlR_SdrvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.if_proc_typ(src.if_proc_typ());
				dest.data_no(src.data_no());
			}
		}
	}
	/**
	 * ConvBase06オペレーション.<p>
	 *
	 */
	public class ConvBase06 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase06 {
		/**
		 * データ受信用のレポートセットのインスタンス
		 * 
		 */
		protected PFBZL_FileInput.IfRecvReportSet<? extends MCDBContainer, ? extends MCRow> _IfRptSet = null;
		
		protected FXBAL_BatchLogger _logger = null;
		
		/** 対象件数 */
		protected int _totalCnt = 0;
		/** 正常終了件数 */
		protected int _successCnt = 0;
		/** エラー件数 */
		protected int _errorCnt = 0;
		/** スキップ件数 */
		protected int _skipCnt = 0;
		
		/** 全対象件数 */
		protected int _sumTotalCnt = 0;
		/** 全エラー件数 */
		protected int _sumErrorCnt = 0;
		
		@Override
		protected void call() {

			crtRptSet();
			setRptSetData();
			if (_IfRptSet == null || up0().isEmpty()) {
				return;
			}
			_logger = getConcurrentLogger(up0().get(0).if_proc_typ());
			setLogKey(up0(), _logger);
			writeStartLog(_logger);
			
			setDataNo(up0());

			// / 送受信ＩＦ、ＩＦテーブル登録
			for (SdrvDtlR dtlR : up0()) {
				try {
					init(dtlR);
					preRecv(dtlR);

					insSdrvIf(dtlR);
					insRecvIf(dtlR, _IfRptSet);
				}
				catch (Exception e) {
					MCException ex = e instanceof MCException ? (MCException)e : new MCException(e);
					handleEx(ex, dtlR);
					_sumTotalCnt ++;
					_sumErrorCnt ++;
					writeEndLog(_logger);
					throw ex;
				}
			}
			
			// 変換処理
			for (SdrvDtlR dtlR : up0()) {
				procConvStartLog(dtlR);
				boolean isErr = false;
				String svp = "svp_" + dtlR.data_no().toString();
				try {
					dbTran().setSavepoint(svp);

					dtlR.if_ins_flg(true);
					recvIf(dtlR);
					updRecvIf(dtlR, true);

					postRecv(dtlR);
					rsltCnt(dtlR);
				}
				catch (Exception ex) {
					isErr = true;
					handleEx(ex, dtlR);
				}
				finally {
					if (isErr) {
						dbTran().rollback(svp);
						rsltErrCnt();
					}
					procConvEndLog();
				}
			}
			writeEndLog(_logger);
			// 取込処理の前にデータを確定させる
			dbTran().commit();

			// 変換完了のデータのみ取込処理対象とする
			callImpOpe(up0().subList(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_CONV_OK.value()));

			down0().setAll(up0());

			down0().setAll(up0());
		}
		
		/**
		 * ログにキーをセットします
		 * @param keyL セット対象のリスト
		 */
		protected void setLogKey(MCList<? extends MCRow> keyL, FXBAL_BatchLogger logger) {
			if (keyL == null || keyL.isEmpty()) {
				return;
			}
			if (keyL.get(0).contains(SdrvDtlR.$sdrvIf)) {
				MCList<PFT_SDRV_IF_R> sdrvL = keyL.innerRowList(SdrvDtlR.$sdrvIf, PFT_SDRV_IF_R.class);
				logger.setLogKey(sdrvL, PFT_SDRV_IF_R.$batch_log_no, PFT_SDRV_IF_R.$log_sub_key1, PFT_SDRV_IF_R.$log_sub_key2);
			}
			else {
				logger.setLogKey(keyL);
			}
		}
		/**
		 * 開始ログを出力します
		 * @param logger ロガー
		 */
		protected void writeStartLog(FXBAL_BatchLogger logger) {
			logger.writeStartLog(PFBZL0046);
			pushStartLog(logger);
		}
		/**
		 * 終了ログを出力します
		 * @param logger ロガー
		 */
		protected void writeEndLog(FXBAL_BatchLogger logger) {
			if (_sumTotalCnt == 0) {
				MCMessagePool.add(new MCMessage(MAUDL0008));
			}
			else if (_sumErrorCnt > 0) {
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
			logger.writeDataLog(MCMessagePool.getMessageList());
			logger.writeEndLog(PFBZL0047);
			pushEndLog(logger);
			logger.close();
		}
		/**
		 *ループ開始ログを出力します
		 * @param dtlR SdrvDtlのRowクラス
		 */
		protected void procConvStartLog(SdrvDtlR dtlR) {
			MCMessagePool.add(
				PFBZL0016
				, dtlR.ext_sys_cd()
				, dtlR.if_proc_typ()
				, ifAdptrMgr().getConvOpe(dtlR.sdrvIf()));
		}
		
		/**
		 * ループ終了ログを出力する。
		 */
		protected void procConvEndLog() {
			MCMessagePool.add(PFBZL0023, _totalCnt, _successCnt, _errorCnt, _skipCnt);
		}

		/**
		 * 処理結果をカウントする。
		 * @param dtlR SdrvDtlのRowクラス
		 */
		protected void rsltCnt(SdrvDtlR dtlR) {
			_totalCnt = _successCnt = _errorCnt = _skipCnt = 0;
			if (MAC_SDRV_STS_TYP.isRECV_ERR(dtlR.sdrv_sts_typ())
			 || MAC_SDRV_STS_TYP.isRECV_CONV_ERR(dtlR.sdrv_sts_typ())) {
				_errorCnt++;
				_sumErrorCnt++;
			}
			else if (MAC_SDRV_STS_TYP.isRECV_CONV_OK(dtlR.sdrv_sts_typ())
				  || MAC_SDRV_STS_TYP.isRECV_OK(dtlR.sdrv_sts_typ())) {
				_successCnt++;
			}
			else {
				_skipCnt++;
			}
			_totalCnt++;
			_sumTotalCnt++;
		}
		/**
		 * エラー時の処理結果をカウントする。
		 */
		protected void rsltErrCnt() {
			_totalCnt = _successCnt = _errorCnt = _skipCnt = 0;
			_errorCnt++;
			_sumErrorCnt++;
			_totalCnt++;
			_sumTotalCnt++;
		}
		/**
		 * 受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		protected void crtRptSet() {
			// サブクラスで実装
		}

		/**
		 * 受信ＩＦのレポートセットに上り電文の内容を設定します
		 */
		protected void setRptSetData() {
			// サブクラスで実装
		}

		/**
		 * ＥＳＢデータＮＯを発番します
		 * @param sdrvDtlL SdrvDtlのリスト
		 */
		protected void setDataNo(MCList<SdrvDtlR> sdrvDtlL) {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, sdrvDtlL.size());
			for (SdrvDtlR dtlR : sdrvDtlL) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				dtlR.data_no(dataNo);
			}
		}

		/**
		 * 初期処理をします
		 * 
		 * @param dtlR
		 */
		protected void init(SdrvDtlR dtlR) {
			dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.NOTYET.value());
			ifPrtclMgr().init(dtlR);
			
			String _webApiOpe = MCSys.request.moduleId() + "." + MCSys.request.logicId()
					+ "." + MCSys.request.operationId();
			dtlR.sdrvIf().web_api_ope(_webApiOpe);
		}

		protected void recvIf(SdrvDtlR r) {
			// コード変換直前に最新のコード変換アダプタをセットする
			r.sdrvIf().conv_ope(ifAdptrMgr().getConvOpe(r.sdrvIf()));

			// 後処理（コード変換）
			if (!MAC_SDRV_STS_TYP.isRECV_ERR(r.sdrv_sts_typ()) && !isNull(r.sdrvIf().conv_ope())) {

				ConvDtlR upR = ConvDtlR.create();
				copy(upR, r, createConvDtlR_SdrvDtlR());

				MCList<ConvDtlR> upL = MCList.create(ConvDtlR.class);
				upL.add(upR);
				// コード変換処理を実行
				callPostOperation(r.sdrvIf().conv_ope(), upL, null);

				r.sdrv_sts_typ(upL.get(0).sdrv_sts_typ());
			}
		}

		/**
		 * 送受信ＩＦを登録します
		 * 
		 * @param dtlR
		 */
		protected void insSdrvIf(SdrvDtlR dtlR) {
			dtlR.sdrvIf().sdrv_tm(MCDate.now());

			dtlR.sdrvIf().sdrv_clt_id(MCSys.user.clientID());
			dtlR.sdrvIf().sdrv_usr_id(MCSys.user.ID());
			dtlR.sdrvIf().sdrv_usr_nm(MCSys.user.name());

			PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(ifR);
			dbInsert(createSqlId(LOGIC_ID, ifR, "I02"), ifR, builder);
		}

		protected ConvDtlR_DtlR<ConvDtlR, SdrvDtlR> createConvDtlR_SdrvDtlR() {
			return new ConvDtlR_DtlR<ConvDtlR, SdrvDtlR>();
		}

		public class ConvDtlR_DtlR<D extends ConvDtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_no(src.data_no());
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
			}
		}

		/**
		 * 送受信ＩＦを更新します
		 * 
		 * @param dtlR
		 * @param execRecvOpe
		 */
		protected void updRecvIf(SdrvDtlR dtlR, boolean execRecvOpe) {
			MCList<PFT_SDRV_IF_R> ifL = MCList.create(PFT_SDRV_IF_R.class), exL = MCList.create(PFT_SDRV_IF_R.class);
			MCDate tm = MCDate.now();

			if (isNull(dtlR.sdrv_sts_typ())) { // 処理対象外
				exL.add(dtlR.sdrvIf());
			}
			else {
				PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
				if (MAC_SDRV_STS_TYP.isRECV_CONV_OK(ifR.sdrv_sts_typ())) {
					ifR.sdrv_tm(tm);
				}
				else {
					ifR.conv_ope(null); // 変換完了以外は更新しない
				}
				ifL.add(ifR);
			}

			if (!ifL.isEmpty()) {
				PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.conv_ope,
							   dbc.web_api_ope,
							   dbc.sdrv_sts_typ,
							   dbc.batch_log_no,
							   dbc.log_sub_key1,
							   dbc.log_sub_key2);
				if (execRecvOpe) {
					builder.addSet(dbc.sdrv_tm);
				}
				dbUpdateKey(createSqlId(LOGIC_ID, dbc, "U03"), ifL, builder);
			}

			if (!exL.isEmpty()) {
				PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create();
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.batch_log_no,
							   dbc.log_sub_key1,
							   dbc.log_sub_key2);
				dbUpdateKey(createSqlId(LOGIC_ID, dbc, "U04"), exL, builder);
			}
		}

		/**
		 * ESBデータ取り込み処理を呼び出します
		 * @param sdrvDtlL
		 */
		protected void callImpOpe(MCList<SdrvDtlR> sdrvDtlL) {
			MCList<Upd01_DtlR> upL = MCList.create(Upd01_DtlR.class);
			MCRowMapper<Upd01_DtlR, SdrvDtlR> mapper = createUpd01_Dtl_SdrvDtlR();

			// 外部システムＣＤ毎に即時取込みするか否かが決定する
			for (MCList<SdrvDtlR> dtlL : sdrvDtlL.groupList(SdrvDtlR.$ext_sys_cd)) {
				SdrvDtlR grpR = dtlL.get(0);
				if (isNull(grpR) || isNull(grpR.ext_sys_cd()) || !ifAdptrMgr().getRealImpFlg(grpR.sdrvIf())) {
					continue;
				}

				setAll(upL, dtlL, mapper);

				try {
					callImpOperation(MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()), upL);
					MCMessagePool.add(PFBZL0025, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
				}
				catch (Exception ex) {
					MCMessagePool.add(PFBZL0026, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
					MCLog.write(ex);
				}
			}
		}

		protected Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR> createUpd01_Dtl_SdrvDtlR() {
			return new Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR>();
		}
		public class Upd01_Dtl_SdrvDtlR<D extends Upd01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_no(src.data_no());
				dest.if_proc_typ(src.if_proc_typ());
			}
		}

		/**
		 * 受信変換前処理を行います
		 * @param dtlR
		 */
		protected void preRecv(SdrvDtlR dtlR) {
			// サブクラスで実装
		}

		/**
		 * 受信変換後処理を行います
		 * @param dtlR
		 */
		protected void postRecv(SdrvDtlR dtlR) {
			// サブクラスで実装
		}
	}
	/**
	 * ConvBase07オペレーション.<p>
	 *
	 */
	public class ConvBase07 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase07 {

		protected FXBAL_BatchLogger _logger = null;

		protected FXBAL_BatchLogger getLogger() {
			return _logger;
		}

		/**
		 * コマンド引数に設定するパラメータ
		 */
		protected Map<String, String> _cmdParams = null;

		protected Map<String, String> getCmdParams() {
			return _cmdParams;
		}

		protected void setCmdParams() {
			_cmdParams = new LinkedHashMap<String, String>();
			String cmdPath = ifPrtclMgr().convPlaceHolder(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_PATH), up0().get(0).sdrvIf());
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_PATH.key(), cmdPath);
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG01.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG01));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG02.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG02));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG03.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG03));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG04.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG04));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG05.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG05));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG06.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG06));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG07.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG07));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG08.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG08));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG09.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG09));
			_cmdParams.put(MAC_IF_CTL_TYP.CMD_ARG10.key(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_ARG10));
		}

		/**
		 * コマンド実行時の終了コード
		 */
		protected int _exitCd = 0;

		protected int getExitCd() {
			return _exitCd;
		}

		/**
		 * コマンド実行時の標準エラー
		 */
		protected String _stdErr = null;

		protected String getStdErr() {
			return _stdErr;
		}

		@Override
		protected void call() {
			if (up0().isEmpty()) return;

			_logger = getConcurrentLogger(up0().get(0).if_proc_typ());
			_logger.writeStartLog(PFBZL0067);
			ifPrtclMgr().set(up0().get(0));
			boolean isErr = false;
			try {
				setCmdParams();
				preExec();
				insSdrvIfWk();
				execCmd();
			}
			catch (MCException ex) {
				isErr = true;
				_logger.writeProcessLog(ex);
			}
			finally {
				postExec(isErr);
				setDown0(isErr);
				_logger.writeEndLog(PFBZL0068);
				_logger.close();
			}
		}

		/**
		 * コマンド実行の前処理を行います
		 * 
		 */
		protected void preExec() {
			// サブクラスで実装
		}

		/**
		 * コマンド実行の後処理を行います
		 * 
		 */
		protected void postExec(boolean isErr) {
			// サブクラスで実装
		}

		/**
		 * コマンドを実行します
		 * 
		 */
		protected void execCmd() {
			MCExec exe = new MCExec();
			exe.setCommand(buildCmdStr());
			exe.setWait(true);
			exe.keepStderr(true);
			String charset = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.CMD_CHARSET);
			if (isNull(charset)) charset = "UTF-8";
			exe.setStdEncode(charset);

			_exitCd = exe.execute();
			_stdErr = exe.getStderr();
		}

		/**
		 * コマンド実行のための文字列を生成します
		 * 
		 */
		protected String buildCmdStr() {
			return String.join(" ", _cmdParams.values());
		}

		/**
		 * 下り電文に変換エラーの情報を設定します
		 * 
		 */
		protected void setDown0(boolean isErr) {
			down0().setAll(up0());
			String stsTyp = isErr ? MAC_SDRV_STS_TYP.SEND_CONV_ERR.value() : MAC_SDRV_STS_TYP.SEND_CONV_OK.value();
			down0().forEach(dR -> dR.sdrv_sts_typ(stsTyp));
		}

		/**
		 * 送受信ワークに対象データを書き込みます
		 * 
		 */
		protected void insSdrvIfWk() {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> mapper = createUpdWk01_DtlR_SdrvDtlR();
			for (SdrvDtlR dtlR : up0()) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().add();
				copy(row, dtlR, mapper);
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		/**
		 * SdrvDtlR→Upd01_DtlRへ設定
		 * 
		 */
		protected UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> createUpdWk01_DtlR_SdrvDtlR() {
			return new UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR>();
		}

		public class UpdWk01_DtlR_SdrvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.data_no(src.data_no());
			}
		}
	}
	/**
	 * ConvBase08オペレーション.<p>
	 *
	 */
	public class ConvBase08 extends PFUDL_SendRecvLogicBase_MC_A.ConvBase08 {
		/**
		 * ＩＦテーブルのＤＢＣインスタンス
		 */
		protected PFBZL_CodeConvert.IfDBContainer<? extends MCDBContainer> _ifDBC = null;
		/**
		 * ファイル出力対象外の項目
		 */
		protected String[] _removeColumes = new String[] {
				"batch_log_no", "log_sub_key1", "log_sub_key2", "ins_usr_id", "ins_usr_nm",
				"ins_ts", "ins_func_id", "upd_cntr", "upd_usr_id", "upd_usr_nm", "upd_ts",
				"upd_func_id", "upd_srv_req_no", "del_flg", "del_usr_id", "del_usr_nm","del_ts"
		};
		protected String[] _columns = null;
		protected String _ifpt = null;
		protected String _fileTyp = null;
		protected String _extSysCd = null;
		protected MCList<?> _ifL = null;
		protected File _file = null;
		protected String _extPtn = "PF.PFUDL5010.ConvBase08";
		protected PFBZL_FixLenFileFmt _fixLenFileFmt = null;
		protected PFBZL_FixLenFileWriter _fixLenFileWriter = null;
		
		protected MCCSVFile _rptFile = null;
		protected MCReportSet _rptSet = null;
		protected PFBZL_CSVFmt _csvFmt = null;
		
		@Override
		protected void call() {
			if (up0().isEmpty()) return;
			
			SdrvDtlR dtlR = up0().get(0);
			_ifpt = dtlR.if_proc_typ();
			if (isNull(_ifpt)) return;
			
			ifPrtclMgr().set(dtlR);
			_fileTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_TYPE, _ifpt);
			setIfDBC();
			MCList<SdrvDtlR>[] sdrvDtlGrpLArr = up0().groupList(convSendIfLKey(up0()));
			for (MCList<SdrvDtlR> ifL : sdrvDtlGrpLArr) {
				boolean isErr = false;
				try {
					_extSysCd = ifL.get(0).ext_sys_cd();
					ifPrtclMgr().set(ifL.get(0));
					insSdrvIfWk(ifL);
					crtRptSet();
					output();
				}
				catch (MCException ex) {
					handleEx(ex, ifL);
					isErr = true;
				}
				finally {
					setDown0(ifL, isErr);
				}
			}
		}
		
		protected boolean isFixLenFmt() {
			return isSame(_file_type_fix, _fileTyp);
		}
		
		/**
		 * 送受信IFのDBCのインスタンスを生成します<br>
		 * 
		 */
		protected void setIfDBC() {
			String ifTblNm = MAC_IF_PROC_TYP.std_file_conv_tbl(_ifpt);
			if (isNull(ifTblNm)) return;
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(createDbcClass(ifTblNm));
		}
		/**
		 * ＩＦテーブルからデータを取得し、ファイルに出力します<br>
		 */
		protected void output() {
			initFile();

			String bibat = MAC_IF_PROC_TYP.bi_bat(_ifpt);
			
			MCQueryApiBuilder builder = null;
			if (!isSame(bibat, "MABCB0010")) {
				_ifDBC.checkIfL();
				_ifDBC.initSelect();
				_ifDBC.addSelectIfCtrlColumns();
				_ifDBC.addWhereIfWrite();
				_ifDBC.setOrderBy();
				builder = _ifDBC.getBuilder();
			}
			else {
				builder = _ifDBC.getBuilder();
				builder.setSelectAll();
			}
			
			if(isFixLenFmt()) {
				editDBBuilderInFixLenFmt(builder);
			}
			
			preSelect(builder);
			
			boolean init = true;
			MCCursor<?> cur = null;
			int fetchSize = getFetchSize(_ifpt);

			_file = ifPrtclMgr().getLocalFile(_ifpt);
			_ifL = _ifDBC.getIfL();
			try {
				cur = _ifDBC.getBuilder()
						.buildSelect(createSqlId(LOGIC_ID, _ifDBC.getBuilder().getBaseDbc(), "S04"))
						.openCursor(builder.getBaseDbc().getClass());
				while (cur.dbFetch(fetchSize) > 0) {
					_ifL = cur.getList();
					if(init && !isFixLenFmt()) {
						changeOutputColums();
					}
					output(init);
					
					//初期化のフラグを落とす
					init = false;
				}
			}
			finally {
				try {
					if (isFixLenFmt()) {
						if (_fixLenFileWriter != null) {
							_fixLenFileWriter.writeClose();
						}
					}
					else {
						if (!init && _rptFile != null) {
							_rptFile.writeClose();
						}
					}
				}
				finally {
					if(cur != null) {
						cur.dbCloseCur();
					}
				}
			}
		}
		
		protected void crtRptSet() {
			_rptSet = new MCCSVFile(_ifDBC.getBuilder().getBaseDbc().getClass()).getReportSet();
		}
		
		protected int getFetchSize(String ifProcTyp) {
			return MCConst.app.getInteger(MCConst.createKey("PF","PFUDL5010","ConvBase08",ifProcTyp,"fetch_size"), -1);
		}
		
		/**
		 * CSV・TSV形式でファイルに出力します<br>
		 */
		@SuppressWarnings({"unchecked", "rawtypes"})
		protected void output(boolean init) {
			setIfRptSetData(_ifL);
			toFile(init);
		}
		

		/**
		 * レポートセットのデータセットアップ
		 * 
		 * @param fRow
		 * @param ifL
		 */
		protected void setIfRptSetData(MCList<?> ifL) {
			_rptSet.addAll(ifL);
		}

		/**
		 * ファイルを出力します
		 */
		protected void toFile(boolean initFlg) {

			if (_rptSet.size() <= 0) {
				return;
			}
			
			if (isFixLenFmt()) {
				toFileInFixLenFmt(initFlg);
			}
			else {
				toFileInCSV(initFlg);
			}
			
			_rptSet.clear();
		}

		protected void toFileInCSV(boolean initFlg) {
			boolean isHeading = _rptFile.isHeading();
			if (initFlg) {
				_rptFile.append(false);
				preWrite();
			}
			else {
				_rptFile.useHeading(false); //追記時は常にヘッダはオフ
				_rptFile.append(true);
			}

			_rptFile.write(_file.toString());
			_rptFile.useHeading(isHeading);
		}
		
		@SuppressWarnings("unchecked")
		protected void toFileInFixLenFmt(boolean initFlg) {
			if (initFlg) {
				_fixLenFileWriter.setFilePath(_file.toString());
			}
			_fixLenFileWriter.addList(_rptSet.getAll());
			_fixLenFileWriter.write();
		}
		
		protected void editDBBuilderInFixLenFmt(MCQueryApiBuilder builder) {
			if (_fixLenFileWriter == null || builder == null) {
				return ;
			}
			PFBZL_FixLenFileInfo fmtInfo = _fixLenFileWriter.getFileInfo();
			Map<String, Object> extInfo = fmtInfo.getExtInfo(_extPtn);
			if (extInfo == null) {
				return ;
			}
			String[] sort = (String[]) extInfo.get("sort");
			if (sort != null) {
				MCDBContainer dbc = builder.getBaseDbc();
				ArrayList<String> sortL = new ArrayList<>();
				for (String col : sort) {
					if (dbc.contains(col) && !sortL.contains(col)) {
						sortL.add(col);
					}
				}
				builder.clearOrderBy();
				for (String col : sortL) {
					builder.addOrderByAsc(dbc.getColumn$(col));
				}
			}
		}
		
		/**
		 * ＩＦテーブル検索前に、取得項目や検索条件の追加等を実行します<br>
		 */
		protected void preSelect(MCQueryApiBuilder builder) {
			// サブクラスで実装
		}
		/**
		 * ファイル出力前の処理を実行します<br>
		 */
		protected void preWrite() {
			// サブクラスで実装
		}
		
		/**
		 * ファイル出力前の初期処理
		 */
		protected void initFile() {

			_file = ifPrtclMgr().getLocalFile(_ifpt);
			_fileTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_TYPE, _ifpt);
			
			// ファイル変換の仕様についてはカートリッジで差し替え可能にする必要がある。
			if (isFixLenFmt()) {
				initFileInFixLenFmt(_ifpt, _extSysCd);
			}
			else {
				// 1. CSV(カンマ区切り), 2. TSV(タブ区切り）以外の場合は、 1. CSV(カンマ区切り)として扱う
				if (!isSame(_file_type_csv, _fileTyp) && !isSame(_file_type_tsv, _fileTyp)) {
					_fileTyp = _file_type_csv;
				}
				initFileInCSV(_ifpt, _extSysCd);
			}
		}
		
		protected void initFileInFixLenFmt(String ifProcTyp, String extSysCd) {
			
			String charset = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifProcTyp);
			String bom = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifProcTyp);
			PFBZL_FixLenFileFmt fmt = createPFBZL_FixLenFileFmt(ifProcTyp, extSysCd);
			
			PFBZL_FixLenFileWriter writer = createPFBZL_FixLenFileWriter(ifProcTyp, extSysCd);
			writer.setFixLenFileFmt(fmt);
			writer.setCharset(charset);
			writer.setWriteBOM(Boolean.valueOf(bom));
			_fixLenFileWriter = writer;
		}
		

		protected PFBZL_FixLenFileWriter createPFBZL_FixLenFileWriter(String ifProcTyp, String extSysCd) {
			return new PFBZL_FixLenFileWriter();
		}

		protected PFBZL_FixLenFileFmt createPFBZL_FixLenFileFmt(String ifProcTyp, String extSysCd) {
			PFBZL_FixLenFileFmt fmt = new PFBZL_FixLenFileFmt();
			fmt.setExtFmt(_extPtn);
			String fmtPath = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH, ifProcTyp);
			String settingPath = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH, ifProcTyp);
			return PFBZL_FixLenFileFmt.createWrite(_extSysCd, _ifpt, fmtPath, settingPath, null, fmt, null);
		}

		
		protected void initFileInCSV(String ifProcTyp, String extSysCd) {
			// CSV or TSV
			MCCSVFile csvRpt =  new MCCSVFile();
			
			if (isSame(_file_type_tsv, _fileTyp)) {
				csvRpt.setDelimiter(String.valueOf('\t'));	// タブ区切り
			}
			String use = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_USE_HEADING, ifProcTyp);
			csvRpt.useHeading(Boolean.valueOf(use));

			String dq = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_DBL_QUART, ifProcTyp);
			csvRpt.setDoubleQuotation(Boolean.valueOf(dq));

			String bom = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifProcTyp);
			csvRpt.setWriteBOM(Boolean.valueOf(bom));

			// １行目をヘッダ行とせずに項目の並び順を変更する
			setCsvFmt(csvRpt);
			
			_rptFile = csvRpt;

			_rptFile.setReportSet(_rptSet);
			
			String ifloc = MCConst.app.getString(MCConst.createKey("PF", "if_output", "locale"));

			if (!isNull(ifloc)) {
				Locale l = MCConst.convLocale(ifloc);
				_rptFile.setLocale(l);
				_rptSet.setLocale(l);
			}
			
			_rptFile.setManualClose(true);
			if (_rptFile instanceof MCCSVFile) {
				_rptFile.addWriteListener(createPFCSVFileWriterListner());
			}

			String charSet = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifProcTyp);
			if (!isNull(charSet)) {
				_rptFile.setCharset(charSet);
			}
		}
		
		/**
		 * ファイル出力する項目を変更する処理などを実行します<br>
		 */
		protected void changeOutputColums() {
			_columns = _ifL.getColumnPathArray();
			String[] header = null;
			List<String> list = new ArrayList<String>(Arrays.asList(_columns));
			List<String> displ = new ArrayList<String>();
			for (String str : list) {
				if(!Arrays.asList(_removeColumes).contains(str)){
					displ.add(str);
				}
			}
			header = (String[]) displ.toArray(new String[displ.size()]);

			String bibat = MAC_IF_PROC_TYP.bi_bat(_ifpt);
			if(!isSame(bibat, "MABCB0010")) {
				displ.add("IF_PROC_TYP");
				header = (String[]) displ.toArray(new String[displ.size()]);
			}
			_columns = header;
		}
		
		/**
		 * ＣＳＶファイルの項目の並び順を変更する
		 */
		protected void setCsvFmt(MCCSVFile csvRpt) {
			// １行目を見出し行として使用する場合はそれに従う。
			if (csvRpt == null || csvRpt.isHeading()) {
				return ;
			}
			
			String fmtPath = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH, _ifpt);
			if (isNull(fmtPath)) {
				return ;
			}
			
			File file = new File(fmtPath);
			if (!file.exists()) {
				throw new MCAppException(PFBZL0003, file.getParent(), file.getName());
			}
			else if (file.length() <= 0) {
				throw new MCAppException(PFBZL0011, _ifpt, file.getParent(), file.getName());
			}
			
			PFBZL_CSVFmt fmt = new PFBZL_CSVFmt();
			fmt.init();
			fmt.checkFmt(fmtPath, null);
			if (fmt.hasErr()) {
				MCAppException ex = new MCAppException(PFBZL0118, _extSysCd, _ifpt, file.getParent(), file.getName());
				ex.addCauseMessageList(fmt.getErrMsgList());
				throw ex;
			}
			_csvFmt = fmt;
			
		}
		
		protected MCFileWriteListener createPFCSVFileWriterListner() {
			return new PFCSVFileWriterListner();
		}

		/**
		 * ファイル出力時のイベントリスナークラス
		 */
		protected class PFCSVFileWriterListner extends MCFileWriteListener {
			protected HashMap<String, MCReportMeta[]> _csvHdrMetaArryMap = new HashMap<>();
			@Override
			public String writeHeadingLine(String heading, MCReportSet rset) {
				StringBuffer buff = new StringBuffer();
				MCReportMeta[] arr = rset.getReportMetaArray(0);
				int cnt = 0;
				for (int i = 0; i<arr.length; i++) {
					MCReportMeta rMeta = arr[i];
					if(!Arrays.asList(_removeColumes).contains(rMeta.getHeaderName())){
						if (cnt > 0) {
							buff.append(_rptFile.getDelimiter());
						}
						buff.append(rMeta.getHeaderName());
						cnt = 1;
					}
				}
				String bibat = MAC_IF_PROC_TYP.bi_bat(_ifpt);
				if(!isSame(bibat, "MABCB0010")) {
					buff.append(_rptFile.getDelimiter());
					buff.append("if_proc_typ");
				}
				return buff.toString();
			}
			@Override
			public MCReportMeta[] metaFix(MCReportMeta[] rMetas, int rowIndex, MCRow r, String rType) {
				if (_csvHdrMetaArryMap.containsKey(rType)) {
					return _csvHdrMetaArryMap.get(rType);
				}
				
				if (_csvFmt != null) {
					String[] header = _csvFmt.getHeader(rType);
					if (header != null) {
						MCReportMeta[] metas = createReportMeta(r, header);
						_csvHdrMetaArryMap.put(rType, metas);
						return metas;
					}
				}
				
				MCReportMeta[] rmetas = createReportMeta(r, _columns);
				
				for(MCReportMeta rMeta:rmetas) {
					String hName = rMeta.getHeaderName();
					String fmt =MCConst.app.getString(MCConst.createKey("PF","PFUDL5010","ConvBase08",_ifpt,hName,"format"));
					String dFmt =  MCConst.app.getString(MCConst.createKey("PF","PFUDL5010","ConvBase08",rMeta.type().toString(),"format"));
					if(fmt != null) {
						rMeta.setFormat(fmt);
					}
					else if(dFmt != null) {
						rMeta.setFormat(dFmt);
					}
					else {
						switch (rMeta.type()) {
							case DATE:
								rMeta.setFormat("YMD");
								break;
							case TIMESTAMP:
								rMeta.setFormat("YMDHMS");
								break;
						default:
							// 他のデータ型では何もしない
					}
					};
				}
				
				MCReportMeta[] metas = super.metaFix(rmetas, rowIndex, r, rType);
				_csvHdrMetaArryMap.put(rType, metas);
				return metas;
			}
			
			protected MCReportMeta[] createReportMeta(MCRow r, String[] header) {
				ArrayList<MCReportMeta> rMetaList = new ArrayList<MCReportMeta>();
				for(int i=0; i < header.length; i++) {
					MCReportMeta meta = _rptSet.getReportMeta(r, header[i]);
					if(meta != null) {
						rMetaList.add(meta);
					}
					else {
						rMetaList.add(new MCReportMeta(mcframe.commonMA.meta.MA_META.STR20, header[i], "", header[i], false));
					}
				}
				return rMetaList.toArray(new MCReportMeta[rMetaList.size()]);
			}
		}
		/**
		 * ファイル出力単位を生成します<br>
		 * 
		 * @param up 上り電文
		 * @return ファイル出力単位の分割キー
		 */
		protected String[] convSendIfLKey(MCList<SdrvDtlR> up) {
			List<String> kl = new ArrayList<>();
			kl.add(PFT_SDRV_IF_R.$if_proc_typ);
			kl.add(PFT_SDRV_IF_R.$ext_sys_cd);
			boolean isExtSys = isSame(mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys._send_file_grp_2, ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, _ifpt));
			if (isExtSys) {
				kl.add(PFT_SDRV_IF_R.$data_no);
			}
			return kl.toArray(new String[kl.size()]);
		}
		/**
		 * 送受信ワークに対象データを登録する<br>
		 * 
		 * @param dtlL 送受信ＩＦ
		 */
		protected void insSdrvIfWk(MCList<SdrvDtlR> dtlL) {
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.UpdWk01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtUpdWk01();
			UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> mapper = createUpdWk01_DtlR_SdrvDtlR();
			for (SdrvDtlR dtlR : dtlL) {
				mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR row = ope.up0().createRow();
				copy(row, dtlR, mapper);
				ope.up0().add(row);
			}
			ope.exec();
		}
		/**
		 * SdrvDtlR→UpdWk01_DtlRへ設定する<br>
		 * 
		 * @return
		 */
		protected UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR> createUpdWk01_DtlR_SdrvDtlR() {
			return new UpdWk01_DtlR_SdrvDtlR<mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, SdrvDtlR>();
		}
	
		public class UpdWk01_DtlR_SdrvDtlR<D extends mcframe.serverPFBZ.PFBZL9050.UpdWk01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.if_proc_typ(src.if_proc_typ());
				dest.data_no(src.data_no());
			}
		}
		/**
		 * 下り電文を設定する<br>
		 * @param ifL 送受信ＩＦ
		 * @param isErr エラーフラグ
		 */
		protected void setDown0(MCList<SdrvDtlR> ifL, boolean isErr) {
			if (isErr) {
				ifL.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_CONV_ERR.value());
			}
			else {
				for (SdrvDtlR dtlR : ifL) {
					dtlR.file_path(_file.getParent());
					dtlR.file_nm(_file.getName());
				}
				ifL.setString(PFT_SDRV_IF_R.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_CONV_OK.value());
			}
			down0().addAll(ifL);
		}
	}
	
	/***************** 共通処理　*******************/
	/**
	 * レポートセットの内容をＩＦテーブルへマッピングし、データを登録します<p>
	 * @param dtlR SdrvDtlR
	 * @param _IfRptSet IfRecvReportSet
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})  //MCListのGenerics定義
	protected void insRecvIf(SdrvDtlR dtlR, PFBZL_FileInput.IfRecvReportSet ifRptSet) {
		MCList dataL = MCList.create(ifRptSet.getReportSetClass());
		dataL.addAll(ifRptSet.getReportSet().getAll());

		MCList destL = ifRptSet.getIfL();
		addAll(destL, dataL, dtlR.sdrvIf(), ifRptSet.getMapper());
		
		MCQueryApiBuilder builder = ifRptSet.getBuilder(); 
		dbInsert(createSqlId(LOGIC_ID, builder.getBaseDbc(), "I03"), destL, builder);
	}

	/**
	 * 外部システム区分がＥＤＩ（ＭＣＦ）である外部システムＣＤを返す
	 * 
	 * @return
	 */
	protected String getExtSysCd() {
		MAM_EXT_SYS_R extSysR = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(extSysR);
		builder.setWhere(extSysR.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI_MCF.value())));
		dbSelect(createSqlId(LOGIC_ID, extSysR, "S05"), extSysR, builder);
		return extSysR.ext_sys_cd();
	}

	
	/***************** 共通処理ここまで　*******************/

	//FMCB CUSTOM END
}