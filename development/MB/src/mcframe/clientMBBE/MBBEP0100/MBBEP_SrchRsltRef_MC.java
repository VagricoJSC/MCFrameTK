package mcframe.clientMBBE.MBBEP0100;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0110.FXBAP_ListListener;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_SrchRsltRef"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_SrchRsltRef_MC extends MBBEP_SrchRsltRef_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 *  追加した動的カラムの保持
	 */
	protected List<MCColumnConfig> _ccList = new ArrayList<>();
	protected boolean _dispHms = mcframe.clientCore.resource.MCConst.app.getBoolean("MB.MBBEP0060.fmt.date.disp_hms", false);
	/**
	 *  カラムを移動したか否か
	 */
	protected boolean _moveColFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_SrchRsltRef_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_SrchRsltRef_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Caller<P extends MBBEP_SrchRsltRef, B extends MB_MBBEL0040_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0040_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			saveCndValue();
			setDLMode();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			CndR c = getCndR().clone();
			c.bind(c.getStringNE("bind"));
			param().getContainerParam().up().set(0, c);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setREFStatus();
		}
		protected String[] _lblL;
		protected String[] _typL;
		protected String[] _colL;
		protected String[] _sortL;

		@Override
		protected void afterCall() {
			super.afterCall();

			_lblL = MCStringUtil.arrayValueSplit(bridge.down1().add_col_lbl());
			_typL = MCStringUtil.arrayValueSplit(bridge.down1().add_col_typ());
			_colL = MCStringUtil.arrayValueSplit(bridge.down1().add_col_nm());
			_sortL = MCStringUtil.arrayValueSplit(bridge.down1().sort_info());
			if (_lblL.length == 0) {
				return ;
			}

			// MCListに対するaddColumn（カラムの幅調整のために必要）
			for (int i = 0; i < _colL.length; i++) {
				addColumn(_typL[i], _colL[i]);
			}
			// 追加分データの変換と設定
			for (RsltR r : bridge.down0()) {
				String[] x = MCStringUtil.arrayValueSplit(r.add_col_data());

				// 追加分データが１つかつnullの場合の対応
				if (x.length == 0 && _colL.length == 1) {
					x = new String[] {null};
				}

				for (int i = 0; i < x.length; i++) {
					setConvValue(x[i], _typL[i], _colL[i], r);
				}
			}
		}
		protected void addColumn(String typ, String nm) {
			switch (typ) {
				case "N":
					getRsltL().addNumberColumn(nm);
					break;
				case "D":
					getRsltL().addDateColumn(nm);
					break;
				default:
					getRsltL().addStringColumn(nm);
			}
		}
		protected void setConvValue(String val, String typ, String nm, RsltR r) {
			switch (typ) {
				case "N":
					MCNumber n = isNull(val) ? null : MCNumber.valueOf(val);
					r.setNumberNE(nm, n);
					break;
				case "D":
					MCDate d = isNull(val) ? null : MCDate.valueOf(val, "yyyyMMddHHmmss");
					r.setDateNE(nm, d);
					break;
				default:
					r.setStringNE(nm, val);
			}
		}
		@Override
		protected void show() {
			// 前回追加した動的カラムを削除
			for (MCColumnConfig column : _ccList) {
				RsltTable.removeColumnConfig(column);
			}
			_ccList = new ArrayList<>();

			// 動的カラムの追加
			for (int i = 0; i < _lblL.length; i++) {
				String nm = _colL[i];

				MCColumnConfig c = null;
				MCColumnType clmTyp = getMCColumnType(_typL[i]);
				mcframe.commonCore.meta.MCMeta metaClm = getMCMeta(_typL[i], nm);
				c = beansFactory.createTableColumn("Rslt." + nm, clmTyp);
				c.setMeta(metaClm);
				c.addAllListener(MBBEP_SrchRsltRef_MC.this);
				c.setListListener(MBBEP_SrchRsltRef_MC.this);
				if (_dispHms && isSame(_typL[i], "D")) {
					c.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
				}

				RsltTable.addColumnConfig(c);
				_ccList.add(c);
				
				String header = _lblL[i];
				c.setHeaderName(header);
				c.setHeaderMessage(header);
				c.putMode(MBBEP_SrchRsltRef_MC.this, REF, MCMode.READ_ONLY);
				c.putMode(MBBEP_SrchRsltRef_MC.this, SRCH, MCMode.READ_ONLY);
			}

			if (_sortL.length > 1 && !_moveColFlg) {
				MCColumnConfig firstCol = RsltTable.getColumnConfig("Rslt."+_sortL[0]);
				List<MCColumnConfig> colL = new ArrayList<MCColumnConfig>();
				for (int i=1; i < _sortL.length; i++) {
					colL.add(RsltTable.getColumnConfig("Rslt."+_sortL[i]));
				}
				for (MCColumnConfig col : colL) {
					RsltTable.moveColumns(firstCol, col);
					firstCol = col;
				}
				_moveColFlg = true;
			}
			RsltTable.updateResource();
			RsltTable.initialized();

			super.show();

			// コンポーネントを動的に追加しているため、呼び出す必要がある
			RsltTable.validate();
		}
		protected MCColumnType getMCColumnType(String typ) {
			switch (typ) {
				case "N":
					return MCColumnType.NUMBER;
				case "D":
					return MCColumnType.DATE;
				default:
					return MCColumnType.TEXT;
			}
		}
		protected mcframe.commonCore.meta.MCMeta getMCMeta(String typ, String nm) {
			switch (typ) {
				case "N":
					return mcframe.commonCore.meta.MCMeta.createNumberMeta(nm, nm, 21, 8, true);
				case "D":
					return mcframe.commonCore.meta.MCMeta.createDateMeta(nm, nm);
				default:
					return mcframe.commonCore.meta.MCMeta.createStringMeta(nm, nm);
			}
		}

		@Override
		protected String getDLBziDatDlId() {
			return getCndR().biz_dat_id();
		}

		@Override
		protected String getDLBziDatDlNm() {
			return getCndR().biz_dat_nm();
		}
	}
	@Override
	protected void setTableConfig() {
		super.setTableConfig();
		if (_dispHms) {
			for (MCColumnConfig cc : RsltTable.getColumnConfigs()) {
				if (cc.getDataType().isDateType()) {
					cc.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
				}
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMB_MBBEL0040_Prnt01();
	}

	/**
	 * Panel[Cnd]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doCnd_dwnld(MCEventInfo info) {
		createMB_MBBEL0040_Prnt01().execDL();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		RsltTable.addListListener(createRsltListListener());
	}

	/**
	 * RsltTable用ListListenerです。
	 * 
	 * @return RsltListListener
	 */
	protected MCListListener createRsltListListener() {
		return new RsltListListener();
	}

	/**
	 * DtlTable用ListListenerクラスです。
	 */
	public class RsltListListener extends FXBAP_ListListener {

		@Override
		public void rowAdded(MCListEvent event) {
			super.rowAdded(event);
			RsltTable.adjustWidth();
		}
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		conf.ignoreSrchCnd(true);//検索条件設定
		return conf;
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		dispRow();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		dispRow();

	}

	protected CndR _cndR = null;

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <P><li>起動タイプ：T1<br>
	 * バインド値＜必須＞<br>
	 * <table border = 1>
	 * <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	 * <tr><td>biz_dat_id</td><td>String</td><td></td></tr>
	 * <tr><td>biz_dat_nm</td><td>String</td><td></td></tr>
	 * <tr><td>bind</td><td>String</td><td></td></tr>
	 * <tr><td>sql_src</td><td>String</td><td></td></tr>
	 * </table><br>
	 * その他の引数：なし
	 * </li></P>
	 *  
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 * </P>
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		// 検索ＳＱＬ登録、業務データＤＬ実行からの連携時
		if (T1 == openTyp) {

			Cnd_biz_dat_id.setValue(bind.getStringNE("biz_dat_id"));
			if (!isNull(bind.getStringNE("biz_dat_nm"))) {
				Cnd_biz_dat_nm.setValue(bind.getStringNE("biz_dat_nm"));
			}
			getCndR().bind(bind.getStringNE("bind"));
			getCndR().sql_src(bind.getStringNE("sql_src"));
			addDoBehind(Cnd_srch);
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}

	@Override
	public MCCaller<?, ?> getMiningCaller() {
		// ＳＱＬを保持している場合、登録前のＳＱＬを表示しているとみなし、ガジェット作成できないようにする
		if (!isNull(getCndR().sql_src())) {
			return null;
		}
		return super.getMiningCaller();
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		if (_cndR != null) {
			MCRow.copyvalue(getCndR(), _cndR);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		// 業務データＩＤやＳＱＬが連携されていない場合（＝ガジェットから遷移した場合）は、検索処理は実行しない
		if (isNull(getCndR().biz_dat_id()) && isNull(getCndR().sql_src())) {
			return;
		}
		callMB_MBBEL0040_Prnt01();
	}

	protected void saveCndValue() {
		// 画面遷移で引き継いだ値を保持する
		_cndR = getCndR().clone();
	}

	protected void dispRow() {
		for (String col : RsltR.colnames()) {
			String lbl = getRsltLblR().getStringNE(col + "_lbl");

			MCColumnConfig c = RsltTable.getColumnConfig(RsltR.create().getMeta(col));
			if (c == null) {
				continue ;
			}
			// ラベルがない場合は非表示
			if (isNull(lbl)) {
				c.setMode(MCMode.INVISIBLE);
				c.setHeaderName(null);
				c.setMessageName(null);
			}
			else {
				c.setMode(MCMode.READ_ONLY);
				c.setHeaderName(lbl);
				c.setMessageName(lbl);
			}
		}
	}

}