package mcframe.serverMSBC.MSBCL6120;

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
 * "MSBCL_OutSrcInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_OutSrcInstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_OutSrcInstService.OutSrcInst_Sprt01 aOutSrcInst_Sprt01;

	protected void initOutSrcInst_Sprt01() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Sprt01_INFO;
		this.aOutSrcInst_Sprt01 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Sprt01();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Sprt01 crtOutSrcInst_Sprt01() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Sprt01();
		return lgc.aOutSrcInst_Sprt01;
	}

	protected void paramOutSrcInst_Sprt01(MCParam p) {
		if (this.aOutSrcInst_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Sprt01.up0());
		p.addDownBlock(aOutSrcInst_Sprt01.down0());
	}

	protected void doOutSrcInst_Sprt01() {
		aOutSrcInst_Sprt01.call();
	};

	/**
	 * OutSrcInst_Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR createOutSrcInst_Sprt01_DtlR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.create();
	}

	/**
	 * OutSrcInst_Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> createOutSrcInst_Sprt01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.class);
	}

	/**
	 * OutSrcInst_Sprt01_DtlProvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR createOutSrcInst_Sprt01_DtlProvR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR.create();
	}

	/**
	 * OutSrcInst_Sprt01_DtlProvブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR> createOutSrcInst_Sprt01_DtlProvL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Chk01 aOutSrcInst_Chk01;

	protected void initOutSrcInst_Chk01() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Chk01_INFO;
		this.aOutSrcInst_Chk01 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Chk01();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Chk01 crtOutSrcInst_Chk01() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Chk01();
		return lgc.aOutSrcInst_Chk01;
	}

	protected void paramOutSrcInst_Chk01(MCParam p) {
		if (this.aOutSrcInst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Chk01.up0());
		p.addUpBlock(aOutSrcInst_Chk01.up1());
		p.addDownBlock(aOutSrcInst_Chk01.down0());
	}

	protected void doOutSrcInst_Chk01() {
		aOutSrcInst_Chk01.call();
	};

	/**
	 * OutSrcInst_Chk01_PoDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR createOutSrcInst_Chk01_PoDR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.create();
	}

	/**
	 * OutSrcInst_Chk01_PoDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> createOutSrcInst_Chk01_PoDL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
	}

	/**
	 * OutSrcInst_Chk01_SchdPoDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR createOutSrcInst_Chk01_SchdPoDR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR.create();
	}

	/**
	 * OutSrcInst_Chk01_SchdPoDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR> createOutSrcInst_Chk01_SchdPoDL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Chk02 aOutSrcInst_Chk02;

	protected void initOutSrcInst_Chk02() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Chk02_INFO;
		this.aOutSrcInst_Chk02 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Chk02();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Chk02 crtOutSrcInst_Chk02() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Chk02();
		return lgc.aOutSrcInst_Chk02;
	}

	protected void paramOutSrcInst_Chk02(MCParam p) {
		if (this.aOutSrcInst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Chk02.up0());
		p.addDownBlock(aOutSrcInst_Chk02.down0());
	}

	protected void doOutSrcInst_Chk02() {
		aOutSrcInst_Chk02.call();
	};

	/**
	 * OutSrcInst_Chk02_ReArrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR createOutSrcInst_Chk02_ReArrR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.create();
	}

	/**
	 * OutSrcInst_Chk02_ReArrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> createOutSrcInst_Chk02_ReArrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Chk03 aOutSrcInst_Chk03;

	protected void initOutSrcInst_Chk03() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Chk03_INFO;
		this.aOutSrcInst_Chk03 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Chk03();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Chk03 crtOutSrcInst_Chk03() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Chk03();
		return lgc.aOutSrcInst_Chk03;
	}

	protected void paramOutSrcInst_Chk03(MCParam p) {
		if (this.aOutSrcInst_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Chk03.up0());
		p.addDownBlock(aOutSrcInst_Chk03.down0());
	}

	protected void doOutSrcInst_Chk03() {
		aOutSrcInst_Chk03.call();
	};

	/**
	 * OutSrcInst_Chk03_ArrAbortブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR createOutSrcInst_Chk03_ArrAbortR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.create();
	}

	/**
	 * OutSrcInst_Chk03_ArrAbortブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> createOutSrcInst_Chk03_ArrAbortL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Upd01 aOutSrcInst_Upd01;

	protected void initOutSrcInst_Upd01() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Upd01_INFO;
		this.aOutSrcInst_Upd01 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Upd01();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Upd01 crtOutSrcInst_Upd01() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Upd01();
		return lgc.aOutSrcInst_Upd01;
	}

	protected void paramOutSrcInst_Upd01(MCParam p) {
		if (this.aOutSrcInst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Upd01.up0());
		p.addDownBlock(aOutSrcInst_Upd01.down0());
	}

	protected void doOutSrcInst_Upd01() {
		aOutSrcInst_Upd01.call();
	};

	/**
	 * OutSrcInst_Upd01_PoDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR createOutSrcInst_Upd01_PoDR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.create();
	}

	/**
	 * OutSrcInst_Upd01_PoDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> createOutSrcInst_Upd01_PoDL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Upd02 aOutSrcInst_Upd02;

	protected void initOutSrcInst_Upd02() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Upd02_INFO;
		this.aOutSrcInst_Upd02 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Upd02();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Upd02 crtOutSrcInst_Upd02() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Upd02();
		return lgc.aOutSrcInst_Upd02;
	}

	protected void paramOutSrcInst_Upd02(MCParam p) {
		if (this.aOutSrcInst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Upd02.up0());
		p.addDownBlock(aOutSrcInst_Upd02.down0());
	}

	protected void doOutSrcInst_Upd02() {
		aOutSrcInst_Upd02.call();
	};

	/**
	 * OutSrcInst_Upd02_ReArrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR createOutSrcInst_Upd02_ReArrR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.create();
	}

	/**
	 * OutSrcInst_Upd02_ReArrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> createOutSrcInst_Upd02_ReArrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Upd03 aOutSrcInst_Upd03;

	protected void initOutSrcInst_Upd03() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Upd03_INFO;
		this.aOutSrcInst_Upd03 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Upd03();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Upd03 crtOutSrcInst_Upd03() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Upd03();
		return lgc.aOutSrcInst_Upd03;
	}

	protected void paramOutSrcInst_Upd03(MCParam p) {
		if (this.aOutSrcInst_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Upd03.up0());
	}

	protected void doOutSrcInst_Upd03() {
		aOutSrcInst_Upd03.call();
	};

	/**
	 * OutSrcInst_Upd03_ArrAbortブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR createOutSrcInst_Upd03_ArrAbortR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR.create();
	}

	/**
	 * OutSrcInst_Upd03_ArrAbortブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR> createOutSrcInst_Upd03_ArrAbortL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR.class);
	}
	protected MSBCL_OutSrcInstService.OutSrcInst_Upd04 aOutSrcInst_Upd04;

	protected void initOutSrcInst_Upd04() {
		this.info = PDef.MS_MSBCL6120_OutSrcInst_Upd04_INFO;
		this.aOutSrcInst_Upd04 = ((MSBCL_OutSrcInstService)this).new OutSrcInst_Upd04();
	}

	public static MSBCL_OutSrcInstService.OutSrcInst_Upd04 crtOutSrcInst_Upd04() {
		MSBCL_OutSrcInstService lgc = new MSBCL_OutSrcInstService();
		lgc.initOutSrcInst_Upd04();
		return lgc.aOutSrcInst_Upd04;
	}

	protected void paramOutSrcInst_Upd04(MCParam p) {
		if (this.aOutSrcInst_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcInst_Upd04.up0());
	}

	protected void doOutSrcInst_Upd04() {
		aOutSrcInst_Upd04.call();
	};

	/**
	 * OutSrcInst_Upd04_ArrAbortブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR createOutSrcInst_Upd04_ArrAbortR(){
		return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR.create();
	}

	/**
	 * OutSrcInst_Upd04_ArrAbortブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR> createOutSrcInst_Upd04_ArrAbortL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OutSrcInst_Sprt01オペレーション.<p>
	 *
	 * 加工単価に有償支給単価を加味した、外注品の発注単価を取得する<br>
	 */
	abstract public class OutSrcInst_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> down0;
		/** [OutSrcInst_Sprt01_DtlProv]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR> aOutSrcInst_Sprt01_DtlProv;
		
		
		// コンストラクタ
		protected OutSrcInst_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.class);
			aOutSrcInst_Sprt01_DtlProv = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR createOutSrcInst_Sprt01_DtlR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.create();
		}

		/**
		 * OutSrcInst_Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> createOutSrcInst_Sprt01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR.class);
		}

		/**
		 * OutSrcInst_Sprt01_DtlProvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR createOutSrcInst_Sprt01_DtlProvR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR.create();
		}

		/**
		 * OutSrcInst_Sprt01_DtlProvブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR> createOutSrcInst_Sprt01_DtlProvL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>grp_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>itmdtl_base_dt</td></tr>
		 * 	<tr><td><br></td><td>not_add_up_qty_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlR> down0() {
			return down0;
		}


		/**
		 * [OutSrcInst_Sprt01_DtlProv]ブロックのコンテナaOutSrcInst_Sprt01_DtlProvLを返します。
		 *
		 * @return OutSrcInst_Sprt01_DtlProvL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Sprt01_DtlProvR> OutSrcInst_Sprt01_DtlProv() {
			return aOutSrcInst_Sprt01_DtlProv;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Chk01オペレーション.<p>
	 *
	 * 発注の登録・訂正・取消の前に、外注製造指図の状況をチェックする<br>
	 */
	abstract public class OutSrcInst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> down0;
		
		
		// コンストラクタ
		protected OutSrcInst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Chk01_PoDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR createOutSrcInst_Chk01_PoDR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.create();
		}

		/**
		 * OutSrcInst_Chk01_PoDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> createOutSrcInst_Chk01_PoDL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
		}

		/**
		 * OutSrcInst_Chk01_SchdPoDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR createOutSrcInst_Chk01_SchdPoDR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR.create();
		}

		/**
		 * OutSrcInst_Chk01_SchdPoDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR> createOutSrcInst_Chk01_SchdPoDL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR.class);
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
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_SchdPoDR> up1() {
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
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Chk02オペレーション.<p>
	 *
	 * 再入荷予定の訂正・取消の前に、外注製造指図の状況をチェックする<br>
	 */
	abstract public class OutSrcInst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> down0;
		
		
		// コンストラクタ
		protected OutSrcInst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Chk02_ReArrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR createOutSrcInst_Chk02_ReArrR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.create();
		}

		/**
		 * OutSrcInst_Chk02_ReArrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> createOutSrcInst_Chk02_ReArrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
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
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>re_arr_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>old_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> up0() {
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
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Chk03オペレーション.<p>
	 *
	 * 入荷予定の打切の前に、外注製造指図の状況をチェックする<br>
	 */
	abstract public class OutSrcInst_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> down0;
		
		
		// コンストラクタ
		protected OutSrcInst_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Chk03_ArrAbortブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR createOutSrcInst_Chk03_ArrAbortR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.create();
		}

		/**
		 * OutSrcInst_Chk03_ArrAbortブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> createOutSrcInst_Chk03_ArrAbortL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> up0() {
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
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk03_ArrAbortR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Upd01オペレーション.<p>
	 *
	 * 発注の登録・訂正・取消に応じて、外注製造指図を登録・訂正・取消する<br>
	 */
	abstract public class OutSrcInst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> down0;
		
		
		// コンストラクタ
		protected OutSrcInst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Upd01_PoDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR createOutSrcInst_Upd01_PoDR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.create();
		}

		/**
		 * OutSrcInst_Upd01_PoDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> createOutSrcInst_Upd01_PoDL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR.class);
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
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk01_PoDR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Upd02オペレーション.<p>
	 *
	 * 入荷・仕入実績登録における再入荷予定作成の登録・訂正・取消に伴い、外注製造指図を登録・訂正・取消する<br>
	 */
	abstract public class OutSrcInst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> down0;
		
		
		// コンストラクタ
		protected OutSrcInst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcInst_Upd02_ReArrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR createOutSrcInst_Upd02_ReArrR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.create();
		}

		/**
		 * OutSrcInst_Upd02_ReArrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> createOutSrcInst_Upd02_ReArrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR.class);
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
		 * 	<tr><td><br></td><td>org_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>re_arr_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>re_arr_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Chk02_ReArrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Upd03オペレーション.<p>
	 *
	 * 発注明細・入荷予定の打切に応じて、製造指図を打ち切る。<br>
	 */
	abstract public class OutSrcInst_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR> up0;
		
		
		// コンストラクタ
		protected OutSrcInst_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OutSrcInst_Upd03_ArrAbortブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR createOutSrcInst_Upd03_ArrAbortR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR.create();
		}

		/**
		 * OutSrcInst_Upd03_ArrAbortブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR> createOutSrcInst_Upd03_ArrAbortL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd03_ArrAbortR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcInst_Upd04オペレーション.<p>
	 *
	 * 発注明細・入荷予定の打切取消に応じて、製造指図の打切りを取り消す。<br>
	 */
	abstract public class OutSrcInst_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcInst_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR> up0;
		
		
		// コンストラクタ
		protected OutSrcInst_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR.class);

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
			invoke((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OutSrcInst_Upd04_ArrAbortブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR createOutSrcInst_Upd04_ArrAbortR(){
			return mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR.create();
		}

		/**
		 * OutSrcInst_Upd04_ArrAbortブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR> createOutSrcInst_Upd04_ArrAbortL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6120.OutSrcInst_Upd04_ArrAbortR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcInstService)MSBCL_OutSrcInstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}