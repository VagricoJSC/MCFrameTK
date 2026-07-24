package mcframe.serverMSBF.MSBFL5030;

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
 * "MSBFL_StdInspActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_StdInspActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_StdInspActService.StdInspAct_Chk01 aStdInspAct_Chk01;

	protected void initStdInspAct_Chk01() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Chk01_INFO;
		this.aStdInspAct_Chk01 = ((MSBFL_StdInspActService)this).new StdInspAct_Chk01();
	}

	public static MSBFL_StdInspActService.StdInspAct_Chk01 crtStdInspAct_Chk01() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Chk01();
		return lgc.aStdInspAct_Chk01;
	}

	protected void paramStdInspAct_Chk01(MCParam p) {
		if (this.aStdInspAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Chk01.up0());
		p.addUpBlock(aStdInspAct_Chk01.up1());
		p.addDownBlock(aStdInspAct_Chk01.down0());
		p.addDownBlock(aStdInspAct_Chk01.down1());
	}

	protected void doStdInspAct_Chk01() {
		aStdInspAct_Chk01.call();
	};

	/**
	 * StdInspAct_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR createStdInspAct_Chk01_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.create();
	}

	/**
	 * StdInspAct_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> createStdInspAct_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
	}

	/**
	 * StdInspAct_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR createStdInspAct_Chk01_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.create();
	}

	/**
	 * StdInspAct_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> createStdInspAct_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
	}
	protected MSBFL_StdInspActService.StdInspAct_Chk02 aStdInspAct_Chk02;

	protected void initStdInspAct_Chk02() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Chk02_INFO;
		this.aStdInspAct_Chk02 = ((MSBFL_StdInspActService)this).new StdInspAct_Chk02();
	}

	public static MSBFL_StdInspActService.StdInspAct_Chk02 crtStdInspAct_Chk02() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Chk02();
		return lgc.aStdInspAct_Chk02;
	}

	protected void paramStdInspAct_Chk02(MCParam p) {
		if (this.aStdInspAct_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Chk02.up0());
		p.addUpBlock(aStdInspAct_Chk02.up1());
		p.addDownBlock(aStdInspAct_Chk02.down0());
		p.addDownBlock(aStdInspAct_Chk02.down1());
	}

	protected void doStdInspAct_Chk02() {
		aStdInspAct_Chk02.call();
	};

	/**
	 * StdInspAct_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR createStdInspAct_Chk02_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.create();
	}

	/**
	 * StdInspAct_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> createStdInspAct_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
	}

	/**
	 * StdInspAct_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR createStdInspAct_Chk02_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.create();
	}

	/**
	 * StdInspAct_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> createStdInspAct_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);
	}
	protected MSBFL_StdInspActService.StdInspAct_Chk03 aStdInspAct_Chk03;

	protected void initStdInspAct_Chk03() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Chk03_INFO;
		this.aStdInspAct_Chk03 = ((MSBFL_StdInspActService)this).new StdInspAct_Chk03();
	}

	public static MSBFL_StdInspActService.StdInspAct_Chk03 crtStdInspAct_Chk03() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Chk03();
		return lgc.aStdInspAct_Chk03;
	}

	protected void paramStdInspAct_Chk03(MCParam p) {
		if (this.aStdInspAct_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Chk03.up0());
		p.addUpBlock(aStdInspAct_Chk03.up1());
		p.addDownBlock(aStdInspAct_Chk03.down0());
		p.addDownBlock(aStdInspAct_Chk03.down1());
	}

	protected void doStdInspAct_Chk03() {
		aStdInspAct_Chk03.call();
	};

	/**
	 * StdInspAct_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR createStdInspAct_Chk03_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.create();
	}

	/**
	 * StdInspAct_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> createStdInspAct_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
	}

	/**
	 * StdInspAct_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR createStdInspAct_Chk03_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.create();
	}

	/**
	 * StdInspAct_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> createStdInspAct_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);
	}
	protected MSBFL_StdInspActService.StdInspAct_Upd01 aStdInspAct_Upd01;

	protected void initStdInspAct_Upd01() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Upd01_INFO;
		this.aStdInspAct_Upd01 = ((MSBFL_StdInspActService)this).new StdInspAct_Upd01();
	}

	public static MSBFL_StdInspActService.StdInspAct_Upd01 crtStdInspAct_Upd01() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Upd01();
		return lgc.aStdInspAct_Upd01;
	}

	protected void paramStdInspAct_Upd01(MCParam p) {
		if (this.aStdInspAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Upd01.up0());
		p.addUpBlock(aStdInspAct_Upd01.up1());
		p.addDownBlock(aStdInspAct_Upd01.down0());
	}

	protected void doStdInspAct_Upd01() {
		aStdInspAct_Upd01.call();
	};

	/**
	 * StdInspAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR createStdInspAct_Upd01_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.create();
	}

	/**
	 * StdInspAct_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> createStdInspAct_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
	}

	/**
	 * StdInspAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR createStdInspAct_Upd01_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.create();
	}

	/**
	 * StdInspAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> createStdInspAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
	}
	protected MSBFL_StdInspActService.StdInspAct_Upd02 aStdInspAct_Upd02;

	protected void initStdInspAct_Upd02() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Upd02_INFO;
		this.aStdInspAct_Upd02 = ((MSBFL_StdInspActService)this).new StdInspAct_Upd02();
	}

	public static MSBFL_StdInspActService.StdInspAct_Upd02 crtStdInspAct_Upd02() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Upd02();
		return lgc.aStdInspAct_Upd02;
	}

	protected void paramStdInspAct_Upd02(MCParam p) {
		if (this.aStdInspAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Upd02.up0());
		p.addUpBlock(aStdInspAct_Upd02.up1());
	}

	protected void doStdInspAct_Upd02() {
		aStdInspAct_Upd02.call();
	};

	/**
	 * StdInspAct_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR createStdInspAct_Upd02_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.create();
	}

	/**
	 * StdInspAct_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> createStdInspAct_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
	}

	/**
	 * StdInspAct_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR createStdInspAct_Upd02_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.create();
	}

	/**
	 * StdInspAct_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> createStdInspAct_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);
	}
	protected MSBFL_StdInspActService.StdInspAct_Del01 aStdInspAct_Del01;

	protected void initStdInspAct_Del01() {
		this.info = PDef.MS_MSBFL5030_StdInspAct_Del01_INFO;
		this.aStdInspAct_Del01 = ((MSBFL_StdInspActService)this).new StdInspAct_Del01();
	}

	public static MSBFL_StdInspActService.StdInspAct_Del01 crtStdInspAct_Del01() {
		MSBFL_StdInspActService lgc = new MSBFL_StdInspActService();
		lgc.initStdInspAct_Del01();
		return lgc.aStdInspAct_Del01;
	}

	protected void paramStdInspAct_Del01(MCParam p) {
		if (this.aStdInspAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdInspAct_Del01.up0());
		p.addUpBlock(aStdInspAct_Del01.up1());
	}

	protected void doStdInspAct_Del01() {
		aStdInspAct_Del01.call();
	};

	/**
	 * StdInspAct_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR createStdInspAct_Del01_HdrR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.create();
	}

	/**
	 * StdInspAct_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> createStdInspAct_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
	}

	/**
	 * StdInspAct_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR createStdInspAct_Del01_DtlR(){
		return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.create();
	}

	/**
	 * StdInspAct_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> createStdInspAct_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StdInspAct_Chk01オペレーション.<p>
	 *
	 * 登録・更新前チェックを行う。<br>
	 */
	abstract public class StdInspAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected StdInspAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);

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
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * StdInspAct_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR createStdInspAct_Chk01_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.create();
		}

		/**
		 * StdInspAct_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> createStdInspAct_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
		}

		/**
		 * StdInspAct_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR createStdInspAct_Chk01_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.create();
		}

		/**
		 * StdInspAct_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> createStdInspAct_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}
	/**
	 * StdInspAct_Chk02オペレーション.<p>
	 *
	 * 確認前チェックを行う。<br>
	 */
	abstract public class StdInspAct_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> down1;
		
		
		// コンストラクタ
		protected StdInspAct_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);

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
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * StdInspAct_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR createStdInspAct_Chk02_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.create();
		}

		/**
		 * StdInspAct_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> createStdInspAct_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
		}

		/**
		 * StdInspAct_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR createStdInspAct_Chk02_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.create();
		}

		/**
		 * StdInspAct_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> createStdInspAct_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_dt</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> up1() {
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
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}
	/**
	 * StdInspAct_Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	abstract public class StdInspAct_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> down1;
		
		
		// コンストラクタ
		protected StdInspAct_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);

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
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * StdInspAct_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR createStdInspAct_Chk03_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.create();
		}

		/**
		 * StdInspAct_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> createStdInspAct_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
		}

		/**
		 * StdInspAct_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR createStdInspAct_Chk03_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.create();
		}

		/**
		 * StdInspAct_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> createStdInspAct_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> up1() {
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
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}
	/**
	 * StdInspAct_Upd01オペレーション.<p>
	 *
	 * 規格検査実績を登録・更新する。<br>
	 */
	abstract public class StdInspAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected StdInspAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);

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
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StdInspAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR createStdInspAct_Upd01_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.create();
		}

		/**
		 * StdInspAct_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> createStdInspAct_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR.class);
		}

		/**
		 * StdInspAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR createStdInspAct_Upd01_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.create();
		}

		/**
		 * StdInspAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> createStdInspAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>qn_insp_val</td></tr>
		 * 	<tr><td><br></td><td>ql_insp_val</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>std_insp_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}
	/**
	 * StdInspAct_Upd02オペレーション.<p>
	 *
	 * 規格検査実績を確認する。<br>
	 */
	abstract public class StdInspAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> up1;
		
		
		// コンストラクタ
		protected StdInspAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdInspAct_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR createStdInspAct_Upd02_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.create();
		}

		/**
		 * StdInspAct_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> createStdInspAct_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR.class);
		}

		/**
		 * StdInspAct_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR createStdInspAct_Upd02_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.create();
		}

		/**
		 * StdInspAct_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> createStdInspAct_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_dt</td></tr>
		 * 	<tr><td><br></td><td>cnf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk02_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}
	/**
	 * StdInspAct_Del01オペレーション.<p>
	 *
	 * 規格検査実績　または　確認情報の取消を行う。<br>
	 */
	abstract public class StdInspAct_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdInspAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> up1;
		
		
		// コンストラクタ
		protected StdInspAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdInspAct_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR createStdInspAct_Del01_HdrR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.create();
		}

		/**
		 * StdInspAct_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> createStdInspAct_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR.class);
		}

		/**
		 * StdInspAct_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR createStdInspAct_Del01_DtlR(){
			return mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.create();
		}

		/**
		 * StdInspAct_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> createStdInspAct_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR.class);
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
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>std_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>cnf_flg</td></tr>
		 * 	<tr><td><br></td><td>cnf_intr_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5030.StdInspAct_Chk03_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_StdInspActService)MSBFL_StdInspActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}