package mcframe.serverMSBE.MSBEL5200;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_XfrSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_XfrSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_XfrSchdService.XfrSchd_Chk02 aXfrSchd_Chk02;

	protected void initXfrSchd_Chk02() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Chk02_INFO;
		this.aXfrSchd_Chk02 = ((MSBEL_XfrSchdService)this).new XfrSchd_Chk02();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Chk02 crtXfrSchd_Chk02() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Chk02();
		return lgc.aXfrSchd_Chk02;
	}

	protected void paramXfrSchd_Chk02(MCParam p) {
		if (this.aXfrSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Chk02.up0());
		p.addUpBlock(aXfrSchd_Chk02.up1());
		p.addDownBlock(aXfrSchd_Chk02.down0());
		p.addDownBlock(aXfrSchd_Chk02.down1());
	}

	protected void doXfrSchd_Chk02() {
		aXfrSchd_Chk02.call();
	};

	/**
	 * XfrSchdChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR createXfrSchdChk02_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.create();
	}

	/**
	 * XfrSchdChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> createXfrSchdChk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.class);
	}

	/**
	 * XfrSchdChk02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR createXfrSchdChk02_CtrlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR.create();
	}

	/**
	 * XfrSchdChk02_AllocRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR createXfrSchdChk02_AllocRsltR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR.create();
	}

	/**
	 * XfrSchdChk02_AllocRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR> createXfrSchdChk02_AllocRsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR.class);
	}
	protected MSBEL_XfrSchdService.XfrSchd_Chk04 aXfrSchd_Chk04;

	protected void initXfrSchd_Chk04() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Chk04_INFO;
		this.aXfrSchd_Chk04 = ((MSBEL_XfrSchdService)this).new XfrSchd_Chk04();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Chk04 crtXfrSchd_Chk04() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Chk04();
		return lgc.aXfrSchd_Chk04;
	}

	protected void paramXfrSchd_Chk04(MCParam p) {
		if (this.aXfrSchd_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Chk04.up0());
		p.addUpBlock(aXfrSchd_Chk04.up1());
		p.addDownBlock(aXfrSchd_Chk04.down0());
		p.addDownBlock(aXfrSchd_Chk04.down1());
	}

	protected void doXfrSchd_Chk04() {
		aXfrSchd_Chk04.call();
	};

	/**
	 * XfrSchdChk04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchdChk04_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
	}

	/**
	 * XfrSchdChk04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchdChk04_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
	}

	/**
	 * XfrSchdChk04_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR createXfrSchdChk04_CtrlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR.create();
	}

	/**
	 * XfrSchdChk04_AllocRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchdChk04_AllocRsltR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
	}

	/**
	 * XfrSchdChk04_AllocRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchdChk04_AllocRsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
	}
	protected MSBEL_XfrSchdService.XfrSchd_Upd01 aXfrSchd_Upd01;

	protected void initXfrSchd_Upd01() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Upd01_INFO;
		this.aXfrSchd_Upd01 = ((MSBEL_XfrSchdService)this).new XfrSchd_Upd01();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Upd01 crtXfrSchd_Upd01() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Upd01();
		return lgc.aXfrSchd_Upd01;
	}

	protected void paramXfrSchd_Upd01(MCParam p) {
		if (this.aXfrSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Upd01.up0());
		p.addUpBlock(aXfrSchd_Upd01.up1());
		p.addUpBlock(aXfrSchd_Upd01.up2());
		p.addDownBlock(aXfrSchd_Upd01.down0());
	}

	protected void doXfrSchd_Upd01() {
		aXfrSchd_Upd01.call();
	};

	/**
	 * XfrSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR createXfrSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.create();
	}

	/**
	 * XfrSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> createXfrSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.class);
	}

	/**
	 * XfrSchd_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR createXfrSchd_CtrlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR.create();
	}

	/**
	 * XfrSchd_AllocRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchd_AllocRsltR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
	}

	/**
	 * XfrSchd_AllocRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchd_AllocRsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
	}
	protected MSBEL_XfrSchdService.XfrSchd_Upd02 aXfrSchd_Upd02;

	protected void initXfrSchd_Upd02() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Upd02_INFO;
		this.aXfrSchd_Upd02 = ((MSBEL_XfrSchdService)this).new XfrSchd_Upd02();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Upd02 crtXfrSchd_Upd02() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Upd02();
		return lgc.aXfrSchd_Upd02;
	}

	protected void paramXfrSchd_Upd02(MCParam p) {
		if (this.aXfrSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Upd02.up0());
		p.addUpBlock(aXfrSchd_Upd02.up1());
		p.addDownBlock(aXfrSchd_Upd02.down0());
	}

	protected void doXfrSchd_Upd02() {
		aXfrSchd_Upd02.call();
	};

	/**
	 * XfrPr_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR createXfrPr_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.create();
	}

	/**
	 * XfrPr_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> createXfrPr_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.class);
	}

	/**
	 * XfrPr_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR createXfrPr_CtrlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR.create();
	}
	protected MSBEL_XfrSchdService.XfrSchd_Upd03 aXfrSchd_Upd03;

	protected void initXfrSchd_Upd03() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Upd03_INFO;
		this.aXfrSchd_Upd03 = ((MSBEL_XfrSchdService)this).new XfrSchd_Upd03();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Upd03 crtXfrSchd_Upd03() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Upd03();
		return lgc.aXfrSchd_Upd03;
	}

	protected void paramXfrSchd_Upd03(MCParam p) {
		if (this.aXfrSchd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Upd03.up0());
	}

	protected void doXfrSchd_Upd03() {
		aXfrSchd_Upd03.call();
	};

	/**
	 * XfrSchdMod_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR createXfrSchdMod_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR.create();
	}

	/**
	 * XfrSchdMod_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR> createXfrSchdMod_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR.class);
	}
	protected MSBEL_XfrSchdService.XfrSchd_Sprt01 aXfrSchd_Sprt01;

	protected void initXfrSchd_Sprt01() {
		this.info = PDef.MS_MSBEL5200_XfrSchd_Sprt01_INFO;
		this.aXfrSchd_Sprt01 = ((MSBEL_XfrSchdService)this).new XfrSchd_Sprt01();
	}

	public static MSBEL_XfrSchdService.XfrSchd_Sprt01 crtXfrSchd_Sprt01() {
		MSBEL_XfrSchdService lgc = new MSBEL_XfrSchdService();
		lgc.initXfrSchd_Sprt01();
		return lgc.aXfrSchd_Sprt01;
	}

	protected void paramXfrSchd_Sprt01(MCParam p) {
		if (this.aXfrSchd_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrSchd_Sprt01.up0());
		p.addDownBlock(aXfrSchd_Sprt01.down0());
	}

	protected void doXfrSchd_Sprt01() {
		aXfrSchd_Sprt01.call();
	};

	/**
	 * XfrSchdEx_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR createXfrSchdEx_DtlR(){
		return mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.create();
	}

	/**
	 * XfrSchdEx_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> createXfrSchdEx_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrSchd_Chk02オペレーション.<p>
	 *
	 * 更新対象の移動引当状況の進捗をチェックする。<br>
	 */
	abstract public class XfrSchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR> down1;
		
		
		// コンストラクタ
		protected XfrSchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrSchdChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR createXfrSchdChk02_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.create();
		}

		/**
		 * XfrSchdChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> createXfrSchdChk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR.class);
		}

		/**
		 * XfrSchdChk02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR createXfrSchdChk02_CtrlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR.create();
		}

		/**
		 * XfrSchdChk02_AllocRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR createXfrSchdChk02_AllocRsltR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR.create();
		}

		/**
		 * XfrSchdChk02_AllocRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR> createXfrSchdChk02_AllocRsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xas.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xas.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ret_xrate</td></tr>
		 * 	<tr><td><br></td><td>ret_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ret_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inst_rem_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>re_call_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}
	/**
	 * XfrSchd_Chk04オペレーション.<p>
	 *
	 * 更新対象の移動・移送予定の進捗をチェックする。配送先が定まるかをチェックする。<br>
	 */
	abstract public class XfrSchd_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> down1;
		
		
		// コンストラクタ
		protected XfrSchd_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrSchdChk04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchdChk04_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
		}

		/**
		 * XfrSchdChk04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchdChk04_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
		}

		/**
		 * XfrSchdChk04_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR createXfrSchdChk04_CtrlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR.create();
		}

		/**
		 * XfrSchdChk04_AllocRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchdChk04_AllocRsltR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
		}

		/**
		 * XfrSchdChk04_AllocRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchdChk04_AllocRsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_no</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xs.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>xs.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xs.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xs.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xs.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_check_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xs.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}
	/**
	 * XfrSchd_Upd01オペレーション.<p>
	 *
	 * 移動・移送予定にデータを登録する。移動・移送予定のデータを更新・削除する。<br>
	 */
	abstract public class XfrSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected XfrSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR.create();
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR createXfrSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.create();
		}

		/**
		 * XfrSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> createXfrSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR.class);
		}

		/**
		 * XfrSchd_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR createXfrSchd_CtrlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR.create();
		}

		/**
		 * XfrSchd_AllocRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR createXfrSchd_AllocRsltR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.create();
		}

		/**
		 * XfrSchd_AllocRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> createXfrSchd_AllocRsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_no</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xs.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xs.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>xs.gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>xs.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>xs.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>xs.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xs.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xs.inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xs.slo_no</td></tr>
		 * 	<tr><td><br></td><td>xs.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xs.cont_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.rqst_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.rqst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xs.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xs.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xs.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xs.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xs.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xs.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xs.rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xs.ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xs.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xs.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xs.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xs.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchd_CtrlR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xs.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xs.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xs.sno1</td></tr>
		 * 	<tr><td><br></td><td>xs.sno2</td></tr>
		 * 	<tr><td><br></td><td>xs.sno3</td></tr>
		 * 	<tr><td><br></td><td>xs.sno4</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xs.base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>xs.xfr_src_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}
	/**
	 * XfrSchd_Upd02オペレーション.<p>
	 *
	 * 移動引当状況にデータを登録する。移動引当状況のデータを更新・削除する。<br>
	 */
	abstract public class XfrSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> down0;
		
		
		// コンストラクタ
		protected XfrSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrPr_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR createXfrPr_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.create();
		}

		/**
		 * XfrPr_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> createXfrPr_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR.class);
		}

		/**
		 * XfrPr_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR createXfrPr_CtrlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xas.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xas.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.act_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xas.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xas.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>xs.ret_wtax_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>re_call_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrPr_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}
	/**
	 * XfrSchd_Upd03オペレーション.<p>
	 *
	 * 移動・移送予定の依頼元訂正ＦＬＧを更新する。<br>
	 */
	abstract public class XfrSchd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR> up0;
		
		
		// コンストラクタ
		protected XfrSchd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XfrSchdMod_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR createXfrSchdMod_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR.create();
		}

		/**
		 * XfrSchdMod_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR> createXfrSchdMod_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_src_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdMod_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}
	/**
	 * XfrSchd_Sprt01オペレーション.<p>
	 *
	 * 輸出の場合に配送先や輸出完了予定日を計算する。<br>
	 */
	abstract public class XfrSchd_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrSchd_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> down0;
		
		
		// コンストラクタ
		protected XfrSchd_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrSchdEx_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR createXfrSchdEx_DtlR(){
			return mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.create();
		}

		/**
		 * XfrSchdEx_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> createXfrSchdEx_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrSchdService)MSBEL_XfrSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}