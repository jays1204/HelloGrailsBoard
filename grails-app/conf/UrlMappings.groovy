class UrlMappings {

	static mappings = {
        "/"(controller: "welcome", action: "index")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "500"(view:'/error')
        "404"(view:'/404')
	}
}
