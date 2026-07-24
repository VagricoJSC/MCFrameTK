package mcframe.serverMSBF.MSBFL5020;

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
 * "MSBFL_InspInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspInstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspInstService.InspInst_Srch01 aInspInst_Srch01;

	protected void initInspInst_Srch01() {
		this.info = PDef.MS_MSBFL5020_InspInst_Srch01_INFO;
		this.aInspInst_Srch01 = ((MSBFL_InspInstService)this).new InspInst_Srch01();
	}

	public static MSBFL_InspInstService.InspInst_Srch01 crtInspInst_Srch01() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Srch01();
		return lgc.aInspInst_Srch01;
	}

	protected void paramInspInst_Srch01(MCParam p) {
		if (this.aInspInst_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Srch01.up0());
		p.addDownBlock(aInspInst_Srch01.down0());
		p.addDownBlock(aInspInst_Srch01.down1());
	}

	protected void doInspInst_Srch01() {
		aInspInst_Srch01.call();
	};

	/**
	 * InspInst_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR createInspInst_Srch01_CndR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR.create();
	}

	/**
	 * InspInst_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR createInspInst_Srch01_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR.create();
	}

	/**
	 * InspInst_Srch01_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR createInspInst_Srch01_DtlStdR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR.create();
	}

	/**
	 * InspInst_Srch01_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR> createInspInst_Srch01_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR.class);
	}
	protected MSBFL_InspInstService.InspInst_Chk04 aInspInst_Chk04;

	protected void initInspInst_Chk04() {
		this.info = PDef.MS_MSBFL5020_InspInst_Chk04_INFO;
		this.aInspInst_Chk04 = ((MSBFL_InspInstService)this).new InspInst_Chk04();
	}

	public static MSBFL_InspInstService.InspInst_Chk04 crtInspInst_Chk04() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Chk04();
		return lgc.aInspInst_Chk04;
	}

	protected void paramInspInst_Chk04(MCParam p) {
		if (this.aInspInst_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Chk04.up0());
		p.addDownBlock(aInspInst_Chk04.down0());
	}

	protected void doInspInst_Chk04() {
		aInspInst_Chk04.call();
	};

	/**
	 * InspInst_Chk04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR createInspInst_Chk04_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.create();
	}

	/**
	 * InspInst_Chk04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> createInspInst_Chk04_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.class);
	}
	protected MSBFL_InspInstService.InspInst_Chk05 aInspInst_Chk05;

	protected void initInspInst_Chk05() {
		this.info = PDef.MS_MSBFL5020_InspInst_Chk05_INFO;
		this.aInspInst_Chk05 = ((MSBFL_InspInstService)this).new InspInst_Chk05();
	}

	public static MSBFL_InspInstService.InspInst_Chk05 crtInspInst_Chk05() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Chk05();
		return lgc.aInspInst_Chk05;
	}

	protected void paramInspInst_Chk05(MCParam p) {
		if (this.aInspInst_Chk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Chk05.up0());
		p.addDownBlock(aInspInst_Chk05.down0());
	}

	protected void doInspInst_Chk05() {
		aInspInst_Chk05.call();
	};

	/**
	 * InspInst_Chk05_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR createInspInst_Chk05_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.create();
	}

	/**
	 * InspInst_Chk05_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> createInspInst_Chk05_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.class);
	}
	protected MSBFL_InspInstService.InspInst_Ins01 aInspInst_Ins01;

	protected void initInspInst_Ins01() {
		this.info = PDef.MS_MSBFL5020_InspInst_Ins01_INFO;
		this.aInspInst_Ins01 = ((MSBFL_InspInstService)this).new InspInst_Ins01();
	}

	public static MSBFL_InspInstService.InspInst_Ins01 crtInspInst_Ins01() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Ins01();
		return lgc.aInspInst_Ins01;
	}

	protected void paramInspInst_Ins01(MCParam p) {
		if (this.aInspInst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Ins01.up0());
		p.addUpBlock(aInspInst_Ins01.up1());
		p.addUpBlock(aInspInst_Ins01.up2());
		p.addDownBlock(aInspInst_Ins01.down0());
		p.addDownBlock(aInspInst_Ins01.down1());
		p.addDownBlock(aInspInst_Ins01.down2());
	}

	protected void doInspInst_Ins01() {
		aInspInst_Ins01.call();
	};

	/**
	 * InspInst_Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR createInspInst_Ins01_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.create();
	}

	/**
	 * InspInst_Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> createInspInst_Ins01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.class);
	}

	/**
	 * InspInst_Ins01_RsltStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR createInspInst_Ins01_RsltStdR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.create();
	}

	/**
	 * InspInst_Ins01_RsltStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> createInspInst_Ins01_RsltStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.class);
	}

	/**
	 * InspInst_Ins01_RsltSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR createInspInst_Ins01_RsltSchdR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.create();
	}

	/**
	 * InspInst_Ins01_RsltSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> createInspInst_Ins01_RsltSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.class);
	}
	protected MSBFL_InspInstService.InspInst_Upd01 aInspInst_Upd01;

	protected void initInspInst_Upd01() {
		this.info = PDef.MS_MSBFL5020_InspInst_Upd01_INFO;
		this.aInspInst_Upd01 = ((MSBFL_InspInstService)this).new InspInst_Upd01();
	}

	public static MSBFL_InspInstService.InspInst_Upd01 crtInspInst_Upd01() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Upd01();
		return lgc.aInspInst_Upd01;
	}

	protected void paramInspInst_Upd01(MCParam p) {
		if (this.aInspInst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Upd01.up0());
		p.addUpBlock(aInspInst_Upd01.up1());
		p.addUpBlock(aInspInst_Upd01.up2());
		p.addDownBlock(aInspInst_Upd01.down0());
		p.addDownBlock(aInspInst_Upd01.down1());
		p.addDownBlock(aInspInst_Upd01.down2());
	}

	protected void doInspInst_Upd01() {
		aInspInst_Upd01.call();
	};

	/**
	 * InspInst_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR createInspInst_Upd01_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.create();
	}

	/**
	 * InspInst_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> createInspInst_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.class);
	}

	/**
	 * InspInst_Upd01_RsltStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR createInspInst_Upd01_RsltStdR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.create();
	}

	/**
	 * InspInst_Upd01_RsltStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> createInspInst_Upd01_RsltStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.class);
	}

	/**
	 * InspInst_Upd01_RsltSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR createInspInst_Upd01_RsltSchdR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.create();
	}

	/**
	 * InspInst_Upd01_RsltSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> createInspInst_Upd01_RsltSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.class);
	}
	protected MSBFL_InspInstService.InspInst_Upd02 aInspInst_Upd02;

	protected void initInspInst_Upd02() {
		this.info = PDef.MS_MSBFL5020_InspInst_Upd02_INFO;
		this.aInspInst_Upd02 = ((MSBFL_InspInstService)this).new InspInst_Upd02();
	}

	public static MSBFL_InspInstService.InspInst_Upd02 crtInspInst_Upd02() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Upd02();
		return lgc.aInspInst_Upd02;
	}

	protected void paramInspInst_Upd02(MCParam p) {
		if (this.aInspInst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Upd02.up0());
		p.addDownBlock(aInspInst_Upd02.down0());
	}

	protected void doInspInst_Upd02() {
		aInspInst_Upd02.call();
	};

	/**
	 * InspInst_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR createInspInst_Upd02_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.create();
	}

	/**
	 * InspInst_Upd02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> createInspInst_Upd02_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.class);
	}
	protected MSBFL_InspInstService.InspInst_Del01 aInspInst_Del01;

	protected void initInspInst_Del01() {
		this.info = PDef.MS_MSBFL5020_InspInst_Del01_INFO;
		this.aInspInst_Del01 = ((MSBFL_InspInstService)this).new InspInst_Del01();
	}

	public static MSBFL_InspInstService.InspInst_Del01 crtInspInst_Del01() {
		MSBFL_InspInstService lgc = new MSBFL_InspInstService();
		lgc.initInspInst_Del01();
		return lgc.aInspInst_Del01;
	}

	protected void paramInspInst_Del01(MCParam p) {
		if (this.aInspInst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspInst_Del01.up0());
		p.addDownBlock(aInspInst_Del01.down0());
	}

	protected void doInspInst_Del01() {
		aInspInst_Del01.call();
	};

	/**
	 * InspInst_Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR createInspInst_Del01_RsltR(){
		return mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.create();
	}

	/**
	 * InspInst_Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> createInspInst_Del01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspInst_Srch01オペレーション.<p>
	 *
	 * 品目検査、品目パタン、品目規格情報を再取得する。<br>
	 */
	abstract public class InspInst_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR> down1;
		
		
		// コンストラクタ
		protected InspInst_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * InspInst_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR createInspInst_Srch01_CndR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR.create();
		}

		/**
		 * InspInst_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR createInspInst_Srch01_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR.create();
		}

		/**
		 * InspInst_Srch01_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR createInspInst_Srch01_DtlStdR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR.create();
		}

		/**
		 * InspInst_Srch01_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR> createInspInst_Srch01_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_RsltR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Srch01_DtlStdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Chk04オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	abstract public class InspInst_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected InspInst_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.class);

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
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspInst_Chk04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR createInspInst_Chk04_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.create();
		}

		/**
		 * InspInst_Chk04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> createInspInst_Chk04_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> up0() {
			return up0;
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
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Chk05オペレーション.<p>
	 *
	 * 検査指図の更新・取消・承認取消の共通チェック処理<br>
	 */
	abstract public class InspInst_Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> down0;
		
		
		// コンストラクタ
		protected InspInst_Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.class);

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
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspInst_Chk05_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR createInspInst_Chk05_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.create();
		}

		/**
		 * InspInst_Chk05_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> createInspInst_Chk05_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> up0() {
			return up0;
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
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Chk05_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Ins01オペレーション.<p>
	 *
	 * 検査指図情報を作成する。<br>
	 */
	abstract public class InspInst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> down2;
		
		
		// コンストラクタ
		protected InspInst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspInst_Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR createInspInst_Ins01_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.create();
		}

		/**
		 * InspInst_Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> createInspInst_Ins01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR.class);
		}

		/**
		 * InspInst_Ins01_RsltStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR createInspInst_Ins01_RsltStdR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.create();
		}

		/**
		 * InspInst_Ins01_RsltStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> createInspInst_Ins01_RsltStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR.class);
		}

		/**
		 * InspInst_Ins01_RsltSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR createInspInst_Ins01_RsltSchdR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.create();
		}

		/**
		 * InspInst_Ins01_RsltSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> createInspInst_Ins01_RsltSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>add_point_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltStdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Ins01_RsltSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Upd01オペレーション.<p>
	 *
	 * 検査指図情報を更新する。<br>
	 */
	abstract public class InspInst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> down2;
		
		
		// コンストラクタ
		protected InspInst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspInst_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR createInspInst_Upd01_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.create();
		}

		/**
		 * InspInst_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> createInspInst_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR.class);
		}

		/**
		 * InspInst_Upd01_RsltStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR createInspInst_Upd01_RsltStdR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.create();
		}

		/**
		 * InspInst_Upd01_RsltStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> createInspInst_Upd01_RsltStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR.class);
		}

		/**
		 * InspInst_Upd01_RsltSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR createInspInst_Upd01_RsltSchdR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.create();
		}

		/**
		 * InspInst_Upd01_RsltSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> createInspInst_Upd01_RsltSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>add_point_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltStdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no_hdr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd01_RsltSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Upd02オペレーション.<p>
	 *
	 * 検査指図を承認する。<br>
	 */
	abstract public class InspInst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> down0;
		
		
		// コンストラクタ
		protected InspInst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.class);

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
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspInst_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR createInspInst_Upd02_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.create();
		}

		/**
		 * InspInst_Upd02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> createInspInst_Upd02_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Upd02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}
	/**
	 * InspInst_Del01オペレーション.<p>
	 *
	 * 検査指図を取り消す。<br>
	 */
	abstract public class InspInst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspInst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> down0;
		
		
		// コンストラクタ
		protected InspInst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.class);

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
			invoke((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspInst_Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR createInspInst_Del01_RsltR(){
			return mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.create();
		}

		/**
		 * InspInst_Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> createInspInst_Del01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5020.InspInst_Del01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstService)MSBFL_InspInstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}