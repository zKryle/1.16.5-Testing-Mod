package io.github.FireTamer81.fullBlock;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.resources.IResourceManager;
import net.minecraftforge.client.model.IModelLoader;

public class BakedModelFullBlockLoader implements IModelLoader<BakedModelFullBlockGeometry> {
    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {}

    @Override
    public BakedModelFullBlockGeometry read(JsonDeserializationContext deserializationContext, JsonObject modelContents) {
        return new BakedModelFullBlockGeometry();
    }
}